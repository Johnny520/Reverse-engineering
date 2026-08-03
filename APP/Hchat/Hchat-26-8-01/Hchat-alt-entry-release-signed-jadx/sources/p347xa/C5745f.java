package p347xa;

import android.app.Activity;
import android.widget.Toast;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p085fg.InterfaceC1220a;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p116i.C1739c;
import p144k.C2209s1;
import p172lg.C2563c;
import p172lg.C2564d;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3958e;
import p276sf.C3960g;
import p276sf.C3967n;
import p321w.C4593e0;
import p332wb.C4819dj;
import p332wb.C5491y2;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: xa.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5745f implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23396g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f23397h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f23398i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f23399j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f23400k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5745f(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f23396g = i9;
        this.f23397h = obj;
        this.f23398i = obj2;
        this.f23399j = obj3;
        this.f23400k = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f23396g) {
            case 0:
                C5752m c5752m = (C5752m) this.f23398i;
                Activity activity = (Activity) this.f23399j;
                C5748i c5748i = (C5748i) this.f23400k;
                Activity activity2 = c5748i.f23406a;
                Object obj = this.f23397h;
                Throwable thM8182b = C3960g.m8182b(obj);
                if (thM8182b == null) {
                    List<ContactLabelBean> list = (List) obj;
                    if (list.isEmpty()) {
                        c5752m.getClass();
                        if (C5752m.m10441a(activity)) {
                            Toast.makeText(activity, "暂无好友标签，请先新建标签", 0).show();
                        }
                    } else {
                        c5752m.getClass();
                        if (C5752m.m10441a(activity2)) {
                            C2564d c2564dM45X = AbstractC0000a.m45X(list);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = c2564dM45X.iterator();
                            while (true) {
                                C2563c c2563c = (C2563c) it;
                                if (c2563c.f8317i) {
                                    Object next = c2563c.next();
                                    if (((ContactLabelBean) list.get(((Number) next).intValue())).userNameList.contains(c5748i.f23407b)) {
                                        arrayList.add(next);
                                    }
                                } else {
                                    Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
                                    ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
                                    for (ContactLabelBean contactLabelBean : list) {
                                        String str = contactLabelBean.labelName;
                                        if (AbstractC3149m.m6721t0(str)) {
                                            str = contactLabelBean.labelId;
                                        }
                                        arrayList2.add(new C3958e(str, AbstractC3199a.m6836i(contactLabelBean.userNameList.size(), " 位好友")));
                                    }
                                    C5491y2.m9818Z1(activity2, "设置好友标签", "取消全部勾选可清空该好友的标签", arrayList2, setM8412U1, new C4819dj(c5752m, c5748i, list, 12), new C2209s1(7), Opcodes.ACC_NATIVE);
                                }
                            }
                        }
                    }
                } else {
                    c5752m.f23414b.invoke("载入好友标签失败", thM8182b);
                    if (C5752m.m10441a(activity)) {
                        Toast.makeText(activity, "载入好友标签失败", 0).show();
                    }
                }
                break;
            default:
                AbstractC3603v.m7563q((InterfaceC3599t) this.f23397h, null, new C4593e0((C1739c) this.f23398i, (C1739c) this.f23399j, (C1739c) this.f23400k, null, 4), 3);
                break;
        }
        return C3967n.f12976a;
    }
}
