package Yue;

import Yue.C5466;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5466 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String f13426 = "IntentSanitizer";

    /* JADX INFO: renamed from: ۥ */
    public int f1526;

    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC6749<String> f1527;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC6749<Uri> f13427;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC6749<String> f13428;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC6749<String> f13429;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public InterfaceC6749<String> f13430;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public InterfaceC6749<ComponentName> f13431;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f13432;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Map<String, InterfaceC6749<Object>> f13433;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f13434;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public InterfaceC6749<Uri> f13435;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public InterfaceC6749<ClipData> f13436;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean f13437;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean f13438;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean f13439;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۤۥ$ۥ۟ */
    @InterfaceC7113(29)
    public static class C0773 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2235(Intent intent) {
            return intent.getIdentifier();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Intent m2236(Intent intent, String str) {
            return intent.setIdentifier(str);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۤۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static class C5467 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2237(int i, ClipData.Item item, InterfaceC4144<String> interfaceC4144) {
            if (item.getHtmlText() == null && item.getIntent() == null && item.getTextLinks() == null) {
                return;
            }
            interfaceC4144.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۤۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C5468 {

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f13440 = 2112614400;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f13441 = 2015363072;

        /* JADX INFO: renamed from: ۥ */
        public int f1528;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f13447;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f13448;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean f13453;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean f13454;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean f13455;

        /* JADX INFO: renamed from: ۥ۟ */
        public InterfaceC6749<String> f1529 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥۥ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C5466.C5468.m17034((String) obj);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public InterfaceC6749<Uri> f13442 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥۦ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C5466.C5468.m17035((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public InterfaceC6749<String> f13443 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥۧ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C5466.C5468.m17036((String) obj);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public InterfaceC6749<String> f13444 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥۨ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C5466.C5468.m17037((String) obj);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public InterfaceC6749<String> f13445 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۦ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C5466.C5468.m17038((String) obj);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public InterfaceC6749<ComponentName> f13446 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۦ۟
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C5466.C5468.m17039((ComponentName) obj);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public Map<String, InterfaceC6749<Object>> f13449 = new HashMap();

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean f13450 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public InterfaceC6749<Uri> f13451 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۦ۠
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C5466.C5468.m17040((Uri) obj);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public InterfaceC6749<ClipData> f13452 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۦۡ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return C5466.C5468.m17041((ClipData) obj);
            }
        };

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ boolean m17025(ComponentName componentName) {
            return true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17026(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17027(String str, ComponentName componentName) {
            return str.equals(componentName.getPackageName());
        }

        /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m17028(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17029(Object obj) {
            return true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17030(Class cls, InterfaceC6749 interfaceC6749, Object obj) {
            return cls.isInstance(obj) && interfaceC6749.test(cls.cast(obj));
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17031(Object obj) {
            return false;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17032(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17033(String str, Uri uri) {
            return str.equals(uri.getAuthority());
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17034(String str) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m17035(Uri uri) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public static /* synthetic */ boolean m17036(String str) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17037(String str) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17038(String str) {
            return false;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17039(ComponentName componentName) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17040(Uri uri) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public static /* synthetic */ boolean m17041(ClipData clipData) {
            return false;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public C5468 m17042(@InterfaceC6391 InterfaceC6749<String> interfaceC6749) {
            C6740.m21415(interfaceC6749);
            this.f1529 = this.f1529.m21437(interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public C5468 m17043(@InterfaceC6391 String str) {
            C6740.m21415(str);
            Objects.requireNonNull(str);
            m17042(new C5470(str));
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public C5468 m17044() {
            this.f13447 = true;
            this.f13446 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥۡ
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return C5466.C5468.m17025((ComponentName) obj);
                }
            };
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public C5468 m17045(@InterfaceC6391 InterfaceC6749<String> interfaceC6749) {
            C6740.m21415(interfaceC6749);
            this.f13444 = this.f13444.m21437(interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public C5468 m17046(@InterfaceC6391 String str) {
            C6740.m21415(str);
            Objects.requireNonNull(str);
            return m17045(new C5470(str));
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public C5468 m17047(@InterfaceC6391 InterfaceC6749<ClipData> interfaceC6749) {
            C6740.m21415(interfaceC6749);
            this.f13452 = this.f13452.m21437(interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public C5468 m17048() {
            this.f13450 = true;
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public C5468 m17049(@InterfaceC6391 InterfaceC6749<Uri> interfaceC6749) {
            C6740.m21415(interfaceC6749);
            this.f13451 = this.f13451.m21437(interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public C5468 m17050(@InterfaceC6391 final String str) {
            C6740.m21415(str);
            return m17049(new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥۢ
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return C5466.C5468.m17026(str, (Uri) obj);
                }
            });
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public C5468 m17051(@InterfaceC6391 InterfaceC6749<ComponentName> interfaceC6749) {
            C6740.m21415(interfaceC6749);
            this.f13448 = true;
            this.f13446 = this.f13446.m21437(interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public C5468 m17052(@InterfaceC6391 final ComponentName componentName) {
            C6740.m21415(componentName);
            Objects.requireNonNull(componentName);
            return m17051(new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥ۠
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return componentName.equals((ComponentName) obj);
                }
            });
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public C5468 m17053(@InterfaceC6391 final String str) {
            C6740.m21415(str);
            return m17051(new InterfaceC6749() { // from class: Yue.ۥ۠ۥۤۨ
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return C5466.C5468.m17027(str, (ComponentName) obj);
                }
            });
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public C5468 m17054(@InterfaceC6391 InterfaceC6749<Uri> interfaceC6749) {
            C6740.m21415(interfaceC6749);
            this.f13442 = this.f13442.m21437(interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public C5468 m17055(@InterfaceC6391 final String str) {
            C6740.m21415(str);
            m17054(new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥ
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return C5466.C5468.m17028(str, (Uri) obj);
                }
            });
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public C5468 m17056(@InterfaceC6391 String str, @InterfaceC6391 InterfaceC6749<Object> interfaceC6749) {
            C6740.m21415(str);
            C6740.m21415(interfaceC6749);
            InterfaceC6749<Object> interfaceC67492 = this.f13449.get(str);
            if (interfaceC67492 == null) {
                interfaceC67492 = new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥۣ
                    @Override // Yue.InterfaceC6749
                    public final boolean test(Object obj) {
                        return C5466.C5468.m17031(obj);
                    }
                };
            }
            this.f13449.put(str, interfaceC67492.m21437(interfaceC6749));
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public C5468 m17057(@InterfaceC6391 String str, @InterfaceC6391 Class<?> cls) {
            return m17058(str, cls, new InterfaceC6749() { // from class: Yue.ۥ۠ۥۦۢ
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return C5466.C5468.m17029(obj);
                }
            });
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public <T> C5468 m17058(@InterfaceC6391 String str, @InterfaceC6391 final Class<T> cls, @InterfaceC6391 final InterfaceC6749<T> interfaceC6749) {
            C6740.m21415(str);
            C6740.m21415(cls);
            C6740.m21415(interfaceC6749);
            return m17056(str, new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥ۟
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return C5466.C5468.m17030(cls, interfaceC6749, obj);
                }
            });
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public C5468 m17059(@InterfaceC6391 InterfaceC6749<Uri> interfaceC6749) {
            m17058("output", Uri.class, interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public C5468 m17060(@InterfaceC6391 final String str) {
            m17058("output", Uri.class, new InterfaceC6749() { // from class: Yue.ۥ۠ۥۤۦ
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return C5466.C5468.m17032(str, (Uri) obj);
                }
            });
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public C5468 m17061(@InterfaceC6391 InterfaceC6749<Uri> interfaceC6749) {
            m17058("android.intent.extra.STREAM", Uri.class, interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public C5468 m17062(@InterfaceC6391 final String str) {
            C6740.m21415(str);
            m17058("android.intent.extra.STREAM", Uri.class, new InterfaceC6749() { // from class: Yue.ۥ۠ۥۥۤ
                @Override // Yue.InterfaceC6749
                public final boolean test(Object obj) {
                    return C5466.C5468.m17033(str, (Uri) obj);
                }
            });
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public C5468 m17063(int i) {
            this.f1528 = i | this.f1528;
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public C5468 m17064() {
            this.f1528 |= f13440;
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public C5468 m17065() {
            this.f13453 = true;
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public C5468 m17066(@InterfaceC6391 InterfaceC6749<String> interfaceC6749) {
            C6740.m21415(interfaceC6749);
            this.f13445 = this.f13445.m21437(interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public C5468 m17067(@InterfaceC6391 String str) {
            C6740.m21415(str);
            Objects.requireNonNull(str);
            return m17066(new C5470(str));
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public C5468 m17068() {
            this.f1528 |= f13441;
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public C5468 m17069() {
            this.f13454 = true;
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public C5468 m17070() {
            this.f13455 = true;
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public C5468 m17071(@InterfaceC6391 InterfaceC6749<String> interfaceC6749) {
            C6740.m21415(interfaceC6749);
            this.f13443 = this.f13443.m21437(interfaceC6749);
            return this;
        }

        @InterfaceC6391
        @SuppressLint({"BuilderSetStyle"})
        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public C5468 m17072(@InterfaceC6391 String str) {
            C6740.m21415(str);
            Objects.requireNonNull(str);
            return m17071(new C5470(str));
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C5466 m17073() {
            boolean z = this.f13447;
            if ((z && this.f13448) || (!z && !this.f13448)) {
                throw new SecurityException("You must call either allowAnyComponent or one or more of the allowComponent methods; but not both.");
            }
            C5466 c5466 = new C5466();
            c5466.f1526 = this.f1528;
            c5466.f1527 = this.f1529;
            c5466.f13427 = this.f13442;
            c5466.f13428 = this.f13443;
            c5466.f13429 = this.f13444;
            c5466.f13430 = this.f13445;
            c5466.f13432 = this.f13447;
            c5466.f13431 = this.f13446;
            c5466.f13433 = this.f13449;
            c5466.f13434 = this.f13450;
            c5466.f13435 = this.f13451;
            c5466.f13436 = this.f13452;
            c5466.f13437 = this.f13453;
            c5466.f13438 = this.f13454;
            c5466.f13439 = this.f13455;
            return c5466;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m17002(int i, ClipData.Item item, InterfaceC4144<String> interfaceC4144) {
        if (item.getHtmlText() == null && item.getIntent() == null) {
            return;
        }
        interfaceC4144.accept("ClipData item at position " + i + " contains htmlText, textLinks or intent: " + item);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m17003(String str) {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m17004(String str) {
        throw new SecurityException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m17005(@InterfaceC6391 Intent intent, Intent intent2, InterfaceC6749<ClipData> interfaceC6749, boolean z, InterfaceC6749<Uri> interfaceC67492, InterfaceC4144<String> interfaceC4144) {
        CharSequence text;
        Uri uri;
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return;
        }
        if (interfaceC6749 != null && interfaceC6749.test(clipData)) {
            intent2.setClipData(clipData);
            return;
        }
        ClipData clipData2 = null;
        for (int i = 0; i < clipData.getItemCount(); i++) {
            ClipData.Item itemAt = clipData.getItemAt(i);
            if (Build.VERSION.SDK_INT >= 31) {
                C5467.m2237(i, itemAt, interfaceC4144);
            } else {
                m17002(i, itemAt, interfaceC4144);
            }
            if (z) {
                text = itemAt.getText();
            } else {
                if (itemAt.getText() != null) {
                    interfaceC4144.accept("Item text cannot contain value. Item position: " + i + ". Text: " + ((Object) itemAt.getText()));
                }
                text = null;
            }
            if (interfaceC67492 == null) {
                if (itemAt.getUri() != null) {
                    interfaceC4144.accept("Item URI is not allowed. Item position: " + i + ". URI: " + itemAt.getUri());
                }
            } else if (itemAt.getUri() == null || interfaceC67492.test(itemAt.getUri())) {
                uri = itemAt.getUri();
                if (text == null || uri != null) {
                    if (clipData2 != null) {
                        clipData2 = new ClipData(clipData.getDescription(), new ClipData.Item(text, null, uri));
                    } else {
                        clipData2.addItem(new ClipData.Item(text, null, uri));
                    }
                }
            } else {
                interfaceC4144.accept("Item URI is not allowed. Item position: " + i + ". URI: " + itemAt.getUri());
            }
            uri = null;
            if (text == null) {
                if (clipData2 != null) {
                }
            }
        }
        if (clipData2 != null) {
            intent2.setClipData(clipData2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m17006(Intent intent, String str, Object obj) {
        if (obj == null) {
            intent.getExtras().putString(str, null);
            return;
        }
        if (obj instanceof Parcelable) {
            intent.putExtra(str, (Parcelable) obj);
            return;
        }
        if (obj instanceof Parcelable[]) {
            intent.putExtra(str, (Parcelable[]) obj);
        } else {
            if (obj instanceof Serializable) {
                intent.putExtra(str, (Serializable) obj);
                return;
            }
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Intent m17007(@InterfaceC6391 Intent intent, @InterfaceC6391 InterfaceC4144<String> interfaceC4144) {
        Intent intent2 = new Intent();
        ComponentName component = intent.getComponent();
        if ((this.f13432 && component == null) || this.f13431.test(component)) {
            intent2.setComponent(component);
        } else {
            interfaceC4144.accept("Component is not allowed: " + component);
            intent2.setComponent(new ComponentName("android", "java.lang.Void"));
        }
        String str = intent.getPackage();
        if (str == null || this.f13430.test(str)) {
            intent2.setPackage(str);
        } else {
            interfaceC4144.accept("Package is not allowed: " + str);
        }
        int flags = this.f1526 | intent.getFlags();
        int i = this.f1526;
        if (flags == i) {
            intent2.setFlags(intent.getFlags());
        } else {
            intent2.setFlags(intent.getFlags() & i);
            interfaceC4144.accept("The intent contains flags that are not allowed: 0x" + Integer.toHexString(intent.getFlags() & (~this.f1526)));
        }
        String action = intent.getAction();
        if (action == null || this.f1527.test(action)) {
            intent2.setAction(action);
        } else {
            interfaceC4144.accept("Action is not allowed: " + action);
        }
        Uri data = intent.getData();
        if (data == null || this.f13427.test(data)) {
            intent2.setData(data);
        } else {
            interfaceC4144.accept("Data is not allowed: " + data);
        }
        String type = intent.getType();
        if (type == null || this.f13428.test(type)) {
            intent2.setDataAndType(intent2.getData(), type);
        } else {
            interfaceC4144.accept("Type is not allowed: " + type);
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            for (String str2 : categories) {
                if (this.f13429.test(str2)) {
                    intent2.addCategory(str2);
                } else {
                    interfaceC4144.accept("Category is not allowed: " + str2);
                }
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str3 : extras.keySet()) {
                if (str3.equals("android.intent.extra.STREAM") && (this.f1526 & 1) == 0) {
                    interfaceC4144.accept("Allowing Extra Stream requires also allowing at least  FLAG_GRANT_READ_URI_PERMISSION Flag.");
                } else if (!str3.equals("output") || ((~this.f1526) & 3) == 0) {
                    Object obj = extras.get(str3);
                    InterfaceC6749<Object> interfaceC6749 = this.f13433.get(str3);
                    if (interfaceC6749 == null || !interfaceC6749.test(obj)) {
                        interfaceC4144.accept("Extra is not allowed. Key: " + str3 + ". Value: " + obj);
                    } else {
                        m17006(intent2, str3, obj);
                    }
                } else {
                    interfaceC4144.accept("Allowing Extra Output requires also allowing FLAG_GRANT_READ_URI_PERMISSION and FLAG_GRANT_WRITE_URI_PERMISSION Flags.");
                }
            }
        }
        m17005(intent, intent2, this.f13436, this.f13434, this.f13435, interfaceC4144);
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.f13437) {
                C0773.m2236(intent2, C0773.m2235(intent));
            } else if (C0773.m2235(intent) != null) {
                interfaceC4144.accept("Identifier is not allowed: " + C0773.m2235(intent));
            }
        }
        if (this.f13438) {
            intent2.setSelector(intent.getSelector());
        } else if (intent.getSelector() != null) {
            interfaceC4144.accept("Selector is not allowed: " + intent.getSelector());
        }
        if (this.f13439) {
            intent2.setSourceBounds(intent.getSourceBounds());
        } else if (intent.getSourceBounds() != null) {
            interfaceC4144.accept("SourceBounds is not allowed: " + intent.getSourceBounds());
        }
        return intent2;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Intent m17008(@InterfaceC6391 Intent intent) {
        return m17007(intent, new InterfaceC4144() { // from class: Yue.ۥ۠ۥۤۤ
            @Override // Yue.InterfaceC4144
            public final void accept(Object obj) {
                C5466.m17003((String) obj);
            }
        });
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Intent m17009(@InterfaceC6391 Intent intent) {
        return m17007(intent, new InterfaceC4144() { // from class: Yue.ۥ۠ۥۣۤ
            @Override // Yue.InterfaceC4144
            public final void accept(Object obj) {
                C5466.m17004((String) obj);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5466() {
    }
}
