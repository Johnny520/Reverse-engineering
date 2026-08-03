package bsh.commands;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class dir {
    static final java.lang.String[] months = null;

    static {
            java.lang.String r10 = "Nov"
            java.lang.String r11 = "Dec"
            java.lang.String r0 = "Jan"
            java.lang.String r1 = "Feb"
            java.lang.String r2 = "Mar"
            java.lang.String r3 = "Apr"
            java.lang.String r4 = "May"
            java.lang.String r5 = "Jun"
            java.lang.String r6 = "Jul"
            java.lang.String r7 = "Aug"
            java.lang.String r8 = "Sep"
            java.lang.String r9 = "Oct"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            bsh.commands.dir.months = r0
            return
    }

    public dir() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void invoke(bsh.Interpreter r1, bsh.CallStack r2) {
            java.lang.String r0 = "."
            invoke(r1, r2, r0)
            return
    }

    public static void invoke(bsh.Interpreter r10, bsh.CallStack r11, java.lang.String r12) {
            java.io.File r11 = r10.pathToFile(r12)     // Catch: java.io.IOException -> L13b
            java.lang.String r11 = r11.getAbsolutePath()     // Catch: java.io.IOException -> L13b
            java.io.File r0 = r10.pathToFile(r12)     // Catch: java.io.IOException -> L13b
            boolean r1 = r0.exists()
            if (r1 == 0) goto L129
            boolean r1 = r0.canRead()
            if (r1 != 0) goto L1a
            goto L129
        L1a:
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "'"
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = "' is not a directory"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r10.println(r12)
        L36:
            java.lang.String[] r12 = r0.list()
            r0 = 0
            if (r12 != 0) goto L3f
            java.lang.String[] r12 = new java.lang.String[r0]
        L3f:
            java.util.Arrays.sort(r12)
            r1 = r0
        L43:
            int r2 = r12.length
            if (r1 >= r2) goto L128
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r4 = java.io.File.separator
            r3.append(r4)
            r4 = r12[r1]
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            boolean r4 = r2.canRead()
            java.lang.String r5 = "-"
            if (r4 == 0) goto L71
            java.lang.String r4 = "r"
            goto L72
        L71:
            r4 = r5
        L72:
            r3.append(r4)
            boolean r4 = r2.canWrite()
            if (r4 == 0) goto L7d
            java.lang.String r5 = "w"
        L7d:
            r3.append(r5)
            java.lang.String r4 = "_ "
            r3.append(r4)
            java.util.Date r4 = new java.util.Date
            long r5 = r2.lastModified()
            r4.<init>(r5)
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar
            r5.<init>()
            r5.setTime(r4)
            r4 = 5
            int r4 = r5.get(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String[] r7 = bsh.commands.dir.months
            r8 = 2
            int r5 = r5.get(r8)
            r5 = r7[r5]
            r6.append(r5)
            java.lang.String r5 = " "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r3.append(r6)
            r6 = 10
            if (r4 >= r6) goto Lc2
            r3.append(r5)
        Lc2:
            r3.append(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r6 = r0
        Lcb:
            r7 = 8
            if (r6 >= r7) goto Ld5
            r4.append(r5)
            int r6 = r6 + 1
            goto Lcb
        Ld5:
            long r8 = r2.length()
            r4.insert(r0, r8)
            r4.setLength(r7)
            java.lang.String r6 = r4.toString()
            int r6 = r6.indexOf(r5)
            r7 = -1
            if (r6 == r7) goto Lf8
            java.lang.String r7 = r4.toString()
            java.lang.String r7 = r7.substring(r6)
            r4.setLength(r6)
            r4.insert(r0, r7)
        Lf8:
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.String r5 = r2.getName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto L11d
            java.lang.String r2 = "/"
            r3.append(r2)
        L11d:
            java.lang.String r2 = r3.toString()
            r10.println(r2)
            int r1 = r1 + 1
            goto L43
        L128:
            return
        L129:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Can't read "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
            return
        L13b:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "error reading path: "
            r12.<init>(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.println(r11)
            return
    }

    public static java.lang.String usage() {
            java.lang.String r0 = "usage: dir( String dir )\n       dir()"
            return r0
    }
}
