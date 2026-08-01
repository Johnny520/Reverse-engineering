package p084fd;

import android.database.Cursor;
import cd.C1517b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p315vd.AbstractC8924d;
import p330wd.C9229d;

/* JADX INFO: renamed from: fd.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2424d {

    /* JADX INFO: renamed from: a */
    public static Object f6563a;

    /* JADX INFO: renamed from: b */
    public static Method f6564b;

    /* JADX INFO: renamed from: c */
    public static Method f6565c;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8728a(InterfaceC5154i interfaceC5154i) {
        Object result = interfaceC5154i.getResult();
        if (result == null || f6563a != null) {
            return;
        }
        m8750w(result);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8729b(Object obj) {
        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.getParameterCount() == 0 && method.getReturnType().getName().equals("com.tencent.wcdb.database.SQLiteDatabase")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8730c(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
            if (field.getType() == String.class && "MicroMsg.SqliteDB".equals(field.get(obj))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static List m8731d(String str) {
        Method method;
        ArrayList arrayList = new ArrayList();
        Object obj = f6563a;
        if (obj != null && (method = f6564b) != null) {
            try {
                Cursor cursor = (Cursor) method.invoke(obj, str, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String[] columnNames = cursor.getColumnNames();
                            do {
                                HashMap map = new HashMap();
                                for (int i10 = 0; i10 < columnNames.length; i10++) {
                                    int type = cursor.getType(i10);
                                    if (type == 0) {
                                        map.put(columnNames[i10], null);
                                    } else if (type == 1) {
                                        map.put(columnNames[i10], Long.valueOf(cursor.getLong(i10)));
                                    } else if (type == 2) {
                                        map.put(columnNames[i10], Double.valueOf(cursor.getDouble(i10)));
                                    } else if (type != 4) {
                                        map.put(columnNames[i10], cursor.getString(i10));
                                    } else {
                                        map.put(columnNames[i10], cursor.getBlob(i10));
                                    }
                                }
                                arrayList.add(map);
                            } while (cursor.moveToNext());
                        }
                    } finally {
                    }
                }
                if (cursor != null) {
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                AbstractC8924d.m34264d("DatabaseBridge", "executeQuery: " + str, th);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static String m8732e(String str) {
        try {
            List listM8731d = m8731d("SELECT reserved1, reserved2 FROM img_flag WHERE username = '" + str.replace("'", "''") + "'");
            if (listM8731d.isEmpty()) {
                return null;
            }
            Map map = (Map) listM8731d.get(0);
            String strValueOf = String.valueOf(map.getOrDefault("reserved2", null));
            String strValueOf2 = String.valueOf(map.getOrDefault("reserved1", null));
            if (!str.contains("@chatroom")) {
                if (!strValueOf2.isEmpty()) {
                    return strValueOf2;
                }
            }
            return strValueOf;
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getAvatarUrl error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static List m8733f(String str) {
        try {
            String strReplace = str.replace("'", "''");
            return m8731d("SELECT nickname, username as wxid, conRemark as remark FROM rcontact WHERE deleteFlag = 0 AND (nickname LIKE '%" + strReplace + "%' OR conRemark LIKE '%" + strReplace + "%')");
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getContact error", th);
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: g */
    public static Map m8734g(String str) {
        try {
            List listM8731d = m8731d("SELECT md5, thumbUrl, cdnUrl, size, width, height FROM EmojiInfo WHERE md5 = '" + str.replace("'", "''") + "'");
            if (listM8731d.isEmpty()) {
                return null;
            }
            return (Map) listM8731d.get(0);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getEmojiInfo error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m8735h(String str) {
        try {
            List listM8731d = m8731d("SELECT cdnUrl, thumbUrl FROM EmojiInfo WHERE md5 = '" + str.replace("'", "''") + "'");
            if (listM8731d.isEmpty()) {
                return null;
            }
            Map map = (Map) listM8731d.get(0);
            Object obj = map.get("cdnUrl");
            if (obj != null && !obj.toString().isEmpty()) {
                return obj.toString();
            }
            Object obj2 = map.get("thumbUrl");
            if (obj2 != null) {
                return obj2.toString();
            }
            return null;
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getEmojiUrl error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static List m8736i() {
        try {
            return m8731d("SELECT username, alias, conRemark, nickname FROM rcontact WHERE username NOT LIKE '%@chatroom' AND username NOT LIKE '%@openim' AND (type & 1) != 0 AND (type & 8) = 0 AND (type & 32) = 0 AND deleteFlag = 0 AND verifyFlag = 0 AND username NOT LIKE 'gh_%' AND username != 'filehelper' ");
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getFriendList error", th);
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: j */
    public static List m8737j(String str, int i10) {
        return m8731d("SELECT content, createTime, type, isSend, lvbuffer FROM message WHERE talker = '" + str + "' ORDER BY createTime DESC LIMIT " + i10);
    }

    /* JADX INFO: renamed from: k */
    public static List m8738k(String str) {
        List<String> listM35922a;
        ArrayList arrayList = new ArrayList();
        try {
            List listM8731d = m8731d("SELECT roomowner, roomdata FROM chatroom WHERE chatroomname = '" + str.replace("'", "''") + "'");
            if (listM8731d != null && !listM8731d.isEmpty()) {
                Map map = (Map) listM8731d.get(0);
                Object obj = map.get("roomowner");
                if (obj != null && !obj.toString().trim().isEmpty()) {
                    arrayList.add(obj.toString().trim());
                }
                Object obj2 = map.get("roomdata");
                if ((obj2 instanceof byte[]) && (listM35922a = C9229d.m35922a((byte[]) obj2)) != null) {
                    for (String str2 : listM35922a) {
                        if (!arrayList.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getGroupAdminList error", th);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l */
    public static List m8739l() {
        try {
            return m8731d("SELECT username, nickname, conRemark, type FROM rcontact INNER JOIN chatroom ON username = chatroomname WHERE username LIKE '%chatroom' AND type NOT IN (33, 43) AND deleteFlag = 0 AND verifyFlag = 0 ");
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getGroupList error", th);
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: m */
    public static List m8740m(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            List listM8731d = m8731d("SELECT memberlist FROM chatroom WHERE chatroomname = '" + str.replace("'", "''") + "'");
            if (!listM8731d.isEmpty()) {
                String str2 = (String) ((Map) listM8731d.get(0)).get("memberlist");
                if (str2 != null) {
                    for (String str3 : str2.split(";")) {
                        if (!str3.isEmpty()) {
                            arrayList.add(str3);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getGroupMemberList error", th);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m8741n(String str) {
        Object obj;
        try {
            List listM8731d = m8731d("SELECT chatroomnotice FROM chatroom WHERE chatroomname = '" + str.replace("'", "''") + "'");
            if (listM8731d.isEmpty() || (obj = ((Map) listM8731d.get(0)).get("chatroomnotice")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getGroupNotice error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static Map m8742o(String str, long j10) {
        try {
            List listM8731d = m8731d("SELECT msgId, type, isSend, createTime, talker, content, imgPath, lvbuffer FROM message WHERE talker = '" + str.replace("'", "''") + "' AND msgId = " + j10);
            if (listM8731d.isEmpty()) {
                return null;
            }
            return (Map) listM8731d.get(0);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getMsg error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static long m8743p(String str) {
        Object obj;
        try {
            List listM8731d = m8731d("SELECT COUNT(*) AS total FROM message WHERE talker = '" + str.replace("'", "''") + "'");
            if (listM8731d.isEmpty() || (obj = ((Map) listM8731d.get(0)).get("total")) == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getMsgCount error", th);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: q */
    public static List m8744q(String str, long j10) {
        try {
            return m8731d("SELECT content, createTime, isSend FROM message WHERE talker = '" + str.replace("'", "''") + "' AND createTime >= " + j10);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getMsgs error", th);
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: r */
    public static String m8745r(String str) {
        Object obj;
        try {
            List listM8731d = m8731d("SELECT nickname FROM rcontact WHERE username = '" + str.replace("'", "''") + "'");
            if (listM8731d.isEmpty() || (obj = ((Map) listM8731d.get(0)).get("nickname")) == null) {
                return null;
            }
            return obj.toString();
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getUserName error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m8746s(String str, String str2) {
        String str3;
        try {
            List listM8731d = m8731d("SELECT roomdata FROM chatroom WHERE chatroomname = '" + str.replace("'", "''") + "'");
            if (listM8731d != null && !listM8731d.isEmpty()) {
                Object obj = ((Map) listM8731d.get(0)).get("roomdata");
                if ((obj instanceof byte[]) && (str3 = (String) C9229d.m35923c((byte[]) obj).get(str2)) != null && !str3.trim().isEmpty()) {
                    return str3;
                }
            }
            return m8745r(str2);
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getUserName error! groupId: " + str + ", talker: " + str2, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static String m8747t(String str) {
        try {
            List listM8731d = m8731d("SELECT conRemark FROM rcontact WHERE username = '" + str.replace("'", "''") + "'");
            if (listM8731d.isEmpty()) {
                return null;
            }
            Object obj = ((Map) listM8731d.get(0)).get("conRemark");
            return (obj == null || obj.toString().isEmpty()) ? m8745r(str) : obj.toString();
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "getUserRemark error", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static String m8748u(long j10) {
        Object obj;
        if (f6563a != null && f6564b != null) {
            try {
                List listM8731d = m8731d("SELECT reserved4 FROM videoinfo2 WHERE msglocalid = " + j10);
                if (listM8731d == null || listM8731d.isEmpty() || (obj = ((Map) listM8731d.get(0)).get("reserved4")) == null) {
                    return null;
                }
                return obj.toString();
            } catch (Throwable th) {
                AbstractC8924d.m34264d("DatabaseBridge", "getVideo error for msgId: " + j10, th);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static void m8749v() {
        try {
            HookEngine.hookAfter(C1517b.findMethod().inClass(C1517b.findClass().usingStrings("MicroMsg.MMKernel", "Initialize skeleton").get()).modifiers(9).paramCount(0).usingStrings("mCoreStorage not initialized!").get(), new InterfaceC5156k() { // from class: fd.c
                @Override // md.InterfaceC5156k
                /* JADX INFO: renamed from: a */
                public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                    AbstractC2424d.m8728a(interfaceC5154i);
                }
            });
        } catch (Throwable th) {
            AbstractC8924d.m34264d("DatabaseBridge", "init error", th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        p084fd.AbstractC2424d.f6564b = r2.getClass().getMethod("rawQuery", java.lang.String.class, java.lang.Object[].class);
        p084fd.AbstractC2424d.f6565c = r2.getClass().getMethod("execSQL", java.lang.String.class);
        p084fd.AbstractC2424d.f6563a = r2;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void m8750w(java.lang.Object r10) {
        /*
            java.lang.Class<fd.d> r0 = p084fd.AbstractC2424d.class
            monitor-enter(r0)
            java.lang.Object r1 = p084fd.AbstractC2424d.f6563a     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto L9
            monitor-exit(r0)
            return
        L9:
            java.lang.Class r1 = r10.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.length     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            r4 = r3
        L14:
            r5 = 0
            r6 = 1
            if (r4 >= r2) goto L4f
            r7 = r1[r4]     // Catch: java.lang.Throwable -> L4d
            r7.setAccessible(r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L4a
            if (r7 != 0) goto L24
            goto L4a
        L24:
            java.lang.Class r8 = r7.getClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r9 = "java."
            boolean r9 = r8.startsWith(r9)     // Catch: java.lang.Throwable -> L4a
            if (r9 != 0) goto L4a
            java.lang.String r9 = "android."
            boolean r8 = r8.startsWith(r9)     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L3d
            goto L4a
        L3d:
            boolean r8 = m8730c(r7)     // Catch: java.lang.Throwable -> L4a
            if (r8 != 0) goto L50
            boolean r8 = m8729b(r7)     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto L4a
            goto L50
        L4a:
            int r4 = r4 + 1
            goto L14
        L4d:
            r10 = move-exception
            goto Lac
        L4f:
            r7 = r5
        L50:
            if (r7 != 0) goto L54
            monitor-exit(r0)
            return
        L54:
            java.lang.Class r10 = r7.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()     // Catch: java.lang.Throwable -> L4d
            int r1 = r10.length     // Catch: java.lang.Throwable -> L4d
        L5d:
            if (r3 >= r1) goto Lb3
            r2 = r10[r3]     // Catch: java.lang.Throwable -> L4d
            int r4 = r2.getParameterCount()     // Catch: java.lang.Throwable -> L4d
            if (r4 != 0) goto La9
            java.lang.Class r4 = r2.getReturnType()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r8 = "com.tencent.wcdb.database.SQLiteDatabase"
            boolean r4 = r4.equals(r8)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto La9
            r2.setAccessible(r6)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r2 = r2.invoke(r7, r5)     // Catch: java.lang.Throwable -> L4d
            if (r2 == 0) goto La9
            java.lang.Class r10 = r2.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "rawQuery"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Method r10 = r10.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L4d
            p084fd.AbstractC2424d.f6564b = r10     // Catch: java.lang.Throwable -> L4d
            java.lang.Class r10 = r2.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = "execSQL"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Method r10 = r10.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L4d
            p084fd.AbstractC2424d.f6565c = r10     // Catch: java.lang.Throwable -> L4d
            p084fd.AbstractC2424d.f6563a = r2     // Catch: java.lang.Throwable -> L4d
            goto Lb3
        La9:
            int r3 = r3 + 1
            goto L5d
        Lac:
            java.lang.String r1 = "DatabaseBridge"
            java.lang.String r2 = "initializeDatabase error"
            p315vd.AbstractC8924d.m34264d(r1, r2, r10)     // Catch: java.lang.Throwable -> Lb5
        Lb3:
            monitor-exit(r0)
            return
        Lb5:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p084fd.AbstractC2424d.m8750w(java.lang.Object):void");
    }
}
