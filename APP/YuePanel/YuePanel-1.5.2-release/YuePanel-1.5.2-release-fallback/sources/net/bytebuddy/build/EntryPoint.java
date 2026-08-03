package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
public interface EntryPoint {

    /* JADX INFO: renamed from: net.bytebuddy.build.EntryPoint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Default extends java.lang.Enum<net.bytebuddy.build.EntryPoint.Default> implements net.bytebuddy.build.EntryPoint {
        private static final /* synthetic */ net.bytebuddy.build.EntryPoint.Default[] $VALUES = null;
        public static final net.bytebuddy.build.EntryPoint.Default DECORATE = null;
        public static final net.bytebuddy.build.EntryPoint.Default REBASE = null;
        public static final net.bytebuddy.build.EntryPoint.Default REDEFINE = null;
        public static final net.bytebuddy.build.EntryPoint.Default REDEFINE_LOCAL = null;





        static {
                net.bytebuddy.build.EntryPoint$Default$1 r0 = new net.bytebuddy.build.EntryPoint$Default$1
                java.lang.String r1 = "REBASE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.build.EntryPoint.Default.REBASE = r0
                net.bytebuddy.build.EntryPoint$Default$2 r1 = new net.bytebuddy.build.EntryPoint$Default$2
                java.lang.String r3 = "REDEFINE"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.build.EntryPoint.Default.REDEFINE = r1
                net.bytebuddy.build.EntryPoint$Default$3 r3 = new net.bytebuddy.build.EntryPoint$Default$3
                java.lang.String r5 = "REDEFINE_LOCAL"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.build.EntryPoint.Default.REDEFINE_LOCAL = r3
                net.bytebuddy.build.EntryPoint$Default$4 r5 = new net.bytebuddy.build.EntryPoint$Default$4
                java.lang.String r7 = "DECORATE"
                r8 = 3
                r5.<init>(r7, r8)
                net.bytebuddy.build.EntryPoint.Default.DECORATE = r5
                r7 = 4
                net.bytebuddy.build.EntryPoint$Default[] r7 = new net.bytebuddy.build.EntryPoint.Default[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                net.bytebuddy.build.EntryPoint.Default.$VALUES = r7
                return
        }

        Default(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.build.EntryPoint.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.build.EntryPoint.Default valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.build.EntryPoint$Default> r0 = net.bytebuddy.build.EntryPoint.Default.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.build.EntryPoint$Default r1 = (net.bytebuddy.build.EntryPoint.Default) r1
                return r1
        }

        public static net.bytebuddy.build.EntryPoint.Default[] values() {
                net.bytebuddy.build.EntryPoint$Default[] r0 = net.bytebuddy.build.EntryPoint.Default.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.build.EntryPoint$Default[] r0 = (net.bytebuddy.build.EntryPoint.Default[]) r0
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Unvalidated implements net.bytebuddy.build.EntryPoint {
        private final net.bytebuddy.build.EntryPoint delegate;

        public Unvalidated(net.bytebuddy.build.EntryPoint r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // net.bytebuddy.build.EntryPoint
        public net.bytebuddy.ByteBuddy byteBuddy(net.bytebuddy.ClassFileVersion r2) {
                r1 = this;
                net.bytebuddy.build.EntryPoint r0 = r1.delegate
                net.bytebuddy.ByteBuddy r2 = r0.byteBuddy(r2)
                net.bytebuddy.dynamic.scaffold.TypeValidation r0 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
                net.bytebuddy.ByteBuddy r2 = r2.with(r0)
                return r2
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
                net.bytebuddy.build.EntryPoint r2 = r4.delegate
                net.bytebuddy.build.EntryPoint$Unvalidated r5 = (net.bytebuddy.build.EntryPoint.Unvalidated) r5
                net.bytebuddy.build.EntryPoint r5 = r5.delegate
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
                net.bytebuddy.build.EntryPoint r1 = r2.delegate
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.build.EntryPoint
        public net.bytebuddy.dynamic.DynamicType.Builder<?> transform(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.ByteBuddy r3, net.bytebuddy.dynamic.ClassFileLocator r4, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r5) {
                r1 = this;
                net.bytebuddy.build.EntryPoint r0 = r1.delegate
                net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.transform(r2, r3, r4, r5)
                return r2
        }
    }

    net.bytebuddy.ByteBuddy byteBuddy(net.bytebuddy.ClassFileVersion r1);

    net.bytebuddy.dynamic.DynamicType.Builder<?> transform(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.ByteBuddy r2, net.bytebuddy.dynamic.ClassFileLocator r3, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r4);
}
