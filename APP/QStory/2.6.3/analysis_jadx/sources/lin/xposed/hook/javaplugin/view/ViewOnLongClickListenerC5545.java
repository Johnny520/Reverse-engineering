package lin.xposed.hook.javaplugin.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.C3062;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.lxj.xpopup.util.AbstractC3788;
import java.io.File;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import p010.AbstractC6185;
import p034.AbstractC6347;
import p034.C6348;
import p034.C6350;
import p034.C6352;
import p034.DialogInterfaceOnClickListenerC6339;
import p034.DialogInterfaceOnClickListenerC6341;
import p036.AbstractC6358;
import p052.InterfaceC6558;
import p217.AbstractC7969;
import p217.InterfaceC7963;
import p287.AbstractC8405;
import p343.C8819;
import p386.C9077;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC5545 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15303;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15304;

    public /* synthetic */ ViewOnLongClickListenerC5545(Object obj, int i, Object obj2) {
        this.f15304 = i;
        this.f15302 = obj;
        this.f15303 = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f15304;
        int i2 = 2;
        Object obj = this.f15303;
        Object obj2 = this.f15302;
        switch (i) {
            case 0:
                return ((PluginItemView) obj2).lambda$bindPluginInfoData$6((PluginInfo) obj, view);
            case 1:
                C6350 c6350 = (C6350) obj2;
                String str = (String) obj;
                EditText editText = new EditText(c6350.getContext());
                editText.setText(str);
                new AlertDialog.Builder(c6350.getContext(), 3).setTitle(AbstractC8405.m13972(366)).setView(editText).setNeutralButton(AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵喵喵喵呜~呜呜喵喵喵喵呜呜~呜喵喵喵呜呜喵呜~呜呜呜呜喵呜喵呜~呜呜呜喵喵喵喵呜"), new DialogInterfaceOnClickListenerC6339(c6350, str, editText, i2)).show();
                return true;
            case 2:
                C6352 c6352 = (C6352) obj2;
                C6348 c6348 = (C6348) obj;
                C6350 c63502 = c6352.f17499;
                LinearLayout linearLayout = new LinearLayout(c63502.getContext());
                linearLayout.setGravity(17);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC3788.m8109(c63502.getContext()) / 2, AbstractC3788.m8109(c63502.getContext()) / 2);
                ImageView imageView = new ImageView(c63502.getContext());
                linearLayout.addView(imageView, layoutParams);
                ((C3062) ComponentCallbacks2C3058.m6765(AbstractC6358.f17507).m6799(new File(c6348.f17486)).m6614()).m6789(imageView);
                c63502.f17494.add(imageView);
                new AlertDialog.Builder(c63502.getContext(), AbstractC6347.m11899(c63502.getContext()) ? 2 : 3).setTitle(AbstractC8405.m13972(365)).setView(linearLayout).setNeutralButton(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"), new DialogInterfaceOnClickListenerC6341(c6352, c6348)).show();
                return true;
            case 3:
                AbstractC4922.m9890((Activity) obj2, (String) obj);
                AbstractC6185.m11592(AbstractC8405.m13972(156));
                return true;
            case 4:
                AbstractC7969 abstractC7969 = (AbstractC7969) obj;
                int bindingAdapterPosition = ((AbstractC2484) obj2).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    view.getClass();
                    InterfaceC7963 interfaceC7963 = abstractC7969.f22040;
                    if (interfaceC7963 != null) {
                        return interfaceC7963.mo12777(abstractC7969, view, bindingAdapterPosition);
                    }
                }
                return false;
            case 5:
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) obj;
                InterfaceC6558 interfaceC6558 = ((C8819) obj2).f24822;
                if (interfaceC6558 != null) {
                    interfaceC6558.invoke(onlineStickerInfo);
                }
                return true;
            default:
                ((C9077) ((C8819) obj2).f24822).invoke((Message) obj);
                return Boolean.TRUE.booleanValue();
        }
    }
}
