package com.abc.core.features;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Process;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p031Q0.AbstractC0307g;
import p031Q0.C0316p;
import p034S.AbstractC0324d;
import p037U.AbstractC0358S;
import p040V0.C0406i;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;
import p089x0.C1121e;

/* JADX INFO: renamed from: c0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageEditHook {

    /* JADX INFO: renamed from: a */
    public static final MessageEditHook f2116a = new MessageEditHook();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f2117b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f2118c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f2119d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f2120e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    public static final ConcurrentHashMap f2121f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public static final ConcurrentHashMap f2122g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f2123h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public static final ConcurrentHashMap f2124i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j */
    public static final CopyOnWriteArrayList f2125j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: k */
    public static final ConcurrentHashMap f2126k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l */
    public static final Set f2127l = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: m */
    public static volatile boolean f2128m;

    /* JADX INFO: renamed from: n */
    public static volatile boolean f2129n;

    /* JADX INFO: renamed from: o */
    public static volatile C0666j0 f2130o;

    /* JADX INFO: renamed from: p */
    public static volatile WeakReference f2131p;

    /* JADX INFO: renamed from: q */
    public static volatile String f2132q;

    /* JADX INFO: renamed from: r */
    public static volatile long f2133r;

    /* JADX INFO: renamed from: s */
    public static volatile boolean f2134s;

    /* JADX INFO: renamed from: t */
    public static volatile boolean f2135t;

    /* JADX INFO: renamed from: A */
    public static void m1709A(final TextView textView) {
        final Context context;
        final C0666j0 c0666j0 = f2130o;
        if (!m1724o(c0666j0)) {
            Toast.makeText(textView.getContext(), "当前消息不可修改", 0).show();
            m1711C("edit blocked: no active message ref");
            return;
        }
        AbstractC0307g.m700b(c0666j0);
        if (!m1725p() || f2135t || (context = textView.getContext()) == null) {
            return;
        }
        final String str = c0666j0.f2068b;
        String str2 = (String) f2122g.get(Long.valueOf(c0666j0.f2067a));
        if (str2 == null) {
            str2 = str;
        }
        final EditText editText = new EditText(context);
        editText.setText(str2);
        editText.setInputType(131073);
        Editable text = editText.getText();
        editText.setSelection(text != null ? text.length() : 0);
        editText.setMinLines(3);
        editText.setMaxLines(8);
        editText.setPadding(m1719h(context, 14), m1719h(context, 10), m1719h(context, 14), m1719h(context, 10));
        try {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle("修改消息").setView(editText).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: c0.f0
                /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x01f8  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x01fb  */
                @Override // android.content.DialogInterface.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    String str3;
                    Context context2;
                    ConcurrentHashMap concurrentHashMap;
                    boolean z2;
                    int i3;
                    int i4;
                    Object next;
                    Object next2;
                    Object objM116u;
                    boolean z3;
                    Object objM116u2;
                    String strConcat;
                    EditText editText2 = editText;
                    AbstractC0307g.m703e(editText2, "$input");
                    final C0666j0 c0666j02 = c0666j0;
                    AbstractC0307g.m703e(c0666j02, "$ref");
                    final String str4 = str;
                    AbstractC0307g.m703e(str4, "$originalText");
                    final TextView textView2 = textView;
                    AbstractC0307g.m703e(textView2, "$tv");
                    Context context3 = context;
                    AbstractC0307g.m703e(context3, "$ctx");
                    Editable text2 = editText2.getText();
                    String string = text2 != null ? text2.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    final String str5 = string;
                    ConcurrentHashMap concurrentHashMap2 = MessageEditHook.f2122g;
                    long j2 = c0666j02.f2067a;
                    concurrentHashMap2.put(Long.valueOf(j2), str5);
                    if (!AbstractC0425j.m1013R0(str4)) {
                        MessageEditHook.f2121f.put(str4, str5);
                    }
                    MessageEditHook messageEditHook = MessageEditHook.f2116a;
                    String str6 = c0666j02.f2069c;
                    Integer numM1735z = MessageEditHook.m1735z(str6);
                    if (numM1735z != null) {
                        int iIntValue = numM1735z.intValue();
                        int i5 = iIntValue - 3;
                        if (!AbstractC0433r.m1034I0(str6, i5)) {
                            i5 = iIntValue - 2;
                        }
                        String strSubstring = str6.substring(0, i5);
                        AbstractC0307g.m702d(strSubstring, "substring(...)");
                        if (!AbstractC0433r.m1033H0(strSubstring, "wxid_", false)) {
                            Pattern patternCompile = Pattern.compile("[a-zA-Z][\\w@.\\-]{4,80}");
                            AbstractC0307g.m702d(patternCompile, "compile(...)");
                            if (patternCompile.matcher(strSubstring).matches()) {
                                String strSubstring2 = str6.substring(0, iIntValue);
                                AbstractC0307g.m702d(strSubstring2, "substring(...)");
                                strConcat = strSubstring2.concat(str5);
                            } else {
                                strConcat = str5;
                            }
                            str3 = strConcat;
                        }
                    } else {
                        str3 = str5;
                    }
                    Object obj = c0666j02.f2070d.get();
                    if (obj != null) {
                        C0406i c0406iM861K = AbstractC0358S.m861K(new C0672l0(obj.getClass(), null));
                        while (true) {
                            if (!c0406iM861K.hasNext()) {
                                next = null;
                                break;
                            }
                            next = c0406iM861K.next();
                            Method method = (Method) next;
                            C0406i c0406i = c0406iM861K;
                            if (AbstractC0040p.m92W("setContent", "setMsgContent").contains(method.getName()) && method.getParameterTypes().length == 1 && AbstractC0307g.m699a(method.getParameterTypes()[0], String.class)) {
                                break;
                            } else {
                                c0406iM861K = c0406i;
                            }
                        }
                        Method method2 = (Method) next;
                        if (method2 != null) {
                            try {
                                method2.setAccessible(true);
                                objM116u2 = method2.invoke(obj, str3);
                            } catch (Throwable th) {
                                objM116u2 = AbstractC0040p.m116u(th);
                            }
                            if (!(objM116u2 instanceof C0140f)) {
                                context2 = context3;
                                concurrentHashMap = concurrentHashMap2;
                                z3 = true;
                                z2 = z3;
                            } else {
                                Throwable thM465a = AbstractC0141g.m465a(objM116u2);
                                if (thM465a != null) {
                                    concurrentHashMap = concurrentHashMap2;
                                    context2 = context3;
                                    MessageEditHook.m1711C("content setter fail " + obj.getClass().getName() + "." + method2.getName() + ": " + thM465a.getMessage());
                                } else {
                                    context2 = context3;
                                    concurrentHashMap = concurrentHashMap2;
                                }
                                C0406i c0406iM861K2 = AbstractC0358S.m861K(new C0669k0(obj.getClass(), null));
                                while (true) {
                                    if (!c0406iM861K2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = c0406iM861K2.next();
                                    Field field = (Field) next2;
                                    if (AbstractC0040p.m92W("field_content", "content").contains(field.getName()) && AbstractC0307g.m699a(field.getType(), String.class)) {
                                        break;
                                    }
                                }
                                Field field2 = (Field) next2;
                                if (field2 != null) {
                                    try {
                                        field2.setAccessible(true);
                                        field2.set(obj, str3);
                                        objM116u = C0146l.f339a;
                                    } catch (Throwable th2) {
                                        objM116u = AbstractC0040p.m116u(th2);
                                    }
                                    z3 = true;
                                    if (!(objM116u instanceof C0140f)) {
                                        z2 = z3;
                                    } else {
                                        Throwable thM465a2 = AbstractC0141g.m465a(objM116u);
                                        if (thM465a2 != null) {
                                            MessageEditHook.m1711C("content field fail " + obj.getClass().getName() + "." + field2.getName() + ": " + thM465a2.getMessage());
                                        }
                                    }
                                }
                            }
                        }
                        if (j2 > 0) {
                            i4 = 0;
                            i3 = 0;
                        } else {
                            List listM543o0 = AbstractC0181l.m543o0(MessageEditHook.f2125j);
                            int iM1722m = 0;
                            for (Object obj2 : listM543o0) {
                                AbstractC0307g.m700b(obj2);
                                int iM1722m2 = MessageEditHook.m1722m(obj2, str3, "msgId=?", new String[]{String.valueOf(j2)});
                                iM1722m = iM1722m2 > 0 ? iM1722m + iM1722m2 : iM1722m + MessageEditHook.m1722m(obj2, str3, "msgId=" + j2, new String[0]);
                            }
                            i3 = 0;
                            if (iM1722m <= 0) {
                                MessageEditHook.m1711C("db update missed msgId=" + j2 + " dbs=" + listM543o0.size());
                            }
                            i4 = iM1722m;
                        }
                        int iM1715d = MessageEditHook.m1715d(c0666j02, textView2, str4, str5);
                        final int i6 = 0;
                        int i7 = i3;
                        textView2.post(new Runnable() { // from class: c0.i0
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str7 = str5;
                                String str8 = str4;
                                TextView textView3 = textView2;
                                C0666j0 c0666j03 = c0666j02;
                                switch (i6) {
                                    case 0:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                    case 1:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook3 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                    default:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook4 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                }
                            }
                        });
                        final int i8 = 1;
                        textView2.postDelayed(new Runnable() { // from class: c0.i0
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str7 = str5;
                                String str8 = str4;
                                TextView textView3 = textView2;
                                C0666j0 c0666j03 = c0666j02;
                                switch (i8) {
                                    case 0:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                    case 1:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook3 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                    default:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook4 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                }
                            }
                        }, 120L);
                        final int i9 = 2;
                        textView2.postDelayed(new Runnable() { // from class: c0.i0
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str7 = str5;
                                String str8 = str4;
                                TextView textView3 = textView2;
                                C0666j0 c0666j03 = c0666j02;
                                switch (i9) {
                                    case 0:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                    case 1:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook3 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                    default:
                                        AbstractC0307g.m703e(c0666j03, "$ref");
                                        AbstractC0307g.m703e(textView3, "$tv");
                                        AbstractC0307g.m703e(str8, "$originalText");
                                        AbstractC0307g.m703e(str7, "$newText");
                                        MessageEditHook messageEditHook4 = MessageEditHook.f2116a;
                                        MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                        break;
                                }
                            }
                        }, 420L);
                        Toast.makeText(context2, "已修改本地显示", i7).show();
                        MessageEditHook.m1711C("edited msgId=" + j2 + " objectApplied=" + z2 + " dbRows=" + i4 + " views=" + iM1715d + " oldLen=" + str4.length() + " len=" + str5.length() + " cache=" + concurrentHashMap.size());
                    }
                    context2 = context3;
                    concurrentHashMap = concurrentHashMap2;
                    z2 = false;
                    if (j2 > 0) {
                    }
                    int iM1715d2 = MessageEditHook.m1715d(c0666j02, textView2, str4, str5);
                    final int i62 = 0;
                    int i72 = i3;
                    textView2.post(new Runnable() { // from class: c0.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str7 = str5;
                            String str8 = str4;
                            TextView textView3 = textView2;
                            C0666j0 c0666j03 = c0666j02;
                            switch (i62) {
                                case 0:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                                case 1:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook3 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                                default:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook4 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                            }
                        }
                    });
                    final int i82 = 1;
                    textView2.postDelayed(new Runnable() { // from class: c0.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str7 = str5;
                            String str8 = str4;
                            TextView textView3 = textView2;
                            C0666j0 c0666j03 = c0666j02;
                            switch (i82) {
                                case 0:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                                case 1:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook3 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                                default:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook4 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                            }
                        }
                    }, 120L);
                    final int i92 = 2;
                    textView2.postDelayed(new Runnable() { // from class: c0.i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str7 = str5;
                            String str8 = str4;
                            TextView textView3 = textView2;
                            C0666j0 c0666j03 = c0666j02;
                            switch (i92) {
                                case 0:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                                case 1:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook3 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                                default:
                                    AbstractC0307g.m703e(c0666j03, "$ref");
                                    AbstractC0307g.m703e(textView3, "$tv");
                                    AbstractC0307g.m703e(str8, "$originalText");
                                    AbstractC0307g.m703e(str7, "$newText");
                                    MessageEditHook messageEditHook4 = MessageEditHook.f2116a;
                                    MessageEditHook.m1715d(c0666j03, textView3, str8, str7);
                                    break;
                            }
                        }
                    }, 420L);
                    Toast.makeText(context2, "已修改本地显示", i72).show();
                    MessageEditHook.m1711C("edited msgId=" + j2 + " objectApplied=" + z2 + " dbRows=" + i4 + " views=" + iM1715d2 + " oldLen=" + str4.length() + " len=" + str5.length() + " cache=" + concurrentHashMap.size());
                }
            }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
            alertDialogCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC0657g0());
            f2135t = true;
            alertDialogCreate.show();
        } catch (Throwable th) {
            f2135t = false;
            Toast.makeText(context, "无法弹出编辑框", 0).show();
            m1711C("dialog fail: " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m1710B(Class cls) {
        if (!cls.isPrimitive()) {
            return cls.isArray() ? AbstractC0433r.m1032G0(cls.getName(), '.', '/') : AbstractC0324d.m723f("L", AbstractC0433r.m1032G0(cls.getName(), '.', '/'), ";");
        }
        if (cls.equals(Integer.TYPE)) {
            return "I";
        }
        if (!cls.equals(Void.TYPE)) {
            if (cls.equals(Boolean.TYPE)) {
                return "Z";
            }
            if (cls.equals(Character.TYPE)) {
                return "C";
            }
            if (cls.equals(Byte.TYPE)) {
                return "B";
            }
            if (cls.equals(Short.TYPE)) {
                return "S";
            }
            if (cls.equals(Float.TYPE)) {
                return "F";
            }
            if (cls.equals(Long.TYPE)) {
                return "J";
            }
            if (cls.equals(Double.TYPE)) {
                return "D";
            }
        }
        return "V";
    }

    /* JADX INFO: renamed from: C */
    public static void m1711C(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-EditMsg] " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final TextView m1712a(MessageEditHook messageEditHook, View view) {
        String string;
        messageEditHook.getClass();
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (m1726q(textView)) {
                return textView;
            }
        }
        View view2 = view;
        int i2 = Integer.MIN_VALUE;
        TextView textView2 = null;
        for (int i3 = 0; i3 < 8; i3++) {
            Object parent = view2 != null ? view2.getParent() : null;
            View view3 = parent instanceof View ? (View) parent : null;
            if (view3 != null) {
                if (view3 instanceof ViewGroup) {
                    ArrayList<TextView> arrayList = new ArrayList();
                    m1717f(view3, arrayList);
                    for (TextView textView3 : arrayList) {
                        if (m1726q(textView3)) {
                            CharSequence text = textView3.getText();
                            String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC0425j.m1022a1(string).toString();
                            if (string2 == null) {
                                string2 = "";
                            }
                            float textSize = textView3.getTextSize() / textView3.getResources().getDisplayMetrics().scaledDensity;
                            int length = string2.length();
                            if (length > 120) {
                                length = 120;
                            }
                            if (textView3 == view) {
                                length += 90;
                            }
                            int i4 = textSize >= 15.0f ? length + 45 : length - 35;
                            if (string2.length() <= 2 && textSize < 16.0f) {
                                i4 -= 30;
                            }
                            if (textView3.getWidth() > 0 && textView3.getHeight() > 0) {
                                int height = (textView3.getHeight() * textView3.getWidth()) / 1200;
                                if (height > 80) {
                                    height = 80;
                                }
                                i4 += height;
                            }
                            for (int i5 = 0; i5 < string2.length(); i5++) {
                                char cCharAt = string2.charAt(i5);
                                if (Character.isLetterOrDigit(cCharAt) || (19968 <= cCharAt && cCharAt < 40960)) {
                                    i4 += 15;
                                    break;
                                }
                            }
                            if (i4 > i2) {
                                textView2 = textView3;
                                i2 = i4;
                            }
                        }
                    }
                    if (i2 >= 60) {
                        break;
                    }
                }
                view2 = view3;
            }
        }
        return textView2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1713b(MessageEditHook messageEditHook, Menu menu) {
        final TextView textView;
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        WeakReference weakReference;
        messageEditHook.getClass();
        final C0666j0 c0666j0 = f2130o;
        Object obj = null;
        if (c0666j0 == null || (weakReference = c0666j0.f2072f) == null || (textView = (TextView) weakReference.get()) == null) {
            WeakReference weakReference2 = f2131p;
            textView = weakReference2 != null ? (TextView) weakReference2.get() : null;
            if (textView == null) {
                return;
            }
        }
        if (m1723n(textView) && m1724o(c0666j0) && !f2134s) {
            f2134s = true;
            try {
                MenuItem menuItemFindItem = menu.findItem(1212368196);
                MenuItem menuItemAdd = menuItemFindItem == null ? menu.add(0, 1212368196, 0, "修改") : menuItemFindItem;
                menuItemAdd.setTitle("修改");
                try {
                    objM116u = textView.getContext();
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                Context context = (Context) objM116u;
                if (context == null) {
                    try {
                        Field declaredField = menu.getClass().getDeclaredField("mContext");
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(menu);
                        objM116u2 = obj2 instanceof Context ? (Context) obj2 : null;
                    } catch (Throwable th2) {
                        objM116u2 = AbstractC0040p.m116u(th2);
                    }
                    if (!(objM116u2 instanceof C0140f)) {
                        obj = objM116u2;
                    }
                    context = (Context) obj;
                }
                Integer numM1720i = m1720i(context);
                if (numM1720i != null) {
                    int iIntValue = numM1720i.intValue();
                    try {
                        objM116u3 = menuItemAdd.setIcon(iIntValue);
                    } catch (Throwable th3) {
                        objM116u3 = AbstractC0040p.m116u(th3);
                    }
                    if (true ^ (objM116u3 instanceof C0140f)) {
                        m1711C("edit menu icon=native:" + iIntValue);
                    }
                }
                try {
                    menuItemAdd.setShowAsAction(0);
                } catch (Throwable th4) {
                    AbstractC0040p.m116u(th4);
                }
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: c0.h0
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        String strM1734y;
                        TextView textView2 = textView;
                        C0666j0 c0666j02 = c0666j0;
                        AbstractC0307g.m703e(textView2, "$target");
                        AbstractC0307g.m703e(menuItem, "it");
                        MessageEditHook.f2131p = new WeakReference(textView2);
                        MessageEditHook messageEditHook2 = MessageEditHook.f2116a;
                        if (c0666j02 == null || (strM1734y = c0666j02.f2068b) == null) {
                            strM1734y = MessageEditHook.m1734y(textView2);
                        }
                        MessageEditHook.f2132q = strM1734y;
                        MessageEditHook.f2133r = System.currentTimeMillis();
                        MessageEditHook.m1709A(textView2);
                        return true;
                    }
                });
                m1711C(menuItemFindItem == null ? "edit menu added" : "edit menu rebound");
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m1714c(View view) {
        int i2 = 0;
        Object parent = view;
        while (i2 < 16) {
            boolean z2 = parent instanceof View;
            View view2 = z2 ? (View) parent : null;
            if (view2 != null) {
                String name = view2.getClass().getName();
                if (AbstractC0425j.m1005J0(name, "ChatFooter", false)) {
                    return false;
                }
                if (AbstractC0425j.m1005J0(name, "chatting", true)) {
                    return true;
                }
                View view3 = z2 ? (View) parent : null;
                parent = view3 != null ? view3.getParent() : null;
            }
            i2++;
            parent = parent;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static int m1715d(C0666j0 c0666j0, TextView textView, String str, String str2) {
        Object objM116u;
        LinkedHashSet<TextView> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(textView);
        TextView textView2 = (TextView) c0666j0.f2072f.get();
        if (textView2 != null) {
            linkedHashSet.add(textView2);
        }
        View view = (View) c0666j0.f2071e.get();
        if (view != null) {
            ArrayList<TextView> arrayList = new ArrayList();
            m1717f(view, arrayList);
            for (TextView textView3 : arrayList) {
                CharSequence text = textView3.getText();
                String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                if (textView3 == textView || textView3 == c0666j0.f2072f.get() || string.equals(str) || AbstractC0307g.m699a(f2121f.get(string), str2)) {
                    if (m1726q(textView3) || textView3 == textView || textView3 == c0666j0.f2072f.get()) {
                        linkedHashSet.add(textView3);
                    }
                }
            }
        }
        for (TextView textView4 : linkedHashSet) {
            f2129n = true;
            try {
                textView4.setText(str2);
                objM116u = C0146l.f339a;
            } finally {
            }
            if (AbstractC0141g.m465a(objM116u) != null) {
                try {
                    textView4.setText(str2);
                } catch (Throwable th) {
                    f2129n = false;
                }
            }
            textView4.invalidate();
            textView4.requestLayout();
            f2129n = false;
        }
        View view2 = (View) c0666j0.f2071e.get();
        if (view2 != null) {
            view2.invalidate();
            view2.requestLayout();
        }
        return linkedHashSet.size();
    }

    /* JADX INFO: renamed from: e */
    public static Class m1716e(Class cls) {
        return cls.equals(Integer.TYPE) ? Integer.class : cls.equals(Long.TYPE) ? Long.class : cls.equals(Short.TYPE) ? Short.class : cls.equals(Byte.TYPE) ? Byte.class : cls.equals(Float.TYPE) ? Float.class : cls.equals(Double.TYPE) ? Double.class : cls;
    }

    /* JADX INFO: renamed from: f */
    public static void m1717f(View view, ArrayList arrayList) {
        if (view instanceof TextView) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                AbstractC0307g.m702d(childAt, "getChildAt(...)");
                m1717f(childAt, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Method m1718g(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Method method;
        int iM1011P0 = AbstractC0425j.m1011P0(str, "->", 0, false, 6);
        int iM1010O0 = AbstractC0425j.m1010O0(str, '(', iM1011P0, false, 4);
        if (iM1011P0 <= 1 || iM1010O0 <= iM1011P0) {
            throw new IllegalArgumentException(str.toString());
        }
        String strSubstring = str.substring(1, iM1011P0 - 1);
        AbstractC0307g.m702d(strSubstring, "substring(...)");
        String strM1032G0 = AbstractC0433r.m1032G0(strSubstring, '/', '.');
        String strSubstring2 = str.substring(iM1011P0 + 2, iM1010O0);
        AbstractC0307g.m702d(strSubstring2, "substring(...)");
        String strSubstring3 = str.substring(iM1010O0);
        AbstractC0307g.m702d(strSubstring3, "substring(...)");
        for (Class<?> clsLoadClass = classLoader.loadClass(strM1032G0); clsLoadClass != null; clsLoadClass = clsLoadClass.getSuperclass()) {
            Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i2];
                if (AbstractC0307g.m699a(method.getName(), strSubstring2)) {
                    StringBuilder sb = new StringBuilder("(");
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    for (Class<?> cls : parameterTypes) {
                        AbstractC0307g.m700b(cls);
                        sb.append(m1710B(cls));
                    }
                    sb.append(')');
                    Class<?> returnType = method.getReturnType();
                    AbstractC0307g.m702d(returnType, "getReturnType(...)");
                    sb.append(m1710B(returnType));
                    String string = sb.toString();
                    AbstractC0307g.m702d(string, "toString(...)");
                    if (string.equals(strSubstring3)) {
                        break;
                    }
                }
                i2++;
            }
            if (method != null) {
                method.setAccessible(true);
                return method;
            }
        }
        throw new IllegalStateException("method not found: ".concat(str).toString());
    }

    /* JADX INFO: renamed from: h */
    public static int m1719h(Context context, int i2) {
        return (int) ((i2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: i */
    public static Integer m1720i(Context context) {
        if (context == null) {
            return null;
        }
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        for (String str : AbstractC0182m.m556h0("raw", "drawable")) {
            AbstractC0307g.m703e(str, "type");
            Integer numValueOf = Integer.valueOf(resources.getIdentifier("icons_filled_edit_photo_pencil", str, packageName));
            if (numValueOf.intValue() != 0) {
                return numValueOf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static Object m1721j(Object obj, int i2, Set set) {
        Object objM116u;
        Object objM1729t;
        if (obj != null && i2 <= 5 && set.add(obj)) {
            Object objM1729t2 = m1729t(obj);
            if (objM1729t2 != null) {
                return objM1729t2;
            }
            if ((obj instanceof View) && (objM1729t = m1729t(((View) obj).getTag())) != null) {
                return objM1729t;
            }
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    Object objM1721j = m1721j(obj2, i2 + 1, set);
                    if (objM1721j != null) {
                        return objM1721j;
                    }
                }
                return null;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Object objM1721j2 = m1721j(it.next(), i2 + 1, set);
                    if (objM1721j2 != null) {
                        return objM1721j2;
                    }
                }
                return null;
            }
            String name = obj.getClass().getName();
            if (!AbstractC0433r.m1033H0(name, "java.", false) && !AbstractC0433r.m1033H0(name, "android.", false) && !AbstractC0433r.m1033H0(name, "kotlin.", false)) {
                C0406i c0406iM861K = AbstractC0358S.m861K(new C0669k0(obj.getClass(), null));
                while (c0406iM861K.hasNext()) {
                    Field field = (Field) c0406iM861K.next();
                    if (!field.getType().isPrimitive() && !field.getType().isArray() && !AbstractC0307g.m699a(field.getType(), String.class)) {
                        try {
                            field.setAccessible(true);
                            objM116u = field.get(obj);
                        } catch (Throwable th) {
                            objM116u = AbstractC0040p.m116u(th);
                        }
                        if (objM116u instanceof C0140f) {
                            objM116u = null;
                        }
                        Object objM1721j3 = m1721j(objM116u, i2 + 1, set);
                        if (objM1721j3 != null) {
                            return objM1721j3;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static int m1722m(Object obj, String str, String str2, String[] strArr) {
        Object objM116u;
        ContentValues contentValues = new ContentValues();
        contentValues.put("content", str);
        Method[] methods = obj.getClass().getMethods();
        AbstractC0307g.m702d(methods, "getMethods(...)");
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (AbstractC0040p.m92W("update", "updateWithOnConflict").contains(method.getName()) && method.getParameterTypes().length >= 4 && AbstractC0307g.m699a(method.getParameterTypes()[0], String.class) && ContentValues.class.isAssignableFrom(method.getParameterTypes()[1])) {
                arrayList.add(method);
            }
        }
        for (Method method2 : AbstractC0181l.m548t0(arrayList, new C0692s(4))) {
            try {
                method2.setAccessible(true);
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (parameterTypes.length == 4) {
                    objM116u = method2.invoke(obj, "message", contentValues, str2, strArr);
                } else if (parameterTypes.length == 5) {
                    objM116u = method2.invoke(obj, "message", contentValues, str2, strArr, 0);
                } else {
                    int length = parameterTypes.length - 4;
                    Object[] objArr = new Object[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        objArr[i2] = null;
                    }
                    C0316p c0316p = new C0316p(5);
                    ArrayList arrayList2 = c0316p.f597a;
                    c0316p.m709a("message");
                    c0316p.m709a(contentValues);
                    c0316p.m709a(str2);
                    c0316p.m709a(strArr);
                    c0316p.m710b(objArr);
                    objM116u = method2.invoke(obj, arrayList2.toArray(new Object[arrayList2.size()]));
                }
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            if (thM465a != null) {
                m1711C("db update fail " + obj.getClass().getName() + "." + method2.getName() + ": " + thM465a.getMessage());
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            Number number = objM116u instanceof Number ? (Number) objM116u : null;
            int iIntValue = number != null ? number.intValue() : 0;
            if (iIntValue > 0) {
                return iIntValue;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m1723n(TextView textView) {
        WeakReference weakReference = f2131p;
        return (weakReference != null ? (TextView) weakReference.get() : null) == textView && System.currentTimeMillis() - f2133r < 8000;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m1724o(C0666j0 c0666j0) {
        return c0666j0 != null && f2130o == c0666j0 && System.currentTimeMillis() - f2133r < 8000;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1725p() {
        Object objM116u;
        try {
            ConfigStore configStore = ConfigStore.f2048a;
            objM116u = Boolean.valueOf(ConfigStore.m1661c("edit_message", false));
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m1726q(TextView textView) {
        String string;
        if (!AbstractC0307g.m699a(textView.getTag(C1031R.id.abc_tag_custom_time), Boolean.TRUE) && textView.getVisibility() == 0 && textView.getAlpha() > 0.0f) {
            CharSequence text = textView.getText();
            String string2 = (text == null || (string = text.toString()) == null) ? null : AbstractC0425j.m1022a1(string).toString();
            if (string2 == null) {
                string2 = "";
            }
            return (AbstractC0425j.m1013R0(string2) || string2.length() > 4000 || string2.equals("修改") || AbstractC0433r.m1033H0(string2, "✎", false) || m1728s(string2)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static void m1727r(Context context, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        Object objM116u;
        String str2;
        AtomicBoolean atomicBoolean = f2119d;
        if (atomicBoolean.get()) {
            return;
        }
        try {
            System.loadLibrary("dexkit");
            objM116u = C0146l.f339a;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (!(objM116u instanceof C0140f)) {
            atomicBoolean.set(true);
            return;
        }
        if (str == null) {
            throw new IllegalStateException("module path unavailable for libdexkit.so".toString());
        }
        if (Process.is64Bit()) {
            String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
            AbstractC0307g.m702d(strArr, "SUPPORTED_64_BIT_ABIS");
            str2 = (String) AbstractC0179j.m536m0(strArr);
            if (str2 == null) {
                str2 = "arm64-v8a";
            }
        } else {
            String[] strArr2 = Build.SUPPORTED_32_BIT_ABIS;
            AbstractC0307g.m702d(strArr2, "SUPPORTED_32_BIT_ABIS");
            str2 = (String) AbstractC0179j.m536m0(strArr2);
            if (str2 == null) {
                str2 = "armeabi-v7a";
            }
        }
        File file = new File(context.getCacheDir(), AbstractC0324d.m723f("abc_", str2, "_libdexkit.so"));
        ZipFile zipFile = new ZipFile(str);
        try {
            ZipEntry entry = zipFile.getEntry("lib/" + str2 + "/libdexkit.so");
            if (entry == null) {
                throw new IllegalStateException(("lib/" + str2 + "/libdexkit.so not found").toString());
            }
            InputStream inputStream = zipFile.getInputStream(entry);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    AbstractC0307g.m700b(inputStream);
                    AbstractC0040p.m115t(inputStream, fileOutputStream, 8192);
                    AbstractC0040p.m108m(fileOutputStream, null);
                    AbstractC0040p.m108m(inputStream, null);
                    AbstractC0040p.m108m(zipFile, null);
                    System.load(file.getAbsolutePath());
                    atomicBoolean.set(true);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1728s(String str) {
        String string = AbstractC0425j.m1022a1(str).toString();
        Pattern patternCompile = Pattern.compile("\\d{1,2}:\\d{2}(:\\d{2})?");
        AbstractC0307g.m702d(patternCompile, "compile(...)");
        AbstractC0307g.m703e(string, "input");
        if (patternCompile.matcher(string).matches()) {
            return true;
        }
        Pattern patternCompile2 = Pattern.compile("\\d{1,2}月\\d{1,2}日\\s+\\d{1,2}:\\d{2}");
        AbstractC0307g.m702d(patternCompile2, "compile(...)");
        if (patternCompile2.matcher(string).matches()) {
            return true;
        }
        Pattern patternCompile3 = Pattern.compile("\\d{1,2}[-/]\\d{1,2}\\s+周.\\s+.*");
        AbstractC0307g.m702d(patternCompile3, "compile(...)");
        if (patternCompile3.matcher(string).matches()) {
            return true;
        }
        if (AbstractC0425j.m1005J0(string, "分钟前", false) || AbstractC0425j.m1005J0(string, "小时前", false) || AbstractC0425j.m1005J0(string, "昨天", false) || AbstractC0425j.m1005J0(string, "前天", false)) {
            int i2 = 0;
            while (true) {
                if (i2 >= string.length()) {
                    break;
                }
                if (!Character.isDigit(string.charAt(i2))) {
                    i2++;
                } else if (string.length() <= 40) {
                    return true;
                }
            }
        }
        Pattern patternCompile4 = Pattern.compile(".*\\b(KB|MB|GB)\\b.*", C1121e.m2635b(2));
        AbstractC0307g.m702d(patternCompile4, "compile(...)");
        return patternCompile4.matcher(string).matches() || AbstractC0040p.m92W("未下载", "转文字", "微信网页版", "个人名片").contains(string);
    }

    /* JADX INFO: renamed from: t */
    public static Object m1729t(Object obj) {
        Object objM116u;
        Object objM116u2;
        if (obj == null) {
            return null;
        }
        if (AbstractC0433r.m1033H0(obj.getClass().getName(), "com.tencent.mm.storage.", false) && m1732w(obj) > 0) {
            return obj;
        }
        Method method = (Method) f2123h.computeIfAbsent(obj.getClass(), new C0612O(new C0570A(8), 4));
        if (method != null) {
            try {
                objM116u = method.invoke(obj, null);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
        } else {
            objM116u = null;
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        if (objM116u != null && m1732w(objM116u) > 0) {
            return objM116u;
        }
        Field field = (Field) f2124i.computeIfAbsent(obj.getClass(), new C0612O(new C0570A(6), 2));
        if (field != null) {
            try {
                objM116u2 = field.get(obj);
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
        } else {
            objM116u2 = null;
        }
        if (objM116u2 instanceof C0140f) {
            objM116u2 = null;
        }
        if (objM116u2 == null || m1732w(objM116u2) <= 0) {
            return null;
        }
        return objM116u2;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0666j0 m1730u(View view, TextView textView) {
        String strM1731v;
        String strSubstring;
        Object objM1729t = m1729t(view.getTag());
        if (objM1729t == null) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            AbstractC0307g.m702d(setNewSetFromMap, "newSetFromMap(...)");
            objM1729t = m1721j(view, 0, setNewSetFromMap);
        }
        long jM1732w = objM1729t != null ? m1732w(objM1729t) : 0L;
        if (objM1729t != null && jM1732w > 0) {
            Number numberM1733x = m1733x(objM1729t, "getType", "field_type", "type");
            Integer numValueOf = numberM1733x != null ? Integer.valueOf(numberM1733x.intValue()) : null;
            String strM1731v2 = m1731v(objM1729t);
            CharSequence charSequenceSubSequence = "";
            if (strM1731v2 == null) {
                strM1731v2 = "";
            }
            if ((numValueOf == null || numValueOf.intValue() == 1) && !AbstractC0425j.m1013R0(strM1731v2) && strM1731v2.length() <= 4000) {
                int length = strM1731v2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (!AbstractC0358S.m860J(strM1731v2.charAt(i2))) {
                        charSequenceSubSequence = strM1731v2.subSequence(i2, strM1731v2.length());
                        break;
                    }
                    i2++;
                }
                if (!AbstractC0433r.m1033H0(charSequenceSubSequence.toString(), "<", false) && !m1728s(strM1731v2) && (strM1731v = m1731v(objM1729t)) != null) {
                    String str = AbstractC0425j.m1013R0(strM1731v) ^ true ? strM1731v : null;
                    if (str != null) {
                        Integer numM1735z = m1735z(str);
                        if (numM1735z != null) {
                            int iIntValue = numM1735z.intValue();
                            int i3 = iIntValue - 3;
                            if (!AbstractC0433r.m1034I0(str, i3)) {
                                i3 = iIntValue - 2;
                            }
                            String strSubstring2 = str.substring(0, i3);
                            AbstractC0307g.m702d(strSubstring2, "substring(...)");
                            if (!AbstractC0433r.m1033H0(strSubstring2, "wxid_", false)) {
                                Pattern patternCompile = Pattern.compile("[a-zA-Z][\\w@.\\-]{4,80}");
                                AbstractC0307g.m702d(patternCompile, "compile(...)");
                                if (!patternCompile.matcher(strSubstring2).matches()) {
                                    strSubstring = str;
                                }
                            }
                            strSubstring = str.substring(iIntValue);
                            AbstractC0307g.m702d(strSubstring, "substring(...)");
                        }
                        String str2 = AbstractC0425j.m1013R0(strSubstring) ^ true ? strSubstring : null;
                        if (str2 == null) {
                            return null;
                        }
                        return new C0666j0(jM1732w, str2, str, new WeakReference(objM1729t), new WeakReference(view), new WeakReference(textView));
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static String m1731v(Object obj) {
        Object next;
        Object objM116u;
        Object next2;
        Object objM116u2;
        String[] strArr = {"getContent", "field_content", "content"};
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                return null;
            }
            String str = strArr[i2];
            C0406i c0406iM861K = AbstractC0358S.m861K(new C0672l0(obj.getClass(), null));
            while (true) {
                if (!c0406iM861K.hasNext()) {
                    next = null;
                    break;
                }
                next = c0406iM861K.next();
                Method method = (Method) next;
                if (AbstractC0307g.m699a(method.getName(), str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0 && AbstractC0307g.m699a(method.getReturnType(), String.class)) {
                        break;
                    }
                }
            }
            Method method2 = (Method) next;
            if (method2 != null) {
                try {
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(obj, null);
                    objM116u = objInvoke instanceof String ? (String) objInvoke : null;
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                String str2 = (String) objM116u;
                if (str2 != null) {
                    if (!(!AbstractC0425j.m1013R0(str2))) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        return str2;
                    }
                }
            }
            C0406i c0406iM861K2 = AbstractC0358S.m861K(new C0669k0(obj.getClass(), null));
            while (true) {
                if (!c0406iM861K2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = c0406iM861K2.next();
                Field field = (Field) next2;
                if (AbstractC0307g.m699a(field.getName(), str) && AbstractC0307g.m699a(field.getType(), String.class)) {
                    break;
                }
            }
            Field field2 = (Field) next2;
            if (field2 != null) {
                try {
                    field2.setAccessible(true);
                    Object obj2 = field2.get(obj);
                    objM116u2 = obj2 instanceof String ? (String) obj2 : null;
                } catch (Throwable th2) {
                    objM116u2 = AbstractC0040p.m116u(th2);
                }
                if (objM116u2 instanceof C0140f) {
                    objM116u2 = null;
                }
                String str3 = (String) objM116u2;
                if (str3 == null) {
                    continue;
                } else {
                    String str4 = true ^ AbstractC0425j.m1013R0(str3) ? str3 : null;
                    if (str4 != null) {
                        return str4;
                    }
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: w */
    public static long m1732w(Object obj) {
        Number numberM1733x = m1733x(obj, "getMsgId", "getMsgID", "field_msgId", "msgId", "msgID", "id");
        if (numberM1733x != null) {
            return numberM1733x.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x */
    public static Number m1733x(Object obj, String... strArr) {
        Object next;
        Object objM116u;
        Object next2;
        Object objM116u2;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return null;
            }
            String str = strArr[i2];
            C0406i c0406iM861K = AbstractC0358S.m861K(new C0672l0(obj.getClass(), null));
            while (true) {
                if (!c0406iM861K.hasNext()) {
                    next = null;
                    break;
                }
                next = c0406iM861K.next();
                Method method = (Method) next;
                if (AbstractC0307g.m699a(method.getName(), str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                    if (parameterTypes.length == 0) {
                        Class<?> returnType = method.getReturnType();
                        AbstractC0307g.m702d(returnType, "getReturnType(...)");
                        if (Number.class.isAssignableFrom(m1716e(returnType))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Method method2 = (Method) next;
            if (method2 != null) {
                try {
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(obj, null);
                    objM116u = objInvoke instanceof Number ? (Number) objInvoke : null;
                } catch (Throwable th) {
                    objM116u = AbstractC0040p.m116u(th);
                }
                if (objM116u instanceof C0140f) {
                    objM116u = null;
                }
                Number number = (Number) objM116u;
                if (number != null) {
                    return number;
                }
            }
            C0406i c0406iM861K2 = AbstractC0358S.m861K(new C0669k0(obj.getClass(), null));
            while (true) {
                if (!c0406iM861K2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = c0406iM861K2.next();
                Field field = (Field) next2;
                if (AbstractC0307g.m699a(field.getName(), str)) {
                    Class<?> type = field.getType();
                    AbstractC0307g.m702d(type, "getType(...)");
                    if (Number.class.isAssignableFrom(m1716e(type))) {
                        break;
                    }
                }
            }
            Field field2 = (Field) next2;
            if (field2 != null) {
                try {
                    field2.setAccessible(true);
                    Object obj2 = field2.get(obj);
                    objM116u2 = obj2 instanceof Number ? (Number) obj2 : null;
                } catch (Throwable th2) {
                    objM116u2 = AbstractC0040p.m116u(th2);
                }
                Number number2 = (Number) (objM116u2 instanceof C0140f ? null : objM116u2);
                if (number2 != null) {
                    return number2;
                }
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m1734y(TextView textView) {
        String str = f2132q;
        CharSequence text = textView.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        return (str == null || AbstractC0425j.m1013R0(str) || !AbstractC0307g.m699a(f2121f.get(str), string)) ? string : str;
    }

    /* JADX INFO: renamed from: z */
    public static Integer m1735z(String str) {
        int iM1011P0 = AbstractC0425j.m1011P0(str, ":\r\n", 0, false, 6);
        Integer numValueOf = Integer.valueOf(iM1011P0);
        if (1 > iM1011P0 || iM1011P0 >= 81) {
            numValueOf = null;
        }
        Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 3) : null;
        int iM1011P02 = AbstractC0425j.m1011P0(str, ":\n", 0, false, 6);
        Integer numValueOf3 = Integer.valueOf(iM1011P02);
        if (1 > iM1011P02 || iM1011P02 >= 81) {
            numValueOf3 = null;
        }
        return (Integer) AbstractC0181l.m547s0(AbstractC0179j.m535l0(new Integer[]{numValueOf2, numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() + 2) : null}));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1736k(Method method) {
        boolean z2;
        boolean z3;
        Object objM116u;
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
        int length = parameterTypes.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z2 = false;
                break;
            }
            if (Menu.class.isAssignableFrom(parameterTypes[i2])) {
                z2 = true;
                break;
            }
            i2++;
        }
        Class<?>[] parameterTypes2 = method.getParameterTypes();
        AbstractC0307g.m702d(parameterTypes2, "getParameterTypes(...)");
        int length2 = parameterTypes2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                z3 = false;
                break;
            }
            if (View.class.isAssignableFrom(parameterTypes2[i3])) {
                z3 = true;
                break;
            }
            i3++;
        }
        if (!z2 || !z3) {
            return false;
        }
        String genericString = method.toGenericString();
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0653f(this, genericString, 2));
            objM116u = Boolean.TRUE;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1711C("create menu hook fail " + method.getDeclaringClass().getName() + ": " + thM465a.getMessage());
            objM116u = Boolean.FALSE;
        }
        return ((Boolean) objM116u).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1737l(Method method) {
        Object objM116u;
        if (method.getParameterTypes().length != 2 || !AbstractC0307g.m699a(method.getParameterTypes()[0], MenuItem.class) || !AbstractC0307g.m699a(method.getParameterTypes()[1], Integer.TYPE) || !AbstractC0307g.m699a(method.getReturnType(), Void.TYPE)) {
            return false;
        }
        String genericString = method.toGenericString();
        try {
            method.setAccessible(true);
            AbstractC0762d.m1952b(method, new C0647d(this, method, genericString));
            f2120e.incrementAndGet();
            objM116u = Boolean.TRUE;
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Throwable thM465a = AbstractC0141g.m465a(objM116u);
        if (thM465a != null) {
            m1711C("selection hook fail " + method.getDeclaringClass().getName() + ": " + thM465a.getMessage());
            objM116u = Boolean.FALSE;
        }
        return ((Boolean) objM116u).booleanValue();
    }
}
