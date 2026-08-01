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
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p217.InterfaceC7965;
import p253.AbstractC8189;
import p315.C8671;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8906 implements InterfaceC7965 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8907 f25086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25087;

    public /* synthetic */ C8906(C8907 c8907, int i) {
        this.f25087 = i;
        this.f25086 = c8907;
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo11521(AbstractC2484 abstractC2484, int i, Object obj) {
        int i2;
        int i3 = this.f25087;
        C8907 c8907 = this.f25086;
        switch (i3) {
            case 0:
                C8671 c8671 = (C8671) abstractC2484;
                AbstractC8903 abstractC8903 = (AbstractC8903) obj;
                "holder";
                c8671.getClass();
                C8902 c8902 = abstractC8903 instanceof C8902 ? (C8902) abstractC8903 : null;
                if (c8902 == null) {
                    return;
                }
                int i4 = c8902.f25081;
                c8671.m14341(R.id.tv_group_name, c8902.f25080);
                StringBuilder sb = new StringBuilder();
                sb.append(c8902.f25079);
                sb.append((char) 20010);
                c8671.m14341(R.id.tv_group_count, sb.toString());
                ((ImageView) c8671.m14342(R.id.iv_group_arrow)).setRotation(c8902.f25078 ? 90.0f : 0.0f);
                List list = c8907.f25092;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    int i5 = 2;
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (!((C8901) obj2).f25076) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            i2 = 0;
                        } else {
                            Iterator it2 = arrayList2.iterator();
                            i2 = 0;
                            while (it2.hasNext()) {
                                if (AbstractC4394.m8917(c8907.f25091.get(((C8901) it2.next()).f25077.GroupUin), Boolean.TRUE) && (i2 = i2 + 1) < 0) {
                                    AbstractC8189.m13663();
                                    throw null;
                                }
                            }
                        }
                        ImageView imageView = (ImageView) c8671.m14342(R.id.iv_group_checkbox);
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
                        c8671.itemView.setOnClickListener(new ViewOnClickListenerC8900(c8902, c8907, i4, i5));
                        imageView.setOnClickListener(new ViewOnClickListenerC8900(arrayList2, i2, c8907));
                        return;
                    }
                    Object next = it.next();
                    C8901 c8901 = (C8901) next;
                    if (c8901.f25076) {
                        i5 = 0;
                    } else if (c8901.f25077.IsOwnerOrAdmin) {
                        i5 = 1;
                    }
                    if (i5 == i4) {
                        arrayList.add(next);
                    }
                }
                break;
            default:
                C8671 c86712 = (C8671) abstractC2484;
                AbstractC8903 abstractC89032 = (AbstractC8903) obj;
                "holder";
                c86712.getClass();
                C8901 c89012 = abstractC89032 instanceof C8901 ? (C8901) abstractC89032 : null;
                if (c89012 == null) {
                    return;
                }
                GroupInfo groupInfo = c89012.f25077;
                c86712.m14341(R.id.tv_troop_name, groupInfo.GroupName);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\u7fa4\u53f7: ");
                sb2.append(groupInfo.GroupUin);
                boolean z = c89012.f25076;
                if (z) {
                    sb2.append("  [\u6211\u521b\u5efa\u7684\u7fa4]");
                } else if (groupInfo.IsOwnerOrAdmin) {
                    sb2.append("  [\u7ba1\u7406\u5458]");
                }
                c86712.m14341(R.id.tv_troop_info, sb2.toString());
                CheckBox checkBox = (CheckBox) c86712.m14342(R.id.cb_troop_select);
                if (z) {
                    checkBox.setChecked(false);
                    checkBox.setEnabled(false);
                    checkBox.setAlpha(0.4f);
                } else {
                    checkBox.setChecked(AbstractC4394.m8917(c8907.f25091.get(groupInfo.GroupUin), Boolean.TRUE));
                    checkBox.setEnabled(true);
                    checkBox.setAlpha(1.0f);
                }
                String str = "https://p.qlogo.cn/gh/" + groupInfo.GroupUin + '/' + groupInfo.GroupUin + "/640/";
                ImageView imageView2 = (ImageView) c86712.m14342(R.id.iv_troop_avatar);
                ComponentCallbacks2C3057.m6720(imageView2.getContext()).m6751(str).m6744(imageView2);
                return;
        }
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2484 mo11522(Context context, ViewGroup viewGroup) {
        switch (this.f25087) {
            case 0:
                "context";
                "parent";
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_troop_group_header, viewGroup, false);
                viewInflate.getClass();
                return new C8671(viewInflate);
            default:
                "context";
                "parent";
                C8671 c8671 = new C8671(R.layout.item_troop_checkbox, viewGroup);
                c8671.itemView.setOnClickListener(new ViewOnClickListenerC5561(c8671, 19, this.f25086));
                return c8671;
        }
    }

    @Override // p217.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final /* bridge */ void mo11523(AbstractC2484 abstractC2484, int i, Object obj, List list) {
        switch (this.f25087) {
            case 0:
                super.mo11523((C8671) abstractC2484, i, (AbstractC8903) obj, list);
                break;
            default:
                super.mo11523((C8671) abstractC2484, i, (AbstractC8903) obj, list);
                break;
        }
    }
}
