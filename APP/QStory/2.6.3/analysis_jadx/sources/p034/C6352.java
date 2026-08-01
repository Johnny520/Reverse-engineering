package p034;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.ComponentCallbacks2C3064;
import com.davemorrissey.labs.subscaleview.R;
import com.lxj.xpopup.util.AbstractC3788;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import lin.xposed.hook.javaplugin.view.ViewOnLongClickListenerC5545;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p036.AbstractC6358;
import p230.C8049;
import p273.AbstractC8342;
import p273.C8339;
import p273.C8343;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6352 extends AbstractC8342 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ C6350 f17499;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6352(C6350 c6350, ArrayList arrayList) {
        super(arrayList);
        this.f17499 = c6350;
        arrayList.getClass();
        this.f23005 = R.layout.emo_pic_container;
        C8343 c8343 = new C8343(this);
        C8049 c8049 = this.f23004;
        c8049.getClass();
        SparseArray sparseArray = (SparseArray) c8049.f22219;
        sparseArray.put(sparseArray.size(), c8343);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m11937(C8339 c8339, Object obj) {
        LinearLayout linearLayout = (LinearLayout) c8339.f23000;
        linearLayout.removeAllViews();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        C6350 c6350 = this.f17499;
        Context context = c6350.getContext();
        HashSet hashSet = c6350.f17494;
        layoutParams.height = (AbstractC3788.m8109(context) / 5) + 20;
        linearLayout.requestLayout();
        for (C6348 c6348 : (ArrayList) obj) {
            ImageView imageView = new ImageView(c6350.getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC3788.m8109(c6350.getContext()) / 5, AbstractC3788.m8109(c6350.getContext()) / 5);
            layoutParams2.setMargins((AbstractC3788.m8109(c6350.getContext()) / 5) / 5, 10, 0, 10);
            int i = c6348.f17485;
            int i2 = 2;
            if (i == 1) {
                ((C3062) ComponentCallbacks2C3058.m6765(AbstractC6358.f17507).m6799(new File(c6348.f17486)).m6614()).m6789(imageView);
                hashSet.add(imageView);
                imageView.setOnLongClickListener(new ViewOnLongClickListenerC5545(this, i2, c6348));
            } else if (i == 2) {
                try {
                    if (TextUtils.isEmpty(null)) {
                        ComponentCallbacks2C3064 componentCallbacks2C3064M6765 = ComponentCallbacks2C3058.m6765(AbstractC6358.f17507);
                        ((C3062) ((C3062) componentCallbacks2C3064M6765.m6800(Drawable.class).m6786(new URL(c6348.f17483)).m6625(R.drawable.loading)).m6614()).m6789(imageView);
                    } else {
                        ComponentCallbacks2C3064 componentCallbacks2C3064M67652 = ComponentCallbacks2C3058.m6765(AbstractC6358.f17507);
                        ((C3062) ((C3062) componentCallbacks2C3064M67652.m6800(Drawable.class).m6786(new URL(null)).m6625(R.drawable.loading)).m6614()).m6789(imageView);
                    }
                    hashSet.add(imageView);
                    imageView.setOnClickListener(null);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            linearLayout.addView(imageView, layoutParams2);
            imageView.setOnClickListener(new ViewOnClickListenerC5562(this, 7, c6348));
        }
    }
}
