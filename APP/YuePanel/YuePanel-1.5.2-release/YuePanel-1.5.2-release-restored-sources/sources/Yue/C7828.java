package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥۢۡۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7828 extends CancellationException implements InterfaceC4224<C7828> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC5568
    @InterfaceC6489
    public final transient InterfaceC5542 f23436;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7828(@InterfaceC6399 String str, @InterfaceC6489 InterfaceC5542 interfaceC5542) {
        super(str);
        this.f23436 = interfaceC5542;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ()Ljava/lang/Throwable; */
    @Override // Yue.InterfaceC4224
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
    public C7828 mo1189() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        C7828 c7828 = new C7828(message, this.f23436);
        c7828.initCause(this);
        return c7828;
    }

    public C7828(@InterfaceC6399 String str) {
        this(str, null);
    }
}
