package p335;

import android.view.View;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p026.AbstractC7017;
import p348.C9614;
import p353.AbstractC9632;
import p362.C9665;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9504 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9924 f24820 = new C9924("AutoGroupCheckInPro", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ScheduledExecutorService f24821;

    public C9504() {
        "TroopUinList";
        "CheckedTroopsToday";
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        this.f24821 = Executors.newSingleThreadScheduledExecutor();
        String str = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        String strM14531 = "LastCheckDate";
        C9924 c9924 = this.f24820;
        if (c9924.m15237(strM14531, "").isEmpty()) {
            c9924.m15236(str, "LastCheckDate");
        }
        final int i = 0;
        new Thread(new Runnable(this) { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C9504 f24822;

            {
                this.f24822 = this;
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
                C9504 c9504 = this.f24822;
                switch (i2) {
                    case 0:
                        C9924 c99242 = c9504.f24820;
                        ArrayList<String> arrayListM15239 = c99242.m15239(String.class, "TroopUinList");
                        if (!arrayListM15239.isEmpty()) {
                            ArrayList arrayListM152392 = c99242.m15239(String.class, "CheckedTroopsToday");
                            for (String str2 : arrayListM15239) {
                                if (!arrayListM152392.contains(str2)) {
                                    C9665.m15057(str2, QQEnvTool.getCurrentUin());
                                    arrayListM152392.add(str2);
                                }
                            }
                            c99242.m15236(arrayListM152392, "CheckedTroopsToday");
                            break;
                        }
                        break;
                    default:
                        C9924 c99243 = c9504.f24820;
                        try {
                            String str3 = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Calendar.getInstance().getTime());
                            if (!str3.equals(c99243.m15237("LastCheckDate", ""))) {
                                c9504.m14958();
                                c99243.m15236(str3, "LastCheckDate");
                            }
                        } catch (Exception e) {
                            AbstractC7017.m12164("每日群打卡", "定时任务异常", e, true);
                        }
                        break;
                }
            }
        }).start();
        final int i2 = 1;
        this.f24821.scheduleWithFixedDelay(new Runnable(this) { // from class: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C9504 f24822;

            {
                this.f24822 = this;
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
                C9504 c9504 = this.f24822;
                switch (i22) {
                    case 0:
                        C9924 c99242 = c9504.f24820;
                        ArrayList<String> arrayListM15239 = c99242.m15239(String.class, "TroopUinList");
                        if (!arrayListM15239.isEmpty()) {
                            ArrayList arrayListM152392 = c99242.m15239(String.class, "CheckedTroopsToday");
                            for (String str2 : arrayListM15239) {
                                if (!arrayListM152392.contains(str2)) {
                                    C9665.m15057(str2, QQEnvTool.getCurrentUin());
                                    arrayListM152392.add(str2);
                                }
                            }
                            c99242.m15236(arrayListM152392, "CheckedTroopsToday");
                            break;
                        }
                        break;
                    default:
                        C9924 c99243 = c9504.f24820;
                        try {
                            String str3 = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Calendar.getInstance().getTime());
                            if (!str3.equals(c99243.m15237("LastCheckDate", ""))) {
                                c9504.m14958();
                                c99243.m15236(str3, "LastCheckDate");
                            }
                        } catch (Exception e) {
                            AbstractC7017.m12164("每日群打卡", "定时任务异常", e, true);
                        }
                        break;
                }
            }
        }, 0L, 1L, TimeUnit.SECONDS);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "点击可以配置开启的群聊,时间轮询实现,会大幅增加打卡精度和速度";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 21);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14958() {
        String strM14531 = "TroopUinList";
        C9924 c9924 = this.f24820;
        ArrayList arrayListM15239 = c9924.m15239(String.class, strM14531);
        if (arrayListM15239.isEmpty()) {
            return;
        }
        c9924.m15236(new ArrayList(), "CheckedTroopsToday");
        Iterator it = arrayListM15239.iterator();
        while (it.hasNext()) {
            C9665.m15057((String) it.next(), QQEnvTool.getCurrentUin());
        }
        c9924.m15236(arrayListM15239, "CheckedTroopsToday");
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 1;
    }
}
