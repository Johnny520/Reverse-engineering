package p291;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p278.C8362;
import p278.C8364;
import p290.InterfaceC8424;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8547 implements InterfaceC8424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final int[] f23787;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int[] f23788;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23789;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f23790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8487 f23791;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f23795;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f23796;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f23797;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f23798;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f23799;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f23794 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f23793 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ConcurrentHashMap f23792 = new ConcurrentHashMap();

    static {
        Class[] clsArr = {Boolean.TYPE, Boolean.class, Character.class, Character.TYPE, Byte.class, Byte.TYPE, Short.class, Short.TYPE, Integer.class, Integer.TYPE, Long.class, Long.TYPE, Float.class, Float.TYPE, Double.class, Double.TYPE, BigInteger.class, BigDecimal.class, String.class, Currency.class, Date.class, Calendar.class, UUID.class, Locale.class, LocalTime.class, LocalDate.class, LocalDateTime.class, Instant.class, ZoneId.class, ZonedDateTime.class, OffsetDateTime.class, OffsetTime.class, AtomicInteger.class, AtomicLong.class, String.class, StackTraceElement.class, Collections.EMPTY_LIST.getClass(), Collections.EMPTY_MAP.getClass(), Collections.EMPTY_SET.getClass()};
        int[] iArr = new int[39];
        for (int i = 0; i < 39; i++) {
            iArr[i] = System.identityHashCode(clsArr[i]);
        }
        Arrays.sort(iArr);
        f23788 = iArr;
        int[] iArrCopyOf = Arrays.copyOf(iArr, 42);
        iArrCopyOf[iArrCopyOf.length - 1] = System.identityHashCode(Class.class);
        iArrCopyOf[iArrCopyOf.length - 2] = System.identityHashCode(int[].class);
        iArrCopyOf[iArrCopyOf.length - 3] = System.identityHashCode(long[].class);
        Arrays.sort(iArrCopyOf);
        f23787 = iArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8547() {
        /*
            r3 = this;
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.f23794 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.f23793 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.f23792 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f23790 = r0
            boolean r1 = com.alibaba.fastjson2.AbstractC2932.f9282
            r3.f23789 = r1
            boolean r1 = com.alibaba.fastjson2.AbstractC2932.f9301
            r3.f23796 = r1
            boolean r1 = com.alibaba.fastjson2.AbstractC2932.f9300
            r3.f23795 = r1
            boolean r1 = com.alibaba.fastjson2.AbstractC2932.f9304
            r3.f23798 = r1
            boolean r1 = com.alibaba.fastjson2.AbstractC2932.f9283
            r3.f23799 = r1
            boolean r1 = com.alibaba.fastjson2.AbstractC2932.f9284
            r3.f23797 = r1
            飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰哲世楪 r1 = new 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰哲世楪
            r1.<init>(r3)
            r0.add(r1)
            java.lang.String r0 = com.alibaba.fastjson2.AbstractC2932.f9287
            int r1 = r0.hashCode()
            r2 = -1110092857(0xffffffffbdd553c7, float:-0.1041637)
            if (r1 == r2) goto L65
            r2 = 96891(0x17a7b, float:1.35773E-40)
            if (r1 == r2) goto L5e
            r2 = 1085265597(0x40afd6bd, float:5.494963)
            if (r1 == r2) goto L55
            goto L70
        L55:
            java.lang.String r1 = "reflect"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L70
            goto L6d
        L5e:
            java.lang.String r1 = "asm"
            boolean r0 = r0.equals(r1)
            goto L70
        L65:
            java.lang.String r1 = "lambda"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L70
        L6d:
            飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪兰世苏 r0 = p291.C8487.f23539
            goto L7f
        L70:
            r0 = 0
            boolean r1 = com.alibaba.fastjson2.util.AbstractC2853.f8927     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto L7b
            boolean r1 = com.alibaba.fastjson2.util.AbstractC2853.f8926     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto L7b
            飘花落叶言楪子哲兰世苏.飘花落叶言子哲世苏兰楪 r0 = p291.C8477.f23478     // Catch: java.lang.Throwable -> L7b
        L7b:
            if (r0 != 0) goto L7f
            飘花落叶言楪子哲兰世苏.飘花落叶言子哲楪兰世苏 r0 = p291.C8487.f23539
        L7f:
            r3.f23791 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8547.<init>():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m14085(Class cls) {
        if (Arrays.binarySearch(f23788, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m14086(Class cls) {
        if (Arrays.binarySearch(f23787, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0a01 A[LOOP:1: B:68:0x00f1->B:585:0x0a01, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0a8f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x09e9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p291.InterfaceC8531 m14087(java.lang.reflect.Type r53, java.lang.Class r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 2778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8547.m14087(java.lang.reflect.Type, java.lang.Class, boolean):飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪世哲");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14088(C8364 c8364, C8362 c8362, Class cls, Method method) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23790;
            if (i >= arrayList.size()) {
                return;
            }
            ((C8529) arrayList.get(i)).f23715.m13506(c8364, c8362, cls, method);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14089(Class cls, C8364 c8364) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f23790;
            if (i >= arrayList.size()) {
                return;
            }
            ((C8529) arrayList.get(i)).f23715.m13510(cls, c8364);
            i++;
        }
    }

    @Override // p290.InterfaceC8424
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo5581(Class cls) {
        return (Class) this.f23792.get(cls);
    }
}
