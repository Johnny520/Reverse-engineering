package p259r9;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import gg.C1421q;
import gg.C1423s;
import gg.C1425u;

/* JADX INFO: renamed from: r9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3755f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1421q f12225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LinearLayout f12226c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f12227d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f12228e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ EditText f12229f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1425u f12230g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ EditText f12231h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1423s f12232i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ TextView f12233j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ScrollView f12234k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3752d0 f12235l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ TextView f12236m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ LinearLayout f12237n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C1425u f12238o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Context f12239p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC3755f(C1421q c1421q, LinearLayout linearLayout, TextView textView, int i9, EditText editText, C1425u c1425u, EditText editText2, C1423s c1423s, TextView textView2, ScrollView scrollView, C3752d0 c3752d0, TextView textView3, LinearLayout linearLayout2, C1425u c1425u2, Context context, int i10) {
        this.f12224a = i10;
        this.f12225b = c1421q;
        this.f12226c = linearLayout;
        this.f12227d = textView;
        this.f12228e = i9;
        this.f12229f = editText;
        this.f12230g = c1425u;
        this.f12231h = editText2;
        this.f12232i = c1423s;
        this.f12233j = textView2;
        this.f12234k = scrollView;
        this.f12235l = c3752d0;
        this.f12236m = textView3;
        this.f12237n = linearLayout2;
        this.f12238o = c1425u2;
        this.f12239p = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f12224a) {
            case 0:
                C3752d0.m7772K0(this.f12225b, this.f12226c, this.f12227d, this.f12228e, this.f12229f, this.f12230g, this.f12231h, this.f12232i, this.f12233j, this.f12234k, this.f12235l, this.f12236m, this.f12237n, this.f12238o, this.f12239p, false);
                break;
            case 1:
                C1421q c1421q = this.f12225b;
                boolean z9 = c1421q.f4734g;
                int i9 = this.f12228e;
                EditText editText = this.f12229f;
                TextView textView = this.f12233j;
                ScrollView scrollView = this.f12234k;
                C3752d0 c3752d0 = this.f12235l;
                TextView textView2 = this.f12236m;
                LinearLayout linearLayout = this.f12237n;
                C1425u c1425u = this.f12238o;
                if (!z9) {
                    C3752d0.m7769H0(c1421q, scrollView, c3752d0, textView2, linearLayout, editText, i9, textView, c1425u);
                } else {
                    LinearLayout linearLayout2 = this.f12226c;
                    C3752d0.m7772K0(c1421q, linearLayout2, this.f12227d, i9, editText, this.f12230g, this.f12231h, this.f12232i, textView, scrollView, c3752d0, textView2, linearLayout, c1425u, this.f12239p, linearLayout2.getVisibility() != 0);
                }
                break;
            default:
                LinearLayout linearLayout3 = this.f12226c;
                C3752d0.m7772K0(this.f12225b, linearLayout3, this.f12227d, this.f12228e, this.f12229f, this.f12230g, this.f12231h, this.f12232i, this.f12233j, this.f12234k, this.f12235l, this.f12236m, this.f12237n, this.f12238o, this.f12239p, linearLayout3.getVisibility() != 0);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC3755f(LinearLayout linearLayout, C1421q c1421q, TextView textView, int i9, EditText editText, C1425u c1425u, EditText editText2, C1423s c1423s, TextView textView2, ScrollView scrollView, C3752d0 c3752d0, TextView textView3, LinearLayout linearLayout2, C1425u c1425u2, Context context) {
        this.f12224a = 2;
        this.f12226c = linearLayout;
        this.f12225b = c1421q;
        this.f12227d = textView;
        this.f12228e = i9;
        this.f12229f = editText;
        this.f12230g = c1425u;
        this.f12231h = editText2;
        this.f12232i = c1423s;
        this.f12233j = textView2;
        this.f12234k = scrollView;
        this.f12235l = c3752d0;
        this.f12236m = textView3;
        this.f12237n = linearLayout2;
        this.f12238o = c1425u2;
        this.f12239p = context;
    }
}
