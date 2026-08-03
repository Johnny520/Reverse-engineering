package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m27(android.database.Cursor r9, java.lang.String r10) {
            int r0 = r9.getColumnIndex(r10)
            if (r0 < 0) goto L8
            goto L87
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "`"
            r0.append(r1)
            r0.append(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r0 = r9.getColumnIndex(r0)
            if (r0 < 0) goto L23
            goto L87
        L23:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = -1
            r3 = 25
            if (r0 <= r3) goto L2b
            goto L86
        L2b:
            int r0 = r10.length()
            if (r0 != 0) goto L32
            goto L86
        L32:
            java.lang.String[] r0 = r9.getColumnNames()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "."
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r10)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4 = 0
            r5 = r4
        L5b:
            int r6 = r0.length
            if (r5 >= r6) goto L86
            r6 = r0[r5]
            int r7 = r6.length()
            int r8 = r10.length()
            int r8 = r8 + 2
            if (r7 < r8) goto L83
            boolean r7 = r6.endsWith(r3)
            if (r7 == 0) goto L73
            goto L81
        L73:
            char r7 = r6.charAt(r4)
            r8 = 96
            if (r7 != r8) goto L83
            boolean r6 = r6.endsWith(r1)
            if (r6 == 0) goto L83
        L81:
            r0 = r5
            goto L87
        L83:
            int r5 = r5 + 1
            goto L5b
        L86:
            r0 = r2
        L87:
            if (r0 < 0) goto L8a
            return r0
        L8a:
            java.lang.String[] r9 = r9.getColumnNames()     // Catch: java.lang.Exception -> L93
            java.lang.String r9 = java.util.Arrays.toString(r9)     // Catch: java.lang.Exception -> L93
            goto L9d
        L93:
            r9 = move-exception
            java.lang.String r0 = "RoomCursorUtil"
            java.lang.String r1 = "Cannot collect column names for debug purposes"
            android.util.Log.d(r0, r1, r9)
            java.lang.String r9 = ""
        L9d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "column '"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "' does not exist. Available columns: "
            r1.append(r10)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }
}
