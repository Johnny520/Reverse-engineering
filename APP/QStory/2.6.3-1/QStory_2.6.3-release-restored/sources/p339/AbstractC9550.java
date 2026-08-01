package p339;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.reflect.jvm.internal.impl.types.C5707;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC6375;
import p034.AbstractC7082;
import p273.C9037;
import p273.C9050;
import p337.C9517;
import p338.C9532;
import top.suzhelan.qstory.p015ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ExecutorService f24916 = Executors.newFixedThreadPool(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Handler f24915 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14987(Map map) {
        Activity activityM7213;
        "md5UrlMap";
        if (map.isEmpty() || (activityM7213 = AbstractC3887.m7213()) == null) {
            return;
        }
        AbstractC3888.m7247(activityM7213);
        C9517.f24851.getClass();
        List listM14975 = C9517.m14975();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5707 c5707 = new C5707(map.size());
        C9037 c9037 = new C9037();
        c9037.f22959 = "保存表情";
        c9037.mo14280();
        C9050 c9050 = new C9050(6);
        c9037.f22958 = c9050;
        if (c9037.f11929) {
            c9050.mo8625(c9037.f22960);
        }
        c9037.f22961 = new C9553(map, c5707, listM14975, linkedHashSet);
        c9037.mo14280();
        String strM14531 = "创建新文件夹";
        int i = 1;
        C9532 c9532 = new C9532(linkedHashSet, i);
        c9037.f22975 = strM14531;
        c9037.f22966 = c9532;
        c9037.mo14280();
        c9037.mo14278("保存", new C9559(i, linkedHashSet, c5707, map));
        c9037.m14290();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m14988(LinearLayout linearLayout, List list, LinkedHashSet linkedHashSet) {
        Context context = linearLayout.getContext();
        if (list.isEmpty()) {
            TextView textView = new TextView(context);
            textView.setText("暂无文件夹，请先创建");
            textView.setTextSize(14.0f);
            int iM12313 = AbstractC7082.m12313(context, 12.0f);
            textView.setPadding(iM12313, iM12313, iM12313, iM12313);
            textView.setGravity(17);
            linearLayout.addView(textView);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            View viewInflate = AbstractC7082.m12309(context).inflate(C0328R.layout.item_save_sticker_dir, (ViewGroup) null, false);
            "null cannot be cast to non-null type android.view.ViewGroup";
            viewInflate.getClass();
            View view = (ViewGroup) viewInflate;
            CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) view.findViewById(C0328R.id.cb_dir);
            TextView textView2 = (TextView) view.findViewById(C0328R.id.tv_dir_name);
            customMaterialCheckBox.setOnClickListener(null);
            customMaterialCheckBox.setClickable(false);
            customMaterialCheckBox.setFocusable(false);
            textView2.setText(str);
            view.setOnClickListener(new ViewOnClickListenerC6375(customMaterialCheckBox, linkedHashSet, str, 6));
            linearLayout.addView(view);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m14989(ImageView imageView, String str) {
        try {
            ((C3894) ComponentCallbacks2C3890.m7325(imageView.getContext()).m7356(str).m7174()).m7349(imageView);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14990(ImageView imageView, String str) {
        try {
            ((C3894) ComponentCallbacks2C3890.m7325(imageView.getContext()).m7359(new File(str)).m7174()).m7349(imageView);
        } catch (Exception unused) {
        }
    }
}
