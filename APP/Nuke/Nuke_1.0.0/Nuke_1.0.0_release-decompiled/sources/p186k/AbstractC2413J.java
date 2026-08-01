package p186k;

import java.util.List;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2413J {

    /* JADX INFO: renamed from: a */
    public static final Object[] f7813a = new Object[0];

    /* JADX INFO: renamed from: b */
    public static final C2404A f7814b = new C2404A(0);

    /* JADX INFO: renamed from: a */
    public static final void m4293a(int i5, List list) {
        int size = list.size();
        if (i5 < 0 || i5 >= size) {
            AbstractC2477a.m4423d("Index " + i5 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4294b(List list, int i5, int i6) {
        int size = list.size();
        if (i5 > i6) {
            AbstractC2477a.m4422c("Indices are out of order. fromIndex (" + i5 + ") is greater than toIndex (" + i6 + ").");
            throw null;
        }
        if (i5 < 0) {
            AbstractC2477a.m4423d("fromIndex (" + i5 + ") is less than 0.");
            throw null;
        }
        if (i6 <= size) {
            return;
        }
        AbstractC2477a.m4423d("toIndex (" + i6 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
