package Yue;

import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3823 extends AbstractC8391 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f7220 = 3.0f;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static float m10557(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    @Override // Yue.AbstractC7988
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long mo10558(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 AbstractC7956 abstractC7956, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        int i;
        int iRound;
        int iCenterX;
        if (c7995 == null && c79952 == null) {
            return 0L;
        }
        if (c79952 == null || m27982(c7995) == 0) {
            i = -1;
        } else {
            c7995 = c79952;
            i = 1;
        }
        int iM27983 = m27983(c7995);
        int iM27984 = m27984(c7995);
        Rect epicenter = abstractC7956.getEpicenter();
        if (epicenter != null) {
            iCenterX = epicenter.centerX();
            iRound = epicenter.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fM10557 = m10557(iM27983, iM27984, iCenterX, iRound) / m10557(0.0f, 0.0f, viewGroup.getWidth(), viewGroup.getHeight());
        long duration = abstractC7956.getDuration();
        if (duration < 0) {
            duration = 300;
        }
        return Math.round(((duration * ((long) i)) / this.f7220) * fM10557);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m10559(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("propagationSpeed may not be 0");
        }
        this.f7220 = f;
    }
}
