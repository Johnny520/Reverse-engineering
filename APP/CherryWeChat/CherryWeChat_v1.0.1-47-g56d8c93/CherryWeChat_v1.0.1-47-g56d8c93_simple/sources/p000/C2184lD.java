package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import io.github.cherrywechat.network.model.UpdateInfo;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lD */
/* JADX INFO: loaded from: classes.dex */
public final class C2184lD extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public int f7614e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f7615f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f7616g;

    public C2184lD(Context r1, boolean r2, InterfaceC0190Eb r3) {
        this.f7615f = r1;
        this.f7616g = r2;
        super(r3);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r1, Object r2) {
        InterfaceC0190Eb r22 = (InterfaceC0190Eb) r2;
        return ((C2184lD) mo447h(r22, (InterfaceC1409fc) r1)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb r3, Object r4) {
        return new C2184lD(this.f7615f, this.f7616g, r3);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object r8) {
        int r0 = this.f7614e;
        boolean r2 = this.f7616g;
        Context r4 = this.f7615f;
        if (r0 == 0) goto L11;
        if (r0 != 1) goto L10;
        AbstractC0628Oj.m1232T(r8);     // Catch: Exception -> L7
    L16:
        C2227mD r02 = C2227mD.f7746a;     // Catch: Exception -> L7
        UpdateInfo r82 = C2227mD.m4482a(r02, (String) r8);     // Catch: Exception -> L7
        if (Integer.parseInt(r82.getVersionName()) <= 10724) goto L19;
        C2227mD.m4483b(r02, r4, r82);     // Catch: Exception -> L7
    L26:
        return C0829TC.f2620a;
    L19:
        if (r2 == false) goto L26;
        Toast.makeText(r4, AbstractC0295Gu.m625r(-464698281556021L), 0).show();     // Catch: Exception -> L7
        goto L26
    L10:
        throw new IllegalStateException(AbstractC0295Gu.m625r(-464805655738421L));
    L11:
        AbstractC0628Oj.m1232T(r8);
        C2227mD.f7746a.getClass();     // Catch: Exception -> L7
        SharedPreferences.Editor r83 = C2227mD.m4485d().edit();     // Catch: Exception -> L7
        r83.putLong(AbstractC0295Gu.m625r(-464629562079285L), System.currentTimeMillis());     // Catch: Exception -> L7
        r83.apply();     // Catch: Exception -> L7
        C0594Ns r84 = C0594Ns.f1925a;     // Catch: Exception -> L7
        this.f7614e = 1;     // Catch: Exception -> L7
        r84.getClass();     // Catch: Exception -> L7
        C1498hd r85 = AbstractC1499he.f5282a;     // Catch: Exception -> L7
        int r5 = 3;
        r8 = AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C1034Y2(r5, null), this);     // Catch: Exception -> L7
        EnumC1453gc r03 = EnumC1453gc.f5148a;
        if (r8 != r03) goto L16;
        return r03;
    L7:
        e = move-exception;
        AbstractC0295Gu.m625r(-464736936261685L);
        e.getMessage();
        if (r2 == false) goto L26;
        AbstractC0213Ey.m413k(-464775590967349L, r4, 0);
        goto L26
    }
}
