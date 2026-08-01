package p377ze;

import cf.AbstractC1525a;
import p024b9.AbstractC1043k;
import p172l8.C4684a0;
import p322w5.C9186a;
import p331we.AbstractC9232b;
import p347xe.EnumC9492c;
import p376zd.C9987e;

/* JADX INFO: renamed from: ze.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10031a extends AbstractC9232b {

    /* JADX INFO: renamed from: c */
    public static final a f33648c = new a(null);

    /* JADX INFO: renamed from: a */
    public int f33649a;

    /* JADX INFO: renamed from: b */
    public EnumC9492c f33650b;

    public C10031a(int i10, EnumC9492c enumC9492c) {
        enumC9492c.getClass();
        EnumC9492c enumC9492c2 = EnumC9492c.Contains;
        this.f33649a = i10;
        this.f33650b = enumC9492c;
    }

    @Override // p331we.AbstractC9232b
    /* JADX INFO: renamed from: b */
    public int mo34279b(C9186a c9186a) {
        c9186a.getClass();
        int i10 = this.f33649a;
        if (i10 == 0) {
            C9987e.m38645a("modifiers must not be 0");
            return 0;
        }
        int iM5950c = AbstractC1525a.f4495f.m5950c(c9186a, C4684a0.m18703c(i10), this.f33650b.m36988c());
        c9186a.m35776u(iM5950c);
        return iM5950c;
    }

    /* JADX INFO: renamed from: ze.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
