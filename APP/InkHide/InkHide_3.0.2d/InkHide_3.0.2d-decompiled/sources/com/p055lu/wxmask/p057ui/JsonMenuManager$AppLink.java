package com.p055lu.wxmask.p057ui;

import p027N0.AbstractC0221e;
import p053c.InterfaceC0508a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public final class JsonMenuManager$AppLink {
    private String[] links;
    private int priority;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonMenuManager$AppLink() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String[] getLinks() {
        return this.links;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLinks(String[] strArr) {
        this.links = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPriority(int i2) {
        this.priority = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public JsonMenuManager$AppLink(String[] strArr, int i2) {
        this.links = strArr;
        this.priority = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String[]:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String[]) : (r1v0 java.lang.String[]))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.String[], int):void (m)] (LINE:3) call: com.lu.wxmask.ui.JsonMenuManager$AppLink.<init>(java.lang.String[], int):void type: THIS */
    public /* synthetic */ JsonMenuManager$AppLink(String[] strArr, int i2, int i3, AbstractC0221e abstractC0221e) {
        this((i3 & 1) != 0 ? null : strArr, (i3 & 2) != 0 ? 0 : i2);
    }
}
