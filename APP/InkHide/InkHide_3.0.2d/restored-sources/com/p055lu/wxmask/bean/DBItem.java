package com.p055lu.wxmask.bean;

import p027N0.AbstractC0221e;
import p027N0.AbstractC0223g;

/* JADX INFO: loaded from: classes.dex */
public final class DBItem {
    private String name;
    private String password;
    private Object sqliteDatabase;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DBItem(String str, String str2, Object obj) {
        AbstractC0223g.m418e(str, "name");
        this.name = str;
        this.password = str2;
        this.sqliteDatabase = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getPassword() {
        return this.password;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getSqliteDatabase() {
        return this.sqliteDatabase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setName(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPassword(String str) {
        this.password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSqliteDatabase(Object obj) {
        this.sqliteDatabase = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
 A[MD:(java.lang.String, java.lang.String, java.lang.Object):void (m)] (LINE:2) call: com.lu.wxmask.bean.DBItem.<init>(java.lang.String, java.lang.String, java.lang.Object):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ DBItem(String str, String str2, Object obj, int i2, AbstractC0221e abstractC0221e) {
        this(str, str2, (i2 & 4) != 0 ? null : obj);
    }
}
