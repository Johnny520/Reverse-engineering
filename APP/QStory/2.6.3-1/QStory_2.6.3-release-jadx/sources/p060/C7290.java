package p060;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;
import p034.AbstractC7082;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7290 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7285 f18070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public WindowManager f18071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC7284 f18072;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18073;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7283 f18075;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Activity f18076;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public WindowManager.LayoutParams f18077;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicBoolean f18074 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f18078 = 50;

    public C7290(InterfaceC7283 interfaceC7283, int i) {
        this.f18075 = interfaceC7283;
        this.f18073 = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [飘花落叶言世哲苏楪兰子.飘花落叶言子楪世兰苏哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12547(Activity activity) {
        if (this.f18076 == null) {
            this.f18076 = activity;
        }
        if (this.f18071 == null) {
            this.f18071 = activity.getWindowManager();
        }
        if (this.f18077 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
            layoutParams.flags = 24;
            layoutParams.format = 1;
            layoutParams.gravity = 49;
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f18077 = layoutParams;
        }
        if (this.f18070 == null) {
            C7285 c7285 = new C7285(activity);
            this.f18070 = c7285;
            c7285.setClickable(false);
            Drawable drawable = activity.getDrawable(this.f18073);
            C7288 c7288 = new C7288();
            c7288.f18064 = 10.0f;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            c7288.f18063 = bitmapCreateBitmap;
            int iM12313 = AbstractC7082.m12313(activity, 40.0f);
            c7288.f18064 = 8.0f;
            c7288.f18062 = true;
            c7288.f18063 = C7287.m12545(c7288.f18063, iM12313, iM12313);
            c7288.f18061 = true;
            c7288.f18060 = 5;
            c7288.f18059 = true;
            C7287 c7287 = new C7287(c7288);
            C7285 c72852 = this.f18070;
            c72852.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC7286(c72852, this.f18078, c7287));
        }
        AtomicBoolean atomicBoolean = this.f18074;
        if (atomicBoolean.get()) {
            return;
        }
        this.f18071.addView(this.f18070, this.f18077);
        atomicBoolean.set(true);
        final View decorView = activity.getWindow().getDecorView();
        this.f18072 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世兰苏哲
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                WindowManager.LayoutParams layoutParams2;
                Rect rect = new Rect();
                View view = decorView;
                view.getWindowVisibleDisplayFrame(rect);
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                C7290 c7290 = this.f18037;
                InterfaceC7283 interfaceC7283 = c7290.f18075;
                interfaceC7283.mo12543(view.getHeight() - rect.bottom);
                view.getBottom();
                float f = displayMetrics.density;
                Context context = view.getContext();
                int iMo12544 = interfaceC7283.mo12544();
                if (iMo12544 != 0 && (layoutParams2 = c7290.f18077) != null) {
                    layoutParams2.height = context.getResources().getDisplayMetrics().heightPixels - iMo12544;
                    c7290.f18071.updateViewLayout(c7290.f18070, c7290.f18077);
                    return;
                }
                WindowManager.LayoutParams layoutParams3 = c7290.f18077;
                if (layoutParams3 != null) {
                    layoutParams3.height = -1;
                    c7290.f18071.updateViewLayout(c7290.f18070, layoutParams3);
                }
            }
        };
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.f18072);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12548() {
        if (this.f18074.getAndSet(false)) {
            this.f18076.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f18072);
            this.f18071.removeViewImmediate(this.f18070);
        }
    }
}
