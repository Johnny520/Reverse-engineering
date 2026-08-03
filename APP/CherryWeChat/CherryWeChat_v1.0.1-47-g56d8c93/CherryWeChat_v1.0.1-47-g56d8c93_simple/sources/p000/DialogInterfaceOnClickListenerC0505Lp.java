package p000;

import android.content.DialogInterface;
import android.widget.EditText;
import io.github.cherrywechat.lua.loader.ScriptManager;
import java.util.List;

/* JADX INFO: renamed from: Lp */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0505Lp implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1657a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0762Rp f1658b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0505Lp(C0762Rp r1, int r2) {
        this.f1657a = r2;
        this.f1658b = r1;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r5, int r6) {
        switch(this.f1657a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ScriptManager.INSTANCE.unloadAll();
        C0762Rp r52 = this.f1658b;
        r52.m1560g();
        r52.m1559a(AbstractC0295Gu.m625r(-482780093872181L));
        return;
    L6:
        C0762Rp r53 = this.f1658b;
        EditText r0 = r53.f2410b;
        List r1 = r53.f2425q;
        if (r0 != null) goto L9;
        AbstractC0295Gu.m625r(-483746461513781L);
        r0 = null;
    L9:
        r0.setText(((C0634Op) r1.get(r6)).f2031c);
        r53.m1559a(AbstractC0295Gu.m625r(-483243950340149L) + ((C0634Op) r1.get(r6)).f2029a + '\n');
    }
}
