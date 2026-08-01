package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface Visitor {
    void read(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r2);

    void write(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r2);
}
