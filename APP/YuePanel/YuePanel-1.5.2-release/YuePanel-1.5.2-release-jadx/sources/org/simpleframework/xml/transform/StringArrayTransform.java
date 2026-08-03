package org.simpleframework.xml.transform;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
class StringArrayTransform implements Transform<String[]> {
    private final Pattern pattern;
    private final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public StringArrayTransform() {
        this(",");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public StringArrayTransform(String str) {
        this.pattern = Pattern.compile(str);
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public String[] read(String str) {
        return read(str, this.token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(String[] strArr) {
        return write(strArr, this.token);
    }

    private String[] read(String str, String str2) {
        String[] strArrSplit = this.pattern.split(str);
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            if (str3 != null) {
                strArrSplit[i] = str3.trim();
            }
        }
        return strArrSplit;
    }

    private String write(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            if (str2 != null) {
                if (sb.length() > 0) {
                    sb.append(str);
                    sb.append(' ');
                }
                sb.append(str2);
            }
        }
        return sb.toString();
    }
}
