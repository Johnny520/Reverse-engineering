package com.google.gson.internal.reflect;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectionHelper {
    private static final com.google.gson.internal.reflect.ReflectionHelper.RecordHelper RECORD_HELPER = null;

    /* JADX INFO: renamed from: com.google.gson.internal.reflect.ReflectionHelper$1 */
    static /* synthetic */ class C04681 {
    }

    private static abstract class RecordHelper {
        private RecordHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ RecordHelper(com.google.gson.internal.reflect.ReflectionHelper.C04681 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.lang.reflect.Method getAccessor(java.lang.Class<?> r1, java.lang.reflect.Field r2);

        abstract <T> java.lang.reflect.Constructor<T> getCanonicalRecordConstructor(java.lang.Class<T> r1);

        abstract java.lang.String[] getRecordComponentNames(java.lang.Class<?> r1);

        abstract boolean isRecord(java.lang.Class<?> r1);
    }

    private static class RecordNotSupportedHelper extends com.google.gson.internal.reflect.ReflectionHelper.RecordHelper {
        private RecordNotSupportedHelper() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ RecordNotSupportedHelper(com.google.gson.internal.reflect.ReflectionHelper.C04681 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public java.lang.reflect.Method getAccessor(java.lang.Class<?> r3, java.lang.reflect.Field r4) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Records are not supported on this JVM, this method should not be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        <T> java.lang.reflect.Constructor<T> getCanonicalRecordConstructor(java.lang.Class<T> r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Records are not supported on this JVM, this method should not be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        java.lang.String[] getRecordComponentNames(java.lang.Class<?> r3) {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Records are not supported on this JVM, this method should not be called"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean isRecord(java.lang.Class<?> r2) {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    private static class RecordSupportedHelper extends com.google.gson.internal.reflect.ReflectionHelper.RecordHelper {
        private final java.lang.reflect.Method getName;
        private final java.lang.reflect.Method getRecordComponents;
        private final java.lang.reflect.Method getType;
        private final java.lang.reflect.Method isRecord;

        private RecordSupportedHelper() throws java.lang.NoSuchMethodException {
                r4 = this;
                r0 = 0
                r4.<init>(r0)
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                r1 = 0
                java.lang.Class[] r2 = new java.lang.Class[r1]
                java.lang.String r3 = "isRecord"
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                r4.isRecord = r0
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                java.lang.String r2 = "getRecordComponents"
                java.lang.Class[] r3 = new java.lang.Class[r1]
                java.lang.reflect.Method r0 = r0.getMethod(r2, r3)
                r4.getRecordComponents = r0
                java.lang.reflect.Method r0 = r4.getRecordComponents
                java.lang.Class r0 = r0.getReturnType()
                java.lang.Class r0 = r0.getComponentType()
                java.lang.String r2 = "getName"
                java.lang.Class[] r3 = new java.lang.Class[r1]
                java.lang.reflect.Method r2 = r0.getMethod(r2, r3)
                r4.getName = r2
                java.lang.String r2 = "getType"
                java.lang.Class[] r1 = new java.lang.Class[r1]
                java.lang.reflect.Method r1 = r0.getMethod(r2, r1)
                r4.getType = r1
                return
        }

        /* synthetic */ RecordSupportedHelper(com.google.gson.internal.reflect.ReflectionHelper.C04681 r1) throws java.lang.NoSuchMethodException {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public java.lang.reflect.Method getAccessor(java.lang.Class<?> r3, java.lang.reflect.Field r4) {
                r2 = this;
                java.lang.String r0 = r4.getName()     // Catch: java.lang.ReflectiveOperationException -> Lc
                r1 = 0
                java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> Lc
                java.lang.reflect.Method r0 = r3.getMethod(r0, r1)     // Catch: java.lang.ReflectiveOperationException -> Lc
                return r0
            Lc:
                r0 = move-exception
                java.lang.RuntimeException r1 = com.google.gson.internal.reflect.ReflectionHelper.access$300(r0)
                throw r1
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        public <T> java.lang.reflect.Constructor<T> getCanonicalRecordConstructor(java.lang.Class<T> r8) {
                r7 = this;
                java.lang.reflect.Method r0 = r7.getRecordComponents     // Catch: java.lang.ReflectiveOperationException -> L28
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L28
                java.lang.Object r0 = r0.invoke(r8, r2)     // Catch: java.lang.ReflectiveOperationException -> L28
                java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.ReflectiveOperationException -> L28
                int r2 = r0.length     // Catch: java.lang.ReflectiveOperationException -> L28
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L28
                r3 = 0
            Lf:
                int r4 = r0.length     // Catch: java.lang.ReflectiveOperationException -> L28
                if (r3 >= r4) goto L23
                java.lang.reflect.Method r4 = r7.getType     // Catch: java.lang.ReflectiveOperationException -> L28
                r5 = r0[r3]     // Catch: java.lang.ReflectiveOperationException -> L28
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L28
                java.lang.Object r4 = r4.invoke(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L28
                java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.ReflectiveOperationException -> L28
                r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L28
                int r3 = r3 + 1
                goto Lf
            L23:
                java.lang.reflect.Constructor r1 = r8.getDeclaredConstructor(r2)     // Catch: java.lang.ReflectiveOperationException -> L28
                return r1
            L28:
                r0 = move-exception
                java.lang.RuntimeException r1 = com.google.gson.internal.reflect.ReflectionHelper.access$300(r0)
                throw r1
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        java.lang.String[] getRecordComponentNames(java.lang.Class<?> r8) {
                r7 = this;
                java.lang.reflect.Method r0 = r7.getRecordComponents     // Catch: java.lang.ReflectiveOperationException -> L24
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L24
                java.lang.Object r0 = r0.invoke(r8, r2)     // Catch: java.lang.ReflectiveOperationException -> L24
                java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.ReflectiveOperationException -> L24
                int r2 = r0.length     // Catch: java.lang.ReflectiveOperationException -> L24
                java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.ReflectiveOperationException -> L24
                r3 = 0
            Lf:
                int r4 = r0.length     // Catch: java.lang.ReflectiveOperationException -> L24
                if (r3 >= r4) goto L23
                java.lang.reflect.Method r4 = r7.getName     // Catch: java.lang.ReflectiveOperationException -> L24
                r5 = r0[r3]     // Catch: java.lang.ReflectiveOperationException -> L24
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L24
                java.lang.Object r4 = r4.invoke(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> L24
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ReflectiveOperationException -> L24
                r2[r3] = r4     // Catch: java.lang.ReflectiveOperationException -> L24
                int r3 = r3 + 1
                goto Lf
            L23:
                return r2
            L24:
                r0 = move-exception
                java.lang.RuntimeException r1 = com.google.gson.internal.reflect.ReflectionHelper.access$300(r0)
                throw r1
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.RecordHelper
        boolean isRecord(java.lang.Class<?> r3) {
                r2 = this;
                java.lang.reflect.Method r0 = r2.isRecord     // Catch: java.lang.ReflectiveOperationException -> L10
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L10
                java.lang.Object r0 = r0.invoke(r3, r1)     // Catch: java.lang.ReflectiveOperationException -> L10
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ReflectiveOperationException -> L10
                boolean r0 = r0.booleanValue()     // Catch: java.lang.ReflectiveOperationException -> L10
                return r0
            L10:
                r0 = move-exception
                java.lang.RuntimeException r1 = com.google.gson.internal.reflect.ReflectionHelper.access$300(r0)
                throw r1
        }
    }

    static {
            r0 = 0
            com.google.gson.internal.reflect.ReflectionHelper$RecordSupportedHelper r1 = new com.google.gson.internal.reflect.ReflectionHelper$RecordSupportedHelper     // Catch: java.lang.NoSuchMethodException -> L8
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L8
            r0 = r1
            goto Lf
        L8:
            r1 = move-exception
            com.google.gson.internal.reflect.ReflectionHelper$RecordNotSupportedHelper r2 = new com.google.gson.internal.reflect.ReflectionHelper$RecordNotSupportedHelper
            r2.<init>(r0)
            r0 = r2
        Lf:
            com.google.gson.internal.reflect.ReflectionHelper.RECORD_HELPER = r0
            return
    }

    private ReflectionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.RuntimeException access$300(java.lang.ReflectiveOperationException r1) {
            java.lang.RuntimeException r0 = createExceptionForRecordReflectionException(r1)
            return r0
    }

    private static void appendExecutableParameters(java.lang.reflect.AccessibleObject r3, java.lang.StringBuilder r4) {
            r0 = 40
            r4.append(r0)
            boolean r0 = r3 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L11
            r0 = r3
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class[] r0 = r0.getParameterTypes()
            goto L18
        L11:
            r0 = r3
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.Class[] r0 = r0.getParameterTypes()
        L18:
            r1 = 0
        L1a:
            int r2 = r0.length
            if (r1 >= r2) goto L30
            if (r1 <= 0) goto L24
            java.lang.String r2 = ", "
            r4.append(r2)
        L24:
            r2 = r0[r1]
            java.lang.String r2 = r2.getSimpleName()
            r4.append(r2)
            int r1 = r1 + 1
            goto L1a
        L30:
            r1 = 41
            r4.append(r1)
            return
    }

    public static java.lang.String constructorToString(java.lang.reflect.Constructor<?> r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.<init>(r1)
            appendExecutableParameters(r2, r0)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.RuntimeException createExceptionForRecordReflectionException(java.lang.ReflectiveOperationException r2) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior."
            r0.<init>(r1, r2)
            throw r0
    }

    public static java.lang.RuntimeException createExceptionForUnexpectedIllegalAccess(java.lang.IllegalAccessException r2) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            r0.<init>(r1, r2)
            throw r0
    }

    public static java.lang.String fieldToString(java.lang.reflect.Field r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String getAccessibleObjectDescription(java.lang.reflect.AccessibleObject r6, boolean r7) {
            boolean r0 = r6 instanceof java.lang.reflect.Field
            java.lang.String r1 = "'"
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "field '"
            java.lang.StringBuilder r0 = r0.append(r2)
            r2 = r6
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.String r2 = fieldToString(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto La1
        L26:
            boolean r0 = r6 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L67
            r0 = r6
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = r0.getName()
            r2.<init>(r3)
            appendExecutableParameters(r0, r2)
            java.lang.String r3 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "method '"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.Class r5 = r0.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "#"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r0 = r1.toString()
            goto La1
        L67:
            boolean r0 = r6 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L8a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "constructor '"
            java.lang.StringBuilder r0 = r0.append(r2)
            r2 = r6
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.String r2 = constructorToString(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto La1
        L8a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<unknown AccessibleObject> "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        La1:
            if (r7 == 0) goto Lcc
            r1 = 0
            char r2 = r0.charAt(r1)
            boolean r2 = java.lang.Character.isLowerCase(r2)
            if (r2 == 0) goto Lcc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r1 = r0.charAt(r1)
            char r1 = java.lang.Character.toUpperCase(r1)
            java.lang.StringBuilder r1 = r2.append(r1)
            r2 = 1
            java.lang.String r2 = r0.substring(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
        Lcc:
            return r0
    }

    public static java.lang.reflect.Method getAccessor(java.lang.Class<?> r1, java.lang.reflect.Field r2) {
            com.google.gson.internal.reflect.ReflectionHelper$RecordHelper r0 = com.google.gson.internal.reflect.ReflectionHelper.RECORD_HELPER
            java.lang.reflect.Method r0 = r0.getAccessor(r1, r2)
            return r0
    }

    public static <T> java.lang.reflect.Constructor<T> getCanonicalRecordConstructor(java.lang.Class<T> r1) {
            com.google.gson.internal.reflect.ReflectionHelper$RecordHelper r0 = com.google.gson.internal.reflect.ReflectionHelper.RECORD_HELPER
            java.lang.reflect.Constructor r0 = r0.getCanonicalRecordConstructor(r1)
            return r0
    }

    public static java.lang.String[] getRecordComponentNames(java.lang.Class<?> r1) {
            com.google.gson.internal.reflect.ReflectionHelper$RecordHelper r0 = com.google.gson.internal.reflect.ReflectionHelper.RECORD_HELPER
            java.lang.String[] r0 = r0.getRecordComponentNames(r1)
            return r0
    }

    public static boolean isRecord(java.lang.Class<?> r1) {
            com.google.gson.internal.reflect.ReflectionHelper$RecordHelper r0 = com.google.gson.internal.reflect.ReflectionHelper.RECORD_HELPER
            boolean r0 = r0.isRecord(r1)
            return r0
    }

    public static void makeAccessible(java.lang.reflect.AccessibleObject r5) throws com.google.gson.JsonIOException {
            r0 = 1
            r5.setAccessible(r0)     // Catch: java.lang.Exception -> L6
            return
        L6:
            r0 = move-exception
            r1 = 0
            java.lang.String r1 = getAccessibleObjectDescription(r5, r1)
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed making "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            throw r2
    }

    public static java.lang.String tryMakeAccessible(java.lang.reflect.Constructor<?> r3) {
            r0 = 1
            r3.setAccessible(r0)     // Catch: java.lang.Exception -> L6
            r0 = 0
            return r0
        L6:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed making constructor '"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = constructorToString(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
