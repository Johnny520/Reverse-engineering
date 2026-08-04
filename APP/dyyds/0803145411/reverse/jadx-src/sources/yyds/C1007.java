package yyds;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.util.Base64;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛵᛱᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1007 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f4575;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4576;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4577;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f4578;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f4579;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007(TextView textView, String str, String str2, String str3, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f4577 = 5;
        this.f4575 = textView;
        this.f4579 = str;
        this.f4578 = str2;
        this.f4576 = str3;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Exception {
        Object c2658;
        String string;
        Object c26582;
        Object obj2;
        EnumMap enumMap;
        String strM1405;
        int i;
        float fM1483;
        int size;
        boolean z = false;
        switch (this.f4577) {
            case 0:
                AbstractC1544.m3189(obj);
                String str = ((C2302) this.f4576).f11306;
                String str2 = (String) this.f4579;
                String str3 = (String) this.f4578;
                String strEncode = URLEncoder.encode(str2, AbstractC2328.m4341(-126464884900718L));
                C1509.f7142.getClass();
                String str4 = C1509.m3131() == 2 ? AbstractC2328.m4341(-126490654704494L) + str + AbstractC2328.m4341(-126688223200110L) + strEncode + AbstractC2328.m4341(-126718287971182L) + str3 : AbstractC2328.m4341(-126756942676846L) + str + AbstractC2328.m4341(-126928741368686L) + strEncode + AbstractC2328.m4341(-126958806139758L) + str3;
                C1633 c1633 = new C1633();
                c1633.m3334(str4);
                C2098 c2098 = new C2098(c1633);
                C1327 c1327 = C1327.f6093;
                C1284 c1284M2619 = C1327.m2619();
                c1284M2619.getClass();
                C0837 c0837M4863 = new C2729(c1284M2619, c2098).m4863();
                if (!c0837M4863.f3852) {
                    throw new Exception(AbstractC2328.m4341(-126997460845422L) + c0837M4863.f3860);
                }
                JSONObject jSONObject = new JSONObject(c0837M4863.f3849.m1080());
                if (!AbstractC1544.m3188(jSONObject.optString(AbstractC2328.m4341(-127027525616494L)), AbstractC2328.m4341(-127049000452974L))) {
                    throw new Exception(jSONObject.optString(AbstractC2328.m4341(-127066180322158L), AbstractC2328.m4341(-127100540060526L)));
                }
                String strOptString = jSONObject.optString(AbstractC2328.m4341(-127122014897006L));
                if (strOptString.length() != 0) {
                    return strOptString;
                }
                throw new Exception(AbstractC2328.m4341(-127139194766190L));
            case 1:
                AbstractC1544.m3189(obj);
                Context context = (Context) this.f4575;
                C0763 c0763M1709 = C0763.m1709(context);
                c0763M1709.f3518 = AbstractC2328.m4341(-201356229641070L);
                c0763M1709.mo1719();
                c0763M1709.f3522 = new C0815((ScrollView) this.f4576, (Comment) this.f4579, context, (LinearLayout) this.f4578);
                c0763M1709.mo1719();
                c0763M1709.m1715(context);
                return c0763M1709;
            case 2:
                AbstractC1544.m3189(obj);
                C1641 c1641 = (C1641) this.f4576;
                Context context2 = (Context) this.f4579;
                Uri uri = (Uri) this.f4578;
                try {
                    C1082 c1082 = C1082.f4981;
                    Object obj3 = C1082.f4982;
                    synchronized (obj3) {
                        C1082.m2290(c1641);
                    }
                    C1082.m2285(context2, uri);
                    byte[] bArrM2289 = C1082.m2289(context2, uri);
                    synchronized (obj3) {
                        C1082.m2290(c1641);
                    }
                    Bitmap bitmapM2287 = C1082.m2287(bArrM2289);
                    if (bitmapM2287 == null) {
                        throw new IllegalArgumentException(AbstractC2328.m4341(-545610743317358L));
                    }
                    synchronized (obj3) {
                        C1082.m2290(c1641);
                    }
                    String strEncodeToString = Base64.encodeToString(C1082.m2288(bitmapM2287), 2);
                    if (strEncodeToString.length() > 2700000) {
                        throw new IllegalArgumentException(AbstractC2328.m4341(-545675167826798L).toString());
                    }
                    synchronized (obj3) {
                        C1082.m2290(c1641);
                        C1509.f7142.getClass();
                        C1509.m3077(strEncodeToString);
                        string = UUID.randomUUID().toString();
                        AbstractC2328.m4341(-562782022566766L);
                        C1509.m3093(string);
                        C1082.f4986 = new C1816(bitmapM2287, string);
                        C1082.f4980 = null;
                    }
                    if (!AbstractC0473.m1313(string)) {
                        C1082.m2291();
                    }
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                return new C2248(c2658);
            case 3:
                AbstractC1544.m3189(obj);
                C2041 c2041 = (C2041) this.f4576;
                Context context3 = (Context) this.f4579;
                Uri uri2 = (Uri) this.f4578;
                try {
                    EnumC0868 enumC0868 = c2041.f10154;
                    C0561 c0561 = C0561.f2672;
                    C0561.m1415(c2041);
                    C0561.m1413(context3, uri2);
                    byte[] bArrM1412 = C0561.m1412(context3, uri2);
                    C0561.m1415(c2041);
                    Bitmap bitmapM1409 = C0561.m1409(32768, bArrM1412);
                    if (bitmapM1409 == null) {
                        throw new IllegalArgumentException(AbstractC2328.m4341(-545237081162606L));
                    }
                    C0561.m1415(c2041);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        if (!bitmapM1409.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
                            throw new IllegalStateException(AbstractC2328.m4341(-787889848484718L).toString());
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString2 = Base64.encodeToString(byteArray, 2);
                        if (strEncodeToString2.length() > 1000000) {
                            throw new IllegalArgumentException(AbstractC2328.m4341(-787919913255790L).toString());
                        }
                        synchronized (C0561.f2676[enumC0868.ordinal()]) {
                            C0561.m1416(c2041);
                            obj2 = C0561.f2673;
                            synchronized (obj2) {
                                enumMap = C0561.f2671;
                                enumMap.remove(enumC0868);
                            }
                            C0561.m1406(enumC0868, strEncodeToString2);
                            strM1405 = C0561.m1405();
                            C0561.m1404(enumC0868, strM1405);
                        }
                        synchronized (obj2) {
                            enumMap.put(enumC0868, new C2726(bitmapM1409, strM1405));
                        }
                        C1223 c1223 = new C1223(8, enumC0868);
                        if (AbstractC1544.m3188(Looper.myLooper(), Looper.getMainLooper())) {
                            c1223.mo731();
                        } else {
                            C0561.f2670.post(new RunnableC0309(5, c1223));
                        }
                        c26582 = C2746.f13459;
                    } finally {
                    }
                } catch (Throwable th2) {
                    c26582 = new C2658(th2);
                }
                return new C2248(c26582);
            case 4:
                AbstractC1544.m3189(obj);
                C0832 c0832 = (C0832) this.f4575;
                C2280 c2280 = (C2280) this.f4576;
                int i2 = ((C0947) this.f4579).f4410;
                int i3 = ((C0947) this.f4578).f4410;
                C1508 c1508 = c0832.f3810;
                AbstractC2328.m4341(-112811183866734L);
                long j = c2280.f11219;
                if (j < 0) {
                    j = 0;
                }
                long j2 = c2280.f11220;
                boolean z2 = j2 > 0;
                if (z2) {
                    i = i2;
                    fM1483 = AbstractC0598.m1483((float) (j / j2), 0.0f, 1.0f);
                } else {
                    i = i2;
                    fM1483 = 0.0f;
                }
                if (z2) {
                    c1508.f7099.setIndeterminate(false);
                    c1508.f7099.setProgress(AbstractC0181.m748(1000.0f * fM1483), true);
                    c1508.f7092.m361(fM1483, false);
                    c1508.f7096.setText(AbstractC0090.m490(fM1483));
                    c1508.f7094.setText(AbstractC0090.m497(j) + AbstractC2328.m4341(-112849838572398L) + AbstractC0090.m497(j2));
                } else {
                    c1508.f7099.setIndeterminate(true);
                    c1508.f7092.m361(0.0f, true);
                    c1508.f7096.setText(AbstractC2328.m4341(-112867018441582L));
                    c1508.f7094.setText(AbstractC2328.m4341(-112879903343470L) + AbstractC0090.m497(j) + AbstractC2328.m4341(-112901378179950L));
                }
                int i4 = i;
                c0832.m1893(i4, i3);
                c0832.m1894(i4 + fM1483);
                if (!c0832.f3807) {
                    c1508.f7093.setText(AbstractC2328.m4341(-112935737918318L));
                }
                return C2746.f13459;
            case 5:
                AbstractC1544.m3189(obj);
                TextView textView = (TextView) this.f4575;
                C1900 c1900 = C1900.f9621;
                String str5 = (String) this.f4579;
                String str6 = (String) this.f4578;
                String str7 = (String) this.f4576;
                c1900.getClass();
                textView.setText(C1900.m3683(str5, str6, str7));
                return C2746.f13459;
            default:
                AbstractC1544.m3189(obj);
                C2226 c2226 = C2226.f10992;
                Activity activity = (Activity) this.f4575;
                Object obj4 = this.f4576;
                C1641 c16412 = (C1641) this.f4579;
                ArrayList arrayList = (ArrayList) this.f4578;
                c2226.getClass();
                if (C1867.f9402.m3653(activity, c16412) && !activity.isFinishing() && !activity.isDestroyed()) {
                    try {
                        List listM4229 = C2226.m4229(obj4);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = listM4229.iterator();
                        while (it.hasNext()) {
                            String strM4228 = C2226.m4228(it.next());
                            if (strM4228 != null) {
                                arrayList2.add(strM4228);
                            }
                        }
                        HashSet hashSet = new HashSet(AbstractC2366.m4382(AbstractC0055.m419(arrayList2, 12)));
                        AbstractC1595.m3283(arrayList2, hashSet);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : arrayList) {
                            C2226.f10992.getClass();
                            String strM42282 = C2226.m4228(obj5);
                            if (strM42282 == null || AbstractC0473.m1313(strM42282) || hashSet.add(strM42282)) {
                                arrayList3.add(obj5);
                            }
                        }
                        if (arrayList3.isEmpty()) {
                            C2336.f11496.m4354(AbstractC2328.m4341(-895186721473390L));
                            z = true;
                        } else {
                            int size2 = C2226.m4229(obj4).size();
                            Method method = C2226.f10989;
                            if (method != null) {
                                method.setAccessible(true);
                                Object objInvoke = method.invoke(obj4, Integer.valueOf(size2), arrayList3);
                                boolean zM3188 = AbstractC1544.m3188(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
                                C2336 c2336 = C2336.f11496;
                                StringBuilder sb = new StringBuilder();
                                sb.append(AbstractC2328.m4341(-895435829576558L));
                                sb.append(zM3188);
                                sb.append(AbstractC2328.m4341(-895560383628142L));
                                sb.append(size2);
                                sb.append(AbstractC2328.m4341(-895599038333806L));
                                sb.append(arrayList3.size());
                                sb.append(AbstractC2328.m4341(-895637693039470L));
                                synchronized (C1867.f9402) {
                                    size = C1867.f9403.size();
                                }
                                sb.append(size);
                                c2336.m4354(sb.toString());
                                z = zM3188;
                            }
                        }
                    } catch (Throwable th3) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-895684937679726L), th3);
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f4577;
        Object obj2 = this.f4576;
        Object obj3 = this.f4578;
        Object obj4 = this.f4579;
        switch (i) {
            case 0:
                return new C1007((C0184) this.f4575, (C2302) obj2, (String) obj4, (String) obj3, interfaceC0274, 0);
            case 1:
                return new C1007((Context) this.f4575, (ScrollView) obj2, (Comment) obj4, (LinearLayout) obj3, interfaceC0274, 1);
            case 2:
                C1007 c1007 = new C1007((C1641) obj2, (Context) obj4, (Uri) obj3, interfaceC0274, 2);
                c1007.f4575 = obj;
                return c1007;
            case 3:
                C1007 c10072 = new C1007((C2041) obj2, (Context) obj4, (Uri) obj3, interfaceC0274, 3);
                c10072.f4575 = obj;
                return c10072;
            case 4:
                return new C1007((C0832) this.f4575, (C2280) obj2, (C0947) obj4, (C0947) obj3, interfaceC0274, 4);
            case 5:
                return new C1007((TextView) this.f4575, (String) obj4, (String) obj3, (String) obj2, interfaceC0274);
            default:
                return new C1007((Activity) this.f4575, this.f4576, (C1641) obj4, (ArrayList) obj3, interfaceC0274, 6);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Exception {
        int i = this.f4577;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                return ((C1007) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
            case 1:
                return ((C1007) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
            case 2:
                return ((C1007) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
            case 3:
                return ((C1007) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
            case 4:
                ((C1007) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 5:
                ((C1007) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            default:
                return ((C1007) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1007(Object obj, Context context, Uri uri, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f4577 = i;
        this.f4576 = obj;
        this.f4579 = context;
        this.f4578 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1007(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f4577 = i;
        this.f4575 = obj;
        this.f4576 = obj2;
        this.f4579 = obj3;
        this.f4578 = obj4;
    }
}
