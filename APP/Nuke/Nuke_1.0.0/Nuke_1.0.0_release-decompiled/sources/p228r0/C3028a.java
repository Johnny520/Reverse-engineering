package p228r0;

import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p211o0.C2762u;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: r0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3028a extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: f */
    public static final C3028a f9604f;

    /* JADX INFO: renamed from: g */
    public static final C3028a f9605g;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f9606e;

    static {
        int i5 = 1;
        f9604f = new C3028a(i5, 0);
        f9605g = new C3028a(i5, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3028a(int i5, int i6) {
        super(i5);
        this.f9606e = i6;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f9606e) {
            case 0:
                break;
            default:
                InterfaceC2903d.m5104h((InterfaceC2903d) obj, C2762u.f8761f, 0L, 0L, 126);
                break;
        }
        return C0891q.f2780a;
    }
}
