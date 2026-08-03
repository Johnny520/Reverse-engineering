package Yue;

import Yue.C8336;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6593 extends C8336.AbstractC8344 {

    /* JADX INFO: renamed from: ۥ */
    public final LinearLayoutManager f2156;

    /* JADX INFO: renamed from: ۥ۟ */
    public C8336.InterfaceC8348 f2157;

    public C6593(LinearLayoutManager linearLayoutManager) {
        this.f2156 = linearLayoutManager;
    }

    @Override // Yue.C8336.AbstractC8344
    public void onPageScrollStateChanged(int i) {
    }

    @Override // Yue.C8336.AbstractC8344
    public void onPageScrolled(int i, float f, int i2) {
        if (this.f2157 == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f2156.getChildCount(); i3++) {
            View childAt = this.f2156.getChildAt(i3);
            if (childAt == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f2156.getChildCount())));
            }
            this.f2157.mo1019(childAt, (this.f2156.getPosition(childAt) - i) + f2);
        }
    }

    @Override // Yue.C8336.AbstractC8344
    public void onPageSelected(int i) {
    }

    /* JADX INFO: renamed from: ۥ */
    public C8336.InterfaceC8348 m3052() {
        return this.f2157;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3053(@InterfaceC6490 C8336.InterfaceC8348 interfaceC8348) {
        this.f2157 = interfaceC8348;
    }
}
