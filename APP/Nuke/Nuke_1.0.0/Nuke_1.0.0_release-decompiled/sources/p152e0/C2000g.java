package p152e0;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000A.C0072l0;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p186k.AbstractC2415L;
import p186k.C2408E;

/* JADX INFO: renamed from: e0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2000g implements InterfaceC1999f {

    /* JADX INFO: renamed from: d */
    public final InterfaceC1601c f6718d;

    /* JADX INFO: renamed from: e */
    public final C2408E f6719e;

    /* JADX INFO: renamed from: f */
    public C2408E f6720f;

    public C2000g(Map map, InterfaceC1601c interfaceC1601c) {
        C2408E c2408e;
        this.f6718d = interfaceC1601c;
        if (map == null || map.isEmpty()) {
            c2408e = null;
        } else {
            c2408e = new C2408E(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c2408e.m4278m(entry.getKey(), entry.getValue());
            }
        }
        this.f6719e = c2408e;
    }

    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: a */
    public final boolean mo1275a(Object obj) {
        return ((Boolean) this.f6718d.mo1h(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo1276b() {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p152e0.C2000g.mo1276b():java.util.Map");
    }

    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: c */
    public final Object mo1277c(String str) {
        C2408E c2408e = this.f6719e;
        List list = c2408e != null ? (List) c2408e.m4276k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c2408e != null) {
            List listSubList = list.subList(1, list.size());
            int iM4271f = c2408e.m4271f(str);
            if (iM4271f < 0) {
                iM4271f = ~iM4271f;
            }
            Object[] objArr = c2408e.f7789c;
            Object obj = objArr[iM4271f];
            c2408e.f7788b[iM4271f] = str;
            objArr[iM4271f] = listSubList;
        }
        return list.get(0);
    }

    @Override // p152e0.InterfaceC1999f
    /* JADX INFO: renamed from: d */
    public final InterfaceC1998e mo1278d(String str, InterfaceC1599a interfaceC1599a) {
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!AbstractC1926h.m3580w(str.charAt(i5))) {
                C2408E c2408e = this.f6720f;
                if (c2408e == null) {
                    long[] jArr = AbstractC2415L.f7816a;
                    c2408e = new C2408E();
                    this.f6720f = c2408e;
                }
                Object objM4272g = c2408e.m4272g(str);
                if (objM4272g == null) {
                    objM4272g = new ArrayList();
                    c2408e.m4278m(str, objM4272g);
                }
                ((List) objM4272g).add(interfaceC1599a);
                return new C0072l0(c2408e, str, interfaceC1599a, 19);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
