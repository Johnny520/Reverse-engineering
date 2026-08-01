package p356;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p007.AbstractC6136;
import p217.InterfaceC7965;
import p253.AbstractC8189;
import p315.C8671;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8899 implements InterfaceC7965 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8898 f25070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25071;

    public /* synthetic */ C8899(C8898 c8898, int i) {
        this.f25071 = i;
        this.f25070 = c8898;
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11521(AbstractC2484 abstractC2484, int i, Object obj) {
        int i2;
        int i3 = this.f25071;
        C8898 c8898 = this.f25070;
        switch (i3) {
            case 0:
                C8671 c8671 = (C8671) abstractC2484;
                AbstractC8895 abstractC8895 = (AbstractC8895) obj;
                AbstractC3056.m6668(-3937690694970508711L);
                c8671.getClass();
                C8896 c8896 = abstractC8895 instanceof C8896 ? (C8896) abstractC8895 : null;
                if (c8896 == null) {
                    return;
                }
                int i4 = c8896.f25062;
                c8671.m14341(R.id.tv_group_name, c8896.f25061);
                StringBuilder sb = new StringBuilder();
                sb.append(c8896.f25060);
                sb.append((char) 20154);
                c8671.m14341(R.id.tv_group_count, sb.toString());
                ((ImageView) c8671.m14342(R.id.iv_group_arrow)).setRotation(c8896.f25059 ? 90.0f : 0.0f);
                List list = c8898.f25069;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((NewFriendInfo) obj2).categoryId == i4) {
                        arrayList.add(obj2);
                    }
                }
                int i5 = 0;
                if (arrayList.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it = arrayList.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        if (AbstractC4394.m8917(c8898.f25068.get(((NewFriendInfo) it.next()).uin), Boolean.TRUE) && (i2 = i2 + 1) < 0) {
                            AbstractC8189.m13663();
                            throw null;
                        }
                    }
                }
                ImageView imageView = (ImageView) c8671.m14342(R.id.iv_group_checkbox);
                imageView.setImageResource(i2 == 0 ? R.drawable.cb_group_unchecked : i2 == arrayList.size() ? R.drawable.cb_group_checked : R.drawable.cb_indeterminate);
                c8671.itemView.setOnClickListener(new ViewOnClickListenerC8900(c8896, c8898, i4, i5));
                imageView.setOnClickListener(new ViewOnClickListenerC8900(i2, arrayList, c8898));
                return;
            default:
                C8671 c86712 = (C8671) abstractC2484;
                AbstractC8895 abstractC88952 = (AbstractC8895) obj;
                AbstractC3056.m6668(-3937690694970508711L);
                c86712.getClass();
                C8897 c8897 = abstractC88952 instanceof C8897 ? (C8897) abstractC88952 : null;
                if (c8897 == null) {
                    return;
                }
                NewFriendInfo newFriendInfo = c8897.f25063;
                String str = newFriendInfo.remark;
                AbstractC3056.m6668(-3937727760538273191L);
                str.getClass();
                c86712.m14341(R.id.tv_friend_name, str.length() > 0 ? newFriendInfo.remark : newFriendInfo.nickname);
                StringBuilder sb2 = new StringBuilder();
                String str2 = newFriendInfo.remark;
                AbstractC3056.m6668(-3937727760538273191L);
                str2.getClass();
                if (str2.length() > 0) {
                    sb2.append(AbstractC3056.m6668(-3937297366160508327L));
                    AbstractC6136.m11531(sb2, newFriendInfo.nickname, -3937297284556129703L);
                    sb2.append(newFriendInfo.uin);
                } else {
                    sb2.append(AbstractC3056.m6668(-3937297314620900775L));
                    sb2.append(newFriendInfo.uin);
                }
                c86712.m14341(R.id.tv_friend_info, sb2.toString());
                ((CheckBox) c86712.m14342(R.id.cb_friend_select)).setChecked(AbstractC4394.m8917(c8898.f25068.get(newFriendInfo.uin), Boolean.TRUE));
                String str3 = AbstractC3056.m6668(-3937669469242131879L) + newFriendInfo.uin + AbstractC3056.m6668(-3937669323213243815L);
                ImageView imageView2 = (ImageView) c86712.m14342(R.id.iv_friend_avatar);
                ComponentCallbacks2C3057.m6720(imageView2.getContext()).m6751(str3).m6744(imageView2);
                return;
        }
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2484 mo11522(Context context, ViewGroup viewGroup) {
        switch (this.f25071) {
            case 0:
                AbstractC3056.m6668(-3937616005489231271L);
                AbstractC3056.m6668(-3937690699265476007L);
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_friend_group_header, viewGroup, false);
                viewInflate.getClass();
                return new C8671(viewInflate);
            default:
                AbstractC3056.m6668(-3937616005489231271L);
                AbstractC3056.m6668(-3937690699265476007L);
                C8671 c8671 = new C8671(R.layout.item_friend_checkbox, viewGroup);
                c8671.itemView.setOnClickListener(new ViewOnClickListenerC5561(c8671, 17, this.f25070));
                return c8671;
        }
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ void mo11523(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        switch (this.f25071) {
            case 0:
                super.mo11523((C8671) abstractC2484, i, (AbstractC8895) obj, list);
                break;
            default:
                super.mo11523((C8671) abstractC2484, i, (AbstractC8895) obj, list);
                break;
        }
    }
}
