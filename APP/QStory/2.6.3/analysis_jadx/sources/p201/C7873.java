package p201;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import net.bytebuddy.pool.TypePool;
import p198.AbstractC7850;

/* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7873 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f21652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f21653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f21655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f21656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC7876 f21657;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f21658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f21659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Rect f21660;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21661;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f21662;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public View f21663;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public View f21664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21666;

    public C7873(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21656 = false;
        this.f21655 = 0;
        this.f21654 = 0;
        this.f21653 = -1;
        this.f21652 = -1;
        this.f21662 = 0;
        this.f21661 = 0;
        this.f21660 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7850.f21410);
        this.f21655 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f21652 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f21654 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f21653 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f21662 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f21661 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f21656 = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f6402;
            AbstractC7876 abstractC7876 = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f6402;
                    if (!TextUtils.isEmpty(str2)) {
                        string = AbstractC0053.m164(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str2, string);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f6399;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f6401);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC7876 = (AbstractC7876) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    C0276.m848("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.f21657 = abstractC7876;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC7876 abstractC78762 = this.f21657;
        if (abstractC78762 != null) {
            abstractC78762.mo7027(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13233(int i) {
        if (i == 0) {
            return this.f21659;
        }
        if (i != 1) {
            return false;
        }
        return this.f21658;
    }

    public C7873() {
        super(-2, -2);
        this.f21656 = false;
        this.f21655 = 0;
        this.f21654 = 0;
        this.f21653 = -1;
        this.f21652 = -1;
        this.f21662 = 0;
        this.f21661 = 0;
        this.f21660 = new Rect();
    }

    public C7873(C7873 c7873) {
        super((ViewGroup.MarginLayoutParams) c7873);
        this.f21656 = false;
        this.f21655 = 0;
        this.f21654 = 0;
        this.f21653 = -1;
        this.f21652 = -1;
        this.f21662 = 0;
        this.f21661 = 0;
        this.f21660 = new Rect();
    }

    public C7873(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f21656 = false;
        this.f21655 = 0;
        this.f21654 = 0;
        this.f21653 = -1;
        this.f21652 = -1;
        this.f21662 = 0;
        this.f21661 = 0;
        this.f21660 = new Rect();
    }

    public C7873(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f21656 = false;
        this.f21655 = 0;
        this.f21654 = 0;
        this.f21653 = -1;
        this.f21652 = -1;
        this.f21662 = 0;
        this.f21661 = 0;
        this.f21660 = new Rect();
    }
}
