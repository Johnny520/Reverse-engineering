package Yue;

import Yue.InterfaceC7144;
import android.location.GnssStatus;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(24)
public class C5180 extends AbstractC5179 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final GnssStatus f12237;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۠$ۥ */
    @InterfaceC7113(26)
    public static class C0659 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m1959(GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m1960(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۦ۠$ۥ۟ */
    @InterfaceC7113(30)
    public static class C0660 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static float m1961(GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m1962(GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }
    }

    public C5180(Object obj) {
        this.f12237 = (GnssStatus) C6740.m21415((GnssStatus) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5180) {
            return this.f12237.equals(((C5180) obj).f12237);
        }
        return false;
    }

    public int hashCode() {
        return this.f12237.hashCode();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ */
    public float mo1955(int i) {
        return this.f12237.getAzimuthDegrees(i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟ */
    public float mo1956(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0660.m1961(this.f12237, i);
        }
        throw new UnsupportedOperationException();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo15865(int i) {
        return C0659.m1959(this.f12237, i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public float mo15866(int i) {
        return this.f12237.getCn0DbHz(i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public int mo15867(int i) {
        return this.f12237.getConstellationType(i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public float mo15868(int i) {
        return this.f12237.getElevationDegrees(i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public int mo15869() {
        return this.f12237.getSatelliteCount();
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public int mo15870(int i) {
        return this.f12237.getSvid(i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo15871(int i) {
        return this.f12237.hasAlmanacData(i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo15872(int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0660.m1962(this.f12237, i);
        }
        return false;
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public boolean mo15873(int i) {
        return C0659.m1960(this.f12237, i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo15874(int i) {
        return this.f12237.hasEphemerisData(i);
    }

    @Override // Yue.AbstractC5179
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo15875(int i) {
        return this.f12237.usedInFix(i);
    }
}
