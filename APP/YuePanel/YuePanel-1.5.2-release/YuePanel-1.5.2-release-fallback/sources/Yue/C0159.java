package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0159 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f386 = 1;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f387 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f388 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f389 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f390 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f391 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f392 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f393 = 4;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f394 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f395 = 16;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f396 = 32;

    public C0159() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m918(int r1) {
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 4
            if (r1 == r0) goto L13
            r0 = 8
            if (r1 == r0) goto L10
            java.lang.String r1 = "UNKNOWN"
            return r1
        L10:
            java.lang.String r1 = "CAPABILITY_CAN_FILTER_KEY_EVENTS"
            return r1
        L13:
            java.lang.String r1 = "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY"
            return r1
        L16:
            java.lang.String r1 = "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION"
            return r1
        L19:
            java.lang.String r1 = "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT"
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m919(int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
        La:
            if (r4 <= 0) goto L4f
            int r1 = java.lang.Integer.numberOfTrailingZeros(r4)
            r2 = 1
            int r1 = r2 << r1
            int r3 = ~r1
            r4 = r4 & r3
            int r3 = r0.length()
            if (r3 <= r2) goto L20
            java.lang.String r3 = ", "
            r0.append(r3)
        L20:
            if (r1 == r2) goto L49
            r2 = 2
            if (r1 == r2) goto L43
            r2 = 4
            if (r1 == r2) goto L3d
            r2 = 8
            if (r1 == r2) goto L37
            r2 = 16
            if (r1 == r2) goto L31
            goto La
        L31:
            java.lang.String r1 = "FEEDBACK_GENERIC"
            r0.append(r1)
            goto La
        L37:
            java.lang.String r1 = "FEEDBACK_VISUAL"
            r0.append(r1)
            goto La
        L3d:
            java.lang.String r1 = "FEEDBACK_AUDIBLE"
            r0.append(r1)
            goto La
        L43:
            java.lang.String r1 = "FEEDBACK_HAPTIC"
            r0.append(r1)
            goto La
        L49:
            java.lang.String r1 = "FEEDBACK_SPOKEN"
            r0.append(r1)
            goto La
        L4f:
            java.lang.String r4 = "]"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m920(int r1) {
            r0 = 1
            if (r1 == r0) goto L26
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 4
            if (r1 == r0) goto L20
            r0 = 8
            if (r1 == r0) goto L1d
            r0 = 16
            if (r1 == r0) goto L1a
            r0 = 32
            if (r1 == r0) goto L17
            r1 = 0
            return r1
        L17:
            java.lang.String r1 = "FLAG_REQUEST_FILTER_KEY_EVENTS"
            return r1
        L1a:
            java.lang.String r1 = "FLAG_REPORT_VIEW_IDS"
            return r1
        L1d:
            java.lang.String r1 = "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY"
            return r1
        L20:
            java.lang.String r1 = "FLAG_REQUEST_TOUCH_EXPLORATION_MODE"
            return r1
        L23:
            java.lang.String r1 = "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS"
            return r1
        L26:
            java.lang.String r1 = "DEFAULT"
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m921(@Yue.InterfaceC4410 android.accessibilityservice.AccessibilityServiceInfo r0) {
            int r0 = r0.getCapabilities()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m922(@Yue.InterfaceC4410 android.accessibilityservice.AccessibilityServiceInfo r0, @Yue.InterfaceC4410 android.content.pm.PackageManager r1) {
            java.lang.String r0 = r0.loadDescription(r1)
            return r0
    }
}
