package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.KVisibility;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CallableReference implements InterfaceC5093, Serializable, InterfaceC4397 {
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC5093 reflected;
    private final String signature;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class NoReceiver implements Serializable {
        private static final NoReceiver INSTANCE = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.InterfaceC5093
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC5093 compute() {
        InterfaceC5093 interfaceC5093 = this.reflected;
        if (interfaceC5093 != null) {
            return interfaceC5093;
        }
        InterfaceC5093 interfaceC5093ComputeReflected = computeReflected();
        this.reflected = interfaceC5093ComputeReflected;
        return interfaceC5093ComputeReflected;
    }

    public abstract InterfaceC5093 computeReflected();

    @Override // kotlin.jvm.internal.InterfaceC4397
    public GenericDeclaration findJavaDeclaration() {
        return AbstractC4387.m8897(getOwner(), getSignature());
    }

    @Override // kotlin.reflect.InterfaceC5094
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public String getName() {
        return this.name;
    }

    public InterfaceC5090 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC4395.f12971.mo8926(cls) : AbstractC4395.f12971.mo8927(cls);
    }

    @Override // kotlin.reflect.InterfaceC5093
    public List<InterfaceC5107> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC5093 getReflected() {
        InterfaceC5093 interfaceC5093Compute = compute();
        if (interfaceC5093Compute != this) {
            return interfaceC5093Compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public InterfaceC5086 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.InterfaceC5093
    public List<AbstractC4393> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.InterfaceC5093
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }
}
