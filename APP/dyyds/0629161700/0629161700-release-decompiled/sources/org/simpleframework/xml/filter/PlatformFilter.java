package org.simpleframework.xml.filter;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class PlatformFilter extends org.simpleframework.xml.filter.StackFilter {
    public PlatformFilter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public PlatformFilter(java.util.Map r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.filter.EnvironmentFilter r0 = new org.simpleframework.xml.filter.EnvironmentFilter
            r0.<init>()
            r1.push(r0)
            org.simpleframework.xml.filter.SystemFilter r0 = new org.simpleframework.xml.filter.SystemFilter
            r0.<init>()
            r1.push(r0)
            org.simpleframework.xml.filter.MapFilter r0 = new org.simpleframework.xml.filter.MapFilter
            r0.<init>(r2)
            r1.push(r0)
            return
    }
}
