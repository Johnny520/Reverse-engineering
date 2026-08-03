package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.BeanUtils;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static PropertyNamingStrategy m1688of(String str) {
        int i9;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String snakeToCamel(String str) {
        if (str == null || str.indexOf(95) == -1) {
            return str;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (str.charAt(i10) == '_') {
                i9++;
            }
        }
        char[] cArr = new char[str.length() - i9];
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '_') {
                if (i12 > 0 && str.charAt(i12 - 1) == '_' && cCharAt >= 'a' && cCharAt <= 'z') {
                    cCharAt = (char) (cCharAt - ' ');
                }
                cArr[i11] = cCharAt;
                i11++;
            }
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String fieldName(String str) {
        return BeanUtils.fieldName(str, name());
    }
}
