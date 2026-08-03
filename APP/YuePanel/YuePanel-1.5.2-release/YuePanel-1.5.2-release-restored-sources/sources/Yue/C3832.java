package Yue;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@IgnoreJRERequirement
public final class C3832 extends AbstractC4255 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3832 f532 = new C3832();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C0267 f533 = new C0267();

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۧۤ$ۥ */
    public static final class C0267 extends ClassValue<InterfaceC5124<? super Throwable, ? extends Throwable>> {
        /* JADX DEBUG: Method merged with bridge method: computeValue(Ljava/lang/Class;)Ljava/lang/Object; */
        @Override // java.lang.ClassValue
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public InterfaceC5124<Throwable, Throwable> computeValue(@InterfaceC6489 Class<?> cls) {
            if (cls != null) {
                return C4732.m1651(cls);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        }
    }

    @Override // Yue.AbstractC4255
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5124<Throwable, Throwable> mo885(@InterfaceC6399 Class<? extends Throwable> cls) {
        return (InterfaceC5124) f533.get(cls);
    }
}
