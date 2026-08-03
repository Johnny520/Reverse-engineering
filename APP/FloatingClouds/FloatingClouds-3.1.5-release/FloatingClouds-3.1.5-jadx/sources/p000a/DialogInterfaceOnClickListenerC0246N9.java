package p000a;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;
import java.io.Serializable;
import p000a.C0186K3;
import p000a.C0706m8;

/* JADX INFO: renamed from: a.N9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0246N9 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Serializable f853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f854c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0246N9(Serializable serializable, Object obj, int i) {
        this.f852a = i;
        this.f853b = serializable;
        this.f854c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f852a) {
            case 0:
                String str = (String) this.f853b;
                Context context = (Context) this.f854c;
                try {
                    ((ClipboardManager) C0889w1.f3488p.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Label", str));
                    break;
                } catch (Exception unused) {
                }
                Toast.makeText(context, "已复制 SnsId", 0).show();
                break;
            default:
                C0186K3.f638a.getClass();
                if (C0186K3.a.m502c().size() > 0) {
                    C0186K3.a.m517r(C0495b6.f1840a);
                }
                C0706m8.a.m1624b();
                C0706m8.a.m1623a();
                C0706m8 c0706m8 = C0706m8.f2654l;
                if (c0706m8 != null) {
                    c0706m8.m1621s();
                }
                C0706m8 c0706m82 = C0706m8.f2654l;
                if (c0706m82 != null) {
                    c0706m82.m1620r();
                }
                AlertDialog alertDialog = (AlertDialog) ((C0338Sc) this.f853b).f1200a;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                ((C0803ra) this.f854c).m1868e();
                break;
        }
    }
}
