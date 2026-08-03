package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import javax.crypto.AEADBadTagException;

/* JADX INFO: renamed from: B3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0047B3 implements InterfaceC1233bs {

    /* JADX INFO: renamed from: a */
    public Object f96a;

    /* JADX INFO: renamed from: b */
    public Object f97b;

    public /* synthetic */ AbstractC0047B3(Object r1, Object r2) {
        this.f96a = r1;
        this.f97b = r2;
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m76k(byte[] r5, ByteBuffer r6) {
        if ((r5.length % 16) != 0) goto L5;
        int r0 = r5.length;
    L6:
        int r1 = r6.remaining();
        int r2 = r1 % 16;
        if (r2 != 0) goto L9;
        int r3 = r1;
    L10:
        int r32 = r3 + r0;
        ByteBuffer r22 = ByteBuffer.allocate(r32 + 16).order(ByteOrder.LITTLE_ENDIAN);
        r22.put(r5);
        r22.position(r0);
        r22.put(r6);
        r22.position(r32);
        r22.putLong(r5.length);
        r22.putLong(r1);
        return r22.array();
    L9:
        r3 = (r1 + 16) - r2;
        goto L10
    L5:
        r0 = (r5.length + 16) - (r5.length % 16);
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public void m77c() {
        C0004A3 r0 = (C0004A3) this.f96a;
        if (r0 == null) goto L10;
        ((LayoutInflaterFactory2C0176E3) this.f97b).f494k.unregisterReceiver(r0);     // Catch: IllegalArgumentException -> L7
    L5:
        this.f96a = null;
        return;
    }

    /* JADX INFO: renamed from: d */
    public void m78d() {
        C0557My r0 = (C0557My) this.f96a;
        C0609O6 r1 = (C0609O6) this.f97b;
        LinkedHashSet r2 = r0.f1829e;
        if (r2.remove(r1) == true) goto L5;
        return;
    L5:
        if (r2.isEmpty() == false) goto L9;
        r0.m1098b();
        return;
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo79e();

    /* JADX INFO: renamed from: f */
    public byte[] m80f(ByteBuffer r5, byte[] r6, byte[] r7) {
        if (r5.remaining() < 16) goto L17;
        int r0 = r5.position();
        byte[] r2 = new byte[16];
        r5.position(r5.limit() - 16);
        r5.get(r2);
        r5.position(r0);
        r5.limit(r5.limit() - 16);
        if (r7 != null) goto L18;
        r7 = new byte[0];
    L18:
        ByteBuffer r1 = ((AbstractC2140ka) this.f97b).m4324a(0, r6);     // Catch: GeneralSecurityException -> L13
        byte[] r3 = new byte[32];     // Catch: GeneralSecurityException -> L13
        r1.get(r3);     // Catch: GeneralSecurityException -> L13
        if (MessageDigest.isEqual(AbstractC0628Oj.m1241j(r3, m76k(r7, r5)), r2) == false) goto L12;
        r5.position(r0);
        AbstractC2140ka r72 = (AbstractC2140ka) this.f96a;
        r72.getClass();
        ByteBuffer r02 = ByteBuffer.allocate(r5.remaining());
        r72.m4327k(r6, r02, r5);
        return r02.array();
    L12:
        throw new GeneralSecurityException("invalid MAC");     // Catch: GeneralSecurityException -> L13
    L13:
        e = move-exception;
        throw new AEADBadTagException(e.toString());
    L17:
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* JADX INFO: renamed from: g */
    public void m81g(ByteBuffer r6, byte[] r7, byte[] r8, byte[] r9) {
        if (r6.remaining() < (r8.length + 16)) goto L14;
        int r0 = r6.position();
        AbstractC2140ka r1 = (AbstractC2140ka) this.f96a;
        r1.getClass();
        if (r6.remaining() < r8.length) goto L12;
        r1.m4327k(r7, r6, ByteBuffer.wrap(r8));
        r6.position(r0);
        r6.limit(r6.limit() - 16);
        if (r9 != null) goto L9;
        r9 = new byte[0];
    L9:
        byte[] r82 = new byte[32];
        ((AbstractC2140ka) this.f97b).m4324a(0, r7).get(r82);
        byte[] r72 = AbstractC0628Oj.m1241j(r82, m76k(r9, r6));
        r6.limit(r6.limit() + 16);
        r6.put(r72);
        return;
    L12:
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    L14:
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo82h();

    /* JADX INFO: renamed from: i */
    public MenuItem m83i(MenuItem r3) {
        if ((r3 instanceof InterfaceMenuItemC0558Mz) == false) goto L11;
        InterfaceMenuItemC0558Mz r32 = (InterfaceMenuItemC0558Mz) r3;
        if (((C2520sy) this.f97b) != null) goto L7;
        this.f97b = new C2520sy(0);
    L7:
        MenuItem r0 = (MenuItem) ((C2520sy) this.f97b).get(r32);
        if (r0 != null) goto L12;
        MenuItemC2599ur r02 = new MenuItemC2599ur((Context) this.f96a, r32);
        ((C2520sy) this.f97b).put(r32, r02);
        return r02;
    L12:
        return r0;
    L11:
        return r3;
    }

    /* JADX INFO: renamed from: j */
    public boolean m84j() {
        C0557My r0 = (C0557My) this.f96a;
        View r1 = r0.f1827c.f5296E;
        int r4 = 4;
        if (r1.getAlpha() == 0.0f) goto L5;
    L7:
        int r12 = r1.getVisibility();
        if (r12 == 0) goto L15;
        if (r12 != 4) goto L11;
    L16:
        int r02 = r0.f1825a;
        if (r4 == r02) goto L23;
        if (r4 == 2) goto L21;
        if (r02 != 2) goto L26;
        return false;
    L26:
        return true;
    L21:
        return false;
    L23:
        return true;
    L11:
        if (r12 != 8) goto L14;
        r4 = 3;
        goto L16
    L14:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r12, "Unknown visibility "));
    L15:
        r4 = 2;
        goto L16
    L5:
        if (r1.getVisibility() != 0) goto L7;
        goto L7
    }

    /* JADX INFO: renamed from: l */
    public abstract AbstractC2140ka mo85l(int r1, byte[] r2);

    /* JADX INFO: renamed from: m */
    public abstract void mo86m();

    /* JADX INFO: renamed from: n */
    public void m87n() {
        m77c();
        IntentFilter r0 = mo79e();
        if (r0.countActions() != 0) goto L6;
        return;
    L6:
        if (((C0004A3) this.f96a) != null) goto L8;
        this.f96a = new C0004A3(this);
    L8:
        ((LayoutInflaterFactory2C0176E3) this.f97b).f494k.registerReceiver((C0004A3) this.f96a, r0);
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs r6) {
        Context r1 = (Context) this.f96a;
        Class r2 = (Class) this.f97b;
        return new C0510Lu(r1, r6.m4872j(File.class, r2), r6.m4872j(Uri.class, r2), r2);
    }

    public AbstractC0047B3(Context r1) {
        this.f96a = r1;
    }

    public AbstractC0047B3(LayoutInflaterFactory2C0176E3 r1) {
        this.f97b = r1;
    }
}
