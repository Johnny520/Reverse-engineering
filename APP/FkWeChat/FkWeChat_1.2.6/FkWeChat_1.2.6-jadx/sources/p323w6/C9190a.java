package p323w6;

import p024b9.AbstractC1043k;
import p281t6.C8140d;
import p281t6.C8173z;
import p323w6.AbstractC9195f;

/* JADX INFO: renamed from: w6.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9190a extends AbstractC9195f.a {

    /* JADX INFO: renamed from: a */
    public final byte[] f31410a;

    /* JADX INFO: renamed from: b */
    public final C8140d f31411b;

    /* JADX INFO: renamed from: c */
    public final C8173z f31412c;

    public /* synthetic */ C9190a(byte[] bArr, C8140d c8140d, C8173z c8173z, int i10, AbstractC1043k abstractC1043k) {
        this(bArr, (i10 & 2) != 0 ? null : c8140d, (i10 & 4) != 0 ? null : c8173z);
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: a */
    public Long mo35815a() {
        return Long.valueOf(this.f31410a.length);
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: b */
    public C8140d mo25837b() {
        return this.f31411b;
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: d */
    public C8173z mo12275d() {
        return this.f31412c;
    }

    @Override // p323w6.AbstractC9195f.a
    /* JADX INFO: renamed from: e */
    public byte[] mo35816e() {
        return this.f31410a;
    }

    public C9190a(byte[] bArr, C8140d c8140d, C8173z c8173z) {
        bArr.getClass();
        this.f31410a = bArr;
        this.f31411b = c8140d;
        this.f31412c = c8173z;
    }
}
