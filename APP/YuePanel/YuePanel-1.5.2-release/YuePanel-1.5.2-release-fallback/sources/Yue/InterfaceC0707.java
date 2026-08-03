package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public interface InterfaceC0707 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.Deprecated
    public static final boolean f1957 = false;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            Yue.InterfaceC0707.f1957 = r0
            return
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4) throws java.lang.IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@Yue.InterfaceC4410 int[] r1, int r2) throws java.lang.IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int r1);
}
