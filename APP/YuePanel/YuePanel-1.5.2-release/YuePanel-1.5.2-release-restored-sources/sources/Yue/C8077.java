package Yue;

import Yue.C8061;
import Yue.C8068;
import java.util.NoSuchElementException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۢۢۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8077 {
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ */
    public static final short m4111(short s, short s2) {
        return C5499.m17107(s & C8080.f23970, 65535 & s2) < 0 ? s2 : s;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final int m4112(int i, int i2) {
        return Integer.compareUnsigned(i, i2) < 0 ? i2 : i;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final byte m26535(byte b, byte b2) {
        return C5499.m17107(b & 255, b2 & 255) < 0 ? b2 : b;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long m26536(long j, long j2) {
        return Long.compareUnsigned(j, j2) < 0 ? j2 : j;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final short m26537(short s, short s2) {
        return C5499.m17107(s & C8080.f23970, 65535 & s2) > 0 ? s2 : s;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m26538(int i, int i2) {
        return Integer.compareUnsigned(i, i2) > 0 ? i2 : i;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final byte m26539(byte b, byte b2) {
        return C5499.m17107(b & 255, b2 & 255) > 0 ? b2 : b;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long m26540(long j, long j2) {
        return Long.compareUnsigned(j, j2) > 0 ? j2 : j;
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m26541(long j, @InterfaceC6399 InterfaceC3854<C8064> interfaceC3854) {
        C5499.m17103(interfaceC3854, "range");
        if (interfaceC3854 instanceof InterfaceC3853) {
            return ((C8064) C7007.m21679(C8064.m26403(j), (InterfaceC3853) interfaceC3854)).m26462();
        }
        if (!interfaceC3854.isEmpty()) {
            return Long.compareUnsigned(j, ((C8064) interfaceC3854.mo830()).m26462()) < 0 ? ((C8064) interfaceC3854.mo830()).m26462() : Long.compareUnsigned(j, ((C8064) interfaceC3854.mo10384()).m26462()) > 0 ? ((C8064) interfaceC3854.mo10384()).m26462() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC3854 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final short m26542(short s, short s2, short s3) {
        int i = s2 & C8080.f23970;
        int i2 = s3 & C8080.f23970;
        if (C5499.m17107(i, i2) <= 0) {
            int i3 = 65535 & s;
            return C5499.m17107(i3, i) < 0 ? s2 : C5499.m17107(i3, i2) > 0 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) C8080.m26635(s3)) + " is less than minimum " + ((Object) C8080.m26635(s2)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m26543(int i, int i2, int i3) {
        if (Integer.compareUnsigned(i2, i3) <= 0) {
            return Integer.compareUnsigned(i, i2) < 0 ? i2 : Integer.compareUnsigned(i, i3) > 0 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) C8057.m26365(i3)) + " is less than minimum " + ((Object) C8057.m26365(i2)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final byte m26544(byte b, byte b2, byte b3) {
        int i = b2 & 255;
        int i2 = b3 & 255;
        if (C5499.m17107(i, i2) <= 0) {
            int i3 = b & 255;
            return C5499.m17107(i3, i) < 0 ? b2 : C5499.m17107(i3, i2) > 0 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) C8048.m26238(b3)) + " is less than minimum " + ((Object) C8048.m26238(b2)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final long m26545(long j, long j2, long j3) {
        if (Long.compareUnsigned(j2, j3) <= 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j2 : Long.compareUnsigned(j, j3) > 0 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) C8064.m26455(j3)) + " is less than minimum " + ((Object) C8064.m26455(j2)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int m26546(int i, @InterfaceC6399 InterfaceC3854<C8057> interfaceC3854) {
        C5499.m17103(interfaceC3854, "range");
        if (interfaceC3854 instanceof InterfaceC3853) {
            return ((C8057) C7007.m21679(C8057.m26313(i), (InterfaceC3853) interfaceC3854)).m26372();
        }
        if (!interfaceC3854.isEmpty()) {
            return Integer.compareUnsigned(i, ((C8057) interfaceC3854.mo830()).m26372()) < 0 ? ((C8057) interfaceC3854.mo830()).m26372() : Integer.compareUnsigned(i, ((C8057) interfaceC3854.mo10384()).m26372()) > 0 ? ((C8057) interfaceC3854.mo10384()).m26372() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + interfaceC3854 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final boolean m26547(@InterfaceC6399 C8063 c8063, byte b) {
        C5499.m17103(c8063, "$this$contains");
        return c8063.m26399(C8057.m26318(b & 255));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final boolean m26548(C8070 c8070, C8064 c8064) {
        C5499.m17103(c8070, "$this$contains");
        return c8064 != null && c8070.m26489(c8064.m26462());
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final boolean m26549(@InterfaceC6399 C8070 c8070, int i) {
        C5499.m17103(c8070, "$this$contains");
        return c8070.m26489(C8064.m26408(((long) i) & C8578.f25466));
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final boolean m26550(@InterfaceC6399 C8070 c8070, byte b) {
        C5499.m17103(c8070, "$this$contains");
        return c8070.m26489(C8064.m26408(((long) b) & 255));
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean m26551(@InterfaceC6399 C8063 c8063, short s) {
        C5499.m17103(c8063, "$this$contains");
        return c8063.m26399(C8057.m26318(s & C8080.f23970));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final boolean m26552(C8063 c8063, C8057 c8057) {
        C5499.m17103(c8063, "$this$contains");
        return c8057 != null && c8063.m26399(c8057.m26372());
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final boolean m26553(@InterfaceC6399 C8063 c8063, long j) {
        C5499.m17103(c8063, "$this$contains");
        return C8064.m26408(j >>> 32) == 0 && c8063.m26399(C8057.m26318((int) j));
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final boolean m26554(@InterfaceC6399 C8070 c8070, short s) {
        C5499.m17103(c8070, "$this$contains");
        return c8070.m26489(C8064.m26408(((long) s) & C8417.f25173));
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final C8061 m26555(short s, short s2) {
        return C8061.f23939.m4089(C8057.m26318(s & C8080.f23970), C8057.m26318(s2 & C8080.f23970), -1);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final C8061 m26556(int i, int i2) {
        return C8061.f23939.m4089(i, i2, -1);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final C8061 m26557(byte b, byte b2) {
        return C8061.f23939.m4089(C8057.m26318(b & 255), C8057.m26318(b2 & 255), -1);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final C8068 m26558(long j, long j2) {
        return C8068.f23958.m4100(j, j2, -1L);
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int m26559(@InterfaceC6399 C8061 c8061) {
        C5499.m17103(c8061, "<this>");
        if (!c8061.isEmpty()) {
            return c8061.m26394();
        }
        throw new NoSuchElementException("Progression " + c8061 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final long m26560(@InterfaceC6399 C8068 c8068) {
        C5499.m17103(c8068, "<this>");
        if (!c8068.isEmpty()) {
            return c8068.m26484();
        }
        throw new NoSuchElementException("Progression " + c8068 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final C8057 m26561(@InterfaceC6399 C8061 c8061) {
        C5499.m17103(c8061, "<this>");
        if (c8061.isEmpty()) {
            return null;
        }
        return C8057.m26313(c8061.m26394());
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final C8064 m26562(@InterfaceC6399 C8068 c8068) {
        C5499.m17103(c8068, "<this>");
        if (c8068.isEmpty()) {
            return null;
        }
        return C8064.m26403(c8068.m26484());
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int m26563(@InterfaceC6399 C8061 c8061) {
        C5499.m17103(c8061, "<this>");
        if (!c8061.isEmpty()) {
            return c8061.m26395();
        }
        throw new NoSuchElementException("Progression " + c8061 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final long m26564(@InterfaceC6399 C8068 c8068) {
        C5499.m17103(c8068, "<this>");
        if (!c8068.isEmpty()) {
            return c8068.m26485();
        }
        throw new NoSuchElementException("Progression " + c8068 + " is empty.");
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final C8057 m26565(@InterfaceC6399 C8061 c8061) {
        C5499.m17103(c8061, "<this>");
        if (c8061.isEmpty()) {
            return null;
        }
        return C8057.m26313(c8061.m26395());
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final C8064 m26566(@InterfaceC6399 C8068 c8068) {
        C5499.m17103(c8068, "<this>");
        if (c8068.isEmpty()) {
            return null;
        }
        return C8064.m26403(c8068.m26485());
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int m26567(C8063 c8063) {
        C5499.m17103(c8063, "<this>");
        return m26568(c8063, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int m26568(@InterfaceC6399 C8063 c8063, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c8063, "<this>");
        C5499.m17103(abstractC7000, "random");
        try {
            return C8075.m26528(abstractC7000, c8063);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final long m26569(C8070 c8070) {
        C5499.m17103(c8070, "<this>");
        return m26570(c8070, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final long m26570(@InterfaceC6399 C8070 c8070, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c8070, "<this>");
        C5499.m17103(abstractC7000, "random");
        try {
            return C8075.m26532(abstractC7000, c8070);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final C8057 m26571(C8063 c8063) {
        C5499.m17103(c8063, "<this>");
        return m26572(c8063, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final C8057 m26572(@InterfaceC6399 C8063 c8063, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c8063, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (c8063.isEmpty()) {
            return null;
        }
        return C8057.m26313(C8075.m26528(abstractC7000, c8063));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final C8064 m26573(C8070 c8070) {
        C5499.m17103(c8070, "<this>");
        return m26574(c8070, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class, InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final C8064 m26574(@InterfaceC6399 C8070 c8070, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(c8070, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (c8070.isEmpty()) {
            return null;
        }
        return C8064.m26403(C8075.m26532(abstractC7000, c8070));
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final C8061 m26575(@InterfaceC6399 C8061 c8061) {
        C5499.m17103(c8061, "<this>");
        return C8061.f23939.m4089(c8061.m26395(), c8061.m26394(), -c8061.m26396());
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final C8068 m26576(@InterfaceC6399 C8068 c8068) {
        C5499.m17103(c8068, "<this>");
        return C8068.f23958.m4100(c8068.m26485(), c8068.m26484(), -c8068.m26486());
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final C8061 m26577(@InterfaceC6399 C8061 c8061, int i) {
        C5499.m17103(c8061, "<this>");
        C7006.m3313(i > 0, Integer.valueOf(i));
        C8061.C1422 c1422 = C8061.f23939;
        int iM26394 = c8061.m26394();
        int iM26395 = c8061.m26395();
        if (c8061.m26396() <= 0) {
            i = -i;
        }
        return c1422.m4089(iM26394, iM26395, i);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final C8068 m26578(@InterfaceC6399 C8068 c8068, long j) {
        C5499.m17103(c8068, "<this>");
        C7006.m3313(j > 0, Long.valueOf(j));
        C8068.C1426 c1426 = C8068.f23958;
        long jM26484 = c8068.m26484();
        long jM26485 = c8068.m26485();
        if (c8068.m26486() <= 0) {
            j = -j;
        }
        return c1426.m4100(jM26484, jM26485, j);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final C8063 m26579(short s, short s2) {
        return C5499.m17107(s2 & C8080.f23970, 0) <= 0 ? C8063.f23947.m4091() : new C8063(C8057.m26318(s & C8080.f23970), C8057.m26318(C8057.m26318(r3) - 1), null);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static C8063 m26580(int i, int i2) {
        return Integer.compareUnsigned(i2, 0) <= 0 ? C8063.f23947.m4091() : new C8063(i, C8057.m26318(i2 - 1), null);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C8063 m26581(byte b, byte b2) {
        return C5499.m17107(b2 & 255, 0) <= 0 ? C8063.f23947.m4091() : new C8063(C8057.m26318(b & 255), C8057.m26318(C8057.m26318(r3) - 1), null);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static C8070 m26582(long j, long j2) {
        return Long.compareUnsigned(j2, 0L) <= 0 ? C8070.f23966.m4102() : new C8070(j, C8064.m26408(j2 - C8064.m26408(((long) 1) & C8578.f25466)), null);
    }
}
