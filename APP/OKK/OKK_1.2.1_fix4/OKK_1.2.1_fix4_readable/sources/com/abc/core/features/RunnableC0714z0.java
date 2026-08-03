package com.abc.core.features;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.concurrent.atomic.AtomicBoolean;
import p031Q0.AbstractC0307g;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: c0.z0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0714z0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2248c;

    public /* synthetic */ RunnableC0714z0(Object obj, int i2, int i3) {
        this.f2246a = i3;
        this.f2248c = obj;
        this.f2247b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f2247b;
        Object obj = this.f2248c;
        switch (this.f2246a) {
            case 0:
                View view = (View) obj;
                AbstractC0307g.m703e(view, "$v");
                view.setVisibility(i2);
                break;
            case 1:
                TextView textView = (TextView) obj;
                AbstractC0307g.m703e(textView, "$nickname");
                AtomicBoolean atomicBoolean = GroupMemberTitleHook.f1874a;
                GroupMemberTitleHook.m1496a(textView, i2);
                break;
            case 2:
                ((AbstractC1083b) obj).mo2163f(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view2 = (View) sideSheetBehavior.f2424p.get();
                if (view2 != null) {
                    sideSheetBehavior.m1884t(view2, i2, false);
                }
                break;
        }
    }
}
