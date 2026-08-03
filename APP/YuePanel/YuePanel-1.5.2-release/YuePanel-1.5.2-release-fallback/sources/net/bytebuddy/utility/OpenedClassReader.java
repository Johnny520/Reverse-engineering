package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public class OpenedClassReader {
    private static final boolean ACCESS_CONTROLLER = false;
    public static final int ASM_API = 0;
    public static final boolean EXPERIMENTAL = false;
    public static final java.lang.String EXPERIMENTAL_PROPERTY = "net.bytebuddy.experimental";

    static {
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
            net.bytebuddy.utility.OpenedClassReader.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
            goto L1c
        L16:
            r1 = 1
            net.bytebuddy.utility.OpenedClassReader.ACCESS_CONTROLLER = r1
            goto L1c
        L1a:
            net.bytebuddy.utility.OpenedClassReader.ACCESS_CONTROLLER = r0
        L1c:
            net.bytebuddy.utility.privilege.GetSystemPropertyAction r1 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = "net.bytebuddy.experimental"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L2d
            java.lang.Object r1 = doPrivileged(r1)     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2d
            boolean r0 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.Exception -> L2d
        L2d:
            net.bytebuddy.utility.OpenedClassReader.EXPERIMENTAL = r0
            r0 = 589824(0x90000, float:8.2652E-40)
            net.bytebuddy.utility.OpenedClassReader.ASM_API = r0
            return
    }

    private OpenedClassReader() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This class is a utility class and not supposed to be instantiated"
            r0.<init>(r1)
            throw r0
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.utility.OpenedClassReader.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static net.bytebuddy.jar.asm.ClassReader of(byte[] r7) {
            net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofClassFile(r7)
            net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.latest()
            boolean r2 = r0.isGreaterThan(r1)
            if (r2 == 0) goto L85
            boolean r2 = net.bytebuddy.utility.OpenedClassReader.EXPERIMENTAL
            if (r2 == 0) goto L5c
            short r2 = r1.getMinorVersion()
            int r2 = r2 >>> 8
            byte r2 = (byte) r2
            r3 = 4
            r7[r3] = r2
            short r2 = r1.getMinorVersion()
            byte r2 = (byte) r2
            r4 = 5
            r7[r4] = r2
            short r2 = r1.getMajorVersion()
            int r2 = r2 >>> 8
            byte r2 = (byte) r2
            r5 = 6
            r7[r5] = r2
            short r1 = r1.getMajorVersion()
            byte r1 = (byte) r1
            r2 = 7
            r7[r2] = r1
            net.bytebuddy.jar.asm.ClassReader r1 = new net.bytebuddy.jar.asm.ClassReader
            r1.<init>(r7)
            short r6 = r0.getMinorVersion()
            int r6 = r6 >>> 8
            byte r6 = (byte) r6
            r7[r3] = r6
            short r3 = r0.getMinorVersion()
            byte r3 = (byte) r3
            r7[r4] = r3
            short r3 = r0.getMajorVersion()
            int r3 = r3 >>> 8
            byte r3 = (byte) r3
            r7[r5] = r3
            short r0 = r0.getMajorVersion()
            byte r0 = (byte) r0
            r7[r2] = r0
            return r1
        L5c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " is not supported by the current version of Byte Buddy which officially supports "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " - update Byte Buddy or set "
            r2.append(r0)
            java.lang.String r0 = "net.bytebuddy.experimental"
            r2.append(r0)
            java.lang.String r0 = " as a VM property"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r7.<init>(r0)
            throw r7
        L85:
            net.bytebuddy.jar.asm.ClassReader r0 = new net.bytebuddy.jar.asm.ClassReader
            r0.<init>(r7)
            return r0
    }
}
