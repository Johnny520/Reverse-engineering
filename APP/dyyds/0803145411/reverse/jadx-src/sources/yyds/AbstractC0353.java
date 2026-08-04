package yyds;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛲᛵᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0353 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f1828;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f1829;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f1830;

    public AbstractC0353(AbstractC2551 abstractC2551) {
        this.f1828 = Integer.MIN_VALUE;
        this.f1830 = new Rect();
        this.f1829 = abstractC2551;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static AbstractC0353 m1035(AbstractC2551 abstractC2551, int i) {
        if (i == 0) {
            return new C0407(abstractC2551, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new C0407(abstractC2551, i2);
        }
        C0188.m798("invalid orientation");
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public abstract int mo1036();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public abstract int mo1037();

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public abstract int mo1038();

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public abstract int mo1039();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public abstract int mo1040(View view);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public abstract void mo1041(InterfaceC0124 interfaceC0124);

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public abstract void mo1042();

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public abstract int mo1043(View view);

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public abstract void mo1044();

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public abstract void mo1045(int i);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public abstract int mo1046(View view);

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public abstract C1572 mo1047(InterfaceC0124 interfaceC0124);

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public abstract void mo1048(InterfaceC0124 interfaceC0124);

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public abstract int mo1049();

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public abstract int mo1050();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public abstract int mo1051();

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public abstract void mo1052(InterfaceC0124 interfaceC0124);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public abstract void mo1053(InterfaceC0124 interfaceC0124);

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public abstract int mo1054(View view);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public abstract int mo1055(View view);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public abstract int mo1056(View view);

    public AbstractC0353(String str, int i, String str2) {
        this.f1828 = i;
        this.f1829 = str;
        this.f1830 = str2;
    }

    public AbstractC0353(InterfaceC0240 interfaceC0240) {
        this.f1828 = 0;
        this.f1830 = new C2415();
        this.f1829 = interfaceC0240;
    }
}
