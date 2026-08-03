package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodAccessorFactory {

    public enum AccessType extends java.lang.Enum<net.bytebuddy.implementation.MethodAccessorFactory.AccessType> {
        private static final /* synthetic */ net.bytebuddy.implementation.MethodAccessorFactory.AccessType[] $VALUES = null;
        public static final net.bytebuddy.implementation.MethodAccessorFactory.AccessType DEFAULT = null;
        public static final net.bytebuddy.implementation.MethodAccessorFactory.AccessType PUBLIC = null;
        private final net.bytebuddy.description.modifier.Visibility visibility;

        static {
                net.bytebuddy.implementation.MethodAccessorFactory$AccessType r0 = new net.bytebuddy.implementation.MethodAccessorFactory$AccessType
                r1 = 0
                net.bytebuddy.description.modifier.Visibility r2 = net.bytebuddy.description.modifier.Visibility.PUBLIC
                java.lang.String r3 = "PUBLIC"
                r0.<init>(r3, r1, r2)
                net.bytebuddy.implementation.MethodAccessorFactory.AccessType.PUBLIC = r0
                net.bytebuddy.implementation.MethodAccessorFactory$AccessType r1 = new net.bytebuddy.implementation.MethodAccessorFactory$AccessType
                r2 = 1
                net.bytebuddy.description.modifier.Visibility r3 = net.bytebuddy.description.modifier.Visibility.PACKAGE_PRIVATE
                java.lang.String r4 = "DEFAULT"
                r1.<init>(r4, r2, r3)
                net.bytebuddy.implementation.MethodAccessorFactory.AccessType.DEFAULT = r1
                net.bytebuddy.implementation.MethodAccessorFactory$AccessType[] r0 = new net.bytebuddy.implementation.MethodAccessorFactory.AccessType[]{r0, r1}
                net.bytebuddy.implementation.MethodAccessorFactory.AccessType.$VALUES = r0
                return
        }

        AccessType(java.lang.String r1, int r2, net.bytebuddy.description.modifier.Visibility r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.visibility = r3
                return
        }

        public static net.bytebuddy.implementation.MethodAccessorFactory.AccessType valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.MethodAccessorFactory$AccessType> r0 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.MethodAccessorFactory$AccessType r1 = (net.bytebuddy.implementation.MethodAccessorFactory.AccessType) r1
                return r1
        }

        public static net.bytebuddy.implementation.MethodAccessorFactory.AccessType[] values() {
                net.bytebuddy.implementation.MethodAccessorFactory$AccessType[] r0 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.MethodAccessorFactory$AccessType[] r0 = (net.bytebuddy.implementation.MethodAccessorFactory.AccessType[]) r0
                return r0
        }

        public net.bytebuddy.description.modifier.Visibility getVisibility() {
                r1 = this;
                net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
                return r0
        }
    }

    public enum Illegal extends java.lang.Enum<net.bytebuddy.implementation.MethodAccessorFactory.Illegal> implements net.bytebuddy.implementation.MethodAccessorFactory {
        private static final /* synthetic */ net.bytebuddy.implementation.MethodAccessorFactory.Illegal[] $VALUES = null;
        public static final net.bytebuddy.implementation.MethodAccessorFactory.Illegal INSTANCE = null;

        static {
                net.bytebuddy.implementation.MethodAccessorFactory$Illegal r0 = new net.bytebuddy.implementation.MethodAccessorFactory$Illegal
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.MethodAccessorFactory.Illegal.INSTANCE = r0
                net.bytebuddy.implementation.MethodAccessorFactory$Illegal[] r0 = new net.bytebuddy.implementation.MethodAccessorFactory.Illegal[]{r0}
                net.bytebuddy.implementation.MethodAccessorFactory.Illegal.$VALUES = r0
                return
        }

        Illegal(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.MethodAccessorFactory.Illegal valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.MethodAccessorFactory$Illegal> r0 = net.bytebuddy.implementation.MethodAccessorFactory.Illegal.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.MethodAccessorFactory$Illegal r1 = (net.bytebuddy.implementation.MethodAccessorFactory.Illegal) r1
                return r1
        }

        public static net.bytebuddy.implementation.MethodAccessorFactory.Illegal[] values() {
                net.bytebuddy.implementation.MethodAccessorFactory$Illegal[] r0 = net.bytebuddy.implementation.MethodAccessorFactory.Illegal.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.MethodAccessorFactory$Illegal[] r0 = (net.bytebuddy.implementation.MethodAccessorFactory.Illegal[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.MethodAccessorFactory
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerAccessorFor(net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r1, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "It is illegal to register an accessor for this type"
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.implementation.MethodAccessorFactory
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerGetterFor(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "It is illegal to register a field getter for this type"
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.implementation.MethodAccessorFactory
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerSetterFor(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "It is illegal to register a field setter for this type"
                r1.<init>(r2)
                throw r1
        }
    }

    net.bytebuddy.description.method.MethodDescription.InDefinedShape registerAccessorFor(net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r1, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r2);

    net.bytebuddy.description.method.MethodDescription.InDefinedShape registerGetterFor(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r2);

    net.bytebuddy.description.method.MethodDescription.InDefinedShape registerSetterFor(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r2);
}
