package p109hb;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.lifecycle.C0119x;
import bsh.C0353j;
import ca.RunnableC0537x;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.C1423s;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p011ab.C0042b;
import p036c9.RunnableC0487t;
import p051db.C0763a;
import p071f1.C1021p;
import p085fg.InterfaceC1236q;
import p096g8.C1368i;
import p099h.AbstractC1443b;
import p099h.C1489u0;
import p099h.C1491v0;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p100h0.C1545q0;
import p116i.AbstractC1781q;
import p116i.InterfaceC1783q1;
import p116i.InterfaceC1805z;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p136j8.C2097h;
import p136j8.C2104o;
import p136j8.C2105p;
import p153k8.C2343g;
import p153k8.C2355s;
import p162l3.C2466t;
import p162l3.C2467u;
import p178m3.C2775a;
import p178m3.C2776b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p227p4.AbstractC3303h;
import p227p4.AbstractC3306k;
import p227p4.AbstractC3319x;
import p227p4.C3293a;
import p227p4.C3294a0;
import p227p4.C3296b0;
import p227p4.C3301f;
import p227p4.C3302g;
import p227p4.C3305j;
import p227p4.C3313r;
import p227p4.C3314s;
import p227p4.C3315t;
import p227p4.C3316u;
import p227p4.C3320y;
import p227p4.C3321z;
import p242q8.C3460o;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p267s1.AbstractC3913s;
import p267s1.C3884a0;
import p267s1.C3903k;
import p267s1.C3914t;
import p267s1.C3920z;
import p267s1.EnumC3919y;
import p276sf.C3959f;
import p276sf.C3960g;
import p295u4.AbstractC4259i;
import p295u4.C4252b;
import p295u4.C4253c;
import p295u4.C4257g;
import p295u4.C4260j;
import p295u4.C4262l;
import p295u4.C4263m;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4268r;
import p295u4.C4270t;
import p295u4.C4271u;
import p295u4.C4272v;
import p295u4.InterfaceC4258h;
import p308v1.InterfaceC4428t;
import p311v4.AbstractC4446a;
import p311v4.C4466o;
import p343x6.AbstractC5700d;
import p373z0.InterfaceC6067g;
import p376z4.C6093g;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: hb.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1671c implements InterfaceC1783q1, InterfaceC4258h, InterfaceC6067g {

    /* JADX INFO: renamed from: g */
    public Object f5520g;

    /* JADX INFO: renamed from: h */
    public Object f5521h;

    /* JADX INFO: renamed from: i */
    public Object f5522i;

    /* JADX INFO: renamed from: j */
    public Object f5523j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1671c(Typeface typeface, C2776b c2776b) {
        int i9;
        int i10;
        int i11;
        int i12;
        this.f5523j = typeface;
        this.f5520g = c2776b;
        this.f5522i = new C2466t(1024);
        int iM6155a = c2776b.m6155a(6);
        if (iM6155a != 0) {
            int i13 = iM6155a + c2776b.f9015g;
            i9 = ((ByteBuffer) c2776b.f9018j).getInt(((ByteBuffer) c2776b.f9018j).getInt(i13) + i13);
        } else {
            i9 = 0;
        }
        this.f5521h = new char[i9 * 2];
        int iM6155a2 = c2776b.m6155a(6);
        if (iM6155a2 != 0) {
            int i14 = iM6155a2 + c2776b.f9015g;
            i10 = ((ByteBuffer) c2776b.f9018j).getInt(((ByteBuffer) c2776b.f9018j).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            C2467u c2467u = new C2467u(this, i15);
            C2775a c2775aM5863b = c2467u.m5863b();
            int iM6155a3 = c2775aM5863b.m6155a(4);
            Character.toChars(iM6155a3 != 0 ? ((ByteBuffer) c2775aM5863b.f9018j).getInt(iM6155a3 + c2775aM5863b.f9015g) : 0, (char[]) this.f5521h, i15 * 2);
            C2775a c2775aM5863b2 = c2467u.m5863b();
            int iM6155a4 = c2775aM5863b2.m6155a(16);
            if (iM6155a4 != 0) {
                int i16 = iM6155a4 + c2775aM5863b2.f9015g;
                i11 = ((ByteBuffer) c2775aM5863b2.f9018j).getInt(((ByteBuffer) c2775aM5863b2.f9018j).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (!(i11 > 0)) {
                C2104o.m5294t("invalid metadata codepoint length");
                throw null;
            }
            C2466t c2466t = (C2466t) this.f5522i;
            C2775a c2775aM5863b3 = c2467u.m5863b();
            int iM6155a5 = c2775aM5863b3.m6155a(16);
            if (iM6155a5 != 0) {
                int i17 = iM6155a5 + c2775aM5863b3.f9015g;
                i12 = ((ByteBuffer) c2775aM5863b3.f9018j).getInt(((ByteBuffer) c2775aM5863b3.f9018j).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            c2466t.m5861a(c2467u, 0, i12 - 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static void m4263A(Activity activity, String str) {
        if (activity == null) {
            C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
            activity = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
            if (activity == null) {
                activity = null;
            }
            if (activity == null || activity.isFinishing()) {
                activity = null;
            }
            if (activity == null) {
                return;
            }
        }
        activity.runOnUiThread(new RunnableC0487t(activity, str, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m4264B(C1669b c1669b, int i9) {
        if (c1669b.f5510b.get()) {
            return true;
        }
        try {
            return c1669b.f5511c.await(Math.max(500L, ((long) AbstractC3754e0.m7909r(i9, 0, 3600)) * 1000), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static long m4265q(Object obj) {
        String[] strArr = {"getMsgId", "getMsgID", "getId"};
        int i9 = 0;
        while (true) {
            if (i9 >= 3) {
                String[] strArr2 = {"field_msgId", "msgId", "msgID", "id"};
                for (int i10 = 0; i10 < 4; i10++) {
                    Object field = KavaReflector.readField(obj, strArr2[i10]);
                    Number number = field instanceof Number ? (Number) field : null;
                    if (number != null) {
                        long jLongValue = number.longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        if (!(jLongValue > 0)) {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            return lValueOf.longValue();
                        }
                    }
                }
                return 0L;
            }
            Object objInvokeMethod = KavaReflector.invokeMethod(obj, strArr[i9], new Object[0]);
            Number number2 = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
            if (number2 != null) {
                long jLongValue2 = number2.longValue();
                Long lValueOf2 = jLongValue2 > 0 ? Long.valueOf(jLongValue2) : null;
                if (lValueOf2 != null) {
                    return lValueOf2.longValue();
                }
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m4266r(Object obj, String str) {
        if (obj != null) {
            return AbstractC5700d.m10269a0(obj, str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        r3 = false;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m4267t(List list) {
        WeChatMessage weChatMessageM5661c;
        boolean zBooleanValue;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    long jM4265q = m4265q(next);
                    Long lValueOf = Long.valueOf(jM4265q);
                    if (jM4265q > 0) {
                        String[] strArr = {"field_isSend", "isSend"};
                        int i9 = 0;
                        while (true) {
                            if (i9 >= 2) {
                                String[] strArr2 = {"getIsSend", "isSend"};
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= 2) {
                                        WeChatApis.message().getClass();
                                        C2355s c2355s = WeChatApis.messageStoreApi;
                                        if (c2355s == null || (weChatMessageM5661c = c2355s.m5661c(jM4265q)) == null || weChatMessageM5661c.isSend != 1) {
                                        }
                                    } else {
                                        Object objInvokeMethod = KavaReflector.invokeMethod(next, strArr2[i10], new Object[0]);
                                        if (objInvokeMethod instanceof Boolean) {
                                            zBooleanValue = ((Boolean) objInvokeMethod).booleanValue();
                                            break;
                                        }
                                        if (!(objInvokeMethod instanceof Number)) {
                                            i10++;
                                        } else if (((Number) objInvokeMethod).intValue() != 0) {
                                        }
                                    }
                                }
                            } else {
                                Object field = KavaReflector.readField(next, strArr[i9]);
                                if (field instanceof Boolean) {
                                    zBooleanValue = ((Boolean) field).booleanValue();
                                    break;
                                }
                                if (!(field instanceof Number)) {
                                    i9++;
                                } else if (((Number) field).intValue() != 0) {
                                }
                            }
                        }
                        zBooleanValue = true;
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!z) {
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        break;
                    }
                    arrayList.add(lValueOf);
                } else {
                    if (AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)).size() == list.size()) {
                        return list;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089 A[RETURN] */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4268y(C0763a c0763a, String str, String str2, C2343g c2343g, C2105p c2105p) {
        C2097h c2097h;
        int i9 = c0763a.f2286a;
        String str3 = c0763a.f2287b;
        switch (i9) {
            case 0:
                String strM6737a0 = AbstractC3156t.m6737a0(str3, "%friendName%", str2, false);
                return (AbstractC3149m.m6721t0(strM6737a0) || c2343g == null || !c2343g.m5601x(str, strM6737a0)) ? false : true;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                File file = new File(str3);
                if (file.isFile() && c2105p != null) {
                    int i10 = c0763a.f2286a;
                    if (i10 == 1) {
                        return c2105p.f7035a.m5274r(str, str3, HttpUrl.FRAGMENT_ENCODE_SET, true);
                    }
                    if (i10 == 2) {
                        return c2105p.f7037c.m972q(str, str3);
                    }
                    if (i10 == 3) {
                        return c2105p.f7039e.m588T(str, str3, file.getName());
                    }
                    if (i10 == 4) {
                        return c2105p.f7038d.m5219v(str, str3);
                    }
                    if (i10 == 5) {
                        return c2105p.f7036b.m5324t(str, str3);
                    }
                }
            case 6:
                String strM6737a02 = AbstractC3156t.m6737a0(str3, "%friendName%", str2, false);
                if (AbstractC3149m.m6721t0(strM6737a02) || c2343g == null || !c2343g.m5603z(str, strM6737a02)) {
                }
                break;
            case 7:
                if (c2105p == null || (c2097h = c2105p.f7040f) == null || !c2097h.m5236A(str, str3)) {
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: b */
    public long mo595b(AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        int iMo4424b = abstractC1781q.mo4424b();
        long jMax = 0;
        for (int i9 = 0; i9 < iMo4424b; i9++) {
            jMax = Math.max(jMax, ((C0119x) this.f5520g).m610t(i9).mo4353b(abstractC1781q.mo4423a(i9), abstractC1781q2.mo4423a(i9), abstractC1781q3.mo4423a(i9)));
        }
        return jMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m4269c(AbstractC3303h abstractC3303h) {
        ((C3316u) ((C3315t) this.f5520g).f10677h).m7032a(abstractC3303h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m4270d(AbstractC3303h abstractC3303h) {
        ((ArrayList) ((C3315t) this.f5520g).f10678i).add(abstractC3303h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: e */
    public void mo4271e(C4272v c4272v) {
        AbstractC3303h abstractC3303h;
        C4270t c4270t = c4272v.f13948h;
        C3305j c3305jM7038a = AbstractC3319x.m7038a(c4272v);
        C4268r c4268r = c4272v.f13947g;
        AbstractC4446a abstractC4446a = c4272v.f13935k;
        int i9 = c4268r.f13975e;
        int i10 = c4268r.f13971a;
        if (i9 != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c4268r.f13975e);
        }
        m4269c((C3301f) this.f5522i);
        if (c4268r.f13976f) {
            m4269c(new C3302g(c3305jM7038a, c4270t, c4272v.f13950j, abstractC4446a));
            return;
        }
        C4265o c4265oM4274i = m4274i();
        C4266p c4266pM7039a = C3320y.m7039a(c4272v, c4265oM4274i);
        boolean z9 = c3305jM7038a.f10496e;
        int i11 = c3305jM7038a.f10492a;
        if ((z9 || i10 == 43) != (c4265oM4274i != null)) {
            C3193a.m6825o(c4272v, "Insn with result/move-result-pseudo mismatch ");
            return;
        }
        AbstractC3303h c3302g = (i10 != 41 || i11 == 35) ? new C3302g(c3305jM7038a, c4270t, c4266pM7039a, abstractC4446a) : new C3321z(c3305jM7038a, c4270t, c4266pM7039a);
        C3316u c3316u = (C3316u) ((C3315t) this.f5520g).f10677h;
        int size = c3316u.f10681c.size() - 1;
        while (true) {
            abstractC3303h = null;
            if (size < 0) {
                break;
            }
            if (size < c3316u.f10681c.size() && size >= 0) {
                abstractC3303h = (AbstractC3303h) c3316u.f10681c.get(size);
            }
            if (abstractC3303h.f10488b.f10492a != -1) {
                break;
            } else {
                size--;
            }
        }
        if (i11 == 32 && abstractC3303h != null) {
            C4266p c4266p = abstractC3303h.f10490d;
            int i12 = abstractC3303h.f10488b.f10492a;
            if (i12 == 7 || i12 == 8 || i12 == 9) {
                C4266p c4266p2 = c3302g.f10490d;
                if (c4266p2.f24601h.length > 0 && c4266p.f24601h.length > 1 && ((C4265o) c4266p2.m10840l(0)).f13965g == ((C4265o) c4266p.m10840l(1)).f13965g) {
                    m4269c(new C3321z(AbstractC3306k.f10583c, c4270t, C4266p.f13968i));
                }
            }
        }
        m4269c(c3302g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public void m4272f(C3903k c3903k, boolean z9) {
        C3884a0 c3884a0 = (C3884a0) this.f5523j;
        ?? r12 = c3903k.f12800a;
        int size = r12.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((C3914t) r12.get(i9)).m8119b()) {
                m4283z(c3903k);
                return;
            }
        }
        InterfaceC4428t interfaceC4428t = (InterfaceC4428t) this.f5520g;
        if (interfaceC4428t == null) {
            C2104o.m5276A("layoutCoordinates not set");
            return;
        }
        AbstractC3913s.m8116i(c3903k, interfaceC4428t.mo8868m0(0L), new C1021p(this, 4, c3884a0), false);
        if (((EnumC3919y) this.f5521h) == EnumC3919y.f12868h) {
            if (z9) {
                int size2 = r12.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((C3914t) r12.get(i10)).m8118a();
                }
            }
            C1545q0 c1545q0 = c3903k.f12801b;
            if (c1545q0 != null) {
                c1545q0.f5152b = !c3884a0.f12743c;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: g */
    public AbstractC1781q mo602g(AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        if (((AbstractC1781q) this.f5523j) == null) {
            this.f5523j = abstractC1781q3.mo4425c();
        }
        AbstractC1781q abstractC1781q4 = (AbstractC1781q) this.f5523j;
        if (abstractC1781q4 == null) {
            AbstractC1416l.m3831g("endVelocityVector");
            throw null;
        }
        int iMo4424b = abstractC1781q4.mo4424b();
        int i9 = 0;
        while (true) {
            AbstractC1781q abstractC1781q5 = (AbstractC1781q) this.f5523j;
            if (i9 >= iMo4424b) {
                if (abstractC1781q5 != null) {
                    return abstractC1781q5;
                }
                AbstractC1416l.m3831g("endVelocityVector");
                throw null;
            }
            if (abstractC1781q5 == null) {
                AbstractC1416l.m3831g("endVelocityVector");
                throw null;
            }
            abstractC1781q5.mo4427e(i9, ((C0119x) this.f5520g).m610t(i9).mo4355d(abstractC1781q.mo4423a(i9), abstractC1781q2.mo4423a(i9), abstractC1781q3.mo4423a(i9)));
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public C1696s m4273h(ArrayList arrayList, List list, final int i9, final int i10, final InterfaceC1236q interfaceC1236q) {
        int i11;
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0763a c0763a = (C0763a) it.next();
            String string = AbstractC3149m.m6703R0(c0763a.f2287b).toString();
            if (AbstractC3149m.m6721t0(string) || (i11 = c0763a.f2286a) < 0 || i11 >= 8) {
                c0763a = null;
            }
            C0763a c0763aM1979a = c0763a != null ? C0763a.m1979a(c0763a, string) : null;
            if (c0763aM1979a != null) {
                arrayList2.add(c0763aM1979a);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC2091b.m5171r((String) it2.next(), arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList4.add(obj);
            }
        }
        final List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4));
        if (arrayList2.isEmpty() || listM8407P1.isEmpty()) {
            return null;
        }
        String string2 = UUID.randomUUID().toString();
        string2.getClass();
        final C1669b c1669b = new C1669b(string2);
        ((ConcurrentHashMap) this.f5523j).put(c1669b.f5509a, c1669b);
        ((ExecutorService) this.f5522i).execute(new Runnable() { // from class: hb.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                Throwable th2;
                Object c3959f;
                AtomicBoolean atomicBoolean;
                C2343g c2343g;
                C2105p c2105p;
                List list2;
                Iterator it3;
                int i12;
                Object c3959f2;
                C1669b c1669b2 = c1669b;
                AtomicBoolean atomicBoolean2 = c1669b2.f5510b;
                C2343g c2343gM6844q = AbstractC3199a.m6844q();
                if (c2343gM6844q == null) {
                    c2343gM6844q = WeChatApis.messages();
                }
                C2343g c2343g2 = c2343gM6844q;
                C2105p c2105pMedia = WeChatApis.media();
                C1423s c1423s = new C1423s();
                List list3 = listM8407P1;
                Iterator it4 = list3.iterator();
                int i13 = 0;
                while (true) {
                    boolean zHasNext = it4.hasNext();
                    C1671c c1671c = this;
                    ArrayList arrayList5 = arrayList2;
                    if (!zHasNext) {
                        ((ConcurrentHashMap) c1671c.f5523j).remove(c1669b2.f5509a);
                        ((Handler) c1671c.f5521h).post(new RunnableC0537x(interfaceC1236q, c1423s, arrayList5, list3, c1669b2, 5));
                        return;
                    }
                    Object next = it4.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    String str = (String) next;
                    if (atomicBoolean2.get()) {
                        atomicBoolean = atomicBoolean2;
                        c2343g = c2343g2;
                        c2105p = c2105pMedia;
                        list2 = list3;
                        it3 = it4;
                    } else {
                        int i15 = c1423s.f4736g;
                        try {
                            WeChatApis.contact().getClass();
                            C1368i c1368i = WeChatApis.contactApi;
                            c3959f = c1368i != null ? c1368i.m3729r(str) : null;
                            th2 = null;
                        } catch (Throwable th3) {
                            th2 = null;
                            c3959f = new C3959f(th3);
                        }
                        if (c3959f instanceof C3959f) {
                            c3959f = th2;
                        }
                        String str2 = (String) c3959f;
                        if (str2 == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        String str3 = AbstractC3149m.m6721t0(str2) ? str : str2;
                        Iterator it5 = arrayList5.iterator();
                        atomicBoolean = atomicBoolean2;
                        int size = 0;
                        while (true) {
                            if (!it5.hasNext()) {
                                c2343g = c2343g2;
                                c2105p = c2105pMedia;
                                list2 = list3;
                                it3 = it4;
                                i12 = i15;
                                size = arrayList5.size();
                                break;
                            }
                            Object next2 = it5.next();
                            int i16 = size + 1;
                            if (size < 0) {
                                AbstractC0000a.m32Q0();
                                throw th2;
                            }
                            list2 = list3;
                            C0763a c0763a2 = (C0763a) next2;
                            if (!atomicBoolean.get()) {
                                try {
                                    c3959f2 = Boolean.valueOf(C1671c.m4268y(c0763a2, str, str3, c2343g2, c2105pMedia));
                                    c2343g = c2343g2;
                                } catch (Throwable th4) {
                                    c2343g = c2343g2;
                                    c3959f2 = new C3959f(th4);
                                }
                                Throwable thM8182b = C3960g.m8182b(c3959f2);
                                c2105p = c2105pMedia;
                                if (thM8182b != null) {
                                    it3 = it4;
                                    i12 = i15;
                                    ((C0042b) c1671c.f5520g).invoke("自定义群发失败: target=" + str + " type=" + c0763a2.f2286a, thM8182b);
                                } else {
                                    it3 = it4;
                                    i12 = i15;
                                }
                                Boolean bool = Boolean.FALSE;
                                if (c3959f2 instanceof C3959f) {
                                    c3959f2 = bool;
                                }
                                if (!((Boolean) c3959f2).booleanValue()) {
                                    break;
                                }
                                if (size < arrayList5.size() - 1 && C1671c.m4264B(c1669b2, i10)) {
                                    size = i16;
                                    break;
                                }
                                size = i16;
                                list3 = list2;
                                c2343g2 = c2343g;
                                c2105pMedia = c2105p;
                                it4 = it3;
                                i15 = i12;
                            } else {
                                c2343g = c2343g2;
                                c2105p = c2105pMedia;
                                it3 = it4;
                                i12 = i15;
                                break;
                            }
                        }
                        c1423s.f4736g = i12 + size;
                        if (i13 < list2.size() - 1) {
                            C1671c.m4264B(c1669b2, i9);
                        }
                    }
                    i13 = i14;
                    atomicBoolean2 = atomicBoolean;
                    list3 = list2;
                    c2343g2 = c2343g;
                    c2105pMedia = c2105p;
                    it4 = it3;
                }
            }
        });
        return new C1696s(new C0035c(this, 12, c1669b));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public C4265o m4274i() {
        int i9 = ((C4252b) this.f5521h).f13933d;
        if (i9 < 0) {
            return null;
        }
        AbstractC4259i abstractC4259i = (AbstractC4259i) ((C4253c) ((C3320y) this.f5523j).f10691a.f3182i).m8551s(i9).f13931b.m10840l(0);
        if (abstractC4259i.f13947g.f13971a != 56) {
            return null;
        }
        return abstractC4259i.f13949i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: j */
    public void mo4275j(C4260j c4260j) {
        C4270t c4270t = c4260j.f13948h;
        C3305j c3305jM7038a = AbstractC3319x.m7038a(c4260j);
        C4268r c4268r = c4260j.f13947g;
        if (c4268r.f13975e != 6) {
            throw new RuntimeException("Expected BRANCH_THROW got " + c4268r.f13975e);
        }
        if (!c4268r.f13976f) {
            C0353j.m1309g("Expected call-like operation");
        } else {
            m4269c((C3301f) this.f5522i);
            m4269c(new C3313r(c3305jM7038a, c4270t, c4260j.f13950j, new AbstractC4446a[]{c4260j.f13956m, c4260j.f13957n}));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public AbstractC1781q m4276k(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2) {
        if (((AbstractC1781q) this.f5522i) == null) {
            this.f5522i = abstractC1781q.mo4425c();
        }
        AbstractC1781q abstractC1781q3 = (AbstractC1781q) this.f5522i;
        if (abstractC1781q3 == null) {
            AbstractC1416l.m3831g("velocityVector");
            throw null;
        }
        int iMo4424b = abstractC1781q3.mo4424b();
        int i9 = 0;
        while (true) {
            AbstractC1781q abstractC1781q4 = (AbstractC1781q) this.f5522i;
            if (i9 >= iMo4424b) {
                if (abstractC1781q4 != null) {
                    return abstractC1781q4;
                }
                AbstractC1416l.m3831g("velocityVector");
                throw null;
            }
            if (abstractC1781q4 == null) {
                AbstractC1416l.m3831g("velocityVector");
                throw null;
            }
            C0119x c0119x = (C0119x) this.f5520g;
            abstractC1781q.getClass();
            long j4 = j3 / 1000000;
            C1489u0 c1489u0M4004a = ((C1491v0) c0119x.f310h).m4004a(abstractC1781q2.mo4423a(i9));
            long j5 = c1489u0M4004a.f4943c;
            abstractC1781q4.mo4427e(i9, (((Math.signum(c1489u0M4004a.f4941a) * AbstractC1443b.m3986a(j5 > 0 ? j4 / j5 : 1.0f).f4785b) * c1489u0M4004a.f4942b) / j5) * 1000.0f);
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: l */
    public void mo4277l(C4271u c4271u) {
        C4270t c4270t = c4271u.f13948h;
        C3305j c3305jM7038a = AbstractC3319x.m7038a(c4271u);
        if (c4271u.f13947g.f13975e != 6) {
            C0353j.m1309g("shouldn't happen");
            return;
        }
        C4265o c4265oM4274i = m4274i();
        if (c3305jM7038a.f10496e != (c4265oM4274i != null)) {
            C3193a.m6825o(c4271u, "Insn with result/move-result-pseudo mismatch");
        } else {
            m4269c((C3301f) this.f5522i);
            m4269c(new C3321z(c3305jM7038a, c4270t, C3320y.m7039a(c4271u, c4265oM4274i)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: m */
    public void mo4278m(C4262l c4262l) {
        C4270t c4270t = c4262l.f13948h;
        AbstractC4446a abstractC4446a = c4262l.f13935k;
        C4265o c4265o = c4262l.f13949i;
        C3305j c3305jM7038a = AbstractC3319x.m7038a(c4262l);
        C4268r c4268r = c4262l.f13947g;
        int i9 = c4268r.f13971a;
        if (c4268r.f13975e != 1) {
            C0353j.m1309g("shouldn't happen");
            return;
        }
        if (i9 != 3) {
            m4269c(new C3302g(c3305jM7038a, c4270t, C3320y.m7039a(c4262l, c4265o), abstractC4446a));
            return;
        }
        C3320y c3320y = (C3320y) this.f5523j;
        if (c3320y.f10699i) {
            return;
        }
        m4269c(new C3321z(c3305jM7038a, c4270t, C4266p.m8568q(c4265o, C4265o.m8557k((c3320y.f10696f - c3320y.f10698h) + ((C4466o) abstractC4446a).f14817g, c4265o.f13966h.getType(), null))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: n */
    public AbstractC1781q mo607n(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        if (((AbstractC1781q) this.f5522i) == null) {
            this.f5522i = abstractC1781q3.mo4425c();
        }
        AbstractC1781q abstractC1781q4 = (AbstractC1781q) this.f5522i;
        if (abstractC1781q4 == null) {
            AbstractC1416l.m3831g("velocityVector");
            throw null;
        }
        int iMo4424b = abstractC1781q4.mo4424b();
        int i9 = 0;
        while (true) {
            AbstractC1781q abstractC1781q5 = (AbstractC1781q) this.f5522i;
            if (i9 >= iMo4424b) {
                if (abstractC1781q5 != null) {
                    return abstractC1781q5;
                }
                AbstractC1416l.m3831g("velocityVector");
                throw null;
            }
            if (abstractC1781q5 == null) {
                AbstractC1416l.m3831g("velocityVector");
                throw null;
            }
            abstractC1781q5.mo4427e(i9, ((C0119x) this.f5520g).m610t(i9).mo4354c(abstractC1781q.mo4423a(i9), abstractC1781q2.mo4423a(i9), abstractC1781q3.mo4423a(i9), j3));
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: o */
    public void mo4279o(C4263m c4263m) {
        AbstractC3303h c3321z;
        C4268r c4268r = c4263m.f13947g;
        C4265o c4265o = c4263m.f13949i;
        int i9 = c4268r.f13971a;
        if (i9 == 54 || i9 == 56) {
            return;
        }
        C4270t c4270t = c4263m.f13948h;
        C3305j c3305jM7038a = AbstractC3319x.m7038a(c4263m);
        int i10 = c4268r.f13975e;
        if (i10 == 1 || i10 == 2) {
            c3321z = new C3321z(c3305jM7038a, c4270t, C3320y.m7039a(c4263m, c4265o));
        } else {
            if (i10 == 3) {
                return;
            }
            if (i10 != 4) {
                if (i10 != 6) {
                    C0353j.m1309g("shouldn't happen");
                    return;
                }
                c3321z = new C3321z(c3305jM7038a, c4270t, C3320y.m7039a(c4263m, c4265o));
            } else {
                c3321z = new C3296b0(c3305jM7038a, c4270t, C3320y.m7039a(c4263m, c4265o), ((C3301f[]) ((C3320y) this.f5523j).f10693c.f469a)[((C4252b) this.f5521h).f13932c.m10846n(1)]);
            }
        }
        m4269c(c3321z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public boolean m4280p(Method method, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        Set set = (Set) this.f5523j;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(method, xC_MethodHook);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            ((C2026t) this.f5521h).invoke("多选撤回Hook安装失败: " + method.toGenericString(), thM8182b);
        }
        Boolean bool = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = bool;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: u */
    public void mo4281u(C4257g c4257g) {
        C4270t c4270t = c4257g.f13948h;
        AbstractC4446a abstractC4446a = c4257g.f13946l;
        ArrayList arrayList = c4257g.f13945k;
        if (c4257g.f13947g.f13975e != 1) {
            C0353j.m1309g("shouldn't happen");
            return;
        }
        C3301f c3301f = new C3301f(c4270t, false);
        AbstractC3303h c3293a = new C3293a(c4270t, (C3301f) this.f5522i, arrayList, abstractC4446a);
        AbstractC3303h c3296b0 = new C3296b0(AbstractC3306k.f10515G, c4270t, C3320y.m7039a(c4257g, c4257g.f13949i), c3301f);
        m4269c((C3301f) this.f5522i);
        m4269c(c3296b0);
        m4270d(new C3314s(c4270t));
        m4270d(c3301f);
        m4270d(c3293a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1774n1
    /* JADX INFO: renamed from: w */
    public AbstractC1781q mo612w(long j3, AbstractC1781q abstractC1781q, AbstractC1781q abstractC1781q2, AbstractC1781q abstractC1781q3) {
        if (((AbstractC1781q) this.f5521h) == null) {
            this.f5521h = abstractC1781q.mo4425c();
        }
        AbstractC1781q abstractC1781q4 = (AbstractC1781q) this.f5521h;
        if (abstractC1781q4 == null) {
            AbstractC1416l.m3831g("valueVector");
            throw null;
        }
        int iMo4424b = abstractC1781q4.mo4424b();
        int i9 = 0;
        while (true) {
            AbstractC1781q abstractC1781q5 = (AbstractC1781q) this.f5521h;
            if (i9 >= iMo4424b) {
                if (abstractC1781q5 != null) {
                    return abstractC1781q5;
                }
                AbstractC1416l.m3831g("valueVector");
                throw null;
            }
            if (abstractC1781q5 == null) {
                AbstractC1416l.m3831g("valueVector");
                throw null;
            }
            abstractC1781q5.mo4427e(i9, ((C0119x) this.f5520g).m610t(i9).mo4356e(abstractC1781q.mo4423a(i9), abstractC1781q2.mo4423a(i9), abstractC1781q3.mo4423a(i9), j3));
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p295u4.InterfaceC4258h
    /* JADX INFO: renamed from: x */
    public void mo4282x(C4271u c4271u) {
        C4270t c4270t = c4271u.f13948h;
        C6093g c6093g = (C6093g) c4271u.f14185l;
        C4252b c4252b = (C4252b) this.f5521h;
        C6093g c6093g2 = c4252b.f13932c;
        int i9 = c6093g.f24610i;
        int i10 = c6093g2.f24610i;
        int i11 = c4252b.f13933d;
        if (i9 != i10 - 1 || i11 != c6093g2.m10846n(i9)) {
            C0353j.m1309g("shouldn't happen");
            return;
        }
        C3301f[] c3301fArr = new C3301f[i9];
        for (int i12 = 0; i12 < i9; i12++) {
            c3301fArr[i12] = ((C3301f[]) ((C3320y) this.f5523j).f10693c.f469a)[c6093g2.m10846n(i12)];
        }
        C3301f c3301f = new C3301f(c4270t, false);
        C3301f c3301f2 = new C3301f(((C3301f) this.f5522i).f10489c, true);
        C3294a0 c3294a0 = new C3294a0(c4270t, c3301f2, c6093g, c3301fArr);
        AbstractC3303h c3296b0 = new C3296b0(c3294a0.f10474i ? AbstractC3306k.f10524J : AbstractC3306k.f10527K, c4270t, C3320y.m7039a(c4271u, c4271u.f13949i), c3301f);
        m4269c(c3301f2);
        m4269c(c3296b0);
        m4270d(new C3314s(c4270t));
        m4270d(c3301f);
        m4270d(c3294a0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public void m4283z(C3903k c3903k) {
        if (((EnumC3919y) this.f5521h) == EnumC3919y.f12868h) {
            InterfaceC4428t interfaceC4428t = (InterfaceC4428t) this.f5520g;
            if (interfaceC4428t == null) {
                C2104o.m5276A("layoutCoordinates not set");
                return;
            }
            AbstractC3913s.m8116i(c3903k, interfaceC4428t.mo8868m0(0L), new C3920z((C3884a0) this.f5523j, 1), true);
        }
        this.f5521h = EnumC3919y.f12869i;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [androidx.lifecycle.x.<init>(float, float, i.q):void, hb.c.<init>(i.z):void, i.t.<init>(i.u, i.m1, java.lang.Object, i.q):void] */
    public /* synthetic */ C1671c(Object obj) {
        this.f5520g = obj;
    }

    public C1671c(InterfaceC1805z interfaceC1805z) {
        this(new C0119x(interfaceC1805z, 21));
    }
}
