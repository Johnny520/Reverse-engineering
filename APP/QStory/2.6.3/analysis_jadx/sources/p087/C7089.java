package p087;

import kotlin.text.AbstractC5129;
import kotlin.uuid.C5166;
import kotlin.uuid.Uuid;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7192;
import p091.InterfaceC7191;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7089 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7089 f19006 = new C7089();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7125 f19005 = new C7125("kotlin.uuid.Uuid", C7192.f19184);

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        C5166 c5166 = Uuid.Companion;
        String strMo10662 = interfaceC7187.mo10662();
        c5166.getClass();
        strMo10662.getClass();
        int length = strMo10662.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strMo10662.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = AbstractC5129.f14672[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                C8667.m14368(i, strMo10662, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo10662.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = AbstractC5129.f14672[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                C8667.m14368(i2, strMo10662, "a hexadecimal digit");
                throw null;
            }
            Uuid.Companion.getClass();
            return C5166.m10209(j, j4);
        }
        if (length != 36) {
            StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb.append(strMo10662.length() <= 64 ? strMo10662 : strMo10662.substring(0, 64).concat("..."));
            sb.append("\" of length ");
            sb.append(strMo10662.length());
            throw new IllegalArgumentException(sb.toString());
        }
        long j7 = 0;
        while (i < 8) {
            long j8 = j7 << 4;
            char cCharAt3 = strMo10662.charAt(i);
            if ((cCharAt3 >>> '\b') == 0) {
                long j9 = AbstractC5129.f14672[cCharAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                    i++;
                }
            }
            C8667.m14368(i, strMo10662, "a hexadecimal digit");
            throw null;
        }
        if (strMo10662.charAt(8) != '-') {
            C8667.m14368(8, strMo10662, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i3 = 9; i3 < 13; i3++) {
            long j11 = j10 << 4;
            char cCharAt4 = strMo10662.charAt(i3);
            if ((cCharAt4 >>> '\b') == 0) {
                long j12 = AbstractC5129.f14672[cCharAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            C8667.m14368(i3, strMo10662, "a hexadecimal digit");
            throw null;
        }
        if (strMo10662.charAt(13) != '-') {
            C8667.m14368(13, strMo10662, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i4 = 14; i4 < 18; i4++) {
            long j14 = j13 << 4;
            char cCharAt5 = strMo10662.charAt(i4);
            if ((cCharAt5 >>> '\b') == 0) {
                long j15 = AbstractC5129.f14672[cCharAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            C8667.m14368(i4, strMo10662, "a hexadecimal digit");
            throw null;
        }
        if (strMo10662.charAt(18) != '-') {
            C8667.m14368(18, strMo10662, "'-' (hyphen)");
            throw null;
        }
        long j16 = 0;
        for (int i5 = 19; i5 < 23; i5++) {
            long j17 = j16 << 4;
            char cCharAt6 = strMo10662.charAt(i5);
            if ((cCharAt6 >>> '\b') == 0) {
                long j18 = AbstractC5129.f14672[cCharAt6];
                if (j18 >= 0) {
                    j16 = j17 | j18;
                }
            }
            C8667.m14368(i5, strMo10662, "a hexadecimal digit");
            throw null;
        }
        if (strMo10662.charAt(23) != '-') {
            C8667.m14368(23, strMo10662, "'-' (hyphen)");
            throw null;
        }
        long j19 = 0;
        for (int i6 = 24; i6 < 36; i6++) {
            long j20 = j19 << 4;
            char cCharAt7 = strMo10662.charAt(i6);
            if ((cCharAt7 >>> '\b') == 0) {
                long j21 = AbstractC5129.f14672[cCharAt7];
                if (j21 >= 0) {
                    j19 = j20 | j21;
                }
            }
            C8667.m14368(i6, strMo10662, "a hexadecimal digit");
            throw null;
        }
        Uuid.Companion.getClass();
        return C5166.m10209((j7 << 32) | (j10 << 16) | j13, (j16 << 48) | j19);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return f19005;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        Uuid uuid = (Uuid) obj;
        uuid.getClass();
        interfaceC7186.mo10649(uuid.toString());
    }
}
