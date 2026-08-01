package p008E;

import android.database.DataSetObserver;
import p069i.AbstractC0619F0;
import p069i.ViewOnClickListenerC0667c1;

/* JADX INFO: renamed from: E.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0098b extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f385b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0098b(int i2, Object obj) {
        this.f384a = i2;
        this.f385b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f384a) {
            case 0:
                ViewOnClickListenerC0667c1 viewOnClickListenerC0667c1 = (ViewOnClickListenerC0667c1) this.f385b;
                viewOnClickListenerC0667c1.f386b = true;
                viewOnClickListenerC0667c1.notifyDataSetChanged();
                break;
            default:
                AbstractC0619F0 abstractC0619F0 = (AbstractC0619F0) this.f385b;
                if (abstractC0619F0.f2152z.isShowing()) {
                    abstractC0619F0.mo1146h();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f384a) {
            case 0:
                ViewOnClickListenerC0667c1 viewOnClickListenerC0667c1 = (ViewOnClickListenerC0667c1) this.f385b;
                viewOnClickListenerC0667c1.f386b = false;
                viewOnClickListenerC0667c1.notifyDataSetInvalidated();
                break;
            default:
                ((AbstractC0619F0) this.f385b).dismiss();
                break;
        }
    }
}
