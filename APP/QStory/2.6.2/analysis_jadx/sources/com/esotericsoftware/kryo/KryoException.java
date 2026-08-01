package com.esotericsoftware.kryo;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class KryoException extends RuntimeException {
    private StringBuffer trace;

    public KryoException() {
    }

    public void addTrace(String str) {
        if (str == null) {
            C5919.m11249("info cannot be null.");
            return;
        }
        if (this.trace == null) {
            this.trace = new StringBuffer(512);
        }
        this.trace.append('\n');
        this.trace.append(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.trace == null) {
            return super.getMessage();
        }
        StringBuffer stringBuffer = new StringBuffer(512);
        stringBuffer.append(super.getMessage());
        if (stringBuffer.length() > 0) {
            stringBuffer.append('\n');
        }
        stringBuffer.append("Serialization trace:");
        stringBuffer.append(this.trace);
        return stringBuffer.toString();
    }

    public KryoException(String str, Throwable th) {
        super(str, th);
    }

    public KryoException(String str) {
        super(str);
    }

    public KryoException(Throwable th) {
        super(th);
    }
}
