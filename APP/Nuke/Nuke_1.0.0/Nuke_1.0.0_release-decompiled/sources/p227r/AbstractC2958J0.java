package p227r;

import p007B0.AbstractC0208v;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.InterfaceC0169B;
import p034G.C0466k;
import p051J.C0810b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: r.J0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2958J0 {

    /* JADX INFO: renamed from: a */
    public static final C2942B0 f9362a = new C2942B0(3, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5157a(p007B0.C0185S r5, boolean r6, p007B0.EnumC0201o r7, p084Q2.AbstractC1176a r8) {
        /*
            boolean r0 = r8 instanceof p227r.C2944C0
            if (r0 == 0) goto L13
            r0 = r8
            r.C0 r0 = (p227r.C2944C0) r0
            int r1 = r0.f9308k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9308k = r1
            goto L18
        L13:
            r.C0 r0 = new r.C0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9307j
            int r1 = r0.f9308k
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r5 = r0.f9306i
            B0.o r6 = r0.f9305h
            B0.S r7 = r0.f9304g
            p127Z2.AbstractC1784a.m3205S(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            p127Z2.AbstractC1784a.m3205S(r8)
        L3a:
            r0.f9304g = r5
            r0.f9305h = r7
            r0.f9306i = r6
            r0.f9308k = r2
            java.lang.Object r8 = r5.m271a(r7, r0)
            P2.a r1 = p079P2.EnumC1152a.f3788d
            if (r8 != r1) goto L4b
            return r1
        L4b:
            B0.n r8 = (p007B0.C0200n) r8
            boolean r1 = m5160d(r8, r6)
            if (r1 == 0) goto L3a
            java.lang.Object r5 = r8.f696a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.AbstractC2958J0.m5157a(B0.S, boolean, B0.o, Q2.a):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public static Object m5159c(InterfaceC0169B interfaceC0169B, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        Object objM3982d = AbstractC2162v.m3982d(new C0810b(interfaceC0169B, f9362a, interfaceC1601c, (InterfaceC1046d) null), interfaceC1046d);
        return objM3982d == EnumC1152a.f3788d ? objM3982d : C0891q.f2780a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: d */
    public static boolean m5160d(C0200n c0200n, boolean z5) {
        ?? r4 = c0200n.f696a;
        int size = r4.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0209w c0209w = (C0209w) r4.get(i5);
            if (!(z5 ? AbstractC0208v.m311a(c0209w) : AbstractC0208v.m312b(c0209w))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static C2136g0 m5161e(InterfaceC2160t interfaceC2160t, InterfaceC2115S interfaceC2115S, InterfaceC1603e interfaceC1603e) {
        return AbstractC2162v.m3994p(interfaceC2160t, null, new C0466k(interfaceC2115S, interfaceC1603e, null), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r15 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:13:0x002e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5162f(p007B0.C0185S r13, p007B0.EnumC0201o r14, p084Q2.AbstractC1176a r15) {
        /*
            boolean r0 = r15 instanceof p227r.C2956I0
            if (r0 == 0) goto L13
            r0 = r15
            r.I0 r0 = (p227r.C2956I0) r0
            int r1 = r0.f9357j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9357j = r1
            goto L18
        L13:
            r.I0 r0 = new r.I0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f9356i
            int r1 = r0.f9357j
            r2 = 2
            r3 = 0
            r4 = 1
            P2.a r5 = p079P2.EnumC1152a.f3788d
            if (r1 == 0) goto L43
            if (r1 == r4) goto L3b
            if (r1 != r2) goto L33
            B0.o r13 = r0.f9355h
            B0.S r14 = r0.f9354g
            p127Z2.AbstractC1784a.m3205S(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La1
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            B0.o r13 = r0.f9355h
            B0.S r14 = r0.f9354g
            p127Z2.AbstractC1784a.m3205S(r15)
            goto L56
        L43:
            p127Z2.AbstractC1784a.m3205S(r15)
        L46:
            r0.f9354g = r13
            r0.f9355h = r14
            r0.f9357j = r4
            java.lang.Object r15 = r13.m271a(r14, r0)
            if (r15 != r5) goto L53
            goto La0
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            B0.n r15 = (p007B0.C0200n) r15
            java.lang.Object r15 = r15.f696a
            int r1 = r15.size()
            r6 = r3
        L5f:
            if (r6 >= r1) goto Lc0
            java.lang.Object r7 = r15.get(r6)
            B0.w r7 = (p007B0.C0209w) r7
            boolean r7 = p007B0.AbstractC0208v.m313c(r7)
            if (r7 != 0) goto Lbd
            int r1 = r15.size()
            r6 = r3
        L72:
            if (r6 >= r1) goto L92
            java.lang.Object r7 = r15.get(r6)
            B0.w r7 = (p007B0.C0209w) r7
            boolean r8 = r7.m321b()
            if (r8 != 0) goto Lb8
            B0.T r8 = r14.f645i
            long r8 = r8.f647B
            long r10 = r14.m274d()
            boolean r7 = p007B0.AbstractC0208v.m316f(r7, r8, r10)
            if (r7 == 0) goto L8f
            goto Lb8
        L8f:
            int r6 = r6 + 1
            goto L72
        L92:
            r0.f9354g = r14
            r0.f9355h = r13
            r0.f9357j = r2
            B0.o r15 = p007B0.EnumC0201o.f704f
            java.lang.Object r15 = r14.m271a(r15, r0)
            if (r15 != r5) goto L2e
        La0:
            return r5
        La1:
            B0.n r15 = (p007B0.C0200n) r15
            java.lang.Object r15 = r15.f696a
            int r1 = r15.size()
            r6 = r3
        Laa:
            if (r6 >= r1) goto L46
            java.lang.Object r7 = r15.get(r6)
            B0.w r7 = (p007B0.C0209w) r7
            boolean r7 = r7.m321b()
            if (r7 == 0) goto Lba
        Lb8:
            r13 = 0
            return r13
        Lba:
            int r6 = r6 + 1
            goto Laa
        Lbd:
            int r6 = r6 + 1
            goto L5f
        Lc0:
            java.lang.Object r13 = r15.get(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.AbstractC2958J0.m5162f(B0.S, B0.o, Q2.a):java.lang.Object");
    }
}
