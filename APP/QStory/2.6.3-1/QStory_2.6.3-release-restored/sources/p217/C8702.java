package p217;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import net.bytebuddy.pool.TypePool;
import p214.AbstractC8679;

/* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8702 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f21997;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f21998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f22000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f22001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC8705 f22002;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f22003;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f22004;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Rect f22005;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f22006;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f22007;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public View f22008;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public View f22009;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f22010;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f22011;

    public C8702(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22001 = false;
        this.f22000 = 0;
        this.f21999 = 0;
        this.f21998 = -1;
        this.f21997 = -1;
        this.f22007 = 0;
        this.f22006 = 0;
        this.f22005 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8679.f21755);
        this.f22000 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f21997 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f21999 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f21998 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f22007 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f22006 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f22001 = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f6747;
            AbstractC8705 abstractC8705 = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f6747;
                    if (!TextUtils.isEmpty(str2)) {
                        string = AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str2, string);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f6744;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f6746);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC8705 = (AbstractC8705) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    C1123.m1408("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.f22002 = abstractC8705;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC8705 abstractC87052 = this.f22002;
        if (abstractC87052 != null) {
            abstractC87052.mo7586(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13792(int i) {
        if (i == 0) {
            return this.f22004;
        }
        if (i != 1) {
            return false;
        }
        return this.f22003;
    }

    public C8702() {
        super(-2, -2);
        this.f22001 = false;
        this.f22000 = 0;
        this.f21999 = 0;
        this.f21998 = -1;
        this.f21997 = -1;
        this.f22007 = 0;
        this.f22006 = 0;
        this.f22005 = new Rect();
    }

    public C8702(C8702 c8702) {
        super((ViewGroup.MarginLayoutParams) c8702);
        this.f22001 = false;
        this.f22000 = 0;
        this.f21999 = 0;
        this.f21998 = -1;
        this.f21997 = -1;
        this.f22007 = 0;
        this.f22006 = 0;
        this.f22005 = new Rect();
    }

    public C8702(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f22001 = false;
        this.f22000 = 0;
        this.f21999 = 0;
        this.f21998 = -1;
        this.f21997 = -1;
        this.f22007 = 0;
        this.f22006 = 0;
        this.f22005 = new Rect();
    }

    public C8702(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f22001 = false;
        this.f22000 = 0;
        this.f21999 = 0;
        this.f21998 = -1;
        this.f21997 = -1;
        this.f22007 = 0;
        this.f22006 = 0;
        this.f22005 = new Rect();
    }
}
