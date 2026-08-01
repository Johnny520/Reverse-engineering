package p008;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ViewOnClickListenerC0086;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoManager;
import p007.C6131;
import p007.C6148;
import p010.AbstractC6157;
import p217.AbstractC7968;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6150 extends AbstractComponentCallbacksC2338 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static ArrayList f16766;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static C6150 f16767;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public RecyclerView f16768;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4444(Bundle bundle) {
        super.mo4444(bundle);
        f16767 = this;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4445(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_layout, viewGroup, false);
        this.f16768 = (RecyclerView) viewInflate.findViewById(R.id.item_list_view);
        C6148 c6148 = new C6148();
        if (f16766 == null) {
            f16766 = new ArrayList();
            for (Object obj : ItemUiInfoManager.rootContainer) {
                if (obj instanceof ItemUiInfoGroupWrapper) {
                    ItemUiInfoGroupWrapper itemUiInfoGroupWrapper = (ItemUiInfoGroupWrapper) obj;
                    f16766.add(itemUiInfoGroupWrapper);
                    f16766.addAll(itemUiInfoGroupWrapper.getDirectoryUIInfoList());
                } else {
                    f16766.add(obj);
                }
            }
            Iterator<Class<? extends OtherViewItemInfo>> it = OtherViewItemInfo.OTHER_VIEW_ITEM_INFO_LIST.iterator();
            while (it.hasNext()) {
                try {
                    f16766.add(it.next().getConstructor(Context.class).newInstance(m4433()));
                } catch (Exception e) {
                    AbstractC6157.m11575(e);
                }
            }
        }
        ArrayList arrayList = f16766;
        "list";
        arrayList.getClass();
        AbstractC7968.m13430(c6148, arrayList);
        ArrayList arrayList2 = C6148.f16765;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f16768.setAdapter(c6148);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.m4673(1);
        this.f16768.setLayoutManager(linearLayoutManager);
        this.f16768.m4721(new C6131());
        ((MainSettingActivity) m4433()).leftIcon.setOnClickListener(new ViewOnClickListenerC0086(this, 3));
        return viewInflate;
    }
}
