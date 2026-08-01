package p319;

import android.R;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8702 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ImageView f24534;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24535;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ File f24536;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ View f24537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DialogXRecycleView f24538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ImageView f24539;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24540;

    public /* synthetic */ C8702(Ref$ObjectRef ref$ObjectRef, DialogXRecycleView dialogXRecycleView, ImageView imageView, Ref$ObjectRef ref$ObjectRef2, ImageView imageView2, File file, View view) {
        this.f24540 = ref$ObjectRef;
        this.f24538 = dialogXRecycleView;
        this.f24539 = imageView;
        this.f24535 = ref$ObjectRef2;
        this.f24534 = imageView2;
        this.f24536 = file;
        this.f24537 = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i;
        File file = (File) obj;
        AbstractC3056.m6668(-3937626734317536679L);
        file.getClass();
        ?? name = file.getName();
        AbstractC3056.m6668(-3937741817966232999L);
        name.getClass();
        Ref$ObjectRef ref$ObjectRef = this.f24540;
        ref$ObjectRef.element = name;
        AbstractC2904.m6253(ref$ObjectRef, this.f24534, this.f24536, this.f24537);
        this.f24538.setVisibility(8);
        this.f24539.setImageResource(R.drawable.arrow_down_float);
        T t = this.f24535.element;
        if (t == 0) {
            AbstractC4394.m8918(AbstractC3056.m6668(-3937830921357755815L));
            throw null;
        }
        C8705 c8705 = (C8705) t;
        String name2 = file.getName();
        AbstractC3056.m6668(-3937741817966232999L);
        name2.getClass();
        AbstractC3056.m6668(-3937597717518484903L);
        List list = c8705.f24549;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (AbstractC4394.m8917(((File) it.next()).getName(), c8705.f24547)) {
                break;
            }
            i3++;
        }
        c8705.f24547 = name2;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (AbstractC4394.m8917(((File) it2.next()).getName(), name2)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i3 >= 0) {
            c8705.m4794(i3);
        }
        if (i >= 0) {
            c8705.m4794(i);
        }
        return C5175.f14739;
    }
}
