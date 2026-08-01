// Decompiled by JEB v5.42.0.202606242140

package c.י;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;

public class CLS642 extends VersionedParcel {
    public final Parcel FLD656;
    public final String FLD657;
    public final SparseIntArray FLD658;
    public final int FLD659;
    public int FLD660;
    public int FLD661;
    public final int FLD662;

    public CLS642(Parcel parcel0) {
        this(parcel0, parcel0.dataPosition(), parcel0.dataSize(), "");
    }

    public CLS642(Parcel parcel0, int v, int v1, String s) {
        this.FLD658 = new SparseIntArray();
        this.FLD661 = -1;
        this.FLD656 = parcel0;
        this.FLD659 = v;
        this.FLD662 = v1;
        this.FLD660 = v;
        this.FLD657 = s;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel MTH708() {
        int v = this.FLD656.dataPosition();
        return new CLS642(this.FLD656, v, (this.FLD660 == this.FLD659 ? this.FLD662 : this.FLD660), this.FLD657 + "  ");
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public Parcelable MTH709() {
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        return this.FLD656.readParcelable(classLoader0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH712() {
        int v = this.FLD661;
        if(v >= 0) {
            int v1 = this.FLD658.get(v);
            int v2 = this.FLD656.dataPosition();
            this.FLD656.setDataPosition(v1);
            this.FLD656.writeInt(v2 - v1);
            this.FLD656.setDataPosition(v2);
        }
    }

    public final int MTH2561(int v) {
        int v1;
        while((v1 = this.FLD660) < this.FLD662) {
            this.FLD656.setDataPosition(v1);
            int v2 = this.FLD656.readInt();
            int v3 = this.FLD656.readInt();
            this.FLD660 += v2;
            if(v3 == v) {
                return this.FLD656.dataPosition();
            }
        }
        return -1;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH715(String s) {
        this.FLD656.writeString(s);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH716(int v) {
        this.FLD656.writeInt(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public String MTH717() {
        return this.FLD656.readString();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH722(int v) {
        this.MTH712();
        this.FLD661 = v;
        int v1 = this.FLD656.dataPosition();
        this.FLD658.put(v, v1);
        this.MTH716(0);
        this.MTH716(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public int MTH723() {
        return this.FLD656.readInt();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH725(byte[] arr_b) {
        if(arr_b != null) {
            this.FLD656.writeInt(arr_b.length);
            this.FLD656.writeByteArray(arr_b);
            return;
        }
        this.FLD656.writeInt(-1);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH728(Parcelable parcelable0) {
        this.FLD656.writeParcelable(parcelable0, 0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public boolean MTH732(int v) {
        int v1 = this.MTH2561(v);
        if(v1 == -1) {
            return false;
        }
        this.FLD656.setDataPosition(v1);
        return true;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public byte[] MTH733() {
        int v = this.FLD656.readInt();
        if(v < 0) {
            return null;
        }
        byte[] arr_b = new byte[v];
        this.FLD656.readByteArray(arr_b);
        return arr_b;
    }
}

