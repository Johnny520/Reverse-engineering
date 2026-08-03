package com.abc.core.runtime;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.C0313m;

/* JADX INFO: renamed from: f0.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0834m implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3018c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3019d;

    public /* synthetic */ ViewOnClickListenerC0834m(Object r1, Object r2, Object r3, int r4) {
        this.f3016a = r4;
        this.f3018c = r1;
        this.f3019d = r2;
        this.f3017b = r3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r9) {
        switch(this.f3016a) {
            case 0: goto L22;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        C0313m r02 = (C0313m) this.f3018c;
        AbstractC0307g.m703e(r02, "$currentTab");
        EnumC0806Q r1 = (EnumC0806Q) this.f3019d;
        AbstractC0307g.m703e(r1, "$tab");
        C0313m r2 = (C0313m) this.f3017b;
        AbstractC0307g.m703e(r2, "$render");
        if (r02.f595a == r1) goto L11;
        r02.f595a = r1;
        Object r92 = r2.f595a;
        if (r92 == null) goto L9;
        ((InterfaceC0275a) r92).invoke();
        return;
    L9:
        AbstractC0307g.m705g("render");
        throw null;
    L11:
        return;
    L12:
        EditText r03 = (EditText) this.f3018c;
        AbstractC0307g.m703e(r03, "$target");
        String r5 = (String) this.f3019d;
        AbstractC0307g.m703e(r5, "$tag");
        int r93 = Math.max(0, r03.getSelectionStart());
        int r12 = Math.max(0, r03.getSelectionEnd());
        int r3 = Math.min(r93, r12);
        int r4 = Math.max(r93, r12);
        if (r03.getText() == null) goto L17;
        Editable r22 = r03.getText();
        if (r22 == null) goto L18;
        r22.replace(r3, r4, r5, 0, r5.length());
    L18:
        r03.requestFocus();
        InterfaceC0275a r94 = (InterfaceC0275a) this.f3017b;
        if (r94 == null) goto L25;
        r94.invoke();
        return;
    L25:
        return;
    L17:
        r03.append(r5);
        goto L18
    L22:
        C0797H r04 = (C0797H) this.f3018c;
        AbstractC0307g.m703e(r04, "$item");
        Activity r13 = (Activity) this.f3019d;
        AbstractC0307g.m703e(r13, "$host");
        InterfaceC0275a r23 = (InterfaceC0275a) this.f3017b;
        AbstractC0307g.m703e(r23, "$onToggle");
        r04.f2897f.mo518b(r13, r23);
    }
}
