package p063e9;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import gg.AbstractC1416l;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: e9.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0841l {

    /* JADX INFO: renamed from: a */
    public final String f2556a;

    /* JADX INFO: renamed from: b */
    public final String f2557b;

    /* JADX INFO: renamed from: c */
    public final int f2558c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f2559d;

    /* JADX INFO: renamed from: e */
    public final long f2560e;

    /* JADX INFO: renamed from: f */
    public final long f2561f;

    /* JADX INFO: renamed from: g */
    public final long f2562g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f2563h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0841l(String str, String str2, int i9, Bitmap bitmap, long j3, long j4, long j5, PendingIntent pendingIntent, int i10) {
        j4 = (i10 & 32) != 0 ? 0L : j4;
        pendingIntent = (i10 & 128) != 0 ? null : pendingIntent;
        str.getClass();
        this.f2556a = str;
        this.f2557b = str2;
        this.f2558c = i9;
        this.f2559d = bitmap;
        this.f2560e = j3;
        this.f2561f = j4;
        this.f2562g = j5;
        this.f2563h = pendingIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0841l)) {
            return false;
        }
        C0841l c0841l = (C0841l) obj;
        return AbstractC1416l.m3825a(this.f2556a, c0841l.f2556a) && this.f2557b.equals(c0841l.f2557b) && this.f2558c == c0841l.f2558c && AbstractC1416l.m3825a(this.f2559d, c0841l.f2559d) && this.f2560e == c0841l.f2560e && this.f2561f == c0841l.f2561f && this.f2562g == c0841l.f2562g && AbstractC1416l.m3825a(this.f2563h, c0841l.f2563h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2242e = AbstractC0921a.m2242e(this.f2558c, AbstractC0921a.m2244g(this.f2556a.hashCode() * 31, 31, this.f2557b), 31);
        Bitmap bitmap = this.f2559d;
        int iM2243f = AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2243f((iM2242e + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.f2560e), 31, this.f2561f), 31, this.f2562g);
        PendingIntent pendingIntent = this.f2563h;
        return iM2243f + (pendingIntent != null ? pendingIntent.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("NotifyPayload(title=", this.f2556a, ", text=", this.f2557b, ", unreadCount=");
        sbM1027p.append(this.f2558c);
        sbM1027p.append(", largeIcon=");
        sbM1027p.append(this.f2559d);
        sbM1027p.append(", whenMillis=");
        sbM1027p.append(this.f2560e);
        AbstractC2091b.m5172s(sbM1027p, ", msgId=", this.f2561f, ", msgSvrId=");
        sbM1027p.append(this.f2562g);
        sbM1027p.append(", contentIntent=");
        sbM1027p.append(this.f2563h);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }
}
