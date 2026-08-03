package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3743g;

    public /* synthetic */ r(int r1) {
            r0 = this;
            r0.f3743g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            int r0 = r6.f3743g
            switch(r0) {
                case 0: goto L288;
                case 1: goto L27b;
                case 2: goto L25e;
                case 3: goto L249;
                case 4: goto L234;
                case 5: goto L21f;
                case 6: goto L212;
                case 7: goto L1fd;
                case 8: goto L1e4;
                case 9: goto L180;
                case 10: goto L11c;
                case 11: goto L10b;
                case 12: goto Lf2;
                case 13: goto Ld9;
                case 14: goto L69;
                default: goto L5;
            }
        L5:
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            r1 = r0
            r2 = r1
        La:
            int r3 = r8.length()
            r4 = 47
            r5 = 1
            if (r1 >= r3) goto L32
            char r3 = r8.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r3 = r3.charValue()
            if (r3 != r4) goto L22
            goto L23
        L22:
            r5 = r0
        L23:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2f
            int r2 = r2 + 1
        L2f:
            int r1 = r1 + 1
            goto La
        L32:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.String r7 = (java.lang.String) r7
            r1 = r0
            r2 = r1
        L3a:
            int r3 = r7.length()
            if (r1 >= r3) goto L60
            char r3 = r7.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r3 = r3.charValue()
            if (r3 != r4) goto L50
            r3 = r5
            goto L51
        L50:
            r3 = r0
        L51:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L5d
            int r2 = r2 + 1
        L5d:
            int r1 = r1 + 1
            goto L3a
        L60:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            int r7 = r8.compareTo(r7)
            return r7
        L69:
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0 = 0
            r1 = r0
            r2 = r1
        L74:
            int r3 = r7.length()
            r4 = 47
            r5 = 1
            if (r1 >= r3) goto L9c
            char r3 = r7.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r3 = r3.charValue()
            if (r3 != r4) goto L8c
            goto L8d
        L8c:
            r5 = r0
        L8d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L99
            int r2 = r2 + 1
        L99:
            int r1 = r1 + 1
            goto L74
        L9c:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getKey()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r1 = r0
            r2 = r1
        Laa:
            int r3 = r8.length()
            if (r1 >= r3) goto Ld0
            char r3 = r8.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r3 = r3.charValue()
            if (r3 != r4) goto Lc0
            r3 = r5
            goto Lc1
        Lc0:
            r3 = r0
        Lc1:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lcd
            int r2 = r2 + 1
        Lcd:
            int r1 = r1 + 1
            goto Laa
        Ld0:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            int r7 = r7.compareTo(r8)
            return r7
        Ld9:
            java.io.File r8 = (java.io.File) r8
            long r0 = r8.lastModified()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.io.File r7 = (java.io.File) r7
            long r0 = r7.lastModified()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            int r7 = r8.compareTo(r7)
            return r7
        Lf2:
            java.io.File r8 = (java.io.File) r8
            long r0 = r8.lastModified()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.io.File r7 = (java.io.File) r7
            long r0 = r7.lastModified()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            int r7 = r8.compareTo(r7)
            return r7
        L10b:
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getName()
            java.io.File r8 = (java.io.File) r8
            java.lang.String r8 = r8.getName()
            int r7 = a7.a.m(r7, r8)
            return r7
        L11c:
            java.lang.String r8 = (java.lang.String) r8
            r0 = 0
            r1 = r0
            r2 = r1
        L121:
            int r3 = r8.length()
            r4 = 47
            r5 = 1
            if (r1 >= r3) goto L149
            char r3 = r8.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r3 = r3.charValue()
            if (r3 != r4) goto L139
            goto L13a
        L139:
            r5 = r0
        L13a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L146
            int r2 = r2 + 1
        L146:
            int r1 = r1 + 1
            goto L121
        L149:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.String r7 = (java.lang.String) r7
            r1 = r0
            r2 = r1
        L151:
            int r3 = r7.length()
            if (r1 >= r3) goto L177
            char r3 = r7.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r3 = r3.charValue()
            if (r3 != r4) goto L167
            r3 = r5
            goto L168
        L167:
            r3 = r0
        L168:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L174
            int r2 = r2 + 1
        L174:
            int r1 = r1 + 1
            goto L151
        L177:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            int r7 = r8.compareTo(r7)
            return r7
        L180:
            java.lang.String r7 = (java.lang.String) r7
            r0 = 0
            r1 = r0
            r2 = r1
        L185:
            int r3 = r7.length()
            r4 = 47
            r5 = 1
            if (r1 >= r3) goto L1ad
            char r3 = r7.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r3 = r3.charValue()
            if (r3 != r4) goto L19d
            goto L19e
        L19d:
            r5 = r0
        L19e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1aa
            int r2 = r2 + 1
        L1aa:
            int r1 = r1 + 1
            goto L185
        L1ad:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.String r8 = (java.lang.String) r8
            r1 = r0
            r2 = r1
        L1b5:
            int r3 = r8.length()
            if (r1 >= r3) goto L1db
            char r3 = r8.charAt(r1)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            char r3 = r3.charValue()
            if (r3 != r4) goto L1cb
            r3 = r5
            goto L1cc
        L1cb:
            r3 = r0
        L1cc:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L1d8
            int r2 = r2 + 1
        L1d8:
            int r1 = r1 + 1
            goto L1b5
        L1db:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            int r7 = r7.compareTo(r8)
            return r7
        L1e4:
            java.io.File r8 = (java.io.File) r8
            long r0 = r8.lastModified()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.io.File r7 = (java.io.File) r7
            long r0 = r7.lastModified()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            int r7 = r8.compareTo(r7)
            return r7
        L1fd:
            fb.d1 r8 = (fb.d1) r8
            boolean r8 = r8.f3494l
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            fb.d1 r7 = (fb.d1) r7
            boolean r7 = r7.f3494l
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            int r7 = r8.compareTo(r7)
            return r7
        L212:
            fb.p0 r7 = (fb.p0) r7
            java.lang.String r7 = r7.f3698b
            fb.p0 r8 = (fb.p0) r8
            java.lang.String r8 = r8.f3698b
            int r7 = r7.compareTo(r8)
            return r7
        L21f:
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r0 = "name"
            java.lang.String r1 = ""
            java.lang.String r7 = r7.optString(r0, r1)
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.String r8 = r8.optString(r0, r1)
            int r7 = a7.a.m(r7, r8)
            return r7
        L234:
            fb.m0 r7 = (fb.m0) r7
            long r0 = r7.f3635f
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            fb.m0 r8 = (fb.m0) r8
            long r0 = r8.f3635f
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            int r7 = r7.compareTo(r8)
            return r7
        L249:
            fb.m0 r7 = (fb.m0) r7
            long r0 = r7.f3635f
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            fb.m0 r8 = (fb.m0) r8
            long r0 = r8.f3635f
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            int r7 = r7.compareTo(r8)
            return r7
        L25e:
            java.io.File r7 = (java.io.File) r7
            boolean r7 = r7.isDirectory()
            r7 = r7 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.io.File r8 = (java.io.File) r8
            boolean r8 = r8.isDirectory()
            r8 = r8 ^ 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            int r7 = r7.compareTo(r8)
            return r7
        L27b:
            fb.h r7 = (fb.h) r7
            java.lang.String r7 = r7.f3535a
            fb.h r8 = (fb.h) r8
            java.lang.String r8 = r8.f3535a
            int r7 = r7.compareTo(r8)
            return r7
        L288:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r7 = r7.compareTo(r8)
            return r7
    }
}
