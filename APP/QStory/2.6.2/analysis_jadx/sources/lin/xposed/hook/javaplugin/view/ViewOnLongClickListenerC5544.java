package lin.xposed.hook.javaplugin.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.lxj.xpopup.util.AbstractC3787;
import java.io.File;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import p010.AbstractC6154;
import p033.AbstractC6333;
import p033.C6327;
import p033.C6329;
import p033.C6331;
import p033.DialogInterfaceOnClickListenerC6320;
import p033.DialogInterfaceOnClickListenerC6322;
import p035.AbstractC6340;
import p052.InterfaceC6557;
import p217.AbstractC7968;
import p217.InterfaceC7962;
import p316.C8675;
import p341.C8816;
import p385.C9090;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC5544 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15303;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15304;

    public /* synthetic */ ViewOnLongClickListenerC5544(Object obj, int i, Object obj2) {
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
                C6327 c6327 = (C6327) obj2;
                String str = (String) obj;
                EditText editText = new EditText(c6327.getContext());
                editText.setText(str);
                new AlertDialog.Builder(c6327.getContext(), 3).setTitle(AbstractC3056.m6668(-3937589862023300519L)).setView(editText).setNeutralButton(AbstractC3056.m6668(-3937589849138398631L), new DialogInterfaceOnClickListenerC6320(c6327, str, editText, i2)).show();
                return true;
            case 2:
                C6331 c6331 = (C6331) obj2;
                C6329 c6329 = (C6329) obj;
                C6327 c63272 = c6331.f17446;
                LinearLayout linearLayout = new LinearLayout(c63272.getContext());
                linearLayout.setGravity(17);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC3787.m8122(c63272.getContext()) / 2, AbstractC3787.m8122(c63272.getContext()) / 2);
                ImageView imageView = new ImageView(c63272.getContext());
                linearLayout.addView(imageView, layoutParams);
                ((C3061) ComponentCallbacks2C3057.m6720(AbstractC6340.f17460).m6754(new File(c6329.f17444)).m6554()).m6744(imageView);
                c63272.f17438.add(imageView);
                new AlertDialog.Builder(c63272.getContext(), AbstractC6333.m11886(c63272.getContext()) ? 2 : 3).setTitle(AbstractC3056.m6668(-3937589827663562151L)).setView(linearLayout).setNeutralButton(AbstractC3056.m6668(-3937567120171468199L), new DialogInterfaceOnClickListenerC6322(c6331, c6329)).show();
                return true;
            case 3:
                C8675.m14361((Activity) obj2, (String) obj);
                AbstractC6154.m11561(AbstractC3056.m6668(-3937578312856241575L));
                return true;
            case 4:
                AbstractC7968 abstractC7968 = (AbstractC7968) obj;
                int bindingAdapterPosition = ((AbstractC2484) obj2).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    view.getClass();
                    InterfaceC7962 interfaceC7962 = abstractC7968.f22043;
                    if (interfaceC7962 != null) {
                        return interfaceC7962.mo12748(abstractC7968, view, bindingAdapterPosition);
                    }
                }
                return false;
            case 5:
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) obj;
                InterfaceC6557 interfaceC6557 = ((C8816) obj2).f24800;
                if (interfaceC6557 != null) {
                    interfaceC6557.invoke(onlineStickerInfo);
                }
                return true;
            default:
                ((C9090) ((C8816) obj2).f24800).invoke((Message) obj);
                return Boolean.TRUE.booleanValue();
        }
    }
}
