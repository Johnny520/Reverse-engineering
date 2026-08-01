package kotlin.reflect.jvm.internal.impl.storage;

import androidx.appcompat.app.C0064;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6558;
import p103.AbstractC7275;
import p103.C7277;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4848 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f14128;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6558 f14129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4845 f14130;

    public C4848(C4845 c4845, ConcurrentHashMap concurrentHashMap, InterfaceC6558 interfaceC6558) {
        this.f14130 = c4845;
        this.f14128 = concurrentHashMap;
        this.f14129 = interfaceC6558;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9581(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p052.InterfaceC6558
    public Object invoke(Object obj) throws Throwable {
        Object obj2;
        LockBasedStorageManager$NotValue lockBasedStorageManager$NotValue;
        AssertionError assertionErrorM9582;
        AssertionError assertionErrorM95822;
        C4845 c4845 = this.f14130;
        C4841 c4841 = c4845.f14126;
        InterfaceC4842 interfaceC4842 = c4845.f14127;
        ConcurrentHashMap concurrentHashMap = this.f14128;
        Object obj3 = concurrentHashMap.get(obj);
        Object obj4 = AbstractC7275.f19375;
        AssertionError assertionErrorM9583 = null;
        if (obj3 != null && obj3 != LockBasedStorageManager$NotValue.COMPUTING) {
            AbstractC7275.m12494(obj3);
            if (obj3 == obj4) {
                return null;
            }
            return obj3;
        }
        interfaceC4842.lock();
        try {
            obj2 = concurrentHashMap.get(obj);
            lockBasedStorageManager$NotValue = LockBasedStorageManager$NotValue.COMPUTING;
            if (obj2 == lockBasedStorageManager$NotValue) {
                obj2 = LockBasedStorageManager$NotValue.RECURSION_WAS_DETECTED;
                C0064 c0064Mo9573 = c4845.mo9573(obj, "");
                if (c0064Mo9573 == null) {
                    m9581(3);
                    throw null;
                }
                if (!c0064Mo9573.f138) {
                    return c0064Mo9573.f139;
                }
            }
            if (obj2 == LockBasedStorageManager$NotValue.RECURSION_WAS_DETECTED) {
                C0064 c0064Mo95732 = c4845.mo9573(obj, "");
                if (c0064Mo95732 == null) {
                    m9581(3);
                    throw null;
                }
                if (!c0064Mo95732.f138) {
                    return c0064Mo95732.f139;
                }
            }
        } finally {
        }
        if (obj2 != null) {
            AbstractC7275.m12494(obj2);
            return obj2 != obj4 ? obj2 : null;
        }
        try {
            concurrentHashMap.put(obj, lockBasedStorageManager$NotValue);
            Object objInvoke = this.f14129.invoke(obj);
            if (objInvoke != null) {
                obj4 = objInvoke;
            }
            Object objPut = concurrentHashMap.put(obj, obj4);
            if (objPut == lockBasedStorageManager$NotValue) {
                return objInvoke;
            }
            assertionErrorM9583 = m9583(obj, objPut);
            throw assertionErrorM9583;
        } catch (Throwable th) {
            if (AbstractC7275.m12495(th)) {
                try {
                    Object objRemove = concurrentHashMap.remove(obj);
                    if (objRemove != LockBasedStorageManager$NotValue.COMPUTING) {
                        throw m9585(obj, objRemove);
                    }
                    throw th;
                } finally {
                }
            }
            if (th == assertionErrorM9583) {
                try {
                    concurrentHashMap.remove(obj);
                    c4841.getClass();
                    throw th;
                } finally {
                }
            }
            Object objPut2 = concurrentHashMap.put(obj, new C7277(th));
            if (objPut2 != LockBasedStorageManager$NotValue.COMPUTING) {
                throw m9583(obj, objPut2);
            }
            c4841.getClass();
            throw th;
        }
        interfaceC4842.unlock();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AssertionError m9582(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.f14130, th);
        C4845.m9576(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AssertionError m9583(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f14130);
        C4845.m9576(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m9584(C4687 c4687) {
        Object obj = this.f14128.get(c4687);
        return (obj == null || obj == LockBasedStorageManager$NotValue.COMPUTING) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AssertionError m9585(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + LockBasedStorageManager$NotValue.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f14130);
        C4845.m9576(assertionError);
        return assertionError;
    }
}
