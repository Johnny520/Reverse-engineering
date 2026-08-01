package p210o7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5109u0;
import p281t6.AbstractC8150i;
import p311v7.C8852a;

/* JADX INFO: renamed from: o7.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5659k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5652d f17786a;

    /* JADX INFO: renamed from: b */
    public final C8852a f17787b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4705l f17788c;

    public C5659k(InterfaceC5652d interfaceC5652d) {
        interfaceC5652d.getClass();
        this.f17786a = interfaceC5652d;
        this.f17787b = new C8852a(0, 1, null);
        this.f17788c = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: o7.j
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C5659k.m22864a(this.f17785q);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static Map m22864a(C5659k c5659k) {
        return c5659k.m22865b();
    }

    /* JADX INFO: renamed from: b */
    public Map m22865b() {
        List listMo7359d = this.f17786a.mo12244g().mo7359d("Cookie");
        if (listMo7359d == null) {
            return AbstractC5109u0.m20768i();
        }
        HashMap map = new HashMap(listMo7359d.size());
        Iterator it = listMo7359d.iterator();
        while (it.hasNext()) {
            map.putAll(AbstractC8150i.m31626e((String) it.next(), false, 2, null));
        }
        return map;
    }
}
