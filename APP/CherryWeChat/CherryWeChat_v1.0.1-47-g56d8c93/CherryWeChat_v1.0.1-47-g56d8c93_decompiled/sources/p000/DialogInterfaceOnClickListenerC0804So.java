package p000;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: So */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0804So implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2525a;

    /* JADX INFO: renamed from: a */
    private final void m1610a(DialogInterface dialogInterface, int i) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f2525a) {
            case 0:
                break;
            case 1:
                C2227mD.f7746a.getClass();
                SharedPreferences.Editor editorEdit = C2227mD.m4485d().edit();
                editorEdit.putBoolean(AbstractC0295Gu.m625r(-463491395745845L), true);
                editorEdit.apply();
                break;
            default:
                SharedPreferences.Editor editorEdit2 = AbstractC1257cG.m2376d().edit();
                editorEdit2.putBoolean(AbstractC0295Gu.m625r(-596515122837557L), false);
                editorEdit2.apply();
                break;
        }
    }
}
