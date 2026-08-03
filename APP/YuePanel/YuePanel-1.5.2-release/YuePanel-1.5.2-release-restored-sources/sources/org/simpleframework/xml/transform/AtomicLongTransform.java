package org.simpleframework.xml.transform;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
class AtomicLongTransform implements Transform<AtomicLong> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public AtomicLong read(String str) {
        return new AtomicLong(Long.valueOf(str).longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(AtomicLong atomicLong) {
        return atomicLong.toString();
    }
}
