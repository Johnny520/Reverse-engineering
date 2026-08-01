package org.apache.commons.compress.archivers.zip;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum PKWareExtraHeader$HashAlgorithm {
    NONE(0),
    CRC32(1),
    MD5(32771),
    SHA1(32772),
    RIPEND160(32775),
    SHA256(32780),
    SHA384(32781),
    SHA512(32782);

    private static final Map<Integer, PKWareExtraHeader$HashAlgorithm> codeToEnum;
    private final int code;

    static {
        HashMap map = new HashMap();
        for (PKWareExtraHeader$HashAlgorithm pKWareExtraHeader$HashAlgorithm : values()) {
            map.put(Integer.valueOf(pKWareExtraHeader$HashAlgorithm.getCode()), pKWareExtraHeader$HashAlgorithm);
        }
        codeToEnum = Collections.unmodifiableMap(map);
    }

    PKWareExtraHeader$HashAlgorithm(int i) {
        this.code = i;
    }

    public static PKWareExtraHeader$HashAlgorithm getAlgorithmByCode(int i) {
        return codeToEnum.get(Integer.valueOf(i));
    }

    public int getCode() {
        return this.code;
    }
}
