package yyds;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000ss.android.ugc.awemes.WardDatabase;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛱᲁᛴᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0219 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f1231;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Object f1232;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1233;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1234;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0219(Object obj, Object obj2, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f1233 = i;
        this.f1232 = obj;
        this.f1234 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0321, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r1, r17) != r11) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0392, code lost:
    
        if (r0 != r2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03e5, code lost:
    
        if (yyds.AbstractC2071.m3955(r2, r3, r17) == r0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x068e, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r1, r17) != r10) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x06a0, code lost:
    
        if (yyds.AbstractC2071.m3955(r1, r2, r17) != r10) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07b1, code lost:
    
        if (yyds.AbstractC2071.m3955(r2, r3, r17) == r0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b0, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r3, r17) == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d0, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r3, r17) != r10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0247, code lost:
    
        if (yyds.AbstractC2071.m3955(r3, r5, r17) == r2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0269, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r3, r17) != r2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0301, code lost:
    
        if (yyds.AbstractC2071.m3955(r0, r3, r17) == r11) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07dd  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0819  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:349:0x0815 -> B:340:0x07dd). Please report as a decompilation issue!!! */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        Object objM3955;
        int i;
        int i2;
        File fileM4805;
        InterfaceC0274[] interfaceC0274Arr;
        Object objM1590;
        Object objM4685;
        Object objM39552;
        Object objM39553;
        Object objM3774;
        Object objM37742;
        Object objM37743;
        Object objM37744;
        JSONObject jSONObject;
        int i3 = 15;
        int i4 = 11;
        int i5 = 10;
        int i6 = 0;
        int i7 = 2;
        int i8 = 1;
        Throwable th = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        switch (this.f1233) {
            case 0:
                String str = (String) this.f1234;
                C0184 c0184 = (C0184) this.f1232;
                TextView textView = c0184.f1083;
                LinearLayout linearLayout = c0184.f1084;
                C1213 c1213 = c0184.f1079;
                EnumC1765 enumC1765 = EnumC1765.f8858;
                int i9 = this.f1231;
                if (i9 == 0) {
                    AbstractC1544.m3189(obj);
                    C1206 c1206 = AbstractC0221.f1238;
                    ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
                    C0709 c0709 = new C0709(str, c0184, (InterfaceC0274) null);
                    this.f1231 = 1;
                    objM3955 = AbstractC2071.m3955(executorC2482, c0709, this);
                    if (objM3955 == enumC1765) {
                        return enumC1765;
                    }
                } else {
                    if (i9 != 1) {
                        C0188.m800(AbstractC2328.m4341(-163740906062702L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                    objM3955 = obj;
                }
                List<C2522> list = (List) objM3955;
                c0184.f1080 = list;
                LinearLayout linearLayout2 = c0184.f1065;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                File file = new File(str);
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (!((C2522) it.next()).f12446 && (i = i + 1) < 0) {
                            AbstractC2725.m4851();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                if (list == null || !list.isEmpty()) {
                    i2 = 0;
                    for (C2522 c2522 : list) {
                        Throwable th2 = th;
                        if (c2522.f12446) {
                            String absolutePath = c2522.f12445.getAbsolutePath();
                            File parentFile = file.getParentFile();
                            if (!AbstractC1544.m3188(absolutePath, parentFile != null ? parentFile.getAbsolutePath() : th2) && (i2 = i2 + 1) < 0) {
                                AbstractC2725.m4851();
                                throw th2;
                            }
                        }
                        th = th2;
                    }
                } else {
                    i2 = 0;
                }
                if (list.isEmpty()) {
                    c1213.setVisibility(8);
                    linearLayout.setVisibility(0);
                    textView.setText(AbstractC2328.m4341(-163642121814894L));
                } else {
                    c1213.setVisibility(0);
                    linearLayout.setVisibility(8);
                    StringBuilder sb = new StringBuilder();
                    if (i2 > 0) {
                        sb.append(i2 + AbstractC2328.m4341(-163663596651374L));
                    }
                    if (i > 0) {
                        if (i2 > 0) {
                            sb.append(AbstractC2328.m4341(-163685071487854L));
                        }
                        sb.append(i + AbstractC2328.m4341(-163702251357038L));
                    }
                    if (i2 == 0 && i == 0) {
                        sb.append(AbstractC2328.m4341(-163719431226222L));
                    }
                    textView.setText(sb.toString());
                    C2355 c2355 = new C2355(new ArrayList(list), str, new C1790(c0184, i8), new C1790(c0184, i7));
                    c0184.f1047 = c2355;
                    c1213.setAdapter(c2355);
                    c1213.getContext();
                    c1213.setLayoutManager(new LinearLayoutManager(1));
                }
                return C2746.f13459;
            case 1:
                C2746 c2746 = C2746.f13459;
                C0947 c0947 = (C0947) this.f1232;
                EnumC1765 enumC17652 = EnumC1765.f8858;
                int i10 = this.f1231;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1544.m3189(obj);
                        c0947.f4410--;
                        C1206 c12062 = AbstractC0221.f1238;
                        C1158 c1158 = AbstractC1353.f6250;
                        C2576 c2576 = new C2576(c0947, (C0119) this.f1234, objArr == true ? 1 : 0, i8);
                        this.f1231 = 2;
                        if (AbstractC2071.m3955(c1158, c2576, this) != enumC17652) {
                            if (c0947.f4410 > 0) {
                                return c2746;
                            }
                            C0135 c0135 = AbstractC0848.f3910;
                            long jM2771 = AbstractC1367.m2771(1000, EnumC0426.MILLISECONDS);
                            this.f1231 = 1;
                            Object objM2018 = AbstractC0902.m2018(AbstractC0902.m2016(jM2771), this);
                            if (objM2018 != enumC17652) {
                                objM2018 = c2746;
                            }
                            if (objM2018 != enumC17652) {
                                c0947.f4410--;
                                C1206 c120622 = AbstractC0221.f1238;
                                C1158 c11582 = AbstractC1353.f6250;
                                C2576 c25762 = new C2576(c0947, (C0119) this.f1234, objArr == true ? 1 : 0, i8);
                                this.f1231 = 2;
                                if (AbstractC2071.m3955(c11582, c25762, this) != enumC17652) {
                                }
                            }
                        }
                        return enumC17652;
                    }
                    if (i10 != 2) {
                        C0188.m800(AbstractC2328.m4341(-202674784600942L));
                        return null;
                    }
                }
                AbstractC1544.m3189(obj);
                if (c0947.f4410 > 0) {
                }
                break;
            case 2:
                EnumC1765 enumC17653 = EnumC1765.f8858;
                int i11 = this.f1231;
                if (i11 == 0) {
                    AbstractC1544.m3189(obj);
                    C2701 c2701 = C2701.f13261;
                    C1221 c1221 = C1221.f5600;
                    String strM4341 = AbstractC2328.m4341(-1083482382697326L);
                    String strM43412 = AbstractC2328.m4341(-1083542512239470L);
                    c1221.getClass();
                    String strM2480 = C1221.m2480(strM4341, strM43412);
                    c2701.getClass();
                    fileM4805 = C2701.m4805(strM2480);
                    C1206 c12063 = AbstractC0221.f1238;
                    ExecutorC2482 executorC24822 = ExecutorC2482.f12272;
                    C2576 c25763 = new C2576((Comment) this.f1234, fileM4805, objArr2 == true ? 1 : 0, i7);
                    this.f1232 = fileM4805;
                    this.f1231 = 1;
                    if (AbstractC2071.m3955(executorC24822, c25763, this) != enumC17653) {
                    }
                    return enumC17653;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC1544.m3189(obj);
                        return C2746.f13459;
                    }
                    C0188.m800(AbstractC2328.m4341(-1083563987075950L));
                    return null;
                }
                fileM4805 = (File) this.f1232;
                AbstractC1544.m3189(obj);
                C1206 c12064 = AbstractC0221.f1238;
                C1158 c11583 = AbstractC1353.f6250;
                C0275 c0275 = new C0275(fileM4805, null, 0);
                this.f1232 = null;
                this.f1231 = 2;
                break;
            case 3:
                EnumC1765 enumC17654 = EnumC1765.f8858;
                int i12 = this.f1231;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC1544.m3189(obj);
                        return obj;
                    }
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1544.m3189(obj);
                InterfaceC0477 interfaceC0477 = (InterfaceC0477) this.f1232;
                C1458 c1458 = (C1458) this.f1234;
                this.f1231 = 1;
                Object objMo511 = interfaceC0477.mo511(c1458, this);
                return objMo511 == enumC17654 ? enumC17654 : objMo511;
            case 4:
                EnumC1765 enumC17655 = EnumC1765.f8858;
                int i13 = this.f1231;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC1544.m3189(obj);
                        return obj;
                    }
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1544.m3189(obj);
                InterfaceC0477 interfaceC04772 = (InterfaceC0477) this.f1232;
                Object obj2 = ((C0172) this.f1234).f997;
                this.f1231 = 1;
                Object objMo5112 = interfaceC04772.mo511(obj2, this);
                return objMo5112 == enumC17655 ? enumC17655 : objMo5112;
            case 5:
                WardDatabase wardDatabase = (WardDatabase) this.f1232;
                EnumC1765 enumC17656 = EnumC1765.f8858;
                int i14 = this.f1231;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC1544.m3189(obj);
                        return obj;
                    }
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1544.m3189(obj);
                C0691 c0691 = new C0691((wardDatabase.m345() && wardDatabase.m347()) ? false : true, wardDatabase, null, (InterfaceC1549) this.f1234);
                this.f1231 = 1;
                Object objM346 = wardDatabase.m346(false, c0691, this);
                return objM346 == enumC17656 ? enumC17656 : objM346;
            case 6:
                EnumC1765 enumC17657 = EnumC1765.f8858;
                int i15 = this.f1231;
                try {
                } catch (Exception e) {
                    C1206 c12065 = AbstractC0221.f1238;
                    C1158 c11584 = AbstractC1353.f6250;
                    C0801 c0801 = new C0801(e, objArr3 == true ? 1 : 0, i6);
                    this.f1231 = 4;
                    break;
                }
                if (i15 == 0) {
                    AbstractC1544.m3189(obj);
                    C1206 c12066 = AbstractC0221.f1238;
                    C1158 c11585 = AbstractC1353.f6250;
                    C0266 c0266 = new C0266(2, null, 1);
                    this.f1231 = 1;
                    if (AbstractC2071.m3955(c11585, c0266, this) == enumC17657) {
                    }
                    return enumC17657;
                }
                if (i15 == 1) {
                    AbstractC1544.m3189(obj);
                } else {
                    if (i15 != 2) {
                        if (i15 == 3 || i15 == 4) {
                            AbstractC1544.m3189(obj);
                            return C2746.f13459;
                        }
                        C0188.m800(AbstractC2328.m4341(-146848799687534L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                    C1206 c12067 = AbstractC0221.f1238;
                    C1158 c11586 = AbstractC1353.f6250;
                    C0266 c02662 = new C0266(2, null, 2);
                    this.f1231 = 3;
                }
                break;
                C1327 c1327 = C1327.f6093;
                Context context = (Context) this.f1232;
                String str2 = ((C1274) this.f1234).f5862;
                this.f1231 = 2;
                if (C1327.m2620(context, str2, null, null, this, 60) != enumC17657) {
                    C1206 c120672 = AbstractC0221.f1238;
                    C1158 c115862 = AbstractC1353.f6250;
                    C0266 c026622 = new C0266(2, null, 2);
                    this.f1231 = 3;
                    break;
                }
                return enumC17657;
            case 7:
                C2746 c27462 = C2746.f13459;
                EnumC1765 enumC17658 = EnumC1765.f8858;
                int i16 = this.f1231;
                try {
                    if (i16 == 0) {
                        AbstractC1544.m3189(obj);
                        List list2 = ((UrlModel) this.f1232).urlList;
                        AbstractC2328.m4341(-949642611819374L);
                        String str3 = (String) AbstractC1595.m3280(list2);
                        C2336.f11496.m4354(AbstractC2328.m4341(-949676971557742L) + str3);
                        Context context2 = (Context) this.f1234;
                        this.f1231 = 1;
                        C1327 c13272 = C1327.f6093;
                        Object objM2620 = C1327.m2620(context2, str3, null, null, this, 60);
                        if (objM2620 != enumC17658) {
                            objM2620 = c27462;
                        }
                        if (objM2620 == enumC17658) {
                            return enumC17658;
                        }
                    } else {
                        if (i16 != 1) {
                            C0188.m800(AbstractC2328.m4341(-949805820576622L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                    }
                    break;
                } catch (Exception e2) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-949707036328814L) + e2.getMessage(), e2);
                    AbstractC1960.m3789(AbstractC2328.m4341(-949775755805550L) + e2.getMessage());
                }
                return c27462;
            case 8:
                C2280 c2280 = (C2280) this.f1232;
                EnumC1765 enumC17659 = EnumC1765.f8858;
                int i17 = this.f1231;
                if (i17 == 0) {
                    AbstractC1544.m3189(obj);
                    C1206 c12068 = AbstractC0221.f1238;
                    C1158 c11587 = AbstractC1353.f6250;
                    C2576 c25764 = new C2576((C0093) this.f1234, c2280, objArr4 == true ? 1 : 0, i5);
                    this.f1232 = null;
                    this.f1231 = 1;
                    if (AbstractC2071.m3955(c11587, c25764, this) == enumC17659) {
                        return enumC17659;
                    }
                } else {
                    if (i17 != 1) {
                        C0188.m800(AbstractC2328.m4341(-757983991202670L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                }
                return C2746.f13459;
            case 9:
                EnumC1765 enumC176510 = EnumC1765.f8858;
                int i18 = this.f1231;
                if (i18 == 0) {
                    AbstractC1544.m3189(obj);
                    String[] strArr = (String[]) this.f1232;
                    AbstractC0068.m441(Arrays.copyOf(strArr, strArr.length));
                    C0674 c0674 = ((C1735) this.f1234).f8772;
                    this.f1231 = 1;
                    InterfaceC0274[] interfaceC0274Arr2 = AbstractC0598.f2824;
                    synchronized (c0674) {
                        interfaceC0274Arr = interfaceC0274Arr2;
                    }
                    int length = interfaceC0274Arr.length;
                    while (i6 < length) {
                        InterfaceC0274 interfaceC0274 = interfaceC0274Arr[i6];
                        if (interfaceC0274 != null) {
                            interfaceC0274.mo812(C2746.f13459);
                        }
                        i6++;
                    }
                    if (C2746.f13459 == enumC176510) {
                        return enumC176510;
                    }
                } else {
                    if (i18 != 1) {
                        C0188.m800("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                }
                C0522 c0522 = ((C1735) this.f1234).f8776;
                ReentrantLock reentrantLock = c0522.f2511;
                reentrantLock.lock();
                try {
                    List listM3269 = AbstractC1595.m3269(c0522.f2518.values());
                    reentrantLock.unlock();
                    Iterator it2 = listM3269.iterator();
                    while (it2.hasNext()) {
                        ((C2513) it2.next()).f12380.getClass();
                    }
                    return C2746.f13459;
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            case 10:
                EnumC1765 enumC176511 = EnumC1765.f8858;
                int i19 = this.f1231;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC1544.m3189(obj);
                        return obj;
                    }
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1544.m3189(obj);
                InterfaceC0477 interfaceC04773 = (InterfaceC0477) this.f1232;
                C1277 c1277 = (C1277) this.f1234;
                this.f1231 = 1;
                Object objMo5113 = interfaceC04773.mo511(c1277, this);
                return objMo5113 == enumC176511 ? enumC176511 : objMo5113;
            case 11:
                EnumC1765 enumC176512 = EnumC1765.f8858;
                int i20 = this.f1231;
                if (i20 != 0) {
                    if (i20 == 1) {
                        AbstractC1544.m3189(obj);
                        return obj;
                    }
                    C0188.m800("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1544.m3189(obj);
                if (((InterfaceC0990) this.f1232).mo119().mo423(C0058.f575) == null) {
                    C0188.m800("Expected a TransactionElement in the CoroutineContext but none was found.");
                    return null;
                }
                InterfaceC1549 interfaceC1549 = (InterfaceC1549) this.f1234;
                this.f1231 = 1;
                Object objMo371 = interfaceC1549.mo371(this);
                return objMo371 == enumC176512 ? enumC176512 : objMo371;
            case 12:
                EnumC1765 enumC176513 = EnumC1765.f8858;
                int i21 = this.f1231;
                if (i21 == 0) {
                    AbstractC1544.m3189(obj);
                    C1186 c1186 = (C1186) this.f1232;
                    Activity activity = c1186.f5429;
                    JSONObject jSONObject2 = (JSONObject) this.f1234;
                    this.f1231 = 1;
                    if (c1186.m2385(activity, jSONObject2, this) == enumC176513) {
                        return enumC176513;
                    }
                } else {
                    if (i21 != 1) {
                        C0188.m800(AbstractC2328.m4341(-123866429686638L));
                        return null;
                    }
                    AbstractC1544.m3189(obj);
                }
                return C2746.f13459;
            case 13:
                InterfaceC2266 interfaceC2266 = (InterfaceC2266) this.f1234;
                EnumC1765 enumC176514 = EnumC1765.f8858;
                int i22 = this.f1231;
                try {
                    if (i22 == 0) {
                        AbstractC1544.m3189(obj);
                        C0682 c0682 = (C0682) this.f1232;
                        this.f1231 = 1;
                        objM1590 = c0682.m1590(this);
                        if (objM1590 == enumC176514) {
                            return enumC176514;
                        }
                    } else {
                        if (i22 != 1) {
                            C0188.m800("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                        objM1590 = obj;
                    }
                    interfaceC2266.mo731();
                    return C2746.f13459;
                } catch (Throwable th4) {
                    interfaceC2266.mo731();
                    throw th4;
                }
            case 14:
                EnumC1765 enumC176515 = EnumC1765.f8858;
                int i23 = this.f1231;
                if (i23 == 0) {
                    AbstractC1544.m3189(obj);
                    Map map = C2609.f12814;
                    Aweme aweme = (Aweme) this.f1232;
                    this.f1231 = 1;
                    objM4685 = C2609.m4685(aweme, this);
                    if (objM4685 != enumC176515) {
                    }
                    return enumC176515;
                }
                if (i23 != 1) {
                    if (i23 == 2) {
                        AbstractC1544.m3189(obj);
                        return C2746.f13459;
                    }
                    C0188.m800(AbstractC2328.m4341(-103353665880942L));
                    return null;
                }
                AbstractC1544.m3189(obj);
                objM4685 = obj;
                C1206 c12069 = AbstractC0221.f1238;
                C1158 c11588 = AbstractC1353.f6250;
                C2576 c25765 = new C2576((C2585) this.f1234, (String) objM4685, objArr5 == true ? 1 : 0, 13);
                this.f1231 = 2;
                break;
            case 15:
                C0645 c0645 = (C0645) this.f1234;
                EnumC1765 enumC176516 = EnumC1765.f8858;
                int i24 = this.f1231;
                try {
                } catch (Exception e3) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-316959569380206L), e3);
                    C1206 c120610 = AbstractC0221.f1238;
                    C1158 c11589 = AbstractC1353.f6250;
                    C2095 c2095 = new C2095(c0645, null, 1);
                    this.f1231 = 2;
                    objM39552 = AbstractC2071.m3955(c11589, c2095, this);
                    break;
                }
                if (i24 == 0) {
                    AbstractC1544.m3189(obj);
                    ((C0380) ((C2133) this.f1232).f10555).m1082();
                    C1206 c120611 = AbstractC0221.f1238;
                    C1158 c115810 = AbstractC1353.f6250;
                    C2095 c20952 = new C2095(c0645, null, 0);
                    this.f1231 = 1;
                    objM39553 = AbstractC2071.m3955(c115810, c20952, this);
                    if (objM39553 == enumC176516) {
                        return enumC176516;
                    }
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            C0188.m800(AbstractC2328.m4341(-316981044216686L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                        objM39552 = obj;
                        return C2746.f13459;
                    }
                    AbstractC1544.m3189(obj);
                    objM39553 = obj;
                }
                return C2746.f13459;
            case 16:
                C0046 c0046 = (C0046) this.f1234;
                EnumC1765 enumC176517 = EnumC1765.f8858;
                int i25 = this.f1231;
                try {
                } catch (Exception e4) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-6137081135982L), e4);
                    C1206 c120612 = AbstractC0221.f1238;
                    C1158 c115811 = AbstractC1353.f6250;
                    C0853 c0853 = new C0853(c0046, objArr6 == true ? 1 : 0, i4);
                    this.f1231 = 3;
                    break;
                }
                if (i25 == 0) {
                    AbstractC1544.m3189(obj);
                    C0380 c0380 = (C0380) ((C2133) this.f1232).f10555;
                    this.f1231 = 1;
                    c0380.getClass();
                    objM3774 = AbstractC1960.m3774(c0380.f1954, this, new C1302(AbstractC2328.m4341(-1398728687256430L), 18), true, false);
                    if (objM3774 == enumC176517) {
                    }
                    return enumC176517;
                }
                if (i25 != 1) {
                    if (i25 == 2 || i25 == 3) {
                        AbstractC1544.m3189(obj);
                        return C2746.f13459;
                    }
                    C0188.m800(AbstractC2328.m4341(-6158555972462L));
                    return null;
                }
                AbstractC1544.m3189(obj);
                objM3774 = obj;
                List<C2210> list3 = (List) objM3774;
                ArrayList arrayList = new ArrayList(AbstractC0055.m419(list3, 10));
                for (C2210 c2210 : list3) {
                    arrayList.add(new C2236(c2210.f10942, c2210.f10943));
                }
                C1206 c120613 = AbstractC0221.f1238;
                C1158 c115812 = AbstractC1353.f6250;
                C2576 c25766 = new C2576(c0046, arrayList, objArr7 == true ? 1 : 0, i3);
                this.f1231 = 2;
                break;
            case 17:
                C1584 c1584 = (C1584) this.f1234;
                EnumC1765 enumC176518 = EnumC1765.f8858;
                int i26 = this.f1231;
                try {
                } catch (Exception e5) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1453369261196142L), e5);
                    C1206 c120614 = AbstractC0221.f1238;
                    C1158 c115813 = AbstractC1353.f6250;
                    C0853 c08532 = new C0853(c1584, objArr8 == true ? 1 : 0, 12);
                    this.f1231 = 3;
                    break;
                }
                if (i26 == 0) {
                    AbstractC1544.m3189(obj);
                    C0380 c03802 = (C0380) ((C2133) this.f1232).f10555;
                    this.f1231 = 1;
                    c03802.getClass();
                    objM37742 = AbstractC1960.m3774(c03802.f1954, this, new C1302(AbstractC2328.m4341(-1385306914456430L), 14), true, false);
                    if (objM37742 == enumC176518) {
                    }
                    return enumC176518;
                }
                if (i26 != 1) {
                    if (i26 == 2 || i26 == 3) {
                        AbstractC1544.m3189(obj);
                        return C2746.f13459;
                    }
                    C0188.m800(AbstractC2328.m4341(-1453390736032622L));
                    return null;
                }
                AbstractC1544.m3189(obj);
                objM37742 = obj;
                int iIntValue = ((Number) objM37742).intValue();
                C1206 c120615 = AbstractC0221.f1238;
                C1158 c115814 = AbstractC1353.f6250;
                C2793 c2793 = new C2793(c1584, iIntValue, null, 7);
                this.f1231 = 2;
                break;
            case 18:
                C1785 c1785 = (C1785) this.f1234;
                EnumC1765 enumC176519 = EnumC1765.f8858;
                int i27 = this.f1231;
                try {
                } catch (Exception e6) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1319422116135790L), e6);
                    C1206 c120616 = AbstractC0221.f1238;
                    C1158 c115815 = AbstractC1353.f6250;
                    C0853 c08533 = new C0853(c1785, objArr9 == true ? 1 : 0, i3);
                    this.f1231 = 3;
                    break;
                }
                if (i27 == 0) {
                    AbstractC1544.m3189(obj);
                    C0380 c03803 = (C0380) ((C2133) this.f1232).f10555;
                    this.f1231 = 1;
                    c03803.getClass();
                    objM37743 = AbstractC1960.m3774(c03803.f1954, this, new C1302(AbstractC2328.m4341(-1399274148103022L), 16), true, false);
                    if (objM37743 == enumC176519) {
                    }
                    return enumC176519;
                }
                if (i27 != 1) {
                    if (i27 == 2 || i27 == 3) {
                        AbstractC1544.m3189(obj);
                        return C2746.f13459;
                    }
                    C0188.m800(AbstractC2328.m4341(-1319443590972270L));
                    return null;
                }
                AbstractC1544.m3189(obj);
                objM37743 = obj;
                List<C0446> list4 = (List) objM37743;
                ArrayList arrayList2 = new ArrayList(AbstractC0055.m419(list4, 10));
                for (C0446 c0446 : list4) {
                    arrayList2.add(new C2484(c0446.f2275, c0446.f2272, c0446.f2273, c0446.f2274));
                }
                C1206 c120617 = AbstractC0221.f1238;
                C1158 c115816 = AbstractC1353.f6250;
                C2576 c25767 = new C2576(c1785, arrayList2, objArr10 == true ? 1 : 0, 17);
                this.f1231 = 2;
                break;
            default:
                Context context3 = (Context) this.f1234;
                EnumC1765 enumC176520 = EnumC1765.f8858;
                int i28 = this.f1231;
                if (i28 == 0) {
                    AbstractC1544.m3189(obj);
                    JSONObject jSONObject3 = new JSONObject();
                    C1239.f5669.getClass();
                    ArrayList arrayListM2527 = C1239.m2527(context3);
                    JSONArray jSONArray = new JSONArray();
                    Iterator it3 = arrayListM2527.iterator();
                    while (it3.hasNext()) {
                        jSONArray.put((String) it3.next());
                    }
                    jSONObject3.put(AbstractC2328.m4341(-564242311447406L), jSONArray);
                    C1239.f5669.getClass();
                    String strM2528 = C1239.m2528(context3);
                    String strM43413 = AbstractC2328.m4341(-564289556087662L);
                    if (strM2528 == null) {
                        strM2528 = AbstractC2328.m4341(-564379750400878L);
                    }
                    jSONObject3.put(strM43413, strM2528);
                    C0380 c0380Mo344 = WardDatabase.f492.m1272(context3).mo344();
                    this.f1232 = jSONObject3;
                    this.f1231 = 1;
                    c0380Mo344.getClass();
                    objM37744 = AbstractC1960.m3774(c0380Mo344.f1954, this, new C1302(AbstractC2328.m4341(-1373190811714414L), 11), true, false);
                    if (objM37744 == enumC176520) {
                        return enumC176520;
                    }
                    jSONObject = jSONObject3;
                } else {
                    if (i28 != 1) {
                        C0188.m800(AbstractC2328.m4341(-564654628307822L));
                        return null;
                    }
                    JSONObject jSONObject4 = (JSONObject) this.f1232;
                    AbstractC1544.m3189(obj);
                    jSONObject = jSONObject4;
                    objM37744 = obj;
                }
                List list5 = (List) objM37744;
                JSONArray jSONArray2 = new JSONArray();
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    jSONArray2.put(((C2770) it4.next()).m4888());
                }
                jSONObject.put(AbstractC2328.m4341(-564384045368174L), jSONArray2);
                jSONObject.put(AbstractC2328.m4341(-564426995041134L), list5.size());
                jSONObject.put(AbstractC2328.m4341(-564491419550574L), System.currentTimeMillis());
                jSONObject.put(AbstractC2328.m4341(-564538664190830L), AbstractC2328.m4341(-564598793732974L));
                return jSONObject;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f1233;
        Object obj2 = this.f1234;
        switch (i) {
            case 0:
                return new C0219((C0184) this.f1232, (String) obj2, interfaceC0274, 0);
            case 1:
                return new C0219((C0947) this.f1232, (C0119) obj2, interfaceC0274, 1);
            case 2:
                return new C0219((Comment) obj2, interfaceC0274, 2);
            case 3:
                return new C0219((InterfaceC0477) this.f1232, (C1458) obj2, interfaceC0274, 3);
            case 4:
                return new C0219((InterfaceC0477) this.f1232, (C0172) obj2, interfaceC0274, 4);
            case 5:
                return new C0219((WardDatabase) this.f1232, (InterfaceC1549) obj2, interfaceC0274, 5);
            case 6:
                return new C0219((Context) this.f1232, (C1274) obj2, interfaceC0274, 6);
            case 7:
                return new C0219((UrlModel) this.f1232, (Context) obj2, interfaceC0274, 7);
            case 8:
                C0219 c0219 = new C0219((C0093) obj2, interfaceC0274, 8);
                c0219.f1232 = obj;
                return c0219;
            case 9:
                return new C0219((String[]) this.f1232, (C1735) obj2, interfaceC0274, 9);
            case 10:
                return new C0219((InterfaceC0477) this.f1232, (C1277) obj2, interfaceC0274, 10);
            case 11:
                C0219 c02192 = new C0219((InterfaceC1549) obj2, interfaceC0274, 11);
                c02192.f1232 = obj;
                return c02192;
            case 12:
                return new C0219((C1186) this.f1232, (JSONObject) obj2, interfaceC0274, 12);
            case 13:
                return new C0219((C0682) this.f1232, (InterfaceC2266) obj2, interfaceC0274, 13);
            case 14:
                return new C0219((Aweme) this.f1232, (C2585) obj2, interfaceC0274, 14);
            case 15:
                return new C0219((C2133) this.f1232, (C0645) obj2, interfaceC0274, 15);
            case 16:
                return new C0219((C2133) this.f1232, (C0046) obj2, interfaceC0274, 16);
            case 17:
                return new C0219((C2133) this.f1232, (C1584) obj2, interfaceC0274, 17);
            case 18:
                return new C0219((C2133) this.f1232, (C1785) obj2, interfaceC0274, 18);
            default:
                return new C0219((Context) obj2, interfaceC0274, 19);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f1233;
        C2746 c2746 = C2746.f13459;
        switch (i) {
        }
        return ((C0219) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(c2746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0219(Object obj, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f1233 = i;
        this.f1234 = obj;
    }
}
