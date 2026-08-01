package p006B;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import p000A.C0071l;
import p012C.C0233a;
import p018D.C0252a;
import p018D.C0255d;
import p018D.C0257f;
import p018D.InterfaceC0258g;
import p056K2.C0891q;
import p092S0.C1259L;
import p112W2.InterfaceC1601c;
import p186k.C2404A;

/* JADX INFO: renamed from: B.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0166b {

    /* JADX INFO: renamed from: a */
    public static final C0071l f595a = new C0071l(9);

    /* JADX INFO: renamed from: b */
    public static final C0165a f596b = new C0165a(0);

    /* JADX INFO: renamed from: a */
    public static final void m245a(C0233a c0233a, Context context, final boolean z5, final String str, final long j5) {
        if (C1259L.m2335c(j5) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) f595a.mo1h(context2);
        if (list.isEmpty()) {
            return;
        }
        C2404A c2404a = c0233a.f785a;
        C2404A c2404a2 = c0233a.f785a;
        C0257f c0257f = C0257f.f850b;
        c2404a.m4243a(c0257f);
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i5);
            c2404a2.m4243a(new C0255d(new C0252a(i5), resolveInfo.loadLabel(packageManager).toString(), 0, new InterfaceC1601c() { // from class: B.c
                @Override // p112W2.InterfaceC1601c
                /* JADX INFO: renamed from: h */
                public final Object mo1h(Object obj) {
                    AbstractC0166b.f596b.mo244j(context2, resolveInfo, Boolean.valueOf(z5), str, new C1259L(j5));
                    ((InterfaceC0258g) obj).close();
                    return C0891q.f2780a;
                }
            }));
            i5++;
            context2 = context;
        }
        c2404a2.m4243a(c0257f);
    }
}
