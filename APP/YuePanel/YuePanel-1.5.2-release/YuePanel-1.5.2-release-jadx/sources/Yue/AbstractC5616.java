package Yue;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C1643;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5616 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int f13583 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f13584 = "alpha";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f13585 = "elevation";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f13586 = "rotation";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f13587 = "rotationX";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f13588 = "rotationY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f13589 = "transformPivotX";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final String f13590 = "transformPivotY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final String f13591 = "transitionPathRotate";

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f13592 = "scaleX";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f13593 = "scaleY";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final String f13594 = "wavePeriod";

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final String f13595 = "waveOffset";

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final String f13596 = "waveVariesBy";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f13597 = "translationX";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f13598 = "translationY";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final String f13599 = "translationZ";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String f13600 = "progress";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final String f13601 = "CUSTOM";

    /* JADX INFO: renamed from: ۥ */
    public int f1571;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1572;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String f13602;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f13603;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public HashMap<String, C1643> f13604;

    public AbstractC5616() {
        int i = f13583;
        this.f1571 = i;
        this.f1572 = i;
        this.f13602 = null;
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void mo2325(HashMap<String, AbstractC7544> map);

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void mo2326(HashSet<String> hashSet);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract void mo17406(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m17407(String str) {
        String str2 = this.f13602;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo17408(HashMap<String, Integer> map) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract void mo17409(String str, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m17410(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float m17411(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m17412(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
