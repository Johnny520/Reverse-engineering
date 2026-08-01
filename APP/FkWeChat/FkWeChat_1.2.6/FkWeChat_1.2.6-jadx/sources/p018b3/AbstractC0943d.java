package p018b3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import p080f9.AbstractC2368o;
import p104h3.EnumC2856i;
import p250r1.C6457g;
import p319w2.C9122q3;
import p319w2.C9137t3;

/* JADX INFO: renamed from: b3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0943d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.inputmethod.CursorAnchorInfo.Builder m3467a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, p018b3.InterfaceC0956i0 r20, p319w2.C9122q3 r21, p250r1.C6457g r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.mo3268b(r2)
            int r5 = r1.mo3268b(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            w2.n r7 = r21.m35403w()
            long r8 = p319w2.AbstractC9142u3.m35530b(r4, r5)
            r5 = 0
            r7.m35333c(r8, r6, r5)
            r11 = r2
        L23:
            if (r11 >= r0) goto L8b
            int r2 = r1.mo3268b(r11)
            int r5 = r2 - r4
            int r5 = r5 * 4
            r1.g r7 = new r1.g
            r8 = r6[r5]
            int r9 = r5 + 1
            r9 = r6[r9]
            int r10 = r5 + 2
            r10 = r6[r10]
            int r5 = r5 + 3
            r5 = r6[r5]
            r7.<init>(r8, r9, r10, r5)
            boolean r5 = r3.m25591t(r7)
            float r8 = r7.m25583l()
            float r9 = r7.m25586o()
            boolean r8 = m3469c(r3, r8, r9)
            if (r8 == 0) goto L64
            float r8 = r7.m25584m()
            float r9 = r7.m25580i()
            boolean r8 = m3469c(r3, r8, r9)
            if (r8 != 0) goto L61
            goto L64
        L61:
            r8 = r21
            goto L67
        L64:
            r5 = r5 | 2
            goto L61
        L67:
            h3.i r2 = r8.m35384c(r2)
            h3.i r9 = p104h3.EnumC2856i.f7468r
            if (r2 != r9) goto L71
            r5 = r5 | 4
        L71:
            r16 = r5
            float r12 = r7.m25583l()
            float r13 = r7.m25586o()
            float r14 = r7.m25584m()
            float r15 = r7.m25580i()
            r10 = r17
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r11 = r11 + 1
            goto L23
        L8b:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: p018b3.AbstractC0943d.m3467a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, b3.i0, w2.q3, r1.g):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    /* JADX INFO: renamed from: b */
    public static final CursorAnchorInfo m3468b(CursorAnchorInfo.Builder builder, C0978t0 c0978t0, InterfaceC0956i0 interfaceC0956i0, C9122q3 c9122q3, Matrix matrix, C6457g c6457g, C6457g c6457g2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iM35521l = C9137t3.m35521l(c0978t0.m3585j());
        builder.setSelectionRange(iM35521l, C9137t3.m35520k(c0978t0.m3585j()));
        if (z10) {
            m3470d(builder, iM35521l, interfaceC0956i0, c9122q3, c6457g);
        }
        if (z11) {
            C9137t3 c9137t3M3584i = c0978t0.m3584i();
            int iM35521l2 = c9137t3M3584i != null ? C9137t3.m35521l(c9137t3M3584i.m35527r()) : -1;
            C9137t3 c9137t3M3584i2 = c0978t0.m3584i();
            int iM35520k = c9137t3M3584i2 != null ? C9137t3.m35520k(c9137t3M3584i2.m35527r()) : -1;
            if (iM35521l2 >= 0 && iM35521l2 < iM35520k) {
                builder.setComposingText(iM35521l2, c0978t0.m3586k().subSequence(iM35521l2, iM35520k));
                m3467a(builder, iM35521l2, iM35520k, interfaceC0956i0, c9122q3, c6457g);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z12) {
            C0937b.m3456a(builder, c6457g2);
        }
        if (i10 >= 34 && z13) {
            C0940c.m3464a(builder, c9122q3, c6457g);
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m3469c(C6457g c6457g, float f10, float f11) {
        float fM25583l = c6457g.m25583l();
        if (f10 > c6457g.m25584m() || fM25583l > f10) {
            return false;
        }
        return f11 <= c6457g.m25580i() && c6457g.m25586o() <= f11;
    }

    /* JADX INFO: renamed from: d */
    public static final CursorAnchorInfo.Builder m3470d(CursorAnchorInfo.Builder builder, int i10, InterfaceC0956i0 interfaceC0956i0, C9122q3 c9122q3, C6457g c6457g) {
        if (i10 < 0) {
            return builder;
        }
        int iMo3268b = interfaceC0956i0.mo3268b(i10);
        C6457g c6457gM35386e = c9122q3.m35386e(iMo3268b);
        float fM8585l = AbstractC2368o.m8585l(c6457gM35386e.m25583l(), 0.0f, (int) (c9122q3.m35381B() >> 32));
        boolean zM3469c = m3469c(c6457g, fM8585l, c6457gM35386e.m25586o());
        boolean zM3469c2 = m3469c(c6457g, fM8585l, c6457gM35386e.m25580i());
        boolean z10 = c9122q3.m35384c(iMo3268b) == EnumC2856i.f7468r;
        int i11 = (zM3469c || zM3469c2) ? 1 : 0;
        if (!zM3469c || !zM3469c2) {
            i11 |= 2;
        }
        if (z10) {
            i11 |= 4;
        }
        builder.setInsertionMarkerLocation(fM8585l, c6457gM35386e.m25586o(), c6457gM35386e.m25580i(), c6457gM35386e.m25580i(), i11);
        return builder;
    }
}
