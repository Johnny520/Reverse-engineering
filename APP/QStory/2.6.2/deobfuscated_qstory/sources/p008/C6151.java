package p008;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.util.ArrayList;
import lin.xposed.hook.view.main.MainSettingActivity;
import lin.xposed.hook.view.main.itemview.info.DirectoryUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p007.C6131;
import p007.C6148;
import p217.AbstractC7968;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6151 extends AbstractComponentCallbacksC2338 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static DirectoryUiInfo f16769;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public ArrayList f16770;

    public C6151(DirectoryUiInfo directoryUiInfo) {
        f16769 = directoryUiInfo;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo4437() {
        ((MainSettingActivity) m4426()).setTitleCenterText(m4448(R.string.app_name));
        this.f6878 = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4445(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.item_list_layout, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.item_list_view);
        C6148 c6148 = new C6148();
        Bundle bundle2 = this.f6904;
        if (bundle2 != null && bundle2.containsKey("TAG")) {
            if (this.f16770 == null) {
                this.f16770 = new ArrayList();
                for (ItemUiInfoGroupWrapper itemUiInfoGroupWrapper : f16769.groupWrapperList) {
                    this.f16770.add(itemUiInfoGroupWrapper);
                    this.f16770.addAll(itemUiInfoGroupWrapper.getDirectoryUIInfoList());
                }
                this.f16770.addAll(f16769.uiInfoList);
            }
            ArrayList arrayList = this.f16770;
            "list";
            arrayList.getClass();
            AbstractC7968.m13430(c6148, arrayList);
            ArrayList arrayList2 = C6148.f16765;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        recyclerView.setAdapter(c6148);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.m4673(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.m4721(new C6131());
        ((MainSettingActivity) m4433()).leftIcon.setOnClickListener(new ViewOnClickListenerC3182(this, 11));
        return viewInflate;
    }

    public C6151() {
    }
}
