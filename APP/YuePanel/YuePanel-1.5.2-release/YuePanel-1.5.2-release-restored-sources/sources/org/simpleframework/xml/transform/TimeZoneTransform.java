package org.simpleframework.xml.transform;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
class TimeZoneTransform implements Transform<TimeZone> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public TimeZone read(String str) {
        return TimeZone.getTimeZone(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(TimeZone timeZone) {
        return timeZone.getID();
    }
}
