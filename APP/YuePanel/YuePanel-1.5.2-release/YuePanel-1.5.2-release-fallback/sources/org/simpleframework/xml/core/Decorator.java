package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Decorator {
    void decorate(org.simpleframework.xml.stream.OutputNode r1);

    void decorate(org.simpleframework.xml.stream.OutputNode r1, org.simpleframework.xml.core.Decorator r2);
}
