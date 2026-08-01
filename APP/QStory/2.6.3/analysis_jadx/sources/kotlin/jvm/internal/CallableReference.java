package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.KVisibility;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class CallableReference implements InterfaceC5094, Serializable, InterfaceC4398 {
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC5094 reflected;
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

    @Override // kotlin.reflect.InterfaceC5094
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC5094 compute() {
        InterfaceC5094 interfaceC5094 = this.reflected;
        if (interfaceC5094 != null) {
            return interfaceC5094;
        }
        InterfaceC5094 interfaceC5094ComputeReflected = computeReflected();
        this.reflected = interfaceC5094ComputeReflected;
        return interfaceC5094ComputeReflected;
    }

    public abstract InterfaceC5094 computeReflected();

    @Override // kotlin.jvm.internal.InterfaceC4398
    public GenericDeclaration findJavaDeclaration() {
        return AbstractC4388.m8887(getOwner(), getSignature());
    }

    @Override // kotlin.reflect.InterfaceC5095
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public String getName() {
        return this.name;
    }

    public InterfaceC5091 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC4396.f12975.mo8916(cls) : AbstractC4396.f12975.mo8917(cls);
    }

    @Override // kotlin.reflect.InterfaceC5094
    public List<InterfaceC5108> getParameters() {
        return getReflected().getParameters();
    }

    public InterfaceC5094 getReflected() {
        InterfaceC5094 interfaceC5094Compute = compute();
        if (interfaceC5094Compute != this) {
            return interfaceC5094Compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public InterfaceC5087 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.InterfaceC5094
    public List<AbstractC4394> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.InterfaceC5094
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.InterfaceC5094
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
