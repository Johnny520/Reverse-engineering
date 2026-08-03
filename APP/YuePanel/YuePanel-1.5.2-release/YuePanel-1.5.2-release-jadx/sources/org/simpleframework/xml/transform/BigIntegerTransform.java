package org.simpleframework.xml.transform;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
class BigIntegerTransform implements Transform<BigInteger> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public BigInteger read(String str) {
        return new BigInteger(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(BigInteger bigInteger) {
        return bigInteger.toString();
    }
}
