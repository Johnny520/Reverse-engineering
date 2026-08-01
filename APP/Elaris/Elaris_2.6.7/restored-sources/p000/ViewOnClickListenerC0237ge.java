package p000;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.AbstractC0169w;

/* JADX INFO: renamed from: ge */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0237ge implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0515w6[] f329b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f330c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int[] f331d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ClassLoader f332e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0410pd f333f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Dialog f334g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TextView f335h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LinearLayout f336i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0237ge(C0410pd c0410pd, Activity activity, Dialog dialog, LinearLayout linearLayout, TextView textView, ClassLoader classLoader, int[] iArr, C0515w6[] c0515w6Arr) {
        this.f328a = 1;
        this.f329b = c0515w6Arr;
        this.f330c = activity;
        this.f331d = iArr;
        this.f332e = classLoader;
        this.f333f = c0410pd;
        this.f334g = dialog;
        this.f335h = textView;
        this.f336i = linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f328a) {
            case 0:
                int[] iArr = this.f331d;
                iArr[0] = iArr[0] + 1;
                AbstractC0169w.m240E0(this.f333f, this.f330c, this.f334g, this.f336i, this.f335h, this.f332e, iArr, this.f329b);
                break;
            case 1:
                C0515w6[] c0515w6Arr = this.f329b;
                C0515w6 c0515w6 = c0515w6Arr[0];
                C0515w6 c0515w6M1126f = c0515w6 == null ? null : c0515w6.m1126f();
                if (c0515w6M1126f != null && c0515w6M1126f.m1124d()) {
                    c0515w6Arr[0] = c0515w6M1126f;
                    AbstractC0169w.m290d(this.f330c, c0515w6M1126f);
                    int[] iArr2 = this.f331d;
                    iArr2[0] = 0;
                    AbstractC0169w.m240E0(this.f333f, this.f330c, this.f334g, this.f336i, this.f335h, this.f332e, iArr2, c0515w6Arr);
                    break;
                }
                break;
            default:
                int[] iArr3 = this.f331d;
                iArr3[0] = Math.max(0, iArr3[0] - 1);
                AbstractC0169w.m240E0(this.f333f, this.f330c, this.f334g, this.f336i, this.f335h, this.f332e, iArr3, this.f329b);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0237ge(int[] iArr, Activity activity, ClassLoader classLoader, C0410pd c0410pd, Dialog dialog, TextView textView, LinearLayout linearLayout, C0515w6[] c0515w6Arr, int i) {
        this.f328a = i;
        this.f331d = iArr;
        this.f330c = activity;
        this.f332e = classLoader;
        this.f333f = c0410pd;
        this.f334g = dialog;
        this.f335h = textView;
        this.f336i = linearLayout;
        this.f329b = c0515w6Arr;
    }
}
