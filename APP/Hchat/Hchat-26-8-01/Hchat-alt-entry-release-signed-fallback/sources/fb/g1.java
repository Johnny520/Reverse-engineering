package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fb.g1 f3523a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f3524b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f3525c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f3526d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f3527e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f3528f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f3529g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f3530h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f3531i = null;

    static {
            fb.g1 r0 = new fb.g1
            r0.<init>()
            fb.g1.f3523a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            fb.g1.f3524b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            fb.g1.f3525c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            fb.g1.f3526d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            fb.g1.f3527e = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            fb.g1.f3528f = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            fb.g1.f3529g = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            fb.g1.f3530h = r0
            c9.q r0 = new c9.q
            r1 = 9
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            fb.g1.f3531i = r0
            return
    }

    public static java.io.File a(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.io.File r2 = p(r2)
            java.io.File r2 = r2.getParentFile()
            java.lang.String r1 = "attachments"
            r0.<init>(r2, r1)
            return r0
    }

    public static void b(android.content.Context r3, java.util.List r4) {
            r4.getClass()
            java.io.File r0 = a(r3)     // Catch: java.lang.Throwable -> Lc
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L13:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L19
            r0 = 0
        L19:
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L6d
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r4, r2)
            fb.f1 r4 = new fb.f1
            r2 = 0
            r4.<init>(r3, r2)
            ng.i r3 = ng.m.X(r1, r4)
            fb.g0 r4 = new fb.g0
            r1 = 14
            r4.<init>(r1)
            ng.b r1 = new ng.b
            java.util.Iterator r3 = r3.iterator()
            r1.<init>(r3, r4)
        L3d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r1.next()
            java.io.File r3 = (java.io.File) r3
            r3.delete()     // Catch: java.lang.Throwable -> L4c
        L4c:
            java.io.File r3 = r3.getParentFile()
        L50:
            if (r3 == 0) goto L3d
            boolean r4 = r3.equals(r0)
            if (r4 != 0) goto L3d
            java.lang.String[] r4 = r3.list()
            if (r4 == 0) goto L3d
            int r4 = r4.length
            if (r4 != 0) goto L3d
            boolean r4 = r3.delete()
            if (r4 != 0) goto L68
            goto L3d
        L68:
            java.io.File r3 = r3.getParentFile()
            goto L50
        L6d:
            return
    }

    public static fb.y d(org.json.JSONObject r7) {
            fb.y r0 = new fb.y
            java.lang.String r1 = "pluginName"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.optString(r1, r2)
            java.lang.String r3 = "pluginId"
            java.lang.String r3 = j8.b.i(r1, r3, r2, r7)
            java.lang.String r4 = "infoProp"
            java.lang.String r4 = r7.optString(r4, r2)
            java.lang.String r5 = "mainJava"
            java.lang.String r5 = j8.b.i(r4, r5, r2, r7)
            java.lang.String r6 = "summary"
            java.lang.String r7 = r7.optString(r6, r2)
            r7.getClass()
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static void e(android.content.Context r6, java.lang.String r7) {
            java.lang.String r0 = ".json"
            r6.getClass()
            r7.getClass()
            java.lang.String r1 = m(r7)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = fb.g1.f3530h
            r2.getClass()
            r2.add(r1)
            java.util.concurrent.ConcurrentHashMap r2 = fb.g1.f3528f
            r2.remove(r1)
            java.util.concurrent.ConcurrentHashMap r2 = fb.g1.f3527e
            fb.g0 r3 = new fb.g0
            r4 = 13
            r3.<init>(r4)
            bc.j r4 = new bc.j
            r5 = 8
            r4.<init>(r3, r5)
            java.lang.Object r2 = r2.computeIfAbsent(r1, r4)
            r2.getClass()
            monitor-enter(r2)
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L8b
            java.io.File r4 = p(r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L8b
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L8b
            r3.delete()     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r2)
            java.io.File r0 = new java.io.File
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.io.File r6 = r1.scriptDir(r6)
            java.io.File r6 = r6.getParentFile()
            java.lang.String r1 = "Agent/tool-results"
            r0.<init>(r6, r1)
            r0.mkdirs()
            boolean r6 = og.m.t0(r7)
            if (r6 == 0) goto L5e
            java.lang.String r7 = "session"
        L5e:
            java.lang.String r6 = "[^A-Za-z0-9_-]"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            r6.getClass()
            java.lang.String r1 = "_"
            java.util.regex.Matcher r6 = r6.matcher(r7)
            java.lang.String r6 = r6.replaceAll(r1)
            r6.getClass()
            r7 = 96
            java.lang.String r6 = og.m.P0(r7, r6)
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L82
            java.lang.String r6 = "item"
        L82:
            java.io.File r7 = new java.io.File
            r7.<init>(r0, r6)
            dg.l.b0(r7)
            return
        L8b:
            r6 = move-exception
            monitor-exit(r2)
            throw r6
    }

    public static org.json.JSONObject f(fb.d1 r22) {
            r0 = r22
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = r0.f3483a
            java.lang.String r3 = "id"
            r1.put(r3, r2)
            java.lang.String r2 = "title"
            java.lang.String r4 = r0.f3484b
            r1.put(r2, r4)
            long r4 = r0.f3485c
            java.lang.String r2 = "createdAt"
            r1.put(r2, r4)
            long r4 = r0.f3486d
            java.lang.String r6 = "updatedAt"
            r1.put(r6, r4)
            java.lang.String r4 = "targetPluginId"
            java.lang.String r5 = r0.f3489g
            r1.put(r4, r5)
            java.lang.String r4 = "conversationSummary"
            java.lang.String r5 = r0.f3490h
            r1.put(r4, r5)
            java.lang.String r4 = "nativeToolHistory"
            java.lang.String r5 = r0.f3491i
            r1.put(r4, r5)
            java.lang.String r4 = "protocolTranscript"
            java.lang.String r5 = r0.f3492j
            r1.put(r4, r5)
            java.lang.String r4 = "compactedMessageCount"
            int r5 = r0.f3493k
            r1.put(r4, r5)
            java.lang.String r4 = "pinned"
            boolean r5 = r0.f3494l
            r1.put(r4, r5)
            java.lang.String r4 = "locked"
            boolean r5 = r0.f3495m
            r1.put(r4, r5)
            java.lang.String r4 = "sortOrder"
            long r7 = r0.f3496n
            r1.put(r4, r7)
            java.lang.String r4 = "checkpointSeq"
            long r7 = r0.f3498p
            r1.put(r4, r7)
            fb.c1 r4 = r0.f3497o
            java.lang.String r5 = "startedAt"
            java.lang.String r7 = "turnId"
            if (r4 == 0) goto L127
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = r4.f3449a
            r8.put(r7, r9)
            java.lang.String r9 = "sourceUserMessageId"
            java.lang.String r10 = r4.f3450b
            r8.put(r9, r10)
            java.lang.String r9 = "taskGoal"
            java.lang.String r10 = r4.f3451c
            r8.put(r9, r10)
            java.lang.String r9 = "workContext"
            java.lang.String r10 = r4.f3452d
            r8.put(r9, r10)
            fb.j2 r9 = r4.f3453e
            if (r9 == 0) goto L10e
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r11 = "stagingPath"
            java.lang.String r12 = r9.f3590a
            r10.put(r11, r12)
            java.lang.String r11 = "pluginId"
            java.lang.String r12 = r9.f3591b
            r10.put(r11, r12)
            java.lang.String r11 = "existed"
            boolean r12 = r9.f3592c
            r10.put(r11, r12)
            java.lang.String r11 = "baseFingerprint"
            java.lang.String r12 = r9.f3593d
            r10.put(r11, r12)
            java.lang.String r11 = "stageFingerprint"
            java.lang.String r12 = r9.f3594e
            r10.put(r11, r12)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.util.LinkedHashMap r12 = r9.f3595f
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        Lc4:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Le0
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r11.put(r14, r13)
            goto Lc4
        Le0:
            java.lang.String r12 = "basePathStates"
            r10.put(r12, r11)
            java.lang.String r11 = "initialPluginName"
            java.lang.String r12 = r9.f3596g
            r10.put(r11, r12)
            java.lang.String r11 = "revision"
            int r12 = r9.f3597h
            r10.put(r11, r12)
            java.lang.String r11 = "checkedRevision"
            int r12 = r9.f3598i
            r10.put(r11, r12)
            java.lang.String r11 = "shownRevision"
            int r12 = r9.f3599j
            r10.put(r11, r12)
            java.lang.String r11 = "deletePlugin"
            boolean r12 = r9.f3600k
            r10.put(r11, r12)
            long r11 = r9.f3601l
            r10.put(r6, r11)
            goto L110
        L10e:
            java.lang.Object r10 = org.json.JSONObject.NULL
        L110:
            java.lang.String r9 = "workspaceCheckpoint"
            r8.put(r9, r10)
            java.lang.String r9 = "autoOpen"
            boolean r10 = r4.f3454f
            r8.put(r9, r10)
            long r9 = r4.f3455g
            r8.put(r5, r9)
            long r9 = r4.f3456h
            r8.put(r6, r9)
            goto L129
        L127:
            java.lang.Object r8 = org.json.JSONObject.NULL
        L129:
            java.lang.String r4 = "resumeState"
            r1.put(r4, r8)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.List r6 = r0.f3487e
            java.util.Iterator r6 = r6.iterator()
        L139:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L2f1
            java.lang.Object r8 = r6.next()
            fb.c r8 = (fb.c) r8
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = r8.f3431a
            java.lang.String r11 = "role"
            r9.put(r11, r10)
            java.lang.String r10 = r8.f3432b
            java.lang.String r12 = "content"
            r9.put(r12, r10)
            java.lang.String r10 = r8.f3433c
            r9.put(r3, r10)
            java.lang.String r10 = r8.f3434d
            r9.put(r7, r10)
            java.lang.String r10 = "parentMessageId"
            java.lang.String r13 = r8.f3435e
            r9.put(r10, r13)
            java.lang.String r10 = "phase"
            java.lang.String r13 = r8.f3436f
            r9.put(r10, r13)
            java.lang.String r10 = r8.f3437g
            java.lang.String r13 = "progress"
            r9.put(r13, r10)
            java.lang.String r10 = "reasoning"
            java.lang.String r14 = r8.f3438h
            r9.put(r10, r14)
            java.lang.String r10 = r8.f3439i
            java.lang.String r14 = "diff"
            r9.put(r14, r10)
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
            java.util.List r15 = r8.f3440j
            java.util.Iterator r15 = r15.iterator()
        L190:
            boolean r16 = r15.hasNext()
            r17 = r6
            java.lang.String r6 = "status"
            r18 = r15
            java.lang.String r15 = "name"
            if (r16 == 0) goto L23d
            java.lang.Object r16 = r18.next()
            r0 = r16
            fb.q1 r0 = (fb.q1) r0
            r16 = r1
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r19 = r4
            java.lang.String r4 = r0.f3721a
            r1.put(r3, r4)
            java.lang.String r4 = "kind"
            r20 = r3
            java.lang.String r3 = r0.f3722b
            r1.put(r4, r3)
            java.lang.String r3 = r0.f3723c
            r1.put(r15, r3)
            java.lang.String r3 = "arguments"
            java.lang.String r4 = r0.f3724d
            r1.put(r3, r4)
            java.lang.String r3 = "result"
            java.lang.String r4 = r0.f3725e
            r1.put(r3, r4)
            java.lang.String r3 = r0.f3726f
            r1.put(r14, r3)
            java.lang.String r3 = r0.f3727g
            r1.put(r6, r3)
            long r3 = r0.f3728h
            r1.put(r5, r3)
            java.lang.String r3 = "finishedAt"
            r21 = r5
            long r4 = r0.f3729i
            r1.put(r3, r4)
            java.lang.String r3 = r0.f3730j
            r1.put(r13, r3)
            java.lang.String r3 = r0.f3731k
            r1.put(r7, r3)
            java.lang.String r3 = "toolCallId"
            java.lang.String r4 = r0.f3732l
            r1.put(r3, r4)
            java.lang.String r3 = "protocolName"
            java.lang.String r4 = r0.f3733m
            r1.put(r3, r4)
            java.lang.String r3 = "providerMetadata"
            java.lang.String r4 = r0.f3734n
            r1.put(r3, r4)
            java.lang.String r3 = "parentAssistantMessageId"
            java.lang.String r4 = r0.f3735o
            r1.put(r3, r4)
            java.lang.String r3 = "resultHandle"
            java.lang.String r4 = r0.f3736p
            r1.put(r3, r4)
            java.lang.String r3 = "resultLength"
            int r4 = r0.f3737q
            r1.put(r3, r4)
            java.lang.String r3 = "truncated"
            boolean r4 = r0.f3738r
            r1.put(r3, r4)
            java.lang.String r3 = "nextOffset"
            int r0 = r0.f3739s
            r1.put(r3, r0)
            r10.put(r1)
            r0 = r22
            r1 = r16
            r6 = r17
            r15 = r18
            r4 = r19
            r3 = r20
            r5 = r21
            goto L190
        L23d:
            r16 = r1
            r20 = r3
            r19 = r4
            r21 = r5
            java.lang.String r0 = "toolEvents"
            r9.put(r0, r10)
            java.lang.String r0 = r8.f3444n
            r9.put(r6, r0)
            fb.y r0 = r8.f3445o
            if (r0 == 0) goto L258
            org.json.JSONObject r0 = g(r0)
            goto L25a
        L258:
            java.lang.Object r0 = org.json.JSONObject.NULL
        L25a:
            java.lang.String r1 = "draftSnapshot"
            r9.put(r1, r0)
            java.lang.String r0 = "clearsDraft"
            boolean r1 = r8.f3446p
            r9.put(r0, r1)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.List r1 = r8.f3441k
            java.util.Iterator r1 = r1.iterator()
        L271:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a7
            java.lang.Object r3 = r1.next()
            fb.a r3 = (fb.a) r3
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = r3.f3386a
            r4.put(r15, r5)
            java.lang.String r5 = "path"
            java.lang.String r6 = r3.f3387b
            r4.put(r5, r6)
            java.lang.String r5 = "mimeType"
            java.lang.String r6 = r3.f3388c
            r4.put(r5, r6)
            java.lang.String r5 = "size"
            long r13 = r3.f3389d
            r4.put(r5, r13)
            java.lang.String r5 = "sourceUri"
            java.lang.String r3 = r3.f3390e
            r4.put(r5, r3)
            r0.put(r4)
            goto L271
        L2a7:
            java.lang.String r1 = "attachments"
            r9.put(r1, r0)
            fb.a1 r0 = r8.f3442l
            if (r0 == 0) goto L2c5
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = r0.f3394a
            r1.put(r11, r3)
            java.lang.String r3 = r0.f3395b
            r1.put(r12, r3)
            long r3 = r0.f3396c
            r1.put(r2, r3)
            goto L2c7
        L2c5:
            java.lang.Object r1 = org.json.JSONObject.NULL
        L2c7:
            java.lang.String r0 = "quotedMessage"
            r9.put(r0, r1)
            long r0 = r8.f3443m
            r9.put(r2, r0)
            java.lang.String r0 = "streamId"
            java.lang.String r1 = r8.f3447q
            r9.put(r0, r1)
            java.lang.String r0 = "completedAt"
            long r3 = r8.f3448r
            r9.put(r0, r3)
            r0 = r19
            r0.put(r9)
            r4 = r0
            r1 = r16
            r6 = r17
            r3 = r20
            r5 = r21
            r0 = r22
            goto L139
        L2f1:
            r16 = r1
            r0 = r4
            java.lang.String r1 = "messages"
            r2 = r16
            r2.put(r1, r0)
            r0 = r22
            fb.y r0 = r0.f3488f
            if (r0 == 0) goto L306
            org.json.JSONObject r0 = g(r0)
            goto L308
        L306:
            java.lang.Object r0 = org.json.JSONObject.NULL
        L308:
            java.lang.String r1 = "draft"
            r2.put(r1, r0)
            return r2
    }

    public static org.json.JSONObject g(fb.y r3) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "pluginName"
            java.lang.String r2 = r3.f3852a
            r0.put(r1, r2)
            java.lang.String r1 = "pluginId"
            java.lang.String r2 = r3.f3853b
            r0.put(r1, r2)
            java.lang.String r1 = "infoProp"
            java.lang.String r2 = r3.f3854c
            r0.put(r1, r2)
            java.lang.String r1 = "mainJava"
            java.lang.String r2 = r3.f3855d
            r0.put(r1, r2)
            java.lang.String r1 = "summary"
            java.lang.String r3 = r3.f3856e
            r0.put(r1, r3)
            return r0
    }

    public static boolean h(java.util.List r4) {
            r4.getClass()
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lb
            goto L3c
        Lb:
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            fb.c r0 = (fb.c) r0
            java.lang.String r2 = r0.f3431a
            java.lang.String r3 = "user"
            boolean r2 = gg.l.a(r2, r3)
            r3 = 1
            if (r2 == 0) goto L38
            java.lang.String r2 = r0.f3432b
            boolean r2 = og.m.t0(r2)
            if (r2 == 0) goto L36
            java.util.List r0 = r0.f3441k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L38
        L36:
            r0 = r3
            goto L39
        L38:
            r0 = r1
        L39:
            if (r0 == 0) goto Lf
            return r3
        L3c:
            return r1
    }

    public static java.util.List i(android.content.Context r3) {
            java.io.File r3 = p(r3)
            boolean r0 = r3.isDirectory()
            if (r0 != 0) goto Lb
            goto L56
        Lb:
            java.io.File[] r3 = r3.listFiles()
            if (r3 == 0) goto L56
            ng.j r3 = tf.l.k0(r3)
            fb.g0 r0 = new fb.g0
            r1 = 15
            r0.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r3, r2, r0)
            fb.g0 r3 = new fb.g0
            r0 = 16
            r3.<init>(r0)
            ng.i r3 = ng.m.X(r1, r3)
            fb.g0 r0 = new fb.g0
            r1 = 11
            r0.<init>(r1)
            ng.i r1 = new ng.i
            r1.<init>(r3, r2, r0)
            java.util.List r3 = ng.m.b0(r1)
            fb.r r0 = new fb.r
            r1 = 7
            r0.<init>(r1)
            c9.a0 r1 = new c9.a0
            r2 = 12
            r1.<init>(r0, r2)
            c9.a0 r0 = new c9.a0
            r2 = 13
            r0.<init>(r1, r2)
            java.util.List r3 = tf.m.K1(r3, r0)
            return r3
        L56:
            tf.t r3 = tf.t.f13167g
            return r3
    }

    public static java.io.File j(android.content.Context r4, java.lang.String r5) {
            boolean r0 = og.m.t0(r5)
            r1 = 0
            if (r0 == 0) goto L8
            goto L64
        L8:
            java.io.File r4 = a(r4)     // Catch: java.lang.Throwable -> L11
            java.io.File r4 = r4.getCanonicalFile()     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L18:
            boolean r0 = r4 instanceof sf.f
            if (r0 == 0) goto L1e
            r4 = r1
        L1e:
            java.io.File r4 = (java.io.File) r4
            if (r4 == 0) goto L64
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2c
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            java.io.File r5 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r5 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r5)
            r5 = r0
        L33:
            boolean r0 = r5 instanceof sf.f
            if (r0 == 0) goto L39
            r5 = r1
        L39:
            java.io.File r5 = (java.io.File) r5
            if (r5 == 0) goto L64
            java.lang.String r4 = r4.getPath()
            r4.getClass()
            r0 = 1
            char[] r0 = new char[r0]
            char r2 = java.io.File.separatorChar
            r3 = 0
            r0[r3] = r2
            java.lang.String r4 = og.m.U0(r4, r0)
            java.lang.String r0 = java.io.File.separator
            java.lang.String r4 = bc.e.i(r4, r0)
            java.lang.String r0 = r5.getPath()
            r0.getClass()
            boolean r4 = og.t.d0(r0, r4, r3)
            if (r4 == 0) goto L64
            r1 = r5
        L64:
            return r1
    }

    public static java.lang.Object k(android.content.Context r12, java.util.ArrayList r13) {
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L1b9
            r0.<init>()     // Catch: java.lang.Throwable -> L1b9
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1b9
            r1.<init>()     // Catch: java.lang.Throwable -> L1b9
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L1b9
        Le:
            boolean r2 = r13.hasNext()     // Catch: java.lang.Throwable -> L1b9
            if (r2 == 0) goto L27
            java.lang.Object r2 = r13.next()     // Catch: java.lang.Throwable -> L1b9
            r3 = r2
            fb.a r3 = (fb.a) r3     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r3 = r3.f3387b     // Catch: java.lang.Throwable -> L1b9
            boolean r3 = r0.add(r3)     // Catch: java.lang.Throwable -> L1b9
            if (r3 == 0) goto Le
            r1.add(r2)     // Catch: java.lang.Throwable -> L1b9
            goto Le
        L27:
            java.util.Iterator r13 = r1.iterator()     // Catch: java.lang.Throwable -> L1b9
        L2b:
            boolean r0 = r13.hasNext()     // Catch: java.lang.Throwable -> L1b9
            if (r0 == 0) goto L1b6
            java.lang.Object r0 = r13.next()     // Catch: java.lang.Throwable -> L1b9
            fb.a r0 = (fb.a) r0     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r1 = r0.f3387b     // Catch: java.lang.Throwable -> L1b9
            java.io.File r1 = j(r12, r1)     // Catch: java.lang.Throwable -> L1b9
            if (r1 == 0) goto L19d
            boolean r2 = r1.isFile()     // Catch: java.lang.Throwable -> L1b9
            r3 = 0
            if (r2 == 0) goto L50
            long r5 = r1.length()     // Catch: java.lang.Throwable -> L1b9
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L50
            goto L2b
        L50:
            java.util.concurrent.ConcurrentHashMap r2 = fb.g1.f3524b     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r5 = r1.getPath()     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L1b9
            if (r6 != 0) goto L69
            java.lang.Object r6 = new java.lang.Object     // Catch: java.lang.Throwable -> L1b9
            r6.<init>()     // Catch: java.lang.Throwable -> L1b9
            java.lang.Object r2 = r2.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L1b9
            if (r2 != 0) goto L68
            goto L69
        L68:
            r6 = r2
        L69:
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L1b9
            boolean r2 = r1.isFile()     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L7d
            long r7 = r1.length()     // Catch: java.lang.Throwable -> L7a
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L7d
            goto L12b
        L7a:
            r12 = move-exception
            goto L19b
        L7d:
            java.lang.String r2 = r0.f3390e     // Catch: java.lang.Throwable -> L7a
            boolean r5 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L7a
            if (r5 != 0) goto L86
            goto L87
        L86:
            r2 = 0
        L87:
            if (r2 == 0) goto L182
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L182
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L7a
            java.io.File r7 = r1.getParentFile()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r8 = r1.getName()     // Catch: java.lang.Throwable -> L7a
            java.util.UUID r9 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r10.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r11 = "."
            r10.append(r11)     // Catch: java.lang.Throwable -> L7a
            r10.append(r8)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r8 = "."
            r10.append(r8)     // Catch: java.lang.Throwable -> L7a
            r10.append(r9)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r8 = ".tmp"
            r10.append(r8)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L7a
            r5.<init>(r7, r8)     // Catch: java.lang.Throwable -> L7a
            java.io.File r7 = r1.getParentFile()     // Catch: java.lang.Throwable -> Lc8
            if (r7 == 0) goto Lcb
            r7.mkdirs()     // Catch: java.lang.Throwable -> Lc8
            goto Lcb
        Lc8:
            r12 = move-exception
            goto L14d
        Lcb:
            android.content.ContentResolver r7 = r12.getContentResolver()     // Catch: java.lang.Throwable -> Lc8
            java.io.InputStream r2 = r7.openInputStream(r2)     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto L145
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L136
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L136
            g4.a.j(r2, r7)     // Catch: java.lang.Throwable -> L138
            r7.close()     // Catch: java.lang.Throwable -> L136
            r2.close()     // Catch: java.lang.Throwable -> Lc8
            boolean r2 = r5.isFile()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto L12e
            long r7 = r5.length()     // Catch: java.lang.Throwable -> Lc8
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L12e
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto L106
            boolean r2 = r1.delete()     // Catch: java.lang.Throwable -> Lc8
            if (r2 == 0) goto Lfe
            goto L106
        Lfe:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r13 = "无法替换附件副本"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lc8
            throw r12     // Catch: java.lang.Throwable -> Lc8
        L106:
            boolean r2 = r5.renameTo(r1)     // Catch: java.lang.Throwable -> Lc8
            if (r2 != 0) goto L112
            dg.l.a0(r5, r1)     // Catch: java.lang.Throwable -> Lc8
            r5.delete()     // Catch: java.lang.Throwable -> Lc8
        L112:
            long r7 = r0.f3389d     // Catch: java.lang.Throwable -> Lc8
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L12b
            long r2 = r1.length()     // Catch: java.lang.Throwable -> Lc8
            long r7 = r0.f3389d     // Catch: java.lang.Throwable -> Lc8
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L123
            goto L12b
        L123:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r13 = "附件大小已变化"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lc8
            throw r12     // Catch: java.lang.Throwable -> Lc8
        L12b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1b9
            goto L2b
        L12e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r13 = "附件内容为空"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lc8
            throw r12     // Catch: java.lang.Throwable -> Lc8
        L136:
            r12 = move-exception
            goto L13f
        L138:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> L13a
        L13a:
            r13 = move-exception
            ig.a.i(r7, r12)     // Catch: java.lang.Throwable -> L136
            throw r13     // Catch: java.lang.Throwable -> L136
        L13f:
            throw r12     // Catch: java.lang.Throwable -> L140
        L140:
            r13 = move-exception
            ig.a.i(r2, r12)     // Catch: java.lang.Throwable -> Lc8
            throw r13     // Catch: java.lang.Throwable -> Lc8
        L145:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r13 = "无法重新读取附件"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> Lc8
            throw r12     // Catch: java.lang.Throwable -> Lc8
        L14d:
            r5.delete()     // Catch: java.lang.Throwable -> L7a
            r1.delete()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = r0.f3386a     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r1.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "[Hchat:ScriptAgent] 恢复附件失败: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            r1.append(r13)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            fb.v0.n(r13, r12)     // Catch: java.lang.Throwable -> L7a
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.f3386a     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r1.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = "无法恢复附件: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7a
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L7a
            r13.<init>(r0, r12)     // Catch: java.lang.Throwable -> L7a
            throw r13     // Catch: java.lang.Throwable -> L7a
        L182:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = r0.f3386a     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "附件副本不存在且无法重新读取: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L7a
            r0.append(r13)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L7a
            throw r12     // Catch: java.lang.Throwable -> L7a
        L19b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1b9
            throw r12     // Catch: java.lang.Throwable -> L1b9
        L19d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r13 = r0.f3386a     // Catch: java.lang.Throwable -> L1b9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b9
            r0.<init>()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r1 = "附件路径无效: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1b9
            r0.append(r13)     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L1b9
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L1b9
            throw r12     // Catch: java.lang.Throwable -> L1b9
        L1b6:
            sf.n r12 = sf.n.f12433a     // Catch: java.lang.Throwable -> L1b9
            return r12
        L1b9:
            r12 = move-exception
            sf.f r13 = new sf.f
            r13.<init>(r12)
            return r13
    }

    public static void l(android.content.Context r8, java.util.ArrayList r9) {
            java.lang.Object r0 = fb.g1.f3526d
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L44
            r1.<init>()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L44
        Lc:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L50
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L44
            r3 = r2
            fb.a r3 = (fb.a) r3     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.f3387b     // Catch: java.lang.Throwable -> L44
            java.io.File r3 = j(r8, r3)     // Catch: java.lang.Throwable -> L44
            r4 = 0
            if (r3 == 0) goto L4a
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L4a
            java.util.HashMap r5 = fb.g1.f3525c     // Catch: java.lang.Throwable -> L44
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r7 = r5.getOrDefault(r3, r7)     // Catch: java.lang.Throwable -> L44
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L44
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L44
            int r7 = r7 - r6
            if (r7 <= 0) goto L46
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L44
            r5.put(r3, r6)     // Catch: java.lang.Throwable -> L44
            goto L4a
        L44:
            r8 = move-exception
            goto L79
        L46:
            r5.remove(r3)     // Catch: java.lang.Throwable -> L44
            r4 = r6
        L4a:
            if (r4 == 0) goto Lc
            r1.add(r2)     // Catch: java.lang.Throwable -> L44
            goto Lc
        L50:
            b(r8, r1)     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r9 = r1.iterator()     // Catch: java.lang.Throwable -> L44
        L57:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L77
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L44
            fb.a r1 = (fb.a) r1     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r1.f3387b     // Catch: java.lang.Throwable -> L44
            java.io.File r1 = j(r8, r1)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L57
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L57
            java.util.concurrent.ConcurrentHashMap r2 = fb.g1.f3524b     // Catch: java.lang.Throwable -> L44
            r2.remove(r1)     // Catch: java.lang.Throwable -> L44
            goto L57
        L77:
            monitor-exit(r0)
            return
        L79:
            monitor-exit(r0)
            throw r8
    }

    public static java.lang.String m(java.lang.String r1) {
            java.lang.String r0 = "[^A-Za-z0-9_-]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r1.getClass()
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = "_"
            java.lang.String r1 = r1.replaceAll(r0)
            r1.getClass()
            r0 = 80
            java.lang.String r1 = og.m.P0(r0, r1)
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L27
            java.lang.String r1 = "session"
        L27:
            return r1
    }

    public static void n(android.content.Context r12, fb.d1 r13) {
            java.lang.String r0 = "."
            java.lang.String r1 = ".json"
            r12.getClass()
            r13.getClass()
            java.util.List r2 = r13.f3487e
            boolean r2 = h(r2)
            java.lang.String r3 = r13.f3483a
            if (r2 != 0) goto L2b
            r3.getClass()
            e(r12, r3)
            java.io.File r13 = new java.io.File
            java.io.File r12 = a(r12)
            java.lang.String r0 = m(r3)
            r13.<init>(r12, r0)
            dg.l.b0(r13)
            return
        L2b:
            java.lang.String r2 = m(r3)
            java.util.concurrent.ConcurrentHashMap r3 = fb.g1.f3527e
            fb.g0 r4 = new fb.g0
            r5 = 12
            r4.<init>(r5)
            bc.j r5 = new bc.j
            r6 = 7
            r5.<init>(r4, r6)
            java.lang.Object r3 = r3.computeIfAbsent(r2, r5)
            r3.getClass()
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = fb.g1.f3530h     // Catch: java.lang.Throwable -> L5e
            boolean r4 = r4.contains(r2)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L50
            monitor-exit(r3)
            return
        L50:
            java.io.File r12 = p(r12)     // Catch: java.lang.Throwable -> L5e
            boolean r4 = r12.isDirectory()     // Catch: java.lang.Throwable -> L5e
            if (r4 != 0) goto L61
            r12.mkdirs()     // Catch: java.lang.Throwable -> L5e
            goto L61
        L5e:
            r12 = move-exception
            goto L127
        L61:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L5e
            r4.<init>(r12, r1)     // Catch: java.lang.Throwable -> L5e
            r1 = 0
            boolean r2 = r4.isFile()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L7f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7d
            java.nio.charset.Charset r5 = og.a.f9804a     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = dg.l.h0(r4, r5)     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L7d
            goto L87
        L7d:
            r2 = move-exception
            goto L81
        L7f:
            r2 = r1
            goto L87
        L81:
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L5e
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            r2 = r5
        L87:
            boolean r5 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L8d
            goto L8e
        L8d:
            r1 = r2
        L8e:
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L5e
            r5 = 0
            if (r1 == 0) goto L9b
            java.lang.String r2 = "checkpointSeq"
            long r7 = r1.optLong(r2, r5)     // Catch: java.lang.Throwable -> L5e
            goto L9c
        L9b:
            r7 = r5
        L9c:
            if (r1 == 0) goto La5
            java.lang.String r2 = "updatedAt"
            long r1 = r1.optLong(r2, r5)     // Catch: java.lang.Throwable -> L5e
            goto La6
        La5:
            r1 = r5
        La6:
            long r9 = r13.f3498p     // Catch: java.lang.Throwable -> L5e
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L125
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto Lbb
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto Lbb
            long r5 = r13.f3486d     // Catch: java.lang.Throwable -> L5e
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lbb
            goto L125
        Lbb:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5e
            r5.append(r2)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = ".tmp"
            r5.append(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r12, r0)     // Catch: java.lang.Throwable -> L5e
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5e
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            org.json.JSONObject r13 = f(r13)     // Catch: java.lang.Throwable -> L11e
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L11e
            r13.getClass()     // Catch: java.lang.Throwable -> L11e
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L11e
            r0.getClass()     // Catch: java.lang.Throwable -> L11e
            byte[] r13 = r13.getBytes(r0)     // Catch: java.lang.Throwable -> L11e
            r13.getClass()     // Catch: java.lang.Throwable -> L11e
            r12.write(r13)     // Catch: java.lang.Throwable -> L11e
            java.io.FileDescriptor r13 = r12.getFD()     // Catch: java.lang.Throwable -> L11e
            r13.sync()     // Catch: java.lang.Throwable -> L11e
            r12.close()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r12 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r13 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L10a
            android.system.Os.rename(r12, r13)     // Catch: java.lang.Throwable -> L10a
            goto L111
        L10a:
            r12 = move-exception
            boolean r13 = r1.renameTo(r4)     // Catch: java.lang.Throwable -> L5e
            if (r13 == 0) goto L113
        L111:
            monitor-exit(r3)
            return
        L113:
            r1.delete()     // Catch: java.lang.Throwable -> L5e
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "保存 Agent 会话失败"
            r13.<init>(r0, r12)     // Catch: java.lang.Throwable -> L5e
            throw r13     // Catch: java.lang.Throwable -> L5e
        L11e:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> L120
        L120:
            r0 = move-exception
            ig.a.i(r12, r13)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L125:
            monitor-exit(r3)
            return
        L127:
            monitor-exit(r3)
            throw r12
    }

    public static void o(android.content.Context r2, fb.d1 r3) {
            r2.getClass()
            r3.getClass()
            java.util.List r0 = r3.f3487e
            boolean r0 = h(r0)
            if (r0 != 0) goto Lf
            goto L2e
        Lf:
            java.lang.String r0 = r3.f3483a
            java.lang.String r0 = m(r0)
            android.content.Context r1 = r2.getApplicationContext()
            if (r1 == 0) goto L1c
            r2 = r1
        L1c:
            sf.e r1 = new sf.e
            r1.<init>(r2, r3)
            java.util.concurrent.ConcurrentHashMap r2 = fb.g1.f3528f
            r2.put(r0, r1)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = fb.g1.f3529g
            boolean r2 = r2.add(r0)
            if (r2 != 0) goto L2f
        L2e:
            return
        L2f:
            fb.e1 r2 = new fb.e1
            r2.<init>(r0)
            java.util.concurrent.ExecutorService r3 = fb.g1.f3531i
            r3.execute(r2)
            return
    }

    public static java.io.File p(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            h.Hchat.hooks.items.script.ScriptPluginRuntime r1 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.io.File r2 = r1.scriptDir(r2)
            java.io.File r2 = r2.getParentFile()
            java.lang.String r1 = "Agent/sessions"
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.String q(fb.g1 r3, java.util.List r4) {
            r4.getClass()
            java.util.Iterator r3 = r4.iterator()
        L7:
            boolean r4 = r3.hasNext()
            r0 = 0
            if (r4 == 0) goto L20
            java.lang.Object r4 = r3.next()
            r1 = r4
            fb.c r1 = (fb.c) r1
            java.lang.String r1 = r1.f3431a
            java.lang.String r2 = "user"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L7
            goto L21
        L20:
            r4 = r0
        L21:
            fb.c r4 = (fb.c) r4
            if (r4 == 0) goto L27
            java.lang.String r0 = r4.f3432b
        L27:
            if (r0 != 0) goto L2b
            java.lang.String r0 = ""
        L2b:
            java.lang.String r3 = "\\s+"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            java.lang.String r4 = " "
            java.util.regex.Matcher r3 = r3.matcher(r0)
            java.lang.String r3 = r3.replaceAll(r4)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            r4 = 32
            java.lang.String r3 = og.m.P0(r4, r3)
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L57
            java.lang.String r3 = "新对话"
        L57:
            return r3
    }

    public final fb.d1 c(java.lang.String r72) {
            r71 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r1 = r72
            r0.<init>(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r1 = "messages"
            org.json.JSONArray r1 = r0.optJSONArray(r1)
            if (r1 == 0) goto L15
            goto L1a
        L15:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L1a:
            int r2 = r1.length()
            r4 = 0
        L1f:
            java.lang.String r5 = "-"
            java.lang.String r6 = "startedAt"
            java.lang.String r7 = "createdAt"
            java.lang.String r9 = "id"
            java.lang.String r10 = "turnId"
            java.lang.String r15 = ""
            if (r4 < r2) goto L1c6
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "updatedAt"
            long r1 = r0.optLong(r4, r1)
            java.lang.String r14 = "resumeState"
            org.json.JSONObject r14 = r0.optJSONObject(r14)
            if (r14 == 0) goto L122
            java.lang.String r17 = r14.optString(r10, r15)
            java.lang.String r10 = "sourceUserMessageId"
            java.lang.String r18 = r14.optString(r10, r15)
            r17.getClass()
            boolean r10 = og.m.t0(r17)
            if (r10 != 0) goto L11d
            r18.getClass()
            boolean r10 = og.m.t0(r18)
            if (r10 == 0) goto L5d
            goto L11d
        L5d:
            java.lang.String r10 = "taskGoal"
            java.lang.String r10 = r14.optString(r10, r15)
            java.lang.String r13 = "workContext"
            java.lang.String r20 = j8.b.i(r10, r13, r15, r14)
            java.lang.String r13 = "workspaceCheckpoint"
            org.json.JSONObject r13 = r14.optJSONObject(r13)
            if (r13 == 0) goto L102
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.lang.String r12 = "basePathStates"
            org.json.JSONObject r12 = r13.optJSONObject(r12)
            if (r12 == 0) goto Lab
            java.util.Iterator r19 = r12.keys()
            r19.getClass()
            ng.j r19 = ng.m.R(r19)
            ng.a r19 = (ng.a) r19
            java.util.Iterator r19 = r19.iterator()
        L8f:
            boolean r21 = r19.hasNext()
            if (r21 == 0) goto Lab
            java.lang.Object r21 = r19.next()
            r3 = r21
            java.lang.String r3 = (java.lang.String) r3
            r37 = r10
            java.lang.String r10 = "missing"
            java.lang.String r10 = r12.optString(r3, r10)
            r11.put(r3, r10)
            r10 = r37
            goto L8f
        Lab:
            r37 = r10
            fb.j2 r21 = new fb.j2
            java.lang.String r3 = "stagingPath"
            java.lang.String r3 = r13.optString(r3, r15)
            java.lang.String r10 = "pluginId"
            java.lang.String r23 = j8.b.i(r3, r10, r15, r13)
            java.lang.String r10 = "existed"
            r12 = 0
            boolean r24 = r13.optBoolean(r10, r12)
            java.lang.String r10 = "baseFingerprint"
            java.lang.String r10 = r13.optString(r10, r15)
            java.lang.String r12 = "stageFingerprint"
            java.lang.String r26 = j8.b.i(r10, r12, r15, r13)
            java.lang.String r12 = "initialPluginName"
            java.lang.String r28 = r13.optString(r12, r15)
            r28.getClass()
            java.lang.String r12 = "revision"
            r22 = r3
            r3 = 0
            int r29 = r13.optInt(r12, r3)
            java.lang.String r12 = "checkedRevision"
            r3 = -1
            int r30 = r13.optInt(r12, r3)
            java.lang.String r12 = "shownRevision"
            int r31 = r13.optInt(r12, r3)
            java.lang.String r3 = "deletePlugin"
            r12 = 0
            boolean r32 = r13.optBoolean(r3, r12)
            r25 = r10
            r27 = r11
            r10 = 0
            long r33 = r13.optLong(r4, r10)
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L106
        L102:
            r37 = r10
            r21 = 0
        L106:
            java.lang.String r3 = "autoOpen"
            r11 = 1
            boolean r22 = r14.optBoolean(r3, r11)
            long r23 = r14.optLong(r6, r1)
            long r25 = r14.optLong(r4, r1)
            fb.c1 r16 = new fb.c1
            r19 = r37
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)
            goto L11f
        L11d:
            r16 = 0
        L11f:
            r19 = r16
            goto L124
        L122:
            r19 = 0
        L124:
            java.lang.String r3 = r0.optString(r9)
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L13e
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r3.getClass()
            r12 = 0
            java.lang.String r3 = og.t.a0(r3, r5, r15, r12)
        L13e:
            java.lang.String r4 = "title"
            r5 = r71
            java.lang.String r6 = q(r5, r8)
            java.lang.String r4 = r0.optString(r4, r6)
            r4.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            long r6 = r0.optLong(r7, r9)
            java.lang.String r9 = "draft"
            org.json.JSONObject r9 = r0.optJSONObject(r9)
            if (r9 == 0) goto L163
            fb.y r14 = d(r9)
            r9 = r14
            goto L164
        L163:
            r9 = 0
        L164:
            java.lang.String r10 = "targetPluginId"
            java.lang.String r10 = r0.optString(r10, r15)
            java.lang.String r11 = "conversationSummary"
            java.lang.String r11 = j8.b.i(r10, r11, r15, r0)
            java.lang.String r12 = "nativeToolHistory"
            java.lang.String r12 = r0.optString(r12, r15)
            java.lang.String r13 = "protocolTranscript"
            java.lang.String r13 = j8.b.i(r12, r13, r15, r0)
            java.lang.String r14 = "compactedMessageCount"
            r15 = 0
            int r14 = r0.optInt(r14, r15)
            r16 = r3
            int r3 = r8.size()
            int r14 = r9.e0.r(r14, r15, r3)
            java.lang.String r3 = "pinned"
            boolean r3 = r0.optBoolean(r3, r15)
            r72 = r3
            java.lang.String r3 = "locked"
            boolean r3 = r0.optBoolean(r3, r15)
            java.lang.String r15 = "sortOrder"
            long r17 = r0.optLong(r15, r1)
            java.lang.String r15 = "checkpointSeq"
            r20 = r1
            r1 = 0
            long r22 = r0.optLong(r15, r1)
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1b2
            r35 = 0
            goto L1b4
        L1b2:
            r35 = r22
        L1b4:
            fb.d1 r1 = new fb.d1
            r15 = r72
            r2 = r16
            r16 = r3
            r3 = r4
            r4 = r6
            r6 = r20
            r20 = r35
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20)
            return r1
        L1c6:
            r11 = 1
            org.json.JSONObject r3 = r1.optJSONObject(r4)
            if (r3 == 0) goto L484
            java.util.ArrayList r48 = new java.util.ArrayList
            r48.<init>()
            java.util.ArrayList r47 = new java.util.ArrayList
            r47.<init>()
            java.lang.String r12 = "toolEvents"
            org.json.JSONArray r12 = r3.optJSONArray(r12)
            if (r12 == 0) goto L1e0
            goto L1e5
        L1e0:
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
        L1e5:
            int r13 = r12.length()
            r14 = 0
        L1ea:
            java.lang.String r11 = "name"
            r17 = r0
            java.lang.String r0 = "diff"
            r18 = r1
            java.lang.String r1 = "status"
            r19 = r2
            java.lang.String r2 = "progress"
            r20 = r6
            java.lang.String r6 = "interrupted"
            if (r14 < r13) goto L394
            java.lang.String r5 = "attachments"
            org.json.JSONArray r5 = r3.optJSONArray(r5)
            if (r5 == 0) goto L207
            goto L20c
        L207:
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
        L20c:
            int r12 = r5.length()
            r13 = 0
        L211:
            if (r13 < r12) goto L334
            java.lang.String r5 = "complete"
            java.lang.String r1 = r3.optString(r1, r5)
            java.lang.String r5 = r3.optString(r2, r15)
            r5.getClass()
            og.d r11 = new og.d
            r11.<init>(r5)
            boolean r5 = r11.hasNext()
            if (r5 != 0) goto L22d
            r5 = 0
            goto L23c
        L22d:
            java.lang.Object r5 = r11.next()
        L231:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L23c
            java.lang.Object r5 = r11.next()
            goto L231
        L23c:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L241
            r5 = r15
        L241:
            java.lang.String r11 = "等待确认"
            r12 = 0
            boolean r11 = og.m.h0(r5, r11, r12)
            if (r11 != 0) goto L26d
            java.lang.String r11 = "正在提交插件"
            boolean r11 = og.t.d0(r5, r11, r12)
            if (r11 != 0) goto L26d
            java.lang.String r11 = "正在创建插件"
            boolean r11 = og.t.d0(r5, r11, r12)
            if (r11 != 0) goto L26d
            java.lang.String r11 = "正在写入插件"
            boolean r11 = og.t.d0(r5, r11, r12)
            if (r11 != 0) goto L26d
            java.lang.String r11 = "正在删除插件"
            boolean r5 = og.t.d0(r5, r11, r12)
            if (r5 == 0) goto L26b
            goto L26d
        L26b:
            r13 = 0
            goto L26e
        L26d:
            r13 = 1
        L26e:
            java.lang.String r5 = "streaming"
            boolean r5 = og.t.X(r1, r5)
            if (r5 == 0) goto L279
        L276:
            r52 = r6
            goto L27e
        L279:
            if (r13 == 0) goto L27c
            goto L276
        L27c:
            r52 = r1
        L27e:
            java.lang.String r1 = "role"
            java.lang.String r5 = "user"
            java.lang.String r6 = r3.optString(r1, r5)
            java.lang.String r11 = "content"
            java.lang.String r39 = j8.b.i(r6, r11, r15, r3)
            java.lang.String r9 = r3.optString(r9, r15)
            boolean r12 = og.m.t0(r9)
            if (r12 == 0) goto L29e
            java.util.UUID r9 = java.util.UUID.randomUUID()
            java.lang.String r9 = r9.toString()
        L29e:
            java.lang.String r41 = j8.b.i(r9, r10, r15, r3)
            java.lang.String r10 = "parentMessageId"
            java.lang.String r42 = r3.optString(r10, r15)
            r42.getClass()
            java.lang.String r10 = "phase"
            java.lang.String r12 = r3.optString(r1, r5)
            java.lang.String r43 = r3.optString(r10, r12)
            r43.getClass()
            java.lang.String r2 = r3.optString(r2, r15)
            java.lang.String r10 = "reasoning"
            java.lang.String r45 = j8.b.i(r2, r10, r15, r3)
            java.lang.String r46 = r3.optString(r0, r15)
            r46.getClass()
            java.lang.String r0 = "quotedMessage"
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            if (r0 == 0) goto L2e7
            fb.a1 r10 = new fb.a1
            java.lang.String r1 = r0.optString(r1, r5)
            java.lang.String r5 = j8.b.i(r1, r11, r15, r0)
            r11 = 0
            long r13 = r0.optLong(r7, r11)
            r10.<init>(r13, r1, r5)
            r49 = r10
            goto L2e9
        L2e7:
            r49 = 0
        L2e9:
            long r0 = java.lang.System.currentTimeMillis()
            long r50 = r3.optLong(r7, r0)
            r52.getClass()
            java.lang.String r0 = "draftSnapshot"
            org.json.JSONObject r0 = r3.optJSONObject(r0)
            if (r0 == 0) goto L303
            fb.y r14 = d(r0)
            r53 = r14
            goto L305
        L303:
            r53 = 0
        L305:
            java.lang.String r0 = "clearsDraft"
            r12 = 0
            boolean r54 = r3.optBoolean(r0, r12)
            java.lang.String r0 = "streamId"
            java.lang.String r55 = r3.optString(r0, r15)
            r55.getClass()
            java.lang.String r0 = "completedAt"
            r10 = 0
            long r56 = r3.optLong(r0, r10)
            fb.c r37 = new fb.c
            r44 = r2
            r38 = r6
            r40 = r9
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r53, r54, r55, r56)
            r0 = r37
            r8.add(r0)
        L32d:
            r23 = r4
            r30 = r8
            r8 = 0
            goto L48c
        L334:
            r21 = r3
            r22 = r7
            r3 = r47
            r14 = r48
            org.json.JSONObject r7 = r5.optJSONObject(r13)
            if (r7 == 0) goto L37c
            fb.a r23 = new fb.a
            r20 = r5
            java.lang.String r5 = r7.optString(r11, r15)
            r30 = r8
            java.lang.String r8 = "path"
            java.lang.String r25 = j8.b.i(r5, r8, r15, r7)
            java.lang.String r8 = "mimeType"
            r24 = r5
            java.lang.String r5 = "application/octet-stream"
            java.lang.String r26 = r7.optString(r8, r5)
            r26.getClass()
            java.lang.String r5 = "size"
            r8 = r12
            r31 = r13
            r12 = 0
            long r28 = r7.optLong(r5, r12)
            java.lang.String r5 = "sourceUri"
            java.lang.String r27 = r7.optString(r5, r15)
            r27.getClass()
            r23.<init>(r24, r25, r26, r27, r28)
            r5 = r23
            r14.add(r5)
            goto L383
        L37c:
            r20 = r5
            r30 = r8
            r8 = r12
            r31 = r13
        L383:
            int r13 = r31 + 1
            r47 = r3
            r12 = r8
            r48 = r14
            r5 = r20
            r3 = r21
            r7 = r22
            r8 = r30
            goto L211
        L394:
            r21 = r3
            r22 = r7
            r30 = r8
            r3 = r47
            org.json.JSONObject r7 = r12.optJSONObject(r14)
            if (r7 == 0) goto L461
            java.lang.String r8 = "success"
            java.lang.String r1 = r7.optString(r1, r8)
            java.lang.String r8 = "running"
            boolean r8 = og.t.X(r1, r8)
            if (r8 != 0) goto L3b8
            java.lang.String r8 = "queued"
            boolean r8 = og.t.X(r1, r8)
            if (r8 == 0) goto L3b9
        L3b8:
            r1 = 0
        L3b9:
            if (r1 == 0) goto L3bc
            goto L3bd
        L3bc:
            r1 = r6
        L3bd:
            fb.q1 r49 = new fb.q1
            java.lang.String r8 = "legacy-"
            java.lang.String r8 = p.a.j(r4, r8, r5, r14)
            java.lang.String r8 = r7.optString(r9, r8)
            r23 = r4
            java.lang.String r4 = "kind"
            r24 = r5
            java.lang.String r5 = "tool"
            java.lang.String r51 = j8.b.i(r8, r4, r5, r7)
            java.lang.String r4 = "工具调用"
            java.lang.String r4 = r7.optString(r11, r4)
            java.lang.String r5 = "arguments"
            java.lang.String r53 = j8.b.i(r4, r5, r15, r7)
            java.lang.String r5 = "result"
            java.lang.String r11 = r7.optString(r5, r15)
            java.lang.String r55 = j8.b.i(r11, r0, r15, r7)
            r50 = r8
            r0 = r20
            r20 = r9
            r8 = 0
            long r57 = r7.optLong(r0, r8)
            r25 = r0
            java.lang.String r0 = "finishedAt"
            long r59 = r7.optLong(r0, r8)
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L408
            java.lang.String r0 = "任务意外中断"
            goto L40c
        L408:
            java.lang.String r0 = r7.optString(r2, r15)
        L40c:
            java.lang.String r62 = j8.b.i(r0, r10, r15, r7)
            java.lang.String r2 = "toolCallId"
            java.lang.String r2 = r7.optString(r2, r15)
            java.lang.String r6 = "protocolName"
            java.lang.String r64 = j8.b.i(r2, r6, r15, r7)
            java.lang.String r6 = "providerMetadata"
            java.lang.String r6 = r7.optString(r6, r15)
            java.lang.String r8 = "parentAssistantMessageId"
            java.lang.String r66 = j8.b.i(r6, r8, r15, r7)
            java.lang.String r8 = "resultHandle"
            java.lang.String r67 = r7.optString(r8, r15)
            r67.getClass()
            java.lang.String r5 = r7.optString(r5, r15)
            int r5 = r5.length()
            java.lang.String r8 = "resultLength"
            int r68 = r7.optInt(r8, r5)
            java.lang.String r5 = "truncated"
            r8 = 0
            boolean r69 = r7.optBoolean(r5, r8)
            java.lang.String r5 = "nextOffset"
            int r70 = r7.optInt(r5, r8)
            r61 = r0
            r56 = r1
            r63 = r2
            r52 = r4
            r65 = r6
            r54 = r11
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r59, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
            r0 = r49
            r3.add(r0)
            goto L46a
        L461:
            r23 = r4
            r24 = r5
            r25 = r20
            r8 = 0
            r20 = r9
        L46a:
            int r14 = r14 + 1
            r47 = r3
            r0 = r17
            r1 = r18
            r2 = r19
            r9 = r20
            r3 = r21
            r7 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r8 = r30
            goto L1ea
        L484:
            r17 = r0
            r18 = r1
            r19 = r2
            goto L32d
        L48c:
            int r4 = r23 + 1
            r0 = r17
            r1 = r18
            r2 = r19
            r8 = r30
            goto L1f
    }
}
