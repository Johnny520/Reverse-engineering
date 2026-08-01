package p000;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: nr */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0522nr extends s91 {

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0561or f4304G;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0522nr(C0561or c0561or) {
        this.f4304G = c0561or;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.s91
    /* JADX INFO: renamed from: H */
    public final void mo2734H(Throwable th) {
        this.f4304G.f4609a.m3984d(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.s91
    /* JADX INFO: renamed from: I */
    public final void mo2735I(C0948y2 c0948y2) {
        C0561or c0561or = this.f4304G;
        c0561or.f4611c = c0948y2;
        C0948y2 c0948y22 = c0561or.f4611c;
        C0699rr c0699rr = c0561or.f4609a;
        C0675r3 c0675r3 = c0699rr.f5546g;
        C0930xl c0930xl = c0699rr.f5548i;
        Set<int[]> setM5147a = Build.VERSION.SDK_INT >= 34 ? AbstractC0936xr.m5147a() : pf1.m3064x();
        C0541o8 c0541o8 = new C0541o8();
        c0541o8.f4480a = c0675r3;
        c0541o8.f4481b = c0948y22;
        c0541o8.f4482c = c0930xl;
        if (!setM5147a.isEmpty()) {
            for (int[] iArr : setM5147a) {
                String str = new String(iArr, 0, iArr.length);
                c0541o8.m2807l(str, 0, str.length(), 1, true, new C1014zr(str, 0));
            }
        }
        c0561or.f4610b = c0541o8;
        C0699rr c0699rr2 = c0561or.f4609a;
        ArrayList arrayList = new ArrayList();
        c0699rr2.f5540a.writeLock().lock();
        try {
            c0699rr2.f5542c = 1;
            arrayList.addAll(c0699rr2.f5541b);
            c0699rr2.f5541b.clear();
            c0699rr2.f5540a.writeLock().unlock();
            c0699rr2.f5543d.post(new RunnableC0625pr(arrayList, c0699rr2.f5542c, null));
        } catch (Throwable th) {
            c0699rr2.f5540a.writeLock().unlock();
            throw th;
        }
    }
}
