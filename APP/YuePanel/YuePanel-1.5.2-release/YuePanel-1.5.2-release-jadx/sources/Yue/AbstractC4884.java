package Yue;

import android.util.FloatProperty;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4884<T> {
    final String mPropertyName;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۢۦ$ۥ */
    public static class C0521 extends AbstractC4884<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ FloatProperty f1212;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0521(String str, FloatProperty floatProperty) {
            super(str);
            this.f1212 = floatProperty;
        }

        @Override // Yue.AbstractC4884
        public float getValue(T t) {
            return ((Float) this.f1212.get(t)).floatValue();
        }

        @Override // Yue.AbstractC4884
        public void setValue(T t, float f) {
            this.f1212.setValue(t, f);
        }
    }

    public AbstractC4884(String str) {
        this.mPropertyName = str;
    }

    @InterfaceC7113(24)
    public static <T> AbstractC4884<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new C0521(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
