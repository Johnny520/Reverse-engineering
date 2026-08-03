package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
interface Extractor<T extends java.lang.annotation.Annotation> {
    T[] getAnnotations() throws java.lang.Exception;

    org.simpleframework.xml.core.Label getLabel(T r1) throws java.lang.Exception;

    java.lang.Class getType(T r1) throws java.lang.Exception;
}
