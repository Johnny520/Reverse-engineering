package p260x;

import java.util.List;
import p041H0.EnumC0556D0;
import p041H0.InterfaceC0558E0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p152e0.InterfaceC1999f;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: x.M */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3407M implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10653d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f10654e;

    public /* synthetic */ C3407M(int i5, Object obj) {
        this.f10653d = i5;
        this.f10654e = obj;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f10653d) {
            case 0:
                InterfaceC1999f interfaceC1999f = (InterfaceC1999f) this.f10654e;
                return Boolean.valueOf(interfaceC1999f != null ? interfaceC1999f.mo1275a(obj) : true);
            default:
                C1675t c1675t = (C1675t) this.f10654e;
                InterfaceC0558E0 interfaceC0558E0 = (InterfaceC0558E0) obj;
                AbstractC1665j.m2983c(interfaceC0558E0, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                C3399E c3399e = ((C3417X) interfaceC0558E0).f10685r;
                List listM4178A = (List) c1675t.f5710e;
                if (listM4178A != null) {
                    listM4178A.add(c3399e);
                } else {
                    listM4178A = AbstractC2352g.m4178A(c3399e);
                }
                c1675t.f5710e = listM4178A;
                return EnumC0556D0.f1669e;
        }
    }
}
