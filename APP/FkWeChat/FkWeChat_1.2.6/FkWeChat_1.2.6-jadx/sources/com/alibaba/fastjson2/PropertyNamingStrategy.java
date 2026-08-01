package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.BeanUtils;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public enum PropertyNamingStrategy {
    CamelCase,
    CamelCase1x,
    PascalCase,
    SnakeCase,
    UpperCase,
    UpperCamelCaseWithSpaces,
    UpperCamelCaseWithUnderScores,
    UpperCamelCaseWithDashes,
    UpperCamelCaseWithDots,
    KebabCase,
    UpperCaseWithUnderScores,
    UpperCaseWithDashes,
    UpperCaseWithDots,
    LowerCase,
    LowerCaseWithUnderScores,
    LowerCaseWithDashes,
    LowerCaseWithDots,
    NeverUseThisValueExceptDefaultValue;

    /* JADX INFO: renamed from: of */
    public static PropertyNamingStrategy m6251of(String str) {
        int i10;
        if (str == null || str.isEmpty()) {
            return null;
        }
        switch (str) {
            case "Camel":
            case "camel":
                return CamelCase;
            case "Lower":
            case "lower":
                return LowerCase;
            case "Upper":
            case "upper":
                return UpperCase;
            default:
                for (PropertyNamingStrategy propertyNamingStrategy : values()) {
                    if (propertyNamingStrategy.name().equals(str)) {
                        return propertyNamingStrategy;
                    }
                }
                return null;
        }
    }

    public static String snakeToCamel(String str) {
        if (str == null || str.indexOf(95) == -1) {
            return str;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '_') {
                i10++;
            }
        }
        char[] cArr = new char[str.length() - i10];
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (cCharAt != '_') {
                if (i13 > 0 && str.charAt(i13 - 1) == '_' && cCharAt >= 'a' && cCharAt <= 'z') {
                    cCharAt = (char) (cCharAt - ' ');
                }
                cArr[i12] = cCharAt;
                i12++;
            }
        }
        return new String(cArr);
    }

    public String fieldName(String str) {
        return BeanUtils.fieldName(str, name());
    }
}
