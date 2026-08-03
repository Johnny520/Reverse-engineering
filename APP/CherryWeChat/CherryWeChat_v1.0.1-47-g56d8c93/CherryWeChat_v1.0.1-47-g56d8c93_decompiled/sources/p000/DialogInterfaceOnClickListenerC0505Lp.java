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

    public /* synthetic */ DialogInterfaceOnClickListenerC0505Lp(C0762Rp c0762Rp, int i) {
        this.f1657a = i;
        this.f1658b = c0762Rp;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f1657a) {
            case 0:
                C0762Rp c0762Rp = this.f1658b;
                EditText editText = c0762Rp.f2410b;
                List list = c0762Rp.f2425q;
                if (editText == null) {
                    AbstractC0295Gu.m625r(-483746461513781L);
                    editText = null;
                }
                editText.setText(((C0634Op) list.get(i)).f2031c);
                c0762Rp.m1559a(AbstractC0295Gu.m625r(-483243950340149L) + ((C0634Op) list.get(i)).f2029a + '\n');
                break;
            default:
                ScriptManager.INSTANCE.unloadAll();
                C0762Rp c0762Rp2 = this.f1658b;
                c0762Rp2.m1560g();
                c0762Rp2.m1559a(AbstractC0295Gu.m625r(-482780093872181L));
                break;
        }
    }
}
