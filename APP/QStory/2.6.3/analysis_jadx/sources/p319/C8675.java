package p319;

import android.view.View;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.QQEnvTool;
import p010.AbstractC6188;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import p346.C8836;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8675 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9095 f24475 = new C9095(AbstractC8405.m13972(1216), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ScheduledExecutorService f24476;

    public C8675() {
        AbstractC8405.m13972(1207);
        AbstractC8405.m13972(1212);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        this.f24476 = Executors.newSingleThreadScheduledExecutor();
        String str = new SimpleDateFormat(AbstractC8405.m13972(1218), Locale.getDefault()).format(new Date());
        String strM13972 = AbstractC8405.m13972(1219);
        C9095 c9095 = this.f24475;
        if (c9095.m14678(strM13972, "").isEmpty()) {
            c9095.m14677(str, AbstractC8405.m13972(1219));
        }
        final int i = 0;
        new Thread(new Runnable(this) { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8675 f24477;

            {
                this.f24477 = this;
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
                C8675 c8675 = this.f24477;
                switch (i2) {
                    case 0:
                        C9095 c90952 = c8675.f24475;
                        ArrayList<String> arrayListM14680 = c90952.m14680(String.class, AbstractC8405.m13972(1207));
                        if (!arrayListM14680.isEmpty()) {
                            ArrayList arrayListM146802 = c90952.m14680(String.class, AbstractC8405.m13972(1212));
                            for (String str2 : arrayListM14680) {
                                if (!arrayListM146802.contains(str2)) {
                                    C8836.m14498(str2, QQEnvTool.getCurrentUin());
                                    arrayListM146802.add(str2);
                                }
                            }
                            c90952.m14677(arrayListM146802, AbstractC8405.m13972(1212));
                            break;
                        }
                        break;
                    default:
                        C9095 c90953 = c8675.f24475;
                        try {
                            String str3 = new SimpleDateFormat(AbstractC8405.m13972(1218), Locale.getDefault()).format(Calendar.getInstance().getTime());
                            if (!str3.equals(c90953.m14678(AbstractC8405.m13972(1219), ""))) {
                                c8675.m14399();
                                c90953.m14677(str3, AbstractC8405.m13972(1219));
                            }
                        } catch (Exception e) {
                            AbstractC6188.m11605(AbstractC8405.m13972(1220), AbstractC8405.m13972(1171), e, true);
                        }
                        break;
                }
            }
        }).start();
        final int i2 = 1;
        this.f24476.scheduleWithFixedDelay(new Runnable(this) { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8675 f24477;

            {
                this.f24477 = this;
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
                C8675 c8675 = this.f24477;
                switch (i22) {
                    case 0:
                        C9095 c90952 = c8675.f24475;
                        ArrayList<String> arrayListM14680 = c90952.m14680(String.class, AbstractC8405.m13972(1207));
                        if (!arrayListM14680.isEmpty()) {
                            ArrayList arrayListM146802 = c90952.m14680(String.class, AbstractC8405.m13972(1212));
                            for (String str2 : arrayListM14680) {
                                if (!arrayListM146802.contains(str2)) {
                                    C8836.m14498(str2, QQEnvTool.getCurrentUin());
                                    arrayListM146802.add(str2);
                                }
                            }
                            c90952.m14677(arrayListM146802, AbstractC8405.m13972(1212));
                            break;
                        }
                        break;
                    default:
                        C9095 c90953 = c8675.f24475;
                        try {
                            String str3 = new SimpleDateFormat(AbstractC8405.m13972(1218), Locale.getDefault()).format(Calendar.getInstance().getTime());
                            if (!str3.equals(c90953.m14678(AbstractC8405.m13972(1219), ""))) {
                                c8675.m14399();
                                c90953.m14677(str3, AbstractC8405.m13972(1219));
                            }
                        } catch (Exception e) {
                            AbstractC6188.m11605(AbstractC8405.m13972(1220), AbstractC8405.m13972(1171), e, true);
                        }
                        break;
                }
            }
        }, 0L, 1L, TimeUnit.SECONDS);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1217);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 21);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14399() {
        String strM13972 = AbstractC8405.m13972(1207);
        C9095 c9095 = this.f24475;
        ArrayList arrayListM14680 = c9095.m14680(String.class, strM13972);
        if (arrayListM14680.isEmpty()) {
            return;
        }
        c9095.m14677(new ArrayList(), AbstractC8405.m13972(1212));
        Iterator it = arrayListM14680.iterator();
        while (it.hasNext()) {
            C8836.m14498((String) it.next(), QQEnvTool.getCurrentUin());
        }
        c9095.m14677(arrayListM14680, AbstractC8405.m13972(1212));
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }
}
