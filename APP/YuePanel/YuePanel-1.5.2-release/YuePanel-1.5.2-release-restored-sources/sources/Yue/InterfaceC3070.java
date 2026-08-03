package Yue;

import Yue.InterfaceC7144;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3070 {

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ$ۥ */
    public static abstract class AbstractC0039 {

        /* JADX INFO: renamed from: ۥ */
        public Bundle f62;

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: ۥ */
        public void m149(@InterfaceC6490 Bundle bundle) {
            this.f62 = bundle;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ$ۥ۟ */
    public static final class C0040 extends AbstractC0039 {
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m150() {
            return this.f62.getBoolean(C3055.f4475);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m6218() {
            return this.f62.getInt(C3055.f4473);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3071 extends AbstractC0039 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public String m151() {
            return this.f62.getString(C3055.f4474);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C3072 extends AbstractC0039 {
        /* JADX INFO: renamed from: ۥ۟ */
        public int m152() {
            return this.f62.getInt(C3055.f4482);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m6219() {
            return this.f62.getInt(C3055.f4483);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C3073 extends AbstractC0039 {
        /* JADX INFO: renamed from: ۥ۟ */
        public int m153() {
            return this.f62.getInt(C3055.f4480);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m6220() {
            return this.f62.getInt(C3055.f4479);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C3074 extends AbstractC0039 {
        /* JADX INFO: renamed from: ۥ۟ */
        public float m154() {
            return this.f62.getFloat(C3055.f4481);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C3075 extends AbstractC0039 {
        /* JADX INFO: renamed from: ۥ۟ */
        public int m155() {
            return this.f62.getInt(C3055.f4477);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m6221() {
            return this.f62.getInt(C3055.f4476);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۦۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C3076 extends AbstractC0039 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟ */
        public CharSequence m156() {
            return this.f62.getCharSequence(C3055.f4478);
        }
    }

    boolean perform(@InterfaceC6391 View view, @InterfaceC6490 AbstractC0039 abstractC0039);
}
