package org.simpleframework.xml.filter;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformFilter extends StackFilter {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PlatformFilter() {
        this(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PlatformFilter(Map map) {
        push(new EnvironmentFilter());
        push(new SystemFilter());
        push(new MapFilter(map));
    }
}
