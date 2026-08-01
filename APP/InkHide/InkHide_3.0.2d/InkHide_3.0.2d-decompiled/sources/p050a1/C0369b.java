package p050a1;

import java.nio.ByteBuffer;
import p006D.AbstractC0079h;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p035S.C0246b;

/* JADX INFO: renamed from: a1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0369b extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final String f866d;

    /* JADX INFO: renamed from: e */
    public int f867e;

    /* JADX INFO: renamed from: f */
    public final boolean f868f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0369b(String str, int i2, boolean z2) {
        AbstractC0223g.m418e(str, "value");
        AbstractC0174d.m359o(i2, "matchType");
        this.f866d = str;
        this.f867e = i2;
        this.f868f = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final int m631Y(C0246b c0246b) {
        String str = this.f866d;
        if (str == null) {
            throw new IllegalArgumentException("value must not be null");
        }
        if (str.length() == 0 && this.f867e != 5) {
            this.f867e = 5;
        }
        int iM463c = c0246b.m463c(str);
        int i2 = this.f867e;
        byte b = 1;
        if (i2 != 1) {
            byte b2 = 2;
            if (i2 != 2) {
                b = 3;
                if (i2 != 3) {
                    b2 = 4;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw null;
                        }
                        b = b2;
                    }
                } else {
                    b = b2;
                }
            }
        } else {
            b = 0;
        }
        c0246b.m470j(3);
        c0246b.m461a(0, iM463c);
        boolean z2 = this.f868f;
        if (z2) {
            c0246b.m468h(1, 0);
            ByteBuffer byteBuffer = c0246b.f593a;
            int i3 = c0246b.f594b - 1;
            c0246b.f594b = i3;
            byteBuffer.put(i3, z2 ? (byte) 1 : (byte) 0);
            c0246b.f596d[2] = c0246b.m467g();
        } else {
            c0246b.getClass();
        }
        if (b != 0) {
            c0246b.m468h(1, 0);
            ByteBuffer byteBuffer2 = c0246b.f593a;
            int i4 = c0246b.f594b - 1;
            c0246b.f594b = i4;
            byteBuffer2.put(i4, b);
            c0246b.f596d[1] = c0246b.m467g();
        }
        int iM465e = c0246b.m465e();
        c0246b.m466f(iM465e);
        return iM465e;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r3v0 java.lang.String), (1 int), false A[MD:(java.lang.String, int, boolean):void (m)] (LINE:5) call: a1.b.<init>(java.lang.String, int, boolean):void type: THIS */
    public /* synthetic */ C0369b(String str) {
        this(str, 1, false);
    }
}
