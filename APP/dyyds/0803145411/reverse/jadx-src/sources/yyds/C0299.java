package yyds;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.app.CustomRecyclerView;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: yyds.ᛲᛲᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0299 implements InterfaceC2295, InterfaceC1749, InterfaceC0594 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f1573;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Object f1574;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1575;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f1576;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f1577;

    public C0299(Typeface typeface, C2308 c2308) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f1575 = 7;
        this.f1574 = typeface;
        this.f1577 = c2308;
        this.f1576 = new C1660(1024);
        int iM3645 = c2308.m3645(6);
        if (iM3645 != 0) {
            int i5 = iM3645 + c2308.f9365;
            i = ((ByteBuffer) c2308.f9366).getInt(((ByteBuffer) c2308.f9366).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f1573 = new char[i * 2];
        int iM36452 = c2308.m3645(6);
        if (iM36452 != 0) {
            int i6 = iM36452 + c2308.f9365;
            i2 = ((ByteBuffer) c2308.f9366).getInt(((ByteBuffer) c2308.f9366).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C0758 c0758 = new C0758(this, i7);
            C0960 c0960M1706 = c0758.m1706();
            int iM36453 = c0960M1706.m3645(4);
            Character.toChars(iM36453 != 0 ? ((ByteBuffer) c0960M1706.f9366).getInt(iM36453 + c0960M1706.f9365) : 0, (char[]) this.f1573, i7 * 2);
            C0960 c0960M17062 = c0758.m1706();
            int iM36454 = c0960M17062.m3645(16);
            if (iM36454 != 0) {
                int i8 = iM36454 + c0960M17062.f9365;
                i3 = ((ByteBuffer) c0960M17062.f9366).getInt(((ByteBuffer) c0960M17062.f9366).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                C0188.m798("invalid metadata codepoint length");
                throw null;
            }
            C1660 c1660 = (C1660) this.f1576;
            C0960 c0960M17063 = c0758.m1706();
            int iM36455 = c0960M17063.m3645(16);
            if (iM36455 != 0) {
                int i9 = iM36455 + c0960M17063.f9365;
                i4 = ((ByteBuffer) c0960M17063.f9366).getInt(((ByteBuffer) c0960M17063.f9366).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c1660.m3380(c0758, 0, i4 - 1);
        }
    }

    @Override // yyds.InterfaceC2295
    public InterfaceC1590 getSource() {
        return (C0363) this.f1576;
    }

    public String toString() {
        switch (this.f1575) {
            case 3:
                return ((Socket) this.f1577).toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public synchronized C0016 m945() {
        C0016 c0016M1419;
        c0016M1419 = (C0016) this.f1574;
        if (c0016M1419 == null) {
            c0016M1419 = C0016.m1419((File) this.f1573);
            this.f1574 = c0016M1419;
        }
        return c0016M1419;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean m946(AbstractC0451 abstractC0451, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1577).onActionItemClicked(m950(abstractC0451), new MenuItemC1806((Context) this.f1573, (InterfaceMenuItemC0339) menuItem));
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public synchronized ExecutorService m947() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = (ThreadPoolExecutor) this.f1577;
        if (threadPoolExecutor == null) {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryC1763(AbstractC0795.f3654 + " Dispatcher", false));
            this.f1577 = threadPoolExecutor2;
            threadPoolExecutor = threadPoolExecutor2;
        }
        return threadPoolExecutor;
    }

    @Override // yyds.InterfaceC0594
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void mo948(InterfaceC1410 interfaceC1410, C0644 c0644) {
        C1412 c1412;
        boolean z;
        String strM554 = ((C0119) this.f1577).m554(interfaceC1410);
        C2133 c2133 = (C2133) this.f1576;
        synchronized (c2133) {
            c1412 = (C1412) ((HashMap) c2133.f10555).get(strM554);
            if (c1412 == null) {
                C0362 c0362 = (C0362) c2133.f10553;
                synchronized (c0362.f1876) {
                    c1412 = (C1412) c0362.f1876.poll();
                }
                if (c1412 == null) {
                    c1412 = new C1412();
                }
                ((HashMap) c2133.f10555).put(strM554, c1412);
            }
            c1412.f6685++;
        }
        c1412.f6684.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM554 + " for for Key: " + interfaceC1410);
            }
            try {
                C0016 c0016M945 = m945();
                if (c0016M945.m1424(strM554) == null) {
                    C2115 c2115M1428 = c0016M945.m1428(strM554);
                    if (c2115M1428 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM554));
                    }
                    try {
                        if (((InterfaceC1081) c0644.f3099).mo443(c0644.f3102, c2115M1428.m4038(), (C0822) c0644.f3101)) {
                            ((C0016) c2115M1428.f10457).m1430(c2115M1428, true);
                            c2115M1428.f10454 = true;
                        }
                        if (!z) {
                            try {
                                c2115M1428.m4034();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!c2115M1428.f10454) {
                            try {
                                c2115M1428.m4034();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            ((C2133) this.f1576).m4065(strM554);
        }
    }

    @Override // yyds.InterfaceC0594
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public File mo949(InterfaceC1410 interfaceC1410) {
        String strM554 = ((C0119) this.f1577).m554(interfaceC1410);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM554 + " for for Key: " + interfaceC1410);
        }
        try {
            C0644 c0644M1424 = m945().m1424(strM554);
            if (c0644M1424 == null) {
                return null;
            }
            File[] fileArr = (File[]) c0644M1424.f3102;
            return fileArr != null ? fileArr[0] : new File(((C0016) c0644M1424.f3101).f2690, ((String) c0644M1424.f3099).concat(".0"));
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C1591 m950(AbstractC0451 abstractC0451) {
        ArrayList arrayList = (ArrayList) this.f1574;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1591 c1591 = (C1591) arrayList.get(i);
            if (c1591 != null && c1591.f8086 == abstractC0451) {
                return c1591;
            }
        }
        C1591 c15912 = new C1591((Context) this.f1573, abstractC0451);
        arrayList.add(c15912);
        return c15912;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean m951(AbstractC0451 abstractC0451, MenuC0836 menuC0836) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f1577;
        C1591 c1591M950 = m950(abstractC0451);
        C0988 c0988 = (C0988) this.f1576;
        Menu menuC1946 = (Menu) c0988.get(menuC0836);
        if (menuC1946 == null) {
            menuC1946 = new MenuC1946((Context) this.f1573, menuC0836);
            c0988.put(menuC0836, menuC1946);
        }
        return callback.onCreateActionMode(c1591M950, menuC1946);
    }

    @Override // yyds.InterfaceC2295
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public InterfaceC1979 mo952() {
        return (C1888) this.f1574;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void m953(C2729 c2729) {
        C0052 c0052;
        TimeZone timeZone = AbstractC0795.f3653;
        boolean zIsShutdown = m947().isShutdown();
        synchronized (this) {
            try {
                if (!((ArrayDeque) this.f1574).remove(c2729)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
                if (zIsShutdown || ((ArrayDeque) this.f1576).isEmpty()) {
                    ((ArrayDeque) this.f1574).isEmpty();
                }
                int i = 17;
                if (zIsShutdown) {
                    List listM3269 = AbstractC1595.m3269((ArrayDeque) this.f1573);
                    ((ArrayDeque) this.f1573).clear();
                    c0052 = new C0052(i, listM3269);
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((ArrayDeque) this.f1573).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        if (((ArrayDeque) this.f1576).size() < 64) {
                            throw null;
                        }
                    }
                    c0052 = new C0052(i, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((List) c0052.f551).size() > 0) {
            if (((List) c0052.f551).get(0) != null) {
                C0188.m794();
            } else {
                if (zIsShutdown) {
                    throw null;
                }
                m947();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C0989 m954() {
        C1449 c1449;
        C0052 c0052 = (C0052) this.f1577;
        if (c0052 == null || (c1449 = (C1449) this.f1573) == null) {
            C1312 c1312 = C1312.f5998;
            if (c0052 == null) {
                c1312.getClass();
                c0052 = new C0052(0);
                this.f1577 = c0052;
            }
            C1449 c14492 = (C1449) this.f1573;
            if (c14492 == null) {
                c1449 = c1312.f5999;
                this.f1573 = c1449;
            } else {
                c1449 = c14492;
            }
        }
        return new C0989(c0052, c1449, (EnumSet) this.f1576, (ArrayList) this.f1574);
    }

    public C0299(Socket socket) {
        this.f1575 = 3;
        this.f1577 = socket;
        this.f1573 = new AtomicInteger();
        this.f1576 = new C0363(this);
        this.f1574 = new C1888(this);
    }

    public C0299(ArrayList arrayList, C1889 c1889, C2267 c2267, ContentResolver contentResolver) {
        this.f1575 = 0;
        this.f1577 = c1889;
        this.f1573 = c2267;
        this.f1576 = contentResolver;
        this.f1574 = arrayList;
    }

    public C0299(LinearLayout linearLayout, Button button, Button button2, Button button3, ImageView imageView, CustomRecyclerView customRecyclerView, TextView textView) {
        this.f1575 = 4;
        this.f1577 = button;
        this.f1573 = button2;
        this.f1576 = button3;
        this.f1574 = textView;
    }

    public C0299(int i) {
        this.f1575 = i;
        switch (i) {
            case 2:
                break;
            case 6:
                this.f1573 = new ArrayDeque();
                this.f1576 = new ArrayDeque();
                this.f1574 = new ArrayDeque();
                break;
            default:
                this.f1577 = new ReentrantReadWriteLock();
                this.f1576 = new HashMap();
                break;
        }
    }

    public C0299(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.f1575 = 8;
        this.f1577 = linearLayout2;
        this.f1573 = linearLayout3;
        this.f1576 = linearLayout4;
        this.f1574 = linearLayout5;
    }

    public C0299(File file) {
        this.f1575 = 5;
        this.f1576 = new C2133(19);
        this.f1573 = file;
        this.f1577 = new C0119(7);
    }

    public C0299(Context context, ActionMode.Callback callback) {
        this.f1575 = 9;
        this.f1573 = context;
        this.f1577 = callback;
        this.f1574 = new ArrayList();
        this.f1576 = new C0988(0);
    }
}
