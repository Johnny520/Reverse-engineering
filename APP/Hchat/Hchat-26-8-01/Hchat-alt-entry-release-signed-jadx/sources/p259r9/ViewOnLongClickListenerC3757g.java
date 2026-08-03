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

/* JADX INFO: renamed from: r9.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC3757g implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12252a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1421q f12253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LinearLayout f12254c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TextView f12255d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f12256e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ EditText f12257f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1425u f12258g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ EditText f12259h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1423s f12260i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ TextView f12261j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ScrollView f12262k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C3752d0 f12263l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ TextView f12264m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ LinearLayout f12265n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C1425u f12266o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Context f12267p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnLongClickListenerC3757g(C1421q c1421q, LinearLayout linearLayout, TextView textView, int i9, EditText editText, C1425u c1425u, EditText editText2, C1423s c1423s, TextView textView2, ScrollView scrollView, C3752d0 c3752d0, TextView textView3, LinearLayout linearLayout2, C1425u c1425u2, Context context, int i10) {
        this.f12252a = i10;
        this.f12253b = c1421q;
        this.f12254c = linearLayout;
        this.f12255d = textView;
        this.f12256e = i9;
        this.f12257f = editText;
        this.f12258g = c1425u;
        this.f12259h = editText2;
        this.f12260i = c1423s;
        this.f12261j = textView2;
        this.f12262k = scrollView;
        this.f12263l = c3752d0;
        this.f12264m = textView3;
        this.f12265n = linearLayout2;
        this.f12266o = c1425u2;
        this.f12267p = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f12252a) {
            case 0:
                C3752d0.m7772K0(this.f12253b, this.f12254c, this.f12255d, this.f12256e, this.f12257f, this.f12258g, this.f12259h, this.f12260i, this.f12261j, this.f12262k, this.f12263l, this.f12264m, this.f12265n, this.f12266o, this.f12267p, false);
                break;
            case 1:
                C1421q c1421q = this.f12253b;
                boolean z9 = c1421q.f4734g;
                int i9 = this.f12256e;
                EditText editText = this.f12257f;
                TextView textView = this.f12261j;
                ScrollView scrollView = this.f12262k;
                C3752d0 c3752d0 = this.f12263l;
                TextView textView2 = this.f12264m;
                LinearLayout linearLayout = this.f12265n;
                C1425u c1425u = this.f12266o;
                if (!z9) {
                    C3752d0.m7769H0(c1421q, scrollView, c3752d0, textView2, linearLayout, editText, i9, textView, c1425u);
                } else {
                    LinearLayout linearLayout2 = this.f12254c;
                    C3752d0.m7772K0(c1421q, linearLayout2, this.f12255d, i9, editText, this.f12258g, this.f12259h, this.f12260i, textView, scrollView, c3752d0, textView2, linearLayout, c1425u, this.f12267p, linearLayout2.getVisibility() != 0);
                }
                break;
            default:
                LinearLayout linearLayout3 = this.f12254c;
                C3752d0.m7772K0(this.f12253b, linearLayout3, this.f12255d, this.f12256e, this.f12257f, this.f12258g, this.f12259h, this.f12260i, this.f12261j, this.f12262k, this.f12263l, this.f12264m, this.f12265n, this.f12266o, this.f12267p, linearLayout3.getVisibility() != 0);
                break;
        }
        return true;
    }

    public /* synthetic */ ViewOnLongClickListenerC3757g(LinearLayout linearLayout, C1421q c1421q, TextView textView, int i9, EditText editText, C1425u c1425u, EditText editText2, C1423s c1423s, TextView textView2, ScrollView scrollView, C3752d0 c3752d0, TextView textView3, LinearLayout linearLayout2, C1425u c1425u2, Context context) {
        this.f12252a = 2;
        this.f12254c = linearLayout;
        this.f12253b = c1421q;
        this.f12255d = textView;
        this.f12256e = i9;
        this.f12257f = editText;
        this.f12258g = c1425u;
        this.f12259h = editText2;
        this.f12260i = c1423s;
        this.f12261j = textView2;
        this.f12262k = scrollView;
        this.f12263l = c3752d0;
        this.f12264m = textView3;
        this.f12265n = linearLayout2;
        this.f12266o = c1425u2;
        this.f12267p = context;
    }
}
