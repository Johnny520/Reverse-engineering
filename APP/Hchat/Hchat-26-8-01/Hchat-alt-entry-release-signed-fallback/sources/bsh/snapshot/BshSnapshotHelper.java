package bsh.snapshot;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BshSnapshotHelper {
    private static final int GCM_TAG_BITS = 128;
    private static final int HEADER_VERSION = 1;
    private static final int IV_LENGTH = 12;
    private static final byte[] MAGIC = null;
    private static final java.security.SecureRandom RANDOM = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FilteringObjectInputStream extends java.io.ObjectInputStream {
        public FilteringObjectInputStream(java.io.InputStream r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.ObjectInputStream
        public java.lang.Class<?> resolveClass(java.io.ObjectStreamClass r3) {
                r2 = this;
                java.lang.Class r3 = super.resolveClass(r3)
                boolean r0 = bsh.snapshot.BshSnapshotHelper.a(r3)
                if (r0 == 0) goto Lb
                return r3
            Lb:
                java.io.InvalidClassException r0 = new java.io.InvalidClassException
                java.lang.String r3 = r3.getName()
                java.lang.String r1 = "BeanShell snapshot rejected class: "
                java.lang.String r3 = r1.concat(r3)
                r0.<init>(r3)
                throw r0
        }
    }

    static {
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [66, 83, 72, 83} // fill-array
            bsh.snapshot.BshSnapshotHelper.MAGIC = r0
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            bsh.snapshot.BshSnapshotHelper.RANDOM = r0
            return
    }

    private BshSnapshotHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* bridge */ /* synthetic */ boolean a(java.lang.Class r0) {
            boolean r0 = isAllowed(r0)
            return r0
    }

    private static boolean isAllowed(java.lang.Class<?> r3) {
            boolean r0 = r3.isArray()
            r1 = 1
            if (r0 == 0) goto L29
            java.lang.Class r3 = r3.getComponentType()
        Lb:
            if (r3 == 0) goto L18
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L18
            java.lang.Class r3 = r3.getComponentType()
            goto Lb
        L18:
            if (r3 == 0) goto L27
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L26
            boolean r3 = isAllowed(r3)
            if (r3 == 0) goto L27
        L26:
            return r1
        L27:
            r3 = 0
            return r3
        L29:
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L81
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 != 0) goto L81
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r3 == r0) goto L81
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r3 == r0) goto L81
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r3 == r0) goto L81
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 != 0) goto L81
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 != 0) goto L81
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            if (r3 == r0) goto L81
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 != 0) goto L81
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "java.lang.invoke."
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L81
            java.lang.String r0 = r3.getName()
            java.lang.String r2 = "java.lang.constant."
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L76
            goto L81
        L76:
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "bsh."
            boolean r3 = r3.startsWith(r0)
            return r3
        L81:
            return r1
    }

    public static bsh.snapshot.BshSnapshot readEncrypted(java.io.InputStream r6, javax.crypto.SecretKey r7) {
            java.lang.String r0 = "BeanShell snapshot unsupported AST format: "
            byte[] r1 = bsh.snapshot.BshSnapshotHelper.MAGIC
            int r2 = r1.length
            byte[] r2 = readExact(r6, r2)
            boolean r1 = java.util.Arrays.equals(r2, r1)
            if (r1 == 0) goto L9f
            int r1 = r6.read()
            r2 = 1
            if (r1 != r2) goto L95
            int r1 = r6.read()
            if (r1 <= 0) goto L8e
            r3 = 32
            if (r1 > r3) goto L8e
            byte[] r1 = readExact(r6, r1)
            java.lang.String r3 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            javax.crypto.spec.GCMParameterSpec r4 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            r5 = 128(0x80, float:1.8E-43)
            r4.<init>(r5, r1)     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            r1 = 2
            r3.init(r1, r7, r4)     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            bsh.snapshot.BshSnapshotHelper$FilteringObjectInputStream r7 = new bsh.snapshot.BshSnapshotHelper$FilteringObjectInputStream     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            javax.crypto.CipherInputStream r1 = new javax.crypto.CipherInputStream     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            r1.<init>(r6, r3)     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            r7.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            java.lang.Object r6 = r7.readObject()     // Catch: java.lang.Throwable -> L69
            boolean r1 = r6 instanceof bsh.snapshot.BshSnapshot     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L6b
            bsh.snapshot.BshSnapshot r6 = (bsh.snapshot.BshSnapshot) r6     // Catch: java.lang.Throwable -> L69
            int r1 = r6.getFormatVersion()     // Catch: java.lang.Throwable -> L69
            if (r1 != r2) goto L53
            r7.close()     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
            return r6
        L53:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L69
            int r6 = r6.getFormatVersion()     // Catch: java.lang.Throwable -> L69
            r2.append(r6)     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L69
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L69
        L69:
            r6 = move-exception
            goto L73
        L6b:
            java.io.InvalidClassException r6 = new java.io.InvalidClassException     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "BeanShell snapshot unexpected payload"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r6     // Catch: java.lang.Throwable -> L69
        L73:
            r7.close()     // Catch: java.lang.Throwable -> L77
            goto L7b
        L77:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
        L7b:
            throw r6     // Catch: java.lang.ClassNotFoundException -> L7c java.security.GeneralSecurityException -> L85
        L7c:
            r6 = move-exception
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "BeanShell snapshot class not found"
            r7.<init>(r0, r6)
            throw r7
        L85:
            r6 = move-exception
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "BeanShell snapshot decrypt failed"
            r7.<init>(r0, r6)
            throw r7
        L8e:
            java.lang.String r6 = "BeanShell snapshot invalid IV length"
            j8.o.y(r6)
        L93:
            r6 = 0
            return r6
        L95:
            java.lang.String r6 = "BeanShell snapshot unsupported version: "
            java.lang.String r6 = eh.a.l(r1, r6)
            j8.o.y(r6)
            goto L93
        L9f:
            java.lang.String r6 = "BeanShell snapshot invalid header"
            j8.o.y(r6)
            goto L93
    }

    private static byte[] readExact(java.io.InputStream r3, int r4) {
            byte[] r0 = new byte[r4]
            r1 = 0
        L3:
            if (r1 >= r4) goto L16
            int r2 = r4 - r1
            int r2 = r3.read(r0, r1, r2)
            if (r2 < 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.lang.String r3 = "BeanShell snapshot unexpected end"
            j8.o.y(r3)
            r3 = 0
            return r3
        L16:
            return r0
    }

    public static void writeEncrypted(bsh.snapshot.BshSnapshot r5, java.io.OutputStream r6, javax.crypto.SecretKey r7) {
            r0 = 12
            byte[] r1 = new byte[r0]
            java.security.SecureRandom r2 = bsh.snapshot.BshSnapshotHelper.RANDOM
            r2.nextBytes(r1)
            byte[] r2 = bsh.snapshot.BshSnapshotHelper.MAGIC
            r6.write(r2)
            r2 = 1
            r6.write(r2)
            r6.write(r0)
            r6.write(r1)
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.security.GeneralSecurityException -> L43
            javax.crypto.spec.GCMParameterSpec r3 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.security.GeneralSecurityException -> L43
            r4 = 128(0x80, float:1.8E-43)
            r3.<init>(r4, r1)     // Catch: java.security.GeneralSecurityException -> L43
            r0.init(r2, r7, r3)     // Catch: java.security.GeneralSecurityException -> L43
            java.io.ObjectOutputStream r7 = new java.io.ObjectOutputStream     // Catch: java.security.GeneralSecurityException -> L43
            javax.crypto.CipherOutputStream r1 = new javax.crypto.CipherOutputStream     // Catch: java.security.GeneralSecurityException -> L43
            r1.<init>(r6, r0)     // Catch: java.security.GeneralSecurityException -> L43
            r7.<init>(r1)     // Catch: java.security.GeneralSecurityException -> L43
            r7.writeObject(r5)     // Catch: java.lang.Throwable -> L39
            r7.close()     // Catch: java.security.GeneralSecurityException -> L43
            return
        L39:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.security.GeneralSecurityException -> L43
        L42:
            throw r5     // Catch: java.security.GeneralSecurityException -> L43
        L43:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "BeanShell snapshot encrypt failed"
            r6.<init>(r7, r5)
            throw r6
    }
}
