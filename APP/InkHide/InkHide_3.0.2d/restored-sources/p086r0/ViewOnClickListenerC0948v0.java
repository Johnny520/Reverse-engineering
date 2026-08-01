package p086r0;

import android.app.AlertDialog;
import android.text.Editable;
import android.view.View;
import android.widget.PopupWindow;
import com.p055lu.wxmask.bean.MaskItemBean;
import java.util.ArrayList;
import java.util.Iterator;
import p009E0.C0103c;
import p011F0.AbstractC0123k;
import p027N0.AbstractC0223g;
import p037T.AbstractC0264o;
import p037T.C0261l;
import p037T.C0267r;
import p042W.C0338j;
import p052b1.AbstractC0503h;
import p067g0.AbstractC0575a;
import p088s0.C0979a;
import p088s0.C0985g;
import p088s0.C0987i;
import p088s0.C0988j;
import p088s0.C0990l;
import p088s0.C0995q;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0948v0 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3401b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3402c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3403d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3404e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0948v0(Object obj, Object obj2, Object obj3, int i2) {
        this.f3401b = i2;
        this.f3402c = obj;
        this.f3403d = obj2;
        this.f3404e = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String string2;
        String string3;
        Object obj = this.f3402c;
        Object obj2 = this.f3404e;
        Object obj3 = this.f3403d;
        switch (this.f3401b) {
            case 0:
                ((C0842H0) obj).m1688m((String) obj3);
                ((PopupWindow) obj2).dismiss();
                return;
            case 1:
                C0995q c0995q = (C0995q) obj;
                Editable text = c0995q.f3576b.getText();
                String str = (text == null || (string3 = text.toString()) == null) ? "" : string3;
                Editable text2 = c0995q.f3578d.getText();
                if (text2 == null || (string = text2.toString()) == null) {
                    string = "";
                }
                if (str.length() == 0 || string.length() == 0) {
                    AbstractC0503h.m978P("不能为空！");
                    return;
                }
                Iterator it = ((C0979a) obj3).f3508a.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!AbstractC0223g.m414a(((MaskItemBean) it.next()).getMaskId(), str)) {
                        i2++;
                    }
                }
                if (i2 > -1) {
                    AbstractC0503h.m978P("配置已存在！");
                    return;
                }
                Editable text3 = c0995q.f3577c.getText();
                String str2 = (text3 == null || (string2 = text3.toString()) == null) ? "" : string2;
                Object obj4 = c0995q.f3580f.get(c0995q.f3581g.getSelectedItemPosition());
                AbstractC0223g.m417d(obj4, "get(...)");
                int iIntValue = ((Number) ((C0103c) obj4).f394a).intValue();
                MaskItemBean.TipData tipData = new MaskItemBean.TipData(string);
                C0261l c0261l = AbstractC0575a.f1940a;
                c0261l.getClass();
                C0338j c0338j = new C0338j();
                c0261l.m485h(tipData, MaskItemBean.TipData.class, c0338j);
                ArrayList arrayList = c0338j.f753m;
                if (!arrayList.isEmpty()) {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList);
                }
                AbstractC0264o abstractC0264o = c0338j.f755o;
                abstractC0264o.getClass();
                if (!(abstractC0264o instanceof C0267r)) {
                    throw new IllegalStateException("Not a JSON Object: " + abstractC0264o);
                }
                MaskItemBean maskItemBean = new MaskItemBean(str, str2, iIntValue, (C0267r) abstractC0264o, null, null, 48, null);
                Editable text4 = c0995q.f3579e.getText();
                if (text4 != null) {
                    maskItemBean.setMapId(text4.toString());
                }
                boolean z2 = AbstractC1126i.f3786a;
                C1124g.m2426b(maskItemBean);
                ((AlertDialog) obj2).dismiss();
                return;
            default:
                C0987i c0987i = (C0987i) AbstractC0123k.m269k0(((C0985g) obj3).f2596b, ((C0988j) obj2).f2595b);
                if (c0987i == null) {
                    return;
                }
                C0990l.m2192b((C0990l) obj, c0987i);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ ViewOnClickListenerC0948v0(C0842H0 c0842h0, String str, String str2, PopupWindow popupWindow) {
        this.f3401b = 0;
        this.f3402c = c0842h0;
        this.f3403d = str;
        this.f3404e = popupWindow;
    }
}
