package kotlin.reflect.jvm.internal.impl.storage;

import androidx.appcompat.app.C0911;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7372;
import p119.AbstractC8104;
import p119.C8106;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5675 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7372 f14463;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile Object f14464;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5677 f14465;

    public C5675(C5677 c5677, InterfaceC7372 interfaceC7372) {
        if (c5677 == null) {
            m10133(0);
            throw null;
        }
        this.f14464 = LockBasedStorageManager$NotValue.NOT_COMPUTED;
        this.f14465 = c5677;
        this.f14463 = interfaceC7372;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10133(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006a, B:34:0x0071, B:35:0x0072, B:36:0x0078, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:14:0x0024, B:16:0x0028, B:18:0x0035, B:19:0x0038, B:21:0x003c, B:23:0x0045, B:24:0x0048, B:28:0x0057, B:30:0x005d, B:32:0x0063, B:33:0x006a, B:34:0x0071, B:35:0x0072, B:36:0x0078, B:25:0x004a), top: B:39:0x0011, inners: #1 }] */
    @Override // p068.InterfaceC7372
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke() throws Throwable {
        Object obj = this.f14464;
        if (!(obj instanceof LockBasedStorageManager$NotValue)) {
            AbstractC8104.m13053(obj);
            return obj;
        }
        this.f14465.f14472.lock();
        try {
            Object objInvoke = this.f14464;
            if (objInvoke instanceof LockBasedStorageManager$NotValue) {
                LockBasedStorageManager$NotValue lockBasedStorageManager$NotValue = LockBasedStorageManager$NotValue.COMPUTING;
                if (objInvoke == lockBasedStorageManager$NotValue) {
                    this.f14464 = LockBasedStorageManager$NotValue.RECURSION_WAS_DETECTED;
                    C0911 c0911Mo10130 = mo10130(true);
                    if (!c0911Mo10130.f483) {
                        objInvoke = c0911Mo10130.f484;
                    } else if (objInvoke == LockBasedStorageManager$NotValue.RECURSION_WAS_DETECTED) {
                        C0911 c0911Mo101302 = mo10130(false);
                        if (c0911Mo101302.f483) {
                            this.f14464 = lockBasedStorageManager$NotValue;
                            try {
                                objInvoke = this.f14463.invoke();
                                mo10131(objInvoke);
                                this.f14464 = objInvoke;
                            } catch (Throwable th) {
                                if (AbstractC8104.m13054(th)) {
                                    this.f14464 = LockBasedStorageManager$NotValue.NOT_COMPUTED;
                                    throw th;
                                }
                                if (this.f14464 == LockBasedStorageManager$NotValue.COMPUTING) {
                                    this.f14464 = new C8106(th);
                                }
                                this.f14465.f14471.getClass();
                                throw th;
                            }
                        } else {
                            objInvoke = c0911Mo101302.f484;
                        }
                    }
                }
            } else {
                AbstractC8104.m13053(objInvoke);
            }
            return objInvoke;
        } finally {
            this.f14465.f14472.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C0911 mo10130(boolean z) {
        C0911 c0911Mo10132 = this.f14465.mo10132(null, "in a lazy value");
        if (c0911Mo10132 != null) {
            return c0911Mo10132;
        }
        m10133(2);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m10134() {
        return (this.f14464 == LockBasedStorageManager$NotValue.NOT_COMPUTED || this.f14464 == LockBasedStorageManager$NotValue.COMPUTING) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo10131(Object obj) {
    }
}
