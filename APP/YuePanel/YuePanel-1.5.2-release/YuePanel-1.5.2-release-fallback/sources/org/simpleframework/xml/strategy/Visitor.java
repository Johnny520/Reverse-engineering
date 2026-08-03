package org.simpleframework.xml.strategy;

/* JADX INFO: loaded from: classes2.dex */
public interface Visitor {
    void read(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.InputNode> r2) throws java.lang.Exception;

    void write(org.simpleframework.xml.strategy.Type r1, org.simpleframework.xml.stream.NodeMap<org.simpleframework.xml.stream.OutputNode> r2) throws java.lang.Exception;
}
