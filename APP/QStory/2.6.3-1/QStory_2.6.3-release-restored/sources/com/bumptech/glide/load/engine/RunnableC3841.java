package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.C3880;
import p238.AbstractC8818;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3841 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3880 f9896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C3831 f9897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9898;

    public /* synthetic */ RunnableC3841(C3831 c3831, C3880 c3880, int i) {
        this.f9898 = i;
        this.f9897 = c3831;
        this.f9896 = c3880;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CallbackException callbackException;
        switch (this.f9898) {
            case 0:
                C3880 c3880 = this.f9896;
                c3880.f10051.m14019();
                synchronized (c3880.f10050) {
                    synchronized (this.f9897) {
                        try {
                            if (this.f9897.f9863.f9887.contains(new C3838(this.f9896, AbstractC8818.f22412))) {
                                C3831 c3831 = this.f9897;
                                C3880 c38802 = this.f9896;
                                c3831.getClass();
                                try {
                                    c38802.m7163(c3831.f9853, 5);
                                } finally {
                                }
                            }
                            this.f9897.m7040();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                C3880 c38803 = this.f9896;
                c38803.f10051.m14019();
                synchronized (c38803.f10050) {
                    synchronized (this.f9897) {
                        try {
                            if (this.f9897.f9863.f9887.contains(new C3838(this.f9896, AbstractC8818.f22412))) {
                                this.f9897.f9851.m7045();
                                C3831 c38312 = this.f9897;
                                C3880 c38804 = this.f9896;
                                c38312.getClass();
                                try {
                                    c38804.m7161(c38312.f9851, c38312.f9843);
                                    this.f9897.m7042(this.f9896);
                                } finally {
                                }
                            }
                            this.f9897.m7040();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
