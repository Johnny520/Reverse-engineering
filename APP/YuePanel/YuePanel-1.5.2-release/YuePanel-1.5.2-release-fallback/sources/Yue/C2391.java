package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
public class C2391 {
    public C2391() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.io.File m11001(@Yue.InterfaceC4418 java.io.File r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = m11003(r1)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int m11002(java.lang.String r8) {
            char r6 = java.io.File.separatorChar
            r4 = 4
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r8
            r1 = r6
            int r0 = Yue.C5989.m22363(r0, r1, r2, r3, r4, r5)
            r7 = 1
            if (r0 != 0) goto L3c
            int r0 = r8.length()
            if (r0 <= r7) goto L3b
            char r0 = r8.charAt(r7)
            if (r0 != r6) goto L3b
            r4 = 4
            r5 = 0
            r2 = 2
            r3 = 0
            r0 = r8
            r1 = r6
            int r0 = Yue.C5989.m22363(r0, r1, r2, r3, r4, r5)
            if (r0 < 0) goto L3b
            int r2 = r0 + 1
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r8
            r1 = r6
            int r0 = Yue.C5989.m22363(r0, r1, r2, r3, r4, r5)
            if (r0 < 0) goto L36
            int r0 = r0 + r7
            return r0
        L36:
            int r8 = r8.length()
            return r8
        L3b:
            return r7
        L3c:
            r1 = 58
            if (r0 <= 0) goto L4a
            int r2 = r0 + (-1)
            char r2 = r8.charAt(r2)
            if (r2 != r1) goto L4a
            int r0 = r0 + r7
            return r0
        L4a:
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L5b
            r0 = 2
            r2 = 0
            boolean r0 = Yue.C5989.m22347(r8, r1, r3, r0, r2)
            if (r0 == 0) goto L5b
            int r8 = r8.length()
            return r8
        L5b:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String m11003(@Yue.InterfaceC4418 java.io.File r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = r2.getPath()
            java.lang.String r1 = "path"
            Yue.C3329.m13905(r0, r1)
            java.lang.String r2 = r2.getPath()
            Yue.C3329.m13905(r2, r1)
            int r2 = m11002(r2)
            r1 = 0
            java.lang.String r2 = r0.substring(r1, r2)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m11004(@Yue.InterfaceC4418 java.io.File r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = r1.getPath()
            java.lang.String r0 = "path"
            Yue.C3329.m13905(r1, r0)
            int r1 = m11002(r1)
            if (r1 <= 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.io.File m11005(@Yue.InterfaceC4418 java.io.File r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۠ۡۨ۠ r1 = m11006(r1)
            java.io.File r1 = r1.m10877(r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.C2361 m11006(@Yue.InterfaceC4418 java.io.File r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r10, r0)
            java.lang.String r10 = r10.getPath()
            java.lang.String r0 = "path"
            Yue.C3329.m13905(r10, r0)
            int r0 = m11002(r10)
            r1 = 0
            java.lang.String r2 = r10.substring(r1, r0)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r2, r3)
            java.lang.String r4 = r10.substring(r0)
            java.lang.String r10 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r4, r10)
            int r10 = r4.length()
            if (r10 != 0) goto L30
            java.util.List r10 = Yue.C1208.m6210()
            goto L64
        L30:
            r10 = 1
            char[] r5 = new char[r10]
            char r10 = java.io.File.separatorChar
            r5[r1] = r10
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            java.util.List r10 = Yue.C5989.m22443(r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = Yue.C1210.m6231(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L4e:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r10.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            r0.add(r3)
            goto L4e
        L63:
            r10 = r0
        L64:
            Yue.ۥ۠ۡۨ۠ r0 = new Yue.ۥ۠ۡۨ۠
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r0.<init>(r1, r10)
            return r0
    }
}
