package s9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Field f12393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Field f12394b;

    public a(java.lang.reflect.Field r1, java.lang.reflect.Field r2) {
            r0 = this;
            r0.<init>()
            r0.f12393a = r1
            r0.f12394b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof s9.a
            if (r0 != 0) goto L8
            goto L1f
        L8:
            s9.a r3 = (s9.a) r3
            java.lang.reflect.Field r0 = r2.f12393a
            java.lang.reflect.Field r1 = r3.f12393a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.reflect.Field r0 = r2.f12394b
            java.lang.reflect.Field r3 = r3.f12394b
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Field r0 = r2.f12393a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.reflect.Field r1 = r2.f12394b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AvatarFields(avatar="
            r0.<init>(r1)
            java.lang.reflect.Field r1 = r2.f12393a
            r0.append(r1)
            java.lang.String r1 = ", mask="
            r0.append(r1)
            java.lang.reflect.Field r1 = r2.f12394b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
