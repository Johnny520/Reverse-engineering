package p039;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p018.AbstractC6253;
import p026.AbstractC6311;
import p029.C6320;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6388 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6320 f17552;

    public C6388() {
        AbstractC8405.m13972(271);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // p026.AbstractC6314
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadHook(java.lang.ClassLoader r12) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039.C6388.loadHook(java.lang.ClassLoader):void");
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(278);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11964(ImageView imageView) {
        RelativeLayout relativeLayout = (RelativeLayout) imageView.getParent().getParent();
        Activity activity = (Activity) imageView.getContext();
        AbstractC3056.m6687(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC6253.m11754(activity, 38.0f), AbstractC6253.m11754(activity, 38.0f));
        layoutParams.addRule(16, ((View) imageView.getParent()).getId());
        layoutParams.rightMargin = AbstractC6253.m11754(activity, 10.0f);
        layoutParams.addRule(15);
        ImageView imageView2 = new ImageView(activity);
        int iM11754 = AbstractC6253.m11754(activity, 8.0f);
        imageView2.setPadding(iM11754, iM11754, iM11754, iM11754);
        imageView2.setImageDrawable(activity.getDrawable(R.drawable.do_not_disturb_icon));
        imageView2.setOnClickListener(new ViewOnClickListenerC5562(this, 8, imageView));
        relativeLayout.addView(imageView2, layoutParams);
    }
}
