package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.profileinstaller.C2444;
import androidx.profileinstaller.InterfaceC2440;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import kotlin.jvm.internal.Ref$IntRef;
import p124.C7413;
import p171.C7725;
import p171.InterfaceC7728;
import p257.AbstractC8211;
import p287.AbstractC8405;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0052 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f107;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f108;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f109;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f110;

    public /* synthetic */ RunnableC0052(int i, int i2, Object obj, Object obj2) {
        this.f110 = i2;
        this.f108 = obj;
        this.f109 = i;
        this.f107 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f110;
        Object obj = this.f107;
        int i2 = this.f109;
        Object obj2 = this.f108;
        switch (i) {
            case 0:
                C0050 c0050 = (C0050) obj2;
                Object obj3 = ((C7413) obj).f20099;
                String str = (String) c0050.f20985.get(Integer.valueOf(i2));
                if (str != null) {
                    C7725 c7725 = (C7725) c0050.f20981.get(str);
                    if ((c7725 != null ? c7725.f20975 : null) != null) {
                        InterfaceC7728 interfaceC7728 = c7725.f20975;
                        if (c0050.f20982.remove(str)) {
                            interfaceC7728.mo4424(obj3);
                        }
                    } else {
                        c0050.f20986.remove(str);
                        c0050.f20980.put(str, obj3);
                    }
                    break;
                }
                break;
            case 1:
                ((C0050) obj2).m13047(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 2:
                ((InterfaceC2440) ((C2444) obj2).f7124).mo4169(i2, obj);
                break;
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC8405.m13972(2771));
                sb.append(AbstractC8405.m13972(2772) + i2 + AbstractC8405.m13972(2773));
                sb.append(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜呜喵呜~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜喵呜~呜呜呜喵呜呜呜呜~呜呜呜呜喵喵呜呜~喵呜喵喵喵喵喵呜") + ((Ref$IntRef) obj).element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                if (ref$IntRef.element > 0) {
                    sb.append(AbstractC8405.m13972(2774) + ref$IntRef.element + AbstractC8405.m13973("喵呜喵呜喵喵呜呜~呜喵喵呜喵喵喵呜~呜呜喵喵喵喵呜喵~呜呜喵喵喵喵呜喵"));
                }
                String string = sb.toString();
                if (ref$IntRef.element <= 0) {
                    AbstractC8211.m13736(string, WaitDialog$TYPE.SUCCESS, 2500L);
                } else {
                    AbstractC8211.m13736(string, WaitDialog$TYPE.WARNING, 3500L);
                }
                break;
        }
    }
}
