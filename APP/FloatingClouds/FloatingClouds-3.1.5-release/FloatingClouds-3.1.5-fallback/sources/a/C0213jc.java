package a;

/* JADX INFO: renamed from: a.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0213jc {
    public boolean A;
    public boolean B;
    public java.lang.String C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public java.lang.String P;
    public java.lang.String Q;
    public boolean R;
    public java.lang.String S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f532a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    public boolean z;

    /* JADX INFO: renamed from: a.jc$a */
    public static final class a {
        public static a.C0213jc a(java.lang.String r51) {
                r0 = r51
                java.lang.String r1 = "jsonText"
                a.C0193i9.e(r0, r1)
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld
                r1.<init>(r0)     // Catch: java.lang.Exception -> Ld
                goto L12
            Ld:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
            L12:
                a.jc r0 = new a.jc
                java.lang.String r2 = "hideMainSearch"
                r3 = 1
                boolean r2 = r1.optBoolean(r2, r3)
                java.lang.String r4 = "hideMainSearchStrong"
                r5 = 0
                boolean r4 = r1.optBoolean(r4, r5)
                java.lang.String r6 = "viewWxDbPw"
                boolean r6 = r1.optBoolean(r6, r3)
                java.lang.String r7 = "hideStorageChatRecordEntry"
                boolean r7 = r1.optBoolean(r7, r3)
                java.lang.String r8 = "hideStorageCache"
                boolean r8 = r1.optBoolean(r8, r3)
                java.lang.String r9 = "hideSnsEntry"
                boolean r9 = r1.optBoolean(r9, r3)
                java.lang.String r10 = "hideDiscoverSnsEntry"
                boolean r10 = r1.optBoolean(r10, r3)
                java.lang.String r11 = "hideDiscoverEntries"
                boolean r11 = r1.optBoolean(r11, r3)
                java.lang.String r12 = "hideRecentForward"
                boolean r12 = r1.optBoolean(r12, r3)
                java.lang.String r13 = "hideOwnSns"
                boolean r13 = r1.optBoolean(r13, r3)
                java.lang.String r14 = "showOwnSnsHideDialog"
                boolean r14 = r1.optBoolean(r14, r3)
                java.lang.String r15 = "hideSnsInteraction"
                boolean r15 = r1.optBoolean(r15, r3)
                java.lang.String r5 = "hideSnsGroupIcon"
                boolean r5 = r1.optBoolean(r5, r3)
                r16 = r5
                java.lang.String r5 = "hideMainConvList"
                boolean r5 = r1.optBoolean(r5, r3)
                r17 = r5
                java.lang.String r5 = "hideContactList"
                boolean r5 = r1.optBoolean(r5, r3)
                r18 = r5
                java.lang.String r5 = "hideInLabel"
                boolean r5 = r1.optBoolean(r5, r3)
                r19 = r5
                java.lang.String r5 = "hideConversation"
                boolean r5 = r1.optBoolean(r5, r3)
                r20 = r5
                java.lang.String r5 = "hideMaskedMessageNotification"
                boolean r5 = r1.optBoolean(r5, r3)
                r21 = r5
                java.lang.String r5 = "blockEnterChat"
                boolean r5 = r1.optBoolean(r5, r3)
                r22 = r5
                java.lang.String r5 = "blockContactInfo"
                boolean r5 = r1.optBoolean(r5, r3)
                r23 = r5
                java.lang.String r5 = "enableMultiClickTempUnhide"
                boolean r5 = r1.optBoolean(r5, r3)
                java.lang.String r3 = "multiClickCount"
                r25 = r5
                r5 = 3
                int r3 = r1.optInt(r3, r5)
                java.lang.String r5 = "multiClickInterval"
                r26 = r3
                r3 = 500(0x1f4, float:7.0E-43)
                int r3 = r1.optInt(r5, r3)
                java.lang.String r5 = "enableLongPressTempUnhide"
                r27 = r3
                r3 = 1
                boolean r5 = r1.optBoolean(r5, r3)
                java.lang.String r3 = "longPressDuration"
                r28 = r5
                r5 = 800(0x320, float:1.121E-42)
                int r3 = r1.optInt(r3, r5)
                java.lang.String r5 = "blockScanLogin"
                r29 = r3
                r3 = 1
                boolean r5 = r1.optBoolean(r5, r3)
                r30 = r5
                java.lang.String r5 = "enableLongPressAddMask"
                boolean r5 = r1.optBoolean(r5, r3)
                r31 = r5
                java.lang.String r5 = "enableContactLongPressAddMask"
                boolean r5 = r1.optBoolean(r5, r3)
                java.lang.String r3 = "addMaskMenuText"
                r32 = r5
                java.lang.String r5 = "加入密友"
                java.lang.String r3 = r1.optString(r3, r5)
                java.lang.String r5 = "optString(...)"
                a.C0193i9.d(r3, r5)
                r33 = r3
                java.lang.String r3 = "blockVoipCall"
                r34 = r15
                r15 = 1
                boolean r3 = r1.optBoolean(r3, r15)
                r35 = r3
                java.lang.String r3 = "hideTextStatus"
                boolean r3 = r1.optBoolean(r3, r15)
                java.lang.String r15 = "boldBottomTabOnMaskedMsg"
                r36 = r3
                r3 = 0
                boolean r15 = r1.optBoolean(r15, r3)
                java.lang.String r3 = "boldBottomTabPercent"
                r37 = r15
                r15 = 50
                int r3 = r1.optInt(r3, r15)
                java.lang.String r15 = "dotIndicatorEnabled"
                r38 = r3
                r3 = 0
                boolean r15 = r1.optBoolean(r15, r3)
                java.lang.String r3 = "dotIndicatorSizePercent"
                r39 = r15
                r15 = 100
                int r3 = r1.optInt(r3, r15)
                java.lang.String r15 = "vibrateOnMaskedMessage"
                r40 = r3
                r3 = 1
                boolean r15 = r1.optBoolean(r15, r3)
                java.lang.String r3 = "vibrateIntensity"
                r41 = r15
                r15 = 60
                int r3 = r1.optInt(r3, r15)
                java.lang.String r15 = "masterEnabled"
                r42 = r3
                r3 = 1
                boolean r15 = r1.optBoolean(r15, r3)
                r24 = r15
                java.lang.String r15 = "blockHotUpdate"
                boolean r15 = r1.optBoolean(r15, r3)
                r43 = r15
                java.lang.String r15 = "rehideOnLeaveChat"
                boolean r15 = r1.optBoolean(r15, r3)
                r44 = r15
                java.lang.String r15 = "rehideOnLeaveApp"
                boolean r3 = r1.optBoolean(r15, r3)
                java.lang.String r15 = "cmdOpenSettings"
                r45 = r3
                java.lang.String r3 = "#jz#"
                java.lang.String r3 = r1.optString(r15, r3)
                a.C0193i9.d(r3, r5)
                java.lang.String r15 = "cmdTempUnhide"
                r46 = r3
                java.lang.String r3 = "#mm#"
                java.lang.String r3 = r1.optString(r15, r3)
                a.C0193i9.d(r3, r5)
                java.lang.String r15 = "actionHintEnabled"
                r47 = r3
                r3 = 0
                boolean r3 = r1.optBoolean(r15, r3)
                java.lang.String r15 = "hintTempUnhide"
                r51 = r3
                java.lang.String r3 = "刻舟求剑"
                java.lang.String r15 = r1.optString(r15, r3)
                a.C0193i9.d(r15, r5)
                r48 = r15
                java.lang.String r15 = "hintAddMask"
                java.lang.String r15 = r1.optString(r15, r3)
                a.C0193i9.d(r15, r5)
                r49 = r15
                java.lang.String r15 = "hintRemoveMask"
                java.lang.String r15 = r1.optString(r15, r3)
                a.C0193i9.d(r15, r5)
                r50 = r15
                java.lang.String r15 = "hintAddSns"
                java.lang.String r1 = r1.optString(r15, r3)
                a.C0193i9.d(r1, r5)
                r0.<init>()
                r0.f532a = r2
                r0.b = r4
                r0.c = r6
                r0.d = r7
                r0.e = r8
                r0.f = r9
                r0.g = r10
                r0.h = r11
                r0.i = r12
                r0.j = r13
                r0.k = r14
                r2 = r34
                r0.l = r2
                r2 = r16
                r0.m = r2
                r2 = r17
                r0.n = r2
                r2 = r18
                r0.o = r2
                r2 = r19
                r0.p = r2
                r2 = r20
                r0.q = r2
                r2 = r21
                r0.r = r2
                r2 = r22
                r0.s = r2
                r2 = r23
                r0.t = r2
                r2 = r25
                r0.u = r2
                r2 = r26
                r0.v = r2
                r2 = r27
                r0.w = r2
                r2 = r28
                r0.x = r2
                r2 = r29
                r0.y = r2
                r2 = r30
                r0.z = r2
                r2 = r31
                r0.A = r2
                r2 = r32
                r0.B = r2
                r2 = r33
                r0.C = r2
                r2 = r35
                r0.D = r2
                r2 = r36
                r0.E = r2
                r2 = r37
                r0.F = r2
                r2 = r38
                r0.G = r2
                r2 = r39
                r0.H = r2
                r2 = r40
                r0.I = r2
                r2 = r41
                r0.J = r2
                r2 = r42
                r0.K = r2
                r2 = r24
                r0.L = r2
                r2 = r43
                r0.M = r2
                r2 = r44
                r0.N = r2
                r2 = r45
                r0.O = r2
                r2 = r46
                r0.P = r2
                r2 = r47
                r0.Q = r2
                r2 = r51
                r0.R = r2
                r2 = r48
                r0.S = r2
                r2 = r49
                r0.T = r2
                r2 = r50
                r0.U = r2
                r0.V = r1
                return r0
        }

        public static java.lang.String b(a.C0213jc r3) {
                java.lang.String r0 = "data"
                a.C0193i9.e(r3, r0)
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
                boolean r1 = r3.f532a
                java.lang.String r2 = "hideMainSearch"
                r0.put(r2, r1)
                java.lang.String r1 = "hideMainSearchStrong"
                boolean r2 = r3.b
                r0.put(r1, r2)
                boolean r1 = r3.c
                java.lang.String r2 = "viewWxDbPw"
                r0.put(r2, r1)
                boolean r1 = r3.d
                java.lang.String r2 = "hideStorageChatRecordEntry"
                r0.put(r2, r1)
                boolean r1 = r3.e
                java.lang.String r2 = "hideStorageCache"
                r0.put(r2, r1)
                boolean r1 = r3.f
                java.lang.String r2 = "hideSnsEntry"
                r0.put(r2, r1)
                boolean r1 = r3.g
                java.lang.String r2 = "hideDiscoverSnsEntry"
                r0.put(r2, r1)
                boolean r1 = r3.h
                java.lang.String r2 = "hideDiscoverEntries"
                r0.put(r2, r1)
                boolean r1 = r3.i
                java.lang.String r2 = "hideRecentForward"
                r0.put(r2, r1)
                boolean r1 = r3.j
                java.lang.String r2 = "hideOwnSns"
                r0.put(r2, r1)
                boolean r1 = r3.k
                java.lang.String r2 = "showOwnSnsHideDialog"
                r0.put(r2, r1)
                boolean r1 = r3.l
                java.lang.String r2 = "hideSnsInteraction"
                r0.put(r2, r1)
                boolean r1 = r3.m
                java.lang.String r2 = "hideSnsGroupIcon"
                r0.put(r2, r1)
                boolean r1 = r3.n
                java.lang.String r2 = "hideMainConvList"
                r0.put(r2, r1)
                boolean r1 = r3.o
                java.lang.String r2 = "hideContactList"
                r0.put(r2, r1)
                boolean r1 = r3.p
                java.lang.String r2 = "hideInLabel"
                r0.put(r2, r1)
                boolean r1 = r3.q
                java.lang.String r2 = "hideConversation"
                r0.put(r2, r1)
                boolean r1 = r3.r
                java.lang.String r2 = "hideMaskedMessageNotification"
                r0.put(r2, r1)
                boolean r1 = r3.s
                java.lang.String r2 = "blockEnterChat"
                r0.put(r2, r1)
                boolean r1 = r3.t
                java.lang.String r2 = "blockContactInfo"
                r0.put(r2, r1)
                boolean r1 = r3.u
                java.lang.String r2 = "enableMultiClickTempUnhide"
                r0.put(r2, r1)
                int r1 = r3.v
                java.lang.String r2 = "multiClickCount"
                r0.put(r2, r1)
                int r1 = r3.w
                java.lang.String r2 = "multiClickInterval"
                r0.put(r2, r1)
                boolean r1 = r3.x
                java.lang.String r2 = "enableLongPressTempUnhide"
                r0.put(r2, r1)
                int r1 = r3.y
                java.lang.String r2 = "longPressDuration"
                r0.put(r2, r1)
                boolean r1 = r3.z
                java.lang.String r2 = "blockScanLogin"
                r0.put(r2, r1)
                boolean r1 = r3.A
                java.lang.String r2 = "enableLongPressAddMask"
                r0.put(r2, r1)
                boolean r1 = r3.B
                java.lang.String r2 = "enableContactLongPressAddMask"
                r0.put(r2, r1)
                java.lang.String r1 = r3.C
                java.lang.String r2 = "addMaskMenuText"
                r0.put(r2, r1)
                boolean r1 = r3.D
                java.lang.String r2 = "blockVoipCall"
                r0.put(r2, r1)
                boolean r1 = r3.E
                java.lang.String r2 = "hideTextStatus"
                r0.put(r2, r1)
                boolean r1 = r3.F
                java.lang.String r2 = "boldBottomTabOnMaskedMsg"
                r0.put(r2, r1)
                int r1 = r3.G
                java.lang.String r2 = "boldBottomTabPercent"
                r0.put(r2, r1)
                boolean r1 = r3.H
                java.lang.String r2 = "dotIndicatorEnabled"
                r0.put(r2, r1)
                int r1 = r3.I
                java.lang.String r2 = "dotIndicatorSizePercent"
                r0.put(r2, r1)
                boolean r1 = r3.J
                java.lang.String r2 = "vibrateOnMaskedMessage"
                r0.put(r2, r1)
                int r1 = r3.K
                java.lang.String r2 = "vibrateIntensity"
                r0.put(r2, r1)
                boolean r1 = r3.L
                java.lang.String r2 = "masterEnabled"
                r0.put(r2, r1)
                boolean r1 = r3.M
                java.lang.String r2 = "blockHotUpdate"
                r0.put(r2, r1)
                boolean r1 = r3.N
                java.lang.String r2 = "rehideOnLeaveChat"
                r0.put(r2, r1)
                boolean r1 = r3.O
                java.lang.String r2 = "rehideOnLeaveApp"
                r0.put(r2, r1)
                java.lang.String r1 = r3.P
                java.lang.String r2 = "cmdOpenSettings"
                r0.put(r2, r1)
                java.lang.String r1 = r3.Q
                java.lang.String r2 = "cmdTempUnhide"
                r0.put(r2, r1)
                boolean r1 = r3.R
                java.lang.String r2 = "actionHintEnabled"
                r0.put(r2, r1)
                java.lang.String r1 = r3.S
                java.lang.String r2 = "hintTempUnhide"
                r0.put(r2, r1)
                java.lang.String r1 = r3.T
                java.lang.String r2 = "hintAddMask"
                r0.put(r2, r1)
                java.lang.String r1 = r3.U
                java.lang.String r2 = "hintRemoveMask"
                r0.put(r2, r1)
                java.lang.String r3 = r3.V
                java.lang.String r1 = "hintAddSns"
                r0.put(r1, r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "toString(...)"
                a.C0193i9.d(r3, r0)
                return r3
        }
    }
}
