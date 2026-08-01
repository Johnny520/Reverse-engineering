package p088s0;

import android.content.Context;
import android.content.DialogInterface;
import com.p055lu.wxmask.bean.MaskItemBean;
import org.json.JSONException;
import p004C.C0060d;
import p052b1.AbstractC0503h;
import p070i0.AbstractC0731a;
import p086r0.C0925n1;
import p092u0.AbstractC1015a;
import p098x0.C1036b;
import p102z0.C1119b;

/* JADX INFO: renamed from: s0.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0986h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3527b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3528c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3529d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3530e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DialogInterfaceOnClickListenerC0986h(Object obj, Object obj2, Object obj3, int i2) {
        this.f3527b = i2;
        this.f3528c = obj;
        this.f3529d = obj2;
        this.f3530e = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) throws JSONException {
        switch (this.f3527b) {
            case 0:
                C0990l c0990l = (C0990l) this.f3528c;
                c0990l.f3562o.mo2182a();
                c0990l.m2197d();
                ((C0060d) this.f3529d).mo8c((MaskItemBean) this.f3530e);
                break;
            default:
                Context context = (Context) this.f3529d;
                String str = ((C1119b) this.f3530e).f3775i;
                ((C1036b) this.f3528c).getClass();
                try {
                    AbstractC1015a.m2216b(context, str, new C0925n1(15));
                } catch (Exception e2) {
                    AbstractC0503h.m978P("下载链接打开失败");
                    AbstractC0731a.m1387d(e2);
                }
                break;
        }
    }
}
