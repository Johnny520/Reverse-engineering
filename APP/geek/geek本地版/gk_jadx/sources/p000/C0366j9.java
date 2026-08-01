package p000;

import com.github.megatronking.stringfog.Base64;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: j9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0366j9 implements InterfaceC0303hm {

    /* JADX INFO: renamed from: a */
    public final int f2595a;

    /* JADX INFO: renamed from: b */
    public final XC_MethodHook.MethodHookParam f2596b;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C0366j9(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4, int r5) {
        /*
            r3 = this;
            r3.f2595a = r5
            r3.f2596b = r4
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۣۤۤ"
            int r2 = androidx.versionedparcelable.C1026.m3006(r1)
            r1 = r0
        Lf:
            switch(r2) {
                case 1746782: goto L13;
                case 1749725: goto L63;
                case 1749857: goto L51;
                case 1750691: goto L24;
                case 1751740: goto L35;
                case 1753538: goto L75;
                default: goto L12;
            }
        L12:
            goto Lf
        L13:
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
            int r0 = com.google.android.material.bottomsheet.C1037.f5681
            if (r0 < 0) goto L32
            java.lang.String r0 = "ۦۣ۟"
        L1e:
            int r0 = androidx.startup.C1023.m2995(r0)
            r2 = r0
            goto Lf
        L24:
            int r0 = p000.C1059.m3140()
            if (r0 > 0) goto L35
            java.lang.String r0 = "ۢۨۧ"
            int r0 = androidx.recyclerview.widget.C1018.m2976(r0)
            r2 = r0
            goto Lf
        L32:
            java.lang.String r0 = "ۦۣ۟"
            goto L1e
        L35:
            int r0 = androidx.versionedparcelable.C1027.f5671
            int r2 = androidx.activity.result.C0994.f5638
            r2 = r2 | (-2103(0xfffffffffffff7c9, float:NaN))
            int r0 = r0 + r2
            if (r0 > 0) goto L49
            com.github.megatronking.stringfog.C1033.m3036()
            java.lang.String r0 = "۠ۥ"
            int r0 = android.app.C0987.m2851(r0)
            r2 = r0
            goto Lf
        L49:
            java.lang.String r0 = "ۦۣ۟"
        L4b:
            int r0 = androidx.profileinstaller.C1017.m2973(r0)
            r2 = r0
            goto Lf
        L51:
            java.lang.String r0 = "fdBnqFsqsBZx4GgtiWqlUMVUcgO"
            java.lang.String r0 = com.google.android.material.floatingactionbutton.C1046.m3088(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.lang.String r1 = "۟ۢۡ"
            int r2 = androidx.appcompat.widget.C0999.m2899(r1)
            r1 = r0
            goto Lf
        L63:
            int r0 = androidx.recyclerview.widget.C1018.f5662
            if (r0 < 0) goto L6a
            java.lang.String r0 = "ۡ۠ۥ"
            goto L4b
        L6a:
            int r0 = androidx.startup.C1023.f5667
            int r2 = androidx.legacy.content.C1014.f5658
            r0 = r0 ^ r2
            r2 = 1750771(0x1ab6f3, float:2.453353E-39)
            r0 = r0 ^ r2
            r2 = r0
            goto Lf
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0366j9.<init>(de.robv.android.xposed.XC_MethodHook$MethodHookParam, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: all -> 0x0457, TRY_LEAVE, TryCatch #3 {all -> 0x0457, blocks: (B:27:0x00a1, B:29:0x00a5), top: B:486:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0c0b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0d54  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0d5b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0d5e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117 A[Catch: all -> 0x0472, TRY_ENTER, TryCatch #0 {all -> 0x0472, blocks: (B:56:0x0117, B:58:0x011f, B:200:0x047d, B:202:0x048f, B:204:0x049d), top: B:480:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x0473 -> B:59:0x0121). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m1554b() {
        /*
            Method dump skipped, instruction units count: 3721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0366j9.m1554b():java.lang.Object");
    }

    @Override // p000.InterfaceC0303hm
    /* JADX INFO: renamed from: a */
    public final Object mo10a() {
        int iIntValue;
        boolean z;
        int intField;
        Method method;
        String str;
        String str2;
        int i = 0;
        int i2 = this.f2595a;
        XC_MethodHook.MethodHookParam methodHookParam = this.f2596b;
        switch (i2) {
            case Base64.DEFAULT /* 0 */:
                Class cls = AbstractC0514n9.f3353a;
                if (!AbstractC0013ac.f105a) {
                    AbstractC0013ac.m86a();
                    AbstractC0013ac.f105a = true;
                }
                if (AbstractC0013ac.f107c) {
                    Object[] objArr = methodHookParam.args;
                    Object obj = objArr[0];
                    if (obj instanceof Integer) {
                        u40.m2419a("6G95pO+R57HodWHorZemvOdpYei7naax6XQ4prqe6v/yY2Wt75npq+pze+aGnPI=\n", "hhoVyM/yht8=\n");
                        iIntValue = ((Integer) obj).intValue();
                    } else {
                        Object obj2 = objArr[1];
                        if (obj2 instanceof Integer) {
                            u40.m2419a("go6cw/NYFCiClISPsV5VJY2IhI+nVFUog5XdwaZXGWaYgoDK81AaMoCSnoGaVQE=\n", "7Pvwr9M7dUY=\n");
                            iIntValue = ((Integer) obj2).intValue();
                        } else {
                            iIntValue = -1;
                        }
                    }
                    if (iIntValue != -1) {
                        if (C0340in.f2447i == null) {
                            try {
                                Method methodFindMethodBestMatch = XposedHelpers.findMethodBestMatch(methodHookParam.thisObject.getClass(), pb0.f3753c0, new Object[]{Integer.valueOf(iIntValue)});
                                if (methodFindMethodBestMatch != null) {
                                    methodFindMethodBestMatch.setAccessible(true);
                                } else {
                                    methodFindMethodBestMatch = null;
                                }
                                C0340in.f2447i = methodFindMethodBestMatch;
                            } catch (Throwable th) {
                                AbstractC0514n9.m1922a(u40.m2419a("wKMVkaipiL/soCu3mIasteC/\n", "g8t05f3gwNA=\n"), th);
                            }
                        }
                        try {
                            method = C0340in.f2447i;
                        } catch (Throwable th2) {
                            AbstractC0514n9.m1922a(u40.m2419a("Z9c/rfDIeoRL1AGQy/ddgEE=\n", "JL9e2aWBMus=\n"), th2);
                        }
                        Object objInvoke = method != null ? method.invoke(methodHookParam.thisObject, Integer.valueOf(iIntValue)) : null;
                        if (objInvoke != null) {
                            C0340in c0340in = C0340in.f2439a;
                            C0340in.m1448a(objInvoke);
                            Field field = C0340in.f2443e;
                            int i3 = field != null ? field.getInt(objInvoke) : 0;
                            Field field2 = C0340in.f2442d;
                            int i4 = field2 != null ? field2.getInt(objInvoke) : 0;
                            if (i3 == 34 && i4 == 0) {
                                Field field3 = C0340in.f2441c;
                                long j = field3 != null ? field3.getLong(objInvoke) : 0L;
                                if (j != 0) {
                                    try {
                                        int intField2 = XposedHelpers.getIntField(objInvoke, pb0.f3723O0);
                                        z = (intField2 & (intField2 ^ (-65))) != 0;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        z = false;
                                    }
                                    try {
                                        intField = XposedHelpers.getIntField(objInvoke, pb0.f3725P0);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        AbstractC0514n9.m1922a(u40.m2419a("KXHPIuK2u6IFcvEA2JaQqDltzyLS\n", "ahmuVrf/880=\n"), th);
                                        intField = 0;
                                    }
                                    if (intField >= 3) {
                                        String str3 = "voice_trans_" + j;
                                        C0267gn.f2144a.getClass();
                                        if (!C0267gn.m1281a(str3, false) && !z) {
                                            Map map = AbstractC0327i9.f2379f;
                                            Object obj3 = map.get(Long.valueOf(j));
                                            Boolean bool = Boolean.TRUE;
                                            if (!AbstractC0346ip.m1497i(obj3, bool)) {
                                                u40.m2419a("KEgIgwgNh/JwRgOQcxKL/3F7H5ZLDty0OgFD3g==\n", "FC9t9yV94pw=\n");
                                                map.put(Long.valueOf(j), bool);
                                                try {
                                                    if (!AbstractC0514n9.f3354b) {
                                                        AbstractC0514n9.f3354b = true;
                                                        AbstractC0514n9.f3353a = XposedHelpers.findClassIfExists(pb0.f3822z0, AbstractC0143d9.f1405a);
                                                    }
                                                    if (AbstractC0514n9.f3353a != null) {
                                                        Object objectField = XposedHelpers.getObjectField(methodHookParam.thisObject, pb0.f3738W);
                                                        Object objectField2 = objectField != null ? XposedHelpers.getObjectField(objectField, pb0.f3740X) : null;
                                                        Object objCallMethod = objectField2 != null ? XposedHelpers.callMethod(objectField2, pb0.f3742Y, new Object[]{AbstractC0514n9.f3353a}) : null;
                                                        if (objCallMethod != null) {
                                                            String str4 = pb0.f3747a0;
                                                            try {
                                                                XposedHelpers.callMethod(objCallMethod, str4, new Object[]{objInvoke, bool, Integer.valueOf(iIntValue), 0});
                                                            } catch (Throwable th5) {
                                                                try {
                                                                    XposedHelpers.callMethod(objCallMethod, str4, new Object[]{Long.valueOf(j)});
                                                                } catch (Throwable th6) {
                                                                    AbstractC0514n9.m1922a(u40.m2419a("C7CUO9Lzxlkns6ob9dvgRS63hyI=\n", "SNj1T4e6jjY=\n"), th6);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    AbstractC0327i9.f2379f.remove(Long.valueOf(j));
                                                    AbstractC0514n9.m1922a(u40.m2419a("H2jmpzVN9n8za9iFD23ddQhy7rQHYcw=\n", "XACH02AEvhA=\n"), th7);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return C0819vh.f4855n;
            case Base64.NO_PADDING /* 1 */:
                return m1554b();
            default:
                Object obj4 = methodHookParam.thisObject;
                AbstractC0346ip.m1502n(u40.m2419a("7bCK8zxYuSz6rA==\n", "mdjjgHM600k=\n"), obj4);
                u40.m2419a("pu8=\n", "wo2mtqUYf20=\n");
                AbstractC0346ip.f2495x = obj4;
                if (!AbstractC0346ip.f2494w) {
                    if (z30.m2772q("ZnbnFvMUn0hSdfEl8BSIUFJ88A==\n", "DROeSZRx+iM=\n", C0267gn.f2144a)) {
                        try {
                            AbstractC0346ip.m1480R(obj4);
                            String strM1284d = C0267gn.m1284d(u40.m2419a("xkU8oBCSUSbyRiqTE5JGEsRENg==\n", "rSBF/3f3NE0=\n"), "");
                            if (!b50.m522H(strM1284d)) {
                                List listM527M = b50.m527M(strM1284d, new String[]{u40.m2419a("jg==\n", "oqGxh2cmxw8=\n")});
                                ArrayList arrayList = new ArrayList();
                                for (Object obj5 : listM527M) {
                                    if (!b50.m522H((String) obj5)) {
                                        arrayList.add(obj5);
                                    }
                                }
                                int size = arrayList.size();
                                while (i < size) {
                                    int i5 = 1 - (0 - i);
                                    String str5 = (String) arrayList.get(i);
                                    C0267gn c0267gn = C0267gn.f2144a;
                                    String strM2419a = u40.m2419a("aZt9a3GaNC0C4UEJBJxnWCu+\n", "jwfXjuAn0b0=\n");
                                    c0267gn.getClass();
                                    String strM1284d2 = C0267gn.m1284d("key_geek_folder_name_" + str5, strM2419a);
                                    String strM1284d3 = C0267gn.m1284d(str5, "");
                                    if (strM1284d3.length() > 0) {
                                        List listM527M2 = b50.m527M(strM1284d3, new String[]{u40.m2419a("fg==\n", "UsMUNnEgD5E=\n")});
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj6 : listM527M2) {
                                            if (!b50.m522H((String) obj6)) {
                                                arrayList2.add(obj6);
                                            }
                                        }
                                        String strM83j0 = AbstractC0012ab.m83j0(arrayList2, u40.m2419a("Rg==\n", "as4FbhWM7HM=\n"), new C0740tc(1), 30);
                                        if (strM83j0.length() > 0) {
                                            AbstractC0346ip.m1482T("UPDATE rconversation SET parentRef = '" + str5 + "' WHERE username IN (" + strM83j0 + ")", obj4);
                                        }
                                    }
                                    AbstractC0346ip.m1482T("REPLACE INTO rcontact (username, nickname, type, verifyFlag) VALUES ('" + str5 + "', '" + strM1284d2 + "', 3, 0)", obj4);
                                    if (strM1284d3.length() == 0) {
                                        str = "LVYc7KVXo7R8GgKz3GzL52VIQ4SIOOmxLUII7ot9obhxGiyq12zd52Vi\n";
                                        str2 = "yv+mCjPQRw8=\n";
                                    } else {
                                        str = "CSUlFzq7bLl+TwFRTYoN7G0jRVYD9DWeBAY9\n";
                                        str2 = "7Kmg8qoQiQQ=\n";
                                    }
                                    AbstractC0346ip.m1482T(v40.m2489z("\n                    REPLACE INTO rconversation (\n                        username, digest, digestUser, isSend, status, \n                        conversationTime, flag, unReadCount, content, msgType, chatmode\n                    ) VALUES (\n                        '" + str5 + "', '" + u40.m2419a(str, str2) + "', '', 0, 0, \n                        IFNULL((SELECT MAX(conversationTime) FROM rconversation WHERE parentRef = '" + str5 + "'), strftime('%s','now') * 1000), \n                        IFNULL((SELECT MAX(flag) FROM rconversation WHERE parentRef = '" + str5 + "'), strftime('%s','now') * 1000), \n                        IFNULL((SELECT SUM(unReadCount) FROM rconversation WHERE parentRef = '" + str5 + "'), 0), \n                        '', 0, 0\n                    )\n                "), obj4);
                                    i = i5;
                                }
                            }
                        } catch (Throwable th8) {
                            z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.m2419a("pTR+Wfhvd3aHI0Rhx254TaYT\n", "4lEbMr4AGxI=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
                        }
                        AbstractC0346ip.f2494w = true;
                    } else {
                        AbstractC0346ip.m1480R(obj4);
                        AbstractC0346ip.f2494w = true;
                    }
                }
                return C0819vh.f4855n;
        }
    }
}
