package p126ia;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b5.C0184c;
import p065eb.C0884o;
import p085fg.InterfaceC1231l;
import p144k.C2209s1;
import p230p8.C3360l;
import p276sf.C3967n;
import p332wb.C5026jv;
import p332wb.C5491y2;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ia.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2016j implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6801g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2023q f6802h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f6803i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Activity f6804j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C3360l f6805k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2016j(C2023q c2023q, String str, Activity activity, C3360l c3360l) {
        this.f6801g = 1;
        this.f6802h = c2023q;
        this.f6803i = str;
        this.f6804j = activity;
        this.f6805k = c3360l;
    }

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
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f6801g) {
            case 0:
                List list = (List) obj;
                list.getClass();
                C5026jv c5026jv = (C5026jv) AbstractC4166m.m8400I1(list);
                if (c5026jv != null) {
                    String str = c5026jv.f18250b;
                    Activity activity = this.f6804j;
                    C5491y2.m9824c2(activity, "填写伪评论", str, null, "请输入评论内容", 1000, false, new C0884o(activity, this.f6802h, this.f6803i, c5026jv, this.f6805k), new C2209s1(7), 584);
                }
                return C3967n.f12976a;
            case 1:
                List<C5026jv> list2 = (List) obj;
                list2.getClass();
                C2023q c2023q = this.f6802h;
                C0184c c0184c = c2023q.f6841a;
                String str2 = this.f6803i;
                C2009c c2009cM815l = c0184c.m815l(str2);
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                for (C5026jv c5026jv2 : list2) {
                    arrayList.add(new C2010d(c5026jv2.f18249a, c5026jv2.f18250b));
                }
                List list3 = arrayList;
                if (c2023q.f6844d.getBoolean("fake_like_random_order", false)) {
                    List listM8410S1 = AbstractC4166m.m8410S1(arrayList);
                    Collections.shuffle(listM8410S1);
                    list3 = listM8410S1;
                }
                c0184c.m802T(str2, list3);
                C2007a0 c2007a0 = c2023q.f6842b;
                Activity activity2 = this.f6804j;
                c2007a0.m4947a(activity2, this.f6805k, c2009cM815l);
                C2023q.m4975j(activity2, list2.isEmpty() ? "已恢复真实点赞" : "伪集赞已更新");
                break;
            default:
                List list4 = (List) obj;
                list4.getClass();
                Activity activity3 = this.f6804j;
                C5491y2.m9807U1(activity3, list4, new C2016j(activity3, this.f6802h, this.f6803i, this.f6805k, 0), new C2209s1(7), "选择评论好友", "下一步", false, null, null, true, 2944);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C2016j(Activity activity, C2023q c2023q, String str, C3360l c3360l, int i9) {
        this.f6801g = i9;
        this.f6804j = activity;
        this.f6802h = c2023q;
        this.f6803i = str;
        this.f6805k = c3360l;
    }
}
