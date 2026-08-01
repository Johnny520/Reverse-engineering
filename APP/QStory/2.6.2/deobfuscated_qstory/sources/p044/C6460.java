package p044;

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
import com.alibaba.fastjson2.AbstractC2904;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6460 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6455 f17729;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public WindowManager f17730;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC6454 f17731;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17732;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6453 f17734;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Activity f17735;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public WindowManager.LayoutParams f17736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicBoolean f17733 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f17737 = 50;

    public C6460(InterfaceC6453 interfaceC6453, int i) {
        this.f17734 = interfaceC6453;
        this.f17732 = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [飘花落叶言世哲苏楪子兰.飘花落叶言子楪世兰苏哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11945(Activity activity) {
        if (this.f17735 == null) {
            this.f17735 = activity;
        }
        if (this.f17730 == null) {
            this.f17730 = activity.getWindowManager();
        }
        if (this.f17736 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
            layoutParams.flags = 24;
            layoutParams.format = 1;
            layoutParams.gravity = 49;
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f17736 = layoutParams;
        }
        if (this.f17729 == null) {
            C6455 c6455 = new C6455(activity);
            this.f17729 = c6455;
            c6455.setClickable(false);
            Drawable drawable = activity.getDrawable(this.f17732);
            C6458 c6458 = new C6458();
            c6458.f17723 = 10.0f;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            c6458.f17722 = bitmapCreateBitmap;
            int iM6267 = AbstractC2904.m6267(activity, 40.0f);
            c6458.f17723 = 8.0f;
            c6458.f17721 = true;
            c6458.f17722 = C6457.m11943(c6458.f17722, iM6267, iM6267);
            c6458.f17720 = true;
            c6458.f17719 = 5;
            c6458.f17718 = true;
            C6457 c6457 = new C6457(c6458);
            C6455 c64552 = this.f17729;
            c64552.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6456(c64552, this.f17737, c6457));
        }
        AtomicBoolean atomicBoolean = this.f17733;
        if (atomicBoolean.get()) {
            return;
        }
        this.f17730.addView(this.f17729, this.f17736);
        atomicBoolean.set(true);
        final View decorView = activity.getWindow().getDecorView();
        this.f17731 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: 飘花落叶言世哲苏楪子兰.飘花落叶言子楪世兰苏哲
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                WindowManager.LayoutParams layoutParams2;
                Rect rect = new Rect();
                View view = decorView;
                view.getWindowVisibleDisplayFrame(rect);
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                C6460 c6460 = this.f17696;
                InterfaceC6453 interfaceC6453 = c6460.f17734;
                interfaceC6453.mo11941(view.getHeight() - rect.bottom);
                view.getBottom();
                float f = displayMetrics.density;
                Context context = view.getContext();
                int iMo11942 = interfaceC6453.mo11942();
                if (iMo11942 != 0 && (layoutParams2 = c6460.f17736) != null) {
                    layoutParams2.height = context.getResources().getDisplayMetrics().heightPixels - iMo11942;
                    c6460.f17730.updateViewLayout(c6460.f17729, c6460.f17736);
                    return;
                }
                WindowManager.LayoutParams layoutParams3 = c6460.f17736;
                if (layoutParams3 != null) {
                    layoutParams3.height = -1;
                    c6460.f17730.updateViewLayout(c6460.f17729, layoutParams3);
                }
            }
        };
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.f17731);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11946() {
        if (this.f17733.getAndSet(false)) {
            this.f17735.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f17731);
            this.f17730.removeViewImmediate(this.f17729);
        }
    }
}
