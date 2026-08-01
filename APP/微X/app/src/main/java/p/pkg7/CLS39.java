// Decompiled by JEB v5.42.0.202606242140

package p.pkg7;

import javax.annotation.Nullable;

public final class CLS39 {
    public static void MTH870(boolean z) {
        if(!z) {
            throw new CLS37("Must be true");
        }
    }

    public static void MTH871(@Nullable Object object0) {
        if(object0 == null) {
            throw new CLS37("Object must not be null");
        }
    }

    public static void MTH872(@Nullable String s) {
        if(s == null || s.length() == 0) {
            throw new CLS37("String must not be empty");
        }
    }
}

