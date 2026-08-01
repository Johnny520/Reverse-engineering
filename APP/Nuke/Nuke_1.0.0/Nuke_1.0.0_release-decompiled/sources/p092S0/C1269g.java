package p092S0;

import java.util.ArrayList;
import java.util.List;
import p000A.C0038T0;
import p061L2.C0981u;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: S0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1269g implements CharSequence {

    /* JADX INFO: renamed from: d */
    public final List f4562d;

    /* JADX INFO: renamed from: e */
    public final String f4563e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f4564f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f4565g;

    static {
        C0038T0 c0038t0 = AbstractC1250C.f4463a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r1.m4334a(r3.f4559c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1269g(java.util.List r9, java.lang.String r10) {
        /*
            r8 = this;
            r8.<init>()
            r8.f4562d = r9
            r8.f4563e = r10
            r10 = 0
            r0 = 0
            if (r9 == 0) goto L3c
            int r1 = r9.size()
            r2 = r10
            r3 = r0
            r4 = r3
        L12:
            if (r2 >= r1) goto L3e
            java.lang.Object r5 = r9.get(r2)
            S0.e r5 = (p092S0.C1267e) r5
            java.lang.Object r6 = r5.f4557a
            boolean r7 = r6 instanceof p092S0.C1252E
            if (r7 == 0) goto L2b
            if (r3 != 0) goto L27
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L27:
            r3.add(r5)
            goto L39
        L2b:
            boolean r6 = r6 instanceof p092S0.C1282t
            if (r6 == 0) goto L39
            if (r4 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L36:
            r4.add(r5)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            r3 = r0
            r4 = r3
        L3e:
            r8.f4564f = r3
            r8.f4565g = r4
            if (r4 == 0) goto L4e
            S0.f r9 = new S0.f
            r9.<init>(r10)
            java.util.List r9 = p061L2.AbstractC0973m.m2021b0(r4, r9)
            goto L4f
        L4e:
            r9 = r0
        L4f:
            if (r9 == 0) goto Lba
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L58
            goto Lba
        L58:
            java.lang.Object r10 = p061L2.AbstractC0973m.m2012S(r9)
            S0.e r10 = (p092S0.C1267e) r10
            int r10 = r10.f4559c
            k.t r1 = p186k.AbstractC2427i.f7844a
            k.t r1 = new k.t
            r2 = 1
            r1.<init>(r2)
            r1.m4334a(r10)
            int r10 = r9.size()
        L6f:
            if (r2 >= r10) goto Lba
            java.lang.Object r3 = r9.get(r2)
            S0.e r3 = (p092S0.C1267e) r3
        L77:
            int r4 = r1.f7878b
            if (r4 == 0) goto Lb2
            if (r4 == 0) goto Lac
            int[] r5 = r1.f7877a
            int r6 = r4 + (-1)
            r5 = r5[r6]
            int r6 = r3.f4558b
            int r7 = r3.f4559c
            if (r6 < r5) goto L8f
            int r4 = r4 + (-1)
            r1.m4337d(r4)
            goto L77
        L8f:
            if (r7 > r5) goto L92
            goto Lb2
        L92:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Paragraph overlap not allowed, end "
            r4.<init>(r6)
            r4.append(r7)
            java.lang.String r6 = " should be less than or equal to "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            p120Y0.AbstractC1732a.m3085a(r4)
            goto Lb2
        Lac:
            java.lang.String r9 = "IntList is empty."
            p192l.AbstractC2477a.m4424e(r9)
            throw r0
        Lb2:
            int r3 = r3.f4559c
            r1.m4334a(r3)
            int r2 = r2 + 1
            goto L6f
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p092S0.C1269g.<init>(java.util.List, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p092S0.C1269g subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p120Y0.AbstractC1732a.m3085a(r1)
        L26:
            java.lang.String r1 = r10.f4563e
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            java.lang.String r4 = "substring(...)"
            p117X2.AbstractC1665j.m2984d(r1, r4)
            S0.g r4 = p092S0.AbstractC1270h.f4566a
            if (r11 > r12) goto L3f
            goto L59
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            p120Y0.AbstractC1732a.m3085a(r2)
        L59:
            java.util.List r2 = r10.f4562d
            if (r2 != 0) goto L5e
            goto L9e
        L5e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L6b:
            if (r0 >= r4) goto L98
            java.lang.Object r5 = r2.get(r0)
            S0.e r5 = (p092S0.C1267e) r5
            int r6 = r5.f4558b
            int r7 = r5.f4559c
            boolean r6 = p092S0.AbstractC1270h.m2357b(r11, r12, r6, r7)
            if (r6 == 0) goto L95
            S0.e r6 = new S0.e
            java.lang.Object r8 = r5.f4557a
            int r9 = r5.f4558b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f4560d
            r6.<init>(r8, r9, r7, r5)
            r3.add(r6)
        L95:
            int r0 = r0 + 1
            goto L6b
        L98:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9f
        L9e:
            r3 = 0
        L9f:
            S0.g r11 = new S0.g
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p092S0.C1269g.subSequence(int, int):S0.g");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.f4563e.charAt(i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1269g)) {
            return false;
        }
        C1269g c1269g = (C1269g) obj;
        return AbstractC1665j.m2981a(this.f4563e, c1269g.f4563e) && AbstractC1665j.m2981a(this.f4562d, c1269g.f4562d);
    }

    public final int hashCode() {
        int iHashCode = this.f4563e.hashCode() * 31;
        List list = this.f4562d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4563e.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4563e;
    }

    public /* synthetic */ C1269g(String str) {
        this(str, C0981u.f3047d);
    }

    public C1269g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
