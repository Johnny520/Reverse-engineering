package Yue;

import Yue.C3782;
import Yue.C5456;
import Yue.C5881;
import java.util.NoSuchElementException;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۡۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
public class C7007 extends C7006 {
    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "byteRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21650(InterfaceC3854 interfaceC3854, double d) {
        C5499.m17103(interfaceC3854, "<this>");
        Byte bM21774 = m21774(d);
        if (bM21774 != null) {
            return interfaceC3854.mo829(bM21774);
        }
        return false;
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "byteRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21651(InterfaceC3854 interfaceC3854, float f) {
        C5499.m17103(interfaceC3854, "<this>");
        Byte bM21775 = m21775(f);
        if (bM21775 != null) {
            return interfaceC3854.mo829(bM21775);
        }
        return false;
    }

    @InterfaceC5572(name = "byteRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m21652(@InterfaceC6399 InterfaceC3854<Byte> interfaceC3854, int i) {
        C5499.m17103(interfaceC3854, "<this>");
        Byte bM21776 = m21776(i);
        if (bM21776 != null) {
            return interfaceC3854.mo829(bM21776);
        }
        return false;
    }

    @InterfaceC5572(name = "byteRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m21653(@InterfaceC6399 InterfaceC3854<Byte> interfaceC3854, long j) {
        C5499.m17103(interfaceC3854, "<this>");
        Byte bM21777 = m21777(j);
        if (bM21777 != null) {
            return interfaceC3854.mo829(bM21777);
        }
        return false;
    }

    @InterfaceC5572(name = "byteRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean m21654(@InterfaceC6399 InterfaceC3854<Byte> interfaceC3854, short s) {
        C5499.m17103(interfaceC3854, "<this>");
        Byte bM21778 = m21778(s);
        if (bM21778 != null) {
            return interfaceC3854.mo829(bM21778);
        }
        return false;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "byteRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final boolean m21655(@InterfaceC6399 InterfaceC6571<Byte> interfaceC6571, int i) {
        C5499.m17103(interfaceC6571, "<this>");
        Byte bM21776 = m21776(i);
        if (bM21776 != null) {
            return interfaceC6571.mo829(bM21776);
        }
        return false;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "byteRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final boolean m21656(@InterfaceC6399 InterfaceC6571<Byte> interfaceC6571, long j) {
        C5499.m17103(interfaceC6571, "<this>");
        Byte bM21777 = m21777(j);
        if (bM21777 != null) {
            return interfaceC6571.mo829(bM21777);
        }
        return false;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "byteRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final boolean m21657(@InterfaceC6399 InterfaceC6571<Byte> interfaceC6571, short s) {
        C5499.m17103(interfaceC6571, "<this>");
        Byte bM21778 = m21778(s);
        if (bM21778 != null) {
            return interfaceC6571.mo829(bM21778);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final byte m21658(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final double m21659(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final float m21660(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static int m21661(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static long m21662(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m21663(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, "<this>");
        C5499.m17103(t2, "minimumValue");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final short m21664(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final byte m21665(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final double m21666(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final float m21667(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static int m21668(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static long m21669(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m21670(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        C5499.m17103(t, "<this>");
        C5499.m17103(t2, "maximumValue");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final short m21671(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final byte m21672(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            return b < b2 ? b2 : b > b3 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final double m21673(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final float m21674(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static int m21675(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int m21676(int i, @InterfaceC6399 InterfaceC3854<Integer> interfaceC3854) {
        C5499.m17103(interfaceC3854, "range");
        if (interfaceC3854 instanceof InterfaceC3853) {
            return ((Number) m21679(Integer.valueOf(i), (InterfaceC3853) interfaceC3854)).intValue();
        }
        if (!interfaceC3854.isEmpty()) {
            return i < ((Number) interfaceC3854.mo830()).intValue() ? ((Number) interfaceC3854.mo830()).intValue() : i > ((Number) interfaceC3854.mo10384()).intValue() ? ((Number) interfaceC3854.mo10384()).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC3854 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static long m21677(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static long m21678(long j, @InterfaceC6399 InterfaceC3854<Long> interfaceC3854) {
        C5499.m17103(interfaceC3854, "range");
        if (interfaceC3854 instanceof InterfaceC3853) {
            return ((Number) m21679(Long.valueOf(j), (InterfaceC3853) interfaceC3854)).longValue();
        }
        if (!interfaceC3854.isEmpty()) {
            return j < ((Number) interfaceC3854.mo830()).longValue() ? ((Number) interfaceC3854.mo830()).longValue() : j > ((Number) interfaceC3854.mo10384()).longValue() ? ((Number) interfaceC3854.mo10384()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC3854 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m21679(@InterfaceC6399 T t, @InterfaceC6399 InterfaceC3853<T> interfaceC3853) {
        C5499.m17103(t, "<this>");
        C5499.m17103(interfaceC3853, "range");
        if (!interfaceC3853.isEmpty()) {
            return (!interfaceC3853.mo10659(t, interfaceC3853.mo830()) || interfaceC3853.mo10659(interfaceC3853.mo830(), t)) ? (!interfaceC3853.mo10659(interfaceC3853.mo10384(), t) || interfaceC3853.mo10659(t, interfaceC3853.mo10384())) ? t : interfaceC3853.mo10384() : interfaceC3853.mo830();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC3853 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m21680(@InterfaceC6399 T t, @InterfaceC6399 InterfaceC3854<T> interfaceC3854) {
        C5499.m17103(t, "<this>");
        C5499.m17103(interfaceC3854, "range");
        if (interfaceC3854 instanceof InterfaceC3853) {
            return (T) m21679(t, (InterfaceC3853) interfaceC3854);
        }
        if (!interfaceC3854.isEmpty()) {
            return t.compareTo(interfaceC3854.mo830()) < 0 ? (T) interfaceC3854.mo830() : t.compareTo(interfaceC3854.mo10384()) > 0 ? (T) interfaceC3854.mo10384() : t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC3854 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m21681(@InterfaceC6399 T t, @InterfaceC6489 T t2, @InterfaceC6489 T t3) {
        C5499.m17103(t, "<this>");
        if (t2 == null || t3 == null) {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        } else {
            if (t2.compareTo(t3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
            if (t.compareTo(t2) < 0) {
                return t2;
            }
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final short m21682(short s, short s2, short s3) {
        if (s2 <= s3) {
            return s < s2 ? s2 : s > s3 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final boolean m21683(C3784 c3784, Character ch) {
        C5499.m17103(c3784, "<this>");
        return ch != null && c3784.m10385(ch.charValue());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final boolean m21684(C5458 c5458, byte b) {
        C5499.m17103(c5458, "<this>");
        return m21726(c5458, b);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final boolean m21685(C5458 c5458, long j) {
        C5499.m17103(c5458, "<this>");
        return m21729(c5458, j);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final boolean m21686(C5458 c5458, Integer num) {
        C5499.m17103(c5458, "<this>");
        return num != null && c5458.m16971(num.intValue());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final boolean m21687(C5458 c5458, short s) {
        C5499.m17103(c5458, "<this>");
        return m21730(c5458, s);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final boolean m21688(C5883 c5883, byte b) {
        C5499.m17103(c5883, "<this>");
        return m21740(c5883, b);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m21689(C5883 c5883, int i) {
        C5499.m17103(c5883, "<this>");
        return m21743(c5883, i);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean m21690(C5883 c5883, Long l) {
        C5499.m17103(c5883, "<this>");
        return l != null && c5883.m18199(l.longValue());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final boolean m21691(C5883 c5883, short s) {
        C5499.m17103(c5883, "<this>");
        return m21744(c5883, s);
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "doubleRangeContains")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21692(InterfaceC3854 interfaceC3854, byte b) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Double.valueOf(b));
    }

    @InterfaceC5572(name = "doubleRangeContains")
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final boolean m21693(@InterfaceC6399 InterfaceC3854<Double> interfaceC3854, float f) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Double.valueOf(f));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "doubleRangeContains")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21694(InterfaceC3854 interfaceC3854, int i) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Double.valueOf(i));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "doubleRangeContains")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21695(InterfaceC3854 interfaceC3854, long j) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Double.valueOf(j));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "doubleRangeContains")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21696(InterfaceC3854 interfaceC3854, short s) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Double.valueOf(s));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "doubleRangeContains")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final boolean m21697(@InterfaceC6399 InterfaceC6571<Double> interfaceC6571, float f) {
        C5499.m17103(interfaceC6571, "<this>");
        return interfaceC6571.mo829(Double.valueOf(f));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final C3782 m21698(char c, char c2) {
        return C3782.f6962.m828(c, c2, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final C5456 m21699(byte b, byte b2) {
        return C5456.f13412.m2226(b, b2, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final C5456 m21700(byte b, int i) {
        return C5456.f13412.m2226(b, i, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final C5456 m21701(byte b, short s) {
        return C5456.f13412.m2226(b, s, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final C5456 m21702(int i, byte b) {
        return C5456.f13412.m2226(i, b, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static C5456 m21703(int i, int i2) {
        return C5456.f13412.m2226(i, i2, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final C5456 m21704(int i, short s) {
        return C5456.f13412.m2226(i, s, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final C5456 m21705(short s, byte b) {
        return C5456.f13412.m2226(s, b, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final C5456 m21706(short s, int i) {
        return C5456.f13412.m2226(s, i, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final C5456 m21707(short s, short s2) {
        return C5456.f13412.m2226(s, s2, -1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final C5881 m21708(byte b, long j) {
        return C5881.f14586.m2550(b, j, -1L);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final C5881 m21709(int i, long j) {
        return C5881.f14586.m2550(i, j, -1L);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final C5881 m21710(long j, byte b) {
        return C5881.f14586.m2550(j, b, -1L);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final C5881 m21711(long j, int i) {
        return C5881.f14586.m2550(j, i, -1L);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final C5881 m21712(long j, long j2) {
        return C5881.f14586.m2550(j, j2, -1L);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final C5881 m21713(long j, short s) {
        return C5881.f14586.m2550(j, s, -1L);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final C5881 m21714(short s, long j) {
        return C5881.f14586.m2550(s, j, -1L);
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final char m21715(@InterfaceC6399 C3782 c3782) {
        C5499.m17103(c3782, "<this>");
        if (!c3782.isEmpty()) {
            return c3782.m10376();
        }
        throw new NoSuchElementException("Progression " + c3782 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final int m21716(@InterfaceC6399 C5456 c5456) {
        C5499.m17103(c5456, "<this>");
        if (!c5456.isEmpty()) {
            return c5456.m16964();
        }
        throw new NoSuchElementException("Progression " + c5456 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final long m21717(@InterfaceC6399 C5881 c5881) {
        C5499.m17103(c5881, "<this>");
        if (!c5881.isEmpty()) {
            return c5881.m18192();
        }
        throw new NoSuchElementException("Progression " + c5881 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final Character m21718(@InterfaceC6399 C3782 c3782) {
        C5499.m17103(c3782, "<this>");
        if (c3782.isEmpty()) {
            return null;
        }
        return Character.valueOf(c3782.m10376());
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final Integer m21719(@InterfaceC6399 C5456 c5456) {
        C5499.m17103(c5456, "<this>");
        if (c5456.isEmpty()) {
            return null;
        }
        return Integer.valueOf(c5456.m16964());
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final Long m21720(@InterfaceC6399 C5881 c5881) {
        C5499.m17103(c5881, "<this>");
        if (c5881.isEmpty()) {
            return null;
        }
        return Long.valueOf(c5881.m18192());
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "floatRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21721(InterfaceC3854 interfaceC3854, byte b) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Float.valueOf(b));
    }

    @InterfaceC5572(name = "floatRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final boolean m21722(@InterfaceC6399 InterfaceC3854<Float> interfaceC3854, double d) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Float.valueOf((float) d));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "floatRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21723(InterfaceC3854 interfaceC3854, int i) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Float.valueOf(i));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "floatRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21724(InterfaceC3854 interfaceC3854, long j) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Float.valueOf(j));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "floatRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21725(InterfaceC3854 interfaceC3854, short s) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Float.valueOf(s));
    }

    @InterfaceC5572(name = "intRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final boolean m21726(@InterfaceC6399 InterfaceC3854<Integer> interfaceC3854, byte b) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Integer.valueOf(b));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "intRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21727(InterfaceC3854 interfaceC3854, double d) {
        C5499.m17103(interfaceC3854, "<this>");
        Integer numM21779 = m21779(d);
        if (numM21779 != null) {
            return interfaceC3854.mo829(numM21779);
        }
        return false;
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "intRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21728(InterfaceC3854 interfaceC3854, float f) {
        C5499.m17103(interfaceC3854, "<this>");
        Integer numM21780 = m21780(f);
        if (numM21780 != null) {
            return interfaceC3854.mo829(numM21780);
        }
        return false;
    }

    @InterfaceC5572(name = "intRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static boolean m21729(@InterfaceC6399 InterfaceC3854<Integer> interfaceC3854, long j) {
        C5499.m17103(interfaceC3854, "<this>");
        Integer numM21781 = m21781(j);
        if (numM21781 != null) {
            return interfaceC3854.mo829(numM21781);
        }
        return false;
    }

    @InterfaceC5572(name = "intRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final boolean m21730(@InterfaceC6399 InterfaceC3854<Integer> interfaceC3854, short s) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Integer.valueOf(s));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "intRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final boolean m21731(@InterfaceC6399 InterfaceC6571<Integer> interfaceC6571, byte b) {
        C5499.m17103(interfaceC6571, "<this>");
        return interfaceC6571.mo829(Integer.valueOf(b));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "intRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final boolean m21732(@InterfaceC6399 InterfaceC6571<Integer> interfaceC6571, long j) {
        C5499.m17103(interfaceC6571, "<this>");
        Integer numM21781 = m21781(j);
        if (numM21781 != null) {
            return interfaceC6571.mo829(numM21781);
        }
        return false;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "intRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final boolean m21733(@InterfaceC6399 InterfaceC6571<Integer> interfaceC6571, short s) {
        C5499.m17103(interfaceC6571, "<this>");
        return interfaceC6571.mo829(Integer.valueOf(s));
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final char m21734(@InterfaceC6399 C3782 c3782) {
        C5499.m17103(c3782, "<this>");
        if (!c3782.isEmpty()) {
            return c3782.m10377();
        }
        throw new NoSuchElementException("Progression " + c3782 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final int m21735(@InterfaceC6399 C5456 c5456) {
        C5499.m17103(c5456, "<this>");
        if (!c5456.isEmpty()) {
            return c5456.m16965();
        }
        throw new NoSuchElementException("Progression " + c5456 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final long m21736(@InterfaceC6399 C5881 c5881) {
        C5499.m17103(c5881, "<this>");
        if (!c5881.isEmpty()) {
            return c5881.m18193();
        }
        throw new NoSuchElementException("Progression " + c5881 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final Character m21737(@InterfaceC6399 C3782 c3782) {
        C5499.m17103(c3782, "<this>");
        if (c3782.isEmpty()) {
            return null;
        }
        return Character.valueOf(c3782.m10377());
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final Integer m21738(@InterfaceC6399 C5456 c5456) {
        C5499.m17103(c5456, "<this>");
        if (c5456.isEmpty()) {
            return null;
        }
        return Integer.valueOf(c5456.m16965());
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final Long m21739(@InterfaceC6399 C5881 c5881) {
        C5499.m17103(c5881, "<this>");
        if (c5881.isEmpty()) {
            return null;
        }
        return Long.valueOf(c5881.m18193());
    }

    @InterfaceC5572(name = "longRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final boolean m21740(@InterfaceC6399 InterfaceC3854<Long> interfaceC3854, byte b) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Long.valueOf(b));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "longRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21741(InterfaceC3854 interfaceC3854, double d) {
        C5499.m17103(interfaceC3854, "<this>");
        Long lM21782 = m21782(d);
        if (lM21782 != null) {
            return interfaceC3854.mo829(lM21782);
        }
        return false;
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "longRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21742(InterfaceC3854 interfaceC3854, float f) {
        C5499.m17103(interfaceC3854, "<this>");
        Long lM21783 = m21783(f);
        if (lM21783 != null) {
            return interfaceC3854.mo829(lM21783);
        }
        return false;
    }

    @InterfaceC5572(name = "longRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final boolean m21743(@InterfaceC6399 InterfaceC3854<Long> interfaceC3854, int i) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Long.valueOf(i));
    }

    @InterfaceC5572(name = "longRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final boolean m21744(@InterfaceC6399 InterfaceC3854<Long> interfaceC3854, short s) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Long.valueOf(s));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "longRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final boolean m21745(@InterfaceC6399 InterfaceC6571<Long> interfaceC6571, byte b) {
        C5499.m17103(interfaceC6571, "<this>");
        return interfaceC6571.mo829(Long.valueOf(b));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "longRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final boolean m21746(@InterfaceC6399 InterfaceC6571<Long> interfaceC6571, int i) {
        C5499.m17103(interfaceC6571, "<this>");
        return interfaceC6571.mo829(Long.valueOf(i));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "longRangeContains")
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final boolean m21747(@InterfaceC6399 InterfaceC6571<Long> interfaceC6571, short s) {
        C5499.m17103(interfaceC6571, "<this>");
        return interfaceC6571.mo829(Long.valueOf(s));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final char m21748(C3784 c3784) {
        C5499.m17103(c3784, "<this>");
        return m21749(c3784, AbstractC7000.f21141);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final char m21749(@InterfaceC6399 C3784 c3784, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c3784, "<this>");
        C5499.m17103(abstractC7000, "random");
        try {
            return (char) abstractC7000.mo21330(c3784.m10376(), c3784.m10377() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final int m21750(C5458 c5458) {
        C5499.m17103(c5458, "<this>");
        return m21751(c5458, AbstractC7000.f21141);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final int m21751(@InterfaceC6399 C5458 c5458, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c5458, "<this>");
        C5499.m17103(abstractC7000, "random");
        try {
            return C7002.m21626(abstractC7000, c5458);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final long m21752(C5883 c5883) {
        C5499.m17103(c5883, "<this>");
        return m21753(c5883, AbstractC7000.f21141);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final long m21753(@InterfaceC6399 C5883 c5883, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c5883, "<this>");
        C5499.m17103(abstractC7000, "random");
        try {
            return C7002.m21627(abstractC7000, c5883);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final Character m21754(C3784 c3784) {
        C5499.m17103(c3784, "<this>");
        return m21755(c3784, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final Character m21755(@InterfaceC6399 C3784 c3784, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c3784, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (c3784.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) abstractC7000.mo21330(c3784.m10376(), c3784.m10377() + 1));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final Integer m21756(C5458 c5458) {
        C5499.m17103(c5458, "<this>");
        return m21757(c5458, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final Integer m21757(@InterfaceC6399 C5458 c5458, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c5458, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (c5458.isEmpty()) {
            return null;
        }
        return Integer.valueOf(C7002.m21626(abstractC7000, c5458));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final Long m21758(C5883 c5883) {
        C5499.m17103(c5883, "<this>");
        return m21759(c5883, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final Long m21759(@InterfaceC6399 C5883 c5883, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c5883, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (c5883.isEmpty()) {
            return null;
        }
        return Long.valueOf(C7002.m21627(abstractC7000, c5883));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final C3782 m21760(@InterfaceC6399 C3782 c3782) {
        C5499.m17103(c3782, "<this>");
        return C3782.f6962.m828(c3782.m10377(), c3782.m10376(), -c3782.m10378());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final C5456 m21761(@InterfaceC6399 C5456 c5456) {
        C5499.m17103(c5456, "<this>");
        return C5456.f13412.m2226(c5456.m16965(), c5456.m16964(), -c5456.m16966());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final C5881 m21762(@InterfaceC6399 C5881 c5881) {
        C5499.m17103(c5881, "<this>");
        return C5881.f14586.m2550(c5881.m18193(), c5881.m18192(), -c5881.m18194());
    }

    @InterfaceC5572(name = "shortRangeContains")
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final boolean m21763(@InterfaceC6399 InterfaceC3854<Short> interfaceC3854, byte b) {
        C5499.m17103(interfaceC3854, "<this>");
        return interfaceC3854.mo829(Short.valueOf(b));
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "shortRangeContains")
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21764(InterfaceC3854 interfaceC3854, double d) {
        C5499.m17103(interfaceC3854, "<this>");
        Short shM21784 = m21784(d);
        if (shM21784 != null) {
            return interfaceC3854.mo829(shM21784);
        }
        return false;
    }

    @InterfaceC4374(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @InterfaceC4372(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @InterfaceC5572(name = "shortRangeContains")
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m21765(InterfaceC3854 interfaceC3854, float f) {
        C5499.m17103(interfaceC3854, "<this>");
        Short shM21785 = m21785(f);
        if (shM21785 != null) {
            return interfaceC3854.mo829(shM21785);
        }
        return false;
    }

    @InterfaceC5572(name = "shortRangeContains")
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final boolean m21766(@InterfaceC6399 InterfaceC3854<Short> interfaceC3854, int i) {
        C5499.m17103(interfaceC3854, "<this>");
        Short shM21786 = m21786(i);
        if (shM21786 != null) {
            return interfaceC3854.mo829(shM21786);
        }
        return false;
    }

    @InterfaceC5572(name = "shortRangeContains")
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final boolean m21767(@InterfaceC6399 InterfaceC3854<Short> interfaceC3854, long j) {
        C5499.m17103(interfaceC3854, "<this>");
        Short shM21787 = m21787(j);
        if (shM21787 != null) {
            return interfaceC3854.mo829(shM21787);
        }
        return false;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "shortRangeContains")
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final boolean m21768(@InterfaceC6399 InterfaceC6571<Short> interfaceC6571, byte b) {
        C5499.m17103(interfaceC6571, "<this>");
        return interfaceC6571.mo829(Short.valueOf(b));
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "shortRangeContains")
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final boolean m21769(@InterfaceC6399 InterfaceC6571<Short> interfaceC6571, int i) {
        C5499.m17103(interfaceC6571, "<this>");
        Short shM21786 = m21786(i);
        if (shM21786 != null) {
            return interfaceC6571.mo829(shM21786);
        }
        return false;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.9")
    @InterfaceC5572(name = "shortRangeContains")
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final boolean m21770(@InterfaceC6399 InterfaceC6571<Short> interfaceC6571, long j) {
        C5499.m17103(interfaceC6571, "<this>");
        Short shM21787 = m21787(j);
        if (shM21787 != null) {
            return interfaceC6571.mo829(shM21787);
        }
        return false;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final C3782 m21771(@InterfaceC6399 C3782 c3782, int i) {
        C5499.m17103(c3782, "<this>");
        C7006.m3313(i > 0, Integer.valueOf(i));
        C3782.C0252 c0252 = C3782.f6962;
        char cM10376 = c3782.m10376();
        char cM10377 = c3782.m10377();
        if (c3782.m10378() <= 0) {
            i = -i;
        }
        return c0252.m828(cM10376, cM10377, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static C5456 m21772(@InterfaceC6399 C5456 c5456, int i) {
        C5499.m17103(c5456, "<this>");
        C7006.m3313(i > 0, Integer.valueOf(i));
        C5456.C0769 c0769 = C5456.f13412;
        int iM16964 = c5456.m16964();
        int iM16965 = c5456.m16965();
        if (c5456.m16966() <= 0) {
            i = -i;
        }
        return c0769.m2226(iM16964, iM16965, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final C5881 m21773(@InterfaceC6399 C5881 c5881, long j) {
        C5499.m17103(c5881, "<this>");
        C7006.m3313(j > 0, Long.valueOf(j));
        C5881.C0889 c0889 = C5881.f14586;
        long jM18192 = c5881.m18192();
        long jM18193 = c5881.m18193();
        if (c5881.m18194() <= 0) {
            j = -j;
        }
        return c0889.m2550(jM18192, jM18193, j);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final Byte m21774(double d) {
        if (-128.0d > d || d > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final Byte m21775(float f) {
        if (-128.0f > f || f > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final Byte m21776(int i) {
        if (new C5458(-128, 127).m16971(i)) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static final Byte m21777(long j) {
        if (new C5883(-128L, 127L).m18199(j)) {
            return Byte.valueOf((byte) j);
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static final Byte m21778(short s) {
        if (m21730(new C5458(-128, 127), s)) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static final Integer m21779(double d) {
        if (-2.147483648E9d > d || d > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static final Integer m21780(float f) {
        if (-2.1474836E9f > f || f > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static final Integer m21781(long j) {
        if (new C5883(-2147483648L, 2147483647L).m18199(j)) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final Long m21782(double d) {
        if (-9.223372036854776E18d > d || d > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static final Long m21783(float f) {
        if (-9.223372E18f > f || f > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static final Short m21784(double d) {
        if (-32768.0d > d || d > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static final Short m21785(float f) {
        if (-32768.0f > f || f > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static final Short m21786(int i) {
        if (new C5458(-32768, Advice.MethodSizeHandler.UNDEFINED_SIZE).m16971(i)) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static final Short m21787(long j) {
        if (new C5883(-32768L, 32767L).m18199(j)) {
            return Short.valueOf((short) j);
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static final C3784 m21788(char c, char c2) {
        return C5499.m17107(c2, 0) <= 0 ? C3784.f6970.m831() : new C3784(c, (char) (c2 - 1));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static final C5458 m21789(byte b, byte b2) {
        return new C5458(b, b2 - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static final C5458 m21790(byte b, int i) {
        return i <= Integer.MIN_VALUE ? C5458.f13420.m2227() : new C5458(b, i - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static final C5458 m21791(byte b, short s) {
        return new C5458(b, s - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static final C5458 m21792(int i, byte b) {
        return new C5458(i, b - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static C5458 m21793(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? C5458.f13420.m2227() : new C5458(i, i2 - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static final C5458 m21794(int i, short s) {
        return new C5458(i, s - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static final C5458 m21795(short s, byte b) {
        return new C5458(s, b - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static final C5458 m21796(short s, int i) {
        return i <= Integer.MIN_VALUE ? C5458.f13420.m2227() : new C5458(s, i - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static final C5458 m21797(short s, short s2) {
        return new C5458(s, s2 - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static final C5883 m21798(byte b, long j) {
        return j <= Long.MIN_VALUE ? C5883.f14594.m2551() : new C5883(b, j - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static final C5883 m21799(int i, long j) {
        return j <= Long.MIN_VALUE ? C5883.f14594.m2551() : new C5883(i, j - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final C5883 m21800(long j, byte b) {
        return new C5883(j, ((long) b) - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final C5883 m21801(long j, int i) {
        return new C5883(j, ((long) i) - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final C5883 m21802(long j, long j2) {
        return j2 <= Long.MIN_VALUE ? C5883.f14594.m2551() : new C5883(j, j2 - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final C5883 m21803(long j, short s) {
        return new C5883(j, ((long) s) - 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static final C5883 m21804(short s, long j) {
        return j <= Long.MIN_VALUE ? C5883.f14594.m2551() : new C5883(s, j - 1);
    }
}
