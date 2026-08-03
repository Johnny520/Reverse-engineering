package org.simpleframework.xml.filter;

/* JADX INFO: loaded from: classes2.dex */
public class EnvironmentFilter implements Filter {
    private Filter filter;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnvironmentFilter() {
        this(null);
    }

    @Override // org.simpleframework.xml.filter.Filter
    public String replace(String str) {
        String str2 = System.getenv(str);
        if (str2 != null) {
            return str2;
        }
        Filter filter = this.filter;
        if (filter != null) {
            return filter.replace(str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public EnvironmentFilter(Filter filter) {
        this.filter = filter;
    }
}
