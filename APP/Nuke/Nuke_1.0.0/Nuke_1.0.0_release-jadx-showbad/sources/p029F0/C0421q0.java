package p029F0;

import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: F0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0421q0 extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1264e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0414n[] f1265f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0421q0(C0414n[] c0414nArr, int i5) {
        super(2);
        this.f1264e = i5;
        this.f1265f = c0414nArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f1264e) {
            case 0:
                return Float.valueOf(AbstractC0435z.m689b((AbstractC0389a0) obj, true, this.f1265f, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC0435z.m689b((AbstractC0389a0) obj, false, this.f1265f, ((Number) obj2).floatValue()));
        }
    }
}
