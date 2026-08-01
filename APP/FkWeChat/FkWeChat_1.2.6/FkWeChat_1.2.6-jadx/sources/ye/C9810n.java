package ye;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5081g0;
import p331we.AbstractC9232b;
import p377ze.C10032b;

/* JADX INFO: renamed from: ye.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9810n extends AbstractC9232b {

    /* JADX INFO: renamed from: c */
    public static final a f33134c = new a(null);

    /* JADX INFO: renamed from: a */
    public List f33135a;

    /* JADX INFO: renamed from: b */
    public C10032b f33136b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
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
            cf.h0$a r0 = cf.AbstractC1540h0.f4510f
            java.util.List r1 = r5.f33135a
            r2 = 0
            if (r1 == 0) goto L45
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p185m8.AbstractC5116y.m20814z(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.next()
            ye.m r4 = (ye.C9809m) r4
            if (r4 == 0) goto L2c
        L27:
            int r4 = r4.m35950a(r6)
            goto L32
        L2c:
            ye.m r4 = new ye.m
            r4.<init>()
            goto L27
        L32:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L19
        L3a:
            int[] r1 = p185m8.AbstractC5081g0.m20552W0(r3)
            if (r1 == 0) goto L45
            int r1 = r6.m35773r(r1)
            goto L46
        L45:
            r1 = r2
        L46:
            ze.b r3 = r5.f33136b
            if (r3 == 0) goto L4e
            int r2 = r3.m35950a(r6)
        L4e:
            int r0 = r0.m6068c(r6, r1, r2)
            r6.m35776u(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.C9810n.mo34279b(w5.a):int");
    }

    /* JADX INFO: renamed from: c */
    public final C9810n m38149c(C9809m c9809m) {
        List arrayList = this.f33135a;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f33135a = arrayList;
        arrayList.add(c9809m);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C9810n m38150d(int i10) {
        this.f33136b = new C10032b(i10);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C9810n m38151e(Collection collection) {
        collection.getClass();
        this.f33135a = AbstractC5081g0.m20560a1(collection);
        return this;
    }

    /* JADX INFO: renamed from: ye.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
