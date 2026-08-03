package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class ay {
    public static final int a = 10;
    public static final int b = 3;
    public static final int c = 50;
    public static final int d = -85;
    private int e;
    private int f;
    private int g;
    private int h;

    public ay() {
            r1 = this;
            r1.<init>()
            r0 = 10
            r1.e = r0
            r0 = 3
            r1.f = r0
            r0 = 50
            r1.g = r0
            r0 = -85
            r1.h = r0
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public void setMaxBssEntries(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void setMaxFingerprints(int r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setMinFingerprints(int r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void setRssiThreshold(int r1) {
            r0 = this;
            r0.h = r1
            return
    }
}
