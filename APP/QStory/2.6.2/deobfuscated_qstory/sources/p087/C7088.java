package p087;

import com.bumptech.glide.AbstractC3065;
import kotlin.text.AbstractC5128;
import kotlin.uuid.C5165;
import kotlin.uuid.Uuid;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7191;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7088 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7088 f19011 = new C7088();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7124 f19010 = new C7124("kotlin.uuid.Uuid", C7191.f19191);

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        C5165 c5165 = Uuid.Companion;
        String strMo6867 = interfaceC7186.mo6867();
        c5165.getClass();
        strMo6867.getClass();
        int length = strMo6867.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strMo6867.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = AbstractC5128.f14672[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                AbstractC3065.m6828(i, strMo6867, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo6867.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = AbstractC5128.f14672[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                AbstractC3065.m6828(i2, strMo6867, "a hexadecimal digit");
                throw null;
            }
            Uuid.Companion.getClass();
            return C5165.m10205(j, j4);
        }
        if (length != 36) {
            StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb.append(strMo6867.length() <= 64 ? strMo6867 : strMo6867.substring(0, 64).concat("..."));
            sb.append("\" of length ");
            sb.append(strMo6867.length());
            throw new IllegalArgumentException(sb.toString());
        }
        long j7 = 0;
        while (i < 8) {
            long j8 = j7 << 4;
            char cCharAt3 = strMo6867.charAt(i);
            if ((cCharAt3 >>> '\b') == 0) {
                long j9 = AbstractC5128.f14672[cCharAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                    i++;
                }
            }
            AbstractC3065.m6828(i, strMo6867, "a hexadecimal digit");
            throw null;
        }
        if (strMo6867.charAt(8) != '-') {
            AbstractC3065.m6828(8, strMo6867, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i3 = 9; i3 < 13; i3++) {
            long j11 = j10 << 4;
            char cCharAt4 = strMo6867.charAt(i3);
            if ((cCharAt4 >>> '\b') == 0) {
                long j12 = AbstractC5128.f14672[cCharAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            AbstractC3065.m6828(i3, strMo6867, "a hexadecimal digit");
            throw null;
        }
        if (strMo6867.charAt(13) != '-') {
            AbstractC3065.m6828(13, strMo6867, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i4 = 14; i4 < 18; i4++) {
            long j14 = j13 << 4;
            char cCharAt5 = strMo6867.charAt(i4);
            if ((cCharAt5 >>> '\b') == 0) {
                long j15 = AbstractC5128.f14672[cCharAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            AbstractC3065.m6828(i4, strMo6867, "a hexadecimal digit");
            throw null;
        }
        if (strMo6867.charAt(18) != '-') {
            AbstractC3065.m6828(18, strMo6867, "'-' (hyphen)");
            throw null;
        }
        long j16 = 0;
        for (int i5 = 19; i5 < 23; i5++) {
            long j17 = j16 << 4;
            char cCharAt6 = strMo6867.charAt(i5);
            if ((cCharAt6 >>> '\b') == 0) {
                long j18 = AbstractC5128.f14672[cCharAt6];
                if (j18 >= 0) {
                    j16 = j17 | j18;
                }
            }
            AbstractC3065.m6828(i5, strMo6867, "a hexadecimal digit");
            throw null;
        }
        if (strMo6867.charAt(23) != '-') {
            AbstractC3065.m6828(23, strMo6867, "'-' (hyphen)");
            throw null;
        }
        long j19 = 0;
        for (int i6 = 24; i6 < 36; i6++) {
            long j20 = j19 << 4;
            char cCharAt7 = strMo6867.charAt(i6);
            if ((cCharAt7 >>> '\b') == 0) {
                long j21 = AbstractC5128.f14672[cCharAt7];
                if (j21 >= 0) {
                    j19 = j20 | j21;
                }
            }
            AbstractC3065.m6828(i6, strMo6867, "a hexadecimal digit");
            throw null;
        }
        Uuid.Companion.getClass();
        return C5165.m10205((j7 << 32) | (j10 << 16) | j13, (j16 << 48) | j19);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return f19010;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        Uuid uuid = (Uuid) obj;
        uuid.getClass();
        interfaceC7185.mo6813(uuid.toString());
    }
}
