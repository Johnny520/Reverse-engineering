// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import com.google.zxing.DecodeHintType;
import java.util.Map;

public final class CLS361 {
    public static final String FLD1635;
    public static final boolean FLD1636;

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    static {
        CLS361.FLD1635 = "UTF-8";
        CLS361.FLD1636 = false;
    }

    // 此方法包含解密的字符串
    public static String MTH4977(byte[] arr_b, Map map0) {
        if(map0 != null) {
            DecodeHintType decodeHintType0 = DecodeHintType.CHARACTER_SET;
            if(map0.containsKey(decodeHintType0)) {
                return map0.get(decodeHintType0).toString();
            }
        }
        boolean z = true;
        int v = 0;
        boolean z1 = arr_b.length > 3 && arr_b[0] == -17 && arr_b[1] == -69 && arr_b[2] == -65;
        int v1 = 0;
        boolean z2 = true;
        boolean z3 = true;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = 0;
        int v11 = 0;
        while(v2 < arr_b.length && (z || z2 || z3)) {
            int v12 = arr_b[v2] & 0xFF;
            if(z3) {
                if(v3 > 0) {
                    if((v12 & 0x80) == 0) {
                        z3 = false;
                    }
                    else {
                        --v3;
                    }
                }
                else if((v12 & 0x80) != 0) {
                    if((v12 & 0x40) != 0) {
                        ++v3;
                        if((v12 & 0x20) == 0) {
                            ++v5;
                            goto label_44;
                        }
                        else {
                            ++v3;
                            if((v12 & 16) == 0) {
                                ++v6;
                                goto label_44;
                            }
                            else {
                                ++v3;
                                if((v12 & 8) == 0) {
                                    ++v7;
                                    goto label_44;
                                }
                            }
                        }
                    }
                    z3 = false;
                }
            }
        label_44:
            if(z) {
                if(v12 > 0x7F && v12 < 0xA0) {
                    z = false;
                }
                else if(v12 > 0x9F && (v12 < 0xC0 || v12 == 0xD7 || v12 == 0xF7)) {
                    ++v9;
                }
            }
            if(z2) {
                if(v4 <= 0) {
                    if(v12 != 0x80 && v12 != 0xA0 && v12 <= 0xEF) {
                        if(v12 <= 0xA0 || v12 >= 0xE0) {
                            if(v12 > 0x7F) {
                                ++v4;
                                if(v10 + 1 > v) {
                                    v = v10 + 1;
                                    v10 = v;
                                }
                                else {
                                    ++v10;
                                }
                            }
                            else {
                                v10 = 0;
                            }
                            v11 = 0;
                        }
                        else {
                            ++v1;
                            if(v11 + 1 > v8) {
                                v8 = v11 + 1;
                                v11 = v8;
                            }
                            else {
                                ++v11;
                            }
                            v10 = 0;
                        }
                        goto label_77;
                    }
                }
                else if(v12 >= 0x40 && v12 != 0x7F && v12 <= 0xFC) {
                    --v4;
                    goto label_77;
                }
                z2 = false;
            }
        label_77:
            ++v2;
        }
        if(z3 && v3 > 0) {
            z3 = false;
        }
        if(z2 && v4 > 0) {
            z2 = false;
        }
        if(z3 && (z1 || v5 + v6 + v7 > 0)) {
            return "UTF8";
        }
        if(z2 && (CLS361.FLD1636 || v8 >= 3 || v >= 3)) {
            return "SJIS";
        }
        if(z && z2) {
            return (v8 != 2 || v1 != 2) && v9 * 10 < arr_b.length ? "ISO8859_1" : "SJIS";
        }
        if(z) {
            return "ISO8859_1";
        }
        if(z2) {
            return "SJIS";
        }
        return z3 ? "UTF8" : "UTF-8";
    }
}

