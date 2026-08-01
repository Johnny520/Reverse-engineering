package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3844 implements InterfaceC3845 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract AbstractC3843 mo8198(AbstractC3843 abstractC3843);

    @Override // com.typesafe.config.impl.InterfaceC3845
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final AbstractC3843 mo300(AbstractC3843 abstractC3843, String str) {
        try {
            return mo8198(abstractC3843);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("Unexpected exception", e2);
        }
    }
}
