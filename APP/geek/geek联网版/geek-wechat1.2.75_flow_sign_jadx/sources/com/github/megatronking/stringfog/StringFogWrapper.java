package com.github.megatronking.stringfog;

import java.lang.reflect.InvocationTargetException;
import p000.g40;

/* JADX INFO: loaded from: classes.dex */
public final class StringFogWrapper implements IStringFog {
    private final IStringFog mStringFogImpl;

    public StringFogWrapper(String str) {
        try {
            this.mStringFogImpl = (IStringFog) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException(g40.m1155r("Stringfog implementation class not found: ", str));
        } catch (IllegalAccessException e) {
            e = e;
            throw new IllegalArgumentException(g40.m1155r("Stringfog implementation class create instance failed: ", e.getMessage()));
        } catch (InstantiationException e2) {
            throw new IllegalArgumentException(g40.m1155r("Stringfog implementation class new instance failed: ", e2.getMessage()));
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new IllegalArgumentException(g40.m1155r("Stringfog implementation class create instance failed: ", e.getMessage()));
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new IllegalArgumentException(g40.m1155r("Stringfog implementation class create instance failed: ", e.getMessage()));
        }
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public String decrypt(byte[] bArr, byte[] bArr2) {
        IStringFog iStringFog = this.mStringFogImpl;
        return iStringFog == null ? new String(bArr) : iStringFog.decrypt(bArr, bArr2);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public byte[] encrypt(String str, byte[] bArr) {
        IStringFog iStringFog = this.mStringFogImpl;
        return iStringFog == null ? str.getBytes() : iStringFog.encrypt(str, bArr);
    }

    @Override // com.github.megatronking.stringfog.IStringFog
    public boolean shouldFog(String str) {
        IStringFog iStringFog = this.mStringFogImpl;
        return iStringFog != null && iStringFog.shouldFog(str);
    }
}
