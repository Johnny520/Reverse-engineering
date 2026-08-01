package p319;

import android.view.View;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.QQEnvTool;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import p346.C8836;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8677 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9095 f24479 = new C9095(AbstractC8405.m13972(1214), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ScheduledExecutorService f24480;

    public C8677() {
        AbstractC8405.m13972(1207);
        AbstractC8405.m13972(1212);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        this.f24480 = Executors.newSingleThreadScheduledExecutor();
        final int i = 1;
        new Thread(new Runnable(this) { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8677 f24481;

            {
                this.f24481 = this;
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
                C8677 c8677 = this.f24481;
                switch (i2) {
                    case 0:
                        C9095 c9095 = c8677.f24479;
                        ArrayList arrayListM14680 = c9095.m14680(String.class, AbstractC8405.m13972(1207));
                        if (!arrayListM14680.isEmpty()) {
                            c9095.m14677(new ArrayList(), AbstractC8405.m13972(1212));
                            Iterator it = arrayListM14680.iterator();
                            while (it.hasNext()) {
                                C8836.m14498((String) it.next(), QQEnvTool.getCurrentUin());
                            }
                            c9095.m14677(new ArrayList(arrayListM14680), AbstractC8405.m13972(1212));
                            break;
                        }
                        break;
                    default:
                        C9095 c90952 = c8677.f24479;
                        ArrayList<String> arrayListM146802 = c90952.m14680(String.class, AbstractC8405.m13972(1207));
                        if (!arrayListM146802.isEmpty()) {
                            ArrayList arrayListM146803 = c90952.m14680(String.class, AbstractC8405.m13972(1212));
                            for (String str : arrayListM146802) {
                                if (!arrayListM146803.contains(str)) {
                                    C8836.m14498(str, QQEnvTool.getCurrentUin());
                                    arrayListM146803.add(str);
                                }
                            }
                            c90952.m14677(arrayListM146803, AbstractC8405.m13972(1212));
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
        this.f24480.scheduleWithFixedDelay(new Runnable(this) { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8677 f24481;

            {
                this.f24481 = this;
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
                C8677 c8677 = this.f24481;
                switch (i22) {
                    case 0:
                        C9095 c9095 = c8677.f24479;
                        ArrayList arrayListM14680 = c9095.m14680(String.class, AbstractC8405.m13972(1207));
                        if (!arrayListM14680.isEmpty()) {
                            c9095.m14677(new ArrayList(), AbstractC8405.m13972(1212));
                            Iterator it = arrayListM14680.iterator();
                            while (it.hasNext()) {
                                C8836.m14498((String) it.next(), QQEnvTool.getCurrentUin());
                            }
                            c9095.m14677(new ArrayList(arrayListM14680), AbstractC8405.m13972(1212));
                            break;
                        }
                        break;
                    default:
                        C9095 c90952 = c8677.f24479;
                        ArrayList<String> arrayListM146802 = c90952.m14680(String.class, AbstractC8405.m13972(1207));
                        if (!arrayListM146802.isEmpty()) {
                            ArrayList arrayListM146803 = c90952.m14680(String.class, AbstractC8405.m13972(1212));
                            for (String str : arrayListM146802) {
                                if (!arrayListM146803.contains(str)) {
                                    C8836.m14498(str, QQEnvTool.getCurrentUin());
                                    arrayListM146803.add(str);
                                }
                            }
                            c90952.m14677(arrayListM146803, AbstractC8405.m13972(1212));
                            break;
                        }
                        break;
                }
            }
        }, calendar.getTimeInMillis() - timeInMillis, 86400000L, TimeUnit.MILLISECONDS);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1215);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 20);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }
}
