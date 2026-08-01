package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.profileinstaller.C2444;
import androidx.profileinstaller.InterfaceC2440;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import kotlin.jvm.internal.Ref$IntRef;
import p124.C7412;
import p171.C7724;
import p171.InterfaceC7727;
import p257.AbstractC8210;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
                Object obj3 = ((C7412) obj).f20104;
                String str = (String) c0050.f20990.get(Integer.valueOf(i2));
                if (str != null) {
                    C7724 c7724 = (C7724) c0050.f20986.get(str);
                    if ((c7724 != null ? c7724.f20980 : null) != null) {
                        InterfaceC7727 interfaceC7727 = c7724.f20980;
                        if (c0050.f20987.remove(str)) {
                            interfaceC7727.mo4414(obj3);
                        }
                    } else {
                        c0050.f20991.remove(str);
                        c0050.f20985.put(str, obj3);
                    }
                    break;
                }
                break;
            case 1:
                ((C0050) obj2).m13017(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 2:
                ((InterfaceC2440) ((C2444) obj2).f7123).mo4155(i2, obj);
                break;
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj2;
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC3056.m6668(-3937829160421164455L));
                sb.append(AbstractC3056.m6668(-3937829117471491495L) + i2 + AbstractC3056.m6668(-3937829035867112871L));
                sb.append(AbstractC3056.m6668(-3937829027277178279L) + ((Ref$IntRef) obj).element + AbstractC3056.m6668(-3937829078816785831L));
                if (ref$IntRef.element > 0) {
                    sb.append(AbstractC3056.m6668(-3937829057341949351L) + ref$IntRef.element + AbstractC3056.m6668(-3937829078816785831L));
                }
                String string = sb.toString();
                if (ref$IntRef.element <= 0) {
                    AbstractC8210.m13719(string, WaitDialog$TYPE.SUCCESS, 2500L);
                } else {
                    AbstractC8210.m13719(string, WaitDialog$TYPE.WARNING, 3500L);
                }
                break;
        }
    }
}
