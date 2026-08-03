package Yue;

import Yue.InterfaceC7144;
import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6659 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f17100 = "name";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f17101 = "icon";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f17102 = "uri";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f17103 = "key";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f17104 = "isBot";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f17105 = "isImportant";

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public CharSequence f2214;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6490
    public IconCompat f2215;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public String f17106;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public String f17107;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f17108;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f17109;

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۥ$ۥ */
    @InterfaceC7113(22)
    public static class C1048 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static C6659 m3141(PersistableBundle persistableBundle) {
            return new C6660().m21293(persistableBundle.getString("name")).m21294(persistableBundle.getString("uri")).m21292(persistableBundle.getString(C6659.f17103)).m3146(persistableBundle.getBoolean(C6659.f17104)).m21291(persistableBundle.getBoolean(C6659.f17105)).m3145();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static PersistableBundle m3142(C6659 c6659) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = c6659.f2214;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", c6659.f17106);
            persistableBundle.putString(C6659.f17103, c6659.f17107);
            persistableBundle.putBoolean(C6659.f17104, c6659.f17108);
            persistableBundle.putBoolean(C6659.f17105, c6659.f17109);
            return persistableBundle;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۥ$ۥ۟ */
    @InterfaceC7113(28)
    public static class C1049 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static C6659 m3143(Person person) {
            return new C6660().m21293(person.getName()).m21290(person.getIcon() != null ? IconCompat.m29542(person.getIcon()) : null).m21294(person.getUri()).m21292(person.getKey()).m3146(person.isBot()).m21291(person.isImportant()).m3145();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static Person m3144(C6659 c6659) {
            return new Person.Builder().setName(c6659.m21281()).setIcon(c6659.m21279() != null ? c6659.m21279().m29570() : null).setUri(c6659.m21282()).setKey(c6659.m21280()).setBot(c6659.m21283()).setImportant(c6659.m21284()).build();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C6660 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6490
        public CharSequence f2216;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public IconCompat f2217;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public String f17110;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public String f17111;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f17112;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f17113;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C6660() {
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C6659 m3145() {
            return new C6659(this);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C6660 m3146(boolean z) {
            this.f17112 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C6660 m21290(@InterfaceC6490 IconCompat iconCompat) {
            this.f2217 = iconCompat;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C6660 m21291(boolean z) {
            this.f17113 = z;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C6660 m21292(@InterfaceC6490 String str) {
            this.f17111 = str;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C6660 m21293(@InterfaceC6490 CharSequence charSequence) {
            this.f2216 = charSequence;
            return this;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C6660 m21294(@InterfaceC6490 String str) {
            this.f17110 = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C6660(C6659 c6659) {
            this.f2216 = c6659.f2214;
            this.f2217 = c6659.f2215;
            this.f17110 = c6659.f17106;
            this.f17111 = c6659.f17107;
            this.f17112 = c6659.f17108;
            this.f17113 = c6659.f17109;
        }
    }

    public C6659(C6660 c6660) {
        this.f2214 = c6660.f2216;
        this.f2215 = c6660.f2217;
        this.f17106 = c6660.f17110;
        this.f17107 = c6660.f17111;
        this.f17108 = c6660.f17112;
        this.f17109 = c6660.f17113;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC7113(28)
    /* JADX INFO: renamed from: ۥ */
    public static C6659 m3139(@InterfaceC6391 Person person) {
        return C1049.m3143(person);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C6659 m3140(@InterfaceC6391 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new C6660().m21293(bundle.getCharSequence("name")).m21290(bundle2 != null ? IconCompat.m29540(bundle2) : null).m21294(bundle.getString("uri")).m21292(bundle.getString(f17103)).m3146(bundle.getBoolean(f17104)).m21291(bundle.getBoolean(f17105)).m3145();
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC7113(22)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C6659 m21278(@InterfaceC6391 PersistableBundle persistableBundle) {
        return C1048.m3141(persistableBundle);
    }

    public boolean equals(@InterfaceC6490 Object obj) {
        if (obj == null || !(obj instanceof C6659)) {
            return false;
        }
        C6659 c6659 = (C6659) obj;
        String strM21280 = m21280();
        String strM212802 = c6659.m21280();
        return (strM21280 == null && strM212802 == null) ? Objects.equals(Objects.toString(m21281()), Objects.toString(c6659.m21281())) && Objects.equals(m21282(), c6659.m21282()) && Boolean.valueOf(m21283()).equals(Boolean.valueOf(c6659.m21283())) && Boolean.valueOf(m21284()).equals(Boolean.valueOf(c6659.m21284())) : Objects.equals(strM21280, strM212802);
    }

    public int hashCode() {
        String strM21280 = m21280();
        return strM21280 != null ? strM21280.hashCode() : Objects.hash(m21281(), m21282(), Boolean.valueOf(m21283()), Boolean.valueOf(m21284()));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public IconCompat m21279() {
        return this.f2215;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String m21280() {
        return this.f17107;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public CharSequence m21281() {
        return this.f2214;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public String m21282() {
        return this.f17106;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m21283() {
        return this.f17108;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m21284() {
        return this.f17109;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public String m21285() {
        String str = this.f17106;
        if (str != null) {
            return str;
        }
        if (this.f2214 == null) {
            return "";
        }
        return "name:" + ((Object) this.f2214);
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC7113(28)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Person m21286() {
        return C1049.m3144(this);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C6660 m21287() {
        return new C6660(this);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Bundle m21288() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f2214);
        IconCompat iconCompat = this.f2215;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m29569() : null);
        bundle.putString("uri", this.f17106);
        bundle.putString(f17103, this.f17107);
        bundle.putBoolean(f17104, this.f17108);
        bundle.putBoolean(f17105, this.f17109);
        return bundle;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC7113(22)
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public PersistableBundle m21289() {
        return C1048.m3142(this);
    }
}
