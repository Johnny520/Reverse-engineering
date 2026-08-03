package androidx.core.graphics.drawable;

import Yue.AbstractC8178;
import Yue.InterfaceC7144;
import android.content.res.ColorStateList;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC8178 abstractC8178) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3752 = abstractC8178.m27015(iconCompat.f3752, 1);
        iconCompat.f29480 = abstractC8178.m26996(iconCompat.f29480, 2);
        iconCompat.f29481 = abstractC8178.m27025(iconCompat.f29481, 3);
        iconCompat.f29482 = abstractC8178.m27015(iconCompat.f29482, 4);
        iconCompat.f29483 = abstractC8178.m27015(iconCompat.f29483, 5);
        iconCompat.f29484 = (ColorStateList) abstractC8178.m27025(iconCompat.f29484, 6);
        iconCompat.f29486 = abstractC8178.m27032(iconCompat.f29486, 7);
        iconCompat.f29487 = abstractC8178.m27032(iconCompat.f29487, 8);
        iconCompat.mo4754();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC8178 abstractC8178) {
        abstractC8178.mo27038(true, true);
        iconCompat.mo4755(abstractC8178.mo26985());
        int i = iconCompat.f3752;
        if (-1 != i) {
            abstractC8178.m27067(i, 1);
        }
        byte[] bArr = iconCompat.f29480;
        if (bArr != null) {
            abstractC8178.m27049(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f29481;
        if (parcelable != null) {
            abstractC8178.m27078(parcelable, 3);
        }
        int i2 = iconCompat.f29482;
        if (i2 != 0) {
            abstractC8178.m27067(i2, 4);
        }
        int i3 = iconCompat.f29483;
        if (i3 != 0) {
            abstractC8178.m27067(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f29484;
        if (colorStateList != null) {
            abstractC8178.m27078(colorStateList, 6);
        }
        String str = iconCompat.f29486;
        if (str != null) {
            abstractC8178.m27086(str, 7);
        }
        String str2 = iconCompat.f29487;
        if (str2 != null) {
            abstractC8178.m27086(str2, 8);
        }
    }
}
