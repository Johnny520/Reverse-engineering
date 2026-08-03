package p162l3;

import ac.AbstractC0063p;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
import p003a2.C0014a;
import p007a7.AbstractC0018a;
import p020b5.C0184c;
import p109hb.C1671c;

/* JADX INFO: renamed from: l3.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2451e extends AbstractC0018a {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2452f f8054b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2451e(C2452f c2452f) {
        this.f8054b = c2452f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007a7.AbstractC0018a
    /* JADX INFO: renamed from: D */
    public final void mo263D(Throwable th2) {
        this.f8054b.f8055a.m5851f(th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p007a7.AbstractC0018a
    /* JADX INFO: renamed from: E */
    public final void mo264E(C1671c c1671c) {
        C2452f c2452f = this.f8054b;
        c2452f.f8057c = c1671c;
        C1671c c1671c2 = c2452f.f8057c;
        C2455i c2455i = c2452f.f8055a;
        C0014a c0014a = c2455i.f8068g;
        C2450d c2450d = c2455i.f8070i;
        Set<int[]> setM5858a = Build.VERSION.SDK_INT >= 34 ? AbstractC2460n.m5858a() : AbstractC0063p.m429v();
        C0184c c0184c = new C0184c();
        c0184c.f469a = c0014a;
        c0184c.f470b = c1671c2;
        c0184c.f471c = c2450d;
        if (!setM5858a.isEmpty()) {
            for (int[] iArr : setM5858a) {
                String str = new String(iArr, 0, iArr.length);
                c0184c.m790G(str, 0, str.length(), 1, true, new C2463q(str, 0));
            }
        }
        c2452f.f8056b = c0184c;
        C2455i c2455i2 = c2452f.f8055a;
        ArrayList arrayList = new ArrayList();
        c2455i2.f8062a.writeLock().lock();
        try {
            c2455i2.f8064c = 1;
            arrayList.addAll(c2455i2.f8063b);
            c2455i2.f8063b.clear();
            c2455i2.f8062a.writeLock().unlock();
            c2455i2.f8065d.post(new RunnableC2453g(arrayList, c2455i2.f8064c, null));
        } catch (Throwable th2) {
            c2455i2.f8062a.writeLock().unlock();
            throw th2;
        }
    }
}
