package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.InterfaceC0344a;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0341a();

    /* JADX INFO: renamed from: q */
    public final boolean f976q = false;

    /* JADX INFO: renamed from: r */
    public final Handler f977r = null;

    /* JADX INFO: renamed from: s */
    public InterfaceC0344a f978s;

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class C0341a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class BinderC0342b extends InterfaceC0344a.a {
        public BinderC0342b() {
        }

        @Override // android.support.v4.os.InterfaceC0344a
        /* JADX INFO: renamed from: a */
        public void mo1094a(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f977r;
            if (handler != null) {
                handler.post(resultReceiver.new RunnableC0343c(i10, bundle));
            } else {
                resultReceiver.m1091a(i10, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class RunnableC0343c implements Runnable {

        /* JADX INFO: renamed from: q */
        public final int f980q;

        /* JADX INFO: renamed from: r */
        public final Bundle f981r;

        public RunnableC0343c(int i10, Bundle bundle) {
            this.f980q = i10;
            this.f981r = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.m1091a(this.f980q, this.f981r);
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f978s = InterfaceC0344a.a.m1095b(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f978s == null) {
                    this.f978s = new BinderC0342b();
                }
                parcel.writeStrongBinder(this.f978s.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1091a(int i10, Bundle bundle) {
    }
}
