package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.widget.ImageView;
import androidx.appcompat.app.C0955;
import androidx.collection.C1123;
import androidx.compose.p001ui.spatial.AbstractC2797;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3075;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.load.engine.C3836;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import io.ktor.client.plugins.AbstractC4765;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5183;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5944;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.impl.p009km.internal.C5344;
import okhttp3.Protocol;
import org.xmlpull.v1.XmlPullParserException;
import p068.InterfaceC7381;
import p177.AbstractC8470;
import p177.AbstractC8471;
import p192.AbstractC8570;
import p204.AbstractC8602;
import p216.AbstractC8700;
import p234.AbstractC8800;
import p299.C9208;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0984 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f942;

    public C0984(byte b, int i) {
        this.f942 = i;
        switch (i) {
            case 5:
                this.f939 = ByteBuffer.allocate(4);
                break;
            default:
                this.f940 = new int[16];
                this.f939 = new C5183();
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
    
        r1 = r0.f5639;
        r0 = r0.f5638;
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
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f5639, r0.f5638);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022d, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022f, code lost:
    
        r1 = r0.f5639;
        r0 = r0.f5638;
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
    
        return new androidx.appcompat.widget.C0984(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new androidx.compose.p001ui.platform.C2650(r13, r7);
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
    
        r0 = new androidx.compose.p001ui.platform.C2650(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new androidx.compose.p001ui.platform.C2650(r6, r12);
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0984 m1120(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        int color;
        float f2;
        int i2;
        float f3;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM13455 = AbstractC8470.m13455(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0984((Shader) null, colorStateListM13455, colorStateListM13455.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM13463 = AbstractC8471.m13463(resources, theme, attributeSetAsAttributeSet, AbstractC8700.f21990);
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayM13463.getFloat(8, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM13463.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM13463.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM13463.getFloat(11, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayM13463.getFloat(3, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM13463.getFloat(4, 0.0f) : 0.0f;
        int i3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayM13463.getInt(2, 0) : 0;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM13463.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM13463.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f = f4;
            color = typedArrayM13463.getColor(1, 0);
        } else {
            f = f4;
            color = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f2 = f5;
            i2 = typedArrayM13463.getInt(6, 0);
        } else {
            f2 = f5;
            i2 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM13463.getFloat(5, 0.0f) : 0.0f;
        typedArrayM13463.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f12 = f6;
            if (next2 == 1) {
                f3 = f7;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f7;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM134632 = AbstractC8471.m13463(resources, theme, attributeSetAsAttributeSet, AbstractC8700.f21989);
                boolean zHasValue = typedArrayM134632.hasValue(0);
                boolean zHasValue2 = typedArrayM134632.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color4 = typedArrayM134632.getColor(0, 0);
                float f13 = typedArrayM134632.getFloat(1, 0.0f);
                typedArrayM134632.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f13));
            }
            f6 = f12;
            f7 = f3;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m1122(String str) {
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
        switch (this.f942) {
            case 7:
                StringBuilder sb = new StringBuilder();
                if (((Protocol) this.f940) == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f941);
                sb.append(' ');
                sb.append((String) this.f939);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m1123(InterfaceC7381 interfaceC7381, int i) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f940;
        int i3 = this.f941;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                interfaceC7381.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public void m1124(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.f940;
        long[] jArr2 = (long[]) this.f939;
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
            int i9 = i8 == 1023 ? this.f941 : (i8 * 3) + i7;
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
                        int i12 = AbstractC2797.f6175;
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
    public int m1125() {
        byte[] bArr = (byte[]) this.f939;
        int i = this.f941;
        int i2 = i + 1;
        this.f941 = i2;
        int i3 = bArr[i] & DefaultClassResolver.NAME;
        int i4 = i + 2;
        this.f941 = i4;
        int i5 = ((bArr[i2] & DefaultClassResolver.NAME) << 8) | i3;
        int i6 = i + 3;
        this.f941 = i6;
        int i7 = i5 | ((bArr[i4] & DefaultClassResolver.NAME) << 16);
        this.f941 = i + 4;
        return (bArr[i6] << 24) | i7;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long m1126(int i, int i2) {
        long jM1141 = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jM1141 ^= m1141(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            jM1141 ^= (((long) ((byte[]) this.f939)[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (jM1141 << i9) | (jM1141 >>> (64 - i9));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m1127(int i, int i2) {
        if (i > 131072) {
            AbstractC8570.m13656("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.f940;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            AbstractC5179.m9400(i2, 0, 12, (int[]) this.f940, iArr2);
            this.f940 = iArr2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public synchronized String m1128(int i, byte[] bArr, int i2) {
        char[] cArr;
        int i3;
        int i4;
        try {
            cArr = (char[]) this.f940;
            if (cArr == null) {
                cArr = i2 <= 256 ? new char[256] : new char[2048];
                this.f940 = cArr;
            } else if (cArr.length < i2) {
                cArr = new char[2048];
                this.f940 = cArr;
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
    public void m1129() {
        C0987 c0987;
        ImageView imageView = (ImageView) this.f940;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1063.m1283(drawable);
        }
        if (drawable == null || (c0987 = (C0987) this.f939) == null) {
            return;
        }
        C0977.m1097(drawable, c0987, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public void m1130(int i) {
        byte[] bArr = (byte[]) this.f939;
        int i2 = this.f941;
        int i3 = i2 + 1;
        this.f941 = i3;
        bArr[i2] = (byte) i;
        int i4 = i2 + 2;
        this.f941 = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i2 + 3;
        this.f941 = i5;
        bArr[i4] = (byte) (i >> 16);
        this.f941 = i2 + 4;
        bArr[i5] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public void m1131(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, (byte[]) this.f939, this.f941, length);
            this.f941 += length;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public void m1132(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = (byte[]) this.f939;
        int i = this.f941;
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
        this.f941 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void m1133(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.f940;
        int i3 = this.f941;
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
    public void m1134(int i, int i2) {
        byte[] bArr = (byte[]) this.f939;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public void m1135(int i, long j) {
        byte[] bArr = (byte[]) this.f939;
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
    public void m1136(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.f940;
        int i8 = this.f941;
        int i9 = i8 + 3;
        this.f941 = i9;
        int length = jArr.length;
        if (length <= i9) {
            int iMax = Math.max(length * 2, i9);
            this.f940 = Arrays.copyOf(jArr, iMax);
            this.f939 = Arrays.copyOf((long[]) this.f939, iMax);
        }
        long[] jArr2 = (long[]) this.f940;
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
                int i14 = AbstractC2797.f6175;
                jArr2[i12] = (((long) Math.min(i13, 1023)) << 50) | (j & (-1151795604700004353L));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean m1137(Object obj, InterfaceC5920 interfaceC5920) {
        interfaceC5920.getClass();
        C5344 c5344 = (C5344) this.f939;
        return ((((Number) ((InterfaceC5944) this.f940).get(obj)).intValue() >>> c5344.f13502) & ((1 << c5344.f13501) - 1)) == c5344.f13500;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m1138(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f940;
        Context context = imageView.getContext();
        int[] iArr = AbstractC8602.f21429;
        C0955 c0955M914 = C0955.m914(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
        AbstractC3103.m4803(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0955M914.f665, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC4765.m8871(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1063.m1283(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c0955M914.m945(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1063.m1282(typedArray.getInt(3, -1), null));
            }
            c0955M914.m923();
        } catch (Throwable th) {
            c0955M914.m923();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m1139(byte b) {
        byte[] bArr = (byte[]) this.f939;
        int i = this.f941;
        this.f941 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean m1140() {
        ColorStateList colorStateList;
        return ((Shader) this.f940) == null && (colorStateList = (ColorStateList) this.f939) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long m1141(int i) {
        byte[] bArr = (byte[]) this.f939;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40);
        return (((long) bArr[i + 7]) << 56) | j | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int m1142(int i) {
        byte[] bArr = (byte[]) this.f939;
        int i2 = ((bArr[i + 1] & DefaultClassResolver.NAME) << 8) | (bArr[i] & DefaultClassResolver.NAME);
        return (bArr[i + 3] << 24) | i2 | ((bArr[i + 2] & DefaultClassResolver.NAME) << 16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String m1143(C5317 c5317, int i) {
        if (c5317 == null || i <= 0) {
            return m1145(i);
        }
        byte[] bArr = (byte[]) this.f939;
        int i2 = this.f941;
        byte[] bArrM9616 = c5317.m9616(Arrays.copyOfRange(bArr, i2, i2 + i));
        String str = bArrM9616.length > 2048 ? new String(bArrM9616, StandardCharsets.UTF_8) : m1128(0, bArrM9616, bArrM9616.length);
        this.f941 += i;
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public short m1144() {
        byte[] bArr = (byte[]) this.f939;
        int i = this.f941;
        int i2 = i + 1;
        this.f941 = i2;
        int i3 = bArr[i] & DefaultClassResolver.NAME;
        this.f941 = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public String m1145(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        byte[] bArr = (byte[]) this.f939;
        String str = i > 2048 ? new String(bArr, this.f941, i, StandardCharsets.UTF_8) : m1128(this.f941, bArr, i);
        this.f941 += i;
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0984(int i) {
        this(new byte[i], 0);
        this.f942 = 10;
    }

    public C0984(Protocol protocol, int i, String str) {
        this.f942 = 7;
        protocol.getClass();
        this.f940 = protocol;
        this.f941 = i;
        this.f939 = str;
    }

    public C0984(byte[] bArr, int i) {
        this.f942 = 10;
        this.f940 = null;
        this.f939 = bArr;
        this.f941 = i;
    }

    public /* synthetic */ C0984(int i, char c) {
        this.f942 = i;
    }

    public C0984(ArrayList arrayList, int i, MotionEvent motionEvent) {
        this.f942 = 8;
        this.f940 = arrayList;
        this.f941 = i;
        this.f939 = motionEvent;
        if (arrayList.isEmpty()) {
            C6755.m11869("changes cannot be empty");
            throw null;
        }
    }

    public C0984(MutablePropertyReference1Impl mutablePropertyReference1Impl, C5344 c5344) {
        this.f942 = 6;
        mutablePropertyReference1Impl.getClass();
        this.f940 = mutablePropertyReference1Impl;
        this.f939 = c5344;
        if (c5344.f13501 == 1 && c5344.f13500 == 1) {
            this.f941 = 1 << c5344.f13502;
        } else {
            C1123.m1409(c5344, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", " was passed");
            throw null;
        }
    }

    public C0984(ImageView imageView) {
        this.f942 = 0;
        this.f941 = 0;
        this.f940 = imageView;
    }

    public C0984(Shader shader, ColorStateList colorStateList, int i) {
        this.f942 = 9;
        this.f940 = shader;
        this.f939 = colorStateList;
        this.f941 = i;
    }

    public C0984(int i, C9208 c9208, C0984 c0984) {
        this.f942 = 11;
        this.f941 = i;
        this.f940 = c9208;
        this.f939 = c0984;
    }

    public C0984(C3836 c3836) {
        this.f942 = 4;
        this.f939 = AbstractC8800.m14020(150, new C3075(this, 8));
        this.f940 = c3836;
    }
}
