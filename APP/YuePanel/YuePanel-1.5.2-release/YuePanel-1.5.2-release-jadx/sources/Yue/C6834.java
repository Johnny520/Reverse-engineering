package Yue;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: renamed from: Yue.ۥۡۥۣۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6834 {

    /* JADX INFO: renamed from: Yue.ۥۡۥۣۦ$ۥ */
    @InterfaceC7113(21)
    public static class C1094 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <V> PropertyValuesHolder m3285(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static PropertyValuesHolder m3284(Property<?, PointF> property, Path path) {
        return C1094.m3285(property, path);
    }
}
