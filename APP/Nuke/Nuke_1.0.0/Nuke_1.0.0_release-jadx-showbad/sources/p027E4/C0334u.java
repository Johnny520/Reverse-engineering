package p027E4;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: E4.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0334u {

    /* JADX INFO: renamed from: a */
    public final Class f1057a;

    /* JADX INFO: renamed from: b */
    public final Object f1058b;

    /* JADX INFO: renamed from: c */
    public final Method f1059c;

    /* JADX INFO: renamed from: d */
    public final List f1060d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0334u(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f1057a = cls;
        this.f1058b = obj;
        this.f1059c = method;
        this.f1060d = Collections.unmodifiableList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return String.format("%s.%s() %s", this.f1057a.getName(), this.f1059c.getName(), this.f1060d);
    }
}
