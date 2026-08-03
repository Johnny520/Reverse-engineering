package Yue;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥۢ۟۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7463 extends AbstractC8391 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f22606 = 3.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f22607 = 80;

    @Override // Yue.AbstractC7988
    /* JADX INFO: renamed from: ۥ۟۟ */
    public long mo10558(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 AbstractC7956 abstractC7956, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        int i;
        int iCenterX;
        int iCenterY;
        C7995 c79953 = c7995;
        if (c79953 == null && c79952 == null) {
            return 0L;
        }
        Rect epicenter = abstractC7956.getEpicenter();
        if (c79952 == null || m27982(c79953) == 0) {
            i = -1;
        } else {
            c79953 = c79952;
            i = 1;
        }
        int iM27983 = m27983(c79953);
        int iM27984 = m27984(c79953);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = iRound + viewGroup.getWidth();
        int height = iRound2 + viewGroup.getHeight();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iCenterY = epicenter.centerY();
        } else {
            iCenterX = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fM23416 = m23416(viewGroup, iM27983, iM27984, iCenterX, iCenterY, iRound, iRound2, width, height) / m23417(viewGroup);
        long duration = abstractC7956.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i)) / this.f22606) * fM23416);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m23416(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f22607;
        if (i9 == 8388611) {
            i9 = view.getLayoutDirection() == 1 ? 5 : 3;
        } else if (i9 == 8388613) {
            if (view.getLayoutDirection() == 1) {
            }
        }
        if (i9 == 3) {
            return Math.abs(i4 - i2) + (i7 - i);
        }
        if (i9 == 5) {
            return Math.abs(i4 - i2) + (i - i5);
        }
        if (i9 == 48) {
            return Math.abs(i3 - i) + (i8 - i2);
        }
        if (i9 != 80) {
            return 0;
        }
        return Math.abs(i3 - i) + (i2 - i6);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m23417(ViewGroup viewGroup) {
        int i = this.f22607;
        return (i == 3 || i == 5 || i == 8388611 || i == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m23418(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f22606 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m23419(int i) {
        this.f22607 = i;
    }
}
