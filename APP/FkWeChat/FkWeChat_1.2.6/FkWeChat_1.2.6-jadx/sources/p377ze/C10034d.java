package p377ze;

import cf.AbstractC1542i0;
import p024b9.AbstractC1043k;
import p322w5.C9186a;
import p331we.AbstractC9232b;
import p347xe.EnumC9494e;
import p376zd.C9987e;

/* JADX INFO: renamed from: ze.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10034d extends AbstractC9232b {

    /* JADX INFO: renamed from: d */
    public static final a f33657d = new a(null);

    /* JADX INFO: renamed from: a */
    public String f33658a;

    /* JADX INFO: renamed from: b */
    public EnumC9494e f33659b;

    /* JADX INFO: renamed from: c */
    public boolean f33660c;

    public C10034d(String str, EnumC9494e enumC9494e, boolean z10) {
        str.getClass();
        enumC9494e.getClass();
        EnumC9494e enumC9494e2 = EnumC9494e.Contains;
        this.f33658a = str;
        this.f33659b = enumC9494e;
        this.f33660c = z10;
    }

    @Override // p331we.AbstractC9232b
    /* JADX INFO: renamed from: b */
    public int mo34279b(C9186a c9186a) {
        c9186a.getClass();
        String str = this.f33658a;
        if (str == null) {
            C9987e.m38645a("value must be specified");
            return 0;
        }
        str.getClass();
        if (str.length() == 0) {
            EnumC9494e enumC9494e = this.f33659b;
            EnumC9494e enumC9494e2 = EnumC9494e.Equals;
            if (enumC9494e != enumC9494e2) {
                this.f33659b = enumC9494e2;
            }
        }
        AbstractC1542i0.a aVar = AbstractC1542i0.f4512f;
        String str2 = this.f33658a;
        str2.getClass();
        int iM6080d = aVar.m6080d(c9186a, c9186a.m35772q(str2), this.f33659b.m36992c(), this.f33660c);
        c9186a.m35776u(iM6080d);
        return iM6080d;
    }

    /* JADX INFO: renamed from: ze.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C10034d(String str, EnumC9494e enumC9494e, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(str, (i10 & 2) != 0 ? EnumC9494e.Contains : enumC9494e, (i10 & 4) != 0 ? false : z10);
    }
}
