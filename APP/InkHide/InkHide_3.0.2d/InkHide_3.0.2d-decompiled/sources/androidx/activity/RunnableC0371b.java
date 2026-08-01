package androidx.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.C0401p;
import androidx.emoji2.text.C0404s;
import androidx.lifecycle.C0450B;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0478m;
import java.nio.MappedByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0017Q;
import p001A0.C0033f;
import p001A0.RunnableC0040m;
import p006D.AbstractC0079h;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p012G.C0140d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0306p;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p061e.AbstractActivityC0533i;
import p061e.AbstractDialogC0547w;
import p069i.C0651W;
import p069i.C0709q1;
import p085r.AbstractC0814f;
import p088s0.C0971E;
import p088s0.C0976J;
import p088s0.C0985g;
import p088s0.C0987i;
import p088s0.C0989k;
import p088s0.C0990l;
import p091u.AbstractC1014d;
import p093v.C1023h;
import p102z0.AbstractC1121d;
import p102z0.C1143z;

/* JADX INFO: renamed from: androidx.activity.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0371b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f878b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0371b(int i2, Object obj) {
        this.f877a = i2;
        this.f878b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:279:0x021f */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r13v9, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r8v52, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r8v7, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object[] objArr;
        Object next;
        int iHashCode;
        Integer numM530Z;
        Integer numM530Z2;
        boolean z2 = true;
        char c2 = 1;
        switch (this.f877a) {
            case 0:
                ((AbstractActivityC0533i) this.f878b).invalidateOptionsMenu();
                return;
            case 1:
                AbstractDialogC0547w.m1120a((AbstractDialogC0547w) this.f878b);
                return;
            case 2:
                C0401p c0401p = (C0401p) this.f878b;
                synchronized (c0401p.f1198e) {
                    try {
                        if (c0401p.f1202i == null) {
                            return;
                        }
                        try {
                            C1023h c1023hM773b = c0401p.m773b();
                            int i2 = c1023hM773b.f3636e;
                            if (i2 == 2) {
                                synchronized (c0401p.f1198e) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = AbstractC1014d.f3612a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0140d c0140d = c0401p.f1197d;
                                Context context = c0401p.f1195b;
                                c0140d.getClass();
                                Typeface typefaceMo1002m = AbstractC0814f.f2717a.mo1002m(context, new C1023h[]{c1023hM773b}, 0);
                                MappedByteBuffer mappedByteBufferM971G = AbstractC0503h.m971G(c0401p.f1195b, c1023hM773b.f3632a);
                                if (mappedByteBufferM971G == null || typefaceMo1002m == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0404s c0404s = new C0404s(typefaceMo1002m, AbstractC0079h.m170M(mappedByteBufferM971G));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0401p.f1198e) {
                                        try {
                                            AbstractC0079h abstractC0079h = c0401p.f1202i;
                                            if (abstractC0079h != null) {
                                                abstractC0079h.mo203I(c0404s);
                                            }
                                        } finally {
                                        }
                                        break;
                                    }
                                    c0401p.m772a();
                                    return;
                                } finally {
                                    int i4 = AbstractC1014d.f3612a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        } catch (Throwable th2) {
                            synchronized (c0401p.f1198e) {
                                try {
                                    AbstractC0079h abstractC0079h2 = c0401p.f1202i;
                                    if (abstractC0079h2 != null) {
                                        abstractC0079h2.mo200F(th2);
                                    }
                                    c0401p.m772a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 3:
                C0450B c0450b = (C0450B) this.f878b;
                AbstractC0223g.m418e(c0450b, "this$0");
                int i5 = c0450b.f1458c;
                C0486u c0486u = c0450b.f1462g;
                if (i5 == 0) {
                    c0450b.f1459d = true;
                    c0486u.m930d(EnumC0478m.ON_PAUSE);
                }
                if (c0450b.f1457b == 0 && c0450b.f1459d) {
                    c0486u.m930d(EnumC0478m.ON_STOP);
                    c0450b.f1460e = true;
                    return;
                }
                return;
            case 4:
                ((Toolbar) this.f878b).m707m();
                return;
            case 5:
                ((C0651W) this.f878b).getClass();
                return;
            case 6:
                ((ListView) this.f878b).invalidateViews();
                return;
            case 7:
                C0709q1 c0709q1 = (C0709q1) this.f878b;
                if (((AtomicBoolean) c0709q1.f2401g).get()) {
                    return;
                }
                Activity activity = (Activity) c0709q1.f2396b;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                C0985g c0985g = (C0985g) c0709q1.f2397c;
                if (c0985g != null) {
                    c0985g.notifyDataSetChanged();
                    return;
                } else {
                    AbstractC0223g.m420g("listAdapter");
                    throw null;
                }
            case 8:
                C0990l c0990l = (C0990l) this.f878b;
                c0990l.getClass();
                C1143z c1143z = C1143z.f3876a;
                List<Map> listM2531e = C1143z.m2531e("select r.username,r.alias,r.encryptUsername,r.conRemark,r.nickname,r.pyInitial,r.quanPin,r.type,r.verifyFlag,i.reserved2 as avatarUrl\nfrom rcontact r\nleft join img_flag i on r.username=i.username\nwhere r.username is not null and r.username<>''\n  and r.encryptUsername is not null and r.encryptUsername<>''\n  and r.verifyFlag=0\n  and (r.type & 1)<>0\n  and (r.type & 8)=0\n  and (r.type & 32)=0\n  and r.username not like '%@chatroom'", new Object[0]);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map map : listM2531e) {
                    String str = (String) map.get("username");
                    String string = str != null ? AbstractC0299i.m507C0(str).toString() : null;
                    String str2 = string == null ? "" : string;
                    Locale locale = Locale.ROOT;
                    AbstractC0223g.m417d(locale, "ROOT");
                    String lowerCase = str2.toLowerCase(locale);
                    AbstractC0223g.m417d(lowerCase, "toLowerCase(...)");
                    String lowerCase2 = str2.toLowerCase(locale);
                    AbstractC0223g.m417d(lowerCase2, "toLowerCase(...)");
                    if (!AbstractC0307q.m534d0(lowerCase2) && ((iHashCode = lowerCase2.hashCode()) == -1906116566 ? !lowerCase2.equals("filehelper") : iHashCode == -791575966 ? !lowerCase2.equals("weixin") : !(iHashCode == 2141228502 && lowerCase2.equals("medianote"))) && !AbstractC0307q.m538h0(lowerCase2, false, "gh_") && !AbstractC0307q.m538h0(lowerCase2, false, "appbrand") && !AbstractC0299i.m511i0(lowerCase2, "@app", false) && !AbstractC0299i.m511i0(lowerCase2, "@stranger", false) && !AbstractC0299i.m511i0(lowerCase2, "@qqim", false) && ((AbstractC0307q.m538h0(lowerCase2, false, "wxid_") || lowerCase2.endsWith("@chatroom") || !AbstractC0299i.m511i0(lowerCase2, "@", false)) && !lowerCase.endsWith("@chatroom") && !AbstractC0307q.m538h0(lowerCase, false, "gh_"))) {
                        String str3 = (String) map.get("encryptUsername");
                        String string2 = str3 != null ? AbstractC0299i.m507C0(str3).toString() : null;
                        if (string2 == null) {
                            string2 = "";
                        }
                        if (!AbstractC0307q.m534d0(string2)) {
                            String str4 = (String) map.get("verifyFlag");
                            if (((str4 == null || (numM530Z2 = AbstractC0306p.m530Z(str4)) == null) ? 0 : numM530Z2.intValue()) == 0) {
                                String str5 = (String) map.get("type");
                                int iIntValue = (str5 == null || (numM530Z = AbstractC0306p.m530Z(str5)) == null) ? 0 : numM530Z.intValue();
                                objArr = (iIntValue & 1) != 0 && (iIntValue & 8) == 0 && (iIntValue & 32) == 0;
                            }
                        }
                    }
                    if (objArr != false) {
                        String str6 = (String) map.get("alias");
                        String string3 = str6 != null ? AbstractC0299i.m507C0(str6).toString() : null;
                        String str7 = string3 == null ? "" : string3;
                        String str8 = (String) map.get("conRemark");
                        String string4 = str8 != null ? AbstractC0299i.m507C0(str8).toString() : null;
                        String str9 = string4 == null ? "" : string4;
                        String str10 = (String) map.get("nickname");
                        String string5 = str10 != null ? AbstractC0299i.m507C0(str10).toString() : null;
                        if (string5 == null) {
                            string5 = "";
                        }
                        String str11 = (String) map.get("pyInitial");
                        String string6 = str11 != null ? AbstractC0299i.m507C0(str11).toString() : null;
                        String str12 = string6 == null ? "" : string6;
                        String str13 = (String) map.get("quanPin");
                        String string7 = str13 != null ? AbstractC0299i.m507C0(str13).toString() : null;
                        String str14 = string7 == null ? "" : string7;
                        Iterator it = AbstractC0120h.m252Z(new String[]{str9, string5, str7, str2}).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                String str15 = (String) next;
                                if (((AbstractC0307q.m534d0(str15) || str15.equals(str2)) ? false : true) != false) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        String str16 = (String) next;
                        if (str16 == null) {
                            str16 = str2;
                        }
                        String strConcat = (AbstractC0307q.m534d0(str7) || str7.equals(str2)) ? "微信ID：".concat(str2) : "微信ID：" + str2 + " · 微信号：" + str7;
                        String str17 = (String) map.get("avatarUrl");
                        String string8 = str17 != null ? AbstractC0299i.m507C0(str17).toString() : null;
                        linkedHashMap.put(str2, new C0987i(str2, str16, strConcat, str7, str9, string5, str12, str14, string8 == null ? "" : string8));
                    }
                }
                Collection collectionValues = linkedHashMap.values();
                AbstractC0223g.m417d(collectionValues, "<get-values>(...)");
                c0990l.f3548a.runOnUiThread(new RunnableC0040m(c0990l, AbstractC0123k.m276r0(collectionValues, new C0033f(18, new C0017Q(new C0017Q(new C0989k(c0990l, c2 == true ? 1 : 0), c0990l, 3), c0990l, 4))), 12));
                return;
            default:
                C0976J c0976j = (C0976J) this.f878b;
                if (c0976j.f3491i || !c0976j.m2206c() || c0976j.getContext().getSharedPreferences("app", 0).getBoolean(c0976j.f3490h, false)) {
                    return;
                }
                c0976j.f3491i = true;
                AbstractC1121d.f3779a.m2409h(true, new C0971E(c0976j, z2));
                return;
        }
    }
}
