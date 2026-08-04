package yyds;

import android.R;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.p000ss.android.ugc.awemes.WardDatabase;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.ugc.aweme.ImageUrlStruct;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛷᲁᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1639 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f8346;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Object f8347;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8348;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f8349;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f8350;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f8351;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639(C0832 c0832, int i, String str, C0947 c0947, C0947 c09472, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8348 = 8;
        this.f8347 = c0832;
        this.f8346 = i;
        this.f8351 = str;
        this.f8349 = c0947;
        this.f8350 = c09472;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        if (r11 != r6) goto L27;
     */
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m3337(Object obj) throws Throwable {
        C0061 c0061 = (C0061) this.f8350;
        int i = this.f8346;
        InterfaceC0274 interfaceC0274 = null;
        int i2 = 1;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        try {
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-1555791346303854L), e);
            C1206 c1206 = AbstractC0221.f1238;
            C1158 c1158 = AbstractC1353.f6250;
            C0853 c0853 = new C0853(c0061, interfaceC0274, 9);
            this.f8346 = 3;
            obj = AbstractC2071.m3955(c1158, c0853, this);
        }
        if (i == 0) {
            AbstractC1544.m3189(obj);
            C0380 c0380 = (C0380) ((C2133) this.f8347).f10555;
            String str = (String) this.f8351;
            String str2 = (String) this.f8349;
            this.f8346 = 1;
            c0380.getClass();
            obj = AbstractC1960.m3774(c0380.f1954, this, new C0421(i2, AbstractC2328.m4341(-1403504690889582L), str, str2), false, true);
            if (obj == enumC1765) {
            }
            return enumC1765;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC1544.m3189(obj);
                return C2746.f13459;
            }
            if (i != 3) {
                C0188.m800(AbstractC2328.m4341(-1555812821140334L));
                return null;
            }
            AbstractC1544.m3189(obj);
            return C2746.f13459;
        }
        AbstractC1544.m3189(obj);
        int iIntValue = ((Number) obj).intValue();
        C1206 c12062 = AbstractC0221.f1238;
        C1158 c11582 = AbstractC1353.f6250;
        C2793 c2793 = new C2793(c0061, iIntValue, null, 6);
        this.f8346 = 2;
        obj = AbstractC2071.m3955(c11582, c2793, this);
        if (obj == enumC1765) {
            return enumC1765;
        }
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    private final Object m3338(Object obj) throws Throwable {
        InterfaceC0274 interfaceC0274;
        int i = this.f8346;
        if (i == 0) {
            AbstractC1544.m3189(obj);
            AbstractC0974 abstractC0974 = (AbstractC0974) ((InterfaceC0990) this.f8347).mo119().mo423(C0135.f836);
            WardDatabase wardDatabase = (WardDatabase) this.f8351;
            InterfaceC2213 interfaceC2213M1960 = AbstractC0879.m1960(abstractC0974, new C0058(abstractC0974));
            InterfaceC2213 interfaceC2213Mo422 = interfaceC2213M1960.mo422(new C1820(interfaceC2213M1960, wardDatabase.f495));
            C1853 c1853 = (C1853) this.f8349;
            C0219 c0219 = (C0219) this.f8350;
            this.f8347 = c1853;
            this.f8346 = 1;
            obj = AbstractC2071.m3955(interfaceC2213Mo422, c0219, this);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (obj == enumC1765) {
                return enumC1765;
            }
            interfaceC0274 = c1853;
        } else {
            if (i != 1) {
                C0188.m800("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC0274 = (InterfaceC0274) this.f8347;
            AbstractC1544.m3189(obj);
        }
        interfaceC0274.mo812(obj);
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    private final Object m3339(Object obj) throws Throwable {
        C2280 c2280 = (C2280) this.f8347;
        int i = this.f8346;
        if (i == 0) {
            AbstractC1544.m3189(obj);
            C1206 c1206 = AbstractC0221.f1238;
            C1158 c1158 = AbstractC1353.f6250;
            C1007 c1007 = new C1007((C0832) this.f8351, c2280, (C0947) this.f8349, (C0947) this.f8350, null, 4);
            this.f8347 = null;
            this.f8346 = 1;
            Object objM3955 = AbstractC2071.m3955(c1158, c1007, this);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i != 1) {
                C0188.m800(AbstractC2328.m4341(-228500422951790L));
                return null;
            }
            AbstractC1544.m3189(obj);
        }
        return C2746.f13459;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (yyds.AbstractC2071.m3955(r11, r4, r10) == r3) goto L17;
     */
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m3340(Object obj) throws Throwable {
        int i = this.f8346;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        if (i == 0) {
            AbstractC1544.m3189(obj);
            Map map = C2609.f12814;
            Aweme aweme = (Aweme) this.f8347;
            this.f8346 = 1;
            obj = C2609.m4685(aweme, this);
            if (obj != enumC1765) {
            }
            return enumC1765;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC1544.m3189(obj);
                return C2746.f13459;
            }
            C0188.m800(AbstractC2328.m4341(-833072904438638L));
            return null;
        }
        AbstractC1544.m3189(obj);
        String str = (String) obj;
        if (!AbstractC0473.m1313(str)) {
            C1206 c1206 = AbstractC0221.f1238;
            C1158 c1158 = AbstractC1353.f6250;
            C1007 c1007 = new C1007((TextView) this.f8350, (String) this.f8351, (String) this.f8349, str, (InterfaceC0274) null);
            this.f8346 = 2;
        }
        return C2746.f13459;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    private final Object m3341(Object obj) throws Throwable {
        AbstractC1544.m3189(obj);
        C0832 c0832 = (C0832) this.f8347;
        int i = this.f8346 + 1;
        String str = (String) this.f8351;
        int i2 = ((C0947) this.f8349).f4410;
        int i3 = ((C0947) this.f8350).f4410;
        c0832.getClass();
        AbstractC2328.m4341(-112635090207598L);
        C1508 c1508 = c0832.f3810;
        TextView textView = c1508.f7089;
        ProgressBar progressBar = c1508.f7099;
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-112673744913262L));
        AbstractC2104.m4007(sb, i, -112686629815150L);
        sb.append(c0832.f3808);
        sb.append(AbstractC2328.m4341(-112703809684334L));
        textView.setText(sb.toString());
        TextView textView2 = c1508.f7091;
        String name = new File(str).getName();
        if (AbstractC0473.m1313(name)) {
            name = AbstractC2328.m4341(-112716694586222L) + i;
        }
        textView2.setText(name);
        progressBar.setProgress(0);
        progressBar.setIndeterminate(true);
        c1508.f7092.m361(0.0f, true);
        c1508.f7096.setText(AbstractC2328.m4341(-112742464389998L));
        c1508.f7094.setText(AbstractC2328.m4341(-112755349291886L));
        c0832.m1893(i2, i3);
        c0832.m1894(i2);
        if (!c0832.f3807) {
            c1508.f7093.setText(AbstractC2328.m4341(-112794003997550L));
        }
        return C2746.f13459;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0380, code lost:
    
        if (r0 == r12) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0492, code lost:
    
        if (yyds.AbstractC2071.m3955(r2, r3, r4) == r0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x06a8, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r1, r4) != r14) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x06fd, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r1, r4) != r14) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x071e, code lost:
    
        if (r2.m1858(r0, r1, r13, r4) == r14) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x079e, code lost:
    
        if (r5 == r3) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fd, code lost:
    
        if (r0 == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031c A[Catch: Exception -> 0x0246, TryCatch #5 {Exception -> 0x0246, blocks: (B:70:0x023f, B:114:0x0384, B:75:0x0257, B:108:0x0310, B:110:0x031c, B:78:0x0261, B:79:0x026c, B:81:0x0272, B:83:0x0288, B:85:0x0297, B:87:0x02a6, B:88:0x02aa, B:91:0x02b1, B:93:0x02b7, B:97:0x02ca, B:99:0x02dd, B:101:0x02e7, B:105:0x02f0, B:111:0x032a, B:95:0x02c1), top: B:266:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[Catch: Exception -> 0x0028, TryCatch #3 {Exception -> 0x0028, blocks: (B:9:0x0023, B:41:0x0102, B:15:0x003d, B:34:0x00af, B:36:0x00d4, B:42:0x0139, B:43:0x014b, B:18:0x0048, B:30:0x009e, B:21:0x004f, B:23:0x005a, B:24:0x0074), top: B:264:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139 A[Catch: Exception -> 0x0028, TryCatch #3 {Exception -> 0x0028, blocks: (B:9:0x0023, B:41:0x0102, B:15:0x003d, B:34:0x00af, B:36:0x00d4, B:42:0x0139, B:43:0x014b, B:18:0x0048, B:30:0x009e, B:21:0x004f, B:23:0x005a, B:24:0x0074), top: B:264:0x001b }] */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        Object objM3955;
        Object objM39552;
        Object objM2620;
        C1624 c1624;
        Object objM1417;
        C2270 c2270;
        String strM4687;
        Object objM39553;
        Object objM2624;
        C2270 c22702;
        Object c2658;
        C0119 c0119M4659;
        Object objM4660;
        C0119 c0119;
        byte[] bytes;
        C1639 c1639 = this;
        int i = 5;
        InterfaceC0274 interfaceC0274 = null;
        switch (c1639.f8348) {
            case 0:
                C2302 c2302 = (C2302) c1639.f8350;
                C0184 c0184 = (C0184) c1639.f8347;
                LinearLayout linearLayout = c0184.f1058;
                LinearLayout linearLayout2 = c0184.f1060;
                LinearLayout linearLayout3 = c0184.f1078;
                EnumC1765 enumC1765 = EnumC1765.f8858;
                int i2 = c1639.f8346;
                try {
                    try {
                    } finally {
                        c0184.f1075 = false;
                    }
                } catch (Exception e) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-119189210301294L), e);
                    AbstractC1960.m3789(AbstractC2328.m4341(-119219275072366L) + e.getMessage());
                    linearLayout3.setVisibility(8);
                    linearLayout2.setVisibility(0);
                }
                if (i2 == 0) {
                    AbstractC1544.m3189(obj);
                    c0184.f1075 = true;
                    linearLayout2.setVisibility(8);
                    linearLayout3.setVisibility(0);
                    linearLayout.setVisibility(8);
                    C1206 c1206 = AbstractC0221.f1238;
                    ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
                    C1007 c1007 = new C1007(c0184, c2302, (String) c1639.f8351, (String) c1639.f8349, null, 0);
                    c1639.f8346 = 1;
                    objM3955 = AbstractC2071.m3955(executorC2482, c1007, c1639);
                    if (objM3955 == enumC1765) {
                    }
                    return enumC1765;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        C0188.m800(AbstractC2328.m4341(-119249339843438L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                    objM39552 = obj;
                    Pair pair = (Pair) objM39552;
                    File file = (File) pair.component1();
                    long jLongValue = ((Number) pair.component2()).longValue();
                    c0184.f1049 = file;
                    C0907 c0907 = C0907.f4128;
                    String str = (String) c1639.f8351;
                    String str2 = c2302.f11306;
                    String str3 = c2302.f11307;
                    String absolutePath = file.getAbsolutePath();
                    AbstractC2328.m4341(-119099015988078L);
                    c0907.getClass();
                    C0907.m2021(str, str2, str3, absolutePath, jLongValue);
                    linearLayout3.setVisibility(8);
                    linearLayout.setVisibility(0);
                    c0184.m765(file);
                    return C2746.f13459;
                }
                AbstractC1544.m3189(obj);
                objM3955 = obj;
                C1206 c12062 = AbstractC0221.f1238;
                ExecutorC2482 executorC24822 = ExecutorC2482.f12272;
                C0709 c0709 = new C0709(c0184, (String) objM3955, (InterfaceC0274) null);
                c1639.f8346 = 2;
                objM39552 = AbstractC2071.m3955(executorC24822, c0709, c1639);
                break;
            case 1:
                Context context = (Context) c1639.f8349;
                C2746 c2746 = C2746.f13459;
                Comment comment = (Comment) c1639.f8351;
                Dialog dialog = (Dialog) c1639.f8350;
                EnumC1765 enumC17652 = EnumC1765.f8858;
                try {
                    try {
                    } catch (Exception e2) {
                        C2336.f11496.m4354(AbstractC2328.m4341(-973801802859374L) + e2.getMessage());
                        AbstractC1960.m3789(AbstractC2328.m4341(-973870522336110L) + e2.getMessage());
                        C1206 c12063 = AbstractC0221.f1238;
                        C1158 c1158 = AbstractC1353.f6250;
                        C2435 c2435 = new C2435(dialog, null, 1);
                        c1639.f8347 = null;
                        c1639.f8346 = 4;
                        break;
                    }
                } catch (Throwable th) {
                    C1206 c12064 = AbstractC0221.f1238;
                    C1158 c11582 = AbstractC1353.f6250;
                    C2435 c24352 = new C2435(dialog, null, 1);
                    c1639.f8347 = th;
                    c1639.f8346 = 5;
                    if (AbstractC2071.m3955(c11582, c24352, c1639) != enumC17652) {
                        throw th;
                    }
                }
                switch (c1639.f8346) {
                    case 0:
                        AbstractC1544.m3189(obj);
                        if (comment.emoji == null) {
                            C0805 c0805 = C0805.f3694;
                            c1639.f8346 = 6;
                            break;
                        } else {
                            C1206 c12065 = AbstractC0221.f1238;
                            C1158 c11583 = AbstractC1353.f6250;
                            C2435 c24353 = new C2435(dialog, null, 0);
                            c1639.f8346 = 1;
                            if (AbstractC2071.m3955(c11583, c24353, c1639) != enumC17652) {
                                C1624.m3321(AbstractC2328.m4341(-973745968284526L));
                                List list = comment.emoji.animateUrl.urlList;
                                AbstractC2328.m4341(-973767443121006L);
                                String str4 = (String) AbstractC1595.m3280(list);
                                c1639.f8347 = null;
                                c1639.f8346 = 2;
                                C1327 c1327 = C1327.f6093;
                                objM2620 = C1327.m2620(context, str4, null, null, c1639, 60);
                                if (objM2620 != enumC17652) {
                                    objM2620 = c2746;
                                }
                                if (objM2620 != enumC17652) {
                                    C1206 c12066 = AbstractC0221.f1238;
                                    C1158 c11584 = AbstractC1353.f6250;
                                    C2435 c24354 = new C2435(dialog, null, 1);
                                    c1639.f8347 = null;
                                    c1639.f8346 = 3;
                                }
                            }
                            break;
                        }
                        return enumC17652;
                    case 1:
                        AbstractC1544.m3189(obj);
                        C1624.m3321(AbstractC2328.m4341(-973745968284526L));
                        List list2 = comment.emoji.animateUrl.urlList;
                        AbstractC2328.m4341(-973767443121006L);
                        String str42 = (String) AbstractC1595.m3280(list2);
                        c1639.f8347 = null;
                        c1639.f8346 = 2;
                        C1327 c13272 = C1327.f6093;
                        objM2620 = C1327.m2620(context, str42, null, null, c1639, 60);
                        if (objM2620 != enumC17652) {
                        }
                        if (objM2620 != enumC17652) {
                        }
                        return enumC17652;
                    case 2:
                        AbstractC1544.m3189(obj);
                        C1206 c120662 = AbstractC0221.f1238;
                        C1158 c115842 = AbstractC1353.f6250;
                        C2435 c243542 = new C2435(dialog, null, 1);
                        c1639.f8347 = null;
                        c1639.f8346 = 3;
                        break;
                    case 3:
                    case 4:
                    case 6:
                        AbstractC1544.m3189(obj);
                        return c2746;
                    case 5:
                        Throwable th2 = (Throwable) c1639.f8347;
                        AbstractC1544.m3189(obj);
                        throw th2;
                    default:
                        C0188.m800(AbstractC2328.m4341(-973900587107182L));
                        return null;
                }
                break;
            case 2:
                C1624 c16242 = (C1624) c1639.f8350;
                EnumC1765 enumC17653 = EnumC1765.f8858;
                int i3 = c1639.f8346;
                try {
                    if (i3 == 0) {
                        AbstractC1544.m3189(obj);
                        C1327 c13273 = C1327.f6093;
                        Context context2 = (Context) c1639.f8347;
                        String str5 = (String) c1639.f8351;
                        Comment comment2 = (Comment) c1639.f8349;
                        c1639.f8346 = 1;
                        if (C1327.m2620(context2, str5, null, comment2, c1639, 52) == enumC17653) {
                            return enumC17653;
                        }
                    } else {
                        if (i3 != 1) {
                            C0188.m800(AbstractC2328.m4341(-816786388452206L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                    }
                    c16242.m3327();
                    C1624.m3320();
                    return C2746.f13459;
                } catch (Throwable th3) {
                    c16242.m3327();
                    C1624.m3320();
                    throw th3;
                }
            case 3:
                EnumC1765 enumC17654 = EnumC1765.f8858;
                int i4 = c1639.f8346;
                if (i4 == 0) {
                    AbstractC1544.m3189(obj);
                    ((C0172) c1639.f8349).f997 = new Long(System.currentTimeMillis());
                    C1624 c1624M3321 = C1624.m3321(AbstractC2328.m4341(-995237984633710L));
                    C1327 c13274 = C1327.f6093;
                    Context context3 = ((TextView) c1639.f8350).getContext();
                    AbstractC2328.m4341(-995255164502894L);
                    String str6 = (String) c1639.f8351;
                    c1639.f8347 = c1624M3321;
                    c1639.f8346 = 1;
                    if (C1327.m2620(context3, str6, null, null, c1639, 60) == enumC17654) {
                        return enumC17654;
                    }
                    c1624 = c1624M3321;
                } else {
                    if (i4 != 1) {
                        C0188.m800(AbstractC2328.m4341(-995323883979630L));
                        return null;
                    }
                    c1624 = (C1624) c1639.f8347;
                    AbstractC1544.m3189(obj);
                }
                c1624.m3327();
                return C2746.f13459;
            case 4:
                C2746 c27462 = C2746.f13459;
                EnumC1765 enumC17655 = EnumC1765.f8858;
                int i5 = c1639.f8346;
                if (i5 == 0) {
                    AbstractC1544.m3189(obj);
                    C1226 c1226 = C1226.f5638;
                    Context context4 = (Context) c1639.f8347;
                    C2701 c2701 = C2701.f13261;
                    C1221 c1221 = C1221.f5600;
                    String strM4341 = AbstractC2328.m4341(-836594777621358L);
                    String str7 = (String) c1639.f8351;
                    c1221.getClass();
                    String strM2480 = C1221.m2480(strM4341, str7);
                    c2701.getClass();
                    String strM4803 = C2701.m4803(strM2480);
                    String str8 = (String) c1639.f8349;
                    c1639.f8346 = 1;
                    c1639 = this;
                    if (c1226.m2494(context4, null, strM4803, str8, false, this) == enumC17655) {
                        return enumC17655;
                    }
                } else {
                    if (i5 != 1) {
                        C0188.m800(AbstractC2328.m4341(-836745101476718L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                }
                C1830 c1830 = C1830.f9189;
                Object obj2 = ((C0488) c1639.f8350).f2405;
                String strM43412 = AbstractC2328.m4341(-836637727294318L);
                Object[] objArr = new Object[0];
                if (obj2 != null) {
                    try {
                        int i6 = AbstractC2293.f11258;
                        C2014 c2014M1327 = AbstractC0476.m1327(obj2);
                        ((C0903) c2014M1327.f10074).f4118 = 2;
                        C1189 c1189M3892 = c2014M1327.m3892();
                        c1189M3892.m4478();
                        c1189M3892.f12003 = strM43412;
                        AbstractC2328.m4341(-872178581668718L);
                        C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                        if (c0536 != null) {
                            c0536.m1372(Arrays.copyOf(objArr, 0));
                        }
                    } catch (Exception e3) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-836672087032686L), e3);
                    }
                    break;
                }
                return c27462;
            case 5:
                EnumC1765 enumC17656 = EnumC1765.f8858;
                int i7 = c1639.f8346;
                if (i7 == 0) {
                    AbstractC1544.m3189(obj);
                    C0561 c0561 = C0561.f2672;
                    Context context5 = (Context) c1639.f8347;
                    Uri uri = (Uri) c1639.f8351;
                    C2041 c2041 = (C2041) c1639.f8349;
                    c1639.f8346 = 1;
                    objM1417 = c0561.m1417(context5, uri, c2041, c1639);
                    if (objM1417 != enumC17656) {
                    }
                    return enumC17656;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        AbstractC1544.m3189(obj);
                        return C2746.f13459;
                    }
                    C0188.m800(AbstractC2328.m4341(-191477804860270L));
                    return null;
                }
                AbstractC1544.m3189(obj);
                objM1417 = ((C2248) obj).f11089;
                C1206 c12067 = AbstractC0221.f1238;
                C1158 c11585 = AbstractC1353.f6250;
                C2576 c2576 = new C2576(objM1417, (EnumC0868) c1639.f8350, interfaceC0274, i);
                c1639.f8346 = 2;
                break;
            case 6:
                EnumC1765 enumC17657 = EnumC1765.f8858;
                int i8 = c1639.f8346;
                if (i8 == 0) {
                    AbstractC1544.m3189(obj);
                    if (!C1221.f5601) {
                        C2619 c2619 = (C2619) c1639.f8347;
                        c2619.f12883 = C2619.m4724(AbstractC2328.m4341(-590089424634734L));
                        c2619.f12872 = 0;
                        c2619.f12874 = 0;
                        Notification notification = c2619.f12880;
                        notification.flags &= -3;
                        notification.icon = R.drawable.stat_sys_download_done;
                        c2619.f12877.clear();
                        ((NotificationManager) c1639.f8351).notify(1001, ((C2619) c1639.f8347).m4725());
                        AbstractC1960.m3789(AbstractC2328.m4341(-590110899471214L));
                        C1327 c13275 = C1327.f6093;
                        C1327.m2617((Context) c1639.f8349, ((File) c1639.f8350).getAbsolutePath());
                        c1639.f8346 = 1;
                        if (AbstractC0902.m2018(3000L, c1639) == enumC17657) {
                            return enumC17657;
                        }
                    }
                    return C2746.f13459;
                }
                if (i8 != 1) {
                    C0188.m800(AbstractC2328.m4341(-590132374307694L));
                    return null;
                }
                AbstractC1544.m3189(obj);
                ((NotificationManager) c1639.f8351).cancel(1001);
                return C2746.f13459;
            case 7:
                ImageUrlStruct imageUrlStruct = (ImageUrlStruct) c1639.f8347;
                EnumC1765 enumC17658 = EnumC1765.f8858;
                int i9 = c1639.f8346;
                try {
                } catch (Exception e4) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-601539807445870L), e4);
                    c2270 = new C2270(Boolean.FALSE, e4.getMessage(), null);
                }
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1544.m3189(obj);
                        objM2624 = obj;
                        c22702 = (C2270) objM2624;
                        if (((Boolean) c22702.f11190).booleanValue()) {
                            C1327 c13276 = C1327.f6093;
                            C1327.m2617((Context) c1639.f8350, (String) c22702.f11189);
                        }
                        return c22702;
                    }
                    if (i9 != 2) {
                        C0188.m800(AbstractC2328.m4341(-601608526922606L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                    objM39553 = obj;
                    C1939 c1939 = (C1939) objM39553;
                    c2270 = new C2270(Boolean.valueOf(c1939.f9755), c1939.f9756, c1939.f9757);
                    return c2270;
                }
                AbstractC1544.m3189(obj);
                List list3 = imageUrlStruct.urlList;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list3) {
                    String str9 = (String) obj3;
                    if (AbstractC0473.m1301(str9, AbstractC2328.m4341(-601131785552750L), false) || AbstractC0473.m1301(str9, AbstractC2328.m4341(-601157555356526L), false) || AbstractC0473.m1301(str9, AbstractC2328.m4341(-601179030193006L), false)) {
                        arrayList.add(obj3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    list3 = arrayList;
                }
                if (list3.isEmpty()) {
                    Map map = C2609.f12814;
                    strM4687 = C2609.m4687(imageUrlStruct.video);
                } else {
                    strM4687 = (String) AbstractC1595.m3280(list3);
                }
                String str10 = strM4687;
                if (str10 == null) {
                    c22702 = new C2270(Boolean.FALSE, AbstractC2328.m4341(-601204799996782L), null);
                    return c22702;
                }
                Map map2 = C2609.f12814;
                List listM4683 = C2609.m4683(imageUrlStruct.video);
                if (listM4683 == null || listM4683.isEmpty()) {
                    C1327 c13277 = C1327.f6093;
                    Aweme aweme = (Aweme) c1639.f8351;
                    Integer num = (Integer) c1639.f8349;
                    Context context6 = (Context) c1639.f8350;
                    c1639.f8346 = 1;
                    objM2624 = c13277.m2624(str10, aweme, null, num, context6, false, false, c1639);
                    c1639 = c1639;
                    if (objM2624 == enumC17658) {
                    }
                    c22702 = (C2270) objM2624;
                    if (((Boolean) c22702.f11190).booleanValue()) {
                    }
                    return c22702;
                }
                String str11 = (String) AbstractC1595.m3280(listM4683);
                File fileM1265 = C0469.m1265(AbstractC2328.m4341(-601234864767854L), (Aweme) c1639.f8351, (Integer) c1639.f8349);
                C1226 c12262 = C1226.f5638;
                Context context7 = (Context) c1639.f8350;
                String absolutePath2 = fileM1265.getAbsolutePath();
                AbstractC2328.m4341(-601252044637038L);
                String strM43413 = AbstractC2328.m4341(-601342238950254L);
                String strM43414 = AbstractC2328.m4341(-601441023198062L);
                c1639.f8346 = 2;
                c12262.getClass();
                C1206 c12068 = AbstractC0221.f1238;
                objM39553 = AbstractC2071.m3955(ExecutorC2482.f12272, new C1408(str10, str11, context7, strM43413, strM43414, absolutePath2, null), c1639);
                break;
                return enumC17658;
            case 8:
                return m3341(obj);
            case 9:
                AbstractC1544.m3189(obj);
                C0947 c0947 = (C0947) c1639.f8347;
                if (c0947.f4410 > 0) {
                    C1327 c13278 = C1327.f6093;
                    C1327.m2618((Context) c1639.f8351);
                }
                AbstractC1960.m3789(((AtomicBoolean) c1639.f8349).get() ? AbstractC2328.m4341(-141639004357486L) + c0947.f4410 + '/' + c1639.f8346 + AbstractC2328.m4341(-141673364095854L) : AbstractC2328.m4341(-141686248997742L) + c0947.f4410 + '/' + ((C0947) c1639.f8350).f4410 + AbstractC2328.m4341(-141733493637998L));
                return C2746.f13459;
            case 10:
                return m3339(obj);
            case 11:
                return m3338(obj);
            case 12:
                return m3340(obj);
            case 13:
                return m3337(obj);
            default:
                Object obj4 = C2746.f13459;
                Context context8 = (Context) c1639.f8350;
                String str12 = (String) c1639.f8349;
                EnumC1765 enumC17659 = EnumC1765.f8858;
                int i10 = c1639.f8346;
                try {
                } catch (Exception e5) {
                    C2336.f11496.m4358(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-591549713515374L)), str12, -591579778286446L), e5);
                    c2658 = new C2658(new Exception(str12 + AbstractC2328.m4341(-591592663188334L) + e5.getMessage()));
                }
                if (i10 == 0) {
                    AbstractC1544.m3189(obj);
                    C2592.f12774.getClass();
                    c0119M4659 = C2592.m4659(context8);
                    if (c0119M4659 == null) {
                        return new C2248(new C2658(new Exception(AbstractC2328.m4341(-591072972145518L))));
                    }
                    String strM43415 = AbstractC2328.m4341(-591115921818478L);
                    String strM43416 = AbstractC2328.m4341(-591171756393326L);
                    c1639.f8347 = c0119M4659;
                    c1639.f8346 = 1;
                    C1206 c12069 = AbstractC0221.f1238;
                    Object objM39554 = AbstractC2071.m3955(ExecutorC2482.f12272, new C0459(c0119M4659, strM43415, strM43416, null), c1639);
                    if (objM39554 != enumC17659) {
                        objM39554 = obj4;
                    }
                    if (objM39554 == enumC17659) {
                    }
                    return enumC17659;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            C0188.m800(AbstractC2328.m4341(-591614138024814L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                        c2658 = str12 + AbstractC2328.m4341(-591532533646190L) + new SimpleDateFormat(AbstractC2328.m4341(-591446634300270L), Locale.getDefault()).format(new Date());
                        return new C2248(c2658);
                    }
                    C0119 c01192 = (C0119) c1639.f8347;
                    AbstractC1544.m3189(obj);
                    c0119 = c01192;
                    objM4660 = obj;
                    String string = ((JSONObject) objM4660).toString();
                    AbstractC2328.m4341(-591180346327918L);
                    bytes = string.getBytes(AbstractC0347.f1806);
                    AbstractC2328.m4341(-591240475870062L);
                    if (bytes.length <= 67108864) {
                        throw new IllegalArgumentException(AbstractC2328.m4341(-591300605412206L).toString());
                    }
                    String str13 = (String) c1639.f8351;
                    String strM43417 = AbstractC2328.m4341(-591386504758126L);
                    c1639.f8347 = null;
                    c1639.f8346 = 3;
                    c0119.getClass();
                    C1206 c120610 = AbstractC0221.f1238;
                    Object objM39555 = AbstractC2071.m3955(ExecutorC2482.f12272, new C2391(c0119, strM43417, str13, bytes, null), c1639);
                    if (objM39555 == enumC17659) {
                        obj4 = objM39555;
                    }
                } else {
                    c0119M4659 = (C0119) c1639.f8347;
                    AbstractC1544.m3189(obj);
                }
                break;
                C2592 c2592 = C2592.f12774;
                c1639.f8347 = c0119M4659;
                c1639.f8346 = 2;
                c2592.getClass();
                objM4660 = C2592.m4660(context8, c1639);
                if (objM4660 == enumC17659) {
                    return enumC17659;
                }
                c0119 = c0119M4659;
                String string2 = ((JSONObject) objM4660).toString();
                AbstractC2328.m4341(-591180346327918L);
                bytes = string2.getBytes(AbstractC0347.f1806);
                AbstractC2328.m4341(-591240475870062L);
                if (bytes.length <= 67108864) {
                }
                break;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f8348;
        Object obj2 = this.f8349;
        Object obj3 = this.f8351;
        Object obj4 = this.f8350;
        switch (i) {
            case 0:
                return new C1639((C0184) this.f8347, (String) obj3, (C2302) obj4, (String) obj2, interfaceC0274);
            case 1:
                return new C1639((Comment) obj3, (Context) obj2, (Dialog) obj4, interfaceC0274, 1);
            case 2:
                return new C1639((Context) this.f8347, (String) obj3, (Comment) obj2, (C1624) obj4, interfaceC0274, 2);
            case 3:
                return new C1639((C0172) obj2, (TextView) obj4, (String) obj3, interfaceC0274);
            case 4:
                return new C1639((Context) this.f8347, (String) obj3, (String) obj2, (C0488) obj4, interfaceC0274, 4);
            case 5:
                return new C1639((Context) this.f8347, (Uri) obj3, (C2041) obj2, (EnumC0868) obj4, interfaceC0274, 5);
            case 6:
                return new C1639((C2619) this.f8347, (NotificationManager) obj3, (Context) obj2, (File) obj4, interfaceC0274, 6);
            case 7:
                return new C1639((ImageUrlStruct) this.f8347, (Aweme) obj3, (Integer) obj2, (Context) obj4, interfaceC0274, 7);
            case 8:
                return new C1639((C0832) this.f8347, this.f8346, (String) obj3, (C0947) obj2, (C0947) obj4, interfaceC0274);
            case 9:
                return new C1639((C0947) this.f8347, (Context) obj3, (AtomicBoolean) obj2, this.f8346, (C0947) obj4, interfaceC0274);
            case 10:
                C1639 c1639 = new C1639((C0832) obj3, (C0947) obj2, (C0947) obj4, interfaceC0274, 10);
                c1639.f8347 = obj;
                return c1639;
            case 11:
                C1639 c16392 = new C1639((WardDatabase) obj3, (C1853) obj2, (C0219) obj4, interfaceC0274, 11);
                c16392.f8347 = obj;
                return c16392;
            case 12:
                return new C1639((Aweme) this.f8347, (TextView) obj4, (String) obj3, (String) obj2, interfaceC0274);
            case 13:
                return new C1639((C2133) this.f8347, (String) obj3, (String) obj2, (C0061) obj4, interfaceC0274, 13);
            default:
                return new C1639((Context) obj4, (String) obj3, (String) obj2, interfaceC0274);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f8348;
        C2746 c2746 = C2746.f13459;
        switch (i) {
            case 8:
                ((C1639) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(c2746);
                break;
            case 9:
                ((C1639) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(c2746);
                break;
        }
        return ((C1639) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(c2746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639(Aweme aweme, TextView textView, String str, String str2, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8348 = 12;
        this.f8347 = aweme;
        this.f8350 = textView;
        this.f8351 = str;
        this.f8349 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1639(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f8348 = i;
        this.f8347 = obj;
        this.f8351 = obj2;
        this.f8349 = obj3;
        this.f8350 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1639(Object obj, Object obj2, Object obj3, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f8348 = i;
        this.f8351 = obj;
        this.f8349 = obj2;
        this.f8350 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639(C0184 c0184, String str, C2302 c2302, String str2, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8348 = 0;
        this.f8347 = c0184;
        this.f8351 = str;
        this.f8350 = c2302;
        this.f8349 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639(Context context, String str, String str2, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8348 = 14;
        this.f8350 = context;
        this.f8351 = str;
        this.f8349 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639(C0947 c0947, Context context, AtomicBoolean atomicBoolean, int i, C0947 c09472, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8348 = 9;
        this.f8347 = c0947;
        this.f8351 = context;
        this.f8349 = atomicBoolean;
        this.f8346 = i;
        this.f8350 = c09472;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639(C0172 c0172, TextView textView, String str, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8348 = 3;
        this.f8349 = c0172;
        this.f8350 = textView;
        this.f8351 = str;
    }
}
