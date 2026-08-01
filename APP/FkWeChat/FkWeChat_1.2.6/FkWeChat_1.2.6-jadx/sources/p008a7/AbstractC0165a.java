package p008a7;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import sb.AbstractC7291q;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: a7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0165a {

    /* JADX INFO: renamed from: a */
    public static final List f468a;

    static {
        Iterator it = ServiceLoader.load(InterfaceC0170f.class, InterfaceC0170f.class.getClassLoader()).iterator();
        it.getClass();
        f468a = AbstractC7294t.m28908P(AbstractC7291q.m28879g(it));
    }

    /* JADX INFO: renamed from: a */
    public static final List m394a() {
        return f468a;
    }
}
