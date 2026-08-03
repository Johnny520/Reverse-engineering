package p000;

import android.content.ContentValues;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: Xm */
/* JADX INFO: loaded from: classes.dex */
public final class C1017Xm implements InterfaceC0162Dq, InterfaceC0080Bu, InterfaceC0667Pf, InterfaceC2123k0, InterfaceC0579Nd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3225a;

    /* JADX INFO: renamed from: b */
    public Object f3226b;

    public /* synthetic */ C1017Xm(int i, Object obj) {
        this.f3225a = i;
        this.f3226b = obj;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1907a(C1376en c1376en) {
        C2243mn c2243mnM1908d;
        synchronized (this) {
            c2243mnM1908d = m1908d(AbstractC0640Ov.m1259e(c1376en), c1376en.m2665A());
        }
        C2153kn c2153kn = (C2153kn) this.f3226b;
        c2153kn.m5038e();
        C2286nn.m4615x((C2286nn) c2153kn.f8871b, c2243mnM1908d);
    }

    @Override // p000.InterfaceC0080Bu
    /* JADX INFO: renamed from: b */
    public void mo131b(int i, Object obj) {
        if (i == 6 || i == 7 || i == 8) {
        }
        ((ProfileInstallReceiver) this.f3226b).setResultCode(i);
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public boolean mo892c(Object obj, File file, C2644vt c2644vt) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C2812zp c2812zp = (C2812zp) this.f3226b;
        byte[] bArr = (byte[]) c2812zp.m5441c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    c2812zp.m5445g(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    c2812zp.m5445g(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            c2812zp.m5445g(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized C2243mn m1908d(C0931Vm c0931Vm, EnumC2773yt enumC2773yt) {
        int iM5332a;
        synchronized (this) {
            iM5332a = AbstractC2751yD.m5332a();
            while (m1913j(iM5332a)) {
                iM5332a = AbstractC2751yD.m5332a();
            }
        }
        return (C2243mn) c2200lnM4551F.m5035b();
        if (enumC2773yt == EnumC2773yt.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        C2200ln c2200lnM4551F = C2243mn.m4551F();
        c2200lnM4551F.m5038e();
        C2243mn.m4552w((C2243mn) c2200lnM4551F.f8871b, c0931Vm);
        c2200lnM4551F.m5038e();
        C2243mn.m4555z((C2243mn) c2200lnM4551F.f8871b, iM5332a);
        c2200lnM4551F.m5038e();
        C2243mn.m4554y((C2243mn) c2200lnM4551F.f8871b);
        c2200lnM4551F.m5038e();
        C2243mn.m4553x((C2243mn) c2200lnM4551F.f8871b, enumC2773yt);
        return (C2243mn) c2200lnM4551F.m5035b();
    }

    /* JADX INFO: renamed from: e */
    public String m1909e() {
        String asString = ((ContentValues) this.f3226b).getAsString(AbstractC0295Gu.m625r(-729165187774517L));
        return asString == null ? AbstractC0295Gu.m625r(-729199547512885L) : asString;
    }

    /* JADX INFO: renamed from: g */
    public synchronized C2656w4 m1910g() {
        return C2656w4.m5191o((C2286nn) ((C2153kn) this.f3226b).m5035b());
    }

    /* JADX INFO: renamed from: h */
    public String m1911h() {
        String asString = ((ContentValues) this.f3226b).getAsString(AbstractC0295Gu.m625r(-729130828036149L));
        return asString == null ? AbstractC0295Gu.m625r(-729160892807221L) : asString;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1912i() {
        Integer asInteger = ((ContentValues) this.f3226b).getAsInteger(AbstractC0295Gu.m625r(-729001979017269L));
        return asInteger != null && asInteger.intValue() == 1;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m1913j(int i) {
        Iterator it = Collections.unmodifiableList(((C2286nn) ((C2153kn) this.f3226b).f8871b).m4616A()).iterator();
        while (it.hasNext()) {
            if (((C2243mn) it.next()).m4557B() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public C0931Vm m1914k(AbstractC2744y6 abstractC2744y6) throws GeneralSecurityException {
        AbstractC1551in abstractC1551in = (AbstractC1551in) this.f3226b;
        try {
            AbstractC2614v5 abstractC2614v5Mo2972d = abstractC1551in.mo2972d();
            AbstractC0043B abstractC0043BMo5007e = abstractC2614v5Mo2972d.mo5007e(abstractC2744y6);
            abstractC2614v5Mo2972d.mo5008f(abstractC0043BMo5007e);
            AbstractC0043B abstractC0043BMo5005a = abstractC2614v5Mo2972d.mo5005a(abstractC0043BMo5007e);
            C0845Tm c0845TmM1786D = C0931Vm.m1786D();
            String strMo2970b = abstractC1551in.mo2970b();
            c0845TmM1786D.m5038e();
            C0931Vm.m1787w((C0931Vm) c0845TmM1786D.f8871b, strMo2970b);
            try {
                int iMo63b = ((AbstractC2634vj) abstractC0043BMo5005a).mo63b(null);
                byte[] bArr = new byte[iMo63b];
                C2230ma c2230ma = new C2230ma(iMo63b, bArr);
                abstractC0043BMo5005a.mo67f(c2230ma);
                if (c2230ma.f7801h - c2230ma.f7802i != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                C2701x6 c2701x6 = new C2701x6(bArr);
                c0845TmM1786D.m5038e();
                C0931Vm.m1788x((C0931Vm) c0845TmM1786D.f8871b, c2701x6);
                EnumC0888Um enumC0888UmMo2973e = abstractC1551in.mo2973e();
                c0845TmM1786D.m5038e();
                C0931Vm.m1789y((C0931Vm) c0845TmM1786D.f8871b, enumC0888UmMo2973e);
                return (C0931Vm) c0845TmM1786D.m5035b();
            } catch (IOException e) {
                throw new RuntimeException(abstractC0043BMo5005a.m64c("ByteString"), e);
            }
        } catch (C0673Pl e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // p000.InterfaceC2123k0
    public boolean perform(View view, AbstractC1241c0 abstractC1241c0) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3226b;
        if (!swipeDismissBehavior.mo2426r(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f4405d;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public void mo244r(EditText editText) {
        String strM625r;
        String string;
        C0701QC c0701qc = (C0701QC) this.f3226b;
        Editable text = editText.getText();
        if (text == null || (string = text.toString()) == null || (strM625r = AbstractC2564tz.m5070e0(string).toString()) == null) {
            strM625r = AbstractC0295Gu.m625r(-484695649286197L);
        }
        if (strM625r.length() <= 0) {
            Toast.makeText(c0701qc.m1432f(), AbstractC0295Gu.m625r(-484699944253493L), 0).show();
        } else {
            C1498hd c1498hd = AbstractC1499he.f5282a;
            AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C0658PC(strM625r, c0701qc, null), 3);
        }
    }

    public String toString() {
        switch (this.f3225a) {
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC0295Gu.m625r(-728422158432309L));
                ContentValues contentValues = (ContentValues) this.f3226b;
                Long asLong = contentValues.getAsLong(AbstractC0295Gu.m625r(-729435770714165L));
                sb.append(asLong != null ? asLong.longValue() : 0L);
                sb.append(AbstractC0295Gu.m625r(-727906762356789L));
                Long asLong2 = contentValues.getAsLong(AbstractC0295Gu.m625r(-729461540517941L));
                sb.append(asLong2 != null ? asLong2.longValue() : 0L);
                sb.append(AbstractC0295Gu.m625r(-727958301964341L));
                Integer asInteger = contentValues.getAsInteger(AbstractC0295Gu.m625r(-729500195223605L));
                AbstractC0213Ey.m418p(sb, asInteger != null ? asInteger.intValue() : 0, -728005546604597L);
                Integer asInteger2 = contentValues.getAsInteger(AbstractC0295Gu.m625r(-729521670060085L));
                sb.append(asInteger2 != null ? asInteger2.intValue() : 0);
                sb.append(AbstractC0295Gu.m625r(-728048496277557L));
                sb.append(m1912i());
                sb.append(AbstractC0295Gu.m625r(-728091445950517L));
                Integer asInteger3 = contentValues.getAsInteger(AbstractC0295Gu.m625r(-729032043788341L));
                AbstractC0213Ey.m418p(sb, asInteger3 != null ? asInteger3.intValue() : 0, -728705626273845L);
                Long asLong3 = contentValues.getAsLong(AbstractC0295Gu.m625r(-729083583395893L));
                sb.append(asLong3 != null ? asLong3.longValue() : 0L);
                sb.append(AbstractC0295Gu.m625r(-728765755815989L));
                sb.append(m1911h());
                sb.append(AbstractC0295Gu.m625r(-728813000456245L));
                sb.append(m1909e());
                sb.append(AbstractC0295Gu.m625r(-728868835031093L));
                String asString = contentValues.getAsString(AbstractC0295Gu.m625r(-729203842480181L));
                if (asString == null) {
                    asString = AbstractC0295Gu.m625r(-729238202218549L);
                }
                AbstractC2374ph.m4817n(sb, asString, -728924669605941L);
                String asString2 = contentValues.getAsString(AbstractC0295Gu.m625r(-729242497185845L));
                if (asString2 == null) {
                    asString2 = AbstractC0295Gu.m625r(-729830907705397L);
                }
                AbstractC2374ph.m4817n(sb, asString2, -728435043334197L);
                sb.append(contentValues.getAsInteger(AbstractC0295Gu.m625r(-729873857378357L)));
                sb.append(AbstractC0295Gu.m625r(-728490877909045L));
                String asString3 = contentValues.getAsString(AbstractC0295Gu.m625r(-729912512084021L));
                if (asString3 == null) {
                    asString3 = AbstractC0295Gu.m625r(-729968346658869L);
                }
                AbstractC2374ph.m4817n(sb, asString3, -728563892353077L);
                String asString4 = contentValues.getAsString(AbstractC0295Gu.m625r(-729972641626165L));
                if (asString4 == null) {
                    asString4 = AbstractC0295Gu.m625r(-730049951037493L);
                }
                AbstractC2374ph.m4817n(sb, asString4, -728662676600885L);
                String asString5 = contentValues.getAsString(AbstractC0295Gu.m625r(-730054246004789L));
                if (asString5 == null) {
                    asString5 = AbstractC0295Gu.m625r(-729568914700341L);
                }
                AbstractC2374ph.m4817n(sb, asString5, -727099308505141L);
                Long asLong4 = contentValues.getAsLong(AbstractC0295Gu.m625r(-729573209667637L));
                sb.append(asLong4 != null ? asLong4.longValue() : 0L);
                sb.append(AbstractC0295Gu.m625r(-727159438047285L));
                String asString6 = contentValues.getAsString(AbstractC0295Gu.m625r(-729616159340597L));
                if (asString6 == null) {
                    asString6 = AbstractC0295Gu.m625r(-729676288882741L);
                }
                AbstractC2374ph.m4817n(sb, asString6, -727236747458613L);
                Long asLong5 = contentValues.getAsLong(AbstractC0295Gu.m625r(-729680583850037L));
                sb.append(asLong5 != null ? asLong5.longValue() : 0L);
                sb.append(AbstractC0295Gu.m625r(-727283992098869L));
                Integer asInteger4 = contentValues.getAsInteger(AbstractC0295Gu.m625r(-729710648621109L));
                AbstractC0213Ey.m418p(sb, asInteger4 != null ? asInteger4.intValue() : 0, -727318351837237L);
                String asString7 = contentValues.getAsString(AbstractC0295Gu.m625r(-728160165427253L));
                if (asString7 == null) {
                    asString7 = AbstractC0295Gu.m625r(-728216000002101L);
                }
                AbstractC2374ph.m4817n(sb, asString7, -726841610467381L);
                String asString8 = contentValues.getAsString(AbstractC0295Gu.m625r(-728220294969397L));
                if (asString8 == null) {
                    asString8 = AbstractC0295Gu.m625r(-728267539609653L);
                }
                AbstractC2374ph.m4817n(sb, asString8, -726910329944117L);
                Long asLong6 = contentValues.getAsLong(AbstractC0295Gu.m625r(-728271834576949L));
                sb.append(asLong6 != null ? asLong6.longValue() : 0L);
                sb.append(AbstractC0295Gu.m625r(-726970459486261L));
                Long asLong7 = contentValues.getAsLong(AbstractC0295Gu.m625r(-728314784249909L));
                sb.append(asLong7 != null ? asLong7.longValue() : 0L);
                sb.append(AbstractC0295Gu.m625r(-727009114191925L));
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1017Xm(int i, boolean z) {
        this.f3225a = i;
    }

    public C1017Xm(ContentValues contentValues) {
        this.f3225a = 8;
        AbstractC0295Gu.m625r(-729375641172021L);
        this.f3226b = contentValues;
    }

    public C1017Xm(int i) {
        this.f3225a = i;
        switch (i) {
            case 7:
                this.f3226b = new C1022Xr(500L);
                break;
            default:
                this.f3226b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public C1017Xm(AbstractC1551in abstractC1551in, Class cls) {
        this.f3225a = 0;
        if (!abstractC1551in.f5509b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1551in.toString() + " does not support primitive class " + cls.getName());
        }
        this.f3226b = abstractC1551in;
    }
}
