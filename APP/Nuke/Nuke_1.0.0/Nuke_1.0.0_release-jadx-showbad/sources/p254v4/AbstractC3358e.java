package p254v4;

import java.util.ArrayList;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: v4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3358e extends ArrayList {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m5604a() {
        if (super.size() == 0) {
            return null;
        }
        E e5 = get(0);
        int size = super.size();
        for (int i5 = 1; i5 < size; i5++) {
            if (!AbstractC1665j.m2981a(e5, get(i5))) {
                return null;
            }
        }
        return e5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object first() {
        if (isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return get(0);
    }
}
