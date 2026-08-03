package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: renamed from: Mk */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC0543Mk implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f1761b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewGroup f1762c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageView f1763d;

    public /* synthetic */ ViewOnLayoutChangeListenerC0543Mk(ViewGroup viewGroup, ViewGroup viewGroup2, ImageView imageView, int i) {
        this.f1760a = i;
        this.f1761b = viewGroup;
        this.f1762c = viewGroup2;
        this.f1763d = imageView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f1760a) {
            case 0:
                final int i9 = 0;
                final ViewGroup viewGroup = this.f1761b;
                final ViewGroup viewGroup2 = this.f1762c;
                final ImageView imageView = this.f1763d;
                viewGroup.post(new Runnable() { // from class: Ok
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                Rect rect = new Rect();
                                Rect rect2 = new Rect();
                                viewGroup.getGlobalVisibleRect(rect);
                                viewGroup2.getGlobalVisibleRect(rect2);
                                int i10 = rect.bottom - rect2.top;
                                if (i10 > 0) {
                                    ImageView imageView2 = imageView;
                                    ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                                    if (layoutParams.height != i10) {
                                        layoutParams.height = i10;
                                        imageView2.setLayoutParams(layoutParams);
                                    }
                                }
                                break;
                            default:
                                Rect rect3 = new Rect();
                                Rect rect4 = new Rect();
                                viewGroup.getGlobalVisibleRect(rect3);
                                viewGroup2.getGlobalVisibleRect(rect4);
                                int i11 = rect3.bottom - rect4.top;
                                if (i11 > 0) {
                                    ImageView imageView3 = imageView;
                                    ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
                                    if (layoutParams2.height != i11) {
                                        layoutParams2.height = i11;
                                        imageView3.setLayoutParams(layoutParams2);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final ViewGroup viewGroup3 = this.f1761b;
                final ViewGroup viewGroup4 = this.f1762c;
                final ImageView imageView2 = this.f1763d;
                viewGroup3.post(new Runnable() { // from class: Ok
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                Rect rect = new Rect();
                                Rect rect2 = new Rect();
                                viewGroup3.getGlobalVisibleRect(rect);
                                viewGroup4.getGlobalVisibleRect(rect2);
                                int i102 = rect.bottom - rect2.top;
                                if (i102 > 0) {
                                    ImageView imageView22 = imageView2;
                                    ViewGroup.LayoutParams layoutParams = imageView22.getLayoutParams();
                                    if (layoutParams.height != i102) {
                                        layoutParams.height = i102;
                                        imageView22.setLayoutParams(layoutParams);
                                    }
                                }
                                break;
                            default:
                                Rect rect3 = new Rect();
                                Rect rect4 = new Rect();
                                viewGroup3.getGlobalVisibleRect(rect3);
                                viewGroup4.getGlobalVisibleRect(rect4);
                                int i11 = rect3.bottom - rect4.top;
                                if (i11 > 0) {
                                    ImageView imageView3 = imageView2;
                                    ViewGroup.LayoutParams layoutParams2 = imageView3.getLayoutParams();
                                    if (layoutParams2.height != i11) {
                                        layoutParams2.height = i11;
                                        imageView3.setLayoutParams(layoutParams2);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
