package p000;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.AbstractC0169w;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: de */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0189de implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0515w6[] f198a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0515w6 f199b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0347n9 f200c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Activity f201d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int[] f202e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ClassLoader f203f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0410pd f204g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Dialog f205h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TextView f206i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LinearLayout f207j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0189de(C0515w6[] c0515w6Arr, C0515w6 c0515w6, C0347n9 c0347n9, Activity activity, int[] iArr, ClassLoader classLoader, C0410pd c0410pd, Dialog dialog, TextView textView, LinearLayout linearLayout) {
        this.f198a = c0515w6Arr;
        this.f199b = c0515w6;
        this.f200c = c0347n9;
        this.f201d = activity;
        this.f202e = iArr;
        this.f203f = classLoader;
        this.f204g = c0410pd;
        this.f205h = dialog;
        this.f206i = textView;
        this.f207j = linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0347n9 c0347n9 = this.f200c;
        C0515w6 c0515w6 = null;
        if (c0347n9.f599h) {
            C0515w6 c0515w62 = this.f199b;
            if (!c0515w62.m1125e()) {
                File file = c0347n9.f592a;
                if (file != null) {
                    c0515w6 = new C0515w6(file, (Uri) null, (Uri) null, (ArrayList) null, (ArrayList) null);
                }
            } else if (c0347n9.f593b != null) {
                ArrayList arrayList = new ArrayList((ArrayList) c0515w62.f1000d);
                arrayList.add((Uri) c0515w62.f999c);
                ArrayList arrayList2 = new ArrayList((ArrayList) c0515w62.f1001e);
                arrayList2.add(c0347n9.f594c);
                c0515w6 = new C0515w6((File) null, (Uri) c0515w62.f998b, c0347n9.f593b, arrayList, arrayList2);
            }
        }
        C0515w6[] c0515w6Arr = this.f198a;
        c0515w6Arr[0] = c0515w6;
        if (c0515w6 == null) {
            return;
        }
        AbstractC0169w.m290d(this.f201d, c0515w6);
        int[] iArr = this.f202e;
        iArr[0] = 0;
        TextView textView = this.f206i;
        AbstractC0169w.m240E0(this.f204g, this.f201d, this.f205h, this.f207j, textView, this.f203f, iArr, c0515w6Arr);
    }
}
