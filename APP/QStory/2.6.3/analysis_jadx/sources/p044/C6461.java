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
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;
import p018.AbstractC6253;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6461 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C6456 f17725;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public WindowManager f17726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC6455 f17727;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17728;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6454 f17730;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Activity f17731;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public WindowManager.LayoutParams f17732;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AtomicBoolean f17729 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f17733 = 50;

    public C6461(InterfaceC6454 interfaceC6454, int i) {
        this.f17730 = interfaceC6454;
        this.f17728 = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [飘花落叶言世哲苏楪兰子.飘花落叶言子楪世兰苏哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11988(Activity activity) {
        if (this.f17731 == null) {
            this.f17731 = activity;
        }
        if (this.f17726 == null) {
            this.f17726 = activity.getWindowManager();
        }
        if (this.f17732 == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
            layoutParams.flags = 24;
            layoutParams.format = 1;
            layoutParams.gravity = 49;
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f17732 = layoutParams;
        }
        if (this.f17725 == null) {
            C6456 c6456 = new C6456(activity);
            this.f17725 = c6456;
            c6456.setClickable(false);
            Drawable drawable = activity.getDrawable(this.f17728);
            C6459 c6459 = new C6459();
            c6459.f17719 = 10.0f;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            c6459.f17718 = bitmapCreateBitmap;
            int iM11754 = AbstractC6253.m11754(activity, 40.0f);
            c6459.f17719 = 8.0f;
            c6459.f17717 = true;
            c6459.f17718 = C6458.m11986(c6459.f17718, iM11754, iM11754);
            c6459.f17716 = true;
            c6459.f17715 = 5;
            c6459.f17714 = true;
            C6458 c6458 = new C6458(c6459);
            C6456 c64562 = this.f17725;
            c64562.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6457(c64562, this.f17733, c6458));
        }
        AtomicBoolean atomicBoolean = this.f17729;
        if (atomicBoolean.get()) {
            return;
        }
        this.f17726.addView(this.f17725, this.f17732);
        atomicBoolean.set(true);
        final View decorView = activity.getWindow().getDecorView();
        this.f17727 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世兰苏哲
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                WindowManager.LayoutParams layoutParams2;
                Rect rect = new Rect();
                View view = decorView;
                view.getWindowVisibleDisplayFrame(rect);
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                C6461 c6461 = this.f17692;
                InterfaceC6454 interfaceC6454 = c6461.f17730;
                interfaceC6454.mo11984(view.getHeight() - rect.bottom);
                view.getBottom();
                float f = displayMetrics.density;
                Context context = view.getContext();
                int iMo11985 = interfaceC6454.mo11985();
                if (iMo11985 != 0 && (layoutParams2 = c6461.f17732) != null) {
                    layoutParams2.height = context.getResources().getDisplayMetrics().heightPixels - iMo11985;
                    c6461.f17726.updateViewLayout(c6461.f17725, c6461.f17732);
                    return;
                }
                WindowManager.LayoutParams layoutParams3 = c6461.f17732;
                if (layoutParams3 != null) {
                    layoutParams3.height = -1;
                    c6461.f17726.updateViewLayout(c6461.f17725, layoutParams3);
                }
            }
        };
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(this.f17727);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11989() {
        if (this.f17729.getAndSet(false)) {
            this.f17731.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f17727);
            this.f17726.removeViewImmediate(this.f17725);
        }
    }
}
