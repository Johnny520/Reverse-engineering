package p000A;

import android.view.View;
import android.view.textclassifier.TextClassifier;
import me.dartcv.nuke.BuildConfig;
import p007B0.C0212z;
import p007B0.InterfaceC0169B;
import p016C3.C0244a;
import p047I0.C0660A0;
import p047I0.C0670F0;
import p047I0.C0696T;
import p051J.C0810b;
import p051J.C0811c;
import p051J.C0818j;
import p051J.C0822n;
import p051J.C0824p;
import p056K2.C0891q;
import p058L.C0920W;
import p071O.C1022a;
import p072O0.ScrollCaptureCallbackC1033d;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.C1400z0;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p158f0.C2085q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p170h1.C2224o;
import p172h3.InterfaceC2247g;
import p176i1.C2310z;
import p178i3.InterfaceC2316A;
import p178i3.InterfaceC2324e;
import p203n.InterfaceC2659i;
import p204n0.C2684c;
import p227r.C2940A0;
import p227r.C2981c0;
import p227r.C2989g0;
import p227r.C3015t0;
import p227r.C3018v;
import p232s.C3159f;
import p232s.C3160g;
import p232s.C3162i;
import p266y.C3478h;

/* JADX INFO: renamed from: A.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0039U extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f171h;

    /* JADX INFO: renamed from: i */
    public int f172i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f173j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f174k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0039U(TextClassifier textClassifier, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f171h = 7;
        this.f173j = textClassifier;
        this.f174k = (AbstractC1184i) interfaceC1603e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        switch (this.f171h) {
            case 0:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                ((C0039U) mo7n((InterfaceC1046d) obj2, (C0660A0) obj)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            case 2:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 3:
                ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            case 4:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 5:
                ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            case 6:
                ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            case 7:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 8:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 9:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 10:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 11:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 12:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 13:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 14:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 15:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, obj)).mo8p(C0891q.f2780a);
            case 16:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 17:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 18:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 19:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 20:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 21:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 22:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 23:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0039U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [Q2.i, W2.e] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f171h) {
            case 0:
                return new C0039U((InterfaceC0169B) this.f173j, (C0920W) this.f174k, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                C0039U c0039u = new C0039U((C0696T) this.f174k, interfaceC1046d, 1);
                c0039u.f173j = obj;
                return c0039u;
            case 2:
                return new C0039U((C1400z0) this.f173j, (View) this.f174k, interfaceC1046d, 2);
            case 3:
                return new C0039U((InterfaceC2316A) this.f173j, (C0670F0) this.f174k, interfaceC1046d, 3);
            case 4:
                return new C0039U((C0811c) this.f173j, (C0822n) this.f174k, interfaceC1046d, 4);
            case 5:
                return new C0039U((InterfaceC2115S) this.f173j, (C0818j) this.f174k, interfaceC1046d, 5);
            case 6:
                return new C0039U((C0824p) this.f173j, (C0810b) this.f174k, interfaceC1046d, 6);
            case 7:
                return new C0039U((TextClassifier) this.f173j, (InterfaceC1603e) this.f174k, interfaceC1046d);
            case 8:
                C0039U c0039u2 = new C0039U((C1022a) this.f174k, interfaceC1046d, 8);
                c0039u2.f173j = obj;
                return c0039u2;
            case 9:
                return new C0039U((C0212z) this.f173j, (InterfaceC2659i) this.f174k, interfaceC1046d, 9);
            case 10:
                return new C0039U((ScrollCaptureCallbackC1033d) this.f173j, (Runnable) this.f174k, interfaceC1046d, 10);
            case 11:
                return new C0039U((C3162i) this.f173j, (C2085q) this.f174k, interfaceC1046d, 11);
            case 12:
                C0039U c0039u3 = new C0039U((String) this.f174k, interfaceC1046d, 12);
                c0039u3.f173j = obj;
                return c0039u3;
            case 13:
                return new C0039U((C2224o) this.f173j, (C2684c) this.f174k, interfaceC1046d, 13);
            case 14:
                C0039U c0039u4 = new C0039U((C2310z) this.f174k, interfaceC1046d, 14);
                c0039u4.f173j = obj;
                return c0039u4;
            case 15:
                C0039U c0039u5 = new C0039U((InterfaceC2324e) this.f174k, interfaceC1046d, 15);
                c0039u5.f173j = obj;
                return c0039u5;
            case 16:
                return new C0039U((C3162i) this.f173j, (C3159f) this.f174k, interfaceC1046d, 16);
            case 17:
                return new C0039U((C3162i) this.f173j, (C3160g) this.f174k, interfaceC1046d, 17);
            case 18:
                C0039U c0039u6 = new C0039U((InterfaceC2247g) this.f174k, interfaceC1046d, 18);
                c0039u6.f173j = obj;
                return c0039u6;
            case 19:
                C0039U c0039u7 = new C0039U((C2981c0) this.f174k, interfaceC1046d, 19);
                c0039u7.f173j = obj;
                return c0039u7;
            case 20:
                return new C0039U((C2940A0) this.f173j, (InterfaceC1603e) this.f174k, interfaceC1046d, 20);
            case 21:
                return new C0039U((C3018v) this.f173j, (C3015t0) this.f174k, interfaceC1046d, 21);
            case 22:
                return new C0039U((InterfaceC2115S) this.f173j, (C2989g0) this.f174k, interfaceC1046d, 22);
            case 23:
                return new C0039U((C3162i) this.f173j, (InterfaceC1347Y) this.f174k, interfaceC1046d, 23);
            default:
                return new C0039U((C3478h) this.f173j, (C0244a) this.f174k, interfaceC1046d, 24);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:306:0x053a, code lost:
    
        if (p160f3.AbstractC2162v.m3983e(500, r12) != r11) goto L308;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x052f A[Catch: all -> 0x04e1, TryCatch #0 {all -> 0x04e1, blocks: (B:281:0x04dd, B:308:0x053d, B:302:0x0526, B:305:0x052f, B:287:0x04eb, B:288:0x04ef, B:289:0x04f7, B:299:0x0517, B:301:0x0520), top: B:387:0x04d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:405:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170 A[Catch: all -> 0x014c, TryCatch #5 {all -> 0x014c, blocks: (B:70:0x0148, B:80:0x0166, B:82:0x0170, B:85:0x017f, B:77:0x015a), top: B:396:0x013e }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Type inference failed for: r2v15, types: [Q2.i, W2.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x02c3 -> B:162:0x02c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:306:0x053a -> B:308:0x053d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01a5 -> B:80:0x0166). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000A.C0039U.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039U(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f171h = i5;
        this.f174k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039U(Object obj, Object obj2, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f171h = i5;
        this.f173j = obj;
        this.f174k = obj2;
    }
}
