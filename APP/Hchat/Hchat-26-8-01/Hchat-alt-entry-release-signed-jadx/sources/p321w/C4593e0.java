package p321w;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import ci.C0589j;
import java.util.List;
import okhttp3.HttpUrl;
import p003a2.C0014a;
import p024b9.RunnableC0217c;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p100h0.C1511d1;
import p116i.C1739c;
import p117i0.InterfaceC1809a1;
import p218og.C3147k;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p258r8.RunnableC3737b;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.C5000j5;
import p332wb.C5071la;
import p332wb.C5130n3;
import p332wb.C5297s5;
import p370yf.AbstractC6044i;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: w.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4593e0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f15135h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f15136i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f15137j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f15138k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f15139l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4593e0(Object obj, Object obj2, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f15135h = i9;
        this.f15136i = obj;
        this.f15137j = obj2;
        this.f15138k = interfaceC1809a1;
        this.f15139l = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f15135h) {
            case 0:
                C4593e0 c4593e0 = new C4593e0((InterfaceC3918x) this.f15137j, (InterfaceC4647y0) this.f15138k, (C1511d1) this.f15139l, interfaceC5557c, 0);
                c4593e0.f15136i = obj;
                return c4593e0;
            case 1:
                C4593e0 c4593e02 = new C4593e0((InterfaceC1809a1) this.f15137j, (InterfaceC1809a1) this.f15138k, (InterfaceC1809a1) this.f15139l, interfaceC5557c, 1);
                c4593e02.f15136i = obj;
                return c4593e02;
            case 2:
                return new C4593e0((Context) this.f15136i, (InterfaceC1809a1) this.f15137j, (InterfaceC1809a1) this.f15138k, (InterfaceC1809a1) this.f15139l, interfaceC5557c, 2);
            case 3:
                return new C4593e0((C5297s5) this.f15136i, (SharedPreferences) this.f15137j, (InterfaceC1809a1) this.f15138k, (InterfaceC1809a1) this.f15139l, interfaceC5557c, 3);
            default:
                C4593e0 c4593e03 = new C4593e0((C1739c) this.f15137j, (C1739c) this.f15138k, (C1739c) this.f15139l, interfaceC5557c, 4);
                c4593e03.f15136i = obj;
                return c4593e03;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f15135h) {
            case 0:
                C4593e0 c4593e0 = (C4593e0) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n = C3967n.f12976a;
                c4593e0.invokeSuspend(c3967n);
                return c3967n;
            case 1:
                C4593e0 c4593e02 = (C4593e0) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n2 = C3967n.f12976a;
                c4593e02.invokeSuspend(c3967n2);
                return c3967n2;
            case 2:
                C4593e0 c4593e03 = (C4593e0) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n3 = C3967n.f12976a;
                c4593e03.invokeSuspend(c3967n3);
                return c3967n3;
            case 3:
                C4593e0 c4593e04 = (C4593e0) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n4 = C3967n.f12976a;
                c4593e04.invokeSuspend(c3967n4);
                return c3967n4;
            default:
                C4593e0 c4593e05 = (C4593e0) create(interfaceC3599t, interfaceC5557c);
                C3967n c3967n5 = C3967n.f12976a;
                c4593e05.invokeSuspend(c3967n5);
                return c3967n5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f15135h;
        InterfaceC5557c interfaceC5557c = null;
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f15139l;
        Object obj3 = this.f15138k;
        Object obj4 = this.f15137j;
        switch (i9) {
            case 0:
                AbstractC1089i.m2732I0(obj);
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f15136i;
                InterfaceC3918x interfaceC3918x = (InterfaceC3918x) obj4;
                AbstractC3603v.m7563q(interfaceC3599t, null, new C4590d0(interfaceC3918x, (InterfaceC4647y0) obj3, interfaceC5557c, 0), 1);
                AbstractC3603v.m7563q(interfaceC3599t, null, new C0589j(interfaceC3918x, (C1511d1) obj2, (InterfaceC5557c) null, 18), 1);
                break;
            case 1:
                InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f15136i;
                AbstractC1089i.m2732I0(obj);
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj4;
                C3147k c3147k = AbstractC4955ho.f17686a;
                interfaceC1809a1.setValue(Boolean.TRUE);
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj3;
                interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                WeChatApis.contact().getClass();
                C1368i c1368i = WeChatApis.contactApi;
                if (c1368i != null && c1368i.m3704G()) {
                    new Thread(new RunnableC0217c(interfaceC3599t2, c1368i, (InterfaceC1809a1) obj2, (InterfaceC1809a1) obj3, (InterfaceC1809a1) obj4), "HchatAutoReplyLabels").start();
                } else {
                    ((InterfaceC1809a1) obj2).setValue(C4173t.f13710g);
                    interfaceC1809a12.setValue("联系人标签不可用");
                    interfaceC1809a1.setValue(Boolean.FALSE);
                }
                break;
            case 2:
                AbstractC1089i.m2732I0(obj);
                C5071la c5071la = new C5071la((InterfaceC1809a1) obj4, (InterfaceC1809a1) obj3, (InterfaceC1809a1) obj2, 17);
                C3147k c3147k2 = AbstractC4955ho.f17686a;
                C1368i c1368iM9259c = AbstractC4855en.m9259c();
                if (c1368iM9259c != null && c1368iM9259c.m3704G()) {
                    new Thread(new RunnableC3737b(c1368iM9259c, new Handler(Looper.getMainLooper()), c5071la, 4), "HchatMessageBlockContacts").start();
                } else {
                    c5071la.invoke(new C5000j5(), new IllegalStateException("联系人列表不可用"));
                }
                break;
            case 3:
                AbstractC1089i.m2732I0(obj);
                if (((C5297s5) this.f15136i).f20571c) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) obj4).edit();
                    C3147k c3147k3 = AbstractC4955ho.f17686a;
                    editorEdit.putString("message_block_templates", C0014a.m177g((List) ((InterfaceC1809a1) obj3).getValue())).putString("message_block_bindings", C0014a.m175e((List) ((InterfaceC1809a1) obj2).getValue())).apply();
                }
                break;
            default:
                InterfaceC3599t interfaceC3599t3 = (InterfaceC3599t) this.f15136i;
                AbstractC1089i.m2732I0(obj);
                AbstractC3603v.m7563q(interfaceC3599t3, null, new C5130n3((C1739c) obj4, null, 7), 3);
                AbstractC3603v.m7563q(interfaceC3599t3, null, new C5130n3((C1739c) obj3, null, 8), 3);
                AbstractC3603v.m7563q(interfaceC3599t3, null, new C5130n3((C1739c) obj2, null, 9), 3);
                break;
        }
        return c3967n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4593e0(Object obj, Object obj2, Object obj3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f15135h = i9;
        this.f15137j = obj;
        this.f15138k = obj2;
        this.f15139l = obj3;
    }
}
