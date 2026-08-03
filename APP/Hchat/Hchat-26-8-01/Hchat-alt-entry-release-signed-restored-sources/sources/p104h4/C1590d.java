package p104h4;

import bsh.C0353j;
import p136j8.C2104o;
import p311v4.AbstractC4457f0;
import p311v4.C4451c0;
import p311v4.C4462k;
import p311v4.C4465n;
import p311v4.C4466o;
import p311v4.C4473v;

/* JADX INFO: renamed from: h4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1590d extends AbstractC1605s {

    /* JADX INFO: renamed from: b */
    public final AbstractC4457f0 f5261b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1590d(AbstractC4457f0 abstractC4457f0) {
        super("ConstantValue");
        if ((abstractC4457f0 instanceof C4451c0) || (abstractC4457f0 instanceof C4466o) || (abstractC4457f0 instanceof C4473v) || (abstractC4457f0 instanceof C4465n) || (abstractC4457f0 instanceof C4462k)) {
            this.f5261b = abstractC4457f0;
        } else {
            if (abstractC4457f0 == null) {
                C0353j.m1305c("constantValue == null");
                throw null;
            }
            C2104o.m5294t("bad type for constantValue");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p104h4.AbstractC1605s
    /* JADX INFO: renamed from: a */
    public final int mo4124a() {
        return 8;
    }
}
