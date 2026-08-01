package p000A;

import me.dartcv.nuke.BuildConfig;
import p007B0.C0185S;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p143c3.C1906h;

/* JADX INFO: renamed from: A.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0086s0 extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f389f;

    /* JADX INFO: renamed from: g */
    public int f390g;

    /* JADX INFO: renamed from: h */
    public Object f391h;

    /* JADX INFO: renamed from: i */
    public Object f392i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0086s0(InterfaceC1051i interfaceC1051i, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f389f = 1;
        this.f392i = interfaceC1051i;
        this.f393j = (AbstractC1183h) interfaceC1603e;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f389f) {
            case 0:
                return ((C0086s0) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0086s0) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0086s0) mo7n((InterfaceC1046d) obj2, (C1906h) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Q2.h, W2.e] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f389f) {
            case 0:
                C0086s0 c0086s0 = new C0086s0((InterfaceC0092v0) this.f393j, interfaceC1046d, 0);
                c0086s0.f391h = obj;
                return c0086s0;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0086s0 c0086s02 = new C0086s0((InterfaceC1051i) this.f392i, (InterfaceC1603e) this.f393j, interfaceC1046d);
                c0086s02.f391h = obj;
                return c0086s02;
            default:
                C0086s0 c0086s03 = new C0086s0((C0099z) this.f393j, interfaceC1046d, 2);
                c0086s03.f392i = obj;
                return c0086s03;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [B0.S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [B0.S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19, types: [Q2.h, W2.e] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:15:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x009f -> B:28:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00b4 -> B:28:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x010f -> B:69:0x0112). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r14) throws android.app.PendingIntent.CanceledException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000A.C0086s0.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0086s0(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f389f = i5;
        this.f393j = obj;
    }
}
