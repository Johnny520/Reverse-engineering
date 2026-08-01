package p260x;

import java.util.ArrayList;
import p011B4.AbstractC0231b;
import p049I2.C0793k;
import p117X2.AbstractC1665j;
import p169h0.InterfaceC2207p;
import p186k.AbstractC2415L;
import p186k.AbstractC2416M;
import p186k.C2408E;
import p186k.C2409F;
import p255w.C3381l;

/* JADX INFO: renamed from: x.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3436s {

    /* JADX INFO: renamed from: a */
    public final C2408E f10726a;

    /* JADX INFO: renamed from: b */
    public C0793k f10727b;

    /* JADX INFO: renamed from: c */
    public final C2409F f10728c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f10729d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f10730e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f10731f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f10732g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f10733h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2207p f10734i;

    public C3436s() {
        long[] jArr = AbstractC2415L.f7816a;
        this.f10726a = new C2408E();
        C2409F c2409f = AbstractC2416M.f7817a;
        this.f10728c = new C2409F();
        this.f10729d = new ArrayList();
        this.f10730e = new ArrayList();
        this.f10731f = new ArrayList();
        this.f10732g = new ArrayList();
        this.f10733h = new ArrayList();
        this.f10734i = new C3433p(this);
    }

    /* JADX INFO: renamed from: e */
    public static int m5698e(int[] iArr, C3381l c3381l) {
        c3381l.getClass();
        int i5 = iArr[0] + c3381l.f10546l;
        iArr[0] = i5;
        return Math.max(0, i5);
    }

    /* JADX INFO: renamed from: a */
    public final long m5699a() {
        ArrayList arrayList = this.f10733h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        AbstractC0231b.m408s(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5700b(int r29, int r30, java.util.ArrayList r31, p049I2.C0793k r32, p255w.C3378i r33, boolean r34, boolean r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p260x.C3436s.m5700b(int, int, java.util.ArrayList, I2.k, w.i, boolean, boolean, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5701c() {
        /*
            r15 = this;
            k.E r0 = r15.f10726a
            boolean r1 = r0.m4275j()
            if (r1 == 0) goto L50
            java.lang.Object[] r1 = r0.f7789c
            long[] r2 = r0.f7787a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L4d
            r4 = 0
            r5 = r4
        L13:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L48
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L46
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L3c
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L3c:
            int r0 = r5 << 3
            int r0 = r0 + r10
            r0 = r1[r0]
            p011B4.AbstractC0231b.m408s(r0)
            r0 = 0
            throw r0
        L46:
            if (r8 != r9) goto L4d
        L48:
            if (r5 == r3) goto L4d
            int r5 = r5 + 1
            goto L13
        L4d:
            r0.m4266a()
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260x.C3436s.m5701c():void");
    }

    /* JADX INFO: renamed from: d */
    public final void m5702d(C3381l c3381l, boolean z5) {
        Object objM4272g = this.f10726a.m4272g(c3381l.f10541g);
        AbstractC1665j.m2982b(objM4272g);
        AbstractC0231b.m408s(objM4272g);
        throw null;
    }
}
