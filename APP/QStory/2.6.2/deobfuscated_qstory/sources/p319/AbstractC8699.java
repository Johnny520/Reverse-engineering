package p319;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543;
import p053.AbstractC6560;
import p175.AbstractC7738;
import p257.C8207;
import p257.C8220;
import p324.C8738;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ExecutorService f24528 = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Handler f24527 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14380(Map map) {
        Activity activityM13031;
        "md5UrlMap";
        if (map.isEmpty() || (activityM13031 = AbstractC7738.m13031()) == null) {
            return;
        }
        AbstractC3065.m6858(activityM13031);
        C8738.f24639.getClass();
        List listM14411 = C8738.m14411();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C4874 c4874 = new C4874(map.size());
        C8207 c8207 = new C8207();
        c8207.f22615 = "\u4fdd\u5b58\u8868\u60c5";
        c8207.mo13704();
        C8220 c8220 = new C8220(6);
        c8207.f22614 = c8220;
        if (c8207.f11579) {
            c8220.mo8079(c8207.f22616);
        }
        c8207.f22617 = new C8698(map, c4874, listM14411, linkedHashSet);
        c8207.mo13704();
        String strM6668 = "\u521b\u5efa\u65b0\u6587\u4ef6\u5939";
        C8700 c8700 = new C8700(linkedHashSet, 0);
        c8207.f22631 = strM6668;
        c8207.f22622 = c8700;
        c8207.mo13704();
        c8207.mo13702("\u4fdd\u5b58", new C8707(1, linkedHashSet, c4874, map));
        c8207.m13714();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14381(LinearLayout linearLayout, List list, LinkedHashSet linkedHashSet) {
        Context context = linearLayout.getContext();
        if (list.isEmpty()) {
            TextView textView = new TextView(context);
            textView.setText("\u6682\u65e0\u6587\u4ef6\u5939\uff0c\u8bf7\u5148\u521b\u5efa");
            textView.setTextSize(14.0f);
            int iM6267 = AbstractC2904.m6267(context, 12.0f);
            textView.setPadding(iM6267, iM6267, iM6267, iM6267);
            textView.setGravity(17);
            linearLayout.addView(textView);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            View viewInflate = AbstractC6560.m12028(context).inflate(R.layout.item_save_sticker_dir, (ViewGroup) null, false);
            "null cannot be cast to non-null type android.view.ViewGroup";
            viewInflate.getClass();
            View view = (ViewGroup) viewInflate;
            CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) view.findViewById(R.id.cb_dir);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_dir_name);
            customMaterialCheckBox.setOnClickListener(null);
            customMaterialCheckBox.setClickable(false);
            customMaterialCheckBox.setFocusable(false);
            textView2.setText(str);
            view.setOnClickListener(new ViewOnClickListenerC5543(customMaterialCheckBox, linkedHashSet, str, 6));
            linearLayout.addView(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14382(ImageView imageView, String str) {
        try {
            ((C3061) ComponentCallbacks2C3057.m6720(imageView.getContext()).m6751(str).m6554()).m6744(imageView);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14383(ImageView imageView, String str) {
        try {
            ((C3061) ComponentCallbacks2C3057.m6720(imageView.getContext()).m6754(new File(str)).m6554()).m6744(imageView);
        } catch (Exception unused) {
        }
    }
}
