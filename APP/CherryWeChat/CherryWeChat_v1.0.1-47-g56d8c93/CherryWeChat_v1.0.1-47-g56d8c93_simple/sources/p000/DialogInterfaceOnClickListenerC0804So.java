package p000;

import android.content.DialogInterface;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: So */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0804So implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2525a;

    public /* synthetic */ DialogInterfaceOnClickListenerC0804So(int r1) {
        this.f2525a = r1;
    }

    /* JADX INFO: renamed from: a */
    private final void m1610a(DialogInterface r1, int r2) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r3, int r4) {
        switch(this.f2525a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        SharedPreferences.Editor r32 = AbstractC1257cG.m2376d().edit();
        r32.putBoolean(AbstractC0295Gu.m625r(-596515122837557L), false);
        r32.apply();
        return;
    L6:
        C2227mD.f7746a.getClass();
        SharedPreferences.Editor r33 = C2227mD.m4485d().edit();
        r33.putBoolean(AbstractC0295Gu.m625r(-463491395745845L), true);
        r33.apply();
        return;
    }
}
