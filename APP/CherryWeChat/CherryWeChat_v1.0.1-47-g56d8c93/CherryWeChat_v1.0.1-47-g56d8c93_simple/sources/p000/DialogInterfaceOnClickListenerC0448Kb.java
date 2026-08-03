package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import io.github.cherrywechat.network.model.UpdateInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Kb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0448Kb implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1468b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1469c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0448Kb(int r1, Object r2, Object r3) {
        this.f1467a = r1;
        this.f1468b = r2;
        this.f1469c = r3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface r5, int r6) {
        int r52 = this.f1467a;
        Object r62 = this.f1468b;
        Object r0 = this.f1469c;
        switch(r52) {
            case 0: goto L12;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        C1456gf.m2803U((Context) r0, ((UpdateInfo) r62).getDownloadUrl());
        return;
    L6:
        String r53 = ((C0140DA) r0).f364a;
        int r02 = C0625Og.f1988k;
        ((C0625Og) r62).m1215a(r53);
        return;
    L8:
        InterfaceC0579Nd r63 = (InterfaceC0579Nd) r62;
        EditText r03 = (EditText) r0;
        if (r63 == null) goto L29;
        r63.mo244r(r03);
        return;
    L29:
        return;
    L12:
        Context r04 = (Context) r0;
        LinkedHashMap r54 = new LinkedHashMap();
        Iterator r64 = ((LinkedHashMap) r62).entrySet().iterator();
    L14:
        if (r64.hasNext() == false) goto L20;
        Map.Entry r1 = (Map.Entry) r64.next();
        EnumC0319Hb r2 = (EnumC0319Hb) r1.getKey();
        String r12 = AbstractC2564tz.m5070e0(((EditText) r1.getValue()).getText().toString()).toString();
        if (r12.length() <= 0) goto L14;
        if (r12.equals(r2.f1054a) == true) goto L14;
        r54.put(r2, r12);
        goto L14
    L20:
        C0276Gb.f894g.getClass();
        C2220m6.m4468l(r54);
        Toast.makeText(r04, AbstractC0295Gu.m625r(-24180665874485L), 0).show();
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0448Kb(C0625Og r1, C0140DA r2, C0185EC r3) {
        this.f1467a = 2;
        this.f1468b = r1;
        this.f1469c = r2;
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0448Kb(Context r2, UpdateInfo r3) {
        this.f1467a = 3;
        this.f1469c = r2;
        this.f1468b = r3;
    }
}
