package defpackage;

/* JADX INFO: renamed from: ᛴᛶᛱᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C2243 f3288;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public java.lang.Class f3289;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f3290;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C0533 f3291;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public defpackage.EnumC1307 f3292;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f3293;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f3294;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f3295;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0909 f3296;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList f3297;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public defpackage.C0619 f3298;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public defpackage.InterfaceC1711 f3299;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public boolean f3300;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public boolean f3301;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f3302;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f3303;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public defpackage.C1506 f3304;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public java.lang.Class f3305;

    public C0684() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3297 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3302 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC0660 m1569(java.lang.Class r5) {
            r4 = this;
            ᛴᛱᲇᛵ r0 = r4.f3298
            java.lang.Object r0 = r0.get(r5)
            ᛴᛴᲀᛶ r0 = (defpackage.InterfaceC0660) r0
            if (r0 != 0) goto L34
            ᛴᛱᲇᛵ r1 = r4.f3298
            java.util.Set r1 = r1.entrySet()
            ᛳᛶᛳᛷ r1 = (defpackage.C0499) r1
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L16
            java.lang.Object r0 = r2.getValue()
            ᛴᛴᲀᛶ r0 = (defpackage.InterfaceC0660) r0
        L34:
            if (r0 != 0) goto L4f
            ᛴᛱᲇᛵ r0 = r4.f3298
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4c
            boolean r4 = r4.f3300
            if (r4 != 0) goto L43
            goto L4c
        L43:
            java.lang.String r4 = "Missing transformation for "
            java.lang.String r0 = ". If you wish to ignore unknown resource types, use the optional transformation methods."
            defpackage.C0086.m559(r5, r4, r0)
            r4 = 0
            return r4
        L4c:
            ᲇᲀᲇ r4 = defpackage.C2123.f9090
            return r4
        L4f:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.InterfaceC1393 m1570(java.lang.Object r5) {
            r4 = this;
            ᛵᛶᛳᲇ r4 = r4.f3296
            ᲈᲈᛲᲇ r4 = r4.m1877()
            ᛳᲈᛳᛸ r4 = r4.f10241
            java.lang.Class r0 = r5.getClass()
            monitor-enter(r4)
            java.util.ArrayList r1 = r4.f2955     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2b
            ᛷᲁᲈᛱ r2 = (defpackage.C1375) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r3 = r2.f6007     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.isAssignableFrom(r0)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L13
            ᛷᲇᲇᛴ r0 = r2.f6008     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)
            goto L2f
        L2b:
            r5 = move-exception
            goto L4a
        L2d:
            monitor-exit(r4)
            r0 = 0
        L2f:
            if (r0 == 0) goto L32
            return r0
        L32:
            ᲇᲇᛳᲀ r4 = new ᲇᲇᛳᲀ
            java.lang.Class r5 = r5.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find source encoder for data class: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L4a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r5
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0022 m1571(java.lang.Class r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            ᛵᛶᛳᲇ r2 = r0.f3296
            ᲈᲈᛲᲇ r7 = r2.m1877()
            java.lang.Class r8 = r0.f3305
            java.lang.Class r9 = r0.f3289
            ᛱᛵᛸᛷ r0 = r7.f10235
            java.util.concurrent.atomic.AtomicReference r2 = r0.f903
            r10 = 0
            java.lang.Object r2 = r2.getAndSet(r10)
            ᲁᲁᛱᛲ r2 = (defpackage.C1921) r2
            if (r2 != 0) goto L20
            ᲁᲁᛱᛲ r2 = new ᲁᲁᛱᛲ
            r2.<init>()
        L20:
            r2.f8360 = r1
            r2.f8361 = r8
            r2.f8359 = r9
            ᛸᛶᛱᛲ r3 = r0.f902
            monitor-enter(r3)
            ᛸᛶᛱᛲ r4 = r0.f902     // Catch: java.lang.Throwable -> L17d
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L17d
            ᛱᛱᛶᛴ r4 = (defpackage.C0022) r4     // Catch: java.lang.Throwable -> L17d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17d
            java.util.concurrent.atomic.AtomicReference r0 = r0.f903
            r0.set(r2)
            ᛱᛵᛸᛷ r0 = r7.f10235
            r0.getClass()
            ᛱᛱᛶᛴ r0 = defpackage.C0097.f901
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L45
            return r10
        L45:
            if (r4 != 0) goto L17c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            ᲁᛷᛵ r0 = r7.f10238
            java.util.ArrayList r0 = r0.m3304(r1, r8)
            java.util.Iterator r12 = r0.iterator()
        L56:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L149
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Class r2 = (java.lang.Class) r2
            ᛳᲈᛳᛸ r0 = r7.f10242
            java.util.ArrayList r0 = r0.m1388(r2, r9)
            java.util.Iterator r13 = r0.iterator()
        L6d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L145
            java.lang.Object r0 = r13.next()
            r3 = r0
            java.lang.Class r3 = (java.lang.Class) r3
            ᲁᛷᛵ r4 = r7.f10238
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld0
            r0.<init>()     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r5 = r4.f8180     // Catch: java.lang.Throwable -> Ld0
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Throwable -> Ld0
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Ld0
        L8a:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Ld0
            r15 = 1
            if (r6 == 0) goto Ld3
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r10 = r4.f8179     // Catch: java.lang.Throwable -> Ld0
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r6 = r10.get(r6)     // Catch: java.lang.Throwable -> Ld0
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Ld0
            if (r6 != 0) goto La5
        La3:
            r10 = 0
            goto L8a
        La5:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Ld0
        La9:
            boolean r10 = r6.hasNext()     // Catch: java.lang.Throwable -> Ld0
            if (r10 == 0) goto La3
            java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> Ld0
            ᛸᛴᲁᲇ r10 = (defpackage.C1480) r10     // Catch: java.lang.Throwable -> Ld0
            java.lang.Class r14 = r10.f6564     // Catch: java.lang.Throwable -> Ld0
            boolean r14 = r14.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> Ld0
            if (r14 == 0) goto Lc7
            java.lang.Class r14 = r10.f6565     // Catch: java.lang.Throwable -> Ld0
            boolean r14 = r2.isAssignableFrom(r14)     // Catch: java.lang.Throwable -> Ld0
            if (r14 == 0) goto Lc7
            r14 = r15
            goto Lc8
        Lc7:
            r14 = 0
        Lc8:
            if (r14 == 0) goto La9
            ᛲᲈᛷᛲ r10 = r10.f6563     // Catch: java.lang.Throwable -> Ld0
            r0.add(r10)     // Catch: java.lang.Throwable -> Ld0
            goto La9
        Ld0:
            r0 = move-exception
            goto L143
        Ld3:
            monitor-exit(r4)
            ᛳᲈᛳᛸ r5 = r7.f10242
            monitor-enter(r5)
            boolean r4 = r3.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> Le3
            if (r4 == 0) goto Le5
            ᲀᛴᛱᛱ r4 = defpackage.C1654.f7357     // Catch: java.lang.Throwable -> Le3
            monitor-exit(r5)
        Le0:
            r5 = r4
            r4 = r0
            goto L110
        Le3:
            r0 = move-exception
            goto L141
        Le5:
            java.util.ArrayList r4 = r5.f2955     // Catch: java.lang.Throwable -> Le3
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Le3
        Leb:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Le3
            if (r6 == 0) goto L122
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Le3
            ᛷᲁᛱᲁ r6 = (defpackage.C1362) r6     // Catch: java.lang.Throwable -> Le3
            java.lang.Class r10 = r6.f5959     // Catch: java.lang.Throwable -> Le3
            boolean r10 = r10.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> Le3
            if (r10 == 0) goto L109
            java.lang.Class r10 = r6.f5960     // Catch: java.lang.Throwable -> Le3
            boolean r10 = r3.isAssignableFrom(r10)     // Catch: java.lang.Throwable -> Le3
            if (r10 == 0) goto L109
            r10 = r15
            goto L10a
        L109:
            r10 = 0
        L10a:
            if (r10 == 0) goto L11f
            ᛵᛷᛸᛲ r4 = r6.f5958     // Catch: java.lang.Throwable -> Le3
            monitor-exit(r5)
            goto Le0
        L110:
            ᛲᛱᛸᛵ r0 = new ᛲᛱᛸᛵ
            ᛷᛸᛱᛸ r6 = r7.f10240
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.add(r0)
            r1 = r17
            r10 = 0
            goto L6d
        L11f:
            r1 = r17
            goto Leb
        L122:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r1.<init>()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r4 = "No transcoder registered to transcode from "
            r1.append(r4)     // Catch: java.lang.Throwable -> Le3
            r1.append(r2)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r2 = " to "
            r1.append(r2)     // Catch: java.lang.Throwable -> Le3
            r1.append(r3)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le3
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le3
            throw r0     // Catch: java.lang.Throwable -> Le3
        L141:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Le3
            throw r0
        L143:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld0
            throw r0
        L145:
            r1 = r17
            goto L56
        L149:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L155
            r1 = r17
            r2 = r8
            r3 = r9
            r10 = 0
            goto L162
        L155:
            ᛱᛱᛶᛴ r0 = new ᛱᛱᛶᛴ
            ᛷᛸᛱᛸ r5 = r7.f10240
            r1 = r17
            r2 = r8
            r3 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10 = r0
        L162:
            ᛱᛵᛸᛷ r0 = r7.f10235
            ᛸᛶᛱᛲ r5 = r0.f902
            monitor-enter(r5)
            ᛸᛶᛱᛲ r0 = r0.f902     // Catch: java.lang.Throwable -> L179
            ᲁᲁᛱᛲ r4 = new ᲁᲁᛱᛲ     // Catch: java.lang.Throwable -> L179
            r4.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L179
            if (r10 == 0) goto L172
            r1 = r10
            goto L174
        L172:
            ᛱᛱᛶᛴ r1 = defpackage.C0097.f901     // Catch: java.lang.Throwable -> L179
        L174:
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L179
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L179
            return r10
        L179:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L179
            throw r0
        L17c:
            return r4
        L17d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17d
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.ArrayList m1572() {
            r7 = this;
            boolean r0 = r7.f3294
            java.util.ArrayList r1 = r7.f3302
            if (r0 != 0) goto L4d
            r0 = 1
            r7.f3294 = r0
            r1.clear()
            java.util.ArrayList r7 = r7.m1573()
            int r0 = r7.size()
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r0) goto L4d
            java.lang.Object r4 = r7.get(r3)
            ᛳᛱᛱᛲ r4 = (defpackage.C0402) r4
            ᲀᛷᛶᲈ r5 = r4.f2057
            java.util.List r6 = java.util.Collections.EMPTY_LIST
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L2d
            ᲀᛷᛶᲈ r4 = r4.f2057
            r1.add(r4)
        L2d:
            r4 = r2
        L2e:
            int r5 = r6.size()
            if (r4 >= r5) goto L4a
            java.lang.Object r5 = r6.get(r4)
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L47
            java.lang.Object r5 = r6.get(r4)
            ᲀᛷᛶᲈ r5 = (defpackage.InterfaceC1711) r5
            r1.add(r5)
        L47:
            int r4 = r4 + 1
            goto L2e
        L4a:
            int r3 = r3 + 1
            goto L16
        L4d:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList m1573() {
            r9 = this;
            boolean r0 = r9.f3290
            java.util.ArrayList r1 = r9.f3297
            if (r0 != 0) goto L39
            r0 = 1
            r9.f3290 = r0
            r1.clear()
            ᛵᛶᛳᲇ r0 = r9.f3296
            ᲈᲈᛲᲇ r0 = r0.m1877()
            java.lang.Object r2 = r9.f3295
            java.util.List r0 = r0.m3872(r2)
            int r2 = r0.size()
            r3 = 0
        L1d:
            if (r3 >= r2) goto L39
            java.lang.Object r4 = r0.get(r3)
            ᲈᛶᲀᛳ r4 = (defpackage.InterfaceC2267) r4
            java.lang.Object r5 = r9.f3295
            int r6 = r9.f3293
            int r7 = r9.f3303
            ᛳᛸᲁᛶ r8 = r9.f3291
            ᛳᛱᛱᛲ r4 = r4.mo1266(r5, r6, r7, r8)
            if (r4 == 0) goto L36
            r1.add(r4)
        L36:
            int r3 = r3 + 1
            goto L1d
        L39:
            return r1
    }
}
