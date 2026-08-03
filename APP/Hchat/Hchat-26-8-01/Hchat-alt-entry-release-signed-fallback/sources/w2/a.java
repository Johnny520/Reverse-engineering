package w2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static java.lang.String a(java.util.List r6, java.lang.String r7, i2.q r8, int r9) {
            r0 = r9 & 1
            if (r0 == 0) goto L6
            java.lang.String r7 = ", "
        L6:
            r0 = r9 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto Le
            r0 = r1
            goto L10
        Le:
            java.lang.String r0 = "[\n\t"
        L10:
            r2 = r9 & 4
            if (r2 == 0) goto L15
            goto L17
        L15:
            java.lang.String r1 = "\n]"
        L17:
            r9 = r9 & 32
            if (r9 == 0) goto L1c
            r8 = 0
        L1c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            int r0 = r6.size()
            r2 = 0
            r3 = r2
        L2a:
            if (r2 >= r0) goto L68
            java.lang.Object r4 = r6.get(r2)
            r5 = 1
            int r3 = r3 + r5
            if (r3 <= r5) goto L37
            r9.append(r7)
        L37:
            if (r8 == 0) goto L43
            java.lang.Object r4 = r8.invoke(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r9.append(r4)
            goto L65
        L43:
            if (r4 != 0) goto L46
            goto L48
        L46:
            boolean r5 = r4 instanceof java.lang.CharSequence
        L48:
            if (r5 == 0) goto L50
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r9.append(r4)
            goto L65
        L50:
            boolean r5 = r4 instanceof java.lang.Character
            if (r5 == 0) goto L5e
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
            r9.append(r4)
            goto L65
        L5e:
            java.lang.String r4 = r4.toString()
            r9.append(r4)
        L65:
            int r2 = r2 + 1
            goto L2a
        L68:
            r9.append(r1)
            java.lang.String r6 = r9.toString()
            return r6
    }

    public static final java.lang.Void b(java.lang.String r1) {
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
    }

    public static final void c(java.lang.String r1) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
    }
}
