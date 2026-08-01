package ye;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5081g0;
import p331we.AbstractC9232b;
import p347xe.EnumC9492c;
import p347xe.EnumC9494e;
import p377ze.C10031a;
import p377ze.C10034d;

/* JADX INFO: renamed from: ye.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9797a extends AbstractC9232b {

    /* JADX INFO: renamed from: k */
    public static final a f33082k = new a(null);

    /* JADX INFO: renamed from: a */
    public C10034d f33083a;

    /* JADX INFO: renamed from: b */
    public C10034d f33084b;

    /* JADX INFO: renamed from: c */
    public C10031a f33085c;

    /* JADX INFO: renamed from: d */
    public C9797a f33086d;

    /* JADX INFO: renamed from: e */
    public C9806j f33087e;

    /* JADX INFO: renamed from: f */
    public C9808l f33088f;

    /* JADX INFO: renamed from: g */
    public List f33089g;

    /* JADX INFO: renamed from: h */
    public List f33090h;

    /* JADX INFO: renamed from: i */
    public List f33091i;

    /* JADX INFO: renamed from: j */
    public List f33092j;

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C9797a m38099g(C9797a c9797a, String str, EnumC9494e enumC9494e, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC9494e = EnumC9494e.Equals;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c9797a.m38105e(str, enumC9494e, z10);
    }

    /* JADX INFO: renamed from: h */
    public static final C9797a m38100h() {
        return f33082k.m38115a();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C9797a m38101m(C9797a c9797a, int i10, EnumC9492c enumC9492c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            enumC9492c = EnumC9492c.Contains;
        }
        return c9797a.m38110l(i10, enumC9492c);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ C9797a m38102p(C9797a c9797a, String str, EnumC9494e enumC9494e, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC9494e = EnumC9494e.Equals;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c9797a.m38112o(str, enumC9494e, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    @Override // p331we.AbstractC9232b
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo34279b(p322w5.C9186a r15) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.C9797a.mo34279b(w5.a):int");
    }

    /* JADX INFO: renamed from: c */
    public final C9797a m38103c(String str) {
        str.getClass();
        List arrayList = this.f33089g;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f33089g = arrayList;
        arrayList.add(new C10034d(str, EnumC9494e.Equals, false));
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C9797a m38104d(C9807k c9807k) {
        c9807k.getClass();
        C9808l c9808l = this.f33088f;
        if (c9808l == null) {
            c9808l = new C9808l();
        }
        this.f33088f = c9808l;
        c9808l.m38146c(c9807k);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C9797a m38105e(String str, EnumC9494e enumC9494e, boolean z10) {
        str.getClass();
        enumC9494e.getClass();
        this.f33084b = new C10034d(str, enumC9494e, z10);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C9797a m38106f(C10034d c10034d) {
        c10034d.getClass();
        this.f33084b = c10034d;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C9797a m38107i(C9806j c9806j) {
        c9806j.getClass();
        this.f33087e = c9806j;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C9797a m38108j(C9808l c9808l) {
        c9808l.getClass();
        this.f33088f = c9808l;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C9797a m38109k(int i10) {
        return m38101m(this, i10, null, 2, null);
    }

    /* JADX INFO: renamed from: l */
    public final C9797a m38110l(int i10, EnumC9492c enumC9492c) {
        enumC9492c.getClass();
        this.f33085c = new C10031a(i10, enumC9492c);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final C9797a m38111n(String str) {
        str.getClass();
        return m38102p(this, str, null, false, 6, null);
    }

    /* JADX INFO: renamed from: o */
    public final C9797a m38112o(String str, EnumC9494e enumC9494e, boolean z10) {
        str.getClass();
        enumC9494e.getClass();
        this.f33086d = new C9797a().m38106f(new C10034d(str, enumC9494e, z10));
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final C9797a m38113q(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C10034d(str, EnumC9494e.Equals, false));
        }
        this.f33089g = AbstractC5081g0.m20560a1(arrayList);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final C9797a m38114r(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C10034d(str, null, false, 6, null));
        }
        this.f33089g = AbstractC5081g0.m20560a1(arrayList);
        return this;
    }

    /* JADX INFO: renamed from: ye.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C9797a m38115a() {
            return new C9797a();
        }

        public a() {
        }
    }
}
