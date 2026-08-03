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

    public /* synthetic */ AbstractC0047B3(Object obj, Object obj2) {
        this.f96a = obj;
        this.f97b = obj2;
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m76k(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    /* JADX INFO: renamed from: c */
    public void m77c() {
        C0004A3 c0004a3 = (C0004A3) this.f96a;
        if (c0004a3 != null) {
            try {
                ((LayoutInflaterFactory2C0176E3) this.f97b).f494k.unregisterReceiver(c0004a3);
            } catch (IllegalArgumentException unused) {
            }
            this.f96a = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m78d() {
        C0557My c0557My = (C0557My) this.f96a;
        C0609O6 c0609o6 = (C0609O6) this.f97b;
        LinkedHashSet linkedHashSet = c0557My.f1829e;
        if (linkedHashSet.remove(c0609o6) && linkedHashSet.isEmpty()) {
            c0557My.m1098b();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract IntentFilter mo79e();

    /* JADX INFO: renamed from: f */
    public byte[] m80f(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC2140ka) this.f97b).m4324a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(AbstractC0628Oj.m1241j(bArr4, m76k(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            AbstractC2140ka abstractC2140ka = (AbstractC2140ka) this.f96a;
            abstractC2140ka.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            abstractC2140ka.m4327k(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public void m81g(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        AbstractC2140ka abstractC2140ka = (AbstractC2140ka) this.f96a;
        abstractC2140ka.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        abstractC2140ka.m4327k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        ((AbstractC2140ka) this.f97b).m4324a(0, bArr).get(bArr4);
        byte[] bArrM1241j = AbstractC0628Oj.m1241j(bArr4, m76k(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrM1241j);
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo82h();

    /* JADX INFO: renamed from: i */
    public MenuItem m83i(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0558Mz)) {
            return menuItem;
        }
        InterfaceMenuItemC0558Mz interfaceMenuItemC0558Mz = (InterfaceMenuItemC0558Mz) menuItem;
        if (((C2520sy) this.f97b) == null) {
            this.f97b = new C2520sy(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C2520sy) this.f97b).get(interfaceMenuItemC0558Mz);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC2599ur menuItemC2599ur = new MenuItemC2599ur((Context) this.f96a, interfaceMenuItemC0558Mz);
        ((C2520sy) this.f97b).put(interfaceMenuItemC0558Mz, menuItemC2599ur);
        return menuItemC2599ur;
    }

    /* JADX INFO: renamed from: j */
    public boolean m84j() {
        C0557My c0557My = (C0557My) this.f96a;
        View view = c0557My.f1827c.f5296E;
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    throw new IllegalArgumentException(AbstractC2374ph.m4812i(visibility, "Unknown visibility "));
                }
                i = 3;
            }
        }
        int i2 = c0557My.f1825a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public abstract AbstractC2140ka mo85l(int i, byte[] bArr);

    /* JADX INFO: renamed from: m */
    public abstract void mo86m();

    /* JADX INFO: renamed from: n */
    public void m87n() {
        m77c();
        IntentFilter intentFilterMo79e = mo79e();
        if (intentFilterMo79e.countActions() == 0) {
            return;
        }
        if (((C0004A3) this.f96a) == null) {
            this.f96a = new C0004A3(this);
        }
        ((LayoutInflaterFactory2C0176E3) this.f97b).f494k.registerReceiver((C0004A3) this.f96a, intentFilterMo79e);
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs c2428qs) {
        Context context = (Context) this.f96a;
        Class cls = (Class) this.f97b;
        return new C0510Lu(context, c2428qs.m4872j(File.class, cls), c2428qs.m4872j(Uri.class, cls), cls);
    }

    public AbstractC0047B3(Context context) {
        this.f96a = context;
    }

    public AbstractC0047B3(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3) {
        this.f97b = layoutInflaterFactory2C0176E3;
    }
}
