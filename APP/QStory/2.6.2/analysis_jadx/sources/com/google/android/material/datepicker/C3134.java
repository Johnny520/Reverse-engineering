package com.google.android.material.datepicker;

import androidx.fragment.app.AbstractComponentCallbacksC2338;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3134 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC2338 f10321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10322;

    public /* synthetic */ C3134(int i, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f10322 = i;
        this.f10321 = abstractComponentCallbacksC2338;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7152(Object obj) {
        int i = this.f10322;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f10321;
        switch (i) {
            case 0:
                C3135 c3135 = (C3135) abstractComponentCallbacksC2338;
                String strMo7113 = c3135.m7159().mo7113(c3135.m4431());
                c3135.f10332.setContentDescription(c3135.m7159().mo7110(c3135.m4425()));
                c3135.f10332.setText(strMo7113);
                c3135.f10324.setEnabled(c3135.m7159().mo7108());
                break;
            default:
                Iterator it = ((C3132) abstractComponentCallbacksC2338).f10276.iterator();
                while (it.hasNext()) {
                    ((C3134) it.next()).m7152(obj);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7153() {
        int i = this.f10322;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f10321;
        switch (i) {
            case 0:
                ((C3135) abstractComponentCallbacksC2338).f10324.setEnabled(false);
                break;
            default:
                Iterator it = ((C3132) abstractComponentCallbacksC2338).f10276.iterator();
                while (it.hasNext()) {
                    ((C3134) it.next()).m7153();
                }
                break;
        }
    }
}
