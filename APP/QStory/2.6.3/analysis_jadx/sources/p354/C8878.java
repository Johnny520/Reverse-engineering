package p354;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p034.AbstractC6347;
import p217.InterfaceC7966;
import p287.AbstractC8405;
import p315.C8663;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8878 implements InterfaceC7966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8877 f25031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25032;

    public /* synthetic */ C8878(C8877 c8877, int i) {
        this.f25032 = i;
        this.f25031 = c8877;
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11559(AbstractC2484 abstractC2484, int i, Object obj) {
        int i2;
        int i3 = this.f25032;
        C8877 c8877 = this.f25031;
        switch (i3) {
            case 0:
                C8663 c8663 = (C8663) abstractC2484;
                AbstractC8874 abstractC8874 = (AbstractC8874) obj;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                c8663.getClass();
                C8875 c8875 = abstractC8874 instanceof C8875 ? (C8875) abstractC8874 : null;
                if (c8875 == null) {
                    return;
                }
                int i4 = c8875.f25023;
                c8663.m14359(R.id.tv_group_name, c8875.f25022);
                StringBuilder sb = new StringBuilder();
                sb.append(c8875.f25021);
                sb.append((char) 20154);
                c8663.m14359(R.id.tv_group_count, sb.toString());
                ((ImageView) c8663.m14360(R.id.iv_group_arrow)).setRotation(c8875.f25020 ? 90.0f : 0.0f);
                List list = c8877.f25030;
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
                        if (AbstractC4395.m8907(c8877.f25029.get(((NewFriendInfo) it.next()).uin), Boolean.TRUE) && (i2 = i2 + 1) < 0) {
                            AbstractC6347.m11921();
                            throw null;
                        }
                    }
                }
                ImageView imageView = (ImageView) c8663.m14360(R.id.iv_group_checkbox);
                imageView.setImageResource(i2 == 0 ? R.drawable.cb_group_unchecked : i2 == arrayList.size() ? R.drawable.cb_group_checked : R.drawable.cb_indeterminate);
                c8663.itemView.setOnClickListener(new ViewOnClickListenerC8879(c8875, c8877, i4, i5));
                imageView.setOnClickListener(new ViewOnClickListenerC8879(i2, arrayList, c8877));
                return;
            default:
                C8663 c86632 = (C8663) abstractC2484;
                AbstractC8874 abstractC88742 = (AbstractC8874) obj;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                c86632.getClass();
                C8876 c8876 = abstractC88742 instanceof C8876 ? (C8876) abstractC88742 : null;
                if (c8876 == null) {
                    return;
                }
                NewFriendInfo newFriendInfo = c8876.f25024;
                String str = newFriendInfo.remark;
                AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜");
                str.getClass();
                c86632.m14359(R.id.tv_friend_name, str.length() > 0 ? newFriendInfo.remark : newFriendInfo.nickname);
                StringBuilder sb2 = new StringBuilder();
                String str2 = newFriendInfo.remark;
                AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜");
                str2.getClass();
                if (str2.length() > 0) {
                    sb2.append(AbstractC8405.m13972(2919));
                    sb2.append(newFriendInfo.nickname);
                    sb2.append(AbstractC8405.m13973("喵呜喵呜喵喵呜呜~喵呜喵呜喵呜喵呜~喵喵呜喵呜喵呜呜~喵喵呜呜呜喵喵呜~喵呜喵呜呜呜呜呜~喵呜喵喵呜呜喵喵"));
                    sb2.append(newFriendInfo.uin);
                } else {
                    sb2.append(AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜喵喵~喵呜喵喵喵喵喵喵~喵呜喵喵呜喵喵喵"));
                    sb2.append(newFriendInfo.uin);
                }
                c86632.m14359(R.id.tv_friend_info, sb2.toString());
                ((CheckBox) c86632.m14360(R.id.cb_friend_select)).setChecked(AbstractC4395.m8907(c8877.f25029.get(newFriendInfo.uin), Boolean.TRUE));
                String str3 = AbstractC8405.m13972(1134) + newFriendInfo.uin + AbstractC8405.m13972(1135);
                ImageView imageView2 = (ImageView) c86632.m14360(R.id.iv_friend_avatar);
                ComponentCallbacks2C3058.m6765(imageView2.getContext()).m6796(str3).m6789(imageView2);
                return;
        }
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2484 mo11560(Context context, ViewGroup viewGroup) {
        switch (this.f25032) {
            case 0:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_friend_group_header, viewGroup, false);
                viewInflate.getClass();
                return new C8663(viewInflate);
            default:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                C8663 c8663 = new C8663(R.layout.item_friend_checkbox, viewGroup);
                c8663.itemView.setOnClickListener(new ViewOnClickListenerC5562(c8663, 17, this.f25031));
                return c8663;
        }
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ void mo11561(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        switch (this.f25032) {
            case 0:
                super.mo11561((C8663) abstractC2484, i, (AbstractC8874) obj, list);
                break;
            default:
                super.mo11561((C8663) abstractC2484, i, (AbstractC8874) obj, list);
                break;
        }
    }
}
