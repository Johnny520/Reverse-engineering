package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.C1274a;
import io.github.cherrywechat.R;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: w4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2656w4 implements InterfaceC2819zw, InterfaceC1024Xt, InterfaceC1427fu {

    /* JADX INFO: renamed from: e */
    public static volatile C2656w4 f9192e;

    /* JADX INFO: renamed from: f */
    public static final Object f9193f = null;

    /* JADX INFO: renamed from: g */
    public static C2656w4 f9194g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9195a;

    /* JADX INFO: renamed from: b */
    public Object f9196b;

    /* JADX INFO: renamed from: c */
    public Object f9197c;

    /* JADX INFO: renamed from: d */
    public Object f9198d;

    static {
        f9193f = new Object();
    }

    public /* synthetic */ C2656w4(int r1) {
        this.f9195a = r1;
    }

    /* JADX INFO: renamed from: A */
    public static C2656w4 m5186A(Context r2, AttributeSet r3, int[] r4, int r5) {
        return new C2656w4(r2, r2.obtainStyledAttributes(r3, r4, r5, 0));
    }

    /* JADX INFO: renamed from: D */
    public static final C2656w4 m5187D(C0132D2 r3, C0947W1 r4) {
        byte[] r0 = new byte[0];
        ByteArrayInputStream r32 = (ByteArrayInputStream) r3.f328b;
        C0881Uf r1 = C0881Uf.m1727A(r32, C0839Tg.m1660a());     // Catch: Throwable -> L16
        r32.close();
        if (r1.m1731y().size() == 0) goto L15;
        C2286nn r33 = C2286nn.m4613E(r4.mo1003b(r1.m1731y().m5329g(), r0), C0839Tg.m1660a());     // Catch: C0673Pl -> L12
        if (r33.m4619z() <= 0) goto L11;
        return m5191o(r33);
    L11:
        throw new GeneralSecurityException("empty keyset");     // Catch: C0673Pl -> L12
    L13:
        throw new GeneralSecurityException("invalid keyset, corrupted key material");
    L15:
        throw new GeneralSecurityException("empty keyset");
    L16:
        th = move-exception;
        r32.close();
        throw th;
    }

    /* JADX INFO: renamed from: I */
    private final void m5188I() {
    }

    /* JADX INFO: renamed from: J */
    private final void m5189J() {
    }

    /* JADX INFO: renamed from: l */
    public static boolean m5190l(Editable r6, KeyEvent r7, boolean r8) {
        if (KeyEvent.metaStateHasNoModifiers(r7.getMetaState()) == false) goto L26;
        int r72 = Selection.getSelectionStart(r6);
        int r1 = Selection.getSelectionEnd(r6);
        if (r72 == (-1)) goto L26;
        if (r1 == (-1)) goto L26;
        if (r72 != r1) goto L26;
        C1086ZB[] r12 = (C1086ZB[]) r6.getSpans(r72, r1, C1086ZB.class);
        if (r12 == null) goto L26;
        if (r12.length <= 0) goto L26;
        int r2 = r12.length;
        int r3 = 0;
    L15:
        if (r3 >= r2) goto L26;
        C1086ZB r4 = r12[r3];
        int r5 = r6.getSpanStart(r4);
        int r42 = r6.getSpanEnd(r4);
        if (r8 == false) goto L19;
        if (r5 != r72) goto L19;
    L23:
        r6.delete(r5, r42);
        return true;
    L19:
        if (r8 == true) goto L21;
        if (r42 == r72) goto L23;
    L21:
        if (r72 <= r5) goto L25;
        if (r72 < r42) goto L23;
    L25:
        r3 = r3 + 1;
    L26:
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static final C2656w4 m5191o(C2286nn r9) {
        if (r9.m4619z() <= 0) goto L30;
        ArrayList r0 = new ArrayList(r9.m4619z());
        Iterator r1 = r9.m4616A().iterator();
    L6:
        if (r1.hasNext() == false) goto L28;
        C2243mn r2 = (C2243mn) r1.next();
        r2.getClass();
        int r3 = r2.m4557B();
        if (r2.m4558C() != EnumC2773yt.f9420e) goto L10;
        Integer r32 = null;
    L31:
        AbstractC0828TB r33 = C2815zs.f9535b.m5449a(C0252Fu.m524d(r2.m4556A().m1792B(), r2.m4556A().m1793C(), r2.m4556A().m1791A(), r2.m4558C(), r32));     // Catch: GeneralSecurityException -> L23
        int r22 = r2.m4559D().ordinal();     // Catch: GeneralSecurityException -> L23
        if (r22 == 1) goto L21;
        if (r22 == 2) goto L21;
        if (r22 == 3) goto L21;
        throw new GeneralSecurityException("Unknown key status");     // Catch: GeneralSecurityException -> L23
    L21:
        r0.add(new C2329on(r33));     // Catch: GeneralSecurityException -> L23
    L23:
        r0.add(null);
    L24:
        e = move-exception;
        throw new C0232Fa("Creating a protokey serialization failed", e);
    L10:
        r32 = Integer.valueOf(r3);
        goto L31
    L28:
        return new C2656w4(r9, Collections.unmodifiableList(r0));
    L30:
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX INFO: renamed from: u */
    public static C2656w4 m5192u(Context r2) {
        if (f9192e != null) goto L16;
        Object r0 = f9193f;
        monitor-enter(r0);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (f9192e != null) goto L11;
        f9192e = new C2656w4(r2);     // Catch: Throwable -> L9
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L9
    L16:
        return f9192e;
    }

    /* JADX INFO: renamed from: B */
    public boolean m5193B() {
        Iterator r0 = ((CopyOnWriteArrayList) this.f9198d).iterator();
    L4:
        if (r0.hasNext() == false) goto L9;
        if (((C2504si) ((InterfaceC0206Er) r0.next())).f8791a.m5417o() == false) goto L4;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: C */
    public Object m5194C(CharSequence r17, int r18, int r19, int r20, boolean r21, InterfaceC2802zf r22) {
        C0022Af r5 = new C0022Af((C0722Qr) ((C2428qs) this.f9197c).f8522c);
        int r9 = Character.codePointAt(r17, r18);
        int r10 = 0;
        boolean r11 = true;
        int r6 = r18;
    L3:
        int r7 = r6;
    L5:
        if (r6 >= r19) goto L55;
        if (r10 >= r20) goto L55;
        if (r11 == false) goto L55;
        SparseArray r13 = r5.f41c.f2308a;
        if (r13 != null) goto L11;
        C0722Qr r132 = null;
    L13:
        if (r5.f39a == 2) goto L19;
        if (r132 != null) goto L17;
        r5.m32a();
    L16:
        char r133 = 1;
    L38:
        r5.f43e = r9;
        if (r133 == 1) goto L51;
        if (r133 != 2) goto L41;
        int r12 = Character.charCount(r9) + r6;
        if (r12 >= r19) goto L50;
        r9 = Character.codePointAt(r17, r12);
    L50:
        r6 = r12;
        goto L5
    L41:
        if (r133 != 3) goto L5;
        if (r21 == true) goto L46;
        if (m5216x(r17, r7, r6, r5.f42d.f2309b) == true) goto L3;
    L46:
        r11 = r22.mo1293i(r17, r7, r6, r5.f42d.f2309b);
        r10 = r10 + 1;
        goto L3
    L51:
        r6 = Character.charCount(Character.codePointAt(r17, r7)) + r7;
        if (r6 >= r19) goto L3;
        r9 = Character.codePointAt(r17, r6);
        goto L3
    L17:
        r5.f39a = 2;
        r5.f41c = r132;
        r5.f44f = 1;
    L18:
        r133 = 2;
        goto L38
    L19:
        if (r132 == null) goto L22;
        r5.f41c = r132;
        r5.f44f++;
        goto L18
    L22:
        if (r9 != 65038) goto L25;
        r5.m32a();
        goto L16
    L25:
        if (r9 == 65039) goto L18;
        C0722Qr r134 = r5.f41c;
        if (r134.f2309b != null) goto L30;
        r5.m32a();
        goto L16
    L30:
        if (r5.f44f == 1) goto L32;
        r5.f42d = r134;
        r5.m32a();
    L34:
        r133 = 3;
        goto L38
    L32:
        if (r5.m33b() == false) goto L35;
        r5.f42d = r5.f41c;
        r5.m32a();
        goto L34
    L35:
        r5.m32a();
        goto L16
    L11:
        r132 = (C0722Qr) r13.get(r9);
    L55:
        if (r5.f39a != 2) goto L69;
        if (r5.f41c.f2309b == null) goto L69;
        if (r5.f44f <= 1) goto L61;
    L62:
        if (r10 >= r20) goto L69;
        if (r11 == false) goto L69;
        if (r21 == false) goto L66;
    L67:
        r22.mo1293i(r17, r7, r6, r5.f41c.f2309b);
        goto L69
    L66:
        if (m5216x(r17, r7, r6, r5.f41c.f2309b) == true) goto L69;
    L61:
        if (r5.m33b() == true) goto L62;
    L69:
        return r22.mo1291a();
    }

    /* JADX INFO: renamed from: E */
    public void m5195E() {
        ((TypedArray) this.f9196b).recycle();
    }

    /* JADX INFO: renamed from: F */
    public void m5196F(InterfaceC0206Er r3) {
        ((CopyOnWriteArrayList) this.f9198d).remove(r3);
        C2333or r32 = (C2333or) ((HashMap) this.f9196b).remove(r3);
        if (r32 == null) goto L5;
        r32.f8194a.mo1556b(r32.f8195b);
        r32.f8195b = null;
    L5:
        ((Runnable) this.f9197c).run();
    }

    /* JADX INFO: renamed from: G */
    public void m5197G(int r3) {
        if (r3 != 16) goto L5;
    L9:
        this.f9196b = Integer.valueOf(r3);
        return;
    L5:
        if (r3 == 32) goto L9;
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(r3 * 8)}));
    }

    /* JADX INFO: renamed from: H */
    public void m5198H(C2497sb r4, int r5, int r6, int r7) {
        r4.getClass();
        int r0 = r4.f8609b0;
        int r1 = r4.f8611c0;
        r4.f8609b0 = 0;
        r4.f8611c0 = 0;
        r4.m4924O(r6);
        r4.m4921L(r7);
        if (r0 >= 0) goto L5;
        r4.f8609b0 = 0;
    L6:
        if (r1 >= 0) goto L8;
        r4.f8611c0 = 0;
    L9:
        C2497sb r42 = (C2497sb) this.f9198d;
        r42.f8777t0 = r5;
        r42.m4983U();
        return;
    L8:
        r4.f8611c0 = r1;
        goto L9
    L5:
        r4.f8609b0 = r0;
        goto L6
    }

    /* JADX INFO: renamed from: K */
    public void m5199K(C2497sb r10) {
        ArrayList r0 = (ArrayList) this.f9196b;
        r0.clear();
        int r1 = r10.f8774q0.size();
        int r3 = 0;
    L4:
        if (r3 >= r1) goto L11;
        C2454rb r5 = (C2454rb) r10.f8774q0.get(r3);
        int[] r6 = r5.f8637p0;
        if (r6[0] != 3) goto L8;
    L9:
        r0.add(r5);
    L10:
        r3 = r3 + 1;
        goto L4
    L8:
        if (r6[1] != 3) goto L10;
    L11:
        r10.f8776s0.f8948b = true;
    }

    @Override // p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: a */
    public boolean mo1934a(Object r3) {
        if ((r3 instanceof InterfaceC1097Zg) == false) goto L6;
        ((InterfaceC1097Zg) r3).mo672c().f5035a = true;
    L6:
        switch(((C0668Pg) this.f9197c).f2132a) {
            case 2: goto L9;
            default: goto L7;
        };
    L7:
        ((List) r3).clear();
    L9:
        return ((C1110Zt) this.f9198d).mo1934a(r3);
    }

    @Override // p000.InterfaceC1427fu
    /* JADX INFO: renamed from: b */
    public byte[] mo1121b(int r10, byte[] r11) {
        if (r10 > 16) goto L23;
        if (AbstractC2374ph.m4805b(1) == false) goto L21;
        Cipher r2 = (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/ECB/NoPadding");
        r2.init(1, (SecretKeySpec) this.f9196b);
        int r3 = Math.max(1, (int) Math.ceil(((double) r11.length) / 16.0d));
        if ((r3 * 16) != r11.length) goto L9;
        byte[] r4 = AbstractC0295Gu.m606G(r11, (r3 - 1) * 16, (byte[]) this.f9197c, 0, 16);
    L12:
        byte[] r5 = new byte[16];
        int r7 = 0;
    L14:
        if (r7 >= (r3 - 1)) goto L17;
        r5 = r2.doFinal(AbstractC0295Gu.m606G(r5, 0, r11, r7 * 16, 16));
        r7 = r7 + 1;
        goto L14
    L17:
        return Arrays.copyOf(r2.doFinal(AbstractC0295Gu.m607H(r4, r5)), r10);
    L9:
        byte[] r42 = Arrays.copyOfRange(r11, (r3 - 1) * 16, r11.length);
        if (r42.length >= 16) goto L19;
        byte[] r52 = Arrays.copyOf(r42, 16);
        r52[r42.length] = -128;
        r4 = AbstractC0295Gu.m607H(r52, (byte[]) this.f9198d);
        goto L12
    L19:
        throw new IllegalArgumentException("x must be smaller than a block.");
    L21:
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    L23:
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    @Override // p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: c */
    public Object mo1935c() {
        Object r0 = ((C1110Zt) this.f9198d).mo1935c();
        if (r0 != null) goto L8;
        r0 = ((InterfaceC1054Yg) this.f9196b).mo235g();
        if (Log.isLoggable("FactoryPools", 2) == false) goto L8;
        r0.getClass().toString();
    L8:
        if ((r0 instanceof InterfaceC1097Zg) == false) goto L10;
        ((InterfaceC1097Zg) r0).mo672c().f5035a = false;
    L10:
        return r0;
    }

    /* JADX INFO: renamed from: d */
    public C2301o1 m5200d() {
        C2653w1 r0 = (C2653w1) this.f9196b;
        if (r0 == null) goto L40;
        C1017Xm r1 = (C1017Xm) this.f9197c;
        if (r1 == null) goto L40;
        if (r0.f9185l != ((C2787z6) r1.f3226b).f9452a.length) goto L38;
        C2610v1 r02 = r0.f9187n;
        C2610v1 r12 = C2610v1.f9005f;
        if (r02 != r12) goto L11;
    L15:
        if (r02 != r12) goto L20;
        if (((Integer) this.f9198d) == null) goto L20;
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    L20:
        if (r02 != r12) goto L23;
        C2787z6 r03 = C2787z6.m5359a(new byte[0]);
    L34:
        return new C2301o1((C2653w1) this.f9196b, r03);
    L23:
        if (r02 != C2610v1.f9004e) goto L25;
    L32:
        r03 = C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        goto L34
    L25:
        if (r02 == C2610v1.f9003d) goto L32;
        if (r02 != C2610v1.f9002c) goto L31;
        r03 = C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        goto L34
    L31:
        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((C2653w1) this.f9196b).f9187n);
    L11:
        if (((Integer) this.f9198d) != null) goto L15;
        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
    L38:
        throw new GeneralSecurityException("Key size mismatch");
    L40:
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: renamed from: e */
    public C2653w1 m5201e() {
        Integer r0 = (Integer) this.f9196b;
        if (r0 == null) goto L15;
        if (((Integer) this.f9197c) == null) goto L13;
        if (((C2610v1) this.f9198d) == null) goto L11;
        return new C2653w1(r0.intValue(), ((Integer) this.f9197c).intValue(), (C2610v1) this.f9198d);
    L11:
        throw new GeneralSecurityException("variant not set");
    L13:
        throw new GeneralSecurityException("tag size not set");
    L15:
        throw new GeneralSecurityException("key size not set");
    }

    /* JADX INFO: renamed from: f */
    public C0647P1 m5202f() {
        C0775S1 r0 = (C0775S1) this.f9196b;
        if (r0 == null) goto L37;
        C1017Xm r1 = (C1017Xm) this.f9197c;
        if (r1 == null) goto L37;
        if (r0.f2449l != ((C2787z6) r1.f3226b).f9452a.length) goto L35;
        C2610v1 r02 = r0.f2452o;
        C2610v1 r12 = C2610v1.f9008i;
        if (r02 != r12) goto L11;
    L15:
        if (r02 != r12) goto L20;
        if (((Integer) this.f9198d) == null) goto L20;
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    L20:
        if (r02 != r12) goto L23;
        C2787z6.m5359a(new byte[0]);
    L29:
        return new C0647P1();
    L23:
        if (r02 != C2610v1.f9007h) goto L26;
        C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        goto L29
    L26:
        if (r02 != C2610v1.f9006g) goto L31;
        C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        goto L29
    L31:
        throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((C0775S1) this.f9196b).f2452o);
    L11:
        if (((Integer) this.f9198d) != null) goto L15;
        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
    L35:
        throw new GeneralSecurityException("Key size mismatch");
    L37:
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: renamed from: g */
    public C1076Z1 m5203g() {
        C1243c2 r0 = (C1243c2) this.f9196b;
        if (r0 == null) goto L37;
        C1017Xm r1 = (C1017Xm) this.f9197c;
        if (r1 == null) goto L37;
        if (r0.f4227l != ((C2787z6) r1.f3226b).f9452a.length) goto L35;
        C2610v1 r02 = r0.f4230o;
        C2610v1 r12 = C2610v1.f9011l;
        if (r02 != r12) goto L11;
    L15:
        if (r02 != r12) goto L20;
        if (((Integer) this.f9198d) == null) goto L20;
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    L20:
        if (r02 != r12) goto L23;
        C2787z6.m5359a(new byte[0]);
    L29:
        return new C1076Z1();
    L23:
        if (r02 != C2610v1.f9010k) goto L26;
        C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        goto L29
    L26:
        if (r02 != C2610v1.f9009j) goto L31;
        C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        goto L29
    L31:
        throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((C1243c2) this.f9196b).f4230o);
    L11:
        if (((Integer) this.f9198d) != null) goto L15;
        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
    L35:
        throw new GeneralSecurityException("Key size mismatch");
    L37:
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: renamed from: h */
    public C1480h2 m5204h() {
        C2125k2 r0 = (C2125k2) this.f9196b;
        if (r0 == null) goto L37;
        C1017Xm r1 = (C1017Xm) this.f9197c;
        if (r1 == null) goto L37;
        if (r0.f7456l != ((C2787z6) r1.f3226b).f9452a.length) goto L35;
        C2610v1 r02 = r0.f7457m;
        C2610v1 r12 = C2610v1.f9014o;
        if (r02 != r12) goto L11;
    L15:
        if (r02 != r12) goto L20;
        if (((Integer) this.f9198d) == null) goto L20;
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    L20:
        if (r02 != r12) goto L23;
        C2787z6.m5359a(new byte[0]);
    L29:
        return new C1480h2();
    L23:
        if (r02 != C2610v1.f9013n) goto L26;
        C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        goto L29
    L26:
        if (r02 != C2610v1.f9012m) goto L31;
        C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        goto L29
    L31:
        throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((C2125k2) this.f9196b).f7457m);
    L11:
        if (((Integer) this.f9198d) != null) goto L15;
        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
    L35:
        throw new GeneralSecurityException("Key size mismatch");
    L37:
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw r3, C2644vt r4) {
        Drawable r0 = (Drawable) r3.get();
        if ((r0 instanceof BitmapDrawable) == false) goto L7;
        C0307H5 r32 = (C0307H5) this.f9197c;
        Bitmap r02 = ((BitmapDrawable) r0).getBitmap();
        return r32.mo660i(C0608O5.m1187c((InterfaceC0565N5) this.f9196b, r02), r4);
    L7:
        if ((r0 instanceof C0026Aj) == true) goto L9;
        return null;
    L9:
        return ((C0668Pg) this.f9198d).mo660i(r3, r4);
    }

    /* JADX INFO: renamed from: j */
    public C0156Dk m5205j() {
        C0285Gk r0 = (C0285Gk) this.f9196b;
        if (r0 == null) goto L40;
        C1017Xm r1 = (C1017Xm) this.f9197c;
        if (r1 == null) goto L40;
        if (r0.f926l != ((C2787z6) r1.f3226b).f9452a.length) goto L38;
        C2610v1 r02 = r0.f928n;
        C2610v1 r12 = C2610v1.f8995A;
        if (r02 != r12) goto L11;
    L15:
        if (r02 != r12) goto L20;
        if (((Integer) this.f9198d) == null) goto L20;
        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
    L20:
        if (r02 != r12) goto L23;
        C2787z6 r03 = C2787z6.m5359a(new byte[0]);
    L34:
        return new C0156Dk((C0285Gk) this.f9196b, r03);
    L23:
        if (r02 != C2610v1.f9025z) goto L25;
    L32:
        r03 = C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        goto L34
    L25:
        if (r02 == C2610v1.f9024y) goto L32;
        if (r02 != C2610v1.f9023x) goto L31;
        r03 = C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        goto L34
    L31:
        throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((C0285Gk) this.f9196b).f928n);
    L11:
        if (((Integer) this.f9198d) != null) goto L15;
        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
    L38:
        throw new GeneralSecurityException("Key size mismatch");
    L40:
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m5206k(BitmapFactory.Options r6) {
        switch(this.f9195a) {
            case 15: goto L41;
            case 16: goto L38;
            default: goto L4;
        };
    L4:
        FileDescriptor r0 = ((C1274a) this.f9198d).m2416a().getFileDescriptor();
        int r1 = Build.VERSION.SDK_INT;
        Bitmap r2 = null;
        if (r1 != 34) goto L37;
        boolean r4 = false;
        if (r1 == 34) goto L10;
    L11:
        boolean r12 = false;
    L13:
        if (r12 == false) goto L37;
        boolean r13 = m5217y();     // Catch: IOException -> L16
    L17:
        if (r13 == false) goto L37;
        Bitmap.Config r14 = r6.inPreferredConfig;
        Bitmap.Config r3 = Bitmap.Config.HARDWARE;
        if (r14 != r3) goto L21;
        r4 = true;
    L21:
        AbstractC0714Qj.m1484f("", r4);
        r6.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap r02 = BitmapFactory.decodeFileDescriptor(r0, null, r6);     // Catch: Throwable -> L31
        if (r02 != null) goto L46;
        if (r02 != null) goto L28;
    L26:
        r6.inPreferredConfig = r3;
        return r2;
    L28:
        r02.recycle();
        goto L26
    L46:
        r2 = AbstractC1406fG.m2712l0(r02);     // Catch: Throwable -> L29
    L29:
        th = th;
        r2 = r02;
    L32:
        if (r2 == null) goto L34;
        r2.recycle();
    L34:
        r6.inPreferredConfig = Bitmap.Config.HARDWARE;
        throw th;
    L31:
        th = th;
    L16:
        r13 = false;
        goto L17
    L10:
        if (r6.inPreferredConfig != Bitmap.Config.HARDWARE) goto L11;
        r12 = ((Boolean) AbstractC1293cr.f4726b.get()).booleanValue();
    L37:
        return BitmapFactory.decodeFileDescriptor(r0, null, r6);
    L38:
        C1340dv r03 = (C1340dv) ((C0132D2) this.f9196b).f328b;
        r03.reset();
        return AbstractC1406fG.m2689N(r03, r6, this);
    L41:
        return AbstractC1406fG.m2689N(new C2443r6(AbstractC2529t6.m5011c((ByteBuffer) this.f9196b)), r6, this);
    }

    /* JADX INFO: renamed from: m */
    public void m5207m(Bundle r7) {
        HashSet r0 = (HashSet) this.f9197c;
        String r1 = ((Context) this.f9198d).getString(R.string.androidx_startup);
        if (r7 != null) goto L22;
        return;
    L22:
        HashSet r2 = new HashSet();     // Catch: ClassNotFoundException -> L12
        Iterator<String> r3 = r7.keySet().iterator();     // Catch: ClassNotFoundException -> L12
    L6:
        if (r3.hasNext() == false) goto L14;
        String r4 = r3.next();     // Catch: ClassNotFoundException -> L12
        if (r1.equals(r7.getString(r4, null)) == false) goto L6;
        Class<?> r42 = Class.forName(r4);     // Catch: ClassNotFoundException -> L12
        if (InterfaceC2327ol.class.isAssignableFrom(r42) == false) goto L6;
        r0.add(r42);     // Catch: ClassNotFoundException -> L12
        goto L6
    L14:
        Iterator r72 = r0.iterator();     // Catch: ClassNotFoundException -> L12
    L15:
        if (r72.hasNext() == false) goto L32;
        m5208n((Class) r72.next(), r2);     // Catch: ClassNotFoundException -> L12
        goto L15
    L32:
        return;
    L12:
        e = move-exception;
        throw new C0232Fa(e);
    }

    /* JADX INFO: renamed from: n */
    public Object m5208n(Class r6, HashSet r7) {
        HashMap r0 = (HashMap) this.f9196b;
        if (AbstractC0628Oj.m1226F() == false) goto L8;
        AbstractC0628Oj.m1239c(r6.getSimpleName());     // Catch: Throwable -> L5
    L5:
        th = move-exception;
        Trace.endSection();
        throw th;
    L8:
        if (r7.contains(r6) == true) goto L31;
        if (r0.containsKey(r6) == true) goto L27;
        r7.add(r6);     // Catch: Throwable -> L5
        InterfaceC2327ol r1 = (InterfaceC2327ol) r6.getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L21
        List r2 = r1.mo2164a();     // Catch: Throwable -> L21
        if (r2.isEmpty() == true) goto L23;
        Iterator r22 = r2.iterator();     // Catch: Throwable -> L21
    L17:
        if (r22.hasNext() == false) goto L23;
        Class r3 = (Class) r22.next();     // Catch: Throwable -> L21
        if (r0.containsKey(r3) == true) goto L17;
        m5208n(r3, r7);     // Catch: Throwable -> L21
    L23:
        Object r12 = r1.mo2165b((Context) this.f9198d);     // Catch: Throwable -> L21
        r7.remove(r6);     // Catch: Throwable -> L21
        r0.put(r6, r12);     // Catch: Throwable -> L21
    L28:
        Trace.endSection();
        return r12;
    L21:
        th = move-exception;
        throw new C0232Fa(th);     // Catch: Throwable -> L5
    L27:
        r12 = r0.get(r6);     // Catch: Throwable -> L5
        goto L28
    L31:
        throw new IllegalStateException("Cannot initialize " + r6.getName() + ". Cycle detected.");     // Catch: Throwable -> L5
    }

    /* JADX INFO: renamed from: p */
    public ColorStateList m5209p(int r4) {
        TypedArray r0 = (TypedArray) this.f9196b;
        if (r0.hasValue(r4) == false) goto L10;
        int r1 = r0.getResourceId(r4, 0);
        if (r1 == 0) goto L10;
        ColorStateList r12 = AbstractC0295Gu.m622o((Context) this.f9198d, r1);
        if (r12 == null) goto L10;
        return r12;
    L10:
        return r0.getColorStateList(r4);
    }

    /* JADX INFO: renamed from: q */
    public Drawable m5210q(int r3) {
        TypedArray r0 = (TypedArray) this.f9196b;
        if (r0.hasValue(r3) == false) goto L9;
        int r1 = r0.getResourceId(r3, 0);
        if (r1 == 0) goto L9;
        return AbstractC1406fG.m2695U((Context) this.f9198d, r1);
    L9:
        return r0.getDrawable(r3);
    }

    /* JADX INFO: renamed from: r */
    public Drawable m5211r(int r5) {
        if (((TypedArray) this.f9196b).hasValue(r5) == false) goto L14;
        int r52 = ((TypedArray) this.f9196b).getResourceId(r5, 0);
        if (r52 == 0) goto L18;
        C0262G3 r0 = C0262G3.m539a();
        Context r1 = (Context) this.f9198d;
        monitor-enter(r0);
        Drawable r53 = r0.f844a.m5351d(r1, r52, true);     // Catch: Throwable -> L11
        monitor-exit(r0);
        return r53;
    L11:
        th = move-exception;
        throw th;
    L18:
        return null;
    L14:
        return null;
    }

    /* JADX INFO: renamed from: s */
    public Typeface m5212s(int r10, int r11, C1438g4 r12) {
        int r3 = ((TypedArray) this.f9196b).getResourceId(r10, 0);
        if (r3 != 0) goto L6;
        return null;
    L6:
        if (((TypedValue) this.f9197c) != null) goto L8;
        this.f9197c = new TypedValue();
    L8:
        Context r2 = (Context) this.f9198d;
        TypedValue r4 = (TypedValue) this.f9197c;
        ThreadLocal r102 = AbstractC0125Cw.f295a;
        if (r2.isRestricted() == false) goto L13;
        return null;
    L13:
        return AbstractC0125Cw.m201a(r2, r3, r4, r11, r12, true, false);
    }

    /* JADX INFO: renamed from: t */
    public ImageHeaderParser$ImageType m5213t() {
        switch(this.f9195a) {
            case 15: goto L25;
            case 16: goto L22;
            default: goto L4;
        };
    L4:
        List r0 = (List) this.f9197c;
        C1274a r1 = (C1274a) this.f9198d;
        C2812zp r2 = (C2812zp) this.f9196b;
        int r3 = r0.size();
        int r4 = 0;
    L5:
        if (r4 >= r3) goto L21;
        InterfaceC1331dl r5 = (InterfaceC1331dl) r0.get(r4);
        C1340dv r6 = null;
        C1340dv r7 = new C1340dv(new FileInputStream(r1.m2416a().getFileDescriptor()), r2);     // Catch: Throwable -> L15
        ImageHeaderParser$ImageType r52 = r5.mo571f(r7);     // Catch: Throwable -> L13
        r7.m2597f();
        r1.m2416a();
        if (r52 != ImageHeaderParser$ImageType.UNKNOWN) goto L32;
        r4 = r4 + 1;
        goto L5
    L32:
        return r52;
    L13:
        th = th;
        r6 = r7;
    L16:
        if (r6 == null) goto L18;
        r6.m2597f();
    L18:
        r1.m2416a();
        throw th;
    L15:
        th = th;
        goto L16
    L21:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L22:
        List r02 = (List) this.f9198d;
        C1340dv r12 = (C1340dv) ((C0132D2) this.f9196b).f328b;
        r12.reset();
        return AbstractC1406fG.m2697W(r02, r12, (C2812zp) this.f9197c);
    L25:
        return AbstractC1406fG.m2698X((List) this.f9197c, AbstractC2529t6.m5011c((ByteBuffer) this.f9196b));
    }

    public String toString() {
        switch(this.f9195a) {
            case 18: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return AbstractC2708xD.m5281a((C2286nn) this.f9196b).toString();
    }

    /* JADX INFO: renamed from: v */
    public Object m5214v(Class r17) {
        AtomicReference r0 = AbstractC0640Ov.f2045a;
        Class r4 = C2729xs.f9326b.m5294a(r17);     // Catch: GeneralSecurityException -> L5
    L7:
        if (r4 == null) goto L91;
        List r6 = (List) this.f9197c;
        C2286nn r7 = (C2286nn) this.f9196b;
        int r02 = AbstractC2708xD.f9283a;
        int r03 = r7.m4617B();
        Iterator r8 = r7.m4616A().iterator();
        int r11 = 0;
        boolean r12 = false;
        boolean r13 = true;
    L9:
        boolean r14 = r8.hasNext();
        EnumC1271cn r15 = EnumC1271cn.f4327c;
        if (r14 == false) goto L36;
        C2243mn r142 = (C2243mn) r8.next();
        if (r142.m4559D() != r15) goto L9;
        if (r142.m4560E() == false) goto L35;
        if (r142.m4558C() == EnumC2773yt.f9417b) goto L33;
        if (r142.m4559D() == EnumC1271cn.f4326b) goto L31;
        if (r142.m4557B() != r03) goto L27;
        if (r12 == true) goto L25;
        r12 = true;
        goto L27
    L25:
        throw new GeneralSecurityException("keyset contains multiple primary keys");
    L27:
        if (r142.m4556A().m1791A() == EnumC0888Um.f2779e) goto L29;
        r13 = false;
    L29:
        r11 = r11 + 1;
        goto L9
    L31:
        throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(r142.m4557B())}));
    L33:
        throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(r142.m4557B())}));
    L35:
        throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(r142.m4557B())}));
    L36:
        if (r11 == 0) goto L89;
        if (r12 == true) goto L42;
        if (r13 == true) goto L42;
        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
    L42:
        C2428qs r3 = new C2428qs(7, r4);
        C1381es r04 = (C1381es) this.f9198d;
        if (((ConcurrentHashMap) r3.f8521b) == null) goto L87;
        r3.f8523d = r04;
        int r82 = 0;
    L46:
        if (r82 >= r7.m4619z()) goto L70;
        C2243mn r112 = r7.m4618y(r82);
        if (r112.m4559D().equals(r15) == false) goto L69;
        C0931Vm r05 = r112.m4556A();     // Catch: GeneralSecurityException -> L51
        AtomicReference r122 = AbstractC0640Ov.f2045a;     // Catch: GeneralSecurityException -> L51
        Object r06 = AbstractC0640Ov.m1257c(r05.m1792B(), r05.m1793C(), r4);     // Catch: GeneralSecurityException -> L51
    L60:
        if (r6.get(r82) != null) goto L97;
    L64:
        Object r123 = null;
    L66:
        if (r112.m4557B() != r7.m4617B()) goto L68;
        r3.m4869e(r123, r06, r112, true);
        goto L69
    L68:
        r3.m4869e(r123, r06, r112, false);
        goto L69
    L97:
        r123 = AbstractC0640Ov.m1256b(((C2329on) r6.get(r82)).f8174a, r4);     // Catch: GeneralSecurityException -> L92
    L51:
        e = move-exception;
        if (e.getMessage().contains("No key manager found for key type ") == false) goto L55;
    L58:
        r06 = null;
        goto L60
    L55:
        if (e.getMessage().contains(" not supported by key manager of type ") == true) goto L58;
        throw e;
    L69:
        r82 = r82 + 1;
        goto L46
    L70:
        ConcurrentHashMap r07 = (ConcurrentHashMap) r3.f8521b;
        if (r07 == null) goto L85;
        C2516su r62 = (C2516su) r3.f8522c;
        C1381es r72 = (C1381es) r3.f8523d;
        Class r83 = (Class) r3.f8520a;
        C2656w4 r42 = new C2656w4(r07, r62, r72, r83);
        r3.f8521b = null;
        AtomicReference r08 = AbstractC0640Ov.f2045a;
        HashMap r09 = ((C2430qu) C2729xs.f9326b.f9327a.get()).f8525b;
        if (r09.containsKey(r17) == false) goto L83;
        InterfaceC2602uu r010 = (InterfaceC2602uu) r09.get(r17);
        if (r83.equals(r010.mo28a()) == false) goto L81;
        if (r010.mo28a().equals(r83) == false) goto L81;
        return r010.mo29b(r42);
    L81:
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    L83:
        throw new GeneralSecurityException("No wrapper found for " + r17);
    L85:
        throw new IllegalStateException("build cannot be called twice");
    L87:
        throw new IllegalStateException("setAnnotations cannot be called after build");
    L89:
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    L91:
        throw new GeneralSecurityException("No wrapper found for ".concat(r17.getName()));
    L5:
        r4 = null;
        goto L7
    }

    /* JADX INFO: renamed from: w */
    public List m5215w(byte[] r3) {
        List r32 = (List) ((ConcurrentMap) this.f9196b).get(new C2559tu(r3));
        if (r32 == null) goto L6;
        return r32;
    L6:
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: x */
    public boolean m5216x(CharSequence r8, int r9, int r10, C1043YB r11) {
        if ((r11.f3334c & 3) != 0) goto L19;
        InterfaceC2235mf r0 = (InterfaceC2235mf) this.f9198d;
        C0636Or r4 = r11.m1992b();
        int r5 = r4.m4624a(8);
        if (r5 == 0) goto L7;
        ((ByteBuffer) r4.f8037d).getShort(r5 + r4.f8034a);
    L7:
        C0749Rc r02 = (C0749Rc) r0;
        r02.getClass();
        ThreadLocal r42 = C0749Rc.f2384b;
        if (r42.get() != null) goto L10;
        r42.set(new StringBuilder());
    L10:
        StringBuilder r43 = (StringBuilder) r42.get();
        r43.setLength(0);
    L11:
        if (r9 >= r10) goto L13;
        r43.append(r8.charAt(r9));
        r9 = r9 + 1;
        goto L11
    L13:
        TextPaint r82 = r02.f2385a;
        String r92 = r43.toString();
        int r102 = AbstractC0165Dt.f444a;
        boolean r83 = r82.hasGlyph(r92);
        int r93 = r11.f3334c & 4;
        if (r83 == false) goto L16;
        int r84 = r93 | 2;
    L17:
        r11.f3334c = r84;
        goto L19
    L16:
        r84 = r93 | 1;
    L19:
        if ((r11.f3334c & 3) != 2) goto L21;
        return true;
    L21:
        return false;
    }

    /* JADX INFO: renamed from: y */
    public boolean m5217y() {
        switch(this.f9195a) {
            case 15: goto L33;
            case 16: goto L21;
            default: goto L4;
        };
    L4:
        List r0 = (List) this.f9197c;
        C1274a r1 = (C1274a) this.f9198d;
        C2812zp r2 = (C2812zp) this.f9196b;
        int r3 = r0.size();
        int r5 = 0;
    L5:
        if (r5 >= r3) goto L62;
        InterfaceC1331dl r6 = (InterfaceC1331dl) r0.get(r5);
        C1340dv r7 = null;
        C1340dv r8 = new C1340dv(new FileInputStream(r1.m2416a().getFileDescriptor()), r2);     // Catch: Throwable -> L15
        boolean r62 = r6.mo570e(r8, r2);     // Catch: Throwable -> L13
        r8.m2597f();
        r1.m2416a();
        if (r62 == true) goto L11;
        r5 = r5 + 1;
        goto L5
    L11:
        return true;
    L13:
        th = th;
        r7 = r8;
    L16:
        if (r7 == null) goto L18;
        r7.m2597f();
    L18:
        r1.m2416a();
        throw th;
    L15:
        th = th;
        goto L16
    L62:
        return false;
    L21:
        List r02 = (List) this.f9198d;
        C1340dv r12 = (C1340dv) ((C0132D2) this.f9196b).f328b;
        r12.reset();
        C2812zp r22 = (C2812zp) this.f9197c;
        r12.mark(5242880);
        int r32 = r02.size();
        int r52 = 0;
    L22:
        if (r52 >= r32) goto L63;
        boolean r63 = ((InterfaceC1331dl) r02.get(r52)).mo570e(r12, r22);     // Catch: Throwable -> L29
        r12.reset();
        if (r63 == true) goto L27;
        r52 = r52 + 1;
        goto L22
    L27:
        return true;
    L29:
        th = move-exception;
        r12.reset();
        throw th;
    L63:
        return false;
    L33:
        List r03 = (List) this.f9197c;
        ByteBuffer r13 = AbstractC2529t6.m5011c((ByteBuffer) this.f9196b);
        C2812zp r23 = (C2812zp) this.f9198d;
        if (r13 == null) goto L64;
        int r4 = r03.size();
        int r53 = 0;
    L37:
        if (r53 >= r4) goto L65;
        boolean r64 = ((InterfaceC1331dl) r03.get(r53)).mo568c(r13, r23);     // Catch: Throwable -> L44
        ByteBuffer r72 = (ByteBuffer) r13.position(0);
        if (r64 == true) goto L42;
        r53 = r53 + 1;
        goto L37
    L42:
        return true;
    L44:
        th = move-exception;
        ByteBuffer r14 = (ByteBuffer) r13.position(0);
        throw th;
    L65:
        return false;
    L64:
        return false;
    }

    /* JADX INFO: renamed from: z */
    public boolean m5218z(int r7, C1496hb r8, C2454rb r9) {
        C0178E5 r0 = (C0178E5) this.f9197c;
        int[] r1 = r9.f8637p0;
        int[] r2 = r9.f8641t;
        r0.f520a = r1[0];
        r0.f521b = r1[1];
        r0.f522c = r9.m4937q();
        r0.f523d = r9.m4933k();
        r0.f528i = false;
        r0.f529j = r7;
        if (r0.f520a != 3) goto L5;
        boolean r72 = true;
    L7:
        if (r0.f521b != 3) goto L9;
        boolean r12 = true;
    L11:
        if (r72 == true) goto L13;
    L15:
        boolean r73 = false;
    L16:
        if (r12 == true) goto L18;
    L20:
        boolean r13 = false;
    L22:
        if (r73 == true) goto L24;
    L26:
        if (r13 == true) goto L28;
    L30:
        r8.m2865b(r9, r0);
        r9.m4924O(r0.f524e);
        r9.m4921L(r0.f525f);
        r9.f8584E = r0.f527h;
        r9.m4918I(r0.f526g);
        r0.f529j = 0;
        return r0.f528i;
    L28:
        if (r2[1] != 4) goto L30;
        r0.f521b = 1;
        goto L30
    L24:
        if (r2[0] != 4) goto L26;
        r0.f520a = 1;
        goto L26
    L18:
        if (r9.f8602W <= 0.0f) goto L20;
        r13 = true;
        goto L22
    L13:
        if (r9.f8602W <= 0.0f) goto L15;
        r73 = true;
        goto L16
    L9:
        r12 = false;
        goto L11
    L5:
        r72 = false;
        goto L7
    }

    public /* synthetic */ C2656w4(Object r1, Object r2, Object r3, int r4) {
        this.f9195a = r4;
        this.f9196b = r1;
        this.f9197c = r2;
        this.f9198d = r3;
    }

    public C2656w4(byte[] r4) {
        this.f9195a = 21;
        AbstractC0100CD.m146a(r4.length);
        SecretKeySpec r0 = new SecretKeySpec(r4, "AES");
        this.f9196b = r0;
        if (AbstractC2374ph.m4805b(1) == false) goto L7;
        Cipher r1 = (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/ECB/NoPadding");
        r1.init(1, r0);
        byte[] r42 = AbstractC1293cr.m2556u(r1.doFinal(new byte[16]));
        this.f9197c = r42;
        this.f9198d = AbstractC1293cr.m2556u(r42);
        return;
    L7:
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public C2656w4(Context r2, TypedArray r3) {
        this.f9195a = 23;
        this.f9198d = r2;
        this.f9196b = r3;
    }

    public C2656w4(Runnable r2) {
        this.f9195a = 19;
        this.f9198d = new CopyOnWriteArrayList();
        this.f9196b = new HashMap();
        this.f9197c = r2;
    }

    public C2656w4(Context r2, LocationManager r3) {
        this.f9195a = 24;
        this.f9197c = new C0785SB();
        this.f9198d = r2;
        this.f9196b = r3;
    }

    public C2656w4(Context r2) {
        this.f9195a = 0;
        this.f9198d = r2.getApplicationContext();
        this.f9197c = new HashSet();
        this.f9196b = new HashMap();
    }

    public C2656w4(C2497sb r2) {
        this.f9195a = 6;
        this.f9196b = new ArrayList();
        this.f9197c = new C0178E5();
        this.f9198d = r2;
    }

    public C2656w4(C2428qs r8, C2220m6 r9, C0749Rc r10, Set r11) {
        this.f9195a = 11;
        this.f9196b = r9;
        this.f9197c = r8;
        this.f9198d = r10;
        if (r11.isEmpty() == true) goto L9;
        Iterator r82 = r11.iterator();
    L7:
        if (r82.hasNext() == false) goto L11;
        int[] r92 = (int[]) r82.next();
        String r1 = new String(r92, 0, r92.length);
        InterfaceC2802zf r6 = new C2610v1(r1, 9);
        m5194C(r1, 0, r1.length(), 1, true, r6);
        goto L7
    L11:
        return;
    }

    public C2656w4(C1110Zt r2, InterfaceC1054Yg r3, C0668Pg r4) {
        this.f9195a = 13;
        this.f9198d = r2;
        this.f9196b = r3;
        this.f9197c = r4;
    }

    public C2656w4(C2641vq r2, ArrayList r3, C2812zp r4) {
        this.f9195a = 16;
        AbstractC0714Qj.m1488j("Argument must not be null", r4);
        this.f9197c = r4;
        AbstractC0714Qj.m1488j("Argument must not be null", r3);
        this.f9198d = r3;
        this.f9196b = new C0132D2(r2, r4);
    }

    public C2656w4(ConcurrentMap r1, C2516su r2, C1381es r3, Class r4) {
        this.f9195a = 22;
        this.f9196b = r1;
        this.f9197c = r2;
        this.f9198d = r3;
    }

    public C2656w4(ParcelFileDescriptor r2, ArrayList r3, C2812zp r4) {
        this.f9195a = 17;
        AbstractC0714Qj.m1488j("Argument must not be null", r4);
        this.f9196b = r4;
        AbstractC0714Qj.m1488j("Argument must not be null", r3);
        this.f9197c = r3;
        this.f9198d = new C1274a(r2);
    }

    public C2656w4(C1264cg r2, C2563ty r3, C1544ig r4) {
        this.f9195a = 12;
        this.f9198d = r2;
        this.f9197c = r3;
        this.f9196b = r4;
    }

    public C2656w4(C2286nn r2, List r3) {
        this.f9195a = 18;
        this.f9196b = r2;
        this.f9197c = r3;
        this.f9198d = C1381es.f4925b;
    }
}
