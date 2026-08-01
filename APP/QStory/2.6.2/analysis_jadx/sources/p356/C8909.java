package p356;

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
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.util.ArrayList;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import p217.AbstractC7968;
import p253.AbstractC8189;
import p315.C8671;
import top.suzhelan.qstory.hook.item.mcp.config.C5867;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8909 extends AbstractC7968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C0004 f25094;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f25095;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C6051 f25096;

    public C8909(ArrayList arrayList) {
        AbstractC3056.m6668(-3937589565670557095L);
        this.f25095 = arrayList;
        AbstractC7968.m13430(this, AbstractC4343.m8804(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ArrayList m14529() {
        ArrayList arrayList = this.f25095;
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            arrayList2.add(C5867.m11209((C5867) obj, false, i, 15));
            i = i2;
        }
        return arrayList2;
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        AbstractC3056.m6668(-3937616005489231271L);
        AbstractC3056.m6668(-3937690699265476007L);
        return new C8671(R.layout.item_mcp_server_config, viewGroup);
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13429(AbstractC2484 abstractC2484, int i, Object obj) {
        final C8671 c8671 = (C8671) abstractC2484;
        C5867 c5867 = (C5867) obj;
        AbstractC3056.m6668(-3937690694970508711L);
        if (c5867 == null) {
            return;
        }
        boolean z = c5867.f16035;
        c8671.m14341(R.id.tv_mcp_order, String.valueOf(i + 1));
        c8671.m14341(R.id.tv_mcp_title, c5867.f16037);
        c8671.m14341(R.id.tv_mcp_description, c5867.f16036);
        c8671.m14341(R.id.tv_mcp_status, AbstractC3056.m6668(z ? -3937296739095283111L : -3937296721915413927L));
        TextView textView = (TextView) c8671.m14342(R.id.tv_mcp_status);
        textView.setBackground(textView.getContext().getDrawable(z ? R.drawable.mcp_config_status_enabled : R.drawable.mcp_config_status_disabled));
        Switch r5 = (Switch) c8671.m14342(R.id.switch_mcp_enabled);
        r5.setOnCheckedChangeListener(null);
        r5.setChecked(z);
        r5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世哲兰
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) throws NoSuchMethodException {
                AbstractC3056.m6668(-3937690725035279783L);
                compoundButton.getClass();
                int bindingAdapterPosition = c8671.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return;
                }
                C8909 c8909 = this;
                ArrayList arrayList = c8909.f25095;
                C5867 c58672 = (C5867) AbstractC4343.m8831(bindingAdapterPosition, arrayList);
                if (c58672 == null) {
                    return;
                }
                arrayList.set(bindingAdapterPosition, C5867.m11209(c58672, z2, 0, 23));
                AbstractC7968.m13430(c8909, AbstractC4343.m8804(arrayList));
                C0004 c0004 = c8909.f25094;
                if (c0004 != null) {
                    c0004.invoke();
                }
            }
        });
        ImageView imageView = (ImageView) c8671.m14342(R.id.iv_mcp_drag);
        c8671.itemView.setOnClickListener(new ViewOnClickListenerC3182(r5, 29));
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏世兰哲
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C6051 c6051;
                if (motionEvent.getActionMasked() != 0 || (c6051 = this.f25096) == null) {
                    return false;
                }
                c6051.invoke(c8671);
                return false;
            }
        });
    }
}
