package p257;

import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.RunnableC3741;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8210 extends C8197 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static void m13718(String str, WaitDialog$TYPE waitDialog$TYPE) {
        C8197 c8197M13692 = C8197.m13692();
        if (c8197M13692 == null) {
            new C8197();
            return;
        }
        c8197M13692.f22575 = str;
        if (c8197M13692.f22581 != waitDialog$TYPE) {
            c8197M13692.f22579 = waitDialog$TYPE.ordinal();
            c8197M13692.f22581 = waitDialog$TYPE;
            if (c8197M13692.m13696() != null) {
                C8199 c8199M13696 = c8197M13692.m13696();
                c8199M13696.getClass();
                AbstractC3737.m8043(new RunnableC3741(c8199M13696, 17, waitDialog$TYPE));
            }
        }
        c8197M13692.m13694();
        if (c8197M13692.m13696() == null) {
            c8197M13692.m13695();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m13719(String str, WaitDialog$TYPE waitDialog$TYPE, long j) {
        C8197 c8197M13692 = C8197.m13692();
        if (c8197M13692 == null) {
            new C8197();
            return;
        }
        c8197M13692.f22575 = str;
        if (c8197M13692.f22581 != waitDialog$TYPE) {
            c8197M13692.f22579 = waitDialog$TYPE.ordinal();
            c8197M13692.f22581 = waitDialog$TYPE;
            if (c8197M13692.m13696() != null) {
                C8199 c8199M13696 = c8197M13692.m13696();
                c8199M13696.getClass();
                AbstractC3737.m8043(new RunnableC3741(c8199M13696, 17, waitDialog$TYPE));
            }
        }
        c8197M13692.m13694();
        c8197M13692.f22571 = j;
        if (c8197M13692.m13696() == null) {
            c8197M13692.m13695();
        }
    }
}
