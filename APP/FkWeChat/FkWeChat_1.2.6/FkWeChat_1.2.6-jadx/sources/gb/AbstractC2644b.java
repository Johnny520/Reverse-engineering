package gb;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p082fb.InterfaceC2412n;
import p186m9.AbstractC5128i;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6019m;
import p244qb.C6379j;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: gb.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2644b extends AbstractC2699p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2644b(InterfaceC2412n interfaceC2412n) {
        super(interfaceC2412n);
        if (interfaceC2412n == null) {
            m9337I(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void m9337I(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.AbstractC2644b.m9337I(int):void");
    }

    /* JADX INFO: renamed from: J */
    public abstract InterfaceC5995e mo5602u();

    @Override // gb.AbstractC2717v
    /* JADX INFO: renamed from: f */
    public boolean mo9338f(InterfaceC6004h interfaceC6004h) {
        if (interfaceC6004h == null) {
            m9337I(2);
        }
        return (interfaceC6004h instanceof InterfaceC5995e) && m9641c(mo5602u(), interfaceC6004h);
    }

    @Override // gb.AbstractC2699p
    /* JADX INFO: renamed from: q */
    public AbstractC2706r0 mo9339q() {
        if (AbstractC5128i.m20888v0(mo5602u())) {
            return null;
        }
        return mo9341t().m20920i();
    }

    @Override // gb.AbstractC2699p
    /* JADX INFO: renamed from: r */
    public Collection mo9340r(boolean z10) {
        InterfaceC6019m interfaceC6019mMo7443b = mo5602u().mo7443b();
        if (!(interfaceC6019mMo7443b instanceof InterfaceC5995e)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                m9337I(3);
            }
            return list;
        }
        C6379j c6379j = new C6379j();
        InterfaceC5995e interfaceC5995e = (InterfaceC5995e) interfaceC6019mMo7443b;
        c6379j.add(interfaceC5995e.mo7508x());
        InterfaceC5995e interfaceC5995eMo5582Y = interfaceC5995e.mo5582Y();
        if (z10 && interfaceC5995eMo5582Y != null) {
            c6379j.add(interfaceC5995eMo5582Y.mo7508x());
        }
        return c6379j;
    }

    @Override // gb.InterfaceC2716u1
    /* JADX INFO: renamed from: t */
    public AbstractC5128i mo9341t() {
        AbstractC5128i abstractC5128iM35858m = AbstractC9211e.m35858m(mo5602u());
        if (abstractC5128iM35858m == null) {
            m9337I(1);
        }
        return abstractC5128iM35858m;
    }
}
