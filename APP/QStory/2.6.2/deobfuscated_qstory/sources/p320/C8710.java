package p320;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.QQEnvTool;
import p331.C8799;
import p336.AbstractC8805;
import p346.C8849;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8710 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9114 f24569 = new C9114("AutoGroupCheckInCommon", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ScheduledExecutorService f24570;

    public C8710() {
        "TroopUinList";
        "CheckedTroopsToday";
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        this.f24570 = Executors.newSingleThreadScheduledExecutor();
        final int i = 1;
        new Thread(new Runnable(this) { // from class: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8710 f24571;

            {
                this.f24571 = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                C8710 c8710 = this.f24571;
                switch (i2) {
                    case 0:
                        C9114 c9114 = c8710.f24569;
                        ArrayList arrayListM14643 = c9114.m14643(String.class, "TroopUinList");
                        if (!arrayListM14643.isEmpty()) {
                            c9114.m14640(new ArrayList(), "CheckedTroopsToday");
                            Iterator it = arrayListM14643.iterator();
                            while (it.hasNext()) {
                                C8849.m14483((String) it.next(), QQEnvTool.getCurrentUin());
                            }
                            c9114.m14640(new ArrayList(arrayListM14643), "CheckedTroopsToday");
                            break;
                        }
                        break;
                    default:
                        C9114 c91142 = c8710.f24569;
                        ArrayList<String> arrayListM146432 = c91142.m14643(String.class, "TroopUinList");
                        if (!arrayListM146432.isEmpty()) {
                            ArrayList arrayListM146433 = c91142.m14643(String.class, "CheckedTroopsToday");
                            for (String str : arrayListM146432) {
                                if (!arrayListM146433.contains(str)) {
                                    C8849.m14483(str, QQEnvTool.getCurrentUin());
                                    arrayListM146433.add(str);
                                }
                            }
                            c91142.m14640(arrayListM146433, "CheckedTroopsToday");
                            break;
                        }
                        break;
                }
            }
        }).start();
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(6, 1);
        final int i2 = 0;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.f24570.scheduleWithFixedDelay(new Runnable(this) { // from class: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8710 f24571;

            {
                this.f24571 = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                C8710 c8710 = this.f24571;
                switch (i22) {
                    case 0:
                        C9114 c9114 = c8710.f24569;
                        ArrayList arrayListM14643 = c9114.m14643(String.class, "TroopUinList");
                        if (!arrayListM14643.isEmpty()) {
                            c9114.m14640(new ArrayList(), "CheckedTroopsToday");
                            Iterator it = arrayListM14643.iterator();
                            while (it.hasNext()) {
                                C8849.m14483((String) it.next(), QQEnvTool.getCurrentUin());
                            }
                            c9114.m14640(new ArrayList(arrayListM14643), "CheckedTroopsToday");
                            break;
                        }
                        break;
                    default:
                        C9114 c91142 = c8710.f24569;
                        ArrayList<String> arrayListM146432 = c91142.m14643(String.class, "TroopUinList");
                        if (!arrayListM146432.isEmpty()) {
                            ArrayList arrayListM146433 = c91142.m14643(String.class, "CheckedTroopsToday");
                            for (String str : arrayListM146432) {
                                if (!arrayListM146433.contains(str)) {
                                    C8849.m14483(str, QQEnvTool.getCurrentUin());
                                    arrayListM146433.add(str);
                                }
                            }
                            c91142.m14640(arrayListM146433, "CheckedTroopsToday");
                            break;
                        }
                        break;
                }
            }
        }, calendar.getTimeInMillis() - timeInMillis, 86400000L, TimeUnit.MILLISECONDS);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u70b9\u51fb\u53ef\u4ee5\u914d\u7f6e\u5f00\u542f\u7684\u7fa4\u804a,\u5982\u679c\u57289.1.35\u9644\u8fd1\u7684\u7248\u672c,\u53ef\u4ee5\u4f7f\u7528\u6b64\u6253\u5361";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 21);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }
}
