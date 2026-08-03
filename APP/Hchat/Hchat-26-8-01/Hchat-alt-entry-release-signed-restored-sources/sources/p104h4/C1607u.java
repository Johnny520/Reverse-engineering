package p104h4;

import p295u4.AbstractC4259i;
import p376z4.AbstractC6091e;

/* JADX INFO: renamed from: h4.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1607u extends AbstractC6091e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public AbstractC1605s m4125o(String str) {
        int length = this.f24601h.length;
        for (int i9 = 0; i9 < length; i9++) {
            AbstractC1605s abstractC1605s = (AbstractC1605s) m10840l(i9);
            if (abstractC1605s.f5275a.equals(str)) {
                return abstractC1605s;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public AbstractC4259i m4126p() {
        return (AbstractC4259i) m10840l(this.f24601h.length - 1);
    }
}
