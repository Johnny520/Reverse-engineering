package org.simpleframework.xml.strategy;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public interface Strategy {
    org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r2, java.util.Map r3);

    boolean write(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r3, java.util.Map r4);
}
