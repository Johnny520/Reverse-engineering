package com.abc.internal.probe;

import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0137c;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0556f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f1653b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0286l f1654c;

    public /* synthetic */ C0556f(String str, String str2, InterfaceC0286l interfaceC0286l) {
        this.f1652a = str;
        this.f1653b = str2;
        this.f1654c = interfaceC0286l;
    }

    /* JADX INFO: renamed from: a */
    public final DiagnosticItem m1369a(C0562l c0562l) {
        Object objM116u;
        String str = this.f1652a;
        AbstractC0307g.m703e(str, "$id");
        String str2 = this.f1653b;
        AbstractC0307g.m703e(str2, "$title");
        InterfaceC0286l interfaceC0286l = this.f1654c;
        AbstractC0307g.m703e(interfaceC0286l, "$block");
        try {
            objM116u = (AbstractC0560j) interfaceC0286l.invoke(c0562l);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        DiagnosticLevel diagnosticLevel = DiagnosticLevel.f1666c;
        if (thM465a != null) {
            String message = thM465a.getMessage();
            if (message == null) {
                message = "error";
            }
            return new DiagnosticItem(str, str2, diagnosticLevel, message);
        }
        AbstractC0560j abstractC0560j = (AbstractC0560j) objM116u;
        if (abstractC0560j instanceof C0558h) {
            diagnosticLevel = DiagnosticLevel.f1664a;
        } else if (abstractC0560j instanceof C0559i) {
            diagnosticLevel = DiagnosticLevel.f1665b;
        } else if (!(abstractC0560j instanceof C0557g)) {
            throw new C0137c();
        }
        return new DiagnosticItem(str, str2, diagnosticLevel, abstractC0560j.mo1370a());
    }
}
