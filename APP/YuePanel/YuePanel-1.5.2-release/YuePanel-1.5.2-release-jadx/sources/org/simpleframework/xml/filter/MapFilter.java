package org.simpleframework.xml.filter;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MapFilter implements Filter {
    private Filter filter;
    private Map map;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MapFilter(Map map) {
        this(map, null);
    }

    @Override // org.simpleframework.xml.filter.Filter
    public String replace(String str) {
        Map map = this.map;
        Object obj = map != null ? map.get(str) : null;
        if (obj != null) {
            return obj.toString();
        }
        Filter filter = this.filter;
        if (filter != null) {
            return filter.replace(str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MapFilter(Map map, Filter filter) {
        this.filter = filter;
        this.map = map;
    }
}
