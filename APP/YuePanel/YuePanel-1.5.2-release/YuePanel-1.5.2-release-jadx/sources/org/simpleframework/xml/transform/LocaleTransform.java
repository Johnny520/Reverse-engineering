package org.simpleframework.xml.transform;

import java.util.Locale;
import java.util.regex.Pattern;
import net.bytebuddy.utility.JavaConstant;

/* JADX INFO: loaded from: classes2.dex */
class LocaleTransform implements Transform<Locale> {
    private final Pattern pattern = Pattern.compile(JavaConstant.Dynamic.DEFAULT_NAME);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public Locale read(String str) throws Exception {
        String[] strArrSplit = this.pattern.split(str);
        if (strArrSplit.length >= 1) {
            return read(strArrSplit);
        }
        throw new InvalidFormatException("Invalid locale %s", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(Locale locale) {
        return locale.toString();
    }

    private Locale read(String[] strArr) throws Exception {
        String[] strArr2 = new String[3];
        strArr2[0] = "";
        strArr2[1] = "";
        strArr2[2] = "";
        for (int i = 0; i < 3; i++) {
            if (i < strArr.length) {
                strArr2[i] = strArr[i];
            }
        }
        return new Locale(strArr2[0], strArr2[1], strArr2[2]);
    }
}
