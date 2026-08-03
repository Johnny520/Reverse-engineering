package Yue;

import Yue.InterfaceC5399;
import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
@SuppressLint({"BanParcelableUsage"})
public class C7150 implements Parcelable {
    public static final Parcelable.Creator<C7150> CREATOR = new C1191();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f21563;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Handler f21564;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public InterfaceC5399 f21565;

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۦ$ۥ */
    public class C1191 implements Parcelable.Creator<C7150> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public C7150 createFromParcel(Parcel parcel) {
            return new C7150(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
        public C7150[] newArray(int i) {
            return new C7150[i];
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۦ$ۥ۟ */
    public class BinderC1192 extends InterfaceC5399.AbstractBinderC0745 {
        public BinderC1192() {
        }

        @Override // Yue.InterfaceC5399
        /* JADX INFO: renamed from: ۥ */
        public void mo2172(int i, Bundle bundle) {
            C7150 c7150 = C7150.this;
            Handler handler = c7150.f21564;
            if (handler != null) {
                handler.post(c7150.new RunnableC7151(i, bundle));
            } else {
                c7150.m3443(i, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۧۦ$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC7151 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int f21567;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final Bundle f21568;

        public RunnableC7151(int i, Bundle bundle) {
            this.f21567 = i;
            this.f21568 = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7150.this.m3443(this.f21567, this.f21568);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7150(Handler handler) {
        this.f21563 = true;
        this.f21564 = handler;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f21565 == null) {
                    this.f21565 = new BinderC1192();
                }
                parcel.writeStrongBinder(this.f21565.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3443(int i, Bundle bundle) {
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3444(int i, Bundle bundle) {
        if (this.f21563) {
            Handler handler = this.f21564;
            if (handler != null) {
                handler.post(new RunnableC7151(i, bundle));
                return;
            } else {
                m3443(i, bundle);
                return;
            }
        }
        InterfaceC5399 interfaceC5399 = this.f21565;
        if (interfaceC5399 != null) {
            try {
                interfaceC5399.mo2172(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public C7150(Parcel parcel) {
        this.f21563 = false;
        this.f21564 = null;
        this.f21565 = InterfaceC5399.AbstractBinderC0745.m16885(parcel.readStrongBinder());
    }
}
