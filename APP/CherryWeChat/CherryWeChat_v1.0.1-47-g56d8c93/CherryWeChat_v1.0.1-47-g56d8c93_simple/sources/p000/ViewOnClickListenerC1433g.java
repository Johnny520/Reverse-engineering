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

    public /* synthetic */ ViewOnClickListenerC1433g(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.f5036a = r5;
        this.f5037b = r1;
        this.f5038c = r2;
        this.f5039d = r3;
        this.f5040e = r4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r14) {
        int r142 = this.f5036a;
        int r0 = 1;
        Object r2 = this.f5040e;
        Object r3 = this.f5039d;
        Object r4 = this.f5038c;
        Object r5 = this.f5037b;
        switch(r142) {
            case 0: goto L18;
            case 1: goto L16;
            case 2: goto L11;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        new Thread(new RunnableC0586Nk((TextView) r5, (C0339Hv) r4, (AlertDialog) r3, (Context) r2, 2)).start();
        return;
    L6:
        C0625Og r52 = (C0625Og) r5;
        C0185EC r42 = (C0185EC) r4;
        C0140DA r32 = (C0140DA) r3;
        C2414qe r22 = (C2414qe) r2;
        C0183EA.f539a.getClass();
        if (C0183EA.m380h() == true) goto L9;
        AbstractC0213Ey.m413k(-97598836832309L, r52.getContext(), 0);
        return;
    L9:
        AbstractC1208bA.m2328a(new RunnableC2320oe(r22, 0));
        C1498hd r143 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C0950W4(null, r22, r52, r32, r42), 3);
        return;
    L11:
        C0625Og r53 = (C0625Og) r5;
        C0185EC r43 = (C0185EC) r4;
        C0140DA r33 = (C0140DA) r3;
        File r23 = (File) r2;
        C0183EA.f539a.getClass();
        if (C0183EA.m373a().equals(r33.f364a) == false) goto L14;
        AbstractC0213Ey.m413k(-96795677947957L, r53.getContext(), 0);
        return;
    L14:
        Context r144 = r53.getContext();
        AbstractC0295Gu.m625r(-96847217555509L);
        C1456gf.m2801S(r144, AbstractC0295Gu.m625r(-96915937032245L), AbstractC0295Gu.m625r(-96946001803317L) + r43.f551c + ' ' + r33.f365b + AbstractC0295Gu.m625r(-96993246443573L), new DialogInterfaceOnClickListenerC0534Mb(r23, r53, r33, r0), false);
        return;
    L16:
        EditText r54 = (EditText) r5;
        String r44 = (String) r4;
        r54.setText(r44);
        r54.setSelection(r44.length());
        Toast.makeText((Context) r3, AbstractC0295Gu.m625r(-843909534054453L) + ((String) r2) + AbstractC0295Gu.m625r(-843931008890933L), 0).show();
        return;
    L18:
        C0253Fv r55 = (C0253Fv) r5;
        r55.f825a = !r55.f825a;
        C2213m.m4450l((LinearLayout) r4, r55, (List) r3, (C2213m) r2);
    }
}
