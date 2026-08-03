package Yue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n13896#2,14:3043\n13919#2,14:3057\n13942#2,14:3071\n13965#2,14:3085\n13988#2,14:3099\n14011#2,14:3113\n14034#2,14:3127\n14057#2,14:3141\n14080#2,14:3155\n16482#2,14:3169\n16505#2,14:3183\n16528#2,14:3197\n16551#2,14:3211\n16574#2,14:3225\n16597#2,14:3239\n16620#2,14:3253\n16643#2,14:3267\n16666#2,14:3281\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2434#1:3043,14\n2441#1:3057,14\n2448#1:3071,14\n2455#1:3085,14\n2462#1:3099,14\n2469#1:3113,14\n2476#1:3127,14\n2483#1:3141,14\n2490#1:3155,14\n2632#1:3169,14\n2639#1:3183,14\n2646#1:3197,14\n2653#1:3211,14\n2660#1:3225,14\n2667#1:3239,14\n2674#1:3253,14\n2681#1:3267,14\n2688#1:3281,14\n*E\n"})
public class C3404 extends C3403 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟$ۥ */
    public static final class C0131 extends AbstractC2986<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ byte[] f5491;

        public C0131(byte[] bArr) {
            this.f5491 = bArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return m491(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return m7357(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return this.f5491.length == 0;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return m7358(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f5491.length;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m491(byte b) {
            return C3411.m7554(this.f5491, b);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Byte get(int i) {
            return Byte.valueOf(this.f5491[i]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m7357(byte b) {
            return C3411.m7934(this.f5491, b);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m7358(byte b) {
            return C3411.m8042(this.f5491, b);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟$ۥ۟ */
    public static final class C0132 extends AbstractC2986<Short> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ short[] f5492;

        public C0132(short[] sArr) {
            this.f5492 = sArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Short) {
                return m492(((Number) obj).shortValue());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Short) {
                return m7360(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return this.f5492.length == 0;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                return m7361(((Number) obj).shortValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f5492.length;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m492(short s) {
            return C3411.m7561(this.f5492, s);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Short get(int i) {
            return Short.valueOf(this.f5492[i]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m7360(short s) {
            return C3411.m7941(this.f5492, s);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m7361(short s) {
            return C3411.m8049(this.f5492, s);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟$ۥ۟۟, reason: contains not printable characters */
    public static final class C3405 extends AbstractC2986<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int[] f5493;

        public C3405(int[] iArr) {
            this.f5493 = iArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return m493(((Number) obj).intValue());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return m7363(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return this.f5493.length == 0;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return m7364(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f5493.length;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m493(int i) {
            return C3411.m7558(this.f5493, i);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Integer get(int i) {
            return Integer.valueOf(this.f5493[i]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m7363(int i) {
            return C3411.m7938(this.f5493, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m7364(int i) {
            return C3411.m8046(this.f5493, i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C3406 extends AbstractC2986<Long> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ long[] f5494;

        public C3406(long[] jArr) {
            this.f5494 = jArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Long) {
                return m494(((Number) obj).longValue());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Long) {
                return m7366(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return this.f5494.length == 0;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                return m7367(((Number) obj).longValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f5494.length;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m494(long j) {
            return C3411.m7559(this.f5494, j);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Long get(int i) {
            return Long.valueOf(this.f5494[i]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m7366(long j) {
            return C3411.m7939(this.f5494, j);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m7367(long j) {
            return C3411.m8047(this.f5494, j);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12524#2,2:3043\n1687#2,6:3045\n1795#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3043,2\n201#1:3045,6\n202#1:3051,6\n*E\n"})
    public static final class C3407 extends AbstractC2986<Float> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ float[] f5495;

        public C3407(float[] fArr) {
            this.f5495 = fArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return m495(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return m7369(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return this.f5495.length == 0;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return m7370(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f5495.length;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m495(float f) {
            for (float f2 : this.f5495) {
                if (Float.floatToIntBits(f2) == Float.floatToIntBits(f)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(int i) {
            return Float.valueOf(this.f5495[i]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m7369(float f) {
            float[] fArr = this.f5495;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m7370(float f) {
            float[] fArr = this.f5495;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12534#2,2:3043\n1699#2,6:3045\n1807#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3043,2\n215#1:3045,6\n216#1:3051,6\n*E\n"})
    public static final class C3408 extends AbstractC2986<Double> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ double[] f5496;

        public C3408(double[] dArr) {
            this.f5496 = dArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Double) {
                return m496(((Number) obj).doubleValue());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Double) {
                return m7372(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return this.f5496.length == 0;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                return m7373(((Number) obj).doubleValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f5496.length;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m496(double d) {
            for (double d2 : this.f5496) {
                if (Double.doubleToLongBits(d2) == Double.doubleToLongBits(d)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Double get(int i) {
            return Double.valueOf(this.f5496[i]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m7372(double d) {
            double[] dArr = this.f5496;
            int length = dArr.length;
            for (int i = 0; i < length; i++) {
                if (Double.doubleToLongBits(dArr[i]) == Double.doubleToLongBits(d)) {
                    return i;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m7373(double d) {
            double[] dArr = this.f5496;
            int length = dArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(d)) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C3409 extends AbstractC2986<Boolean> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ boolean[] f5497;

        public C3409(boolean[] zArr) {
            this.f5497 = zArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Boolean) {
                return m497(((Boolean) obj).booleanValue());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                return m7375(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return this.f5497.length == 0;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                return m7376(((Boolean) obj).booleanValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f5497.length;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m497(boolean z) {
            return C3411.m7562(this.f5497, z);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Boolean get(int i) {
            return Boolean.valueOf(this.f5497[i]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m7375(boolean z) {
            return C3411.m7942(this.f5497, z);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m7376(boolean z) {
            return C3411.m8050(this.f5497, z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢ۟۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C3410 extends AbstractC2986<Character> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ char[] f5498;

        public C3410(char[] cArr) {
            this.f5498 = cArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Character) {
                return m498(((Character) obj).charValue());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Character) {
                return m7378(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return this.f5498.length == 0;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return m7379(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return this.f5498.length;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m498(char c) {
            return C3411.m7555(this.f5498, c);
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // Yue.AbstractC2986, java.util.List
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Character get(int i) {
            return Character.valueOf(this.f5498[i]);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m7378(char c) {
            return C3411.m7935(this.f5498, c);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m7379(char c) {
            return C3411.m8043(this.f5498, c);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final List<Byte> m7063(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        return new C0131(bArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final List<Character> m7064(@InterfaceC6399 char[] cArr) {
        C5499.m17103(cArr, "<this>");
        return new C3410(cArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static List<Double> m7065(@InterfaceC6399 double[] dArr) {
        C5499.m17103(dArr, "<this>");
        return new C3408(dArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final List<Float> m7066(@InterfaceC6399 float[] fArr) {
        C5499.m17103(fArr, "<this>");
        return new C3407(fArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static List<Integer> m7067(@InterfaceC6399 int[] iArr) {
        C5499.m17103(iArr, "<this>");
        return new C3405(iArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static List<Long> m7068(@InterfaceC6399 long[] jArr) {
        C5499.m17103(jArr, "<this>");
        return new C3406(jArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static <T> List<T> m7069(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "<this>");
        List<T> listM502 = C3438.m502(tArr);
        C5499.m17102(listM502, "asList(this)");
        return listM502;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final List<Short> m7070(@InterfaceC6399 short[] sArr) {
        C5499.m17103(sArr, "<this>");
        return new C0132(sArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final List<Boolean> m7071(@InterfaceC6399 boolean[] zArr) {
        C5499.m17103(zArr, "<this>");
        return new C3409(zArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int m7072(@InterfaceC6399 byte[] bArr, byte b, int i, int i2) {
        C5499.m17103(bArr, "<this>");
        return Arrays.binarySearch(bArr, i, i2, b);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int m7073(@InterfaceC6399 char[] cArr, char c, int i, int i2) {
        C5499.m17103(cArr, "<this>");
        return Arrays.binarySearch(cArr, i, i2, c);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int m7074(@InterfaceC6399 double[] dArr, double d, int i, int i2) {
        C5499.m17103(dArr, "<this>");
        return Arrays.binarySearch(dArr, i, i2, d);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int m7075(@InterfaceC6399 float[] fArr, float f, int i, int i2) {
        C5499.m17103(fArr, "<this>");
        return Arrays.binarySearch(fArr, i, i2, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int m7076(@InterfaceC6399 int[] iArr, int i, int i2, int i3) {
        C5499.m17103(iArr, "<this>");
        return Arrays.binarySearch(iArr, i2, i3, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int m7077(@InterfaceC6399 long[] jArr, long j, int i, int i2) {
        C5499.m17103(jArr, "<this>");
        return Arrays.binarySearch(jArr, i, i2, j);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T> int m7078(@InterfaceC6399 T[] tArr, T t, int i, int i2) {
        C5499.m17103(tArr, "<this>");
        return Arrays.binarySearch(tArr, i, i2, t);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final <T> int m7079(@InterfaceC6399 T[] tArr, T t, @InterfaceC6399 Comparator<? super T> comparator, int i, int i2) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int m7080(@InterfaceC6399 short[] sArr, short s, int i, int i2) {
        C5499.m17103(sArr, "<this>");
        return Arrays.binarySearch(sArr, i, i2, s);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ int m7081(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return m7072(bArr, b, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ int m7082(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return m7073(cArr, c, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ int m7083(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return m7074(dArr, d, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ int m7084(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return m7075(fArr, f, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ int m7085(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return m7076(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m7086(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return m7077(jArr, j, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ int m7087(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return m7078(objArr, obj, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ int m7088(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return m7079(objArr, obj, comparator, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ int m7089(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return m7080(sArr, s, i, i2);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC5572(name = "contentDeepEqualsInline")
    @InterfaceC5438
    @InterfaceC5890
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final <T> boolean m7090(T[] tArr, T[] tArr2) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(tArr2, "other");
        return C3403.m7056(tArr, tArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "contentDeepEqualsNullable")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final <T> boolean m7091(T[] tArr, T[] tArr2) {
        return C6671.m3162(1, 3, 0) ? C3403.m7056(tArr, tArr2) : Arrays.deepEquals(tArr, tArr2);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC5572(name = "contentDeepHashCodeInline")
    @InterfaceC5438
    @InterfaceC5890
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final <T> int m7092(T[] tArr) {
        C5499.m17103(tArr, "<this>");
        return C3402.m490(tArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "contentDeepHashCodeNullable")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final <T> int m7093(T[] tArr) {
        return C6671.m3162(1, 3, 0) ? C3402.m490(tArr) : Arrays.deepHashCode(tArr);
    }

    @InterfaceC7470(version = "1.1")
    @InterfaceC5572(name = "contentDeepToStringInline")
    @InterfaceC5438
    @InterfaceC5890
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final <T> String m7094(T[] tArr) {
        C5499.m17103(tArr, "<this>");
        return C3403.m7057(tArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "contentDeepToStringNullable")
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final <T> String m7095(T[] tArr) {
        if (C6671.m3162(1, 3, 0)) {
            return C3403.m7057(tArr);
        }
        String strDeepToString = Arrays.deepToString(tArr);
        C5499.m17102(strDeepToString, "deepToString(this)");
        return strDeepToString;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final boolean m7096(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final boolean m7097(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m7098(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean m7099(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final boolean m7100(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final boolean m7101(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final <T> boolean m7102(T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final boolean m7103(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final boolean m7104(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final int m7105(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final int m7106(char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int m7107(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final int m7108(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final int m7109(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final int m7110(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final <T> int m7111(T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final int m7112(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int m7113(boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final String m7114(byte[] bArr) {
        String string = Arrays.toString(bArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final String m7115(char[] cArr) {
        String string = Arrays.toString(cArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final String m7116(double[] dArr) {
        String string = Arrays.toString(dArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final String m7117(float[] fArr) {
        String string = Arrays.toString(fArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final String m7118(int[] iArr) {
        String string = Arrays.toString(iArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final String m7119(long[] jArr) {
        String string = Arrays.toString(jArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final <T> String m7120(T[] tArr) {
        String string = Arrays.toString(tArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final String m7121(short[] sArr) {
        String string = Arrays.toString(sArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final String m7122(boolean[] zArr) {
        String string = Arrays.toString(zArr);
        C5499.m17102(string, "toString(this)");
        return string;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static byte[] m7123(@InterfaceC6399 byte[] bArr, @InterfaceC6399 byte[] bArr2, int i, int i2, int i3) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final char[] m7124(@InterfaceC6399 char[] cArr, @InterfaceC6399 char[] cArr2, int i, int i2, int i3) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(cArr2, "destination");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final double[] m7125(@InterfaceC6399 double[] dArr, @InterfaceC6399 double[] dArr2, int i, int i2, int i3) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(dArr2, "destination");
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final float[] m7126(@InterfaceC6399 float[] fArr, @InterfaceC6399 float[] fArr2, int i, int i2, int i3) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static int[] m7127(@InterfaceC6399 int[] iArr, @InterfaceC6399 int[] iArr2, int i, int i2, int i3) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static long[] m7128(@InterfaceC6399 long[] jArr, @InterfaceC6399 long[] jArr2, int i, int i2, int i3) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static <T> T[] m7129(@InterfaceC6399 T[] tArr, @InterfaceC6399 T[] tArr2, int i, int i2, int i3) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static short[] m7130(@InterfaceC6399 short[] sArr, @InterfaceC6399 short[] sArr2, int i, int i2, int i3) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(sArr2, "destination");
        System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final boolean[] m7131(@InterfaceC6399 boolean[] zArr, @InterfaceC6399 boolean[] zArr2, int i, int i2, int i3) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(zArr2, "destination");
        System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static /* synthetic */ byte[] m7132(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m7123(bArr, bArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static /* synthetic */ char[] m7133(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return m7124(cArr, cArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static /* synthetic */ double[] m7134(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return m7125(dArr, dArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static /* synthetic */ float[] m7135(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return m7126(fArr, fArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static /* synthetic */ int[] m7136(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return m7127(iArr, iArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static /* synthetic */ long[] m7137(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return m7128(jArr, jArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static /* synthetic */ Object[] m7138(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m7129(objArr, objArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static /* synthetic */ short[] m7139(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return m7130(sArr, sArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static /* synthetic */ boolean[] m7140(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return m7131(zArr, zArr2, i, i2, i3);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final byte[] m7141(byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C5499.m17102(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final byte[] m7142(byte[] bArr, int i) {
        C5499.m17103(bArr, "<this>");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        C5499.m17102(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final char[] m7143(char[] cArr) {
        C5499.m17103(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, cArr.length);
        C5499.m17102(cArrCopyOf, "copyOf(this, size)");
        return cArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final char[] m7144(char[] cArr, int i) {
        C5499.m17103(cArr, "<this>");
        char[] cArrCopyOf = Arrays.copyOf(cArr, i);
        C5499.m17102(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final double[] m7145(double[] dArr) {
        C5499.m17103(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        C5499.m17102(dArrCopyOf, "copyOf(this, size)");
        return dArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final double[] m7146(double[] dArr, int i) {
        C5499.m17103(dArr, "<this>");
        double[] dArrCopyOf = Arrays.copyOf(dArr, i);
        C5499.m17102(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final float[] m7147(float[] fArr) {
        C5499.m17103(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        C5499.m17102(fArrCopyOf, "copyOf(this, size)");
        return fArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final float[] m7148(float[] fArr, int i) {
        C5499.m17103(fArr, "<this>");
        float[] fArrCopyOf = Arrays.copyOf(fArr, i);
        C5499.m17102(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final int[] m7149(int[] iArr) {
        C5499.m17103(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        C5499.m17102(iArrCopyOf, "copyOf(this, size)");
        return iArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final int[] m7150(int[] iArr, int i) {
        C5499.m17103(iArr, "<this>");
        int[] iArrCopyOf = Arrays.copyOf(iArr, i);
        C5499.m17102(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final long[] m7151(long[] jArr) {
        C5499.m17103(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        C5499.m17102(jArrCopyOf, "copyOf(this, size)");
        return jArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final long[] m7152(long[] jArr, int i) {
        C5499.m17103(jArr, "<this>");
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        C5499.m17102(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final <T> T[] m7153(T[] tArr) {
        C5499.m17103(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        C5499.m17102(tArr2, "copyOf(this, size)");
        return tArr2;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final <T> T[] m7154(T[] tArr, int i) {
        C5499.m17103(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        C5499.m17102(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final short[] m7155(short[] sArr) {
        C5499.m17103(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        C5499.m17102(sArrCopyOf, "copyOf(this, size)");
        return sArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final short[] m7156(short[] sArr, int i) {
        C5499.m17103(sArr, "<this>");
        short[] sArrCopyOf = Arrays.copyOf(sArr, i);
        C5499.m17102(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final boolean[] m7157(boolean[] zArr) {
        C5499.m17103(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        C5499.m17102(zArrCopyOf, "copyOf(this, size)");
        return zArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final boolean[] m7158(boolean[] zArr, int i) {
        C5499.m17103(zArr, "<this>");
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
        C5499.m17102(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static byte[] m7159(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "<this>");
        C3402.m7052(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C5499.m17102(bArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return bArrCopyOfRange;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final char[] m7160(@InterfaceC6399 char[] cArr, int i, int i2) {
        C5499.m17103(cArr, "<this>");
        C3402.m7052(i2, cArr.length);
        char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i, i2);
        C5499.m17102(cArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return cArrCopyOfRange;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final double[] m7161(@InterfaceC6399 double[] dArr, int i, int i2) {
        C5499.m17103(dArr, "<this>");
        C3402.m7052(i2, dArr.length);
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i, i2);
        C5499.m17102(dArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return dArrCopyOfRange;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final float[] m7162(@InterfaceC6399 float[] fArr, int i, int i2) {
        C5499.m17103(fArr, "<this>");
        C3402.m7052(i2, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i, i2);
        C5499.m17102(fArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return fArrCopyOfRange;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static int[] m7163(@InterfaceC6399 int[] iArr, int i, int i2) {
        C5499.m17103(iArr, "<this>");
        C3402.m7052(i2, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i, i2);
        C5499.m17102(iArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return iArrCopyOfRange;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static long[] m7164(@InterfaceC6399 long[] jArr, int i, int i2) {
        C5499.m17103(jArr, "<this>");
        C3402.m7052(i2, jArr.length);
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i, i2);
        C5499.m17102(jArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return jArrCopyOfRange;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static <T> T[] m7165(@InterfaceC6399 T[] tArr, int i, int i2) {
        C5499.m17103(tArr, "<this>");
        C3402.m7052(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        C5499.m17102(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static short[] m7166(@InterfaceC6399 short[] sArr, int i, int i2) {
        C5499.m17103(sArr, "<this>");
        C3402.m7052(i2, sArr.length);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i, i2);
        C5499.m17102(sArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return sArrCopyOfRange;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC5572(name = "copyOfRange")
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final boolean[] m7167(@InterfaceC6399 boolean[] zArr, int i, int i2) {
        C5499.m17103(zArr, "<this>");
        C3402.m7052(i2, zArr.length);
        boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i, i2);
        C5499.m17102(zArrCopyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return zArrCopyOfRange;
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final byte[] m7168(byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return m7159(bArr, i, i2);
        }
        if (i2 <= bArr.length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
            C5499.m17102(bArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + bArr.length);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final char[] m7169(char[] cArr, int i, int i2) {
        C5499.m17103(cArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return m7160(cArr, i, i2);
        }
        if (i2 <= cArr.length) {
            char[] cArrCopyOfRange = Arrays.copyOfRange(cArr, i, i2);
            C5499.m17102(cArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return cArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + cArr.length);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final double[] m7170(double[] dArr, int i, int i2) {
        C5499.m17103(dArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return m7161(dArr, i, i2);
        }
        if (i2 <= dArr.length) {
            double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i, i2);
            C5499.m17102(dArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return dArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + dArr.length);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final float[] m7171(float[] fArr, int i, int i2) {
        C5499.m17103(fArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return m7162(fArr, i, i2);
        }
        if (i2 <= fArr.length) {
            float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i, i2);
            C5499.m17102(fArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return fArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + fArr.length);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final int[] m7172(int[] iArr, int i, int i2) {
        C5499.m17103(iArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return m7163(iArr, i, i2);
        }
        if (i2 <= iArr.length) {
            int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i, i2);
            C5499.m17102(iArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return iArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + iArr.length);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final long[] m7173(long[] jArr, int i, int i2) {
        C5499.m17103(jArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return m7164(jArr, i, i2);
        }
        if (i2 <= jArr.length) {
            long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i, i2);
            C5499.m17102(jArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return jArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + jArr.length);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final <T> T[] m7174(T[] tArr, int i, int i2) {
        C5499.m17103(tArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return (T[]) m7165(tArr, i, i2);
        }
        if (i2 <= tArr.length) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
            C5499.m17102(tArr2, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return tArr2;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + tArr.length);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final short[] m7175(short[] sArr, int i, int i2) {
        C5499.m17103(sArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return m7166(sArr, i, i2);
        }
        if (i2 <= sArr.length) {
            short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i, i2);
            C5499.m17102(sArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return sArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + sArr.length);
    }

    @InterfaceC5438
    @InterfaceC5572(name = "copyOfRangeInline")
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final boolean[] m7176(boolean[] zArr, int i, int i2) {
        C5499.m17103(zArr, "<this>");
        if (C6671.m3162(1, 3, 0)) {
            return m7167(zArr, i, i2);
        }
        if (i2 <= zArr.length) {
            boolean[] zArrCopyOfRange = Arrays.copyOfRange(zArr, i, i2);
            C5499.m17102(zArrCopyOfRange, "{\n        if (toIndex > …fromIndex, toIndex)\n    }");
            return zArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + zArr.length);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final byte m7177(byte[] bArr, int i) {
        C5499.m17103(bArr, "<this>");
        return bArr[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final char m7178(char[] cArr, int i) {
        C5499.m17103(cArr, "<this>");
        return cArr[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final double m7179(double[] dArr, int i) {
        C5499.m17103(dArr, "<this>");
        return dArr[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final float m7180(float[] fArr, int i) {
        C5499.m17103(fArr, "<this>");
        return fArr[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final int m7181(int[] iArr, int i) {
        C5499.m17103(iArr, "<this>");
        return iArr[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final long m7182(long[] jArr, int i) {
        C5499.m17103(jArr, "<this>");
        return jArr[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final <T> T m7183(T[] tArr, int i) {
        C5499.m17103(tArr, "<this>");
        return tArr[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final short m7184(short[] sArr, int i) {
        C5499.m17103(sArr, "<this>");
        return sArr[i];
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final boolean m7185(boolean[] zArr, int i) {
        C5499.m17103(zArr, "<this>");
        return zArr[i];
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static void m7186(@InterfaceC6399 byte[] bArr, byte b, int i, int i2) {
        C5499.m17103(bArr, "<this>");
        Arrays.fill(bArr, i, i2, b);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static final void m7187(@InterfaceC6399 char[] cArr, char c, int i, int i2) {
        C5499.m17103(cArr, "<this>");
        Arrays.fill(cArr, i, i2, c);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static final void m7188(@InterfaceC6399 double[] dArr, double d, int i, int i2) {
        C5499.m17103(dArr, "<this>");
        Arrays.fill(dArr, i, i2, d);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static final void m7189(@InterfaceC6399 float[] fArr, float f, int i, int i2) {
        C5499.m17103(fArr, "<this>");
        Arrays.fill(fArr, i, i2, f);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static void m7190(@InterfaceC6399 int[] iArr, int i, int i2, int i3) {
        C5499.m17103(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static void m7191(@InterfaceC6399 long[] jArr, long j, int i, int i2) {
        C5499.m17103(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static <T> void m7192(@InterfaceC6399 T[] tArr, T t, int i, int i2) {
        C5499.m17103(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static void m7193(@InterfaceC6399 short[] sArr, short s, int i, int i2) {
        C5499.m17103(sArr, "<this>");
        Arrays.fill(sArr, i, i2, s);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static final void m7194(@InterfaceC6399 boolean[] zArr, boolean z, int i, int i2) {
        C5499.m17103(zArr, "<this>");
        Arrays.fill(zArr, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ void m7195(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        m7186(bArr, b, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ void m7196(char[] cArr, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        m7187(cArr, c, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m7197(double[] dArr, double d, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        m7188(dArr, d, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ void m7198(float[] fArr, float f, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        m7189(fArr, f, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ void m7199(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m7190(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ void m7200(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        m7191(jArr, j, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ void m7201(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m7192(objArr, obj, i, i2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m7202(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        m7193(sArr, s, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ void m7203(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        m7194(zArr, z, i, i2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static final <R> List<R> m7204(@InterfaceC6399 Object[] objArr, @InterfaceC6399 Class<R> cls) {
        C5499.m17103(objArr, "<this>");
        C5499.m17103(cls, "klass");
        return (List) m7205(objArr, new ArrayList(), cls);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static final <C extends Collection<? super R>, R> C m7205(@InterfaceC6399 Object[] objArr, @InterfaceC6399 C c, @InterfaceC6399 Class<R> cls) {
        C5499.m17103(objArr, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(cls, "klass");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static final /* synthetic */ Byte m7206(byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        return C3411.m8198(bArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static final /* synthetic */ Character m7207(char[] cArr) {
        C5499.m17103(cArr, "<this>");
        return C3411.m8199(cArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Comparable m7208(Comparable[] comparableArr) {
        C5499.m17103(comparableArr, "<this>");
        return C3411.m8200(comparableArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final /* synthetic */ Double m7209(double[] dArr) {
        C5499.m17103(dArr, "<this>");
        return C3411.m8201(dArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final /* synthetic */ Double m7210(Double[] dArr) {
        C5499.m17103(dArr, "<this>");
        return C3411.m8202(dArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final /* synthetic */ Float m7211(float[] fArr) {
        C5499.m17103(fArr, "<this>");
        return C3411.m8203(fArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final /* synthetic */ Float m7212(Float[] fArr) {
        C5499.m17103(fArr, "<this>");
        return C3411.m8204(fArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static final /* synthetic */ Integer m7213(int[] iArr) {
        C5499.m17103(iArr, "<this>");
        return C3411.m8205(iArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ Long m7214(long[] jArr) {
        C5499.m17103(jArr, "<this>");
        return C3411.m8206(jArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Short m7215(short[] sArr) {
        C5499.m17103(sArr, "<this>");
        return C3411.m8207(sArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean m7216(boolean[] zArr, InterfaceC5124<? super Boolean, ? extends R> interfaceC5124) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int iM7878 = C3411.m7878(zArr);
        if (iM7878 == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = interfaceC5124.invoke(Boolean.valueOf(z));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7878).iterator();
        while (abstractC5455M16967.hasNext()) {
            boolean z2 = zArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Boolean.valueOf(z2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                z = z2;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte m7217(byte[] bArr, InterfaceC5124<? super Byte, ? extends R> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int iM7870 = C3411.m7870(bArr);
        if (iM7870 == 0) {
            return Byte.valueOf(b);
        }
        R rInvoke = interfaceC5124.invoke(Byte.valueOf(b));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7870).iterator();
        while (abstractC5455M16967.hasNext()) {
            byte b2 = bArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Byte.valueOf(b2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                b = b2;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m7218(char[] cArr, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int iM7871 = C3411.m7871(cArr);
        if (iM7871 == 0) {
            return Character.valueOf(c);
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(c));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7871).iterator();
        while (abstractC5455M16967.hasNext()) {
            char c2 = cArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(c2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                c = c2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Double m7219(double[] dArr, InterfaceC5124<? super Double, ? extends R> interfaceC5124) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int iM7872 = C3411.m7872(dArr);
        if (iM7872 == 0) {
            return Double.valueOf(d);
        }
        R rInvoke = interfaceC5124.invoke(Double.valueOf(d));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7872).iterator();
        while (abstractC5455M16967.hasNext()) {
            double d2 = dArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Double.valueOf(d2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                d = d2;
                rInvoke = rInvoke2;
            }
        }
        return Double.valueOf(d);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Float m7220(float[] fArr, InterfaceC5124<? super Float, ? extends R> interfaceC5124) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int iM7873 = C3411.m7873(fArr);
        if (iM7873 == 0) {
            return Float.valueOf(f);
        }
        R rInvoke = interfaceC5124.invoke(Float.valueOf(f));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7873).iterator();
        while (abstractC5455M16967.hasNext()) {
            float f2 = fArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Float.valueOf(f2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                f = f2;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer m7221(int[] iArr, InterfaceC5124<? super Integer, ? extends R> interfaceC5124) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int iM7874 = C3411.m7874(iArr);
        if (iM7874 == 0) {
            return Integer.valueOf(i);
        }
        R rInvoke = interfaceC5124.invoke(Integer.valueOf(i));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7874).iterator();
        while (abstractC5455M16967.hasNext()) {
            int i2 = iArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Integer.valueOf(i2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                i = i2;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Long m7222(long[] jArr, InterfaceC5124<? super Long, ? extends R> interfaceC5124) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int iM7875 = C3411.m7875(jArr);
        if (iM7875 == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = interfaceC5124.invoke(Long.valueOf(j));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7875).iterator();
        while (abstractC5455M16967.hasNext()) {
            long j2 = jArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Long.valueOf(j2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                j = j2;
                rInvoke = rInvoke2;
            }
        }
        return Long.valueOf(j);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m7223(T[] tArr, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int iM7876 = C3411.m7876(tArr);
        if (iM7876 != 0) {
            R rInvoke = interfaceC5124.invoke(t);
            AbstractC5455 abstractC5455M16967 = new C5458(1, iM7876).iterator();
            while (abstractC5455M16967.hasNext()) {
                T t2 = tArr[abstractC5455M16967.mo471()];
                R rInvoke2 = interfaceC5124.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return t;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Short m7224(short[] sArr, InterfaceC5124<? super Short, ? extends R> interfaceC5124) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int iM7877 = C3411.m7877(sArr);
        if (iM7877 == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = interfaceC5124.invoke(Short.valueOf(s));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7877).iterator();
        while (abstractC5455M16967.hasNext()) {
            short s2 = sArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Short.valueOf(s2));
            if (rInvoke.compareTo(rInvoke2) < 0) {
                s = s2;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static final /* synthetic */ Boolean m7225(boolean[] zArr, Comparator comparator) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8218(zArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public static final /* synthetic */ Byte m7226(byte[] bArr, Comparator comparator) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8219(bArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public static final /* synthetic */ Character m7227(char[] cArr, Comparator comparator) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8220(cArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public static final /* synthetic */ Double m7228(double[] dArr, Comparator comparator) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8221(dArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public static final /* synthetic */ Float m7229(float[] fArr, Comparator comparator) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8222(fArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Integer m7230(int[] iArr, Comparator comparator) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8223(iArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ Long m7231(long[] jArr, Comparator comparator) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8224(jArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public static final /* synthetic */ Object m7232(Object[] objArr, Comparator comparator) {
        C5499.m17103(objArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8225(objArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static final /* synthetic */ Short m7233(short[] sArr, Comparator comparator) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8226(sArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public static final /* synthetic */ Byte m7234(byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        return C3411.m8326(bArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public static final /* synthetic */ Character m7235(char[] cArr) {
        C5499.m17103(cArr, "<this>");
        return C3411.m8327(cArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public static final /* synthetic */ Comparable m7236(Comparable[] comparableArr) {
        C5499.m17103(comparableArr, "<this>");
        return C3411.m8328(comparableArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public static final /* synthetic */ Double m7237(double[] dArr) {
        C5499.m17103(dArr, "<this>");
        return C3411.m8329(dArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public static final /* synthetic */ Double m7238(Double[] dArr) {
        C5499.m17103(dArr, "<this>");
        return C3411.m8330(dArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static final /* synthetic */ Float m7239(float[] fArr) {
        C5499.m17103(fArr, "<this>");
        return C3411.m8331(fArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public static final /* synthetic */ Float m7240(Float[] fArr) {
        C5499.m17103(fArr, "<this>");
        return C3411.m8332(fArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ Integer m7241(int[] iArr) {
        C5499.m17103(iArr, "<this>");
        return C3411.m8333(iArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public static final /* synthetic */ Long m7242(long[] jArr) {
        C5499.m17103(jArr, "<this>");
        return C3411.m8334(jArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public static final /* synthetic */ Short m7243(short[] sArr) {
        C5499.m17103(sArr, "<this>");
        return C3411.m8335(sArr);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Boolean m7244(boolean[] zArr, InterfaceC5124<? super Boolean, ? extends R> interfaceC5124) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (zArr.length == 0) {
            return null;
        }
        boolean z = zArr[0];
        int iM7878 = C3411.m7878(zArr);
        if (iM7878 == 0) {
            return Boolean.valueOf(z);
        }
        R rInvoke = interfaceC5124.invoke(Boolean.valueOf(z));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7878).iterator();
        while (abstractC5455M16967.hasNext()) {
            boolean z2 = zArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Boolean.valueOf(z2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                z = z2;
                rInvoke = rInvoke2;
            }
        }
        return Boolean.valueOf(z);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Byte m7245(byte[] bArr, InterfaceC5124<? super Byte, ? extends R> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (bArr.length == 0) {
            return null;
        }
        byte b = bArr[0];
        int iM7870 = C3411.m7870(bArr);
        if (iM7870 == 0) {
            return Byte.valueOf(b);
        }
        R rInvoke = interfaceC5124.invoke(Byte.valueOf(b));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7870).iterator();
        while (abstractC5455M16967.hasNext()) {
            byte b2 = bArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Byte.valueOf(b2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                b = b2;
                rInvoke = rInvoke2;
            }
        }
        return Byte.valueOf(b);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۣ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Character m7246(char[] cArr, InterfaceC5124<? super Character, ? extends R> interfaceC5124) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (cArr.length == 0) {
            return null;
        }
        char c = cArr[0];
        int iM7871 = C3411.m7871(cArr);
        if (iM7871 == 0) {
            return Character.valueOf(c);
        }
        R rInvoke = interfaceC5124.invoke(Character.valueOf(c));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7871).iterator();
        while (abstractC5455M16967.hasNext()) {
            char c2 = cArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Character.valueOf(c2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                c = c2;
                rInvoke = rInvoke2;
            }
        }
        return Character.valueOf(c);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Double m7247(double[] dArr, InterfaceC5124<? super Double, ? extends R> interfaceC5124) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (dArr.length == 0) {
            return null;
        }
        double d = dArr[0];
        int iM7872 = C3411.m7872(dArr);
        if (iM7872 == 0) {
            return Double.valueOf(d);
        }
        R rInvoke = interfaceC5124.invoke(Double.valueOf(d));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7872).iterator();
        while (abstractC5455M16967.hasNext()) {
            double d2 = dArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Double.valueOf(d2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                d = d2;
                rInvoke = rInvoke2;
            }
        }
        return Double.valueOf(d);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Float m7248(float[] fArr, InterfaceC5124<? super Float, ? extends R> interfaceC5124) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (fArr.length == 0) {
            return null;
        }
        float f = fArr[0];
        int iM7873 = C3411.m7873(fArr);
        if (iM7873 == 0) {
            return Float.valueOf(f);
        }
        R rInvoke = interfaceC5124.invoke(Float.valueOf(f));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7873).iterator();
        while (abstractC5455M16967.hasNext()) {
            float f2 = fArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Float.valueOf(f2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                f = f2;
                rInvoke = rInvoke2;
            }
        }
        return Float.valueOf(f);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Integer m7249(int[] iArr, InterfaceC5124<? super Integer, ? extends R> interfaceC5124) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (iArr.length == 0) {
            return null;
        }
        int i = iArr[0];
        int iM7874 = C3411.m7874(iArr);
        if (iM7874 == 0) {
            return Integer.valueOf(i);
        }
        R rInvoke = interfaceC5124.invoke(Integer.valueOf(i));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7874).iterator();
        while (abstractC5455M16967.hasNext()) {
            int i2 = iArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Integer.valueOf(i2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                i = i2;
                rInvoke = rInvoke2;
            }
        }
        return Integer.valueOf(i);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Long m7250(long[] jArr, InterfaceC5124<? super Long, ? extends R> interfaceC5124) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (jArr.length == 0) {
            return null;
        }
        long j = jArr[0];
        int iM7875 = C3411.m7875(jArr);
        if (iM7875 == 0) {
            return Long.valueOf(j);
        }
        R rInvoke = interfaceC5124.invoke(Long.valueOf(j));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7875).iterator();
        while (abstractC5455M16967.hasNext()) {
            long j2 = jArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Long.valueOf(j2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                j = j2;
                rInvoke = rInvoke2;
            }
        }
        return Long.valueOf(j);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۨ, reason: contains not printable characters */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m7251(T[] tArr, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (tArr.length == 0) {
            return null;
        }
        T t = tArr[0];
        int iM7876 = C3411.m7876(tArr);
        if (iM7876 != 0) {
            R rInvoke = interfaceC5124.invoke(t);
            AbstractC5455 abstractC5455M16967 = new C5458(1, iM7876).iterator();
            while (abstractC5455M16967.hasNext()) {
                T t2 = tArr[abstractC5455M16967.mo471()];
                R rInvoke2 = interfaceC5124.invoke(t2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    t = t2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return t;
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> Short m7252(short[] sArr, InterfaceC5124<? super Short, ? extends R> interfaceC5124) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (sArr.length == 0) {
            return null;
        }
        short s = sArr[0];
        int iM7877 = C3411.m7877(sArr);
        if (iM7877 == 0) {
            return Short.valueOf(s);
        }
        R rInvoke = interfaceC5124.invoke(Short.valueOf(s));
        AbstractC5455 abstractC5455M16967 = new C5458(1, iM7877).iterator();
        while (abstractC5455M16967.hasNext()) {
            short s2 = sArr[abstractC5455M16967.mo471()];
            R rInvoke2 = interfaceC5124.invoke(Short.valueOf(s2));
            if (rInvoke.compareTo(rInvoke2) > 0) {
                s = s2;
                rInvoke = rInvoke2;
            }
        }
        return Short.valueOf(s);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧ۟, reason: contains not printable characters */
    public static final /* synthetic */ Boolean m7253(boolean[] zArr, Comparator comparator) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8346(zArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧ۠, reason: contains not printable characters */
    public static final /* synthetic */ Byte m7254(byte[] bArr, Comparator comparator) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8347(bArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧۡ, reason: contains not printable characters */
    public static final /* synthetic */ Character m7255(char[] cArr, Comparator comparator) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8348(cArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧۢ, reason: contains not printable characters */
    public static final /* synthetic */ Double m7256(double[] dArr, Comparator comparator) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8349(dArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ Float m7257(float[] fArr, Comparator comparator) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8350(fArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧۤ, reason: contains not printable characters */
    public static final /* synthetic */ Integer m7258(int[] iArr, Comparator comparator) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8351(iArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧۥ, reason: contains not printable characters */
    public static final /* synthetic */ Long m7259(long[] jArr, Comparator comparator) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8352(jArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧۦ, reason: contains not printable characters */
    public static final /* synthetic */ Object m7260(Object[] objArr, Comparator comparator) {
        C5499.m17103(objArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8353(objArr, comparator);
    }

    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۧۧ, reason: contains not printable characters */
    public static final /* synthetic */ Short m7261(short[] sArr, Comparator comparator) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return C3411.m8354(sArr, comparator);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧۨ, reason: contains not printable characters */
    public static byte[] m7262(@InterfaceC6399 byte[] bArr, byte b) {
        C5499.m17103(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b;
        C5499.m17102(bArrCopyOf, "result");
        return bArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public static final byte[] m7263(@InterfaceC6399 byte[] bArr, @InterfaceC6399 Collection<Byte> collection) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, collection.size() + length);
        Iterator<Byte> it = collection.iterator();
        while (it.hasNext()) {
            bArrCopyOf[length] = it.next().byteValue();
            length++;
        }
        C5499.m17102(bArrCopyOf, "result");
        return bArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public static byte[] m7264(@InterfaceC6399 byte[] bArr, @InterfaceC6399 byte[] bArr2) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
        C5499.m17102(bArrCopyOf, "result");
        return bArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨ۠, reason: contains not printable characters */
    public static final char[] m7265(@InterfaceC6399 char[] cArr, char c) {
        C5499.m17103(cArr, "<this>");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + 1);
        cArrCopyOf[length] = c;
        C5499.m17102(cArrCopyOf, "result");
        return cArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public static final char[] m7266(@InterfaceC6399 char[] cArr, @InterfaceC6399 Collection<Character> collection) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = cArr.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, collection.size() + length);
        Iterator<Character> it = collection.iterator();
        while (it.hasNext()) {
            cArrCopyOf[length] = it.next().charValue();
            length++;
        }
        C5499.m17102(cArrCopyOf, "result");
        return cArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters */
    public static final char[] m7267(@InterfaceC6399 char[] cArr, @InterfaceC6399 char[] cArr2) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
        C5499.m17102(cArrCopyOf, "result");
        return cArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final double[] m7268(@InterfaceC6399 double[] dArr, double d) {
        C5499.m17103(dArr, "<this>");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
        dArrCopyOf[length] = d;
        C5499.m17102(dArrCopyOf, "result");
        return dArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۤ, reason: contains not printable characters */
    public static final double[] m7269(@InterfaceC6399 double[] dArr, @InterfaceC6399 Collection<Double> collection) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = dArr.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, collection.size() + length);
        Iterator<Double> it = collection.iterator();
        while (it.hasNext()) {
            dArrCopyOf[length] = it.next().doubleValue();
            length++;
        }
        C5499.m17102(dArrCopyOf, "result");
        return dArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۥ, reason: contains not printable characters */
    public static final double[] m7270(@InterfaceC6399 double[] dArr, @InterfaceC6399 double[] dArr2) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
        C5499.m17102(dArrCopyOf, "result");
        return dArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۦ, reason: contains not printable characters */
    public static final float[] m7271(@InterfaceC6399 float[] fArr, float f) {
        C5499.m17103(fArr, "<this>");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        fArrCopyOf[length] = f;
        C5499.m17102(fArrCopyOf, "result");
        return fArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۧ, reason: contains not printable characters */
    public static final float[] m7272(@InterfaceC6399 float[] fArr, @InterfaceC6399 Collection<Float> collection) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, collection.size() + length);
        Iterator<Float> it = collection.iterator();
        while (it.hasNext()) {
            fArrCopyOf[length] = it.next().floatValue();
            length++;
        }
        C5499.m17102(fArrCopyOf, "result");
        return fArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۨ, reason: contains not printable characters */
    public static final float[] m7273(@InterfaceC6399 float[] fArr, @InterfaceC6399 float[] fArr2) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
        C5499.m17102(fArrCopyOf, "result");
        return fArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static int[] m7274(@InterfaceC6399 int[] iArr, int i) {
        C5499.m17103(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i;
        C5499.m17102(iArrCopyOf, "result");
        return iArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟, reason: contains not printable characters */
    public static final int[] m7275(@InterfaceC6399 int[] iArr, @InterfaceC6399 Collection<Integer> collection) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, collection.size() + length);
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArrCopyOf[length] = it.next().intValue();
            length++;
        }
        C5499.m17102(iArrCopyOf, "result");
        return iArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟۟, reason: contains not printable characters */
    public static int[] m7276(@InterfaceC6399 int[] iArr, @InterfaceC6399 int[] iArr2) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        C5499.m17102(iArrCopyOf, "result");
        return iArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟۠, reason: contains not printable characters */
    public static long[] m7277(@InterfaceC6399 long[] jArr, long j) {
        C5499.m17103(jArr, "<this>");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + 1);
        jArrCopyOf[length] = j;
        C5499.m17102(jArrCopyOf, "result");
        return jArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۡ, reason: contains not printable characters */
    public static final long[] m7278(@InterfaceC6399 long[] jArr, @InterfaceC6399 Collection<Long> collection) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, collection.size() + length);
        Iterator<Long> it = collection.iterator();
        while (it.hasNext()) {
            jArrCopyOf[length] = it.next().longValue();
            length++;
        }
        C5499.m17102(jArrCopyOf, "result");
        return jArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۢ, reason: contains not printable characters */
    public static long[] m7279(@InterfaceC6399 long[] jArr, @InterfaceC6399 long[] jArr2) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
        C5499.m17102(jArrCopyOf, "result");
        return jArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static <T> T[] m7280(@InterfaceC6399 T[] tArr, T t) {
        C5499.m17103(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t;
        C5499.m17102(tArr2, "result");
        return tArr2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۤ, reason: contains not printable characters */
    public static final <T> T[] m7281(@InterfaceC6399 T[] tArr, @InterfaceC6399 Collection<? extends T> collection) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, collection.size() + length);
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            tArr2[length] = it.next();
            length++;
        }
        C5499.m17102(tArr2, "result");
        return tArr2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۥ, reason: contains not printable characters */
    public static final <T> T[] m7282(@InterfaceC6399 T[] tArr, @InterfaceC6399 T[] tArr2) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        C5499.m17102(tArr3, "result");
        return tArr3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۦ, reason: contains not printable characters */
    public static final short[] m7283(@InterfaceC6399 short[] sArr, @InterfaceC6399 Collection<Short> collection) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, collection.size() + length);
        Iterator<Short> it = collection.iterator();
        while (it.hasNext()) {
            sArrCopyOf[length] = it.next().shortValue();
            length++;
        }
        C5499.m17102(sArrCopyOf, "result");
        return sArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۧ, reason: contains not printable characters */
    public static short[] m7284(@InterfaceC6399 short[] sArr, short s) {
        C5499.m17103(sArr, "<this>");
        int length = sArr.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + 1);
        sArrCopyOf[length] = s;
        C5499.m17102(sArrCopyOf, "result");
        return sArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۨ, reason: contains not printable characters */
    public static short[] m7285(@InterfaceC6399 short[] sArr, @InterfaceC6399 short[] sArr2) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(sArr2, "elements");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
        C5499.m17102(sArrCopyOf, "result");
        return sArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۠, reason: contains not printable characters */
    public static final boolean[] m7286(@InterfaceC6399 boolean[] zArr, @InterfaceC6399 Collection<Boolean> collection) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(collection, "elements");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, collection.size() + length);
        Iterator<Boolean> it = collection.iterator();
        while (it.hasNext()) {
            zArrCopyOf[length] = it.next().booleanValue();
            length++;
        }
        C5499.m17102(zArrCopyOf, "result");
        return zArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۠۟, reason: contains not printable characters */
    public static final boolean[] m7287(@InterfaceC6399 boolean[] zArr, boolean z) {
        C5499.m17103(zArr, "<this>");
        int length = zArr.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
        zArrCopyOf[length] = z;
        C5499.m17102(zArrCopyOf, "result");
        return zArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۠۠, reason: contains not printable characters */
    public static final boolean[] m7288(@InterfaceC6399 boolean[] zArr, @InterfaceC6399 boolean[] zArr2) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
        C5499.m17102(zArrCopyOf, "result");
        return zArrCopyOf;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۡ, reason: contains not printable characters */
    public static final <T> T[] m7289(T[] tArr, T t) {
        C5499.m17103(tArr, "<this>");
        return (T[]) m7280(tArr, t);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۢ, reason: contains not printable characters */
    public static final void m7290(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final void m7291(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "<this>");
        Arrays.sort(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۤ, reason: contains not printable characters */
    public static final void m7292(@InterfaceC6399 char[] cArr) {
        C5499.m17103(cArr, "<this>");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۥ, reason: contains not printable characters */
    public static final void m7293(@InterfaceC6399 char[] cArr, int i, int i2) {
        C5499.m17103(cArr, "<this>");
        Arrays.sort(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۦ, reason: contains not printable characters */
    public static final void m7294(@InterfaceC6399 double[] dArr) {
        C5499.m17103(dArr, "<this>");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۧ, reason: contains not printable characters */
    public static final void m7295(@InterfaceC6399 double[] dArr, int i, int i2) {
        C5499.m17103(dArr, "<this>");
        Arrays.sort(dArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۨ, reason: contains not printable characters */
    public static final void m7296(@InterfaceC6399 float[] fArr) {
        C5499.m17103(fArr, "<this>");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static final void m7297(@InterfaceC6399 float[] fArr, int i, int i2) {
        C5499.m17103(fArr, "<this>");
        Arrays.sort(fArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ۟, reason: contains not printable characters */
    public static final void m7298(@InterfaceC6399 int[] iArr) {
        C5499.m17103(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ۠, reason: contains not printable characters */
    public static final void m7299(@InterfaceC6399 int[] iArr, int i, int i2) {
        C5499.m17103(iArr, "<this>");
        Arrays.sort(iArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۡ, reason: contains not printable characters */
    public static final void m7300(@InterfaceC6399 long[] jArr) {
        C5499.m17103(jArr, "<this>");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۢ, reason: contains not printable characters */
    public static final void m7301(@InterfaceC6399 long[] jArr, int i, int i2) {
        C5499.m17103(jArr, "<this>");
        Arrays.sort(jArr, i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> void m7302(T[] tArr) {
        C5499.m17103(tArr, "<this>");
        m7304(tArr);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۡۤ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> void m7303(@InterfaceC6399 T[] tArr, int i, int i2) {
        C5499.m17103(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۥ, reason: contains not printable characters */
    public static final <T> void m7304(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۦ, reason: contains not printable characters */
    public static final <T> void m7305(@InterfaceC6399 T[] tArr, int i, int i2) {
        C5499.m17103(tArr, "<this>");
        Arrays.sort(tArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۧ, reason: contains not printable characters */
    public static final void m7306(@InterfaceC6399 short[] sArr) {
        C5499.m17103(sArr, "<this>");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۨ, reason: contains not printable characters */
    public static final void m7307(@InterfaceC6399 short[] sArr, int i, int i2) {
        C5499.m17103(sArr, "<this>");
        Arrays.sort(sArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ void m7308(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        m7291(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ۟, reason: contains not printable characters */
    public static /* synthetic */ void m7309(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        m7293(cArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ۠, reason: contains not printable characters */
    public static /* synthetic */ void m7310(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        m7295(dArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢۡ, reason: contains not printable characters */
    public static /* synthetic */ void m7311(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        m7297(fArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢۢ, reason: contains not printable characters */
    public static /* synthetic */ void m7312(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        m7299(iArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ void m7313(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        m7301(jArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢۤ, reason: contains not printable characters */
    public static /* synthetic */ void m7314(Comparable[] comparableArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = comparableArr.length;
        }
        m7303(comparableArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢۥ, reason: contains not printable characters */
    public static /* synthetic */ void m7315(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        m7305(objArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢۦ, reason: contains not printable characters */
    public static /* synthetic */ void m7316(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        m7307(sArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢۧ, reason: contains not printable characters */
    public static final <T> void m7317(@InterfaceC6399 T[] tArr, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢۨ, reason: contains not printable characters */
    public static final <T> void m7318(@InterfaceC6399 T[] tArr, @InterfaceC6399 Comparator<? super T> comparator, int i, int i2) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m7319(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m7318(objArr, comparator, i, i2);
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final BigDecimal m7320(byte[] bArr, InterfaceC5124<? super Byte, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (byte b : bArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Byte.valueOf(b)));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final BigDecimal m7321(char[] cArr, InterfaceC5124<? super Character, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (char c : cArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Character.valueOf(c)));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final BigDecimal m7322(double[] dArr, InterfaceC5124<? super Double, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (double d : dArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Double.valueOf(d)));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final BigDecimal m7323(float[] fArr, InterfaceC5124<? super Float, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (float f : fArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Float.valueOf(f)));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣۣ۟ۡ, reason: contains not printable characters */
    public static final BigDecimal m7324(int[] iArr, InterfaceC5124<? super Integer, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (int i : iArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Integer.valueOf(i)));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final BigDecimal m7325(long[] jArr, InterfaceC5124<? super Long, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (long j : jArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Long.valueOf(j)));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۥ, reason: contains not printable characters */
    public static final <T> BigDecimal m7326(T[] tArr, InterfaceC5124<? super T, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (T t : tArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(t));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۦ, reason: contains not printable characters */
    public static final BigDecimal m7327(short[] sArr, InterfaceC5124<? super Short, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (short s : sArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Short.valueOf(s)));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final BigDecimal m7328(boolean[] zArr, InterfaceC5124<? super Boolean, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        for (boolean z : zArr) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(Boolean.valueOf(z)));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static final BigInteger m7329(byte[] bArr, InterfaceC5124<? super Byte, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (byte b : bArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Byte.valueOf(b)));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤ, reason: contains not printable characters */
    public static final BigInteger m7330(char[] cArr, InterfaceC5124<? super Character, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(cArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (char c : cArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Character.valueOf(c)));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤ۟, reason: contains not printable characters */
    public static final BigInteger m7331(double[] dArr, InterfaceC5124<? super Double, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(dArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (double d : dArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Double.valueOf(d)));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤ۠, reason: contains not printable characters */
    public static final BigInteger m7332(float[] fArr, InterfaceC5124<? super Float, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(fArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (float f : fArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Float.valueOf(f)));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤۡ, reason: contains not printable characters */
    public static final BigInteger m7333(int[] iArr, InterfaceC5124<? super Integer, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(iArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (int i : iArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Integer.valueOf(i)));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤۢ, reason: contains not printable characters */
    public static final BigInteger m7334(long[] jArr, InterfaceC5124<? super Long, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(jArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (long j : jArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Long.valueOf(j)));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final <T> BigInteger m7335(T[] tArr, InterfaceC5124<? super T, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (T t : tArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(t));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤۤ, reason: contains not printable characters */
    public static final BigInteger m7336(short[] sArr, InterfaceC5124<? super Short, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(sArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (short s : sArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Short.valueOf(s)));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤۥ, reason: contains not printable characters */
    public static final BigInteger m7337(boolean[] zArr, InterfaceC5124<? super Boolean, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(zArr, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        for (boolean z : zArr) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(Boolean.valueOf(z)));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۦ, reason: contains not printable characters */
    public static final SortedSet<Byte> m7338(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        return (SortedSet) C3411.m8899(bArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۧ, reason: contains not printable characters */
    public static final SortedSet<Character> m7339(@InterfaceC6399 char[] cArr) {
        C5499.m17103(cArr, "<this>");
        return (SortedSet) C3411.m8900(cArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۨ, reason: contains not printable characters */
    public static final SortedSet<Double> m7340(@InterfaceC6399 double[] dArr) {
        C5499.m17103(dArr, "<this>");
        return (SortedSet) C3411.m8901(dArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static final SortedSet<Float> m7341(@InterfaceC6399 float[] fArr) {
        C5499.m17103(fArr, "<this>");
        return (SortedSet) C3411.m8902(fArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥ۟, reason: contains not printable characters */
    public static final SortedSet<Integer> m7342(@InterfaceC6399 int[] iArr) {
        C5499.m17103(iArr, "<this>");
        return (SortedSet) C3411.m8903(iArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥ۠, reason: contains not printable characters */
    public static final SortedSet<Long> m7343(@InterfaceC6399 long[] jArr) {
        C5499.m17103(jArr, "<this>");
        return (SortedSet) C3411.m8904(jArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۡ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> SortedSet<T> m7344(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "<this>");
        return (SortedSet) C3411.m8905(tArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۢ, reason: contains not printable characters */
    public static final <T> SortedSet<T> m7345(@InterfaceC6399 T[] tArr, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(tArr, "<this>");
        C5499.m17103(comparator, "comparator");
        return (SortedSet) C3411.m8905(tArr, new TreeSet(comparator));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۣ, reason: contains not printable characters */
    public static final SortedSet<Short> m7346(@InterfaceC6399 short[] sArr) {
        C5499.m17103(sArr, "<this>");
        return (SortedSet) C3411.m8906(sArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۤ, reason: contains not printable characters */
    public static final SortedSet<Boolean> m7347(@InterfaceC6399 boolean[] zArr) {
        C5499.m17103(zArr, "<this>");
        return (SortedSet) C3411.m8907(zArr, new TreeSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۥ, reason: contains not printable characters */
    public static final Boolean[] m7348(@InterfaceC6399 boolean[] zArr) {
        C5499.m17103(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۦ, reason: contains not printable characters */
    public static final Byte[] m7349(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "<this>");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۧ, reason: contains not printable characters */
    public static final Character[] m7350(@InterfaceC6399 char[] cArr) {
        C5499.m17103(cArr, "<this>");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۨ, reason: contains not printable characters */
    public static final Double[] m7351(@InterfaceC6399 double[] dArr) {
        C5499.m17103(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static final Float[] m7352(@InterfaceC6399 float[] fArr) {
        C5499.m17103(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦ۟, reason: contains not printable characters */
    public static final Integer[] m7353(@InterfaceC6399 int[] iArr) {
        C5499.m17103(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦ۠, reason: contains not printable characters */
    public static final Long[] m7354(@InterfaceC6399 long[] jArr) {
        C5499.m17103(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦۡ, reason: contains not printable characters */
    public static final Short[] m7355(@InterfaceC6399 short[] sArr) {
        C5499.m17103(sArr, "<this>");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }
}
