package p000;

/* JADX INFO: renamed from: f0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0268f0 extends p000.gh1 {

    /* JADX INFO: renamed from: β */
    public android.content.Context f3700;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f3701;

    public C0268f0() {
            r6 = this;
            r6.<init>()
            g0 r0 = new g0
            r0.<init>()
            sr r1 = new sr
            i2 r2 = p000.C0099c3.f1949
            r1.<init>(r2)
            sr r2 = new sr
            uo r3 = p000.C0954wo.f11771
            r2.<init>(r3)
            sr r3 = new sr
            wb r4 = p000.C1015yb.f12545
            r3.<init>(r4)
            r4 = 4
            mx1[] r4 = new p000.mx1[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.util.ArrayList r0 = p000.AbstractC0312g7.m2248(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.next()
            r3 = r2
            mx1 r3 = (p000.mx1) r3
            boolean r3 = r3.mo1122()
            if (r3 == 0) goto L39
            r1.add(r2)
            goto L39
        L50:
            r6.f3701 = r1
            return
    }
}
