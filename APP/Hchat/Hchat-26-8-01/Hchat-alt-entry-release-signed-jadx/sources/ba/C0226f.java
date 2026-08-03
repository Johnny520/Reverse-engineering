package ba;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import ng.C3022t;
import okhttp3.HttpUrl;
import p002a1.RunnableC0003a;
import p002a1.RunnableC0006d;
import p007a7.AbstractC0018a;
import p009a9.C0031h;
import p019b4.C0178b;
import p036c9.AbstractC0473o2;
import p036c9.C0414a;
import p036c9.C0415a0;
import p036c9.C0426d;
import p036c9.C0427d0;
import p036c9.C0429d2;
import p036c9.C0430e;
import p036c9.C0456k1;
import p036c9.C0483r1;
import p036c9.C0492u1;
import p036c9.C0501x1;
import p036c9.C0504y1;
import p036c9.C0507z1;
import p036c9.EnumC0495v1;
import p036c9.RunnableC0487t;
import p049d9.C0744e;
import p049d9.C0745f;
import p063e9.C0846q;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p092g4.AbstractC1341a;
import p099h.Hchat.crash.RunnableC1435d;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2103n;
import p154k9.C2361e;
import p154k9.C2364h;
import p154k9.C2365i;
import p218og.AbstractC3149m;
import p230p8.C3357i;
import p230p8.C3358j;
import p230p8.C3360l;
import p276sf.C3958e;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4330d;
import p331wa.AbstractC4699j;
import p331wa.C4696g;
import p332wb.AbstractC4955ho;
import p332wb.C4799d;
import p332wb.C4819dj;
import p332wb.C5071la;
import p332wb.C5192p;
import tf.AbstractC4151b;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import va.EnumC4542b;

/* JADX INFO: renamed from: ba.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0226f extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f562a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ba.f.afterHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, c9.f.invoke():java.lang.Object, e9.q.i(r8.g):void, j8.n.j(java.lang.Class, j8.m):void, oh.h.B(java.lang.reflect.Method, java.lang.ClassLoader):void, oh.h.C(java.lang.reflect.Method, java.lang.ClassLoader):void, q8.h.r():void, uf.d.s(android.content.Context, java.lang.ClassLoader):void, uf.d.w(java.lang.ClassLoader):boolean, wa.g.l(java.lang.reflect.Method, java.util.HashSet):int, wb.ho.U0(android.content.Context, java.lang.String, fg.l):void] */
    public /* synthetic */ C0226f(int i9) {
        this.f562a = i9;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m919a(XC_MethodHook.MethodHookParam methodHookParam) {
        Activity activity;
        Uri data;
        String str;
        C5071la c5071la;
        methodHookParam.getClass();
        Object[] objArr = methodHookParam.args;
        objArr.getClass();
        Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
        String strM6697L0 = null;
        c3958e = null;
        c3958e = null;
        c3958e = null;
        C3958e c3958e = null;
        Integer num = objM8366C0 instanceof Integer ? (Integer) objM8366C0 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue == 1212371547 || iIntValue == 1212371548) {
                Object[] objArr2 = methodHookParam.args;
                objArr2.getClass();
                Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr2);
                Integer num2 = objM8366C02 instanceof Integer ? (Integer) objM8366C02 : null;
                if (num2 == null || num2.intValue() != -1) {
                    return;
                }
                Object[] objArr3 = methodHookParam.args;
                objArr3.getClass();
                Object objM8366C03 = AbstractC4165l.m8366C0(2, objArr3);
                Intent intent = objM8366C03 instanceof Intent ? (Intent) objM8366C03 : null;
                if (intent == null || (activity = C4799d.f16478e) == null || (data = intent.getData()) == null) {
                    return;
                }
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (iIntValue != 1212371547) {
                    String strM9309C6 = AbstractC4955ho.m9309C6(activity, data);
                    if (strM9309C6 == null) {
                        String lastPathSegment = data.getLastPathSegment();
                        if (lastPathSegment != null) {
                            String strM6697L02 = AbstractC3149m.m6697L0(lastPathSegment, '/', lastPathSegment);
                            strM6697L0 = AbstractC3149m.m6697L0(strM6697L02, ':', strM6697L02);
                        }
                        if (strM6697L0 != null) {
                            str2 = strM6697L0;
                        }
                        strM9309C6 = str2;
                    }
                    C0427d0 c0427d0 = C4799d.f16477d;
                    if (c0427d0 != null) {
                        if (AbstractC3149m.m6721t0(strM9309C6)) {
                            strM9309C6 = "output";
                        }
                        c0427d0.invoke(data, strM9309C6);
                        return;
                    }
                    return;
                }
                if (AbstractC1416l.m3825a(data.getScheme(), "content")) {
                    try {
                        if ((intent.getFlags() & 1) != 0) {
                            activity.getContentResolver().takePersistableUriPermission(data, 1);
                        }
                    } catch (Throwable unused) {
                    }
                }
                C4799d c4799d = C4799d.f16474a;
                str = "audio_input";
                if ("file".equalsIgnoreCase(data.getScheme())) {
                    String path = data.getPath();
                    if (path != null) {
                        str2 = path;
                    }
                    if (!AbstractC3149m.m6721t0(str2) && AbstractC0921a.m2262y(str2)) {
                        String name = new File(str2).getName();
                        c3958e = new C3958e(str2, AbstractC3149m.m6721t0(name) ? "audio_input" : name);
                    }
                } else {
                    try {
                        String strM9309C62 = AbstractC4955ho.m9309C6(activity, data);
                        if (strM9309C62 == null && (strM9309C62 = data.getLastPathSegment()) == null) {
                            strM9309C62 = "audio_input";
                        }
                        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
                        patternCompile.getClass();
                        String strReplaceAll = patternCompile.matcher(strM9309C62).replaceAll("_");
                        strReplaceAll.getClass();
                        String string = AbstractC3149m.m6703R0(strReplaceAll).toString();
                        if (!AbstractC3149m.m6721t0(string)) {
                            str = string;
                        }
                        File file = new File(activity.getFilesDir(), "Hchat/audio_transform/input");
                        file.mkdirs();
                        File file2 = new File(file, System.currentTimeMillis() + "_" + str);
                        InputStream inputStreamOpenInputStream = activity.getContentResolver().openInputStream(data);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    AbstractC1341a.m3594j(inputStreamOpenInputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                    if (file2.isFile() && file2.length() > 0) {
                                        c3958e = new C3958e(file2.getAbsolutePath(), str);
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                if (c3958e == null || (c5071la = C4799d.f16476c) == null) {
                    return;
                }
                c5071la.invoke(c3958e.f12961g, c3958e.f12962h);
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0193  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m920b(XC_MethodHook.MethodHookParam methodHookParam) {
        Activity activity;
        C4819dj c4819dj;
        String absolutePath;
        File file;
        InputStream inputStreamOpenInputStream;
        Uri uri;
        methodHookParam.getClass();
        Object[] objArr = methodHookParam.args;
        objArr.getClass();
        Object objM8366C0 = AbstractC4165l.m8366C0(0, objArr);
        Integer num = objM8366C0 instanceof Integer ? (Integer) objM8366C0 : null;
        if (num == null || num.intValue() != 1212371543) {
            return;
        }
        Object[] objArr2 = methodHookParam.args;
        objArr2.getClass();
        Object objM8366C02 = AbstractC4165l.m8366C0(1, objArr2);
        Integer num2 = objM8366C02 instanceof Integer ? (Integer) objM8366C02 : null;
        if (num2 == null || num2.intValue() != -1) {
            return;
        }
        Object[] objArr3 = methodHookParam.args;
        objArr3.getClass();
        Object objM8366C03 = AbstractC4165l.m8366C0(2, objArr3);
        Intent intent = objM8366C03 instanceof Intent ? (Intent) objM8366C03 : null;
        if (intent == null || (activity = C5192p.f19536d) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        if (data != null) {
            arrayList.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i9 = 0; i9 < itemCount; i9++) {
                try {
                    ClipData.Item itemAt = clipData.getItemAt(i9);
                    if (itemAt != null && (uri = itemAt.getUri()) != null) {
                        arrayList.add(uri);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
        Uri uri2 = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : null;
        if (uri2 != null) {
            arrayList.add(uri2);
        }
        List<Uri> listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Uri uri3 : listM8407P1) {
            C5192p c5192p = C5192p.f19533a;
            if (AbstractC1416l.m3825a(uri3.getScheme(), "content")) {
                try {
                    if ((intent.getFlags() & 1) != 0) {
                        activity.getContentResolver().takePersistableUriPermission(uri3, 1);
                    }
                } catch (Throwable unused2) {
                }
            }
            C5192p c5192p2 = C5192p.f19533a;
            if ("file".equalsIgnoreCase(uri3.getScheme())) {
                absolutePath = uri3.getPath();
                if (absolutePath == null) {
                    absolutePath = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(absolutePath) || !AbstractC0921a.m2262y(absolutePath)) {
                }
            } else {
                try {
                    String strM9309C6 = AbstractC4955ho.m9309C6(activity, uri3);
                    String str = "reply_file";
                    if (strM9309C6 == null && (strM9309C6 = uri3.getLastPathSegment()) == null) {
                        strM9309C6 = "reply_file";
                    }
                    Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
                    patternCompile.getClass();
                    String strReplaceAll = patternCompile.matcher(strM9309C6).replaceAll("_");
                    strReplaceAll.getClass();
                    String string = AbstractC3149m.m6703R0(strReplaceAll).toString();
                    if (!AbstractC3149m.m6721t0(string)) {
                        str = string;
                    }
                    File file2 = new File(activity.getFilesDir(), "Hchat/auto_reply");
                    file2.mkdirs();
                    file = new File(file2, System.currentTimeMillis() + "_" + str);
                    inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri3);
                } catch (Throwable unused3) {
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            AbstractC1341a.m3594j(inputStreamOpenInputStream, fileOutputStream);
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            absolutePath = file.getAbsolutePath();
                            if (!file.isFile() || file.length() <= 0) {
                                absolutePath = null;
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
            }
            if (absolutePath != null) {
                arrayList2.add(absolutePath);
            }
        }
        List listM8407P12 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        if (listM8407P12.isEmpty() || (c4819dj = C5192p.f19535c) == null) {
            return;
        }
        c4819dj.invoke(listM8407P12);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, INVOKE]}, finally: {[CONST, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST]}, finally: {[CONST, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x07c8 A[LOOP:14: B:452:0x07a5->B:468:0x07c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x07cc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        C0224d c0224d;
        Object obj;
        Activity activityM1433l;
        boolean zM1434m;
        String str;
        Object c3959f;
        boolean z9;
        WeChatDatabaseApi weChatDatabaseApiDatabase;
        Object next;
        Object next2;
        C0744e c0744e;
        Object obj2;
        MenuItem menuItem;
        Object next3;
        Object c3959f2;
        View decorView;
        C3360l c3360lM7110f;
        Object[] objArr;
        Object objM8366C0;
        Object c3959f3;
        View view;
        Context contextM7106a;
        int i9;
        Context contextM7106a2;
        Context context;
        Context context2;
        Object c3959f4;
        Drawable drawable;
        Object c3959f5;
        int i10;
        Object obj3;
        Object next4;
        boolean z10;
        Object c3959f6;
        Object c3959f7;
        boolean z11 = true;
        int i11 = 0;
        switch (this.f562a) {
            case 0:
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                objArr2.getClass();
                Object objM8366C02 = AbstractC4165l.m8366C0(0, objArr2);
                Integer num = objM8366C02 instanceof Integer ? (Integer) objM8366C02 : null;
                if (num == null || (c0224d = (C0224d) C0227g.f565c.remove(num)) == null) {
                    return;
                }
                Object[] objArr3 = methodHookParam.args;
                objArr3.getClass();
                Object objM8366C03 = AbstractC4165l.m8366C0(1, objArr3);
                Integer num2 = objM8366C03 instanceof Integer ? (Integer) objM8366C03 : null;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    Object[] objArr4 = methodHookParam.args;
                    objArr4.getClass();
                    Object objM8366C04 = AbstractC4165l.m8366C0(2, objArr4);
                    Intent intent = objM8366C04 instanceof Intent ? (Intent) objM8366C04 : null;
                    Uri data = intent != null ? intent.getData() : null;
                    if (iIntValue != -1 || data == null) {
                        c0224d.f558c.invoke(EnumC0222b.f552h);
                        return;
                    }
                    Activity activity = c0224d.f556a;
                    if (AbstractC1416l.m3825a(data.getScheme(), "content")) {
                        try {
                            if ((intent.getFlags() & 64) != 0) {
                                activity.getContentResolver().takePersistableUriPermission(data, 1);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                    new Thread(new RunnableC0006d(c0224d, 3, data), "Hchat-MessageBubbleSave").start();
                    return;
                }
                return;
            case 1:
                methodHookParam.getClass();
                Object obj4 = methodHookParam.thisObject;
                Activity activity2 = obj4 instanceof Activity ? (Activity) obj4 : null;
                if (activity2 != null) {
                    Set<Map.Entry> setEntrySet = C0430e.f1254c.entrySet();
                    setEntrySet.getClass();
                    for (Map.Entry entry : setEntrySet) {
                        Activity activity3 = (Activity) ((C0426d) entry.getValue()).f1223a.get();
                        if (activity3 == null || activity3 == activity2) {
                            C0430e.f1254c.remove(entry.getKey(), entry.getValue());
                        }
                    }
                    return;
                }
                return;
            case 4:
                methodHookParam.getClass();
                C0492u1 c0492u1 = (C0492u1) C0429d2.f1246l.get();
                if (c0492u1 != null) {
                    String str2 = c0492u1.f1492b;
                    if (AbstractC3149m.m6721t0(str2) || C0429d2.m1438q(str2)) {
                        return;
                    }
                    Object[] objArr5 = methodHookParam.args;
                    Object objM8366C05 = objArr5 != null ? AbstractC4165l.m8366C0(0, objArr5) : null;
                    ContextMenu contextMenu = objM8366C05 instanceof ContextMenu ? (ContextMenu) objM8366C05 : null;
                    if (contextMenu != null) {
                        Iterator it = AbstractC0473o2.m1485i(c0492u1.f1491a).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next5 = it.next();
                                C0414a c0414a = (C0414a) next5;
                                if (AbstractC1416l.m3825a(c0414a.f1179a, c0492u1.f1493c) && c0414a.f1183e.contains(str2)) {
                                    obj = next5;
                                }
                            } else {
                                obj = null;
                            }
                        }
                        C0414a c0414a2 = (C0414a) obj;
                        if (c0414a2 != null) {
                            contextMenu.removeItem(1212368736);
                            contextMenu.removeItem(1212368737);
                            contextMenu.removeItem(1212368738);
                            MenuItem menuItemAdd = contextMenu.add(0, 1212368736, contextMenu.size(), "移出");
                            MenuItem menuItemAdd2 = contextMenu.add(0, 1212368737, contextMenu.size(), "移至");
                            boolean zContains = c0414a2.f1184f.contains(str2);
                            MenuItem menuItemAdd3 = contextMenu.add(0, 1212368738, contextMenu.size(), zContains ? "取消置顶" : "置顶聊天");
                            Map map = C0429d2.f1241g;
                            map.getClass();
                            Map map2 = map;
                            map2.put(menuItemAdd, new C0501x1(c0492u1, EnumC0495v1.f1506g));
                            map2.put(menuItemAdd2, new C0501x1(c0492u1, EnumC0495v1.f1507h));
                            map2.put(menuItemAdd3, new C0501x1(c0492u1, zContains ? EnumC0495v1.f1509j : EnumC0495v1.f1508i));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                int i12 = 4;
                methodHookParam.getClass();
                C0429d2 c0429d2 = C0429d2.f1235a;
                Object[] objArr6 = methodHookParam.args;
                Object objM8366C06 = objArr6 != null ? AbstractC4165l.m8366C0(0, objArr6) : null;
                ContextMenu contextMenu2 = objM8366C06 instanceof ContextMenu ? (ContextMenu) objM8366C06 : null;
                if (contextMenu2 != null) {
                    Object[] objArr7 = methodHookParam.args;
                    Object objM8366C07 = objArr7 != null ? AbstractC4165l.m8366C0(1, objArr7) : null;
                    View view2 = objM8366C07 instanceof View ? (View) objM8366C07 : null;
                    if (view2 == null || (activityM1433l = C0429d2.m1433l(view2.getContext())) == null || !AbstractC4302b.m8640c(activityM1433l, "Hchat_conversation_groups").getBoolean("enabled", false)) {
                        return;
                    }
                    Object obj5 = methodHookParam.thisObject;
                    if (obj5 != null) {
                        C3010h c3010h = new C3010h(AbstractC3015m.m6414X(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredFields(obj5.getClass())), false, new C0178b(5)), new C0456k1(obj5, 0)), new C0178b(2)));
                        while (true) {
                            if (c3010h.hasNext()) {
                                next2 = c3010h.next();
                                Method method = (Method) next2;
                                if (!AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) || !AbstractC0921a.m2236A(method, false, "com.tencent.mm.ui.conversation.")) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        Method method2 = (Method) next2;
                        zM1434m = method2 != null ? C0429d2.m1434m(method2, new C0226f(9)) : false;
                    }
                    if (zM1434m) {
                        Object obj6 = methodHookParam.thisObject;
                        if (obj6 == null || (weChatDatabaseApiDatabase = WeChatApis.database()) == null) {
                            str = null;
                        } else {
                            Class<?> superclass = obj6.getClass();
                            while (superclass != null && !superclass.equals(Object.class)) {
                                int i13 = i12;
                                C3022t c3022tM6413W = AbstractC3015m.m6413W(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredFields(superclass)), true, new C0178b(i13)), new C0456k1(obj6, 2)), C0504y1.f1541n);
                                C0507z1 c0507z1 = C0507z1.f1551n;
                                c0507z1.getClass();
                                Iterator it2 = AbstractC3015m.m6409S(new C3011i(c3022tM6413W, true, c0507z1)).iterator();
                                while (true) {
                                    AbstractC4151b abstractC4151b = (AbstractC4151b) it2;
                                    if (abstractC4151b.hasNext()) {
                                        next = abstractC4151b.next();
                                        String str3 = (String) next;
                                        if (AbstractC1416l.m3825a(weChatDatabaseApiDatabase.queryFirstString("SELECT username FROM rconversation WHERE username=? LIMIT 1", new String[]{str3}, "username"), str3)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                str = (String) next;
                                if (str == null) {
                                    superclass = superclass.getSuperclass();
                                    i12 = i13;
                                }
                            }
                            str = null;
                        }
                        if (str != null) {
                            contextMenu2.removeItem(1212368722);
                            try {
                                c3959f = Integer.valueOf(contextMenu2.getItem(0).getGroupId());
                                break;
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            boolean z12 = c3959f instanceof C3959f;
                            Object obj7 = c3959f;
                            if (z12) {
                                obj7 = 0;
                            }
                            MenuItem menuItemAdd4 = contextMenu2.add(((Number) obj7).intValue(), 1212368722, 0, "聊天分组");
                            menuItemAdd4.getClass();
                            for (Class<?> superclass2 = contextMenu2.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                                for (Field field : KavaReflector.declaredFields(superclass2)) {
                                    if (List.class.isAssignableFrom(field.getType())) {
                                        Object field2 = KavaReflector.readField(field, contextMenu2);
                                        List list = AbstractC1428x.m3840e(field2) ? (List) field2 : null;
                                        if (list != null) {
                                            Iterator it3 = list.iterator();
                                            int i14 = 0;
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    Object next6 = it3.next();
                                                    if (next6 != menuItemAdd4) {
                                                        MenuItem menuItem2 = next6 instanceof MenuItem ? (MenuItem) next6 : null;
                                                        z9 = menuItem2 != null && menuItem2.getItemId() == 1212368722;
                                                        if (z9) {
                                                            i14++;
                                                        }
                                                    }
                                                    if (z9) {
                                                    }
                                                } else {
                                                    i14 = -1;
                                                }
                                            }
                                            if (i14 > 0) {
                                                try {
                                                    list.add(0, list.remove(i14));
                                                    break;
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            if (i14 >= 0) {
                                                Map map3 = C0429d2.f1240f;
                                                map3.getClass();
                                                map3.put(menuItemAdd4, new C0483r1(activityM1433l, str));
                                                return;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            Map map32 = C0429d2.f1240f;
                            map32.getClass();
                            map32.put(menuItemAdd4, new C0483r1(activityM1433l, str));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                methodHookParam.getClass();
                C0429d2.f1244j.remove();
                return;
            case 12:
                methodHookParam.getClass();
                Object[] objArr8 = methodHookParam.args;
                objArr8.getClass();
                Object objM8366C08 = AbstractC4165l.m8366C0(0, objArr8);
                Integer num3 = objM8366C08 instanceof Integer ? (Integer) objM8366C08 : null;
                if (num3 == null || (c0744e = (C0744e) C0745f.f2218c.remove(num3)) == null) {
                    return;
                }
                Object[] objArr9 = methodHookParam.args;
                objArr9.getClass();
                Object objM8366C09 = AbstractC4165l.m8366C0(1, objArr9);
                Integer num4 = objM8366C09 instanceof Integer ? (Integer) objM8366C09 : null;
                if (num4 != null) {
                    int iIntValue2 = num4.intValue();
                    Object[] objArr10 = methodHookParam.args;
                    objArr10.getClass();
                    Object objM8366C010 = AbstractC4165l.m8366C0(2, objArr10);
                    Intent intent2 = objM8366C010 instanceof Intent ? (Intent) objM8366C010 : null;
                    Uri data2 = intent2 != null ? intent2.getData() : null;
                    if (iIntValue2 != -1 || data2 == null) {
                        return;
                    }
                    Activity activity4 = c0744e.f2212a;
                    if (AbstractC1416l.m3825a(data2.getScheme(), "content")) {
                        try {
                            if ((intent2.getFlags() & 64) != 0) {
                                activity4.getContentResolver().takePersistableUriPermission(data2, 1);
                            }
                            break;
                        } catch (Throwable unused3) {
                        }
                    }
                    new Thread(new RunnableC0006d(c0744e, 6, data2), "Hchat-CustomAvatarSave").start();
                    return;
                }
                return;
            case 14:
                if (methodHookParam == null || (obj2 = methodHookParam.thisObject) == null) {
                    return;
                }
                C2103n.f7031e = obj2;
                return;
            case 15:
                methodHookParam.getClass();
                Object obj8 = methodHookParam.thisObject;
                Activity activity5 = obj8 instanceof Activity ? (Activity) obj8 : null;
                if (activity5 != null) {
                    Set<Map.Entry> setEntrySet2 = C2365i.f7769c.entrySet();
                    setEntrySet2.getClass();
                    for (Map.Entry entry2 : setEntrySet2) {
                        Activity activity6 = (Activity) ((C2364h) entry2.getValue()).f7764a.get();
                        if (activity6 == null || activity6 == activity5) {
                            C2365i.f7769c.remove(entry2.getKey(), entry2.getValue());
                        }
                    }
                    return;
                }
                return;
            case 16:
                methodHookParam.getClass();
                Object[] objArr11 = methodHookParam.args;
                objArr11.getClass();
                Object objM8366C011 = AbstractC4165l.m8366C0(0, objArr11);
                Integer num5 = objM8366C011 instanceof Integer ? (Integer) objM8366C011 : null;
                if (num5 != null) {
                    ConcurrentHashMap concurrentHashMap = C2365i.f7769c;
                    C2364h c2364h = (C2364h) concurrentHashMap.get(num5);
                    if (c2364h != null) {
                        Activity activity7 = (Activity) c2364h.f7764a.get();
                        if (activity7 == null) {
                            concurrentHashMap.remove(num5, c2364h);
                            return;
                        }
                        if (methodHookParam.thisObject == activity7 && concurrentHashMap.remove(num5, c2364h)) {
                            Object[] objArr12 = methodHookParam.args;
                            objArr12.getClass();
                            Object objM8366C012 = AbstractC4165l.m8366C0(1, objArr12);
                            Integer num6 = objM8366C012 instanceof Integer ? (Integer) objM8366C012 : null;
                            if (num6 != null) {
                                int iIntValue3 = num6.intValue();
                                Object[] objArr13 = methodHookParam.args;
                                objArr13.getClass();
                                Object objM8366C013 = AbstractC4165l.m8366C0(2, objArr13);
                                Intent intent3 = objM8366C013 instanceof Intent ? (Intent) objM8366C013 : null;
                                Uri data3 = intent3 != null ? intent3.getData() : null;
                                if (iIntValue3 != -1 || data3 == null) {
                                    c2364h.f7766c.invoke(C2361e.f7761a);
                                    return;
                                } else {
                                    new Thread(new RunnableC0059l(this, activity7, c2364h, data3, 18), "Hchat-FloatingShortcutIcon").start();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 19:
                methodHookParam.getClass();
                Throwable th3 = new Throwable();
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th3.printStackTrace(printWriter);
                printWriter.flush();
                stringWriter.toString().getClass();
                methodHookParam.setResult(Boolean.valueOf(!AbstractC3149m.m6709h0(r0, "com.tencent.mm.pluginsdk.ui.chat", false)));
                return;
            case 20:
                methodHookParam.getClass();
                synchronized (C3358j.f10833a) {
                    try {
                        Object[] objArr14 = methodHookParam.args;
                        if (objArr14 != null) {
                            int length = objArr14.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 < length) {
                                    Object obj9 = objArr14[i15];
                                    menuItem = obj9 instanceof MenuItem ? (MenuItem) obj9 : null;
                                    if (menuItem == null) {
                                        i15++;
                                    }
                                } else {
                                    menuItem = null;
                                }
                            }
                            if (menuItem != null) {
                                Collection collectionValues = C3358j.f10834b.values();
                                collectionValues.getClass();
                                Iterator it4 = collectionValues.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next3 = it4.next();
                                        if (((C3357i) next3).f10825b == menuItem.getItemId()) {
                                        }
                                    } else {
                                        next3 = null;
                                    }
                                }
                                C3357i c3357i = (C3357i) next3;
                                if (c3357i != null) {
                                    try {
                                        c3959f2 = c3357i.f10830g.invoke();
                                        break;
                                    } catch (Throwable th4) {
                                        c3959f2 = new C3959f(th4);
                                    }
                                    Boolean bool = Boolean.FALSE;
                                    if (c3959f2 instanceof C3959f) {
                                        c3959f2 = bool;
                                    }
                                    if (((Boolean) c3959f2).booleanValue()) {
                                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                                        WeakReference weakReference = C3358j.f10840h;
                                        if ((weakReference != null ? (MenuItem) weakReference.get() : null) != menuItem || jElapsedRealtime - C3358j.f10841i >= 1500) {
                                            Map map4 = C3358j.f10836d;
                                            C3360l c3360lM7110f2 = (C3360l) map4.remove(menuItem);
                                            if (c3360lM7110f2 == null) {
                                                WeakReference weakReference2 = (WeakReference) C3358j.f10837e.remove(Integer.valueOf(menuItem.getItemId()));
                                                C3360l c3360l = weakReference2 != null ? (C3360l) weakReference2.get() : null;
                                                if (c3360l != null) {
                                                    c3360lM7110f2 = c3360l;
                                                } else {
                                                    c3360lM7110f2 = C3358j.m7110f(methodHookParam);
                                                    if (c3360lM7110f2 == null) {
                                                        return;
                                                    }
                                                }
                                            }
                                            map4.clear();
                                            C3358j.f10837e.clear();
                                            Activity activityM7106a = C3358j.m7106a();
                                            if (activityM7106a != null) {
                                                C3358j.f10840h = new WeakReference(menuItem);
                                                C3358j.f10841i = jElapsedRealtime;
                                                Window window = activityM7106a.getWindow();
                                                if (window != null && (decorView = window.getDecorView()) != null) {
                                                    decorView.post(new RunnableC0059l(activityM7106a, c3357i, c3360lM7110f2, 25));
                                                    break;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 21:
                methodHookParam.getClass();
                C3358j c3358j = C3358j.f10833a;
                ConcurrentHashMap concurrentHashMap2 = C3358j.f10837e;
                Map map5 = C3358j.f10836d;
                Collection collectionValues2 = C3358j.f10834b.values();
                collectionValues2.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj10 : collectionValues2) {
                    try {
                        c3959f7 = ((C3357i) obj10).f10830g.invoke();
                    } catch (Throwable th5) {
                        c3959f7 = new C3959f(th5);
                    }
                    Boolean bool2 = Boolean.FALSE;
                    if (c3959f7 instanceof C3959f) {
                        c3959f7 = bool2;
                    }
                    Boolean bool3 = (Boolean) c3959f7;
                    bool3.getClass();
                    if (bool3.booleanValue()) {
                        arrayList.add(obj10);
                    }
                    break;
                }
                List listM8402K1 = AbstractC4166m.m8402K1(arrayList, new C0415a0(new C0031h(24), 22));
                if (listM8402K1.isEmpty() || (c3360lM7110f = C3358j.m7110f(methodHookParam)) == null || (objArr = methodHookParam.args) == null || (objM8366C0 = AbstractC4165l.m8366C0(0, objArr)) == null) {
                    return;
                }
                Object[] objArr15 = methodHookParam.args;
                Object objM8366C014 = objArr15 != null ? AbstractC4165l.m8366C0(1, objArr15) : null;
                View view3 = objM8366C014 instanceof View ? (View) objM8366C014 : null;
                map5.clear();
                concurrentHashMap2.clear();
                ArrayList<C3357i> arrayList2 = new ArrayList();
                for (Object obj11 : listM8402K1) {
                    try {
                        Boolean bool4 = (Boolean) ((C3357i) obj11).f10831h.invoke(c3360lM7110f);
                        bool4.getClass();
                        z10 = z11;
                        c3959f6 = bool4;
                    } catch (Throwable th6) {
                        z10 = z11;
                        c3959f6 = new C3959f(th6);
                    }
                    Boolean bool5 = Boolean.FALSE;
                    int i16 = i11;
                    boolean z13 = c3959f6 instanceof C3959f;
                    Object obj12 = c3959f6;
                    if (z13) {
                        obj12 = bool5;
                    }
                    if (((Boolean) obj12).booleanValue()) {
                        arrayList2.add(obj11);
                    }
                    z11 = z10;
                    i11 = i16;
                }
                boolean z14 = z11;
                int i17 = i11;
                for (C3357i c3357i2 : arrayList2) {
                    C3358j c3358j2 = C3358j.f10833a;
                    c3357i2.getClass();
                    int i18 = c3357i2.f10825b;
                    Class cls = Integer.TYPE;
                    Integer numValueOf = Integer.valueOf(i17);
                    try {
                        InterfaceC1220a interfaceC1220a = c3357i2.f10828e;
                        c3959f3 = interfaceC1220a != null ? (String) interfaceC1220a.invoke() : null;
                    } catch (Throwable th7) {
                        c3959f3 = new C3959f(th7);
                    }
                    if (c3959f3 instanceof C3959f) {
                        c3959f3 = null;
                    }
                    String str4 = (String) c3959f3;
                    String string = str4 != null ? AbstractC3149m.m6703R0(str4).toString() : null;
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (string.length() == 0) {
                        string = c3357i2.f10826c;
                    }
                    String str5 = string;
                    int i19 = c3357i2.f10827d;
                    String str6 = c3357i2.f10829f;
                    MenuItem menuItemM7107b = C3358j.m7107b(i18, objM8366C0);
                    if (menuItemM7107b != null) {
                        try {
                            menuItemM7107b.setTitle(str5);
                            break;
                        } catch (Throwable unused4) {
                        }
                        view = view3;
                    } else {
                        if (AbstractC3149m.m6721t0(str6) || ((view3 == null || (contextM7106a = view3.getContext()) == null) && (contextM7106a = C3358j.m7106a()) == null)) {
                            view = view3;
                        } else {
                            Context context3 = contextM7106a;
                            String[] strArr = {"raw", "drawable"};
                            view = view3;
                            int i20 = i17;
                            while (i20 < 2) {
                                String[] strArr2 = strArr;
                                int i21 = i20;
                                int identifier = context3.getResources().getIdentifier(str6, strArr[i20], context3.getPackageName());
                                if (identifier != 0) {
                                    i9 = identifier;
                                    if (i9 == 0 || ((view == null || (contextM7106a2 = view.getContext()) == null) && (contextM7106a2 = C3358j.m7106a()) == null)) {
                                        drawable = null;
                                    } else {
                                        context = contextM7106a2;
                                        try {
                                            context2 = context;
                                            try {
                                                c3959f4 = context.getResources().getDrawable(i9, context2.getTheme());
                                            } catch (Throwable th8) {
                                                th = th8;
                                                c3959f4 = new C3959f(th);
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            context2 = context;
                                        }
                                        if (c3959f4 instanceof C3959f) {
                                            c3959f4 = null;
                                        }
                                        drawable = (Drawable) c3959f4;
                                        if (drawable == null) {
                                            try {
                                                InputStream inputStreamOpenRawResource = context2.getResources().openRawResource(i9);
                                                try {
                                                    c3959f5 = Drawable.createFromStream(inputStreamOpenRawResource, str6);
                                                    AbstractC2043a.m5035i(inputStreamOpenRawResource, null);
                                                } finally {
                                                }
                                            } catch (Throwable th10) {
                                                c3959f5 = new C3959f(th10);
                                            }
                                            if (c3959f5 instanceof C3959f) {
                                                c3959f5 = null;
                                            }
                                            drawable = (Drawable) c3959f5;
                                        }
                                    }
                                    if (drawable == null) {
                                        Iterator it5 = KavaReflector.declaredMethods(objM8366C0.getClass()).iterator();
                                        while (true) {
                                            if (it5.hasNext()) {
                                                next4 = it5.next();
                                                Iterator it6 = it5;
                                                Class<?>[] parameterTypes = ((Method) next4).getParameterTypes();
                                                i10 = i19;
                                                if (parameterTypes.length != 3 || !AbstractC1416l.m3825a(parameterTypes[i17], cls) || !CharSequence.class.isAssignableFrom(parameterTypes[z14 ? 1 : 0]) || !Drawable.class.isAssignableFrom(parameterTypes[2])) {
                                                    it5 = it6;
                                                    i19 = i10;
                                                }
                                            } else {
                                                i10 = i19;
                                                next4 = null;
                                            }
                                        }
                                        if (KavaReflector.invokeSuccessfully((Method) next4, objM8366C0, Integer.valueOf(i18), str5, drawable)) {
                                            menuItemM7107b = C3358j.m7107b(i18, objM8366C0);
                                        }
                                    } else {
                                        i10 = i19;
                                    }
                                    if (i9 == 0) {
                                        Iterator it7 = KavaReflector.declaredMethods(objM8366C0.getClass()).iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                Object next7 = it7.next();
                                                Method method3 = (Method) next7;
                                                Iterator it8 = it7;
                                                Class<?>[] parameterTypes2 = method3.getParameterTypes();
                                                if (AbstractC1416l.m3825a(method3.getName(), "c") && parameterTypes2.length == 5 && AbstractC1416l.m3825a(parameterTypes2[i17], cls) && AbstractC1416l.m3825a(parameterTypes2[z14 ? 1 : 0], cls) && AbstractC1416l.m3825a(parameterTypes2[2], cls) && CharSequence.class.isAssignableFrom(parameterTypes2[3]) && AbstractC1416l.m3825a(parameterTypes2[4], cls)) {
                                                    obj3 = next7;
                                                } else {
                                                    it7 = it8;
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        if (KavaReflector.invokeSuccessfully((Method) obj3, objM8366C0, numValueOf, Integer.valueOf(i18), numValueOf, str5, Integer.valueOf(i9))) {
                                            menuItemM7107b = C3358j.m7107b(i18, objM8366C0);
                                        } else {
                                            Object objInvokeMethod = KavaReflector.invokeMethod(objM8366C0, "add", numValueOf, Integer.valueOf(i18), Integer.valueOf(i10), str5);
                                            if (objInvokeMethod == null) {
                                                objInvokeMethod = KavaReflector.invokeMethod(objM8366C0, "add", numValueOf, Integer.valueOf(i18), Integer.valueOf(i10), str5);
                                            }
                                            if (objInvokeMethod instanceof MenuItem) {
                                                if (drawable != null) {
                                                    try {
                                                        ((MenuItem) objInvokeMethod).setIcon(drawable);
                                                        break;
                                                    } catch (Throwable unused5) {
                                                    }
                                                } else if (i9 != 0) {
                                                    ((MenuItem) objInvokeMethod).setIcon(i9);
                                                }
                                                menuItemM7107b = (MenuItem) objInvokeMethod;
                                            } else {
                                                menuItemM7107b = C3358j.m7107b(i18, objM8366C0);
                                            }
                                        }
                                    }
                                } else {
                                    i20 = i21 + 1;
                                    strArr = strArr2;
                                }
                            }
                        }
                        i9 = i17;
                        if (i9 == 0) {
                            context = contextM7106a2;
                            context2 = context;
                            c3959f4 = context.getResources().getDrawable(i9, context2.getTheme());
                            if (c3959f4 instanceof C3959f) {
                            }
                            drawable = (Drawable) c3959f4;
                            if (drawable == null) {
                            }
                            if (drawable == null) {
                            }
                            if (i9 == 0) {
                            }
                        }
                    }
                    if (menuItemM7107b != null) {
                        map5.put(menuItemM7107b, c3360lM7110f);
                        concurrentHashMap2.put(Integer.valueOf(i18), new WeakReference(c3360lM7110f));
                    }
                    view3 = view;
                    break;
                }
                return;
            case 28:
                m919a(methodHookParam);
                return;
            case 29:
                m920b(methodHookParam);
                return;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v18, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v19, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v20, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c3959f;
        C0501x1 c0501x1;
        C0483r1 c0483r1;
        Intent intent;
        String stringExtra;
        Object field;
        Object c3959f2;
        String strM8749K;
        int i9 = 6;
        switch (this.f562a) {
            case 2:
                methodHookParam.getClass();
                Object[] objArr = methodHookParam.args;
                Object objM8366C0 = objArr != null ? AbstractC4165l.m8366C0(0, objArr) : null;
                AdapterView adapterView = objM8366C0 instanceof AdapterView ? (AdapterView) objM8366C0 : null;
                if (adapterView != null) {
                    Object[] objArr2 = methodHookParam.args;
                    Object objM8366C02 = objArr2 != null ? AbstractC4165l.m8366C0(1, objArr2) : null;
                    View view = objM8366C02 instanceof View ? (View) objM8366C02 : null;
                    if (view != null) {
                        Object[] objArr3 = methodHookParam.args;
                        Object objM8366C03 = objArr3 != null ? AbstractC4165l.m8366C0(2, objArr3) : null;
                        Integer num = objM8366C03 instanceof Integer ? (Integer) objM8366C03 : null;
                        if (num != null) {
                            try {
                                c3959f = adapterView.getItemAtPosition(num.intValue());
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            if (c3959f instanceof C3959f) {
                                c3959f = null;
                            }
                            if (c3959f != null) {
                                C0429d2 c0429d2 = C0429d2.f1235a;
                                String strM1430i = C0429d2.m1430i(c3959f);
                                if (strM1430i == null || !C0429d2.m1438q(strM1430i)) {
                                    strM1430i = null;
                                }
                                if (strM1430i == null) {
                                    for (Class<?> superclass = c3959f.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                                        for (Field field2 : KavaReflector.declaredFields(superclass)) {
                                            if (AbstractC1416l.m3825a(field2.getType(), String.class)) {
                                                Object field3 = KavaReflector.readField(field2, c3959f);
                                                String str = field3 instanceof String ? (String) field3 : null;
                                                if (C0429d2.m1438q(str)) {
                                                    strM1430i = str;
                                                }
                                            }
                                        }
                                    }
                                    strM1430i = null;
                                }
                                if (strM1430i != null) {
                                    C0429d2 c0429d22 = C0429d2.f1235a;
                                    Activity activityM1433l = C0429d2.m1433l(view.getContext());
                                    if (activityM1433l != null) {
                                        methodHookParam.setResult((Object) null);
                                        C0429d2.f1248n.post(new RunnableC0487t(activityM1433l, strM1430i, 1));
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                methodHookParam.getClass();
                C0429d2 c0429d23 = C0429d2.f1235a;
                Object[] objArr4 = methodHookParam.args;
                Object objM8366C04 = objArr4 != null ? AbstractC4165l.m8366C0(0, objArr4) : null;
                MenuItem menuItem = objM8366C04 instanceof MenuItem ? (MenuItem) objM8366C04 : null;
                if (menuItem != null && (c0501x1 = (C0501x1) C0429d2.f1241g.remove(menuItem)) != null) {
                    methodHookParam.setResult((Object) null);
                    C0429d2.f1248n.post(new RunnableC0003a(c0501x1, 5));
                    break;
                }
                break;
            case 4:
            case 5:
            case 12:
            case 14:
            case 15:
            case 16:
            case 19:
            case 20:
            case 21:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 6:
                methodHookParam.getClass();
                Object[] objArr5 = methodHookParam.args;
                Object objM8366C05 = objArr5 != null ? AbstractC4165l.m8366C0(0, objArr5) : null;
                if (C0429d2.m1438q(objM8366C05 instanceof String ? (String) objM8366C05 : null)) {
                    methodHookParam.setResult(Boolean.FALSE);
                }
                break;
            case 7:
                methodHookParam.getClass();
                ThreadLocal threadLocal = C0429d2.f1244j;
                threadLocal.remove();
                String str2 = (String) C0429d2.f1242h.get(methodHookParam.thisObject);
                if (str2 != null) {
                    String str3 = Boolean.valueOf(C0429d2.m1438q(str2)).booleanValue() ? str2 : null;
                    if (str3 != null) {
                        threadLocal.set(str3);
                    }
                }
                break;
            case 8:
                methodHookParam.getClass();
                if (C0429d2.m1438q((String) C0429d2.f1245k.get())) {
                    Object[] objArr6 = methodHookParam.args;
                    if (AbstractC1416l.m3825a(objArr6 != null ? AbstractC4165l.m8366C0(0, objArr6) : null, "@placeholder_foldgroup")) {
                        methodHookParam.setResult((Object) null);
                    }
                }
                break;
            case 9:
                methodHookParam.getClass();
                Object[] objArr7 = methodHookParam.args;
                Object objM8366C06 = objArr7 != null ? AbstractC4165l.m8366C0(0, objArr7) : null;
                MenuItem menuItem2 = objM8366C06 instanceof MenuItem ? (MenuItem) objM8366C06 : null;
                if (menuItem2 != null && menuItem2.getItemId() == 1212368722 && (c0483r1 = (C0483r1) C0429d2.f1240f.remove(menuItem2)) != null) {
                    methodHookParam.setResult((Object) null);
                    C0429d2.f1248n.post(new RunnableC0003a(c0483r1, i9));
                    break;
                }
                break;
            case 10:
                methodHookParam.getClass();
                if (methodHookParam.thisObject.getClass().getName().equals("com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI")) {
                    Object[] objArr8 = methodHookParam.args;
                    if (AbstractC1416l.m3825a(objArr8 != null ? AbstractC4165l.m8366C0(0, objArr8) : null, "Contact_User")) {
                        Object objInvokeMethod = KavaReflector.invokeMethod(methodHookParam.thisObject, "getActivity", new Object[0]);
                        if (objInvokeMethod == null) {
                            objInvokeMethod = KavaReflector.invokeMethod(methodHookParam.thisObject, "thisActivity", new Object[0]);
                        }
                        Activity activity = objInvokeMethod instanceof Activity ? (Activity) objInvokeMethod : null;
                        if (activity != null && (intent = activity.getIntent()) != null && (stringExtra = intent.getStringExtra("Contact_User")) != null) {
                            String str4 = Boolean.valueOf(C0429d2.m1438q(stringExtra)).booleanValue() ? stringExtra : null;
                            if (str4 != null) {
                                methodHookParam.setResult(str4);
                            }
                            break;
                        }
                    }
                }
                break;
            case 11:
                methodHookParam.getClass();
                C0429d2 c0429d24 = C0429d2.f1235a;
                Object obj = methodHookParam.thisObject;
                if (obj == null) {
                    field = null;
                } else {
                    for (Class<?> superclass2 = obj.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                        for (Field field4 : KavaReflector.declaredFields(superclass2)) {
                            if (field4.getType().getName().equals("com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI")) {
                                field = KavaReflector.readField(field4, obj);
                            }
                        }
                    }
                    field = null;
                }
                if (field != null) {
                    C0429d2 c0429d25 = C0429d2.f1235a;
                    if (C0429d2.m1442v(field) != null) {
                        Object[] objArr9 = methodHookParam.args;
                        Object objM8366C07 = objArr9 != null ? AbstractC4165l.m8366C0(0, objArr9) : null;
                        AdapterView adapterView2 = objM8366C07 instanceof AdapterView ? (AdapterView) objM8366C07 : null;
                        if (adapterView2 != null) {
                            Object[] objArr10 = methodHookParam.args;
                            Object objM8366C08 = objArr10 != null ? AbstractC4165l.m8366C0(1, objArr10) : null;
                            View view2 = objM8366C08 instanceof View ? (View) objM8366C08 : null;
                            if (view2 != null) {
                                Object[] objArr11 = methodHookParam.args;
                                Object objM8366C09 = objArr11 != null ? AbstractC4165l.m8366C0(2, objArr11) : null;
                                Integer num2 = objM8366C09 instanceof Integer ? (Integer) objM8366C09 : null;
                                if (num2 != null) {
                                    try {
                                        c3959f2 = adapterView2.getItemAtPosition(num2.intValue());
                                    } catch (Throwable th3) {
                                        c3959f2 = new C3959f(th3);
                                    }
                                    if (c3959f2 instanceof C3959f) {
                                        c3959f2 = null;
                                    }
                                    if (c3959f2 != null) {
                                        C0429d2 c0429d26 = C0429d2.f1235a;
                                        String strM1430i2 = C0429d2.m1430i(c3959f2);
                                        Activity activityM1433l2 = C0429d2.m1433l(view2.getContext());
                                        if (activityM1433l2 != null) {
                                            methodHookParam.setResult((Object) null);
                                            if (strM1430i2 == null || AbstractC3149m.m6721t0(strM1430i2)) {
                                                AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 微信原生分组列表无法解析会话: item=".concat(c3959f2.getClass().getName()));
                                            } else {
                                                C0429d2.f1248n.post(new RunnableC0059l(activityM1433l2, field, strM1430i2, i9));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 13:
                methodHookParam.getClass();
                ArrayDeque arrayDeque = (ArrayDeque) C0846q.f2591l.get();
                if (arrayDeque != null ? AbstractC1416l.m3825a(arrayDeque.peekLast(), Boolean.TRUE) : false) {
                    methodHookParam.setResult((Object) null);
                    break;
                }
                break;
            case 17:
                methodHookParam.getClass();
                Object obj2 = methodHookParam.thisObject;
                Activity activity2 = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity2 != null && activity2.getIntent().getBooleanExtra("hchat_silent_repeat", false)) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    String stringExtra2 = activity2.getIntent().getStringExtra("Select_Conv_User");
                    if (stringExtra2 != null) {
                        List listM6691F0 = AbstractC3149m.m6691F0(stringExtra2, new char[]{','}, 6);
                        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
                        Iterator it = listM6691F0.iterator();
                        while (it.hasNext()) {
                            AbstractC2091b.m5171r((String) it.next(), arrayList2);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : arrayList2) {
                            if ((((String) obj3).length() > 0) != false) {
                                arrayList3.add(obj3);
                            }
                        }
                        arrayList.addAll(arrayList3);
                    }
                    Intent intent2 = new Intent();
                    intent2.putStringArrayListExtra("SendMsgUsernames", arrayList);
                    intent2.putExtra("sendResult", 0);
                    activity2.setResult(-1, intent2);
                    activity2.finish();
                    methodHookParam.setResult((Object) null);
                    break;
                }
                break;
            case 18:
                methodHookParam.getClass();
                Object[] objArr12 = methodHookParam.args;
                Object objM8391z0 = objArr12 != null ? AbstractC4165l.m8391z0(objArr12) : null;
                Button button = objM8391z0 instanceof Button ? (Button) objM8391z0 : null;
                if (button != null && button.getVisibility() != 0) {
                    button.setVisibility(0);
                    break;
                }
                break;
            case 22:
                if (((Integer) methodHookParam.args[0]).intValue() == -1212373076) {
                    methodHookParam.setResult("Hchat");
                }
                break;
            case 23:
                try {
                    Activity activity3 = (Activity) methodHookParam.thisObject;
                    Intent intent3 = activity3.getIntent();
                    if (intent3 != null && intent3.hasExtra("Hchat")) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1435d(this, activity3), 500L);
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 24:
                try {
                    Activity activity4 = (Activity) methodHookParam.thisObject;
                    Intent intent4 = (Intent) methodHookParam.args[0];
                    if (intent4 != null && intent4.hasExtra("Hchat")) {
                        activity4.getClass();
                        AbstractC0018a.m231S(activity4, null, false);
                        break;
                    }
                } catch (Throwable unused2) {
                    return;
                }
                break;
            case 25:
                methodHookParam.getClass();
                methodHookParam.setResult(0);
                break;
            case 26:
                methodHookParam.getClass();
                Object obj4 = methodHookParam.thisObject;
                Activity activity5 = obj4 instanceof Activity ? (Activity) obj4 : null;
                if (activity5 != null) {
                    Object[] objArr13 = methodHookParam.args;
                    objArr13.getClass();
                    Object objM8366C010 = AbstractC4165l.m8366C0(1, objArr13);
                    if (objM8366C010 != null && AbstractC1416l.m3825a(C4330d.m8748J(objM8366C010), "hchat_profile_id") && (strM8749K = C4330d.m8749K(activity5, EnumC4542b.f14992h)) != null) {
                        Object systemService = activity5.getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText("ID", strM8749K));
                        }
                        Toast.makeText(activity5, "已复制ID", 0).show();
                        methodHookParam.setResult(Boolean.TRUE);
                        break;
                    }
                }
                break;
            case 27:
                Object[] objArr14 = methodHookParam.args;
                if (objArr14 != null && objArr14.length >= 4) {
                    Object obj5 = objArr14[3];
                    if (obj5 == null) {
                        C4696g c4696g = AbstractC4699j.f15695a;
                    } else if (AbstractC4699j.f15696b.containsKey(obj5)) {
                        methodHookParam.setResult((Object) null);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [q8.h.r():void] */
    public /* synthetic */ C0226f(Object obj, int i9) {
        this.f562a = i9;
    }
}
