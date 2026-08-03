package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.widget.ImageView;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import io.github.cherrywechat.lua.api.MessageAPI;
import io.github.cherrywechat.network.model.Link;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import party.iroiro.luajava.Lua;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1389f implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4942c;

    public /* synthetic */ C1389f(int r1, Object r2, Object r3) {
        this.f4940a = r1;
        this.f4941b = r2;
        this.f4942c = r3;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int r0 = this.f4940a;
        C0829TC r2 = C0829TC.f2620a;
        int r3 = 0;
        Object r4 = this.f4942c;
        Object r5 = this.f4941b;
        switch(r0) {
            case 0: goto L61;
            case 1: goto L60;
            case 2: goto L58;
            case 3: goto L56;
            case 4: goto L54;
            case 5: goto L21;
            case 6: goto L15;
            case 7: goto L8;
            case 8: goto L7;
            default: goto L4;
        };
    L4:
        CharSequence r42 = (CharSequence) r4;
        return AbstractC1406fG.m2680E(((C0554Mv) r5).f1822a.matcher(r42), 0, r42);
    L8:
        ArrayList r52 = (ArrayList) r5;
        C2112jq r43 = (C2112jq) r4;
        if (r52.isEmpty() == true) goto L14;
        int r02 = C2112jq.f7429e;
        if (r52.isEmpty() == true) goto L14;
        r43.m4309l(r52, 0);
    L14:
        return r2;
    L15:
        C0762Rp r53 = (C0762Rp) r5;
        Activity r44 = (Activity) r4;
        List r03 = r53.f2425q;
        ArrayList r6 = new ArrayList(AbstractC2539ta.m5019d0(r03, 10));
        Iterator r04 = r03.iterator();
    L17:
        if (r04.hasNext() == false) goto L19;
        C0634Op r7 = (C0634Op) r04.next();
        StringBuilder r8 = new StringBuilder();
        AbstractC2374ph.m4817n(r8, r7.f2029a, -431781652199477L);
        r8.append(r7.f2030b);
        r6.add(r8.toString());
        goto L17
    L19:
        new AlertDialog.Builder(r44).setTitle(AbstractC0295Gu.m625r(-431798832068661L)).setItems((String[]) r6.toArray(new String[0]), new DialogInterfaceOnClickListenerC0505Lp(r53, r3)).setNegativeButton(AbstractC0295Gu.m625r(-431828896839733L), null).show();
        return r2;
    L21:
        InterfaceC0126Cx r54 = (InterfaceC0126Cx) r5;
        AbstractC2242mm r45 = (AbstractC2242mm) r4;
        LinkedHashMap r05 = new LinkedHashMap();
        C2379pm r22 = r45.f7922a;
        AbstractC0828TB.m1652v(r54, r45);
        int r23 = r54.mo205d();
        int r46 = 0;
    L22:
        if (r46 >= r23) goto L50;
        List r62 = r54.mo209i(r46);
        ArrayList r72 = new ArrayList();
        Iterator r63 = r62.iterator();
    L25:
        if (r63.hasNext() == false) goto L30;
        Object r82 = r63.next();
        if ((r82 instanceof InterfaceC0158Dm) == false) goto L25;
        r72.add(r82);
        goto L25
    L30:
        if (r72.size() != 1) goto L32;
        Object r64 = r72.get(0);
    L33:
        InterfaceC0158Dm r65 = (InterfaceC0158Dm) r64;
        if (r65 == null) goto L48;
        String[] r66 = r65.names();
        if (r66 == null) goto L48;
        int r73 = r66.length;
        int r83 = 0;
    L38:
        if (r83 >= r73) goto L48;
        String r9 = r66[r83];
        if (AbstractC0585Nj.m1134a(r54.mo204c(), C0255Fx.f828h) == false) goto L42;
        String r10 = "enum value";
    L44:
        if (r05.containsKey(r9) == true) goto L47;
        r05.put(r9, Integer.valueOf(r46));
        r83 = r83 + 1;
        goto L38
    L47:
        throw new C2766ym("The suggested name '" + r9 + "' for " + r10 + ' ' + r54.mo206e(r46) + " is already one of the names for " + r10 + ' ' + r54.mo206e(((Number) AbstractC2598uq.m5108J(r05, r9)).intValue()) + " in " + r54);
    L42:
        r10 = "property";
    L48:
        r46 = r46 + 1;
        goto L22
    L32:
        r64 = null;
        goto L33
    L50:
        if (r05.isEmpty() == true) goto L52;
        return r05;
    L52:
        return C0495Lf.f1620a;
    L61:
        ((C2213m) r5).m4453j(((Link) r4).getUrl());
        return r2;
    L7:
        return MessageAPI.m3441G((Lua) r5, (MessageAPI.MessageCallback) r4);
    L54:
        return CherryViewAPI.m3312m0((ImageView) r5, (Bitmap) r4);
    L56:
        return CherryViewAPI.m3287b((Map) r5, (Lua) r4);
    L58:
        return CherryMessageAPI.m3140v((CherryMessageAPI.MessageCallback) r5, (CherryMessageAPI.MessageData) r4);
    L60:
        return CherryMessageAPI.m3122d((Lua) r5, (CherryMessageAPI.MessageCallback) r4);
    }
}
