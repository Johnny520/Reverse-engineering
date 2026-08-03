package p043Y;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: Y.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0450i {
    /* JADX INFO: renamed from: a */
    public static <T, V> ObjectAnimator m1074a(T r1, Property<T, V> r2, Path r3) {
        return ObjectAnimator.ofObject(r1, r2, null, r3);
    }
}
