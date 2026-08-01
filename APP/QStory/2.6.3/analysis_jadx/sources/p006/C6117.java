package p006;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ViewOnClickListenerC0086;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import p009.C6165;
import p009.C6182;
import p010.AbstractC6188;
import p217.AbstractC7969;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6117 extends AbstractComponentCallbacksC2338 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static ArrayList f16695;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static C6117 f16696;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public RecyclerView f16697;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4454(Bundle bundle) {
        super.mo4454(bundle);
        f16696 = this;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4455(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_layout, viewGroup, false);
        this.f16697 = (RecyclerView) viewInflate.findViewById(R.id.item_list_view);
        C6182 c6182 = new C6182();
        if (f16695 == null) {
            f16695 = new ArrayList();
            for (Object obj : ItemUiInfoManager.rootContainer) {
                if (obj instanceof ItemUiInfoGroupWrapper) {
                    ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj;
                    f16695.add(itemUiInfoGroupWrapper);
                    f16695.addAll(itemUiInfoGroupWrapper.getDirectoryUIInfoList());
                } else {
                    f16695.add(obj);
                }
            }
            Iterator<Class<? extends OtherViewItemInfo>> it = OtherViewItemInfo.OTHER_VIEW_ITEM_INFO_LIST.iterator();
            while (it.hasNext()) {
                try {
                    f16695.add(it.next().getConstructor(Context.class).newInstance(m4443()));
                } catch (Exception e) {
                    AbstractC6188.m11606(e);
                }
            }
        }
        ArrayList arrayList = f16695;
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
        arrayList.getClass();
        AbstractC7969.m13458(c6182, arrayList);
        ArrayList arrayList2 = C6182.f17007;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f16697.setAdapter(c6182);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.m4683(1);
        this.f16697.setLayoutManager(linearLayoutManager);
        this.f16697.m4731(new C6165());
        ((MainSettingActivity) m4443()).leftIcon.setOnClickListener(new ViewOnClickListenerC0086(this, 3));
        return viewInflate;
    }
}
