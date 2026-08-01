package p027c0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import p010a9.InterfaceC0184l;
import p040d0.AbstractC1850c;
import p040d0.C1848a;
import p056e0.C1962a;
import p056e0.InterfaceC1968g;
import p172l8.C4700i0;
import p189n.C5258o0;
import p319w2.C9137t3;

/* JADX INFO: renamed from: c0.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1302e {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m5247a(Context context, ResolveInfo resolveInfo, boolean z10, CharSequence charSequence, long j10, InterfaceC1968g interfaceC1968g) {
        C1300c.f3896a.m5243e().mo231t(context, resolveInfo, Boolean.valueOf(z10), charSequence, C9137t3.m35511b(j10));
        interfaceC1968g.close();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m5248b(C1848a c1848a, Context context, final boolean z10, final CharSequence charSequence, final long j10) {
        if (!C5258o0.f16161e || C9137t3.m35517h(j10) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List listM5246h = C1300c.f3896a.m5246h(context2);
        if (listM5246h.isEmpty()) {
            return;
        }
        c1848a.m6543d();
        int size = listM5246h.size();
        int i10 = 0;
        while (i10 < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) listM5246h.get(i10);
            AbstractC1850c.m6546b(c1848a, new C1962a(i10), resolveInfo.loadLabel(packageManager).toString(), 0, new InterfaceC0184l() { // from class: c0.d
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC1302e.m5247a(context2, resolveInfo, z10, charSequence, j10, (InterfaceC1968g) obj);
                }
            }, 4, null);
            i10++;
            context2 = context;
        }
        c1848a.m6543d();
    }
}
