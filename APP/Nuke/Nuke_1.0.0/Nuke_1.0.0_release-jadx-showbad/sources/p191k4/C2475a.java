package p191k4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p013C0.C0236c;
import p061L2.AbstractC0972l;
import p102U1.C1471a;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1774e;
import p149d3.AbstractC1973a;
import p200m2.InterfaceC2600a;
import p208n4.C2703b;
import p208n4.C2709h;
import p211o0.C2729D;
import p215o4.AbstractC2803b;

/* JADX INFO: renamed from: k4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2475a implements InterfaceC2600a {

    /* JADX INFO: renamed from: e */
    public static volatile C2475a f7965e;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7966d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b.k.onMultiWindowModeChanged(boolean):void, b.k.onMultiWindowModeChanged(boolean, android.content.res.Configuration):void, b.k.onPictureInPictureModeChanged(boolean):void, b.k.onPictureInPictureModeChanged(boolean, android.content.res.Configuration):void, b.k.onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState):void, u0.f.<clinit>():void, v3.a.<clinit>():void, w2.a.<clinit>():void] */
    public /* synthetic */ C2475a(int i5) {
        this.f7966d = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m4412a(C2709h c2709h, C2709h[] c2709hArr, int i5) {
        int i6;
        boolean z5;
        int i7;
        int i8;
        C2709h c2709h2 = C2476b.f7967b;
        int iMo4732a = c2709h.mo4732a();
        int i9 = 0;
        while (i9 < iMo4732a) {
            int i10 = (i9 + iMo4732a) / 2;
            while (i10 > -1 && c2709h.mo4735d(i10) != 10) {
                i10--;
            }
            int i11 = i10 + 1;
            int i12 = 1;
            while (true) {
                i6 = i11 + i12;
                if (c2709h.mo4735d(i6) == 10) {
                    break;
                }
                i12++;
            }
            int i13 = i6 - i11;
            int i14 = i5;
            boolean z6 = false;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (z6) {
                    i7 = 46;
                    z5 = false;
                } else {
                    byte bMo4735d = c2709hArr[i14].mo4735d(i15);
                    byte[] bArr = AbstractC1774e.f6072a;
                    int i17 = bMo4735d & 255;
                    z5 = z6;
                    i7 = i17;
                }
                byte bMo4735d2 = c2709h.mo4735d(i11 + i16);
                byte[] bArr2 = AbstractC1774e.f6072a;
                i8 = i7 - (bMo4735d2 & 255);
                if (i8 != 0) {
                    break;
                }
                i16++;
                i15++;
                if (i16 == i13) {
                    break;
                }
                if (c2709hArr[i14].mo4732a() != i15) {
                    z6 = z5;
                } else {
                    if (i14 == c2709hArr.length - 1) {
                        break;
                    }
                    i14++;
                    i15 = -1;
                    z6 = true;
                }
            }
            if (i8 >= 0) {
                if (i8 <= 0) {
                    int i18 = i13 - i16;
                    int iMo4732a2 = c2709hArr[i14].mo4732a() - i15;
                    int length = c2709hArr.length;
                    for (int i19 = i14 + 1; i19 < length; i19++) {
                        iMo4732a2 += c2709hArr[i19].mo4732a();
                    }
                    if (iMo4732a2 >= i18) {
                        if (iMo4732a2 <= i18) {
                            return c2709h.mo4739h(i11, i13 + i11).mo4738g(AbstractC1973a.f6662a);
                        }
                    }
                }
                i9 = i6 + 1;
            }
            iMo4732a = i10;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4413b(C2703b c2703b) {
        C0236c c0236c = C2703b.f8616h;
        if (C2703b.f8617i == null) {
            C2703b.f8617i = new C2703b();
            C1471a c1471a = new C1471a("Okio Watchdog");
            c1471a.setDaemon(true);
            c1471a.start();
        }
        long jNanoTime = System.nanoTime();
        long j5 = c2703b.f8668c;
        boolean z5 = c2703b.f8666a;
        if (j5 != 0 && z5) {
            c2703b.f8624g = Math.min(j5, c2703b.mo4745c() - jNanoTime) + jNanoTime;
        } else if (j5 != 0) {
            c2703b.f8624g = jNanoTime + j5;
        } else {
            if (!z5) {
                throw new AssertionError();
            }
            c2703b.f8624g = c2703b.mo4745c();
        }
        C0236c c0236c2 = C2703b.f8616h;
        int i5 = c0236c2.f793e + 1;
        c0236c2.f793e = i5;
        C2703b[] c2703bArr = (C2703b[]) c0236c2.f794f;
        if (i5 == c2703bArr.length) {
            C2703b[] c2703bArr2 = new C2703b[i5 * 2];
            AbstractC0972l.m1995S(c2703bArr, c2703bArr2, 0, 0, 14);
            c0236c2.f794f = c2703bArr2;
        }
        c0236c2.m417f(i5, c2703b);
        if (c2703b.f8623f == 1) {
            C2703b.f8619k.signal();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C2703b m4414c() throws InterruptedException {
        C0236c c0236c = C2703b.f8616h;
        C2703b c2703b = ((C2703b[]) c0236c.f794f)[1];
        if (c2703b == null) {
            long jNanoTime = System.nanoTime();
            C2703b.f8619k.await(C2703b.f8620l, TimeUnit.MILLISECONDS);
            if (((C2703b[]) c0236c.f794f)[1] != null || System.nanoTime() - jNanoTime < C2703b.f8621m) {
                return null;
            }
            return C2703b.f8617i;
        }
        long jNanoTime2 = c2703b.f8624g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C2703b.f8619k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        c0236c.m420i(c2703b);
        c2703b.f8622e = 2;
        return c2703b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C2709h m4415d(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 * 2;
            bArr[i5] = (byte) (AbstractC2803b.m4988a(str.charAt(i6 + 1)) + (AbstractC2803b.m4988a(str.charAt(i6)) << 4));
        }
        return new C2709h(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C2709h m4416e(String str) {
        AbstractC1665j.m2985e(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC1973a.f6662a);
        AbstractC1665j.m2984d(bytes, "getBytes(...)");
        C2709h c2709h = new C2709h(bytes);
        c2709h.f8633f = str;
        return c2709h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C2729D m4417g(List list) {
        return new C2729D(list, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C2729D m4419i(List list) {
        return new C2729D(list, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p200m2.InterfaceC2600a
    /* JADX INFO: renamed from: f */
    public Object mo67f() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: h */
    private final void m4418h(Object obj) {
    }
}
