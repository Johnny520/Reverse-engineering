package p103;

import androidx.activity.AbstractC0900;
import kotlin.time.AbstractC5992;
import kotlin.time.C5989;
import kotlin.time.DurationUnit;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8021;
import p107.InterfaceC8020;
import p321.C9452;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7939 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7939 f19385 = new C7939();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7954 f19384 = new C7954("kotlin.time.Duration", C8021.f19529);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        C9452 c9452 = C5989.f15057;
        String strMo11221 = interfaceC8016.mo11221();
        strMo11221.getClass();
        try {
            long jM10757 = AbstractC5992.m10757(strMo11221);
            if (jM10757 == C5989.f15055) {
                throw new IllegalStateException("invariant failed");
            }
            return new C5989(jM10757);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(AbstractC0900.m718("Invalid ISO duration string format: '", strMo11221, "'."), e);
        }
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19384;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        long j = ((C5989) obj).f15059;
        C9452 c9452 = C5989.f15057;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append(SignatureVisitor.SUPER);
        }
        sb.append("PT");
        long jM10752 = j < 0 ? C5989.m10752(j) : j;
        long jM10755 = C5989.m10755(jM10752, DurationUnit.HOURS);
        boolean z = false;
        int iM10755 = C5989.m10746(jM10752) ? 0 : (int) (C5989.m10755(jM10752, DurationUnit.MINUTES) % 60);
        int iM107552 = C5989.m10746(jM10752) ? 0 : (int) (C5989.m10755(jM10752, DurationUnit.SECONDS) % 60);
        int iM10747 = C5989.m10747(jM10752);
        if (C5989.m10746(j)) {
            jM10755 = 9999999999999L;
        }
        boolean z2 = jM10755 != 0;
        boolean z3 = (iM107552 == 0 && iM10747 == 0) ? false : true;
        if (iM10755 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM10755);
            sb.append('H');
        }
        if (z) {
            sb.append(iM10755);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            C5989.m10750(sb, iM107552, iM10747, 9, "S", true);
        }
        interfaceC8015.mo11208(sb.toString());
    }
}
