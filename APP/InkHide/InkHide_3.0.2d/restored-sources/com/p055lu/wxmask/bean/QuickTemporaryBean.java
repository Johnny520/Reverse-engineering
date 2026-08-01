package com.p055lu.wxmask.bean;

import p027N0.AbstractC0221e;
import p027N0.AbstractC0223g;
import p037T.C0267r;
import p052b1.AbstractC0503h;
import p053c.InterfaceC0508a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public final class QuickTemporaryBean extends BaseTemporary {
    private int clickCount;
    private int duration;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public QuickTemporaryBean() {
        int i2 = 0;
        this(i2, i2, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getClickCount() {
        return this.clickCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setClickCount(int i2) {
        this.clickCount = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDuration(int i2) {
        this.duration = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1500 int) : (r1v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r2v0 int))
 A[MD:(int, int):void (m)] (LINE:2) call: com.lu.wxmask.bean.QuickTemporaryBean.<init>(int, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ QuickTemporaryBean(int i2, int i3, int i4, AbstractC0221e abstractC0221e) {
        this((i4 & 1) != 0 ? 1500 : i2, (i4 & 2) != 0 ? 3 : i3);
    }

    public QuickTemporaryBean(int i2, int i3) {
        super(0);
        this.duration = i2;
        this.clickCount = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickTemporaryBean(C0267r c0267r) {
        this(AbstractC0503h.m973I(c0267r, "duration", 1500), AbstractC0503h.m973I(c0267r, "clickCount", 3));
        AbstractC0223g.m418e(c0267r, "json");
    }
}
