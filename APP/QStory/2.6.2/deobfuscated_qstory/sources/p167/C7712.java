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
import p053.AbstractC6560;
import p075.C6960;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7712 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static volatile C7712 f20922;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object f20923 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7708 f20924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7690 f20925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Handler f20926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile int f20927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0275 f20928;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReentrantReadWriteLock f20929;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f20930;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6960 f20931;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C7692 f20932;

    public C7712(C7697 c7697) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f20929 = reentrantReadWriteLock;
        this.f20927 = 3;
        InterfaceC7708 interfaceC7708 = (InterfaceC7708) c7697.f7308;
        this.f20924 = interfaceC7708;
        int i = c7697.f7309;
        this.f20930 = i;
        this.f20932 = (C7692) c7697.f7307;
        this.f20926 = new Handler(Looper.getMainLooper());
        this.f20928 = new C0275(0);
        this.f20931 = new C6960(6);
        C7690 c7690 = new C7690(this);
        this.f20925 = c7690;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f20927 = 0;
            } catch (Throwable th) {
                this.f20929.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m12983() == 0) {
            try {
                interfaceC7708.mo12977(new C7691(c7690));
            } catch (Throwable th2) {
                m12981(th2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m12979() {
        return f20922 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7712 m12980() {
        C7712 c7712;
        synchronized (f20923) {
            try {
                c7712 = f20922;
                if (!(c7712 != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c7712;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12981(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f20929.writeLock().lock();
        try {
            this.f20927 = 2;
            arrayList.addAll(this.f20928);
            this.f20928.clear();
            this.f20929.writeLock().unlock();
            this.f20926.post(new RunnableC2548(arrayList, this.f20927, th));
        } catch (Throwable th2) {
            this.f20929.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m12982() {
        if (!(this.f20930 == 1)) {
            C5919.m11250("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (m12983() == 1) {
            return;
        }
        this.f20929.writeLock().lock();
        try {
            if (this.f20927 == 0) {
                return;
            }
            this.f20927 = 0;
            this.f20929.writeLock().unlock();
            C7690 c7690 = this.f20925;
            C7712 c7712 = c7690.f20880;
            try {
                c7712.f20924.mo12977(new C7691(c7690));
            } catch (Throwable th) {
                c7712.m12981(th);
            }
        } finally {
            this.f20929.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m12983() {
        this.f20929.readLock().lock();
        try {
            return this.f20927;
        } finally {
            this.f20929.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12984(int i, CharSequence charSequence) {
        if (!(m12983() == 1)) {
            C5919.m11250("Not initialized yet");
            return 0;
        }
        AbstractC6560.m12036(charSequence, "charSequence cannot be null");
        C0108 c0108 = this.f20925.f20879;
        c0108.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C7699[] c7699Arr = (C7699[]) spanned.getSpans(i, i + 1, C7699.class);
            if (c7699Arr.length > 0) {
                return spanned.getSpanStart(c7699Arr[0]);
            }
        }
        return ((C7707) c0108.m372(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C7707(i))).f20915;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12985(AbstractC7709 abstractC7709) {
        AbstractC6560.m12036(abstractC7709, "initCallback cannot be null");
        this.f20929.writeLock().lock();
        try {
            if (this.f20927 == 1 || this.f20927 == 2) {
                this.f20926.post(new RunnableC2548(Arrays.asList(abstractC7709), this.f20927, (Throwable) null));
            } else {
                this.f20928.add(abstractC7709);
            }
            this.f20929.writeLock().unlock();
        } catch (Throwable th) {
            this.f20929.writeLock().unlock();
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
    public final java.lang.CharSequence m12986(int r12, int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p167.C7712.m12986(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m12987(EditorInfo editorInfo) {
        if (m12983() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C7690 c7690 = this.f20925;
        c7690.getClass();
        Bundle bundle = editorInfo.extras;
        C2301 c2301 = (C2301) c7690.f20878.f1095;
        int iM3991 = c2301.m3991(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM3991 != 0 ? ((ByteBuffer) c2301.f6463).getInt(iM3991 + c2301.f6466) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
