package Yue;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5443 {

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC5444 f1514;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۦ$ۥ۟ */
    public static final class C0764 implements InterfaceC5444 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final Uri f1516;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6391
        public final ClipDescription f1517;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final Uri f13369;

        public C0764(@InterfaceC6391 Uri uri, @InterfaceC6391 ClipDescription clipDescription, @InterfaceC6490 Uri uri2) {
            this.f1516 = uri;
            this.f1517 = clipDescription;
            this.f13369 = uri2;
        }

        @Override // Yue.C5443.InterfaceC5444
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public Uri mo2216() {
            return this.f13369;
        }

        @Override // Yue.C5443.InterfaceC5444
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public Uri mo2217() {
            return this.f1516;
        }

        @Override // Yue.C5443.InterfaceC5444
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo16943() {
        }

        @Override // Yue.C5443.InterfaceC5444
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public ClipDescription mo16944() {
            return this.f1517;
        }

        @Override // Yue.C5443.InterfaceC5444
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo16945() {
            return null;
        }

        @Override // Yue.C5443.InterfaceC5444
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo16946() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۦ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC5444 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        Uri mo2216();

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        Uri mo2217();

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo16943();

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        ClipDescription mo16944();

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        Object mo16945();

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo16946();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5443(@InterfaceC6391 Uri uri, @InterfaceC6391 ClipDescription clipDescription, @InterfaceC6490 Uri uri2) {
        this.f1514 = new C0763(uri, clipDescription, uri2);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C5443 m16938(@InterfaceC6490 Object obj) {
        if (obj == null) {
            return null;
        }
        return new C5443(new C0763(obj));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public Uri m2214() {
        return this.f1514.mo2217();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public ClipDescription m2215() {
        return this.f1514.mo16944();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Uri m16939() {
        return this.f1514.mo2216();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m16940() {
        this.f1514.mo16946();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m16941() {
        this.f1514.mo16943();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Object m16942() {
        return this.f1514.mo16945();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۢۦ$ۥ */
    @InterfaceC7113(25)
    public static final class C0763 implements InterfaceC5444 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6391
        public final InputContentInfo f1515;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0763(@InterfaceC6391 Object obj) {
            this.f1515 = (InputContentInfo) obj;
        }

        @Override // Yue.C5443.InterfaceC5444
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public Uri mo2216() {
            return this.f1515.getLinkUri();
        }

        @Override // Yue.C5443.InterfaceC5444
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public Uri mo2217() {
            return this.f1515.getContentUri();
        }

        @Override // Yue.C5443.InterfaceC5444
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo16943() {
            this.f1515.requestPermission();
        }

        @Override // Yue.C5443.InterfaceC5444
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public ClipDescription mo16944() {
            return this.f1515.getDescription();
        }

        @Override // Yue.C5443.InterfaceC5444
        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Object mo16945() {
            return this.f1515;
        }

        @Override // Yue.C5443.InterfaceC5444
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo16946() {
            this.f1515.releasePermission();
        }

        public C0763(@InterfaceC6391 Uri uri, @InterfaceC6391 ClipDescription clipDescription, @InterfaceC6490 Uri uri2) {
            this.f1515 = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public C5443(@InterfaceC6391 InterfaceC5444 interfaceC5444) {
        this.f1514 = interfaceC5444;
    }
}
