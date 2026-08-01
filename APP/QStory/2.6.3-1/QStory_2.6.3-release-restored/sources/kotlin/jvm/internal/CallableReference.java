package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5940;
import kotlin.reflect.KVisibility;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CallableReference implements InterfaceC5926, Serializable, InterfaceC5230 {
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC5926 reflected;
    private final String signature;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    @Override // kotlin.reflect.InterfaceC5926
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.InterfaceC5926
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC5926 compute() {
        InterfaceC5926 interfaceC5926 = this.reflected;
        if (interfaceC5926 != null) {
            return interfaceC5926;
        }
        InterfaceC5926 interfaceC5926ComputeReflected = computeReflected();
        this.reflected = interfaceC5926ComputeReflected;
        return interfaceC5926ComputeReflected;
    }

    public abstract InterfaceC5926 computeReflected();

    @Override // kotlin.jvm.internal.InterfaceC5230
    public GenericDeclaration findJavaDeclaration() {
        return AbstractC5220.m9446(getOwner(), getSignature());
    }

    @Override // kotlin.reflect.InterfaceC5927
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public String getName() {
        return this.name;
    }

    public InterfaceC5923 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC5228.f13320.mo9475(cls) : AbstractC5228.f13320.mo9476(cls);
    }

    @Override // kotlin.reflect.InterfaceC5926
    public List<InterfaceC5940> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC5926 getReflected() {
        InterfaceC5926 interfaceC5926Compute = compute();
        if (interfaceC5926Compute != this) {
            return interfaceC5926Compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public InterfaceC5919 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.InterfaceC5926
    public List<AbstractC5226> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.InterfaceC5926
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
