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
    public static final Object f9193f = new Object();

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

    public /* synthetic */ C2656w4(int i) {
        this.f9195a = i;
    }

    /* JADX INFO: renamed from: A */
    public static C2656w4 m5186A(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C2656w4(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX INFO: renamed from: D */
    public static final C2656w4 m5187D(C0132D2 c0132d2, C0947W1 c0947w1) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) c0132d2.f328b;
        try {
            C0881Uf c0881UfM1727A = C0881Uf.m1727A(byteArrayInputStream, C0839Tg.m1660a());
            byteArrayInputStream.close();
            if (c0881UfM1727A.m1731y().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                C2286nn c2286nnM4613E = C2286nn.m4613E(c0947w1.mo1003b(c0881UfM1727A.m1731y().m5329g(), bArr), C0839Tg.m1660a());
                if (c2286nnM4613E.m4619z() > 0) {
                    return m5191o(c2286nnM4613E);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (C0673Pl unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m5188I() {
    }

    /* JADX INFO: renamed from: J */
    private final void m5189J() {
    }

    /* JADX INFO: renamed from: l */
    public static boolean m5190l(Editable editable, KeyEvent keyEvent, boolean z) {
        C1086ZB[] c1086zbArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c1086zbArr = (C1086ZB[]) editable.getSpans(selectionStart, selectionEnd, C1086ZB.class)) != null && c1086zbArr.length > 0) {
                for (C1086ZB c1086zb : c1086zbArr) {
                    int spanStart = editable.getSpanStart(c1086zb);
                    int spanEnd = editable.getSpanEnd(c1086zb);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static final C2656w4 m5191o(C2286nn c2286nn) throws GeneralSecurityException {
        if (c2286nn.m4619z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(c2286nn.m4619z());
        for (C2243mn c2243mn : c2286nn.m4616A()) {
            c2243mn.getClass();
            try {
                try {
                    AbstractC0828TB abstractC0828TBM5449a = C2815zs.f9535b.m5449a(C0252Fu.m524d(c2243mn.m4556A().m1792B(), c2243mn.m4556A().m1793C(), c2243mn.m4556A().m1791A(), c2243mn.m4558C(), c2243mn.m4558C() == EnumC2773yt.RAW ? null : Integer.valueOf(c2243mn.m4557B())));
                    int iOrdinal = c2243mn.m4559D().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new C2329on(abstractC0828TBM5449a));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new C0232Fa("Creating a protokey serialization failed", e);
            }
        }
        return new C2656w4(c2286nn, Collections.unmodifiableList(arrayList));
    }

    /* JADX INFO: renamed from: u */
    public static C2656w4 m5192u(Context context) {
        if (f9192e == null) {
            synchronized (f9193f) {
                try {
                    if (f9192e == null) {
                        f9192e = new C2656w4(context);
                    }
                } finally {
                }
            }
        }
        return f9192e;
    }

    /* JADX INFO: renamed from: B */
    public boolean m5193B() {
        Iterator it = ((CopyOnWriteArrayList) this.f9198d).iterator();
        while (it.hasNext()) {
            if (((C2504si) ((InterfaceC0206Er) it.next())).f8791a.m5417o()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public Object m5194C(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC2802zf interfaceC2802zf) {
        int i4;
        char c;
        C0022Af c0022Af = new C0022Af((C0722Qr) ((C2428qs) this.f9197c).f8522c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo1293i = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zMo1293i) {
                SparseArray sparseArray = c0022Af.f41c.f2308a;
                C0722Qr c0722Qr = sparseArray == null ? null : (C0722Qr) sparseArray.get(iCodePointAt);
                if (c0022Af.f39a == 2) {
                    if (c0722Qr != null) {
                        c0022Af.f41c = c0722Qr;
                        c0022Af.f44f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c0022Af.m32a();
                        } else if (iCodePointAt != 65039) {
                            C0722Qr c0722Qr2 = c0022Af.f41c;
                            if (c0722Qr2.f2309b != null) {
                                if (c0022Af.f44f != 1) {
                                    c0022Af.f42d = c0722Qr2;
                                    c0022Af.m32a();
                                } else if (c0022Af.m33b()) {
                                    c0022Af.f42d = c0022Af.f41c;
                                    c0022Af.m32a();
                                } else {
                                    c0022Af.m32a();
                                }
                                c = 3;
                            } else {
                                c0022Af.m32a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (c0722Qr == null) {
                    c0022Af.m32a();
                    c = 1;
                } else {
                    c0022Af.f39a = 2;
                    c0022Af.f41c = c0722Qr;
                    c0022Af.f44f = 1;
                    c = 2;
                }
                c0022Af.f43e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !m5216x(charSequence, i4, iCharCount, c0022Af.f42d.f2309b)) {
                        zMo1293i = interfaceC2802zf.mo1293i(charSequence, i4, iCharCount, c0022Af.f42d.f2309b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (c0022Af.f39a == 2 && c0022Af.f41c.f2309b != null && ((c0022Af.f44f > 1 || c0022Af.m33b()) && i5 < i3 && zMo1293i && (z || !m5216x(charSequence, i4, iCharCount, c0022Af.f41c.f2309b)))) {
            interfaceC2802zf.mo1293i(charSequence, i4, iCharCount, c0022Af.f41c.f2309b);
        }
        return interfaceC2802zf.mo1291a();
    }

    /* JADX INFO: renamed from: E */
    public void m5195E() {
        ((TypedArray) this.f9196b).recycle();
    }

    /* JADX INFO: renamed from: F */
    public void m5196F(InterfaceC0206Er interfaceC0206Er) {
        ((CopyOnWriteArrayList) this.f9198d).remove(interfaceC0206Er);
        C2333or c2333or = (C2333or) ((HashMap) this.f9196b).remove(interfaceC0206Er);
        if (c2333or != null) {
            c2333or.f8194a.mo1556b(c2333or.f8195b);
            c2333or.f8195b = null;
        }
        ((Runnable) this.f9197c).run();
    }

    /* JADX INFO: renamed from: G */
    public void m5197G(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f9196b = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: H */
    public void m5198H(C2497sb c2497sb, int i, int i2, int i3) {
        c2497sb.getClass();
        int i4 = c2497sb.f8609b0;
        int i5 = c2497sb.f8611c0;
        c2497sb.f8609b0 = 0;
        c2497sb.f8611c0 = 0;
        c2497sb.m4924O(i2);
        c2497sb.m4921L(i3);
        if (i4 < 0) {
            c2497sb.f8609b0 = 0;
        } else {
            c2497sb.f8609b0 = i4;
        }
        if (i5 < 0) {
            c2497sb.f8611c0 = 0;
        } else {
            c2497sb.f8611c0 = i5;
        }
        C2497sb c2497sb2 = (C2497sb) this.f9198d;
        c2497sb2.f8777t0 = i;
        c2497sb2.m4983U();
    }

    /* JADX INFO: renamed from: K */
    public void m5199K(C2497sb c2497sb) {
        ArrayList arrayList = (ArrayList) this.f9196b;
        arrayList.clear();
        int size = c2497sb.f8774q0.size();
        for (int i = 0; i < size; i++) {
            C2454rb c2454rb = (C2454rb) c2497sb.f8774q0.get(i);
            int[] iArr = c2454rb.f8637p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c2454rb);
            }
        }
        c2497sb.f8776s0.f8948b = true;
    }

    @Override // p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: a */
    public boolean mo1934a(Object obj) {
        if (obj instanceof InterfaceC1097Zg) {
            ((InterfaceC1097Zg) obj).mo672c().f5035a = true;
        }
        switch (((C0668Pg) this.f9197c).f2132a) {
            case 2:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C1110Zt) this.f9198d).mo1934a(obj);
    }

    @Override // p000.InterfaceC1427fu
    /* JADX INFO: renamed from: b */
    public byte[] mo1121b(int i, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrM607H;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!AbstractC2374ph.m4805b(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.f9196b);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrM607H = AbstractC0295Gu.m606G(bArr, (iMax - 1) * 16, (byte[]) this.f9197c, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrM607H = AbstractC0295Gu.m607H(bArrCopyOf, (byte[]) this.f9198d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(AbstractC0295Gu.m606G(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(AbstractC0295Gu.m607H(bArrM607H, bArrDoFinal)), i);
    }

    @Override // p000.InterfaceC1024Xt
    /* JADX INFO: renamed from: c */
    public Object mo1935c() {
        Object objMo1935c = ((C1110Zt) this.f9198d).mo1935c();
        if (objMo1935c == null) {
            objMo1935c = ((InterfaceC1054Yg) this.f9196b).mo235g();
            if (Log.isLoggable("FactoryPools", 2)) {
                objMo1935c.getClass().toString();
            }
        }
        if (objMo1935c instanceof InterfaceC1097Zg) {
            ((InterfaceC1097Zg) objMo1935c).mo672c().f5035a = false;
        }
        return objMo1935c;
    }

    /* JADX INFO: renamed from: d */
    public C2301o1 m5200d() throws GeneralSecurityException {
        C1017Xm c1017Xm;
        C2787z6 c2787z6M5359a;
        C2653w1 c2653w1 = (C2653w1) this.f9196b;
        if (c2653w1 == null || (c1017Xm = (C1017Xm) this.f9197c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c2653w1.f9185l != ((C2787z6) c1017Xm.f3226b).f9452a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C2610v1 c2610v1 = c2653w1.f9187n;
        C2610v1 c2610v12 = C2610v1.f9005f;
        if (c2610v1 != c2610v12 && ((Integer) this.f9198d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c2610v1 == c2610v12 && ((Integer) this.f9198d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c2610v1 == c2610v12) {
            c2787z6M5359a = C2787z6.m5359a(new byte[0]);
        } else if (c2610v1 == C2610v1.f9004e || c2610v1 == C2610v1.f9003d) {
            c2787z6M5359a = C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        } else {
            if (c2610v1 != C2610v1.f9002c) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((C2653w1) this.f9196b).f9187n);
            }
            c2787z6M5359a = C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        }
        return new C2301o1((C2653w1) this.f9196b, c2787z6M5359a);
    }

    /* JADX INFO: renamed from: e */
    public C2653w1 m5201e() throws GeneralSecurityException {
        Integer num = (Integer) this.f9196b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f9197c) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((C2610v1) this.f9198d) != null) {
            return new C2653w1(num.intValue(), ((Integer) this.f9197c).intValue(), (C2610v1) this.f9198d);
        }
        throw new GeneralSecurityException("variant not set");
    }

    /* JADX INFO: renamed from: f */
    public C0647P1 m5202f() throws GeneralSecurityException {
        C1017Xm c1017Xm;
        C0775S1 c0775s1 = (C0775S1) this.f9196b;
        if (c0775s1 == null || (c1017Xm = (C1017Xm) this.f9197c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c0775s1.f2449l != ((C2787z6) c1017Xm.f3226b).f9452a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C2610v1 c2610v1 = c0775s1.f2452o;
        C2610v1 c2610v12 = C2610v1.f9008i;
        if (c2610v1 != c2610v12 && ((Integer) this.f9198d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c2610v1 == c2610v12 && ((Integer) this.f9198d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c2610v1 == c2610v12) {
            C2787z6.m5359a(new byte[0]);
        } else if (c2610v1 == C2610v1.f9007h) {
            C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        } else {
            if (c2610v1 != C2610v1.f9006g) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((C0775S1) this.f9196b).f2452o);
            }
            C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        }
        return new C0647P1();
    }

    /* JADX INFO: renamed from: g */
    public C1076Z1 m5203g() throws GeneralSecurityException {
        C1017Xm c1017Xm;
        C1243c2 c1243c2 = (C1243c2) this.f9196b;
        if (c1243c2 == null || (c1017Xm = (C1017Xm) this.f9197c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c1243c2.f4227l != ((C2787z6) c1017Xm.f3226b).f9452a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C2610v1 c2610v1 = c1243c2.f4230o;
        C2610v1 c2610v12 = C2610v1.f9011l;
        if (c2610v1 != c2610v12 && ((Integer) this.f9198d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c2610v1 == c2610v12 && ((Integer) this.f9198d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c2610v1 == c2610v12) {
            C2787z6.m5359a(new byte[0]);
        } else if (c2610v1 == C2610v1.f9010k) {
            C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        } else {
            if (c2610v1 != C2610v1.f9009j) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((C1243c2) this.f9196b).f4230o);
            }
            C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        }
        return new C1076Z1();
    }

    /* JADX INFO: renamed from: h */
    public C1480h2 m5204h() throws GeneralSecurityException {
        C1017Xm c1017Xm;
        C2125k2 c2125k2 = (C2125k2) this.f9196b;
        if (c2125k2 == null || (c1017Xm = (C1017Xm) this.f9197c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c2125k2.f7456l != ((C2787z6) c1017Xm.f3226b).f9452a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C2610v1 c2610v1 = c2125k2.f7457m;
        C2610v1 c2610v12 = C2610v1.f9014o;
        if (c2610v1 != c2610v12 && ((Integer) this.f9198d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c2610v1 == c2610v12 && ((Integer) this.f9198d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c2610v1 == c2610v12) {
            C2787z6.m5359a(new byte[0]);
        } else if (c2610v1 == C2610v1.f9013n) {
            C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        } else {
            if (c2610v1 != C2610v1.f9012m) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((C2125k2) this.f9196b).f7457m);
            }
            C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        }
        return new C1480h2();
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw interfaceC2389pw, C2644vt c2644vt) {
        Drawable drawable = (Drawable) interfaceC2389pw.get();
        if (drawable instanceof BitmapDrawable) {
            return ((C0307H5) this.f9197c).mo660i(C0608O5.m1187c((InterfaceC0565N5) this.f9196b, ((BitmapDrawable) drawable).getBitmap()), c2644vt);
        }
        if (drawable instanceof C0026Aj) {
            return ((C0668Pg) this.f9198d).mo660i(interfaceC2389pw, c2644vt);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public C0156Dk m5205j() throws GeneralSecurityException {
        C1017Xm c1017Xm;
        C2787z6 c2787z6M5359a;
        C0285Gk c0285Gk = (C0285Gk) this.f9196b;
        if (c0285Gk == null || (c1017Xm = (C1017Xm) this.f9197c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c0285Gk.f926l != ((C2787z6) c1017Xm.f3226b).f9452a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        C2610v1 c2610v1 = c0285Gk.f928n;
        C2610v1 c2610v12 = C2610v1.f8995A;
        if (c2610v1 != c2610v12 && ((Integer) this.f9198d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (c2610v1 == c2610v12 && ((Integer) this.f9198d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (c2610v1 == c2610v12) {
            c2787z6M5359a = C2787z6.m5359a(new byte[0]);
        } else if (c2610v1 == C2610v1.f9025z || c2610v1 == C2610v1.f9024y) {
            c2787z6M5359a = C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9198d).intValue()).array());
        } else {
            if (c2610v1 != C2610v1.f9023x) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((C0285Gk) this.f9196b).f928n);
            }
            c2787z6M5359a = C2787z6.m5359a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9198d).intValue()).array());
        }
        return new C0156Dk((C0285Gk) this.f9196b, c2787z6M5359a);
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m5206k(BitmapFactory.Options options) throws Throwable {
        boolean zM5217y;
        switch (this.f9195a) {
            case 15:
                return AbstractC1406fG.m2689N(new C2443r6(AbstractC2529t6.m5011c((ByteBuffer) this.f9196b)), options, this);
            case 16:
                C1340dv c1340dv = (C1340dv) ((C0132D2) this.f9196b).f328b;
                c1340dv.reset();
                return AbstractC1406fG.m2689N(c1340dv, options, this);
            default:
                FileDescriptor fileDescriptor = ((C1274a) this.f9198d).m2416a().getFileDescriptor();
                int i = Build.VERSION.SDK_INT;
                Bitmap bitmapM2712l0 = null;
                if (i == 34) {
                    if ((i == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) ? ((Boolean) AbstractC1293cr.f4726b.get()).booleanValue() : false) {
                        try {
                            zM5217y = m5217y();
                        } catch (IOException unused) {
                            zM5217y = false;
                        }
                        if (zM5217y) {
                            Bitmap.Config config = options.inPreferredConfig;
                            Bitmap.Config config2 = Bitmap.Config.HARDWARE;
                            AbstractC0714Qj.m1484f("", config == config2);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            try {
                                Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                                if (bitmapDecodeFileDescriptor == null) {
                                    if (bitmapDecodeFileDescriptor != null) {
                                    }
                                    options.inPreferredConfig = config2;
                                    return bitmapM2712l0;
                                }
                                try {
                                    bitmapM2712l0 = AbstractC1406fG.m2712l0(bitmapDecodeFileDescriptor);
                                } catch (Throwable th) {
                                    th = th;
                                    bitmapM2712l0 = bitmapDecodeFileDescriptor;
                                    if (bitmapM2712l0 != null) {
                                        bitmapM2712l0.recycle();
                                    }
                                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                    throw th;
                                }
                                break;
                                bitmapDecodeFileDescriptor.recycle();
                                options.inPreferredConfig = config2;
                                return bitmapM2712l0;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    break;
                }
                return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m5207m(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f9197c;
        String string = ((Context) this.f9198d).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC2327ol.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m5208n((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0232Fa(e);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public Object m5208n(Class cls, HashSet hashSet) {
        Object objMo2165b;
        HashMap map = (HashMap) this.f9196b;
        if (AbstractC0628Oj.m1226F()) {
            try {
                AbstractC0628Oj.m1239c(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo2165b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC2327ol interfaceC2327ol = (InterfaceC2327ol) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo2164a = interfaceC2327ol.mo2164a();
                if (!listMo2164a.isEmpty()) {
                    for (Class cls2 : listMo2164a) {
                        if (!map.containsKey(cls2)) {
                            m5208n(cls2, hashSet);
                        }
                    }
                }
                objMo2165b = interfaceC2327ol.mo2165b((Context) this.f9198d);
                hashSet.remove(cls);
                map.put(cls, objMo2165b);
            } catch (Throwable th2) {
                throw new C0232Fa(th2);
            }
        }
        Trace.endSection();
        return objMo2165b;
    }

    /* JADX INFO: renamed from: p */
    public ColorStateList m5209p(int i) {
        int resourceId;
        ColorStateList colorStateListM622o;
        TypedArray typedArray = (TypedArray) this.f9196b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM622o = AbstractC0295Gu.m622o((Context) this.f9198d, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM622o;
    }

    /* JADX INFO: renamed from: q */
    public Drawable m5210q(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f9196b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC1406fG.m2695U((Context) this.f9198d, resourceId);
    }

    /* JADX INFO: renamed from: r */
    public Drawable m5211r(int i) {
        int resourceId;
        Drawable drawableM5351d;
        if (!((TypedArray) this.f9196b).hasValue(i) || (resourceId = ((TypedArray) this.f9196b).getResourceId(i, 0)) == 0) {
            return null;
        }
        C0262G3 c0262g3M539a = C0262G3.m539a();
        Context context = (Context) this.f9198d;
        synchronized (c0262g3M539a) {
            drawableM5351d = c0262g3M539a.f844a.m5351d(context, resourceId, true);
        }
        return drawableM5351d;
    }

    /* JADX INFO: renamed from: s */
    public Typeface m5212s(int i, int i2, C1438g4 c1438g4) {
        int resourceId = ((TypedArray) this.f9196b).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f9197c) == null) {
            this.f9197c = new TypedValue();
        }
        Context context = (Context) this.f9198d;
        TypedValue typedValue = (TypedValue) this.f9197c;
        ThreadLocal threadLocal = AbstractC0125Cw.f295a;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0125Cw.m201a(context, resourceId, typedValue, i2, c1438g4, true, false);
    }

    /* JADX INFO: renamed from: t */
    public ImageHeaderParser$ImageType m5213t() throws Throwable {
        switch (this.f9195a) {
            case 15:
                return AbstractC1406fG.m2698X((List) this.f9197c, AbstractC2529t6.m5011c((ByteBuffer) this.f9196b));
            case 16:
                List list = (List) this.f9198d;
                C1340dv c1340dv = (C1340dv) ((C0132D2) this.f9196b).f328b;
                c1340dv.reset();
                return AbstractC1406fG.m2697W(list, c1340dv, (C2812zp) this.f9197c);
            default:
                List list2 = (List) this.f9197c;
                C1274a c1274a = (C1274a) this.f9198d;
                C2812zp c2812zp = (C2812zp) this.f9196b;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1331dl interfaceC1331dl = (InterfaceC1331dl) list2.get(i);
                    C1340dv c1340dv2 = null;
                    try {
                        C1340dv c1340dv3 = new C1340dv(new FileInputStream(c1274a.m2416a().getFileDescriptor()), c2812zp);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo571f = interfaceC1331dl.mo571f(c1340dv3);
                            c1340dv3.m2597f();
                            c1274a.m2416a();
                            if (imageHeaderParser$ImageTypeMo571f != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeMo571f;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c1340dv2 = c1340dv3;
                            if (c1340dv2 != null) {
                                c1340dv2.m2597f();
                            }
                            c1274a.m2416a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public String toString() {
        switch (this.f9195a) {
            case 18:
                return AbstractC2708xD.m5281a((C2286nn) this.f9196b).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5214v(Class cls) throws GeneralSecurityException {
        Class clsM5294a;
        Object objM1257c;
        Object objM1256b;
        AtomicReference atomicReference = AbstractC0640Ov.f2045a;
        try {
            clsM5294a = C2729xs.f9326b.m5294a(cls);
        } catch (GeneralSecurityException unused) {
            clsM5294a = null;
        }
        if (clsM5294a == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        List list = (List) this.f9197c;
        C2286nn c2286nn = (C2286nn) this.f9196b;
        int i = AbstractC2708xD.f9283a;
        int iM4617B = c2286nn.m4617B();
        Iterator it = c2286nn.m4616A().iterator();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            EnumC1271cn enumC1271cn = EnumC1271cn.ENABLED;
            if (!zHasNext) {
                if (i2 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z && !z2) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                C2428qs c2428qs = new C2428qs(7, clsM5294a);
                C1381es c1381es = (C1381es) this.f9198d;
                if (((ConcurrentHashMap) c2428qs.f8521b) == null) {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
                c2428qs.f8523d = c1381es;
                for (int i3 = 0; i3 < c2286nn.m4619z(); i3++) {
                    C2243mn c2243mnM4618y = c2286nn.m4618y(i3);
                    if (c2243mnM4618y.m4559D().equals(enumC1271cn)) {
                        try {
                            C0931Vm c0931VmM4556A = c2243mnM4618y.m4556A();
                            AtomicReference atomicReference2 = AbstractC0640Ov.f2045a;
                            objM1257c = AbstractC0640Ov.m1257c(c0931VmM4556A.m1792B(), c0931VmM4556A.m1793C(), clsM5294a);
                        } catch (GeneralSecurityException e) {
                            if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                                throw e;
                            }
                            objM1257c = null;
                        }
                        if (list.get(i3) != null) {
                            try {
                                objM1256b = AbstractC0640Ov.m1256b(((C2329on) list.get(i3)).f8174a, clsM5294a);
                            } catch (GeneralSecurityException unused2) {
                                objM1256b = null;
                            }
                            if (c2243mnM4618y.m4557B() != c2286nn.m4617B()) {
                                c2428qs.m4869e(objM1256b, objM1257c, c2243mnM4618y, true);
                            } else {
                                c2428qs.m4869e(objM1256b, objM1257c, c2243mnM4618y, false);
                            }
                        } else {
                            objM1256b = null;
                            if (c2243mnM4618y.m4557B() != c2286nn.m4617B()) {
                            }
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2428qs.f8521b;
                if (concurrentHashMap == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                C2516su c2516su = (C2516su) c2428qs.f8522c;
                C1381es c1381es2 = (C1381es) c2428qs.f8523d;
                Class cls2 = (Class) c2428qs.f8520a;
                C2656w4 c2656w4 = new C2656w4(concurrentHashMap, c2516su, c1381es2, cls2);
                c2428qs.f8521b = null;
                AtomicReference atomicReference3 = AbstractC0640Ov.f2045a;
                HashMap map = ((C2430qu) C2729xs.f9326b.f9327a.get()).f8525b;
                if (!map.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for " + cls);
                }
                InterfaceC2602uu interfaceC2602uu = (InterfaceC2602uu) map.get(cls);
                if (cls2.equals(interfaceC2602uu.mo28a()) && interfaceC2602uu.mo28a().equals(cls2)) {
                    return interfaceC2602uu.mo29b(c2656w4);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            C2243mn c2243mn = (C2243mn) it.next();
            if (c2243mn.m4559D() == enumC1271cn) {
                if (!c2243mn.m4560E()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c2243mn.m4557B())));
                }
                if (c2243mn.m4558C() == EnumC2773yt.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c2243mn.m4557B())));
                }
                if (c2243mn.m4559D() == EnumC1271cn.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c2243mn.m4557B())));
                }
                if (c2243mn.m4557B() == iM4617B) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (c2243mn.m4556A().m1791A() != EnumC0888Um.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public List m5215w(byte[] bArr) {
        List list = (List) ((ConcurrentMap) this.f9196b).get(new C2559tu(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: x */
    public boolean m5216x(CharSequence charSequence, int i, int i2, C1043YB c1043yb) {
        if ((c1043yb.f3334c & 3) == 0) {
            InterfaceC2235mf interfaceC2235mf = (InterfaceC2235mf) this.f9198d;
            C0636Or c0636OrM1992b = c1043yb.m1992b();
            int iM4624a = c0636OrM1992b.m4624a(8);
            if (iM4624a != 0) {
                ((ByteBuffer) c0636OrM1992b.f8037d).getShort(iM4624a + c0636OrM1992b.f8034a);
            }
            C0749Rc c0749Rc = (C0749Rc) interfaceC2235mf;
            c0749Rc.getClass();
            ThreadLocal threadLocal = C0749Rc.f2384b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0749Rc.f2385a;
            String string = sb.toString();
            int i3 = AbstractC0165Dt.f444a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = c1043yb.f3334c & 4;
            c1043yb.f3334c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (c1043yb.f3334c & 3) == 2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: y */
    public boolean m5217y() {
        switch (this.f9195a) {
            case 15:
                List list = (List) this.f9197c;
                ByteBuffer byteBufferM5011c = AbstractC2529t6.m5011c((ByteBuffer) this.f9196b);
                C2812zp c2812zp = (C2812zp) this.f9198d;
                if (byteBufferM5011c == null) {
                    return false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        if (((InterfaceC1331dl) list.get(i)).mo568c(byteBufferM5011c, c2812zp)) {
                            return true;
                        }
                    } finally {
                    }
                }
                return false;
            case 16:
                List list2 = (List) this.f9198d;
                C1340dv c1340dv = (C1340dv) ((C0132D2) this.f9196b).f328b;
                c1340dv.reset();
                C2812zp c2812zp2 = (C2812zp) this.f9197c;
                c1340dv.mark(5242880);
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        boolean zMo570e = ((InterfaceC1331dl) list2.get(i2)).mo570e(c1340dv, c2812zp2);
                        c1340dv.reset();
                        if (zMo570e) {
                            return true;
                        }
                    } catch (Throwable th) {
                        c1340dv.reset();
                        throw th;
                    }
                }
                return false;
            default:
                List list3 = (List) this.f9197c;
                C1274a c1274a = (C1274a) this.f9198d;
                C2812zp c2812zp3 = (C2812zp) this.f9196b;
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    InterfaceC1331dl interfaceC1331dl = (InterfaceC1331dl) list3.get(i3);
                    C1340dv c1340dv2 = null;
                    try {
                        C1340dv c1340dv3 = new C1340dv(new FileInputStream(c1274a.m2416a().getFileDescriptor()), c2812zp3);
                        try {
                            boolean zMo570e2 = interfaceC1331dl.mo570e(c1340dv3, c2812zp3);
                            c1340dv3.m2597f();
                            c1274a.m2416a();
                            if (zMo570e2) {
                                return true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c1340dv2 = c1340dv3;
                            if (c1340dv2 != null) {
                                c1340dv2.m2597f();
                            }
                            c1274a.m2416a();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean m5218z(int i, C1496hb c1496hb, C2454rb c2454rb) {
        C0178E5 c0178e5 = (C0178E5) this.f9197c;
        int[] iArr = c2454rb.f8637p0;
        int[] iArr2 = c2454rb.f8641t;
        c0178e5.f520a = iArr[0];
        c0178e5.f521b = iArr[1];
        c0178e5.f522c = c2454rb.m4937q();
        c0178e5.f523d = c2454rb.m4933k();
        c0178e5.f528i = false;
        c0178e5.f529j = i;
        boolean z = c0178e5.f520a == 3;
        boolean z2 = c0178e5.f521b == 3;
        boolean z3 = z && c2454rb.f8602W > 0.0f;
        boolean z4 = z2 && c2454rb.f8602W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            c0178e5.f520a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0178e5.f521b = 1;
        }
        c1496hb.m2865b(c2454rb, c0178e5);
        c2454rb.m4924O(c0178e5.f524e);
        c2454rb.m4921L(c0178e5.f525f);
        c2454rb.f8584E = c0178e5.f527h;
        c2454rb.m4918I(c0178e5.f526g);
        c0178e5.f529j = 0;
        return c0178e5.f528i;
    }

    public /* synthetic */ C2656w4(Object obj, Object obj2, Object obj3, int i) {
        this.f9195a = i;
        this.f9196b = obj;
        this.f9197c = obj2;
        this.f9198d = obj3;
    }

    public C2656w4(byte[] bArr) throws GeneralSecurityException {
        this.f9195a = 21;
        AbstractC0100CD.m146a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f9196b = secretKeySpec;
        if (AbstractC2374ph.m4805b(1)) {
            Cipher cipher = (Cipher) C1369eg.f4898b.f4900a.m2582a("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] bArrM2556u = AbstractC1293cr.m2556u(cipher.doFinal(new byte[16]));
            this.f9197c = bArrM2556u;
            this.f9198d = AbstractC1293cr.m2556u(bArrM2556u);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public C2656w4(Context context, TypedArray typedArray) {
        this.f9195a = 23;
        this.f9198d = context;
        this.f9196b = typedArray;
    }

    public C2656w4(Runnable runnable) {
        this.f9195a = 19;
        this.f9198d = new CopyOnWriteArrayList();
        this.f9196b = new HashMap();
        this.f9197c = runnable;
    }

    public C2656w4(Context context, LocationManager locationManager) {
        this.f9195a = 24;
        this.f9197c = new C0785SB();
        this.f9198d = context;
        this.f9196b = locationManager;
    }

    public C2656w4(Context context) {
        this.f9195a = 0;
        this.f9198d = context.getApplicationContext();
        this.f9197c = new HashSet();
        this.f9196b = new HashMap();
    }

    public C2656w4(C2497sb c2497sb) {
        this.f9195a = 6;
        this.f9196b = new ArrayList();
        this.f9197c = new C0178E5();
        this.f9198d = c2497sb;
    }

    public C2656w4(C2428qs c2428qs, C2220m6 c2220m6, C0749Rc c0749Rc, Set set) {
        this.f9195a = 11;
        this.f9196b = c2220m6;
        this.f9197c = c2428qs;
        this.f9198d = c0749Rc;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m5194C(str, 0, str.length(), 1, true, new C2610v1(str, 9));
        }
    }

    public C2656w4(C1110Zt c1110Zt, InterfaceC1054Yg interfaceC1054Yg, C0668Pg c0668Pg) {
        this.f9195a = 13;
        this.f9198d = c1110Zt;
        this.f9196b = interfaceC1054Yg;
        this.f9197c = c0668Pg;
    }

    public C2656w4(C2641vq c2641vq, ArrayList arrayList, C2812zp c2812zp) {
        this.f9195a = 16;
        AbstractC0714Qj.m1488j("Argument must not be null", c2812zp);
        this.f9197c = c2812zp;
        AbstractC0714Qj.m1488j("Argument must not be null", arrayList);
        this.f9198d = arrayList;
        this.f9196b = new C0132D2(c2641vq, c2812zp);
    }

    public C2656w4(ConcurrentMap concurrentMap, C2516su c2516su, C1381es c1381es, Class cls) {
        this.f9195a = 22;
        this.f9196b = concurrentMap;
        this.f9197c = c2516su;
        this.f9198d = c1381es;
    }

    public C2656w4(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, C2812zp c2812zp) {
        this.f9195a = 17;
        AbstractC0714Qj.m1488j("Argument must not be null", c2812zp);
        this.f9196b = c2812zp;
        AbstractC0714Qj.m1488j("Argument must not be null", arrayList);
        this.f9197c = arrayList;
        this.f9198d = new C1274a(parcelFileDescriptor);
    }

    public C2656w4(C1264cg c1264cg, C2563ty c2563ty, C1544ig c1544ig) {
        this.f9195a = 12;
        this.f9198d = c1264cg;
        this.f9197c = c2563ty;
        this.f9196b = c1544ig;
    }

    public C2656w4(C2286nn c2286nn, List list) {
        this.f9195a = 18;
        this.f9196b = c2286nn;
        this.f9197c = list;
        this.f9198d = C1381es.f4925b;
    }
}
