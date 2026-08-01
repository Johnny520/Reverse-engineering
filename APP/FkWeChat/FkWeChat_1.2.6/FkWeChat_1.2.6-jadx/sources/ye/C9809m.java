package ye;

import cf.AbstractC1536f0;
import p024b9.AbstractC1043k;
import p322w5.C9186a;
import p331we.AbstractC9232b;
import p347xe.EnumC9494e;

/* JADX INFO: renamed from: ye.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9809m extends AbstractC9232b {

    /* JADX INFO: renamed from: b */
    public static final a f33132b = new a(null);

    /* JADX INFO: renamed from: a */
    public C9797a f33133a;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C9809m m38147d(C9809m c9809m, String str, EnumC9494e enumC9494e, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC9494e = EnumC9494e.Equals;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c9809m.m38148c(str, enumC9494e, z10);
    }

    @Override // p331we.AbstractC9232b
    /* JADX INFO: renamed from: b */
    public int mo34279b(C9186a c9186a) {
        c9186a.getClass();
        AbstractC1536f0.a aVar = AbstractC1536f0.f4506f;
        C9797a c9797a = this.f33133a;
        int iM6029c = aVar.m6029c(c9186a, 0, c9797a != null ? c9797a.m35950a(c9186a) : 0);
        c9186a.m35776u(iM6029c);
        return iM6029c;
    }

    /* JADX INFO: renamed from: c */
    public final C9809m m38148c(String str, EnumC9494e enumC9494e, boolean z10) {
        str.getClass();
        enumC9494e.getClass();
        this.f33133a = new C9797a().m38105e(str, enumC9494e, z10);
        return this;
    }

    /* JADX INFO: renamed from: ye.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
