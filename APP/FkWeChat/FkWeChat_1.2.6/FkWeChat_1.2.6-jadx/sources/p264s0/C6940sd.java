package p264s0;

import androidx.compose.runtime.InterfaceC0512i2;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p215oc.C5729x;
import p265s1.AbstractC7124p2;
import p265s1.AbstractC7147u0;
import p265s1.AbstractC7162x2;
import p265s1.C7114n2;
import p265s1.InterfaceC7090i3;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: s0.sd */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6940sd implements InterfaceC7090i3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0512i2 f22839a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7090i3 f22840b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7090i3 f22841c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7144t2 f22842d = AbstractC7147u0.m28224a();

    /* JADX INFO: renamed from: e */
    public final InterfaceC7144t2 f22843e = AbstractC7147u0.m28224a();

    /* JADX INFO: renamed from: f */
    public final InterfaceC7144t2 f22844f = AbstractC7147u0.m28224a();

    public C6940sd(InterfaceC0512i2 interfaceC0512i2, InterfaceC7090i3 interfaceC7090i3, InterfaceC7090i3 interfaceC7090i32) {
        this.f22839a = interfaceC0512i2;
        this.f22840b = interfaceC7090i3;
        this.f22841c = interfaceC7090i32;
    }

    @Override // p265s1.InterfaceC7090i3
    /* JADX INFO: renamed from: a */
    public AbstractC7124p2 mo4a(long j10, EnumC3191u enumC3191u, InterfaceC3175e interfaceC3175e) {
        this.f22842d.reset();
        this.f22843e.reset();
        this.f22844f.reset();
        AbstractC7124p2 abstractC7124p2Mo4a = this.f22840b.mo4a(j10, enumC3191u, interfaceC3175e);
        AbstractC7124p2 abstractC7124p2Mo4a2 = this.f22841c.mo4a(j10, enumC3191u, interfaceC3175e);
        if (abstractC7124p2Mo4a instanceof AbstractC7124p2.a) {
            InterfaceC7144t2.m28218e(this.f22842d, ((AbstractC7124p2.a) abstractC7124p2Mo4a).m28087b(), 0L, 2, null);
        } else if (abstractC7124p2Mo4a instanceof AbstractC7124p2.c) {
            InterfaceC7144t2.m28219i(this.f22842d, ((AbstractC7124p2.c) abstractC7124p2Mo4a).m28089b(), null, 2, null);
        } else {
            if (!(abstractC7124p2Mo4a instanceof AbstractC7124p2.b)) {
                C5729x.m23182a();
                return null;
            }
            InterfaceC7144t2.m28220t(this.f22842d, ((AbstractC7124p2.b) abstractC7124p2Mo4a).m28088b(), null, 2, null);
        }
        if (abstractC7124p2Mo4a2 instanceof AbstractC7124p2.a) {
            InterfaceC7144t2.m28218e(this.f22844f, ((AbstractC7124p2.a) abstractC7124p2Mo4a2).m28087b(), 0L, 2, null);
        } else if (abstractC7124p2Mo4a2 instanceof AbstractC7124p2.c) {
            InterfaceC7144t2.m28219i(this.f22844f, ((AbstractC7124p2.c) abstractC7124p2Mo4a2).m28089b(), null, 2, null);
        } else {
            if (!(abstractC7124p2Mo4a2 instanceof AbstractC7124p2.b)) {
                C5729x.m23182a();
                return null;
            }
            InterfaceC7144t2.m28220t(this.f22844f, ((AbstractC7124p2.b) abstractC7124p2Mo4a2).m28088b(), null, 2, null);
        }
        this.f22844f.mo28170a(((C7114n2) this.f22839a.getValue()).m28036r());
        this.f22843e.mo28182o(this.f22842d, this.f22844f, AbstractC7162x2.f23689a.m28261d());
        return new AbstractC7124p2.a(this.f22843e);
    }
}
