package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ac.j {
    @Override // ac.b
    public final byte a() {
            r1 = this;
            r0 = 6
            return r0
    }

    @Override // ac.b
    public final boolean b() {
            r2 = this;
            java.lang.Object r0 = r2.f172b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r1 = "true"
            boolean r0 = r1.equalsIgnoreCase(r0)
            return r0
    }

    @Override // ac.b
    public final float c() {
            r2 = this;
            java.lang.Object r0 = r2.f172b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L16
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto L16
        Ld:
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L16
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L16
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // ac.b
    public final int d() {
            r2 = this;
            java.lang.Object r0 = r2.f172b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L24
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto L24
        Ld:
            java.lang.String r1 = "."
            boolean r1 = r0.contains(r1)     // Catch: java.lang.NumberFormatException -> L24
            if (r1 == 0) goto L1b
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L24
            int r0 = (int) r0     // Catch: java.lang.NumberFormatException -> L24
            return r0
        L1b:
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L24
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L24
            return r0
        L24:
            r0 = 0
            return r0
    }

    @Override // ac.b
    public final long e() {
            r2 = this;
            java.lang.Object r0 = r2.f172b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L24
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto L24
        Ld:
            java.lang.String r1 = "."
            boolean r1 = r0.contains(r1)     // Catch: java.lang.NumberFormatException -> L24
            if (r1 == 0) goto L1b
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L24
            long r0 = (long) r0     // Catch: java.lang.NumberFormatException -> L24
            return r0
        L1b:
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L24
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L24
            return r0
        L24:
            r0 = 0
            return r0
    }

    @Override // ac.b
    public final java.lang.String f() {
            r1 = this;
            java.lang.Object r0 = r1.f172b
            if (r0 == 0) goto L7
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L7:
            java.lang.String r0 = ""
            return r0
    }
}
