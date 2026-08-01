package p088s0;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.List;
import p003B0.AbstractC0055a;
import p004C.C0060d;
import p027N0.AbstractC0223g;
import p090t0.AbstractC1008c;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: s0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0975I extends AbstractC1008c {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0976J f3487h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f3488i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ List f3489j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975I(C0976J c0976j, String str, List list, Context context) {
        super(context, 0);
        this.f3487h = c0976j;
        this.f3488i = str;
        this.f3489j = list;
        AbstractC0223g.m415b(context);
    }

    /* JADX DEBUG: Class process forced to load method for inline: s0.J.E(s0.J):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // p090t0.AbstractC1008c
    /* JADX INFO: renamed from: e */
    public final View mo2152e(AbstractC1008c abstractC1008c) {
        if (Build.VERSION.SDK_INT >= 29) {
            setForceDarkAllowed(false);
        }
        boolean z2 = AbstractC1126i.f3786a;
        boolean zM2446v = C1124g.m2446v();
        C0976J c0976j = this.f3487h;
        abstractC1008c.setBackgroundColor(zM2446v ? c0976j.getPAGE_BG_COLOR() : 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(c0976j.getPAGE_BG_COLOR());
        String str = this.f3488i;
        linearLayout.addView(C0976J.m2156D(c0976j, str, this));
        ScrollView scrollView = new ScrollView(linearLayout.getContext());
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        scrollView.setBackgroundColor(c0976j.getPAGE_BG_COLOR());
        scrollView.setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout2 = new LinearLayout(scrollView.getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setPadding(0, AbstractC0055a.m101b(8), 0, AbstractC0055a.m101b(24));
        linearLayout2.setBackgroundColor(c0976j.getPAGE_BG_COLOR());
        linearLayout2.addView(C0976J.m2169z(c0976j, str));
        linearLayout2.addView(c0976j.m2187u(str));
        LinearLayout linearLayoutM2183q = c0976j.m2183q();
        for (C0973G c0973g : this.f3489j) {
            linearLayoutM2183q.addView(C0976J.m2168w(c0976j, c0973g.f3481a, c0973g.f3482b, ((Boolean) c0973g.f3483c.mo7b()).booleanValue(), c0973g.f3484d, new C0060d(12, c0973g)));
            if (AbstractC0223g.m414a(c0973g.f3481a, "快捷加入名单")) {
                linearLayoutM2183q.addView(C0976J.m2153A(c0976j));
            }
        }
        if (str.equals("消息提醒")) {
            linearLayoutM2183q.addView(C0976J.m2155C(c0976j));
        }
        if (str.equals("快捷功能")) {
            linearLayoutM2183q.addView(C0976J.m2154B(c0976j));
        }
        if (str.equals("朋友圈隐藏")) {
            View viewM2185s = c0976j.m2185s("管理隐藏内容", "恢复或清空已隐藏的自己朋友圈内容");
            viewM2185s.setOnClickListener(new ViewOnClickListenerC1000v(c0976j, 7));
            linearLayoutM2183q.addView(viewM2185s);
        }
        linearLayout2.addView(linearLayoutM2183q);
        scrollView.addView(linearLayout2);
        linearLayout.addView(scrollView);
        return c0976j.m2181U(linearLayout);
    }
}
