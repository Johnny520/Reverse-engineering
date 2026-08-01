package p008B1;

import me.dartcv.nuke.BuildConfig;
import p002A1.InterfaceC0145r;
import p040H.C0544b;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p056K2.InterfaceC0877c;
import p076P.AbstractC1096i;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p169h0.InterfaceC2207p;
import p176i1.C2307w;

/* JADX INFO: renamed from: B1.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0213a implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f745d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f746e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f747f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f748g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f749h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f750i;

    public /* synthetic */ C0213a(C1843e c1843e, C0544b c0544b, Object obj, Object obj2, int i5) {
        this.f745d = 2;
        this.f747f = c1843e;
        this.f749h = c0544b;
        this.f748g = obj;
        this.f750i = obj2;
        this.f746e = i5;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f745d) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0797o.m1378b((Boolean) this.f747f, this.f748g, (InterfaceC0145r) this.f749h, (InterfaceC1601c) this.f750i, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f746e | 1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Integer) obj2).getClass();
                AbstractC1096i.m2152d((InterfaceC1599a) this.f747f, (InterfaceC2207p) this.f748g, (C2307w) this.f749h, (C1843e) this.f750i, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f746e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((C1843e) this.f747f).m3301d((C0544b) this.f749h, this.f748g, this.f750i, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f746e) | 1);
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0213a(Object obj, Object obj2, Object obj3, InterfaceC0877c interfaceC0877c, int i5, int i6) {
        this.f745d = i6;
        this.f747f = obj;
        this.f748g = obj2;
        this.f749h = obj3;
        this.f750i = interfaceC0877c;
        this.f746e = i5;
    }
}
