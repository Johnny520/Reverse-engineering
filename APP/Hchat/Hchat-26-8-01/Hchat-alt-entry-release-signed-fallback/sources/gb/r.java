package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f4469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f4470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f4471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f4472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f4473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f4474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f4475j;

    public r(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.ArrayList r10) {
            r0 = this;
            r6.getClass()
            r0.<init>()
            r0.f4466a = r1
            r0.f4467b = r2
            r0.f4468c = r3
            r0.f4469d = r4
            r0.f4470e = r5
            r0.f4471f = r6
            r0.f4472g = r7
            r0.f4473h = r8
            r0.f4474i = r9
            r0.f4475j = r10
            return
    }

    public final org.json.JSONObject a(java.lang.String r7) {
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "sourcePluginId"
            java.lang.String r2 = r6.f4466a
            r0.put(r1, r2)
            if (r7 == 0) goto L1d
            boolean r1 = og.m.t0(r7)
            if (r1 != 0) goto L15
            goto L16
        L15:
            r7 = 0
        L16:
            if (r7 == 0) goto L1d
            java.lang.String r1 = "pluginId"
            r0.put(r1, r7)
        L1d:
            java.lang.String r7 = "displayName"
            java.lang.String r1 = r6.f4467b
            r0.put(r7, r1)
            java.lang.String r7 = "author"
            java.lang.String r1 = r6.f4468c
            r0.put(r7, r1)
            java.lang.String r7 = r6.f4469d
            boolean r1 = og.m.t0(r7)
            if (r1 == 0) goto L35
            java.lang.String r7 = "1.0.0"
        L35:
            java.lang.String r1 = "versionName"
            r0.put(r1, r7)
            java.lang.String r7 = "releaseNotes"
            java.lang.String r1 = r6.f4471f
            r0.put(r7, r1)
            java.lang.String r7 = "uploaderWxId"
            java.lang.String r1 = r6.f4472g
            r0.put(r7, r1)
            java.lang.String r7 = "uploaderWeChatId"
            java.lang.String r1 = r6.f4473h
            r0.put(r7, r1)
            java.lang.String r7 = "uploaderNickname"
            java.lang.String r1 = r6.f4474i
            r0.put(r7, r1)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.util.ArrayList r1 = r6.f4475j
            java.util.Iterator r1 = r1.iterator()
        L61:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            gb.g r2 = (gb.g) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r5 = r2.f4422a
            r3.put(r4, r5)
            java.lang.String r4 = "content"
            java.lang.String r5 = r2.f4423b
            r3.put(r4, r5)
            java.lang.String r4 = "encoding"
            java.lang.String r2 = r2.f4426e
            r3.put(r4, r2)
            r7.put(r3)
            goto L61
        L8b:
            java.lang.String r1 = "files"
            r0.put(r1, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L7b
        L4:
            boolean r0 = r3 instanceof gb.r
            if (r0 != 0) goto La
            goto L79
        La:
            gb.r r3 = (gb.r) r3
            java.lang.String r0 = r2.f4466a
            java.lang.String r1 = r3.f4466a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            goto L79
        L17:
            java.lang.String r0 = r2.f4467b
            java.lang.String r1 = r3.f4467b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            goto L79
        L22:
            java.lang.String r0 = r2.f4468c
            java.lang.String r1 = r3.f4468c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L79
        L2d:
            java.lang.String r0 = r2.f4469d
            java.lang.String r1 = r3.f4469d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            goto L79
        L38:
            java.lang.String r0 = r2.f4470e
            java.lang.String r1 = r3.f4470e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L43
            goto L79
        L43:
            java.lang.String r0 = r2.f4471f
            java.lang.String r1 = r3.f4471f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L4e
            goto L79
        L4e:
            java.lang.String r0 = r2.f4472g
            java.lang.String r1 = r3.f4472g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L79
        L59:
            java.lang.String r0 = r2.f4473h
            java.lang.String r1 = r3.f4473h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            goto L79
        L64:
            java.lang.String r0 = r2.f4474i
            java.lang.String r1 = r3.f4474i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f
            goto L79
        L6f:
            java.util.ArrayList r0 = r2.f4475j
            java.util.ArrayList r3 = r3.f4475j
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L7b
        L79:
            r3 = 0
            return r3
        L7b:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4466a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4467b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4468c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4469d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4470e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4471f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4472g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4473h
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f4474i
            int r0 = eh.a.g(r0, r1, r2)
            java.util.ArrayList r1 = r3.f4475j
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", author="
            java.lang.String r2 = "PluginMarketUploadPackage(localPluginId="
            java.lang.String r3 = r5.f4466a
            java.lang.String r4 = r5.f4467b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", version="
            java.lang.String r2 = ", updateTime="
            java.lang.String r3 = r5.f4468c
            java.lang.String r4 = r5.f4469d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", releaseNotes="
            java.lang.String r2 = ", uploaderWxId="
            java.lang.String r3 = r5.f4470e
            java.lang.String r4 = r5.f4471f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", uploaderWeChatId="
            java.lang.String r2 = ", uploaderNickname="
            java.lang.String r3 = r5.f4472g
            java.lang.String r4 = r5.f4473h
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f4474i
            r0.append(r1)
            java.lang.String r1 = ", files="
            r0.append(r1)
            java.util.ArrayList r1 = r5.f4475j
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
