package p000;

import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: OC */
/* JADX INFO: loaded from: classes.dex */
public final class C0615OC extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1974e;

    /* JADX INFO: renamed from: f */
    public C0701QC f1975f;

    /* JADX INFO: renamed from: g */
    public int f1976g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0701QC f1977h;

    public /* synthetic */ C0615OC(C0701QC r1, InterfaceC0190Eb r2, int r3) {
        this.f1974e = r3;
        this.f1977h = r1;
        super(r2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r2, Object r3) {
        InterfaceC1409fc r22 = (InterfaceC1409fc) r2;
        InterfaceC0190Eb r32 = (InterfaceC0190Eb) r3;
        switch(this.f1974e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((C0615OC) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    L7:
        return ((C0615OC) mo447h(r32, r22)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        switch(this.f1974e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return new C0615OC(this.f1977h, r3, 1);
    L7:
        return new C0615OC(this.f1977h, r3, 0);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r8) {
        int r0 = this.f1974e;
        C0829TC r1 = C0829TC.f2620a;
        EnumC1453gc r2 = EnumC1453gc.f5148a;
        C0701QC r3 = this.f1977h;
        int r5 = 1;
        switch(r0) {
            case 0: goto L34;
            default: goto L4;
        };
    L4:
        int r02 = this.f1976g;
        if (r02 == 0) goto L14;
        if (r02 != 1) goto L13;
        C0701QC r03 = this.f1975f;
        AbstractC0628Oj.m1232T(r8);     // Catch: Exception -> L10
    L19:
        r03.f2266m = (List) r8;     // Catch: Exception -> L10
        EditText r82 = r3.f2258e;     // Catch: Exception -> L10
        if (r82 == null) goto L25;
        Editable r83 = r82.getText();     // Catch: Exception -> L10
        if (r83 == null) goto L25;
        String r84 = r83.toString();     // Catch: Exception -> L10
        if (r84 == null) goto L25;
    L26:
        r3.m1431e(r84);     // Catch: Exception -> L10
        C0701QC.m1430a(r3);     // Catch: Exception -> L10
        C0987Wz r85 = r3.f2255b;     // Catch: Exception -> L10
        if (r85 == null) goto L58;
        r85.setRefreshing(false);     // Catch: Exception -> L10
        return r1;
    L58:
        return r1;
    L25:
        r84 = AbstractC0295Gu.m625r(-485026361767989L);     // Catch: Exception -> L10
        goto L26
    L13:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-485077901375541L));
    L14:
        AbstractC0628Oj.m1232T(r8);
        C0357IC r86 = C0357IC.f1218a;     // Catch: Exception -> L10
        this.f1975f = r3;     // Catch: Exception -> L10
        this.f1976g = 1;     // Catch: Exception -> L10
        r86.getClass();     // Catch: Exception -> L10
        C1498hd r87 = AbstractC1499he.f5282a;     // Catch: Exception -> L10
        r8 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0228FC(r5, null), this);     // Catch: Exception -> L10
        if (r8 == r2) goto L57;
        r03 = r3;
        goto L19
    L57:
        return r2;
    L10:
        e = move-exception;
        Toast.makeText(r3.m1432f(), AbstractC0213Ey.m405c(-485030656735285L, new StringBuilder(), e), 0).show();
        C0987Wz r88 = r3.f2255b;
        if (r88 == null) goto L59;
        r88.setRefreshing(false);
        return r1;
    L59:
        return r1;
    L34:
        int r04 = this.f1976g;
        if (r04 == 0) goto L40;
        if (r04 != 1) goto L39;
        C0701QC r05 = this.f1975f;
        AbstractC0628Oj.m1232T(r8);
    L44:
        r05.f2266m = (List) r8;
        EditText r89 = r3.f2258e;
        if (r89 == null) goto L50;
        Editable r810 = r89.getText();
        if (r810 == null) goto L50;
        String r811 = r810.toString();
        if (r811 == null) goto L50;
    L51:
        r3.m1431e(r811);
        C0701QC.m1430a(r3);
        C0987Wz r812 = r3.f2255b;
        if (r812 == null) goto L62;
        r812.setRefreshing(false);
        return r1;
    L62:
        return r1;
    L50:
        r811 = AbstractC0295Gu.m625r(-487062176266293L);
        goto L51
    L39:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-487066471233589L));
    L40:
        AbstractC0628Oj.m1232T(r8);
        C0357IC r813 = C0357IC.f1218a;
        this.f1975f = r3;
        this.f1976g = 1;
        r813.getClass();
        r8 = C0357IC.m792d(true, this);
        if (r8 == r2) goto L61;
        r05 = r3;
        goto L44
    L61:
        return r2;
    }
}
