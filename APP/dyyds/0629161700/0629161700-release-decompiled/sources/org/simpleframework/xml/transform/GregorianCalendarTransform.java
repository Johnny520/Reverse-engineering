package org.simpleframework.xml.transform;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
class GregorianCalendarTransform implements org.simpleframework.xml.transform.Transform<java.util.GregorianCalendar> {
    private final org.simpleframework.xml.transform.DateTransform transform;

    public GregorianCalendarTransform() {
            r1 = this;
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            r1.<init>(r0)
            return
    }

    public GregorianCalendarTransform(java.lang.Class r2) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.transform.DateTransform r0 = new org.simpleframework.xml.transform.DateTransform
            r0.<init>(r2)
            r1.transform = r0
            return
    }

    private java.util.GregorianCalendar read(java.util.Date r1) {
            r0 = this;
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r0.<init>()
            if (r1 == 0) goto La
            r0.setTime(r1)
        La:
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.util.GregorianCalendar read(java.lang.String r1) {
            r0 = this;
            java.util.GregorianCalendar r0 = r0.read2(r1)
            return r0
    }

    @Override // org.simpleframework.xml.transform.Transform
    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.GregorianCalendar read2(java.lang.String r2) {
            r1 = this;
            org.simpleframework.xml.transform.DateTransform r0 = r1.transform
            java.util.Date r2 = r0.read(r2)
            java.util.GregorianCalendar r1 = r1.read(r2)
            return r1
    }

    @Override // org.simpleframework.xml.transform.Transform
    public /* bridge */ /* synthetic */ java.lang.String write(java.util.GregorianCalendar r1) {
            r0 = this;
            java.util.GregorianCalendar r1 = (java.util.GregorianCalendar) r1
            java.lang.String r0 = r0.write2(r1)
            return r0
    }

    /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
    public java.lang.String write2(java.util.GregorianCalendar r1) {
            r0 = this;
            org.simpleframework.xml.transform.DateTransform r0 = r0.transform
            java.util.Date r1 = r1.getTime()
            java.lang.String r0 = r0.write(r1)
            return r0
    }
}
