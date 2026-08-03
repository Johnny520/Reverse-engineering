package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import p000a.AbstractC0695lg;
import p000a.InterfaceC0733ng;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0695lg abstractC0695lg) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0733ng interfaceC0733ngM1575l = remoteActionCompat.f4422a;
        if (abstractC0695lg.mo1571h(1)) {
            interfaceC0733ngM1575l = abstractC0695lg.m1575l();
        }
        remoteActionCompat.f4422a = (IconCompat) interfaceC0733ngM1575l;
        CharSequence charSequenceMo1570g = remoteActionCompat.f4423b;
        if (abstractC0695lg.mo1571h(2)) {
            charSequenceMo1570g = abstractC0695lg.mo1570g();
        }
        remoteActionCompat.f4423b = charSequenceMo1570g;
        CharSequence charSequenceMo1570g2 = remoteActionCompat.f4424c;
        if (abstractC0695lg.mo1571h(3)) {
            charSequenceMo1570g2 = abstractC0695lg.mo1570g();
        }
        remoteActionCompat.f4424c = charSequenceMo1570g2;
        Parcelable parcelableMo1573j = remoteActionCompat.f4425d;
        if (abstractC0695lg.mo1571h(4)) {
            parcelableMo1573j = abstractC0695lg.mo1573j();
        }
        remoteActionCompat.f4425d = (PendingIntent) parcelableMo1573j;
        boolean zMo1568e = remoteActionCompat.f4426e;
        if (abstractC0695lg.mo1571h(5)) {
            zMo1568e = abstractC0695lg.mo1568e();
        }
        remoteActionCompat.f4426e = zMo1568e;
        boolean zMo1568e2 = remoteActionCompat.f4427f;
        if (abstractC0695lg.mo1571h(6)) {
            zMo1568e2 = abstractC0695lg.mo1568e();
        }
        remoteActionCompat.f4427f = zMo1568e2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0695lg abstractC0695lg) {
        abstractC0695lg.getClass();
        IconCompat iconCompat = remoteActionCompat.f4422a;
        abstractC0695lg.mo1576m(1);
        abstractC0695lg.m1583t(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4423b;
        abstractC0695lg.mo1576m(2);
        abstractC0695lg.mo1579p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f4424c;
        abstractC0695lg.mo1576m(3);
        abstractC0695lg.mo1579p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f4425d;
        abstractC0695lg.mo1576m(4);
        abstractC0695lg.mo1581r(pendingIntent);
        boolean z = remoteActionCompat.f4426e;
        abstractC0695lg.mo1576m(5);
        abstractC0695lg.mo1577n(z);
        boolean z2 = remoteActionCompat.f4427f;
        abstractC0695lg.mo1576m(6);
        abstractC0695lg.mo1577n(z2);
    }
}
