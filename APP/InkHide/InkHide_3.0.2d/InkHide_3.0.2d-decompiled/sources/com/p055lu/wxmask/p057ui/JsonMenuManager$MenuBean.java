package com.p055lu.wxmask.p057ui;

import p027N0.AbstractC0221e;
import p053c.InterfaceC0508a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public final class JsonMenuManager$MenuBean {
    private JsonMenuManager$AppLink appLink;
    private int groupId;
    private int itemId;
    private String link;
    private int order;
    private int since;
    private String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JsonMenuManager$MenuBean() {
        this(0, 0, 0, null, null, null, 0, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JsonMenuManager$AppLink getAppLink() {
        return this.appLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getItemId() {
        return this.itemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getLink() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getOrder() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getSince() {
        return this.since;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setAppLink(JsonMenuManager$AppLink jsonMenuManager$AppLink) {
        this.appLink = jsonMenuManager$AppLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setGroupId(int i2) {
        this.groupId = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setItemId(int i2) {
        this.itemId = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLink(String str) {
        this.link = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOrder(int i2) {
        this.order = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSince(int i2) {
        this.since = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public JsonMenuManager$MenuBean(int i2, int i3, int i4, String str, String str2, JsonMenuManager$AppLink jsonMenuManager$AppLink, int i5) {
        this.groupId = i2;
        this.itemId = i3;
        this.order = i4;
        this.title = str;
        this.link = str2;
        this.appLink = jsonMenuManager$AppLink;
        this.since = i5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:com.lu.wxmask.ui.JsonMenuManager$AppLink:?: TERNARY null = ((wrap:int:0x001c: ARITH (r10v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.lu.wxmask.ui.JsonMenuManager$AppLink) : (r8v0 com.lu.wxmask.ui.JsonMenuManager$AppLink))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r10v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
 A[MD:(int, int, int, java.lang.String, java.lang.String, com.lu.wxmask.ui.JsonMenuManager$AppLink, int):void (m)] (LINE:10) call: com.lu.wxmask.ui.JsonMenuManager$MenuBean.<init>(int, int, int, java.lang.String, java.lang.String, com.lu.wxmask.ui.JsonMenuManager$AppLink, int):void type: THIS */
    public /* synthetic */ JsonMenuManager$MenuBean(int i2, int i3, int i4, String str, String str2, JsonMenuManager$AppLink jsonMenuManager$AppLink, int i5, int i6, AbstractC0221e abstractC0221e) {
        this((i6 & 1) != 0 ? 0 : i2, (i6 & 2) != 0 ? 0 : i3, (i6 & 4) != 0 ? 0 : i4, (i6 & 8) != 0 ? "" : str, (i6 & 16) != 0 ? "" : str2, (i6 & 32) != 0 ? null : jsonMenuManager$AppLink, (i6 & 64) != 0 ? 0 : i5);
    }
}
