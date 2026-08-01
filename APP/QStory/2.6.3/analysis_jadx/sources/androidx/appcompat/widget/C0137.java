package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.app.C0108;
import androidx.collection.C0276;
import androidx.compose.ui.spatial.AbstractC1962;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2242;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.load.engine.C3004;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.client.plugins.AbstractC3933;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import kotlin.collections.C4351;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.reflect.jvm.internal.impl.km.internal.C4512;
import okhttp3.Protocol;
import p052.InterfaceC6552;
import p176.AbstractC7741;
import p188.AbstractC7773;
import p218.AbstractC7971;
import p283.C8379;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0137 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f594;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f595;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f596;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f597;

    public C0137(byte b, int i) {
        this.f597 = i;
        switch (i) {
            case 5:
                this.f594 = ByteBuffer.allocate(4);
                break;
            default:
                this.f595 = new int[16];
                this.f594 = new C4351();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r1 = r0.f5294;
        r0 = r0.f5293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0200, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0202, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0204, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0218, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f5294, r0.f5293);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022d, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022f, code lost:
    
        r1 = r0.f5294;
        r0 = r0.f5293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0236, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0239, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0250, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025c, code lost:
    
        return new androidx.appcompat.widget.C0137(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new androidx.compose.ui.platform.C1815(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new androidx.compose.ui.platform.C1815(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new androidx.compose.ui.platform.C1815(r6, r12);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.appcompat.widget.C0137 m560(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0137.m560(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.appcompat.widget.飘花落叶言子世苏楪哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m562(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                i2++;
            } else if (cCharAt < 2048) {
                i2 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i2 += 3;
            } else {
                i += 2;
                i2 += 4;
            }
            i = i3;
        }
        return i2;
    }

    public String toString() {
        switch (this.f597) {
            case 7:
                StringBuilder sb = new StringBuilder();
                if (((Protocol) this.f595) == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f596);
                sb.append(' ');
                sb.append((String) this.f594);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m563(InterfaceC6552 interfaceC6552, int i) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f595;
        int i3 = this.f596;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                interfaceC6552.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m564(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.f595;
        long[] jArr2 = (long[]) this.f594;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & 1023;
            int i9 = i8 == 1023 ? this.f596 : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = (((long) (((int) j4) + i2)) & 4294967295L) | (((long) (((int) (j4 >> 32)) + i)) << 32);
                    jArr[i11] = (((long) (((int) j5) + i2)) & 4294967295L) | (((long) (((int) (j5 >> 32)) + i)) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & 1023) > 0) {
                        int i12 = AbstractC1962.f5830;
                        jArr2[i4] = ((-1125899873288193L) & j3) | (((long) ((i7 + 3) & i3)) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int m565() {
        byte[] bArr = (byte[]) this.f594;
        int i = this.f596;
        int i2 = i + 1;
        this.f596 = i2;
        int i3 = bArr[i] & DefaultClassResolver.NAME;
        int i4 = i + 2;
        this.f596 = i4;
        int i5 = ((bArr[i2] & DefaultClassResolver.NAME) << 8) | i3;
        int i6 = i + 3;
        this.f596 = i6;
        int i7 = i5 | ((bArr[i4] & DefaultClassResolver.NAME) << 16);
        this.f596 = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long m566(int i, int i2) {
        long jM581 = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jM581 ^= m581(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            jM581 ^= (((long) ((byte[]) this.f594)[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (jM581 << i9) | (jM581 >>> (64 - i9));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m567(int i, int i2) {
        if (i > 131072) {
            AbstractC7741.m13097("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.f595;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            AbstractC4347.m8841(i2, 0, 12, (int[]) this.f595, iArr2);
            this.f595 = iArr2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public synchronized String m568(int i, byte[] bArr, int i2) {
        char[] cArr;
        int i3;
        int i4;
        try {
            cArr = (char[]) this.f595;
            if (cArr == null) {
                cArr = i2 <= 256 ? new char[256] : new char[2048];
                this.f595 = cArr;
            } else if (cArr.length < i2) {
                cArr = new char[2048];
                this.f595 = cArr;
            }
            int i5 = i2 + i;
            i3 = 0;
            while (i < i5) {
                int i6 = i + 1;
                byte b = bArr[i];
                if (b > 0) {
                    cArr[i3] = (char) b;
                    i3++;
                    i = i6;
                } else {
                    if (b < -32) {
                        i += 2;
                        byte b2 = bArr[i6];
                        if (b < -62 || b2 > -65) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i4 = i3 + 1;
                        cArr[i3] = (char) ((b2 & 63) | ((b & 31) << 6));
                    } else {
                        if (b >= -16) {
                            byte b3 = bArr[i6];
                            int i7 = i + 3;
                            byte b4 = bArr[i + 2];
                            i += 4;
                            byte b5 = bArr[i7];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0 && b4 <= -65 && b5 <= -65) {
                                    int i8 = ((b3 & 63) << 12) | ((b & 7) << 18) | ((b4 & 63) << 6) | (b5 & 63);
                                    int i9 = i3 + 1;
                                    cArr[i3] = (char) ((i8 >>> 10) + 55232);
                                    i3 += 2;
                                    cArr[i9] = (char) ((i8 & 1023) + 56320);
                                }
                            }
                            throw new IllegalArgumentException("Invalid String");
                        }
                        int i10 = i + 2;
                        byte b6 = bArr[i6];
                        i += 3;
                        byte b7 = bArr[i10];
                        if ((b == -32 && b6 < -96) || ((b == -19 && b6 >= -96) || b6 > -65 || b7 > -65)) {
                            throw new IllegalArgumentException("Invalid String");
                        }
                        i4 = i3 + 1;
                        cArr[i3] = (char) (((b6 & 63) << 6) | ((b & 15) << 12) | (b7 & 63));
                    }
                    i3 = i4;
                }
            }
            if (i > i5) {
                throw new IllegalArgumentException("Invalid String");
            }
        } finally {
        }
        return new String(cArr, 0, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m569() {
        C0140 c0140;
        ImageView imageView = (ImageView) this.f595;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0216.m723(drawable);
        }
        if (drawable == null || (c0140 = (C0140) this.f594) == null) {
            return;
        }
        C0130.m537(drawable, c0140, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m570(int i) {
        byte[] bArr = (byte[]) this.f594;
        int i2 = this.f596;
        int i3 = i2 + 1;
        this.f596 = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.f596 = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.f596 = i5;
        bArr[i4] = (byte) (i >> 16);
        this.f596 = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m571(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f594, this.f596, length);
            this.f596 += length;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void m572(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f594;
        int i = this.f596;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                int i4 = i + 1;
                bArr[i] = (byte) ((cCharAt >>> 6) | 192);
                i += 2;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i] = (byte) ((cCharAt >>> '\f') | Opcodes.SHL_INT_LIT8);
                int i5 = i + 2;
                bArr[i + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i5] = (byte) ((cCharAt & '?') | 128);
            } else {
                i2 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i3)) - 56613888;
                bArr[i] = (byte) ((iCharAt >>> 18) | 240);
                bArr[i + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i6 = i + 3;
                bArr[i + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i += 4;
                bArr[i6] = (byte) ((iCharAt & 63) | 128);
            }
            i2 = i3;
        }
        this.f596 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m573(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f595;
        int i3 = this.f596;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public void m574(int i, int i2) {
        byte[] bArr = (byte[]) this.f594;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void m575(int i, long j) {
        byte[] bArr = (byte[]) this.f594;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m576(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.f595;
        int i8 = this.f596;
        int i9 = i8 + 3;
        this.f596 = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.f595 = Arrays.copyOf(jArr, iMax);
            this.f594 = Arrays.copyOf((long[]) this.f594, iMax);
        }
        long[] jArr2 = (long[]) this.f595;
        jArr2[i8] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i8 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i10) << 25) | ((long) (i & 33554431));
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                int i13 = (i8 - i11) / 3;
                int i14 = AbstractC1962.f5830;
                jArr2[i12] = (((long) Math.min(i13, 1023)) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean m577(Object obj, InterfaceC5088 interfaceC5088) {
        interfaceC5088.getClass();
        C4512 c4512 = (C4512) this.f594;
        return ((((Number) ((InterfaceC5112) this.f595).get(obj)).intValue() >>> c4512.f13157) & ((1 << c4512.f13156) - 1)) == c4512.f13155;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m578(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f595;
        Context context = imageView.getContext();
        int[] iArr = AbstractC7773.f21084;
        C0108 c0108M354 = C0108.m354(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0108M354.f320;
        AbstractC2270.m4243(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0108M354.f320, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC3933.m8312(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0216.m723(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c0108M354.m385(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC0216.m722(typedArray.getInt(3, -1), null));
            }
            c0108M354.m363();
        } catch (Throwable th) {
            c0108M354.m363();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m579(byte b) {
        byte[] bArr = (byte[]) this.f594;
        int i = this.f596;
        this.f596 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean m580() {
        ColorStateList colorStateList;
        return ((Shader) this.f595) == null && (colorStateList = (ColorStateList) this.f594) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long m581(int i) {
        byte[] bArr = (byte[]) this.f594;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40);
        return (((long) bArr[i + 7]) << 56) | j | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int m582(int i) {
        byte[] bArr = (byte[]) this.f594;
        int i2 = ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | (bArr[i] & DefaultClassResolver.NAME);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String m583(C4485 c4485, int i) {
        if (c4485 == null || i <= 0) {
            return m585(i);
        }
        byte[] bArr = (byte[]) this.f594;
        int i2 = this.f596;
        byte[] bArrM9057 = c4485.m9057(Arrays.copyOfRange(bArr, i2, i2 + i));
        String str = bArrM9057.length > 2048 ? new String(bArrM9057, StandardCharsets.UTF_8) : m568(0, bArrM9057, bArrM9057.length);
        this.f596 += i;
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public short m584() {
        byte[] bArr = (byte[]) this.f594;
        int i = this.f596;
        int i2 = i + 1;
        this.f596 = i2;
        int i3 = bArr[i] & DefaultClassResolver.NAME;
        this.f596 = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String m585(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        byte[] bArr = (byte[]) this.f594;
        String str = i > 2048 ? new String(bArr, this.f596, i, StandardCharsets.UTF_8) : m568(this.f596, bArr, i);
        this.f596 += i;
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0137(int i) {
        this(new byte[i], 0);
        this.f597 = 10;
    }

    public C0137(Protocol protocol, int i, String str) {
        this.f597 = 7;
        protocol.getClass();
        this.f595 = protocol;
        this.f596 = i;
        this.f594 = str;
    }

    public C0137(byte[] bArr, int i) {
        this.f597 = 10;
        this.f595 = null;
        this.f594 = bArr;
        this.f596 = i;
    }

    public /* synthetic */ C0137(int i, char c) {
        this.f597 = i;
    }

    public C0137(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.f597 = 8;
        this.f595 = arrayList;
        this.f596 = i;
        this.f594 = motionEvent;
        if (arrayList.isEmpty()) {
            C5925.m11310("changes cannot be empty");
            throw null;
        }
    }

    public C0137(MutablePropertyReference1Impl mutablePropertyReference1Impl, C4512 c4512) {
        this.f597 = 6;
        mutablePropertyReference1Impl.getClass();
        this.f595 = mutablePropertyReference1Impl;
        this.f594 = c4512;
        if (c4512.f13156 == 1 && c4512.f13155 == 1) {
            this.f596 = 1 << c4512.f13157;
        } else {
            C0276.m849(c4512, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
            throw null;
        }
    }

    public C0137(ImageView imageView) {
        this.f597 = 0;
        this.f596 = 0;
        this.f595 = imageView;
    }

    public C0137(Shader shader, ColorStateList colorStateList, int i) {
        this.f597 = 9;
        this.f595 = shader;
        this.f594 = colorStateList;
        this.f596 = i;
    }

    public C0137(int i, C8379 c8379, C0137 c0137) {
        this.f597 = 11;
        this.f596 = i;
        this.f595 = c8379;
        this.f594 = c0137;
    }

    public C0137(C3004 c3004) {
        this.f597 = 4;
        this.f594 = AbstractC7971.m13461(150, new C2242(this, 8));
        this.f595 = c3004;
    }
}
