package com.github.megatronking.stringfog;

/* JADX INFO: loaded from: classes.dex */
public final class StringFogWrapper implements com.github.megatronking.stringfog.IStringFog {
    private final com.github.megatronking.stringfog.IStringFog mStringFogImpl;

    public StringFogWrapper(java.lang.String r4) {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = java.lang.Class.forName(r4)     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.ClassNotFoundException -> L4d
            r1 = 0
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.ClassNotFoundException -> L4d
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.ClassNotFoundException -> L4d
            com.github.megatronking.stringfog.IStringFog r0 = (com.github.megatronking.stringfog.IStringFog) r0     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.ClassNotFoundException -> L4d
            r3.mStringFogImpl = r0     // Catch: java.lang.NoSuchMethodException -> L15 java.lang.reflect.InvocationTargetException -> L17 java.lang.IllegalAccessException -> L19 java.lang.InstantiationException -> L1b java.lang.ClassNotFoundException -> L4d
            return
        L15:
            r4 = move-exception
            goto L1d
        L17:
            r4 = move-exception
            goto L1d
        L19:
            r4 = move-exception
            goto L1d
        L1b:
            r4 = move-exception
            goto L35
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Stringfog implementation class create instance failed: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L35:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Stringfog implementation class new instance failed: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Stringfog implementation class not found: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public java.lang.String decrypt(byte[] r2, byte[] r3) {
            r1 = this;
            com.github.megatronking.stringfog.IStringFog r0 = r1.mStringFogImpl
            if (r0 != 0) goto La
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            return r3
        La:
            java.lang.String r2 = r0.decrypt(r2, r3)
            return r2
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public byte[] encrypt(java.lang.String r2, byte[] r3) {
            r1 = this;
            com.github.megatronking.stringfog.IStringFog r0 = r1.mStringFogImpl
            if (r0 != 0) goto L9
            byte[] r2 = r2.getBytes()
            return r2
        L9:
            byte[] r2 = r0.encrypt(r2, r3)
            return r2
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public boolean shouldFog(java.lang.String r2) {
            r1 = this;
            com.github.megatronking.stringfog.IStringFog r0 = r1.mStringFogImpl
            if (r0 == 0) goto Lc
            boolean r2 = r0.shouldFog(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }
}
