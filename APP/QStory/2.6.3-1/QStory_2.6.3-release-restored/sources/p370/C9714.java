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
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p050.AbstractC7176;
import p233.InterfaceC8795;
import p331.C9492;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9714 implements InterfaceC8795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C9715 f25392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25393;

    public /* synthetic */ C9714(C9715 c9715, int i) {
        this.f25393 = i;
        this.f25392 = c9715;
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12118(AbstractC3317 abstractC3317, int i, Object obj) {
        int i2;
        int i3 = this.f25393;
        C9715 c9715 = this.f25392;
        switch (i3) {
            case 0:
                C9492 c9492 = (C9492) abstractC3317;
                AbstractC9711 abstractC9711 = (AbstractC9711) obj;
                "holder";
                c9492.getClass();
                C9710 c9710 = abstractC9711 instanceof C9710 ? (C9710) abstractC9711 : null;
                if (c9710 == null) {
                    return;
                }
                int i4 = c9710.f25387;
                c9492.m14918(C0328R.id.tv_group_name, c9710.f25386);
                StringBuilder sb = new StringBuilder();
                sb.append(c9710.f25385);
                sb.append((char) 20010);
                c9492.m14918(C0328R.id.tv_group_count, sb.toString());
                ((ImageView) c9492.m14919(C0328R.id.iv_group_arrow)).setRotation(c9710.f25384 ? 90.0f : 0.0f);
                List list = c9715.f25398;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    int i5 = 2;
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (!((C9709) obj2).f25382) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator it2 = arrayList2.iterator();
                            i2 = 0;
                            while (it2.hasNext()) {
                                if (AbstractC5227.m9466(c9715.f25397.get(((C9709) it2.next()).f25383.GroupUin), Boolean.TRUE) && (i2 = i2 + 1) < 0) {
                                    AbstractC7176.m12480();
                                    throw null;
                                }
                            }
                        }
                        ImageView imageView = (ImageView) c9492.m14919(C0328R.id.iv_group_checkbox);
                        boolean zIsEmpty = arrayList2.isEmpty();
                        int i6 = C0328R.drawable.cb_group_unchecked;
                        if (zIsEmpty) {
                            imageView.setImageResource(C0328R.drawable.cb_group_unchecked);
                            imageView.setVisibility(4);
                        } else {
                            imageView.setVisibility(0);
                            if (i2 != 0) {
                                i6 = i2 == arrayList2.size() ? C0328R.drawable.cb_group_checked : C0328R.drawable.cb_indeterminate;
                            }
                            imageView.setImageResource(i6);
                        }
                        c9492.itemView.setOnClickListener(new ViewOnClickListenerC9708(c9710, c9715, i4, i5));
                        imageView.setOnClickListener(new ViewOnClickListenerC9708(arrayList2, i2, c9715));
                        return;
                    }
                    Object next = it.next();
                    C9709 c9709 = (C9709) next;
                    if (c9709.f25382) {
                        i5 = 0;
                    } else if (c9709.f25383.IsOwnerOrAdmin) {
                        i5 = 1;
                    }
                    if (i5 == i4) {
                        arrayList.add(next);
                    }
                }
                break;
            default:
                C9492 c94922 = (C9492) abstractC3317;
                AbstractC9711 abstractC97112 = (AbstractC9711) obj;
                "holder";
                c94922.getClass();
                C9709 c97092 = abstractC97112 instanceof C9709 ? (C9709) abstractC97112 : null;
                if (c97092 == null) {
                    return;
                }
                GroupInfo groupInfo = c97092.f25383;
                c94922.m14918(C0328R.id.tv_troop_name, groupInfo.GroupName);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("群号: ");
                sb2.append(groupInfo.GroupUin);
                boolean z = c97092.f25382;
                if (z) {
                    sb2.append("  [我创建的群]");
                } else if (groupInfo.IsOwnerOrAdmin) {
                    sb2.append("  [管理员]");
                }
                c94922.m14918(C0328R.id.tv_troop_info, sb2.toString());
                CheckBox checkBox = (CheckBox) c94922.m14919(C0328R.id.cb_troop_select);
                if (z) {
                    checkBox.setChecked(false);
                    checkBox.setEnabled(false);
                    checkBox.setAlpha(0.4f);
                } else {
                    checkBox.setChecked(AbstractC5227.m9466(c9715.f25397.get(groupInfo.GroupUin), Boolean.TRUE));
                    checkBox.setEnabled(true);
                    checkBox.setAlpha(1.0f);
                }
                String str = "https://p.qlogo.cn/gh/" + groupInfo.GroupUin + '/' + groupInfo.GroupUin + "/640/";
                ImageView imageView2 = (ImageView) c94922.m14919(C0328R.id.iv_troop_avatar);
                ComponentCallbacks2C3890.m7325(imageView2.getContext()).m7356(str).m7349(imageView2);
                return;
        }
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC3317 mo12119(Context context, ViewGroup viewGroup) {
        switch (this.f25393) {
            case 0:
                "context";
                "parent";
                View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.item_troop_group_header, viewGroup, false);
                viewInflate.getClass();
                return new C9492(viewInflate);
            default:
                "context";
                "parent";
                C9492 c9492 = new C9492(C0328R.layout.item_troop_checkbox, viewGroup);
                c9492.itemView.setOnClickListener(new ViewOnClickListenerC6392(c9492, 19, this.f25392));
                return c9492;
        }
    }

    @Override // p233.InterfaceC8795
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ void mo12120(AbstractC3317 abstractC3317, int i, Object obj, List list) {
        switch (this.f25393) {
            case 0:
                super.mo12120((C9492) abstractC3317, i, (AbstractC9711) obj, list);
                break;
            default:
                super.mo12120((C9492) abstractC3317, i, (AbstractC9711) obj, list);
                break;
        }
    }
}
