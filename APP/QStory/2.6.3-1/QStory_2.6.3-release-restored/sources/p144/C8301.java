package p144;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import p191.AbstractC8568;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8301 extends AbstractC8568 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean f20567 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean f20568 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean f20569 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean f20570 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void mo13249(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (f20570) {
                try {
                    view.setTransitionVisibility(i);
                    return;
                } catch (NoSuchMethodError unused) {
                    f20570 = false;
                    return;
                }
            }
            return;
        }
        if (!AbstractC8568.f21343) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                AbstractC8568.f21344 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            AbstractC8568.f21343 = true;
        }
        Field field = AbstractC8568.f21344;
        if (field != null) {
            try {
                AbstractC8568.f21344.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public void mo13250(View view, Matrix matrix) {
        if (f20569) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f20569 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void mo13251(View view, int i, int i2, int i3, int i4) {
        if (f20567) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f20567 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public void mo13252(ViewGroup viewGroup, Matrix matrix) {
        if (f20568) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f20568 = false;
            }
        }
    }
}
