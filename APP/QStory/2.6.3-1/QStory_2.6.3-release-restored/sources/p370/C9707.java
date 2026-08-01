package p370;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC3317;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p050.AbstractC7176;
import p233.InterfaceC8795;
import p331.C9492;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9707 implements InterfaceC8795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C9706 f25376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25377;

    public /* synthetic */ C9707(C9706 c9706, int i) {
        this.f25377 = i;
        this.f25376 = c9706;
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12118(AbstractC3317 abstractC3317, int i, Object obj) {
        int i2;
        int i3 = this.f25377;
        C9706 c9706 = this.f25376;
        switch (i3) {
            case 0:
                C9492 c9492 = (C9492) abstractC3317;
                AbstractC9703 abstractC9703 = (AbstractC9703) obj;
                "holder";
                c9492.getClass();
                C9704 c9704 = abstractC9703 instanceof C9704 ? (C9704) abstractC9703 : null;
                if (c9704 == null) {
                    return;
                }
                int i4 = c9704.f25368;
                c9492.m14918(C0328R.id.tv_group_name, c9704.f25367);
                StringBuilder sb = new StringBuilder();
                sb.append(c9704.f25366);
                sb.append((char) 20154);
                c9492.m14918(C0328R.id.tv_group_count, sb.toString());
                ((ImageView) c9492.m14919(C0328R.id.iv_group_arrow)).setRotation(c9704.f25365 ? 90.0f : 0.0f);
                List list = c9706.f25375;
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
                        if (AbstractC5227.m9466(c9706.f25374.get(((NewFriendInfo) it.next()).uin), Boolean.TRUE) && (i2 = i2 + 1) < 0) {
                            AbstractC7176.m12480();
                            throw null;
                        }
                    }
                }
                ImageView imageView = (ImageView) c9492.m14919(C0328R.id.iv_group_checkbox);
                imageView.setImageResource(i2 == 0 ? C0328R.drawable.cb_group_unchecked : i2 == arrayList.size() ? C0328R.drawable.cb_group_checked : C0328R.drawable.cb_indeterminate);
                c9492.itemView.setOnClickListener(new ViewOnClickListenerC9708(c9704, c9706, i4, i5));
                imageView.setOnClickListener(new ViewOnClickListenerC9708(i2, arrayList, c9706));
                return;
            default:
                C9492 c94922 = (C9492) abstractC3317;
                AbstractC9703 abstractC97032 = (AbstractC9703) obj;
                "holder";
                c94922.getClass();
                C9705 c9705 = abstractC97032 instanceof C9705 ? (C9705) abstractC97032 : null;
                if (c9705 == null) {
                    return;
                }
                NewFriendInfo newFriendInfo = c9705.f25369;
                String str = newFriendInfo.remark;
                "remark";
                str.getClass();
                c94922.m14918(C0328R.id.tv_friend_name, str.length() > 0 ? newFriendInfo.remark : newFriendInfo.nickname);
                StringBuilder sb2 = new StringBuilder();
                String str2 = newFriendInfo.remark;
                "remark";
                str2.getClass();
                if (str2.length() > 0) {
                    sb2.append("昵称: ");
                    sb2.append(newFriendInfo.nickname);
                    sb2.append("  QQ: ");
                    sb2.append(newFriendInfo.uin);
                } else {
                    sb2.append("QQ: ");
                    sb2.append(newFriendInfo.uin);
                }
                c94922.m14918(C0328R.id.tv_friend_info, sb2.toString());
                ((CheckBox) c94922.m14919(C0328R.id.cb_friend_select)).setChecked(AbstractC5227.m9466(c9706.f25374.get(newFriendInfo.uin), Boolean.TRUE));
                String str3 = "http://q.qlogo.cn/headimg_dl?dst_uin=" + newFriendInfo.uin + "&spec=640&img_type=jpg";
                ImageView imageView2 = (ImageView) c94922.m14919(C0328R.id.iv_friend_avatar);
                ComponentCallbacks2C3890.m7325(imageView2.getContext()).m7356(str3).m7349(imageView2);
                return;
        }
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC3317 mo12119(Context context, ViewGroup viewGroup) {
        switch (this.f25377) {
            case 0:
                "context";
                "parent";
                View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.item_friend_group_header, viewGroup, false);
                viewInflate.getClass();
                return new C9492(viewInflate);
            default:
                "context";
                "parent";
                C9492 c9492 = new C9492(C0328R.layout.item_friend_checkbox, viewGroup);
                c9492.itemView.setOnClickListener(new ViewOnClickListenerC6392(c9492, 17, this.f25376));
                return c9492;
        }
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ void mo12120(AbstractC3317 abstractC3317, int i, Object obj, List list) {
        switch (this.f25377) {
            case 0:
                super.mo12120((C9492) abstractC3317, i, (AbstractC9703) obj, list);
                break;
            default:
                super.mo12120((C9492) abstractC3317, i, (AbstractC9703) obj, list);
                break;
        }
    }
}
