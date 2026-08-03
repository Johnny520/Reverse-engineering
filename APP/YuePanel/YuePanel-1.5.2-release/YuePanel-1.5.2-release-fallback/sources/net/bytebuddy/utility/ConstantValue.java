package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public interface ConstantValue {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements net.bytebuddy.utility.ConstantValue {
        private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public Simple(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                r0.<init>()
                r0.stackManipulation = r1
                r0.typeDescription = r2
                return
        }

        public static net.bytebuddy.utility.ConstantValue wrap(java.lang.Object r3) {
                net.bytebuddy.utility.ConstantValue r0 = wrapOrNull(r3)
                if (r0 == 0) goto L7
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not a constant value: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        public static net.bytebuddy.utility.ConstantValue wrapOrNull(java.lang.Object r2) {
                boolean r0 = r2 instanceof net.bytebuddy.utility.ConstantValue
                if (r0 == 0) goto L7
                net.bytebuddy.utility.ConstantValue r2 = (net.bytebuddy.utility.ConstantValue) r2
                return r2
            L7:
                boolean r0 = r2 instanceof net.bytebuddy.description.type.TypeDescription
                java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
                if (r0 == 0) goto L28
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                boolean r0 = r2.isPrimitive()
                if (r0 == 0) goto L23
                net.bytebuddy.utility.ConstantValue$Simple r0 = new net.bytebuddy.utility.ConstantValue$Simple
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r2)
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                r0.<init>(r2, r1)
                goto L27
            L23:
                net.bytebuddy.utility.JavaConstant r0 = net.bytebuddy.utility.JavaConstant.Simple.of(r2)
            L27:
                return r0
            L28:
                boolean r0 = r2 instanceof net.bytebuddy.description.enumeration.EnumerationDescription
                if (r0 == 0) goto L3c
                net.bytebuddy.utility.ConstantValue$Simple r0 = new net.bytebuddy.utility.ConstantValue$Simple
                net.bytebuddy.description.enumeration.EnumerationDescription r2 = (net.bytebuddy.description.enumeration.EnumerationDescription) r2
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forEnumeration(r2)
                net.bytebuddy.description.type.TypeDescription r2 = r2.getEnumerationType()
                r0.<init>(r1, r2)
                return r0
            L3c:
                boolean r0 = r2 instanceof java.lang.Boolean
                if (r0 == 0) goto L56
                net.bytebuddy.utility.ConstantValue$Simple r0 = new net.bytebuddy.utility.ConstantValue$Simple
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                java.lang.Class r1 = java.lang.Boolean.TYPE
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                r0.<init>(r2, r1)
                return r0
            L56:
                boolean r0 = r2 instanceof java.lang.Byte
                if (r0 == 0) goto L70
                net.bytebuddy.utility.ConstantValue$Simple r0 = new net.bytebuddy.utility.ConstantValue$Simple
                java.lang.Byte r2 = (java.lang.Byte) r2
                byte r2 = r2.byteValue()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                java.lang.Class r1 = java.lang.Byte.TYPE
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                r0.<init>(r2, r1)
                return r0
            L70:
                boolean r0 = r2 instanceof java.lang.Short
                if (r0 == 0) goto L8a
                net.bytebuddy.utility.ConstantValue$Simple r0 = new net.bytebuddy.utility.ConstantValue$Simple
                java.lang.Short r2 = (java.lang.Short) r2
                short r2 = r2.shortValue()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                java.lang.Class r1 = java.lang.Short.TYPE
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                r0.<init>(r2, r1)
                return r0
            L8a:
                boolean r0 = r2 instanceof java.lang.Character
                if (r0 == 0) goto La4
                net.bytebuddy.utility.ConstantValue$Simple r0 = new net.bytebuddy.utility.ConstantValue$Simple
                java.lang.Character r2 = (java.lang.Character) r2
                char r2 = r2.charValue()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                java.lang.Class r1 = java.lang.Character.TYPE
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                r0.<init>(r2, r1)
                return r0
            La4:
                boolean r0 = r2 instanceof java.lang.Class
                if (r0 == 0) goto Lcb
                java.lang.Class r2 = (java.lang.Class) r2
                boolean r0 = r2.isPrimitive()
                if (r0 == 0) goto Lc2
                net.bytebuddy.utility.ConstantValue$Simple r0 = new net.bytebuddy.utility.ConstantValue$Simple
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r2)
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                r0.<init>(r2, r1)
                goto Lca
            Lc2:
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                net.bytebuddy.utility.JavaConstant r0 = net.bytebuddy.utility.JavaConstant.Simple.of(r2)
            Lca:
                return r0
            Lcb:
                boolean r0 = r2 instanceof java.lang.Enum
                if (r0 == 0) goto Le8
                net.bytebuddy.utility.ConstantValue$Simple r0 = new net.bytebuddy.utility.ConstantValue$Simple
                net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r1 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                java.lang.Enum r2 = (java.lang.Enum) r2
                r1.<init>(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forEnumeration(r1)
                java.lang.Class r2 = r2.getDeclaringClass()
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                r0.<init>(r1, r2)
                return r0
            Le8:
                net.bytebuddy.utility.JavaConstant r2 = net.bytebuddy.utility.JavaConstant.Simple.ofLoadedOrNull(r2)
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
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                net.bytebuddy.utility.ConstantValue$Simple r5 = (net.bytebuddy.utility.ConstantValue.Simple) r5
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
                return r0
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.stackManipulation
                return r0
        }
    }

    net.bytebuddy.description.type.TypeDescription getTypeDescription();

    net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation();
}
