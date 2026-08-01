package p167;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.appcompat.app.C0108;
import androidx.collection.C0275;
import androidx.emoji2.text.flatbuffer.C2301;
import androidx.viewpager2.widget.RunnableC2548;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p034.AbstractC6344;
import p075.C6961;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7713 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static volatile C7713 f20917;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object f20918 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7709 f20919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7691 f20920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Handler f20921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile int f20922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0275 f20923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReentrantReadWriteLock f20924;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f20925;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6961 f20926;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7693 f20927;

    public C7713(C7698 c7698) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f20924 = reentrantReadWriteLock;
        this.f20922 = 3;
        InterfaceC7709 interfaceC7709 = (InterfaceC7709) c7698.f7309;
        this.f20919 = interfaceC7709;
        int i = c7698.f7310;
        this.f20925 = i;
        this.f20927 = (C7693) c7698.f7308;
        this.f20921 = new Handler(Looper.getMainLooper());
        this.f20923 = new C0275(0);
        this.f20926 = new C6961(6);
        C7691 c7691 = new C7691(this);
        this.f20920 = c7691;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f20922 = 0;
            } catch (Throwable th) {
                this.f20924.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m13013() == 0) {
            try {
                interfaceC7709.mo13007(new C7692(c7691));
            } catch (Throwable th2) {
                m13011(th2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m13009() {
        return f20917 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7713 m13010() {
        C7713 c7713;
        synchronized (f20918) {
            try {
                c7713 = f20917;
                if (!(c7713 != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c7713;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13011(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f20924.writeLock().lock();
        try {
            this.f20922 = 2;
            arrayList.addAll(this.f20923);
            this.f20923.clear();
            this.f20924.writeLock().unlock();
            this.f20921.post(new RunnableC2548(arrayList, this.f20922, th));
        } catch (Throwable th2) {
            this.f20924.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13012() {
        if (!(this.f20925 == 1)) {
            C5925.m11311("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (m13013() == 1) {
            return;
        }
        this.f20924.writeLock().lock();
        try {
            if (this.f20922 == 0) {
                return;
            }
            this.f20922 = 0;
            this.f20924.writeLock().unlock();
            C7691 c7691 = this.f20920;
            C7713 c7713 = c7691.f20875;
            try {
                c7713.f20919.mo13007(new C7692(c7691));
            } catch (Throwable th) {
                c7713.m13011(th);
            }
        } finally {
            this.f20924.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13013() {
        this.f20924.readLock().lock();
        try {
            return this.f20922;
        } finally {
            this.f20924.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13014(int i, CharSequence charSequence) {
        if (!(m13013() == 1)) {
            C5925.m11311("Not initialized yet");
            return 0;
        }
        AbstractC6344.m11870(charSequence, "charSequence cannot be null");
        C0108 c0108 = this.f20920.f20874;
        c0108.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C7700[] c7700Arr = (C7700[]) spanned.getSpans(i, i + 1, C7700.class);
            if (c7700Arr.length > 0) {
                return spanned.getSpanStart(c7700Arr[0]);
            }
        }
        return ((C7708) c0108.m373(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C7708(i))).f20910;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13015(AbstractC7710 abstractC7710) {
        AbstractC6344.m11870(abstractC7710, "initCallback cannot be null");
        this.f20924.writeLock().lock();
        try {
            if (this.f20922 == 1 || this.f20922 == 2) {
                this.f20921.post(new RunnableC2548(Arrays.asList(abstractC7710), this.f20922, (Throwable) null));
            } else {
                this.f20923.add(abstractC7710);
            }
            this.f20924.writeLock().unlock();
        } catch (Throwable th) {
            this.f20924.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #1 {all -> 0x0088, blocks: (B:36:0x0060, B:39:0x0065, B:41:0x0069, B:43:0x0076, B:50:0x0095, B:52:0x009f, B:54:0x00a2, B:56:0x00a5, B:58:0x00b5, B:59:0x00b8), top: B:95:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5 A[Catch: all -> 0x0088, TryCatch #1 {all -> 0x0088, blocks: (B:36:0x0060, B:39:0x0065, B:41:0x0069, B:43:0x0076, B:50:0x0095, B:52:0x009f, B:54:0x00a2, B:56:0x00a5, B:58:0x00b5, B:59:0x00b8), top: B:95:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7 A[Catch: all -> 0x00fd, TRY_ENTER, TryCatch #2 {all -> 0x00fd, blocks: (B:63:0x00c7, B:66:0x00cf, B:48:0x008b), top: B:97:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence m13016(int r12, int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p167.C7713.m13016(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13017(EditorInfo editorInfo) {
        if (m13013() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C7691 c7691 = this.f20920;
        c7691.getClass();
        Bundle bundle = editorInfo.extras;
        C2301 c2301 = (C2301) c7691.f20873.f1095;
        int iM4001 = c2301.m4001(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM4001 != 0 ? ((ByteBuffer) c2301.f6464).getInt(iM4001 + c2301.f6467) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
