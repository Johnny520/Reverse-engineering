package p227r;

import p007B0.AbstractC0208v;
import p007B0.C0185S;
import p007B0.C0200n;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p007B0.InterfaceC0169B;
import p034G.C0466k;
import p051J.C0810b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1176a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: r.J0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2958J0 {

    /* JADX INFO: renamed from: a */
    public static final C2942B0 f9362a = new C2942B0(3, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Object m5159c(InterfaceC0169B interfaceC0169B, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        Object objM3982d = AbstractC2162v.m3982d(new C0810b(interfaceC0169B, f9362a, interfaceC1601c, (InterfaceC1046d) null), interfaceC1046d);
        return objM3982d == EnumC1152a.f3788d ? objM3982d : C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C2136g0 m5161e(InterfaceC2160t interfaceC2160t, InterfaceC2115S interfaceC2115S, InterfaceC1603e interfaceC1603e) {
        return AbstractC2162v.m3994p(interfaceC2160t, null, new C0466k(interfaceC2115S, interfaceC1603e, null), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    */
    public static final Object m5162f(C0185S c0185s, EnumC0201o enumC0201o, AbstractC1176a abstractC1176a) {
        C2956I0 c2956i0;
        C0185S c0185s2;
        EnumC0201o enumC0201o2;
        int size;
        int i5;
        if (abstractC1176a instanceof C2956I0) {
            c2956i0 = (C2956I0) abstractC1176a;
            int i6 = c2956i0.f9357j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c2956i0.f9357j = i6 - Integer.MIN_VALUE;
            } else {
                c2956i0 = new C2956I0(abstractC1176a);
            }
        }
        Object objM271a = c2956i0.f9356i;
        int i7 = c2956i0.f9357j;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i7 == 0) {
            AbstractC1784a.m3205S(objM271a);
            c2956i0.f9354g = c0185s;
            c2956i0.f9355h = enumC0201o;
            c2956i0.f9357j = 1;
            objM271a = c0185s.m271a(enumC0201o, c2956i0);
            if (objM271a != enumC1152a) {
            }
            return enumC1152a;
        }
        if (i7 == 1) {
            enumC0201o2 = c2956i0.f9355h;
            c0185s2 = c2956i0.f9354g;
            AbstractC1784a.m3205S(objM271a);
            ?? r15 = ((C0200n) objM271a).f696a;
            size = r15.size();
            while (i5 < size) {
            }
            return r15.get(0);
        }
        if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        enumC0201o2 = c2956i0.f9355h;
        c0185s2 = c2956i0.f9354g;
        AbstractC1784a.m3205S(objM271a);
        C0185S c0185s3 = c0185s2;
        enumC0201o = enumC0201o2;
        c0185s = c0185s3;
        ?? r152 = ((C0200n) objM271a).f696a;
        int size2 = r152.size();
        for (int i8 = 0; i8 < size2; i8++) {
            if (((C0209w) r152.get(i8)).m321b()) {
                return null;
            }
        }
        c2956i0.f9354g = c0185s;
        c2956i0.f9355h = enumC0201o;
        c2956i0.f9357j = 1;
        objM271a = c0185s.m271a(enumC0201o, c2956i0);
        if (objM271a != enumC1152a) {
            EnumC0201o enumC0201o3 = enumC0201o;
            c0185s2 = c0185s;
            enumC0201o2 = enumC0201o3;
            ?? r153 = ((C0200n) objM271a).f696a;
            size = r153.size();
            for (i5 = 0; i5 < size; i5++) {
                if (!AbstractC0208v.m313c((C0209w) r153.get(i5))) {
                    int size3 = r153.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        C0209w c0209w = (C0209w) r153.get(i9);
                        if (c0209w.m321b() || AbstractC0208v.m316f(c0209w, c0185s2.f645i.f647B, c0185s2.m274d())) {
                            return null;
                        }
                    }
                    c2956i0.f9354g = c0185s2;
                    c2956i0.f9355h = enumC0201o2;
                    c2956i0.f9357j = 2;
                    objM271a = c0185s2.m271a(EnumC0201o.f704f, c2956i0);
                }
            }
            return r153.get(0);
        }
        return enumC1152a;
    }
}
