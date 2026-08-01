package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import io.ktor.client.plugins.AbstractC4765;
import java.lang.reflect.Method;
import p204.AbstractC8602;
import p206.InterfaceC8606;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C1029 implements InterfaceC8606 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final Method f1052;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final Method f1053;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C0981 f1054;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Handler f1056;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f1057;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public Rect f1058;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View f1059;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C1031 f1060;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f1063;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f1064;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public AdapterView.OnItemSelectedListener f1069;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AdapterView.OnItemClickListener f1070;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f1074;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f1075;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f1076;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ListAdapter f1077;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1024 f1078;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f1079;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f1072 = -2;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f1071 = -2;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f1073 = 1002;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f1062 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f1061 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final RunnableC1030 f1068 = new RunnableC1030(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final ViewOnTouchListenerC1026 f1067 = new ViewOnTouchListenerC1026(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C1027 f1066 = new C1027(this);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final RunnableC1030 f1065 = new RunnableC1030(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Rect f1055 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1053 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1052 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C1029(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f1079 = context;
        this.f1056 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21445, i, i2);
        this.f1075 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1076 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1074 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0981 c0981 = new C0981(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC8602.f21436, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c0981.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0981.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC4765.m8871(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f1054 = c0981;
        c0981.setInputMethodMode(1);
    }

    @Override // p206.InterfaceC8606
    public final void dismiss() {
        C0981 c0981 = this.f1054;
        c0981.dismiss();
        c0981.setContentView(null);
        this.f1078 = null;
        this.f1056.removeCallbacks(this.f1068);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1054.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1070 = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1069 = onItemSelectedListener;
    }

    @Override // p206.InterfaceC8606
    public final void show() {
        int i;
        int paddingBottom;
        C1024 c1024;
        C1024 c10242 = this.f1078;
        Context context = this.f1079;
        C0981 c0981 = this.f1054;
        if (c10242 == null) {
            C1024 c1024Mo1185 = mo1185(context, !this.f1057);
            this.f1078 = c1024Mo1185;
            c1024Mo1185.setAdapter(this.f1077);
            this.f1078.setOnItemClickListener(this.f1070);
            this.f1078.setFocusable(true);
            this.f1078.setFocusableInTouchMode(true);
            this.f1078.setOnItemSelectedListener(new C1012(this));
            this.f1078.setOnScrollListener(this.f1066);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1069;
            if (onItemSelectedListener != null) {
                this.f1078.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0981.setContentView(this.f1078);
        }
        Drawable background = c0981.getBackground();
        Rect rect = this.f1055;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f1074) {
                this.f1076 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM1176 = AbstractC1008.m1176(c0981, this.f1059, this.f1076, c0981.getInputMethodMode() == 2);
        int i3 = this.f1072;
        if (i3 == -1) {
            paddingBottom = iM1176 + i;
        } else {
            int i4 = this.f1071;
            int iM1202 = this.f1078.m1202(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM1176);
            paddingBottom = iM1202 + (iM1202 > 0 ? this.f1078.getPaddingBottom() + this.f1078.getPaddingTop() + i : 0);
        }
        boolean z = c0981.getInputMethodMode() == 2;
        c0981.setWindowLayoutType(this.f1073);
        if (c0981.isShowing()) {
            if (this.f1059.isAttachedToWindow()) {
                int width = this.f1071;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f1059.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.f1071;
                    if (z) {
                        c0981.setWidth(i5 == -1 ? -1 : 0);
                        c0981.setHeight(0);
                    } else {
                        c0981.setWidth(i5 == -1 ? -1 : 0);
                        c0981.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0981.setOutsideTouchable(true);
                int i6 = width;
                View view = this.f1059;
                int i7 = this.f1075;
                int i8 = this.f1076;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                c0981.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.f1071;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f1059.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0981.setWidth(width2);
        c0981.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1053;
            if (method != null) {
                try {
                    method.invoke(c0981, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1009.m1177(c0981, true);
        }
        c0981.setOutsideTouchable(true);
        c0981.setTouchInterceptor(this.f1067);
        if (this.f1063) {
            c0981.setOverlapAnchor(this.f1064);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1052;
            if (method2 != null) {
                try {
                    method2.invoke(c0981, this.f1058);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC1009.m1178(c0981, this.f1058);
        }
        c0981.showAsDropDown(this.f1059, this.f1075, this.f1076, this.f1062);
        this.f1078.setSelection(-1);
        if ((!this.f1057 || this.f1078.isInTouchMode()) && (c1024 = this.f1078) != null) {
            c1024.setListSelectionHidden(true);
            c1024.requestLayout();
        }
        if (this.f1057) {
            return;
        }
        this.f1056.post(this.f1065);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Drawable m1203() {
        return this.f1054.getBackground();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m1204(int i) {
        this.f1075 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m1205() {
        return this.f1075;
    }

    @Override // p206.InterfaceC8606
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo1206() {
        return this.f1054.isShowing();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C1024 mo1185(Context context, boolean z) {
        return new C1024(context, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo1074(ListAdapter listAdapter) {
        C1031 c1031 = this.f1060;
        if (c1031 == null) {
            this.f1060 = new C1031(this);
        } else {
            ListAdapter listAdapter2 = this.f1077;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1031);
            }
        }
        this.f1077 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1060);
        }
        C1024 c1024 = this.f1078;
        if (c1024 != null) {
            c1024.setAdapter(this.f1077);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m1207(int i) {
        Drawable background = this.f1054.getBackground();
        if (background == null) {
            this.f1071 = i;
            return;
        }
        Rect rect = this.f1055;
        background.getPadding(rect);
        this.f1071 = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1208(int i) {
        this.f1076 = i;
        this.f1074 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1209(Drawable drawable) {
        this.f1054.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m1210() {
        if (this.f1074) {
            return this.f1076;
        }
        return 0;
    }

    @Override // p206.InterfaceC8606
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1024 mo1211() {
        return this.f1078;
    }
}
