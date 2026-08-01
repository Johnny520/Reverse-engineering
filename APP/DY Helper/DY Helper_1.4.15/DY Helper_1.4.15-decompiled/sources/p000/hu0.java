package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class hu0 {
    /* JADX INFO: renamed from: α */
    public static java.lang.String m2541(java.util.List r6, java.lang.String r7, p000.sv0 r8, int r9) {
            r0 = r9 & 1
            if (r0 == 0) goto L6
            java.lang.String r7 = ", "
        L6:
            r9 = r9 & 32
            if (r9 == 0) goto Lb
            r8 = 0
        Lb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = ""
            r9.append(r0)
            int r1 = r6.size()
            r2 = 0
            r3 = r2
        L1b:
            if (r2 >= r1) goto L59
            java.lang.Object r4 = r6.get(r2)
            r5 = 1
            int r3 = r3 + r5
            if (r3 <= r5) goto L28
            r9.append(r7)
        L28:
            if (r8 == 0) goto L34
            java.lang.Object r4 = r8.invoke(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r9.append(r4)
            goto L56
        L34:
            if (r4 != 0) goto L37
            goto L39
        L37:
            boolean r5 = r4 instanceof java.lang.CharSequence
        L39:
            if (r5 == 0) goto L41
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r9.append(r4)
            goto L56
        L41:
            boolean r5 = r4 instanceof java.lang.Character
            if (r5 == 0) goto L4f
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
            r9.append(r4)
            goto L56
        L4f:
            java.lang.String r4 = r4.toString()
            r9.append(r4)
        L56:
            int r2 = r2 + 1
            goto L1b
        L59:
            r9.append(r0)
            java.lang.String r6 = r9.toString()
            return r6
    }

    /* JADX INFO: renamed from: β */
    public static final void m2542(java.lang.String r1) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
    }
}
