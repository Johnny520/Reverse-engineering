package top.suzhelan.qstory.hook.item;

import android.view.View;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.lang.reflect.Method;
import java.time.LocalDate;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQNTSendMsgUtils;
import lin.xposed.hook.util.qq.QQNTTroopTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p009.InterfaceC6152;
import p035.AbstractC6340;
import p322.C8724;
import p331.C8799;
import p336.AbstractC8805;
import p392.AbstractC9121;
import p392.AbstractC9124;
import p392.C9117;
import p392.C9125;
import p394.C9131;
import top.suzhelan.qstory.hook.api.C5815;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5820;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;", "L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5951 extends AbstractC8805 implements InterfaceC6152 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m11266(String str, String str2, String str3, String str4) {
        QQNTSendMsgUtils.sendText(QQSessionUtils.QQNT.getContact(1, QQEnvTool.getCurrentUin()), m11267(str, str2, str3, str4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m11267(String str, String str2, String str3, String str4) {
        String groupName = QQNTTroopTool.getGroupName(str4);
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937757851079148967L) + str + '\n');
        sb.append(AbstractC3056.m6668(-3937757863964050855L));
        sb.append(str2);
        AbstractC6136.m11547(-3937560690605426087L, sb, -3937669284558538151L);
        AbstractC6136.m11531(sb, str3, -3937560690605426087L);
        AbstractC6136.m11544(-3937757752294901159L, sb, groupName);
        AbstractC6136.m11544(-3937587577100699047L, sb, str4);
        sb.append(AbstractC3056.m6668(-3937587482611418535L));
        String string = sb.toString();
        AbstractC3056.m6668(-3937690351373125031L);
        return string;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        C8724.f24590.getClass();
        if (AbstractC6340.f17461 > 14200) {
            C2632.m5294(AbstractC3056.m6668(-3937822086610027943L));
            return;
        }
        int i = 1;
        if (LocalDate.now().isAfter(LocalDate.of(2026, 7, 1))) {
            C2632.m5294(AbstractC3056.m6668(-3937661914394658215L));
            return;
        }
        C5820 c5820 = C5816.f15946;
        C5907 c5907 = new C5907(this, i);
        AbstractC3056.m6668(-3937712899951429031L);
        AbstractC3056.m6668(-3937712629368489383L);
        C5816.f15943.add(new C5815(this, c5907));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937758353590322599L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) throws ClassNotFoundException {
        C8724.f24590.getClass();
        C9131 c9131 = new C9131();
        c9131.m14699(AbstractC3056.m6668(-3937822047955322279L));
        Class clsM14701 = c9131.m14701();
        AbstractC3056.m6668(-3937714995895469479L);
        clsM14701.getClass();
        C8724.m14400();
        String strM6668 = AbstractC3056.m6668(-3937659204270294439L);
        int i = C9117.f25488;
        C9117 c9117M14648 = C9117.m14648(AbstractC9121.m14657(strM6668));
        c9117M14648.f25490 = AbstractC3056.m6668(-3937614618214794663L);
        C9125 c9125M14680 = C9125.m14680(c9117M14648.m14653(null).getClass());
        c9125M14680.f25504 = AbstractC3056.m6668(-3937676560233137575L);
        c9125M14680.m14683(String.class, String.class, AbstractC9124.class, AbstractC9124.class, AbstractC9124.class, AbstractC9124.class);
        Class<?> cls = ((Method) c9125M14680.m14686()).getParameterTypes()[r6.getParameterTypes().length - 1];
        AbstractC3056.m6668(-3937714957240763815L);
        cls.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0148  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11268(java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5951.m11268(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11269(java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.hook.item.C5951.m11269(java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC5532(9);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        AbstractC3056.m6668(-3937706779623032231L);
        return c8799.f24759.intValue() >= 1;
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
    }
}
