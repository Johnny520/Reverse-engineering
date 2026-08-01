package p008B1;

import com.bumptech.glide.AbstractC1923e;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p002A1.InterfaceC0145r;
import p018D.InterfaceC0258g;
import p028F.AbstractC0355p;
import p040H.InterfaceC0546d;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p058L.InterfaceC0940l;
import p095T.AbstractC1384r0;
import p095T.AbstractC1385s;
import p095T.InterfaceC1373m;
import p108V3.AbstractC1543P;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p136b0.C1843e;
import p152e0.C1997d;
import p169h0.InterfaceC2195d;
import p169h0.InterfaceC2207p;
import p221q.AbstractC2899g;
import p221q.C2895c;
import p255w.C3377h;
import p260x.AbstractC3429l;
import p260x.C3408N;

/* JADX INFO: renamed from: B1.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0214b implements InterfaceC1603e {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f751d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f752e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f753f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f754g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f755h;

    public /* synthetic */ C0214b(InterfaceC2207p interfaceC2207p, C2895c c2895c, InterfaceC1601c interfaceC1601c, int i5, int i6) {
        this.f751d = 7;
        this.f753f = interfaceC2207p;
        this.f754g = c2895c;
        this.f755h = interfaceC1601c;
        this.f752e = i6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f751d) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC0797o.m1379c((InterfaceC0145r) this.f753f, (C0218f) this.f754g, (InterfaceC1601c) this.f755h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f752e | 1));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Integer) obj2).intValue();
                AbstractC0355p.m565c((InterfaceC0258g) this.f753f, (InterfaceC0546d) this.f754g, (InterfaceC1599a) this.f755h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f752e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1923e.m3464b((InterfaceC2207p) this.f753f, (AbstractC1384r0) this.f754g, (C1843e) this.f755h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f752e | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1923e.m3463a((InterfaceC0940l) this.f753f, (InterfaceC2195d) this.f754g, (C1843e) this.f755h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f752e | 1));
                break;
            case 4:
                List list = (List) this.f753f;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f755h;
                String str = (String) this.f754g;
                ((Integer) obj2).getClass();
                AbstractC1543P.m2836u(AbstractC1385s.m2609A(this.f752e | 1), (InterfaceC1373m) obj, interfaceC1601c, str, list);
                break;
            case 5:
                ((Integer) obj2).intValue();
                int iM2609A = AbstractC1385s.m2609A(this.f752e) | 1;
                ((C1843e) this.f753f).m3304k(this.f754g, this.f755h, (InterfaceC1373m) obj, iM2609A);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iM2609A2 = AbstractC1385s.m2609A(this.f752e | 1);
                ((C1997d) this.f753f).mo3667e(this.f754g, (C1843e) this.f755h, (InterfaceC1373m) obj, iM2609A2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC2899g.m5094b((InterfaceC2207p) this.f753f, (C2895c) this.f754g, (InterfaceC1601c) this.f755h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(1), this.f752e);
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC2899g.m5093a((C2895c) this.f753f, (InterfaceC2207p) this.f754g, (C1843e) this.f755h, (InterfaceC1373m) obj, AbstractC1385s.m2609A(this.f752e | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iM2609A3 = AbstractC1385s.m2609A(1);
                AbstractC3429l.m5691d((C3377h) this.f753f, this.f754g, this.f752e, this.f755h, (InterfaceC1373m) obj, iM2609A3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM2609A4 = AbstractC1385s.m2609A(this.f752e | 1);
                ((C3408N) this.f753f).mo3667e(this.f754g, (C1843e) this.f755h, (InterfaceC1373m) obj, iM2609A4);
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0214b(Object obj, Object obj2, Object obj3, int i5, int i6) {
        this.f751d = i6;
        this.f753f = obj;
        this.f754g = obj2;
        this.f755h = obj3;
        this.f752e = i5;
    }

    public /* synthetic */ C0214b(String str, List list, InterfaceC1601c interfaceC1601c, int i5) {
        this.f751d = 4;
        this.f753f = list;
        this.f755h = interfaceC1601c;
        this.f754g = str;
        this.f752e = i5;
    }

    public /* synthetic */ C0214b(C3377h c3377h, Object obj, int i5, Object obj2, int i6) {
        this.f751d = 9;
        this.f753f = c3377h;
        this.f754g = obj;
        this.f752e = i5;
        this.f755h = obj2;
    }
}
