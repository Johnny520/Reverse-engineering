package p000a;

import java.util.ArrayList;

/* JADX INFO: renamed from: a.Y1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0435Y1<T> extends ArrayList<T> {
    /* JADX INFO: renamed from: a */
    public final T m1090a() {
        if (isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return get(0);
    }
}
