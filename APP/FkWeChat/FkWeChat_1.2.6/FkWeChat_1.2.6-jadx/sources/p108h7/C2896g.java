package p108h7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p108h7.InterfaceC2891b;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p185m8.AbstractC5101q0;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: h7.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2896g implements InterfaceC2891b {

    /* JADX INFO: renamed from: a */
    public final Map f7644a;

    /* JADX INFO: renamed from: b */
    public final String f7645b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4705l f7646c;

    public C2896g(Map map, String str) {
        map.getClass();
        str.getClass();
        this.f7644a = map;
        this.f7645b = str;
        this.f7646c = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: h7.f
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C2896g.m10544a(this.f7643q);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2891b.a m10544a(C2896g c2896g) {
        return c2896g.f7644a.containsKey(c2896g.f7645b) ? InterfaceC2891b.a.f7635r : c2896g.f7644a.containsKey(AbstractC2894e.m10543d(c2896g.f7645b, "size")) ? InterfaceC2891b.a.f7636s : AbstractC2897h.m10545a(c2896g.f7644a, c2896g.f7645b) ? InterfaceC2891b.a.f7637t : InterfaceC2891b.a.f7634q;
    }

    @Override // p108h7.InterfaceC2891b
    /* JADX INFO: renamed from: b */
    public List mo10538b() throws C2892c {
        String str = (String) this.f7644a.get(AbstractC2894e.m10543d(this.f7645b, "size"));
        if (str == null) {
            throw new C2892c("Property " + this.f7645b + ".size not found.");
        }
        C2363j c2363jM8592s = AbstractC2368o.m8592s(0, Integer.parseInt(str));
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(c2363jM8592s, 10));
        Iterator it = c2363jM8592s.iterator();
        while (it.hasNext()) {
            Object obj = this.f7644a.get(AbstractC2894e.m10542c(this.f7645b, ((AbstractC5101q0) it).nextInt()));
            obj.getClass();
            arrayList.add((String) obj);
        }
        return arrayList;
    }

    @Override // p108h7.InterfaceC2891b
    public String getString() {
        Object obj = this.f7644a.get(this.f7645b);
        obj.getClass();
        return (String) obj;
    }
}
