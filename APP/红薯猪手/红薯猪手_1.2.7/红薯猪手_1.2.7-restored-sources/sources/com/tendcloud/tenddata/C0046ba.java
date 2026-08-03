package com.tendcloud.tenddata;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ba */
/* JADX INFO: loaded from: classes.dex */
public class C0046ba {

    /* JADX INFO: renamed from: a */
    private int f243a;

    /* JADX INFO: renamed from: b */
    private long f244b;

    /* JADX INFO: renamed from: c */
    private List<C0042ax> f245c;

    /* JADX INFO: renamed from: d */
    private Map<String, C0042ax> f246d;

    /* JADX INFO: renamed from: a */
    public int m262a() {
        return this.f243a;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, C0042ax> m263a(boolean z) {
        if (this.f246d == null || z) {
            this.f246d = new HashMap();
            for (C0042ax c0042ax : this.f245c) {
                this.f246d.put(c0042ax.m245b(), c0042ax);
            }
        }
        return this.f246d;
    }

    /* JADX INFO: renamed from: b */
    public long m264b() {
        return this.f244b;
    }

    /* JADX INFO: renamed from: c */
    public List<C0042ax> m265c() {
        return this.f245c;
    }

    /* JADX INFO: renamed from: d */
    public C0046ba m266d() {
        C0046ba c0046ba = new C0046ba();
        c0046ba.setTimestamp(this.f243a);
        c0046ba.setPoiId(this.f244b);
        LinkedList linkedList = new LinkedList();
        Iterator<C0042ax> it = this.f245c.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().m249f());
        }
        c0046ba.setBsslist(linkedList);
        return c0046ba;
    }

    public void setBsslist(List<C0042ax> list) {
        this.f245c = list;
    }

    public void setPoiId(long j) {
        this.f244b = j;
    }

    public void setTimestamp(int i) {
        this.f243a = i;
    }
}
