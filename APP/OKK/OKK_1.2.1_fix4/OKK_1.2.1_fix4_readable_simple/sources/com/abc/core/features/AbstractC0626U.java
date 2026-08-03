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
    public static final ConcurrentHashMap f1936a = null;

    static {
        f1936a = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m1528a(Bitmap r11, boolean r12, boolean r13) {
        if (r12 == false) goto L4;
        int r02 = r11.getWidth();
    L5:
        ArrayList r1 = new ArrayList();
        int r2 = r02 - 1;
        int r5 = 1;
        int r6 = -1;
    L6:
        if (r5 >= r2) goto L32;
        boolean r7 = false;
        if (r12 == false) goto L11;
        if (r13 == false) goto L11;
        int r8 = r11.getPixel(r5, r11.getHeight() - 1);
    L17:
        if (Color.alpha(r8) == 255) goto L19;
    L25:
        if (r7 == false) goto L28;
        if (r6 != (-1)) goto L28;
        r6 = r5 - 1;
    L31:
        r5 = r5 + 1;
    L28:
        if (r7 == true) goto L31;
        if (r6 == (-1)) goto L31;
        r1.add(new C0624T(r6, r5 - 1));
        r6 = -1;
        goto L31
    L19:
        if (Color.red(r8) != 0) goto L25;
        if (Color.green(r8) != 0) goto L25;
        if (Color.blue(r8) != 0) goto L25;
        r7 = true;
    L11:
        if (r12 == false) goto L13;
        r8 = r11.getPixel(r5, 0);
        goto L17
    L13:
        if (r13 == false) goto L15;
        r8 = r11.getPixel(r11.getWidth() - 1, r5);
        goto L17
    L15:
        r8 = r11.getPixel(0, r5);
        goto L17
    L32:
        if (r6 == (-1)) goto L34;
        r1.add(new C0624T(r6, r02 - 2));
    L34:
        return r1;
    L4:
        r02 = r11.getHeight();
        goto L5
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m1529b(Bitmap r8) {
        int r1 = 0;
        ArrayList r2 = m1528a(r8, true, false);
        ArrayList r3 = m1528a(r8, false, false);
        if (r2.isEmpty() == false) goto L5;
        return null;
    L5:
        if (r3.isEmpty() == true) goto L28;
        Rect r82 = m1531d(r8);
        ByteBuffer r4 = ByteBuffer.allocate(((r3.size() + r2.size()) * 8) + 68);
        r4.order(ByteOrder.nativeOrder());
        r4.put((byte) 1);
        r4.put((byte) (r2.size() * 2));
        r4.put((byte) (r3.size() * 2));
        r4.put((byte) 9);
        int r7 = 0;
    L8:
        if (r7 >= 2) goto L10;
        r4.putInt(0);
        r7 = r7 + 1;
        goto L8
    L10:
        r4.putInt(r82.left);
        r4.putInt(r82.right);
        r4.putInt(r82.top);
        r4.putInt(r82.bottom);
        r4.putInt(0);
        Iterator r83 = r2.iterator();
    L12:
        if (r83.hasNext() == false) goto L14;
        C0624T r22 = (C0624T) r83.next();
        r4.putInt(r22.f1923a);
        r4.putInt(r22.f1924b);
        goto L12
    L14:
        Iterator r84 = r3.iterator();
    L16:
        if (r84.hasNext() == false) goto L18;
        C0624T r23 = (C0624T) r84.next();
        r4.putInt(r23.f1923a);
        r4.putInt(r23.f1924b);
    L18:
        if (r1 >= 9) goto L21;
        r4.putInt(1);
        r1 = r1 + 1;
        goto L18
    L21:
        return r4.array();
    L28:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m1530c(String r8) {
        ConcurrentHashMap r02 = f1936a;
        Set r1 = r02.keySet();
        AbstractC0307g.m702d(r1, "<get-keys>(...)");
        ArrayList r2 = new ArrayList();
        Iterator r12 = r1.iterator();
    L4:
        if (r12.hasNext() == false) goto L10;
        Object r3 = r12.next();
        String r4 = (String) r3;
        AbstractC0307g.m700b(r4);
        if (AbstractC0425j.m1005J0(r4, r8, false) == true) goto L9;
        String r6 = new File(r8).getName();
        AbstractC0307g.m702d(r6, "getName(...)");
        if (AbstractC0425j.m1005J0(r4, r6, false) == false) goto L4;
    L9:
        r2.add(r3);
        goto L4
    L10:
        Iterator r82 = r2.iterator();
    L12:
        if (r82.hasNext() == false) goto L14;
        r02.remove((String) r82.next());
        goto L12
    }

    /* JADX INFO: renamed from: d */
    public static Rect m1531d(Bitmap r7) {
        C0624T r1 = (C0624T) AbstractC0181l.m544p0(m1528a(r7, true, true));
        int r2 = 0;
        C0624T r02 = (C0624T) AbstractC0181l.m544p0(m1528a(r7, false, true));
        if (r1 == null) goto L22;
        if (r02 == null) goto L22;
        int r3 = r7.getWidth() - 2;
        int r72 = r7.getHeight() - 2;
        int r5 = r1.f1923a;
        if (r5 >= 0) goto L9;
        r5 = 0;
    L9:
        int r6 = r02.f1923a;
        if (r6 >= 0) goto L12;
        r6 = 0;
    L12:
        int r32 = r3 - r1.f1924b;
        if (r32 >= 0) goto L15;
        r32 = 0;
    L15:
        int r73 = r72 - r02.f1924b;
        if (r73 < 0) goto L20;
        r2 = r73;
    L20:
        return new Rect(r5, r6, r32, r2);
    L22:
        return new Rect();
    }

    /* JADX INFO: renamed from: e */
    public static C0618Q m1532e(Context r10, String r11, boolean r12) {
        File r2 = m1533f(r12);
        ConcurrentHashMap r3 = f1936a;
        if (r2 == null) goto L5;
        C0622S r112 = (C0622S) r3.computeIfAbsent("file:" + r2.getAbsolutePath() + ":" + r2.lastModified(), new C0612O(new SettingsEntryHook(1, r2), 0));
    L11:
        if (r112 != null) goto L13;
        return null;
    L13:
        C0422g r02 = AbstractC0600K.f1833a;
        float r03 = r10.getResources().getDisplayMetrics().density;
        Rect r1 = r112.f1920c;
        AbstractC0307g.m703e(r1, "padding");
        int r22 = r1.left;
        if (r22 == 0) goto L16;
    L26:
        int r122 = r1.top;
        int r04 = r1.right;
        int r13 = r1.bottom;
        Rect r32 = new Rect();
        r32.left = r22;
        r32.top = r122;
        r32.right = r04;
        r32.bottom = r13;
        Rect r123 = r32;
    L28:
        return new C0618Q(new NinePatchDrawable(r10.getResources(), r112.f1918a, r112.f1919b, new Rect(r123), null), r123);
    L16:
        if (r1.top != 0) goto L26;
        if (r1.right != 0) goto L26;
        if (r1.bottom != 0) goto L26;
        int r14 = AbstractC0040p.m87P(17.5f * r03);
        int r23 = AbstractC0040p.m87P(12.5f * r03);
        int r05 = AbstractC0040p.m87P(8.0f * r03);
        if (r12 == false) goto L25;
        r123 = new Rect();
        r123.left = r14;
        r123.top = r05;
        r123.right = r23;
        r123.bottom = r05;
        goto L28
    L25:
        r123 = new Rect();
        r123.left = r23;
        r123.top = r05;
        r123.right = r14;
        r123.bottom = r05;
        goto L28
    L5:
        if (r11 != null) goto L7;
        return null;
    L7:
        if (r12 == false) goto L9;
        String r24 = "right_bubble.9.png";
    L10:
        r112 = (C0622S) r3.computeIfAbsent("asset:" + r11 + ":" + r24, new C0612O(new C0615P(0, r11, r24), 1));
        goto L11
    L9:
        r24 = "left_bubble.9.png";
        goto L10
    }

    /* JADX INFO: renamed from: f */
    public static File m1533f(boolean r11) {
        ConfigStore r02 = ConfigStore.f2048a;
        if (r11 == false) goto L5;
        String r03 = "bubble_path_right";
    L6:
        String r04 = ConfigStore.m1662d(r03, "");
        if ((!AbstractC0425j.m1013R0(r04)) == false) goto L13;
        File r1 = new File(r04);
        if (r1.isFile() == false) goto L13;
        if (r1.length() <= 0) goto L13;
        return r1;
    L13:
        File r05 = new File("/storage/emulated/0/Android/media/com.tencent.mm/OKK");
        Object r4 = null;
        if (r05.isDirectory() == true) goto L16;
        return null;
    L16:
        if (r11 == false) goto L18;
        List r112 = AbstractC0182m.m556h0(new String[]{"right.9.png", "righ.9.png", "right.png", "righ.png", "right", "righ"});
    L19:
        ArrayList r12 = new ArrayList(AbstractC0183n.m559k0(r112, 10));
        Iterator r113 = r112.iterator();
    L21:
        if (r113.hasNext() == false) goto L23;
        r12.add(new File(r05, (String) r113.next()));
        goto L21
    L23:
        Iterator r114 = r12.iterator();
    L25:
        if (r114.hasNext() == false) goto L32;
        Object r06 = r114.next();
        File r13 = (File) r06;
        if (r13.isFile() == false) goto L25;
        if (r13.length() <= 0) goto L25;
        r4 = r06;
    L32:
        return (File) r4;
    L18:
        r112 = AbstractC0182m.m556h0(new String[]{"left.9.png", "left.png", "left"});
        goto L19
    L5:
        r03 = "bubble_path_left";
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public static String m1534g(String r4, boolean r5) {
        File r02 = m1533f(r5);
        if (r02 != null) goto L5;
        if (r5 == false) goto L8;
        String r52 = "right_bubble.9.png";
    L9:
        if (r4 != null) goto L12;
        r4 = "";
    L12:
        return "asset:" + r4 + ":" + r52;
    L8:
        r52 = "left_bubble.9.png";
        goto L9
    L5:
        return "file:" + r02.getAbsolutePath() + ":" + r02.lastModified();
    }
}
