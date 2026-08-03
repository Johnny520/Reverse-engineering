package p000;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: dt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1338dt {
    /* JADX INFO: renamed from: a */
    public static <T, V> ObjectAnimator m2593a(T t, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
