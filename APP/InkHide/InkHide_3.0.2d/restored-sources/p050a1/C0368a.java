package p050a1;

import java.nio.ByteBuffer;
import p006D.AbstractC0079h;
import p035S.C0246b;

/* JADX INFO: renamed from: a1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0368a extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f863d;

    /* JADX INFO: renamed from: e */
    public int f864e;

    /* JADX INFO: renamed from: f */
    public int f865f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.a.c(java.lang.Object):java.lang.Object, A0.h.e(java.lang.Object):java.lang.Object] */
    public /* synthetic */ C0368a(int i2) {
        this.f863d = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final int m630Y(C0246b c0246b) {
        switch (this.f863d) {
            case 0:
                int i2 = this.f864e;
                int i3 = this.f865f;
                byte b = 1;
                if (i3 == 1) {
                    b = 0;
                } else if (i3 != 2) {
                    throw null;
                }
                c0246b.m470j(2);
                c0246b.m468h(4, 0);
                ByteBuffer byteBuffer = c0246b.f593a;
                int i4 = c0246b.f594b - 4;
                c0246b.f594b = i4;
                byteBuffer.putInt(i4, i2);
                c0246b.f596d[0] = c0246b.m467g();
                if (b != 0) {
                    c0246b.m468h(1, 0);
                    ByteBuffer byteBuffer2 = c0246b.f593a;
                    int i5 = c0246b.f594b - 1;
                    c0246b.f594b = i5;
                    byteBuffer2.put(i5, b);
                    c0246b.f596d[1] = c0246b.m467g();
                }
                int iM465e = c0246b.m465e();
                c0246b.m466f(iM465e);
                return iM465e;
            default:
                c0246b.m470j(2);
                int i6 = this.f865f;
                c0246b.m468h(4, 0);
                ByteBuffer byteBuffer3 = c0246b.f593a;
                int i7 = c0246b.f594b - 4;
                c0246b.f594b = i7;
                byteBuffer3.putInt(i7, i6);
                c0246b.f596d[1] = c0246b.m467g();
                int i8 = this.f864e;
                c0246b.m468h(4, 0);
                ByteBuffer byteBuffer4 = c0246b.f593a;
                int i9 = c0246b.f594b - 4;
                c0246b.f594b = i9;
                byteBuffer4.putInt(i9, i8);
                c0246b.f596d[0] = c0246b.m467g();
                int iM465e2 = c0246b.m465e();
                c0246b.m466f(iM465e2);
                return iM465e2;
        }
    }
}
