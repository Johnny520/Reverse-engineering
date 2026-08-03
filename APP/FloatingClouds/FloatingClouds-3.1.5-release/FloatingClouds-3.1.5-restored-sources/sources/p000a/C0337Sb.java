package p000a;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: renamed from: a.Sb */
/* JADX INFO: loaded from: classes.dex */
public final class C0337Sb {
    /* JADX INFO: renamed from: a */
    public static <T, V> ObjectAnimator m928a(T t, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
