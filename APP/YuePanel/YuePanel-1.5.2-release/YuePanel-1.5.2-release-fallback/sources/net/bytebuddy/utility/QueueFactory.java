package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class QueueFactory {
    private static final boolean ACCESS_CONTROLLER = false;
    private static final net.bytebuddy.utility.QueueFactory INSTANCE = null;
    private final net.bytebuddy.utility.QueueFactory.Dispatcher dispatcher;

    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.util.ArrayDeque")
    public interface Dispatcher {
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor
        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("arrayDeque")
        <T> java.util.Queue<T> arrayDeque();

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor
        @net.bytebuddy.utility.nullability.MaybeNull
        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("arrayDeque")
        <T> java.util.Queue<T> arrayDeque(java.util.Collection<? extends T> r1);
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
            net.bytebuddy.utility.QueueFactory.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.utility.QueueFactory.ACCESS_CONTROLLER = r0
        L19:
            net.bytebuddy.utility.QueueFactory r0 = new net.bytebuddy.utility.QueueFactory
            r0.<init>()
            net.bytebuddy.utility.QueueFactory.INSTANCE = r0
            return
    }

    private QueueFactory() {
            r1 = this;
            r1.<init>()
            java.lang.Class<net.bytebuddy.utility.QueueFactory$Dispatcher> r0 = net.bytebuddy.utility.QueueFactory.Dispatcher.class
            java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
            java.lang.Object r0 = doPrivileged(r0)
            net.bytebuddy.utility.QueueFactory$Dispatcher r0 = (net.bytebuddy.utility.QueueFactory.Dispatcher) r0
            r1.dispatcher = r0
            return
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.utility.QueueFactory.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static <T> java.util.Queue<T> make() {
            net.bytebuddy.utility.QueueFactory r0 = net.bytebuddy.utility.QueueFactory.INSTANCE
            net.bytebuddy.utility.QueueFactory$Dispatcher r0 = r0.dispatcher
            java.util.Queue r0 = r0.arrayDeque()
            if (r0 != 0) goto Lf
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        Lf:
            return r0
    }

    public static <T> java.util.Queue<T> make(java.util.Collection<? extends T> r1) {
            net.bytebuddy.utility.QueueFactory r0 = net.bytebuddy.utility.QueueFactory.INSTANCE
            net.bytebuddy.utility.QueueFactory$Dispatcher r0 = r0.dispatcher
            java.util.Queue r0 = r0.arrayDeque(r1)
            if (r0 != 0) goto Lf
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>(r1)
        Lf:
            return r0
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            net.bytebuddy.utility.QueueFactory$Dispatcher r2 = r4.dispatcher
            net.bytebuddy.utility.QueueFactory r5 = (net.bytebuddy.utility.QueueFactory) r5
            net.bytebuddy.utility.QueueFactory$Dispatcher r5 = r5.dispatcher
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L20
            return r1
        L20:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.utility.QueueFactory$Dispatcher r1 = r2.dispatcher
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
