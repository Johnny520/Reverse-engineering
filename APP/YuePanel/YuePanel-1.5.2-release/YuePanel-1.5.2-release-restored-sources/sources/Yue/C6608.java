package Yue;

import Yue.InterfaceC7144;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۡۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6608 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2171 = "a";

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ */
    public static <T extends InterfaceC8181> T m3073(InputStream inputStream) {
        return (T) new C8180(inputStream, null).m27035();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T extends InterfaceC8181> T m3074(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).m5023();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T extends InterfaceC8181> T m20968(@InterfaceC6391 Bundle bundle, @InterfaceC6391 String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(C6608.class.getClassLoader());
            return (T) m3074(bundle2.getParcelable(f2171));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T extends InterfaceC8181> List<T> m20969(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(C6608.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList(f2171).iterator();
            while (it.hasNext()) {
                arrayList.add(m3074((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m20970(@InterfaceC6391 Bundle bundle, @InterfaceC6391 String str, @InterfaceC6490 InterfaceC8181 interfaceC8181) {
        if (interfaceC8181 == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(f2171, m20973(interfaceC8181));
        bundle.putParcelable(str, bundle2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m20971(@InterfaceC6391 Bundle bundle, @InterfaceC6391 String str, @InterfaceC6391 List<? extends InterfaceC8181> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends InterfaceC8181> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m20973(it.next()));
        }
        bundle2.putParcelableArrayList(f2171, arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m20972(InterfaceC8181 interfaceC8181, OutputStream outputStream) {
        C8180 c8180 = new C8180(null, outputStream);
        c8180.m27092(interfaceC8181);
        c8180.mo4207();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Parcelable m20973(InterfaceC8181 interfaceC8181) {
        return new ParcelImpl(interfaceC8181);
    }
}
