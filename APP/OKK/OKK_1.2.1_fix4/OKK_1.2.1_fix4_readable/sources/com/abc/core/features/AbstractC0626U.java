package com.abc.core.features;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p001A0.AbstractC0040p;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p042W0.C0422g;

/* JADX INFO: renamed from: c0.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0626U {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f1936a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static ArrayList m1528a(Bitmap bitmap, boolean z2, boolean z3) {
        int width = z2 ? bitmap.getWidth() : bitmap.getHeight();
        ArrayList arrayList = new ArrayList();
        int i2 = width - 1;
        int i3 = -1;
        for (int i4 = 1; i4 < i2; i4++) {
            boolean z4 = false;
            int pixel = (z2 && z3) ? bitmap.getPixel(i4, bitmap.getHeight() - 1) : z2 ? bitmap.getPixel(i4, 0) : z3 ? bitmap.getPixel(bitmap.getWidth() - 1, i4) : bitmap.getPixel(0, i4);
            if (Color.alpha(pixel) == 255 && Color.red(pixel) == 0 && Color.green(pixel) == 0 && Color.blue(pixel) == 0) {
                z4 = true;
            }
            if (z4 && i3 == -1) {
                i3 = i4 - 1;
            } else if (!z4 && i3 != -1) {
                arrayList.add(new C0624T(i3, i4 - 1));
                i3 = -1;
            }
        }
        if (i3 != -1) {
            arrayList.add(new C0624T(i3, width - 2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1529b(Bitmap bitmap) {
        ArrayList<C0624T> arrayListM1528a = m1528a(bitmap, true, false);
        ArrayList<C0624T> arrayListM1528a2 = m1528a(bitmap, false, false);
        if (arrayListM1528a.isEmpty() || arrayListM1528a2.isEmpty()) {
            return null;
        }
        Rect rectM1531d = m1531d(bitmap);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((arrayListM1528a2.size() + arrayListM1528a.size()) * 8) + 68);
        byteBufferAllocate.order(ByteOrder.nativeOrder());
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) (arrayListM1528a.size() * 2));
        byteBufferAllocate.put((byte) (arrayListM1528a2.size() * 2));
        byteBufferAllocate.put((byte) 9);
        for (int i2 = 0; i2 < 2; i2++) {
            byteBufferAllocate.putInt(0);
        }
        byteBufferAllocate.putInt(rectM1531d.left);
        byteBufferAllocate.putInt(rectM1531d.right);
        byteBufferAllocate.putInt(rectM1531d.top);
        byteBufferAllocate.putInt(rectM1531d.bottom);
        byteBufferAllocate.putInt(0);
        for (C0624T c0624t : arrayListM1528a) {
            byteBufferAllocate.putInt(c0624t.f1923a);
            byteBufferAllocate.putInt(c0624t.f1924b);
        }
        for (C0624T c0624t2 : arrayListM1528a2) {
            byteBufferAllocate.putInt(c0624t2.f1923a);
            byteBufferAllocate.putInt(c0624t2.f1924b);
        }
        for (int i3 = 0; i3 < 9; i3++) {
            byteBufferAllocate.putInt(1);
        }
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: c */
    public static void m1530c(String str) {
        ConcurrentHashMap concurrentHashMap = f1936a;
        Set setKeySet = concurrentHashMap.keySet();
        AbstractC0307g.m702d(setKeySet, "<get-keys>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str2 = (String) obj;
            AbstractC0307g.m700b(str2);
            if (!AbstractC0425j.m1005J0(str2, str, false)) {
                String name = new File(str).getName();
                AbstractC0307g.m702d(name, "getName(...)");
                if (AbstractC0425j.m1005J0(str2, name, false)) {
                }
            }
            arrayList.add(obj);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove((String) it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public static Rect m1531d(Bitmap bitmap) {
        C0624T c0624t = (C0624T) AbstractC0181l.m544p0(m1528a(bitmap, true, true));
        C0624T c0624t2 = (C0624T) AbstractC0181l.m544p0(m1528a(bitmap, false, true));
        if (c0624t == null || c0624t2 == null) {
            return new Rect();
        }
        int width = bitmap.getWidth() - 2;
        int height = bitmap.getHeight() - 2;
        int i2 = c0624t.f1923a;
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = c0624t2.f1923a;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = width - c0624t.f1924b;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = height - c0624t2.f1924b;
        return new Rect(i2, i3, i4, i5 >= 0 ? i5 : 0);
    }

    /* JADX INFO: renamed from: e */
    public static C0618Q m1532e(Context context, String str, boolean z2) {
        C0622S c0622s;
        Rect rect;
        File fileM1533f = m1533f(z2);
        ConcurrentHashMap concurrentHashMap = f1936a;
        if (fileM1533f != null) {
            c0622s = (C0622S) concurrentHashMap.computeIfAbsent("file:" + fileM1533f.getAbsolutePath() + ":" + fileM1533f.lastModified(), new C0612O(new SettingsEntryHook(1, fileM1533f), 0));
        } else {
            if (str == null) {
                return null;
            }
            String str2 = z2 ? "right_bubble.9.png" : "left_bubble.9.png";
            c0622s = (C0622S) concurrentHashMap.computeIfAbsent("asset:" + str + ":" + str2, new C0612O(new C0615P(0, str, str2), 1));
        }
        if (c0622s == null) {
            return null;
        }
        C0422g c0422g = AbstractC0600K.f1833a;
        float f2 = context.getResources().getDisplayMetrics().density;
        Rect rect2 = c0622s.f1920c;
        AbstractC0307g.m703e(rect2, "padding");
        int i2 = rect2.left;
        if (i2 == 0 && rect2.top == 0 && rect2.right == 0 && rect2.bottom == 0) {
            int iM87P = AbstractC0040p.m87P(17.5f * f2);
            int iM87P2 = AbstractC0040p.m87P(12.5f * f2);
            int iM87P3 = AbstractC0040p.m87P(8.0f * f2);
            if (z2) {
                rect = new Rect();
                rect.left = iM87P;
                rect.top = iM87P3;
                rect.right = iM87P2;
                rect.bottom = iM87P3;
            } else {
                rect = new Rect();
                rect.left = iM87P2;
                rect.top = iM87P3;
                rect.right = iM87P;
                rect.bottom = iM87P3;
            }
        } else {
            int i3 = rect2.top;
            int i4 = rect2.right;
            int i5 = rect2.bottom;
            Rect rect3 = new Rect();
            rect3.left = i2;
            rect3.top = i3;
            rect3.right = i4;
            rect3.bottom = i5;
            rect = rect3;
        }
        return new C0618Q(new NinePatchDrawable(context.getResources(), c0622s.f1918a, c0622s.f1919b, new Rect(rect), null), rect);
    }

    /* JADX INFO: renamed from: f */
    public static File m1533f(boolean z2) {
        ConfigStore configStore = ConfigStore.f2048a;
        String strM1662d = ConfigStore.m1662d(z2 ? "bubble_path_right" : "bubble_path_left", "");
        if (!AbstractC0425j.m1013R0(strM1662d)) {
            File file = new File(strM1662d);
            if (file.isFile() && file.length() > 0) {
                return file;
            }
        }
        File file2 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK");
        Object obj = null;
        if (!file2.isDirectory()) {
            return null;
        }
        List listM556h0 = z2 ? AbstractC0182m.m556h0("right.9.png", "righ.9.png", "right.png", "righ.png", "right", "righ") : AbstractC0182m.m556h0("left.9.png", "left.png", "left");
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(listM556h0, 10));
        Iterator it = listM556h0.iterator();
        while (it.hasNext()) {
            arrayList.add(new File(file2, (String) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            File file3 = (File) next;
            if (file3.isFile() && file3.length() > 0) {
                obj = next;
                break;
            }
        }
        return (File) obj;
    }

    /* JADX INFO: renamed from: g */
    public static String m1534g(String str, boolean z2) {
        File fileM1533f = m1533f(z2);
        if (fileM1533f != null) {
            return "file:" + fileM1533f.getAbsolutePath() + ":" + fileM1533f.lastModified();
        }
        String str2 = z2 ? "right_bubble.9.png" : "left_bubble.9.png";
        if (str == null) {
            str = "";
        }
        return "asset:" + str + ":" + str2;
    }
}
