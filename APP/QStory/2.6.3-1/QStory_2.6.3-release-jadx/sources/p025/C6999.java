package p025;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.text.input.internal.RunnableC1714;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.gson.C4085;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.view.main.SearchHelper$MatchType;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import p042.AbstractC7140;
import p042.AbstractC7143;
import p303.AbstractC9234;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6999 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4085 f17310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9924 f17311;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6999 f17312;

    static {
        AbstractC9234.m14531(1325);
        AbstractC9234.m14532(AbstractC9234.m14531(1327));
        AbstractC9234.m14532(AbstractC9234.m14531(1328));
        f17312 = new C6999();
        f17311 = new C9924(AbstractC9234.m14531(1329), 0);
        f17310 = new C4085();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m12121(FlexboxLayout flexboxLayout, LinearLayout linearLayout, TextView textView, EditText editText) {
        flexboxLayout.removeAllViews();
        List<String> listM12125 = m12125();
        if (listM12125.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        for (String str : listM12125) {
            TextView textView2 = new TextView(flexboxLayout.getContext());
            textView2.setText(str);
            textView2.setTextSize(12.0f);
            textView2.setTextColor(-13421773);
            textView2.setPadding(16, 8, 16, 8);
            textView2.setBackgroundResource(C0328R.drawable.bg_tag_directory);
            textView2.setOnClickListener(new ViewOnClickListenerC7005(editText, str, 0));
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.f10203 = 1;
            layoutParams.f10201 = 0.0f;
            layoutParams.f10202 = 1.0f;
            layoutParams.f10196 = -1;
            layoutParams.f10195 = -1.0f;
            layoutParams.f10199 = -1;
            layoutParams.f10200 = -1;
            layoutParams.f10197 = 16777215;
            layoutParams.f10198 = 16777215;
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
    */
    public static List m12122(String str) {
        DirectoryUiInfo directoryUiInfo;
        int i;
        int i2;
        DirectoryUiInfo directoryUiInfo2;
        boolean z;
        String str2;
        String strMo11794;
        String strMo117942;
        AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵呜");
        str.getClass();
        if (AbstractC5976.m10731(str)) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int i3 = 1322;
        AbstractC9234.m14531(1322);
        lowerCase.getClass();
        for (Object obj : ItemUiInfoManager.rootContainer) {
            ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = obj instanceof ItemUiInfoGroupWrapper ? (ItemUiInfoGroupWrapper) obj : null;
            if (itemUiInfoGroupWrapper != null) {
                String groupName = itemUiInfoGroupWrapper.getGroupName();
                int i4 = 1323;
                AbstractC9234.m14531(1323);
                groupName.getClass();
                String lowerCase2 = groupName.toLowerCase(Locale.ROOT);
                AbstractC9234.m14531(i3);
                lowerCase2.getClass();
                if (AbstractC5976.m10735(lowerCase2, lowerCase, false)) {
                    String groupName2 = itemUiInfoGroupWrapper.getGroupName();
                    AbstractC9234.m14531(1323);
                    groupName2.getClass();
                    arrayList.add(new C7003(groupName2, AbstractC9234.m14531(1324), AbstractC9234.m14532("喵喵喵呜呜呜呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜呜喵"), -1, SearchHelper$MatchType.GROUP, itemUiInfoGroupWrapper));
                }
                for (BaseItemUiInfo baseItemUiInfo : itemUiInfoGroupWrapper.getDirectoryUIInfoList()) {
                    DirectoryUiInfo directoryUiInfo3 = baseItemUiInfo instanceof DirectoryUiInfo ? (DirectoryUiInfo) baseItemUiInfo : null;
                    if (directoryUiInfo3 != null) {
                        String itemName = directoryUiInfo3.getItemName();
                        AbstractC9234.m14531(1294);
                        itemName.getClass();
                        String lowerCase3 = itemName.toLowerCase(Locale.ROOT);
                        AbstractC9234.m14531(i3);
                        lowerCase3.getClass();
                        if (AbstractC5976.m10735(lowerCase3, lowerCase, false)) {
                            String itemName2 = directoryUiInfo3.getItemName();
                            AbstractC9234.m14531(1294);
                            itemName2.getClass();
                            String strM14532 = AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜呜喵呜呜呜喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵呜呜喵喵喵~呜呜呜呜呜喵喵呜");
                            String groupName3 = itemUiInfoGroupWrapper.getGroupName();
                            AbstractC9234.m14531(i4);
                            groupName3.getClass();
                            String itemName3 = directoryUiInfo3.getItemName();
                            AbstractC9234.m14531(1294);
                            itemName3.getClass();
                            C7003 c7003 = new C7003(itemName2, strM14532, m12126(groupName3, itemName3), -1, SearchHelper$MatchType.DIRECTORY, directoryUiInfo3);
                            directoryUiInfo = directoryUiInfo3;
                            arrayList.add(c7003);
                        } else {
                            directoryUiInfo = directoryUiInfo3;
                        }
                        int i5 = -1;
                        for (BaseItemUiInfo baseItemUiInfo2 : directoryUiInfo.uiInfoList) {
                            boolean z2 = true;
                            int i6 = i5 + 1;
                            ItemUiInfo itemUiInfo = baseItemUiInfo2 instanceof ItemUiInfo ? (ItemUiInfo) baseItemUiInfo2 : null;
                            if (itemUiInfo != null) {
                                String itemName4 = itemUiInfo.getItemName();
                                AbstractC9234.m14531(1294);
                                itemName4.getClass();
                                Locale locale = Locale.ROOT;
                                String lowerCase4 = itemName4.toLowerCase(locale);
                                AbstractC9234.m14531(i3);
                                lowerCase4.getClass();
                                boolean zM10735 = AbstractC5976.m10735(lowerCase4, lowerCase, false);
                                i = i3;
                                String str3 = itemUiInfo.tips;
                                if (str3 != null) {
                                    String lowerCase5 = str3.toLowerCase(locale);
                                    AbstractC9234.m14531(i);
                                    lowerCase5.getClass();
                                    if (AbstractC5976.m10735(lowerCase5, lowerCase, false)) {
                                        i2 = i4;
                                        z = true;
                                    } else {
                                        i2 = i4;
                                        z = false;
                                    }
                                    AbstractC7143 abstractC7143 = itemUiInfo.item;
                                    AbstractC7140 abstractC7140 = abstractC7143 instanceof AbstractC7140 ? (AbstractC7140) abstractC7143 : null;
                                    if (abstractC7140 == null || (strMo117942 = abstractC7140.mo11794()) == null) {
                                        z2 = false;
                                        if (!zM10735 || z || z2) {
                                            if (!z2) {
                                                AbstractC7143 abstractC71432 = itemUiInfo.item;
                                                AbstractC7140 abstractC71402 = abstractC71432 instanceof AbstractC7140 ? (AbstractC7140) abstractC71432 : null;
                                                if (abstractC71402 == null || (strMo11794 = abstractC71402.mo11794()) == null) {
                                                    strMo11794 = itemUiInfo.tips;
                                                }
                                            } else if (z) {
                                                strMo11794 = itemUiInfo.tips;
                                            } else {
                                                str2 = null;
                                                String itemName5 = itemUiInfo.getItemName();
                                                AbstractC9234.m14531(1294);
                                                itemName5.getClass();
                                                String groupName4 = itemUiInfoGroupWrapper.getGroupName();
                                                AbstractC9234.m14531(i2);
                                                groupName4.getClass();
                                                String itemName6 = directoryUiInfo.getItemName();
                                                AbstractC9234.m14531(1294);
                                                itemName6.getClass();
                                                directoryUiInfo2 = directoryUiInfo;
                                                arrayList.add(new C7003(itemName5, str2, m12126(groupName4, itemName6), i6, SearchHelper$MatchType.FUNCTION, directoryUiInfo2));
                                            }
                                            str2 = strMo11794;
                                            String itemName52 = itemUiInfo.getItemName();
                                            AbstractC9234.m14531(1294);
                                            itemName52.getClass();
                                            String groupName42 = itemUiInfoGroupWrapper.getGroupName();
                                            AbstractC9234.m14531(i2);
                                            groupName42.getClass();
                                            String itemName62 = directoryUiInfo.getItemName();
                                            AbstractC9234.m14531(1294);
                                            itemName62.getClass();
                                            directoryUiInfo2 = directoryUiInfo;
                                            arrayList.add(new C7003(itemName52, str2, m12126(groupName42, itemName62), i6, SearchHelper$MatchType.FUNCTION, directoryUiInfo2));
                                        }
                                    } else {
                                        String lowerCase6 = strMo117942.toLowerCase(locale);
                                        AbstractC9234.m14531(i);
                                        lowerCase6.getClass();
                                        if (!AbstractC5976.m10735(lowerCase6, lowerCase, false)) {
                                        }
                                        if (!zM10735) {
                                        }
                                        if (!z2) {
                                        }
                                        str2 = strMo11794;
                                        String itemName522 = itemUiInfo.getItemName();
                                        AbstractC9234.m14531(1294);
                                        itemName522.getClass();
                                        String groupName422 = itemUiInfoGroupWrapper.getGroupName();
                                        AbstractC9234.m14531(i2);
                                        groupName422.getClass();
                                        String itemName622 = directoryUiInfo.getItemName();
                                        AbstractC9234.m14531(1294);
                                        itemName622.getClass();
                                        directoryUiInfo2 = directoryUiInfo;
                                        arrayList.add(new C7003(itemName522, str2, m12126(groupName422, itemName622), i6, SearchHelper$MatchType.FUNCTION, directoryUiInfo2));
                                    }
                                }
                                i3 = i;
                                i5 = i6;
                                directoryUiInfo = directoryUiInfo2;
                                i4 = i2;
                            } else {
                                i = i3;
                                i2 = i4;
                            }
                            directoryUiInfo2 = directoryUiInfo;
                            i3 = i;
                            i5 = i6;
                            directoryUiInfo = directoryUiInfo2;
                            i4 = i2;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m12123(int i, AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        if (i < 0) {
            return;
        }
        View view = abstractComponentCallbacksC3171.f7226;
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(C0328R.id.item_list_view) : null;
        AbstractC3352 layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        AbstractC3283 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (linearLayoutManager == null || adapter == null || i >= adapter.mo5354()) {
            return;
        }
        linearLayoutManager.m5244(i, 0);
        recyclerView.postDelayed(new RunnableC1714(recyclerView, i, 2), 400L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12124(String str) {
        AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵喵呜喵呜");
        str.getClass();
        if (AbstractC5976.m10731(str)) {
            return;
        }
        ArrayList arrayListM9345 = AbstractC5176.m9345(m12125());
        arrayListM9345.remove(str);
        arrayListM9345.add(0, str);
        if (arrayListM9345.size() > 10) {
            arrayListM9345.remove(10);
        }
        String strM7897 = f17310.m7897(arrayListM9345);
        String strM14532 = AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵");
        strM7897.getClass();
        f17311.m15236(strM7897, strM14532);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m12125() {
        String strM15237 = f17311.m15237(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"), "");
        if (AbstractC5976.m10731(strM15237)) {
            return EmptyList.INSTANCE;
        }
        try {
            List list = (List) f17310.m7900(strM15237, new C6996().f23159);
            return list == null ? EmptyList.INSTANCE : list;
        } catch (Exception unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m12126(String str, String str2) {
        return AbstractC9234.m14531(1325) + str + AbstractC9234.m14532("喵呜喵喵呜喵喵呜~喵呜喵喵呜呜呜呜") + str2;
    }
}
