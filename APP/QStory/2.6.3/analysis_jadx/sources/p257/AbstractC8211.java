package p257;

import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.RunnableC3742;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8211 extends C8198 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static void m13735(String str, WaitDialog$TYPE waitDialog$TYPE) {
        C8198 c8198M13709 = C8198.m13709();
        if (c8198M13709 == null) {
            new C8198();
            return;
        }
        c8198M13709.f22574 = str;
        if (c8198M13709.f22580 != waitDialog$TYPE) {
            c8198M13709.f22578 = waitDialog$TYPE.ordinal();
            c8198M13709.f22580 = waitDialog$TYPE;
            if (c8198M13709.m13713() != null) {
                C8200 c8200M13713 = c8198M13709.m13713();
                c8200M13713.getClass();
                AbstractC3738.m8030(new RunnableC3742(c8200M13713, 17, waitDialog$TYPE));
            }
        }
        c8198M13709.m13711();
        if (c8198M13709.m13713() == null) {
            c8198M13709.m13712();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m13736(String str, WaitDialog$TYPE waitDialog$TYPE, long j) {
        C8198 c8198M13709 = C8198.m13709();
        if (c8198M13709 == null) {
            new C8198();
            return;
        }
        c8198M13709.f22574 = str;
        if (c8198M13709.f22580 != waitDialog$TYPE) {
            c8198M13709.f22578 = waitDialog$TYPE.ordinal();
            c8198M13709.f22580 = waitDialog$TYPE;
            if (c8198M13709.m13713() != null) {
                C8200 c8200M13713 = c8198M13709.m13713();
                c8200M13713.getClass();
                AbstractC3738.m8030(new RunnableC3742(c8200M13713, 17, waitDialog$TYPE));
            }
        }
        c8198M13709.m13711();
        c8198M13709.f22570 = j;
        if (c8198M13709.m13713() == null) {
            c8198M13709.m13712();
        }
    }
}
