package p320;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
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
import p010.AbstractC6157;
import p331.C8799;
import p336.AbstractC8805;
import p346.C8849;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8708 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9114 f24565 = new C9114("AutoGroupCheckInPro", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ScheduledExecutorService f24566;

    public C8708() {
        "TroopUinList";
        "CheckedTroopsToday";
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        this.f24566 = Executors.newSingleThreadScheduledExecutor();
        String str = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        String strM6668 = "LastCheckDate";
        String strM66682 = "";
        C9114 c9114 = this.f24565;
        if (c9114.m14641(strM6668, strM66682).isEmpty()) {
            c9114.m14640(str, "LastCheckDate");
        }
        final int i = 0;
        new Thread(new Runnable(this) { // from class: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8708 f24567;

            {
                this.f24567 = this;
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
                C8708 c8708 = this.f24567;
                switch (i2) {
                    case 0:
                        C9114 c91142 = c8708.f24565;
                        ArrayList<String> arrayListM14643 = c91142.m14643(String.class, "TroopUinList");
                        if (!arrayListM14643.isEmpty()) {
                            ArrayList arrayListM146432 = c91142.m14643(String.class, "CheckedTroopsToday");
                            for (String str2 : arrayListM14643) {
                                if (!arrayListM146432.contains(str2)) {
                                    C8849.m14483(str2, QQEnvTool.getCurrentUin());
                                    arrayListM146432.add(str2);
                                }
                            }
                            c91142.m14640(arrayListM146432, "CheckedTroopsToday");
                            break;
                        }
                        break;
                    default:
                        C9114 c91143 = c8708.f24565;
                        try {
                            String str3 = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Calendar.getInstance().getTime());
                            if (!str3.equals(c91143.m14641("LastCheckDate", ""))) {
                                c8708.m14388();
                                c91143.m14640(str3, "LastCheckDate");
                            }
                        } catch (Exception e) {
                            AbstractC6157.m11574("\u6bcf\u65e5\u7fa4\u6253\u5361", "\u5b9a\u65f6\u4efb\u52a1\u5f02\u5e38", e, true);
                        }
                        break;
                }
            }
        }).start();
        final int i2 = 1;
        this.f24566.scheduleWithFixedDelay(new Runnable(this) { // from class: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪世兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8708 f24567;

            {
                this.f24567 = this;
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
                C8708 c8708 = this.f24567;
                switch (i22) {
                    case 0:
                        C9114 c91142 = c8708.f24565;
                        ArrayList<String> arrayListM14643 = c91142.m14643(String.class, "TroopUinList");
                        if (!arrayListM14643.isEmpty()) {
                            ArrayList arrayListM146432 = c91142.m14643(String.class, "CheckedTroopsToday");
                            for (String str2 : arrayListM14643) {
                                if (!arrayListM146432.contains(str2)) {
                                    C8849.m14483(str2, QQEnvTool.getCurrentUin());
                                    arrayListM146432.add(str2);
                                }
                            }
                            c91142.m14640(arrayListM146432, "CheckedTroopsToday");
                            break;
                        }
                        break;
                    default:
                        C9114 c91143 = c8708.f24565;
                        try {
                            String str3 = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Calendar.getInstance().getTime());
                            if (!str3.equals(c91143.m14641("LastCheckDate", ""))) {
                                c8708.m14388();
                                c91143.m14640(str3, "LastCheckDate");
                            }
                        } catch (Exception e) {
                            AbstractC6157.m11574("\u6bcf\u65e5\u7fa4\u6253\u5361", "\u5b9a\u65f6\u4efb\u52a1\u5f02\u5e38", e, true);
                        }
                        break;
                }
            }
        }, 0L, 1L, TimeUnit.SECONDS);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u70b9\u51fb\u53ef\u4ee5\u914d\u7f6e\u5f00\u542f\u7684\u7fa4\u804a,\u65f6\u95f4\u8f6e\u8be2\u5b9e\u73b0,\u4f1a\u5927\u5e45\u589e\u52a0\u6253\u5361\u7cbe\u5ea6\u548c\u901f\u5ea6";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 22);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14388() {
        String strM6668 = "TroopUinList";
        C9114 c9114 = this.f24565;
        ArrayList arrayListM14643 = c9114.m14643(String.class, strM6668);
        if (arrayListM14643.isEmpty()) {
            return;
        }
        c9114.m14640(new ArrayList(), "CheckedTroopsToday");
        Iterator it = arrayListM14643.iterator();
        while (it.hasNext()) {
            C8849.m14483((String) it.next(), QQEnvTool.getCurrentUin());
        }
        c9114.m14640(arrayListM14643, "CheckedTroopsToday");
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }
}
