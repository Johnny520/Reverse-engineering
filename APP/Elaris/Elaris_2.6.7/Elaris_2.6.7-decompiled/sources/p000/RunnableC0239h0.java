package p000;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.widget.CheckBox;
import android.widget.TextView;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.ElarisStatusActivity;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.ModernHookEntry;
import com.p001mr.elaris.Prefs;
import io.github.libxposed.api.XposedInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: h0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0239h0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f340b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0239h0(int i, Object obj) {
        this.f339a = i;
        this.f340b = obj;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[SPUT, MOVE_EXCEPTION, SPUT, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, CONST_STR, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Class process forced to load method for inline: com.mr.elaris.ModernHookEntry.a(io.github.libxposed.api.XposedInterface):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[INVOKE, APUT] complete}, expected: {[INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String strM1017r;
        File file;
        Uri uriInsert;
        String str;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        ContentResolver contentResolver;
        FileInputStream fileInputStream2;
        OutputStream outputStreamOpenOutputStream;
        boolean z2 = false;
        switch (this.f339a) {
            case 0:
                if (HookEntry.isCurrentHotReloadGeneration(((RunnableC0255i0) this.f340b).f369b) && AbstractC0429r0.f774c && HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
                    AbstractC0429r0.m836p();
                    return;
                }
                return;
            case 1:
                Context context = (Context) this.f340b;
                SharedPreferences sharedPreferences = context.getSharedPreferences("elaris_dexkit_locator", 0);
                HookEntry.log("dexkit locator ready schema=7 cacheHits=" + AbstractC0463t2.m1007h(sharedPreferences, AbstractC0463t2.m1003d(context)) + " qq=" + HookEntry.hostVersionSummary());
                String strM1013n = AbstractC0463t2.m1013n(context, sharedPreferences);
                if (strM1013n.length() == 0) {
                    HookEntry.log("dexkit skipped by cache=true");
                    HookEntry.log("dexkit locator maintenance skipped reason=verified_cache");
                    return;
                }
                HookEntry.log("dexkit locator cache incomplete missing=".concat(strM1013n));
                if (AbstractC0463t2.f889k) {
                    z = AbstractC0463t2.f890l;
                } else {
                    synchronized (AbstractC0463t2.class) {
                        if (AbstractC0463t2.f889k) {
                            z = AbstractC0463t2.f890l;
                        } else {
                            try {
                                System.loadLibrary("dexkit");
                                AbstractC0463t2.f890l = true;
                                HookEntry.log("dexkit native loaded library=dexkit");
                            } finally {
                                try {
                                } catch (Throwable th) {
                                }
                            }
                            AbstractC0463t2.f889k = true;
                            z = AbstractC0463t2.f890l;
                        }
                    }
                }
                if (!z) {
                    HookEntry.log("dexkit locator unavailable reason=native_load_failed qq=" + HookEntry.hostVersionSummary());
                    return;
                }
                String str2 = "";
                try {
                    if (context.getApplicationInfo() != null && context.getApplicationInfo().sourceDir != null) {
                        str2 = context.getApplicationInfo().sourceDir;
                    }
                    break;
                } catch (Throwable unused) {
                }
                String str3 = str2;
                if (str3.length() == 0) {
                    HookEntry.log("dexkit locator unavailable reason=source_missing qq=" + HookEntry.hostVersionSummary());
                    return;
                }
                try {
                    File file2 = new File(str3);
                    strM1017r = file2.getName() + ":" + file2.length();
                } catch (Throwable unused2) {
                    strM1017r = AbstractC0463t2.m1017r(str3);
                }
                String str4 = strM1017r;
                HookEntry.log("dexkit locator bridge open start timeout=15000ms source=".concat(str4));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Object[] objArr = new Object[1];
                Throwable[] thArr = new Throwable[1];
                long jCurrentTimeMillis = System.currentTimeMillis();
                Thread thread = new Thread(new RunnableC0447s2(str3, objArr, atomicBoolean, context, thArr), "Elaris-DexKitBridgeOpen");
                thread.setPriority(1);
                thread.setDaemon(true);
                thread.start();
                try {
                    thread.join(15000L);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (thread.isAlive()) {
                        atomicBoolean.set(true);
                        AbstractC0463t2.m1006g(objArr[0]);
                        objArr[0] = null;
                        HookEntry.log("dexkit locator bridge open timeout took=" + jCurrentTimeMillis2 + "ms source=" + str4);
                        return;
                    }
                    Object obj = objArr[0];
                    try {
                        Throwable th2 = thArr[0];
                        if (th2 != null) {
                            HookEntry.log("dexkit locator bridge open failed took=" + jCurrentTimeMillis2 + "ms source=" + str4 + ": " + th2.getClass().getSimpleName() + ": " + AbstractC0463t2.m1017r(th2.getMessage()));
                        } else {
                            HookEntry.log("dexkit locator bridge open ok took=" + jCurrentTimeMillis2 + "ms source=" + str4);
                        }
                        AbstractC0463t2.m1006g(obj);
                        return;
                    } catch (Throwable th3) {
                        AbstractC0463t2.m1006g(obj);
                        throw th3;
                    }
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    atomicBoolean.set(true);
                    HookEntry.log("dexkit locator bridge open interrupted source=".concat(str4));
                    return;
                }
                break;
            case 2:
                ((ElarisStatusActivity) this.f340b).render();
                return;
            case 3:
                AbstractC0449s4.m887f((C0209f2) this.f340b, "auto_send_expired");
                return;
            case 4:
                try {
                    C0314l8 c0314l8 = ((RunnableC0485u8) this.f340b).f944c.f1042a;
                    C0314l8 c0314l82 = ((RunnableC0485u8) this.f340b).f942a;
                    if (c0314l8 == c0314l82 && !c0314l82.f528a && ((RunnableC0485u8) this.f340b).f945d.isShowing()) {
                        ((RunnableC0485u8) this.f340b).f944c.f1042a = null;
                        ((RunnableC0485u8) this.f340b).f947f.setText("音色加载失败，点击重试");
                        RunnableC0485u8 runnableC0485u8 = (RunnableC0485u8) this.f340b;
                        runnableC0485u8.f947f.setTextColor(AbstractC0486u9.m1050c(runnableC0485u8.f949h));
                        ((RunnableC0485u8) this.f340b).f947f.setClickable(true);
                        RunnableC0485u8 runnableC0485u82 = (RunnableC0485u8) this.f340b;
                        TextView textView = runnableC0485u82.f947f;
                        textView.setOnClickListener(new ViewOnClickListenerC0405p8(runnableC0485u82.f949h, runnableC0485u82.f945d, textView, runnableC0485u82.f948g, runnableC0485u82.f946e, runnableC0485u82.f944c, 1));
                        RunnableC0485u8 runnableC0485u83 = (RunnableC0485u8) this.f340b;
                        AbstractC0260i5.m640o(runnableC0485u83.f945d, AbstractC0486u9.m1039A(runnableC0485u83.f949h));
                        break;
                    }
                    return;
                } finally {
                    AbstractC0010a9.m72a(((RunnableC0485u8) this.f340b).f942a);
                }
            case 5:
                ((C0314l8) this.f340b).m752a();
                return;
            case 6:
                ModernHookEntry.detachCompatBridge((XposedInterface) this.f340b);
                return;
            case 7:
                CheckBox checkBox = (CheckBox) this.f340b;
                if (!HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT) || checkBox.isChecked()) {
                    return;
                }
                checkBox.setChecked(true);
                AbstractC0332ma.m760a("guild-panel");
                return;
            case 8:
                RunnableC0352ne runnableC0352ne = (RunnableC0352ne) this.f340b;
                AbstractC0169w.m276W0(runnableC0352ne.f612f, "语音发送失败");
                runnableC0352ne.f615i[0] = true;
                Dialog dialog = runnableC0352ne.f616j;
                if (dialog != null) {
                    try {
                        dialog.dismiss();
                        return;
                    } catch (Throwable unused4) {
                        return;
                    }
                }
                return;
            default:
                C0317lb c0317lb = (C0317lb) this.f340b;
                Context contextHostContext = HookEntry.hostContext();
                if (contextHostContext == null || (file = c0317lb.f536a) == null || !file.exists()) {
                    AbstractC0169w.m276W0(contextHostContext, "语音保存失败");
                    return;
                }
                String strM328w = AbstractC0169w.m328w(c0317lb.f537b);
                if (strM328w.length() == 0) {
                    strM328w = AbstractC0169w.m328w(file.getName());
                }
                if (strM328w.length() == 0) {
                    strM328w = ".ptt";
                }
                String str5 = "Elaris-voice-" + new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(new Date()) + strM328w;
                try {
                    contentResolver = contextHostContext.getContentResolver();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str5);
                    contentValues.put("mime_type", "application/octet-stream");
                    contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/Elaris/Voice");
                    contentValues.put("is_pending", (Integer) 1);
                    uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                    try {
                    } catch (Throwable th4) {
                        th = th4;
                        if (uriInsert != null) {
                            try {
                                contextHostContext.getContentResolver().delete(uriInsert, null, null);
                                break;
                            } catch (Throwable unused5) {
                            }
                        }
                        HookEntry.log("voice save MediaStore failed reason=" + th.getClass().getSimpleName() + ": " + AbstractC0169w.m242F0(th.getMessage()));
                    }
                } catch (Throwable th5) {
                    th = th5;
                    uriInsert = null;
                }
                if (uriInsert == null) {
                    str = "";
                } else {
                    try {
                        fileInputStream2 = new FileInputStream(file);
                        try {
                            outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                            if (outputStreamOpenOutputStream == null) {
                                AbstractC0169w.m306l(fileInputStream2);
                                AbstractC0169w.m306l(outputStreamOpenOutputStream);
                                str = "";
                            } else {
                                try {
                                    byte[] bArr2 = new byte[65536];
                                    while (true) {
                                        int i = fileInputStream2.read(bArr2);
                                        if (i <= 0) {
                                            outputStreamOpenOutputStream.flush();
                                            AbstractC0169w.m306l(fileInputStream2);
                                            AbstractC0169w.m306l(outputStreamOpenOutputStream);
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("is_pending", (Integer) 0);
                                            contentResolver.update(uriInsert, contentValues2, null, null);
                                            str = "Download/Elaris/Voice/" + str5;
                                        } else {
                                            outputStreamOpenOutputStream.write(bArr2, 0, i);
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    AbstractC0169w.m306l(fileInputStream2);
                                    AbstractC0169w.m306l(outputStreamOpenOutputStream);
                                    throw th;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            outputStreamOpenOutputStream = null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        fileInputStream2 = null;
                        outputStreamOpenOutputStream = null;
                    }
                }
                boolean z3 = str.length() > 0;
                if (!z3) {
                    File file3 = new File(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Elaris/Voice"), str5);
                    try {
                        if (file3.getParentFile() != null && !file3.getParentFile().exists()) {
                            file3.getParentFile().mkdirs();
                        }
                        fileInputStream = new FileInputStream(file);
                        try {
                            fileOutputStream = new FileOutputStream(file3);
                            try {
                                bArr = new byte[65536];
                            } catch (Throwable unused6) {
                                fileOutputStream.close();
                            }
                            break;
                        } catch (Throwable unused7) {
                        }
                    } catch (Throwable unused8) {
                    }
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 <= 0) {
                            fileOutputStream.flush();
                            try {
                                fileOutputStream.close();
                                break;
                            } catch (Throwable unused9) {
                            }
                            z2 = true;
                        } else {
                            fileOutputStream.write(bArr, 0, i2);
                        }
                        fileInputStream.close();
                        String absolutePath = z2 ? file3.getAbsolutePath() : "";
                        z3 = z2;
                        str = absolutePath;
                    }
                }
                AbstractC0169w.m276W0(contextHostContext, z3 ? "已保存：" + str : "语音保存失败");
                return;
        }
    }
}
