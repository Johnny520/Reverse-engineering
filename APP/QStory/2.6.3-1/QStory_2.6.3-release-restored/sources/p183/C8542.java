package p183;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.appcompat.app.C0955;
import androidx.collection.C1122;
import androidx.emoji2.text.flatbuffer.C3134;
import androidx.viewpager2.widget.RunnableC3381;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p050.AbstractC7173;
import p091.C7790;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static volatile C8542 f21262;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object f21263 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC8538 f21264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8520 f21265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Handler f21266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public volatile int f21267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1122 f21268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ReentrantReadWriteLock f21269;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f21270;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C7790 f21271;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8522 f21272;

    public C8542(C8527 c8527) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f21269 = reentrantReadWriteLock;
        this.f21267 = 3;
        InterfaceC8538 interfaceC8538 = (InterfaceC8538) c8527.f7654;
        this.f21264 = interfaceC8538;
        int i = c8527.f7655;
        this.f21270 = i;
        this.f21272 = (C8522) c8527.f7653;
        this.f21266 = new Handler(Looper.getMainLooper());
        this.f21268 = new C1122(0);
        this.f21271 = new C7790(6);
        C8520 c8520 = new C8520(this);
        this.f21265 = c8520;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f21267 = 0;
            } catch (Throwable th) {
                this.f21269.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m13572() == 0) {
            try {
                interfaceC8538.mo13566(new C8521(c8520));
            } catch (Throwable th2) {
                m13570(th2);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m13568() {
        return f21262 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8542 m13569() {
        C8542 c8542;
        synchronized (f21263) {
            try {
                c8542 = f21262;
                if (!(c8542 != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c8542;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13570(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f21269.writeLock().lock();
        try {
            this.f21267 = 2;
            arrayList.addAll(this.f21268);
            this.f21268.clear();
            this.f21269.writeLock().unlock();
            this.f21266.post(new RunnableC3381(arrayList, this.f21267, th));
        } catch (Throwable th2) {
            this.f21269.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13571() {
        if (!(this.f21270 == 1)) {
            C6755.m11870("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (m13572() == 1) {
            return;
        }
        this.f21269.writeLock().lock();
        try {
            if (this.f21267 == 0) {
                return;
            }
            this.f21267 = 0;
            this.f21269.writeLock().unlock();
            C8520 c8520 = this.f21265;
            C8542 c8542 = c8520.f21220;
            try {
                c8542.f21264.mo13566(new C8521(c8520));
            } catch (Throwable th) {
                c8542.m13570(th);
            }
        } finally {
            this.f21269.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m13572() {
        this.f21269.readLock().lock();
        try {
            return this.f21267;
        } finally {
            this.f21269.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13573(int i, CharSequence charSequence) {
        if (!(m13572() == 1)) {
            C6755.m11870("Not initialized yet");
            return 0;
        }
        AbstractC7173.m12429(charSequence, "charSequence cannot be null");
        C0955 c0955 = this.f21265.f21219;
        c0955.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C8529[] c8529Arr = (C8529[]) spanned.getSpans(i, i + 1, C8529.class);
            if (c8529Arr.length > 0) {
                return spanned.getSpanStart(c8529Arr[0]);
            }
        }
        return ((C8537) c0955.m933(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C8537(i))).f21255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13574(AbstractC8539 abstractC8539) {
        AbstractC7173.m12429(abstractC8539, "initCallback cannot be null");
        this.f21269.writeLock().lock();
        try {
            if (this.f21267 == 1 || this.f21267 == 2) {
                this.f21266.post(new RunnableC3381(Arrays.asList(abstractC8539), this.f21267, (Throwable) null));
            } else {
                this.f21268.add(abstractC8539);
            }
            this.f21269.writeLock().unlock();
        } catch (Throwable th) {
            this.f21269.writeLock().unlock();
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
    */
    public final CharSequence m13575(int i, int i2, int i3, CharSequence charSequence) {
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        C8529[] c8529Arr;
        C8518 c8518 = null;
        if (!(m13572() == 1)) {
            C6755.m11870("Not initialized yet");
            return null;
        }
        if (i < 0) {
            C6755.m11869("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            C6755.m11869("end cannot be negative");
            return null;
        }
        AbstractC7173.m12431("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        AbstractC7173.m12431("start should be < than charSequence length", i <= charSequence.length());
        AbstractC7173.m12431("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        C0955 c0955 = this.f21265.f21219;
        c0955.getClass();
        boolean z2 = charSequence instanceof C8531;
        if (z2) {
            ((C8531) charSequence).m13560();
        }
        if (z2) {
            c8518 = new C8518((Spannable) charSequence);
            if (c8518 != null) {
            }
            i4 = i;
            i5 = i2;
            if (i4 == i5) {
            }
            ((C8531) charSequence2).m13559();
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C8529.class) <= i2) {
                    c8518 = new C8518();
                    c8518.f21217 = false;
                    c8518.f21216 = new SpannableString(charSequence);
                }
                if (c8518 != null) {
                    while (i < r0) {
                    }
                }
                i4 = i;
                i5 = i2;
                if (i4 == i5) {
                    charSequence2 = charSequence;
                    if (!z2) {
                    }
                }
                ((C8531) charSequence2).m13559();
                return charSequence2;
            }
            try {
                c8518 = new C8518((Spannable) charSequence);
                if (c8518 != null && (c8529Arr = (C8529[]) c8518.f21216.getSpans(i, i2, C8529.class)) != null && c8529Arr.length > 0) {
                    for (C8529 c8529 : c8529Arr) {
                        int spanStart = c8518.f21216.getSpanStart(c8529);
                        int spanEnd = c8518.f21216.getSpanEnd(c8529);
                        if (spanStart != i2) {
                            c8518.removeSpan(c8529);
                        }
                        i = Math.min(spanStart, i);
                        i2 = Math.max(spanEnd, i2);
                    }
                }
                i4 = i;
                i5 = i2;
                if (i4 == i5 || i4 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (!z2) {
                        return charSequence2;
                    }
                } else {
                    charSequence2 = charSequence;
                    try {
                        C8518 c85182 = (C8518) c0955.m933(charSequence2, i4, i5, Integer.MAX_VALUE, z, new C5703(c8518, 21, (C7790) c0955.f664));
                        if (c85182 != null) {
                            Spannable spannable = c85182.f21216;
                            if (z2) {
                                ((C8531) charSequence2).m13559();
                            }
                            return spannable;
                        }
                        if (!z2) {
                            return charSequence2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z2) {
                        }
                    }
                }
                ((C8531) charSequence2).m13559();
                return charSequence2;
            } catch (Throwable th3) {
                th = th3;
                charSequence2 = charSequence;
                th = th;
                if (!z2) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((C8531) charSequence2).m13559();
        throw th;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13576(EditorInfo editorInfo) {
        if (m13572() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        C8520 c8520 = this.f21265;
        c8520.getClass();
        Bundle bundle = editorInfo.extras;
        C3134 c3134 = (C3134) c8520.f21218.f1440;
        int iM4561 = c3134.m4561(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM4561 != 0 ? ((ByteBuffer) c3134.f6809).getInt(iM4561 + c3134.f6812) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
