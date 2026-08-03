package com.tendcloud.tenddata;

/* JADX INFO: renamed from: com.tendcloud.tenddata.bu */
/* JADX INFO: loaded from: classes.dex */
public class C0066bu {

    /* JADX INFO: renamed from: a */
    public AbstractC0018a f350a = null;

    /* JADX INFO: renamed from: b */
    public a f351b = a.IMMEDIATELY;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.bu$a */
    public enum a {
        IMMEDIATELY(0),
        HIGH(1);

        private final int indexNum;

        a(int i) {
            this.indexNum = i;
        }

        public int index() {
            return this.indexNum;
        }
    }
}
