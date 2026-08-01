package kotlin.reflect.jvm.internal.impl.storage;

import androidx.appcompat.app.C0911;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7387;
import p119.AbstractC8104;
import p119.C8106;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5680 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f14473;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7387 f14474;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5677 f14475;

    public C5680(C5677 c5677, ConcurrentHashMap concurrentHashMap, InterfaceC7387 interfaceC7387) {
        this.f14475 = c5677;
        this.f14473 = concurrentHashMap;
        this.f14474 = interfaceC7387;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m10140(int i) {
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

    @Override // p068.InterfaceC7387
    public Object invoke(Object obj) throws Throwable {
        Object obj2;
        LockBasedStorageManager$NotValue lockBasedStorageManager$NotValue;
        AssertionError assertionErrorM10141;
        AssertionError assertionErrorM101412;
        C5677 c5677 = this.f14475;
        C5673 c5673 = c5677.f14471;
        InterfaceC5674 interfaceC5674 = c5677.f14472;
        ConcurrentHashMap concurrentHashMap = this.f14473;
        Object obj3 = concurrentHashMap.get(obj);
        Object obj4 = AbstractC8104.f19720;
        AssertionError assertionErrorM10142 = null;
        if (obj3 != null && obj3 != LockBasedStorageManager$NotValue.COMPUTING) {
            AbstractC8104.m13053(obj3);
            if (obj3 == obj4) {
                return null;
            }
            return obj3;
        }
        interfaceC5674.lock();
        try {
            obj2 = concurrentHashMap.get(obj);
            lockBasedStorageManager$NotValue = LockBasedStorageManager$NotValue.COMPUTING;
            if (obj2 == lockBasedStorageManager$NotValue) {
                obj2 = LockBasedStorageManager$NotValue.RECURSION_WAS_DETECTED;
                C0911 c0911Mo10132 = c5677.mo10132(obj, "");
                if (c0911Mo10132 == null) {
                    m10140(3);
                    throw null;
                }
                if (!c0911Mo10132.f483) {
                    return c0911Mo10132.f484;
                }
            }
            if (obj2 == LockBasedStorageManager$NotValue.RECURSION_WAS_DETECTED) {
                C0911 c0911Mo101322 = c5677.mo10132(obj, "");
                if (c0911Mo101322 == null) {
                    m10140(3);
                    throw null;
                }
                if (!c0911Mo101322.f483) {
                    return c0911Mo101322.f484;
                }
            }
        } finally {
        }
        if (obj2 != null) {
            AbstractC8104.m13053(obj2);
            return obj2 != obj4 ? obj2 : null;
        }
        try {
            concurrentHashMap.put(obj, lockBasedStorageManager$NotValue);
            Object objInvoke = this.f14474.invoke(obj);
            if (objInvoke != null) {
                obj4 = objInvoke;
            }
            Object objPut = concurrentHashMap.put(obj, obj4);
            if (objPut == lockBasedStorageManager$NotValue) {
                return objInvoke;
            }
            assertionErrorM10142 = m10142(obj, objPut);
            throw assertionErrorM10142;
        } catch (Throwable th) {
            if (AbstractC8104.m13054(th)) {
                try {
                    Object objRemove = concurrentHashMap.remove(obj);
                    if (objRemove != LockBasedStorageManager$NotValue.COMPUTING) {
                        throw m10144(obj, objRemove);
                    }
                    throw th;
                } finally {
                }
            }
            if (th == assertionErrorM10142) {
                try {
                    concurrentHashMap.remove(obj);
                    c5673.getClass();
                    throw th;
                } finally {
                }
            }
            Object objPut2 = concurrentHashMap.put(obj, new C8106(th));
            if (objPut2 != LockBasedStorageManager$NotValue.COMPUTING) {
                throw m10142(obj, objPut2);
            }
            c5673.getClass();
            throw th;
        }
        interfaceC5674.unlock();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AssertionError m10141(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.f14475, th);
        C5677.m10135(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AssertionError m10142(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f14475);
        C5677.m10135(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10143(C5519 c5519) {
        Object obj = this.f14473.get(c5519);
        return (obj == null || obj == LockBasedStorageManager$NotValue.COMPUTING) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AssertionError m10144(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + LockBasedStorageManager$NotValue.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f14475);
        C5677.m10135(assertionError);
        return assertionError;
    }
}
