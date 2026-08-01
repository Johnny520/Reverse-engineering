package p087;

import androidx.activity.AbstractC0053;
import kotlin.time.AbstractC5159;
import kotlin.time.C5156;
import kotlin.time.DurationUnit;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7191;
import p091.InterfaceC7190;
import p305.C8631;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7109 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7109 f19045 = new C7109();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7124 f19044 = new C7124("kotlin.time.Duration", C7191.f19191);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        C8631 c8631 = C5156.f14712;
        String strMo6867 = interfaceC7186.mo6867();
        strMo6867.getClass();
        try {
            long jM10194 = AbstractC5159.m10194(strMo6867);
            if (jM10194 == C5156.f14710) {
                throw new IllegalStateException("invariant failed");
            }
            return new C5156(jM10194);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC0053.m156("Invalid ISO duration string format: '", strMo6867, "'."), e);
        }
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19044;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        long j = ((C5156) obj).f14714;
        C8631 c8631 = C5156.f14712;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append(SignatureVisitor.SUPER);
        }
        sb.append("PT");
        long jM10189 = j < 0 ? C5156.m10189(j) : j;
        long jM10192 = C5156.m10192(jM10189, DurationUnit.HOURS);
        boolean z = false;
        int iM10192 = C5156.m10183(jM10189) ? 0 : (int) (C5156.m10192(jM10189, DurationUnit.MINUTES) % 60);
        int iM101922 = C5156.m10183(jM10189) ? 0 : (int) (C5156.m10192(jM10189, DurationUnit.SECONDS) % 60);
        int iM10184 = C5156.m10184(jM10189);
        if (C5156.m10183(j)) {
            jM10192 = 9999999999999L;
        }
        boolean z2 = jM10192 != 0;
        boolean z3 = (iM101922 == 0 && iM10184 == 0) ? false : true;
        if (iM10192 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM10192);
            sb.append('H');
        }
        if (z) {
            sb.append(iM10192);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C5156.m10187(sb, iM101922, iM10184, 9, "S", true);
        }
        interfaceC7185.mo6813(sb.toString());
    }
}
