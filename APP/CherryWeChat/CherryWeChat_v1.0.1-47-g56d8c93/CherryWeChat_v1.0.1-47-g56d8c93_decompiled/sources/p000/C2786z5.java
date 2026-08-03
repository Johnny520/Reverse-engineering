package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: z5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2786z5 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9451a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f9451a) {
            case 0:
                int i = message.what;
                if (i == 0) {
                    message.obj.getClass();
                    throw new ClassCastException();
                }
                if (i != 1) {
                    return false;
                }
                message.obj.getClass();
                throw new ClassCastException();
            default:
                if (message.what != 1) {
                    return false;
                }
                ((InterfaceC2389pw) message.obj).mo118e();
                return true;
        }
    }
}
