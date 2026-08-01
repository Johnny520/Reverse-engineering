package kotlin.reflect.jvm.internal.impl.storage;

import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0076;
import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1322;
import kotlin.reflect.jvm.internal.impl.types.C4889;
import net.bytebuddy.description.method.MethodDescription;
import p098.C7239;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4837 extends C4842 implements InterfaceC4845 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C1012 f14109;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile C0076 f14110;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4837(C4844 c4844, C1322 c1322, C1012 c1012) {
        super(c4844, c1322);
        this.f14109 = c1012;
        if (c4844 == null) {
            m9579(0);
            throw null;
        }
        this.f14110 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m9579(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9580(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C4842, p052.InterfaceC6542
    public final Object invoke() throws Throwable {
        Object objInvoke;
        C0076 c0076 = this.f14110;
        if (c0076 == null || ((Thread) c0076.f228) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else if (((Thread) c0076.f228) == Thread.currentThread()) {
            objInvoke = c0076.f227;
        } else {
            C5919.m11250("No value in this thread (hasValue should be checked before)");
            objInvoke = null;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        m9579(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C4842
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0064 mo9581(boolean z) {
        return new C0064(new C4889(AbstractC8189.m13660(C7239.f19293)), 3, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C4842
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo9582(Object obj) {
        this.f14110 = new C0076(obj);
        try {
            if (obj != null) {
                this.f14109.invoke(obj);
            } else {
                m9580(2);
                throw null;
            }
        } finally {
            this.f14110 = null;
        }
    }
}
