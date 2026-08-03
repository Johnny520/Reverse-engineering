package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.Toast;
import io.github.cherrywechat.network.model.UpdateInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: Kb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0448Kb implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1468b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1469c;

    public /* synthetic */ DialogInterfaceOnClickListenerC0448Kb(int i, Object obj, Object obj2) {
        this.f1467a = i;
        this.f1468b = obj;
        this.f1469c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        int i2 = this.f1467a;
        Object obj = this.f1468b;
        Object obj2 = this.f1469c;
        switch (i2) {
            case 0:
                Context context = (Context) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) obj).entrySet()) {
                    EnumC0319Hb enumC0319Hb = (EnumC0319Hb) entry.getKey();
                    String string = AbstractC2564tz.m5070e0(((EditText) entry.getValue()).getText().toString()).toString();
                    if (string.length() > 0 && !string.equals(enumC0319Hb.f1054a)) {
                        linkedHashMap.put(enumC0319Hb, string);
                    }
                }
                C0276Gb.f894g.getClass();
                C2220m6.m4468l(linkedHashMap);
                Toast.makeText(context, AbstractC0295Gu.m625r(-24180665874485L), 0).show();
                break;
            case 1:
                InterfaceC0579Nd interfaceC0579Nd = (InterfaceC0579Nd) obj;
                EditText editText = (EditText) obj2;
                if (interfaceC0579Nd != null) {
                    interfaceC0579Nd.mo244r(editText);
                }
                break;
            case 2:
                String str = ((C0140DA) obj2).f364a;
                int i3 = C0625Og.f1988k;
                ((C0625Og) obj).m1215a(str);
                break;
            default:
                C1456gf.m2803U((Context) obj2, ((UpdateInfo) obj).getDownloadUrl());
                break;
        }
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0448Kb(C0625Og c0625Og, C0140DA c0140da, C0185EC c0185ec) {
        this.f1467a = 2;
        this.f1468b = c0625Og;
        this.f1469c = c0140da;
    }

    public /* synthetic */ DialogInterfaceOnClickListenerC0448Kb(Context context, UpdateInfo updateInfo) {
        this.f1467a = 3;
        this.f1469c = context;
        this.f1468b = updateInfo;
    }
}
