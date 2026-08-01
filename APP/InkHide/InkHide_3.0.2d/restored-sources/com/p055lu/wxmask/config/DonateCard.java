package com.p055lu.wxmask.config;

import p027N0.AbstractC0221e;
import p053c.InterfaceC0508a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public final class DonateCard {
    private String des;
    private boolean show;
    private String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DonateCard(String str, boolean z2, String str2) {
        this.des = str;
        this.show = z2;
        this.title = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getDes() {
        return this.des;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getShow() {
        return this.show;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDes(String str) {
        this.des = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setShow(boolean z2) {
        this.show = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (r3v0 java.lang.String)
 A[MD:(java.lang.String, boolean, java.lang.String):void (m)] (LINE:5) call: com.lu.wxmask.config.DonateCard.<init>(java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DonateCard(String str, boolean z2, String str2, int i2, AbstractC0221e abstractC0221e) {
        this(str, (i2 & 2) != 0 ? false : z2, str2);
    }
}
