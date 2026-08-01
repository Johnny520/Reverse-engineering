package p038;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.davemorrissey.labs.subscaleview.R;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p026.AbstractC6293;
import p028.C6301;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6418 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C6301 f17581;

    public C6418() {
        AbstractC3056.m6668(-3937581783189816743L);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // p026.AbstractC6296
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadHook(java.lang.ClassLoader r12) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p038.C6418.loadHook(java.lang.ClassLoader):void");
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937581426707531175L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11929(ImageView imageView) {
        RelativeLayout relativeLayout = (RelativeLayout) imageView.getParent().getParent();
        Activity activity = (Activity) imageView.getContext();
        AbstractC3065.m6858(activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC2904.m6267(activity, 38.0f), AbstractC2904.m6267(activity, 38.0f));
        layoutParams.addRule(16, ((View) imageView.getParent()).getId());
        layoutParams.rightMargin = AbstractC2904.m6267(activity, 10.0f);
        layoutParams.addRule(15);
        ImageView imageView2 = new ImageView(activity);
        int iM6267 = AbstractC2904.m6267(activity, 8.0f);
        imageView2.setPadding(iM6267, iM6267, iM6267, iM6267);
        imageView2.setImageDrawable(activity.getDrawable(R.drawable.do_not_disturb_icon));
        imageView2.setOnClickListener(new ViewOnClickListenerC5561(this, 6, imageView));
        relativeLayout.addView(imageView2, layoutParams);
    }
}
