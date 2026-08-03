package p000;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends p000.n0 {
    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public static final <T> T m322(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            p000.h4.m189(r0, r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            return r1
        L11:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "List is empty."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static java.lang.String m323(java.lang.Iterable r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, ۟.c.a r8, int r9) {
            r0 = r9 & 1
            if (r0 == 0) goto L6
            java.lang.String r5 = ", "
        L6:
            r0 = r9 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto Ld
            r6 = r1
        Ld:
            r0 = r9 & 4
            if (r0 == 0) goto L12
            r7 = r1
        L12:
            r0 = r9 & 8
            r1 = 0
            if (r0 == 0) goto L19
            r0 = -1
            goto L1a
        L19:
            r0 = r1
        L1a:
            r2 = r9 & 16
            r3 = 0
            if (r2 == 0) goto L22
            java.lang.String r2 = "..."
            goto L23
        L22:
            r2 = r3
        L23:
            r9 = r9 & 32
            if (r9 == 0) goto L28
            r8 = r3
        L28:
            java.lang.String r9 = "<this>"
            p000.h4.m189(r9, r4)
            java.lang.String r9 = "prefix"
            p000.h4.m189(r9, r6)
            java.lang.String r9 = "postfix"
            p000.h4.m189(r9, r7)
            java.lang.String r9 = "truncated"
            p000.h4.m189(r9, r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r6)
            java.util.Iterator r4 = r4.iterator()
        L48:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L85
            java.lang.Object r6 = r4.next()
            int r1 = r1 + 1
            r3 = 1
            if (r1 <= r3) goto L5a
            r9.append(r5)
        L5a:
            if (r0 < 0) goto L5e
            if (r1 > r0) goto L85
        L5e:
            if (r8 == 0) goto L65
            java.lang.Object r6 = r8.mo12(r6)
            goto L6c
        L65:
            if (r6 != 0) goto L68
            goto L6a
        L68:
            boolean r3 = r6 instanceof java.lang.CharSequence
        L6a:
            if (r3 == 0) goto L6f
        L6c:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            goto L81
        L6f:
            boolean r3 = r6 instanceof java.lang.Character
            if (r3 == 0) goto L7d
            java.lang.Character r6 = (java.lang.Character) r6
            char r6 = r6.charValue()
            r9.append(r6)
            goto L48
        L7d:
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L81:
            r9.append(r6)
            goto L48
        L85:
            if (r0 < 0) goto L8c
            if (r1 <= r0) goto L8c
            r9.append(r2)
        L8c:
            r9.append(r7)
            java.lang.String r4 = r9.toString()
            java.lang.String r5 = "toString(...)"
            p000.h4.m188(r5, r4)
            return r4
    }
}
