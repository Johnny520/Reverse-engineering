package p003B0;

import java.util.HashMap;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: B0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0056b {

    /* JADX INFO: renamed from: a */
    public static final HashMap f300a = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m103a(String str) {
        String packageName = AbstractC0503h.m991x().getPackageName();
        AbstractC0223g.m418e(str, "idName");
        AbstractC0223g.m418e(packageName, "packageName");
        String strConcat = "@id/".concat(str);
        HashMap map = f300a;
        Integer numValueOf = (Integer) map.get(strConcat);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(AbstractC0503h.m991x().getResources().getIdentifier(str, "id", packageName));
            map.put(strConcat, numValueOf);
        }
        return numValueOf.intValue();
    }
}
