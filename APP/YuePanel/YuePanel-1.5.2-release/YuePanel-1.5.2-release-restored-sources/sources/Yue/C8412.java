package Yue;

import java.io.IOException;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8412 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1523 f25125 = new C1523(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final String f25126 = "Sec-WebSocket-Extensions";

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC5568
    public final boolean f3478;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC5568
    @InterfaceC6489
    public final Integer f3479;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public final boolean f25127;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public final Integer f25128;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC5568
    public final boolean f25129;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC5568
    public final boolean f25130;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۡ$ۥ */
    public static final class C1523 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢۥۣۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1523(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final C8412 m4392(@InterfaceC6399 C5256 c5256) throws IOException {
            C5499.m17103(c5256, "responseHeaders");
            int size = c5256.size();
            boolean z = false;
            Integer numM23935 = null;
            boolean z2 = false;
            Integer numM239352 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (C7627.m23974(c5256.m16114(i), "Sec-WebSocket-Extensions", true)) {
                    String strM16118 = c5256.m16118(i);
                    int i2 = 0;
                    while (i2 < strM16118.length()) {
                        int iM26850 = C8158.m26850(strM16118, ',', i2, 0, 4, null);
                        int iM26848 = C8158.m26848(strM16118, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, i2, iM26850);
                        String strM26893 = C8158.m26893(strM16118, i2, iM26848);
                        int i3 = iM26848 + 1;
                        if (C7627.m23974(strM26893, C6652.f17086, true)) {
                            if (z) {
                                z4 = true;
                            }
                            i2 = i3;
                            while (i2 < iM26850) {
                                int iM268482 = C8158.m26848(strM16118, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, i2, iM26850);
                                int iM268483 = C8158.m26848(strM16118, SignatureVisitor.INSTANCEOF, i2, iM268482);
                                String strM268932 = C8158.m26893(strM16118, i2, iM268483);
                                String strM24103 = iM268483 < iM268482 ? C7628.m24103(C8158.m26893(strM16118, iM268483 + 1, iM268482), "\"") : null;
                                i2 = iM268482 + 1;
                                if (C7627.m23974(strM268932, C6652.f17090, true)) {
                                    if (numM23935 != null) {
                                        z4 = true;
                                    }
                                    numM23935 = strM24103 != null ? C7626.m23935(strM24103) : null;
                                    if (numM23935 == null) {
                                        z4 = true;
                                    }
                                } else if (C7627.m23974(strM268932, C6652.f17088, true)) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (strM24103 != null) {
                                        z4 = true;
                                    }
                                    z2 = true;
                                } else if (C7627.m23974(strM268932, C6652.f17089, true)) {
                                    if (numM239352 != null) {
                                        z4 = true;
                                    }
                                    numM239352 = strM24103 != null ? C7626.m23935(strM24103) : null;
                                    if (numM239352 == null) {
                                        z4 = true;
                                    }
                                } else if (C7627.m23974(strM268932, C6652.f17087, true)) {
                                    if (z3) {
                                        z4 = true;
                                    }
                                    if (strM24103 != null) {
                                        z4 = true;
                                    }
                                    z3 = true;
                                } else {
                                    z4 = true;
                                }
                            }
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new C8412(z, numM23935, z2, numM239352, z3, z4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1523() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8412() {
        this(false, null, false, null, false, false, 63, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ C8412 m28080(C8412 c8412, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c8412.f3478;
        }
        if ((i & 2) != 0) {
            num = c8412.f3479;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            z2 = c8412.f25127;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            num2 = c8412.f25128;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z3 = c8412.f25129;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            z4 = c8412.f25130;
        }
        return c8412.m28085(z, num3, z5, num4, z6, z4);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8412)) {
            return false;
        }
        C8412 c8412 = (C8412) obj;
        return this.f3478 == c8412.f3478 && C5499.m17094(this.f3479, c8412.f3479) && this.f25127 == c8412.f25127 && C5499.m17094(this.f25128, c8412.f25128) && this.f25129 == c8412.f25129 && this.f25130 == c8412.f25130;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z = this.f3478;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.f3479;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.f25127;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (iHashCode + r2) * 31;
        Integer num2 = this.f25128;
        int iHashCode2 = (i2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z3 = this.f25129;
        ?? r22 = z3;
        if (z3) {
            r22 = 1;
        }
        int i3 = (iHashCode2 + r22) * 31;
        boolean z4 = this.f25130;
        return i3 + (z4 ? 1 : z4);
    }

    @InterfaceC6399
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f3478 + ", clientMaxWindowBits=" + this.f3479 + ", clientNoContextTakeover=" + this.f25127 + ", serverMaxWindowBits=" + this.f25128 + ", serverNoContextTakeover=" + this.f25129 + ", unknownValues=" + this.f25130 + ')';
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m4390() {
        return this.f3478;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final Integer m4391() {
        return this.f3479;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m28081() {
        return this.f25127;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Integer m28082() {
        return this.f25128;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m28083() {
        return this.f25129;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m28084() {
        return this.f25130;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final C8412 m28085(boolean z, @InterfaceC6489 Integer num, boolean z2, @InterfaceC6489 Integer num2, boolean z3, boolean z4) {
        return new C8412(z, num, z2, num2, z3, z4);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m28086(boolean z) {
        return z ? this.f25127 : this.f25129;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8412(boolean z, @InterfaceC6489 Integer num, boolean z2, @InterfaceC6489 Integer num2, boolean z3, boolean z4) {
        this.f3478 = z;
        this.f3479 = num;
        this.f25127 = z2;
        this.f25128 = num2;
        this.f25129 = z3;
        this.f25130 = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(boolean, java.lang.Integer, boolean, java.lang.Integer, boolean, boolean):void (m)] (LINE:9) call: Yue.ۥۢۥۣۡ.<init>(boolean, java.lang.Integer, boolean, java.lang.Integer, boolean, boolean):void type: THIS */
    public /* synthetic */ C8412(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, C4335 c4335) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}
