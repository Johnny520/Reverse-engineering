package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes.dex */
public final class t80 extends Binder implements IInterface {
    public final /* synthetic */ UnusedAppRestrictionsBackportService a;

    public t80(UnusedAppRestrictionsBackportService r1) {
        this.a = r1;
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
        if (r4 < 1) goto L8;
        if (r4 > 16777215) goto L8;
        r5.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    L8:
        if (r4 == 1598968902) goto L25;
        if (r4 != 1) goto L11;
        IBinder r42 = r5.readStrongBinder();
        if (r42 != null) goto L15;
        ro r43 = null;
    L21:
        if (r43 != null) goto L23;
        return true;
    L23:
        this.a.a();
        return true;
    L15:
        IInterface r52 = r42.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
        if (r52 != null) goto L18;
    L20:
        ro r53 = new ro();
        r53.a = r42;
        r43 = r53;
        goto L21
    L18:
        if ((r52 instanceof ro) == false) goto L20;
        r43 = (ro) r52;
        goto L21
    L11:
        return super.onTransact(r4, r5, r6, r7);
    L25:
        r6.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
