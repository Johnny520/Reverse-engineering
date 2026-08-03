package Yue;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4811 {

    /* JADX INFO: renamed from: ۥ */
    public final boolean f1128;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f1129;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final C6618 f10829;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final Long f10830;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final Long f10831;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public final Long f10832;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6489
    public final Long f10833;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public final Map<InterfaceC5585<?>, Object> f10834;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4811() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    @InterfaceC6399
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f1128) {
            arrayList.add("isRegularFile");
        }
        if (this.f1129) {
            arrayList.add("isDirectory");
        }
        if (this.f10830 != null) {
            arrayList.add("byteCount=" + this.f10830);
        }
        if (this.f10831 != null) {
            arrayList.add("createdAt=" + this.f10831);
        }
        if (this.f10832 != null) {
            arrayList.add("lastModifiedAt=" + this.f10832);
        }
        if (this.f10833 != null) {
            arrayList.add("lastAccessedAt=" + this.f10833);
        }
        if (!this.f10834.isEmpty()) {
            arrayList.add("extras=" + this.f10834);
        }
        return C3888.m10923(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final C4811 m1718(boolean z, boolean z2, @InterfaceC6489 C6618 c6618, @InterfaceC6489 Long l, @InterfaceC6489 Long l2, @InterfaceC6489 Long l3, @InterfaceC6489 Long l4, @InterfaceC6399 Map<InterfaceC5585<?>, ? extends Object> map) {
        C5499.m17103(map, "extras");
        return new C4811(z, z2, c6618, l, l2, l3, l4, map);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final <T> T m14590(@InterfaceC6399 InterfaceC5585<? extends T> interfaceC5585) {
        C5499.m17103(interfaceC5585, "type");
        Object obj = this.f10834.get(interfaceC5585);
        if (obj == null) {
            return null;
        }
        return (T) C5586.m2305(interfaceC5585, obj);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Long m14591() {
        return this.f10831;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Map<InterfaceC5585<?>, Object> m14592() {
        return this.f10834;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Long m14593() {
        return this.f10833;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final Long m14594() {
        return this.f10832;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Long m14595() {
        return this.f10830;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final C6618 m14596() {
        return this.f10829;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m14597() {
        return this.f1129;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m14598() {
        return this.f1128;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4811(boolean z, boolean z2, @InterfaceC6489 C6618 c6618, @InterfaceC6489 Long l, @InterfaceC6489 Long l2, @InterfaceC6489 Long l3, @InterfaceC6489 Long l4, @InterfaceC6399 Map<InterfaceC5585<?>, ? extends Object> map) {
        C5499.m17103(map, "extras");
        this.f1128 = z;
        this.f1129 = z2;
        this.f10829 = c6618;
        this.f10830 = l;
        this.f10831 = l2;
        this.f10832 = l3;
        this.f10833 = l4;
        this.f10834 = C5943.m18642(map);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r11v0 boolean) : false)
  (wrap:Yue.ۥۣۡۧۧ:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null Yue.ۥۣۡۧۧ) : (r12v0 Yue.ۥۣۡۧۧ))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.Long) : (null java.lang.Long))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0034: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: INVOKE  STATIC call: Yue.ۥ۠ۨۧۧ.ۥ۟۟ۡ():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:11)) : (r17v0 java.util.Map))
 A[MD:(boolean, boolean, Yue.ۥۣۡۧۧ, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map<Yue.ۥ۠ۦۢۢ<?>, ? extends java.lang.Object>):void (m)] (LINE:12) call: Yue.ۥ۠ۡۨ.<init>(boolean, boolean, Yue.ۥۣۡۧۧ, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map):void type: THIS */
    public /* synthetic */ C4811(boolean z, boolean z2, C6618 c6618, Long l, Long l2, Long l3, Long l4, Map map, int i, C4335 c4335) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : c6618, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) == 0 ? l4 : null, (i & 128) != 0 ? C5943.m18584() : map);
    }
}
