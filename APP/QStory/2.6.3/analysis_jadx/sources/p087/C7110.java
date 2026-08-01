package p087;

import androidx.activity.AbstractC0053;
import kotlin.time.AbstractC5160;
import kotlin.time.C5157;
import kotlin.time.DurationUnit;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7192;
import p091.InterfaceC7191;
import p305.C8623;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7110 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7110 f19040 = new C7110();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7125 f19039 = new C7125("kotlin.time.Duration", C7192.f19184);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        C8623 c8623 = C5157.f14712;
        String strMo10662 = interfaceC7187.mo10662();
        strMo10662.getClass();
        try {
            long jM10198 = AbstractC5160.m10198(strMo10662);
            if (jM10198 == C5157.f14710) {
                throw new IllegalStateException("invariant failed");
            }
            return new C5157(jM10198);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC0053.m158("Invalid ISO duration string format: '", strMo10662, "'."), e);
        }
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f19039;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        long j = ((C5157) obj).f14714;
        C8623 c8623 = C5157.f14712;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append(SignatureVisitor.SUPER);
        }
        sb.append("PT");
        long jM10193 = j < 0 ? C5157.m10193(j) : j;
        long jM10196 = C5157.m10196(jM10193, DurationUnit.HOURS);
        boolean z = false;
        int iM10196 = C5157.m10187(jM10193) ? 0 : (int) (C5157.m10196(jM10193, DurationUnit.MINUTES) % 60);
        int iM101962 = C5157.m10187(jM10193) ? 0 : (int) (C5157.m10196(jM10193, DurationUnit.SECONDS) % 60);
        int iM10188 = C5157.m10188(jM10193);
        if (C5157.m10187(j)) {
            jM10196 = 9999999999999L;
        }
        boolean z2 = jM10196 != 0;
        boolean z3 = (iM101962 == 0 && iM10188 == 0) ? false : true;
        if (iM10196 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM10196);
            sb.append('H');
        }
        if (z) {
            sb.append(iM10196);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C5157.m10191(sb, iM101962, iM10188, 9, "S", true);
        }
        interfaceC7186.mo10649(sb.toString());
    }
}
