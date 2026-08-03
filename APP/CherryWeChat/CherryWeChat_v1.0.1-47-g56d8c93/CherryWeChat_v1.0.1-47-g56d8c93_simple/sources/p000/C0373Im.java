package p000;

import kotlin.Function;
import kotlinx.serialization.json.AbstractC2156b;

/* JADX INFO: renamed from: Im */
/* JADX INFO: loaded from: classes.dex */
public final class C0373Im extends AbstractC0254Fw implements Function {

    /* JADX INFO: renamed from: c */
    public int f1300c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0535Mc f1301d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2256n f1302e;

    public C0373Im(C2256n r1, InterfaceC0190Eb r2) {
        this.f1302e = r1;
        super(3, r2);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r7) {
        C2256n r0 = this.f1302e;
        C2341oz r1 = (C2341oz) r0.f7969c;
        int r2 = this.f1300c;
        if (r2 == 0) goto L8;
        if (r2 != 1) goto L7;
        AbstractC0628Oj.m1232T(r7);
    L22:
        return (AbstractC2156b) r7;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        AbstractC0628Oj.m1232T(r7);
        C0535Mc r72 = this.f1301d;
        byte r22 = r1.m4765p();
        if (r22 != 1) goto L13;
        return r0.m4585f(true);
    L13:
        if (r22 != 0) goto L17;
        return r0.m4585f(false);
    L17:
        if (r22 != 6) goto L24;
        this.f1300c = 1;
        r7 = C2256n.m4582a(r0, r72, this);
        EnumC1453gc r02 = EnumC1453gc.f5148a;
        if (r7 != r02) goto L22;
        return r02;
    L24:
        if (r22 == 8) goto L26;
        C2341oz.m4750m(r1, "Can't begin reading element, unexpected token", 0, 6);
        throw null;
    L26:
        return r0.m4584e();
    }
}
