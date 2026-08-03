package p043Y;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: Y.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0450i {
    /* JADX INFO: renamed from: a */
    public static <T, V> ObjectAnimator m1074a(T t2, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
    }
}
