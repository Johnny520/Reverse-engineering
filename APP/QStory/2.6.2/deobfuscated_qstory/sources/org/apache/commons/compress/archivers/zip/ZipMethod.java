package org.apache.commons.compress.archivers.zip;

import com.alibaba.fastjson2.reader.C2699;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum ZipMethod {
    STORED(0),
    UNSHRINKING(1),
    EXPANDING_LEVEL_1(2),
    EXPANDING_LEVEL_2(3),
    EXPANDING_LEVEL_3(4),
    EXPANDING_LEVEL_4(5),
    IMPLODING(6),
    TOKENIZATION(7),
    DEFLATED(8),
    ENHANCED_DEFLATED(9),
    PKWARE_IMPLODING(10),
    BZIP2(12),
    LZMA(14),
    ZSTD_DEPRECATED(20),
    ZSTD(93),
    XZ(95),
    JPEG(96),
    WAVPACK(97),
    PPMD(98),
    AES_ENCRYPTED(99),
    UNKNOWN;

    static final int UNKNOWN_CODE = -1;
    private static final Map<Integer, ZipMethod> codeToEnum = Collections.unmodifiableMap((Map) Stream.of((Object[]) values()).collect(Collectors.toMap(new C2699(13), Function.identity())));
    private final int code;

    ZipMethod(int i) {
        this.code = i;
    }

    public static ZipMethod getMethodByCode(int i) {
        return codeToEnum.get(Integer.valueOf(i));
    }

    public static boolean isZstd(int i) {
        return i == ZSTD.getCode() || i == ZSTD_DEPRECATED.getCode();
    }

    public int getCode() {
        return this.code;
    }

    ZipMethod() {
        this(-1);
    }
}
