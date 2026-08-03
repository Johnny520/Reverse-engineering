package Yue;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5681 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1614 = "LayoutInflaterCompatHC";

    /* JADX INFO: renamed from: ۥ۟ */
    public static Field f1615;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f14004;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۨۥ$ۥ */
    public static class LayoutInflaterFactory2C0838 implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final InterfaceC5682 f14005;

        public LayoutInflaterFactory2C0838(InterfaceC5682 interfaceC5682) {
            this.f14005 = interfaceC5682;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f14005.onCreateView(null, str, context, attributeSet);
        }

        @InterfaceC6391
        public String toString() {
            return getClass().getName() + "{" + this.f14005 + "}";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f14005.onCreateView(view, str, context, attributeSet);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m2368(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f14004) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f1615 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f1614, "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f14004 = true;
        }
        Field field = f1615;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(f1614, "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static InterfaceC5682 m2369(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflaterFactory2C0838) {
            return ((LayoutInflaterFactory2C0838) factory).f14005;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m17587(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6391 InterfaceC5682 interfaceC5682) {
        layoutInflater.setFactory2(new LayoutInflaterFactory2C0838(interfaceC5682));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m17588(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6391 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
