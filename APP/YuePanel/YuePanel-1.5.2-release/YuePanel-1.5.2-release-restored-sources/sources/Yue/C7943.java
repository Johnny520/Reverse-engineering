package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: renamed from: Yue.ۥۢۡۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C7943 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f23654 = "TooltipPopup";

    /* JADX INFO: renamed from: ۥ */
    public final Context f3129;

    /* JADX INFO: renamed from: ۥ۟ */
    public final View f3130;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final TextView f23655;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final WindowManager.LayoutParams f23656;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Rect f23657;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int[] f23658;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int[] f23659;

    public C7943(@InterfaceC6391 Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f23656 = layoutParams;
        this.f23657 = new Rect();
        this.f23658 = new int[2];
        this.f23659 = new int[2];
        this.f3129 = context;
        View viewInflate = LayoutInflater.from(context).inflate(C6898.C6906.f18995, (ViewGroup) null);
        this.f3130 = viewInflate;
        this.f23655 = (TextView) viewInflate.findViewById(C6898.C6903.f18919);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C6898.C6908.f19028;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static View m3957(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3958(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f3129.getResources().getDimensionPixelOffset(C6898.C6901.f18796);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3129.getResources().getDimensionPixelOffset(C6898.C6901.f18795);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f3129.getResources().getDimensionPixelOffset(z ? C6898.C6901.f18799 : C6898.C6901.f18798);
        View viewM3957 = m3957(view);
        if (viewM3957 == null) {
            Log.e(f23654, "Cannot find app view");
            return;
        }
        viewM3957.getWindowVisibleDisplayFrame(this.f23657);
        Rect rect = this.f23657;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f3129.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f23657.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewM3957.getLocationOnScreen(this.f23659);
        view.getLocationOnScreen(this.f23658);
        int[] iArr = this.f23658;
        int i4 = iArr[0];
        int[] iArr2 = this.f23659;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (viewM3957.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f3130.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f3130.getMeasuredHeight();
        int i6 = this.f23658[1];
        int i7 = ((i3 + i6) - dimensionPixelOffset3) - measuredHeight;
        int i8 = i6 + height + dimensionPixelOffset3;
        if (z) {
            if (i7 >= 0) {
                layoutParams.y = i7;
                return;
            } else {
                layoutParams.y = i8;
                return;
            }
        }
        if (measuredHeight + i8 <= this.f23657.height()) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i7;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m25049() {
        if (m25050()) {
            ((WindowManager) this.f3129.getSystemService("window")).removeView(this.f3130);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m25050() {
        return this.f3130.getParent() != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m25051(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m25050()) {
            m25049();
        }
        this.f23655.setText(charSequence);
        m3958(view, i, i2, z, this.f23656);
        ((WindowManager) this.f3129.getSystemService("window")).addView(this.f3130, this.f23656);
    }
}
