package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: k */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0289k implements InterfaceC0032c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f476a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.mr.elaris.w.S():int, g2.i(java.lang.ClassLoader):void, s.g(java.lang.ClassLoader):void] */
    public /* synthetic */ C0289k(int i) {
        this.f476a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0032c
    public final void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Uri data;
        boolean zM253L;
        Object obj = null;
        switch (this.f476a) {
            case 0:
                synchronized (AbstractC0444s.class) {
                    if (AbstractC0444s.f814h) {
                        AbstractC0444s.f814h = false;
                        WeakReference weakReference = AbstractC0444s.f810d;
                        AbstractC0444s.f810d = new WeakReference(null);
                        if (weakReference != null) {
                            obj = weakReference.get();
                            break;
                        }
                    }
                }
                if (obj == null) {
                    HookEntry.log("album video bubble duplicate picker result ignored");
                    return;
                }
                if (i2 != -1 || intent == null || intent.getData() == null) {
                    return;
                }
                Uri data2 = intent.getData();
                if (activity != null && data2 != null && (intent.getFlags() & 1) != 0) {
                    try {
                        activity.getContentResolver().takePersistableUriPermission(data2, 1);
                        HookEntry.log("album video bubble document uri permission retained");
                        break;
                    } catch (SecurityException unused) {
                    }
                }
                ClassLoader classLoader = AbstractC0444s.f811e;
                if (activity == null || classLoader == null) {
                    return;
                }
                Thread thread = new Thread(new RunnableC0353o(activity, classLoader, obj, data2), "Elaris-video-bubble-send");
                thread.setDaemon(true);
                thread.start();
                return;
            case 1:
                C0209f2 c0209f2 = AbstractC0225g2.f298h;
                AbstractC0225g2.f298h = null;
                if (c0209f2 == null || i2 != -1 || intent == null || (data = intent.getData()) == null) {
                    return;
                }
                Activity activity2 = (Activity) ((WeakReference) c0209f2.f245a).get();
                C0193e2 c0193e2 = (C0193e2) ((WeakReference) c0209f2.f246b).get();
                if (activity2 == null || c0193e2 == null) {
                    return;
                }
                c0193e2.f220g.setText("正在上传待审核表情");
                AbstractC0225g2.f293c.execute(new RunnableC0353o(activity2, data, c0209f2, c0193e2));
                return;
            default:
                if (i2 != -1 || intent == null) {
                    AbstractC0169w.f178r = null;
                    return;
                }
                C0540y c0540y = AbstractC0169w.f178r;
                AbstractC0169w.f178r = null;
                if (activity == null || c0540y == null) {
                    return;
                }
                Uri data3 = intent.getData();
                if (data3 == null) {
                    AbstractC0169w.m276W0(activity, "目录授权失败");
                    return;
                }
                int flags = intent.getFlags();
                if ((flags & 1) != 0) {
                    try {
                        try {
                            if ((flags & 2) != 0) {
                                activity.getContentResolver().takePersistableUriPermission(data3, 3);
                            } else {
                                activity.getContentResolver().takePersistableUriPermission(data3, 1);
                            }
                        } catch (Throwable unused2) {
                            activity.getContentResolver().takePersistableUriPermission(data3, 1);
                        }
                    } catch (Throwable th) {
                        AbstractC0198e7.m343a("voice-message", "persist-tree-permission", th);
                    }
                    zM253L = AbstractC0169w.m253L(activity, data3);
                    break;
                } else {
                    zM253L = false;
                }
                if (!zM253L) {
                    HookEntry.logAlways("local voice tree grant was not persisted uri=".concat(AbstractC0169w.m242F0(data3.toString())));
                    AbstractC0169w.m276W0(activity, "目录授权未保存，请重新选择系统允许授权的目录");
                    return;
                }
                try {
                    Context applicationContext = activity.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = activity;
                    }
                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(data3, DocumentsContract.getTreeDocumentId(data3));
                    String strM311n0 = AbstractC0169w.m311n0(applicationContext, uriBuildDocumentUriUsingTree);
                    if (strM311n0.length() == 0) {
                        strM311n0 = "授权目录";
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(strM311n0);
                    applicationContext.getSharedPreferences("elaris_local_voice_state", 0).edit().putString("tree_uri", data3.toString()).putString("tree_doc_uri", uriBuildDocumentUriUsingTree.toString()).putString("tree_parent_docs", "").putString("tree_segments", AbstractC0169w.m293e0(arrayList)).apply();
                    break;
                } catch (Throwable unused3) {
                }
                HookEntry.logAlways("local voice entry tree granted uri=".concat(AbstractC0169w.m242F0(data3.toString())));
                AbstractC0169w.m276W0(activity, "已授权目录");
                AbstractC0169w.m260O0(activity, (ClassLoader) c0540y.f1082b, (C0410pd) c0540y.f1081a);
                return;
        }
    }
}
