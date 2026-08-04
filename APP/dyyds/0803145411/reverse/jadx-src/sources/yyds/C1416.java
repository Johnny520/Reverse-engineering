package yyds;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᛶᲀᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1416 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final ConcurrentHashMap f6700 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1106 f6701;

    static {
        ConcurrentHashMap.newKeySet();
    }

    public C1416(InterfaceC1106 interfaceC1106) {
        new HashMap();
        this.f6701 = interfaceC1106;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final long m2876() {
        try {
            C1922 c1922 = (C1922) this.f6701;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                c1922.f9681.transact(5, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readLong();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            throw new C1738(e);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m2877() {
        try {
            C1922 c1922 = (C1922) this.f6701;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                c1922.f9681.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            throw new C1738(e);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String m2878() {
        try {
            C1922 c1922 = (C1922) this.f6701;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                c1922.f9681.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            throw new C1738(e);
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m2879(List list, C2632 c2632) {
        try {
            InterfaceC1106 interfaceC1106 = this.f6701;
            BinderC1719 binderC1719 = (BinderC1719) f6700.computeIfAbsent(c2632, new C0456());
            C1922 c1922 = (C1922) interfaceC1106;
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                parcelObtain.writeStringList(list);
                parcelObtain.writeStrongInterface(binderC1719);
                c1922.f9681.transact(12, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            throw new C1738(e);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long m2880() {
        try {
            C1922 c1922 = (C1922) this.f6701;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                c1922.f9681.transact(6, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readLong();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            throw new C1738(e);
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final ArrayList m2881() {
        try {
            C1922 c1922 = (C1922) this.f6701;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                c1922.f9681.transact(11, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.createStringArrayList();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            throw new C1738(e);
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String m2882() {
        try {
            C1922 c1922 = (C1922) this.f6701;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                c1922.f9681.transact(4, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            throw new C1738(e);
        }
    }
}
