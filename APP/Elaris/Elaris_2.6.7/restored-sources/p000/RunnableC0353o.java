package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import com.p001mr.elaris.HookEntry;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: o */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0353o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f617a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f618b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f619c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f620d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f621e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0353o(Context context, Activity activity, View view, C0419q6 c0419q6) {
        this.f620d = context;
        this.f618b = activity;
        this.f621e = view;
        this.f619c = c0419q6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(21:16|100|17|(2:22|23)|26|(1:28)(3:29|(3:31|(1:118)(2:37|115)|38)|114)|39|(2:108|40)|(4:(3:110|42|(15:46|47|112|55|(1:66)|67|(1:69)|70|(1:72)|73|103|74|105|75|(2:77|121)(2:81|82)))|105|75|(0)(0))|(1:49)|54|112|55|(4:60|61|63|66)|67|(0)|70|(0)|73|103|74) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:16|100|17|(2:22|23)|26|(1:28)(3:29|(3:31|(1:118)(2:37|115)|38)|114)|39|108|40|(3:110|42|(15:46|47|112|55|(1:66)|67|(1:69)|70|(1:72)|73|103|74|105|75|(2:77|121)(2:81|82)))|(1:49)|54|112|55|(4:60|61|63|66)|67|(0)|70|(0)|73|103|74|105|75|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011f, code lost:
    
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e5, code lost:
    
        r15 = r0;
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:17:0x0090, B:19:0x00a1, B:22:0x00a8, B:23:0x00af, B:26:0x00b5, B:39:0x00e0, B:47:0x0103, B:61:0x0125, B:63:0x012b, B:66:0x0133, B:67:0x013c, B:69:0x0142, B:70:0x0146, B:73:0x014e, B:49:0x0109, B:29:0x00bc, B:31:0x00c8, B:33:0x00cc, B:35:0x00d2, B:37:0x00da, B:38:0x00dd), top: B:100:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b8 A[Catch: all -> 0x01da, TryCatch #3 {all -> 0x01da, blocks: (B:75:0x01ac, B:77:0x01b8, B:81:0x01de, B:82:0x01e3), top: B:105:0x01ac }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de A[Catch: all -> 0x01da, TryCatch #3 {all -> 0x01da, blocks: (B:75:0x01ac, B:77:0x01b8, B:81:0x01de, B:82:0x01e3), top: B:105:0x01ac }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable th;
        File file;
        String message;
        File file2;
        ContentResolver contentResolver;
        Cursor cursorQuery;
        String string;
        File file3;
        String strM597b2;
        int iLastIndexOf;
        int columnIndex;
        int i = this.f617a;
        Object obj = this.f621e;
        Object obj2 = this.f619c;
        Object obj3 = this.f620d;
        switch (i) {
            case 0:
                Activity activity = this.f618b;
                ClassLoader classLoader = (ClassLoader) obj3;
                Object obj4 = this.f621e;
                Uri uri = (Uri) obj2;
                String strM512A = "";
                File file4 = null;
                try {
                    file2 = new File(activity.getCacheDir(), "elaris_video_bubble");
                    if (!file2.exists() && !file2.mkdirs()) {
                        throw new IllegalStateException("cache directory unavailable");
                    }
                    File[] fileArrListFiles = file2.listFiles();
                    if (fileArrListFiles != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
                        for (File file5 : fileArrListFiles) {
                            if (file5 != null && file5.isFile() && file5.lastModified() < jCurrentTimeMillis) {
                                file5.delete();
                            }
                        }
                    }
                    contentResolver = activity.getContentResolver();
                    try {
                        cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Throwable unused) {
                        cursorQuery = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    file = null;
                }
                try {
                    if (cursorQuery != null) {
                        try {
                        } catch (Throwable unused2) {
                            if (cursorQuery != null) {
                            }
                            string = "";
                            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
                            if (string != null) {
                            }
                            if (strM512A.length() == 0) {
                            }
                            if (strM512A.length() == 0) {
                            }
                            String str = Long.toHexString(System.currentTimeMillis()) + "_" + Long.toHexString(System.nanoTime());
                            file3 = new File(file2, str + "." + strM512A);
                            long jM874c = AbstractC0444s.m874c(contentResolver, uri, file3);
                            C0428r c0428rM879h = AbstractC0444s.m879h(file3, new File(file2, str + ".jpg"));
                            file = c0428rM879h.f771b;
                            strM597b2 = AbstractC0260i5.m597b2(jM874c, c0428rM879h.f770a);
                            if (strM597b2.length() > 0) {
                            }
                        }
                        if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_display_name")) >= 0) {
                            string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            String extensionFromMimeType2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
                            if (string != null && (iLastIndexOf = string.lastIndexOf(46)) >= 0 && iLastIndexOf < string.length() - 1) {
                                strM512A = AbstractC0260i5.m512A(string.substring(iLastIndexOf + 1));
                            }
                            if (strM512A.length() == 0) {
                                strM512A = AbstractC0260i5.m512A(extensionFromMimeType2);
                            }
                            if (strM512A.length() == 0) {
                                strM512A = "mp4";
                            }
                            String str2 = Long.toHexString(System.currentTimeMillis()) + "_" + Long.toHexString(System.nanoTime());
                            file3 = new File(file2, str2 + "." + strM512A);
                            long jM874c2 = AbstractC0444s.m874c(contentResolver, uri, file3);
                            C0428r c0428rM879h2 = AbstractC0444s.m879h(file3, new File(file2, str2 + ".jpg"));
                            file = c0428rM879h2.f771b;
                            strM597b2 = AbstractC0260i5.m597b2(jM874c2, c0428rM879h2.f770a);
                            if (strM597b2.length() > 0) {
                                throw new IllegalArgumentException(strM597b2);
                            }
                            long j = c0428rM879h2.f770a;
                            activity.runOnUiThread(new RunnableC0396p(classLoader, obj4, file3, file, j, AbstractC0260i5.m612f1(j, "elaris_" + str2), jM874c2, activity));
                            return;
                        }
                    }
                    strM597b2 = AbstractC0260i5.m597b2(jM874c2, c0428rM879h2.f770a);
                    if (strM597b2.length() > 0) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    file4 = file3;
                    if (file4 != null) {
                        file4.delete();
                    }
                    if (file != null) {
                        file.delete();
                    }
                    AbstractC0198e7.m343a("album-video-bubble", "prepare", th);
                    if (th instanceof FileNotFoundException) {
                        message = "无法读取所选视频，请重新选择";
                    } else {
                        message = th.getMessage();
                        if (message == null || message.trim().length() == 0) {
                            message = "视频无法处理";
                        }
                    }
                    AbstractC0444s.m880i(activity, message);
                    return;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                string = "";
                String extensionFromMimeType22 = MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
                if (string != null) {
                    strM512A = AbstractC0260i5.m512A(string.substring(iLastIndexOf + 1));
                }
                if (strM512A.length() == 0) {
                }
                if (strM512A.length() == 0) {
                }
                String str22 = Long.toHexString(System.currentTimeMillis()) + "_" + Long.toHexString(System.nanoTime());
                file3 = new File(file2, str22 + "." + strM512A);
                long jM874c22 = AbstractC0444s.m874c(contentResolver, uri, file3);
                C0428r c0428rM879h22 = AbstractC0444s.m879h(file3, new File(file2, str22 + ".jpg"));
                file = c0428rM879h22.f771b;
                break;
            case 1:
                C0193e2 c0193e2 = (C0193e2) obj;
                try {
                    C0209f2 c0209f2 = (C0209f2) obj3;
                    AbstractC0260i5.m589Z1(this.f618b, (Uri) obj2, (String) c0209f2.f247c, (String) c0209f2.f248d);
                    AbstractC0225g2.m427m(c0193e2, "已提交审核，通过后将出现在公开面板");
                    return;
                } catch (Throwable th4) {
                    AbstractC0225g2.m427m(c0193e2, AbstractC0225g2.m425k(th4));
                    return;
                }
            default:
                Context context = (Context) obj3;
                Activity activity2 = this.f618b;
                View view = (View) obj;
                C0419q6 c0419q6 = (C0419q6) obj2;
                String str3 = c0419q6.f739a;
                String str4 = c0419q6.f740b;
                String str5 = c0419q6.f741c;
                String str6 = c0419q6.f742d;
                try {
                    Dialog dialog = new Dialog(activity2, R.style.Theme.Translucent.NoTitleBar);
                    dialog.requestWindowFeature(1);
                    dialog.setCanceledOnTouchOutside(true);
                    dialog.setContentView(AbstractC0451s6.m921G0(activity2, AbstractC0451s6.m958i(activity2, dialog, context, view, str3, str4, str5, str6)));
                    dialog.setOnShowListener(new DialogInterfaceOnShowListenerC0261i6(dialog, 1));
                    dialog.show();
                    AbstractC0451s6.m954g(dialog);
                    HookEntry.log("group avatar menu show");
                    AbstractC0260i5.m579W0(str3, str4, "avatar-menu-show", str5);
                    return;
                } catch (Throwable th5) {
                    AbstractC0000a.m3d(th5, new StringBuilder("group avatar menu failed reason="), ": ");
                    AbstractC0260i5.m588Z0(str3, "avatar-menu-show", th5);
                    return;
                }
        }
    }

    public RunnableC0353o(Activity activity, ClassLoader classLoader, Object obj, Uri uri) {
        this.f618b = activity;
        this.f620d = classLoader;
        this.f621e = obj;
        this.f619c = uri;
    }

    public RunnableC0353o(Activity activity, Uri uri, C0209f2 c0209f2, C0193e2 c0193e2) {
        this.f618b = activity;
        this.f619c = uri;
        this.f620d = c0209f2;
        this.f621e = c0193e2;
    }
}
