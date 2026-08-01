package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3843 implements InterfaceC3844 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract AbstractC3842 mo8211(AbstractC3842 abstractC3842);

    @Override // com.typesafe.config.impl.InterfaceC3844
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3842 mo291(AbstractC3842 abstractC3842, String str) {
        try {
            return mo8211(abstractC3842);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("Unexpected exception", e2);
        }
    }
}
