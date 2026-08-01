package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
interface Extractor<T extends java.lang.annotation.Annotation> {
    T[] getAnnotations();

    org.simpleframework.xml.core.Label getLabel(T r1);

    java.lang.Class getType(T r1);
}
