package android.support.v4.graphics.drawable;

import Yue.AbstractC8178;
import Yue.InterfaceC7144;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    public static IconCompat read(AbstractC8178 abstractC8178) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read(abstractC8178);
    }

    public static void write(IconCompat iconCompat, AbstractC8178 abstractC8178) {
        androidx.core.graphics.drawable.IconCompatParcelizer.write(iconCompat, abstractC8178);
    }
}
