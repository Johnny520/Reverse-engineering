package defpackage;

/* JADX INFO: renamed from: ᛵᛸᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0942 extends defpackage.AbstractC2126 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ com.ss.android.ugc.awemes.WardDatabase_Impl f4230;

    public C0942(com.ss.android.ugc.awemes.WardDatabase_Impl r3) {
            r2 = this;
            r2.f4230 = r3
            r0 = -817564489260590(0xfffd186def0961d2, double:NaN)
            java.lang.String r3 = "dd0fad977bea8ac50da139c829fa32d8"
            r0 = -817706223181358(0xfffd184cef0961d2, double:NaN)
            java.lang.String r0 = "fe271e8733a42dea8f986eb5988fecd4"
            r1 = 4
            r2.<init>(r3, r1, r0)
            return
    }

    @Override // defpackage.AbstractC2126
    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final void mo1889(defpackage.InterfaceC1661 r4) {
            r3 = this;
            r0 = -820437822381614(0xfffd15d0ef0961d2, double:NaN)
            ᛱᲇᲀᛲ r3 = defpackage.AbstractC0425.m1189()
            java.lang.String r0 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            ᛲᛳᲇᛱ r0 = r4.mo892(r0)
        L12:
            boolean r1 = r0.mo530()     // Catch: java.lang.Throwable -> L21
            r2 = 0
            if (r1 == 0) goto L23
            java.lang.String r1 = r0.mo526(r2)     // Catch: java.lang.Throwable -> L21
            r3.add(r1)     // Catch: java.lang.Throwable -> L21
            goto L12
        L21:
            r3 = move-exception
            goto L51
        L23:
            r1 = 0
            defpackage.AbstractC0209.m772(r0, r1)
            ᛱᲇᲀᛲ r3 = defpackage.AbstractC0425.m1197(r3)
            java.util.ListIterator r3 = r3.listIterator(r2)
        L2f:
            r0 = r3
            ᛸᛱᛳᛵ r0 = (defpackage.C1415) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "room_fts_content_sync_"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L2f
            java.lang.String r1 = "DROP TRIGGER IF EXISTS "
            java.lang.String r0 = r1.concat(r0)
            defpackage.AbstractC1628.m2943(r4, r0)
            goto L2f
        L50:
            return
        L51:
            throw r3     // Catch: java.lang.Throwable -> L52
        L52:
            r4 = move-exception
            defpackage.AbstractC0209.m772(r0, r3)
            throw r4
    }

    @Override // defpackage.AbstractC2126
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final void mo1890() {
            r2 = this;
            r0 = -820485067021870(0xfffd15c5ef0961d2, double:NaN)
            return
    }

    @Override // defpackage.AbstractC2126
    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final void mo1891(defpackage.InterfaceC1661 r5) {
            r4 = this;
            r0 = -820390577741358(0xfffd15dbef0961d2, double:NaN)
            com.ss.android.ugc.awemes.WardDatabase_Impl r4 = r4.f4230
            int r0 = com.ss.android.ugc.awemes.WardDatabase_Impl.f441
            ᛸᛸᛶᲈ r4 = r4.f439
            r0 = 0
            if (r4 != 0) goto L12
            r4 = r0
        L12:
            ᛶᛲᛵᲀ r1 = r4.f6842
            r1.getClass()
            java.lang.String r2 = "PRAGMA query_only"
            ᛲᛳᲇᛱ r2 = r5.mo892(r2)
            r2.mo530()     // Catch: java.lang.Throwable -> L7f
            boolean r3 = r2.mo895()     // Catch: java.lang.Throwable -> L7f
            defpackage.AbstractC0209.m772(r2, r0)
            if (r3 != 0) goto L62
            java.lang.String r0 = "PRAGMA temp_store = MEMORY"
            defpackage.AbstractC1628.m2943(r5, r0)
            java.lang.String r0 = "PRAGMA recursive_triggers = 1"
            defpackage.AbstractC1628.m2943(r5, r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS room_table_modification_log"
            defpackage.AbstractC1628.m2943(r5, r0)
            boolean r0 = r1.f4574
            if (r0 == 0) goto L42
            java.lang.String r0 = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            defpackage.AbstractC1628.m2943(r5, r0)
            goto L4f
        L42:
            java.lang.String r0 = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            java.lang.String r2 = "TEMP"
            java.lang.String r3 = ""
            java.lang.String r0 = defpackage.AbstractC0651.m1485(r0, r2, r3)
            defpackage.AbstractC1628.m2943(r5, r0)
        L4f:
            ᲁᛴᛵᛱ r5 = r1.f4570
            java.util.concurrent.locks.ReentrantLock r0 = r5.f8043
            r0.lock()
            r1 = 1
            r5.f8041 = r1     // Catch: java.lang.Throwable -> L5d
            r0.unlock()
            goto L62
        L5d:
            r4 = move-exception
            r0.unlock()
            throw r4
        L62:
            java.lang.Object r5 = r4.f6844
            monitor-enter(r5)
            ᲀᛵᛶᛱ r0 = r4.f6839     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L7b
            android.content.Intent r4 = r4.f6838     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L73
            r0.m3069(r4)     // Catch: java.lang.Throwable -> L71
            goto L7b
        L71:
            r4 = move-exception
            goto L7d
        L73:
            java.lang.String r4 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L71
            throw r0     // Catch: java.lang.Throwable -> L71
        L7b:
            monitor-exit(r5)
            return
        L7d:
            monitor-exit(r5)
            throw r4
        L7f:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L81
        L81:
            r5 = move-exception
            defpackage.AbstractC0209.m772(r2, r4)
            throw r5
    }

    @Override // defpackage.AbstractC2126
    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public final defpackage.C1926 mo1892(defpackage.InterfaceC1661 r31) {
            r30 = this;
            r0 = r31
            r1 = -820532311662126(0xfffd15baef0961d2, double:NaN)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2 = -820579556302382(0xfffd15afef0961d2, double:NaN)
            java.lang.String r2 = "id"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -820592441204270(0xfffd15acef0961d2, double:NaN)
            java.lang.String r4 = "id"
            r5 = -820605326106158(0xfffd15a9ef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r8 = 0
            r9 = 1
            r6 = 1
            r7 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -820626800942638(0xfffd15a4ef0961d2, double:NaN)
            java.lang.String r2 = "category"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -820665455648302(0xfffd159bef0961d2, double:NaN)
            java.lang.String r4 = "category"
            r5 = -820704110353966(0xfffd1592ef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 1
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -820725585190446(0xfffd158def0961d2, double:NaN)
            java.lang.String r2 = "remark"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -820755649961518(0xfffd1586ef0961d2, double:NaN)
            java.lang.String r4 = "remark"
            r5 = -820785714732590(0xfffd157fef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -820807189569070(0xfffd157aef0961d2, double:NaN)
            java.lang.String r2 = "awemeId"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -820841549307438(0xfffd1572ef0961d2, double:NaN)
            java.lang.String r4 = "awemeId"
            r5 = -820875909045806(0xfffd156aef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -820897383882286(0xfffd1565ef0961d2, double:NaN)
            java.lang.String r2 = "cid"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -820914563751470(0xfffd1561ef0961d2, double:NaN)
            java.lang.String r4 = "cid"
            r5 = -820931743620654(0xfffd155def0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -820953218457134(0xfffd1558ef0961d2, double:NaN)
            java.lang.String r2 = "text"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -820974693293614(0xfffd1553ef0961d2, double:NaN)
            java.lang.String r4 = "text"
            r5 = -820996168130094(0xfffd154eef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -821017642966574(0xfffd1549ef0961d2, double:NaN)
            java.lang.String r2 = "createTime"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -821064887606830(0xfffd153eef0961d2, double:NaN)
            java.lang.String r4 = "createTime"
            r5 = -821112132247086(0xfffd1533ef0961d2, double:NaN)
            java.lang.String r5 = "INTEGER"
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -821146491985454(0xfffd152bef0961d2, double:NaN)
            java.lang.String r2 = "saveTime"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -821185146691118(0xfffd1522ef0961d2, double:NaN)
            java.lang.String r4 = "saveTime"
            r5 = -821223801396782(0xfffd1519ef0961d2, double:NaN)
            java.lang.String r5 = "INTEGER"
            r6 = 1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -821258161135150(0xfffd1511ef0961d2, double:NaN)
            java.lang.String r2 = "authorName"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -821305405775406(0xfffd1506ef0961d2, double:NaN)
            java.lang.String r4 = "authorName"
            r5 = -821352650415662(0xfffd14fbef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -821374125252142(0xfffd14f6ef0961d2, double:NaN)
            java.lang.String r2 = "authorAvatar"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -821429959826990(0xfffd14e9ef0961d2, double:NaN)
            java.lang.String r4 = "authorAvatar"
            r5 = -821485794401838(0xfffd14dcef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -821507269238318(0xfffd14d7ef0961d2, double:NaN)
            java.lang.String r2 = "authorUid"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -821550218911278(0xfffd14cdef0961d2, double:NaN)
            java.lang.String r4 = "authorUid"
            r5 = -821593168584238(0xfffd14c3ef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            r2 = -821614643420718(0xfffd14beef0961d2, double:NaN)
            java.lang.String r2 = "type"
            ᲁᛸᛴᛵ r3 = new ᲁᛸᛴᛵ
            r4 = -821636118257198(0xfffd14b9ef0961d2, double:NaN)
            java.lang.String r4 = "type"
            r5 = -821657593093678(0xfffd14b4ef0961d2, double:NaN)
            java.lang.String r5 = "TEXT"
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.put(r2, r3)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            ᲁᛴᛱᲇ r4 = new ᲁᛴᛱᲇ
            r5 = -821679067930158(0xfffd14afef0961d2, double:NaN)
            java.lang.String r5 = "ward_items"
            r4.<init>(r5, r1, r2, r3)
            r1 = -821726312570414(0xfffd14a4ef0961d2, double:NaN)
            java.lang.String r1 = "ward_items"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "PRAGMA table_info(`"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = "`)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            ᛲᛳᲇᛱ r2 = r0.mo892(r2)
            boolean r5 = r2.mo530()     // Catch: java.lang.Throwable -> L20e
            r7 = 1
            java.lang.String r10 = "name"
            r11 = 0
            if (r5 != 0) goto L212
            ᲇᛴᛳᲇ r5 = defpackage.C2033.f8764     // Catch: java.lang.Throwable -> L20e
            defpackage.AbstractC0209.m772(r2, r11)
            r16 = 0
            goto L288
        L20e:
            r0 = move-exception
            r1 = r0
            goto L42a
        L212:
            int r5 = defpackage.AbstractC1592.m2880(r2, r10)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r12 = "type"
            int r12 = defpackage.AbstractC1592.m2880(r2, r12)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r13 = "notnull"
            int r13 = defpackage.AbstractC1592.m2880(r2, r13)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r14 = "pk"
            int r14 = defpackage.AbstractC1592.m2880(r2, r14)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r15 = "dflt_value"
            int r15 = defpackage.AbstractC1592.m2880(r2, r15)     // Catch: java.lang.Throwable -> L20e
            r16 = 0
            ᛴᛴᲁᲇ r8 = new ᛴᛴᲁᲇ     // Catch: java.lang.Throwable -> L20e
            r8.<init>()     // Catch: java.lang.Throwable -> L20e
        L235:
            java.lang.String r19 = r2.mo526(r5)     // Catch: java.lang.Throwable -> L20e
            java.lang.String r20 = r2.mo526(r12)     // Catch: java.lang.Throwable -> L20e
            long r21 = r2.getLong(r13)     // Catch: java.lang.Throwable -> L20e
            int r9 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r9 == 0) goto L249
            r21 = r7
        L247:
            r9 = r12
            goto L24c
        L249:
            r21 = 0
            goto L247
        L24c:
            long r11 = r2.getLong(r14)     // Catch: java.lang.Throwable -> L20e
            int r11 = (int) r11     // Catch: java.lang.Throwable -> L20e
            boolean r12 = r2.isNull(r15)     // Catch: java.lang.Throwable -> L20e
            if (r12 == 0) goto L25a
            r23 = 0
            goto L260
        L25a:
            java.lang.String r12 = r2.mo526(r15)     // Catch: java.lang.Throwable -> L20e
            r23 = r12
        L260:
            ᲁᛸᛴᛵ r18 = new ᲁᛸᛴᛵ     // Catch: java.lang.Throwable -> L20e
            r24 = 2
            r22 = r11
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> L20e
            r12 = r18
            r11 = r19
            r8.put(r11, r12)     // Catch: java.lang.Throwable -> L20e
            boolean r11 = r2.mo530()     // Catch: java.lang.Throwable -> L20e
            if (r11 != 0) goto L425
            r8.m1500()     // Catch: java.lang.Throwable -> L20e
            r8.f3225 = r7     // Catch: java.lang.Throwable -> L20e
            int r5 = r8.f3222     // Catch: java.lang.Throwable -> L20e
            if (r5 <= 0) goto L282
            r5 = r8
        L280:
            r8 = 0
            goto L285
        L282:
            ᛴᛴᲁᲇ r5 = defpackage.C0665.f3220     // Catch: java.lang.Throwable -> L20e
            goto L280
        L285:
            defpackage.AbstractC0209.m772(r2, r8)
        L288:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "PRAGMA foreign_key_list(`"
            r2.<init>(r8)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            ᛲᛳᲇᛱ r2 = r0.mo892(r2)
            java.lang.String r8 = "id"
            int r8 = defpackage.AbstractC1592.m2880(r2, r8)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r9 = "seq"
            int r9 = defpackage.AbstractC1592.m2880(r2, r9)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r11 = "table"
            int r11 = defpackage.AbstractC1592.m2880(r2, r11)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r12 = "on_delete"
            int r12 = defpackage.AbstractC1592.m2880(r2, r12)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r13 = "on_update"
            int r13 = defpackage.AbstractC1592.m2880(r2, r13)     // Catch: java.lang.Throwable -> L30f
            java.util.List r14 = defpackage.AbstractC0729.m1650(r2)     // Catch: java.lang.Throwable -> L30f
            r2.reset()     // Catch: java.lang.Throwable -> L30f
            ᛸᲇᲈᲀ r15 = new ᛸᲇᲈᲀ     // Catch: java.lang.Throwable -> L30f
            r15.<init>()     // Catch: java.lang.Throwable -> L30f
        L2c7:
            boolean r18 = r2.mo530()     // Catch: java.lang.Throwable -> L30f
            if (r18 == 0) goto L357
            long r18 = r2.getLong(r9)     // Catch: java.lang.Throwable -> L30f
            int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r18 == 0) goto L2d6
            goto L2c7
        L2d6:
            long r6 = r2.getLong(r8)     // Catch: java.lang.Throwable -> L30f
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L30f
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30f
            r7.<init>()     // Catch: java.lang.Throwable -> L30f
            r26 = r8
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30f
            r8.<init>()     // Catch: java.lang.Throwable -> L30f
            r27 = r9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30f
            r9.<init>()     // Catch: java.lang.Throwable -> L30f
            java.util.Iterator r20 = r14.iterator()     // Catch: java.lang.Throwable -> L30f
        L2f2:
            boolean r21 = r20.hasNext()     // Catch: java.lang.Throwable -> L30f
            if (r21 == 0) goto L313
            r28 = r14
            java.lang.Object r14 = r20.next()     // Catch: java.lang.Throwable -> L30f
            r29 = r4
            r4 = r14
            ᲇᛲᛴᛵ r4 = (defpackage.C1999) r4     // Catch: java.lang.Throwable -> L30f
            int r4 = r4.f8644     // Catch: java.lang.Throwable -> L30f
            if (r4 != r6) goto L30a
            r9.add(r14)     // Catch: java.lang.Throwable -> L30f
        L30a:
            r14 = r28
            r4 = r29
            goto L2f2
        L30f:
            r0 = move-exception
            r1 = r0
            goto L41f
        L313:
            r29 = r4
            r28 = r14
            java.util.Iterator r4 = r9.iterator()     // Catch: java.lang.Throwable -> L30f
        L31b:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L30f
            if (r6 == 0) goto L332
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L30f
            ᲇᛲᛴᛵ r6 = (defpackage.C1999) r6     // Catch: java.lang.Throwable -> L30f
            java.lang.String r9 = r6.f8642     // Catch: java.lang.Throwable -> L30f
            r7.add(r9)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r6 = r6.f8645     // Catch: java.lang.Throwable -> L30f
            r8.add(r6)     // Catch: java.lang.Throwable -> L30f
            goto L31b
        L332:
            ᛷᛸᛴᛲ r20 = new ᛷᛸᛴᛲ     // Catch: java.lang.Throwable -> L30f
            java.lang.String r21 = r2.mo526(r11)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r22 = r2.mo526(r12)     // Catch: java.lang.Throwable -> L30f
            java.lang.String r23 = r2.mo526(r13)     // Catch: java.lang.Throwable -> L30f
            r24 = r7
            r25 = r8
            r20.<init>(r21, r22, r23, r24, r25)     // Catch: java.lang.Throwable -> L30f
            r4 = r20
            r15.add(r4)     // Catch: java.lang.Throwable -> L30f
            r8 = r26
            r9 = r27
            r14 = r28
            r4 = r29
            r7 = 1
            goto L2c7
        L357:
            r29 = r4
            ᛸᲇᲈᲀ r4 = defpackage.AbstractC0425.m1192(r15)     // Catch: java.lang.Throwable -> L30f
            r8 = 0
            defpackage.AbstractC0209.m772(r2, r8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "PRAGMA index_list(`"
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            ᛲᛳᲇᛱ r2 = r0.mo892(r2)
            int r3 = defpackage.AbstractC1592.m2880(r2, r10)     // Catch: java.lang.Throwable -> L3c8
            java.lang.String r6 = "origin"
            int r6 = defpackage.AbstractC1592.m2880(r2, r6)     // Catch: java.lang.Throwable -> L3c8
            java.lang.String r7 = "unique"
            int r7 = defpackage.AbstractC1592.m2880(r2, r7)     // Catch: java.lang.Throwable -> L3c8
            r8 = -1
            if (r3 == r8) goto L38d
            if (r6 == r8) goto L38d
            if (r7 != r8) goto L38f
        L38d:
            r8 = 0
            goto L3d5
        L38f:
            ᛸᲇᲈᲀ r8 = new ᛸᲇᲈᲀ     // Catch: java.lang.Throwable -> L3c8
            r8.<init>()     // Catch: java.lang.Throwable -> L3c8
        L394:
            boolean r9 = r2.mo530()     // Catch: java.lang.Throwable -> L3c8
            if (r9 == 0) goto L3cb
            java.lang.String r9 = r2.mo526(r6)     // Catch: java.lang.Throwable -> L3c8
            java.lang.String r10 = "c"
            boolean r9 = r10.equals(r9)     // Catch: java.lang.Throwable -> L3c8
            if (r9 != 0) goto L3a7
            goto L394
        L3a7:
            java.lang.String r9 = r2.mo526(r3)     // Catch: java.lang.Throwable -> L3c8
            long r10 = r2.getLong(r7)     // Catch: java.lang.Throwable -> L3c8
            r12 = 1
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L3b7
            r10 = 1
            goto L3b8
        L3b7:
            r10 = 0
        L3b8:
            ᲈᛶᲈᲈ r9 = defpackage.AbstractC0729.m1646(r0, r9, r10)     // Catch: java.lang.Throwable -> L3c8
            if (r9 != 0) goto L3c4
            r10 = 0
            defpackage.AbstractC0209.m772(r2, r10)
        L3c2:
            r8 = 0
            goto L3d9
        L3c4:
            r8.add(r9)     // Catch: java.lang.Throwable -> L3c8
            goto L394
        L3c8:
            r0 = move-exception
            r1 = r0
            goto L419
        L3cb:
            ᛸᲇᲈᲀ r0 = defpackage.AbstractC0425.m1192(r8)     // Catch: java.lang.Throwable -> L3c8
            r8 = 0
            defpackage.AbstractC0209.m772(r2, r8)
            r8 = r0
            goto L3d9
        L3d5:
            defpackage.AbstractC0209.m772(r2, r8)
            goto L3c2
        L3d9:
            ᲁᛴᛱᲇ r0 = new ᲁᛴᛱᲇ
            r0.<init>(r1, r5, r4, r8)
            r4 = r29
            boolean r1 = r4.equals(r0)
            if (r1 != 0) goto L411
            ᲁᲁᛴᲇ r1 = new ᲁᲁᛴᲇ
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r5 = -821773557210670(0xfffd1499ef0961d2, double:NaN)
            java.lang.String r3 = "ward_items(com.ss.android.ugc.awemes.WardItem).\n Expected:\n"
            r2.<init>(r3)
            r2.append(r4)
            r3 = -822031255248430(0xfffd145def0961d2, double:NaN)
            java.lang.String r3 = "\n Found:\n"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6 = 0
            r1.<init>(r0, r6)
            return r1
        L411:
            ᲁᲁᛴᲇ r0 = new ᲁᲁᛴᲇ
            r7 = 1
            r11 = 0
            r0.<init>(r11, r7)
            return r0
        L419:
            throw r1     // Catch: java.lang.Throwable -> L41a
        L41a:
            r0 = move-exception
            defpackage.AbstractC0209.m772(r2, r1)
            throw r0
        L41f:
            throw r1     // Catch: java.lang.Throwable -> L420
        L420:
            r0 = move-exception
            defpackage.AbstractC0209.m772(r2, r1)
            throw r0
        L425:
            r6 = 0
            r12 = r9
            r11 = 0
            goto L235
        L42a:
            throw r1     // Catch: java.lang.Throwable -> L42b
        L42b:
            r0 = move-exception
            defpackage.AbstractC0209.m772(r2, r1)
            throw r0
    }

    @Override // defpackage.AbstractC2126
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo1893(defpackage.InterfaceC1661 r3) {
            r2 = this;
            r0 = -820150059572782(0xfffd1613ef0961d2, double:NaN)
            r0 = -820197304213038(0xfffd1608ef0961d2, double:NaN)
            java.lang.String r2 = "DROP TABLE IF EXISTS `ward_items`"
            defpackage.AbstractC1628.m2943(r3, r2)
            return
    }

    @Override // defpackage.AbstractC2126
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo1894(defpackage.InterfaceC1661 r3) {
            r2 = this;
            r0 = -817847957102126(0xfffd182bef0961d2, double:NaN)
            r0 = -817895201742382(0xfffd1820ef0961d2, double:NaN)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS `ward_items` (`id` TEXT NOT NULL, `category` TEXT NOT NULL, `remark` TEXT NOT NULL, `awemeId` TEXT NOT NULL, `cid` TEXT NOT NULL, `text` TEXT NOT NULL, `createTime` INTEGER NOT NULL, `saveTime` INTEGER NOT NULL, `authorName` TEXT, `authorAvatar` TEXT, `authorUid` TEXT, `type` TEXT, PRIMARY KEY(`id`))"
            defpackage.AbstractC1628.m2943(r3, r2)
            r0 = -819308245982766(0xfffd16d7ef0961d2, double:NaN)
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            defpackage.AbstractC1628.m2943(r3, r2)
            r0 = -819690498072110(0xfffd167eef0961d2, double:NaN)
            java.lang.String r2 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dd0fad977bea8ac50da139c829fa32d8')"
            defpackage.AbstractC1628.m2943(r3, r2)
            return
    }

    @Override // defpackage.AbstractC2126
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final void mo1895() {
            r2 = this;
            r0 = -820343333101102(0xfffd15e6ef0961d2, double:NaN)
            return
    }
}
