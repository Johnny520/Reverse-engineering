package net.bytebuddy.implementation.attribute;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationValueFilter {

    /* JADX INFO: renamed from: net.bytebuddy.implementation.attribute.AnnotationValueFilter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Default extends java.lang.Enum<net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default> implements net.bytebuddy.implementation.attribute.AnnotationValueFilter, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory {
        private static final /* synthetic */ net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default[] $VALUES = null;
        public static final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default APPEND_DEFAULTS = null;
        public static final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default SKIP_DEFAULTS = null;



        static {
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default$1 r0 = new net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default$1
                java.lang.String r1 = "SKIP_DEFAULTS"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.SKIP_DEFAULTS = r0
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default$2 r1 = new net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default$2
                java.lang.String r3 = "APPEND_DEFAULTS"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.APPEND_DEFAULTS = r1
                r3 = 2
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default[] r3 = new net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.$VALUES = r3
                return
        }

        Default(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default> r0 = net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default r1 = (net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default) r1
                return r1
        }

        public static net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default[] values() {
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default[] r0 = net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default[] r0 = (net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public net.bytebuddy.implementation.attribute.AnnotationValueFilter on(net.bytebuddy.description.field.FieldDescription r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public net.bytebuddy.implementation.attribute.AnnotationValueFilter on(net.bytebuddy.description.method.MethodDescription r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public net.bytebuddy.implementation.attribute.AnnotationValueFilter on(net.bytebuddy.description.type.RecordComponentDescription r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory
        public net.bytebuddy.implementation.attribute.AnnotationValueFilter on(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    public interface Factory {
        net.bytebuddy.implementation.attribute.AnnotationValueFilter on(net.bytebuddy.description.field.FieldDescription r1);

        net.bytebuddy.implementation.attribute.AnnotationValueFilter on(net.bytebuddy.description.method.MethodDescription r1);

        net.bytebuddy.implementation.attribute.AnnotationValueFilter on(net.bytebuddy.description.type.RecordComponentDescription r1);

        net.bytebuddy.implementation.attribute.AnnotationValueFilter on(net.bytebuddy.description.type.TypeDescription r1);
    }

    boolean isRelevant(net.bytebuddy.description.annotation.AnnotationDescription r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2);
}
