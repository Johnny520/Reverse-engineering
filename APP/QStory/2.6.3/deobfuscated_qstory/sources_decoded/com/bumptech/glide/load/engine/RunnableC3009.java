package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.C3048;
import p222.AbstractC7989;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3009 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3048 f9551;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2999 f9552;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9553;

    public /* synthetic */ RunnableC3009(C2999 c2999, C3048 c3048, int i) {
        this.f9553 = i;
        this.f9552 = c2999;
        this.f9551 = c3048;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CallbackException callbackException;
        switch (this.f9553) {
            case 0:
                C3048 c3048 = this.f9551;
                c3048.f9706.m13460();
                synchronized (c3048.f9705) {
                    synchronized (this.f9552) {
                        try {
                            if (this.f9552.f9518.f9542.contains(new C3006(this.f9551, AbstractC7989.f22067))) {
                                C2999 c2999 = this.f9552;
                                C3048 c30482 = this.f9551;
                                c2999.getClass();
                                try {
                                    c30482.m6603(c2999.f9508, 5);
                                } finally {
                                }
                            }
                            this.f9552.m6480();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                C3048 c30483 = this.f9551;
                c30483.f9706.m13460();
                synchronized (c30483.f9705) {
                    synchronized (this.f9552) {
                        try {
                            if (this.f9552.f9518.f9542.contains(new C3006(this.f9551, AbstractC7989.f22067))) {
                                this.f9552.f9506.m6485();
                                C2999 c29992 = this.f9552;
                                C3048 c30484 = this.f9551;
                                c29992.getClass();
                                try {
                                    c30484.m6601(c29992.f9506, c29992.f9498);
                                    this.f9552.m6482(this.f9551);
                                } finally {
                                }
                            }
                            this.f9552.m6480();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
