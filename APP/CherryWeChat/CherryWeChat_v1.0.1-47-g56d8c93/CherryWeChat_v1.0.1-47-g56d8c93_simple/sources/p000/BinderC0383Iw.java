package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Iw */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0383Iw extends Binder implements InterfaceC1058Yk {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f1316c = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0426Jw f1317b;

    public BinderC0383Iw(C0426Jw r1) {
        this.f1317b = r1;
        attachInterface(this, InterfaceC1058Yk.f3366a);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
        String r0 = InterfaceC1058Yk.f3366a;
        if (r4 < 1) goto L8;
        if (r4 > 16777215) goto L8;
        r5.enforceInterface(r0);
    L8:
        if (r4 != 1598968902) goto L11;
        r6.writeString(r0);
        return true;
    L11:
        if (r4 != 1) goto L13;
        int r42 = r5.readInt();
        Parcelable.Creator r62 = Bundle.CREATOR;
        if (r5.readInt() == 0) goto L17;
        Object r52 = r62.createFromParcel(r5);
    L18:
        C0426Jw r63 = this.f1317b;
        r63.mo882a(r42, (Bundle) r52);
        return true;
    L17:
        r52 = null;
        goto L18
    L13:
        return super.onTransact(r4, r5, r6, r7);
    }
}
