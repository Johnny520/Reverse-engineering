package org.simpleframework.xml.transform;

import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
class URLTransform implements Transform<URL> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // org.simpleframework.xml.transform.Transform
    public URL read(String str) throws Exception {
        return new URL(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;)Ljava/lang/String; */
    @Override // org.simpleframework.xml.transform.Transform
    public String write(URL url) throws Exception {
        return url.toString();
    }
}
