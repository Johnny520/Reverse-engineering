package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum CallableMemberDescriptor$Kind {
    DECLARATION,
    FAKE_OVERRIDE,
    DELEGATION,
    SYNTHESIZED;

    public boolean isReal() {
        return this != FAKE_OVERRIDE;
    }
}
