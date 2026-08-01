package p055;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.ViewOnClickListenerC0933;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p026.AbstractC7014;
import p040.AbstractC7138;
import p042.AbstractC7140;
import p044.DialogC7148;
import p045.C7149;
import p049.AbstractC7166;
import p049.C7164;
import p053.AbstractC7199;
import top.suzhelan.qstory.hook.item.C6746;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC7239 extends AbstractC7140 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EditText f17928;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7149 f17929;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f17930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DialogC7148 f17931;

    public ViewOnClickListenerC7239() {
        "PictureSummary";
        this.f17930 = new String[]{"J", "com.tencent.qqnt.kernel.nativeinterface.Contact", "java.util.ArrayList", "java.util.HashMap", "com.tencent.qqnt.kernel.nativeinterface.IOperateCallback"};
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C7164 c7164M12412 = C7164.m12412("com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy");
        c7164M12412.f17803.f3963 = "sendMsg";
        String[] strArr = this.f17930;
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = AbstractC7166.m12425(strArr[i]);
        }
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        m12390(c7164M12412.m12414(), new C3191(this, 11));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f17929 == null) {
            this.f17929 = new C7149("PictureSummary");
        }
        String string = this.f17928.getText().toString();
        AbstractC7014.m12151("设置为:" + string);
        this.f17929.m12395(string, "summary");
        this.f17929.mo12394();
        this.f17931.dismiss();
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "点击以设置图片/表情显示的文本";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC0933(this, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String m12526() {
        List arrayList;
        List arrayList2;
        LinkedHashMap linkedHashMap = AbstractC7138.f17769;
        C6746 c6746 = (C6746) linkedHashMap.get(C6746.class);
        if (!(c6746 == null ? false : c6746.f17770.booleanValue())) {
            if (this.f17929 == null) {
                this.f17929 = new C7149("PictureSummary");
            }
            return (String) this.f17929.m12398("summary");
        }
        C6746 c67462 = (C6746) linkedHashMap.get(C6746.class);
        if (c67462 == null) {
            return "qwq";
        }
        try {
            arrayList = Files.readAllLines(Paths.get(c67462.f16450, new String[0]));
        } catch (IOException unused) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() || !c67462.m11857()) {
            AbstractC7199.m12510("https://suzhelan.top/api/pan/direct/private/如果有人能懂我的忧郁.txt", c67462.f16450);
            try {
                arrayList2 = Files.readAllLines(Paths.get(c67462.f16450, new String[0]));
            } catch (IOException unused2) {
                arrayList2 = new ArrayList();
            }
            arrayList = arrayList2;
        }
        Object obj = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
        while (true) {
            String str = (String) obj;
            if (!str.isEmpty() && !str.startsWith("//")) {
                return str;
            }
            obj = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
        }
    }
}
