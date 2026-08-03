package p222p;

import android.view.View;
import gg.AbstractC1416l;
import java.util.WeakHashMap;
import p085fg.InterfaceC1231l;
import p091g3.AbstractC1321m;
import p091g3.AbstractC1329q;
import p339x1.AbstractC5618k;

/* JADX INFO: renamed from: p.k1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3231k1 extends C3224i0 {

    /* JADX INFO: renamed from: x */
    public InterfaceC1231l f10313x;

    /* JADX INFO: renamed from: y */
    public C3255s1 f10314y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.AbstractC3212e0, p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        View viewM10169y = AbstractC5618k.m10169y(this);
        WeakHashMap weakHashMap = C3255s1.f10360v;
        C3255s1 c3255s1M6869f = C3205c.m6869f(viewM10169y);
        c3255s1M6869f.m6937a(viewM10169y);
        InterfaceC3252r1 interfaceC3252r1 = (InterfaceC3252r1) this.f10313x.invoke(c3255s1M6869f);
        if (!AbstractC1416l.m3825a(interfaceC3252r1, this.f10292w)) {
            this.f10292w = interfaceC3252r1;
            mo6895l1();
        }
        this.f10314y = c3255s1M6869f;
        super.mo1323c1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.AbstractC3212e0, p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        View viewM10169y = AbstractC5618k.m10169y(this);
        C3255s1 c3255s1 = this.f10314y;
        if (c3255s1 != null) {
            int i9 = c3255s1.f10380t - 1;
            c3255s1.f10380t = i9;
            if (i9 == 0) {
                int i10 = AbstractC1329q.f4395a;
                AbstractC1321m.m3524b(viewM10169y, null);
                AbstractC1329q.m3555b(viewM10169y, null);
                viewM10169y.removeOnAttachStateChangeListener(c3255s1.f10381u);
            }
        }
        super.mo743d1();
    }
}
