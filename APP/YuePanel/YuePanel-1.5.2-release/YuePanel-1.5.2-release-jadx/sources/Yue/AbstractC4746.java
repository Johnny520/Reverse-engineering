package Yue;

import Yue.InterfaceC4225;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4746 extends AbstractC4232 implements Closeable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0480 f10205 = new C0480(null);

    /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۡ$ۥ */
    @InterfaceC4772
    public static final class C0480 extends AbstractC2982<AbstractC4232, AbstractC4746> {

        /* JADX INFO: renamed from: Yue.ۥۣۣ۠ۡ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4747 extends AbstractC5673 implements InterfaceC5124<InterfaceC4225.InterfaceC0357, AbstractC4746> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final C4747 f10206 = new C4747();

            public C4747() {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final AbstractC4746 invoke(@InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
                if (interfaceC0357 instanceof AbstractC4746) {
                    return (AbstractC4746) interfaceC0357;
                }
                return null;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۣ۠ۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0480(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0480() {
            super(AbstractC4232.Key, C4747.f10206);
        }
    }

    public abstract void close();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟ */
    public abstract Executor mo12605();
}
