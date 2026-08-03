package androidx.emoji2.text;

import Yue.AbstractC4622;
import Yue.C3399;
import Yue.C4613;
import Yue.C6740;
import Yue.C8033;
import Yue.C8034;
import Yue.InterfaceC3262;
import Yue.InterfaceC3809;
import Yue.InterfaceC3897;
import Yue.InterfaceC5225;
import Yue.InterfaceC5459;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C1668;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3262
public class C8812 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f29495 = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f29496 = "android.support.text.emoji.emojiCompat_replaceAll";

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f29497 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f29498 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f29499 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f29500 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f29501 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f29502 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f29503 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f29504 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f29505 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f29506 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f29507 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f29508 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static final int f29509 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final Object f29510 = new Object();

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final Object f29511 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @InterfaceC5225("INSTANCE_LOCK")
    @InterfaceC6490
    public static volatile C8812 f29512 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    @InterfaceC5225("CONFIG_LOCK")
    public static volatile boolean f29513 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final String f29514 = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    @InterfaceC5225("mInitLock")
    public final Set<AbstractC8818> f3765;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final C8814 f29517;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public final InterfaceC8821 f29518;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6391
    public final InterfaceC8824 f29519;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean f29520;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean f29521;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC6490
    public final int[] f29522;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean f29523;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final int f29524;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int f29525;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final InterfaceC8817 f29526;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final ReadWriteLock f3764 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC5225("mInitLock")
    public volatile int f29515 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final Handler f29516 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1670 {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟ */
    @InterfaceC7113(19)
    public static final class C1671 extends C8814 {

        /* JADX INFO: renamed from: ۥ۟ */
        public volatile C8825 f3766;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public volatile C8833 f29527;

        /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟$ۥ, reason: contains not printable characters */
        public class C8813 extends AbstractC8822 {
            public C8813() {
            }

            @Override // androidx.emoji2.text.C8812.AbstractC8822
            /* JADX INFO: renamed from: ۥ */
            public void mo4772(@InterfaceC6490 Throwable th) {
                C1671.this.f3768.m29639(th);
            }

            @Override // androidx.emoji2.text.C8812.AbstractC8822
            /* JADX INFO: renamed from: ۥ۟ */
            public void mo4773(@InterfaceC6391 C8833 c8833) {
                C1671.this.m29655(c8833);
            }
        }

        public C1671(C8812 c8812) {
            super(c8812);
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥ */
        public String mo4783() {
            String strM19167 = this.f29527.m29700().m19167();
            return strM19167 == null ? "" : strM19167;
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥ۟ */
        public int mo4784(@InterfaceC6391 CharSequence charSequence, int i) {
            return this.f3766.m4789(charSequence, i);
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo29648(CharSequence charSequence, int i) {
            return this.f3766.m29670(charSequence, i);
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int mo29649(@InterfaceC6391 CharSequence charSequence, int i) {
            return this.f3766.m29671(charSequence, i);
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo29650(@InterfaceC6391 CharSequence charSequence) {
            return this.f3766.m29669(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean mo29651(@InterfaceC6391 CharSequence charSequence, int i) {
            return this.f3766.m29670(charSequence, i) == 1;
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo29652() {
            try {
                this.f3768.f29518.mo4771(new C8813());
            } catch (Throwable th) {
                this.f3768.m29639(th);
            }
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public CharSequence mo29653(@InterfaceC6391 CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f3766.m29674(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.C8812.C8814
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo29654(@InterfaceC6391 EditorInfo editorInfo) {
            editorInfo.extras.putInt(C8812.f29495, this.f29527.m29701());
            editorInfo.extras.putBoolean(C8812.f29496, this.f3768.f29520);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m29655(@InterfaceC6391 C8833 c8833) {
            if (c8833 == null) {
                this.f3768.m29639(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f29527 = c8833;
            C8833 c88332 = this.f29527;
            InterfaceC8824 interfaceC8824 = this.f3768.f29519;
            InterfaceC8817 interfaceC8817 = this.f3768.f29526;
            C8812 c8812 = this.f3768;
            this.f3766 = new C8825(c88332, interfaceC8824, interfaceC8817, c8812.f29521, c8812.f29522, C4613.m1566());
            this.f3768.m29640();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟, reason: contains not printable characters */
    public static class C8814 {

        /* JADX INFO: renamed from: ۥ */
        public final C8812 f3768;

        public C8814(C8812 c8812) {
            this.f3768 = c8812;
        }

        /* JADX INFO: renamed from: ۥ */
        public String mo4783() {
            return "";
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int mo4784(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i) {
            return -1;
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo29648(CharSequence charSequence, int i) {
            return 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public int mo29649(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i) {
            return -1;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo29650(@InterfaceC6391 CharSequence charSequence) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public boolean mo29651(@InterfaceC6391 CharSequence charSequence, int i) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo29652() {
            this.f3768.m29640();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public CharSequence mo29653(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, @InterfaceC5459(from = 0) int i3, boolean z) {
            return charSequence;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo29654(@InterfaceC6391 EditorInfo editorInfo) {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8815 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final InterfaceC8821 f3769;

        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC8824 f3770;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29528;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29529;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public int[] f29530;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC6490
        public Set<AbstractC8818> f29531;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f29532;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f29533 = -16711936;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f29534 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        @InterfaceC6391
        public InterfaceC8817 f29535 = new C1669();

        public AbstractC8815(@InterfaceC6391 InterfaceC8821 interfaceC8821) {
            C6740.m21416(interfaceC8821, "metadataLoader cannot be null.");
            this.f3769 = interfaceC8821;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC8821 m4785() {
            return this.f3769;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public AbstractC8815 m4786(@InterfaceC6391 AbstractC8818 abstractC8818) {
            C6740.m21416(abstractC8818, "initCallback cannot be null");
            if (this.f29531 == null) {
                this.f29531 = new C3399();
            }
            this.f29531.add(abstractC8818);
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public AbstractC8815 m29656(@InterfaceC3897 int i) {
            this.f29533 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public AbstractC8815 m29657(boolean z) {
            this.f29532 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public AbstractC8815 m29658(@InterfaceC6391 InterfaceC8817 interfaceC8817) {
            C6740.m21416(interfaceC8817, "GlyphChecker cannot be null");
            this.f29535 = interfaceC8817;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public AbstractC8815 m29659(int i) {
            this.f29534 = i;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public AbstractC8815 m29660(boolean z) {
            this.f29528 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public AbstractC8815 m29661(@InterfaceC6391 InterfaceC8824 interfaceC8824) {
            this.f3770 = interfaceC8824;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public AbstractC8815 m29662(boolean z) {
            return m29663(z, null);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public AbstractC8815 m29663(boolean z, @InterfaceC6490 List<Integer> list) {
            this.f29529 = z;
            if (!z || list == null) {
                this.f29530 = null;
            } else {
                this.f29530 = new int[list.size()];
                Iterator<Integer> it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    this.f29530[i] = it.next().intValue();
                    i++;
                }
                Arrays.sort(this.f29530);
            }
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public AbstractC8815 m29664(@InterfaceC6391 AbstractC8818 abstractC8818) {
            C6740.m21416(abstractC8818, "initCallback cannot be null");
            Set<AbstractC8818> set = this.f29531;
            if (set != null) {
                set.remove(abstractC8818);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static class C8816 implements InterfaceC8824 {
        @Override // androidx.emoji2.text.C8812.InterfaceC8824
        @InterfaceC6391
        @InterfaceC7113(19)
        /* JADX INFO: renamed from: ۥ */
        public AbstractC4622 mo4787(@InterfaceC6391 C8033 c8033) {
            return new C8034(c8033);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceC8817 {
        /* JADX INFO: renamed from: ۥ */
        boolean mo4780(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, @InterfaceC5459(from = 0) int i3);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static abstract class AbstractC8818 {
        /* JADX INFO: renamed from: ۥ */
        public void mo3791(@InterfaceC6490 Throwable th) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1574() {
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class RunnableC8819 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final List<AbstractC8818> f29536;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final Throwable f29537;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final int f29538;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RunnableC8819(@InterfaceC6391 AbstractC8818 abstractC8818, int i) {
            this(Arrays.asList((AbstractC8818) C6740.m21416(abstractC8818, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f29536.size();
            int i = 0;
            if (this.f29538 != 1) {
                while (i < size) {
                    this.f29536.get(i).mo3791(this.f29537);
                    i++;
                }
            } else {
                while (i < size) {
                    this.f29536.get(i).mo1574();
                    i++;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public RunnableC8819(@InterfaceC6391 Collection<AbstractC8818> collection, int i) {
            this(collection, i, null);
        }

        public RunnableC8819(@InterfaceC6391 Collection<AbstractC8818> collection, int i, @InterfaceC6490 Throwable th) {
            C6740.m21416(collection, "initCallbacks cannot be null");
            this.f29536 = new ArrayList(collection);
            this.f29538 = i;
            this.f29537 = th;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8820 {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC8821 {
        /* JADX INFO: renamed from: ۥ */
        void mo4771(@InterfaceC6391 AbstractC8822 abstractC8822);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static abstract class AbstractC8822 {
        /* JADX INFO: renamed from: ۥ */
        public abstract void mo4772(@InterfaceC6490 Throwable th);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract void mo4773(@InterfaceC6391 C8833 c8833);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8823 {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.ۥ۟۟$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public interface InterfaceC8824 {
        @InterfaceC6391
        @InterfaceC7113(19)
        /* JADX INFO: renamed from: ۥ */
        AbstractC4622 mo4787(@InterfaceC6391 C8033 c8033);
    }

    public C8812(@InterfaceC6391 AbstractC8815 abstractC8815) {
        this.f29520 = abstractC8815.f29528;
        this.f29521 = abstractC8815.f29529;
        this.f29522 = abstractC8815.f29530;
        this.f29523 = abstractC8815.f29532;
        this.f29524 = abstractC8815.f29533;
        this.f29518 = abstractC8815.f3769;
        this.f29525 = abstractC8815.f29534;
        this.f29526 = abstractC8815.f29535;
        C3399 c3399 = new C3399();
        this.f3765 = c3399;
        InterfaceC8824 interfaceC8824 = abstractC8815.f3770;
        this.f29519 = interfaceC8824 == null ? new C8816() : interfaceC8824;
        Set<AbstractC8818> set = abstractC8815.f29531;
        if (set != null && !set.isEmpty()) {
            c3399.addAll(abstractC8815.f29531);
        }
        this.f29517 = new C1671(this);
        m29638();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C8812 m29617() {
        C8812 c8812;
        synchronized (f29510) {
            c8812 = f29512;
            C6740.m21418(c8812 != null, f29514);
        }
        return c8812;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static boolean m29618(@InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 Editable editable, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, boolean z) {
        return C8825.m29665(inputConnection, editable, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m29619(@InterfaceC6391 Editable editable, int i, @InterfaceC6391 KeyEvent keyEvent) {
        return C8825.m29666(editable, i, keyEvent);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static C8812 m29620(@InterfaceC6391 Context context) {
        return m29621(context, null);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static C8812 m29621(@InterfaceC6391 Context context, @InterfaceC6490 C1668.C8808 c8808) {
        C8812 c8812;
        if (f29513) {
            return f29512;
        }
        if (c8808 == null) {
            c8808 = new C1668.C8808(null);
        }
        AbstractC8815 abstractC8815M29611 = c8808.m29611(context);
        synchronized (f29511) {
            try {
                if (!f29513) {
                    if (abstractC8815M29611 != null) {
                        m29622(abstractC8815M29611);
                    }
                    f29513 = true;
                }
                c8812 = f29512;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c8812;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static C8812 m29622(@InterfaceC6391 AbstractC8815 abstractC8815) {
        C8812 c8812 = f29512;
        if (c8812 == null) {
            synchronized (f29510) {
                try {
                    c8812 = f29512;
                    if (c8812 == null) {
                        c8812 = new C8812(abstractC8815);
                        f29512 = c8812;
                    }
                } finally {
                }
            }
        }
        return c8812;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m29623() {
        return f29512 != null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static C8812 m29624(@InterfaceC6391 AbstractC8815 abstractC8815) {
        C8812 c8812;
        synchronized (f29510) {
            c8812 = new C8812(abstractC8815);
            f29512 = c8812;
        }
        return c8812;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.TESTS})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static C8812 m29625(@InterfaceC6490 C8812 c8812) {
        C8812 c88122;
        synchronized (f29510) {
            f29512 = c8812;
            c88122 = f29512;
        }
        return c88122;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.TESTS})
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m29626(boolean z) {
        synchronized (f29511) {
            f29513 = z;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m29627() {
        C6740.m21418(m29636(), "Not initialized yet");
        return this.f29517.mo4783();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m29628(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i) {
        return this.f29517.mo4784(charSequence, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m29629(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i) {
        C6740.m21418(m29636(), "Not initialized yet");
        C6740.m21416(charSequence, "sequence cannot be null");
        return this.f29517.mo29648(charSequence, i);
    }

    @InterfaceC3897
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m29630() {
        return this.f29524;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int m29631(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i) {
        return this.f29517.mo29649(charSequence, i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m29632() {
        this.f3764.readLock().lock();
        try {
            return this.f29515;
        } finally {
            this.f3764.readLock().unlock();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m29633(@InterfaceC6391 CharSequence charSequence) {
        C6740.m21418(m29636(), "Not initialized yet");
        C6740.m21416(charSequence, "sequence cannot be null");
        return this.f29517.mo29650(charSequence);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m29634(@InterfaceC6391 CharSequence charSequence, @InterfaceC5459(from = 0) int i) {
        C6740.m21418(m29636(), "Not initialized yet");
        C6740.m21416(charSequence, "sequence cannot be null");
        return this.f29517.mo29651(charSequence, i);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m29635() {
        return this.f29523;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m29636() {
        return m29632() == 1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29637() {
        C6740.m21418(this.f29525 == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m29636()) {
            return;
        }
        this.f3764.writeLock().lock();
        try {
            if (this.f29515 == 0) {
                return;
            }
            this.f29515 = 0;
            this.f3764.writeLock().unlock();
            this.f29517.mo29652();
        } finally {
            this.f3764.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m29638() {
        this.f3764.writeLock().lock();
        try {
            if (this.f29525 == 0) {
                this.f29515 = 0;
            }
            this.f3764.writeLock().unlock();
            if (m29632() == 0) {
                this.f29517.mo29652();
            }
        } catch (Throwable th) {
            this.f3764.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m29639(@InterfaceC6490 Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3764.writeLock().lock();
        try {
            this.f29515 = 2;
            arrayList.addAll(this.f3765);
            this.f3765.clear();
            this.f3764.writeLock().unlock();
            this.f29516.post(new RunnableC8819(arrayList, this.f29515, th));
        } catch (Throwable th2) {
            this.f3764.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m29640() {
        ArrayList arrayList = new ArrayList();
        this.f3764.writeLock().lock();
        try {
            this.f29515 = 1;
            arrayList.addAll(this.f3765);
            this.f3765.clear();
            this.f3764.writeLock().unlock();
            this.f29516.post(new RunnableC8819(arrayList, this.f29515));
        } catch (Throwable th) {
            this.f3764.writeLock().unlock();
            throw th;
        }
    }

    @InterfaceC3809
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public CharSequence m29641(@InterfaceC6490 CharSequence charSequence) {
        return m29642(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @InterfaceC3809
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public CharSequence m29642(@InterfaceC6490 CharSequence charSequence, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2) {
        return m29643(charSequence, i, i2, Integer.MAX_VALUE);
    }

    @InterfaceC3809
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public CharSequence m29643(@InterfaceC6490 CharSequence charSequence, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, @InterfaceC5459(from = 0) int i3) {
        return m29644(charSequence, i, i2, i3, 0);
    }

    @InterfaceC3809
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public CharSequence m29644(@InterfaceC6490 CharSequence charSequence, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, @InterfaceC5459(from = 0) int i3, int i4) {
        boolean z;
        C6740.m21418(m29636(), "Not initialized yet");
        C6740.m21413(i, "start cannot be negative");
        C6740.m21413(i2, "end cannot be negative");
        C6740.m21413(i3, "maxEmojiCount cannot be negative");
        C6740.m3227(i <= i2, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        C6740.m3227(i <= charSequence.length(), "start should be < than charSequence length");
        C6740.m3227(i2 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        if (i4 != 1) {
            z = i4 != 2 ? this.f29520 : false;
        } else {
            z = true;
        }
        return this.f29517.mo29653(charSequence, i, i2, i3, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m29645(@InterfaceC6391 AbstractC8818 abstractC8818) {
        C6740.m21416(abstractC8818, "initCallback cannot be null");
        this.f3764.writeLock().lock();
        try {
            if (this.f29515 == 1 || this.f29515 == 2) {
                this.f29516.post(new RunnableC8819(abstractC8818, this.f29515));
            } else {
                this.f3765.add(abstractC8818);
            }
            this.f3764.writeLock().unlock();
        } catch (Throwable th) {
            this.f3764.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m29646(@InterfaceC6391 AbstractC8818 abstractC8818) {
        C6740.m21416(abstractC8818, "initCallback cannot be null");
        this.f3764.writeLock().lock();
        try {
            this.f3765.remove(abstractC8818);
        } finally {
            this.f3764.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m29647(@InterfaceC6391 EditorInfo editorInfo) {
        if (!m29636() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f29517.mo29654(editorInfo);
    }
}
