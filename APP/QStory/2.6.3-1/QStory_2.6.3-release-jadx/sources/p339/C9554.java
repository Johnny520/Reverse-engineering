package p339;

import android.R;
import android.view.View;
import android.widget.ImageView;
import androidx.window.area.AbstractC3400;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;
import p303.AbstractC9234;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9554 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ ImageView f24929;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24930;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ File f24931;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ View f24932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ DialogXRecycleView f24933;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ImageView f24934;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f24935;

    public /* synthetic */ C9554(Ref$ObjectRef ref$ObjectRef, DialogXRecycleView dialogXRecycleView, ImageView imageView, Ref$ObjectRef ref$ObjectRef2, ImageView imageView2, File file, View view) {
        this.f24935 = ref$ObjectRef;
        this.f24933 = dialogXRecycleView;
        this.f24934 = imageView;
        this.f24930 = ref$ObjectRef2;
        this.f24929 = imageView2;
        this.f24931 = file;
        this.f24932 = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, java.lang.String] */
    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i;
        File file = (File) obj;
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜");
        file.getClass();
        ?? name = file.getName();
        AbstractC9234.m14531(1820);
        name.getClass();
        Ref$ObjectRef ref$ObjectRef = this.f24935;
        ref$ObjectRef.element = name;
        AbstractC3400.m5634(ref$ObjectRef, this.f24929, this.f24931, this.f24932);
        this.f24933.setVisibility(8);
        this.f24934.setImageResource(R.drawable.arrow_down_float);
        T t = this.f24930.element;
        if (t == 0) {
            AbstractC5227.m9467(AbstractC9234.m14531(2731));
            throw null;
        }
        C9557 c9557 = (C9557) t;
        String name2 = file.getName();
        AbstractC9234.m14531(1820);
        name2.getClass();
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜");
        List list = c9557.f24944;
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (AbstractC5227.m9466(((File) it.next()).getName(), c9557.f24942)) {
                break;
            }
            i3++;
        }
        c9557.f24942 = name2;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (AbstractC5227.m9466(((File) it2.next()).getName(), name2)) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i3 >= 0) {
            c9557.m5364(i3);
        }
        if (i >= 0) {
            c9557.m5364(i);
        }
        return C6008.f15084;
    }
}
