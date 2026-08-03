package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileMetadata {
    private final java.lang.Long createdAtMillis;
    private final java.util.Map<mg.b, java.lang.Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final java.lang.Long lastAccessedAtMillis;
    private final java.lang.Long lastModifiedAtMillis;
    private final java.lang.Long size;
    private final okio.Path symlinkTarget;

    public FileMetadata() {
            r11 = this;
            r9 = 255(0xff, float:3.57E-43)
            r10 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public FileMetadata(boolean r1, boolean r2, okio.Path r3, java.lang.Long r4, java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.util.Map<mg.b, ? extends java.lang.Object> r8) {
            r0 = this;
            r8.getClass()
            r0.<init>()
            r0.isRegularFile = r1
            r0.isDirectory = r2
            r0.symlinkTarget = r3
            r0.size = r4
            r0.createdAtMillis = r5
            r0.lastModifiedAtMillis = r6
            r0.lastAccessedAtMillis = r7
            java.util.Map r1 = tf.y.f0(r8)
            r0.extras = r1
            return
    }

    public /* synthetic */ FileMetadata(boolean r2, boolean r3, okio.Path r4, java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.lang.Long r8, java.util.Map r9, int r10, gg.g r11) {
            r1 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L6
            r2 = r0
        L6:
            r11 = r10 & 2
            if (r11 == 0) goto Lb
            r3 = r0
        Lb:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto L11
            r4 = r0
        L11:
            r11 = r10 & 8
            if (r11 == 0) goto L16
            r5 = r0
        L16:
            r11 = r10 & 16
            if (r11 == 0) goto L1b
            r6 = r0
        L1b:
            r11 = r10 & 32
            if (r11 == 0) goto L20
            r7 = r0
        L20:
            r11 = r10 & 64
            if (r11 == 0) goto L25
            r8 = r0
        L25:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L2b
            tf.u r9 = tf.u.f13168g
        L2b:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static /* synthetic */ okio.FileMetadata copy$default(okio.FileMetadata r0, boolean r1, boolean r2, okio.Path r3, java.lang.Long r4, java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.util.Map r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            boolean r1 = r0.isRegularFile
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            boolean r2 = r0.isDirectory
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L12
            okio.Path r3 = r0.symlinkTarget
        L12:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            java.lang.Long r4 = r0.size
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L1e
            java.lang.Long r5 = r0.createdAtMillis
        L1e:
            r10 = r9 & 32
            if (r10 == 0) goto L24
            java.lang.Long r6 = r0.lastModifiedAtMillis
        L24:
            r10 = r9 & 64
            if (r10 == 0) goto L2a
            java.lang.Long r7 = r0.lastAccessedAtMillis
        L2a:
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L30
            java.util.Map<mg.b, java.lang.Object> r8 = r0.extras
        L30:
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            okio.FileMetadata r0 = r2.copy(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public final okio.FileMetadata copy(boolean r10, boolean r11, okio.Path r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.util.Map<mg.b, ? extends java.lang.Object> r17) {
            r9 = this;
            r17.getClass()
            okio.FileMetadata r0 = new okio.FileMetadata
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final <T> T extra(mg.b r4) {
            r3 = this;
            r4.getClass()
            java.util.Map<mg.b, java.lang.Object> r0 = r3.extras
            java.lang.Object r0 = r0.get(r4)
            if (r0 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            gg.f r4 = (gg.f) r4
            boolean r1 = r4.d(r0)
            if (r1 == 0) goto L19
            r0.getClass()
            return r0
        L19:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            java.lang.String r4 = r4.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Value cannot be cast to "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final java.lang.Long getCreatedAtMillis() {
            r1 = this;
            java.lang.Long r0 = r1.createdAtMillis
            return r0
    }

    public final java.util.Map<mg.b, java.lang.Object> getExtras() {
            r1 = this;
            java.util.Map<mg.b, java.lang.Object> r0 = r1.extras
            return r0
    }

    public final java.lang.Long getLastAccessedAtMillis() {
            r1 = this;
            java.lang.Long r0 = r1.lastAccessedAtMillis
            return r0
    }

    public final java.lang.Long getLastModifiedAtMillis() {
            r1 = this;
            java.lang.Long r0 = r1.lastModifiedAtMillis
            return r0
    }

    public final java.lang.Long getSize() {
            r1 = this;
            java.lang.Long r0 = r1.size
            return r0
    }

    public final okio.Path getSymlinkTarget() {
            r1 = this;
            okio.Path r0 = r1.symlinkTarget
            return r0
    }

    public final boolean isDirectory() {
            r1 = this;
            boolean r0 = r1.isDirectory
            return r0
    }

    public final boolean isRegularFile() {
            r1 = this;
            boolean r0 = r1.isRegularFile
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r6.isRegularFile
            if (r1 == 0) goto Le
            java.lang.String r1 = "isRegularFile"
            r0.add(r1)
        Le:
            boolean r1 = r6.isDirectory
            if (r1 == 0) goto L17
            java.lang.String r1 = "isDirectory"
            r0.add(r1)
        L17:
            java.lang.Long r1 = r6.size
            if (r1 == 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "byteCount="
            r1.<init>(r2)
            java.lang.Long r2 = r6.size
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L2e:
            java.lang.Long r1 = r6.createdAtMillis
            if (r1 == 0) goto L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "createdAt="
            r1.<init>(r2)
            java.lang.Long r2 = r6.createdAtMillis
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L45:
            java.lang.Long r1 = r6.lastModifiedAtMillis
            if (r1 == 0) goto L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lastModifiedAt="
            r1.<init>(r2)
            java.lang.Long r2 = r6.lastModifiedAtMillis
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L5c:
            java.lang.Long r1 = r6.lastAccessedAtMillis
            if (r1 == 0) goto L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lastAccessedAt="
            r1.<init>(r2)
            java.lang.Long r2 = r6.lastAccessedAtMillis
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L73:
            java.util.Map<mg.b, java.lang.Object> r1 = r6.extras
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "extras="
            r1.<init>(r2)
            java.util.Map<mg.b, java.lang.Object> r2 = r6.extras
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L8e:
            r4 = 0
            r5 = 56
            java.lang.String r1 = ", "
            java.lang.String r2 = "FileMetadata("
            java.lang.String r3 = ")"
            java.lang.String r0 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
