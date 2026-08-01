package p264s0;

import android.content.res.Configuration;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p179m2.AbstractC4854i0;

/* JADX INFO: renamed from: s0.pd */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6893pd {
    /* JADX INFO: renamed from: a */
    public static final int m27384a(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-721362352, i10, -1, "androidx.compose.material3.defaultTimePickerLayoutType (TimePicker.android.kt:26)");
        }
        Configuration configuration = (Configuration) interfaceC0572r.mo2142A(AbstractC4854i0.m19378c());
        int iM26971a = configuration.screenHeightDp < configuration.screenWidthDp ? AbstractC6797jd.f21786a.m26971a() : AbstractC6797jd.f21786a.m26972b();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return iM26971a;
    }
}
