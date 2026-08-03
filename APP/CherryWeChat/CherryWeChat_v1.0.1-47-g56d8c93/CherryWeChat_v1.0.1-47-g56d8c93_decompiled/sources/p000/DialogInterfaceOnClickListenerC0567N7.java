package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: N7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0567N7 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f1848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f1849c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0567N7(ArrayList arrayList, Context context, int i) {
        this.f1847a = i;
        this.f1848b = arrayList;
        this.f1849c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f1847a;
        Context context = this.f1849c;
        ArrayList arrayList = this.f1848b;
        switch (i2) {
            case 0:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((C0610O7) obj).f1956c) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC2539ta.m5019d0(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(String.valueOf(((C0610O7) it.next()).f1954a));
                }
                SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1175d(AbstractC2453ra.m4901k0(arrayList3, AbstractC0295Gu.m625r(-250216204728373L), null, null, null, 62));
                ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7 = AbstractC0828TB.f2613e;
                if (viewOnClickListenerC0996X7 != null) {
                    viewOnClickListenerC0996X7.m1890c();
                }
                AbstractC0213Ey.m413k(-250224794662965L, context, 0);
                break;
            case 1:
                AbstractC0599Nx.m1175d(AbstractC2453ra.m4901k0(AbstractC2496sa.m4975Z(arrayList), AbstractC0295Gu.m625r(-250259154401333L), null, null, null, 62));
                ViewOnClickListenerC0996X7 viewOnClickListenerC0996X72 = AbstractC0828TB.f2613e;
                if (viewOnClickListenerC0996X72 != null) {
                    viewOnClickListenerC0996X72.m1890c();
                }
                AbstractC0213Ey.m413k(-250267744335925L, context, 0);
                break;
            default:
                C0276Gb.f894g.getClass();
                C2220m6.m4469m(arrayList);
                Toast.makeText(context, AbstractC0295Gu.m625r(-24086176593973L), 0).show();
                break;
        }
    }
}
