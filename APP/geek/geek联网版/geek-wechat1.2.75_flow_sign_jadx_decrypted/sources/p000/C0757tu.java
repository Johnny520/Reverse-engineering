package p000;

import android.app.Activity;
import android.app.C0986;
import android.database.DataSetObserver;
import android.support.v4.graphics.drawable.C0987;
import android.widget.ListAdapter;
import android.window.C0988;
import android.window.C0989;
import android.window.C0990;
import android.window.C0991;
import androidx.activity.result.C0993;
import androidx.activity.result.C0994;
import androidx.appcompat.app.C0997;
import androidx.appcompat.view.menu.C0999;
import androidx.constraintlayout.helper.widget.C1001;
import androidx.coordinatorlayout.widget.C1002;
import androidx.coordinatorlayout.widget.C1003;
import androidx.coordinatorlayout.widget.C1004;
import androidx.core.content.C1006;
import androidx.core.content.C1007;
import androidx.core.graphics.drawable.C1009;
import androidx.legacy.content.C1012;
import androidx.legacy.content.C1014;
import com.github.megatronking.stringfog.annotation.C1016;
import com.google.android.material.appbar.C1020;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.bottomappbar.C1024;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1029;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.internal.C1038;
import com.google.android.material.sidesheet.C1039;
import com.google.android.material.textfield.C1041;
import com.google.android.material.theme.C1042;
import com.ljx.wechatmod.hook.C1049;
import com.ljx.wechatmod.p001ui.C1050;
import com.ljx.wechatmod.p001ui.C1051;
import kotlinx.coroutines.C1056;

/* JADX INFO: renamed from: tu */
/* JADX INFO: loaded from: classes.dex */
public final class C0757tu implements ListAdapter {

    /* JADX INFO: renamed from: a */
    public final int f4579a;

    /* JADX INFO: renamed from: b */
    public final ListAdapter f4580b;

    /* JADX INFO: renamed from: c */
    public final Object f4581c;

    /* JADX INFO: renamed from: d */
    public final Activity f4582d;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0757tu(int r4, android.widget.ListAdapter r5, java.lang.Object r6, android.app.Activity r7) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0757tu.<init>(int, android.widget.ListAdapter, java.lang.Object, android.app.Activity):void");
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.f4580b.areAllItemsEnabled();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f4579a + (C1016.f5663 ^ (-115));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0026 A[SYNTHETIC] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getItem(int r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ۨۨ۠"
            int r3 = com.google.android.material.datepicker.C1033.m3042(r2)
            r2 = r1
        L9:
            switch(r3) {
                case 56452: goto Ld;
                case 56476: goto L5c;
                case 1750784: goto L67;
                case 1751529: goto L74;
                case 1752549: goto L20;
                case 1753512: goto L3c;
                case 1755616: goto L46;
                default: goto Lc;
            }
        Lc:
            goto L9
        Ld:
            int r1 = r4.f4579a
            int r2 = androidx.coordinatorlayout.widget.C1003.f5650
            int r3 = androidx.appcompat.view.menu.C0998.f5645
            int r3 = r3 + (-9462)
            int r2 = r2 % r3
            if (r2 < 0) goto L6c
            java.lang.String r2 = "ۣۧۤ"
            int r3 = androidx.constraintlayout.helper.widget.C1001.m2914(r2)
            r2 = r1
            goto L9
        L20:
            int r1 = kotlinx.coroutines.C1055.m3130()
            if (r1 < 0) goto L31
            android.window.C0990.m2872()
            java.lang.String r1 = "۟ۡۥ"
        L2b:
            int r1 = com.google.android.material.timepicker.C1044.m3085(r1)
            r3 = r1
            goto L9
        L31:
            int r1 = com.google.android.material.datepicker.C1034.f5681
            int r3 = com.google.android.material.datepicker.C1036.f5683
            int r1 = r1 * r3
            r3 = -1738400(0xffffffffffe57960, float:NaN)
            r1 = r1 ^ r3
            r3 = r1
            goto L9
        L3c:
            int r1 = androidx.core.content.C1007.f5654
            r1 = r1 ^ (-986(0xfffffffffffffc26, float:NaN))
            int r1 = r1 + r2
            java.lang.Object r0 = r0.getItem(r1)
        L45:
            return r0
        L46:
            android.widget.ListAdapter r0 = r4.f4580b
            int r1 = com.google.android.material.internal.C1038.f5685
            int r3 = android.window.C0988.f5635
            r3 = r3 ^ (-7837(0xffffffffffffe163, float:NaN))
            int r1 = r1 + r3
            if (r1 > 0) goto L59
        L51:
            java.lang.String r1 = "ۦۢۤ"
            int r1 = com.google.android.material.bottomappbar.C1024.m3009(r1)
            r3 = r1
            goto L9
        L59:
            java.lang.String r1 = "ۤۨ"
            goto L2b
        L5c:
            int r1 = com.google.android.material.floatingactionbutton.C1037.f5684
            int r3 = com.google.android.material.carousel.C1027.f5674
            r1 = r1 | r3
            r3 = 1754593(0x1ac5e1, float:2.458708E-39)
            int r1 = r1 + r3
            r3 = r1
            goto L9
        L67:
            java.lang.Object r0 = r0.getItem(r5)
            goto L45
        L6c:
            java.lang.String r2 = "ۤ۠ۥ"
            int r3 = com.google.android.material.carousel.C1028.m3025(r2)
            r2 = r1
            goto L9
        L74:
            if (r5 != r2) goto L20
            int r1 = androidx.core.content.C1007.m2939()
            if (r1 < 0) goto L51
            com.google.android.material.datepicker.C1036.m3054()
            java.lang.String r1 = "ۤۨ"
            int r1 = androidx.appcompat.widget.C1000.m2911(r1)
            r3 = r1
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0757tu.getItem(int):java.lang.Object");
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        int iM2961 = C1012.m2961("ۨۦۡ");
        while (true) {
            switch (iM2961) {
                case 1753574:
                    iM2961 = C0986.f5633 * (C0990.f5637 | 2026) > 0 ? (C0997.f5644 - C1050.f5697) ^ (-1756067) : C1002.m2920("ۦۨ۟");
                    break;
                case 1755555:
                    return i;
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        String str;
        int i3 = 0;
        int iM2889 = C0994.m2889("ۦۢۥ");
        ListAdapter listAdapter = null;
        while (true) {
            switch (iM2889) {
                case 1748738:
                    return listAdapter.getItemViewType(i);
                case 1749733:
                    if (i != i3) {
                        iM2889 = (C1049.f5696 | C1001.f5648) ^ (-1748739);
                    } else if (C0991.f5638 > 0) {
                        iM2889 = (C1024.f5671 % C1004.f5651) + 1751526;
                    } else {
                        C1032.f5679 = 29;
                        i2 = i3;
                        iM2889 = C1002.m2920("ۢۤۧ");
                        i3 = i2;
                    }
                    break;
                case 1751621:
                    return listAdapter.getItemViewType((C1038.f5685 ^ 390) + i3);
                case 1753513:
                    ListAdapter listAdapter2 = this.f4580b;
                    if ((C1033.f5680 ^ (C1030.f5677 / (-8091))) <= 0) {
                        C1014.m2968();
                    }
                    iM2889 = C1009.m2946("ۧۦۣ");
                    listAdapter = listAdapter2;
                    break;
                case 1754596:
                    i2 = this.f4579a;
                    if (C1014.f5661 > 0) {
                        iM2889 = C1002.m2920("ۢۤۧ");
                        i3 = i2;
                    } else {
                        C1023.m3003();
                        iM2889 = C1059.m3145("ۦۢۥ");
                        i3 = i2;
                    }
                    break;
                case 1755372:
                    iM2889 = (C1049.f5696 | C1001.f5648) ^ (-1748739);
                    break;
                case 1755400:
                    if (C1056.m3134() >= 0) {
                        C1050.f5697 = 66;
                        str = "ۡۤۦ";
                    } else {
                        str = "ۦۢۥ";
                    }
                    iM2889 = C1041.m3074(str);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f7  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0757tu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return this.f4580b.getViewTypeCount();
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f4580b.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return this.f4580b.isEmpty();
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        int iM3078 = C1042.m3078("ۦ۠");
        while (true) {
            switch (iM3078) {
                case 56506:
                    return true;
                case 1747780:
                    iM3078 = C0989.f5636 + (C1004.f5651 - 1404) < 0 ? (C0990.f5637 | C1020.f5667) + 56541 : C1022.m3001("ۣۣ۟");
                    break;
            }
        }
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        int iM3067 = C1039.m3067("ۦ۟ۧ");
        while (true) {
            switch (iM3067) {
                case 1750779:
                    return;
                case 1753422:
                    this.f4580b.registerDataSetObserver(dataSetObserver);
                    iM3067 = (C1036.f5683 ^ C1006.f5653) ^ (-1750696);
                    break;
                case 1754473:
                    if (C0987.f5634 * (C1016.f5663 ^ 4090) < 0) {
                        iM3067 = C0993.f5640 + C1007.f5654 + 1753080;
                    } else {
                        C1056.m3134();
                        iM3067 = C1022.m3001("۠ۨ۠");
                    }
                    break;
            }
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        int iM2922 = C1003.m2922("ۤۢۥ");
        while (true) {
            switch (iM2922) {
                case 1750602:
                    iM2922 = C1029.f5676 < 0 ? (C1039.f5686 * C0988.f5635) + 1207665 : C1049.m3104("ۧۨ۟");
                    break;
                case 1751591:
                    this.f4580b.unregisterDataSetObserver(dataSetObserver);
                    if (C0999.f5646 < 0) {
                        iM2922 = C1027.m3021("ۧۨۥ");
                    } else {
                        C1051.f5698 = 21;
                        iM2922 = C1002.m2920("ۤۢۥ");
                    }
                    break;
                case 1754660:
                    return;
            }
        }
    }
}
