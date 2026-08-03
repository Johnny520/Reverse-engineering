package va;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.widget.Toast;

/* JADX INFO: renamed from: va.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC4541a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f14989b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f14990c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC4541a(Activity activity, String str, int i9) {
        this.f14988a = i9;
        this.f14989b = activity;
        this.f14990c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14988a) {
            case 0:
                Activity activity = this.f14989b;
                Object systemService = activity.getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("ID", this.f14990c));
                }
                Toast.makeText(activity, "已复制ID", 0).show();
                break;
            case 1:
                Activity activity2 = this.f14989b;
                Object systemService2 = activity2.getSystemService("clipboard");
                ClipboardManager clipboardManager2 = systemService2 instanceof ClipboardManager ? (ClipboardManager) systemService2 : null;
                if (clipboardManager2 != null) {
                    clipboardManager2.setPrimaryClip(ClipData.newPlainText("ID", this.f14990c));
                }
                Toast.makeText(activity2, "已复制ID", 0).show();
                break;
            default:
                Activity activity3 = this.f14989b;
                Object systemService3 = activity3.getSystemService("clipboard");
                ClipboardManager clipboardManager3 = systemService3 instanceof ClipboardManager ? (ClipboardManager) systemService3 : null;
                if (clipboardManager3 != null) {
                    clipboardManager3.setPrimaryClip(ClipData.newPlainText("ID", this.f14990c));
                }
                Toast.makeText(activity3, "已复制ID", 0).show();
                break;
        }
    }
}
