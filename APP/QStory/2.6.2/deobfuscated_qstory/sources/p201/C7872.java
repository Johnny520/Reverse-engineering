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
import p198.AbstractC7849;

/* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7872 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f21655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f21656;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f21657;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f21658;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f21659;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC7875 f21660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f21661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f21662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Rect f21663;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21664;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f21665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public View f21666;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public View f21667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f21668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21669;

    public C7872(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21659 = false;
        this.f21658 = 0;
        this.f21657 = 0;
        this.f21656 = -1;
        this.f21655 = -1;
        this.f21665 = 0;
        this.f21664 = 0;
        this.f21663 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7849.f21413);
        this.f21658 = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f21655 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f21657 = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f21656 = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f21665 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f21664 = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f21659 = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f6401;
            AbstractC7875 abstractC7875 = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f6401;
                    if (!TextUtils.isEmpty(str2)) {
                        string = AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str2, string);
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f6398;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f6400);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC7875 = (AbstractC7875) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    C0276.m847("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.f21660 = abstractC7875;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC7875 abstractC78752 = this.f21660;
        if (abstractC78752 != null) {
            abstractC78752.mo7040(this);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m13205(int i) {
        if (i == 0) {
            return this.f21662;
        }
        if (i != 1) {
            return false;
        }
        return this.f21661;
    }

    public C7872() {
        super(-2, -2);
        this.f21659 = false;
        this.f21658 = 0;
        this.f21657 = 0;
        this.f21656 = -1;
        this.f21655 = -1;
        this.f21665 = 0;
        this.f21664 = 0;
        this.f21663 = new Rect();
    }

    public C7872(C7872 c7872) {
        super((ViewGroup.MarginLayoutParams) c7872);
        this.f21659 = false;
        this.f21658 = 0;
        this.f21657 = 0;
        this.f21656 = -1;
        this.f21655 = -1;
        this.f21665 = 0;
        this.f21664 = 0;
        this.f21663 = new Rect();
    }

    public C7872(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f21659 = false;
        this.f21658 = 0;
        this.f21657 = 0;
        this.f21656 = -1;
        this.f21655 = -1;
        this.f21665 = 0;
        this.f21664 = 0;
        this.f21663 = new Rect();
    }

    public C7872(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f21659 = false;
        this.f21658 = 0;
        this.f21657 = 0;
        this.f21656 = -1;
        this.f21655 = -1;
        this.f21665 = 0;
        this.f21664 = 0;
        this.f21663 = new Rect();
    }
}
