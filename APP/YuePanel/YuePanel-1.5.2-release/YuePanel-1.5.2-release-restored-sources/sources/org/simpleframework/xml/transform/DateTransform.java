package org.simpleframework.xml.transform;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
class DateTransform<T extends Date> implements Transform<T> {
    private final DateFactory<T> factory;

    public DateTransform(Class<T> cls) throws Exception {
        this.factory = new DateFactory<>(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public synchronized T read(String str) throws Exception {
        return (T) this.factory.getInstance(Long.valueOf(DateType.getDate(str).getTime()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public synchronized String write(T t) throws Exception {
        return DateType.getText(t);
    }
}
