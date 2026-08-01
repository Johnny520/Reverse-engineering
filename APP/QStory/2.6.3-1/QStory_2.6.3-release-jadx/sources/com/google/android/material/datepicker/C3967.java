package com.google.android.material.datepicker;

import androidx.fragment.app.AbstractComponentCallbacksC3171;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC3171 f10671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10672;

    public /* synthetic */ C3967(int i, AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        this.f10672 = i;
        this.f10671 = abstractComponentCallbacksC3171;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7698(Object obj) {
        int i = this.f10672;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f10671;
        switch (i) {
            case 0:
                C3968 c3968 = (C3968) abstractComponentCallbacksC3171;
                String strMo7659 = c3968.m7705().mo7659(c3968.m5001());
                c3968.f10682.setContentDescription(c3968.m7705().mo7658(c3968.m4995()));
                c3968.f10682.setText(strMo7659);
                c3968.f10674.setEnabled(c3968.m7705().mo7654());
                break;
            default:
                Iterator it = ((C3965) abstractComponentCallbacksC3171).f10626.iterator();
                while (it.hasNext()) {
                    ((C3967) it.next()).m7698(obj);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7699() {
        int i = this.f10672;
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f10671;
        switch (i) {
            case 0:
                ((C3968) abstractComponentCallbacksC3171).f10674.setEnabled(false);
                break;
            default:
                Iterator it = ((C3965) abstractComponentCallbacksC3171).f10626.iterator();
                while (it.hasNext()) {
                    ((C3967) it.next()).m7699();
                }
                break;
        }
    }
}
