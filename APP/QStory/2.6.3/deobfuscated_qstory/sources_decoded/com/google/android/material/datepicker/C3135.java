package com.google.android.material.datepicker;

import androidx.fragment.app.AbstractComponentCallbacksC2338;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3135 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC2338 f10326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10327;

    public /* synthetic */ C3135(int i, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f10327 = i;
        this.f10326 = abstractComponentCallbacksC2338;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m7139(Object obj) {
        int i = this.f10327;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f10326;
        switch (i) {
            case 0:
                C3136 c3136 = (C3136) abstractComponentCallbacksC2338;
                String strMo7100 = c3136.m7146().mo7100(c3136.m4441());
                c3136.f10337.setContentDescription(c3136.m7146().mo7099(c3136.m4435()));
                c3136.f10337.setText(strMo7100);
                c3136.f10329.setEnabled(c3136.m7146().mo7095());
                break;
            default:
                Iterator it = ((C3133) abstractComponentCallbacksC2338).f10281.iterator();
                while (it.hasNext()) {
                    ((C3135) it.next()).m7139(obj);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m7140() {
        int i = this.f10327;
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f10326;
        switch (i) {
            case 0:
                ((C3136) abstractComponentCallbacksC2338).f10329.setEnabled(false);
                break;
            default:
                Iterator it = ((C3133) abstractComponentCallbacksC2338).f10281.iterator();
                while (it.hasNext()) {
                    ((C3135) it.next()).m7140();
                }
                break;
        }
    }
}
