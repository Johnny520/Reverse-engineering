package p198nb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p210o8.C3086j;

/* JADX INFO: renamed from: nb.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2952u extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9672b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2952u(Object obj, int i9) {
        this.f9671a = i9;
        this.f9672b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f9671a) {
            case 0:
                final C2954w c2954w = (C2954w) this.f9672b;
                if (AbstractC1416l.m3825a(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    final int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                    final int intExtra2 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", -1);
                    if (intExtra >= 0 && intExtra2 >= 0 && intExtra != intExtra2) {
                        Integer num = c2954w.f9697x;
                        if (num == null || num.intValue() != intExtra) {
                            c2954w.f9675b.post(new Runnable() { // from class: nb.t
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2954w c2954w2 = c2954w;
                                    if (c2954w2.f9688o == null || !c2954w2.m6374y().m6377b("text_speech_enable") || !c2954w2.m6374y().m6377b("text_speech_volume_control")) {
                                        c2954w2.m6367o();
                                        return;
                                    }
                                    C2948q c2948q = c2954w2.f9695v;
                                    int i9 = intExtra;
                                    if (c2948q != null) {
                                        c2948q.setCurrentVolume(i9);
                                    }
                                    int i10 = intExtra2;
                                    if (i9 <= i10 || c2954w2.f9691r) {
                                        Object systemService = c2954w2.f9674a.getSystemService("audio");
                                        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                                        c2954w2.f9697x = Integer.valueOf(i10);
                                        if (audioManager != null) {
                                            try {
                                                audioManager.setStreamVolume(3, i10, 0);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        C2948q c2948q2 = c2954w2.f9695v;
                                        if (c2948q2 != null) {
                                            c2948q2.setCurrentVolume(i10);
                                        }
                                        if (i9 < i10 && c2954w2.f9691r) {
                                            c2954w2.m6375z();
                                            return;
                                        }
                                        if (i9 < i10) {
                                            c2954w2.m6365m();
                                        } else {
                                            if (i9 <= i10 || !c2954w2.f9691r) {
                                                return;
                                            }
                                            c2954w2.m6370u();
                                        }
                                    }
                                }
                            });
                        } else {
                            c2954w.f9697x = null;
                        }
                        break;
                    }
                }
                break;
            default:
                if (AbstractC1416l.m3825a(intent != null ? intent.getAction() : null, "h.Hchat.action.EXACT_TASK")) {
                    String stringExtra = intent.getStringExtra("h.Hchat.extra.EXACT_TASK_KEY");
                    if (stringExtra == null) {
                        stringExtra = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (stringExtra.length() != 0) {
                        ((C3086j) this.f9672b).m6551b(intent.getLongExtra("h.Hchat.extra.EXACT_TASK_TOKEN", Long.MIN_VALUE), stringExtra);
                        break;
                    }
                }
                break;
        }
    }
}
