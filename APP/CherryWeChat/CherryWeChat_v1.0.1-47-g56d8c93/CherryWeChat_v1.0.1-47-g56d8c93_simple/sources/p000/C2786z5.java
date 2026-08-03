package p000;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: z5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2786z5 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9451a;

    public /* synthetic */ C2786z5(int r1) {
        this.f9451a = r1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r3) {
        switch(this.f9451a) {
            case 0: goto L9;
            default: goto L5;
        };
    L9:
        int r0 = r3.what;
        if (r0 != 0) goto L12;
        r3.obj.getClass();
        throw new ClassCastException();
    L12:
        if (r0 == 1) goto L15;
        return false;
    L15:
        r3.obj.getClass();
        throw new ClassCastException();
    L5:
        if (r3.what != 1) goto L7;
        ((InterfaceC2389pw) r3.obj).mo118e();
        return true;
    L7:
        return false;
    }
}
