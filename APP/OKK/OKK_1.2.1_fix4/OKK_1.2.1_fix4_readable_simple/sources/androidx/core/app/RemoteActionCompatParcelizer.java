package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p047a0.AbstractC0471a;
import p047a0.C0472b;
import p047a0.InterfaceC0473c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
    }

    public static RemoteActionCompat read(AbstractC0471a r5) {
        RemoteActionCompat r02 = new RemoteActionCompat();
        InterfaceC0473c r1 = r02.f1297a;
        boolean r2 = true;
        if (r5.mo1106e(1) == false) goto L6;
        r1 = r5.m1108g();
    L6:
        r02.f1297a = (IconCompat) r1;
        CharSequence r12 = r02.f1298b;
        if (r5.mo1106e(2) == false) goto L10;
        r12 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0472b) r5).f1054e);
    L10:
        r02.f1298b = r12;
        CharSequence r13 = r02.f1299c;
        if (r5.mo1106e(3) == false) goto L14;
        r13 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0472b) r5).f1054e);
    L14:
        r02.f1299c = r13;
        r02.f1300d = (PendingIntent) r5.m1107f(r02.f1300d, 4);
        boolean r14 = r02.f1301e;
        if (r5.mo1106e(5) == true) goto L18;
    L21:
        r02.f1301e = r14;
        boolean r15 = r02.f1302f;
        if (r5.mo1106e(6) == true) goto L25;
    L29:
        r02.f1302f = r15;
        return r02;
    L25:
        if (((C0472b) r5).f1054e.readInt() != 0) goto L28;
        r2 = false;
    L28:
        r15 = r2;
        goto L29
    L18:
        if (((C0472b) r5).f1054e.readInt() == 0) goto L20;
        r14 = true;
        goto L21
    L20:
        r14 = false;
        goto L21
    }

    public static void write(RemoteActionCompat r4, AbstractC0471a r5) {
        r5.getClass();
        IconCompat r02 = r4.f1297a;
        r5.mo1109h(1);
        r5.m1110i(r02);
        CharSequence r03 = r4.f1298b;
        r5.mo1109h(2);
        Parcel r1 = ((C0472b) r5).f1054e;
        TextUtils.writeToParcel(r03, r1, 0);
        CharSequence r04 = r4.f1299c;
        r5.mo1109h(3);
        TextUtils.writeToParcel(r04, r1, 0);
        PendingIntent r05 = r4.f1300d;
        r5.mo1109h(4);
        r1.writeParcelable(r05, 0);
        boolean r06 = r4.f1301e;
        r5.mo1109h(5);
        r1.writeInt(r06 ? 1 : 0);
        boolean r42 = r4.f1302f;
        r5.mo1109h(6);
        r1.writeInt(r42 ? 1 : 0);
    }
}
