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
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p034.AbstractC6347;
import p217.InterfaceC7966;
import p287.AbstractC8405;
import p315.C8663;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8885 implements InterfaceC7966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8886 f25047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25048;

    public /* synthetic */ C8885(C8886 c8886, int i) {
        this.f25048 = i;
        this.f25047 = c8886;
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11559(AbstractC2484 abstractC2484, int i, Object obj) {
        int i2;
        int i3 = this.f25048;
        C8886 c8886 = this.f25047;
        switch (i3) {
            case 0:
                C8663 c8663 = (C8663) abstractC2484;
                AbstractC8882 abstractC8882 = (AbstractC8882) obj;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                c8663.getClass();
                C8881 c8881 = abstractC8882 instanceof C8881 ? (C8881) abstractC8882 : null;
                if (c8881 == null) {
                    return;
                }
                int i4 = c8881.f25042;
                c8663.m14359(R.id.tv_group_name, c8881.f25041);
                StringBuilder sb = new StringBuilder();
                sb.append(c8881.f25040);
                sb.append((char) 20010);
                c8663.m14359(R.id.tv_group_count, sb.toString());
                ((ImageView) c8663.m14360(R.id.iv_group_arrow)).setRotation(c8881.f25039 ? 90.0f : 0.0f);
                List list = c8886.f25053;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    int i5 = 2;
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (!((C8880) obj2).f25037) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator it2 = arrayList2.iterator();
                            i2 = 0;
                            while (it2.hasNext()) {
                                if (AbstractC4395.m8907(c8886.f25052.get(((C8880) it2.next()).f25038.GroupUin), Boolean.TRUE) && (i2 = i2 + 1) < 0) {
                                    AbstractC6347.m11921();
                                    throw null;
                                }
                            }
                        }
                        ImageView imageView = (ImageView) c8663.m14360(R.id.iv_group_checkbox);
                        boolean zIsEmpty = arrayList2.isEmpty();
                        int i6 = R.drawable.cb_group_unchecked;
                        if (zIsEmpty) {
                            imageView.setImageResource(R.drawable.cb_group_unchecked);
                            imageView.setVisibility(4);
                        } else {
                            imageView.setVisibility(0);
                            if (i2 != 0) {
                                i6 = i2 == arrayList2.size() ? R.drawable.cb_group_checked : R.drawable.cb_indeterminate;
                            }
                            imageView.setImageResource(i6);
                        }
                        c8663.itemView.setOnClickListener(new ViewOnClickListenerC8879(c8881, c8886, i4, i5));
                        imageView.setOnClickListener(new ViewOnClickListenerC8879(arrayList2, i2, c8886));
                        return;
                    }
                    Object next = it.next();
                    C8880 c8880 = (C8880) next;
                    if (c8880.f25037) {
                        i5 = 0;
                    } else if (c8880.f25038.IsOwnerOrAdmin) {
                        i5 = 1;
                    }
                    if (i5 == i4) {
                        arrayList.add(next);
                    }
                }
                break;
            default:
                C8663 c86632 = (C8663) abstractC2484;
                AbstractC8882 abstractC88822 = (AbstractC8882) obj;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                c86632.getClass();
                C8880 c88802 = abstractC88822 instanceof C8880 ? (C8880) abstractC88822 : null;
                if (c88802 == null) {
                    return;
                }
                GroupInfo groupInfo = c88802.f25038;
                c86632.m14359(R.id.tv_troop_name, groupInfo.GroupName);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AbstractC8405.m13972(2929));
                sb2.append(groupInfo.GroupUin);
                boolean z = c88802.f25037;
                if (z) {
                    sb2.append(AbstractC8405.m13972(2930));
                } else if (groupInfo.IsOwnerOrAdmin) {
                    sb2.append(AbstractC8405.m13972(2931));
                }
                c86632.m14359(R.id.tv_troop_info, sb2.toString());
                CheckBox checkBox = (CheckBox) c86632.m14360(R.id.cb_troop_select);
                if (z) {
                    checkBox.setChecked(false);
                    checkBox.setEnabled(false);
                    checkBox.setAlpha(0.4f);
                } else {
                    checkBox.setChecked(AbstractC4395.m8907(c8886.f25052.get(groupInfo.GroupUin), Boolean.TRUE));
                    checkBox.setEnabled(true);
                    checkBox.setAlpha(1.0f);
                }
                String str = AbstractC8405.m13972(2928) + groupInfo.GroupUin + '/' + groupInfo.GroupUin + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵~喵呜喵喵呜喵呜喵");
                ImageView imageView2 = (ImageView) c86632.m14360(R.id.iv_troop_avatar);
                ComponentCallbacks2C3058.m6765(imageView2.getContext()).m6796(str).m6789(imageView2);
                return;
        }
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2484 mo11560(Context context, ViewGroup viewGroup) {
        switch (this.f25048) {
            case 0:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_troop_group_header, viewGroup, false);
                viewInflate.getClass();
                return new C8663(viewInflate);
            default:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                C8663 c8663 = new C8663(R.layout.item_troop_checkbox, viewGroup);
                c8663.itemView.setOnClickListener(new ViewOnClickListenerC5562(c8663, 19, this.f25047));
                return c8663;
        }
    }

    @Override // p217.InterfaceC7966
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ void mo11561(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        switch (this.f25048) {
            case 0:
                super.mo11561((C8663) abstractC2484, i, (AbstractC8882) obj, list);
                break;
            default:
                super.mo11561((C8663) abstractC2484, i, (AbstractC8882) obj, list);
                break;
        }
    }
}
