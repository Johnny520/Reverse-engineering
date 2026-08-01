package p038;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.ViewOnClickListenerC0086;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p010.AbstractC6154;
import p024.AbstractC6291;
import p026.AbstractC6293;
import p027.DialogC6300;
import p028.C6301;
import p032.AbstractC6318;
import p032.C6316;
import p036.AbstractC6353;
import top.suzhelan.qstory.hook.item.C5910;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC6416 extends AbstractC6293 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public EditText f17577;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C6301 f17578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f17579;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public DialogC6300 f17580;

    public ViewOnClickListenerC6416() {
        "PictureSummary";
        this.f17579 = new String[]{"J", "com.tencent.qqnt.kernel.nativeinterface.Contact", "java.util.ArrayList", "java.util.HashMap", "com.tencent.qqnt.kernel.nativeinterface.IOperateCallback"};
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        C6316 c6316M11825 = C6316.m11825("com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy");
        c6316M11825.f17409.f3617 = "sendMsg";
        String[] strArr = this.f17579;
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = AbstractC6318.m11838(strArr[i]);
        }
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        m11803(c6316M11825.m11827(), new C2358(this, 11));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f17578 == null) {
            this.f17578 = new C6301("PictureSummary");
        }
        String string = this.f17577.getText().toString();
        AbstractC6154.m11561("\u8bbe\u7f6e\u4e3a:" + string);
        this.f17578.m11808(string, "summary");
        this.f17578.mo11807();
        this.f17580.dismiss();
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u70b9\u51fb\u4ee5\u8bbe\u7f6e\u56fe\u7247/\u8868\u60c5\u663e\u793a\u7684\u6587\u672c";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC0086(this, 4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String m11928() {
        List arrayList;
        List arrayList2;
        LinkedHashMap linkedHashMap = AbstractC6291.f17375;
        C5910 c5910 = (C5910) linkedHashMap.get(C5910.class);
        if (!(c5910 == null ? false : c5910.f17376.booleanValue())) {
            if (this.f17578 == null) {
                this.f17578 = new C6301("PictureSummary");
            }
            return (String) this.f17578.m11811("summary");
        }
        C5910 c59102 = (C5910) linkedHashMap.get(C5910.class);
        if (c59102 == null) {
            return "qwq";
        }
        try {
            arrayList = Files.readAllLines(Paths.get(c59102.f16096, new String[0]));
        } catch (IOException unused) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() || !c59102.m11237()) {
            AbstractC6353.m11903("https://suzhelan.top/api/pan/direct/private/\u5982\u679c\u6709\u4eba\u80fd\u61c2\u6211\u7684\u5fe7\u90c1.txt", c59102.f16096);
            try {
                arrayList2 = Files.readAllLines(Paths.get(c59102.f16096, new String[0]));
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
