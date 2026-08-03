package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
public interface AndroidDescriptor {

    public enum Trivial extends java.lang.Enum<net.bytebuddy.build.AndroidDescriptor.Trivial> implements net.bytebuddy.build.AndroidDescriptor {
        private static final /* synthetic */ net.bytebuddy.build.AndroidDescriptor.Trivial[] $VALUES = null;
        public static final net.bytebuddy.build.AndroidDescriptor.Trivial EXTERNAL = null;
        public static final net.bytebuddy.build.AndroidDescriptor.Trivial LOCAL = null;
        private final net.bytebuddy.build.AndroidDescriptor.TypeScope typeScope;

        static {
                net.bytebuddy.build.AndroidDescriptor$Trivial r0 = new net.bytebuddy.build.AndroidDescriptor$Trivial
                r1 = 0
                net.bytebuddy.build.AndroidDescriptor$TypeScope r2 = net.bytebuddy.build.AndroidDescriptor.TypeScope.LOCAL
                java.lang.String r3 = "LOCAL"
                r0.<init>(r3, r1, r2)
                net.bytebuddy.build.AndroidDescriptor.Trivial.LOCAL = r0
                net.bytebuddy.build.AndroidDescriptor$Trivial r1 = new net.bytebuddy.build.AndroidDescriptor$Trivial
                r2 = 1
                net.bytebuddy.build.AndroidDescriptor$TypeScope r3 = net.bytebuddy.build.AndroidDescriptor.TypeScope.EXTERNAL
                java.lang.String r4 = "EXTERNAL"
                r1.<init>(r4, r2, r3)
                net.bytebuddy.build.AndroidDescriptor.Trivial.EXTERNAL = r1
                net.bytebuddy.build.AndroidDescriptor$Trivial[] r0 = new net.bytebuddy.build.AndroidDescriptor.Trivial[]{r0, r1}
                net.bytebuddy.build.AndroidDescriptor.Trivial.$VALUES = r0
                return
        }

        Trivial(java.lang.String r1, int r2, net.bytebuddy.build.AndroidDescriptor.TypeScope r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.typeScope = r3
                return
        }

        public static net.bytebuddy.build.AndroidDescriptor.Trivial valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.build.AndroidDescriptor$Trivial> r0 = net.bytebuddy.build.AndroidDescriptor.Trivial.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.build.AndroidDescriptor$Trivial r1 = (net.bytebuddy.build.AndroidDescriptor.Trivial) r1
                return r1
        }

        public static net.bytebuddy.build.AndroidDescriptor.Trivial[] values() {
                net.bytebuddy.build.AndroidDescriptor$Trivial[] r0 = net.bytebuddy.build.AndroidDescriptor.Trivial.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.build.AndroidDescriptor$Trivial[] r0 = (net.bytebuddy.build.AndroidDescriptor.Trivial[]) r0
                return r0
        }

        @Override // net.bytebuddy.build.AndroidDescriptor
        public net.bytebuddy.build.AndroidDescriptor.TypeScope getTypeScope(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.build.AndroidDescriptor$TypeScope r1 = r0.typeScope
                return r1
        }
    }

    public enum TypeScope extends java.lang.Enum<net.bytebuddy.build.AndroidDescriptor.TypeScope> {
        private static final /* synthetic */ net.bytebuddy.build.AndroidDescriptor.TypeScope[] $VALUES = null;
        public static final net.bytebuddy.build.AndroidDescriptor.TypeScope EXTERNAL = null;
        public static final net.bytebuddy.build.AndroidDescriptor.TypeScope LOCAL = null;

        static {
                net.bytebuddy.build.AndroidDescriptor$TypeScope r0 = new net.bytebuddy.build.AndroidDescriptor$TypeScope
                java.lang.String r1 = "LOCAL"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.build.AndroidDescriptor.TypeScope.LOCAL = r0
                net.bytebuddy.build.AndroidDescriptor$TypeScope r1 = new net.bytebuddy.build.AndroidDescriptor$TypeScope
                java.lang.String r2 = "EXTERNAL"
                r3 = 1
                r1.<init>(r2, r3)
                net.bytebuddy.build.AndroidDescriptor.TypeScope.EXTERNAL = r1
                net.bytebuddy.build.AndroidDescriptor$TypeScope[] r0 = new net.bytebuddy.build.AndroidDescriptor.TypeScope[]{r0, r1}
                net.bytebuddy.build.AndroidDescriptor.TypeScope.$VALUES = r0
                return
        }

        TypeScope(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.build.AndroidDescriptor.TypeScope valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.build.AndroidDescriptor$TypeScope> r0 = net.bytebuddy.build.AndroidDescriptor.TypeScope.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.build.AndroidDescriptor$TypeScope r1 = (net.bytebuddy.build.AndroidDescriptor.TypeScope) r1
                return r1
        }

        public static net.bytebuddy.build.AndroidDescriptor.TypeScope[] values() {
                net.bytebuddy.build.AndroidDescriptor$TypeScope[] r0 = net.bytebuddy.build.AndroidDescriptor.TypeScope.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.build.AndroidDescriptor$TypeScope[] r0 = (net.bytebuddy.build.AndroidDescriptor.TypeScope[]) r0
                return r0
        }
    }

    net.bytebuddy.build.AndroidDescriptor.TypeScope getTypeScope(net.bytebuddy.description.type.TypeDescription r1);
}
