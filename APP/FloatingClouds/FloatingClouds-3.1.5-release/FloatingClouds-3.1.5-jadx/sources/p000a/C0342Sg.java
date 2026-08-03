package p000a;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: a.Sg */
/* JADX INFO: loaded from: classes.dex */
public class C0342Sg {

    /* JADX INFO: renamed from: a */
    public static boolean f1204a = true;

    /* JADX INFO: renamed from: b */
    public static Field f1205b;

    /* JADX INFO: renamed from: c */
    public static boolean f1206c;

    /* JADX INFO: renamed from: a.Sg$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static float m937a(View view) {
            return view.getTransitionAlpha();
        }

        /* JADX INFO: renamed from: b */
        public static void m938b(View view, float f) {
            view.setTransitionAlpha(f);
        }
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public float mo934a(View view) {
        if (f1204a) {
            try {
                return a.m937a(view);
            } catch (NoSuchMethodError unused) {
                f1204a = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    public void mo935b(View view, float f) {
        if (f1204a) {
            try {
                a.m938b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f1204a = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: c */
    public void mo936c(View view, int i) {
        if (!f1206c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1205b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f1206c = true;
        }
        Field field = f1205b;
        if (field != null) {
            try {
                f1205b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
