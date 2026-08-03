package p230p8;

import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p8.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3373y {

    /* JADX INFO: renamed from: a */
    public final Method f10894a;

    /* JADX INFO: renamed from: b */
    public final Constructor f10895b;

    /* JADX INFO: renamed from: c */
    public final Field f10896c;

    /* JADX INFO: renamed from: d */
    public final Field f10897d;

    /* JADX INFO: renamed from: e */
    public final Field f10898e;

    /* JADX INFO: renamed from: f */
    public final Field f10899f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3373y(Method method, Constructor constructor, Field field, Field field2, Field field3, Field field4) {
        method.getClass();
        this.f10894a = method;
        this.f10895b = constructor;
        this.f10896c = field;
        this.f10897d = field2;
        this.f10898e = field3;
        this.f10899f = field4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3373y)) {
            return false;
        }
        C3373y c3373y = (C3373y) obj;
        return AbstractC1416l.m3825a(this.f10894a, c3373y.f10894a) && this.f10895b.equals(c3373y.f10895b) && this.f10896c.equals(c3373y.f10896c) && this.f10897d.equals(c3373y.f10897d) && this.f10898e.equals(c3373y.f10898e) && this.f10899f.equals(c3373y.f10899f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10899f.hashCode() + ((this.f10898e.hashCode() + ((this.f10897d.hashCode() + ((this.f10896c.hashCode() + ((this.f10895b.hashCode() + (this.f10894a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SnsLivePhotoUploadRuntime(setUploadListMethod=" + this.f10894a + ", elementConstructor=" + this.f10895b + ", liveElementField=" + this.f10896c + ", thumbPathField=" + this.f10897d + ", liveTypeField=" + this.f10898e + ", coverTimeField=" + this.f10899f + ")";
    }
}
