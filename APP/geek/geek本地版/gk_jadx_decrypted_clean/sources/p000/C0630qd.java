package p000;

import android.app.C0987;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.C0990;
import androidx.activity.C0997;
import androidx.appcompat.widget.C1000;
import androidx.coordinatorlayout.widget.C1007;
import androidx.recyclerview.widget.C1019;
import com.google.android.material.appbar.C1035;
import com.google.android.material.carousel.C1040;
import com.google.android.material.datepicker.C1045;
import com.google.android.material.floatingactionbutton.C1046;
import com.google.android.material.internal.C1047;

/* JADX INFO: renamed from: qd */
/* JADX INFO: loaded from: classes.dex */
public final class C0630qd extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f4077a;

    /* JADX INFO: renamed from: b */
    public final Paint f4078b;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0630qd() {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0630qd.<init>():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0026. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x037c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0443 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0630qd.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return C1046.f5690 ^ (-957);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        String str;
        int iM3084 = C1045.m3084("ۤۥ۟");
        while (true) {
            switch (iM3084) {
                case 1750689:
                    if (C0990.m2864() >= 0) {
                        C1007.f5651 = 92;
                        str = "ۢ۟ۦ";
                    } else {
                        str = "ۤۥ۟";
                    }
                    iM3084 = C0987.m2851(str);
                    break;
                case 1751678:
                    return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int iM3091 = C1047.m3091("ۥۧ");
        while (true) {
            switch (iM3091) {
                case 56482:
                    return;
                case 1753576:
                    if (C1000.m2904() > 0) {
                        iM3091 = (C0997.f5641 % C1040.f5684) ^ (-56394);
                    } else {
                        C1035.f5679 = 9;
                        iM3091 = C1019.m2978("ۣۢۤ");
                    }
                    break;
            }
        }
    }
}
