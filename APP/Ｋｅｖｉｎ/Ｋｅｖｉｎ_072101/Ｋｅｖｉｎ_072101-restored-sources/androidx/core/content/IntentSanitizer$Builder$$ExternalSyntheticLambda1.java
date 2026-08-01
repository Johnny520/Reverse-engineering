package androidx.core.content;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class IntentSanitizer$Builder$$ExternalSyntheticLambda1 implements androidx.core.util.Predicate {
    public final /* synthetic */ java.lang.String f$0;

    public /* synthetic */ IntentSanitizer$Builder$$ExternalSyntheticLambda1(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            return
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = r1.f$0
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r0.equals(r2)
            return r2
    }
}
