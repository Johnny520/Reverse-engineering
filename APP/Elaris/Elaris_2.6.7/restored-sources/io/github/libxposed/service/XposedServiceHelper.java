package io.github.libxposed.service;

import android.os.IBinder;
import android.util.Log;
import io.github.libxposed.service.IXposedService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.C0571ze;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class XposedServiceHelper {
    private static final String TAG = "XposedServiceHelper";
    private static final Set<XposedService> mCache = new HashSet();
    private static OnServiceListener mListener = null;

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public interface OnServiceListener {
        void onServiceBind(XposedService xposedService);

        void onServiceDied(XposedService xposedService);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onBinderReceived$0(XposedService xposedService) {
        mListener.onServiceDied(xposedService);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerListener$1(XposedService xposedService) {
        mListener.onServiceDied(xposedService);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    public static void onBinderReceived(IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        Set<XposedService> set = mCache;
        synchronized (set) {
            try {
                XposedService xposedService = new XposedService(IXposedService.Stub.asInterface(iBinder));
                if (mListener == null) {
                    set.add(xposedService);
                } else {
                    iBinder.linkToDeath(new C0571ze(xposedService, 1), 0);
                    mListener.onServiceBind(xposedService);
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void registerListener(OnServiceListener onServiceListener) {
        Set<XposedService> set = mCache;
        synchronized (set) {
            try {
                mListener = onServiceListener;
                if (!set.isEmpty()) {
                    Iterator<XposedService> it = set.iterator();
                    while (it.hasNext()) {
                        try {
                            XposedService next = it.next();
                            next.asInterface().asBinder().linkToDeath(new C0571ze(next, 0), 0);
                            mListener.onServiceBind(next);
                        } catch (Throwable th) {
                            Log.e(TAG, "registerListener", th);
                            it.remove();
                        }
                    }
                    mCache.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
