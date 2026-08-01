package p264s0;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p179m2.AbstractC4854i0;

/* JADX INFO: renamed from: s0.tb */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6953tb {
    /* JADX INFO: renamed from: a */
    public static final boolean m27546a(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-972868615, i10, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:24)");
        }
        boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) interfaceC0572r.mo2142A(AbstractC4854i0.m19379d()));
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return zIs24HourFormat;
    }
}
