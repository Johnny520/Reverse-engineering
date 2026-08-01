package p335;

import android.view.View;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p303.AbstractC9234;
import p348.C9614;
import p353.AbstractC9632;
import p362.C9665;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9506 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9924 f24824 = new C9924(AbstractC9234.m14531(1214), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ScheduledExecutorService f24825;

    public C9506() {
        AbstractC9234.m14531(1207);
        AbstractC9234.m14531(1212);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        this.f24825 = Executors.newSingleThreadScheduledExecutor();
        final int i = 1;
        new Thread(new Runnable(this) { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C9506 f24826;

            {
                this.f24826 = this;
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
                C9506 c9506 = this.f24826;
                switch (i2) {
                    case 0:
                        C9924 c9924 = c9506.f24824;
                        ArrayList arrayListM15239 = c9924.m15239(String.class, AbstractC9234.m14531(1207));
                        if (!arrayListM15239.isEmpty()) {
                            c9924.m15236(new ArrayList(), AbstractC9234.m14531(1212));
                            Iterator it = arrayListM15239.iterator();
                            while (it.hasNext()) {
                                C9665.m15057((String) it.next(), QQEnvTool.getCurrentUin());
                            }
                            c9924.m15236(new ArrayList(arrayListM15239), AbstractC9234.m14531(1212));
                            break;
                        }
                        break;
                    default:
                        C9924 c99242 = c9506.f24824;
                        ArrayList<String> arrayListM152392 = c99242.m15239(String.class, AbstractC9234.m14531(1207));
                        if (!arrayListM152392.isEmpty()) {
                            ArrayList arrayListM152393 = c99242.m15239(String.class, AbstractC9234.m14531(1212));
                            for (String str : arrayListM152392) {
                                if (!arrayListM152393.contains(str)) {
                                    C9665.m15057(str, QQEnvTool.getCurrentUin());
                                    arrayListM152393.add(str);
                                }
                            }
                            c99242.m15236(arrayListM152393, AbstractC9234.m14531(1212));
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
        this.f24825.scheduleWithFixedDelay(new Runnable(this) { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C9506 f24826;

            {
                this.f24826 = this;
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
                C9506 c9506 = this.f24826;
                switch (i22) {
                    case 0:
                        C9924 c9924 = c9506.f24824;
                        ArrayList arrayListM15239 = c9924.m15239(String.class, AbstractC9234.m14531(1207));
                        if (!arrayListM15239.isEmpty()) {
                            c9924.m15236(new ArrayList(), AbstractC9234.m14531(1212));
                            Iterator it = arrayListM15239.iterator();
                            while (it.hasNext()) {
                                C9665.m15057((String) it.next(), QQEnvTool.getCurrentUin());
                            }
                            c9924.m15236(new ArrayList(arrayListM15239), AbstractC9234.m14531(1212));
                            break;
                        }
                        break;
                    default:
                        C9924 c99242 = c9506.f24824;
                        ArrayList<String> arrayListM152392 = c99242.m15239(String.class, AbstractC9234.m14531(1207));
                        if (!arrayListM152392.isEmpty()) {
                            ArrayList arrayListM152393 = c99242.m15239(String.class, AbstractC9234.m14531(1212));
                            for (String str : arrayListM152392) {
                                if (!arrayListM152393.contains(str)) {
                                    C9665.m15057(str, QQEnvTool.getCurrentUin());
                                    arrayListM152393.add(str);
                                }
                            }
                            c99242.m15236(arrayListM152393, AbstractC9234.m14531(1212));
                            break;
                        }
                        break;
                }
            }
        }, calendar.getTimeInMillis() - timeInMillis, 86400000L, TimeUnit.MILLISECONDS);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1215);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 20);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 1;
    }
}
