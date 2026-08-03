package Yue;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: Yue.ۥۡۢۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6497 {

    /* JADX INFO: renamed from: Yue.ۥۡۢۧۧ$ۥ */
    @InterfaceC7113(21)
    public static class C1003 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T, V> ObjectAnimator m2993(T t, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static <T> ObjectAnimator m2992(T t, Property<T, PointF> property, Path path) {
        return C1003.m2993(t, property, path);
    }
}
