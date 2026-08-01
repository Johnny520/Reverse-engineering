package ec;

import java.util.Collection;
import p185m8.AbstractC5114x;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: ec.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2128f {

    /* JADX INFO: renamed from: ec.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f5954q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f5955r;

        /* JADX INFO: renamed from: s */
        public int f5956s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f5955r = obj;
            this.f5956s |= Integer.MIN_VALUE;
            return AbstractC2128f.m7750b(null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m7749a(Collection collection, InterfaceC5976f interfaceC5976f) {
        return collection.isEmpty() ? AbstractC5114x.m20800o() : new C2124e((InterfaceC2193v0[]) collection.toArray(new InterfaceC2193v0[0])).m7741c(interfaceC5976f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7750b(java.util.Collection r4, p228p8.InterfaceC5976f r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof ec.AbstractC2128f.a
            if (r0 == 0) goto L13
            r0 = r5
            ec.f$a r0 = (ec.AbstractC2128f.a) r0
            int r1 = r0.f5956s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5956s = r1
            goto L18
        L13:
            ec.f$a r0 = new ec.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f5955r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f5956s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f5954q
            java.util.Iterator r4 = (java.util.Iterator) r4
            p172l8.AbstractC4713t.m18808b(r5)
            goto L3d
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r4)
            r4 = 0
            return r4
        L34:
            p172l8.AbstractC4713t.m18808b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r4.next()
            ec.w1 r5 = (ec.InterfaceC2198w1) r5
            r0.f5954q = r4
            r0.f5956s = r3
            java.lang.Object r5 = r5.mo7657J0(r0)
            if (r5 != r1) goto L3d
            return r1
        L54:
            l8.i0 r4 = p172l8.C4700i0.f13910a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.AbstractC2128f.m7750b(java.util.Collection, p8.f):java.lang.Object");
    }
}
