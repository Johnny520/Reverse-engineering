package p001A0;

import android.app.Dialog;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import p031Q0.AbstractC0307g;
import p050c0.C0639a0;
import p052d0.C0752m;

/* JADX INFO: renamed from: A0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0025a implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65b;

    public /* synthetic */ ViewOnClickListenerC0025a(int r1, Object r2) {
        this.f64a = r1;
        this.f65b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        switch(this.f64a) {
            case 0: goto L36;
            case 1: goto L34;
            case 2: goto L21;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        Dialog r02 = (Dialog) this.f65b;
        AbstractC0307g.m703e(r02, "$dialog");
        r02.dismiss();
        return;
    L6:
        C0752m r03 = (C0752m) this.f65b;
        AbstractC0307g.m703e(r03, "$item");
        r03.f2625d.invoke();
        return;
    L8:
        View r04 = (View) this.f65b;
        AbstractC0307g.m703e(r04, "$host");
        ViewParent r42 = r04.getParent();
        ViewGroup r2 = null;
        if ((r42 instanceof ViewGroup) == false) goto L11;
        ViewGroup r43 = (ViewGroup) r42;
    L12:
        if (r43 != null) goto L19;
        View r44 = r04.getRootView();
        if ((r44 instanceof ViewGroup) == false) goto L16;
        r2 = (ViewGroup) r44;
    L16:
        if (r2 == null) goto L44;
        r43 = r2;
        goto L19
    L44:
        return;
    L19:
        C0639a0.m1595m0(r43);
        return;
    L11:
        r43 = null;
        goto L12
    L21:
        C0050z r45 = (C0050z) this.f65b;
        EditText r05 = r45.f178f;
        if (r05 == null) goto L45;
        int r06 = r05.getSelectionEnd();
        EditText r1 = r45.f178f;
        if (r1 != null) goto L27;
    L29:
        r45.f178f.setTransformationMethod(PasswordTransformationMethod.getInstance());
    L30:
        if (r06 < 0) goto L32;
        r45.f178f.setSelection(r06);
    L32:
        r45.m156q();
        return;
    L27:
        if ((r1.getTransformationMethod() instanceof PasswordTransformationMethod) == false) goto L29;
        r45.f178f.setTransformationMethod(null);
        goto L30
    L45:
        return;
    L34:
        ((C0039o) this.f65b).m78u();
        return;
    L36:
        C0030f r46 = (C0030f) this.f65b;
        EditText r07 = r46.f78i;
        if (r07 == null) goto L46;
        Editable r08 = r07.getText();
        if (r08 == null) goto L42;
        r08.clear();
    L42:
        r46.m156q();
        return;
    }
}
