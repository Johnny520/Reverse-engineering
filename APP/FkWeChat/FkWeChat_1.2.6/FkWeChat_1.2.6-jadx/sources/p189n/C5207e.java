package p189n;

import android.content.Context;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.InterfaceC3175e;
import p265s1.C7128q1;
import p274t.InterfaceC7887q2;

/* JADX INFO: renamed from: n.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5207e implements InterfaceC5230i2 {

    /* JADX INFO: renamed from: a */
    public final Context f16002a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3175e f16003b;

    /* JADX INFO: renamed from: c */
    public final long f16004c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7887q2 f16005d;

    public C5207e(Context context, InterfaceC3175e interfaceC3175e, long j10, InterfaceC7887q2 interfaceC7887q2) {
        this.f16002a = context;
        this.f16003b = interfaceC3175e;
        this.f16004c = j10;
        this.f16005d = interfaceC7887q2;
    }

    @Override // p189n.InterfaceC5230i2
    /* JADX INFO: renamed from: a */
    public InterfaceC5225h2 mo21379a() {
        return new C5202d(this.f16002a, this.f16003b, this.f16004c, this.f16005d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC1061t.m3842c(C5207e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C5207e c5207e = (C5207e) obj;
        return AbstractC1061t.m3842c(this.f16002a, c5207e.f16002a) && AbstractC1061t.m3842c(this.f16003b, c5207e.f16003b) && C7128q1.m28131q(this.f16004c, c5207e.f16004c) && AbstractC1061t.m3842c(this.f16005d, c5207e.f16005d);
    }

    public int hashCode() {
        return (((((this.f16002a.hashCode() * 31) + this.f16003b.hashCode()) * 31) + C7128q1.m28137w(this.f16004c)) * 31) + this.f16005d.hashCode();
    }

    public /* synthetic */ C5207e(Context context, InterfaceC3175e interfaceC3175e, long j10, InterfaceC7887q2 interfaceC7887q2, AbstractC1043k abstractC1043k) {
        this(context, interfaceC3175e, j10, interfaceC7887q2);
    }
}
