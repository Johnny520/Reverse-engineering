package p043H2;

import p007B0.C0185S;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1183h;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1603e;
import p216p.C2847h;

/* JADX INFO: renamed from: H2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0644b extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2051f;

    /* JADX INFO: renamed from: g */
    public int f2052g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f2053h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0644b(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2051f = i5;
        this.f2054i = obj;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C0185S c0185s = (C0185S) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f2051f) {
            case 0:
                ((C0644b) mo7n(interfaceC1046d, c0185s)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            default:
                return ((C0644b) mo7n(interfaceC1046d, c0185s)).mo8p(C0891q.f2780a);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2051f) {
            case 0:
                C0644b c0644b = new C0644b((InterfaceC1347Y) this.f2054i, interfaceC1046d, 0);
                c0644b.f2053h = obj;
                return c0644b;
            default:
                C0644b c0644b2 = new C0644b((C2847h) this.f2054i, interfaceC1046d, 1);
                c0644b2.f2053h = obj;
                return c0644b2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0055 -> B:19:0x0058). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00e2 -> B:51:0x00e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p043H2.C0644b.mo8p(java.lang.Object):java.lang.Object");
    }
}
