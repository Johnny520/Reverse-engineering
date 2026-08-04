package yyds;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.p000ss.android.ugc.awemes.MainActivity;

/* JADX INFO: renamed from: yyds.ᛸᛲᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1719 extends Binder implements IInterface {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C2632 f8705;

    public BinderC1719(C2632 c2632) {
        this.f8705 = c2632;
        attachInterface(this, "io.github.libxposed.service.IXposedScopeCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("io.github.libxposed.service.IXposedScopeCallback");
        }
        C2632 c2632 = this.f8705;
        if (i == 2) {
            parcel.createStringArrayList();
            c2632.getClass();
            AbstractC2328.m4341(-1296547120317294L);
            MainActivity mainActivity = c2632.f12963;
            mainActivity.runOnUiThread(new RunnableC0022(mainActivity, c2632.f12964, c2632.f12965, 2));
            C1416.f6700.remove(c2632);
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        String string = parcel.readString();
        c2632.getClass();
        AbstractC2328.m4341(-1296585775022958L);
        MainActivity mainActivity2 = c2632.f12963;
        mainActivity2.runOnUiThread(new RunnableC0022(mainActivity2, c2632.f12964, string, 3));
        C1416.f6700.remove(c2632);
        return true;
    }
}
