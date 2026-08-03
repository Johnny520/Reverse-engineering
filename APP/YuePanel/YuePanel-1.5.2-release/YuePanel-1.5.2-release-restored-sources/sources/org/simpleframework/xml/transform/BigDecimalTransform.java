package org.simpleframework.xml.transform;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
class BigDecimalTransform implements Transform<BigDecimal> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public BigDecimal read(String str) {
        return new BigDecimal(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(BigDecimal bigDecimal) {
        return bigDecimal.toString();
    }
}
