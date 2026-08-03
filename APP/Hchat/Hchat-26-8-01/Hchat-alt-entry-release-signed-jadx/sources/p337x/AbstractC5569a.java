package p337x;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import p015b0.C0148n;
import p069f.C0933f0;
import p085fg.InterfaceC1231l;
import p119i2.C1939m0;
import p276sf.C3967n;
import p332wb.C5319sr;
import p355y.C5838a;
import p372z.C6053a;
import p372z.C6056d;
import p372z.C6058f;
import p372z.InterfaceC6059g;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5569a {

    /* JADX INFO: renamed from: a */
    public static final C5319sr f22689a = new C5319sr(16);

    /* JADX INFO: renamed from: b */
    public static final C0148n f22690b = new C0148n(2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m9966a(C5838a c5838a, Context context, final boolean z9, final String str, final long j3) {
        if (C1939m0.m4813c(j3) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) f22689a.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        C0933f0 c0933f0 = c5838a.f23757a;
        C0933f0 c0933f02 = c5838a.f23757a;
        C6058f c6058f = C6058f.f24529b;
        c0933f0.m2286a(c6058f);
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i9);
            c0933f02.m2286a(new C6056d(new C6053a(i9), resolveInfo.loadLabel(packageManager).toString(), 0, new InterfaceC1231l() { // from class: x.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1231l
                public final Object invoke(Object obj) {
                    AbstractC5569a.f22690b.mo726d(context2, resolveInfo, Boolean.valueOf(z9), str, new C1939m0(j3));
                    ((InterfaceC6059g) obj).close();
                    return C3967n.f12976a;
                }
            }));
            i9++;
            context2 = context;
        }
        c0933f02.m2286a(c6058f);
    }
}
