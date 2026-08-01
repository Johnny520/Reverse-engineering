package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p287.AbstractC8405;
import p391.C9095;
import p392.C9098;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5859 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ int f16017 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9095 f16018 = new C9095(AbstractC8405.m13972(2147), 0);

    static {
        AbstractC8405.m13972(2147);
        AbstractC8405.m13972(2153);
        AbstractC8405.m13972(2154);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[Catch: Exception -> 0x00d6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d6, blocks: (B:22:0x0093, B:24:0x009c, B:26:0x00a0, B:28:0x00a3, B:30:0x00ba, B:32:0x00cf), top: B:39:0x0093 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.widget.EditText m11263(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.chat.C5859.m11263(java.lang.Object):android.widget.EditText");
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method methodM14686;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Method methodM146862 = null;
        try {
            C9098 c9098 = new C9098();
            c9098.m14688(AbstractC8405.m13972(188));
            c9098.m14687(AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵"), AbstractC8405.m13972(2149));
            methodM14686 = c9098.m14686();
        } catch (Exception unused) {
            methodM14686 = null;
        }
        if (methodM14686 != null) {
            try {
                XposedBridge.hookMethod(methodM14686, new C5860(this, 0));
            } catch (Exception unused2) {
            }
        }
        try {
            C9098 c90982 = new C9098();
            c90982.m14688(AbstractC8405.m13972(2150), AbstractC8405.m13972(2151));
            c90982.m14687(AbstractC8405.m13972(2152));
            methodM146862 = c90982.m14686();
        } catch (Exception unused3) {
        }
        if (methodM146862 != null) {
            try {
                XposedBridge.hookMethod(methodM146862, new C5860(this, 1));
            } catch (Exception unused4) {
            }
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2148);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final String m11264() {
        return this.f16018.m14678(AbstractC8405.m13972(2153), AbstractC8405.m13972(2154));
    }
}
