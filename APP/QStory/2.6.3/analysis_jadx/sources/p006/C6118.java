package p006;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.util.ArrayList;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p009.C6165;
import p009.C6182;
import p217.AbstractC7969;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6118 extends AbstractComponentCallbacksC2338 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static DirectoryUiInfo f16698;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public ArrayList f16699;

    public C6118(DirectoryUiInfo directoryUiInfo) {
        f16698 = directoryUiInfo;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo4447() {
        ((MainSettingActivity) m4436()).setTitleCenterText(m4458(R.string.app_name));
        this.f6879 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4455(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_layout, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.item_list_view);
        C6182 c6182 = new C6182();
        Bundle bundle2 = this.f6905;
        if (bundle2 != null && bundle2.containsKey(AbstractC8405.m13973("喵喵呜喵喵呜呜呜~喵喵呜呜喵呜喵喵~喵喵呜呜呜呜喵呜"))) {
            if (this.f16699 == null) {
                this.f16699 = new ArrayList();
                for (ItemUiInfoGroupWrapper itemUiInfoGroupWrapper : f16698.groupWrapperList) {
                    this.f16699.add(itemUiInfoGroupWrapper);
                    this.f16699.addAll(itemUiInfoGroupWrapper.getDirectoryUIInfoList());
                }
                this.f16699.addAll(f16698.uiInfoList);
            }
            ArrayList arrayList = this.f16699;
            AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵");
            arrayList.getClass();
            AbstractC7969.m13458(c6182, arrayList);
            ArrayList arrayList2 = C6182.f17007;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        recyclerView.setAdapter(c6182);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.m4683(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4731(new C6165());
        ((MainSettingActivity) m4443()).leftIcon.setOnClickListener(new ViewOnClickListenerC3183(this, 8));
        return viewInflate;
    }

    public C6118() {
    }
}
