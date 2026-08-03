package p000a;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: a.W3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0401W3 {

    /* JADX INFO: renamed from: a */
    public final e f1528a;

    /* JADX INFO: renamed from: a.W3$a */
    public static final class a implements b {

        /* JADX INFO: renamed from: a */
        public final ContentInfo.Builder f1529a;

        public a(ClipData clipData, int i) {
            this.f1529a = C0833t2.m1937e(clipData, i);
        }

        @Override // p000a.C0401W3.b
        /* JADX INFO: renamed from: a */
        public final C0401W3 mo1041a() {
            return new C0401W3(new d(this.f1529a.build()));
        }

        @Override // p000a.C0401W3.b
        /* JADX INFO: renamed from: b */
        public final void mo1042b(Uri uri) {
            this.f1529a.setLinkUri(uri);
        }

        @Override // p000a.C0401W3.b
        /* JADX INFO: renamed from: c */
        public final void mo1043c(int i) {
            this.f1529a.setFlags(i);
        }

        @Override // p000a.C0401W3.b
        public final void setExtras(Bundle bundle) {
            this.f1529a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: a.W3$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        C0401W3 mo1041a();

        /* JADX INFO: renamed from: b */
        void mo1042b(Uri uri);

        /* JADX INFO: renamed from: c */
        void mo1043c(int i);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: a.W3$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public ClipData f1530a;

        /* JADX INFO: renamed from: b */
        public int f1531b;

        /* JADX INFO: renamed from: c */
        public int f1532c;

        /* JADX INFO: renamed from: d */
        public Uri f1533d;

        /* JADX INFO: renamed from: e */
        public Bundle f1534e;

        @Override // p000a.C0401W3.b
        /* JADX INFO: renamed from: a */
        public final C0401W3 mo1041a() {
            return new C0401W3(new f(this));
        }

        @Override // p000a.C0401W3.b
        /* JADX INFO: renamed from: b */
        public final void mo1042b(Uri uri) {
            this.f1533d = uri;
        }

        @Override // p000a.C0401W3.b
        /* JADX INFO: renamed from: c */
        public final void mo1043c(int i) {
            this.f1532c = i;
        }

        @Override // p000a.C0401W3.b
        public final void setExtras(Bundle bundle) {
            this.f1534e = bundle;
        }
    }

    /* JADX INFO: renamed from: a.W3$d */
    public static final class d implements e {

        /* JADX INFO: renamed from: a */
        public final ContentInfo f1535a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f1535a = C0833t2.m1939g(contentInfo);
        }

        @Override // p000a.C0401W3.e
        /* JADX INFO: renamed from: a */
        public final ClipData mo1044a() {
            return this.f1535a.getClip();
        }

        @Override // p000a.C0401W3.e
        /* JADX INFO: renamed from: b */
        public final int mo1045b() {
            return this.f1535a.getFlags();
        }

        @Override // p000a.C0401W3.e
        /* JADX INFO: renamed from: c */
        public final ContentInfo mo1046c() {
            return this.f1535a;
        }

        @Override // p000a.C0401W3.e
        /* JADX INFO: renamed from: d */
        public final int mo1047d() {
            return this.f1535a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f1535a + "}";
        }
    }

    /* JADX INFO: renamed from: a.W3$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        ClipData mo1044a();

        /* JADX INFO: renamed from: b */
        int mo1045b();

        /* JADX INFO: renamed from: c */
        ContentInfo mo1046c();

        /* JADX INFO: renamed from: d */
        int mo1047d();
    }

    /* JADX INFO: renamed from: a.W3$f */
    public static final class f implements e {

        /* JADX INFO: renamed from: a */
        public final ClipData f1536a;

        /* JADX INFO: renamed from: b */
        public final int f1537b;

        /* JADX INFO: renamed from: c */
        public final int f1538c;

        /* JADX INFO: renamed from: d */
        public final Uri f1539d;

        /* JADX INFO: renamed from: e */
        public final Bundle f1540e;

        public f(c cVar) {
            ClipData clipData = cVar.f1530a;
            clipData.getClass();
            this.f1536a = clipData;
            int i = cVar.f1531b;
            if (i < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
            }
            if (i > 5) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
            }
            this.f1537b = i;
            int i2 = cVar.f1532c;
            if ((i2 & 1) == i2) {
                this.f1538c = i2;
                this.f1539d = cVar.f1533d;
                this.f1540e = cVar.f1534e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // p000a.C0401W3.e
        /* JADX INFO: renamed from: a */
        public final ClipData mo1044a() {
            return this.f1536a;
        }

        @Override // p000a.C0401W3.e
        /* JADX INFO: renamed from: b */
        public final int mo1045b() {
            return this.f1538c;
        }

        @Override // p000a.C0401W3.e
        /* JADX INFO: renamed from: c */
        public final ContentInfo mo1046c() {
            return null;
        }

        @Override // p000a.C0401W3.e
        /* JADX INFO: renamed from: d */
        public final int mo1047d() {
            return this.f1537b;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f1536a.getDescription());
            sb.append(", source=");
            int i = this.f1537b;
            sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            sb.append(", flags=");
            int i2 = this.f1538c;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.f1539d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return C0944z.m2228h(sb, this.f1540e != null ? ", hasExtras" : "", "}");
        }
    }

    public C0401W3(e eVar) {
        this.f1528a = eVar;
    }

    public final String toString() {
        return this.f1528a.toString();
    }
}
