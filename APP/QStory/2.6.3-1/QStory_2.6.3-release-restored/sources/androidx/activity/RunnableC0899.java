package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.profileinstaller.C3277;
import androidx.profileinstaller.InterfaceC3273;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import kotlin.jvm.internal.Ref$IntRef;
import p140.C8242;
import p187.C8554;
import p187.InterfaceC8557;
import p273.AbstractC9040;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0899 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f452;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f453;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f454;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f455;

    public /* synthetic */ RunnableC0899(int i, int i2, Object obj, Object obj2) {
        this.f455 = i2;
        this.f453 = obj;
        this.f454 = i;
        this.f452 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f455;
        Object obj = this.f452;
        int i2 = this.f454;
        Object obj2 = this.f453;
        switch (i) {
            case 0:
                C0897 c0897 = (C0897) obj2;
                Object obj3 = ((C8242) obj).f20444;
                String str = (String) c0897.f21330.get(Integer.valueOf(i2));
                if (str != null) {
                    C8554 c8554 = (C8554) c0897.f21326.get(str);
                    if ((c8554 != null ? c8554.f21320 : null) != null) {
                        InterfaceC8557 interfaceC8557 = c8554.f21320;
                        if (c0897.f21327.remove(str)) {
                            interfaceC8557.mo4984(obj3);
                        }
                    } else {
                        c0897.f21331.remove(str);
                        c0897.f21325.put(str, obj3);
                    }
                    break;
                }
                break;
            case 1:
                ((C0897) obj2).m13606(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 2:
                ((InterfaceC3273) ((C3277) obj2).f7469).mo4729(i2, obj);
                break;
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                StringBuilder sb = new StringBuilder();
                sb.append("整理完成！(没有自动关闭的话就重启QQ)\n");
                sb.append("共处理 " + i2 + " 个文件\n");
                sb.append("成功 " + ((Ref$IntRef) obj).element + " 个");
                if (ref$IntRef.element > 0) {
                    sb.append("，失败 " + ref$IntRef.element + " 个");
                }
                String string = sb.toString();
                if (ref$IntRef.element <= 0) {
                    AbstractC9040.m14295(string, WaitDialog$TYPE.SUCCESS, 2500L);
                } else {
                    AbstractC9040.m14295(string, WaitDialog$TYPE.WARNING, 3500L);
                }
                break;
        }
    }
}
