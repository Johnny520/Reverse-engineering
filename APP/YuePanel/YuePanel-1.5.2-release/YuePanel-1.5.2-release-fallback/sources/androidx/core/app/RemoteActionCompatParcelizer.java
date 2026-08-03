package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.app.RemoteActionCompat read(Yue.AbstractC6680 r3) {
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            r0.<init>()
            androidx.core.graphics.drawable.IconCompat r1 = r0.f28964
            r2 = 1
            Yue.ۥۣۢۦۤ r1 = r3.m25782(r1, r2)
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.f28964 = r1
            java.lang.CharSequence r1 = r0.f28965
            r2 = 2
            java.lang.CharSequence r1 = r3.m25745(r1, r2)
            r0.f28965 = r1
            java.lang.CharSequence r1 = r0.f28966
            r2 = 3
            java.lang.CharSequence r1 = r3.m25745(r1, r2)
            r0.f28966 = r1
            android.app.PendingIntent r1 = r0.f28967
            r2 = 4
            android.os.Parcelable r1 = r3.m25771(r1, r2)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.f28967 = r1
            boolean r1 = r0.f28968
            r2 = 5
            boolean r1 = r3.m25735(r1, r2)
            r0.f28968 = r1
            boolean r1 = r0.f28969
            r2 = 6
            boolean r3 = r3.m25735(r1, r2)
            r0.f28969 = r3
            return r0
    }

    public static void write(androidx.core.app.RemoteActionCompat r2, Yue.AbstractC6680 r3) {
            r0 = 0
            r3.mo25784(r0, r0)
            androidx.core.graphics.drawable.IconCompat r0 = r2.f28964
            r1 = 1
            r3.m25839(r0, r1)
            java.lang.CharSequence r0 = r2.f28965
            r1 = 2
            r3.m25800(r0, r1)
            java.lang.CharSequence r0 = r2.f28966
            r1 = 3
            r3.m25800(r0, r1)
            android.app.PendingIntent r0 = r2.f28967
            r1 = 4
            r3.m25824(r0, r1)
            boolean r0 = r2.f28968
            r1 = 5
            r3.m25788(r0, r1)
            boolean r2 = r2.f28969
            r0 = 6
            r3.m25788(r2, r0)
            return
    }
}
