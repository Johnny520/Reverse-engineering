package org.simpleframework.xml.transform;

import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
class GregorianCalendarTransform implements Transform<GregorianCalendar> {
    private final DateTransform transform;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GregorianCalendarTransform() throws Exception {
        this(Date.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public GregorianCalendarTransform(Class cls) throws Exception {
        this.transform = new DateTransform(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public GregorianCalendar read(String str) throws Exception {
        return read(this.transform.read(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(GregorianCalendar gregorianCalendar) throws Exception {
        return this.transform.write(gregorianCalendar.getTime());
    }

    private GregorianCalendar read(Date date) throws Exception {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (date != null) {
            gregorianCalendar.setTime(date);
        }
        return gregorianCalendar;
    }
}
