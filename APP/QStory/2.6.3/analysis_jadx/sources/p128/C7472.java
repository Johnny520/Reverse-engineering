package p128;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import p175.AbstractC7739;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C7472 extends AbstractC7739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean f20222 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean f20223 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean f20224 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean f20225 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void mo12690(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (f20225) {
                try {
                    view.setTransitionVisibility(i);
                    return;
                } catch (NoSuchMethodError unused) {
                    f20225 = false;
                    return;
                }
            }
            return;
        }
        if (!AbstractC7739.f20998) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                AbstractC7739.f20999 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            AbstractC7739.f20998 = true;
        }
        Field field = AbstractC7739.f20999;
        if (field != null) {
            try {
                AbstractC7739.f20999.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public void mo12691(View view, Matrix matrix) {
        if (f20224) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f20224 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void mo12692(View view, int i, int i2, int i3, int i4) {
        if (f20222) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f20222 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public void mo12693(ViewGroup viewGroup, Matrix matrix) {
        if (f20223) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f20223 = false;
            }
        }
    }
}
