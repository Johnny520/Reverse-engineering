package p063e9;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import p276sf.C3959f;
import p346x9.AbstractC5737d;

/* JADX INFO: renamed from: e9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0834e implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2538g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f2539h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Uri f2540i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0834e(Context context, Uri uri, int i9) {
        this.f2538g = i9;
        this.f2539h = context;
        this.f2540i = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        Object c3959f2;
        switch (this.f2538g) {
            case 0:
                try {
                    c3959f = RingtoneManager.getRingtone(this.f2539h, this.f2540i);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                final Ringtone ringtone = (Ringtone) c3959f;
                if (ringtone != null) {
                    try {
                        ringtone.setStreamType(5);
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        ringtone.play();
                        break;
                    } catch (Throwable unused2) {
                    }
                    final int i9 = 0;
                    C0846q.f2585f.postDelayed(new Runnable() { // from class: e9.g
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i9) {
                                case 0:
                                    Ringtone ringtone2 = ringtone;
                                    try {
                                        if (ringtone2.isPlaying()) {
                                            ringtone2.stop();
                                        }
                                    } catch (Throwable unused3) {
                                        return;
                                    }
                                    break;
                                default:
                                    Ringtone ringtone3 = ringtone;
                                    try {
                                        if (ringtone3.isPlaying()) {
                                            ringtone3.stop();
                                        }
                                    } catch (Throwable unused4) {
                                        return;
                                    }
                                    break;
                            }
                        }
                    }, 3500L);
                }
                break;
            default:
                try {
                    c3959f2 = RingtoneManager.getRingtone(this.f2539h, this.f2540i);
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                final Ringtone ringtone2 = (Ringtone) c3959f2;
                if (ringtone2 != null) {
                    try {
                        ringtone2.setStreamType(5);
                        break;
                    } catch (Throwable unused3) {
                    }
                    try {
                        ringtone2.play();
                        break;
                    } catch (Throwable unused4) {
                    }
                    final int i10 = 1;
                    AbstractC5737d.f23378b.postDelayed(new Runnable() { // from class: e9.g
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    Ringtone ringtone22 = ringtone2;
                                    try {
                                        if (ringtone22.isPlaying()) {
                                            ringtone22.stop();
                                        }
                                    } catch (Throwable unused32) {
                                        return;
                                    }
                                    break;
                                default:
                                    Ringtone ringtone3 = ringtone2;
                                    try {
                                        if (ringtone3.isPlaying()) {
                                            ringtone3.stop();
                                        }
                                    } catch (Throwable unused42) {
                                        return;
                                    }
                                    break;
                            }
                        }
                    }, 3500L);
                }
                break;
        }
    }
}
