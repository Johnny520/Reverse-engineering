package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p391.C9114;
import p394.C9127;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5854 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ int f16010 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9114 f16011 = new C9114("ChatInputHint", 0);

    static {
        "ChatInputHint";
        "hint_text";
        "Hello World.";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[Catch: Exception -> 0x00e8, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e8, blocks: (B:22:0x00a2, B:24:0x00ab, B:26:0x00af, B:28:0x00b2, B:30:0x00cc, B:32:0x00e1), top: B:39:0x00a2 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.widget.EditText m11201(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.chat.C5854.m11201(java.lang.Object):android.widget.EditText");
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method methodM14693;
        "classLoader";
        classLoader.getClass();
        Method methodM146932 = null;
        try {
            C9127 c9127 = new C9127();
            c9127.m14689("com.tencent.mobileqq.aio.input.simpleui");
            c9127.m14688("binding", "inputRoot");
            methodM14693 = c9127.m14693();
        } catch (Exception unused) {
            methodM14693 = null;
        }
        if (methodM14693 != null) {
            try {
                XposedBridge.hookMethod(methodM14693, new C5855(this, 0));
            } catch (Exception unused2) {
            }
        }
        try {
            C9127 c91272 = new C9127();
            c91272.m14689("com.tencent.mobileqq.activity.aio.core", "com.tencent.mobileqq.activity.aio");
            c91272.m14688("input set error");
            methodM146932 = c91272.m14693();
        } catch (Exception unused3) {
        }
        if (methodM146932 != null) {
            try {
                XposedBridge.hookMethod(methodM146932, new C5855(this, 1));
            } catch (Exception unused4) {
            }
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u81ea\u5b9a\u4e49\u804a\u5929\u8f93\u5165\u6846\u7684\u63d0\u793a\u6587\u5b57";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final String m11202() {
        return this.f16011.m14641("hint_text", "Hello World.");
    }
}
