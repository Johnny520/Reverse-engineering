package p051J;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import me.dartcv.nuke.BuildConfig;
import p007B0.InterfaceC0169B;
import p047I0.C0696T;
import p056K2.C0891q;
import p058L.C0943o;
import p072O0.ScrollCaptureCallbackC1033d;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1666k;
import p160f3.InterfaceC2160t;
import p178i3.C2318C;
import p178i3.C2345z;
import p178i3.EnumC2341v;
import p178i3.InterfaceC2323d;
import p203n.C2647c;

/* JADX INFO: renamed from: J.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0810b extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2600h;

    /* JADX INFO: renamed from: i */
    public int f2601i;

    /* JADX INFO: renamed from: j */
    public Object f2602j;

    /* JADX INFO: renamed from: k */
    public Object f2603k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2604l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2605m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0810b(InterfaceC0169B interfaceC0169B, InterfaceC1604f interfaceC1604f, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2600h = 7;
        this.f2604l = interfaceC0169B;
        this.f2605m = interfaceC1604f;
        this.f2603k = interfaceC1601c;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        switch (this.f2600h) {
            case 0:
                ((C0810b) mo7n((InterfaceC1046d) obj2, (C0696T) obj)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 2:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 3:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 4:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (EnumC2341v) obj)).mo8p(C0891q.f2780a);
            case 5:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 6:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Q2.i, W2.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [W2.c, X2.k] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2600h) {
            case 0:
                C0810b c0810b = new C0810b((InterfaceC1601c) this.f2603k, (C0811c) this.f2604l, (C0824p) this.f2605m, interfaceC1046d, 0);
                c0810b.f2602j = obj;
                return c0810b;
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0810b((C0943o) this.f2604l, (AbstractC1184i) this.f2605m, interfaceC1046d);
            case 2:
                return new C0810b((ScrollCaptureCallbackC1033d) this.f2602j, (ScrollCaptureSession) this.f2603k, (Rect) this.f2604l, (Consumer) this.f2605m, interfaceC1046d, 2);
            case 3:
                C0810b c0810b2 = new C0810b((InterfaceC1601c) this.f2603k, (AtomicReference) this.f2604l, (InterfaceC1603e) this.f2605m, interfaceC1046d);
                c0810b2.f2602j = obj;
                return c0810b2;
            case 4:
                C0810b c0810b3 = new C0810b((InterfaceC2323d) this.f2603k, (C2318C) this.f2604l, (Float) this.f2605m, interfaceC1046d, 4);
                c0810b3.f2602j = obj;
                return c0810b3;
            case 5:
                return new C0810b((C2345z) this.f2602j, (InterfaceC2323d) this.f2603k, (C2318C) this.f2604l, (Float) this.f2605m, interfaceC1046d, 5);
            case 6:
                return new C0810b(this.f2602j, (C2647c) this.f2603k, (InterfaceC1347Y) this.f2604l, (InterfaceC1347Y) this.f2605m, interfaceC1046d, 6);
            default:
                C0810b c0810b4 = new C0810b((InterfaceC0169B) this.f2604l, (InterfaceC1604f) this.f2605m, (InterfaceC1601c) this.f2603k, interfaceC1046d);
                c0810b4.f2602j = obj;
                return c0810b4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [W2.c, X2.k] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Q2.i, W2.e] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p051J.C0810b.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0810b(C0943o c0943o, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2600h = 1;
        this.f2604l = c0943o;
        this.f2605m = (AbstractC1184i) interfaceC1603e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0810b(InterfaceC1601c interfaceC1601c, AtomicReference atomicReference, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2600h = 3;
        this.f2603k = (AbstractC1666k) interfaceC1601c;
        this.f2604l = atomicReference;
        this.f2605m = interfaceC1603e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0810b(Object obj, Object obj2, Object obj3, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2600h = i5;
        this.f2603k = obj;
        this.f2604l = obj2;
        this.f2605m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0810b(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2600h = i5;
        this.f2602j = obj;
        this.f2603k = obj2;
        this.f2604l = obj3;
        this.f2605m = obj4;
    }
}
