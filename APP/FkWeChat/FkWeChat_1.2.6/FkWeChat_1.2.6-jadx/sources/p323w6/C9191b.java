package p323w6;

import io.ktor.utils.p131io.InterfaceC3473k;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p281t6.C8140d;
import p281t6.C8173z;
import p323w6.AbstractC9195f;

/* JADX INFO: renamed from: w6.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9191b extends AbstractC9195f.d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0188p f31413a;

    /* JADX INFO: renamed from: b */
    public final C8140d f31414b;

    /* JADX INFO: renamed from: c */
    public final C8173z f31415c;

    /* JADX INFO: renamed from: d */
    public final Long f31416d;

    public /* synthetic */ C9191b(InterfaceC0188p interfaceC0188p, C8140d c8140d, C8173z c8173z, Long l10, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC0188p, c8140d, (i10 & 4) != 0 ? null : c8173z, (i10 & 8) != 0 ? null : l10);
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: a */
    public Long mo35815a() {
        return this.f31416d;
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: b */
    public C8140d mo25837b() {
        return this.f31414b;
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: d */
    public C8173z mo12275d() {
        return this.f31415c;
    }

    @Override // p323w6.AbstractC9195f.d
    /* JADX INFO: renamed from: e */
    public Object mo25838e(InterfaceC3473k interfaceC3473k, InterfaceC5976f interfaceC5976f) {
        Object objInvoke = this.f31413a.invoke(interfaceC3473k, interfaceC5976f);
        return objInvoke == AbstractC6325c.m24992g() ? objInvoke : C4700i0.f13910a;
    }

    public C9191b(InterfaceC0188p interfaceC0188p, C8140d c8140d, C8173z c8173z, Long l10) {
        interfaceC0188p.getClass();
        this.f31413a = interfaceC0188p;
        this.f31414b = c8140d;
        this.f31415c = c8173z;
        this.f31416d = l10;
    }
}
