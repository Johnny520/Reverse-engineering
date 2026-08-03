package p000a;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import p000a.C0186K3;
import p000a.C0425X9;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.Y9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0443Y9 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1653b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1654c;

    public /* synthetic */ ViewOnClickListenerC0443Y9(Object obj, int i, Object obj2) {
        this.f1652a = i;
        this.f1653b = obj;
        this.f1654c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.f1652a) {
            case 0:
                ((C0425X9.a.b) this.f1653b).f1598d.mo53f(Boolean.valueOf(!((C0425X9.b.C1334b) this.f1654c).f1604w.isChecked()));
                break;
            case 1:
                C0186K3.a aVar = C0186K3.f638a;
                String maskId = ((MaskItemBean) this.f1653b).getMaskId();
                aVar.getClass();
                C0631i9.m1482e(maskId, "chatUser");
                ArrayList arrayListM505f = C0186K3.a.m505f();
                Iterator it = arrayListM505f.iterator();
                C0631i9.m1481d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    C0631i9.m1481d(next, "next(...)");
                    if (maskId.equals(((MaskItemBean) next).getMaskId())) {
                        it.remove();
                    }
                }
                C0186K3.a.m518s(arrayListM505f);
                C0186K3.a.m512m();
                ((C0722n5) this.f1654c).mo31a();
                break;
            default:
                C0803ra c0803ra = (C0803ra) this.f1653b;
                AlertDialog.Builder title = new AlertDialog.Builder(c0803ra.f3168a).setTitle("确认清空");
                C0186K3.f638a.getClass();
                AlertDialog alertDialogCreate = title.setMessage("将删除全部 " + C0186K3.a.m505f().size() + " 个伪装，不可撤销。").setPositiveButton("确认清空", new DialogInterfaceOnClickListenerC0264O9(1, (C0722n5) this.f1654c)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
                if (alertDialogCreate != null) {
                    alertDialogCreate.show();
                    c0803ra.m1876o(alertDialogCreate);
                }
                break;
        }
    }
}
