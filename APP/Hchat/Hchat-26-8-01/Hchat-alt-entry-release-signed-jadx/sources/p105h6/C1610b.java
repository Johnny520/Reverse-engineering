package p105h6;

import java.io.IOException;
import p208o6.C3066a;

/* JADX INFO: renamed from: h6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1610b extends AbstractC1622n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5286a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        switch (this.f5286a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    C1614f.m4129a(dDoubleValue);
                    c3066a.m6513t(dDoubleValue);
                } else {
                    c3066a.m6508l();
                }
                break;
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    C1614f.m4129a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    c3066a.m6515w(numberValueOf);
                } else {
                    c3066a.m6508l();
                }
                break;
        }
    }
}
