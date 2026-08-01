package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏楪子兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3732 extends AbstractC3726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f11568;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3732(Unsafe unsafe, int i) {
        super(unsafe);
        this.f11568 = i;
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final double mo8014(Object obj, long j) {
        switch (this.f11568) {
        }
        return Double.longBitsToDouble(m8034(obj, j));
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final byte mo8015(Object obj, long j) {
        switch (this.f11568) {
            case 0:
                if (!AbstractC3725.f11546) {
                }
                break;
            default:
                if (!AbstractC3725.f11546) {
                }
                break;
        }
        return AbstractC3725.m8012(obj, j);
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final byte mo8016(long j) {
        switch (this.f11568) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8017(Object obj, long j) {
        switch (this.f11568) {
            case 0:
                if (AbstractC3725.f11546) {
                    if (AbstractC3725.m8008(obj, j) == 0) {
                    }
                } else if (AbstractC3725.m8012(obj, j) == 0) {
                }
                break;
            default:
                if (AbstractC3725.f11546) {
                    if (AbstractC3725.m8008(obj, j) == 0) {
                    }
                } else if (AbstractC3725.m8012(obj, j) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo8022() {
        switch (this.f11568) {
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo8023(Object obj, long j, byte b) {
        switch (this.f11568) {
            case 0:
                if (!AbstractC3725.f11546) {
                    AbstractC3725.m8005(obj, j, b);
                } else {
                    AbstractC3725.m8011(obj, j, b);
                }
                break;
            default:
                if (!AbstractC3725.f11546) {
                    AbstractC3725.m8005(obj, j, b);
                } else {
                    AbstractC3725.m8011(obj, j, b);
                }
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo8024(Object obj, long j, boolean z) {
        switch (this.f11568) {
            case 0:
                if (!AbstractC3725.f11546) {
                    AbstractC3725.m8005(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC3725.m8011(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC3725.f11546) {
                    AbstractC3725.m8005(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC3725.m8011(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo8027(Object obj, long j, double d) {
        switch (this.f11568) {
            case 0:
                m8026(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m8026(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo8028(Object obj, long j, float f) {
        switch (this.f11568) {
            case 0:
                m8025(obj, j, Float.floatToIntBits(f));
                break;
            default:
                m8025(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final float mo8030(Object obj, long j) {
        switch (this.f11568) {
        }
        return Float.intBitsToFloat(m8029(obj, j));
    }

    @Override // com.google.protobuf.AbstractC3726
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final long mo8033(long j) {
        switch (this.f11568) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
