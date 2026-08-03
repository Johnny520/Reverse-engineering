package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C1274a;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* JADX INFO: renamed from: te */
/* JADX INFO: loaded from: classes.dex */
public final class C2543te {

    /* JADX INFO: renamed from: f */
    public static final C2601ut f8847f = null;

    /* JADX INFO: renamed from: g */
    public static final C2601ut f8848g = null;

    /* JADX INFO: renamed from: h */
    public static final C2601ut f8849h = null;

    /* JADX INFO: renamed from: i */
    public static final C2601ut f8850i = null;

    /* JADX INFO: renamed from: j */
    public static final C2220m6 f8851j = null;

    /* JADX INFO: renamed from: k */
    public static final ArrayDeque f8852k = null;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0565N5 f8853a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f8854b;

    /* JADX INFO: renamed from: c */
    public final C2812zp f8855c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f8856d;

    /* JADX INFO: renamed from: e */
    public final C2377pk f8857e;

    static {
        f8847f = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC0191Ec.f578c);
        f8848g = new C2601ut("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C2601ut.f8986e);
        C2457re r0 = C2457re.f8656b;
        Boolean r02 = Boolean.FALSE;
        f8849h = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", r02);
        f8850i = C2601ut.m5116a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", r02);
        Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
        f8851j = new C2220m6(14);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] r03 = AbstractC2622vD.f9104a;
        f8852k = new ArrayDeque(0);
    }

    public C2543te(ArrayList r2, DisplayMetrics r3, InterfaceC0565N5 r4, C2812zp r5) {
        this.f8857e = C2377pk.m4818a();
        this.f8856d = r2;
        AbstractC0714Qj.m1488j("Argument must not be null", r3);
        this.f8854b = r3;
        AbstractC0714Qj.m1488j("Argument must not be null", r4);
        this.f8853a = r4;
        AbstractC0714Qj.m1488j("Argument must not be null", r5);
        this.f8855c = r5;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m5020c(C2656w4 r4, BitmapFactory.Options r5, InterfaceC2500se r6, InterfaceC0565N5 r7) {
        if (r5.inJustDecodeBounds == true) goto L15;
        r6.mo639f();
        switch(r4.f9195a) {
            case 15: goto L15;
            case 16: goto L7;
            default: goto L15;
        };
    L7:
        C1340dv r0 = (C1340dv) ((C0132D2) r4.f9196b).f328b;
        monitor-enter(r0);
        r0.f4827c = r0.f4825a.length;     // Catch: Throwable -> L12
        monitor-exit(r0);
    L12:
        th = move-exception;
        throw th;
    L15:
        int r02 = r5.outWidth;
        int r1 = r5.outHeight;
        String r2 = r5.outMimeType;
        Lock r3 = AbstractC0184EB.f548d;
        r3.lock();
        Bitmap r42 = r4.m5206k(r5);     // Catch: IllegalArgumentException -> L19 Throwable -> L27
        r3.unlock();
        return r42;
    L19:
        e = move-exception;
        IOException r03 = m5022e(e, r02, r1, r2, r5);     // Catch: Throwable -> L27
        Bitmap r12 = r5.inBitmap;     // Catch: Throwable -> L27
        if (r12 != null) goto L34;
        throw r03;     // Catch: Throwable -> L27
    L34:
        r7.mo53h(r12);     // Catch: IOException -> L25 Throwable -> L27
        r5.inBitmap = null;     // Catch: IOException -> L25 Throwable -> L27
        Bitmap r43 = m5020c(r4, r5, r6, r7);     // Catch: IOException -> L25 Throwable -> L27
        AbstractC0184EB.f548d.unlock();
        return r43;
    L36:
        throw r03;     // Catch: Throwable -> L27
    L25:
        throw r03;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        AbstractC0184EB.f548d.unlock();
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public static String m5021d(Bitmap r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        return "[" + r3.getWidth() + "x" + r3.getHeight() + "] " + r3.getConfig() + (" (" + r3.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: e */
    public static IOException m5022e(IllegalArgumentException r3, int r4, int r5, String r6, BitmapFactory.Options r7) {
        return new IOException("Exception decoding bitmap, outWidth: " + r4 + ", outHeight: " + r5 + ", outMimeType: " + r6 + ", inBitmap: " + m5021d(r7.inBitmap), r3);
    }

    /* JADX INFO: renamed from: f */
    public static void m5023f(BitmapFactory.Options r3) {
        r3.inTempStorage = null;
        r3.inDither = false;
        r3.inScaled = false;
        r3.inSampleSize = 1;
        r3.inPreferredConfig = null;
        r3.inJustDecodeBounds = false;
        r3.inDensity = 0;
        r3.inTargetDensity = 0;
        r3.inPreferredColorSpace = null;
        r3.outColorSpace = null;
        r3.outConfig = null;
        r3.outWidth = 0;
        r3.outHeight = 0;
        r3.outMimeType = null;
        r3.inBitmap = null;
        r3.inMutable = true;
    }

    /* JADX INFO: renamed from: a */
    public final C0608O5 m5024a(C2656w4 r15, int r16, int r17, C2644vt r18, InterfaceC2500se r19) {
        byte[] r12 = (byte[]) this.f8855c.m5441c(65536, byte[].class);
        monitor-enter(C2543te.class);
        ArrayDeque r13 = f8852k;     // Catch: Throwable -> L11
        monitor-enter(r13);     // Catch: Throwable -> L11
        BitmapFactory.Options r3 = (BitmapFactory.Options) r13.poll();     // Catch: Throwable -> L41
        monitor-exit(r13);     // Catch: Throwable -> L41
        if (r3 != null) goto L13;
        r3 = new BitmapFactory.Options();     // Catch: Throwable -> L11
        m5023f(r3);     // Catch: Throwable -> L11
    L13:
        monitor-exit(C2543te.class);
        r3.inTempStorage = r12;
        EnumC0191Ec r5 = (EnumC0191Ec) r18.m5177c(f8847f);
        EnumC1383eu r6 = (EnumC1383eu) r18.m5177c(f8848g);
        C2457re r4 = (C2457re) r18.m5177c(C2457re.f8661g);
        boolean r10 = ((Boolean) r18.m5177c(f8849h)).booleanValue();
        C2601ut r2 = f8850i;
        if (r18.m5177c(r2) != null) goto L17;
    L20:
        boolean r0 = false;
    L46:
        Bitmap r02 = m5025b(r15, r3, r4, r5, r6, r0, r16, r17, r10, r19);     // Catch: Throwable -> L31
        C0608O5 r03 = C0608O5.m1187c(this.f8853a, r02);     // Catch: Throwable -> L31
        m5023f(r3);
        monitor-enter(r13);
        r13.offer(r3);     // Catch: Throwable -> L28
        monitor-exit(r13);     // Catch: Throwable -> L28
        this.f8855c.m5445g(r12);
        return r03;
    L28:
        th = move-exception;
        throw th;
    L31:
        th = move-exception;
        m5023f(r3);
        ArrayDeque r42 = f8852k;
        monitor-enter(r42);
        r42.offer(r3);     // Catch: Throwable -> L38
        this.f8855c.m5445g(r12);
        throw th;
    L38:
        th = move-exception;
        throw th;
    L17:
        if (((Boolean) r18.m5177c(r2)).booleanValue() == false) goto L20;
        r0 = true;
        goto L46
    L41:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

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
    /* JADX INFO: renamed from: b */
    public final Bitmap m5025b(C2656w4 r28, BitmapFactory.Options r29, C2457re r30, EnumC0191Ec r31, EnumC1383eu r32, boolean r33, int r34, int r35, boolean r36, InterfaceC2500se r37) {
        int r6 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        r29.inJustDecodeBounds = true;
        InterfaceC0565N5 r7 = this.f8853a;
        m5020c(r28, r29, r37, r7);
        int r8 = 0;
        r29.inJustDecodeBounds = false;
        int[] r9 = {r29.outWidth, r29.outHeight};
        int r10 = r9[0];
        int r92 = r9[1];
        if (r10 == (-1)) goto L7;
        if (r92 == (-1)) goto L7;
        boolean r12 = r33;
    L9:
        switch(r28.f9195a) {
            case 15: goto L29;
            case 16: goto L28;
            default: goto L10;
        };
    L10:
        List r13 = (List) r28.f9197c;
        C1274a r15 = (C1274a) r28.f9198d;
        C2812zp r14 = (C2812zp) r28.f9196b;
        int r62 = r13.size();
    L11:
        if (r8 >= r62) goto L27;
        InterfaceC1331dl r11 = (InterfaceC1331dl) r13.get(r8);
        int r17 = r62;
        int r19 = r8;
        List r21 = r13;
        C1340dv r63 = new C1340dv(new FileInputStream(r15.m2416a().getFileDescriptor()), r14);     // Catch: Throwable -> L21
        int r82 = r11.mo567b(r63, r14);     // Catch: Throwable -> L19
        r63.m2597f();
        r15.m2416a();
        if (r82 != (-1)) goto L17;
        r8 = r19 + 1;
        r62 = r17;
        r13 = r21;
        goto L11
    L17:
        int r112 = r82;
    L45:
        switch(r112) {
            case 3: goto L49;
            case 4: goto L49;
            case 5: goto L48;
            case 6: goto L48;
            case 7: goto L47;
            case 8: goto L47;
            default: goto L46;
        };
    L46:
        char r132 = 0;
    L50:
        switch(r112) {
            case 2: goto L52;
            case 3: goto L52;
            case 4: goto L52;
            case 5: goto L52;
            case 6: goto L52;
            case 7: goto L52;
            case 8: goto L52;
            default: goto L51;
        };
    L51:
        boolean r142 = false;
    L53:
        int r83 = r34;
        if (r83 == Integer.MIN_VALUE) goto L56;
    L60:
        int r18 = r112;
        int r113 = r35;
        if (r113 != Integer.MIN_VALUE) goto L69;
        if (r132 != 'Z') goto L65;
    L68:
        r113 = r10;
        goto L69
    L65:
        if (r132 == 270) goto L68;
        r113 = r92;
    L69:
        ImageHeaderParser$ImageType r152 = r28.m5213t();
        if (r10 <= 0) goto L72;
        if (r92 <= 0) goto L72;
        float r352 = 1.0f;
        if (r132 != 'Z') goto L76;
    L80:
        int r4 = r92;
        int r133 = r10;
    L79:
        boolean r172 = r12;
        float r122 = r30.m4949b(r4, r133, r83, r113);
        if (r122 <= 0.0f) goto L133;
        boolean r192 = r142;
        int r143 = r30.m4948a(r4, r133, r83, r113);
        if (r143 == 0) goto L131;
        float r1 = r4;
        float r93 = r133;
        int r16 = r4 / ((int) (((double) (r122 * r1)) + 0.5d));
        int r94 = r133 / ((int) (((double) (r122 * r93)) + 0.5d));
        if (r143 != 1) goto L88;
        int r110 = Math.max(r16, r94);
    L89:
        int r111 = Math.max(1, Integer.highestOneBit(r110));
        if (r143 == 1) goto L92;
    L94:
        r29.inSampleSize = r111;
        if (r152 != ImageHeaderParser$ImageType.JPEG) goto L100;
        float r95 = Math.min(r111, 8);
        int r102 = (int) Math.ceil(r1 / r95);
        int r96 = (int) Math.ceil(r93 / r95);
        int r114 = r111 / 8;
        if (r114 <= 0) goto L115;
        r102 = r102 / r114;
        r96 = r96 / r114;
    L115:
        double r3 = r30.m4949b(r102, r96, r83, r113);
        if (r3 > 1.0d) goto L118;
        double r123 = r3;
    L119:
        int r124 = (int) Math.round(r123 * 2.147483647E9d);
        int r97 = (int) ((((double) r124) * r3) + 0.5d);
        r29.inTargetDensity = (int) (((r3 / ((double) (r97 / r124))) * ((double) r97)) + 0.5d);
        if (r3 <= 1.0d) goto L123;
        r3 = 1.0d / r3;
    L123:
        int r115 = (int) Math.round(r3 * 2.147483647E9d);
        r29.inDensity = r115;
        int r38 = r29.inTargetDensity;
        if (r38 <= 0) goto L128;
        if (r115 <= 0) goto L128;
        if (r38 == r115) goto L128;
        r29.inScaled = true;
    L129:
        C2543te r116 = this;
        int r39 = r10;
        int r42 = r92;
    L138:
        boolean r98 = r116.f8857e.m4820c(r83, r113, r172, r192);
        if (r98 == false) goto L141;
        r29.inPreferredConfig = Bitmap.Config.HARDWARE;
        boolean r103 = false;
        r29.inMutable = false;
    L142:
        if (r98 == false) goto L145;
    L143:
        boolean r99 = true;
    L159:
        if (r39 < 0) goto L163;
        if (r42 < 0) goto L163;
        if (r36 == false) goto L163;
    L174:
        if (r83 <= 0) goto L184;
        if (r113 <= 0) goto L184;
        Bitmap.Config r310 = r29.inPreferredConfig;
        if (r310 == Bitmap.Config.HARDWARE) goto L184;
        Bitmap.Config r43 = r29.outConfig;
        if (r43 == null) goto L183;
        r310 = r43;
    L183:
        r29.inBitmap = r7.mo51e(r83, r113, r310);
    L184:
        if (r32 != null) goto L186;
    L197:
        Bitmap r84 = m5020c(r28, r29, r37, r7);
        r37.mo636c(r7, r84);
        if (Log.isLoggable("Downsampler", 2) == false) goto L200;
        m5021d(r84);
        m5021d(r29.inBitmap);
        Thread.currentThread().getName();
        SystemClock.elapsedRealtimeNanos();
    L200:
        if (r84 == null) goto L218;
        r84.setDensity(r116.f8854b.densityDpi);
        switch(r18) {
            case 2: goto L204;
            case 3: goto L204;
            case 4: goto L204;
            case 5: goto L204;
            case 6: goto L204;
            case 7: goto L204;
            case 8: goto L204;
            default: goto L203;
        };
    L203:
        Bitmap r144 = r84;
    L216:
        if (r84.equals(r144) == true) goto L232;
        r7.mo53h(r84);
        return r144;
    L232:
        return r144;
    L204:
        Matrix r134 = new Matrix();
        switch(r18) {
            case 2: goto L213;
            case 3: goto L212;
            case 4: goto L211;
            case 5: goto L210;
            case 6: goto L209;
            case 7: goto L208;
            case 8: goto L207;
            default: goto L214;
        };
    L207:
        r134.setRotate(-90.0f);
        goto L214
    L208:
        r134.setRotate(-90.0f);
        r134.postScale(-1.0f, r352);
        goto L214
    L209:
        r134.setRotate(90.0f);
        goto L214
    L210:
        r134.setRotate(90.0f);
        r134.postScale(-1.0f, r352);
        goto L214
    L211:
        r134.setRotate(180.0f);
        r134.postScale(-1.0f, r352);
        goto L214
    L212:
        r134.setRotate(180.0f);
        goto L214
    L213:
        r134.setScale(-1.0f, r352);
    L214:
        r144 = Bitmap.createBitmap(r84, 0, 0, r84.getWidth(), r84.getHeight(), r134, true);
        goto L216
    L218:
        return null;
    L186:
        if (r32 != EnumC1383eu.f4928a) goto L192;
        ColorSpace r311 = r29.outColorSpace;
        if (r311 == null) goto L192;
        if (r311.isWideGamut() == false) goto L192;
    L193:
        if (r99 == false) goto L195;
        ColorSpace.Named r312 = ColorSpace.Named.DISPLAY_P3;
    L196:
        r29.inPreferredColorSpace = ColorSpace.get(r312);
        goto L197
    L195:
        r312 = ColorSpace.Named.SRGB;
    L192:
        r99 = r103;
    L163:
        int r85 = r29.inTargetDensity;
        if (r85 <= 0) goto L169;
        int r117 = r29.inDensity;
        if (r117 <= 0) goto L169;
        if (r85 == r117) goto L169;
        boolean r118 = r99;
    L170:
        if (r118 == false) goto L172;
        float r86 = r85 / r29.inDensity;
    L173:
        float r119 = r29.inSampleSize;
        int r313 = (int) Math.ceil(r39 / r119);
        int r44 = (int) Math.ceil(r42 / r119);
        int r314 = Math.round(r313 * r86);
        r113 = Math.round(r44 * r86);
        r83 = r314;
        goto L174
    L172:
        r86 = r352;
    L169:
        r118 = r103;
        goto L170
    L145:
        if (r31 != EnumC0191Ec.f576a) goto L222;
        r99 = true;
        r29.inPreferredConfig = Bitmap.Config.ARGB_8888;
        goto L159
    L222:
        boolean r910 = r28.m5213t().hasAlpha();     // Catch: IOException -> L148
    L152:
        if (r910 == false) goto L154;
        Bitmap.Config r911 = Bitmap.Config.ARGB_8888;
    L155:
        r29.inPreferredConfig = r911;
        if (r911 != Bitmap.Config.RGB_565) goto L143;
        r99 = true;
        r29.inDither = true;
        goto L159
    L154:
        r911 = Bitmap.Config.RGB_565;
    L149:
        if (Log.isLoggable("Downsampler", 3) == false) goto L151;
        Objects.toString(r31);
    L151:
        r910 = r103;
        goto L152
    L141:
        r103 = false;
    L128:
        r29.inTargetDensity = 0;
        r29.inDensity = 0;
        goto L129
    L118:
        r123 = 1.0d / r3;
        goto L119
    L100:
        if (r152 != ImageHeaderParser$ImageType.PNG) goto L102;
    L114:
        float r120 = r111;
        r102 = (int) Math.floor(r1 / r120);
        r96 = (int) Math.floor(r93 / r120);
        goto L115
    L102:
        if (r152 == ImageHeaderParser$ImageType.PNG_A) goto L114;
        if (r152.isWebp() == false) goto L108;
        float r121 = r111;
        r102 = Math.round(r1 / r121);
        r96 = Math.round(r93 / r121);
        goto L115
    L108:
        if ((r4 % r111) != 0) goto L113;
        if ((r133 % r111) != 0) goto L113;
        r102 = r4 / r111;
        r96 = r133 / r111;
    L113:
        r29.inJustDecodeBounds = true;
        m5020c(r28, r29, r37, r7);
        r29.inJustDecodeBounds = false;
        int[] r45 = {r29.outWidth, r29.outHeight};
        r102 = r45[0];
        r96 = r45[1];
        goto L115
    L92:
        if (r111 >= (1.0f / r122)) goto L94;
        r111 = r111 << 1;
        goto L94
    L88:
        r110 = Math.min(r16, r94);
        goto L89
    L131:
        throw new IllegalArgumentException("Cannot round with null rounding");
    L133:
        throw new IllegalArgumentException("Cannot scale with factor: " + r122 + " from: " + r30 + ", source: [" + r10 + "x" + r92 + "], target: [" + r83 + "x" + r113 + "]");
    L76:
        if (r132 == 270) goto L80;
        r133 = r92;
        r4 = r10;
    L72:
        r42 = r92;
        r39 = r10;
        r172 = r12;
        r192 = r142;
        r352 = 1.0f;
        if (Log.isLoggable("Downsampler", 3) == false) goto L137;
        Objects.toString(r152);
    L137:
        r116 = this;
        goto L138
    L56:
        if (r132 == 'Z') goto L61;
        if (r132 == 270) goto L61;
        r83 = r10;
    L61:
        r83 = r92;
        goto L60
    L52:
        r142 = true;
        goto L53
    L47:
        r132 = 270;
        goto L50
    L48:
        r132 = 'Z';
        goto L50
    L49:
        r132 = 180;
    L19:
        th = th;
        C1340dv r145 = r63;
    L23:
        if (r145 == null) goto L25;
        r145.m2597f();
    L25:
        r15.m2416a();
        throw th;
    L21:
        th = th;
        r145 = null;
        goto L23
    L27:
        r112 = -1;
        goto L45
    L28:
        List r64 = (List) r28.f9198d;
        C1340dv r87 = (C1340dv) ((C0132D2) r28.f9196b).f328b;
        r87.reset();
        r112 = AbstractC1406fG.m2696V(r64, r87, (C2812zp) r28.f9197c);
        goto L45
    L29:
        List r65 = (List) r28.f9197c;
        ByteBuffer r88 = AbstractC2529t6.m5011c((ByteBuffer) r28.f9196b);
        C2812zp r1110 = (C2812zp) r28.f9198d;
        if (r88 == null) goto L43;
        int r135 = r65.size();
        int r146 = 0;
    L33:
        if (r146 >= r135) goto L43;
        int r153 = ((InterfaceC1331dl) r65.get(r146)).mo569d(r88, r1110);     // Catch: Throwable -> L40
        List r173 = r65;
        ByteBuffer r162 = (ByteBuffer) r88.position(0);
        if (r153 != (-1)) goto L38;
        r146 = r146 + 1;
        r65 = r173;
        goto L33
    L38:
        r112 = r153;
    L40:
        th = move-exception;
        ByteBuffer r2 = (ByteBuffer) r88.position(0);
        throw th;
    L43:
        r112 = -1;
    L7:
        r12 = false;
        goto L9
    }
}
