package Yue;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: Yue.ۥۢۢۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8042 {

    /* JADX INFO: renamed from: Yue.ۥۢۢۥۣ$ۥ */
    public static final class C1414 extends AbstractC2986<C8057> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int[] f23913;

        public C1414(int[] iArr) {
            this.f23913 = iArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof C8057) {
                return m4063(((C8057) obj).m26372());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return C8057.m26313(m25480(i));
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof C8057) {
                return m25481(((C8057) obj).m26372());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return C8058.m26383(this.f23913);
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof C8057) {
                return m25482(((C8057) obj).m26372());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return C8058.m26380(this.f23913);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4063(int i) {
            return C8058.m26375(this.f23913, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m25480(int i) {
            return C8058.m26379(this.f23913, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m25481(int i) {
            return C3411.m7938(this.f23913, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m25482(int i) {
            return C3411.m8046(this.f23913, i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۥۣ$ۥ۟ */
    public static final class C1415 extends AbstractC2986<C8064> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ long[] f23914;

        public C1415(long[] jArr) {
            this.f23914 = jArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof C8064) {
                return m4064(((C8064) obj).m26462());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return C8064.m26403(m25483(i));
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof C8064) {
                return m25484(((C8064) obj).m26462());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return C8065.m26473(this.f23914);
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof C8064) {
                return m25485(((C8064) obj).m26462());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return C8065.m26470(this.f23914);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4064(long j) {
            return C8065.m26465(this.f23914, j);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long m25483(int i) {
            return C8065.m26469(this.f23914, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m25484(long j) {
            return C3411.m7939(this.f23914, j);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m25485(long j) {
            return C3411.m8047(this.f23914, j);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۥۣ$ۥ۟۟, reason: contains not printable characters */
    public static final class C8043 extends AbstractC2986<C8048> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ byte[] f23915;

        public C8043(byte[] bArr) {
            this.f23915 = bArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof C8048) {
                return m4065(((C8048) obj).m26245());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return C8048.m26188(m25486(i));
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof C8048) {
                return m25487(((C8048) obj).m26245());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return C8049.m26256(this.f23915);
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof C8048) {
                return m25488(((C8048) obj).m26245());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return C8049.m26253(this.f23915);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4065(byte b) {
            return C8049.m26248(this.f23915, b);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public byte m25486(int i) {
            return C8049.m26252(this.f23915, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m25487(byte b) {
            return C3411.m7934(this.f23915, b);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m25488(byte b) {
            return C3411.m8042(this.f23915, b);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۥۣ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C8044 extends AbstractC2986<C8080> implements RandomAccess {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ short[] f23916;

        public C8044(short[] sArr) {
            this.f23916 = sArr;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof C8080) {
                return m4066(((C8080) obj).m26642());
            }
            return false;
        }

        @Override // Yue.AbstractC2986, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return C8080.m26585(m25489(i));
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof C8080) {
                return m25490(((C8080) obj).m26642());
            }
            return -1;
        }

        @Override // Yue.AbstractC2979, java.util.Collection
        public boolean isEmpty() {
            return C8081.m26653(this.f23916);
        }

        @Override // Yue.AbstractC2986, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof C8080) {
                return m25491(((C8080) obj).m26642());
            }
            return -1;
        }

        @Override // Yue.AbstractC2986, Yue.AbstractC2979
        /* JADX INFO: renamed from: ۥ */
        public int mo41() {
            return C8081.m26650(this.f23916);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4066(short s) {
            return C8081.m26645(this.f23916, s);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public short m25489(int i) {
            return C8081.m26649(this.f23916, i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m25490(short s) {
            return C3411.m7941(this.f23916, s);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m25491(short s) {
            return C3411.m8049(this.f23916, s);
        }
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ */
    public static final List<C8057> m4061(@InterfaceC6399 int[] iArr) {
        C5499.m17103(iArr, "$this$asList");
        return new C1414(iArr);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟ */
    public static final List<C8048> m4062(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "$this$asList");
        return new C8043(bArr);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final List<C8064> m25434(@InterfaceC6399 long[] jArr) {
        C5499.m17103(jArr, "$this$asList");
        return new C1415(jArr);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final List<C8080> m25435(@InterfaceC6399 short[] sArr) {
        C5499.m17103(sArr, "$this$asList");
        return new C8044(sArr);
    }

    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m25436(@InterfaceC6399 int[] iArr, int i, int i2, int i3) {
        C5499.m17103(iArr, "$this$binarySearch");
        AbstractC2986.f4328.m5792(i2, i3, C8058.m26380(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iM26712 = C8113.m26712(iArr[i5], i);
            if (iM26712 < 0) {
                i2 = i5 + 1;
            } else {
                if (iM26712 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ int m25437(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = C8058.m26380(iArr);
        }
        return m25436(iArr, i, i2, i3);
    }

    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m25438(@InterfaceC6399 short[] sArr, short s, int i, int i2) {
        C5499.m17103(sArr, "$this$binarySearch");
        AbstractC2986.f4328.m5792(i, i2, C8081.m26650(sArr));
        int i3 = s & C8080.f23970;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iM26712 = C8113.m26712(sArr[i5], i3);
            if (iM26712 < 0) {
                i = i5 + 1;
            } else {
                if (iM26712 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m25439(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C8081.m26650(sArr);
        }
        return m25438(sArr, s, i, i2);
    }

    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m25440(@InterfaceC6399 long[] jArr, long j, int i, int i2) {
        C5499.m17103(jArr, "$this$binarySearch");
        AbstractC2986.f4328.m5792(i, i2, C8065.m26470(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iM26716 = C8113.m26716(jArr[i4], j);
            if (iM26716 < 0) {
                i = i4 + 1;
            } else {
                if (iM26716 <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ int m25441(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C8065.m26470(jArr);
        }
        return m25440(jArr, j, i, i2);
    }

    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m25442(@InterfaceC6399 byte[] bArr, byte b, int i, int i2) {
        C5499.m17103(bArr, "$this$binarySearch");
        AbstractC2986.f4328.m5792(i, i2, C8049.m26253(bArr));
        int i3 = b & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iM26712 = C8113.m26712(bArr[i5], i3);
            if (iM26712 < 0) {
                i = i5 + 1;
            } else {
                if (iM26712 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ int m25443(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = C8049.m26253(bArr);
        }
        return m25442(bArr, b, i, i2);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final byte m25444(byte[] bArr, int i) {
        C5499.m17103(bArr, "$this$elementAt");
        return C8049.m26252(bArr, i);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final short m25445(short[] sArr, int i) {
        C5499.m17103(sArr, "$this$elementAt");
        return C8081.m26649(sArr, i);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m25446(int[] iArr, int i) {
        C5499.m17103(iArr, "$this$elementAt");
        return C8058.m26379(iArr, i);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final long m25447(long[] jArr, int i) {
        C5499.m17103(jArr, "$this$elementAt");
        return C8065.m26469(jArr, i);
    }

    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final /* synthetic */ C8057 m25448(int[] iArr) {
        C5499.m17103(iArr, "$this$max");
        return C8045.m25824(iArr);
    }

    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final /* synthetic */ C8048 m25449(byte[] bArr) {
        C5499.m17103(bArr, "$this$max");
        return C8045.m25825(bArr);
    }

    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final /* synthetic */ C8064 m25450(long[] jArr) {
        C5499.m17103(jArr, "$this$max");
        return C8045.m25826(jArr);
    }

    @InterfaceC4372(message = "Use maxOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ C8080 m25451(short[] sArr) {
        C5499.m17103(sArr, "$this$max");
        return C8045.m25827(sArr);
    }

    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> C8048 m25452(byte[] bArr, InterfaceC5124<? super C8048, ? extends R> interfaceC5124) {
        C5499.m17103(bArr, "$this$maxBy");
        C5499.m17103(interfaceC5124, "selector");
        if (C8049.m26256(bArr)) {
            return null;
        }
        byte bM26252 = C8049.m26252(bArr, 0);
        int iM7870 = C3411.m7870(bArr);
        if (iM7870 != 0) {
            R rInvoke = interfaceC5124.invoke(C8048.m26188(bM26252));
            AbstractC5455 it = new C5458(1, iM7870).iterator();
            while (it.hasNext()) {
                byte bM262522 = C8049.m26252(bArr, it.mo471());
                R rInvoke2 = interfaceC5124.invoke(C8048.m26188(bM262522));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bM26252 = bM262522;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C8048.m26188(bM26252);
    }

    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> C8064 m25453(long[] jArr, InterfaceC5124<? super C8064, ? extends R> interfaceC5124) {
        C5499.m17103(jArr, "$this$maxBy");
        C5499.m17103(interfaceC5124, "selector");
        if (C8065.m26473(jArr)) {
            return null;
        }
        long jM26469 = C8065.m26469(jArr, 0);
        int iM7875 = C3411.m7875(jArr);
        if (iM7875 != 0) {
            R rInvoke = interfaceC5124.invoke(C8064.m26403(jM26469));
            AbstractC5455 it = new C5458(1, iM7875).iterator();
            while (it.hasNext()) {
                long jM264692 = C8065.m26469(jArr, it.mo471());
                R rInvoke2 = interfaceC5124.invoke(C8064.m26403(jM264692));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jM26469 = jM264692;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C8064.m26403(jM26469);
    }

    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> C8057 m25454(int[] iArr, InterfaceC5124<? super C8057, ? extends R> interfaceC5124) {
        C5499.m17103(iArr, "$this$maxBy");
        C5499.m17103(interfaceC5124, "selector");
        if (C8058.m26383(iArr)) {
            return null;
        }
        int iM26379 = C8058.m26379(iArr, 0);
        int iM7874 = C3411.m7874(iArr);
        if (iM7874 != 0) {
            R rInvoke = interfaceC5124.invoke(C8057.m26313(iM26379));
            AbstractC5455 it = new C5458(1, iM7874).iterator();
            while (it.hasNext()) {
                int iM263792 = C8058.m26379(iArr, it.mo471());
                R rInvoke2 = interfaceC5124.invoke(C8057.m26313(iM263792));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iM26379 = iM263792;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C8057.m26313(iM26379);
    }

    @InterfaceC4372(message = "Use maxByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> C8080 m25455(short[] sArr, InterfaceC5124<? super C8080, ? extends R> interfaceC5124) {
        C5499.m17103(sArr, "$this$maxBy");
        C5499.m17103(interfaceC5124, "selector");
        if (C8081.m26653(sArr)) {
            return null;
        }
        short sM26649 = C8081.m26649(sArr, 0);
        int iM7877 = C3411.m7877(sArr);
        if (iM7877 != 0) {
            R rInvoke = interfaceC5124.invoke(C8080.m26585(sM26649));
            AbstractC5455 it = new C5458(1, iM7877).iterator();
            while (it.hasNext()) {
                short sM266492 = C8081.m26649(sArr, it.mo471());
                R rInvoke2 = interfaceC5124.invoke(C8080.m26585(sM266492));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sM26649 = sM266492;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C8080.m26585(sM26649);
    }

    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ C8048 m25456(byte[] bArr, Comparator comparator) {
        C5499.m17103(bArr, "$this$maxWith");
        C5499.m17103(comparator, "comparator");
        return C8045.m25832(bArr, comparator);
    }

    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ C8057 m25457(int[] iArr, Comparator comparator) {
        C5499.m17103(iArr, "$this$maxWith");
        C5499.m17103(comparator, "comparator");
        return C8045.m25833(iArr, comparator);
    }

    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ C8080 m25458(short[] sArr, Comparator comparator) {
        C5499.m17103(sArr, "$this$maxWith");
        C5499.m17103(comparator, "comparator");
        return C8045.m25834(sArr, comparator);
    }

    @InterfaceC4372(message = "Use maxWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ C8064 m25459(long[] jArr, Comparator comparator) {
        C5499.m17103(jArr, "$this$maxWith");
        C5499.m17103(comparator, "comparator");
        return C8045.m25835(jArr, comparator);
    }

    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final /* synthetic */ C8057 m25460(int[] iArr) {
        C5499.m17103(iArr, "$this$min");
        return C8045.m25880(iArr);
    }

    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final /* synthetic */ C8048 m25461(byte[] bArr) {
        C5499.m17103(bArr, "$this$min");
        return C8045.m25881(bArr);
    }

    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ C8064 m25462(long[] jArr) {
        C5499.m17103(jArr, "$this$min");
        return C8045.m25882(jArr);
    }

    @InterfaceC4372(message = "Use minOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minOrNull()", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final /* synthetic */ C8080 m25463(short[] sArr) {
        C5499.m17103(sArr, "$this$min");
        return C8045.m25883(sArr);
    }

    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> C8048 m25464(byte[] bArr, InterfaceC5124<? super C8048, ? extends R> interfaceC5124) {
        C5499.m17103(bArr, "$this$minBy");
        C5499.m17103(interfaceC5124, "selector");
        if (C8049.m26256(bArr)) {
            return null;
        }
        byte bM26252 = C8049.m26252(bArr, 0);
        int iM7870 = C3411.m7870(bArr);
        if (iM7870 != 0) {
            R rInvoke = interfaceC5124.invoke(C8048.m26188(bM26252));
            AbstractC5455 it = new C5458(1, iM7870).iterator();
            while (it.hasNext()) {
                byte bM262522 = C8049.m26252(bArr, it.mo471());
                R rInvoke2 = interfaceC5124.invoke(C8048.m26188(bM262522));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bM26252 = bM262522;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C8048.m26188(bM26252);
    }

    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> C8064 m25465(long[] jArr, InterfaceC5124<? super C8064, ? extends R> interfaceC5124) {
        C5499.m17103(jArr, "$this$minBy");
        C5499.m17103(interfaceC5124, "selector");
        if (C8065.m26473(jArr)) {
            return null;
        }
        long jM26469 = C8065.m26469(jArr, 0);
        int iM7875 = C3411.m7875(jArr);
        if (iM7875 != 0) {
            R rInvoke = interfaceC5124.invoke(C8064.m26403(jM26469));
            AbstractC5455 it = new C5458(1, iM7875).iterator();
            while (it.hasNext()) {
                long jM264692 = C8065.m26469(jArr, it.mo471());
                R rInvoke2 = interfaceC5124.invoke(C8064.m26403(jM264692));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jM26469 = jM264692;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C8064.m26403(jM26469);
    }

    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> C8057 m25466(int[] iArr, InterfaceC5124<? super C8057, ? extends R> interfaceC5124) {
        C5499.m17103(iArr, "$this$minBy");
        C5499.m17103(interfaceC5124, "selector");
        if (C8058.m26383(iArr)) {
            return null;
        }
        int iM26379 = C8058.m26379(iArr, 0);
        int iM7874 = C3411.m7874(iArr);
        if (iM7874 != 0) {
            R rInvoke = interfaceC5124.invoke(C8057.m26313(iM26379));
            AbstractC5455 it = new C5458(1, iM7874).iterator();
            while (it.hasNext()) {
                int iM263792 = C8058.m26379(iArr, it.mo471());
                R rInvoke2 = interfaceC5124.invoke(C8057.m26313(iM263792));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iM26379 = iM263792;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C8057.m26313(iM26379);
    }

    @InterfaceC4372(message = "Use minByOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final /* synthetic */ <R extends Comparable<? super R>> C8080 m25467(short[] sArr, InterfaceC5124<? super C8080, ? extends R> interfaceC5124) {
        C5499.m17103(sArr, "$this$minBy");
        C5499.m17103(interfaceC5124, "selector");
        if (C8081.m26653(sArr)) {
            return null;
        }
        short sM26649 = C8081.m26649(sArr, 0);
        int iM7877 = C3411.m7877(sArr);
        if (iM7877 != 0) {
            R rInvoke = interfaceC5124.invoke(C8080.m26585(sM26649));
            AbstractC5455 it = new C5458(1, iM7877).iterator();
            while (it.hasNext()) {
                short sM266492 = C8081.m26649(sArr, it.mo471());
                R rInvoke2 = interfaceC5124.invoke(C8080.m26585(sM266492));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sM26649 = sM266492;
                    rInvoke = rInvoke2;
                }
            }
        }
        return C8080.m26585(sM26649);
    }

    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ C8048 m25468(byte[] bArr, Comparator comparator) {
        C5499.m17103(bArr, "$this$minWith");
        C5499.m17103(comparator, "comparator");
        return C8045.m25888(bArr, comparator);
    }

    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final /* synthetic */ C8057 m25469(int[] iArr, Comparator comparator) {
        C5499.m17103(iArr, "$this$minWith");
        C5499.m17103(comparator, "comparator");
        return C8045.m25889(iArr, comparator);
    }

    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final /* synthetic */ C8080 m25470(short[] sArr, Comparator comparator) {
        C5499.m17103(sArr, "$this$minWith");
        C5499.m17103(comparator, "comparator");
        return C8045.m25890(sArr, comparator);
    }

    @InterfaceC4372(message = "Use minWithOrNull instead.", replaceWith = @InterfaceC7097(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC7470(version = "1.3")
    @InterfaceC4374(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final /* synthetic */ C8064 m25471(long[] jArr, Comparator comparator) {
        C5499.m17103(jArr, "$this$minWith");
        C5499.m17103(comparator, "comparator");
        return C8045.m25891(jArr, comparator);
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final BigDecimal m25472(byte[] bArr, InterfaceC5124<? super C8048, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(bArr, "$this$sumOf");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        int iM26253 = C8049.m26253(bArr);
        for (int i = 0; i < iM26253; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(C8048.m26188(C8049.m26252(bArr, i))));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final BigDecimal m25473(int[] iArr, InterfaceC5124<? super C8057, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(iArr, "$this$sumOf");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        int iM26380 = C8058.m26380(iArr);
        for (int i = 0; i < iM26380; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(C8057.m26313(C8058.m26379(iArr, i))));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final BigDecimal m25474(long[] jArr, InterfaceC5124<? super C8064, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(jArr, "$this$sumOf");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        int iM26470 = C8065.m26470(jArr);
        for (int i = 0; i < iM26470; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(C8064.m26403(C8065.m26469(jArr, i))));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigDecimal")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final BigDecimal m25475(short[] sArr, InterfaceC5124<? super C8080, ? extends BigDecimal> interfaceC5124) {
        C5499.m17103(sArr, "$this$sumOf");
        C5499.m17103(interfaceC5124, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        int iM26650 = C8081.m26650(sArr);
        for (int i = 0; i < iM26650; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(interfaceC5124.invoke(C8080.m26585(C8081.m26649(sArr, i))));
            C5499.m17102(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final BigInteger m25476(byte[] bArr, InterfaceC5124<? super C8048, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(bArr, "$this$sumOf");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        int iM26253 = C8049.m26253(bArr);
        for (int i = 0; i < iM26253; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(C8048.m26188(C8049.m26252(bArr, i))));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final BigInteger m25477(int[] iArr, InterfaceC5124<? super C8057, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(iArr, "$this$sumOf");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        int iM26380 = C8058.m26380(iArr);
        for (int i = 0; i < iM26380; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(C8057.m26313(C8058.m26379(iArr, i))));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final BigInteger m25478(long[] jArr, InterfaceC5124<? super C8064, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(jArr, "$this$sumOf");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        int iM26470 = C8065.m26470(jArr);
        for (int i = 0; i < iM26470; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(C8064.m26403(C8065.m26469(jArr, i))));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfBigInteger")
    @InterfaceC5438
    @InterfaceC4776
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final BigInteger m25479(short[] sArr, InterfaceC5124<? super C8080, ? extends BigInteger> interfaceC5124) {
        C5499.m17103(sArr, "$this$sumOf");
        C5499.m17103(interfaceC5124, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        C5499.m17102(bigIntegerValueOf, "valueOf(this.toLong())");
        int iM26650 = C8081.m26650(sArr);
        for (int i = 0; i < iM26650; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(interfaceC5124.invoke(C8080.m26585(C8081.m26649(sArr, i))));
            C5499.m17102(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }
}
