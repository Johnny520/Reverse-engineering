package ye;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p331we.AbstractC9232b;
import p347xe.EnumC9492c;
import p377ze.C10032b;

/* JADX INFO: renamed from: ye.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9808l extends AbstractC9232b {

    /* JADX INFO: renamed from: d */
    public static final a f33128d = new a(null);

    /* JADX INFO: renamed from: a */
    public List f33129a;

    /* JADX INFO: renamed from: b */
    public EnumC9492c f33130b = EnumC9492c.Contains;

    /* JADX INFO: renamed from: c */
    public C10032b f33131c;

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
            cf.e0$a r0 = cf.AbstractC1534e0.f4504f
            java.util.List r1 = r5.f33129a
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
            ye.k r4 = (ye.C9807k) r4
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
            xe.c r3 = r5.f33130b
            byte r3 = r3.m36988c()
            ze.b r4 = r5.f33131c
            if (r4 == 0) goto L4b
            int r2 = r4.m35950a(r6)
        L4b:
            int r0 = r0.m6018d(r6, r1, r3, r2)
            r6.m35776u(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.C9808l.mo34279b(w5.a):int");
    }

    /* JADX INFO: renamed from: c */
    public final C9808l m38146c(C9807k c9807k) {
        c9807k.getClass();
        List arrayList = this.f33129a;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f33129a = arrayList;
        arrayList.add(c9807k);
        return this;
    }

    /* JADX INFO: renamed from: ye.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
