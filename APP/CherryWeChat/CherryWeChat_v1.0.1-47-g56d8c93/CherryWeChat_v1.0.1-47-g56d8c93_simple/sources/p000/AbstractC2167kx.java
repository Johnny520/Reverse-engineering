package p000;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: kx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2167kx {

    /* JADX INFO: renamed from: a */
    public static final List f7551a = null;

    /* JADX INFO: renamed from: b */
    public static final List f7552b = null;

    static {
        f7551a = AbstractC2496sa.m4977b0(new Class[]{Application.class, C1194ax.class});
        f7552b = Collections.singletonList(C1194ax.class);
    }

    /* JADX INFO: renamed from: a */
    public static final Constructor m4368a(Class r6, List r7) {
        Constructor<?>[] r0 = r6.getConstructors();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L15;
        Constructor<?> r3 = r0[r2];
        List r4 = AbstractC0650P4.m1316K(r3.getParameterTypes());
        if (r7.equals(r4) == true) goto L6;
        if (r7.size() != r4.size()) goto L14;
        if (r4.containsAll(r7) == false) goto L14;
        throw new UnsupportedOperationException("Class " + r6.getSimpleName() + " must have parameters in the proper order: " + r7);
    L14:
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L15:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC2580uE m4369b(Class r2, Constructor r3, Object... r4) {
        return (AbstractC2580uE) r3.newInstance(Arrays.copyOf(r4, r4.length));
    L8:
        e = move-exception;
        throw new RuntimeException("Failed to access " + r2, e);
    L6:
        e = move-exception;
        throw new RuntimeException("A " + r2 + " cannot be instantiated.", e);
    L4:
        e = move-exception;
        throw new RuntimeException("An exception happened in constructor of " + r2, e.getCause());
    }
}
