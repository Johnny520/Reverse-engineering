package com.typesafe.config.impl;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3823 extends C3836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3842 f12020;

    public C3823(AbstractC3842 abstractC3842, String str) {
        super(TokenType.VALUE, abstractC3842.origin(), str, null);
        this.f12020 = abstractC3842;
    }

    @Override // com.typesafe.config.impl.C3836
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3823) obj).f12020.equals(this.f12020);
    }

    @Override // com.typesafe.config.impl.C3836
    public final int hashCode() {
        return this.f12020.hashCode() + ((this.f12048.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C3836
    public final String toString() {
        AbstractC3842 abstractC3842 = this.f12020;
        if (abstractC3842.resolveStatus() != ResolveStatus.RESOLVED) {
            return "'<unresolved value>' (" + abstractC3842.valueType().name() + ")";
        }
        return "'" + abstractC3842.unwrapped() + "' (" + abstractC3842.valueType().name() + ")";
    }

    @Override // com.typesafe.config.impl.C3836
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8210(C3836 c3836) {
        return c3836 instanceof C3823;
    }
}
