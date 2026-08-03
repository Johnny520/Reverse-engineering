package com.tendcloud.tenddata;

import java.lang.reflect.Method;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ae */
/* JADX INFO: loaded from: classes.dex */
final class C0023ae {

    /* JADX INFO: renamed from: a */
    private final Object f154a;

    /* JADX INFO: renamed from: b */
    private final Method f155b;

    /* JADX INFO: renamed from: c */
    private final int f156c;

    /* JADX INFO: renamed from: d */
    private boolean f157d = true;

    public C0023ae(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        }
        if (method == null) {
            throw new NullPointerException("EventHandler method cannot be null.");
        }
        this.f154a = obj;
        this.f155b = method;
        method.setAccessible(true);
        this.f156c = obj.hashCode() + ((method.hashCode() + 31) * 31);
    }

    /* JADX INFO: renamed from: a */
    public boolean m98a() {
        return this.f157d;
    }

    /* JADX INFO: renamed from: b */
    public void m99b() {
        this.f157d = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        try {
            if (C0023ae.class != obj.getClass()) {
                return false;
            }
            C0023ae c0023ae = (C0023ae) obj;
            if (this.f155b.equals(c0023ae.f155b)) {
                if (this.f154a == c0023ae.f154a) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void handleEvent(Object obj) {
        if (!this.f157d) {
            C0115h.eForInternal(toString() + " has been invalidated and can no longer handle events.");
        }
        try {
            this.f155b.invoke(this.f154a, obj);
        } catch (Throwable unused) {
        }
    }

    public int hashCode() {
        return this.f156c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sbM1039 = C0167c4.m1039("[EventHandler ");
        sbM1039.append(this.f155b);
        sbM1039.append("]");
        return sbM1039.toString();
    }
}
