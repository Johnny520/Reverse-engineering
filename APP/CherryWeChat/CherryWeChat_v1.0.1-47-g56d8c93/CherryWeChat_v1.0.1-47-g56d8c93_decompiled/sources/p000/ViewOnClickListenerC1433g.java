package p000;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1433g implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5038c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5039d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5040e;

    public /* synthetic */ ViewOnClickListenerC1433g(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f5036a = i;
        this.f5037b = obj;
        this.f5038c = obj2;
        this.f5039d = obj3;
        this.f5040e = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5036a;
        int i2 = 1;
        Object obj = this.f5040e;
        Object obj2 = this.f5039d;
        Object obj3 = this.f5038c;
        Object obj4 = this.f5037b;
        switch (i) {
            case 0:
                C0253Fv c0253Fv = (C0253Fv) obj4;
                c0253Fv.f825a = !c0253Fv.f825a;
                C2213m.m4450l((LinearLayout) obj3, c0253Fv, (List) obj2, (C2213m) obj);
                break;
            case 1:
                EditText editText = (EditText) obj4;
                String str = (String) obj3;
                editText.setText(str);
                editText.setSelection(str.length());
                Toast.makeText((Context) obj2, AbstractC0295Gu.m625r(-843909534054453L) + ((String) obj) + AbstractC0295Gu.m625r(-843931008890933L), 0).show();
                break;
            case 2:
                C0625Og c0625Og = (C0625Og) obj4;
                C0185EC c0185ec = (C0185EC) obj3;
                C0140DA c0140da = (C0140DA) obj2;
                File file = (File) obj;
                C0183EA.f539a.getClass();
                if (!C0183EA.m373a().equals(c0140da.f364a)) {
                    Context context = c0625Og.getContext();
                    AbstractC0295Gu.m625r(-96847217555509L);
                    C1456gf.m2801S(context, AbstractC0295Gu.m625r(-96915937032245L), AbstractC0295Gu.m625r(-96946001803317L) + c0185ec.f551c + ' ' + c0140da.f365b + AbstractC0295Gu.m625r(-96993246443573L), new DialogInterfaceOnClickListenerC0534Mb(file, c0625Og, c0140da, i2), false);
                } else {
                    AbstractC0213Ey.m413k(-96795677947957L, c0625Og.getContext(), 0);
                }
                break;
            case 3:
                C0625Og c0625Og2 = (C0625Og) obj4;
                C0185EC c0185ec2 = (C0185EC) obj3;
                C0140DA c0140da2 = (C0140DA) obj2;
                C2414qe c2414qe = (C2414qe) obj;
                C0183EA.f539a.getClass();
                if (!C0183EA.m380h()) {
                    AbstractC0213Ey.m413k(-97598836832309L, c0625Og2.getContext(), 0);
                } else {
                    AbstractC1208bA.m2328a(new RunnableC2320oe(c2414qe, 0));
                    C1498hd c1498hd = AbstractC1499he.f5282a;
                    AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C0950W4(null, c2414qe, c0625Og2, c0140da2, c0185ec2), 3);
                }
                break;
            default:
                new Thread(new RunnableC0586Nk((TextView) obj4, (C0339Hv) obj3, (AlertDialog) obj2, (Context) obj, 2)).start();
                break;
        }
    }
}
