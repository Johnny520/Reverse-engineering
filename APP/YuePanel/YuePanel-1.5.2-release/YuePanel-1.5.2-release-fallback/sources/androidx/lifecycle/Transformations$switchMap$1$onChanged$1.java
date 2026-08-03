package androidx.lifecycle;

/* JADX INFO: Add missing generic type declarations: [Y] */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "y", "LYue/ۥۣۢ۠ۤ;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class Transformations$switchMap$1$onChanged$1<Y> extends Yue.AbstractC3560 implements Yue.InterfaceC2825<Y, Yue.C6593> {
    final /* synthetic */ androidx.lifecycle.MediatorLiveData<Y> $result;

    public Transformations$switchMap$1$onChanged$1(androidx.lifecycle.MediatorLiveData<Y> r1) {
            r0 = this;
            r0.$result = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // Yue.InterfaceC2825
    public /* bridge */ /* synthetic */ Yue.C6593 invoke(java.lang.Object r1) {
            r0 = this;
            r0.invoke2(r1)
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Y r2) {
            r1 = this;
            androidx.lifecycle.MediatorLiveData<Y> r0 = r1.$result
            r0.setValue(r2)
            return
    }
}
