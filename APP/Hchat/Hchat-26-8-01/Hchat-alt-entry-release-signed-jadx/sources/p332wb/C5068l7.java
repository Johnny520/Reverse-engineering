package p332wb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000a.AbstractC0000a;
import p010aa.C0040h;
import p051db.C0768f;
import p057e1.C0807b;
import p063e9.C0832c;
import p080fb.C1165q1;
import p080fb.C1168r0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p136j8.C2098i;
import p218og.AbstractC3149m;
import p251r.C3619d;
import p251r.C3623h;
import p266s0.C3874d;
import p267s1.C3906l0;
import p267s1.InterfaceC3918x;
import p276sf.C3958e;
import p276sf.C3963j;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p315v8.C4521a;
import p345x8.C5709b;
import sh.C4054v;
import tf.AbstractC4156d0;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.l7 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5068l7 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18571g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f18572h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f18573i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5068l7(InterfaceC1231l interfaceC1231l, InterfaceC3918x interfaceC3918x) {
        this.f18571g = 20;
        this.f18573i = interfaceC1231l;
        this.f18572h = interfaceC3918x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean zContains;
        switch (this.f18571g) {
            case 0:
                C4770c3 c4770c3 = (C4770c3) this.f18572h;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f18573i;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19799k, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-1524833128, new C0768f(c4770c3, 17, interfaceC1231l), true), 3);
                break;
            case 1:
                List list = (List) this.f18572h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f18573i;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, new C3874d(783426531, new C5238qc(list, interfaceC1809a1, 4), true), 3);
                break;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f18572h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f18573i;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19815m, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(1413764102, new C5265r6(sharedPreferences, 12), true), 3);
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19823n, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(1629804424, new C5463x6(interfaceC1220a, 20), true), 3);
                break;
            case 3:
                C5292s0 c5292s0 = (C5292s0) this.f18572h;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f18573i;
                C5292s0 c5292s02 = (C5292s0) obj;
                c5292s02.getClass();
                String str = c5292s02.f20550a;
                if (c5292s0 != null) {
                    zContains = linkedHashSet.contains(AbstractC4955ho.m9388M5(c5292s0.f20550a, str));
                } else if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
                    Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        if (AbstractC3149m.m6698M0((String) it.next(), '/').equals(str)) {
                            zContains = true;
                        }
                    }
                    zContains = false;
                } else {
                    zContains = false;
                }
                return Boolean.valueOf(zContains);
            case 4:
                C5523z2 c5523z2 = (C5523z2) this.f18572h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f18573i;
                Context context = (Context) obj;
                context.getClass();
                final VideoView videoView = new VideoView(context);
                MediaController mediaController = new MediaController(context);
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                videoView.setVideoPath(c5523z2.f22315b);
                videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: wb.ag
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        videoView.start();
                    }
                });
                interfaceC1809a12.setValue(videoView);
                return videoView;
            case 5:
                C2098i c2098i = (C2098i) this.f18572h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f18573i;
                String str2 = (String) obj;
                str2.getClass();
                interfaceC1809a13.setValue(new C5523z2(c2098i, str2));
                break;
            case 6:
                Context context2 = (Context) this.f18572h;
                String str3 = (String) this.f18573i;
                if (!((Boolean) obj).booleanValue()) {
                    str3 = "缓存将在下次启动时继续清理";
                }
                Toast.makeText(context2, str3, 0).show();
                break;
            case 7:
                Object obj2 = ((C3963j) this.f18572h).f12971g;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f18573i;
                interfaceC1809a14.setValue(((Boolean) obj).booleanValue() ? AbstractC4156d0.m8354V((Set) interfaceC1809a14.getValue(), obj2) : AbstractC4156d0.m8351S((Set) interfaceC1809a14.getValue(), obj2));
                break;
            case 8:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f18572h;
                C0832c c0832c = (C0832c) this.f18573i;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                interfaceC1235p.invoke(c0832c, bool);
                break;
            case 9:
                String str4 = ((C5292s0) this.f18572h).f20550a;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f18573i;
                interfaceC1809a15.setValue(((Boolean) obj).booleanValue() ? AbstractC4156d0.m8354V((Set) interfaceC1809a15.getValue(), str4) : AbstractC4156d0.m8351S((Set) interfaceC1809a15.getValue(), str4));
                break;
            case 10:
                InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f18572h;
                C4521a c4521a = (C4521a) this.f18573i;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                interfaceC1235p2.invoke(c4521a, bool2);
                break;
            case 11:
                String str5 = ((C0040h) this.f18572h).f131a;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f18573i;
                interfaceC1809a16.setValue(((Boolean) obj).booleanValue() ? AbstractC4156d0.m8354V((Set) interfaceC1809a16.getValue(), str5) : AbstractC4156d0.m8351S((Set) interfaceC1809a16.getValue(), str5));
                break;
            case 12:
                InterfaceC1235p interfaceC1235p3 = (InterfaceC1235p) this.f18572h;
                C5709b c5709b = (C5709b) this.f18573i;
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                interfaceC1235p3.invoke(c5709b, bool3);
                break;
            case 13:
                AbstractC5065l4 abstractC5065l4 = (AbstractC5065l4) this.f18572h;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f18573i;
                List list2 = (List) obj;
                list2.getClass();
                C4968i4 c4968i4 = (C4968i4) abstractC5065l4;
                InterfaceC1231l interfaceC1231l2 = c4968i4.f17769a.f21262e;
                ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C5292s0) it2.next()).f20550a);
                }
                interfaceC1231l2.invoke(AbstractC4955ho.m9316D5(arrayList));
                interfaceC1809a17.setValue(c4968i4.f17770b ? C4935h4.f17524c : C4935h4.f17523b);
                break;
            case 14:
                C5243qh c5243qh = (C5243qh) this.f18572h;
                C4915gh c4915gh = (C4915gh) this.f18573i;
                if (((Integer) obj).intValue() == 0) {
                    c5243qh.invoke();
                } else {
                    c4915gh.invoke();
                }
                return C3967n.f12976a;
            case 15:
                C5108me c5108me = (C5108me) this.f18572h;
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f18573i;
                List list3 = (List) obj;
                list3.getClass();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    linkedHashSet3.add(((C5026jv) it3.next()).f18249a);
                }
                c5108me.invoke(AbstractC4156d0.m8353U(linkedHashSet2, linkedHashSet3));
                break;
            case 16:
                Context context3 = (Context) this.f18572h;
                C1165q1 c1165q1 = (C1165q1) this.f18573i;
                String str6 = (String) obj;
                str6.getClass();
                Object systemService = context3.getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(c1165q1.f3876c, str6));
                }
                Toast.makeText(context3, "已复制", 0).show();
                break;
            case 17:
                InterfaceC1235p interfaceC1235p4 = (InterfaceC1235p) this.f18572h;
                C1168r0 c1168r0 = (C1168r0) this.f18573i;
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                interfaceC1235p4.invoke(c1168r0.f3897a, bool4);
                break;
            case 18:
                InterfaceC4233c interfaceC4233c = (InterfaceC4233c) this.f18572h;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f18573i;
                if (Float.intBitsToFloat((int) (((C0807b) obj).f2414a >> 32)) > interfaceC4233c.mo1601x0(38)) {
                    interfaceC1220a2.invoke();
                }
                return C3967n.f12976a;
            case 19:
                ArrayList arrayList2 = (ArrayList) this.f18572h;
                final InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f18573i;
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                final int i9 = 0;
                for (Object obj3 : arrayList2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    final C3958e c3958e = (C3958e) obj3;
                    C3623h.m7604a(c3623h4, Integer.valueOf(i9), new C3874d(73361640, new InterfaceC1236q() { // from class: wb.tu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // p085fg.InterfaceC1236q
                        /* JADX INFO: renamed from: b */
                        public final Object mo734b(Object obj4, Object obj5, Object obj6) {
                            C1836h0 c1836h0 = (C1836h0) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            ((C3619d) obj4).getClass();
                            if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                C5491y2 c5491y2 = C5491y2.f22068p;
                                C3958e c3958e2 = c3958e;
                                String str7 = (String) c3958e2.f12961g;
                                String str8 = (String) c3958e2.f12962h;
                                InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a18;
                                Set set = (Set) interfaceC1809a19.getValue();
                                int i11 = i9;
                                boolean zContains2 = set.contains(Integer.valueOf(i11));
                                boolean zM4534f = c1836h0.m4534f(interfaceC1809a19) | c1836h0.m4530d(i11);
                                Object objM4514P = c1836h0.m4514P();
                                if (zM4534f || objM4514P == C1851l.f6155a) {
                                    objM4514P = new C4054v(i11, interfaceC1809a19, 4);
                                    c1836h0.m4545k0(objM4514P);
                                }
                                c5491y2.m9856A(str7, str8, zContains2, (InterfaceC1220a) objM4514P, c1836h0, 24576);
                            } else {
                                c1836h0.m4519V();
                            }
                            return C3967n.f12976a;
                        }
                    }, true), 2);
                    i9 = i10;
                }
                return C3967n.f12976a;
            default:
                ((InterfaceC1231l) this.f18573i).invoke(Float.valueOf(Float.intBitsToFloat((int) (((C0807b) obj).f2414a >> 32)) / ((int) (((C3906l0) ((InterfaceC3918x) this.f18572h)).f12820E >> 32))));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5068l7(Object obj, int i9, Object obj2) {
        this.f18571g = i9;
        this.f18572h = obj;
        this.f18573i = obj2;
    }
}
