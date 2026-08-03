package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f3871a;

    public z1(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.f3871a = r1
            return
    }

    public final boolean a() {
            r1 = this;
            java.util.ArrayList r0 = r1.b()
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final java.util.ArrayList b() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r5.f3871a
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            r3 = r2
            fb.a0 r3 = (fb.a0) r3
            fb.b0 r3 = r3.f3391a
            fb.b0 r4 = fb.b0.f3402g
            if (r3 != r4) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 == 0) goto Lb
            r0.add(r2)
            goto Lb
        L27:
            return r0
    }

    public final java.util.ArrayList c() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r5.f3871a
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            r3 = r2
            fb.a0 r3 = (fb.a0) r3
            fb.b0 r3 = r3.f3391a
            fb.b0 r4 = fb.b0.f3403h
            if (r3 != r4) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 == 0) goto Lb
            r0.add(r2)
            goto Lb
        L27:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof fb.z1
            if (r0 != 0) goto L8
            goto L14
        L8:
            fb.z1 r2 = (fb.z1) r2
            java.util.List r0 = r1.f3871a
            java.util.List r2 = r2.f3871a
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.List r0 = r1.f3871a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScriptPluginAgentValidation(issues="
            r0.<init>(r1)
            java.util.List r1 = r2.f3871a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
