package org.simpleframework.xml.transform;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
class AtomicIntegerTransform implements Transform<AtomicInteger> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public AtomicInteger read(String str) {
        return new AtomicInteger(Integer.valueOf(str).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(AtomicInteger atomicInteger) {
        return atomicInteger.toString();
    }
}
