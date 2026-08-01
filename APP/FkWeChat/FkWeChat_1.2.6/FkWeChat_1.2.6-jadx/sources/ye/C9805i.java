package ye;

import java.util.List;
import p024b9.AbstractC1043k;
import p331we.AbstractC9232b;
import p347xe.EnumC9492c;
import p347xe.EnumC9494e;
import p377ze.C10031a;
import p377ze.C10034d;

/* JADX INFO: renamed from: ye.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9805i extends AbstractC9232b {

    /* JADX INFO: renamed from: j */
    public static final a f33099j = new a(null);

    /* JADX INFO: renamed from: a */
    public C10034d f33100a;

    /* JADX INFO: renamed from: b */
    public C10031a f33101b;

    /* JADX INFO: renamed from: c */
    public C9797a f33102c;

    /* JADX INFO: renamed from: d */
    public C9797a f33103d;

    /* JADX INFO: renamed from: e */
    public C9808l f33104e;

    /* JADX INFO: renamed from: f */
    public C9808l f33105f;

    /* JADX INFO: renamed from: g */
    public List f33106g;

    /* JADX INFO: renamed from: h */
    public List f33107h;

    /* JADX INFO: renamed from: i */
    public List f33108i;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C9805i m38116d(C9805i c9805i, String str, EnumC9494e enumC9494e, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC9494e = EnumC9494e.Equals;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c9805i.m38120c(str, enumC9494e, z10);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C9805i m38117g(C9805i c9805i, int i10, EnumC9492c enumC9492c, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            enumC9492c = EnumC9492c.Contains;
        }
        return c9805i.m38122f(i10, enumC9492c);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ C9805i m38118i(C9805i c9805i, String str, EnumC9494e enumC9494e, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC9494e = EnumC9494e.Equals;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c9805i.m38123h(str, enumC9494e, z10);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C9805i m38119l(C9805i c9805i, String str, EnumC9494e enumC9494e, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC9494e = EnumC9494e.Equals;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c9805i.m38124j(str, enumC9494e, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    @Override // p331we.AbstractC9232b
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo34279b(p322w5.C9186a r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.C9805i.mo34279b(w5.a):int");
    }

    /* JADX INFO: renamed from: c */
    public final C9805i m38120c(String str, EnumC9494e enumC9494e, boolean z10) {
        str.getClass();
        enumC9494e.getClass();
        this.f33102c = new C9797a().m38105e(str, enumC9494e, z10);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C9805i m38121e(int i10) {
        return m38117g(this, i10, null, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final C9805i m38122f(int i10, EnumC9492c enumC9492c) {
        enumC9492c.getClass();
        this.f33101b = new C10031a(i10, enumC9492c);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C9805i m38123h(String str, EnumC9494e enumC9494e, boolean z10) {
        str.getClass();
        enumC9494e.getClass();
        this.f33100a = new C10034d(str, enumC9494e, z10);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C9805i m38124j(String str, EnumC9494e enumC9494e, boolean z10) {
        str.getClass();
        enumC9494e.getClass();
        this.f33103d = new C9797a().m38105e(str, enumC9494e, z10);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C9805i m38125k(C9797a c9797a) {
        c9797a.getClass();
        this.f33103d = c9797a;
        return this;
    }

    /* JADX INFO: renamed from: ye.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C9805i m38126a() {
            return new C9805i();
        }

        public a() {
        }
    }
}
