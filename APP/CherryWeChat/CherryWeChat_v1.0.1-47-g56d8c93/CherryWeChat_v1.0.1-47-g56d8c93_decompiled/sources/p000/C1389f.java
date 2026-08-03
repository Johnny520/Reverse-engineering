package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.widget.ImageView;
import io.github.cherrywechat.lua.api.CherryMessageAPI;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import io.github.cherrywechat.lua.api.MessageAPI;
import io.github.cherrywechat.network.model.Link;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import party.iroiro.luajava.Lua;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1389f implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4942c;

    public /* synthetic */ C1389f(int i, Object obj, Object obj2) {
        this.f4940a = i;
        this.f4941b = obj;
        this.f4942c = obj2;
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        String[] strArrNames;
        int i = this.f4940a;
        C0829TC c0829tc = C0829TC.f2620a;
        int i2 = 0;
        Object obj = this.f4942c;
        Object obj2 = this.f4941b;
        switch (i) {
            case 0:
                ((C2213m) obj2).m4453j(((Link) obj).getUrl());
                return c0829tc;
            case 1:
                return CherryMessageAPI.cleanupFor$lambda$36$lambda$35((Lua) obj2, (CherryMessageAPI.MessageCallback) obj);
            case 2:
                return CherryMessageAPI.dispatchMessage$lambda$24((CherryMessageAPI.MessageCallback) obj2, (CherryMessageAPI.MessageData) obj);
            case 3:
                return CherryViewAPI.register$lambda$130$lambda$129((Map) obj2, (Lua) obj);
            case 4:
                return CherryViewAPI.loadImageFromUrl$lambda$132$lambda$131((ImageView) obj2, (Bitmap) obj);
            case 5:
                InterfaceC0126Cx interfaceC0126Cx = (InterfaceC0126Cx) obj2;
                AbstractC2242mm abstractC2242mm = (AbstractC2242mm) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C2379pm c2379pm = abstractC2242mm.f7922a;
                AbstractC0828TB.m1652v(interfaceC0126Cx, abstractC2242mm);
                int iMo205d = interfaceC0126Cx.mo205d();
                for (int i3 = 0; i3 < iMo205d; i3++) {
                    List listMo209i = interfaceC0126Cx.mo209i(i3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listMo209i) {
                        if (obj3 instanceof InterfaceC0158Dm) {
                            arrayList.add(obj3);
                        }
                    }
                    InterfaceC0158Dm interfaceC0158Dm = (InterfaceC0158Dm) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (interfaceC0158Dm != null && (strArrNames = interfaceC0158Dm.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = AbstractC0585Nj.m1134a(interfaceC0126Cx.mo204c(), C0255Fx.f828h) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new C2766ym("The suggested name '" + str + "' for " + str2 + ' ' + interfaceC0126Cx.mo206e(i3) + " is already one of the names for " + str2 + ' ' + interfaceC0126Cx.mo206e(((Number) AbstractC2598uq.m5108J(linkedHashMap, str)).intValue()) + " in " + interfaceC0126Cx);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i3));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C0495Lf.f1620a : linkedHashMap;
            case 6:
                C0762Rp c0762Rp = (C0762Rp) obj2;
                Activity activity = (Activity) obj;
                List<C0634Op> list = c0762Rp.f2425q;
                ArrayList arrayList2 = new ArrayList(AbstractC2539ta.m5019d0(list, 10));
                for (C0634Op c0634Op : list) {
                    StringBuilder sb = new StringBuilder();
                    AbstractC2374ph.m4817n(sb, c0634Op.f2029a, -431781652199477L);
                    sb.append(c0634Op.f2030b);
                    arrayList2.add(sb.toString());
                }
                new AlertDialog.Builder(activity).setTitle(AbstractC0295Gu.m625r(-431798832068661L)).setItems((String[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC0505Lp(c0762Rp, i2)).setNegativeButton(AbstractC0295Gu.m625r(-431828896839733L), (DialogInterface.OnClickListener) null).show();
                return c0829tc;
            case 7:
                ArrayList arrayList3 = (ArrayList) obj2;
                C2112jq c2112jq = (C2112jq) obj;
                if (!arrayList3.isEmpty()) {
                    int i4 = C2112jq.f7429e;
                    if (!arrayList3.isEmpty()) {
                        c2112jq.m4309l(arrayList3, 0);
                    }
                }
                return c0829tc;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                return MessageAPI.cleanupFor$lambda$36$lambda$35((Lua) obj2, (MessageAPI.MessageCallback) obj);
            default:
                CharSequence charSequence = (CharSequence) obj;
                return AbstractC1406fG.m2680E(((C0554Mv) obj2).f1822a.matcher(charSequence), 0, charSequence);
        }
    }
}
