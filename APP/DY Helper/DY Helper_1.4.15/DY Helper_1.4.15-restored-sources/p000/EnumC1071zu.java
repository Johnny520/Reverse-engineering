package p000;

/* JADX INFO: renamed from: zu */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1071zu extends java.lang.Enum {

    /* JADX INFO: renamed from: λ */
    public static final p000.EnumC1071zu f13299 = null;

    /* JADX INFO: renamed from: μ */
    public static final /* synthetic */ p000.EnumC1071zu[] f13300 = null;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f13301;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f13302;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f13303;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f13304;

    /* JADX INFO: renamed from: ι */
    public final java.lang.String f13305;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f13306;

    static {
            zu r0 = new zu
            java.lang.String r7 = "download_path"
            java.lang.String r8 = "留空时使用系统默认下载目录"
            java.lang.String r1 = "GENERAL"
            r2 = 0
            java.lang.String r3 = "通用下载路径"
            java.lang.String r4 = "通用"
            java.lang.String r5 = "download_path_template"
            java.lang.String r6 = "download_uri"
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            p000.EnumC1071zu.f13299 = r0
            zu r1 = new zu
            java.lang.String r8 = "download_path"
            java.lang.String r9 = "留空时跟随通用下载路径模板"
            java.lang.String r2 = "VIDEO"
            r3 = 1
            java.lang.String r4 = "视频下载路径"
            java.lang.String r5 = "视频"
            java.lang.String r6 = "video_download_path_template"
            java.lang.String r7 = "video_download_tree_uri"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            zu r2 = new zu
            java.lang.String r9 = "download_path"
            java.lang.String r10 = "留空时跟随通用下载路径模板"
            java.lang.String r3 = "IMAGE"
            r4 = 2
            java.lang.String r5 = "图片下载路径"
            java.lang.String r6 = "图片"
            java.lang.String r7 = "image_download_path_template"
            java.lang.String r8 = "image_download_tree_uri"
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            zu r3 = new zu
            java.lang.String r10 = "download_path"
            java.lang.String r11 = "留空时跟随通用下载路径模板"
            java.lang.String r4 = "ANIMATED"
            r5 = 3
            java.lang.String r6 = "动图下载路径"
            java.lang.String r7 = "动图"
            java.lang.String r8 = "animated_download_path_template"
            java.lang.String r9 = "animated_download_tree_uri"
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            zu r4 = new zu
            java.lang.String r11 = "download_path"
            java.lang.String r12 = "留空时跟随通用下载路径模板"
            java.lang.String r5 = "LIVE_PHOTO"
            r6 = 4
            java.lang.String r7 = "LivePhoto 下载路径"
            java.lang.String r8 = "Live"
            java.lang.String r9 = "live_photo_download_path_template"
            java.lang.String r10 = "live_photo_download_tree_uri"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            zu r5 = new zu
            java.lang.String r12 = "audio_download_path"
            java.lang.String r13 = "留空时跟随通用下载路径模板"
            java.lang.String r6 = "AUDIO"
            r7 = 5
            java.lang.String r8 = "音乐下载路径"
            java.lang.String r9 = "音乐"
            java.lang.String r10 = "audio_download_path_template"
            java.lang.String r11 = "audio_download_uri"
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            zu r6 = new zu
            r13 = 0
            java.lang.String r14 = "留空时跟随通用下载路径模板"
            java.lang.String r7 = "EMOJI"
            r8 = 6
            java.lang.String r9 = "表情包下载路径"
            java.lang.String r10 = "表情"
            java.lang.String r11 = "emoji_download_path_template"
            java.lang.String r12 = "emoji_download_tree_uri"
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            zu[] r0 = new p000.EnumC1071zu[]{r0, r1, r2, r3, r4, r5, r6}
            p000.EnumC1071zu.f13300 = r0
            return
    }

    EnumC1071zu(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f13301 = r3
            r0.f13302 = r4
            r0.f13303 = r5
            r0.f13304 = r6
            r0.f13305 = r7
            r0.f13306 = r8
            return
    }

    public static p000.EnumC1071zu valueOf(java.lang.String r1) {
            java.lang.Class<zu> r0 = p000.EnumC1071zu.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            zu r1 = (p000.EnumC1071zu) r1
            return r1
    }

    public static p000.EnumC1071zu[] values() {
            zu[] r0 = p000.EnumC1071zu.f13300
            java.lang.Object r0 = r0.clone()
            zu[] r0 = (p000.EnumC1071zu[]) r0
            return r0
    }
}
