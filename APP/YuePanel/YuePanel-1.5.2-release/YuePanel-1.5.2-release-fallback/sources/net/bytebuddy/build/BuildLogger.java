package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
public interface BuildLogger {

    public static abstract class Adapter implements net.bytebuddy.build.BuildLogger {
        public Adapter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void debug(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void debug(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void error(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void error(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void info(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void info(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isDebugEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isErrorEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isInfoEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isWarnEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void warn(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void warn(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.build.BuildLogger {
        private final java.util.List<net.bytebuddy.build.BuildLogger> buildLoggers;

        public Compound(java.util.List<? extends net.bytebuddy.build.BuildLogger> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.buildLoggers = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.build.BuildLogger r0 = (net.bytebuddy.build.BuildLogger) r0
                boolean r1 = r0 instanceof net.bytebuddy.build.BuildLogger.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.build.BuildLogger> r1 = r2.buildLoggers
                net.bytebuddy.build.BuildLogger$Compound r0 = (net.bytebuddy.build.BuildLogger.Compound) r0
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r0.buildLoggers
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.build.BuildLogger.NoOp
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.build.BuildLogger> r1 = r2.buildLoggers
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.build.BuildLogger... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void debug(java.lang.String r4) {
                r3 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r3.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r2 = r1.isDebugEnabled()
                if (r2 == 0) goto L6
                r1.debug(r4)
                goto L6
            L1c:
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void debug(java.lang.String r4, java.lang.Throwable r5) {
                r3 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r3.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r2 = r1.isDebugEnabled()
                if (r2 == 0) goto L6
                r1.debug(r4, r5)
                goto L6
            L1c:
                return
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
                java.util.List<net.bytebuddy.build.BuildLogger> r2 = r4.buildLoggers
                net.bytebuddy.build.BuildLogger$Compound r5 = (net.bytebuddy.build.BuildLogger.Compound) r5
                java.util.List<net.bytebuddy.build.BuildLogger> r5 = r5.buildLoggers
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void error(java.lang.String r4) {
                r3 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r3.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r2 = r1.isErrorEnabled()
                if (r2 == 0) goto L6
                r1.error(r4)
                goto L6
            L1c:
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void error(java.lang.String r4, java.lang.Throwable r5) {
                r3 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r3.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r2 = r1.isErrorEnabled()
                if (r2 == 0) goto L6
                r1.error(r4, r5)
                goto L6
            L1c:
                return
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.build.BuildLogger> r1 = r2.buildLoggers
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void info(java.lang.String r4) {
                r3 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r3.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r2 = r1.isInfoEnabled()
                if (r2 == 0) goto L6
                r1.info(r4)
                goto L6
            L1c:
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void info(java.lang.String r4, java.lang.Throwable r5) {
                r3 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r3.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r2 = r1.isInfoEnabled()
                if (r2 == 0) goto L6
                r1.info(r4, r5)
                goto L6
            L1c:
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isDebugEnabled() {
                r2 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r2.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r1 = r1.isDebugEnabled()
                if (r1 == 0) goto L6
                r0 = 1
                return r0
            L1a:
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isErrorEnabled() {
                r2 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r2.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r1 = r1.isErrorEnabled()
                if (r1 == 0) goto L6
                r0 = 1
                return r0
            L1a:
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isInfoEnabled() {
                r2 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r2.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r1 = r1.isInfoEnabled()
                if (r1 == 0) goto L6
                r0 = 1
                return r0
            L1a:
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isWarnEnabled() {
                r2 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r2.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r1 = r1.isWarnEnabled()
                if (r1 == 0) goto L6
                r0 = 1
                return r0
            L1a:
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void warn(java.lang.String r4) {
                r3 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r3.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r2 = r1.isWarnEnabled()
                if (r2 == 0) goto L6
                r1.warn(r4)
                goto L6
            L1c:
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void warn(java.lang.String r4, java.lang.Throwable r5) {
                r3 = this;
                java.util.List<net.bytebuddy.build.BuildLogger> r0 = r3.buildLoggers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r0.next()
                net.bytebuddy.build.BuildLogger r1 = (net.bytebuddy.build.BuildLogger) r1
                boolean r2 = r1.isWarnEnabled()
                if (r2 == 0) goto L6
                r1.warn(r4, r5)
                goto L6
            L1c:
                return
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.build.BuildLogger.NoOp> implements net.bytebuddy.build.BuildLogger {
        private static final /* synthetic */ net.bytebuddy.build.BuildLogger.NoOp[] $VALUES = null;
        public static final net.bytebuddy.build.BuildLogger.NoOp INSTANCE = null;

        static {
                net.bytebuddy.build.BuildLogger$NoOp r0 = new net.bytebuddy.build.BuildLogger$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.build.BuildLogger.NoOp.INSTANCE = r0
                net.bytebuddy.build.BuildLogger$NoOp[] r0 = new net.bytebuddy.build.BuildLogger.NoOp[]{r0}
                net.bytebuddy.build.BuildLogger.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.build.BuildLogger.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.build.BuildLogger$NoOp> r0 = net.bytebuddy.build.BuildLogger.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.build.BuildLogger$NoOp r1 = (net.bytebuddy.build.BuildLogger.NoOp) r1
                return r1
        }

        public static net.bytebuddy.build.BuildLogger.NoOp[] values() {
                net.bytebuddy.build.BuildLogger$NoOp[] r0 = net.bytebuddy.build.BuildLogger.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.build.BuildLogger$NoOp[] r0 = (net.bytebuddy.build.BuildLogger.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void debug(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void debug(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void error(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void error(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void info(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void info(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isDebugEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isErrorEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isInfoEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isWarnEnabled() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void warn(java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void warn(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                return
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class StreamWriting implements net.bytebuddy.build.BuildLogger {
        private final java.io.PrintStream printStream;

        public StreamWriting(java.io.PrintStream r1) {
                r0 = this;
                r0.<init>()
                r0.printStream = r1
                return
        }

        public static net.bytebuddy.build.BuildLogger toSystemError() {
                net.bytebuddy.build.BuildLogger$StreamWriting r0 = new net.bytebuddy.build.BuildLogger$StreamWriting
                java.io.PrintStream r1 = java.lang.System.err
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.build.BuildLogger toSystemOut() {
                net.bytebuddy.build.BuildLogger$StreamWriting r0 = new net.bytebuddy.build.BuildLogger$StreamWriting
                java.io.PrintStream r1 = java.lang.System.out
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void debug(java.lang.String r2) {
                r1 = this;
                java.io.PrintStream r0 = r1.printStream
                r0.print(r2)
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void debug(java.lang.String r3, java.lang.Throwable r4) {
                r2 = this;
                java.io.PrintStream r0 = r2.printStream
                monitor-enter(r0)
                java.io.PrintStream r1 = r2.printStream     // Catch: java.lang.Throwable -> Lf
                r1.print(r3)     // Catch: java.lang.Throwable -> Lf
                java.io.PrintStream r3 = r2.printStream     // Catch: java.lang.Throwable -> Lf
                r4.printStackTrace(r3)     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r3
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
                java.io.PrintStream r2 = r4.printStream
                net.bytebuddy.build.BuildLogger$StreamWriting r5 = (net.bytebuddy.build.BuildLogger.StreamWriting) r5
                java.io.PrintStream r5 = r5.printStream
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void error(java.lang.String r2) {
                r1 = this;
                java.io.PrintStream r0 = r1.printStream
                r0.print(r2)
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void error(java.lang.String r3, java.lang.Throwable r4) {
                r2 = this;
                java.io.PrintStream r0 = r2.printStream
                monitor-enter(r0)
                java.io.PrintStream r1 = r2.printStream     // Catch: java.lang.Throwable -> Lf
                r1.print(r3)     // Catch: java.lang.Throwable -> Lf
                java.io.PrintStream r3 = r2.printStream     // Catch: java.lang.Throwable -> Lf
                r4.printStackTrace(r3)     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r3
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.io.PrintStream r1 = r2.printStream
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void info(java.lang.String r2) {
                r1 = this;
                java.io.PrintStream r0 = r1.printStream
                r0.print(r2)
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void info(java.lang.String r3, java.lang.Throwable r4) {
                r2 = this;
                java.io.PrintStream r0 = r2.printStream
                monitor-enter(r0)
                java.io.PrintStream r1 = r2.printStream     // Catch: java.lang.Throwable -> Lf
                r1.print(r3)     // Catch: java.lang.Throwable -> Lf
                java.io.PrintStream r3 = r2.printStream     // Catch: java.lang.Throwable -> Lf
                r4.printStackTrace(r3)     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r3
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isDebugEnabled() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isErrorEnabled() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isInfoEnabled() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public boolean isWarnEnabled() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void warn(java.lang.String r2) {
                r1 = this;
                java.io.PrintStream r0 = r1.printStream
                r0.print(r2)
                return
        }

        @Override // net.bytebuddy.build.BuildLogger
        public void warn(java.lang.String r3, java.lang.Throwable r4) {
                r2 = this;
                java.io.PrintStream r0 = r2.printStream
                monitor-enter(r0)
                java.io.PrintStream r1 = r2.printStream     // Catch: java.lang.Throwable -> Lf
                r1.print(r3)     // Catch: java.lang.Throwable -> Lf
                java.io.PrintStream r3 = r2.printStream     // Catch: java.lang.Throwable -> Lf
                r4.printStackTrace(r3)     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                return
            Lf:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r3
        }
    }

    void debug(java.lang.String r1);

    void debug(java.lang.String r1, java.lang.Throwable r2);

    void error(java.lang.String r1);

    void error(java.lang.String r1, java.lang.Throwable r2);

    void info(java.lang.String r1);

    void info(java.lang.String r1, java.lang.Throwable r2);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isWarnEnabled();

    void warn(java.lang.String r1);

    void warn(java.lang.String r1, java.lang.Throwable r2);
}
