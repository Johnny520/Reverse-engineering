package p039;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.ViewOnClickListenerC0086;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p010.AbstractC6185;
import p024.AbstractC6309;
import p026.AbstractC6311;
import p028.DialogC6319;
import p029.C6320;
import p033.AbstractC6337;
import p033.C6335;
import p037.AbstractC6370;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5916;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC6410 extends AbstractC6311 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EditText f17583;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C6320 f17584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f17585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DialogC6319 f17586;

    public ViewOnClickListenerC6410() {
        AbstractC8405.m13972(132);
        this.f17585 = new String[]{AbstractC8405.m13973("喵喵呜呜呜喵喵呜"), AbstractC8405.m13972(133), AbstractC8405.m13972(134), AbstractC8405.m13972(135), AbstractC8405.m13972(136)};
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(137));
        c6335M11853.f17458.f3618 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        String[] strArr = this.f17585;
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = AbstractC6337.m11866(strArr[i]);
        }
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        m11831(c6335M11853.m11855(), new C2358(this, 11));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f17584 == null) {
            this.f17584 = new C6320(AbstractC8405.m13972(132));
        }
        String string = this.f17583.getText().toString();
        AbstractC6185.m11592(AbstractC8405.m13972(139) + string);
        this.f17584.m11836(string, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"));
        this.f17584.mo11835();
        this.f17586.dismiss();
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(138);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC0086(this, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String m11967() {
        List arrayList;
        List arrayList2;
        LinkedHashMap linkedHashMap = AbstractC6309.f17424;
        C5916 c5916 = (C5916) linkedHashMap.get(C5916.class);
        if (!(c5916 == null ? false : c5916.f17425.booleanValue())) {
            if (this.f17584 == null) {
                this.f17584 = new C6320(AbstractC8405.m13972(132));
            }
            return (String) this.f17584.m11839(AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵喵喵"));
        }
        C5916 c59162 = (C5916) linkedHashMap.get(C5916.class);
        if (c59162 == null) {
            return AbstractC8405.m13973("喵喵喵喵喵喵呜喵~喵喵喵喵喵喵呜喵~喵喵喵喵呜喵呜呜");
        }
        try {
            arrayList = Files.readAllLines(Paths.get(c59162.f16105, new String[0]));
        } catch (IOException unused) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() || !c59162.m11298()) {
            AbstractC6370.m11951(AbstractC8405.m13972(1092), c59162.f16105);
            try {
                arrayList2 = Files.readAllLines(Paths.get(c59162.f16105, new String[0]));
            } catch (IOException unused2) {
                arrayList2 = new ArrayList();
            }
            arrayList = arrayList2;
        }
        Object obj = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
        while (true) {
            String str = (String) obj;
            if (!str.isEmpty() && !str.startsWith(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵呜呜喵呜喵"))) {
                return str;
            }
            obj = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
        }
    }
}
