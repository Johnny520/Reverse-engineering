package p151k6;

import java.io.IOException;
import p105h6.AbstractC1622n;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2322v0 extends AbstractC1622n {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            c3066a.m6508l();
            return;
        }
        c3066a.m6517y();
        c3066a.m6500a();
        c3066a.f9915g.write(bool.booleanValue() ? "true" : "false");
    }
}
