package com.typesafe.config.impl;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4656 extends C4669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC4675 f12370;

    public C4656(AbstractC4675 abstractC4675, String str) {
        super(TokenType.VALUE, abstractC4675.origin(), str, null);
        this.f12370 = abstractC4675;
    }

    @Override // com.typesafe.config.impl.C4669
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C4656) obj).f12370.equals(this.f12370);
    }

    @Override // com.typesafe.config.impl.C4669
    public final int hashCode() {
        return this.f12370.hashCode() + ((this.f12398.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C4669
    public final String toString() {
        AbstractC4675 abstractC4675 = this.f12370;
        if (abstractC4675.resolveStatus() != ResolveStatus.RESOLVED) {
            return "'<unresolved value>' (" + abstractC4675.valueType().name() + ")";
        }
        return "'" + abstractC4675.unwrapped() + "' (" + abstractC4675.valueType().name() + ")";
    }

    @Override // com.typesafe.config.impl.C4669
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8756(C4669 c4669) {
        return c4669 instanceof C4656;
    }
}
