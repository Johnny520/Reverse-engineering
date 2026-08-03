package a;

/* JADX INFO: renamed from: a.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0437w3 implements a.InterfaceC0369s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f747a;

    public /* synthetic */ C0437w3(int r1) {
            r0 = this;
            r0.f747a = r1
            r0.<init>()
            return
    }

    @Override // a.InterfaceC0369s7
    public final java.lang.Object a() {
            r28 = this;
            r0 = r28
            int r1 = r0.f747a
            switch(r1) {
                case 0: goto L21f;
                case 1: goto L218;
                case 2: goto L211;
                case 3: goto L1fd;
                case 4: goto L1e9;
                case 5: goto L1e6;
                case 6: goto L1e3;
                case 7: goto L1e0;
                case 8: goto L1dd;
                case 9: goto L1da;
                case 10: goto L185;
                case 11: goto L182;
                case 12: goto L17f;
                case 13: goto L17c;
                case 14: goto L179;
                case 15: goto L176;
                case 16: goto L121;
                case 17: goto L11e;
                case 18: goto L11b;
                case 19: goto Lc6;
                case 20: goto L71;
                case 21: goto L6e;
                case 22: goto L6b;
                case 23: goto L59;
                case 24: goto L1c;
                default: goto L7;
            }
        L7:
            java.lang.String r6 = "schedule_message"
            java.lang.String r7 = "@placeholder_foldgroup"
            java.lang.String r2 = "message_fold"
            java.lang.String r3 = "helper_entry"
            java.lang.String r4 = "conversationboxservice"
            java.lang.String r5 = "notification_messages"
            java.lang.String[] r1 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            java.util.Set r1 = a.C0282n9.z(r1)
            return r1
        L1c:
            java.lang.String r26 = "facebookapp"
            java.lang.String r27 = "qqsync"
            java.lang.String r2 = "filehelper"
            java.lang.String r3 = "weixin"
            java.lang.String r4 = "qmessage"
            java.lang.String r5 = "qqmail"
            java.lang.String r6 = "newsapp"
            java.lang.String r7 = "fmessage"
            java.lang.String r8 = "tmessage"
            java.lang.String r9 = "medianote"
            java.lang.String r10 = "floatbottle"
            java.lang.String r11 = "lbsapp"
            java.lang.String r12 = "masssendapp"
            java.lang.String r13 = "blogapp"
            java.lang.String r14 = "shakeapp"
            java.lang.String r15 = "officialaccounts"
            java.lang.String r16 = "service_officialaccounts"
            java.lang.String r17 = "notifymessage"
            java.lang.String r18 = "notification_messages"
            java.lang.String r19 = "schedule_message"
            java.lang.String r20 = "message_fold"
            java.lang.String r21 = "helper_entry"
            java.lang.String r22 = "conversationboxservice"
            java.lang.String r23 = "appbrand_notify_message"
            java.lang.String r24 = "appbrandcustomerservicemsg"
            java.lang.String r25 = "opencustomerservicemsg"
            java.lang.String[] r1 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27}
            java.util.Set r1 = a.C0282n9.z(r1)
            return r1
        L59:
            java.lang.String r1 = "sns_recycler_adapter_v1"
            org.json.JSONObject r1 = a.C0043a5.d(r1)
            if (r1 == 0) goto L68
            java.lang.String r2 = "classNames"
            java.util.List r1 = a.C0043a5.g(r2, r1)
            goto L6a
        L68:
            a.Y5 r1 = a.Y5.f351a
        L6a:
            return r1
        L6b:
            java.lang.Class<?> r1 = a.Ed.h
            return r1
        L6e:
            java.lang.Class<?> r1 = a.Ed.g
            return r1
        L71:
            java.lang.Object r1 = a.C0043a5.f384a
            r2 = 0
            if (r1 == 0) goto L87
            java.lang.String r3 = "sns_timeline_v1"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L81
            goto L87
        L81:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L87
            r3.<init>(r1)     // Catch: java.lang.Exception -> L87
            r2 = r3
        L87:
            a.Y5 r1 = a.Y5.f351a
            if (r2 == 0) goto Lc5
            java.lang.String r3 = "classNames"
            org.json.JSONArray r2 = r2.optJSONArray(r3)
            if (r2 != 0) goto L94
            goto Lc5
        L94:
            r1 = 0
            int r3 = r2.length()
            a.f9 r1 = a.Oc.D(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = a.C0312p3.g0(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        Lac:
            r4 = r1
            a.e9 r4 = (a.C0121e9) r4
            boolean r4 = r4.c
            if (r4 == 0) goto Lc4
            r4 = r1
            a.c9 r4 = (a.AbstractC0085c9) r4
            int r4 = r4.a()
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)
            r3.add(r4)
            goto Lac
        Lc4:
            r1 = r3
        Lc5:
            return r1
        Lc6:
            java.lang.Object r1 = a.C0043a5.f384a
            r2 = 0
            if (r1 == 0) goto Ldc
            java.lang.String r3 = "sns_msg_relevance_v1"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Ld6
            goto Ldc
        Ld6:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ldc
            r3.<init>(r1)     // Catch: java.lang.Exception -> Ldc
            r2 = r3
        Ldc:
            a.Y5 r1 = a.Y5.f351a
            if (r2 == 0) goto L11a
            java.lang.String r3 = "classNames"
            org.json.JSONArray r2 = r2.optJSONArray(r3)
            if (r2 != 0) goto Le9
            goto L11a
        Le9:
            r1 = 0
            int r3 = r2.length()
            a.f9 r1 = a.Oc.D(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = a.C0312p3.g0(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L101:
            r4 = r1
            a.e9 r4 = (a.C0121e9) r4
            boolean r4 = r4.c
            if (r4 == 0) goto L119
            r4 = r1
            a.c9 r4 = (a.AbstractC0085c9) r4
            int r4 = r4.a()
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)
            r3.add(r4)
            goto L101
        L119:
            r1 = r3
        L11a:
            return r1
        L11b:
            java.lang.Class<?> r1 = a.Ed.e
            return r1
        L11e:
            java.lang.Class<?> r1 = a.Ed.f
            return r1
        L121:
            java.lang.Object r1 = a.C0043a5.f384a
            r2 = 0
            if (r1 == 0) goto L137
            java.lang.String r3 = "sns_msg_adapter_v1"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L131
            goto L137
        L131:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L137
            r3.<init>(r1)     // Catch: java.lang.Exception -> L137
            r2 = r3
        L137:
            a.Y5 r1 = a.Y5.f351a
            if (r2 == 0) goto L175
            java.lang.String r3 = "classNames"
            org.json.JSONArray r2 = r2.optJSONArray(r3)
            if (r2 != 0) goto L144
            goto L175
        L144:
            r1 = 0
            int r3 = r2.length()
            a.f9 r1 = a.Oc.D(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = a.C0312p3.g0(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L15c:
            r4 = r1
            a.e9 r4 = (a.C0121e9) r4
            boolean r4 = r4.c
            if (r4 == 0) goto L174
            r4 = r1
            a.c9 r4 = (a.AbstractC0085c9) r4
            int r4 = r4.a()
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)
            r3.add(r4)
            goto L15c
        L174:
            r1 = r3
        L175:
            return r1
        L176:
            java.lang.Class<?> r1 = a.Ed.d
            return r1
        L179:
            java.lang.Class<?> r1 = a.Ed.c
            return r1
        L17c:
            java.lang.Class<?> r1 = a.Ed.l
            return r1
        L17f:
            java.lang.Class<?> r1 = a.Ed.o
            return r1
        L182:
            java.lang.Class<?> r1 = a.Ed.n
            return r1
        L185:
            java.lang.Object r1 = a.C0043a5.f384a
            r2 = 0
            if (r1 == 0) goto L19b
            java.lang.String r3 = "sns_timeline_adapter_v1"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L195
            goto L19b
        L195:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L19b
            r3.<init>(r1)     // Catch: java.lang.Exception -> L19b
            r2 = r3
        L19b:
            a.Y5 r1 = a.Y5.f351a
            if (r2 == 0) goto L1d9
            java.lang.String r3 = "classNames"
            org.json.JSONArray r2 = r2.optJSONArray(r3)
            if (r2 != 0) goto L1a8
            goto L1d9
        L1a8:
            r1 = 0
            int r3 = r2.length()
            a.f9 r1 = a.Oc.D(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = a.C0312p3.g0(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1c0:
            r4 = r1
            a.e9 r4 = (a.C0121e9) r4
            boolean r4 = r4.c
            if (r4 == 0) goto L1d8
            r4 = r1
            a.c9 r4 = (a.AbstractC0085c9) r4
            int r4 = r4.a()
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)
            r3.add(r4)
            goto L1c0
        L1d8:
            r1 = r3
        L1d9:
            return r1
        L1da:
            java.lang.Class<?> r1 = a.Ed.m
            return r1
        L1dd:
            java.lang.Class<?> r1 = a.Ed.k
            return r1
        L1e0:
            java.lang.Class<?> r1 = a.Ed.j
            return r1
        L1e3:
            java.lang.Class<?> r1 = a.Ed.b
            return r1
        L1e6:
            java.lang.Class<?> r1 = a.Ed.i
            return r1
        L1e9:
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r2 = "NativeHideAsync"
            r1.<init>(r2)
            r1.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r1 = r1.getLooper()
            r2.<init>(r1)
            return r2
        L1fd:
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r2 = "MaskMuteThread"
            r1.<init>(r2)
            r1.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r1 = r1.getLooper()
            r2.<init>(r1)
            return r2
        L211:
            java.lang.String r1 = "fc_options"
            android.content.SharedPreferences r1 = a.C0282n9.s(r1)
            return r1
        L218:
            java.lang.String r1 = "fc_config"
            android.content.SharedPreferences r1 = a.C0282n9.s(r1)
            return r1
        L21f:
            a.Wc r1 = new a.Wc
            java.lang.String r2 = "^SELECT (FTS5MetaContact|FTS5MetaTopHits|FTS5MetaKefuContact|FTS5MetaFeature|FTS5MetaWeApp|FTS5MetaFinderFollow|FTS5MetaFavorite)\\.docid, type, subtype, entity_id, aux_index,.*"
            r1.<init>(r2)
            return r1
    }
}
