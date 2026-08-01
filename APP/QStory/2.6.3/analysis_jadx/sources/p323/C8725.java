package p323;

import android.R;
import android.view.View;
import android.widget.ImageView;
import androidx.window.area.AbstractC2567;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;
import p287.AbstractC8405;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8725 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ImageView f24584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ File f24586;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ View f24587;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DialogXRecycleView f24588;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ImageView f24589;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24590;

    public /* synthetic */ C8725(Ref$ObjectRef ref$ObjectRef, DialogXRecycleView dialogXRecycleView, ImageView imageView, Ref$ObjectRef ref$ObjectRef2, ImageView imageView2, File file, View view) {
        this.f24590 = ref$ObjectRef;
        this.f24588 = dialogXRecycleView;
        this.f24589 = imageView;
        this.f24585 = ref$ObjectRef2;
        this.f24584 = imageView2;
        this.f24586 = file;
        this.f24587 = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i;
        File file = (File) obj;
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜");
        file.getClass();
        ?? name = file.getName();
        AbstractC8405.m13972(1820);
        name.getClass();
        Ref$ObjectRef ref$ObjectRef = this.f24590;
        ref$ObjectRef.element = name;
        AbstractC2567.m5074(ref$ObjectRef, this.f24584, this.f24586, this.f24587);
        this.f24588.setVisibility(8);
        this.f24589.setImageResource(R.drawable.arrow_down_float);
        T t = this.f24585.element;
        if (t == 0) {
            AbstractC4395.m8908(AbstractC8405.m13972(2731));
            throw null;
        }
        C8728 c8728 = (C8728) t;
        String name2 = file.getName();
        AbstractC8405.m13972(1820);
        name2.getClass();
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        List list = c8728.f24599;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (AbstractC4395.m8907(((File) it.next()).getName(), c8728.f24597)) {
                break;
            }
            i3++;
        }
        c8728.f24597 = name2;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (AbstractC4395.m8907(((File) it2.next()).getName(), name2)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i3 >= 0) {
            c8728.m4804(i3);
        }
        if (i >= 0) {
            c8728.m4804(i);
        }
        return C5176.f14739;
    }
}
