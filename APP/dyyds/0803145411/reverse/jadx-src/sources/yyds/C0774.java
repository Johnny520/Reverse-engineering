package yyds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0774 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    private static final C0782 f3569;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    private static final int f3570 = 32;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    private static final int f3571 = 12;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    private static final int f3572 = 10000;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    private static final byte[] f3573;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    private static final int f3574 = 16;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private static final int f3575 = 2;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    private static final int f3576 = 8;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0774 f3577;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    private static final int f3578 = 4;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    private static final long f3579 = 120000;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    private static final int f3580 = 2;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private static final int f3581 = 2;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    private static final int f3582 = 10;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    private static final int f3583 = 7;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    private static final int f3584 = 1;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    private static final int f3585 = 8;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    private static final int f3586 = 6;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    private static final int f3587 = 5;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    private static final int f3588 = 16;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    private static final int f3589 = 2097152;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    private static final SecureRandom f3590;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    private static final int f3591 = 12;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    private static final int f3592 = 3;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private static final int f3593 = 1;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    private static final int f3594 = 0;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    private static final int f3595 = 68;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private static final int f3596 = 1;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    private static final int f3597 = 9;

    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᛱᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0775 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final ByteArrayOutputStream f3598 = new ByteArrayOutputStream();

        /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
        private final void m1736(byte[] bArr) throws IOException {
            if (bArr.length > C0774.f3589) {
                C0188.m806(AbstractC2328.m4341(-686103418536814L));
                return;
            }
            m1741(bArr.length);
            this.f3598.write(bArr);
            m1739();
        }

        /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
        private final void m1737(long j) {
            int i = 56;
            int iM3792 = AbstractC1960.m3792(56, C0774.f3594, -8);
            if (iM3792 > 56) {
                return;
            }
            while (true) {
                m1745((int) (j >>> i));
                if (i == iM3792) {
                    return;
                } else {
                    i -= 8;
                }
            }
        }

        /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
        private final void m1738(double d) {
            m1745(C0774.f3587);
            m1737(Double.doubleToRawLongBits(d));
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final void m1739() {
            if (this.f3598.size() <= C0774.f3589) {
                return;
            }
            C0188.m806(AbstractC2328.m4341(-686236562522990L));
        }

        /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
        private final void m1740(int i) {
            m1745(C0774.f3592);
            m1741(i);
        }

        /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
        private final void m1741(int i) {
            m1745(i >>> 24);
            m1745(i >>> 16);
            m1745(i >>> 8);
            m1745(i);
        }

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        private final void m1742(int i) {
            if (i < 0 || i >= 10001) {
                C0188.m806(AbstractC2328.m4341(-685970274550638L));
            } else {
                m1741(i);
            }
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final byte[] m1743() {
            byte[] byteArray = this.f3598.toByteArray();
            AbstractC2328.m4341(-685897260106606L);
            return byteArray;
        }

        /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
        public final void m1744(Object obj, int i) throws IOException {
            if (i > C0774.f3570) {
                C0188.m798(AbstractC2328.m4341(-685545072788334L));
                return;
            }
            if (obj == null) {
                m1745(C0774.f3594);
            } else if (obj.equals(Boolean.FALSE)) {
                m1745(1);
            } else if (obj.equals(Boolean.TRUE)) {
                m1745(2);
            } else if (obj instanceof Byte) {
                m1740(((Number) obj).byteValue());
            } else if (obj instanceof Short) {
                m1740(((Number) obj).shortValue());
            } else if (obj instanceof Integer) {
                m1740(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                m1745(C0774.f3578);
                m1737(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                m1738(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                m1738(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                m1745(C0774.f3586);
                byte[] bytes = ((String) obj).getBytes(AbstractC0347.f1806);
                AbstractC2328.m4341(-685686806709102L);
                m1736(bytes);
            } else if (obj instanceof byte[]) {
                m1745(C0774.f3583);
                m1736((byte[]) obj);
            } else if (obj instanceof List) {
                m1745(8);
                m1742(((List) obj).size());
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    m1744(it.next(), i + 1);
                }
            } else if (obj instanceof Map) {
                m1745(C0774.f3597);
                Map map = (Map) obj;
                m1742(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    int i2 = i + 1;
                    m1744(key, i2);
                    m1744(value, i2);
                }
            } else {
                if (!(obj instanceof Pair)) {
                    C0188.m798(AbstractC2328.m4341(-685746936251246L).concat(obj.getClass().getName()));
                    return;
                }
                m1745(C0774.f3582);
                Pair pair = (Pair) obj;
                int i3 = i + 1;
                m1744(pair.getFirst(), i3);
                m1744(pair.getSecond(), i3);
            }
            m1739();
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public final void m1745(int i) {
            this.f3598.write(i & 255);
            m1739();
        }
    }

    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᛲᛳᛶᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final /* synthetic */ class C0776 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f3599;

        static {
            int[] iArr = new int[EnumC0778.values().length];
            try {
                iArr[EnumC0778.f3605.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3599 = iArr;
        }
    }

    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᛲᛴᛳᛲ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0777 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final EnumC0778 f3600;

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        private final byte[] f3601;

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        private final byte[] f3602;

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        private final AtomicBoolean f3603;

        public C0777(EnumC0778 enumC0778, byte[] bArr, byte[] bArr2) {
            AbstractC2328.m4341(-588186754122606L);
            AbstractC2328.m4341(-588221113860974L);
            AbstractC2328.m4341(-588264063533934L);
            this.f3600 = enumC0778;
            this.f3601 = bArr;
            this.f3602 = bArr2;
            this.f3603 = new AtomicBoolean(false);
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public final void m1746() {
            if (!this.f3603.compareAndSet(false, true)) {
                throw C0774.m1727(C0774.f3577);
            }
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final EnumC0778 m1747() {
            return this.f3600;
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public final byte[] m1748() {
            return this.f3602;
        }

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        public final byte[] m1749() {
            return this.f3601;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᛲᲈᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class EnumC0778 {

        /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
        private static final /* synthetic */ InterfaceC0318 f3604;

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public static final EnumC0778 f3605 = new EnumC0778(AbstractC2328.m4341(-788173316326254L), C0774.f3594);

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        private static final /* synthetic */ EnumC0778[] f3606;

        static {
            EnumC0778[] enumC0778ArrM1750 = m1750();
            f3606 = enumC0778ArrM1750;
            f3604 = new C0468(enumC0778ArrM1750);
        }

        private EnumC0778(String str, int i) {
        }

        public static EnumC0778 valueOf(String str) {
            return (EnumC0778) Enum.valueOf(EnumC0778.class, str);
        }

        public static EnumC0778[] values() {
            return (EnumC0778[]) f3606.clone();
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private static final /* synthetic */ EnumC0778[] m1750() {
            return new EnumC0778[]{f3605};
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public static InterfaceC0318 m1751() {
            return f3604;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᛵᛸᛸᛷ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class EnumC0779 {

        /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
        private static final /* synthetic */ InterfaceC0318 f3608;

        /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
        private static final /* synthetic */ EnumC0779[] f3609;

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        private final int f3611;

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        public static final EnumC0779 f3610 = new EnumC0779(AbstractC2328.m4341(-685472058344302L), C0774.f3594, 1);

        /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
        public static final EnumC0779 f3607 = new EnumC0779(AbstractC2328.m4341(-685506418082670L), 1, 2);

        static {
            EnumC0779[] enumC0779ArrM1752 = m1752();
            f3609 = enumC0779ArrM1752;
            f3608 = new C0468(enumC0779ArrM1752);
        }

        private EnumC0779(String str, int i, int i2) {
            this.f3611 = i2;
        }

        public static EnumC0779 valueOf(String str) {
            return (EnumC0779) Enum.valueOf(EnumC0779.class, str);
        }

        public static EnumC0779[] values() {
            return (EnumC0779[]) f3609.clone();
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private static final /* synthetic */ EnumC0779[] m1752() {
            return new EnumC0779[]{f3610, f3607};
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public static InterfaceC0318 m1753() {
            return f3608;
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final int m1754() {
            return this.f3611;
        }
    }

    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᛶᛷᛲᲁ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0780 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final byte[] f3612;

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        private int f3613;

        public C0780(byte[] bArr) {
            AbstractC2328.m4341(-579137258029934L);
            this.f3612 = bArr;
        }

        /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
        private final int m1755() {
            return m1762() | (m1762() << 24) | (m1762() << 16) | (m1762() << 8);
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final String m1756(byte[] bArr) {
            try {
                CharsetDecoder charsetDecoderNewDecoder = AbstractC0347.f1806.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                return charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)).toString();
            } catch (Exception unused) {
                throw C0774.m1727(C0774.f3577);
            }
        }

        /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
        private final long m1757() {
            long jM1762 = 0;
            for (int i = C0774.f3594; i < 8; i++) {
                jM1762 = (jM1762 << 8) | ((long) m1762());
            }
            return jM1762;
        }

        /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
        private final byte[] m1758() {
            int iM1755 = m1755();
            if (iM1755 >= 0 && iM1755 <= C0774.f3589) {
                byte[] bArr = this.f3612;
                int length = bArr.length;
                int i = this.f3613;
                if (iM1755 <= length - i) {
                    byte[] bArrM3946 = AbstractC2070.m3946(bArr, i, i + iM1755);
                    this.f3613 += iM1755;
                    return bArrM3946;
                }
            }
            throw C0774.m1727(C0774.f3577);
        }

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        private final int m1759() {
            int iM1755 = m1755();
            if (iM1755 < 0 || iM1755 >= 10001) {
                throw C0774.m1727(C0774.f3577);
            }
            return iM1755;
        }

        /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
        public final Object m1760(int i) {
            if (i > C0774.f3570) {
                throw C0774.m1727(C0774.f3577);
            }
            int iM1762 = m1762();
            int i2 = C0774.f3594;
            switch (iM1762) {
                case C0774.f3594 /* 0 */:
                    return null;
                case 1:
                    return Boolean.FALSE;
                case 2:
                    return Boolean.TRUE;
                case C0774.f3592 /* 3 */:
                    return Integer.valueOf(m1755());
                case C0774.f3578 /* 4 */:
                    return Long.valueOf(m1757());
                case C0774.f3587 /* 5 */:
                    return Double.valueOf(Double.longBitsToDouble(m1757()));
                case C0774.f3586 /* 6 */:
                    return m1756(m1758());
                case C0774.f3583 /* 7 */:
                    return m1758();
                case 8:
                    int iM1759 = m1759();
                    ArrayList arrayList = new ArrayList(iM1759);
                    while (i2 < iM1759) {
                        arrayList.add(m1760(i + 1));
                        i2++;
                    }
                    return arrayList;
                case C0774.f3597 /* 9 */:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iM17592 = m1759();
                    while (i2 < iM17592) {
                        int i3 = i + 1;
                        linkedHashMap.put(m1760(i3), m1760(i3));
                        i2++;
                    }
                    return linkedHashMap;
                case C0774.f3582 /* 10 */:
                    int i4 = i + 1;
                    return new Pair(m1760(i4), m1760(i4));
                default:
                    throw C0774.m1727(C0774.f3577);
            }
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final void m1761() {
            if (this.f3613 != this.f3612.length) {
                throw C0774.m1727(C0774.f3577);
            }
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public final int m1762() {
            int i = this.f3613;
            byte[] bArr = this.f3612;
            if (i >= bArr.length) {
                throw C0774.m1727(C0774.f3577);
            }
            this.f3613 = i + 1;
            return bArr[i] & 255;
        }
    }

    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᲀᛲᛳᲀ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0781 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final byte[] f3614;

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        private final byte[] f3615;

        public C0781(byte[] bArr, byte[] bArr2) {
            AbstractC2328.m4341(-542664395752302L);
            AbstractC2328.m4341(-542707345425262L);
            this.f3614 = bArr;
            this.f3615 = bArr2;
        }

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        public static /* synthetic */ C0781 m1763(C0781 c0781, byte[] bArr, byte[] bArr2, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = c0781.f3614;
            }
            if ((i & 2) != 0) {
                bArr2 = c0781.f3615;
            }
            return c0781.m1767(bArr, bArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0781)) {
                return false;
            }
            C0781 c0781 = (C0781) obj;
            return AbstractC1544.m3188(this.f3614, c0781.f3614) && AbstractC1544.m3188(this.f3615, c0781.f3615);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f3615) + (Arrays.hashCode(this.f3614) * 31);
        }

        public String toString() {
            return AbstractC2328.m4341(-542801834705774L) + Arrays.toString(this.f3614) + AbstractC2328.m4341(-542900618953582L) + Arrays.toString(this.f3615) + ')';
        }

        /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
        public final byte[] m1764() {
            return this.f3615;
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public final byte[] m1765() {
            return this.f3614;
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final byte[] m1766() {
            return this.f3615;
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public final C0781 m1767(byte[] bArr, byte[] bArr2) {
            AbstractC2328.m4341(-542733115229038L);
            AbstractC2328.m4341(-542776064901998L);
            return new C0781(bArr, bArr2);
        }

        /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
        public final byte[] m1768() {
            return this.f3614;
        }
    }

    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᲇᲇᲇᛱ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0782 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final byte[] f3616;

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        private final byte[] f3617;

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        private final AtomicLong f3618;

        public C0782(byte[] bArr, byte[] bArr2) {
            AbstractC2328.m4341(-542939273659246L);
            AbstractC2328.m4341(-542999403201390L);
            this.f3616 = bArr;
            this.f3617 = bArr2;
            this.f3618 = new AtomicLong(1L);
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public final AtomicLong m1769() {
            return this.f3618;
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final byte[] m1770() {
            return this.f3617;
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public final byte[] m1771() {
            return this.f3616;
        }
    }

    /* JADX INFO: renamed from: yyds.ᛴᛱᛸᛸ$ᲇᲈᛵᛷ, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static final class C0783 {

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        private final byte[] f3619;

        public C0783(byte[] bArr) {
            AbstractC2328.m4341(-764057074959214L);
            this.f3619 = bArr;
        }

        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
        public static /* synthetic */ C0783 m1772(C0783 c0783, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                bArr = c0783.f3619;
            }
            return c0783.m1774(bArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0783) && AbstractC1544.m3188(this.f3619, ((C0783) obj).f3619);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f3619);
        }

        public String toString() {
            return AbstractC2328.m4341(-764142974305134L) + Arrays.toString(this.f3619) + ')';
        }

        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
        public final byte[] m1773() {
            return this.f3619;
        }

        /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
        public final C0783 m1774(byte[] bArr) {
            AbstractC2328.m4341(-764100024632174L);
            return new C0783(bArr);
        }

        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
        public final byte[] m1775() {
            return this.f3619;
        }
    }

    static {
        C0774 c0774 = new C0774();
        f3577 = c0774;
        f3573 = new byte[]{68, 89, 74, 50};
        f3590 = new SecureRandom();
        f3569 = new C0782(c0774.m1730(8), c0774.m1730(f3578));
    }

    private native C0774();

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    private final native byte[] m1722(EnumC0778 enumC0778, EnumC0779 enumC0779, byte[] bArr, byte[] bArr2, long j, byte[] bArr3);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    private final native long m1723(AtomicLong atomicLong);

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    private final native SecurityException m1724();

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    private final native C0783 m1725(byte[] bArr, EnumC0778 enumC0778, EnumC0779 enumC0779, byte[] bArr2);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    private final native byte[] m1726(EnumC0778 enumC0778);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final native /* synthetic */ SecurityException m1727(C0774 c0774);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    private final native C0781 m1728(C0782 c0782);

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    private final native void m1729(byte[] bArr, int i, long j);

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    private final native byte[] m1730(int i);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    private final native byte[] m1731(int i, long j);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    private final native byte[] m1732(EnumC0778 enumC0778, EnumC0779 enumC0779, byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private final native Cipher m1733(int i, EnumC0778 enumC0778, EnumC0779 enumC0779, byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final native Object m1734(C0777 c0777, byte[] bArr);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final native C0777 m1735(String str, List list, EnumC0778 enumC0778);
}
