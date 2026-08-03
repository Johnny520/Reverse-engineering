package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FileSystem {
    private static final boolean ACCESS_CONTROLLER = false;
    private static /* synthetic */ net.bytebuddy.utility.FileSystem INSTANCE;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForLegacyVm extends net.bytebuddy.utility.FileSystem {
        public ForLegacyVm() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.utility.FileSystem
        public void copy(java.io.File r4, java.io.File r5) throws java.io.IOException {
                r3 = this;
                java.io.FileInputStream r0 = new java.io.FileInputStream
                r0.<init>(r4)
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L23
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L23
                r5 = 1024(0x400, float:1.435E-42)
                byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L1a
            Le:
                int r1 = r0.read(r5)     // Catch: java.lang.Throwable -> L1a
                r2 = -1
                if (r1 == r2) goto L1c
                r2 = 0
                r4.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L1a
                goto Le
            L1a:
                r5 = move-exception
                goto L25
            L1c:
                r4.close()     // Catch: java.lang.Throwable -> L23
                r0.close()
                return
            L23:
                r4 = move-exception
                goto L29
            L25:
                r4.close()     // Catch: java.lang.Throwable -> L23
                throw r5     // Catch: java.lang.Throwable -> L23
            L29:
                r0.close()
                throw r4
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                r1 = 0
                if (r4 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r3.getClass()
                java.lang.Class r4 = r4.getClass()
                if (r2 == r4) goto L13
                return r1
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class r0 = r1.getClass()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.utility.FileSystem
        public void move(java.io.File r5, java.io.File r6) throws java.io.IOException {
                r4 = this;
                java.io.FileInputStream r0 = new java.io.FileInputStream
                r0.<init>(r5)
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2c
                r1.<init>(r6)     // Catch: java.lang.Throwable -> L2c
                r6 = 1024(0x400, float:1.435E-42)
                byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L1a
            Le:
                int r2 = r0.read(r6)     // Catch: java.lang.Throwable -> L1a
                r3 = -1
                if (r2 == r3) goto L1c
                r3 = 0
                r1.write(r6, r3, r2)     // Catch: java.lang.Throwable -> L1a
                goto Le
            L1a:
                r5 = move-exception
                goto L2e
            L1c:
                r1.close()     // Catch: java.lang.Throwable -> L2c
                r0.close()
                boolean r6 = r5.delete()
                if (r6 != 0) goto L2b
                r5.deleteOnExit()
            L2b:
                return
            L2c:
                r5 = move-exception
                goto L32
            L2e:
                r1.close()     // Catch: java.lang.Throwable -> L2c
                throw r5     // Catch: java.lang.Throwable -> L2c
            L32:
                r0.close()
                throw r5
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForNio2CapableVm extends net.bytebuddy.utility.FileSystem {
        private static final net.bytebuddy.utility.FileSystem.ForNio2CapableVm.Dispatcher DISPATCHER = null;
        private static final net.bytebuddy.utility.FileSystem.ForNio2CapableVm.Files FILES = null;
        private static final net.bytebuddy.utility.FileSystem.ForNio2CapableVm.StandardCopyOption STANDARD_COPY_OPTION = null;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.io.File")
        public interface Dispatcher {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("toPath")
            java.lang.Object toPath(java.io.File r1) throws java.io.IOException;
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.nio.file.Files")
        public interface Files {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("copy")
            java.lang.Object copy(@net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.nio.file.Path") java.lang.Object r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.nio.file.Path") java.lang.Object r2, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.nio.file.CopyOption") java.lang.Object[] r3) throws java.io.IOException;

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("move")
            java.lang.Object move(@net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.nio.file.Path") java.lang.Object r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.nio.file.Path") java.lang.Object r2, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.nio.file.CopyOption") java.lang.Object[] r3) throws java.io.IOException;
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.nio.file.StandardCopyOption")
        public interface StandardCopyOption {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Container
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("toArray")
            java.lang.Object[] toArray(int r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("valueOf")
            java.lang.Object valueOf(java.lang.String r1);
        }

        static {
                java.lang.Class<net.bytebuddy.utility.FileSystem$ForNio2CapableVm$Dispatcher> r0 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.Dispatcher.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = net.bytebuddy.utility.FileSystem.access$000(r0)
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$Dispatcher r0 = (net.bytebuddy.utility.FileSystem.ForNio2CapableVm.Dispatcher) r0
                net.bytebuddy.utility.FileSystem.ForNio2CapableVm.DISPATCHER = r0
                java.lang.Class<net.bytebuddy.utility.FileSystem$ForNio2CapableVm$Files> r0 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.Files.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = net.bytebuddy.utility.FileSystem.access$000(r0)
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$Files r0 = (net.bytebuddy.utility.FileSystem.ForNio2CapableVm.Files) r0
                net.bytebuddy.utility.FileSystem.ForNio2CapableVm.FILES = r0
                java.lang.Class<net.bytebuddy.utility.FileSystem$ForNio2CapableVm$StandardCopyOption> r0 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.StandardCopyOption.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = net.bytebuddy.utility.FileSystem.access$000(r0)
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$StandardCopyOption r0 = (net.bytebuddy.utility.FileSystem.ForNio2CapableVm.StandardCopyOption) r0
                net.bytebuddy.utility.FileSystem.ForNio2CapableVm.STANDARD_COPY_OPTION = r0
                return
        }

        public ForNio2CapableVm() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.utility.FileSystem
        public void copy(java.io.File r4, java.io.File r5) throws java.io.IOException {
                r3 = this;
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$StandardCopyOption r0 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.STANDARD_COPY_OPTION
                r1 = 1
                java.lang.Object[] r1 = r0.toArray(r1)
                java.lang.String r2 = "REPLACE_EXISTING"
                java.lang.Object r0 = r0.valueOf(r2)
                r2 = 0
                r1[r2] = r0
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$Files r0 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.FILES
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$Dispatcher r2 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.DISPATCHER
                java.lang.Object r4 = r2.toPath(r4)
                java.lang.Object r5 = r2.toPath(r5)
                r0.copy(r4, r5, r1)
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                r1 = 0
                if (r4 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r3.getClass()
                java.lang.Class r4 = r4.getClass()
                if (r2 == r4) goto L13
                return r1
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class r0 = r1.getClass()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.utility.FileSystem
        public void move(java.io.File r4, java.io.File r5) throws java.io.IOException {
                r3 = this;
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$StandardCopyOption r0 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.STANDARD_COPY_OPTION
                r1 = 1
                java.lang.Object[] r1 = r0.toArray(r1)
                java.lang.String r2 = "REPLACE_EXISTING"
                java.lang.Object r0 = r0.valueOf(r2)
                r2 = 0
                r1[r2] = r0
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$Files r0 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.FILES
                net.bytebuddy.utility.FileSystem$ForNio2CapableVm$Dispatcher r2 = net.bytebuddy.utility.FileSystem.ForNio2CapableVm.DISPATCHER
                java.lang.Object r4 = r2.toPath(r4)
                java.lang.Object r5 = r2.toPath(r5)
                r0.move(r4, r5, r1)
                return
        }
    }

    static {
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.utility.FileSystem.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.utility.FileSystem.ACCESS_CONTROLLER = r0
        L19:
            return
    }

    public FileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object access$000(java.security.PrivilegedAction r0) {
            java.lang.Object r0 = doPrivileged(r0)
            return r0
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.utility.FileSystem.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    @net.bytebuddy.build.CachedReturnPlugin.Enhance("INSTANCE")
    public static net.bytebuddy.utility.FileSystem getInstance() {
            net.bytebuddy.utility.FileSystem r0 = net.bytebuddy.utility.FileSystem.INSTANCE
            if (r0 == 0) goto L6
            r0 = 0
            goto L19
        L6:
            java.lang.String r0 = "java.nio.file.Files"
            java.lang.ClassLoader r1 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER     // Catch: java.lang.ClassNotFoundException -> L14
            r2 = 0
            java.lang.Class.forName(r0, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L14
            net.bytebuddy.utility.FileSystem$ForNio2CapableVm r0 = new net.bytebuddy.utility.FileSystem$ForNio2CapableVm     // Catch: java.lang.ClassNotFoundException -> L14
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L14
            goto L19
        L14:
            net.bytebuddy.utility.FileSystem$ForLegacyVm r0 = new net.bytebuddy.utility.FileSystem$ForLegacyVm
            r0.<init>()
        L19:
            if (r0 != 0) goto L1e
            net.bytebuddy.utility.FileSystem r0 = net.bytebuddy.utility.FileSystem.INSTANCE
            goto L20
        L1e:
            net.bytebuddy.utility.FileSystem.INSTANCE = r0
        L20:
            return r0
    }

    public abstract void copy(java.io.File r1, java.io.File r2) throws java.io.IOException;

    public abstract void move(java.io.File r1, java.io.File r2) throws java.io.IOException;
}
