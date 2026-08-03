package p162l3;

import ac.AbstractC0063p;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p003a2.C0014a;
import p020b5.C0184c;
import p069f.C0932f;
import p136j8.C2104o;
import p178m3.C2776b;

/* JADX INFO: renamed from: l3.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2455i {

    /* JADX INFO: renamed from: j */
    public static final Object f8060j = new Object();

    /* JADX INFO: renamed from: k */
    public static volatile C2455i f8061k;

    /* JADX INFO: renamed from: a */
    public final ReentrantReadWriteLock f8062a;

    /* JADX INFO: renamed from: b */
    public final C0932f f8063b;

    /* JADX INFO: renamed from: c */
    public volatile int f8064c;

    /* JADX INFO: renamed from: d */
    public final Handler f8065d;

    /* JADX INFO: renamed from: e */
    public final C2452f f8066e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2454h f8067f;

    /* JADX INFO: renamed from: g */
    public final C0014a f8068g;

    /* JADX INFO: renamed from: h */
    public final int f8069h;

    /* JADX INFO: renamed from: i */
    public final C2450d f8070i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2455i(C2465s c2465s) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f8062a = reentrantReadWriteLock;
        this.f8064c = 3;
        InterfaceC2454h interfaceC2454h = c2465s.f8089a;
        this.f8067f = interfaceC2454h;
        int i9 = c2465s.f8090b;
        this.f8069h = i9;
        this.f8070i = c2465s.f8091c;
        this.f8065d = new Handler(Looper.getMainLooper());
        this.f8063b = new C0932f();
        this.f8068g = new C0014a(28);
        C2452f c2452f = new C2452f(this);
        this.f8066e = c2452f;
        reentrantReadWriteLock.writeLock().lock();
        if (i9 == 0) {
            try {
                this.f8064c = 0;
            } catch (Throwable th2) {
                this.f8062a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m5849c() == 0) {
            try {
                interfaceC2454h.mo5845a(new C2451e(c2452f));
            } catch (Throwable th3) {
                m5851f(th3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2455i m5846a() {
        C2455i c2455i;
        synchronized (f8060j) {
            try {
                c2455i = f8061k;
                if (!(c2455i != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c2455i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m5847d() {
        return f8061k != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m5848b(CharSequence charSequence, int i9) {
        if (!(m5849c() == 1)) {
            C2104o.m5276A("Not initialized yet");
            return 0;
        }
        AbstractC0063p.m418k(charSequence, "charSequence cannot be null");
        C0184c c0184c = this.f8066e.f8056b;
        c0184c.getClass();
        if (i9 < 0 || i9 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C2468v[] c2468vArr = (C2468v[]) spanned.getSpans(i9, i9 + 1, C2468v.class);
            if (c2468vArr.length > 0) {
                return spanned.getSpanStart(c2468vArr[0]);
            }
        }
        return ((C2462p) c0184c.m790G(charSequence, Math.max(0, i9 - 16), Math.min(charSequence.length(), i9 + 16), Integer.MAX_VALUE, true, new C2462p(i9))).f8076h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m5849c() {
        this.f8062a.readLock().lock();
        try {
            return this.f8064c;
        } finally {
            this.f8062a.readLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5850e() {
        if (!(this.f8069h == 1)) {
            C2104o.m5276A("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (m5849c() == 1) {
            return;
        }
        this.f8062a.writeLock().lock();
        try {
            if (this.f8064c == 0) {
                return;
            }
            this.f8064c = 0;
            this.f8062a.writeLock().unlock();
            C2452f c2452f = this.f8066e;
            C2455i c2455i = c2452f.f8055a;
            try {
                c2455i.f8067f.mo5845a(new C2451e(c2452f));
            } catch (Throwable th2) {
                c2455i.m5851f(th2);
            }
        } finally {
            this.f8062a.writeLock().unlock();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5851f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f8062a.writeLock().lock();
        try {
            this.f8064c = 2;
            arrayList.addAll(this.f8063b);
            this.f8063b.clear();
            this.f8062a.writeLock().unlock();
            this.f8065d.post(new RunnableC2453g(arrayList, this.f8064c, th2));
        } catch (Throwable th3) {
            this.f8062a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5852g(EditorInfo editorInfo) {
        if (m5849c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C2452f c2452f = this.f8066e;
        c2452f.getClass();
        Bundle bundle = editorInfo.extras;
        C2776b c2776b = (C2776b) c2452f.f8057c.f5520g;
        int iM6155a = c2776b.m6155a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM6155a != 0 ? ((ByteBuffer) c2776b.f9018j).getInt(iM6155a + c2776b.f9015g) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
