package com.protobot.awsimageupload.profile;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class UserProfileService {

    private final UserProfileDataAccessService userProfileDataAccessService;

    public UserProfileService(UserProfileDataAccessService userProfileDataAccessService) {
        this.userProfileDataAccessService = userProfileDataAccessService;
    }

    public List<UserProfile> getUserProfile(){
        return userProfileDataAccessService.getUserProfiles();
    }

    public void uploadUserProfile(UUID userProfileId, MultipartFile file) {

    }
}
