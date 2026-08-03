package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19664j;

    public /* synthetic */ vb(android.content.SharedPreferences r1, java.lang.String r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f19661g = r4
            r0.f19662h = r1
            r0.f19663i = r2
            r0.f19664j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f19661g
            switch(r0) {
                case 0: goto L10c;
                case 1: goto Lf0;
                case 2: goto Ldb;
                case 3: goto Lbf;
                case 4: goto L85;
                case 5: goto L95;
                case 6: goto L85;
                case 7: goto L85;
                case 8: goto L85;
                case 9: goto L6b;
                case 10: goto L51;
                case 11: goto L39;
                case 12: goto L21;
                default: goto L5;
            }
        L5:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r2, r5, r0)
            java.lang.String r2 = "group_member_reply_media_order"
            java.lang.String r1 = wb.ho.N5(r2, r1)
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
        L1e:
            sf.n r5 = sf.n.f12433a
            return r5
        L21:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r2, r5, r0)
            java.lang.String r1 = wb.ho.P5(r1)
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L1e
        L39:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r2, r5, r0)
            java.lang.String r1 = wb.ho.L5(r1)
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L1e
        L51:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r2, r5, r0)
            java.lang.String r2 = "group_member_reply_both_order"
            java.lang.String r1 = wb.ho.N5(r2, r1)
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L1e
        L6b:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r2, r5, r0)
            java.lang.String r2 = "group_member_reply_prompt_type"
            java.lang.String r1 = wb.ho.N5(r2, r1)
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L1e
        L85:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            wb.en.m(r2, r5, r0, r1, r3)
            goto L1e
        L95:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r2.setValue(r5)
            android.content.SharedPreferences$Editor r5 = r0.edit()
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r3)
            r5.commit()
            ia.a0 r5 = ac.p.f216b
            if (r5 == 0) goto Lbc
            ia.x r0 = new ia.x
            r1 = 1
            r0.<init>(r5, r1)
            r5.r(r0)
        Lbc:
            sf.n r5 = sf.n.f12433a
            return r5
        Lbf:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r2.setValue(r5)
            android.content.SharedPreferences$Editor r5 = r0.edit()
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r3)
            r5.commit()
            goto L1e
        Ldb:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.String r5 = (java.lang.String) r5
            android.content.SharedPreferences$Editor r0 = wb.en.b(r5, r2, r5, r0)
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.apply()
            goto L1e
        Lf0:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r2.setValue(r5)
            android.content.SharedPreferences$Editor r5 = r0.edit()
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r3)
            r5.commit()
            goto L1e
        L10c:
            android.content.SharedPreferences r0 = r4.f19662h
            java.lang.String r1 = r4.f19663i
            i0.a1 r2 = r4.f19664j
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r3 = r5.booleanValue()
            r2.setValue(r5)
            android.content.SharedPreferences$Editor r5 = r0.edit()
            android.content.SharedPreferences$Editor r5 = r5.putBoolean(r1, r3)
            r5.commit()
            goto L1e
    }
}
