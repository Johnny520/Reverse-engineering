package p033;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.ComponentCallbacks2C3063;
import com.davemorrissey.labs.subscaleview.R;
import com.lxj.xpopup.util.AbstractC3787;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC5544;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p035.AbstractC6340;
import p230.C8048;
import p273.AbstractC8341;
import p273.C8338;
import p273.C8342;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6331 extends AbstractC8341 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C6327 f17446;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6331(C6327 c6327, ArrayList arrayList) {
        super(arrayList);
        this.f17446 = c6327;
        arrayList.getClass();
        this.f23006 = R.layout.emo_pic_container;
        C8342 c8342 = new C8342(this);
        C8048 c8048 = this.f23005;
        c8048.getClass();
        SparseArray sparseArray = (SparseArray) c8048.f22221;
        sparseArray.put(sparseArray.size(), c8342);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m11885(C8338 c8338, Object obj) {
        LinearLayout linearLayout = (LinearLayout) c8338.f23001;
        linearLayout.removeAllViews();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        C6327 c6327 = this.f17446;
        Context context = c6327.getContext();
        HashSet hashSet = c6327.f17438;
        int i = 5;
        layoutParams.height = (AbstractC3787.m8122(context) / 5) + 20;
        linearLayout.requestLayout();
        for (C6329 c6329 : (ArrayList) obj) {
            ImageView imageView = new ImageView(c6327.getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC3787.m8122(c6327.getContext()) / 5, AbstractC3787.m8122(c6327.getContext()) / 5);
            layoutParams2.setMargins((AbstractC3787.m8122(c6327.getContext()) / 5) / 5, 10, 0, 10);
            int i2 = c6329.f17443;
            int i3 = 2;
            if (i2 == 1) {
                ((C3061) ComponentCallbacks2C3057.m6720(AbstractC6340.f17460).m6754(new File(c6329.f17444)).m6554()).m6744(imageView);
                hashSet.add(imageView);
                imageView.setOnLongClickListener(new ViewOnLongClickListenerC5544(this, i3, c6329));
            } else if (i2 == 2) {
                try {
                    if (TextUtils.isEmpty(null)) {
                        ComponentCallbacks2C3063 componentCallbacks2C3063M6720 = ComponentCallbacks2C3057.m6720(AbstractC6340.f17460);
                        ((C3061) ((C3061) componentCallbacks2C3063M6720.m6755(Drawable.class).m6741(new URL(c6329.f17441)).m6565(R.drawable.loading)).m6554()).m6744(imageView);
                    } else {
                        ComponentCallbacks2C3063 componentCallbacks2C3063M67202 = ComponentCallbacks2C3057.m6720(AbstractC6340.f17460);
                        ((C3061) ((C3061) componentCallbacks2C3063M67202.m6755(Drawable.class).m6741(new URL(null)).m6565(R.drawable.loading)).m6554()).m6744(imageView);
                    }
                    hashSet.add(imageView);
                    imageView.setOnClickListener(null);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            linearLayout.addView(imageView, layoutParams2);
            imageView.setOnClickListener(new ViewOnClickListenerC5561(this, i, c6329));
        }
    }
}
