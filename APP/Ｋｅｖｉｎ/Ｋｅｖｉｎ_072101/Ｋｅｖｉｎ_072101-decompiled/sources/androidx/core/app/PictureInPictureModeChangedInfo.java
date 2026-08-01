package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class PictureInPictureModeChangedInfo {
    private final boolean mIsInPictureInPictureMode;
    private final android.content.res.Configuration mNewConfig;

    public PictureInPictureModeChangedInfo(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.mIsInPictureInPictureMode = r2
            r0 = 0
            r1.mNewConfig = r0
            return
    }

    public PictureInPictureModeChangedInfo(boolean r1, android.content.res.Configuration r2) {
            r0 = this;
            r0.<init>()
            r0.mIsInPictureInPictureMode = r1
            r0.mNewConfig = r2
            return
    }

    public android.content.res.Configuration getNewConfig() {
            r2 = this;
            android.content.res.Configuration r0 = r2.mNewConfig
            if (r0 == 0) goto L7
            android.content.res.Configuration r0 = r2.mNewConfig
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?"
            r0.<init>(r1)
            throw r0
    }

    public boolean isInPictureInPictureMode() {
            r1 = this;
            boolean r0 = r1.mIsInPictureInPictureMode
            return r0
    }
}
