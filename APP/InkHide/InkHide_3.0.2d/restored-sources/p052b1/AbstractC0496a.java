package p052b1;

import java.util.ArrayList;

/* JADX INFO: renamed from: b1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0496a extends ArrayList {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m961a() {
        if (isEmpty()) {
            throw new IllegalStateException("list is empty");
        }
        return get(0);
    }
}
