package p015b0;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import p042d2.AbstractC1859d;

/* JADX INFO: renamed from: b0.s1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0851s1 {

    /* JADX INFO: renamed from: a */
    public Integer f2698a;

    /* JADX INFO: renamed from: a */
    public final Integer m3199a(KeyEvent keyEvent) {
        int iM6607c = AbstractC1859d.m6607c(keyEvent);
        if ((Integer.MIN_VALUE & iM6607c) != 0) {
            this.f2698a = Integer.valueOf(iM6607c & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.f2698a;
        if (num == null) {
            return Integer.valueOf(iM6607c);
        }
        this.f2698a = null;
        Integer numValueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num.intValue(), iM6607c));
        Integer num2 = numValueOf.intValue() != 0 ? numValueOf : null;
        if (num2 != null) {
            iM6607c = num2.intValue();
        }
        return Integer.valueOf(iM6607c);
    }
}
