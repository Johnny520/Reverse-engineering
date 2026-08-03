package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
interface Creator {
    java.lang.Object getInstance() throws java.lang.Exception;

    java.lang.Object getInstance(org.simpleframework.xml.core.Criteria r1) throws java.lang.Exception;

    double getScore(org.simpleframework.xml.core.Criteria r1) throws java.lang.Exception;

    org.simpleframework.xml.core.Signature getSignature() throws java.lang.Exception;

    java.lang.Class getType() throws java.lang.Exception;
}
