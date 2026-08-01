package p061e;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import p066g.AbstractC0561a;
import p068h.C0596o;
import p069i.C0682h1;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0525a implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1708b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1709c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0525a(int i2, Object obj) {
        this.f1708b = i2;
        this.f1709c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1708b) {
            case 0:
                C0530f c0530f = (C0530f) this.f1709c;
                Button button = c0530f.f1728f;
                c0530f.f1744v.obtainMessage(1, c0530f.f1724b).sendToTarget();
                break;
            case 1:
                ((AbstractC0561a) this.f1709c).mo1048a();
                break;
            default:
                C0682h1 c0682h1 = ((Toolbar) this.f1709c).f1081M;
                C0596o c0596o = c0682h1 == null ? null : c0682h1.f2295c;
                if (c0596o != null) {
                    c0596o.collapseActionView();
                }
                break;
        }
    }
}
