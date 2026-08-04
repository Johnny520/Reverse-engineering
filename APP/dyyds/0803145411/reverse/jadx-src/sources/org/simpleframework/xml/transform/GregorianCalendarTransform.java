package org.simpleframework.xml.transform;

import java.util.Date;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class GregorianCalendarTransform implements Transform<GregorianCalendar> {
    private final DateTransform transform;

    public GregorianCalendarTransform(Class cls) {
        this.transform = new DateTransform(cls);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public GregorianCalendar read(String str) {
        return read(this.transform.read(str));
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(GregorianCalendar gregorianCalendar) {
        return this.transform.write(gregorianCalendar.getTime());
    }

    public GregorianCalendarTransform() {
        this(Date.class);
    }

    private GregorianCalendar read(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (date != null) {
            gregorianCalendar.setTime(date);
        }
        return gregorianCalendar;
    }
}
