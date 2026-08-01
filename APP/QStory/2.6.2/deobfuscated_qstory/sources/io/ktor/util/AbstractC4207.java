package io.ktor.util;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: io.ktor.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4207 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f12693 = 0;

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = AbstractC5143.m10151("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i, 0, 6);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m8601(byte[] bArr) {
        int i;
        int i2;
        int i3 = 3;
        char[] cArr = new char[((bArr.length * 8) / 6) + 3];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 3;
            if (i6 > bArr.length) {
                break;
            }
            byte b = bArr[i4];
            byte b2 = bArr[i4 + 1];
            int i7 = (bArr[i4 + 2] & DefaultClassResolver.NAME) | ((b & DefaultClassResolver.NAME) << 16) | ((b2 & DefaultClassResolver.NAME) << 8);
            int i8 = 3;
            while (-1 < i8) {
                cArr[i5] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i7 >> (i8 * 6)) & 63);
                i8--;
                i5++;
            }
            i4 = i6;
        }
        int length = bArr.length - i4;
        if (length == 0) {
            return AbstractC5138.m10132(0, i5, cArr);
        }
        if (length == 1) {
            i = (bArr[i4] & DefaultClassResolver.NAME) << 16;
        } else {
            i = ((bArr[i4 + 1] & DefaultClassResolver.NAME) << 8) | ((bArr[i4] & DefaultClassResolver.NAME) << 16);
        }
        int i9 = ((3 - length) * 8) / 6;
        if (i9 <= 3) {
            while (true) {
                i2 = i5 + 1;
                cArr[i5] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i >> (i3 * 6)) & 63);
                if (i3 == i9) {
                    break;
                }
                i3--;
                i5 = i2;
            }
            i5 = i2;
        }
        int i10 = 0;
        while (i10 < i9) {
            cArr[i5] = SignatureVisitor.INSTANCEOF;
            i10++;
            i5++;
        }
        return AbstractC5138.m10132(0, i5, cArr);
    }
}
