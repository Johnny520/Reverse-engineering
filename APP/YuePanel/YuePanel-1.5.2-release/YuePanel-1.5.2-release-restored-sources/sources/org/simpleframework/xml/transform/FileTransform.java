package org.simpleframework.xml.transform;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
class FileTransform implements Transform<File> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.simpleframework.xml.transform.Transform
    public File read(String str) {
        return new File(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(File file) {
        return file.getPath();
    }
}
