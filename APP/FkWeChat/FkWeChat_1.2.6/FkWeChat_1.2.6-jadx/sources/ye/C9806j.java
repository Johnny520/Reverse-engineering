package ye;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p331we.AbstractC9232b;
import p347xe.EnumC9492c;
import p347xe.EnumC9494e;
import p377ze.C10032b;

/* JADX INFO: renamed from: ye.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9806j extends AbstractC9232b {

    /* JADX INFO: renamed from: d */
    public static final a f33109d = new a(null);

    /* JADX INFO: renamed from: a */
    public List f33110a;

    /* JADX INFO: renamed from: b */
    public EnumC9492c f33111b = EnumC9492c.Contains;

    /* JADX INFO: renamed from: c */
    public C10032b f33112c;

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C9806j m38127e(C9806j c9806j, String str, EnumC9494e enumC9494e, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            enumC9494e = EnumC9494e.Equals;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c9806j.m38128c(str, enumC9494e, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    @Override // p331we.AbstractC9232b
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo34279b(p322w5.C9186a r6) {
        /*
            r5 = this;
            r6.getClass()
            cf.a0$a r0 = cf.AbstractC1526a0.f4496f
            java.util.List r1 = r5.f33110a
            r2 = 0
            if (r1 == 0) goto L3c
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p185m8.AbstractC5116y.m20814z(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r1.next()
            ye.a r4 = (ye.C9797a) r4
            int r4 = r4.m35950a(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L19
        L31:
            int[] r1 = p185m8.AbstractC5081g0.m20552W0(r3)
            if (r1 == 0) goto L3c
            int r1 = r6.m35773r(r1)
            goto L3d
        L3c:
            r1 = r2
        L3d:
            xe.c r3 = r5.f33111b
            byte r3 = r3.m36988c()
            ze.b r4 = r5.f33112c
            if (r4 == 0) goto L4b
            int r2 = r4.m35950a(r6)
        L4b:
            int r0 = r0.m5955d(r6, r1, r3, r2)
            r6.m35776u(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.C9806j.mo34279b(w5.a):int");
    }

    /* JADX INFO: renamed from: c */
    public final C9806j m38128c(String str, EnumC9494e enumC9494e, boolean z10) {
        str.getClass();
        enumC9494e.getClass();
        C9797a c9797a = new C9797a();
        c9797a.m38105e(str, enumC9494e, z10);
        m38129d(c9797a);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C9806j m38129d(C9797a c9797a) {
        c9797a.getClass();
        List arrayList = this.f33110a;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f33110a = arrayList;
        arrayList.add(c9797a);
        return this;
    }

    /* JADX INFO: renamed from: ye.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
