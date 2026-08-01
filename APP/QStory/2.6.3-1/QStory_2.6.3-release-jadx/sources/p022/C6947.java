package p022;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.util.ArrayList;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p025.C6994;
import p025.C7011;
import p233.AbstractC8798;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6947 extends AbstractComponentCallbacksC3171 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static DirectoryUiInfo f17043;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public ArrayList f17044;

    public C6947(DirectoryUiInfo directoryUiInfo) {
        f17043 = directoryUiInfo;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo5007() {
        ((MainSettingActivity) m4996()).setTitleCenterText(m5018(C0328R.string.app_name));
        this.f7224 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo5015(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C0328R.layout.item_list_layout, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C0328R.id.item_list_view);
        C7011 c7011 = new C7011();
        Bundle bundle2 = this.f7250;
        if (bundle2 != null && bundle2.containsKey(AbstractC9234.m14532("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜呜喵呜"))) {
            if (this.f17044 == null) {
                this.f17044 = new ArrayList();
                for (ItemUiInfoGroupWrapper itemUiInfoGroupWrapper : f17043.groupWrapperList) {
                    this.f17044.add(itemUiInfoGroupWrapper);
                    this.f17044.addAll(itemUiInfoGroupWrapper.getDirectoryUIInfoList());
                }
                this.f17044.addAll(f17043.uiInfoList);
            }
            ArrayList arrayList = this.f17044;
            AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
            arrayList.getClass();
            AbstractC8798.m14017(c7011, arrayList);
            ArrayList arrayList2 = C7011.f17352;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        recyclerView.setAdapter(c7011);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.m5243(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m5291(new C6994());
        ((MainSettingActivity) m5003()).leftIcon.setOnClickListener(new ViewOnClickListenerC4015(this, 8));
        return viewInflate;
    }

    public C6947() {
    }
}
