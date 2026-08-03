package ci;

import android.view.View;
import android.view.textclassifier.TextClassifier;
import gg.C1422r;
import java.util.List;
import p011ab.C0045e;
import p027c0.C0368m;
import p057e1.C0807b;
import p057e1.C0808c;
import p058e2.ScrollCaptureCallbackC0813c;
import p070f0.C0971c;
import p070f0.C0978j;
import p070f0.C0982n;
import p070f0.C0984p;
import p085fg.InterfaceC1235p;
import p100h0.C1511d1;
import p116i.C1739c;
import p117i0.C1833g1;
import p117i0.C1897y1;
import p117i0.InterfaceC1809a1;
import p174m.AbstractC2636o1;
import p174m.C2572a0;
import p174m.C2609h2;
import p174m.C2624l1;
import p174m.C2630n;
import p174m.C2656t1;
import p187n.C2854h;
import p187n.C2855i;
import p187n.C2857k;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p251r.C3641z;
import p267s1.C3914t;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p277t.C4076h;
import p340x2.C5679n;
import p348xb.C5763i;
import p348xb.C5769o;
import p357y1.C5899k0;
import p357y1.C5932s1;
import p357y1.C5960z1;
import p358y2.C5989x;
import p370yf.AbstractC6044i;
import sg.InterfaceC3975g;
import tg.InterfaceC4187e;
import tg.InterfaceC4208z;
import ug.C4342g;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0589j extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1837h;

    /* JADX INFO: renamed from: i */
    public int f1838i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f1839j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1840k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0589j(int i9, C5763i c5763i, C1833g1 c1833g1, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1837h = 19;
        this.f1838i = i9;
        this.f1839j = c5763i;
        this.f1840k = c1833g1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [fg.p, yf.i] */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1837h) {
            case 0:
                return new C0589j((C0591k) this.f1839j, (C1422r) this.f1840k, interfaceC5557c, 0);
            case 1:
                return new C0589j((ScrollCaptureCallbackC0813c) this.f1839j, (Runnable) this.f1840k, interfaceC5557c, 1);
            case 2:
                return new C0589j((C0971c) this.f1839j, (C0982n) this.f1840k, interfaceC5557c, 2);
            case 3:
                return new C0589j((InterfaceC3596r0) this.f1839j, (C0978j) this.f1840k, interfaceC5557c, 3);
            case 4:
                return new C0589j((C0984p) this.f1839j, (C0579e) this.f1840k, interfaceC5557c, 4);
            case 5:
                return new C0589j((TextClassifier) this.f1839j, (InterfaceC1235p) this.f1840k, interfaceC5557c);
            case 6:
                return new C0589j((C2857k) this.f1839j, (C2854h) this.f1840k, interfaceC5557c, 6);
            case 7:
                return new C0589j((C2857k) this.f1839j, (C2855i) this.f1840k, interfaceC5557c, 7);
            case 8:
                return new C0589j((C2630n) this.f1839j, (C0368m) this.f1840k, interfaceC5557c, 8);
            case 9:
                C0589j c0589j = new C0589j((C2624l1) this.f1840k, interfaceC5557c, 9);
                c0589j.f1839j = obj;
                return c0589j;
            case 10:
                return new C0589j((AbstractC2636o1) this.f1839j, (InterfaceC1235p) this.f1840k, interfaceC5557c, 10);
            case 11:
                C0589j c0589j2 = new C0589j((InterfaceC3975g) this.f1840k, interfaceC5557c, 11);
                c0589j2.f1839j = obj;
                return c0589j2;
            case 12:
                return new C0589j((C2572a0) this.f1839j, (C2609h2) this.f1840k, interfaceC5557c, 12);
            case 13:
                return new C0589j((InterfaceC3596r0) this.f1839j, (C2656t1) this.f1840k, interfaceC5557c, 13);
            case 14:
                return new C0589j((C4076h) this.f1839j, (C0045e) this.f1840k, interfaceC5557c, 14);
            case 15:
                C0589j c0589j3 = new C0589j((C4342g) this.f1840k, interfaceC5557c, 15);
                c0589j3.f1839j = obj;
                return c0589j3;
            case 16:
                C0589j c0589j4 = new C0589j((C4342g) this.f1840k, interfaceC5557c, 16);
                c0589j4.f1839j = obj;
                return c0589j4;
            case 17:
                C0589j c0589j5 = new C0589j((InterfaceC4187e) this.f1840k, interfaceC5557c, 17);
                c0589j5.f1839j = obj;
                return c0589j5;
            case 18:
                return new C0589j((InterfaceC3918x) this.f1839j, (C1511d1) this.f1840k, interfaceC5557c, 18);
            case 19:
                return new C0589j(this.f1838i, (C5763i) this.f1839j, (C1833g1) this.f1840k, interfaceC5557c);
            case 20:
                return new C0589j((C1739c) this.f1839j, (C0807b) this.f1840k, interfaceC5557c, 20);
            case 21:
                return new C0589j((InterfaceC1809a1) this.f1839j, (InterfaceC1809a1) this.f1840k, interfaceC5557c, 21);
            case 22:
                return new C0589j((C3641z) this.f1839j, (List) this.f1840k, interfaceC5557c, 22);
            case 23:
                return new C0589j((C5679n) this.f1839j, (C0808c) this.f1840k, interfaceC5557c, 23);
            case 24:
                C0589j c0589j6 = new C0589j((C5763i) this.f1840k, interfaceC5557c, 24);
                c0589j6.f1839j = obj;
                return c0589j6;
            case 25:
                return new C0589j((C5769o) this.f1839j, (C3914t) this.f1840k, interfaceC5557c, 25);
            case 26:
                C0589j c0589j7 = new C0589j((C5899k0) this.f1840k, interfaceC5557c, 26);
                c0589j7.f1839j = obj;
                return c0589j7;
            case 27:
                return new C0589j((InterfaceC4208z) this.f1839j, (C5960z1) this.f1840k, interfaceC5557c, 27);
            case 28:
                return new C0589j((C1897y1) this.f1839j, (View) this.f1840k, interfaceC5557c, 28);
            default:
                C0589j c0589j8 = new C0589j((C5989x) this.f1840k, interfaceC5557c, 29);
                c0589j8.f1839j = obj;
                return c0589j8;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f1837h) {
            case 3:
                ((C0589j) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
                break;
            case 4:
                ((C0589j) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
                break;
            case 19:
                C0589j c0589j = (C0589j) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2);
                C3967n c3967n = C3967n.f12976a;
                c0589j.invokeSuspend(c3967n);
                break;
            case 26:
                ((C0589j) create((C5932s1) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
                break;
            case 27:
                ((C0589j) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
                break;
        }
        return ((C0589j) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:471:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v6, types: [fg.p, yf.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0056 -> B:18:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:269:0x04d7 -> B:260:0x049c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:351:0x0607 -> B:353:0x060a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r4 = r20
            int r0 = r4.f1837h
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 4
            r5 = 0
            r6 = 3
            r7 = 2
            sf.n r8 = p276sf.C3967n.f12976a
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r10 = 1
            java.lang.Object r11 = r4.f1840k
            xf.a r12 = p352xf.EnumC5799a.f23547g
            r13 = 0
            switch(r0) {
                case 0: goto L6a3;
                case 1: goto L669;
                case 2: goto L616;
                case 3: goto L5a6;
                case 4: goto L585;
                case 5: goto L55e;
                case 6: goto L53c;
                case 7: goto L51a;
                case 8: goto L4e4;
                case 9: goto L471;
                case 10: goto L44b;
                case 11: goto L40d;
                case 12: goto L3dd;
                case 13: goto L3ac;
                case 14: goto L38a;
                case 15: goto L359;
                case 16: goto L337;
                case 17: goto L317;
                case 18: goto L2ef;
                case 19: goto L2c3;
                case 20: goto L287;
                case 21: goto L247;
                case 22: goto L21f;
                case 23: goto L1f6;
                case 24: goto L170;
                case 25: goto L145;
                case 26: goto Lf2;
                case 27: goto Lc7;
                case 28: goto L80;
                default: goto L18;
            }
        L18:
            int r0 = r4.f1838i
            if (r0 == 0) goto L2b
            if (r0 != r10) goto L26
            java.lang.Object r0 = r4.f1839j
            qg.t r0 = (p249qg.InterfaceC3599t) r0
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L5a
        L26:
            p136j8.C2104o.m5276A(r9)
        L29:
            r8 = r13
            goto L7f
        L2b:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            qg.t r0 = (p249qg.InterfaceC3599t) r0
        L32:
            boolean r1 = p249qg.AbstractC3603v.m7561o(r0)
            if (r1 == 0) goto L7f
            y2.c r1 = p358y2.C5966c.f24244i
            r4.f1839j = r0
            r4.f1838i = r10
            wf.g r2 = r4.getContext()
            y1.r1 r3 = p357y1.C5928r1.f24041g
            wf.e r2 = r2.mo2062s(r3)
            if (r2 != 0) goto L7b
            wf.g r2 = r4.getContext()
            i0.d r2 = p117i0.AbstractC1874r.m4637s(r2)
            java.lang.Object r1 = r2.m4458d(r1, r4)
            if (r1 != r12) goto L5a
            r8 = r12
            goto L7f
        L5a:
            r1 = r11
            y2.x r1 = (p358y2.C5989x) r1
            int[] r2 = r1.f24331I
            boolean r3 = r1.isAttachedToWindow()
            if (r3 != 0) goto L66
            goto L32
        L66:
            r3 = r2[r5]
            r6 = r2[r10]
            android.view.View r7 = r1.f24335s
            r7.getLocationOnScreen(r2)
            r7 = r2[r5]
            if (r3 != r7) goto L77
            r2 = r2[r10]
            if (r6 == r2) goto L32
        L77:
            r1.m10727p()
            goto L32
        L7b:
            p012ah.C0086a.m445d()
            goto L29
        L7f:
            return r8
        L80:
            java.lang.Object r0 = r4.f1839j
            r1 = r0
            i0.y1 r1 = (p117i0.C1897y1) r1
            android.view.View r11 = (android.view.View) r11
            int r0 = r4.f1838i
            r2 = 2131099691(0x7f06002b, float:1.7811742E38)
            if (r0 == 0) goto L9b
            if (r0 != r10) goto L96
            p077f8.AbstractC1089i.m2732I0(r21)     // Catch: java.lang.Throwable -> L94
            goto Lb3
        L94:
            r0 = move-exception
            goto Lbd
        L96:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto Lbc
        L9b:
            p077f8.AbstractC1089i.m2732I0(r21)
            r4.f1838i = r10     // Catch: java.lang.Throwable -> L94
            tg.b0 r0 = r1.f6323u     // Catch: java.lang.Throwable -> L94
            i0.v1 r3 = new i0.v1     // Catch: java.lang.Throwable -> L94
            r3.<init>(r7, r13, r5)     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = tg.AbstractC4201s.m8468f(r0, r3, r4)     // Catch: java.lang.Throwable -> L94
            if (r0 != r12) goto Lae
            goto Laf
        Lae:
            r0 = r8
        Laf:
            if (r0 != r12) goto Lb3
            r8 = r12
            goto Lbc
        Lb3:
            i0.o r0 = p357y1.AbstractC5945v2.m10671a(r11)
            if (r0 != r1) goto Lbc
            r11.setTag(r2, r13)
        Lbc:
            return r8
        Lbd:
            i0.o r3 = p357y1.AbstractC5945v2.m10671a(r11)
            if (r3 != r1) goto Lc6
            r11.setTag(r2, r13)
        Lc6:
            throw r0
        Lc7:
            int r0 = r4.f1838i
            if (r0 == 0) goto Ld6
            if (r0 == r10) goto Ld2
            p136j8.C2104o.m5276A(r9)
        Ld0:
            r12 = r13
            goto Lf1
        Ld2:
            p077f8.AbstractC1089i.m2732I0(r21)
            goto Led
        Ld6:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            tg.z r0 = (tg.InterfaceC4208z) r0
            ci.i r1 = new ci.i
            y1.z1 r11 = (p357y1.C5960z1) r11
            r1.<init>(r11, r3)
            r4.f1838i = r10
            java.lang.Object r0 = r0.mo6025b(r1, r4)
            if (r0 != r12) goto Led
            goto Lf1
        Led:
            okio.C3193a.m6814c()
            goto Ld0
        Lf1:
            return r12
        Lf2:
            int r0 = r4.f1838i
            if (r0 == 0) goto L105
            if (r0 == r10) goto Lfd
            p136j8.C2104o.m5276A(r9)
        Lfb:
            r12 = r13
            goto L144
        Lfd:
            java.lang.Object r0 = r4.f1839j
            y1.s1 r0 = (p357y1.C5932s1) r0
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L140
        L105:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            y1.s1 r0 = (p357y1.C5932s1) r0
            y1.k0 r11 = (p357y1.C5899k0) r11
            r4.f1839j = r0
            r4.f1838i = r10
            qg.g r1 = new qg.g
            wf.c r2 = p080fb.AbstractC1184v0.m3214x(r4)
            r1.<init>(r10, r2)
            r1.m7513p()
            n2.t r2 = r11.f23968h
            n2.n r3 = r2.f9319a
            r3.mo2395b()
            n2.y r5 = new n2.y
            r5.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference r2 = r2.f9320b
            r2.set(r5)
            f1.p r2 = new f1.p
            r3 = 8
            r2.<init>(r0, r3, r11)
            r1.m7515r(r2)
            java.lang.Object r0 = r1.m7512o()
            if (r0 != r12) goto L140
            goto L144
        L140:
            okio.C3193a.m6814c()
            goto Lfb
        L144:
            return r12
        L145:
            int r0 = r4.f1838i
            if (r0 == 0) goto L154
            if (r0 != r10) goto L14f
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L16f
        L14f:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L16f
        L154:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            xb.o r0 = (p348xb.C5769o) r0
            i.c r0 = r0.f23496f
            s1.t r11 = (p267s1.C3914t) r11
            long r1 = r11.f12836c
            e1.b r3 = new e1.b
            r3.<init>(r1)
            r4.f1838i = r10
            java.lang.Object r0 = r0.m4361e(r3, r4)
            if (r0 != r12) goto L16f
            r8 = r12
        L16f:
            return r8
        L170:
            xb.i r11 = (p348xb.C5763i) r11
            lg.a r0 = r11.f23451b
            java.lang.Object r1 = r4.f1839j
            qg.t r1 = (p249qg.InterfaceC3599t) r1
            int r2 = r4.f1838i
            if (r2 == 0) goto L18d
            if (r2 == r10) goto L189
            if (r2 != r7) goto L184
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L1db
        L184:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L1f5
        L189:
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L19b
        L18d:
            p077f8.AbstractC1089i.m2732I0(r21)
            r4.f1839j = r1
            r4.f1838i = r10
            java.lang.Object r2 = p263rg.AbstractC3810g.m8000c(r4)
            if (r2 != r12) goto L19b
            goto L1d9
        L19b:
            float r2 = r11.m10457c()
            float r5 = r11.m10456b()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L1a8
            goto L1db
        L1a8:
            float r2 = r0.f8311b
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            float r2 = r2.floatValue()
            float r0 = r0.f8310a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            float r2 = r2 - r0
            r0 = 1020054733(0x3ccccccd, float:0.025)
            float r2 = r2 * r0
            wb.h3 r0 = new wb.h3
            r0.<init>(r11, r6)
            m.a r0 = p117i0.AbstractC1874r.m4616B(r0)
            xb.g r5 = new xb.g
            r5.<init>(r0, r11, r2)
            r4.f1839j = r1
            r4.f1838i = r7
            java.lang.Object r0 = tg.AbstractC4201s.m8469g(r5, r4)
            if (r0 != r12) goto L1db
        L1d9:
            r8 = r12
            goto L1f5
        L1db:
            xb.b r0 = new xb.b
            r0.<init>(r11, r13, r3)
            p249qg.AbstractC3603v.m7563q(r1, r13, r0, r6)
            xb.b r0 = new xb.b
            r2 = 5
            r0.<init>(r11, r13, r2)
            p249qg.AbstractC3603v.m7563q(r1, r13, r0, r6)
            xb.b r0 = new xb.b
            r2 = 6
            r0.<init>(r11, r13, r2)
            p249qg.AbstractC3603v.m7563q(r1, r13, r0, r6)
        L1f5:
            return r8
        L1f6:
            int r0 = r4.f1838i
            if (r0 == 0) goto L205
            if (r0 != r10) goto L200
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L21e
        L200:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L21e
        L205:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            x2.n r0 = (p340x2.C5679n) r0
            d1.c0 r1 = new d1.c0
            e1.c r11 = (p057e1.C0808c) r11
            r2 = 17
            r1.<init>(r11, r2)
            r4.f1838i = r10
            java.lang.Object r0 = p219oh.AbstractC3165h.m6784k(r0, r1, r4)
            if (r0 != r12) goto L21e
            r8 = r12
        L21e:
            return r8
        L21f:
            int r0 = r4.f1838i
            if (r0 == 0) goto L22e
            if (r0 != r10) goto L229
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L246
        L229:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L246
        L22e:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            r.z r0 = (p251r.C3641z) r0
            java.util.List r11 = (java.util.List) r11
            int r1 = r11.size()
            r4.f1838i = r10
            p4.t r2 = p251r.C3641z.f11796y
            java.lang.Object r0 = r0.m7619f(r1, r4)
            if (r0 != r12) goto L246
            r8 = r12
        L246:
            return r8
        L247:
            i0.a1 r11 = (p117i0.InterfaceC1809a1) r11
            int r0 = r4.f1838i
            if (r0 == 0) goto L258
            if (r0 != r10) goto L253
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L27f
        L253:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L286
        L258:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            i0.a1 r0 = (p117i0.InterfaceC1809a1) r0
            og.k r1 = p332wb.AbstractC4955ho.f17686a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L273
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r11.setValue(r0)
            goto L286
        L273:
            r4.f1838i = r10
            r0 = 100
            java.lang.Object r0 = p249qg.AbstractC3603v.m7552f(r0, r4)
            if (r0 != r12) goto L27f
            r8 = r12
            goto L286
        L27f:
            og.k r0 = p332wb.AbstractC4955ho.f17686a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.setValue(r0)
        L286:
            return r8
        L287:
            int r0 = r4.f1838i
            if (r0 == 0) goto L296
            if (r0 != r10) goto L291
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L2c2
        L291:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L2c2
        L296:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            i.c r0 = (p116i.C1739c) r0
            java.lang.Object r1 = r0.m4360d()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            e1.b r11 = (p057e1.C0807b) r11
            long r2 = r11.f2414a
            r5 = 32
            long r2 = r2 >> r5
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r4.f1838i = r10
            java.lang.Object r0 = r0.m4361e(r1, r4)
            if (r0 != r12) goto L2c2
            r8 = r12
        L2c2:
            return r8
        L2c3:
            java.lang.Object r0 = r4.f1839j
            xb.i r0 = (p348xb.C5763i) r0
            p077f8.AbstractC1089i.m2732I0(r21)
            i0.g1 r11 = (p117i0.C1833g1) r11
            i0.m2 r1 = p332wb.AbstractC5163o3.f19312a
            int r1 = r11.m4492g()
            int r2 = r4.f1838i
            if (r1 != r2) goto L2e0
            float r1 = r0.m10456b()
            int r1 = java.lang.Math.round(r1)
            if (r1 == r2) goto L2ee
        L2e0:
            r11.m4493h(r2)
            float r1 = (float) r2
            qg.t r2 = r0.f23450a
            i.i1 r3 = new i.i1
            r3.<init>(r0, r1, r13)
            p249qg.AbstractC3603v.m7563q(r2, r13, r3, r6)
        L2ee:
            return r8
        L2ef:
            int r0 = r4.f1838i
            if (r0 == 0) goto L2fe
            if (r0 != r10) goto L2f9
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L316
        L2f9:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L316
        L2fe:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            s1.x r0 = (p267s1.InterfaceC3918x) r0
            h0.d1 r11 = (p100h0.C1511d1) r11
            h0.t0 r1 = new h0.t0
            r1.<init>(r11, r7)
            r4.f1838i = r10
            r2 = 7
            java.lang.Object r0 = p174m.AbstractC2677y2.m6119d(r0, r13, r1, r4, r2)
            if (r0 != r12) goto L316
            r8 = r12
        L316:
            return r8
        L317:
            int r0 = r4.f1838i
            if (r0 == 0) goto L326
            if (r0 != r10) goto L321
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L336
        L321:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L336
        L326:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            tg.e r11 = (tg.InterfaceC4187e) r11
            r4.f1838i = r10
            java.lang.Object r0 = r11.mo1602e(r0, r4)
            if (r0 != r12) goto L336
            r8 = r12
        L336:
            return r8
        L337:
            int r0 = r4.f1838i
            if (r0 == 0) goto L346
            if (r0 != r10) goto L341
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L358
        L341:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L358
        L346:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            tg.e r0 = (tg.InterfaceC4187e) r0
            ug.g r11 = (ug.C4342g) r11
            r4.f1838i = r10
            java.lang.Object r0 = r11.m8794a(r0, r4)
            if (r0 != r12) goto L358
            r8 = r12
        L358:
            return r8
        L359:
            int r0 = r4.f1838i
            if (r0 == 0) goto L368
            if (r0 != r10) goto L363
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L389
        L363:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L389
        L368:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            sg.o r0 = (sg.C3983o) r0
            ug.g r11 = (ug.C4342g) r11
            r4.f1838i = r10
            r11.getClass()
            ug.n r1 = new ug.n
            r1.<init>(r0)
            r0 = r4
            yf.c r0 = (p370yf.AbstractC6038c) r0
            java.lang.Object r0 = r11.m8794a(r1, r0)
            if (r0 != r12) goto L385
            goto L386
        L385:
            r0 = r8
        L386:
            if (r0 != r12) goto L389
            r8 = r12
        L389:
            return r8
        L38a:
            int r0 = r4.f1838i
            if (r0 == 0) goto L399
            if (r0 != r10) goto L394
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L3ab
        L394:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L3ab
        L399:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            t.h r0 = (p277t.C4076h) r0
            ab.e r11 = (p011ab.C0045e) r11
            r4.f1838i = r10
            java.lang.Object r0 = p219oh.AbstractC3165h.m6784k(r0, r11, r4)
            if (r0 != r12) goto L3ab
            r8 = r12
        L3ab:
            return r8
        L3ac:
            int r0 = r4.f1838i
            if (r0 == 0) goto L3c1
            if (r0 == r10) goto L3bd
            if (r0 != r7) goto L3b8
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L3dc
        L3b8:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L3dc
        L3bd:
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L3d1
        L3c1:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            qg.r0 r0 = (p249qg.InterfaceC3596r0) r0
            r4.f1838i = r10
            java.lang.Object r0 = r0.mo7488g(r4)
            if (r0 != r12) goto L3d1
            goto L3db
        L3d1:
            m.t1 r11 = (p174m.C2656t1) r11
            r4.f1838i = r7
            java.lang.Object r0 = r11.m6115j(r4)
            if (r0 != r12) goto L3dc
        L3db:
            r8 = r12
        L3dc:
            return r8
        L3dd:
            int r0 = r4.f1838i
            if (r0 == 0) goto L3ec
            if (r0 != r10) goto L3e7
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L40c
        L3e7:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L40c
        L3ec:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            m.a0 r0 = (p174m.C2572a0) r0
            boolean r1 = r0.f8341b
            if (r1 == 0) goto L3f9
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3f9:
            m.h2 r11 = (p174m.C2609h2) r11
            m.o2 r1 = r11.f8459T
            long r6 = r0.f8340a
            long r2 = p293u2.C4247q.m8548f(r6, r2)
            r4.f1838i = r10
            java.lang.Object r0 = r1.m6089b(r2, r5, r4)
            if (r0 != r12) goto L40c
            r8 = r12
        L40c:
            return r8
        L40d:
            int r0 = r4.f1838i
            if (r0 == 0) goto L425
            if (r0 != r10) goto L420
            java.lang.Object r0 = r4.f1839j
            r1 = r0
            qg.r0 r1 = (p249qg.InterfaceC3596r0) r1
            p077f8.AbstractC1089i.m2732I0(r21)     // Catch: java.lang.Throwable -> L41e
            r0 = r21
            goto L442
        L41e:
            r0 = move-exception
            goto L447
        L420:
            p136j8.C2104o.m5276A(r9)
            r12 = r13
            goto L446
        L425:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            qg.t r0 = (p249qg.InterfaceC3599t) r0
            ci.c r1 = new ci.c
            r1.<init>(r7, r13)
            qg.e1 r1 = p249qg.AbstractC3603v.m7563q(r0, r13, r1, r6)
            sg.g r11 = (sg.InterfaceC3975g) r11     // Catch: java.lang.Throwable -> L41e
            r4.f1839j = r1     // Catch: java.lang.Throwable -> L41e
            r4.f1838i = r10     // Catch: java.lang.Throwable -> L41e
            java.lang.Object r0 = r11.mo8198f(r4)     // Catch: java.lang.Throwable -> L41e
            if (r0 != r12) goto L442
            goto L446
        L442:
            r1.mo7485a(r13)
            r12 = r0
        L446:
            return r12
        L447:
            r1.mo7485a(r13)
            throw r0
        L44b:
            int r0 = r4.f1838i
            if (r0 == 0) goto L45a
            if (r0 != r10) goto L455
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L470
        L455:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L470
        L45a:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            m.o1 r0 = (p174m.AbstractC2636o1) r0
            m.o2 r0 = r0.f8583a
            fg.p r11 = (p085fg.InterfaceC1235p) r11
            r4.f1838i = r10
            k.d1 r1 = p144k.EnumC2164d1.f7174h
            java.lang.Object r0 = r0.m6093f(r1, r11, r4)
            if (r0 != r12) goto L470
            r8 = r12
        L470:
            return r8
        L471:
            r1 = r11
            m.l1 r1 = (p174m.C2624l1) r1
            int r0 = r4.f1838i
            if (r0 == 0) goto L495
            if (r0 == r10) goto L48b
            if (r0 != r7) goto L486
            java.lang.Object r0 = r4.f1839j
            qg.t r0 = (p249qg.InterfaceC3599t) r0
            p077f8.AbstractC1089i.m2732I0(r21)     // Catch: java.lang.Throwable -> L484
            goto L49c
        L484:
            r0 = move-exception
            goto L4e1
        L486:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L4e0
        L48b:
            java.lang.Object r0 = r4.f1839j
            qg.t r0 = (p249qg.InterfaceC3599t) r0
            p077f8.AbstractC1089i.m2732I0(r21)     // Catch: java.lang.Throwable -> L484
            r2 = r21
            goto L4b3
        L495:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            qg.t r0 = (p249qg.InterfaceC3599t) r0
        L49c:
            wf.g r2 = r0.mo4457n()     // Catch: java.lang.Throwable -> L484
            boolean r2 = p249qg.AbstractC3603v.m7562p(r2)     // Catch: java.lang.Throwable -> L484
            if (r2 == 0) goto L4de
            sg.c r2 = r1.f8538g     // Catch: java.lang.Throwable -> L484
            r4.f1839j = r0     // Catch: java.lang.Throwable -> L484
            r4.f1838i = r10     // Catch: java.lang.Throwable -> L484
            java.lang.Object r2 = r2.mo8198f(r4)     // Catch: java.lang.Throwable -> L484
            if (r2 != r12) goto L4b3
            goto L4d9
        L4b3:
            r3 = r2
            m.h1 r3 = (p174m.C2608h1) r3     // Catch: java.lang.Throwable -> L484
            u2.c r2 = r1.f8585c     // Catch: java.lang.Throwable -> L484
            float r5 = p174m.AbstractC2628m1.f8554a     // Catch: java.lang.Throwable -> L484
            float r2 = r2.mo1601x0(r5)     // Catch: java.lang.Throwable -> L484
            u2.c r5 = r1.f8585c     // Catch: java.lang.Throwable -> L484
            float r6 = p174m.AbstractC2628m1.f8555b     // Catch: java.lang.Throwable -> L484
            float r5 = r5.mo1601x0(r6)     // Catch: java.lang.Throwable -> L484
            r6 = r2
            m.o2 r2 = r1.f8583a     // Catch: java.lang.Throwable -> L484
            r4.f1839j = r0     // Catch: java.lang.Throwable -> L484
            r4.f1838i = r7     // Catch: java.lang.Throwable -> L484
            r19 = r6
            r6 = r4
            r4 = r19
            java.lang.Object r2 = p174m.C2624l1.m6079c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4db
            r4 = r6
            if (r2 != r12) goto L49c
        L4d9:
            r8 = r12
            goto L4e0
        L4db:
            r0 = move-exception
            r4 = r6
            goto L4e1
        L4de:
            r1.f8539h = r13
        L4e0:
            return r8
        L4e1:
            r1.f8539h = r13
            throw r0
        L4e4:
            int r0 = r4.f1838i
            if (r0 == 0) goto L4f3
            if (r0 != r10) goto L4ee
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L519
        L4ee:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L519
        L4f3:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            m.n r0 = (p174m.C2630n) r0
            k.h1 r15 = r0.f8559c
            m.m r0 = r0.f8558b
            r16 = r11
            c0.m r16 = (p027c0.C0368m) r16
            r4.f1838i = r10
            r15.getClass()
            k.g1 r13 = new k.g1
            r18 = 0
            k.d1 r14 = p144k.EnumC2164d1.f7174h
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            java.lang.Object r0 = p249qg.AbstractC3603v.m7551e(r13, r4)
            if (r0 != r12) goto L519
            r8 = r12
        L519:
            return r8
        L51a:
            int r0 = r4.f1838i
            if (r0 == 0) goto L529
            if (r0 != r10) goto L524
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L53b
        L524:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L53b
        L529:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            n.k r0 = (p187n.C2857k) r0
            n.i r11 = (p187n.C2855i) r11
            r4.f1838i = r10
            java.lang.Object r0 = r0.m6281a(r11, r4)
            if (r0 != r12) goto L53b
            r8 = r12
        L53b:
            return r8
        L53c:
            int r0 = r4.f1838i
            if (r0 == 0) goto L54b
            if (r0 != r10) goto L546
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L55d
        L546:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L55d
        L54b:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            n.k r0 = (p187n.C2857k) r0
            n.h r11 = (p187n.C2854h) r11
            r4.f1838i = r10
            java.lang.Object r0 = r0.m6281a(r11, r4)
            if (r0 != r12) goto L55d
            r8 = r12
        L55d:
            return r8
        L55e:
            int r0 = r4.f1838i
            if (r0 == 0) goto L56e
            if (r0 != r10) goto L56a
            p077f8.AbstractC1089i.m2732I0(r21)
            r13 = r21
            goto L584
        L56a:
            p136j8.C2104o.m5276A(r9)
            goto L584
        L56e:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            android.view.textclassifier.TextClassifier r0 = (android.view.textclassifier.TextClassifier) r0
            if (r0 == 0) goto L584
            yf.i r11 = (p370yf.AbstractC6044i) r11
            r4.f1838i = r10
            java.lang.Object r0 = r11.invoke(r0, r4)
            if (r0 != r12) goto L583
            r13 = r12
            goto L584
        L583:
            r13 = r0
        L584:
            return r13
        L585:
            int r0 = r4.f1838i
            if (r0 == 0) goto L597
            if (r0 == r10) goto L590
            p136j8.C2104o.m5276A(r9)
        L58e:
            r12 = r13
            goto L5a5
        L590:
            p077f8.AbstractC1089i.m2732I0(r21)
            okio.C3193a.m6814c()
            goto L58e
        L597:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            f0.p r0 = (p070f0.C0984p) r0
            ci.e r11 = (ci.C0579e) r11
            r4.f1838i = r10
            p357y1.AbstractC5873d2.m10576a(r0, r11, r4)
        L5a5:
            return r12
        L5a6:
            f0.j r11 = (p070f0.C0978j) r11
            int r0 = r4.f1838i
            r14 = 500(0x1f4, double:2.47E-321)
            if (r0 == 0) goto L5d2
            if (r0 == r10) goto L5ce
            if (r0 == r7) goto L5c5
            if (r0 == r6) goto L5c1
            if (r0 != r3) goto L5bc
            p077f8.AbstractC1089i.m2732I0(r21)     // Catch: java.lang.Throwable -> L5ba
            goto L60a
        L5ba:
            r0 = move-exception
            goto L610
        L5bc:
            p136j8.C2104o.m5276A(r9)
            r12 = r13
            goto L609
        L5c1:
            p077f8.AbstractC1089i.m2732I0(r21)     // Catch: java.lang.Throwable -> L5ba
            goto L5fc
        L5c5:
            p077f8.AbstractC1089i.m2732I0(r21)     // Catch: java.lang.Throwable -> L5ba
            af.d r0 = new af.d     // Catch: java.lang.Throwable -> L5ba
            r0.<init>()     // Catch: java.lang.Throwable -> L5ba
            throw r0     // Catch: java.lang.Throwable -> L5ba
        L5ce:
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L5e4
        L5d2:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            qg.r0 r0 = (p249qg.InterfaceC3596r0) r0
            if (r0 == 0) goto L5e4
            r4.f1838i = r10
            java.lang.Object r0 = p249qg.AbstractC3603v.m7550d(r0, r4)
            if (r0 != r12) goto L5e4
            goto L609
        L5e4:
            i0.f1 r0 = r11.f3090c     // Catch: java.lang.Throwable -> L5ba
            r0.m4489h(r2)     // Catch: java.lang.Throwable -> L5ba
            boolean r0 = r11.f3088a     // Catch: java.lang.Throwable -> L5ba
            if (r0 != 0) goto L5f3
            r4.f1838i = r7     // Catch: java.lang.Throwable -> L5ba
            p249qg.AbstractC3603v.m7548b(r4)     // Catch: java.lang.Throwable -> L5ba
            goto L609
        L5f3:
            r4.f1838i = r6     // Catch: java.lang.Throwable -> L5ba
            java.lang.Object r0 = p249qg.AbstractC3603v.m7552f(r14, r4)     // Catch: java.lang.Throwable -> L5ba
            if (r0 != r12) goto L5fc
            goto L609
        L5fc:
            i0.f1 r0 = r11.f3090c     // Catch: java.lang.Throwable -> L5ba
            r0.m4489h(r1)     // Catch: java.lang.Throwable -> L5ba
            r4.f1838i = r3     // Catch: java.lang.Throwable -> L5ba
            java.lang.Object r0 = p249qg.AbstractC3603v.m7552f(r14, r4)     // Catch: java.lang.Throwable -> L5ba
            if (r0 != r12) goto L60a
        L609:
            return r12
        L60a:
            i0.f1 r0 = r11.f3090c     // Catch: java.lang.Throwable -> L5ba
            r0.m4489h(r2)     // Catch: java.lang.Throwable -> L5ba
            goto L5f3
        L610:
            i0.f1 r2 = r11.f3090c
            r2.m4489h(r1)
            throw r0
        L616:
            int r0 = r4.f1838i
            if (r0 == 0) goto L62e
            if (r0 == r10) goto L62a
            if (r0 == r7) goto L623
            p136j8.C2104o.m5276A(r9)
        L621:
            r8 = r13
            goto L668
        L623:
            p077f8.AbstractC1089i.m2732I0(r21)
            okio.C3193a.m6814c()
            goto L621
        L62a:
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L64f
        L62e:
            p077f8.AbstractC1089i.m2732I0(r21)
            i2.z r0 = new i2.z
            r1 = 15
            r0.<init>(r1)
            r4.f1838i = r10
            wf.g r1 = r4.getContext()
            i0.d r1 = p117i0.AbstractC1874r.m4637s(r1)
            i0.t0 r2 = new i0.t0
            r2.<init>(r0, r5)
            java.lang.Object r0 = r1.m4458d(r2, r4)
            if (r0 != r12) goto L64f
        L64d:
            r8 = r12
            goto L668
        L64f:
            java.lang.Object r0 = r4.f1839j
            f0.c r0 = (p070f0.C0971c) r0
            tg.n r0 = r0.m2402i()
            if (r0 == 0) goto L668
            ci.i r1 = new ci.i
            f0.n r11 = (p070f0.C0982n) r11
            r1.<init>(r11, r7)
            r4.f1838i = r7
            tg.r r0 = (tg.C4200r) r0
            tg.C4200r.m8449j(r0, r1, r4)
            goto L64d
        L668:
            return r8
        L669:
            java.lang.Object r0 = r4.f1839j
            e2.c r0 = (p058e2.ScrollCaptureCallbackC0813c) r0
            int r2 = r4.f1838i
            if (r2 == 0) goto L67c
            if (r2 != r10) goto L677
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L692
        L677:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L6a2
        L67c:
            p077f8.AbstractC1089i.m2732I0(r21)
            e2.g r2 = r0.f2445f
            r4.f1838i = r10
            float r3 = r2.f2453b
            float r1 = r1 - r3
            java.lang.Object r1 = r2.m2065b(r1, r4)
            if (r1 != r12) goto L68d
            goto L68e
        L68d:
            r1 = r8
        L68e:
            if (r1 != r12) goto L692
            r8 = r12
            goto L6a2
        L692:
            androidx.lifecycle.x r0 = r0.f2442c
            java.lang.Object r0 = r0.f310h
            i0.j1 r0 = (p117i0.C1845j1) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            java.lang.Runnable r11 = (java.lang.Runnable) r11
            r11.run()
        L6a2:
            return r8
        L6a3:
            int r0 = r4.f1838i
            if (r0 == 0) goto L6b2
            if (r0 != r10) goto L6ad
            p077f8.AbstractC1089i.m2732I0(r21)
            goto L6dd
        L6ad:
            p136j8.C2104o.m5276A(r9)
            r8 = r13
            goto L6dd
        L6b2:
            p077f8.AbstractC1089i.m2732I0(r21)
            java.lang.Object r0 = r4.f1839j
            ci.k r0 = (ci.C0591k) r0
            i.c r0 = r0.f1843A
            gg.r r11 = (gg.C1422r) r11
            float r1 = r11.f4735g
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r1)
            r1 = 120(0x78, float:1.68E-43)
            g1.d r3 = p116i.AbstractC1801x.f6011b
            i.l1 r1 = p116i.AbstractC1742d.m4380p(r1, r7, r3)
            r4.f1838i = r10
            r3 = 0
            r5 = 12
            r19 = r2
            r2 = r1
            r1 = r19
            java.lang.Object r0 = p116i.C1739c.m4359c(r0, r1, r2, r3, r4, r5)
            if (r0 != r12) goto L6dd
            r8 = r12
        L6dd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C0589j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: fg.p */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0589j(TextClassifier textClassifier, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1837h = 5;
        this.f1839j = textClassifier;
        this.f1840k = (AbstractC6044i) interfaceC1235p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0589j(Object obj, Object obj2, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1837h = i9;
        this.f1839j = obj;
        this.f1840k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0589j(Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1837h = i9;
        this.f1840k = obj;
    }
}
