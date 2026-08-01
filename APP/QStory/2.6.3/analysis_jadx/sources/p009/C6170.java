package p009;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.text.input.internal.RunnableC0876;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.gson.C3253;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5144;
import p287.AbstractC8405;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6170 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3253 f16965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9095 f16966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6170 f16967;

    static {
        AbstractC8405.m13972(1325);
        AbstractC8405.m13973(AbstractC8405.m13972(1327));
        AbstractC8405.m13973(AbstractC8405.m13972(1328));
        f16967 = new C6170();
        f16966 = new C9095(AbstractC8405.m13972(1329), 0);
        f16965 = new C3253();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m11562(FlexboxLayout flexboxLayout, LinearLayout linearLayout, TextView textView, EditText editText) {
        flexboxLayout.removeAllViews();
        List<String> listM11566 = m11566();
        if (listM11566.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        for (String str : listM11566) {
            TextView textView2 = new TextView(flexboxLayout.getContext());
            textView2.setText(str);
            textView2.setTextSize(12.0f);
            textView2.setTextColor(-13421773);
            textView2.setPadding(16, 8, 16, 8);
            textView2.setBackgroundResource(R.drawable.bg_tag_directory);
            textView2.setOnClickListener(new ViewOnClickListenerC6176(editText, str, 0));
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.f9858 = 1;
            layoutParams.f9856 = 0.0f;
            layoutParams.f9857 = 1.0f;
            layoutParams.f9851 = -1;
            layoutParams.f9850 = -1.0f;
            layoutParams.f9854 = -1;
            layoutParams.f9855 = -1;
            layoutParams.f9852 = 16777215;
            layoutParams.f9853 = 16777215;
            layoutParams.setMargins(8, 8, 8, 8);
            flexboxLayout.addView(textView2, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0199  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List m11563(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009.C6170.m11563(java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11564(int i, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (i < 0) {
            return;
        }
        View view = abstractComponentCallbacksC2338.f6881;
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.item_list_view) : null;
        AbstractC2519 layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        AbstractC2450 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (linearLayoutManager == null || adapter == null || i >= adapter.mo4794()) {
            return;
        }
        linearLayoutManager.m4684(i, 0);
        recyclerView.postDelayed(new RunnableC0876(recyclerView, i, 2), 400L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11565(String str) {
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵呜");
        str.getClass();
        if (AbstractC5144.m10172(str)) {
            return;
        }
        ArrayList arrayListM8786 = AbstractC4344.m8786(m11566());
        arrayListM8786.remove(str);
        arrayListM8786.add(0, str);
        if (arrayListM8786.size() > 10) {
            arrayListM8786.remove(10);
        }
        String strM7338 = f16965.m7338(arrayListM8786);
        String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵");
        strM7338.getClass();
        f16966.m14677(strM7338, strM13973);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m11566() {
        String strM14678 = f16966.m14678(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"), "");
        if (AbstractC5144.m10172(strM14678)) {
            return EmptyList.INSTANCE;
        }
        try {
            List list = (List) f16965.m7341(strM14678, new C6167().f22814);
            return list == null ? EmptyList.INSTANCE : list;
        } catch (Exception unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m11567(String str, String str2) {
        return AbstractC8405.m13972(1325) + str + AbstractC8405.m13973("喵呜喵喵呜喵喵呜~喵呜喵喵呜呜呜呜") + str2;
    }
}
