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

    public /* synthetic */ DialogInterfaceOnClickListenerC0567N7(ArrayList r1, Context r2, int r3) {
        this.f1847a = r3;
        this.f1848b = r1;
        this.f1849c = r2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r11, int r12) {
        int r112 = this.f1847a;
        Context r0 = this.f1849c;
        ArrayList r1 = this.f1848b;
        switch(r112) {
            case 0: goto L11;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        C0276Gb.f894g.getClass();
        C2220m6.m4469m(r1);
        Toast.makeText(r0, AbstractC0295Gu.m625r(-24086176593973L), 0).show();
        return;
    L6:
        AbstractC0599Nx.m1175d(AbstractC2453ra.m4901k0(AbstractC2496sa.m4975Z(r1), AbstractC0295Gu.m625r(-250259154401333L), null, null, null, 62));
        ViewOnClickListenerC0996X7 r113 = AbstractC0828TB.f2613e;
        if (r113 == null) goto L9;
        r113.m1890c();
    L9:
        AbstractC0213Ey.m413k(-250267744335925L, r0, 0);
        return;
    L11:
        ArrayList r114 = new ArrayList();
        Iterator r13 = r1.iterator();
    L13:
        if (r13.hasNext() == false) goto L17;
        Object r2 = r13.next();
        if (((C0610O7) r2).f1956c == false) goto L13;
        r114.add(r2);
        goto L13
    L17:
        ArrayList r4 = new ArrayList(AbstractC2539ta.m5019d0(r114, 10));
        Iterator r115 = r114.iterator();
    L19:
        if (r115.hasNext() == false) goto L21;
        r4.add(String.valueOf(((C0610O7) r115.next()).f1954a));
        goto L19
    L21:
        SharedPreferences r116 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1175d(AbstractC2453ra.m4901k0(r4, AbstractC0295Gu.m625r(-250216204728373L), null, null, null, 62));
        ViewOnClickListenerC0996X7 r117 = AbstractC0828TB.f2613e;
        if (r117 == null) goto L24;
        r117.m1890c();
    L24:
        AbstractC0213Ey.m413k(-250224794662965L, r0, 0);
    }
}
