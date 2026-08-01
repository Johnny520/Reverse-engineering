package io.ktor.http.cio;

import p057.AbstractC6851;

/* JADX INFO: renamed from: io.ktor.http.cio.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3957 extends AbstractC6851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f12181;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3957(int i, int i2) {
        super(i);
        this.f12181 = i2;
    }

    @Override // p057.AbstractC6851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo8356() {
        switch (this.f12181) {
            case 0:
                return new StringBuilder(128);
            case 1:
                return new int[512];
            case 2:
                return new char[2048];
            default:
                return new byte[4096];
        }
    }

    @Override // p057.AbstractC6851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object mo8357(Object obj) {
        switch (this.f12181) {
            case 0:
                StringBuilder sb = (StringBuilder) obj;
                sb.setLength(0);
                return sb;
            default:
                return obj;
        }
    }
}
