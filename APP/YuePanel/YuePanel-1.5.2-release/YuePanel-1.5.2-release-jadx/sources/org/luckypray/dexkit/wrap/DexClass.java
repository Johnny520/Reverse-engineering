package org.luckypray.dexkit.wrap;

import Yue.C4335;
import Yue.C5385;
import Yue.C5499;
import Yue.C7627;
import Yue.C7628;
import Yue.InterfaceC5578;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import net.bytebuddy.pool.TypePool;
import org.luckypray.dexkit.util.DexSignUtil;
import org.luckypray.dexkit.util.InstanceUtil;
import org.luckypray.dexkit.wrap.ISerializable;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\b\u0016\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\u0012\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\nR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n¨\u0006\u001c"}, m2699d2 = {"Lorg/luckypray/dexkit/wrap/DexClass;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "descriptor", "", "(Ljava/lang/String;)V", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "className", "getClassName", "()Ljava/lang/String;", "isArray", "", "()Z", "simpleName", "getSimpleName", "typeName", "getTypeName", "equals", "other", "", "getInstance", "classLoader", "Ljava/lang/ClassLoader;", "hashCode", "", "toString", "Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class DexClass implements ISerializable {

    @InterfaceC6399
    public static final Companion Companion = new Companion(null);

    @InterfaceC6399
    private final String typeName;

    @InterfaceC6211(m2698d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/wrap/DexClass$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/DexClass;", "descriptor", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.wrap.DexClass.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        public final DexClass deserialize(@InterfaceC6399 String str) {
            C5499.m17103(str, "descriptor");
            return new DexClass(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexClass(@InterfaceC6399 String str) {
        C5499.m17103(str, "descriptor");
        this.typeName = DexSignUtil.getTypeName(str);
    }

    @InterfaceC6399
    @InterfaceC5578
    public static final DexClass deserialize(@InterfaceC6399 String str) {
        return Companion.deserialize(str);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DexClass) {
            return C5499.m17094(this.typeName, ((DexClass) obj).typeName);
        }
        return false;
    }

    @InterfaceC6399
    public final String getClassName() {
        return this.typeName;
    }

    @InterfaceC6399
    public final Class<?> getInstance(@InterfaceC6399 ClassLoader classLoader) throws ClassNotFoundException {
        C5499.m17103(classLoader, "classLoader");
        return InstanceUtil.INSTANCE.getClassInstance(classLoader, this);
    }

    @InterfaceC6399
    public final String getSimpleName() {
        return C7628.m24162(this.typeName, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, null, 2, null);
    }

    @InterfaceC6399
    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        return this.typeName.hashCode();
    }

    public final boolean isArray() {
        return C7627.m23973(this.typeName, C5385.f13236, false, 2, null);
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    @InterfaceC6399
    public String serialize() {
        return ISerializable.DefaultImpls.serialize(this);
    }

    @InterfaceC6399
    public String toString() {
        return DexSignUtil.getTypeSign(this.typeName);
    }

    public DexClass(@InterfaceC6399 Class<?> cls) {
        C5499.m17103(cls, "clazz");
        this.typeName = DexSignUtil.getTypeName(cls);
    }
}
