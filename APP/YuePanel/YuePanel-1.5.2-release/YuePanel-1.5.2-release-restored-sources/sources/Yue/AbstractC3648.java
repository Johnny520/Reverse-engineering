package Yue;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3648 implements InterfaceC5584, Serializable {

    @InterfaceC7470(version = "1.1")
    public static final Object NO_RECEIVER = C0209.f6451;

    @InterfaceC7470(version = "1.4")
    private final boolean isTopLevel;

    @InterfaceC7470(version = "1.4")
    private final String name;

    @InterfaceC7470(version = "1.4")
    private final Class owner;

    @InterfaceC7470(version = "1.1")
    protected final Object receiver;
    private transient InterfaceC5584 reflected;

    @InterfaceC7470(version = "1.4")
    private final String signature;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦۦ$ۥ */
    @InterfaceC7470(version = "1.2")
    public static class C0209 implements Serializable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0209 f6451 = new C0209();

        /* JADX INFO: renamed from: ۥ۟ */
        public final Object m715() throws ObjectStreamException {
            return f6451;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3648() {
        this(NO_RECEIVER);
    }

    @Override // Yue.InterfaceC5584
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // Yue.InterfaceC5584
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @InterfaceC7470(version = "1.1")
    public InterfaceC5584 compute() {
        InterfaceC5584 interfaceC5584 = this.reflected;
        if (interfaceC5584 != null) {
            return interfaceC5584;
        }
        InterfaceC5584 interfaceC5584ComputeReflected = computeReflected();
        this.reflected = interfaceC5584ComputeReflected;
        return interfaceC5584ComputeReflected;
    }

    public abstract InterfaceC5584 computeReflected();

    @Override // Yue.InterfaceC5583
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @InterfaceC7470(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // Yue.InterfaceC5584
    public String getName() {
        return this.name;
    }

    public InterfaceC5589 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C7071.m21999(cls) : C7071.m21996(cls);
    }

    @Override // Yue.InterfaceC5584
    public List<InterfaceC5603> getParameters() {
        return getReflected().getParameters();
    }

    @InterfaceC7470(version = "1.1")
    public InterfaceC5584 getReflected() {
        InterfaceC5584 interfaceC5584Compute = compute();
        if (interfaceC5584Compute != this) {
            return interfaceC5584Compute;
        }
        throw new C5670();
    }

    @Override // Yue.InterfaceC5584
    public InterfaceC5609 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // Yue.InterfaceC5584
    @InterfaceC7470(version = "1.1")
    public List<InterfaceC5611> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // Yue.InterfaceC5584
    @InterfaceC7470(version = "1.1")
    public EnumC5614 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // Yue.InterfaceC5584
    @InterfaceC7470(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // Yue.InterfaceC5584
    @InterfaceC7470(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // Yue.InterfaceC5584
    @InterfaceC7470(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // Yue.InterfaceC5584
    @InterfaceC7470(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7470(version = "1.1")
    public AbstractC3648(Object obj) {
        this(obj, null, null, null, false);
    }

    @InterfaceC7470(version = "1.4")
    public AbstractC3648(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
