package Yue;

import Yue.InterfaceC7144;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class C5191 extends AbstractC5179 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f12266 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f12267 = 32;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f12268 = 33;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f12269 = 64;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f12270 = -87;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f12271 = 64;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f12272 = 24;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f12273 = 193;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f12274 = 200;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f12275 = 200;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f12276 = 35;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final GpsStatus f12277;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC5225("mWrapped")
    public int f12278;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC5225("mWrapped")
    public Iterator<GpsSatellite> f12279;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC5225("mWrapped")
    public int f12280;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC5225("mWrapped")
    public GpsSatellite f12281;

    public C5191(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) C6740.m21415(gpsStatus);
        this.f12277 = gpsStatus2;
        this.f12278 = -1;
        this.f12279 = gpsStatus2.getSatellites().iterator();
        this.f12280 = -1;
        this.f12281 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static int m15893(int i) {
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i <= 200 || i > 235) {
            return (i < 193 || i > 200) ? 0 : 4;
        }
        return 5;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static int m15894(int i) {
        int iM15893 = m15893(i);
        return iM15893 != 2 ? iM15893 != 3 ? iM15893 != 5 ? i : i - 200 : i - 64 : i + 87;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5191) {
            return this.f12277.equals(((C5191) obj).f12277);
        }
        return false;
    }

    public int hashCode() {
        return this.f12277.hashCode();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ */
    public float mo1955(int i) {
        return m15895(i).getAzimuth();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo1956(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo15865(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public float mo15866(int i) {
        return m15895(i).getSnr();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public int mo15867(int i) {
        return m15893(m15895(i).getPrn());
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public float mo15868(int i) {
        return m15895(i).getElevation();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public int mo15869() {
        int i;
        synchronized (this.f12277) {
            try {
                if (this.f12278 == -1) {
                    for (GpsSatellite gpsSatellite : this.f12277.getSatellites()) {
                        this.f12278++;
                    }
                    this.f12278++;
                }
                i = this.f12278;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public int mo15870(int i) {
        return m15894(m15895(i).getPrn());
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo15871(int i) {
        return m15895(i).hasAlmanac();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo15872(int i) {
        return false;
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public boolean mo15873(int i) {
        return false;
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo15874(int i) {
        return m15895(i).hasEphemeris();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo15875(int i) {
        return m15895(i).usedInFix();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final GpsSatellite m15895(int i) {
        GpsSatellite gpsSatellite;
        synchronized (this.f12277) {
            try {
                if (i < this.f12280) {
                    this.f12279 = this.f12277.getSatellites().iterator();
                    this.f12280 = -1;
                }
                while (true) {
                    int i2 = this.f12280;
                    if (i2 >= i) {
                        break;
                    }
                    this.f12280 = i2 + 1;
                    if (!this.f12279.hasNext()) {
                        this.f12281 = null;
                        break;
                    }
                    this.f12281 = this.f12279.next();
                }
                gpsSatellite = this.f12281;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (GpsSatellite) C6740.m21415(gpsSatellite);
    }
}
