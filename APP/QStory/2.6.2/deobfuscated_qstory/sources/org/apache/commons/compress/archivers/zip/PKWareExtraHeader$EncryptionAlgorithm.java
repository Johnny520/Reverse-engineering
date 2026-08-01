package org.apache.commons.compress.archivers.zip;

import com.android.dx.io.Opcodes;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum PKWareExtraHeader$EncryptionAlgorithm {
    DES(26113),
    RC2pre52(26114),
    TripleDES168(26115),
    TripleDES192(26121),
    AES128(26126),
    AES192(26127),
    AES256(26128),
    RC2(26370),
    RC4(26625),
    UNKNOWN(Opcodes.MAX_VALUE);

    private static final Map<Integer, PKWareExtraHeader$EncryptionAlgorithm> codeToEnum;
    private final int code;

    static {
        HashMap map = new HashMap();
        for (PKWareExtraHeader$EncryptionAlgorithm pKWareExtraHeader$EncryptionAlgorithm : values()) {
            map.put(Integer.valueOf(pKWareExtraHeader$EncryptionAlgorithm.getCode()), pKWareExtraHeader$EncryptionAlgorithm);
        }
        codeToEnum = Collections.unmodifiableMap(map);
    }

    PKWareExtraHeader$EncryptionAlgorithm(int i) {
        this.code = i;
    }

    public static PKWareExtraHeader$EncryptionAlgorithm getAlgorithmByCode(int i) {
        return codeToEnum.get(Integer.valueOf(i));
    }

    public int getCode() {
        return this.code;
    }
}
