package p189n;

import android.content.res.Configuration;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p179m2.AbstractC4854i0;

/* JADX INFO: renamed from: n.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5268q0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m21516a(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:45)");
        }
        boolean z10 = (((Configuration) interfaceC0572r.mo2142A(AbstractC4854i0.m19378c())).uiMode & 48) == 32;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return z10;
    }
}
