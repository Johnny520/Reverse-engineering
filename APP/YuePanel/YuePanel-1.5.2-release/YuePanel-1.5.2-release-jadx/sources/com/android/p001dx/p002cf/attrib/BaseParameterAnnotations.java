package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.rop.annotation.AnnotationsList;
import com.android.p001dx.util.MutabilityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseParameterAnnotations extends BaseAttribute {
    private final int byteLength;
    private final AnnotationsList parameterAnnotations;

    public BaseParameterAnnotations(String str, AnnotationsList annotationsList, int i) {
        super(str);
        try {
            if (annotationsList.isMutable()) {
                throw new MutabilityException("parameterAnnotations.isMutable()");
            }
            this.parameterAnnotations = annotationsList;
            this.byteLength = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public final int byteLength() {
        return this.byteLength + 6;
    }

    public final AnnotationsList getParameterAnnotations() {
        return this.parameterAnnotations;
    }
}
