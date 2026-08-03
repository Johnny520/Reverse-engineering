package Yue;

import Yue.InterfaceC7144;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public interface InterfaceC3499 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final boolean f338;

    static {
        f338 = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@InterfaceC6391 int[] iArr, int i) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i);
}
