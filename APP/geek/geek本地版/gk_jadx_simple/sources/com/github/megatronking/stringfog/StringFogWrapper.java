package com.github.megatronking.stringfog;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class StringFogWrapper implements IStringFog {
    private final IStringFog mStringFogImpl;

    public StringFogWrapper(String r4) {
        this.mStringFogImpl = (IStringFog) Class.forName(r4).getDeclaredConstructor(null).newInstance(null);     // Catch: NoSuchMethodException -> L5 InvocationTargetException -> L7 IllegalAccessException -> L9 InstantiationException -> L11 ClassNotFoundException -> L17
        return;
    L9:
        e = e;
    L14:
        throw new IllegalArgumentException("Stringfog implementation class create instance failed: " + e.getMessage());
    L11:
        e = move-exception;
        throw new IllegalArgumentException("Stringfog implementation class new instance failed: " + e.getMessage());
    L5:
        e = e;
    L7:
        e = e;
    L18:
        throw new IllegalArgumentException("Stringfog implementation class not found: " + r4);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public String decrypt(byte[] r2, byte[] r3) {
        IStringFog r0 = this.mStringFogImpl;
        if (r0 != null) goto L7;
        return new String(r2);
    L7:
        return r0.decrypt(r2, r3);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public byte[] encrypt(String r2, byte[] r3) {
        IStringFog r0 = this.mStringFogImpl;
        if (r0 != null) goto L7;
        return r2.getBytes();
    L7:
        return r0.encrypt(r2, r3);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public boolean shouldFog(String r2) {
        IStringFog r0 = this.mStringFogImpl;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.shouldFog(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }
}
