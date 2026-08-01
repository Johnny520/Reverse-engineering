package p015b0;

import androidx.emoji2.text.C0644c;
import java.text.BreakIterator;

/* JADX INFO: renamed from: b0.b3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0734b3 {
    /* JADX INFO: renamed from: a */
    public static final int m2843a(CharSequence charSequence, int i10, int i11) {
        return i10 <= 0 ? i11 : Character.offsetByCodePoints(charSequence, i10, -1);
    }

    /* JADX INFO: renamed from: b */
    public static final int m2844b(String str, int i10, int i11) {
        if (i10 <= 0) {
            return i11;
        }
        C0644c c0644cM2847e = m2847e();
        if (c0644cM2847e == null) {
            return m2843a(str, i10, i11);
        }
        int iM2521f = c0644cM2847e.m2521f(str, i10 - 1);
        return iM2521f < 0 ? m2843a(str, i10, i11) : iM2521f;
    }

    /* JADX INFO: renamed from: c */
    public static final int m2845c(String str, int i10) {
        C0644c c0644cM2847e = m2847e();
        Integer num = null;
        if (c0644cM2847e != null) {
            Integer numValueOf = Integer.valueOf(c0644cM2847e.m2519d(str, i10));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    /* JADX INFO: renamed from: d */
    public static final int m2846d(String str, int i10) {
        C0644c c0644cM2847e = m2847e();
        Integer num = null;
        if (c0644cM2847e != null) {
            Integer numValueOf = Integer.valueOf(c0644cM2847e.m2521f(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    /* JADX INFO: renamed from: e */
    public static final C0644c m2847e() {
        if (C0644c.m2518i()) {
            C0644c c0644cM2516c = C0644c.m2516c();
            if (c0644cM2516c.m2522g() == 1) {
                return c0644cM2516c;
            }
        }
        return null;
    }
}
