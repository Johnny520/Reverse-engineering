package p007;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.text.input.internal.RunnableC0876;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.profileinstaller.AbstractC2442;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.flexbox.FlexboxLayout;
import com.google.gson.C3252;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.view.main.SearchHelper$MatchType;
import lin.xposed.hook.view.main.itemview.info.BaseItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import p026.AbstractC6293;
import p026.AbstractC6296;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6132 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3252 f16713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9114 f16714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6132 f16715;

    static {
        AbstractC3056.m6668(-3937687954781373863L);
        AbstractC3056.m6668(-3937687967666275751L);
        AbstractC3056.m6668(-3937688255429084583L);
        f16715 = new C6132();
        f16714 = new C9114(AbstractC3056.m6668(-3937687855997126055L), 0);
        f16713 = new C3252();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m11524(FlexboxLayout flexboxLayout, LinearLayout linearLayout, TextView textView, EditText editText) {
        flexboxLayout.removeAllViews();
        List<String> listM11528 = m11528();
        if (listM11528.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        textView.setVisibility(0);
        for (String str : listM11528) {
            TextView textView2 = new TextView(flexboxLayout.getContext());
            textView2.setText(str);
            textView2.setTextSize(12.0f);
            textView2.setTextColor(-13421773);
            textView2.setPadding(16, 8, 16, 8);
            textView2.setBackgroundResource(R.drawable.bg_tag_directory);
            textView2.setOnClickListener(new ViewOnClickListenerC6138(editText, str, 0));
            FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
            layoutParams.f9853 = 1;
            layoutParams.f9851 = 0.0f;
            layoutParams.f9852 = 1.0f;
            layoutParams.f9846 = -1;
            layoutParams.f9845 = -1.0f;
            layoutParams.f9849 = -1;
            layoutParams.f9850 = -1;
            layoutParams.f9847 = 16777215;
            layoutParams.f9848 = 16777215;
            layoutParams.setMargins(8, 8, 8, 8);
            flexboxLayout.addView(textView2, layoutParams);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static List m11525(String str) {
        DirectoryUiInfo directoryUiInfo;
        DirectoryUiInfo directoryUiInfo2;
        long j;
        long j2;
        String str2;
        String strMo11178;
        String strMo111782;
        AbstractC3056.m6668(-3937688221069346215L);
        str.getClass();
        if (AbstractC5143.m10164(str)) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        String strM4563 = AbstractC2442.m4563(str, Locale.ROOT, -3937688152349869479L);
        for (Object obj : ItemUiInfoManager.rootContainer) {
            ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = obj instanceof ItemUiInfoGroupWrapper ? (ItemUiInfoGroupWrapper) obj : null;
            if (itemUiInfoGroupWrapper != null) {
                String groupName = itemUiInfoGroupWrapper.getGroupName();
                long j3 = -3937688122285098407L;
                AbstractC3056.m6668(-3937688122285098407L);
                groupName.getClass();
                if (AbstractC5143.m10171(AbstractC2442.m4563(groupName, Locale.ROOT, -3937688152349869479L), strM4563, false)) {
                    String groupName2 = itemUiInfoGroupWrapper.getGroupName();
                    AbstractC3056.m6668(-3937688122285098407L);
                    groupName2.getClass();
                    arrayList.add(new C6143(groupName2, AbstractC3056.m6668(-3937688062155556263L), AbstractC3056.m6668(-3937603429824988583L), -1, SearchHelper$MatchType.GROUP, itemUiInfoGroupWrapper));
                }
                for (BaseItemUiInfo baseItemUiInfo : itemUiInfoGroupWrapper.getDirectoryUIInfoList()) {
                    DirectoryUiInfo directoryUiInfo3 = baseItemUiInfo instanceof DirectoryUiInfo ? (DirectoryUiInfo) baseItemUiInfo : null;
                    if (directoryUiInfo3 != null) {
                        String itemName = directoryUiInfo3.getItemName();
                        long j4 = -3937690677790639527L;
                        AbstractC3056.m6668(-3937690677790639527L);
                        itemName.getClass();
                        if (AbstractC5143.m10171(AbstractC2442.m4563(itemName, Locale.ROOT, -3937688152349869479L), strM4563, false)) {
                            String itemName2 = directoryUiInfo3.getItemName();
                            AbstractC3056.m6668(-3937690677790639527L);
                            itemName2.getClass();
                            String strM6668 = AbstractC3056.m6668(-3937688044975687079L);
                            String groupName3 = itemUiInfoGroupWrapper.getGroupName();
                            AbstractC3056.m6668(j3);
                            groupName3.getClass();
                            String itemName3 = directoryUiInfo3.getItemName();
                            AbstractC3056.m6668(-3937690677790639527L);
                            itemName3.getClass();
                            C6143 c6143 = new C6143(itemName2, strM6668, m11529(groupName3, itemName3), -1, SearchHelper$MatchType.DIRECTORY, directoryUiInfo3);
                            directoryUiInfo = directoryUiInfo3;
                            arrayList.add(c6143);
                        } else {
                            directoryUiInfo = directoryUiInfo3;
                        }
                        int i = -1;
                        for (BaseItemUiInfo baseItemUiInfo2 : directoryUiInfo.uiInfoList) {
                            int i2 = i + 1;
                            ItemUiInfo itemUiInfo = baseItemUiInfo2 instanceof ItemUiInfo ? (ItemUiInfo) baseItemUiInfo2 : null;
                            if (itemUiInfo != null) {
                                String itemName4 = itemUiInfo.getItemName();
                                AbstractC3056.m6668(j4);
                                itemName4.getClass();
                                j = j4;
                                Locale locale = Locale.ROOT;
                                boolean zM10171 = AbstractC5143.m10171(AbstractC2442.m4563(itemName4, locale, -3937688152349869479L), strM4563, false);
                                String str3 = itemUiInfo.tips;
                                boolean z = str3 != null && AbstractC5143.m10171(AbstractC2442.m4563(str3, locale, -3937688152349869479L), strM4563, false);
                                j2 = j3;
                                AbstractC6296 abstractC6296 = itemUiInfo.item;
                                AbstractC6293 abstractC6293 = abstractC6296 instanceof AbstractC6293 ? (AbstractC6293) abstractC6296 : null;
                                boolean z2 = (abstractC6293 == null || (strMo111782 = abstractC6293.mo11178()) == null || !AbstractC5143.m10171(AbstractC2442.m4563(strMo111782, locale, -3937688152349869479L), strM4563, false)) ? false : true;
                                if (zM10171 || z || z2) {
                                    if (z2) {
                                        AbstractC6296 abstractC62962 = itemUiInfo.item;
                                        AbstractC6293 abstractC62932 = abstractC62962 instanceof AbstractC6293 ? (AbstractC6293) abstractC62962 : null;
                                        if (abstractC62932 == null || (strMo11178 = abstractC62932.mo11178()) == null) {
                                            strMo11178 = itemUiInfo.tips;
                                        }
                                    } else if (z) {
                                        strMo11178 = itemUiInfo.tips;
                                    } else {
                                        str2 = null;
                                        String itemName5 = itemUiInfo.getItemName();
                                        AbstractC3056.m6668(j);
                                        itemName5.getClass();
                                        String groupName4 = itemUiInfoGroupWrapper.getGroupName();
                                        AbstractC3056.m6668(j2);
                                        groupName4.getClass();
                                        String itemName6 = directoryUiInfo.getItemName();
                                        AbstractC3056.m6668(j);
                                        itemName6.getClass();
                                        directoryUiInfo2 = directoryUiInfo;
                                        arrayList.add(new C6143(itemName5, str2, m11529(groupName4, itemName6), i2, SearchHelper$MatchType.FUNCTION, directoryUiInfo2));
                                    }
                                    str2 = strMo11178;
                                    String itemName52 = itemUiInfo.getItemName();
                                    AbstractC3056.m6668(j);
                                    itemName52.getClass();
                                    String groupName42 = itemUiInfoGroupWrapper.getGroupName();
                                    AbstractC3056.m6668(j2);
                                    groupName42.getClass();
                                    String itemName62 = directoryUiInfo.getItemName();
                                    AbstractC3056.m6668(j);
                                    itemName62.getClass();
                                    directoryUiInfo2 = directoryUiInfo;
                                    arrayList.add(new C6143(itemName52, str2, m11529(groupName42, itemName62), i2, SearchHelper$MatchType.FUNCTION, directoryUiInfo2));
                                } else {
                                    directoryUiInfo2 = directoryUiInfo;
                                }
                            } else {
                                directoryUiInfo2 = directoryUiInfo;
                                j = j4;
                                j2 = j3;
                            }
                            i = i2;
                            directoryUiInfo = directoryUiInfo2;
                            j4 = j;
                            j3 = j2;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11526(int i, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        if (i < 0) {
            return;
        }
        View view = abstractComponentCallbacksC2338.f6880;
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.item_list_view) : null;
        AbstractC2519 layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        AbstractC2450 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (linearLayoutManager == null || adapter == null || i >= adapter.mo4784()) {
            return;
        }
        linearLayoutManager.m4674(i, 0);
        recyclerView.postDelayed(new RunnableC0876(recyclerView, i, 2), 400L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11527(String str) {
        AbstractC3056.m6668(-3937688221069346215L);
        str.getClass();
        if (AbstractC5143.m10164(str)) {
            return;
        }
        ArrayList arrayListM8799 = AbstractC4343.m8799(m11528());
        arrayListM8799.remove(str);
        arrayListM8799.add(0, str);
        if (arrayListM8799.size() > 10) {
            arrayListM8799.remove(10);
        }
        String strM7351 = f16713.m7351(arrayListM8799);
        String strM6668 = AbstractC3056.m6668(-3937688255429084583L);
        strM7351.getClass();
        f16714.m14640(strM7351, strM6668);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static List m11528() {
        String strM14641 = f16714.m14641(AbstractC3056.m6668(-3937688255429084583L), AbstractC3056.m6668(-3937561979095614887L));
        if (AbstractC5143.m10164(strM14641)) {
            return EmptyList.INSTANCE;
        }
        try {
            List list = (List) f16713.m7354(strM14641, new C6141().f22815);
            return list == null ? EmptyList.INSTANCE : list;
        } catch (Exception unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m11529(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11544(-3937687954781373863L, sb, str);
        return AbstractC6136.m11557(-3937687967666275751L, sb, str2);
    }
}
