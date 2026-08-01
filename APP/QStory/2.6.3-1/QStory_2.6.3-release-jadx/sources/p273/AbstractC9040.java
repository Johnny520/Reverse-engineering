package p273;

import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.RunnableC4574;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9040 extends C9027 {
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static void m14294(String str, WaitDialog$TYPE waitDialog$TYPE) {
        C9027 c9027M14268 = C9027.m14268();
        if (c9027M14268 == null) {
            new C9027();
            return;
        }
        c9027M14268.f22919 = str;
        if (c9027M14268.f22925 != waitDialog$TYPE) {
            c9027M14268.f22923 = waitDialog$TYPE.ordinal();
            c9027M14268.f22925 = waitDialog$TYPE;
            if (c9027M14268.m14272() != null) {
                C9029 c9029M14272 = c9027M14268.m14272();
                c9029M14272.getClass();
                AbstractC4570.m8589(new RunnableC4574(c9029M14272, 17, waitDialog$TYPE));
            }
        }
        c9027M14268.m14270();
        if (c9027M14268.m14272() == null) {
            c9027M14268.m14271();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static void m14295(String str, WaitDialog$TYPE waitDialog$TYPE, long j) {
        C9027 c9027M14268 = C9027.m14268();
        if (c9027M14268 == null) {
            new C9027();
            return;
        }
        c9027M14268.f22919 = str;
        if (c9027M14268.f22925 != waitDialog$TYPE) {
            c9027M14268.f22923 = waitDialog$TYPE.ordinal();
            c9027M14268.f22925 = waitDialog$TYPE;
            if (c9027M14268.m14272() != null) {
                C9029 c9029M14272 = c9027M14268.m14272();
                c9029M14272.getClass();
                AbstractC4570.m8589(new RunnableC4574(c9029M14272, 17, waitDialog$TYPE));
            }
        }
        c9027M14268.m14270();
        c9027M14268.f22915 = j;
        if (c9027M14268.m14272() == null) {
            c9027M14268.m14271();
        }
    }
}
