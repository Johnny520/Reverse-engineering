package p323;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.reflect.jvm.internal.impl.types.C4875;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5544;
import p018.AbstractC6253;
import p257.C8208;
import p257.C8221;
import p287.AbstractC8405;
import p321.C8688;
import p322.C8703;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ExecutorService f24571 = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Handler f24570 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14428(Map map) {
        Activity activityM6653;
        AbstractC8405.m13972(2753);
        if (map.isEmpty() || (activityM6653 = AbstractC3055.m6653()) == null) {
            return;
        }
        AbstractC3056.m6687(activityM6653);
        C8688.f24506.getClass();
        List listM14416 = C8688.m14416();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C4875 c4875 = new C4875(map.size());
        C8208 c8208 = new C8208();
        c8208.f22614 = AbstractC8405.m13972(2754);
        c8208.mo13721();
        C8221 c8221 = new C8221(6);
        c8208.f22613 = c8221;
        if (c8208.f11584) {
            c8221.mo8066(c8208.f22615);
        }
        c8208.f22616 = new C8724(map, c4875, listM14416, linkedHashSet);
        c8208.mo13721();
        String strM13972 = AbstractC8405.m13972(2743);
        int i = 1;
        C8703 c8703 = new C8703(linkedHashSet, i);
        c8208.f22630 = strM13972;
        c8208.f22621 = c8703;
        c8208.mo13721();
        c8208.mo13719(AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵喵喵~呜呜呜呜喵呜喵喵"), new C8730(i, linkedHashSet, c4875, map));
        c8208.m13731();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14429(LinearLayout linearLayout, List list, LinkedHashSet linkedHashSet) {
        Context context = linearLayout.getContext();
        if (list.isEmpty()) {
            TextView textView = new TextView(context);
            textView.setText(AbstractC8405.m13972(2755));
            textView.setTextSize(14.0f);
            int iM11754 = AbstractC6253.m11754(context, 12.0f);
            textView.setPadding(iM11754, iM11754, iM11754, iM11754);
            textView.setGravity(17);
            linearLayout.addView(textView);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            View viewInflate = AbstractC6253.m11750(context).inflate(R.layout.item_save_sticker_dir, (ViewGroup) null, false);
            AbstractC8405.m13972(1279);
            viewInflate.getClass();
            View view = (ViewGroup) viewInflate;
            CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) view.findViewById(R.id.cb_dir);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_dir_name);
            customMaterialCheckBox.setOnClickListener(null);
            customMaterialCheckBox.setClickable(false);
            customMaterialCheckBox.setFocusable(false);
            textView2.setText(str);
            view.setOnClickListener(new ViewOnClickListenerC5544(customMaterialCheckBox, linkedHashSet, str, 6));
            linearLayout.addView(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14430(ImageView imageView, String str) {
        try {
            ((C3062) ComponentCallbacks2C3058.m6765(imageView.getContext()).m6796(str).m6614()).m6789(imageView);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14431(ImageView imageView, String str) {
        try {
            ((C3062) ComponentCallbacks2C3058.m6765(imageView.getContext()).m6799(new File(str)).m6614()).m6789(imageView);
        } catch (Exception unused) {
        }
    }
}
