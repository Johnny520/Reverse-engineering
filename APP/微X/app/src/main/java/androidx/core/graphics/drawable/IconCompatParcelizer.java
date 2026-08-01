// Decompiled by JEB v5.42.0.202606242140

package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel0) {
        IconCompat iconCompat0 = new IconCompat();
        iconCompat0.FLD69 = versionedParcel0.MTH718(iconCompat0.FLD69, 1);
        iconCompat0.FLD62 = versionedParcel0.MTH735(iconCompat0.FLD62, 2);
        iconCompat0.FLD65 = versionedParcel0.MTH715(iconCompat0.FLD65, 3);
        iconCompat0.FLD64 = versionedParcel0.MTH718(iconCompat0.FLD64, 4);
        iconCompat0.FLD66 = versionedParcel0.MTH718(iconCompat0.FLD66, 5);
        iconCompat0.FLD70 = (ColorStateList)versionedParcel0.MTH715(iconCompat0.FLD70, 6);
        iconCompat0.FLD63 = versionedParcel0.MTH729(iconCompat0.FLD63, 7);
        iconCompat0.MTH672();
        return iconCompat0;
    }

    public static void write(IconCompat iconCompat0, VersionedParcel versionedParcel0) {
        iconCompat0.MTH674(false);
        versionedParcel0.MTH727(iconCompat0.FLD69, 1);
        versionedParcel0.MTH724(iconCompat0.FLD62, 2);
        versionedParcel0.MTH708(iconCompat0.FLD65, 3);
        versionedParcel0.MTH727(iconCompat0.FLD64, 4);
        versionedParcel0.MTH727(iconCompat0.FLD66, 5);
        versionedParcel0.MTH708(iconCompat0.FLD70, 6);
        versionedParcel0.MTH734(iconCompat0.FLD63, 7);
    }
}

