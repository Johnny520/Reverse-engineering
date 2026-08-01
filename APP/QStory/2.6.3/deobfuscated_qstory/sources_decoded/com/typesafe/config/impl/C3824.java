package com.typesafe.config.impl;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3824 extends C3837 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3843 f12025;

    public C3824(AbstractC3843 abstractC3843, String str) {
        super(TokenType.VALUE, abstractC3843.origin(), str, null);
        this.f12025 = abstractC3843;
    }

    @Override // com.typesafe.config.impl.C3837
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3824) obj).f12025.equals(this.f12025);
    }

    @Override // com.typesafe.config.impl.C3837
    public final int hashCode() {
        return this.f12025.hashCode() + ((this.f12053.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C3837
    public final String toString() {
        AbstractC3843 abstractC3843 = this.f12025;
        if (abstractC3843.resolveStatus() != ResolveStatus.RESOLVED) {
            return "'<unresolved value>' (" + abstractC3843.valueType().name() + ")";
        }
        return "'" + abstractC3843.unwrapped() + "' (" + abstractC3843.valueType().name() + ")";
    }

    @Override // com.typesafe.config.impl.C3837
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8197(C3837 c3837) {
        return c3837 instanceof C3824;
    }
}
