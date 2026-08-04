package org.simpleframework.xml.core;

import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
interface Converter {
    Object read(InputNode inputNode);

    Object read(InputNode inputNode, Object obj);

    boolean validate(InputNode inputNode);

    void write(OutputNode outputNode, Object obj);
}
