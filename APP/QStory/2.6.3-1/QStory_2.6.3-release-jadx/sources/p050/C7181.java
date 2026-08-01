package p050;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.ComponentCallbacks2C3896;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.lxj.xpopup.util.AbstractC4620;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC6376;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p052.AbstractC7187;
import p246.C8878;
import p289.AbstractC9171;
import p289.C9168;
import p289.C9172;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7181 extends AbstractC9171 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C7179 f17844;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7181(C7179 c7179, ArrayList arrayList) {
        super(arrayList);
        this.f17844 = c7179;
        arrayList.getClass();
        this.f23350 = C0328R.layout.emo_pic_container;
        C9172 c9172 = new C9172(this);
        C8878 c8878 = this.f23349;
        c8878.getClass();
        SparseArray sparseArray = (SparseArray) c8878.f22564;
        sparseArray.put(sparseArray.size(), c9172);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m12496(C9168 c9168, Object obj) {
        LinearLayout linearLayout = (LinearLayout) c9168.f23345;
        linearLayout.removeAllViews();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        C7179 c7179 = this.f17844;
        Context context = c7179.getContext();
        HashSet hashSet = c7179.f17839;
        layoutParams.height = (AbstractC4620.m8668(context) / 5) + 20;
        linearLayout.requestLayout();
        for (C7177 c7177 : (ArrayList) obj) {
            ImageView imageView = new ImageView(c7179.getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC4620.m8668(c7179.getContext()) / 5, AbstractC4620.m8668(c7179.getContext()) / 5);
            layoutParams2.setMargins((AbstractC4620.m8668(c7179.getContext()) / 5) / 5, 10, 0, 10);
            int i = c7177.f17830;
            int i2 = 2;
            if (i == 1) {
                ((C3894) ComponentCallbacks2C3890.m7325(AbstractC7187.f17852).m7359(new File(c7177.f17831)).m7174()).m7349(imageView);
                hashSet.add(imageView);
                imageView.setOnLongClickListener(new ViewOnLongClickListenerC6376(this, i2, c7177));
            } else if (i == 2) {
                try {
                    if (TextUtils.isEmpty(null)) {
                        ComponentCallbacks2C3896 componentCallbacks2C3896M7325 = ComponentCallbacks2C3890.m7325(AbstractC7187.f17852);
                        ((C3894) ((C3894) componentCallbacks2C3896M7325.m7360(Drawable.class).m7346(new URL(c7177.f17828)).m7185(C0328R.drawable.loading)).m7174()).m7349(imageView);
                    } else {
                        ComponentCallbacks2C3896 componentCallbacks2C3896M73252 = ComponentCallbacks2C3890.m7325(AbstractC7187.f17852);
                        ((C3894) ((C3894) componentCallbacks2C3896M73252.m7360(Drawable.class).m7346(new URL(null)).m7185(C0328R.drawable.loading)).m7174()).m7349(imageView);
                    }
                    hashSet.add(imageView);
                    imageView.setOnClickListener(null);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            linearLayout.addView(imageView, layoutParams2);
            imageView.setOnClickListener(new ViewOnClickListenerC6392(this, 7, c7177));
        }
    }
}
