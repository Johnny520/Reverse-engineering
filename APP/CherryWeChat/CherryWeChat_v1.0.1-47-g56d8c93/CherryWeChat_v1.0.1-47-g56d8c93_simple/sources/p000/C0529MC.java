package p000;

import android.app.Activity;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: MC */
/* JADX INFO: loaded from: classes.dex */
public final class C0529MC extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1724e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0701QC f1725f;

    public /* synthetic */ C0529MC(C0701QC r1, InterfaceC0190Eb r2, int r3) {
        this.f1724e = r3;
        this.f1725f = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f1724e) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        C0529MC r23 = (C0529MC) mo447h(r32, r22);
        C0829TC r33 = C0829TC.f2620a;
        r23.mo448i(r33);
        return r33;
    L6:
        C0529MC r24 = (C0529MC) mo447h(r32, r22);
        C0829TC r34 = C0829TC.f2620a;
        r24.mo448i(r34);
        return r34;
    L8:
        C0529MC r25 = (C0529MC) mo447h(r32, r22);
        C0829TC r35 = C0829TC.f2620a;
        r25.mo448i(r35);
        return r35;
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        switch(this.f1724e) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return new C0529MC(this.f1725f, r3, 2);
    L7:
        return new C0529MC(this.f1725f, r3, 1);
    L9:
        return new C0529MC(this.f1725f, r3, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r6) {
        switch(this.f1724e) {
            case 0: goto L19;
            case 1: goto L14;
            default: goto L4;
        };
    L4:
        C0701QC r0 = this.f1725f;
        AbstractC0628Oj.m1232T(r6);
        C1036Y4 r62 = C1036Y4.f3308a;     // Catch: Exception -> L7
        Activity r1 = r0.m1432f();     // Catch: Exception -> L7
        C0572NC r2 = new C0572NC(r0, 0);     // Catch: Exception -> L7
        C0572NC r3 = new C0572NC(r0, 1);     // Catch: Exception -> L7
        r62.getClass();     // Catch: Exception -> L7
        C1036Y4.m1982a(r1, r2, r3, true);     // Catch: Exception -> L7
    L13:
        return C0829TC.f2620a;
    L7:
        e = move-exception;
        C0987Wz r12 = r0.f2255b;
        if (r12 == null) goto L11;
        r12.setRefreshing(false);
    L11:
        Toast.makeText(r0.m1432f(), AbstractC0213Ey.m405c(-485322714511413L, new StringBuilder(), e), 0).show();
        goto L13
    L14:
        AbstractC0628Oj.m1232T(r6);
        C0701QC r63 = this.f1725f;
        C1258ca r02 = r63.f2260g;
        if (r02 == null) goto L17;
        r02.notifyDataSetChanged();
    L17:
        C0701QC.m1430a(r63);
        return C0829TC.f2620a;
    L19:
        AbstractC0628Oj.m1232T(r6);
        C0701QC r64 = this.f1725f;
        EditText r03 = r64.f2258e;
        if (r03 == null) goto L25;
        Editable r04 = r03.getText();
        if (r04 == null) goto L25;
        String r05 = r04.toString();
        if (r05 == null) goto L25;
    L26:
        r64.m1431e(r05);
        C0701QC.m1430a(r64);
        return C0829TC.f2620a;
    L25:
        r05 = AbstractC0295Gu.m625r(-486095808624693L);
        goto L26
    }
}
