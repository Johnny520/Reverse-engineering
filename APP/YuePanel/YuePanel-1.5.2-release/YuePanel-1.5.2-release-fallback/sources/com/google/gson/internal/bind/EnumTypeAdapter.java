package com.google.gson.internal.bind;

import java.lang.Enum;

/* JADX INFO: loaded from: classes2.dex */
class EnumTypeAdapter<T extends java.lang.Enum<T>> extends com.google.gson.TypeAdapter<T> {
    static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.util.Map<T, java.lang.String> constantToName;
    private final java.util.Map<java.lang.String, T> nameToConstant;
    private final java.util.Map<java.lang.String, T> stringToConstant;


    static {
            com.google.gson.internal.bind.EnumTypeAdapter$1 r0 = new com.google.gson.internal.bind.EnumTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.bind.EnumTypeAdapter.FACTORY = r0
            return
    }

    private EnumTypeAdapter(java.lang.Class<T> r12) {
            r11 = this;
            r11.<init>()
            java.lang.reflect.Field[] r12 = r12.getDeclaredFields()     // Catch: java.lang.IllegalAccessException -> L1b
            int r0 = r12.length     // Catch: java.lang.IllegalAccessException -> L1b
            r1 = 0
            r2 = r1
            r3 = r2
        Lb:
            if (r2 >= r0) goto L20
            r4 = r12[r2]     // Catch: java.lang.IllegalAccessException -> L1b
            boolean r5 = r4.isEnumConstant()     // Catch: java.lang.IllegalAccessException -> L1b
            if (r5 == 0) goto L1d
            int r5 = r3 + 1
            r12[r3] = r4     // Catch: java.lang.IllegalAccessException -> L1b
            r3 = r5
            goto L1d
        L1b:
            r12 = move-exception
            goto L8b
        L1d:
            int r2 = r2 + 1
            goto Lb
        L20:
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r3)     // Catch: java.lang.IllegalAccessException -> L1b
            java.lang.reflect.Field[] r12 = (java.lang.reflect.Field[]) r12     // Catch: java.lang.IllegalAccessException -> L1b
            int r0 = calculateHashMapCapacity(r3)     // Catch: java.lang.IllegalAccessException -> L1b
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.IllegalAccessException -> L1b
            r2.<init>(r0)     // Catch: java.lang.IllegalAccessException -> L1b
            r11.nameToConstant = r2     // Catch: java.lang.IllegalAccessException -> L1b
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.IllegalAccessException -> L1b
            r2.<init>(r0)     // Catch: java.lang.IllegalAccessException -> L1b
            r11.stringToConstant = r2     // Catch: java.lang.IllegalAccessException -> L1b
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.IllegalAccessException -> L1b
            r2.<init>(r0)     // Catch: java.lang.IllegalAccessException -> L1b
            r11.constantToName = r2     // Catch: java.lang.IllegalAccessException -> L1b
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r12, r0)     // Catch: java.lang.IllegalAccessException -> L1b
            int r0 = r12.length     // Catch: java.lang.IllegalAccessException -> L1b
            r2 = r1
        L45:
            if (r2 >= r0) goto L8a
            r3 = r12[r2]     // Catch: java.lang.IllegalAccessException -> L1b
            r4 = 0
            java.lang.Object r4 = r3.get(r4)     // Catch: java.lang.IllegalAccessException -> L1b
            java.lang.Enum r4 = (java.lang.Enum) r4     // Catch: java.lang.IllegalAccessException -> L1b
            java.lang.String r5 = r4.name()     // Catch: java.lang.IllegalAccessException -> L1b
            java.lang.String r6 = r4.toString()     // Catch: java.lang.IllegalAccessException -> L1b
            java.lang.Class<com.google.gson.annotations.SerializedName> r7 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r3 = r3.getAnnotation(r7)     // Catch: java.lang.IllegalAccessException -> L1b
            com.google.gson.annotations.SerializedName r3 = (com.google.gson.annotations.SerializedName) r3     // Catch: java.lang.IllegalAccessException -> L1b
            if (r3 == 0) goto L78
            java.lang.String r5 = r3.value()     // Catch: java.lang.IllegalAccessException -> L1b
            java.lang.String[] r3 = r3.alternate()     // Catch: java.lang.IllegalAccessException -> L1b
            int r7 = r3.length     // Catch: java.lang.IllegalAccessException -> L1b
            r8 = r1
        L6c:
            if (r8 >= r7) goto L78
            r9 = r3[r8]     // Catch: java.lang.IllegalAccessException -> L1b
            java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r10 = r11.nameToConstant     // Catch: java.lang.IllegalAccessException -> L1b
            r10.put(r9, r4)     // Catch: java.lang.IllegalAccessException -> L1b
            int r8 = r8 + 1
            goto L6c
        L78:
            java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r3 = r11.nameToConstant     // Catch: java.lang.IllegalAccessException -> L1b
            r3.put(r5, r4)     // Catch: java.lang.IllegalAccessException -> L1b
            java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r3 = r11.stringToConstant     // Catch: java.lang.IllegalAccessException -> L1b
            r3.put(r6, r4)     // Catch: java.lang.IllegalAccessException -> L1b
            java.util.Map<T extends java.lang.Enum<T>, java.lang.String> r3 = r11.constantToName     // Catch: java.lang.IllegalAccessException -> L1b
            r3.put(r4, r5)     // Catch: java.lang.IllegalAccessException -> L1b
            int r2 = r2 + 1
            goto L45
        L8a:
            return
        L8b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
    }

    public /* synthetic */ EnumTypeAdapter(java.lang.Class r1, com.google.gson.internal.bind.EnumTypeAdapter.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static int calculateHashMapCapacity(int r2) {
            float r2 = (float) r2
            r0 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 / r0
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            int r2 = (int) r0
            return r2
    }

    @Override // com.google.gson.TypeAdapter
    public T read(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r3.nextNull()
            r3 = 0
            return r3
        Ld:
            java.lang.String r3 = r3.nextString()
            java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r0 = r2.nameToConstant
            java.lang.Object r0 = r0.get(r3)
            java.lang.Enum r0 = (java.lang.Enum) r0
            if (r0 != 0) goto L24
            java.util.Map<java.lang.String, T extends java.lang.Enum<T>> r0 = r2.stringToConstant
            java.lang.Object r3 = r0.get(r3)
            r0 = r3
            java.lang.Enum r0 = (java.lang.Enum) r0
        L24:
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.lang.Enum r1 = r0.read(r1)
            return r1
    }

    public void write(com.google.gson.stream.JsonWriter r2, T r3) throws java.io.IOException {
            r1 = this;
            if (r3 != 0) goto L4
            r3 = 0
            goto Lc
        L4:
            java.util.Map<T extends java.lang.Enum<T>, java.lang.String> r0 = r1.constantToName
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
        Lc:
            r2.value(r3)
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException {
            r0 = this;
            java.lang.Enum r2 = (java.lang.Enum) r2
            r0.write(r1, r2)
            return
    }
}
