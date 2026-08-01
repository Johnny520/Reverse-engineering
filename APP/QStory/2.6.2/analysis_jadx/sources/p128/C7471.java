package p128;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import kotlin.reflect.jvm.internal.types.AbstractC4921;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C7471 extends AbstractC4921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean f20227 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean f20228 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static boolean f20229 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean f20230 = true;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public void mo12663(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (f20229) {
                try {
                    view.setTransitionVisibility(i);
                    return;
                } catch (NoSuchMethodError unused) {
                    f20229 = false;
                    return;
                }
            }
            return;
        }
        if (!AbstractC4921.f14249) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                AbstractC4921.f14250 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            AbstractC4921.f14249 = true;
        }
        Field field = AbstractC4921.f14250;
        if (field != null) {
            try {
                AbstractC4921.f14250.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public void mo12664(View view, Matrix matrix) {
        if (f20228) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f20228 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public void mo12665(View view, int i, int i2, int i3, int i4) {
        if (f20230) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f20230 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public void mo12666(ViewGroup viewGroup, Matrix matrix) {
        if (f20227) {
            try {
                viewGroup.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f20227 = false;
            }
        }
    }
}
