// Decompiled by JEB v5.42.0.202606242140

package c.ᵢʼ;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;

public class CLS805 extends VersionedParcel {
    public final int FLD1513;
    public final String FLD1514;
    public final int FLD1515;
    public int FLD1516;
    public final SparseIntArray FLD1517;
    public int FLD1518;
    public final Parcel FLD1519;

    public CLS805(Parcel parcel0) {
        this(parcel0, parcel0.dataPosition(), parcel0.dataSize(), "");
    }

    public CLS805(Parcel parcel0, int v, int v1, String s) {
        this.FLD1517 = new SparseIntArray();
        this.FLD1516 = -1;
        this.FLD1519 = parcel0;
        this.FLD1513 = v;
        this.FLD1515 = v1;
        this.FLD1518 = v;
        this.FLD1514 = s;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH709(Parcelable parcelable0) {
        this.FLD1519.writeParcelable(parcelable0, 0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public Parcelable MTH713() {
        ClassLoader classLoader0 = this.getClass().getClassLoader();
        return this.FLD1519.readParcelable(classLoader0);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH717(String s) {
        this.FLD1519.writeString(s);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public byte[] MTH719() {
        int v = this.FLD1519.readInt();
        if(v < 0) {
            return null;
        }
        byte[] arr_b = new byte[v];
        this.FLD1519.readByteArray(arr_b);
        return arr_b;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public String MTH721() {
        return this.FLD1519.readString();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH722(int v) {
        this.FLD1519.writeInt(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH723(byte[] arr_b) {
        if(arr_b != null) {
            this.FLD1519.writeInt(arr_b.length);
            this.FLD1519.writeByteArray(arr_b);
            return;
        }
        this.FLD1519.writeInt(-1);
    }

    public final int MTH4678(int v) {
        int v1;
        while((v1 = this.FLD1518) < this.FLD1515) {
            this.FLD1519.setDataPosition(v1);
            int v2 = this.FLD1519.readInt();
            int v3 = this.FLD1519.readInt();
            this.FLD1518 += v2;
            if(v3 == v) {
                return this.FLD1519.dataPosition();
            }
        }
        return -1;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH725(int v) {
        this.MTH732();
        this.FLD1516 = v;
        int v1 = this.FLD1519.dataPosition();
        this.FLD1517.put(v, v1);
        this.MTH722(0);
        this.MTH722(v);
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public boolean MTH730(int v) {
        int v1 = this.MTH4678(v);
        if(v1 == -1) {
            return false;
        }
        this.FLD1519.setDataPosition(v1);
        return true;
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public int MTH731() {
        return this.FLD1519.readInt();
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public void MTH732() {
        int v = this.FLD1516;
        if(v >= 0) {
            int v1 = this.FLD1517.get(v);
            int v2 = this.FLD1519.dataPosition();
            this.FLD1519.setDataPosition(v1);
            this.FLD1519.writeInt(v2 - v1);
            this.FLD1519.setDataPosition(v2);
        }
    }

    @Override  // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel MTH736() {
        int v = this.FLD1519.dataPosition();
        return new CLS805(this.FLD1519, v, (this.FLD1518 == this.FLD1513 ? this.FLD1515 : this.FLD1518), this.FLD1514 + "  ");
    }
}

