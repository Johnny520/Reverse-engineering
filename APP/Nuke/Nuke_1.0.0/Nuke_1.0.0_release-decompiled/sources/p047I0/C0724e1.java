package p047I0;

import android.view.View;
import me.dartcv.nuke.BuildConfig;
import p002A1.InterfaceC0145r;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p095T.C1400z0;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.C1675t;
import p160f3.InterfaceC2160t;
import p172h3.InterfaceC2247g;
import p203n.C2623F;
import p203n.C2647c;
import p216p.C2828V;

/* JADX INFO: renamed from: I0.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0724e1 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2286h = 0;

    /* JADX INFO: renamed from: i */
    public int f2287i;

    /* JADX INFO: renamed from: j */
    public Object f2288j;

    /* JADX INFO: renamed from: k */
    public Object f2289k;

    /* JADX INFO: renamed from: l */
    public Object f2290l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f2291m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f2292n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f2293o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0724e1(C1675t c1675t, C1400z0 c1400z0, InterfaceC0145r interfaceC0145r, C0727f1 c0727f1, View view, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2289k = c1675t;
        this.f2290l = c1400z0;
        this.f2291m = interfaceC0145r;
        this.f2292n = c0727f1;
        this.f2293o = view;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f2286h) {
        }
        return ((C0724e1) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Q2.i, W2.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Q2.i, W2.c] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2286h) {
            case 0:
                C0724e1 c0724e1 = new C0724e1((C1675t) this.f2289k, (C1400z0) this.f2290l, (InterfaceC0145r) this.f2291m, (C0727f1) this.f2292n, (View) this.f2293o, interfaceC1046d);
                c0724e1.f2288j = obj;
                return c0724e1;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0724e1 c0724e12 = new C0724e1((InterfaceC2247g) this.f2290l, (C2647c) this.f2291m, (InterfaceC1347Y) this.f2292n, (InterfaceC1347Y) this.f2293o, interfaceC1046d);
                c0724e12.f2288j = obj;
                return c0724e12;
            case 2:
                C0724e1 c0724e13 = new C0724e1((C2623F) this.f2292n, (InterfaceC1601c) this.f2293o, interfaceC1046d);
                c0724e13.f2291m = obj;
                return c0724e13;
            default:
                C0724e1 c0724e14 = new C0724e1((C2828V) this.f2292n, (InterfaceC1601c) this.f2293o, interfaceC1046d);
                c0724e14.f2291m = obj;
                return c0724e14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2 A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:25:0x009c, B:26:0x009e, B:29:0x00a5, B:37:0x00ba, B:38:0x00bc, B:40:0x00c2, B:43:0x00c9), top: B:167:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b9 A[Catch: all -> 0x01a9, TryCatch #5 {all -> 0x01a9, blocks: (B:79:0x0193, B:80:0x0195, B:83:0x019c, B:91:0x01b1, B:92:0x01b3, B:94:0x01b9, B:97:0x01c0), top: B:174:0x00db }] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0206 -> B:113:0x0209). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.C0724e1.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0724e1(InterfaceC2247g interfaceC2247g, C2647c c2647c, InterfaceC1347Y interfaceC1347Y, InterfaceC1347Y interfaceC1347Y2, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2290l = interfaceC2247g;
        this.f2291m = c2647c;
        this.f2292n = interfaceC1347Y;
        this.f2293o = interfaceC1347Y2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0724e1(C2623F c2623f, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2292n = c2623f;
        this.f2293o = (AbstractC1184i) interfaceC1601c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0724e1(C2828V c2828v, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2292n = c2828v;
        this.f2293o = (AbstractC1184i) interfaceC1601c;
    }
}
