package p087;

import androidx.activity.compose.C0004;
import java.util.Arrays;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4346;
import kotlinx.serialization.SerializationException;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7108 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f19042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Enum[] f19043;

    public C7108(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.f19043 = enumArr;
        this.f19042 = AbstractC5186.m10210(new C0004(this, 16, str));
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        int iMo6873 = interfaceC7186.mo6873(getDescriptor());
        Enum[] enumArr = this.f19043;
        if (iMo6873 >= 0 && iMo6873 < enumArr.length) {
            return enumArr[iMo6873];
        }
        throw new SerializationException(iMo6873 + " is not among valid " + getDescriptor().mo12355() + " enum values, values size is " + enumArr.length);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return (InterfaceC7190) this.f19042.getValue();
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.f19043;
        int iM8844 = AbstractC4346.m8844(r5, enumArr);
        if (iM8844 != -1) {
            interfaceC7185.mo6794(getDescriptor(), iM8844);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strMo12355 = getDescriptor().mo12355();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strMo12355);
        sb.append(", must be one of ");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo12355() + '>';
    }
}
