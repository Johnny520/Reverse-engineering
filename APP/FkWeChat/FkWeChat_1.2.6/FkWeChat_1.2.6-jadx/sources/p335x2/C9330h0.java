package p335x2;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: x2.h0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9330h0 {

    /* JADX INFO: renamed from: a */
    public final Layout f31906a;

    /* JADX INFO: renamed from: b */
    public final List f31907b;

    /* JADX INFO: renamed from: c */
    public final List f31908c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f31909d;

    /* JADX INFO: renamed from: e */
    public char[] f31910e;

    /* JADX INFO: renamed from: f */
    public final int f31911f;

    /* JADX INFO: renamed from: x2.h0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f31912a;

        /* JADX INFO: renamed from: b */
        public final int f31913b;

        /* JADX INFO: renamed from: c */
        public final boolean f31914c;

        public a(int i10, int i11, boolean z10) {
            this.f31912a = i10;
            this.f31913b = i11;
            this.f31914c = z10;
        }

        /* JADX INFO: renamed from: a */
        public final int m36345a() {
            return this.f31913b;
        }

        /* JADX INFO: renamed from: b */
        public final int m36346b() {
            return this.f31912a;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m36347c() {
            return this.f31914c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31912a == aVar.f31912a && this.f31913b == aVar.f31913b && this.f31914c == aVar.f31914c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f31912a) * 31) + Integer.hashCode(this.f31913b)) * 31) + Boolean.hashCode(this.f31914c);
        }

        public String toString() {
            return "BidiRun(start=" + this.f31912a + ", end=" + this.f31913b + ", isRtl=" + this.f31914c + ')';
        }
    }

    public C9330h0(Layout layout) {
        this.f31906a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM33150m0 = AbstractC8621f0.m33150m0(this.f31906a.getText(), '\n', length, false, 4, null);
            length = iM33150m0 < 0 ? this.f31906a.getText().length() : iM33150m0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f31906a.getText().length());
        this.f31907b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f31908c = arrayList2;
        this.f31909d = new boolean[this.f31907b.size()];
        this.f31911f = this.f31907b.size();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m36334g(C9330h0 c9330h0, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return c9330h0.m36340f(i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi m36335a(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.f31909d
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List r0 = r10.f31908c
            java.lang.Object r11 = r0.get(r11)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List r1 = r10.f31907b
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List r2 = r10.f31907b
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.f31910e
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r4 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r10.f31906a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            boolean r9 = r10.m36343j(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r2) goto L61
        L60:
            r3 = r1
        L61:
            java.util.List r0 = r10.f31908c
            r0.set(r11, r3)
            boolean[] r0 = r10.f31909d
            r0[r11] = r2
            if (r3 == 0) goto L73
            char[] r11 = r10.f31910e
            if (r4 != r11) goto L72
            r4 = r1
            goto L73
        L72:
            r4 = r11
        L73:
            r10.f31910e = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p335x2.C9330h0.m36335a(int):java.text.Bidi");
    }

    /* JADX INFO: renamed from: b */
    public final float m36336b(int i10, boolean z10) {
        int iM8582i = AbstractC2368o.m8582i(i10, this.f31906a.getLineEnd(this.f31906a.getLineForOffset(i10)));
        Layout layout = this.f31906a;
        return z10 ? layout.getPrimaryHorizontal(iM8582i) : layout.getSecondaryHorizontal(iM8582i);
    }

    /* JADX INFO: renamed from: c */
    public final float m36337c(int i10, boolean z10, boolean z11) {
        int iM36344k = i10;
        if (!z11) {
            return m36336b(i10, z10);
        }
        int iM36330a = AbstractC9327g0.m36330a(this.f31906a, iM36344k, z11);
        int lineStart = this.f31906a.getLineStart(iM36330a);
        int lineEnd = this.f31906a.getLineEnd(iM36330a);
        if (iM36344k != lineStart && iM36344k != lineEnd) {
            return m36336b(i10, z10);
        }
        if (iM36344k == 0 || iM36344k == this.f31906a.getText().length()) {
            return m36336b(i10, z10);
        }
        int iM36340f = m36340f(iM36344k, z11);
        boolean zM36343j = m36343j(iM36340f);
        int iM36344k2 = m36344k(lineEnd, lineStart);
        int iM36341h = m36341h(iM36340f);
        int i11 = lineStart - iM36341h;
        int i12 = iM36344k2 - iM36341h;
        Bidi bidiM36335a = m36335a(iM36340f);
        Bidi bidiCreateLineBidi = bidiM36335a != null ? bidiM36335a.createLineBidi(i11, i12) : null;
        boolean z12 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f31906a.isRtlCharAt(lineStart);
            if (z10 || zM36343j == zIsRtlCharAt) {
                zM36343j = !zM36343j;
            }
            if (iM36344k == lineStart) {
                z12 = zM36343j;
            } else if (!zM36343j) {
                z12 = true;
            }
            Layout layout = this.f31906a;
            return z12 ? layout.getLineLeft(iM36330a) : layout.getLineRight(iM36330a);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            aVarArr[i13] = new a(bidiCreateLineBidi.getRunStart(i13) + lineStart, bidiCreateLineBidi.getRunLimit(i13) + lineStart, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i14 = 0; i14 < runCount2; i14++) {
            bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i15 = -1;
        if (iM36344k == lineStart) {
            int i16 = 0;
            while (true) {
                if (i16 >= runCount) {
                    break;
                }
                if (aVarArr[i16].m36346b() == iM36344k) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            a aVar = aVarArr[i15];
            if (z10 || zM36343j == aVar.m36347c()) {
                zM36343j = !zM36343j;
            }
            if (i15 == 0 && zM36343j) {
                return this.f31906a.getLineLeft(iM36330a);
            }
            if (i15 == AbstractC5106t.m20732f0(aVarArr) && !zM36343j) {
                return this.f31906a.getLineRight(iM36330a);
            }
            Layout layout2 = this.f31906a;
            return zM36343j ? layout2.getPrimaryHorizontal(aVarArr[i15 - 1].m36346b()) : layout2.getPrimaryHorizontal(aVarArr[i15 + 1].m36346b());
        }
        if (iM36344k > iM36344k2) {
            iM36344k = m36344k(iM36344k, lineStart);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= runCount) {
                break;
            }
            if (aVarArr[i17].m36345a() == iM36344k) {
                i15 = i17;
                break;
            }
            i17++;
        }
        a aVar2 = aVarArr[i15];
        if (!z10 && zM36343j != aVar2.m36347c()) {
            zM36343j = !zM36343j;
        }
        if (i15 == 0 && zM36343j) {
            return this.f31906a.getLineLeft(iM36330a);
        }
        if (i15 == AbstractC5106t.m20732f0(aVarArr) && !zM36343j) {
            return this.f31906a.getLineRight(iM36330a);
        }
        Layout layout3 = this.f31906a;
        return zM36343j ? layout3.getPrimaryHorizontal(aVarArr[i15 - 1].m36345a()) : layout3.getPrimaryHorizontal(aVarArr[i15 + 1].m36345a());
    }

    /* JADX INFO: renamed from: d */
    public final a[] m36338d(int i10) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.f31906a.getLineStart(i10);
        int lineEnd = this.f31906a.getLineEnd(i10);
        int iM36334g = m36334g(this, lineStart, false, 2, null);
        int iM36341h = m36341h(iM36334g);
        int i11 = lineStart - iM36341h;
        int i12 = lineEnd - iM36341h;
        Bidi bidiM36335a = m36335a(iM36334g);
        if (bidiM36335a == null || (bidiCreateLineBidi = bidiM36335a.createLineBidi(i11, i12)) == null) {
            return new a[]{new a(lineStart, lineEnd, this.f31906a.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            int runStart = bidiCreateLineBidi.getRunStart(i13) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i13) + lineStart;
            boolean z10 = true;
            if (bidiCreateLineBidi.getRunLevel(i13) % 2 != 1) {
                z10 = false;
            }
            aVarArr[i13] = new a(runStart, runLimit, z10);
        }
        return aVarArr;
    }

    /* JADX INFO: renamed from: e */
    public final int m36339e(int i10) {
        return m36344k(this.f31906a.getLineEnd(i10), this.f31906a.getLineStart(i10));
    }

    /* JADX INFO: renamed from: f */
    public final int m36340f(int i10, boolean z10) {
        int iM20799n = AbstractC5114x.m20799n(this.f31907b, Integer.valueOf(i10), 0, 0, 6, null);
        int i11 = iM20799n < 0 ? -(iM20799n + 1) : iM20799n + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) this.f31907b.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: h */
    public final int m36341h(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) this.f31907b.get(i10 - 1)).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m36342i(char c10) {
        if (c10 == ' ' || c10 == '\n' || c10 == 5760) {
            return true;
        }
        return (AbstractC1061t.m3843d(c10, 8192) >= 0 && AbstractC1061t.m3843d(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m36343j(int i10) {
        return this.f31906a.getParagraphDirection(this.f31906a.getLineForOffset(m36341h(i10))) == -1;
    }

    /* JADX INFO: renamed from: k */
    public final int m36344k(int i10, int i11) {
        while (i10 > i11 && m36342i(this.f31906a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }
}
