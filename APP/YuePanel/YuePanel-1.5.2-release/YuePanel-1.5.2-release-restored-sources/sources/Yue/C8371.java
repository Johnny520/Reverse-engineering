package Yue;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥۢۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8371 {

    /* JADX INFO: renamed from: ۥ */
    public static final C8374 f3442;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f3443 = "ViewUtils";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Property<View, Float> f24973;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Property<View, Rect> f24974;

    /* JADX INFO: renamed from: Yue.ۥۢۤۨ$ۥ */
    public class C1508 extends Property<View, Float> {
        public C1508(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C8371.m4347(view));
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            C8371.m27934(view, f.floatValue());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۨ$ۥ۟ */
    public class C1509 extends Property<View, Rect> {
        public C1509(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3442 = new C8383();
        } else {
            f3442 = new C8382();
        }
        f24973 = new C1508(Float.class, "translationAlpha");
        f24974 = new C1509(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m4346(@InterfaceC6391 View view) {
        f3442.m4354(view);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static float m4347(@InterfaceC6391 View view) {
        return f3442.mo27938(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m27931(@InterfaceC6391 View view) {
        f3442.m27939(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m27932(@InterfaceC6391 View view, @InterfaceC6490 Matrix matrix) {
        f3442.mo27940(view, matrix);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m27933(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        f3442.mo27941(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m27934(@InterfaceC6391 View view, float f) {
        f3442.mo27942(view, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m27935(@InterfaceC6391 View view, int i) {
        f3442.mo27943(view, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m27936(@InterfaceC6391 View view, @InterfaceC6391 Matrix matrix) {
        f3442.mo27944(view, matrix);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m27937(@InterfaceC6391 View view, @InterfaceC6391 Matrix matrix) {
        f3442.mo27945(view, matrix);
    }
}
