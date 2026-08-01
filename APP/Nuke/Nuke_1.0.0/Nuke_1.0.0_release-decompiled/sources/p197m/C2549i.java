package p197m;

import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p153e1.C2016l;
import p203n.AbstractC2649d;

/* JADX INFO: renamed from: m.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2549i extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public static final C2549i f8149f;

    /* JADX INFO: renamed from: g */
    public static final C2549i f8150g;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8151e;

    static {
        int i5 = 2;
        f8149f = new C2549i(i5, 0);
        f8150g = new C2549i(i5, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2549i(int i5, int i6) {
        super(i5);
        this.f8151e = i6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f8151e) {
            case 0:
                long j5 = ((C2016l) obj).f6741a;
                long j6 = ((C2016l) obj2).f6741a;
                long j7 = 1;
                return AbstractC2649d.m4617j(0.0f, 400.0f, new C2016l((j7 & 4294967295L) | (j7 << 32)), 1);
            default:
                EnumC2517B enumC2517B = (EnumC2517B) obj2;
                return Boolean.valueOf(((EnumC2517B) obj) == enumC2517B && enumC2517B == EnumC2517B.f8041f);
        }
    }
}
