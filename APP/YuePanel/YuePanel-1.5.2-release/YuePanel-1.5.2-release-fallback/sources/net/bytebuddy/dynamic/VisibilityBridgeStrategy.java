package net.bytebuddy.dynamic;

/* JADX INFO: loaded from: classes2.dex */
public interface VisibilityBridgeStrategy {

    /* JADX INFO: renamed from: net.bytebuddy.dynamic.VisibilityBridgeStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Default extends java.lang.Enum<net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default> implements net.bytebuddy.dynamic.VisibilityBridgeStrategy {
        private static final /* synthetic */ net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default[] $VALUES = null;
        public static final net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default ALWAYS = null;
        public static final net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default NEVER = null;
        public static final net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default ON_NON_GENERIC_METHOD = null;




        static {
                net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default$1 r0 = new net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default$1
                java.lang.String r1 = "ALWAYS"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.ALWAYS = r0
                net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default$2 r1 = new net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default$2
                java.lang.String r3 = "ON_NON_GENERIC_METHOD"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.ON_NON_GENERIC_METHOD = r1
                net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default$3 r3 = new net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default$3
                java.lang.String r5 = "NEVER"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.NEVER = r3
                r5 = 3
                net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default[] r5 = new net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.$VALUES = r5
                return
        }

        Default(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.dynamic.VisibilityBridgeStrategy.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default> r0 = net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default r1 = (net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default) r1
                return r1
        }

        public static net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default[] values() {
                net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default[] r0 = net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default[] r0 = (net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default[]) r0
                return r0
        }
    }

    boolean generateVisibilityBridge(net.bytebuddy.description.method.MethodDescription r1);
}
