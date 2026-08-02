package p000;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d21 {

    /* JADX INFO: renamed from: a */
    public final Object f1819a;

    /* JADX INFO: renamed from: b */
    public final Method f1820b;

    /* JADX INFO: renamed from: c */
    public final List f1821c;

    public d21(Object obj, Method method, ArrayList arrayList) {
        this.f1819a = obj;
        this.f1820b = method;
        this.f1821c = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", ip0.class.getName(), this.f1820b.getName(), this.f1821c);
    }
}
