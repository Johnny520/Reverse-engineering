package p240q6;

import java.util.List;
import p136j8.C2104o;
import p256r6.AbstractC3707a;
import p256r6.C3709c;
import p343x6.C5703g;
import tf.C4173t;

/* JADX INFO: renamed from: q6.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3441a extends AbstractC3707a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final List m7222b() {
        C3709c c3709c = this.f12066a;
        if (c3709c == null) {
            C2104o.m5294t("You must provide a configuration to resolve the member use build(configuration).");
            return null;
        }
        List listM10300a = C5703g.m10300a(this, c3709c);
        if (!listM10300a.isEmpty()) {
            return listM10300a;
        }
        C5703g.m10309j(this, c3709c);
        return C4173t.f13710g;
    }
}
