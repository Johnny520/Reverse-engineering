package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: E9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0182E9 extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public C2435qz f536l;

    /* JADX INFO: renamed from: m */
    public C2147kh f537m;

    /* JADX INFO: renamed from: n */
    public ArrayList f538n;

    /* JADX INFO: renamed from: N */
    public final int m371N(C0110Ch r7) {
        C2435qz r0 = this.f536l;
        if (r0 == null) goto L5;
        int r02 = r0.m4889N(r7);
    L6:
        C2147kh r2 = this.f537m;
        if (r2 == null) goto L9;
        int r22 = r2.m4332N(r7);
    L10:
        ArrayList r3 = this.f538n;
        if (r3 == null) goto L17;
        ArrayList r4 = new ArrayList(AbstractC2539ta.m5019d0(r3, 10));
        Iterator r32 = r3.iterator();
    L14:
        if (r32.hasNext() == false) goto L16;
        r4.add(Integer.valueOf(((C2435qz) r32.next()).m4889N(r7)));
        goto L14
    L16:
        int r33 = r7.m164c(AbstractC2453ra.m4907q0(r4));
    L18:
        r7.m170i(9);
        r7.m162a(8, r33);
        r7.m162a(7, 0);
        r7.m162a(6, r22);
        r7.m162a(5, 0);
        r7.m162a(4, 0);
        r7.m162a(3, 0);
        r7.m162a(2, 0);
        r7.m162a(1, r02);
        r7.m162a(0, 0);
        int r03 = r7.m165d();
        r7.m166e(r03);
        return r03;
    L17:
        r33 = 0;
        goto L18
    L9:
        r22 = 0;
        goto L10
    L5:
        r02 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: O */
    public final void m372O(String... r7) {
        ArrayList r0 = new ArrayList(r7.length);
        int r1 = r7.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0.add(new C2435qz(r7[r2], 1));
        r2 = r2 + 1;
        goto L3
    L5:
        this.f538n = new ArrayList(r0);
    }
}
