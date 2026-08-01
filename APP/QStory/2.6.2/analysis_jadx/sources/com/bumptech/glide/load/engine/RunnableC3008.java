package com.bumptech.glide.load.engine;

import com.bumptech.glide.request.C3047;
import p222.AbstractC7988;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3008 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3047 f9549;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C2998 f9550;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9551;

    public /* synthetic */ RunnableC3008(C2998 c2998, C3047 c3047, int i) {
        this.f9551 = i;
        this.f9550 = c2998;
        this.f9549 = c3047;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CallbackException callbackException;
        switch (this.f9551) {
            case 0:
                C3047 c3047 = this.f9549;
                c3047.f9704.m13432();
                synchronized (c3047.f9703) {
                    synchronized (this.f9550) {
                        try {
                            if (this.f9550.f9516.f9540.contains(new C3005(this.f9549, AbstractC7988.f22070))) {
                                C2998 c2998 = this.f9550;
                                C3047 c30472 = this.f9549;
                                c2998.getClass();
                                try {
                                    c30472.m6543(c2998.f9506, 5);
                                } finally {
                                }
                            }
                            this.f9550.m6422();
                        } finally {
                        }
                        break;
                    }
                }
                return;
            default:
                C3047 c30473 = this.f9549;
                c30473.f9704.m13432();
                synchronized (c30473.f9703) {
                    synchronized (this.f9550) {
                        try {
                            if (this.f9550.f9516.f9540.contains(new C3005(this.f9549, AbstractC7988.f22070))) {
                                this.f9550.f9504.m6427();
                                C2998 c29982 = this.f9550;
                                C3047 c30474 = this.f9549;
                                c29982.getClass();
                                try {
                                    c30474.m6541(c29982.f9504, c29982.f9496);
                                    this.f9550.m6424(this.f9549);
                                } finally {
                                }
                            }
                            this.f9550.m6422();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
