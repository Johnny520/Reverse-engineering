package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
public interface Strategy {
    org.simpleframework.xml.strategy.Value read(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r2, java.util.Map r3) throws java.lang.Exception;

    boolean write(org.simpleframework.xml.strategy.Type r1, java.lang.Object r2, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r3, java.util.Map r4) throws java.lang.Exception;
}
