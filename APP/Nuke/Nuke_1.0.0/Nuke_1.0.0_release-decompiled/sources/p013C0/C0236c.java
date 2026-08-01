package p013C0;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import p061L2.C0971k;
import p078P1.C1147i;
import p088R1.InterfaceC1194D;
import p117X2.AbstractC1665j;
import p121Y1.C1736D;
import p148d2.InterfaceC1970a;
import p208n4.C2703b;
import p248u3.AbstractC3337a;
import p248u3.C3338b;

/* JADX INFO: renamed from: C0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0236c implements InterfaceC1970a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f792d;

    /* JADX INFO: renamed from: e */
    public int f793e;

    /* JADX INFO: renamed from: f */
    public Object f794f;

    public /* synthetic */ C0236c(int i5) {
        this.f792d = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e5, code lost:
    
        if (r8.size() <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e7, code lost:
    
        r0 = new p047I0.C0735i0(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ee, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f2, code lost:
    
        if (r20 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f4, code lost:
    
        r0 = new p047I0.C0735i0(r6, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fa, code lost:
    
        r0 = new p047I0.C0735i0(r6, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0200, code lost:
    
        if (r9 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0203, code lost:
    
        if (r9 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0205, code lost:
    
        r1 = r0.f2312a;
        r0 = r0.f2313b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020b, code lost:
    
        if (r5 == 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020d, code lost:
    
        if (r5 == 2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020f, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021c, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x021f, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0222, code lost:
    
        r13 = new android.graphics.LinearGradient(r25, r26, r16, r17, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0226, code lost:
    
        r13 = new android.graphics.SweepGradient(r11, r10, r0.f2312a, r0.f2313b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0234, code lost:
    
        if (r24 <= 0.0f) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0236, code lost:
    
        r1 = r0.f2312a;
        r0 = r0.f2313b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x023e, code lost:
    
        if (r5 == 1) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0240, code lost:
    
        if (r5 == 2) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0242, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0251, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0254, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0257, code lost:
    
        r13 = new android.graphics.RadialGradient(r11, r10, r24, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0263, code lost:
    
        return new p013C0.C0236c(0, 4, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x026b, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p013C0.C0236c m413d(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013C0.C0236c.m413d(android.content.res.Resources, int, android.content.res.Resources$Theme):C0.c");
    }

    /* JADX INFO: renamed from: a */
    public void m414a(long j5) {
        if (m415c(j5)) {
            return;
        }
        int i5 = this.f793e;
        long[] jArrCopyOf = (long[]) this.f794f;
        if (i5 >= jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i5 + 1, jArrCopyOf.length * 2));
            AbstractC1665j.m2984d(jArrCopyOf, "copyOf(...)");
            this.f794f = jArrCopyOf;
        }
        jArrCopyOf[i5] = j5;
        if (i5 >= this.f793e) {
            this.f793e = i5 + 1;
        }
    }

    @Override // p148d2.InterfaceC1970a
    /* JADX INFO: renamed from: b */
    public InterfaceC1194D mo98b(InterfaceC1194D interfaceC1194D, C1147i c1147i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC1194D.get()).compress((Bitmap.CompressFormat) this.f794f, this.f793e, byteArrayOutputStream);
        interfaceC1194D.mo2256e();
        return new C1736D(byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: renamed from: c */
    public boolean m415c(long j5) {
        int i5 = this.f793e;
        for (int i6 = 0; i6 < i5; i6++) {
            if (((long[]) this.f794f)[i6] == j5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public void m416e(int i5, int i6) {
        int i7 = i6 + i5;
        char[] cArr = (char[]) this.f794f;
        if (cArr.length <= i7) {
            int i8 = i5 * 2;
            if (i7 < i8) {
                i7 = i8;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i7);
            AbstractC1665j.m2984d(cArrCopyOf, "copyOf(...)");
            this.f794f = cArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m417f(int i5, C2703b c2703b) {
        while (true) {
            int i6 = i5 >> 1;
            if (i6 == 0) {
                break;
            }
            C2703b c2703b2 = ((C2703b[]) this.f794f)[i6];
            AbstractC1665j.m2982b(c2703b2);
            if (AbstractC1665j.m2988h(0L, c2703b.f8624g - c2703b2.f8624g) <= 0) {
                break;
            }
            c2703b2.f8623f = i5;
            ((C2703b[]) this.f794f)[i5] = c2703b2;
            i5 = i6;
        }
        ((C2703b[]) this.f794f)[i5] = c2703b;
        c2703b.f8623f = i5;
    }

    /* JADX INFO: renamed from: g */
    public void m418g() {
        C3338b c3338b = C3338b.f10383f;
        char[] cArr = (char[]) this.f794f;
        c3338b.getClass();
        AbstractC1665j.m2985e(cArr, "array");
        synchronized (c3338b) {
            int i5 = c3338b.f9813d;
            if (cArr.length + i5 < AbstractC3337a.f10382a) {
                c3338b.f9813d = i5 + cArr.length;
                ((C0971k) c3338b.f9814e).addLast(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m419h(long j5) {
        int i5 = this.f793e;
        int i6 = 0;
        while (i6 < i5) {
            if (j5 == ((long[]) this.f794f)[i6]) {
                int i7 = this.f793e - 1;
                while (i6 < i7) {
                    long[] jArr = (long[]) this.f794f;
                    int i8 = i6 + 1;
                    jArr[i6] = jArr[i8];
                    i6 = i8;
                }
                this.f793e--;
                return;
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m420i(C2703b c2703b) {
        C2703b c2703b2;
        int i5 = c2703b.f8623f;
        if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i6 = this.f793e;
        C2703b c2703b3 = ((C2703b[]) this.f794f)[i6];
        AbstractC1665j.m2982b(c2703b3);
        c2703b.f8623f = -1;
        ((C2703b[]) this.f794f)[i6] = null;
        this.f793e = i6 - 1;
        if (c2703b == c2703b3) {
            return;
        }
        int iM2988h = AbstractC1665j.m2988h(0L, c2703b3.f8624g - c2703b.f8624g);
        if (iM2988h == 0) {
            ((C2703b[]) this.f794f)[i5] = c2703b3;
            c2703b3.f8623f = i5;
            return;
        }
        if (iM2988h >= 0) {
            m417f(i5, c2703b3);
            return;
        }
        while (true) {
            int i7 = i5 << 1;
            int i8 = i7 + 1;
            int i9 = this.f793e;
            if (i8 > i9) {
                if (i7 > i9) {
                    break;
                }
                c2703b2 = ((C2703b[]) this.f794f)[i7];
                AbstractC1665j.m2982b(c2703b2);
            } else {
                c2703b2 = ((C2703b[]) this.f794f)[i7];
                AbstractC1665j.m2982b(c2703b2);
                C2703b c2703b4 = ((C2703b[]) this.f794f)[i8];
                AbstractC1665j.m2982b(c2703b4);
                if (AbstractC1665j.m2988h(0L, c2703b4.f8624g - c2703b2.f8624g) >= 0) {
                    c2703b2 = c2703b4;
                }
            }
            if (AbstractC1665j.m2988h(0L, c2703b2.f8624g - c2703b3.f8624g) <= 0) {
                break;
            }
            int i10 = c2703b2.f8623f;
            c2703b2.f8623f = i5;
            ((C2703b[]) this.f794f)[i5] = c2703b2;
            i5 = i10;
        }
        ((C2703b[]) this.f794f)[i5] = c2703b3;
        c2703b3.f8623f = i5;
    }

    /* JADX INFO: renamed from: j */
    public void m421j(String str) {
        AbstractC1665j.m2985e(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        m416e(this.f793e, length);
        str.getChars(0, str.length(), (char[]) this.f794f, this.f793e);
        this.f793e += length;
    }

    public String toString() {
        switch (this.f792d) {
            case 6:
                return new String((char[]) this.f794f, 0, this.f793e);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0236c(int i5, int i6, Object obj) {
        this.f792d = i6;
        this.f794f = obj;
        this.f793e = i5;
    }

    public C0236c() {
        this.f792d = 3;
        this.f794f = Bitmap.CompressFormat.JPEG;
        this.f793e = 100;
    }
}
