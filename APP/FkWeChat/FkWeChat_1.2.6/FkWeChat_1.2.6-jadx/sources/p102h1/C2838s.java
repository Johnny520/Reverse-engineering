package p102h1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p102h1.InterfaceC2837r;
import p117i.AbstractC3044c1;
import p117i.C3082r0;
import p376zd.C9987e;

/* JADX INFO: renamed from: h1.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2838s implements InterfaceC2837r {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0184l f7395q;

    /* JADX INFO: renamed from: r */
    public final C3082r0 f7396r;

    /* JADX INFO: renamed from: s */
    public C3082r0 f7397s;

    /* JADX INFO: renamed from: h1.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2837r.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3082r0 f7398a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f7399b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0173a f7400c;

        public a(C3082r0 c3082r0, String str, InterfaceC0173a interfaceC0173a) {
            this.f7398a = c3082r0;
            this.f7399b = str;
            this.f7400c = interfaceC0173a;
        }

        @Override // p102h1.InterfaceC2837r.a
        /* JADX INFO: renamed from: a */
        public void mo10077a() {
            List list = (List) this.f7398a.m11526u(this.f7399b);
            if (list != null) {
                list.remove(this.f7400c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            this.f7398a.m11529x(this.f7399b, list);
        }
    }

    public C2838s(Map map, InterfaceC0184l interfaceC0184l) {
        this.f7395q = interfaceC0184l;
        this.f7396r = (map == null || map.isEmpty()) ? null : AbstractC2840u.m10084g(map);
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: a */
    public boolean mo1346a(Object obj) {
        return ((Boolean) this.f7395q.mo27m(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map mo1347b() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p102h1.C2838s.mo1347b():java.util.Map");
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: c */
    public Object mo1348c(String str) {
        C3082r0 c3082r0;
        C3082r0 c3082r02 = this.f7396r;
        List list = c3082r02 != null ? (List) c3082r02.m11526u(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (c3082r0 = this.f7396r) != null) {
        }
        return list.get(0);
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: d */
    public InterfaceC2837r.a mo1349d(String str, InterfaceC0173a interfaceC0173a) {
        if (AbstractC2840u.m10082e(str)) {
            C9987e.m38645a("Registered key is empty or blank");
            return null;
        }
        C3082r0 c3082r0M11262b = this.f7397s;
        if (c3082r0M11262b == null) {
            c3082r0M11262b = AbstractC3044c1.m11262b();
            this.f7397s = c3082r0M11262b;
        }
        Object objM11238e = c3082r0M11262b.m11238e(str);
        if (objM11238e == null) {
            objM11238e = new ArrayList();
            c3082r0M11262b.m11529x(str, objM11238e);
        }
        ((List) objM11238e).add(interfaceC0173a);
        return new a(c3082r0M11262b, str, interfaceC0173a);
    }
}
