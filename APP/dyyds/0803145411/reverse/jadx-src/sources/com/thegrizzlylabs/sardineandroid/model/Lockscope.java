package com.thegrizzlylabs.sardineandroid.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
@Namespace(prefix = "D", reference = "DAV:")
@Root
public class Lockscope {

    @Element(required = false)
    private Exclusive exclusive;

    @Element(required = false)
    private Shared shared;

    public Exclusive getExclusive() {
        return this.exclusive;
    }

    public Shared getShared() {
        return this.shared;
    }

    public void setExclusive(Exclusive exclusive) {
        this.exclusive = exclusive;
    }

    public void setShared(Shared shared) {
        this.shared = shared;
    }
}
