package p086r0;

import java.lang.reflect.Method;
import java.util.Comparator;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: r0.W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0877W0 implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC0079h.m184h(Integer.valueOf(((Method) obj).getParameterTypes().length == 1 ? 0 : 1), Integer.valueOf(((Method) obj2).getParameterTypes().length != 1 ? 1 : 0));
    }
}
