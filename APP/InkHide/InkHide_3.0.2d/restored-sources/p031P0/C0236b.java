package p031P0;

import java.util.Random;

/* JADX INFO: renamed from: P0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0236b extends ThreadLocal {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new Random();
    }
}
