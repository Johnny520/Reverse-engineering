package lin.xposed.hook.javaplugin.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AbstractC3317;
import com.bumptech.glide.C3894;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.lxj.xpopup.util.AbstractC4620;
import java.io.File;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import p026.AbstractC7014;
import p050.AbstractC7176;
import p050.C7177;
import p050.C7179;
import p050.C7181;
import p050.DialogInterfaceOnClickListenerC7168;
import p050.DialogInterfaceOnClickListenerC7170;
import p052.AbstractC7187;
import p068.InterfaceC7387;
import p233.AbstractC8798;
import p233.InterfaceC8792;
import p359.C9648;
import p402.C9906;
import top.suzhelan.plugin.sdk.online.entity.Message;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnLongClickListenerC6376 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f15647;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f15648;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15649;

    public /* synthetic */ ViewOnLongClickListenerC6376(Object obj, int i, Object obj2) {
        this.f15649 = i;
        this.f15647 = obj;
        this.f15648 = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f15649;
        int i2 = 2;
        Object obj = this.f15648;
        Object obj2 = this.f15647;
        switch (i) {
            case 0:
                return ((PluginItemView) obj2).lambda$bindPluginInfoData$6((PluginInfo) obj, view);
            case 1:
                C7179 c7179 = (C7179) obj2;
                String str = (String) obj;
                EditText editText = new EditText(c7179.getContext());
                editText.setText(str);
                new AlertDialog.Builder(c7179.getContext(), 3).setTitle("输入名字").setView(editText).setNeutralButton("改名", new DialogInterfaceOnClickListenerC7168(c7179, str, editText, i2)).show();
                return true;
            case 2:
                C7181 c7181 = (C7181) obj2;
                C7177 c7177 = (C7177) obj;
                C7179 c71792 = c7181.f17844;
                LinearLayout linearLayout = new LinearLayout(c71792.getContext());
                linearLayout.setGravity(17);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC4620.m8668(c71792.getContext()) / 2, AbstractC4620.m8668(c71792.getContext()) / 2);
                ImageView imageView = new ImageView(c71792.getContext());
                linearLayout.addView(imageView, layoutParams);
                ((C3894) ComponentCallbacks2C3890.m7325(AbstractC7187.f17852).m7359(new File(c7177.f17831)).m7174()).m7349(imageView);
                c71792.f17839.add(imageView);
                new AlertDialog.Builder(c71792.getContext(), AbstractC7176.m12458(c71792.getContext()) ? 2 : 3).setTitle("是否删除此图片").setView(linearLayout).setNeutralButton("删除", new DialogInterfaceOnClickListenerC7170(c7181, c7177)).show();
                return true;
            case 3:
                AbstractC5754.m10449((Activity) obj2, (String) obj);
                AbstractC7014.m12151("已复制");
                return true;
            case 4:
                AbstractC8798 abstractC8798 = (AbstractC8798) obj;
                int bindingAdapterPosition = ((AbstractC3317) obj2).getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    view.getClass();
                    InterfaceC8792 interfaceC8792 = abstractC8798.f22385;
                    if (interfaceC8792 != null) {
                        return interfaceC8792.mo13336(abstractC8798, view, bindingAdapterPosition);
                    }
                }
                return false;
            case 5:
                OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) obj;
                InterfaceC7387 interfaceC7387 = ((C9648) obj2).f25167;
                if (interfaceC7387 != null) {
                    interfaceC7387.invoke(onlineStickerInfo);
                }
                return true;
            default:
                ((C9906) ((C9648) obj2).f25167).invoke((Message) obj);
                return Boolean.TRUE.booleanValue();
        }
    }
}
