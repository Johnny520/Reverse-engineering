package p275t0;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.Arrays;
import java.util.Locale;
import p024b9.C1062t0;
import p179m2.AbstractC4854i0;
import p278t3.AbstractC8100c;

/* JADX INFO: renamed from: t0.l1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7980l1 {
    /* JADX INFO: renamed from: a */
    public static final String m30748a(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* JADX INFO: renamed from: b */
    public static final String m30749b(int i10, InterfaceC0572r interfaceC0572r, int i11) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-907677715, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        interfaceC0572r.mo2142A(AbstractC4854i0.m19378c());
        String string = ((Context) interfaceC0572r.mo2142A(AbstractC4854i0.m19379d())).getResources().getString(i10);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static final String m30750c(int i10, Object[] objArr, InterfaceC0572r interfaceC0572r, int i11) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-1427268608, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String strM30749b = m30749b(i10, interfaceC0572r, i11 & 14);
        Locale localeM31321b = AbstractC8100c.m31315a((Configuration) interfaceC0572r.mo2142A(AbstractC4854i0.m19378c())).m31321b(0);
        if (localeM31321b == null) {
            localeM31321b = Locale.getDefault();
        }
        C1062t0 c1062t0 = C1062t0.f3215a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(localeM31321b, strM30749b, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return str;
    }
}
