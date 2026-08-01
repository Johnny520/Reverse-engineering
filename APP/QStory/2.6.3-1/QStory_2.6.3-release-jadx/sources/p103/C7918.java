package p103;

import kotlin.text.AbstractC5961;
import kotlin.uuid.C5998;
import kotlin.uuid.Uuid;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8021;
import p107.InterfaceC8020;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7918 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7918 f19351 = new C7918();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7954 f19350 = new C7954("kotlin.uuid.Uuid", C8021.f19529);

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        C5998 c5998 = Uuid.Companion;
        String strMo11221 = interfaceC8016.mo11221();
        c5998.getClass();
        strMo11221.getClass();
        int length = strMo11221.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strMo11221.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = AbstractC5961.f15017[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                C9496.m14927(i, strMo11221, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo11221.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = AbstractC5961.f15017[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                C9496.m14927(i2, strMo11221, "a hexadecimal digit");
                throw null;
            }
            Uuid.Companion.getClass();
            return C5998.m10768(j, j4);
        }
        if (length != 36) {
            StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb.append(strMo11221.length() <= 64 ? strMo11221 : strMo11221.substring(0, 64).concat("..."));
            sb.append("\" of length ");
            sb.append(strMo11221.length());
            throw new IllegalArgumentException(sb.toString());
        }
        long j7 = 0;
        while (i < 8) {
            long j8 = j7 << 4;
            char cCharAt3 = strMo11221.charAt(i);
            if ((cCharAt3 >>> '\b') == 0) {
                long j9 = AbstractC5961.f15017[cCharAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                    i++;
                }
            }
            C9496.m14927(i, strMo11221, "a hexadecimal digit");
            throw null;
        }
        if (strMo11221.charAt(8) != '-') {
            C9496.m14927(8, strMo11221, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i3 = 9; i3 < 13; i3++) {
            long j11 = j10 << 4;
            char cCharAt4 = strMo11221.charAt(i3);
            if ((cCharAt4 >>> '\b') == 0) {
                long j12 = AbstractC5961.f15017[cCharAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            C9496.m14927(i3, strMo11221, "a hexadecimal digit");
            throw null;
        }
        if (strMo11221.charAt(13) != '-') {
            C9496.m14927(13, strMo11221, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i4 = 14; i4 < 18; i4++) {
            long j14 = j13 << 4;
            char cCharAt5 = strMo11221.charAt(i4);
            if ((cCharAt5 >>> '\b') == 0) {
                long j15 = AbstractC5961.f15017[cCharAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            C9496.m14927(i4, strMo11221, "a hexadecimal digit");
            throw null;
        }
        if (strMo11221.charAt(18) != '-') {
            C9496.m14927(18, strMo11221, "'-' (hyphen)");
            throw null;
        }
        long j16 = 0;
        for (int i5 = 19; i5 < 23; i5++) {
            long j17 = j16 << 4;
            char cCharAt6 = strMo11221.charAt(i5);
            if ((cCharAt6 >>> '\b') == 0) {
                long j18 = AbstractC5961.f15017[cCharAt6];
                if (j18 >= 0) {
                    j16 = j17 | j18;
                }
            }
            C9496.m14927(i5, strMo11221, "a hexadecimal digit");
            throw null;
        }
        if (strMo11221.charAt(23) != '-') {
            C9496.m14927(23, strMo11221, "'-' (hyphen)");
            throw null;
        }
        long j19 = 0;
        for (int i6 = 24; i6 < 36; i6++) {
            long j20 = j19 << 4;
            char cCharAt7 = strMo11221.charAt(i6);
            if ((cCharAt7 >>> '\b') == 0) {
                long j21 = AbstractC5961.f15017[cCharAt7];
                if (j21 >= 0) {
                    j19 = j20 | j21;
                }
            }
            C9496.m14927(i6, strMo11221, "a hexadecimal digit");
            throw null;
        }
        Uuid.Companion.getClass();
        return C5998.m10768((j7 << 32) | (j10 << 16) | j13, (j16 << 48) | j19);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return f19350;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        Uuid uuid = (Uuid) obj;
        uuid.getClass();
        interfaceC8015.mo11208(uuid.toString());
    }
}
