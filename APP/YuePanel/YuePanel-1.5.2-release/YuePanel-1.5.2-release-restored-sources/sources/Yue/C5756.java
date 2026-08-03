package Yue;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5756 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f14276 = "LocalBroadcastManager";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f14277 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f14278 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Object f14279 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static C5756 f14280;

    /* JADX INFO: renamed from: ۥ */
    public final Context f1658;

    /* JADX INFO: renamed from: ۥ۟ */
    public final HashMap<BroadcastReceiver, ArrayList<C5757>> f1659 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final HashMap<String, ArrayList<C5757>> f14281 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final ArrayList<C0864> f14282 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Handler f14283;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۤۢ$ۥ */
    public class HandlerC0863 extends Handler {
        public HandlerC0863(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C5756.this.m2438();
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۤۢ$ۥ۟ */
    public static final class C0864 {

        /* JADX INFO: renamed from: ۥ */
        public final Intent f1661;

        /* JADX INFO: renamed from: ۥ۟ */
        public final ArrayList<C5757> f1662;

        public C0864(Intent intent, ArrayList<C5757> arrayList) {
            this.f1661 = intent;
            this.f1662 = arrayList;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۤۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5757 {

        /* JADX INFO: renamed from: ۥ */
        public final IntentFilter f1663;

        /* JADX INFO: renamed from: ۥ۟ */
        public final BroadcastReceiver f1664;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f14284;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f14285;

        public C5757(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f1663 = intentFilter;
            this.f1664 = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f1664);
            sb.append(" filter=");
            sb.append(this.f1663);
            if (this.f14285) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C5756(Context context) {
        this.f1658 = context;
        this.f14283 = new HandlerC0863(context.getMainLooper());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C5756 m2437(@InterfaceC6391 Context context) {
        C5756 c5756;
        synchronized (f14279) {
            try {
                if (f14280 == null) {
                    f14280 = new C5756(context.getApplicationContext());
                }
                c5756 = f14280;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5756;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m2438() {
        int size;
        C0864[] c0864Arr;
        while (true) {
            synchronized (this.f1659) {
                try {
                    size = this.f14282.size();
                    if (size <= 0) {
                        return;
                    }
                    c0864Arr = new C0864[size];
                    this.f14282.toArray(c0864Arr);
                    this.f14282.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                C0864 c0864 = c0864Arr[i];
                int size2 = c0864.f1662.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C5757 c5757 = c0864.f1662.get(i2);
                    if (!c5757.f14285) {
                        c5757.f1664.onReceive(this.f1658, c0864.f1661);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m17857(@InterfaceC6391 BroadcastReceiver broadcastReceiver, @InterfaceC6391 IntentFilter intentFilter) {
        synchronized (this.f1659) {
            try {
                C5757 c5757 = new C5757(intentFilter, broadcastReceiver);
                ArrayList<C5757> arrayList = this.f1659.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f1659.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c5757);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList<C5757> arrayList2 = this.f14281.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f14281.put(action, arrayList2);
                    }
                    arrayList2.add(c5757);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m17858(@InterfaceC6391 Intent intent) {
        int i;
        String str;
        ArrayList arrayList;
        ArrayList<C5757> arrayList2;
        String str2;
        synchronized (this.f1659) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f1658.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    Log.v(f14276, "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<C5757> arrayList3 = this.f14281.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z) {
                        Log.v(f14276, "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i2 = 0;
                    while (i2 < arrayList3.size()) {
                        C5757 c5757 = arrayList3.get(i2);
                        if (z) {
                            Log.v(f14276, "Matching against filter " + c5757.f1663);
                        }
                        if (c5757.f14284) {
                            if (z) {
                                Log.v(f14276, "  Filter's target already added");
                            }
                            i = i2;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = strResolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i = i2;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = strResolveTypeIfNeeded;
                            int iMatch = c5757.f1663.match(action, strResolveTypeIfNeeded, scheme, data, categories, f14276);
                            if (iMatch >= 0) {
                                if (z) {
                                    Log.v(f14276, "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(c5757);
                                c5757.f14284 = true;
                                i2 = i + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                strResolveTypeIfNeeded = str2;
                            } else if (z) {
                                Log.v(f14276, "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                            }
                        }
                        arrayList4 = arrayList;
                        i2 = i + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        strResolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                            ((C5757) arrayList5.get(i3)).f14284 = false;
                        }
                        this.f14282.add(new C0864(intent, arrayList5));
                        if (!this.f14283.hasMessages(1)) {
                            this.f14283.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m17859(@InterfaceC6391 Intent intent) {
        if (m17858(intent)) {
            m2438();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m17860(@InterfaceC6391 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f1659) {
            try {
                ArrayList<C5757> arrayListRemove = this.f1659.remove(broadcastReceiver);
                if (arrayListRemove == null) {
                    return;
                }
                for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                    C5757 c5757 = arrayListRemove.get(size);
                    c5757.f14285 = true;
                    for (int i = 0; i < c5757.f1663.countActions(); i++) {
                        String action = c5757.f1663.getAction(i);
                        ArrayList<C5757> arrayList = this.f14281.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C5757 c57572 = arrayList.get(size2);
                                if (c57572.f1664 == broadcastReceiver) {
                                    c57572.f14285 = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f14281.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
