package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.strategy.Type;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
interface Label {
    Annotation getAnnotation();

    Contact getContact();

    Converter getConverter(Context context);

    Decorator getDecorator();

    Type getDependent();

    Object getEmpty(Context context);

    String getEntry();

    Expression getExpression();

    Object getKey();

    Label getLabel(Class cls);

    String getName();

    String[] getNames();

    String getOverride();

    String getPath();

    String[] getPaths();

    Class getType();

    Type getType(Class cls);

    boolean isAttribute();

    boolean isCollection();

    boolean isData();

    boolean isInline();

    boolean isRequired();

    boolean isText();

    boolean isTextList();

    boolean isUnion();

    String toString();
}
