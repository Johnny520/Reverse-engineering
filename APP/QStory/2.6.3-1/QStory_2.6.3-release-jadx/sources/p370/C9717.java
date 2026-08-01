package p370;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.activity.compose.C0851;
import androidx.recyclerview.widget.AbstractC3317;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.util.ArrayList;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import p050.AbstractC7176;
import p233.AbstractC8798;
import p303.AbstractC9234;
import p331.C9492;
import top.suzhelan.qstory.hook.item.mcp.config.C6702;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9717 extends AbstractC8798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C0851 f25400;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25401;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6886 f25402;

    public C9717(ArrayList arrayList) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜");
        this.f25401 = arrayList;
        AbstractC8798.m14017(this, AbstractC5176.m9356(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList m15098() {
        ArrayList arrayList = this.f25401;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            arrayList2.add(C6702.m11830((C6702) obj, false, i, 15));
            i = i2;
        }
        return arrayList2;
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
        return new C9492(C0328R.layout.item_mcp_server_config, viewGroup);
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo14016(AbstractC3317 abstractC3317, int i, Object obj) {
        final C9492 c9492 = (C9492) abstractC3317;
        C6702 c6702 = (C6702) obj;
        AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        if (c6702 == null) {
            return;
        }
        boolean z = c6702.f16387;
        c9492.m14918(C0328R.id.tv_mcp_order, String.valueOf(i + 1));
        c9492.m14918(C0328R.id.tv_mcp_title, c6702.f16389);
        c9492.m14918(C0328R.id.tv_mcp_description, c6702.f16388);
        c9492.m14918(C0328R.id.tv_mcp_status, AbstractC9234.m14531(z ? 2926 : 2927));
        TextView textView = (TextView) c9492.m14919(C0328R.id.tv_mcp_status);
        textView.setBackground(textView.getContext().getDrawable(z ? C0328R.drawable.mcp_config_status_enabled : C0328R.drawable.mcp_config_status_disabled));
        Switch r5 = (Switch) c9492.m14919(C0328R.id.switch_mcp_enabled);
        r5.setOnCheckedChangeListener(null);
        r5.setChecked(z);
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏世哲兰
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) throws NoSuchMethodException {
                AbstractC9234.m14531(1293);
                compoundButton.getClass();
                int bindingAdapterPosition = c9492.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return;
                }
                C9717 c9717 = this;
                ArrayList arrayList = c9717.f25401;
                C6702 c67022 = (C6702) AbstractC5176.m9377(bindingAdapterPosition, arrayList);
                if (c67022 == null) {
                    return;
                }
                arrayList.set(bindingAdapterPosition, C6702.m11830(c67022, z2, 0, 23));
                AbstractC8798.m14017(c9717, AbstractC5176.m9356(arrayList));
                C0851 c0851 = c9717.f25400;
                if (c0851 != null) {
                    c0851.invoke();
                }
            }
        });
        ImageView imageView = (ImageView) c9492.m14919(C0328R.id.iv_mcp_drag);
        c9492.itemView.setOnClickListener(new ViewOnClickListenerC4015(r5, 27));
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏世兰哲
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C6886 c6886;
                if (motionEvent.getActionMasked() != 0 || (c6886 = this.f25402) == null) {
                    return false;
                }
                c6886.invoke(c9492);
                return false;
            }
        });
    }
}
