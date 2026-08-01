package p000;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: e1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0192e1 implements InterfaceC0183d8, Serializable {
    public static final Object NO_RECEIVER = C0176d1.f184a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC0183d8 reflected;
    private final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0192e1(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0183d8 compute() {
        InterfaceC0183d8 interfaceC0183d8 = this.reflected;
        if (interfaceC0183d8 != null) {
            return interfaceC0183d8;
        }
        InterfaceC0183d8 interfaceC0183d8ComputeReflected = computeReflected();
        this.reflected = interfaceC0183d8ComputeReflected;
        return interfaceC0183d8ComputeReflected;
    }

    public abstract InterfaceC0183d8 computeReflected();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0041c8
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getBoundReceiver() {
        return this.receiver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0199e8 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            AbstractC0472tb.f927a.getClass();
            return new C0439ra(cls);
        }
        AbstractC0472tb.f927a.getClass();
        return new C0275j1(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC0183d8 getReflected();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public InterfaceC0231g8 getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public EnumC0247h8 getVisibility() {
        return getReflected().getVisibility();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0183d8
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
