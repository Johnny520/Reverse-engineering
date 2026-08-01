package kotlin.reflect.jvm.internal.impl.storage;

import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0923;
import androidx.compose.foundation.text.C1850;
import androidx.compose.runtime.C2157;
import kotlin.reflect.jvm.internal.impl.types.C5722;
import net.bytebuddy.description.method.MethodDescription;
import p050.AbstractC7176;
import p114.C8069;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5670 extends C5675 implements InterfaceC5678 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C1850 f14458;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public volatile C0923 f14459;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5670(C5677 c5677, C2157 c2157, C1850 c1850) {
        super(c5677, c2157);
        this.f14458 = c1850;
        if (c5677 == null) {
            m10128(0);
            throw null;
        }
        this.f14459 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m10128(int i) {
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
    public static /* synthetic */ void m10129(int i) {
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

    @Override // kotlin.reflect.jvm.internal.impl.storage.C5675, p068.InterfaceC7372
    public final Object invoke() throws Throwable {
        Object objInvoke;
        C0923 c0923 = this.f14459;
        if (c0923 == null || ((Thread) c0923.f573) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else if (((Thread) c0923.f573) == Thread.currentThread()) {
            objInvoke = c0923.f572;
        } else {
            C6755.m11870("No value in this thread (hasValue should be checked before)");
            objInvoke = null;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        m10128(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C5675
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0911 mo10130(boolean z) {
        return new C0911(new C5722(AbstractC7176.m12487(C8069.f19633)), 3, false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.C5675
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo10131(Object obj) {
        this.f14459 = new C0923(obj);
        try {
            if (obj != null) {
                this.f14458.invoke(obj);
            } else {
                m10129(2);
                throw null;
            }
        } finally {
            this.f14459 = null;
        }
    }
}
