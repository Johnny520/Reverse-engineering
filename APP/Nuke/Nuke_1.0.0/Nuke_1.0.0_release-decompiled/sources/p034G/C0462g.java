package p034G;

import android.view.textclassifier.TextClassifier;
import me.dartcv.nuke.BuildConfig;
import p040H.InterfaceC0547e;
import p056K2.C0891q;
import p058L.C0943o;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p117X2.C1672q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p227r.C2940A0;
import p227r.C3025y0;
import p232s.C3162i;

/* JADX INFO: renamed from: G.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0462g extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1366h;

    /* JADX INFO: renamed from: i */
    public int f1367i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f1368j;

    /* JADX INFO: renamed from: k */
    public Object f1369k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1370l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f1371m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462g(long j5, C0943o c0943o, InterfaceC1046d interfaceC1046d, CharSequence charSequence) {
        super(2, interfaceC1046d);
        this.f1366h = 1;
        this.f1370l = c0943o;
        this.f1371m = charSequence;
        this.f1368j = j5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1366h) {
            case 0:
                return ((C0462g) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0462g) mo7n((InterfaceC1046d) obj2, (TextClassifier) obj)).mo8p(C0891q.f2780a);
            case 2:
                return ((C0462g) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0462g) mo7n((InterfaceC1046d) obj2, (C3025y0) obj)).mo8p(C0891q.f2780a);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f1366h) {
            case 0:
                return new C0462g((C0463h) this.f1369k, this.f1368j, (InterfaceC0547e) this.f1370l, (C0461f) this.f1371m, interfaceC1046d);
            case BuildConfig.VERSION_CODE /* 1 */:
                C0462g c0462g = new C0462g(this.f1368j, (C0943o) this.f1370l, interfaceC1046d, (CharSequence) this.f1371m);
                c0462g.f1369k = obj;
                return c0462g;
            case 2:
                return new C0462g((InterfaceC2115S) this.f1370l, this.f1368j, (C3162i) this.f1371m, interfaceC1046d, 2);
            default:
                C0462g c0462g2 = new C0462g((C2940A0) this.f1370l, this.f1368j, (C1672q) this.f1371m, interfaceC1046d, 3);
                c0462g2.f1369k = obj;
                return c0462g2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034G.C0462g.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0462g(C0463h c0463h, long j5, InterfaceC0547e interfaceC0547e, C0461f c0461f, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f1366h = 0;
        this.f1369k = c0463h;
        this.f1368j = j5;
        this.f1370l = interfaceC0547e;
        this.f1371m = c0461f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0462g(Object obj, long j5, Object obj2, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f1366h = i5;
        this.f1370l = obj;
        this.f1368j = j5;
        this.f1371m = obj2;
    }
}
