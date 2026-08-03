package p240q6;

import java.util.List;
import java.util.Map;
import p117i0.C1872q0;
import p136j8.C2104o;
import p256r6.AbstractC3707a;
import p256r6.C3709c;
import p276sf.C3958e;
import p343x6.C5703g;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: q6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3443c extends AbstractC3707a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p256r6.AbstractC3707a, p256r6.AbstractC3710d
    /* JADX INFO: renamed from: a */
    public final Map mo7223a() {
        return AbstractC4178y.m8440c0(super.mo7223a(), AbstractC4178y.m8439b0(new C3958e("returnType", null), new C3958e("returnTypeCondition", null), new C3958e("genericReturnType", null), new C3958e("genericReturnTypeCondition", null), new C3958e("isBridge", null), new C3958e("isBridgeNot", null), new C3958e("isDefault", null), new C3958e("isDefaultNot", null), new C3958e("defaultValue", null), new C3958e("defaultValueCondition", null)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final List m7225b() {
        C3709c c3709c = this.f12066a;
        if (c3709c != null) {
            return C5703g.m10308i(this, c3709c, c3709c.f12064a, new C1872q0(this, 6, c3709c));
        }
        C2104o.m5294t("You must provide a configuration to resolve the member use build(configuration).");
        return null;
    }
}
