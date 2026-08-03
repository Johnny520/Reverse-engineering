package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f18056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18057i;

    public /* synthetic */ od(android.content.SharedPreferences r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f18055g = r3
            r0.f18056h = r1
            r0.f18057i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r5 = this;
            int r0 = r5.f18055g
            switch(r0) {
                case 0: goto Lc0;
                case 1: goto La3;
                case 2: goto L8e;
                case 3: goto L77;
                case 4: goto L63;
                case 5: goto L4c;
                case 6: goto L3f;
                case 7: goto L2b;
                case 8: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = "agent_history_gesture_hint"
            r2 = 0
            i0.a1 r3 = r5.f18057i
            android.content.SharedPreferences r4 = r5.f18056h
            wb.en.m(r3, r0, r4, r1, r2)
        L11:
            sf.n r0 = sf.n.f12433a
            return r0
        L14:
            android.content.SharedPreferences r0 = r5.f18056h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "comment_logs"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            java.lang.String r0 = ""
            i0.a1 r1 = r5.f18057i
            r1.setValue(r0)
            goto L11
        L2b:
            android.content.SharedPreferences r0 = r5.f18056h
            java.lang.String r1 = "comment_logs"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L38
            goto L39
        L38:
            r2 = r0
        L39:
            i0.a1 r0 = r5.f18057i
            r0.setValue(r2)
            goto L11
        L3f:
            android.content.SharedPreferences r0 = r5.f18056h
            tf.t r1 = tf.t.f13167g
            wb.ho.R6(r0, r1)
            i0.a1 r0 = r5.f18057i
            r0.setValue(r1)
            goto L11
        L4c:
            android.content.SharedPreferences r0 = r5.f18056h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "logs"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            java.lang.String r0 = ""
            i0.a1 r1 = r5.f18057i
            r1.setValue(r0)
            goto L11
        L63:
            android.content.SharedPreferences r0 = r5.f18056h
            java.lang.String r1 = "logs"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L70
            goto L71
        L70:
            r2 = r0
        L71:
            i0.a1 r0 = r5.f18057i
            r0.setValue(r2)
            goto L11
        L77:
            android.content.SharedPreferences r0 = r5.f18056h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "logs"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            java.lang.String r0 = ""
            i0.a1 r1 = r5.f18057i
            r1.setValue(r0)
            goto L11
        L8e:
            android.content.SharedPreferences r0 = r5.f18056h
            java.lang.String r1 = "logs"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L9b
            goto L9c
        L9b:
            r2 = r0
        L9c:
            i0.a1 r0 = r5.f18057i
            r0.setValue(r2)
            goto L11
        La3:
            android.content.SharedPreferences r0 = r5.f18056h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            i0.a1 r1 = r5.f18057i
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.String r2 = "text_voice_speech_rate"
            android.content.SharedPreferences$Editor r0 = r0.putFloat(r2, r1)
            r0.apply()
            goto L11
        Lc0:
            android.content.SharedPreferences r0 = r5.f18056h
            android.content.SharedPreferences$Editor r0 = r0.edit()
            i0.a1 r1 = r5.f18057i
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r9.e0.q(r1, r2, r3)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = ig.a.X(r1)
            float r1 = (float) r1
            float r1 = r1 / r2
            java.lang.String r2 = "round_avatar_radius_factor"
            android.content.SharedPreferences$Editor r0 = r0.putFloat(r2, r1)
            r0.apply()
            goto L11
    }
}
