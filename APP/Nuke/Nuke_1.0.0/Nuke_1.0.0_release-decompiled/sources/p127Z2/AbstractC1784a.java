package p127Z2;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1926h;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.dartcv.nuke.R;
import org.luckypray.dexkit.DexKitBridge;
import p000A.C0010F;
import p000A.C0021K0;
import p000A.C0049a;
import p000A.C0066i0;
import p000A.C0073m;
import p000A.C0095x;
import p004A3.AbstractC0156a;
import p004A3.C0157b;
import p011B4.AbstractC0231b;
import p013C0.C0235b;
import p021D3.RunnableC0270g;
import p027E4.C0330q;
import p029F0.AbstractC0435z;
import p029F0.InterfaceC0430v;
import p030F1.C0438c;
import p030F1.InterfaceC0439d;
import p036G1.AbstractC0472a;
import p037G2.AbstractC0489a;
import p037G2.C0501m;
import p041H0.AbstractC0596h0;
import p041H0.C0551B;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p047I0.AbstractC0691Q;
import p049I2.AbstractC0797o;
import p049I2.C0790h;
import p049I2.C0791i;
import p049I2.C0793k;
import p049I2.C0800r;
import p049I2.SharedPreferencesC0796n;
import p056K2.C0882h;
import p056K2.C0884j;
import p056K2.C0888n;
import p056K2.C0891q;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p072O0.C1037h;
import p072O0.C1038i;
import p076P.AbstractC1089e0;
import p076P.C1073T;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1131r;
import p077P0.AbstractC1132s;
import p077P0.C1122i;
import p077P0.C1125l;
import p077P0.C1128o;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p100U.C1439L;
import p105V.C1483e;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p117X2.C1660e;
import p117X2.InterfaceC1659d;
import p118X3.C1706p;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p135b.InterfaceC1811C;
import p136b0.AbstractC1848j;
import p137b3.InterfaceC1854b;
import p138b4.C1876u;
import p139c.AbstractC1883f;
import p139c.C1878a;
import p139c.C1882e;
import p145d.C1949b;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;
import p153e1.AbstractC2006b;
import p153e1.C2010f;
import p153e1.C2015k;
import p155e3.EnumC2032c;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p175i0.C2270e;
import p175i0.InterfaceC2278m;
import p179i4.AbstractC2352g;
import p186k.C2408E;
import p193l0.C2478a;
import p203n.C2654f0;
import p204n0.C2683b;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2740O;
import p211o0.C2762u;
import p227r.EnumC2983d0;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.AbstractC3287t;
import p244u.C3258a0;
import p244u.C3289v;
import p245u0.AbstractC3300G;
import p245u0.C3308e;
import p245u0.C3309f;
import p254v4.C3368o;
import p265x4.C3470p;
import p267y0.C3479a;
import p267y0.C3480b;

/* JADX INFO: renamed from: Z2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1784a {

    /* JADX INFO: renamed from: a */
    public static C3309f f6094a;

    /* JADX INFO: renamed from: A */
    public static int m3187A(int i5, int i6) {
        if (i6 >= 268435456) {
            throw new IllegalStateException("data size out of limit");
        }
        int i7 = SharedPreferencesC0796n.f2547z;
        if (i6 <= i7) {
            return i7;
        }
        while (i5 < i6) {
            i5 <<= 1;
        }
        return i5;
    }

    /* JADX INFO: renamed from: B */
    public static LinkedHashSet m3188B(SharedPreferencesC0796n sharedPreferencesC0796n, C0790h c0790h) {
        String str = sharedPreferencesC0796n.f2549b;
        try {
            byte[] bArrM3486y = AbstractC1923e.m3486y(new File(sharedPreferencesC0796n.f2548a + str, (String) c0790h.f2532b));
            if (bArrM3486y == null) {
                Log.w("FastKV", str, new Exception("Read object data failed"));
                return null;
            }
            int i5 = bArrM3486y[0] & 255;
            String strM1340d = sharedPreferencesC0796n.f2555h.m1340d(bArrM3486y, 1, i5);
            C0800r c0800r = (C0800r) sharedPreferencesC0796n.f2550c.get(strM1340d);
            if (c0800r != null) {
                int i6 = i5 + 1;
                return c0800r.m1404a(bArrM3486y, i6, bArrM3486y.length - i6);
            }
            Log.w("FastKV", str, new Exception("No encoder for tag:".concat(strM1340d)));
            return null;
        } catch (Exception e5) {
            Log.e("FastKV", str, e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static String m3189C(SharedPreferencesC0796n sharedPreferencesC0796n, C0791i c0791i) {
        String str = sharedPreferencesC0796n.f2549b;
        try {
            byte[] bArrM3486y = AbstractC1923e.m3486y(new File(sharedPreferencesC0796n.f2548a + str, (String) c0791i.f2532b));
            if (bArrM3486y != null) {
                return new String(bArrM3486y, StandardCharsets.UTF_8);
            }
            return null;
        } catch (Exception e5) {
            Log.e("FastKV", str, e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static final int m3190D(int i5, int i6) {
        return (i5 >> i6) & 31;
    }

    /* JADX INFO: renamed from: E */
    public static void m3191E(SharedPreferencesC0796n sharedPreferencesC0796n) {
        long j5;
        String str = sharedPreferencesC0796n.f2548a;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC0796n.f2549b;
        File file = new File(str, AbstractC0231b.m403n(sb, str2, ".kva"));
        File file2 = new File(str, str2 + ".kvb");
        try {
            if (AbstractC1923e.m3452L(file) && AbstractC1923e.m3452L(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                sharedPreferencesC0796n.f2564q = randomAccessFile.getChannel();
                sharedPreferencesC0796n.f2565r = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = sharedPreferencesC0796n.f2564q;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : SharedPreferencesC0796n.f2547z);
                    sharedPreferencesC0796n.f2566s = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    FileChannel fileChannel2 = sharedPreferencesC0796n.f2565r;
                    if (length2 > 0) {
                        j5 = length2;
                    } else {
                        j5 = SharedPreferencesC0796n.f2547z;
                        fileChannel2 = fileChannel2;
                    }
                    MappedByteBuffer map2 = fileChannel2.map(mapMode, 0L, j5);
                    sharedPreferencesC0796n.f2567t = map2;
                    map2.order(byteOrder);
                    sharedPreferencesC0796n.f2555h = new C0793k(sharedPreferencesC0796n.f2566s.capacity(), 0);
                    if (length == 0 && length2 == 0) {
                        sharedPreferencesC0796n.f2551d = 12;
                        return;
                    } else {
                        m3196J(sharedPreferencesC0796n, length, length2);
                        return;
                    }
                } catch (IOException e5) {
                    Log.e("FastKV", str2, e5);
                    m3206T(sharedPreferencesC0796n);
                    m3209W(sharedPreferencesC0796n, file, file2);
                    return;
                }
            }
            Log.e("FastKV", str2, new Exception("open file failed"));
            m3206T(sharedPreferencesC0796n);
        } catch (Exception e6) {
            Log.e("FastKV", str2, e6);
            m3199M(sharedPreferencesC0796n);
            m3206T(sharedPreferencesC0796n);
        }
    }

    /* JADX INFO: renamed from: F */
    public static boolean m3192F(SharedPreferencesC0796n sharedPreferencesC0796n) {
        String str = sharedPreferencesC0796n.f2548a;
        StringBuilder sb = new StringBuilder();
        String str2 = sharedPreferencesC0796n.f2549b;
        File file = new File(str, AbstractC0231b.m403n(sb, str2, ".kvc"));
        File file2 = new File(str, str2 + ".tmp");
        boolean z5 = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!m3193G(sharedPreferencesC0796n, file)) {
                    m3199M(sharedPreferencesC0796n);
                    m3230p(sharedPreferencesC0796n);
                    return false;
                }
                if (sharedPreferencesC0796n.f2569v == 0) {
                    if (!m3214a0(sharedPreferencesC0796n, sharedPreferencesC0796n.f2555h)) {
                        sharedPreferencesC0796n.f2569v = 1;
                        return false;
                    }
                    AbstractC1922d.m3440w(sharedPreferencesC0796n, "recover from c file");
                    try {
                        m3230p(sharedPreferencesC0796n);
                        return true;
                    } catch (Exception e5) {
                        e = e5;
                        z5 = true;
                        Log.e("FastKV", str2, e);
                        return z5;
                    }
                }
            } else if (sharedPreferencesC0796n.f2569v != 0) {
                File file3 = new File(str, str2 + ".kva");
                File file4 = new File(str, str2 + ".kvb");
                if (file3.exists() && file4.exists()) {
                    m3209W(sharedPreferencesC0796n, file3, file4);
                }
            }
            return false;
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m3193G(SharedPreferencesC0796n sharedPreferencesC0796n, File file) {
        long length = file.length();
        if (length != 0 && length < 268435456) {
            int i5 = (int) length;
            int iM3187A = m3187A(SharedPreferencesC0796n.f2547z, i5);
            C0793k c0793k = sharedPreferencesC0796n.f2555h;
            if (c0793k == null || ((byte[]) c0793k.f2539g).length != iM3187A) {
                c0793k = new C0793k(0, new byte[iM3187A]);
                sharedPreferencesC0796n.f2555h = c0793k;
            } else {
                c0793k.f2537e = 0;
            }
            AbstractC1923e.m3455O(file, (byte[]) c0793k.f2539g, i5);
            int iM1344h = c0793k.m1344h();
            if (iM1344h >= 0) {
                int i6 = (-1073741825) & iM1344h;
                boolean z5 = (iM1344h & 1073741824) != 0;
                long jM1345i = c0793k.m1345i(c0793k.f2537e);
                c0793k.f2537e += 8;
                sharedPreferencesC0796n.f2551d = i6 + 12;
                if (i6 >= 0 && i6 <= i5 - 12 && jM1345i == c0793k.m1342f(12, i6) && AbstractC0797o.m1399x(sharedPreferencesC0796n, z5)) {
                    sharedPreferencesC0796n.f2552e = jM1345i;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static final long m3194H(C3480b c3480b, EnumC2983d0 enumC2983d0, C3479a c3479a) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j5;
        if (enumC2983d0 == null) {
            return c3480b.f10803c;
        }
        int i5 = c3479a.f10800a;
        if (i5 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c3480b.f10803c >> 32));
        } else {
            if (i5 != 2) {
                return c3480b.f10803c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (c3480b.f10803c & 4294967295L));
        }
        if (enumC2983d0 == EnumC2983d0.f9448e) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j5 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j5 = jFloatToRawIntBits3 << 32;
        }
        return j5 | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: I */
    public static final long m3195I(C3480b c3480b, EnumC2983d0 enumC2983d0, C3479a c3479a) {
        float fIntBitsToFloat;
        long j5 = c3480b.f10807g;
        if (enumC2983d0 == null) {
            return j5;
        }
        int i5 = c3479a.f10800a;
        if (i5 == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        } else {
            if (i5 != 2) {
                return j5;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        if (enumC2983d0 == EnumC2983d0.f9448e) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX INFO: renamed from: J */
    public static void m3196J(SharedPreferencesC0796n sharedPreferencesC0796n, long j5, long j6) {
        long j7;
        MappedByteBuffer mappedByteBuffer = sharedPreferencesC0796n.f2566s;
        String str = sharedPreferencesC0796n.f2549b;
        int i5 = mappedByteBuffer.getInt();
        int i6 = i5 & (-1073741825);
        boolean z5 = (i5 & 1073741824) != 0;
        long j8 = sharedPreferencesC0796n.f2566s.getLong();
        int i7 = sharedPreferencesC0796n.f2567t.getInt();
        int i8 = (-1073741825) & i7;
        boolean z6 = (1073741824 & i7) != 0;
        long j9 = sharedPreferencesC0796n.f2567t.getLong();
        if (i6 < 0) {
            j7 = 12;
        } else if (i6 <= j5 - 12) {
            sharedPreferencesC0796n.f2551d = i6 + 12;
            sharedPreferencesC0796n.f2566s.rewind();
            j7 = 12;
            sharedPreferencesC0796n.f2566s.get((byte[]) sharedPreferencesC0796n.f2555h.f2539g, 0, sharedPreferencesC0796n.f2551d);
            if (j8 == sharedPreferencesC0796n.f2555h.m1342f(12, i6) && AbstractC0797o.m1399x(sharedPreferencesC0796n, z5)) {
                sharedPreferencesC0796n.f2552e = j8;
                if (j5 == j6) {
                    byte[] bArr = new byte[sharedPreferencesC0796n.f2551d];
                    sharedPreferencesC0796n.f2567t.rewind();
                    sharedPreferencesC0796n.f2567t.get(bArr, 0, sharedPreferencesC0796n.f2551d);
                    byte[] bArr2 = (byte[]) sharedPreferencesC0796n.f2555h.f2539g;
                    for (int i9 = 0; i9 < sharedPreferencesC0796n.f2551d; i9++) {
                        if (bArr2[i9] == bArr[i9]) {
                        }
                    }
                    return;
                }
                Log.w("FastKV", str, new Exception("B file error"));
                m3228n(sharedPreferencesC0796n, sharedPreferencesC0796n.f2566s, sharedPreferencesC0796n.f2567t, sharedPreferencesC0796n.f2551d);
                return;
            }
        } else {
            j7 = 12;
        }
        if (i8 >= 0 && i8 <= j6 - j7) {
            sharedPreferencesC0796n.f2553f.clear();
            sharedPreferencesC0796n.f2560m = 0;
            sharedPreferencesC0796n.f2561n.clear();
            sharedPreferencesC0796n.f2551d = i8 + 12;
            if (((byte[]) sharedPreferencesC0796n.f2555h.f2539g).length != sharedPreferencesC0796n.f2567t.capacity()) {
                sharedPreferencesC0796n.f2555h = new C0793k(sharedPreferencesC0796n.f2567t.capacity(), 0);
            }
            sharedPreferencesC0796n.f2567t.rewind();
            sharedPreferencesC0796n.f2567t.get((byte[]) sharedPreferencesC0796n.f2555h.f2539g, 0, sharedPreferencesC0796n.f2551d);
            if (j9 == sharedPreferencesC0796n.f2555h.m1342f(12, i8) && AbstractC0797o.m1399x(sharedPreferencesC0796n, z6)) {
                Log.w("FastKV", str, new Exception("A file error"));
                m3228n(sharedPreferencesC0796n, sharedPreferencesC0796n.f2567t, sharedPreferencesC0796n.f2566s, sharedPreferencesC0796n.f2551d);
                sharedPreferencesC0796n.f2552e = j9;
                return;
            }
        }
        AbstractC1922d.m3430k(sharedPreferencesC0796n, "both files error");
        m3225k(sharedPreferencesC0796n);
    }

    /* JADX INFO: renamed from: K */
    public static MappedByteBuffer m3197K(FileChannel fileChannel, int i5) {
        try {
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i5);
            map.order(ByteOrder.LITTLE_ENDIAN);
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m3198L(SharedPreferencesC0796n sharedPreferencesC0796n, MappedByteBuffer mappedByteBuffer) throws IOException {
        MappedByteBuffer mappedByteBufferM3197K;
        int iCapacity = mappedByteBuffer.capacity();
        int i5 = SharedPreferencesC0796n.f2547z;
        if (iCapacity != i5) {
            FileChannel fileChannel = mappedByteBuffer == sharedPreferencesC0796n.f2566s ? sharedPreferencesC0796n.f2564q : sharedPreferencesC0796n.f2565r;
            try {
                fileChannel.truncate(i5);
                mappedByteBufferM3197K = m3197K(fileChannel, i5);
            } catch (IOException unused) {
                mappedByteBufferM3197K = null;
            }
            if (mappedByteBufferM3197K == null) {
                throw new IOException("Failed to truncate and remap buffer");
            }
            if (mappedByteBuffer == sharedPreferencesC0796n.f2566s) {
                sharedPreferencesC0796n.f2566s = mappedByteBufferM3197K;
            } else {
                sharedPreferencesC0796n.f2567t = mappedByteBufferM3197K;
            }
            mappedByteBuffer = mappedByteBufferM3197K;
        }
        mappedByteBuffer.putInt(0, 0);
        mappedByteBuffer.putLong(4, 0L);
    }

    /* JADX INFO: renamed from: M */
    public static void m3199M(SharedPreferencesC0796n sharedPreferencesC0796n) {
        sharedPreferencesC0796n.f2551d = 12;
        sharedPreferencesC0796n.f2552e = 0L;
        sharedPreferencesC0796n.f2553f.clear();
        sharedPreferencesC0796n.f2560m = 0;
        sharedPreferencesC0796n.f2561n.clear();
        C0793k c0793k = sharedPreferencesC0796n.f2555h;
        if (c0793k == null || ((byte[]) c0793k.f2539g).length != SharedPreferencesC0796n.f2547z) {
            sharedPreferencesC0796n.f2555h = new C0793k(SharedPreferencesC0796n.f2547z, 0);
        } else {
            c0793k.m1352r(0L, 4);
        }
        sharedPreferencesC0796n.f2555h.m1351q(0, 0);
    }

    /* JADX INFO: renamed from: N */
    public static int m3200N(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    /* JADX INFO: renamed from: O */
    public static long m3201O(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d5);
    }

    /* JADX INFO: renamed from: P */
    public static final void m3202P(C1439L c1439l, int i5, Object obj) {
        c1439l.f5100l[(c1439l.f5101m - c1439l.f5096h[c1439l.f5097i - 1].f5095b) + i5] = obj;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m3203Q(C1439L c1439l, int i5, Object obj, int i6, Object obj2) {
        int i7 = c1439l.f5101m - c1439l.f5096h[c1439l.f5097i - 1].f5095b;
        Object[] objArr = c1439l.f5100l;
        objArr[i5 + i7] = obj;
        objArr[i7 + i6] = obj2;
    }

    /* JADX INFO: renamed from: R */
    public static long m3204R(long j5, int i5) {
        int i6 = (i5 & 7) << 3;
        return (j5 >>> (64 - i6)) | (j5 << i6);
    }

    /* JADX INFO: renamed from: S */
    public static final void m3205S(Object obj) {
        if (obj instanceof C0884j) {
            throw ((C0884j) obj).f2771d;
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m3206T(SharedPreferencesC0796n sharedPreferencesC0796n) {
        sharedPreferencesC0796n.f2569v = 1;
        AbstractC1923e.m3475m(sharedPreferencesC0796n.f2564q);
        AbstractC1923e.m3475m(sharedPreferencesC0796n.f2565r);
        sharedPreferencesC0796n.f2564q = null;
        sharedPreferencesC0796n.f2565r = null;
        sharedPreferencesC0796n.f2566s = null;
        sharedPreferencesC0796n.f2567t = null;
    }

    /* JADX INFO: renamed from: U */
    public static final Class m3207U(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m3207U(((ParameterizedType) type).getRawType());
        }
        throw new C0888n("Cannot cast type " + type + " to java.lang.Class object.");
    }

    /* JADX INFO: renamed from: V */
    public static String m3208V(long j5) {
        int i5 = (int) (j5 >> 32);
        int i6 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i5) == Float.intBitsToFloat(i6)) {
            return "CornerRadius.circular(" + AbstractC1785a.m3258t(Float.intBitsToFloat(i5)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC1785a.m3258t(Float.intBitsToFloat(i5)) + ", " + AbstractC1785a.m3258t(Float.intBitsToFloat(i6)) + ')';
    }

    /* JADX INFO: renamed from: W */
    public static void m3209W(SharedPreferencesC0796n sharedPreferencesC0796n, File file, File file2) {
        String str = sharedPreferencesC0796n.f2549b;
        try {
            if (m3193G(sharedPreferencesC0796n, file)) {
                return;
            }
        } catch (IOException e5) {
            Log.w("FastKV", str, e5);
        }
        m3199M(sharedPreferencesC0796n);
        try {
            if (m3193G(sharedPreferencesC0796n, file2)) {
                return;
            }
        } catch (IOException e6) {
            Log.w("FastKV", str, e6);
        }
        m3199M(sharedPreferencesC0796n);
    }

    /* JADX INFO: renamed from: X */
    public static final long m3210X(long j5, long j6) {
        int iM2336d;
        int iM2338f = C1259L.m2338f(j5);
        int iM2337e = C1259L.m2337e(j5);
        if ((C1259L.m2338f(j6) < C1259L.m2337e(j5)) && (C1259L.m2338f(j5) < C1259L.m2337e(j6))) {
            if ((C1259L.m2338f(j6) <= C1259L.m2338f(j5)) && (C1259L.m2337e(j5) <= C1259L.m2337e(j6))) {
                iM2338f = C1259L.m2338f(j6);
                iM2337e = iM2338f;
            } else {
                if ((C1259L.m2338f(j5) <= C1259L.m2338f(j6)) && (C1259L.m2337e(j6) <= C1259L.m2337e(j5))) {
                    iM2336d = C1259L.m2336d(j6);
                } else {
                    int iM2338f2 = C1259L.m2338f(j6);
                    if (iM2338f >= C1259L.m2337e(j6) || iM2338f2 > iM2338f) {
                        iM2337e = C1259L.m2338f(j6);
                    } else {
                        iM2338f = C1259L.m2338f(j6);
                        iM2336d = C1259L.m2336d(j6);
                    }
                }
                iM2337e -= iM2336d;
            }
        } else if (iM2337e > C1259L.m2338f(j6)) {
            iM2338f -= C1259L.m2336d(j6);
            iM2336d = C1259L.m2336d(j6);
            iM2337e -= iM2336d;
        }
        return AbstractC1251D.m2313b(iM2338f, iM2337e);
    }

    /* JADX INFO: renamed from: Y */
    public static final C2684c m3211Y(InterfaceC0430v interfaceC0430v) {
        C2684c c2684cM691d = AbstractC0435z.m691d(interfaceC0430v, true);
        long jMo641i = interfaceC0430v.mo641i(c2684cM691d.m4653d());
        float f2 = c2684cM691d.f8560c;
        float f5 = c2684cM691d.f8561d;
        long jMo641i2 = interfaceC0430v.mo641i((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        return new C2684c(Float.intBitsToFloat((int) (jMo641i >> 32)), Float.intBitsToFloat((int) (jMo641i & 4294967295L)), Float.intBitsToFloat((int) (jMo641i2 >> 32)), Float.intBitsToFloat((int) (jMo641i2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: Z */
    public static final void m3212Z(C1128o c1128o, int i5, C1037h c1037h) {
        C1128o c1128o2;
        C1483e c1483e = new C1483e(new C1128o[16]);
        List listM2172i = c1128o.m2172i(false, false);
        while (true) {
            c1483e.m2755d(c1483e.f5183f, listM2172i);
            while (true) {
                int i6 = c1483e.f5183f;
                if (i6 == 0) {
                    return;
                }
                c1128o2 = (C1128o) c1483e.m2762k(i6 - 1);
                boolean zM2186e = AbstractC1131r.m2186e(c1128o2);
                C1125l c1125l = c1128o2.f3711d;
                C2408E c2408e = c1125l.f3702d;
                if (!zM2186e && !c2408e.m4268c(AbstractC1132s.f3746i)) {
                    AbstractC0596h0 abstractC0596h0M2167d = c1128o2.m2167d();
                    if (abstractC0596h0M2167d == null) {
                        throw AbstractC0231b.m396g("Expected semantics node to have a coordinator.");
                    }
                    C2015k c2015kM3508v = AbstractC1924f.m3508v(AbstractC0435z.m691d(abstractC0596h0M2167d, true));
                    if (c2015kM3508v.f6737a < c2015kM3508v.f6739c && c2015kM3508v.f6738b < c2015kM3508v.f6740d) {
                        Object objM4272g = c1125l.f3702d.m4272g(AbstractC1124k.f3680e);
                        if (objM4272g == null) {
                            objM4272g = null;
                        }
                        InterfaceC1603e interfaceC1603e = (InterfaceC1603e) objM4272g;
                        Object objM4272g2 = c2408e.m4272g(AbstractC1132s.f3759v);
                        C1122i c1122i = (C1122i) (objM4272g2 != null ? objM4272g2 : null);
                        if (interfaceC1603e == null || c1122i == null || ((Number) c1122i.f3650b.mo6a()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i7 = 1 + i5;
                        c1037h.mo1h(new C1038i(c1128o2, i7, c2015kM3508v, abstractC0596h0M2167d));
                        m3212Z(c1128o2, i7, c1037h);
                    }
                }
            }
            listM2172i = c1128o2.m2172i(false, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m3213a(final boolean z5, final InterfaceC1599a interfaceC1599a, InterfaceC1373m interfaceC1373m, final int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-361453782);
        int i6 = i5 | 6;
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(interfaceC1599a) ? 32 : 16;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            Object obj = (InterfaceC0439d) c1383r.m2590j(AbstractC0472a.f1395a);
            if (obj == null) {
                c1383r.m2568W(950836184);
                View view = (View) c1383r.m2590j(AbstractC0691Q.f2215f);
                AbstractC1665j.m2985e(view, "<this>");
                while (true) {
                    if (view == null) {
                        obj = null;
                        break;
                    }
                    Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
                    InterfaceC0439d interfaceC0439d = tag instanceof InterfaceC0439d ? (InterfaceC0439d) tag : null;
                    if (interfaceC0439d != null) {
                        obj = interfaceC0439d;
                        break;
                    } else {
                        Object objM3501m = AbstractC1924f.m3501m(view);
                        view = objM3501m instanceof View ? (View) objM3501m : null;
                    }
                }
                c1383r.m2597p(false);
            } else {
                c1383r.m2568W(950834231);
                c1383r.m2597p(false);
            }
            if (obj == null) {
                c1383r.m2568W(535274673);
                obj = (InterfaceC1811C) c1383r.m2590j(AbstractC1883f.f6405a);
                if (obj == null) {
                    c1383r.m2568W(1208426157);
                    View view2 = (View) c1383r.m2590j(AbstractC0691Q.f2215f);
                    AbstractC1665j.m2985e(view2, "<this>");
                    while (true) {
                        if (view2 == null) {
                            obj = null;
                            break;
                        }
                        Object tag2 = view2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        InterfaceC1811C interfaceC1811C = tag2 instanceof InterfaceC1811C ? (InterfaceC1811C) tag2 : null;
                        if (interfaceC1811C != null) {
                            obj = interfaceC1811C;
                            break;
                        } else {
                            Object objM3501m2 = AbstractC1924f.m3501m(view2);
                            view2 = objM3501m2 instanceof View ? (View) objM3501m2 : null;
                        }
                    }
                } else {
                    c1383r.m2568W(1208423708);
                }
                c1383r.m2597p(false);
                if (obj == null) {
                    c1383r.m2568W(1208428160);
                    Object baseContext = (Context) c1383r.m2590j(AbstractC0691Q.f2211b);
                    while (true) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            baseContext = null;
                            break;
                        } else if (baseContext instanceof InterfaceC1811C) {
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
                    }
                    obj = (InterfaceC1811C) baseContext;
                } else {
                    c1383r.m2568W(1208423789);
                }
                c1383r.m2597p(false);
            } else {
                c1383r.m2568W(535271790);
            }
            c1383r.m2597p(false);
            if (obj == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean zM2582f = c1383r.m2582f(obj);
            Object objM2558L = c1383r.m2558L();
            C1357e c1357e = C1371l.f4833a;
            if (zM2582f || objM2558L == c1357e) {
                InterfaceC0439d interfaceC0439d2 = obj instanceof InterfaceC0439d ? (InterfaceC0439d) obj : null;
                C0438c navigationEventDispatcher = interfaceC0439d2 != null ? interfaceC0439d2.getNavigationEventDispatcher() : null;
                InterfaceC1811C interfaceC1811C2 = obj instanceof InterfaceC1811C ? (InterfaceC1811C) obj : null;
                objM2558L = new C1949b(navigationEventDispatcher, interfaceC1811C2 != null ? interfaceC1811C2.getOnBackPressedDispatcher() : null);
                c1383r.m2585g0(objM2558L);
            }
            C1949b c1949b = (C1949b) objM2558L;
            long j5 = c1383r.f4882T;
            boolean zM2582f2 = c1383r.m2582f(c1949b) | c1383r.m2580e(j5);
            Object objM2558L2 = c1383r.m2558L();
            Object obj2 = objM2558L2;
            if (zM2582f2 || objM2558L2 == c1357e) {
                C1882e c1882e = new C1882e(new C1878a(j5, obj));
                c1882e.f6404c = new C1073T(12);
                c1383r.m2585g0(c1882e);
                obj2 = c1882e;
            }
            C1882e c1882e2 = (C1882e) obj2;
            c1383r.m2568W(-585307852);
            boolean zM2586h = c1383r.m2586h(c1882e2) | ((i6 & 112) == 32);
            Object objM2558L3 = c1383r.m2558L();
            if (zM2586h || objM2558L3 == c1357e) {
                objM2558L3 = new C0073m(19, c1882e2, interfaceC1599a);
                c1383r.m2585g0(objM2558L3);
            }
            AbstractC1385s.m2617g((InterfaceC1599a) objM2558L3, c1383r);
            int i7 = i6 & 14;
            boolean zM2586h2 = c1383r.m2586h(c1882e2) | (i7 == 4);
            Object objM2558L4 = c1383r.m2558L();
            if (zM2586h2 || objM2558L4 == c1357e) {
                objM2558L4 = new C0049a(17, c1882e2);
                c1383r.m2585g0(objM2558L4);
            }
            AbstractC0797o.m1378b(true, c1882e2, null, (InterfaceC1601c) objM2558L4, c1383r, i7);
            boolean zM2586h3 = c1383r.m2586h(c1949b) | c1383r.m2586h(c1882e2);
            Object objM2558L5 = c1383r.m2558L();
            if (zM2586h3 || objM2558L5 == c1357e) {
                objM2558L5 = new C0010F(9, c1949b, c1882e2);
                c1383r.m2585g0(objM2558L5);
            }
            AbstractC1385s.m2614d(c1949b, c1882e2, (InterfaceC1601c) objM2558L5, c1383r);
            c1383r.m2597p(false);
            z5 = true;
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e() { // from class: c.b
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iM2609A = AbstractC1385s.m2609A(i5 | 1);
                    AbstractC1784a.m3213a(z5, interfaceC1599a, (InterfaceC1373m) obj3, iM2609A);
                    return C0891q.f2780a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m3214a0(SharedPreferencesC0796n sharedPreferencesC0796n, C0793k c0793k) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        FileChannel.MapMode mapMode;
        ByteOrder byteOrder;
        String str = sharedPreferencesC0796n.f2549b;
        String str2 = sharedPreferencesC0796n.f2548a;
        try {
            int length = ((byte[]) c0793k.f2539g).length;
            File file = new File(str2, str + ".kva");
            File file2 = new File(str2, str + ".kvb");
            if (!AbstractC1923e.m3452L(file) || !AbstractC1923e.m3452L(file2)) {
                throw new Exception("open file failed");
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            long j5 = length;
            try {
                randomAccessFile.setLength(j5);
                FileChannel channel = randomAccessFile.getChannel();
                sharedPreferencesC0796n.f2564q = channel;
                mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = channel.map(mapMode, 0L, j5);
                sharedPreferencesC0796n.f2566s = map;
                byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                sharedPreferencesC0796n.f2566s.put((byte[]) c0793k.f2539g, 0, sharedPreferencesC0796n.f2551d);
                randomAccessFile2 = new RandomAccessFile(file2, "rw");
            } catch (Exception e5) {
                e = e5;
                randomAccessFile2 = null;
            }
            try {
                randomAccessFile2.setLength(j5);
                FileChannel channel2 = randomAccessFile2.getChannel();
                sharedPreferencesC0796n.f2565r = channel2;
                MappedByteBuffer map2 = channel2.map(mapMode, 0L, j5);
                sharedPreferencesC0796n.f2567t = map2;
                map2.order(byteOrder);
                sharedPreferencesC0796n.f2567t.put((byte[]) c0793k.f2539g, 0, sharedPreferencesC0796n.f2551d);
                return true;
            } catch (Exception e6) {
                e = e6;
                AbstractC1923e.m3475m(randomAccessFile);
                AbstractC1923e.m3475m(randomAccessFile2);
                sharedPreferencesC0796n.f2564q = null;
                sharedPreferencesC0796n.f2565r = null;
                sharedPreferencesC0796n.f2566s = null;
                sharedPreferencesC0796n.f2567t = null;
                Log.e("FastKV", str, e);
                return false;
            }
        } catch (Exception e7) {
            e = e7;
            randomAccessFile = null;
            randomAccessFile2 = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m3215b(String str, final C0073m c0073m, final C0010F c0010f, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1650225835);
        int i6 = i5 | (c1383r.m2582f(str) ? 4 : 2) | (c1383r.m2586h(c0073m) ? 32 : 16) | (c1383r.m2586h(c0010f) ? 256 : 128);
        final boolean z5 = false;
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            boolean z6 = (i6 & 14) == 4;
            Object objM2558L = c1383r.m2558L();
            if (z6 || objM2558L == C1371l.f4833a) {
                objM2558L = AbstractC1385s.m2629s(str);
                c1383r.m2585g0(objM2558L);
            }
            InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L;
            String string = AbstractC1976d.m3647o0((String) interfaceC1347Y.getValue()).toString();
            AbstractC1665j.m2985e(string, "<this>");
            final Long lM3658U = AbstractC1983k.m3658U(string, 10);
            if (lM3658U != null && lM3658U.longValue() > 0) {
                z5 = true;
            }
            AbstractC0489a.m753c(true, c0073m, null, AbstractC2352g.m4185H(R.string.chat_avatar_rotator_config_title, c1383r), null, AbstractC1848j.m3314c(-1729822504, new InterfaceC1604f() { // from class: L3.f
                @Override // p112W2.InterfaceC1604f
                /* JADX INFO: renamed from: f */
                public final Object mo5f(Object obj, Object obj2, Object obj3) {
                    InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    AbstractC1665j.m2985e((C3258a0) obj, "$this$NukeDialog");
                    C1383r c1383r2 = (C1383r) interfaceC1373m2;
                    if (c1383r2.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                        AbstractC0489a.m757g(AbstractC2352g.m4185H(R.string.home_settings_cancel, c1383r2), c0073m, null, false, 0, c1383r2, 0);
                        AbstractC3261c.m5516c(c1383r2, AbstractC3261c.m5539z(8));
                        String strM4185H = AbstractC2352g.m4185H(R.string.home_settings_save, c1383r2);
                        Long l3 = lM3658U;
                        boolean zM2582f = c1383r2.m2582f(l3);
                        C0010F c0010f2 = c0010f;
                        boolean zM2582f2 = zM2582f | c1383r2.m2582f(c0010f2);
                        Object objM2558L2 = c1383r2.m2558L();
                        if (zM2582f2 || objM2558L2 == C1371l.f4833a) {
                            objM2558L2 = new C0073m(11, l3, c0010f2);
                            c1383r2.m2585g0(objM2558L2);
                        }
                        AbstractC0489a.m754d(strM4185H, (InterfaceC1599a) objM2558L2, null, z5, 0, c1383r2, 0, 52);
                    } else {
                        c1383r2.m2563R();
                    }
                    return C0891q.f2780a;
                }
            }, c1383r), AbstractC1848j.m3314c(309709953, new C0021K0(2, interfaceC1347Y, z5), c1383r), c1383r, (i6 & 112) | 1769478, 20);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0095x(str, c0073m, c0010f, i5, 2);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m3216b0(SharedPreferencesC0796n sharedPreferencesC0796n) {
        String str = sharedPreferencesC0796n.f2549b;
        String str2 = sharedPreferencesC0796n.f2548a;
        try {
            File file = new File(str2, str + ".tmp");
            if (!AbstractC1923e.m3452L(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(sharedPreferencesC0796n.f2551d);
                randomAccessFile.write((byte[]) sharedPreferencesC0796n.f2555h.f2539g, 0, sharedPreferencesC0796n.f2551d);
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                File file2 = new File(str2, str + ".kvc");
                if (!(file.renameTo(file2) || ((!file2.exists() || file2.delete()) && file.renameTo(file2)))) {
                    Log.w("FastKV", str, new Exception("rename failed"));
                    return false;
                }
                ArrayList arrayList = sharedPreferencesC0796n.f2558k;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC0797o.m1393r().execute(new RunnableC0270g(2, sharedPreferencesC0796n, (String) it.next()));
                    }
                    arrayList.clear();
                }
                return true;
            } finally {
            }
        } catch (Exception e5) {
            Log.e("FastKV", str, e5);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C2270e m3217c(String str) {
        Set setSingleton = Collections.singleton(str);
        AbstractC1665j.m2984d(setSingleton, "singleton(...)");
        return new C2270e(setSingleton);
    }

    /* JADX INFO: renamed from: d */
    public static final void m3218d(String str, InterfaceC2207p interfaceC2207p, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r;
        String str2 = str;
        AbstractC1665j.m2985e(str2, "text");
        C1383r c1383r2 = (C1383r) interfaceC1373m;
        c1383r2.m2569X(-823847855);
        int i6 = i5 | (c1383r2.m2582f(str2) ? 4 : 2) | (c1383r2.m2582f(interfaceC2207p) ? 32 : 16);
        if (c1383r2.m2560O(i6 & 1, (i6 & 19) != 18)) {
            C0157b c0157b = (C0157b) c1383r2.m2590j(AbstractC0156a.f563i);
            C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.f10112c, C2194c.f7172p, c1383r2, 48);
            int iHashCode = Long.hashCode(c1383r2.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r2.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r2, interfaceC2207p);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
            c1383r2.m2571Z();
            if (c1383r2.f4881S) {
                c1383r2.m2592k(c0551b);
            } else {
                c1383r2.m2591j0();
            }
            AbstractC1385s.m2635y(c1383r2, C0591f.f1905e, c3289vM5564a);
            AbstractC1385s.m2635y(c1383r2, C0591f.f1904d, interfaceC1378o0M2593l);
            AbstractC1385s.m2627q(c1383r2, Integer.valueOf(iHashCode), C0591f.f1906f);
            AbstractC1385s.m2631u(c1383r2, C0591f.f1907g);
            AbstractC1385s.m2635y(c1383r2, C0591f.f1903c, interfaceC2207pM4016c);
            long j5 = c0157b.f573j;
            long jM3579v = AbstractC1926h.m3579v(13);
            C1587l c1587l = C1587l.f5503g;
            int i7 = i6 & 14;
            AbstractC1089e0.m2146b(str2, null, j5, jM3579v, c1587l, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r2, i7 | 102260736, 0, 261802);
            long j6 = c0157b.f574k;
            long jM3579v2 = AbstractC1926h.m3579v(13);
            long jM3579v3 = AbstractC1926h.m3579v(0);
            InterfaceC2207p interfaceC2207pM5521h = AbstractC3261c.m5521h(C2204m.f7185a, 16);
            Object objM2558L = c1383r2.m2558L();
            if (objM2558L == C1371l.f4833a) {
                objM2558L = new C2654f0(27);
                c1383r2.m2585g0(objM2558L);
            }
            InterfaceC2207p interfaceC2207pM4941l = AbstractC2767z.m4941l(interfaceC2207pM5521h, (InterfaceC1601c) objM2558L);
            float f2 = (float) 1.2d;
            float f5 = 0;
            if (C2010f.m3695a(f2, f5) > 0) {
                C2010f.m3695a(f2, f5);
            }
            str2 = str;
            AbstractC1089e0.m2146b(str2, AbstractC2767z.m4941l(interfaceC2207pM4941l, new C2478a(f2, f2, 0, true)), j6, jM3579v2, c1587l, null, jM3579v3, null, 0L, 0, false, 0, 0, null, c1383r2, i7 | 102260784, 0, 261800);
            c1383r = c1383r2;
            c1383r.m2597p(true);
        } else {
            c1383r = c1383r2;
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0501m(str2, interfaceC2207p, i5, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m3219e(C0066i0 c0066i0, C3480b c3480b, EnumC2983d0 enumC2983d0, C3479a c3479a, C1876u c1876u, long j5) {
        float fIntBitsToFloat;
        ArrayList arrayList = c1876u.f6386b;
        long j6 = c3480b.f10803c;
        boolean z5 = c3480b.f10804d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c3480b.f10803c & 4294967295L));
        boolean z6 = c3480b.f10808h;
        if (!z6 && z5) {
            c1876u.f6385a = 0;
            arrayList.clear();
        }
        if (!m3220f(c3480b) && (z6 || !z5)) {
            if (arrayList.size() == 3) {
                int i5 = c1876u.f6385a;
                c1876u.f6385a = i5 + 1;
                arrayList.set(i5, c3480b);
            } else {
                arrayList.add(c3480b);
            }
            if (c1876u.f6385a == 3) {
                c1876u.f6385a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((C3480b) arrayList.get(i6)).f10803c >> 32))));
            }
            fIntBitsToFloat2 = (float) AbstractC0973m.m2008O(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((C3480b) arrayList.get(i7)).f10803c & 4294967295L))));
            }
            fIntBitsToFloat3 = (float) AbstractC0973m.m2008O(arrayList3);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (enumC2983d0 != null) {
            int i8 = c3479a.f10800a;
            if (i8 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i8 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = enumC2983d0 == EnumC2983d0.f9448e ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((C0235b) c0066i0.f297e).m412a(c3480b.f10802b, C2683b.m4647e(jFloatToRawIntBits, j5));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m3220f(C3480b c3480b) {
        return c3480b.f10808h && !c3480b.f10804d;
    }

    /* JADX INFO: renamed from: g */
    public static final Object[] m3221g(Object[] objArr, int i5, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        AbstractC0972l.m1995S(objArr, objArr2, 0, i5, 6);
        AbstractC0972l.m1993Q(objArr, objArr2, i5 + 2, i5, objArr.length);
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: renamed from: h */
    public static final Object[] m3222h(int i5, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        AbstractC0972l.m1995S(objArr, objArr2, 0, i5, 6);
        AbstractC0972l.m1993Q(objArr, objArr2, i5, i5 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: i */
    public static final Object[] m3223i(int i5, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0972l.m1995S(objArr, objArr2, 0, i5, 6);
        AbstractC0972l.m1993Q(objArr, objArr2, i5, i5 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: j */
    public static final Bundle m3224j(C0882h... c0882hArr) {
        Bundle bundle = new Bundle(c0882hArr.length);
        for (C0882h c0882h : c0882hArr) {
            String str = (String) c0882h.f2769d;
            Object obj = c0882h.f2770e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                AbstractC1665j.m2982b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: k */
    public static void m3225k(SharedPreferencesC0796n sharedPreferencesC0796n) {
        if (sharedPreferencesC0796n.f2569v == 0) {
            try {
                m3198L(sharedPreferencesC0796n, sharedPreferencesC0796n.f2566s);
                m3198L(sharedPreferencesC0796n, sharedPreferencesC0796n.f2567t);
            } catch (Exception unused) {
                m3206T(sharedPreferencesC0796n);
            }
        }
        m3199M(sharedPreferencesC0796n);
        AbstractC1923e.m3481s(new File(sharedPreferencesC0796n.f2548a + sharedPreferencesC0796n.f2549b));
    }

    /* JADX INFO: renamed from: l */
    public static final long m3226l(long j5, EnumC2032c enumC2032c, EnumC2032c enumC2032c2) {
        AbstractC1665j.m2985e(enumC2032c, "sourceUnit");
        AbstractC1665j.m2985e(enumC2032c2, "targetUnit");
        return enumC2032c2.f6773d.convert(j5, enumC2032c.f6773d);
    }

    /* JADX INFO: renamed from: m */
    public static final long m3227m(long j5, EnumC2032c enumC2032c, EnumC2032c enumC2032c2) {
        AbstractC1665j.m2985e(enumC2032c, "sourceUnit");
        AbstractC1665j.m2985e(enumC2032c2, "targetUnit");
        return enumC2032c2.f6773d.convert(j5, enumC2032c.f6773d);
    }

    /* JADX INFO: renamed from: n */
    public static void m3228n(SharedPreferencesC0796n sharedPreferencesC0796n, MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i5) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            MappedByteBuffer mappedByteBufferM3197K = m3197K(mappedByteBuffer2 == sharedPreferencesC0796n.f2567t ? sharedPreferencesC0796n.f2565r : sharedPreferencesC0796n.f2564q, mappedByteBuffer.capacity());
            if (mappedByteBufferM3197K == null) {
                Log.e("FastKV", sharedPreferencesC0796n.f2549b, new Exception("map failed"));
                m3206T(sharedPreferencesC0796n);
                return;
            } else {
                if (mappedByteBuffer2 == sharedPreferencesC0796n.f2567t) {
                    sharedPreferencesC0796n.f2567t = mappedByteBufferM3197K;
                } else {
                    sharedPreferencesC0796n.f2566s = mappedByteBufferM3197K;
                }
                mappedByteBuffer2 = mappedByteBufferM3197K;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i5);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    /* JADX INFO: renamed from: o */
    public static final C0884j m3229o(Throwable th) {
        AbstractC1665j.m2985e(th, "exception");
        return new C0884j(th);
    }

    /* JADX INFO: renamed from: p */
    public static void m3230p(SharedPreferencesC0796n sharedPreferencesC0796n) {
        String str = sharedPreferencesC0796n.f2549b;
        String str2 = sharedPreferencesC0796n.f2548a;
        try {
            AbstractC1923e.m3481s(new File(str2, str + ".kvc"));
            AbstractC1923e.m3481s(new File(str2, str + ".tmp"));
        } catch (Exception e5) {
            Log.e("FastKV", str, e5);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m3231q(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX INFO: renamed from: r */
    public static long m3232r(int i5, int i6, int i7, int i8) {
        int i9 = 262142;
        int iMin = Math.min(i7, 262142);
        int iMin2 = i8 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i8, 262142);
        int i10 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i10 >= 8191) {
            if (i10 < 32767) {
                i9 = 65534;
            } else if (i10 < 65535) {
                i9 = 32766;
            } else {
                if (i10 >= 262143) {
                    AbstractC2006b.m3694k(i10);
                    throw new C0330q();
                }
                i9 = 8190;
            }
        }
        return AbstractC2006b.m3684a(Math.min(i9, i5), i6 != Integer.MAX_VALUE ? Math.min(i9, i6) : Integer.MAX_VALUE, iMin, iMin2);
    }

    /* JADX INFO: renamed from: s */
    public static long m3233s(int i5, int i6, int i7, int i8) {
        int i9 = 262142;
        int iMin = Math.min(i5, 262142);
        int iMin2 = i6 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i6, 262142);
        int i10 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i10 >= 8191) {
            if (i10 < 32767) {
                i9 = 65534;
            } else if (i10 < 65535) {
                i9 = 32766;
            } else {
                if (i10 >= 262143) {
                    AbstractC2006b.m3694k(i10);
                    throw new C0330q();
                }
                i9 = 8190;
            }
        }
        return AbstractC2006b.m3684a(iMin, iMin2, Math.min(i9, i7), i8 != Integer.MAX_VALUE ? Math.min(i9, i8) : Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: t */
    public static C3368o m3234t(DexKitBridge dexKitBridge, C3470p c3470p) {
        AbstractC1665j.m2985e(dexKitBridge, "bridge");
        int iM4685b = c3470p.m4685b(10);
        int i5 = iM4685b != 0 ? c3470p.f8592b.getInt(iM4685b + c3470p.f8591a) : 0;
        if ((i5 & 131072) > 0) {
            i5 = (i5 ^ 131072) | 32;
        }
        int i6 = i5;
        int iM4685b2 = c3470p.m4685b(4);
        int i7 = iM4685b2 != 0 ? c3470p.f8592b.getInt(iM4685b2 + c3470p.f8591a) : 0;
        int iM4685b3 = c3470p.m4685b(6);
        int i8 = iM4685b3 != 0 ? c3470p.f8592b.getInt(iM4685b3 + c3470p.f8591a) : 0;
        int iM4685b4 = c3470p.m4685b(8);
        int i9 = iM4685b4 != 0 ? c3470p.f8592b.getInt(iM4685b4 + c3470p.f8591a) : 0;
        int iM4685b5 = c3470p.m4685b(12);
        String strM4687d = iM4685b5 != 0 ? c3470p.m4687d(iM4685b5 + c3470p.f8591a) : null;
        if (strM4687d == null) {
            strM4687d = "";
        }
        String str = strM4687d;
        int iM4685b6 = c3470p.m4685b(14);
        int i10 = iM4685b6 != 0 ? c3470p.f8592b.getInt(iM4685b6 + c3470p.f8591a) : 0;
        ArrayList arrayList = new ArrayList();
        int iM4685b7 = c3470p.m4685b(16);
        int iM4689f = iM4685b7 != 0 ? c3470p.m4689f(iM4685b7) : 0;
        for (int i11 = 0; i11 < iM4689f; i11++) {
            int iM4685b8 = c3470p.m4685b(16);
            arrayList.add(Integer.valueOf(iM4685b8 != 0 ? c3470p.f8592b.getInt((i11 * 4) + c3470p.m4688e(iM4685b8)) : 0));
        }
        return new C3368o(dexKitBridge, i7, i8, i9, i6, str, i10, arrayList);
    }

    /* JADX INFO: renamed from: u */
    public static final C1660e m3235u(Annotation annotation) {
        AbstractC1665j.m2985e(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        AbstractC1665j.m2984d(clsAnnotationType, "annotationType(...)");
        return AbstractC1676u.m2995a(clsAnnotationType);
    }

    /* JADX INFO: renamed from: v */
    public static final String[] m3236v(InterfaceC2278m interfaceC2278m) {
        AbstractC1665j.m2983c(interfaceC2278m, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((C2270e) interfaceC2278m).f7423b.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: w */
    public static final C3309f m3237w() {
        C3309f c3309f = f6094a;
        if (c3309f != null) {
            return c3309f;
        }
        C3308e c3308e = new C3308e("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i5 = AbstractC3300G.f10208a;
        C2740O c2740o = new C2740O(C2762u.f8757b);
        C1706p c1706p = new C1706p(5);
        c1706p.m3033l(12.0f, 2.0f);
        c1706p.m3026e(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        c1706p.m3035n(4.48f, 10.0f, 10.0f, 10.0f);
        c1706p.m3035n(10.0f, -4.48f, 10.0f, -10.0f);
        c1706p.m3034m(17.52f, 2.0f, 12.0f, 2.0f);
        c1706p.m3025d();
        c1706p.m3033l(13.0f, 17.0f);
        c1706p.m3030i(-2.0f);
        c1706p.m3037p(-6.0f);
        c1706p.m3030i(2.0f);
        c1706p.m3037p(6.0f);
        c1706p.m3025d();
        c1706p.m3033l(13.0f, 9.0f);
        c1706p.m3030i(-2.0f);
        c1706p.m3031j(11.0f, 7.0f);
        c1706p.m3030i(2.0f);
        c1706p.m3037p(2.0f);
        c1706p.m3025d();
        C3308e.m5578a(c3308e, c1706p.f5857a, c2740o);
        C3309f c3309fM5579b = c3308e.m5579b();
        f6094a = c3309fM5579b;
        return c3309fM5579b;
    }

    /* JADX INFO: renamed from: x */
    public static final Class m3238x(InterfaceC1854b interfaceC1854b) {
        AbstractC1665j.m2985e(interfaceC1854b, "<this>");
        Class clsMo2977a = ((InterfaceC1659d) interfaceC1854b).mo2977a();
        AbstractC1665j.m2983c(clsMo2977a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo2977a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    public static final Class m3239y(InterfaceC1854b interfaceC1854b) {
        AbstractC1665j.m2985e(interfaceC1854b, "<this>");
        Class clsMo2977a = ((InterfaceC1659d) interfaceC1854b).mo2977a();
        if (clsMo2977a.isPrimitive()) {
            String name = clsMo2977a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo2977a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: z */
    public static final Class m3240z(C1660e c1660e) {
        Class clsMo2977a = c1660e.mo2977a();
        if (clsMo2977a.isPrimitive()) {
            return clsMo2977a;
        }
        String name = clsMo2977a.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }
}
