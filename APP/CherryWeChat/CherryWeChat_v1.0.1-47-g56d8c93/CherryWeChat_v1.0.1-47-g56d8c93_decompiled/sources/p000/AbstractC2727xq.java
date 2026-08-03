package p000;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: renamed from: xq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2727xq {

    /* JADX INFO: renamed from: a */
    public static final Object f9314a;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
        f9314a = new Object();
    }
}
