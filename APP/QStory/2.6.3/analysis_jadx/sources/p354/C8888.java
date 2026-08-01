package p354;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.activity.compose.C0004;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.util.ArrayList;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import p034.AbstractC6347;
import p217.AbstractC7969;
import p287.AbstractC8405;
import p315.C8663;
import top.suzhelan.qstory.hook.item.mcp.config.C5872;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8888 extends AbstractC7969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C0004 f25055;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25056;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6057 f25057;

    public C8888(ArrayList arrayList) {
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜");
        this.f25056 = arrayList;
        AbstractC7969.m13458(this, AbstractC4344.m8797(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList m14539() {
        ArrayList arrayList = this.f25056;
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            arrayList2.add(C5872.m11271((C5872) obj, false, i, 15));
            i = i2;
        }
        return arrayList2;
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i) {
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
        return new C8663(R.layout.item_mcp_server_config, viewGroup);
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13457(AbstractC2484 abstractC2484, int i, Object obj) {
        final C8663 c8663 = (C8663) abstractC2484;
        C5872 c5872 = (C5872) obj;
        AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        if (c5872 == null) {
            return;
        }
        boolean z = c5872.f16042;
        c8663.m14359(R.id.tv_mcp_order, String.valueOf(i + 1));
        c8663.m14359(R.id.tv_mcp_title, c5872.f16044);
        c8663.m14359(R.id.tv_mcp_description, c5872.f16043);
        c8663.m14359(R.id.tv_mcp_status, AbstractC8405.m13972(z ? 2926 : 2927));
        TextView textView = (TextView) c8663.m14360(R.id.tv_mcp_status);
        textView.setBackground(textView.getContext().getDrawable(z ? R.drawable.mcp_config_status_enabled : R.drawable.mcp_config_status_disabled));
        Switch r5 = (Switch) c8663.m14360(R.id.switch_mcp_enabled);
        r5.setOnCheckedChangeListener(null);
        r5.setChecked(z);
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏世哲兰
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) throws NoSuchMethodException {
                AbstractC8405.m13972(1293);
                compoundButton.getClass();
                int bindingAdapterPosition = c8663.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return;
                }
                C8888 c8888 = this;
                ArrayList arrayList = c8888.f25056;
                C5872 c58722 = (C5872) AbstractC4344.m8818(bindingAdapterPosition, arrayList);
                if (c58722 == null) {
                    return;
                }
                arrayList.set(bindingAdapterPosition, C5872.m11271(c58722, z2, 0, 23));
                AbstractC7969.m13458(c8888, AbstractC4344.m8797(arrayList));
                C0004 c0004 = c8888.f25055;
                if (c0004 != null) {
                    c0004.invoke();
                }
            }
        });
        ImageView imageView = (ImageView) c8663.m14360(R.id.iv_mcp_drag);
        c8663.itemView.setOnClickListener(new ViewOnClickListenerC3183(r5, 27));
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏世兰哲
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C6057 c6057;
                if (motionEvent.getActionMasked() != 0 || (c6057 = this.f25057) == null) {
                    return false;
                }
                c6057.invoke(c8663);
                return false;
            }
        });
    }
}
