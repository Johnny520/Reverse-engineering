package p001;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import p001.C0250i3;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.t9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0405t9 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ */
    public boolean f1115 = true;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f1116 = true;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1822;

    /* JADX INFO: renamed from: ۟.t9$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final C0433vb mo7() {
            C0405t9.this.getClass();
            C0373r3.m1210(C0341oa.m915(new byte[]{-116, -116, -97, 87, -82, 124, -127, -124, -101, 23, -8, 103, -118, -121, -124, 16, -77, 98, -63, -112, -122, 16, -75, 126, -118, -111, -36, 42, -94, 124, -116, -120, -105, 11, -108, 103, -128, -108, -127, 28, -92, 84, -116, -105, -101, 15, -65, 97, -106}, new byte[]{-17, -29, -14, 121, -42, 21}), C0341oa.m915(new byte[]{-17, 100, 25, -126, 67, 36, -12, 111}, new byte[]{-128, 10, 90, -16, 38, 69}), new Object[]{Bundle.class}, C0366q9.f1048);
            C0373r3.m1210(C0341oa.m915(new byte[]{-45, -76, 108, 82, 106, -37, -34, -68, 104, 18, 60, -37, -35, -11, 116, 21, 60, -45, -45, -81, 104, 10, 123, -58, -55, -11, 66, 20, 115, -58, -11, -74, 110, 22, 123, -30, -62, -66, 119, 21, 119, -59, -15, -72, 117, 21, 100, -37, -60, -94}, new byte[]{-80, -37, 1, 124, 18, -78}), C0341oa.m915(new byte[]{-24, 107, 42, -72, 93, 3, -13, 96}, new byte[]{-121, 5, 105, -54, 56, 98}), new Object[]{Bundle.class}, C0392s9.f1093);
            return C0433vb.f1163;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m1236(C0405t9 c0405t9, XC_MethodHook.MethodHookParam methodHookParam) {
        LinearLayout linearLayout;
        Object obj = methodHookParam.thisObject;
        int i = 6;
        C0237h4.m1089(C0341oa.m915(new byte[]{-27, 105, -128, 32, -122, -11, -5, 100, -118, 39}, new byte[]{-111, 1, -23, 83, -55, -105}), obj);
        C0274k c0274k = C0283k8.f1632;
        Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1576);
        C0325n8.f994.getClass();
        View viewM1159 = C0325n8.m1159(methodHookParam);
        if (viewM1159 != null) {
            String str = C0283k8.a.m885().f1578;
            C0237h4.m1089(C0341oa.m915(new byte[]{-76, -76, 89, 94, -33, 96, -65, -80, 72, 72, -44, 121, -102, -66, 127, 101, -46, 91, -107, -90}, new byte[]{-7, -43, 45, 44, -74, 24}), str);
            Integer numM1206 = C0373r3.m1206(str, C0283k8.a.m885().f1577);
            linearLayout = (LinearLayout) viewM1159.findViewById(numM1206 != null ? numM1206.intValue() : -1);
        } else {
            linearLayout = null;
        }
        if (objM1203 == null || linearLayout == null) {
            return;
        }
        if (C0237h4.m864(C0373r3.m1203(objM1203, C0341oa.m915(new byte[]{-127, 45, -108, 1, -78, -75, -97, 39}, new byte[]{-17, 66, -32, 100, -26, -52})), C0341oa.m915(new byte[]{-9, 119, -13, 20, 77, 97}, new byte[]{-103, 24, -127, 121, 44, 13}))) {
            c0405t9.m1241(linearLayout, objM1203);
            return;
        }
        c0405t9.getClass();
        Context context = linearLayout.getContext();
        C0237h4.m1089(C0341oa.m915(new byte[]{-17, -51, -27, -83, 57, 99, -4, -51, -23, -102, 126, 35, -90, -122, -72}, new byte[]{-120, -88, -111, -18, 86, 13}), context);
        TextView textViewM1243 = c0405t9.m1243(context, C0341oa.m915(new byte[]{55, 82, 121, 100, 83, -57, 59, 74, 98, 104, 92, -50, -5, 11, 115, 33, 24, -17, 103, 8, 105, 49, -41}, new byte[]{-45, -19, -28, -127, -2, 95}));
        textViewM1243.setOnClickListener(new ViewOnClickListenerC0458xa(5));
        linearLayout.addView(textViewM1243);
        if (C0211f6.f1446.length() > 0) {
            Context context2 = linearLayout.getContext();
            C0237h4.m1089(C0341oa.m915(new byte[]{-88, 40, 106, 30, 62, -118, -69, 40, 102, 41, 121, -54, -31, 99, 55}, new byte[]{-49, 77, 30, 93, 81, -28}), context2);
            TextView textViewM12432 = c0405t9.m1243(context2, C0341oa.m915(new byte[]{97, -109, -6, -29, -75, -3, 96, -94, -8, -29, -69, -43}, new byte[]{-123, 44, 103, 6, 24, 101}));
            textViewM12432.setOnClickListener(new ViewOnClickListenerC0458xa(i));
            linearLayout.addView(textViewM12432);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1237(C0405t9 c0405t9, LinearLayout linearLayout, Object obj) {
        c0405t9.getClass();
        Context context = linearLayout.getContext();
        C0237h4.m1089(C0341oa.m915(new byte[]{-40, -101, 118, -84, 37, -102, -53, -101, 122, -101, 98, -38, -111, -48, 43}, new byte[]{-65, -2, 2, -17, 74, -12}), context);
        LinearLayout linearLayoutM1242 = c0405t9.m1242(context);
        c0405t9.m1241(linearLayoutM1242, obj);
        linearLayout.addView(linearLayoutM1242, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final void m1238(C0405t9 c0405t9, LinearLayout linearLayout) {
        c0405t9.getClass();
        Context context = linearLayout.getContext();
        C0237h4.m1089(C0341oa.m915(new byte[]{42, 84, -111, -63, -62, 0, 57, 84, -99, -10, -123, 64, 99, 31, -52}, new byte[]{77, 49, -27, -126, -83, 110}), context);
        LinearLayout linearLayoutM1242 = c0405t9.m1242(context);
        Context context2 = linearLayout.getContext();
        C0237h4.m1089(C0341oa.m915(new byte[]{-111, -25, 38, -10, 93, -127, -126, -25, 42, -63, 26, -63, -40, -84, 123}, new byte[]{-10, -126, 82, -75, 50, -17}), context2);
        TextView textViewM1243 = c0405t9.m1243(context2, C0341oa.m915(new byte[]{119, -80, -128, -77, -39, -31, 123, -88, -101, -65, -42, -24, -69, -23, -118, -10, -110, -55, 39, -22, -112, -26, 93}, new byte[]{-109, 15, 29, 86, 116, 121}));
        textViewM1243.setOnClickListener(new ViewOnClickListenerC0458xa(3));
        linearLayoutM1242.addView(textViewM1243);
        if (C0211f6.f1446.length() > 0) {
            Context context3 = linearLayout.getContext();
            C0237h4.m1089(C0341oa.m915(new byte[]{76, 87, -34, -118, 94, 115, 95, 87, -46, -67, 25, 51, 5, 28, -125}, new byte[]{43, 50, -86, -55, 49, 29}), context3);
            TextView textViewM12432 = c0405t9.m1243(context3, C0341oa.m915(new byte[]{-121, 79, -82, -15, 50, -101, -122, 126, -84, -15, 60, -77}, new byte[]{99, -16, 51, 20, -97, 3}));
            textViewM12432.setOnClickListener(new ViewOnClickListenerC0458xa(4));
            linearLayoutM1242.addView(textViewM12432);
        }
        linearLayout.addView(linearLayoutM1242, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static ArrayList m1240(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj == null) {
            return arrayList;
        }
        boolean z = false;
        Object objM1202 = C0373r3.m1202(obj, C0341oa.m915(new byte[]{-11, 28, 40, 92, -119, -100, -48, 24, 58, 79}, new byte[]{-100, 113, 73, 59, -20, -17}), false);
        ArrayList arrayList2 = objM1202 instanceof ArrayList ? (ArrayList) objM1202 : null;
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            z = true;
        }
        if (!z) {
            return arrayList;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0250i3 c0250i3M871 = C0250i3.a.m871(it.next());
            if (c0250i3M871 != null) {
                arrayList.add(c0250i3M871);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090(C0341oa.m915(new byte[]{41, 76, -28, 46, 27, 102, 42, 112, -22, 32, 27}, new byte[]{89, 62, -117, 77, 126, 21}), str);
        this.f1115 = C0192e1.m846(EnumC0164c1.f1373);
        boolean zM846 = C0192e1.m846(EnumC0164c1.f1372);
        this.f1116 = zM846;
        if (this.f1115 && zM846) {
            String str2 = C0283k8.f1632.f1575;
            C0237h4.m1089(C0341oa.m915(new byte[]{-121, -65, 99, -111, 79, 69, -67, -79, 126, -104, 77, 69, -84, -76, 117, -107, 104, 75, -97, -30, 84, -101, 101, 84, -69, -65, 123, -104, 110, 82, -118, -68, 100}, new byte[]{-55, -48, 23, -12, 11, 32}), str2);
            C0373r3.m1208(str2, C0341oa.m915(new byte[]{93, -122, 50, -64, 17, -46, 81, -128}, new byte[]{50, -24, 115, -76, 101, -77}), new Object[]{Bundle.class}, new C0326n9(this));
            String str3 = C0283k8.f1632.f892;
            C0237h4.m1089(C0341oa.m915(new byte[]{23, 23, 73, -123, 97, 105, 62, 12, 119, -121, 123, 101, 61, 33, 72, -120, 97, 114, 62, 14, 75, -125, 103, 67, 61, 17}, new byte[]{81, 98, 39, -26, 21, 0}), str3);
            C0373r3.m1208(str3, C0341oa.m915(new byte[]{-74, 66, -95, 8, 68, 36, -70, 68}, new byte[]{-39, 44, -32, 124, 48, 69}), new Object[]{Bundle.class}, new C0340o9(this));
        }
        if (this.f1116) {
            String str4 = C0283k8.f1632.f1546;
            C0237h4.m1089(C0341oa.m915(new byte[]{55, 82, 75, -105, -6, -120, 0, 112, 67, -98, -10, -121, 54, 79, 73, -115, -20, -125, 6, 124, 69, -114, -10, -112, 29, 73, 95, -71, -13, -107}, new byte[]{116, 61, 38, -6, -97, -26}), str4);
            C0373r3.m1208(str4, C0283k8.f1632.f1547, new Object[0], C0284k9.f915);
            String str5 = C0283k8.f1632.f1553;
            C0237h4.m1089(C0341oa.m915(new byte[]{12, -127, -66, 79, 87, -110, 6, -125, -78, 69, 93, -66, 61, -127, -92, 81, 93, -114, 14, -115, -89, 75, 78, -107, 59, -105, -112, 78, 75}, new byte[]{79, -18, -45, 34, 56, -4}), str5);
            C0373r3.m1208(str5, C0341oa.m915(new byte[]{-36, 72, 95, 105, 67, 70, -57, 67}, new byte[]{-77, 38, 28, 27, 38, 39}), new Object[]{Bundle.class}, C0312m9.f968);
        }
        C0192e1.m1054(EnumC0164c1.f1376, new a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final void m1241(LinearLayout linearLayout, final Object obj) {
        final int i = 0;
        final C0250i3 c0250i3M871 = C0250i3.a.m871(C0373r3.m1202(obj, C0341oa.m915(new byte[]{-45, -43, -105, 88, -126, -95, -44, -34, -103}, new byte[]{-70, -72, -10, 63, -25, -24}), false));
        if (c0250i3M871 == null) {
            return;
        }
        if (c0250i3M871.f1519) {
            Context context = linearLayout.getContext();
            C0237h4.m1089(C0341oa.m915(new byte[]{0, 73, -87, 111, 47, 51, 19, 73, -91, 88, 104, 115, 73, 2, -12}, new byte[]{103, 44, -35, 44, 64, 93}), context);
            TextView textViewM1243 = m1243(context, C0341oa.m915(new byte[]{-28, -110, 22, 45, 98, 112, -27, -112, 24, 45, 70, 101, 76, 68, -3, -83, -97, -128, 111, 89, -28, 39, 115, 96, -26, -70, 43, 46, 127, 92, -27, -96, 59, 39, 115, 97}, new byte[]{0, 45, -117, -56, -49, -24}));
            textViewM1243.setOnClickListener(new View.OnClickListener() { // from class: ۟.f9
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            C0250i3 c0250i3 = c0250i3M871;
                            String str = c0250i3.f854;
                            if (str == null) {
                                z = false;
                            } else if (!(str.length() > 0)) {
                            }
                            if (!z) {
                                int i2 = C0330o.f1000;
                                C0330o.m1173(0, C0341oa.m915(new byte[]{-48, -26, 38, -112, -4, -37, -33, -28, 59, -109, -6, -58, -46, -30, 60, -109, -56, -61, -46, -29, 1, 58, 28, 38, 82, -113, 23, -56, -111, -24, -115, -115, 37, -52}, new byte[]{55, 106, -116, 118, 117, 80}));
                            } else {
                                String str2 = C0436w1.f1166;
                                C0436w1.m953(c0250i3.f1520, C0272jb.m1105(c0250i3.f854));
                            }
                            break;
                        default:
                            C0250i3 c0250i32 = c0250i3M871;
                            if (!(c0250i32.f853.length() > 0)) {
                                int i3 = C0330o.f1000;
                                C0330o.m1173(0, C0341oa.m915(new byte[]{-12, -125, 25, -16, -118, 53, -5, -127, 4, -13, -116, 40, -10, -121, 3, -13, -66, 45, -10, -122, 62, -13, -115, 33, -10, -108, 13, -14, -69, 4, -12, -90, 9}, new byte[]{19, 15, -77, 22, 3, -66}));
                            } else {
                                String str3 = C0436w1.f1166;
                                C0436w1.m953(C0341oa.m915(new byte[]{-115, 101, -107}, new byte[]{-25, 21, -14, 4, 33, -10}), C0272jb.m1105(c0250i32.f853));
                            }
                            break;
                    }
                }
            });
            linearLayout.addView(textViewM1243);
            Context context2 = linearLayout.getContext();
            C0237h4.m1089(C0341oa.m915(new byte[]{39, 90, -10, -2, -56, 40, 52, 90, -6, -55, -113, 104, 110, 17, -85}, new byte[]{64, 63, -126, -67, -89, 70}), context2);
            TextView textViewM12432 = m1243(context2, C0341oa.m915(new byte[]{-64, -59, 101, -78, 121, -8, -63, -1, 80, -66, 87, -56, 104, 19, -114, 50, -124, 8, 75, 14, -105, -72, 104, -24, -62, -19, 88, -79, 100, -44, -63, -9, 72, -72, 104, -23}, new byte[]{36, 122, -8, 87, -44, 96}));
            textViewM12432.setOnClickListener(new View.OnClickListener(this) { // from class: ۟.g9

                /* JADX INFO: renamed from: ۥ۟ */
                public final /* synthetic */ C0405t9 f813;

                {
                    this.f813 = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            C0405t9 c0405t9 = this.f813;
                            Object obj2 = obj;
                            C0237h4.m1090(C0341oa.m915(new byte[]{-108, 64, 33, 62, 23, 18}, new byte[]{-32, 40, 72, 77, 51, 34}), c0405t9);
                            C0237h4.m1090(C0341oa.m915(new byte[]{40, 82, -64, -1, 60, -85, 109, 87, -50, -40, 61, -88, 98}, new byte[]{12, 52, -91, -102, 88, -55}), obj2);
                            ArrayList arrayList = new ArrayList();
                            String strM915 = C0341oa.m915(new byte[]{108, 74, -98}, new byte[]{1, 58, -86, -24, 15, 36});
                            ArrayList<C0250i3> arrayListM1240 = C0405t9.m1240(C0373r3.m1202(obj2, C0341oa.m915(new byte[]{-82, 33, -56, 55}, new byte[]{-64, 78, -68, 82, 97, -61}), false));
                            if (!arrayListM1240.isEmpty()) {
                                for (C0250i3 c0250i3 : arrayListM1240) {
                                    if (c0250i3.f1519) {
                                        String str = c0250i3.f854;
                                        C0237h4.m865(str);
                                        arrayList.add(str);
                                        strM915 = c0250i3.f1520;
                                    }
                                }
                            } else {
                                for (C0250i3 c0250i32 : C0211f6.f1445) {
                                    if (c0250i32.f1519) {
                                        String str2 = c0250i32.f854;
                                        C0237h4.m865(str2);
                                        arrayList.add(str2);
                                        strM915 = c0250i32.f1520;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                String str3 = C0436w1.f1166;
                                C0436w1.m953(strM915, arrayList);
                            } else {
                                int i2 = C0330o.f1000;
                                C0330o.m1173(0, C0341oa.m915(new byte[]{-99, 7, 70, 10, 62, -83, -110, 5, 91, 9, 56, -80, -98, 51, 97, 9, 63, -106, 54, -30, -102, -119, 82, -67, -60}, new byte[]{122, -117, -20, -20, -73, 38}));
                            }
                            break;
                        default:
                            C0405t9 c0405t92 = this.f813;
                            Object obj3 = obj;
                            C0237h4.m1090(C0341oa.m915(new byte[]{-70, -104, 115, -50, -68, 10}, new byte[]{-50, -16, 26, -67, -104, 58}), c0405t92);
                            C0237h4.m1090(C0341oa.m915(new byte[]{-48, 61, 80, 49, -124, 101, -107, 56, 94, 22, -123, 102, -102}, new byte[]{-12, 91, 53, 84, -32, 7}), obj3);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayListM12402 = C0405t9.m1240(C0373r3.m1202(obj3, C0341oa.m915(new byte[]{32, -58, 34, 78}, new byte[]{78, -87, 86, 43, -24, 102}), false));
                            if (arrayListM12402.isEmpty()) {
                                Iterator<C0250i3> it = C0211f6.f1445.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(it.next().f853);
                                }
                            } else {
                                Iterator it2 = arrayListM12402.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((C0250i3) it2.next()).f853);
                                }
                            }
                            C0436w1.m953(C0341oa.m915(new byte[]{-115, 101, -107}, new byte[]{-25, 21, -14, 4, 33, -10}), arrayList2);
                            break;
                    }
                }
            });
            linearLayout.addView(textViewM12432);
        }
        Context context3 = linearLayout.getContext();
        C0237h4.m1089(C0341oa.m915(new byte[]{-41, 126, -105, -62, -112, 32, -60, 126, -101, -11, -41, 96, -98, 53, -54}, new byte[]{-80, 27, -29, -127, -1, 78}), context3);
        TextView textViewM12433 = m1243(context3, C0341oa.m915(new byte[]{83, -105, -94, -44, 115, -17, 82, -107, -84, -44, 87, -6, 82, -77, -127, -42, 87, -16, -97, -51, -79, -82, 59, -20, 9, -50, -88, -111, 56, -57, 3, -51, -78, -127, -9}, new byte[]{-73, 40, 63, 49, -34, 119}));
        final int i2 = 1;
        textViewM12433.setOnClickListener(new View.OnClickListener() { // from class: ۟.f9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C0250i3 c0250i3 = c0250i3M871;
                        String str = c0250i3.f854;
                        if (str == null) {
                            z = false;
                        } else if (!(str.length() > 0)) {
                        }
                        if (!z) {
                            int i22 = C0330o.f1000;
                            C0330o.m1173(0, C0341oa.m915(new byte[]{-48, -26, 38, -112, -4, -37, -33, -28, 59, -109, -6, -58, -46, -30, 60, -109, -56, -61, -46, -29, 1, 58, 28, 38, 82, -113, 23, -56, -111, -24, -115, -115, 37, -52}, new byte[]{55, 106, -116, 118, 117, 80}));
                        } else {
                            String str2 = C0436w1.f1166;
                            C0436w1.m953(c0250i3.f1520, C0272jb.m1105(c0250i3.f854));
                        }
                        break;
                    default:
                        C0250i3 c0250i32 = c0250i3M871;
                        if (!(c0250i32.f853.length() > 0)) {
                            int i3 = C0330o.f1000;
                            C0330o.m1173(0, C0341oa.m915(new byte[]{-12, -125, 25, -16, -118, 53, -5, -127, 4, -13, -116, 40, -10, -121, 3, -13, -66, 45, -10, -122, 62, -13, -115, 33, -10, -108, 13, -14, -69, 4, -12, -90, 9}, new byte[]{19, 15, -77, 22, 3, -66}));
                        } else {
                            String str3 = C0436w1.f1166;
                            C0436w1.m953(C0341oa.m915(new byte[]{-115, 101, -107}, new byte[]{-25, 21, -14, 4, 33, -10}), C0272jb.m1105(c0250i32.f853));
                        }
                        break;
                }
            }
        });
        linearLayout.addView(textViewM12433);
        Context context4 = linearLayout.getContext();
        C0237h4.m1089(C0341oa.m915(new byte[]{-24, 122, 114, -52, -97, 40, -5, 122, 126, -5, -40, 104, -95, 49, 47}, new byte[]{-113, 31, 6, -113, -16, 70}), context4);
        TextView textViewM12434 = m1243(context4, C0341oa.m915(new byte[]{-1, 3, -128, -97, 126, -27, -2, 57, -75, -109, 80, -43, -2, 39, -93, -99, 90, -6, 51, 89, -109, -27, 54, -26, -91, 90, -118, -38, 53, -51, -81, 89, -112, -54, -6}, new byte[]{27, -68, 29, 122, -45, 125}));
        textViewM12434.setOnClickListener(new View.OnClickListener(this) { // from class: ۟.g9

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ C0405t9 f813;

            {
                this.f813 = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C0405t9 c0405t9 = this.f813;
                        Object obj2 = obj;
                        C0237h4.m1090(C0341oa.m915(new byte[]{-108, 64, 33, 62, 23, 18}, new byte[]{-32, 40, 72, 77, 51, 34}), c0405t9);
                        C0237h4.m1090(C0341oa.m915(new byte[]{40, 82, -64, -1, 60, -85, 109, 87, -50, -40, 61, -88, 98}, new byte[]{12, 52, -91, -102, 88, -55}), obj2);
                        ArrayList arrayList = new ArrayList();
                        String strM915 = C0341oa.m915(new byte[]{108, 74, -98}, new byte[]{1, 58, -86, -24, 15, 36});
                        ArrayList<C0250i3> arrayListM1240 = C0405t9.m1240(C0373r3.m1202(obj2, C0341oa.m915(new byte[]{-82, 33, -56, 55}, new byte[]{-64, 78, -68, 82, 97, -61}), false));
                        if (!arrayListM1240.isEmpty()) {
                            for (C0250i3 c0250i3 : arrayListM1240) {
                                if (c0250i3.f1519) {
                                    String str = c0250i3.f854;
                                    C0237h4.m865(str);
                                    arrayList.add(str);
                                    strM915 = c0250i3.f1520;
                                }
                            }
                        } else {
                            for (C0250i3 c0250i32 : C0211f6.f1445) {
                                if (c0250i32.f1519) {
                                    String str2 = c0250i32.f854;
                                    C0237h4.m865(str2);
                                    arrayList.add(str2);
                                    strM915 = c0250i32.f1520;
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            String str3 = C0436w1.f1166;
                            C0436w1.m953(strM915, arrayList);
                        } else {
                            int i22 = C0330o.f1000;
                            C0330o.m1173(0, C0341oa.m915(new byte[]{-99, 7, 70, 10, 62, -83, -110, 5, 91, 9, 56, -80, -98, 51, 97, 9, 63, -106, 54, -30, -102, -119, 82, -67, -60}, new byte[]{122, -117, -20, -20, -73, 38}));
                        }
                        break;
                    default:
                        C0405t9 c0405t92 = this.f813;
                        Object obj3 = obj;
                        C0237h4.m1090(C0341oa.m915(new byte[]{-70, -104, 115, -50, -68, 10}, new byte[]{-50, -16, 26, -67, -104, 58}), c0405t92);
                        C0237h4.m1090(C0341oa.m915(new byte[]{-48, 61, 80, 49, -124, 101, -107, 56, 94, 22, -123, 102, -102}, new byte[]{-12, 91, 53, 84, -32, 7}), obj3);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayListM12402 = C0405t9.m1240(C0373r3.m1202(obj3, C0341oa.m915(new byte[]{32, -58, 34, 78}, new byte[]{78, -87, 86, 43, -24, 102}), false));
                        if (arrayListM12402.isEmpty()) {
                            Iterator<C0250i3> it = C0211f6.f1445.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next().f853);
                            }
                        } else {
                            Iterator it2 = arrayListM12402.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((C0250i3) it2.next()).f853);
                            }
                        }
                        C0436w1.m953(C0341oa.m915(new byte[]{-115, 101, -107}, new byte[]{-25, 21, -14, 4, 33, -10}), arrayList2);
                        break;
                }
            }
        });
        linearLayout.addView(textViewM12434);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final LinearLayout m1242(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        C0325n8.f994.getClass();
        if (C0325n8.m1158()) {
            int iM1038 = (int) C0167c4.m1038(1, 5.0f);
            int color = Color.parseColor(C0341oa.m915(new byte[]{-55, 86, -27, 35, -91, -61, -113}, new byte[]{-22, 103, -124, 18, -100, -14}));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setCornerRadius(iM1038);
            gradientDrawable.setColor(color);
            linearLayout.setBackground(gradientDrawable);
        } else {
            int iM10382 = (int) C0167c4.m1038(1, 5.0f);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setGradientType(0);
            gradientDrawable2.setCornerRadius(iM10382);
            gradientDrawable2.setColor(-1);
            linearLayout.setBackground(gradientDrawable2);
        }
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = AbstractAlertDialogC0471ya.f1886;
        linearLayout.setPadding(0, i, 0, 0);
        int i2 = this.f1822;
        layoutParams.setMargins(i2, i, i2, i);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final TextView m1243(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(16.0f);
        C0325n8.f994.getClass();
        textView.setTextColor(C0325n8.m1158() ? -1 : -16777216);
        textView.setPadding(this.f1822, (int) C0167c4.m1038(1, 8.0f), 0, (int) C0167c4.m1038(1, 15.0f));
        return textView;
    }
}
