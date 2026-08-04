package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: yyds.ᲇᛷᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2477 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1127 f12264;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12265;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Context f12266;

    public /* synthetic */ DialogInterfaceOnClickListenerC2477(Context context, C1127 c1127, int i) {
        this.f12265 = i;
        this.f12266 = context;
        this.f12264 = c1127;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f12265;
        C1127 c1127 = this.f12264;
        Context context = this.f12266;
        switch (i2) {
            case 0:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context, c1127, null, 5), 3);
                break;
            case 1:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context, c1127, null, 4), 3);
                break;
            default:
                new AlertDialog.Builder(context).setTitle(AbstractC2328.m4341(-171398832751470L)).setMessage(AbstractC2328.m4341(-171420307587950L)).setPositiveButton(AbstractC2328.m4341(-171579221377902L), new DialogInterfaceOnClickListenerC2477(context, c1127, 0)).setNegativeButton(AbstractC2328.m4341(-171600696214382L), (DialogInterface.OnClickListener) null).show();
                break;
        }
    }
}
