package p022;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ViewOnClickListenerC0933;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import p025.C6994;
import p025.C7011;
import p026.AbstractC7017;
import p233.AbstractC8798;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6946 extends AbstractComponentCallbacksC3171 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static ArrayList f17040;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static C6946 f17041;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public RecyclerView f17042;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5014(Bundle bundle) {
        super.mo5014(bundle);
        f17041 = this;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo5015(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C0328R.layout.item_list_layout, viewGroup, false);
        this.f17042 = (RecyclerView) viewInflate.findViewById(C0328R.id.item_list_view);
        C7011 c7011 = new C7011();
        if (f17040 == null) {
            f17040 = new ArrayList();
            for (Object obj : ItemUiInfoManager.rootContainer) {
                if (obj instanceof ItemUiInfoGroupWrapper) {
                    ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj;
                    f17040.add(itemUiInfoGroupWrapper);
                    f17040.addAll(itemUiInfoGroupWrapper.getDirectoryUIInfoList());
                } else {
                    f17040.add(obj);
                }
            }
            Iterator<Class<? extends OtherViewItemInfo>> it = OtherViewItemInfo.OTHER_VIEW_ITEM_INFO_LIST.iterator();
            while (it.hasNext()) {
                try {
                    f17040.add(it.next().getConstructor(Context.class).newInstance(m5003()));
                } catch (Exception e) {
                    AbstractC7017.m12165(e);
                }
            }
        }
        ArrayList arrayList = f17040;
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
        arrayList.getClass();
        AbstractC8798.m14017(c7011, arrayList);
        ArrayList arrayList2 = C7011.f17352;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f17042.setAdapter(c7011);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.m5243(1);
        this.f17042.setLayoutManager(linearLayoutManager);
        this.f17042.m5291(new C6994());
        ((MainSettingActivity) m5003()).leftIcon.setOnClickListener(new ViewOnClickListenerC0933(this, 3));
        return viewInflate;
    }
}
