package p109hb;

import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: hb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1677f {

    /* JADX INFO: renamed from: a */
    public final Constructor f5544a;

    /* JADX INFO: renamed from: b */
    public final Method f5545b;

    /* JADX INFO: renamed from: c */
    public final Field f5546c;

    /* JADX INFO: renamed from: d */
    public final Field f5547d;

    /* JADX INFO: renamed from: e */
    public final Field f5548e;

    /* JADX INFO: renamed from: f */
    public final Field f5549f;

    /* JADX INFO: renamed from: g */
    public final Constructor f5550g;

    /* JADX INFO: renamed from: h */
    public final Field f5551h;

    /* JADX INFO: renamed from: i */
    public final Field f5552i;

    /* JADX INFO: renamed from: j */
    public final Field f5553j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1677f(Constructor constructor, Method method, Field field, Field field2, Field field3, Field field4, Constructor constructor2, Field field5, Field field6, Field field7) {
        field.getClass();
        field2.getClass();
        field3.getClass();
        field4.getClass();
        field5.getClass();
        field6.getClass();
        field7.getClass();
        this.f5544a = constructor;
        this.f5545b = method;
        this.f5546c = field;
        this.f5547d = field2;
        this.f5548e = field3;
        this.f5549f = field4;
        this.f5550g = constructor2;
        this.f5551h = field5;
        this.f5552i = field6;
        this.f5553j = field7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1677f)) {
            return false;
        }
        C1677f c1677f = (C1677f) obj;
        return this.f5544a.equals(c1677f.f5544a) && this.f5545b.equals(c1677f.f5545b) && AbstractC1416l.m3825a(this.f5546c, c1677f.f5546c) && AbstractC1416l.m3825a(this.f5547d, c1677f.f5547d) && AbstractC1416l.m3825a(this.f5548e, c1677f.f5548e) && AbstractC1416l.m3825a(this.f5549f, c1677f.f5549f) && this.f5550g.equals(c1677f.f5550g) && AbstractC1416l.m3825a(this.f5551h, c1677f.f5551h) && AbstractC1416l.m3825a(this.f5552i, c1677f.f5552i) && AbstractC1416l.m3825a(this.f5553j, c1677f.f5553j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5553j.hashCode() + ((this.f5552i.hashCode() + ((this.f5551h.hashCode() + ((this.f5550g.hashCode() + ((this.f5549f.hashCode() + ((this.f5548e.hashCode() + ((this.f5547d.hashCode() + ((this.f5546c.hashCode() + ((this.f5545b.hashCode() + (this.f5544a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MassSendEmojiRuntime(payloadConstructor=" + this.f5544a + ", toByteArrayMethod=" + this.f5545b + ", md5Field=" + this.f5546c + ", startField=" + this.f5547d + ", sizeField=" + this.f5548e + ", bufferField=" + this.f5549f + ", bufferConstructor=" + this.f5550g + ", typeField=" + this.f5551h + ", contentField=" + this.f5552i + ", reservedField=" + this.f5553j + ")";
    }
}
