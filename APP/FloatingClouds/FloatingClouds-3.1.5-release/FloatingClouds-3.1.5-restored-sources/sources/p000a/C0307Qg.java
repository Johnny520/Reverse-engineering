package p000a;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: a.Qg */
/* JADX INFO: loaded from: classes.dex */
public final class C0307Qg {

    /* JADX INFO: renamed from: a */
    public static final C0396Vg f1106a;

    /* JADX INFO: renamed from: b */
    public static final a f1107b;

    /* JADX INFO: renamed from: a.Qg$a */
    public class a extends Property<View, Float> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(C0307Qg.f1106a.mo934a(view));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            C0307Qg.f1106a.mo935b(view, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: a.Qg$b */
    public class b extends Property<View, Rect> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1106a = new C0414Wg();
        } else {
            f1106a = new C0396Vg();
        }
        f1107b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    public static void m854a(View view, int i, int i2, int i3, int i4) {
        f1106a.mo1009f(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static void m855b(View view, int i) {
        f1106a.mo936c(view, i);
    }
}
