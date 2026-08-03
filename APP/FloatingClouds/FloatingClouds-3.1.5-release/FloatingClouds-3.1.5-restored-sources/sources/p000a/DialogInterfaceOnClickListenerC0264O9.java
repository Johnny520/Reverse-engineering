package p000a;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import java.util.LinkedHashSet;
import p000a.C0186K3;
import p000a.C0706m8;

/* JADX INFO: renamed from: a.O9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0264O9 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f948b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0264O9(int i, Object obj) {
        this.f947a = i;
        this.f948b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f947a) {
            case 0:
                String str = (String) this.f948b;
                C0186K3.f638a.getClass();
                LinkedHashSet linkedHashSetM502c = C0186K3.a.m502c();
                if (linkedHashSetM502c.add(str)) {
                    C0186K3.a.m517r(linkedHashSetM502c);
                }
                Context context = C0889w1.f3488p;
                if (context != null) {
                    C0653jc c0653jcM508i = C0186K3.a.m508i();
                    if (c0653jcM508i.f2426R) {
                        String str2 = c0653jcM508i.f2430V;
                        if (C0034Be.m101P(str2)) {
                            str2 = "刻舟求剑";
                        }
                        Toast.makeText(context, str2, 0).show();
                    }
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
                break;
            case 1:
                C0186K3.a aVar = C0186K3.f638a;
                C0439Y5 c0439y5 = C0439Y5.f1645a;
                aVar.getClass();
                C0186K3.a.m518s(c0439y5);
                ((C0722n5) this.f948b).mo31a();
                break;
            default:
                String string = C0034Be.m107V(((EditText) this.f948b).getText().toString()).toString();
                if (!C0034Be.m101P(string)) {
                    C0186K3.f638a.getClass();
                    LinkedHashSet linkedHashSetM502c2 = C0186K3.a.m502c();
                    if (linkedHashSetM502c2.add(string)) {
                        C0186K3.a.m517r(linkedHashSetM502c2);
                    }
                    C0706m8.a.m1624b();
                    C0706m8.a.m1623a();
                    C0706m8 c0706m83 = C0706m8.f2654l;
                    if (c0706m83 != null) {
                        c0706m83.m1621s();
                    }
                    C0706m8 c0706m84 = C0706m8.f2654l;
                    if (c0706m84 != null) {
                        c0706m84.m1620r();
                    }
                }
                break;
        }
    }
}
