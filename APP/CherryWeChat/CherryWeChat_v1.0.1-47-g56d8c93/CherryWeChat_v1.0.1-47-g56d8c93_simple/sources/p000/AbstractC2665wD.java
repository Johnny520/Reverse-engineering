package p000;

import android.os.Build;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: wD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2665wD {

    /* JADX INFO: renamed from: a */
    public static final int f9229a = 0;

    static {
        f9229a = Build.VERSION.SDK_INT;
        String r0 = Build.DEVICE;
        String r02 = Build.MANUFACTURER;
        String r03 = Build.MODEL;
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    }
}
