package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONWriter implements java.io.Closeable {
    static final char[] DIGITS = null;
    static final long NONE_DIRECT_FEATURES = 0;
    static final byte PRETTY_2_SPACE = 2;
    static final byte PRETTY_4_SPACE = 4;
    static final byte PRETTY_NON = 0;
    static final byte PRETTY_TAB = 1;
    protected final java.nio.charset.Charset charset;
    public final com.alibaba.fastjson2.JSONWriter.Context context;
    protected int indent;
    public final boolean jsonb;
    protected java.lang.String lastReference;
    protected int level;
    protected final int maxArraySize;
    protected int off;
    protected com.alibaba.fastjson2.JSONWriter.Path path;
    protected byte pretty;
    protected final char quote;
    protected java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter.Path> refs;
    protected java.lang.Object rootObject;
    protected boolean startObject;
    public final com.alibaba.fastjson2.SymbolTable symbolTable;
    public final boolean useSingleQuote;
    public final boolean utf16;
    public final boolean utf8;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Context {
        com.alibaba.fastjson2.filter.AfterFilter afterFilter;
        com.alibaba.fastjson2.filter.BeforeFilter beforeFilter;
        com.alibaba.fastjson2.filter.ContextNameFilter contextNameFilter;
        com.alibaba.fastjson2.filter.ContextValueFilter contextValueFilter;
        java.lang.String dateFormat;
        boolean dateFormatISO8601;
        boolean dateFormatMillis;
        boolean dateFormatUnixTime;
        java.time.format.DateTimeFormatter dateFormatter;
        long features;
        boolean formatHasDay;
        boolean formatHasHour;
        boolean formatyyyyMMddhhmmss19;
        boolean hasFilter;
        com.alibaba.fastjson2.filter.LabelFilter labelFilter;
        java.util.Locale locale;
        int maxLevel;
        com.alibaba.fastjson2.filter.NameFilter nameFilter;
        com.alibaba.fastjson2.filter.PropertyFilter propertyFilter;
        com.alibaba.fastjson2.filter.PropertyPreFilter propertyPreFilter;
        public final com.alibaba.fastjson2.writer.ObjectWriterProvider provider;
        java.util.TimeZone timeZone;
        com.alibaba.fastjson2.filter.ValueFilter valueFilter;
        java.time.ZoneId zoneId;

        public Context(com.alibaba.fastjson2.writer.ObjectWriterProvider r3) {
                r2 = this;
                r2.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r2.maxLevel = r0
                if (r3 == 0) goto L1b
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
                r2.features = r0
                r2.provider = r3
                java.time.ZoneId r3 = com.alibaba.fastjson2.JSONFactory.defaultWriterZoneId
                r2.zoneId = r3
                java.lang.String r3 = com.alibaba.fastjson2.JSONFactory.defaultWriterFormat
                if (r3 == 0) goto L1a
                r2.setDateFormat(r3)
            L1a:
                return
            L1b:
                java.lang.String r3 = "objectWriterProvider must not null"
                j8.o.t(r3)
                r3 = 0
                throw r3
        }

        public Context(com.alibaba.fastjson2.writer.ObjectWriterProvider r6, java.lang.String r7, com.alibaba.fastjson2.filter.Filter r8, com.alibaba.fastjson2.JSONWriter.Feature... r9) {
                r5 = this;
                r5.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r5.maxLevel = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
                r5.features = r0
                r5.provider = r6
                java.time.ZoneId r6 = com.alibaba.fastjson2.JSONFactory.defaultWriterZoneId
                r5.zoneId = r6
                r6 = 0
                r0 = r6
            L13:
                int r1 = r9.length
                if (r0 >= r1) goto L22
                long r1 = r5.features
                r3 = r9[r0]
                long r3 = r3.mask
                long r1 = r1 | r3
                r5.features = r1
                int r0 = r0 + 1
                goto L13
            L22:
                r9 = 1
                com.alibaba.fastjson2.filter.Filter[] r9 = new com.alibaba.fastjson2.filter.Filter[r9]
                r9[r6] = r8
                r5.configFilter(r9)
                if (r7 != 0) goto L2e
                java.lang.String r7 = com.alibaba.fastjson2.JSONFactory.defaultWriterFormat
            L2e:
                if (r7 == 0) goto L33
                r5.setDateFormat(r7)
            L33:
                return
        }

        public Context(com.alibaba.fastjson2.writer.ObjectWriterProvider r5, com.alibaba.fastjson2.JSONWriter.Feature... r6) {
                r4 = this;
                r4.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r4.maxLevel = r0
                if (r5 == 0) goto L2b
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
                r4.features = r0
                r4.provider = r5
                java.time.ZoneId r5 = com.alibaba.fastjson2.JSONFactory.defaultWriterZoneId
                r4.zoneId = r5
                r5 = 0
            L14:
                int r0 = r6.length
                if (r5 >= r0) goto L23
                long r0 = r4.features
                r2 = r6[r5]
                long r2 = r2.mask
                long r0 = r0 | r2
                r4.features = r0
                int r5 = r5 + 1
                goto L14
            L23:
                java.lang.String r5 = com.alibaba.fastjson2.JSONFactory.defaultWriterFormat
                if (r5 == 0) goto L2a
                r4.setDateFormat(r5)
            L2a:
                return
            L2b:
                java.lang.String r5 = "objectWriterProvider must not null"
                j8.o.t(r5)
                r5 = 0
                throw r5
        }

        public Context(java.lang.String r6, com.alibaba.fastjson2.JSONWriter.Feature... r7) {
                r5 = this;
                r5.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r5.maxLevel = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
                r5.features = r0
                com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
                r5.provider = r0
                java.time.ZoneId r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterZoneId
                r5.zoneId = r0
                r0 = 0
            L14:
                int r1 = r7.length
                if (r0 >= r1) goto L23
                long r1 = r5.features
                r3 = r7[r0]
                long r3 = r3.mask
                long r1 = r1 | r3
                r5.features = r1
                int r0 = r0 + 1
                goto L14
            L23:
                if (r6 != 0) goto L27
                java.lang.String r6 = com.alibaba.fastjson2.JSONFactory.defaultWriterFormat
            L27:
                if (r6 == 0) goto L2c
                r5.setDateFormat(r6)
            L2c:
                return
        }

        public Context(com.alibaba.fastjson2.JSONWriter.Feature... r6) {
                r5 = this;
                r5.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r5.maxLevel = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
                r5.features = r0
                com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
                r5.provider = r0
                java.time.ZoneId r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterZoneId
                r5.zoneId = r0
                java.lang.String r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFormat
                if (r0 == 0) goto L1a
                r5.setDateFormat(r0)
            L1a:
                r0 = 0
            L1b:
                int r1 = r6.length
                if (r0 >= r1) goto L2a
                long r1 = r5.features
                r3 = r6[r0]
                long r3 = r3.mask
                long r1 = r1 | r3
                r5.features = r1
                int r0 = r0 + 1
                goto L1b
            L2a:
                return
        }

        public void config(com.alibaba.fastjson2.JSONWriter.Feature r3, boolean r4) {
                r2 = this;
                long r0 = r2.features
                if (r4 == 0) goto La
                long r3 = r3.mask
                long r3 = r3 | r0
                r2.features = r3
                return
            La:
                long r3 = r3.mask
                long r3 = ~r3
                long r3 = r3 & r0
                r2.features = r3
                return
        }

        public void config(com.alibaba.fastjson2.JSONWriter.Feature... r6) {
                r5 = this;
                r0 = 0
            L1:
                int r1 = r6.length
                if (r0 >= r1) goto L10
                long r1 = r5.features
                r3 = r6[r0]
                long r3 = r3.mask
                long r1 = r1 | r3
                r5.features = r1
                int r0 = r0 + 1
                goto L1
            L10:
                return
        }

        public void configFilter(com.alibaba.fastjson2.filter.Filter... r6) {
                r5 = this;
                if (r6 != 0) goto L3
                return
            L3:
                r0 = 0
                r1 = r0
            L5:
                int r2 = r6.length
                if (r1 >= r2) goto La4
                r2 = r6[r1]
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.NameFilter
                if (r3 == 0) goto L21
                com.alibaba.fastjson2.filter.NameFilter r3 = r5.nameFilter
                if (r3 != 0) goto L18
                r3 = r2
                com.alibaba.fastjson2.filter.NameFilter r3 = (com.alibaba.fastjson2.filter.NameFilter) r3
                r5.nameFilter = r3
                goto L21
            L18:
                r4 = r2
                com.alibaba.fastjson2.filter.NameFilter r4 = (com.alibaba.fastjson2.filter.NameFilter) r4
                com.alibaba.fastjson2.filter.NameFilter r3 = com.alibaba.fastjson2.filter.NameFilter.compose(r3, r4)
                r5.nameFilter = r3
            L21:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.ValueFilter
                if (r3 == 0) goto L38
                com.alibaba.fastjson2.filter.ValueFilter r3 = r5.valueFilter
                if (r3 != 0) goto L2f
                r3 = r2
                com.alibaba.fastjson2.filter.ValueFilter r3 = (com.alibaba.fastjson2.filter.ValueFilter) r3
                r5.valueFilter = r3
                goto L38
            L2f:
                r4 = r2
                com.alibaba.fastjson2.filter.ValueFilter r4 = (com.alibaba.fastjson2.filter.ValueFilter) r4
                com.alibaba.fastjson2.filter.ValueFilter r3 = com.alibaba.fastjson2.filter.ValueFilter.compose(r3, r4)
                r5.valueFilter = r3
            L38:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.PropertyFilter
                if (r3 == 0) goto L4f
                com.alibaba.fastjson2.filter.PropertyFilter r3 = r5.propertyFilter
                if (r3 != 0) goto L46
                r3 = r2
                com.alibaba.fastjson2.filter.PropertyFilter r3 = (com.alibaba.fastjson2.filter.PropertyFilter) r3
                r5.propertyFilter = r3
                goto L4f
            L46:
                r4 = r2
                com.alibaba.fastjson2.filter.PropertyFilter r4 = (com.alibaba.fastjson2.filter.PropertyFilter) r4
                com.alibaba.fastjson2.filter.PropertyFilter r3 = com.alibaba.fastjson2.filter.PropertyFilter.compose(r3, r4)
                r5.propertyFilter = r3
            L4f:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.PropertyPreFilter
                if (r3 == 0) goto L66
                com.alibaba.fastjson2.filter.PropertyPreFilter r3 = r5.propertyPreFilter
                if (r3 != 0) goto L5d
                r3 = r2
                com.alibaba.fastjson2.filter.PropertyPreFilter r3 = (com.alibaba.fastjson2.filter.PropertyPreFilter) r3
                r5.propertyPreFilter = r3
                goto L66
            L5d:
                r4 = r2
                com.alibaba.fastjson2.filter.PropertyPreFilter r4 = (com.alibaba.fastjson2.filter.PropertyPreFilter) r4
                com.alibaba.fastjson2.filter.PropertyPreFilter r3 = com.alibaba.fastjson2.filter.PropertyPreFilter.compose(r3, r4)
                r5.propertyPreFilter = r3
            L66:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.BeforeFilter
                if (r3 == 0) goto L6f
                r3 = r2
                com.alibaba.fastjson2.filter.BeforeFilter r3 = (com.alibaba.fastjson2.filter.BeforeFilter) r3
                r5.beforeFilter = r3
            L6f:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.AfterFilter
                if (r3 == 0) goto L78
                r3 = r2
                com.alibaba.fastjson2.filter.AfterFilter r3 = (com.alibaba.fastjson2.filter.AfterFilter) r3
                r5.afterFilter = r3
            L78:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.LabelFilter
                if (r3 == 0) goto L8f
                com.alibaba.fastjson2.filter.LabelFilter r3 = r5.labelFilter
                if (r3 != 0) goto L86
                r3 = r2
                com.alibaba.fastjson2.filter.LabelFilter r3 = (com.alibaba.fastjson2.filter.LabelFilter) r3
                r5.labelFilter = r3
                goto L8f
            L86:
                r4 = r2
                com.alibaba.fastjson2.filter.LabelFilter r4 = (com.alibaba.fastjson2.filter.LabelFilter) r4
                com.alibaba.fastjson2.filter.LabelFilter r3 = com.alibaba.fastjson2.filter.LabelFilter.compose(r3, r4)
                r5.labelFilter = r3
            L8f:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.ContextValueFilter
                if (r3 == 0) goto L98
                r3 = r2
                com.alibaba.fastjson2.filter.ContextValueFilter r3 = (com.alibaba.fastjson2.filter.ContextValueFilter) r3
                r5.contextValueFilter = r3
            L98:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.ContextNameFilter
                if (r3 == 0) goto La0
                com.alibaba.fastjson2.filter.ContextNameFilter r2 = (com.alibaba.fastjson2.filter.ContextNameFilter) r2
                r5.contextNameFilter = r2
            La0:
                int r1 = r1 + 1
                goto L5
            La4:
                com.alibaba.fastjson2.filter.PropertyPreFilter r6 = r5.propertyPreFilter
                if (r6 != 0) goto Lc8
                com.alibaba.fastjson2.filter.PropertyFilter r6 = r5.propertyFilter
                if (r6 != 0) goto Lc8
                com.alibaba.fastjson2.filter.NameFilter r6 = r5.nameFilter
                if (r6 != 0) goto Lc8
                com.alibaba.fastjson2.filter.ValueFilter r6 = r5.valueFilter
                if (r6 != 0) goto Lc8
                com.alibaba.fastjson2.filter.BeforeFilter r6 = r5.beforeFilter
                if (r6 != 0) goto Lc8
                com.alibaba.fastjson2.filter.AfterFilter r6 = r5.afterFilter
                if (r6 != 0) goto Lc8
                com.alibaba.fastjson2.filter.LabelFilter r6 = r5.labelFilter
                if (r6 != 0) goto Lc8
                com.alibaba.fastjson2.filter.ContextValueFilter r6 = r5.contextValueFilter
                if (r6 != 0) goto Lc8
                com.alibaba.fastjson2.filter.ContextNameFilter r6 = r5.contextNameFilter
                if (r6 == 0) goto Lc9
            Lc8:
                r0 = 1
            Lc9:
                r5.hasFilter = r0
                return
        }

        public com.alibaba.fastjson2.filter.AfterFilter getAfterFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.AfterFilter r0 = r1.afterFilter
                return r0
        }

        public com.alibaba.fastjson2.filter.BeforeFilter getBeforeFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.BeforeFilter r0 = r1.beforeFilter
                return r0
        }

        public com.alibaba.fastjson2.filter.ContextNameFilter getContextNameFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.ContextNameFilter r0 = r1.contextNameFilter
                return r0
        }

        public com.alibaba.fastjson2.filter.ContextValueFilter getContextValueFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.ContextValueFilter r0 = r1.contextValueFilter
                return r0
        }

        public java.lang.String getDateFormat() {
                r1 = this;
                java.lang.String r0 = r1.dateFormat
                return r0
        }

        public java.time.format.DateTimeFormatter getDateFormatter() {
                r2 = this;
                java.time.format.DateTimeFormatter r0 = r2.dateFormatter
                if (r0 != 0) goto L23
                java.lang.String r0 = r2.dateFormat
                if (r0 == 0) goto L23
                boolean r1 = r2.dateFormatMillis
                if (r1 != 0) goto L23
                boolean r1 = r2.dateFormatISO8601
                if (r1 != 0) goto L23
                boolean r1 = r2.dateFormatUnixTime
                if (r1 != 0) goto L23
                java.util.Locale r1 = r2.locale
                if (r1 != 0) goto L1d
                java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0)
                goto L21
            L1d:
                java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r1)
            L21:
                r2.dateFormatter = r0
            L23:
                java.time.format.DateTimeFormatter r0 = r2.dateFormatter
                return r0
        }

        public long getFeatures() {
                r2 = this;
                long r0 = r2.features
                return r0
        }

        public com.alibaba.fastjson2.filter.LabelFilter getLabelFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.LabelFilter r0 = r1.labelFilter
                return r0
        }

        public com.alibaba.fastjson2.filter.NameFilter getNameFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.NameFilter r0 = r1.nameFilter
                return r0
        }

        public <T> com.alibaba.fastjson2.writer.ObjectWriter<T> getObjectWriter(java.lang.Class<T> r5) {
                r4 = this;
                long r0 = r4.features
                com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
                long r2 = r2.mask
                long r0 = r0 & r2
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = r4.provider
                com.alibaba.fastjson2.writer.ObjectWriter r5 = r1.getObjectWriter(r5, r5, r0)
                return r5
        }

        public <T> com.alibaba.fastjson2.writer.ObjectWriter<T> getObjectWriter(java.lang.reflect.Type r5, java.lang.Class<T> r6) {
                r4 = this;
                long r0 = r4.features
                com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
                long r2 = r2.mask
                long r0 = r0 & r2
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = r4.provider
                com.alibaba.fastjson2.writer.ObjectWriter r5 = r1.getObjectWriter(r5, r6, r0)
                return r5
        }

        public com.alibaba.fastjson2.filter.PropertyFilter getPropertyFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.PropertyFilter r0 = r1.propertyFilter
                return r0
        }

        public com.alibaba.fastjson2.filter.PropertyPreFilter getPropertyPreFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.PropertyPreFilter r0 = r1.propertyPreFilter
                return r0
        }

        public com.alibaba.fastjson2.writer.ObjectWriterProvider getProvider() {
                r1 = this;
                com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = r1.provider
                return r0
        }

        public com.alibaba.fastjson2.filter.ValueFilter getValueFilter() {
                r1 = this;
                com.alibaba.fastjson2.filter.ValueFilter r0 = r1.valueFilter
                return r0
        }

        public java.time.ZoneId getZoneId() {
                r1 = this;
                java.time.ZoneId r0 = r1.zoneId
                if (r0 != 0) goto L8
                java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
                r1.zoneId = r0
            L8:
                java.time.ZoneId r0 = r1.zoneId
                return r0
        }

        public boolean isDateFormatHasDay() {
                r1 = this;
                boolean r0 = r1.formatHasDay
                return r0
        }

        public boolean isDateFormatHasHour() {
                r1 = this;
                boolean r0 = r1.formatHasHour
                return r0
        }

        public boolean isDateFormatISO8601() {
                r1 = this;
                boolean r0 = r1.dateFormatISO8601
                return r0
        }

        public boolean isDateFormatMillis() {
                r1 = this;
                boolean r0 = r1.dateFormatMillis
                return r0
        }

        public boolean isDateFormatUnixTime() {
                r1 = this;
                boolean r0 = r1.dateFormatUnixTime
                return r0
        }

        public boolean isEnabled(long r3) {
                r2 = this;
                long r0 = r2.features
                long r3 = r3 & r0
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 == 0) goto Lb
                r3 = 1
                return r3
            Lb:
                r3 = 0
                return r3
        }

        public boolean isEnabled(com.alibaba.fastjson2.JSONWriter.Feature r5) {
                r4 = this;
                long r0 = r4.features
                long r2 = r5.mask
                long r0 = r0 & r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto Ld
                r5 = 1
                return r5
            Ld:
                r5 = 0
                return r5
        }

        public boolean isFormatyyyyMMddhhmmss19() {
                r1 = this;
                boolean r0 = r1.formatyyyyMMddhhmmss19
                return r0
        }

        public void setAfterFilter(com.alibaba.fastjson2.filter.AfterFilter r1) {
                r0 = this;
                r0.afterFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setBeforeFilter(com.alibaba.fastjson2.filter.BeforeFilter r1) {
                r0 = this;
                r0.beforeFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setContextNameFilter(com.alibaba.fastjson2.filter.ContextNameFilter r1) {
                r0 = this;
                r0.contextNameFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setContextValueFilter(com.alibaba.fastjson2.filter.ContextValueFilter r1) {
                r0 = this;
                r0.contextValueFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setDateFormat(java.lang.String r7) {
                r6 = this;
                if (r7 == 0) goto La
                java.lang.String r0 = r6.dateFormat
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto Ld
            La:
                r0 = 0
                r6.dateFormatter = r0
            Ld:
                if (r7 == 0) goto L94
                boolean r0 = r7.isEmpty()
                if (r0 != 0) goto L94
                int r0 = r7.hashCode()
                r1 = 0
                r2 = 1
                r3 = -1
                switch(r0) {
                    case -1074095546: goto L4c;
                    case -288020395: goto L41;
                    case 1333195168: goto L36;
                    case 1834843604: goto L2b;
                    case 2095190916: goto L20;
                    default: goto L1f;
                }
            L1f:
                goto L56
            L20:
                java.lang.String r0 = "iso8601"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L29
                goto L56
            L29:
                r3 = 4
                goto L56
            L2b:
                java.lang.String r0 = "yyyy-MM-ddTHH:mm:ss"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L34
                goto L56
            L34:
                r3 = 3
                goto L56
            L36:
                java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L3f
                goto L56
            L3f:
                r3 = 2
                goto L56
            L41:
                java.lang.String r0 = "unixtime"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L4a
                goto L56
            L4a:
                r3 = r2
                goto L56
            L4c:
                java.lang.String r0 = "millis"
                boolean r0 = r7.equals(r0)
                if (r0 != 0) goto L55
                goto L56
            L55:
                r3 = r1
            L56:
                switch(r3) {
                    case 0: goto L82;
                    case 1: goto L7d;
                    case 2: goto L77;
                    case 3: goto L70;
                    case 4: goto L6b;
                    default: goto L59;
                }
            L59:
                java.lang.String r0 = "d"
                boolean r0 = r7.contains(r0)
                java.lang.String r2 = "H"
                boolean r2 = r7.contains(r2)
                r3 = r0
                r0 = r1
                r5 = r0
                r4 = r2
            L69:
                r2 = r5
                goto L88
            L6b:
                r0 = r1
                r3 = r0
                r4 = r3
                r5 = r4
                goto L88
            L70:
                java.lang.String r7 = "yyyy-MM-dd'T'HH:mm:ss"
                r0 = r1
                r5 = r0
                r3 = r2
                r4 = r3
                goto L69
            L77:
                r0 = r1
                r3 = r2
                r4 = r3
                r5 = r4
                r2 = r0
                goto L88
            L7d:
                r3 = r1
                r4 = r3
                r5 = r4
                r0 = r2
                goto L69
            L82:
                r0 = r1
                r3 = r0
                r4 = r3
                r5 = r4
                r1 = r2
                goto L69
            L88:
                r6.dateFormatMillis = r1
                r6.dateFormatISO8601 = r2
                r6.dateFormatUnixTime = r0
                r6.formatHasDay = r3
                r6.formatHasHour = r4
                r6.formatyyyyMMddhhmmss19 = r5
            L94:
                r6.dateFormat = r7
                return
        }

        public void setFeatures(long r1) {
                r0 = this;
                r0.features = r1
                return
        }

        public void setLabelFilter(com.alibaba.fastjson2.filter.LabelFilter r1) {
                r0 = this;
                r0.labelFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setNameFilter(com.alibaba.fastjson2.filter.NameFilter r1) {
                r0 = this;
                r0.nameFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setPropertyFilter(com.alibaba.fastjson2.filter.PropertyFilter r1) {
                r0 = this;
                r0.propertyFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setPropertyPreFilter(com.alibaba.fastjson2.filter.PropertyPreFilter r1) {
                r0 = this;
                r0.propertyPreFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setTimeZone(java.util.TimeZone r1) {
                r0 = this;
                r0.timeZone = r1
                return
        }

        public void setValueFilter(com.alibaba.fastjson2.filter.ValueFilter r1) {
                r0 = this;
                r0.valueFilter = r1
                if (r1 == 0) goto L7
                r1 = 1
                r0.hasFilter = r1
            L7:
                return
        }

        public void setZoneId(java.time.ZoneId r1) {
                r0 = this;
                r0.zoneId = r1
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Feature extends java.lang.Enum<com.alibaba.fastjson2.JSONWriter.Feature> {
        private static final /* synthetic */ com.alibaba.fastjson2.JSONWriter.Feature[] $VALUES = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature BeanToArray = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature BrowserCompatible = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature BrowserSecure = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature ErrorOnNoneSerializable = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature EscapeNoneAscii = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature FieldBased = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature IgnoreEmpty = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature IgnoreErrorGetter = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature IgnoreNonFieldGetter = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature IgnoreNoneSerializable = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature LargeObject = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature MapSortField = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature NotWriteDefaultValue = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature NotWriteEmptyArray = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature NotWriteHashMapArrayListClassName = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature NotWriteNumberClassName = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature NotWriteRootClassName = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature NotWriteSetClassName = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature NullAsDefaultValue = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature OptimizedForAscii = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature PrettyFormat = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature PrettyFormatWith2Space = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature PrettyFormatWith4Space = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature ReferenceDetection = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature SortMapEntriesByKeys = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature UnquoteFieldName = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature UseSingleQuotes = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteBigDecimalAsPlain = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteBooleanAsNumber = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteByteArrayAsBase64 = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteClassName = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteEnumUsingOrdinal = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteEnumUsingToString = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteEnumsUsingName = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteLongAsString = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteMapNullValue = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteNameAsSymbol = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteNonStringKeyAsString = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteNonStringValueAsString = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteNullBooleanAsFalse = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteNullListAsEmpty = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteNullNumberAsZero = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteNullStringAsEmpty = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteNulls = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WritePairAsJavaBean = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriteThrowableClassName = null;
        public static final com.alibaba.fastjson2.JSONWriter.Feature WriterUtilDateAsMillis = null;
        public final long mask;

        static {
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 0
                r2 = 1
                java.lang.String r4 = "FieldBased"
                r1.<init>(r4, r0, r2)
                com.alibaba.fastjson2.JSONWriter.Feature.FieldBased = r1
                com.alibaba.fastjson2.JSONWriter$Feature r2 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 1
                r3 = 2
                java.lang.String r5 = "IgnoreNoneSerializable"
                r2.<init>(r5, r0, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable = r2
                com.alibaba.fastjson2.JSONWriter$Feature r3 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 2
                r4 = 4
                java.lang.String r6 = "ErrorOnNoneSerializable"
                r3.<init>(r6, r0, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable = r3
                com.alibaba.fastjson2.JSONWriter$Feature r4 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 3
                r5 = 8
                java.lang.String r7 = "BeanToArray"
                r4.<init>(r7, r0, r5)
                com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray = r4
                com.alibaba.fastjson2.JSONWriter$Feature r5 = new com.alibaba.fastjson2.JSONWriter$Feature
                java.lang.String r0 = "WriteNulls"
                r6 = 4
                r7 = 16
                r5.<init>(r0, r6, r7)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls = r5
                com.alibaba.fastjson2.JSONWriter$Feature r6 = new com.alibaba.fastjson2.JSONWriter$Feature
                java.lang.String r0 = "WriteMapNullValue"
                r9 = 5
                r6.<init>(r0, r9, r7)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteMapNullValue = r6
                com.alibaba.fastjson2.JSONWriter$Feature r7 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 6
                r8 = 32
                java.lang.String r10 = "BrowserCompatible"
                r7.<init>(r10, r0, r8)
                com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible = r7
                com.alibaba.fastjson2.JSONWriter$Feature r8 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 7
                r9 = 64
                java.lang.String r11 = "NullAsDefaultValue"
                r8.<init>(r11, r0, r9)
                com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue = r8
                com.alibaba.fastjson2.JSONWriter$Feature r9 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 8
                r10 = 128(0x80, double:6.3E-322)
                java.lang.String r12 = "WriteBooleanAsNumber"
                r9.<init>(r12, r0, r10)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteBooleanAsNumber = r9
                com.alibaba.fastjson2.JSONWriter$Feature r10 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 9
                r11 = 256(0x100, double:1.265E-321)
                java.lang.String r13 = "WriteNonStringValueAsString"
                r10.<init>(r13, r0, r11)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString = r10
                com.alibaba.fastjson2.JSONWriter$Feature r11 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 10
                r12 = 512(0x200, double:2.53E-321)
                java.lang.String r14 = "WriteClassName"
                r11.<init>(r14, r0, r12)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName = r11
                com.alibaba.fastjson2.JSONWriter$Feature r12 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 11
                r13 = 1024(0x400, double:5.06E-321)
                java.lang.String r15 = "NotWriteRootClassName"
                r12.<init>(r15, r0, r13)
                com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName = r12
                com.alibaba.fastjson2.JSONWriter$Feature r13 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 12
                r14 = 2048(0x800, double:1.012E-320)
                r16 = r1
                java.lang.String r1 = "NotWriteHashMapArrayListClassName"
                r13.<init>(r1, r0, r14)
                com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName = r13
                com.alibaba.fastjson2.JSONWriter$Feature r14 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 13
                r15 = r2
                r1 = 4096(0x1000, double:2.0237E-320)
                r17 = r3
                java.lang.String r3 = "NotWriteDefaultValue"
                r14.<init>(r3, r0, r1)
                com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue = r14
                r2 = r15
                com.alibaba.fastjson2.JSONWriter$Feature r15 = new com.alibaba.fastjson2.JSONWriter$Feature
                r0 = 14
                r3 = r2
                r1 = 8192(0x2000, double:4.0474E-320)
                r18 = r3
                java.lang.String r3 = "WriteEnumsUsingName"
                r15.<init>(r3, r0, r1)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName = r15
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r1 = 15
                r2 = 16384(0x4000, double:8.095E-320)
                r19 = r4
                java.lang.String r4 = "WriteEnumUsingToString"
                r0.<init>(r4, r1, r2)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 16
                r3 = 32768(0x8000, double:1.61895E-319)
                r20 = r0
                java.lang.String r0 = "IgnoreErrorGetter"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 17
                r3 = 65536(0x10000, double:3.2379E-319)
                r21 = r1
                java.lang.String r1 = "PrettyFormat"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 18
                r3 = 131072(0x20000, double:6.4758E-319)
                r22 = r0
                java.lang.String r0 = "ReferenceDetection"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 19
                r3 = 262144(0x40000, double:1.295163E-318)
                r23 = r1
                java.lang.String r1 = "WriteNameAsSymbol"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 20
                r3 = 524288(0x80000, double:2.590327E-318)
                r24 = r0
                java.lang.String r0 = "WriteBigDecimalAsPlain"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteBigDecimalAsPlain = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 21
                r3 = 1048576(0x100000, double:5.180654E-318)
                r25 = r1
                java.lang.String r1 = "UseSingleQuotes"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.UseSingleQuotes = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 22
                r3 = 2097152(0x200000, double:1.036131E-317)
                r26 = r0
                java.lang.String r0 = "MapSortField"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.MapSortField = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 23
                r3 = 4194304(0x400000, double:2.0722615E-317)
                r27 = r1
                java.lang.String r1 = "WriteNullListAsEmpty"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 24
                r3 = 8388608(0x800000, double:4.144523E-317)
                r28 = r0
                java.lang.String r0 = "WriteNullStringAsEmpty"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 25
                r3 = 16777216(0x1000000, double:8.289046E-317)
                r29 = r1
                java.lang.String r1 = "WriteNullNumberAsZero"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r2 = 26
                r3 = 33554432(0x2000000, double:1.6578092E-316)
                r30 = r0
                java.lang.String r0 = "WriteNullBooleanAsFalse"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                java.lang.String r2 = "NotWriteEmptyArray"
                r3 = 27
                r31 = r5
                r4 = 67108864(0x4000000, double:3.3156184E-316)
                r0.<init>(r2, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray = r0
                com.alibaba.fastjson2.JSONWriter$Feature r2 = new com.alibaba.fastjson2.JSONWriter$Feature
                java.lang.String r3 = "IgnoreEmpty"
                r32 = r0
                r0 = 28
                r2.<init>(r3, r0, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.IgnoreEmpty = r2
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 29
                r4 = 134217728(0x8000000, double:6.63123685E-316)
                r33 = r1
                java.lang.String r1 = "WriteNonStringKeyAsString"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringKeyAsString = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 30
                r4 = 268435456(0x10000000, double:1.32624737E-315)
                r34 = r0
                java.lang.String r0 = "WritePairAsJavaBean"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.WritePairAsJavaBean = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 31
                r4 = 536870912(0x20000000, double:2.65249474E-315)
                r35 = r1
                java.lang.String r1 = "OptimizedForAscii"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.OptimizedForAscii = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 32
                r4 = 1073741824(0x40000000, double:5.304989477E-315)
                r36 = r0
                java.lang.String r0 = "EscapeNoneAscii"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 33
                r4 = 2147483648(0x80000000, double:1.0609978955E-314)
                r37 = r1
                java.lang.String r1 = "WriteByteArrayAsBase64"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteByteArrayAsBase64 = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 34
                r4 = 4294967296(0x100000000, double:2.121995791E-314)
                r38 = r0
                java.lang.String r0 = "IgnoreNonFieldGetter"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 35
                r4 = 8589934592(0x200000000, double:4.243991582E-314)
                r39 = r1
                java.lang.String r1 = "LargeObject"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.LargeObject = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 36
                r4 = 17179869184(0x400000000, double:8.487983164E-314)
                r40 = r0
                java.lang.String r0 = "WriteLongAsString"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteLongAsString = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 37
                r4 = 34359738368(0x800000000, double:1.69759663277E-313)
                r41 = r1
                java.lang.String r1 = "BrowserSecure"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 38
                r4 = 68719476736(0x1000000000, double:3.39519326554E-313)
                r42 = r0
                java.lang.String r0 = "WriteEnumUsingOrdinal"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingOrdinal = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 39
                r4 = 137438953472(0x2000000000, double:6.7903865311E-313)
                r43 = r1
                java.lang.String r1 = "WriteThrowableClassName"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.WriteThrowableClassName = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 40
                r4 = 274877906944(0x4000000000, double:1.35807730622E-312)
                r44 = r0
                java.lang.String r0 = "UnquoteFieldName"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.UnquoteFieldName = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 41
                r4 = 549755813888(0x8000000000, double:2.716154612436E-312)
                r45 = r1
                java.lang.String r1 = "NotWriteSetClassName"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.NotWriteSetClassName = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 42
                r4 = 1099511627776(0x10000000000, double:5.43230922487E-312)
                r46 = r0
                java.lang.String r0 = "NotWriteNumberClassName"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.NotWriteNumberClassName = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 43
                r4 = 2199023255552(0x20000000000, double:1.086461844974E-311)
                r47 = r1
                java.lang.String r1 = "SortMapEntriesByKeys"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.SortMapEntriesByKeys = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 44
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                r48 = r0
                java.lang.String r0 = "PrettyFormatWith2Space"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormatWith2Space = r1
                com.alibaba.fastjson2.JSONWriter$Feature r0 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 45
                r4 = 8796093022208(0x80000000000, double:4.345847379897E-311)
                r49 = r1
                java.lang.String r1 = "PrettyFormatWith4Space"
                r0.<init>(r1, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormatWith4Space = r0
                com.alibaba.fastjson2.JSONWriter$Feature r1 = new com.alibaba.fastjson2.JSONWriter$Feature
                r3 = 46
                r4 = 17592186044416(0x100000000000, double:8.691694759794E-311)
                r50 = r0
                java.lang.String r0 = "WriterUtilDateAsMillis"
                r1.<init>(r0, r3, r4)
                com.alibaba.fastjson2.JSONWriter.Feature.WriterUtilDateAsMillis = r1
                r3 = r17
                r4 = r19
                r17 = r21
                r19 = r23
                r21 = r25
                r23 = r27
                r25 = r29
                r5 = r31
                r27 = r33
                r31 = r35
                r33 = r37
                r35 = r39
                r37 = r41
                r39 = r43
                r41 = r45
                r43 = r47
                r45 = r49
                r47 = r1
                r29 = r2
                r1 = r16
                r2 = r18
                r16 = r20
                r18 = r22
                r20 = r24
                r22 = r26
                r24 = r28
                r26 = r30
                r28 = r32
                r30 = r34
                r32 = r36
                r34 = r38
                r36 = r40
                r38 = r42
                r40 = r44
                r42 = r46
                r44 = r48
                r46 = r50
                com.alibaba.fastjson2.JSONWriter$Feature[] r0 = new com.alibaba.fastjson2.JSONWriter.Feature[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47}
                com.alibaba.fastjson2.JSONWriter.Feature.$VALUES = r0
                return
        }

        Feature(java.lang.String r1, int r2, long r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mask = r3
                return
        }

        public static com.alibaba.fastjson2.JSONWriter.Feature valueOf(java.lang.String r1) {
                java.lang.Class<com.alibaba.fastjson2.JSONWriter$Feature> r0 = com.alibaba.fastjson2.JSONWriter.Feature.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.alibaba.fastjson2.JSONWriter$Feature r1 = (com.alibaba.fastjson2.JSONWriter.Feature) r1
                return r1
        }

        public static com.alibaba.fastjson2.JSONWriter.Feature[] values() {
                com.alibaba.fastjson2.JSONWriter$Feature[] r0 = com.alibaba.fastjson2.JSONWriter.Feature.$VALUES
                java.lang.Object r0 = r0.clone()
                com.alibaba.fastjson2.JSONWriter$Feature[] r0 = (com.alibaba.fastjson2.JSONWriter.Feature[]) r0
                return r0
        }

        public boolean isEnabled(long r3) {
                r2 = this;
                long r0 = r2.mask
                long r3 = r3 & r0
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 == 0) goto Lb
                r3 = 1
                return r3
            Lb:
                r3 = 0
                return r3
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Path {
        public static final com.alibaba.fastjson2.JSONWriter.Path ROOT = null;
        com.alibaba.fastjson2.JSONWriter.Path child0;
        com.alibaba.fastjson2.JSONWriter.Path child1;
        java.lang.String fullPath;
        final int index;
        final java.lang.String name;
        public final com.alibaba.fastjson2.JSONWriter.Path parent;

        static {
                com.alibaba.fastjson2.JSONWriter$Path r0 = new com.alibaba.fastjson2.JSONWriter$Path
                r1 = 0
                java.lang.String r2 = "$"
                r0.<init>(r1, r2)
                com.alibaba.fastjson2.JSONWriter.Path.ROOT = r0
                return
        }

        public Path(com.alibaba.fastjson2.JSONWriter.Path r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r1 = 0
                r0.name = r1
                r0.index = r2
                return
        }

        public Path(com.alibaba.fastjson2.JSONWriter.Path r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.name = r2
                r1 = -1
                r0.index = r1
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L3d
                java.lang.Class<com.alibaba.fastjson2.JSONWriter$Path> r2 = com.alibaba.fastjson2.JSONWriter.Path.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L3d
            L10:
                com.alibaba.fastjson2.JSONWriter$Path r5 = (com.alibaba.fastjson2.JSONWriter.Path) r5
                int r2 = r4.index
                int r3 = r5.index
                if (r2 != r3) goto L1e
                com.alibaba.fastjson2.JSONWriter$Path r2 = r4.parent
                com.alibaba.fastjson2.JSONWriter$Path r3 = r5.parent
                if (r2 == r3) goto L3c
            L1e:
                com.alibaba.fastjson2.JSONWriter$Path r2 = r4.parent
                if (r2 == 0) goto L30
                com.alibaba.fastjson2.JSONWriter$Path r3 = r5.parent
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L30
                java.lang.String r2 = r4.name
                java.lang.String r3 = r5.name
                if (r2 == r3) goto L3c
            L30:
                java.lang.String r2 = r4.name
                if (r2 == 0) goto L3d
                java.lang.String r5 = r5.name
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L3d
            L3c:
                return r0
            L3d:
                return r1
        }

        public int hashCode() {
                r3 = this;
                com.alibaba.fastjson2.JSONWriter$Path r0 = r3.parent
                java.lang.String r1 = r3.name
                int r2 = r3.index
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                int r0 = java.util.Arrays.hashCode(r0)
                return r0
        }

        public java.lang.String toString() {
                r15 = this;
                java.lang.String r0 = r15.fullPath
                if (r0 == 0) goto L5
                return r0
            L5:
                r0 = 16
                byte[] r0 = new byte[r0]
                r1 = 4
                com.alibaba.fastjson2.JSONWriter$Path[] r2 = new com.alibaba.fastjson2.JSONWriter.Path[r1]
                r3 = 0
                r4 = r15
                r5 = r3
            Lf:
                if (r4 == 0) goto L23
                int r6 = r2.length
                if (r6 != r5) goto L1c
                int r6 = r2.length
                int r6 = r6 + r1
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
                com.alibaba.fastjson2.JSONWriter$Path[] r2 = (com.alibaba.fastjson2.JSONWriter.Path[]) r2
            L1c:
                r2[r5] = r4
                int r5 = r5 + 1
                com.alibaba.fastjson2.JSONWriter$Path r4 = r4.parent
                goto Lf
            L23:
                r1 = 1
                int r5 = r5 - r1
                r7 = r1
                r6 = r3
                r4 = r5
            L28:
                if (r4 < 0) goto L195
                r8 = r2[r4]
                java.lang.String r9 = r8.name
                r10 = 2
                if (r9 != 0) goto L59
                int r8 = r8.index
                int r9 = com.alibaba.fastjson2.util.IOUtils.stringSize(r8)
            L37:
                int r11 = r6 + r9
                int r11 = r11 + r10
                int r12 = r0.length
                if (r11 < r12) goto L46
                int r11 = r0.length
                int r12 = r0.length
                int r12 = r12 >> r1
                int r11 = r11 + r12
                byte[] r0 = java.util.Arrays.copyOf(r0, r11)
                goto L37
            L46:
                int r9 = r6 + 1
                r10 = 91
                r0[r6] = r10
                int r6 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r0, r9, r8)
                int r8 = r6 + 1
                r9 = 93
                r0[r6] = r9
                r6 = r8
                goto L191
            L59:
                int r8 = r6 + 1
                int r11 = r0.length
                if (r8 < r11) goto L66
                int r11 = r0.length
                int r12 = r0.length
                int r12 = r12 >> r1
                int r11 = r11 + r12
                byte[] r0 = java.util.Arrays.copyOf(r0, r11)
            L66:
                if (r4 == r5) goto L6d
                r11 = 46
                r0[r6] = r11
                r6 = r8
            L6d:
                r8 = r3
            L6e:
                int r11 = r9.length()
                if (r8 >= r11) goto L191
                char r11 = r9.charAt(r8)
                r12 = 96
                if (r11 == r12) goto L178
                r12 = 126(0x7e, float:1.77E-43)
                if (r11 == r12) goto L178
                switch(r11) {
                    case 33: goto L178;
                    case 34: goto L178;
                    case 35: goto L178;
                    default: goto L83;
                }
            L83:
                switch(r11) {
                    case 37: goto L178;
                    case 38: goto L178;
                    case 39: goto L178;
                    case 40: goto L178;
                    case 41: goto L178;
                    case 42: goto L178;
                    case 43: goto L178;
                    default: goto L86;
                }
            L86:
                switch(r11) {
                    case 45: goto L178;
                    case 46: goto L178;
                    case 47: goto L178;
                    default: goto L89;
                }
            L89:
                switch(r11) {
                    case 58: goto L178;
                    case 59: goto L178;
                    case 60: goto L178;
                    case 61: goto L178;
                    case 62: goto L178;
                    case 63: goto L178;
                    case 64: goto L178;
                    default: goto L8c;
                }
            L8c:
                switch(r11) {
                    case 91: goto L178;
                    case 92: goto L178;
                    case 93: goto L178;
                    case 94: goto L178;
                    default: goto L8f;
                }
            L8f:
                if (r11 < r1) goto La8
                r12 = 127(0x7f, float:1.78E-43)
                if (r11 > r12) goto La8
                int r12 = r0.length
                if (r6 != r12) goto La0
                int r12 = r0.length
                int r13 = r0.length
                int r13 = r13 >> r1
                int r12 = r12 + r13
                byte[] r0 = java.util.Arrays.copyOf(r0, r12)
            La0:
                int r12 = r6 + 1
                byte r11 = (byte) r11
                r0[r6] = r11
                r6 = r12
                goto L18e
            La8:
                r7 = 55296(0xd800, float:7.7486E-41)
                r12 = 63
                if (r11 < r7) goto L128
                r7 = 57344(0xe000, float:8.0356E-41)
                if (r11 >= r7) goto L128
                r13 = 56320(0xdc00, float:7.8921E-41)
                if (r11 >= r13) goto L123
                int r14 = r9.length()
                int r14 = r14 - r4
                if (r14 >= r10) goto Lc2
                r7 = -1
                goto Ld3
            Lc2:
                int r14 = r4 + 1
                char r14 = r9.charAt(r14)
                if (r14 < r13) goto L11e
                if (r14 >= r7) goto L11e
                int r7 = r11 << 10
                int r7 = r7 + r14
                r11 = -56613888(0xfffffffffca02400, float:-6.651981E36)
                int r7 = r7 + r11
            Ld3:
                if (r7 >= 0) goto Le5
                int r7 = r0.length
                if (r6 != r7) goto Le0
                int r7 = r0.length
                int r11 = r0.length
                int r11 = r11 >> r1
                int r7 = r7 + r11
                byte[] r0 = java.util.Arrays.copyOf(r0, r7)
            Le0:
                int r7 = r6 + 1
                r0[r6] = r12
                goto L11b
            Le5:
                int r11 = r6 + 3
                int r13 = r0.length
                if (r11 < r13) goto Lf2
                int r11 = r0.length
                int r13 = r0.length
                int r13 = r13 >> r1
                int r11 = r11 + r13
                byte[] r0 = java.util.Arrays.copyOf(r0, r11)
            Lf2:
                int r11 = r6 + 1
                int r13 = r7 >> 18
                r13 = r13 | 240(0xf0, float:3.36E-43)
                byte r13 = (byte) r13
                r0[r6] = r13
                int r13 = r6 + 2
                int r14 = r7 >> 12
                r14 = r14 & r12
                r14 = r14 | 128(0x80, float:1.8E-43)
                byte r14 = (byte) r14
                r0[r11] = r14
                int r11 = r6 + 3
                int r14 = r7 >> 6
                r12 = r12 & r14
                r12 = r12 | 128(0x80, float:1.8E-43)
                byte r12 = (byte) r12
                r0[r13] = r12
                int r6 = r6 + 4
                r7 = r7 & 63
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7
                r0[r11] = r7
                int r8 = r8 + 1
                r7 = r6
            L11b:
                r6 = r7
            L11c:
                r7 = r3
                goto L18e
            L11e:
                int r7 = r6 + 1
                r0[r6] = r12
                goto L11b
            L123:
                int r7 = r6 + 1
                r0[r6] = r12
                goto L11b
            L128:
                r7 = 2047(0x7ff, float:2.868E-42)
                if (r11 <= r7) goto L158
                int r7 = r6 + 2
                int r13 = r0.length
                if (r7 < r13) goto L139
                int r7 = r0.length
                int r13 = r0.length
                int r13 = r13 >> r1
                int r7 = r7 + r13
                byte[] r0 = java.util.Arrays.copyOf(r0, r7)
            L139:
                int r7 = r6 + 1
                int r13 = r11 >> 12
                r13 = r13 & 15
                r13 = r13 | 224(0xe0, float:3.14E-43)
                byte r13 = (byte) r13
                r0[r6] = r13
                int r13 = r6 + 2
                int r14 = r11 >> 6
                r12 = r12 & r14
                r12 = r12 | 128(0x80, float:1.8E-43)
                byte r12 = (byte) r12
                r0[r7] = r12
                int r6 = r6 + 3
                r7 = r11 & 63
                r7 = r7 | 128(0x80, float:1.8E-43)
                byte r7 = (byte) r7
                r0[r13] = r7
                goto L11c
            L158:
                int r7 = r6 + 1
                int r12 = r0.length
                if (r7 < r12) goto L165
                int r12 = r0.length
                int r13 = r0.length
                int r13 = r13 >> r1
                int r12 = r12 + r13
                byte[] r0 = java.util.Arrays.copyOf(r0, r12)
            L165:
                int r12 = r11 >> 6
                r12 = r12 & 31
                r12 = r12 | 192(0xc0, float:2.69E-43)
                byte r12 = (byte) r12
                r0[r6] = r12
                int r6 = r6 + 2
                r11 = r11 & 63
                r11 = r11 | 128(0x80, float:1.8E-43)
                byte r11 = (byte) r11
                r0[r7] = r11
                goto L11c
            L178:
                int r12 = r6 + 1
                int r13 = r0.length
                if (r12 < r13) goto L185
                int r13 = r0.length
                int r14 = r0.length
                int r14 = r14 >> r1
                int r13 = r13 + r14
                byte[] r0 = java.util.Arrays.copyOf(r0, r13)
            L185:
                r13 = 92
                r0[r6] = r13
                int r6 = r6 + 2
                byte r11 = (byte) r11
                r0[r12] = r11
            L18e:
                int r8 = r8 + r1
                goto L6e
            L191:
                int r4 = r4 + (-1)
                goto L28
            L195:
                java.lang.String r1 = new java.lang.String
                if (r7 == 0) goto L19c
                java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
                goto L19e
            L19c:
                java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            L19e:
                r1.<init>(r0, r3, r6, r2)
                r15.fullPath = r1
                return r1
        }
    }

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            com.alibaba.fastjson2.JSONWriter.DIGITS = r0
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r0 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r2 = r2.mask
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r2 = r2.mask
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter.NONE_DIRECT_FEATURES = r0
            return
    }

    public JSONWriter(com.alibaba.fastjson2.JSONWriter.Context r6, com.alibaba.fastjson2.SymbolTable r7, boolean r8, java.nio.charset.Charset r9) {
            r5 = this;
            r5.<init>()
            r5.context = r6
            r5.symbolTable = r7
            r5.charset = r9
            r5.jsonb = r8
            r7 = 0
            r0 = 1
            if (r8 != 0) goto L15
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            if (r9 != r1) goto L15
            r1 = r0
            goto L16
        L15:
            r1 = r7
        L16:
            r5.utf8 = r1
            if (r8 != 0) goto L20
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            if (r9 != r1) goto L20
            r9 = r0
            goto L21
        L20:
            r9 = r7
        L21:
            r5.utf16 = r9
            r1 = 0
            if (r8 != 0) goto L34
            long r8 = r6.features
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.UseSingleQuotes
            long r3 = r3.mask
            long r8 = r8 & r3
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 == 0) goto L34
            r8 = r0
            goto L35
        L34:
            r8 = r7
        L35:
            r5.useSingleQuote = r8
            if (r8 == 0) goto L3c
            r8 = 39
            goto L3e
        L3c:
            r8 = 34
        L3e:
            r5.quote = r8
            long r8 = r6.features
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.LargeObject
            long r3 = r6.mask
            long r3 = r3 & r8
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L4e
            r6 = 1073741824(0x40000000, float:2.0)
            goto L50
        L4e:
            r6 = 67108864(0x4000000, float:1.5046328E-36)
        L50:
            r5.maxArraySize = r6
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormatWith4Space
            long r3 = r6.mask
            long r3 = r3 & r8
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L5f
            r6 = 4
            r5.pretty = r6
            return
        L5f:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormatWith2Space
            long r3 = r6.mask
            long r3 = r3 & r8
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 == 0) goto L6c
            r6 = 2
            r5.pretty = r6
            return
        L6c:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat
            long r3 = r6.mask
            long r8 = r8 & r3
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 == 0) goto L78
            r5.pretty = r0
            return
        L78:
            r5.pretty = r7
            return
    }

    private static boolean isWriteTypeInfoGenericArray(java.lang.reflect.GenericArrayType r1, java.lang.Class r2) {
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            boolean r0 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Le
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = r1.getRawType()
        Le:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L1d
            java.lang.Class r2 = r2.getComponentType()
            boolean r1 = r2.equals(r1)
            return r1
        L1d:
            r1 = 0
            return r1
    }

    public static com.alibaba.fastjson2.JSONWriter of() {
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r0.<init>(r1)
            long r1 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.OptimizedForAscii
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L1a
            com.alibaba.fastjson2.JSONWriterUTF8 r1 = new com.alibaba.fastjson2.JSONWriterUTF8
            r1.<init>(r0)
            return r1
        L1a:
            com.alibaba.fastjson2.JSONWriterUTF16 r1 = new com.alibaba.fastjson2.JSONWriterUTF16
            r1.<init>(r0)
            return r1
    }

    public static com.alibaba.fastjson2.JSONWriter of(com.alibaba.fastjson2.JSONWriter.Context r4) {
            if (r4 != 0) goto L6
            com.alibaba.fastjson2.JSONWriter$Context r4 = com.alibaba.fastjson2.JSONFactory.createWriteContext()
        L6:
            long r0 = r4.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.OptimizedForAscii
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            com.alibaba.fastjson2.JSONWriterUTF8 r0 = new com.alibaba.fastjson2.JSONWriterUTF8
            r0.<init>(r4)
            return r0
        L19:
            com.alibaba.fastjson2.JSONWriterUTF16 r0 = new com.alibaba.fastjson2.JSONWriterUTF16
            r0.<init>(r4)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter of(com.alibaba.fastjson2.writer.ObjectWriterProvider r1, com.alibaba.fastjson2.JSONWriter.Feature... r2) {
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context
            r0.<init>(r1)
            r0.config(r2)
            com.alibaba.fastjson2.JSONWriter r1 = of(r0)
            return r1
    }

    public static com.alibaba.fastjson2.JSONWriter of(com.alibaba.fastjson2.JSONWriter.Feature... r4) {
            com.alibaba.fastjson2.JSONWriter$Context r4 = com.alibaba.fastjson2.JSONFactory.createWriteContext(r4)
            long r0 = r4.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.OptimizedForAscii
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            com.alibaba.fastjson2.JSONWriterUTF8 r0 = new com.alibaba.fastjson2.JSONWriterUTF8
            r0.<init>(r4)
            return r0
        L17:
            com.alibaba.fastjson2.JSONWriterUTF16 r0 = new com.alibaba.fastjson2.JSONWriterUTF16
            r0.<init>(r4)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofJSONB() {
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofJSONB(com.alibaba.fastjson2.JSONWriter.Context r2) {
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofJSONB(com.alibaba.fastjson2.JSONWriter.Context r1, com.alibaba.fastjson2.SymbolTable r2) {
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofJSONB(com.alibaba.fastjson2.SymbolTable r3) {
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r1.<init>(r2)
            r0.<init>(r1, r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofJSONB(com.alibaba.fastjson2.JSONWriter.Feature... r3) {
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r1.<init>(r2, r3)
            r3 = 0
            r0.<init>(r1, r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofPretty() {
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat
            com.alibaba.fastjson2.JSONWriter$Feature[] r0 = new com.alibaba.fastjson2.JSONWriter.Feature[]{r0}
            com.alibaba.fastjson2.JSONWriter r0 = of(r0)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofPretty(com.alibaba.fastjson2.JSONWriter r5) {
            byte r0 = r5.pretty
            if (r0 != 0) goto L12
            r0 = 1
            r5.pretty = r0
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r1 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat
            long r3 = r3.mask
            long r1 = r1 | r3
            r0.features = r1
        L12:
            return r5
    }

    public static com.alibaba.fastjson2.JSONWriter ofUTF16(com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            com.alibaba.fastjson2.JSONWriter$Context r1 = com.alibaba.fastjson2.JSONFactory.createWriteContext(r1)
            com.alibaba.fastjson2.JSONWriterUTF16 r0 = new com.alibaba.fastjson2.JSONWriterUTF16
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofUTF8() {
            com.alibaba.fastjson2.JSONWriter$Context r0 = com.alibaba.fastjson2.JSONFactory.createWriteContext()
            com.alibaba.fastjson2.JSONWriterUTF8 r1 = new com.alibaba.fastjson2.JSONWriterUTF8
            r1.<init>(r0)
            return r1
    }

    public static com.alibaba.fastjson2.JSONWriter ofUTF8(com.alibaba.fastjson2.JSONWriter.Context r1) {
            com.alibaba.fastjson2.JSONWriterUTF8 r0 = new com.alibaba.fastjson2.JSONWriterUTF8
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter ofUTF8(com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            com.alibaba.fastjson2.JSONWriter$Context r1 = com.alibaba.fastjson2.JSONFactory.createWriteContext(r1)
            com.alibaba.fastjson2.JSONWriterUTF8 r0 = new com.alibaba.fastjson2.JSONWriterUTF8
            r0.<init>(r1)
            return r0
    }

    private java.lang.String setPath0(int r5, java.lang.Object r6) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Path r0 = r4.path
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r5 != 0) goto L17
            com.alibaba.fastjson2.JSONWriter$Path r2 = r0.child0
            if (r2 == 0) goto Ld
            goto L30
        Ld:
            com.alibaba.fastjson2.JSONWriter$Path r2 = new com.alibaba.fastjson2.JSONWriter$Path
            com.alibaba.fastjson2.JSONWriter$Path r3 = r4.path
            r2.<init>(r3, r5)
            r0.child0 = r2
            goto L30
        L17:
            r2 = 1
            if (r5 != r2) goto L29
            com.alibaba.fastjson2.JSONWriter$Path r2 = r0.child1
            if (r2 == 0) goto L1f
            goto L30
        L1f:
            com.alibaba.fastjson2.JSONWriter$Path r2 = new com.alibaba.fastjson2.JSONWriter$Path
            com.alibaba.fastjson2.JSONWriter$Path r3 = r4.path
            r2.<init>(r3, r5)
            r0.child1 = r2
            goto L30
        L29:
            com.alibaba.fastjson2.JSONWriter$Path r2 = new com.alibaba.fastjson2.JSONWriter$Path
            com.alibaba.fastjson2.JSONWriter$Path r0 = r4.path
            r2.<init>(r0, r5)
        L30:
            r4.path = r2
            java.lang.Object r5 = r4.rootObject
            if (r6 != r5) goto L39
            com.alibaba.fastjson2.JSONWriter$Path r5 = com.alibaba.fastjson2.JSONWriter.Path.ROOT
            goto L46
        L39:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r5 = r4.refs
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r5.get(r6)
            com.alibaba.fastjson2.JSONWriter$Path r5 = (com.alibaba.fastjson2.JSONWriter.Path) r5
            if (r5 != 0) goto L46
            goto L4b
        L46:
            java.lang.String r5 = r5.toString()
            return r5
        L4b:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r5 = r4.refs
            if (r5 != 0) goto L58
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap
            r0 = 8
            r5.<init>(r0)
            r4.refs = r5
        L58:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r5 = r4.refs
            com.alibaba.fastjson2.JSONWriter$Path r0 = r4.path
            r5.put(r6, r0)
            return r1
    }

    public final void checkAndWriteTypeName(java.lang.Object r9, java.lang.Class r10) {
            r8 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r8.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L10
            goto L39
        L10:
            if (r9 != 0) goto L13
            goto L39
        L13:
            java.lang.Class r2 = r9.getClass()
            if (r2 != r10) goto L1a
            goto L39
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r6 = r10.mask
            long r6 = r6 & r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 == 0) goto L2c
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            if (r2 == r10) goto L39
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            if (r2 != r10) goto L2c
            goto L39
        L2c:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r6 = r10.mask
            long r0 = r0 & r6
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 == 0) goto L3a
            java.lang.Object r10 = r8.rootObject
            if (r9 != r10) goto L3a
        L39:
            return
        L3a:
            java.lang.String r9 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r2)
            r8.writeTypeName(r9)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final void config(com.alibaba.fastjson2.JSONWriter.Feature r2, boolean r3) {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r1.context
            r0.config(r2, r3)
            return
    }

    public final void config(com.alibaba.fastjson2.JSONWriter.Feature... r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r1.context
            r0.config(r2)
            return
    }

    public final boolean containsReference(java.lang.Object r2) {
            r1 = this;
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r0 = r1.refs
            if (r0 == 0) goto Lc
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public abstract void endArray();

    public abstract void endObject();

    public abstract int flushTo(java.io.OutputStream r1);

    public abstract int flushTo(java.io.OutputStream r1, java.nio.charset.Charset r2);

    public void flushTo(java.io.Writer r2) {
            r1 = this;
            java.lang.String r0 = r1.toString()     // Catch: java.io.IOException -> Lb
            r2.write(r0)     // Catch: java.io.IOException -> Lb
            r2 = 0
            r1.off = r2     // Catch: java.io.IOException -> Lb
            return
        Lb:
            r2 = move-exception
            java.lang.String r0 = "flushTo error"
            ah.a.x(r0, r2)
            return
    }

    public abstract byte[] getBytes();

    public abstract byte[] getBytes(java.nio.charset.Charset r1);

    public final java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            return r0
    }

    public final com.alibaba.fastjson2.JSONWriter.Context getContext() {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r1.context
            return r0
    }

    public final long getFeatures() {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r2.context
            long r0 = r0.features
            return r0
    }

    public final long getFeatures(long r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r2.context
            long r0 = r0.features
            long r3 = r3 | r0
            return r3
    }

    public final com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(java.lang.Class r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r1 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = r0.provider
            com.alibaba.fastjson2.writer.ObjectWriter r6 = r0.getObjectWriter(r6, r6, r1)
            return r6
    }

    public final com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(java.lang.reflect.Type r6, java.lang.Class r7) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r1 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = r0.provider
            com.alibaba.fastjson2.writer.ObjectWriter r6 = r0.getObjectWriter(r6, r7, r1)
            return r6
    }

    public java.lang.String getPath() {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter$Path r0 = r1.path
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.String getPath(java.lang.Object r2) {
            r1 = this;
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r0 = r1.refs
            if (r0 == 0) goto L12
            java.lang.Object r2 = r0.get(r2)
            com.alibaba.fastjson2.JSONWriter$Path r2 = (com.alibaba.fastjson2.JSONWriter.Path) r2
            if (r2 != 0) goto Ld
            goto L12
        Ld:
            java.lang.String r2 = r2.toString()
            return r2
        L12:
            java.lang.String r2 = "$"
            return r2
    }

    public final com.alibaba.fastjson2.SymbolTable getSymbolTable() {
            r1 = this;
            com.alibaba.fastjson2.SymbolTable r0 = r1.symbolTable
            return r0
    }

    public final boolean hasFilter() {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r1.context
            boolean r0 = r0.hasFilter
            return r0
    }

    public final boolean hasFilter(long r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r2.context
            boolean r1 = r0.hasFilter
            if (r1 != 0) goto L12
            long r0 = r0.features
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L10
            goto L12
        L10:
            r3 = 0
            return r3
        L12:
            r3 = 1
            return r3
    }

    public final boolean hasFilter(boolean r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            boolean r1 = r0.hasFilter
            if (r1 != 0) goto L18
            if (r5 == 0) goto L16
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter
            long r2 = r5.mask
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L16
            goto L18
        L16:
            r5 = 0
            return r5
        L18:
            r5 = 1
            return r5
    }

    public final boolean isBeanToArray() {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean isEnabled(long r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r2.context
            long r0 = r0.features
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto Ld
            r3 = 1
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public final boolean isEnabled(com.alibaba.fastjson2.JSONWriter.Feature r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            long r2 = r5.mask
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto Lf
            r5 = 1
            return r5
        Lf:
            r5 = 0
            return r5
    }

    public final boolean isIgnoreErrorGetter() {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean isIgnoreNoneSerializable() {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean isIgnoreNoneSerializable(java.lang.Object r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1f
            if (r5 == 0) goto L1f
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            java.lang.Class r5 = r5.getClass()
            boolean r5 = r0.isAssignableFrom(r5)
            if (r5 != 0) goto L1f
            r5 = 1
            return r5
        L1f:
            r5 = 0
            return r5
    }

    public final boolean isRefDetect() {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L18
            r2 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r0 = r0 & r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public final boolean isRefDetect(java.lang.Object r7) {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L24
            r2 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r0 = r0 & r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L24
            if (r7 == 0) goto L24
            java.lang.Class r7 = r7.getClass()
            boolean r7 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r7)
            if (r7 != 0) goto L24
            r7 = 1
            return r7
        L24:
            r7 = 0
            return r7
    }

    public final boolean isUTF16() {
            r1 = this;
            boolean r0 = r1.utf16
            return r0
    }

    public final boolean isUTF8() {
            r1 = this;
            boolean r0 = r1.utf8
            return r0
    }

    public final boolean isUseSingleQuotes() {
            r1 = this;
            boolean r0 = r1.useSingleQuote
            return r0
    }

    public final boolean isWriteMapTypeInfo(java.lang.Object r7, java.lang.Class r8, long r9) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r7.getClass()
            if (r1 != r8) goto Lb
            return r0
        Lb:
            com.alibaba.fastjson2.JSONWriter$Context r8 = r6.context
            long r2 = r8.features
            long r8 = r9 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r2 = r10.mask
            long r2 = r2 & r8
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L1d
            return r0
        L1d:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r2 = r10.mask
            long r2 = r2 & r8
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 == 0) goto L2b
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            if (r1 != r10) goto L2b
            return r0
        L2b:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r1 = r10.mask
            long r8 = r8 & r1
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L3a
            java.lang.Object r8 = r6.rootObject
            if (r7 == r8) goto L39
            goto L3a
        L39:
            return r0
        L3a:
            r7 = 1
            return r7
    }

    public final boolean isWriteNulls() {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean isWriteTypeInfo(java.lang.Object r9) {
            r8 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r8.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L11
            return r3
        L11:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r6 = r2.mask
            long r6 = r6 & r0
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 == 0) goto L29
            if (r9 == 0) goto L29
            java.lang.Class r2 = r9.getClass()
            java.lang.Class<java.util.HashMap> r6 = java.util.HashMap.class
            if (r2 == r6) goto L28
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            if (r2 != r6) goto L29
        L28:
            return r3
        L29:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r6 = r2.mask
            long r0 = r0 & r6
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L38
            java.lang.Object r0 = r8.rootObject
            if (r9 == r0) goto L37
            goto L38
        L37:
            return r3
        L38:
            r9 = 1
            return r9
    }

    public final boolean isWriteTypeInfo(java.lang.Object r7, long r8) {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            long r8 = r8 | r0
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r0 = r0.mask
            long r0 = r0 & r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r4 = r0.mask
            long r4 = r4 & r8
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L2a
            if (r7 == 0) goto L2a
            java.lang.Class r0 = r7.getClass()
            java.lang.Class<java.util.HashMap> r4 = java.util.HashMap.class
            if (r0 == r4) goto L29
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
            if (r0 != r4) goto L2a
        L29:
            return r1
        L2a:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r4 = r0.mask
            long r8 = r8 & r4
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L39
            java.lang.Object r8 = r6.rootObject
            if (r7 == r8) goto L38
            goto L39
        L38:
            return r1
        L39:
            r7 = 1
            return r7
    }

    public final boolean isWriteTypeInfo(java.lang.Object r9, java.lang.Class r10) {
            r8 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r8.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L11
            return r3
        L11:
            if (r9 != 0) goto L14
            return r3
        L14:
            java.lang.Class r2 = r9.getClass()
            if (r2 != r10) goto L1b
            return r3
        L1b:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r6 = r10.mask
            long r6 = r6 & r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 == 0) goto L2d
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            if (r2 == r10) goto L2c
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            if (r2 != r10) goto L2d
        L2c:
            return r3
        L2d:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r6 = r10.mask
            long r0 = r0 & r6
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 == 0) goto L3c
            java.lang.Object r10 = r8.rootObject
            if (r9 == r10) goto L3b
            goto L3c
        L3b:
            return r3
        L3c:
            r9 = 1
            return r9
    }

    public final boolean isWriteTypeInfo(java.lang.Object r7, java.lang.Class r8, long r9) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r7.getClass()
            if (r1 != r8) goto Lb
            return r0
        Lb:
            com.alibaba.fastjson2.JSONWriter$Context r2 = r6.context
            long r2 = r2.features
            long r9 = r9 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r2 = r2.mask
            long r2 = r2 & r9
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1c
            return r0
        L1c:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r2 = r2.mask
            long r2 = r2 & r9
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3d
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            if (r1 != r2) goto L38
            if (r8 == 0) goto L37
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r8 == r1) goto L37
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            if (r8 == r1) goto L37
            java.lang.Class<java.util.AbstractMap> r1 = java.util.AbstractMap.class
            if (r8 != r1) goto L3d
        L37:
            return r0
        L38:
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            if (r1 != r8) goto L3d
            return r0
        L3d:
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r1 = r8.mask
            long r8 = r9 & r1
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L4d
            java.lang.Object r8 = r6.rootObject
            if (r7 == r8) goto L4c
            goto L4d
        L4c:
            return r0
        L4d:
            r7 = 1
            return r7
    }

    public final boolean isWriteTypeInfo(java.lang.Object r9, java.lang.reflect.Type r10) {
            r8 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r8.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L63
            if (r9 != 0) goto L13
            goto L63
        L13:
            java.lang.Class r2 = r9.getClass()
            boolean r6 = r10 instanceof java.lang.Class
            if (r6 == 0) goto L1e
            java.lang.Class r10 = (java.lang.Class) r10
            goto L3d
        L1e:
            boolean r6 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r6 == 0) goto L2b
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            boolean r10 = isWriteTypeInfoGenericArray(r10, r2)
            if (r10 == 0) goto L3c
            return r3
        L2b:
            boolean r6 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L3c
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r10 = r10.getRawType()
            boolean r6 = r10 instanceof java.lang.Class
            if (r6 == 0) goto L3c
            java.lang.Class r10 = (java.lang.Class) r10
            goto L3d
        L3c:
            r10 = 0
        L3d:
            if (r2 != r10) goto L40
            return r3
        L40:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r6 = r10.mask
            long r6 = r6 & r0
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 == 0) goto L52
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            if (r2 == r10) goto L51
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            if (r2 != r10) goto L52
        L51:
            return r3
        L52:
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r6 = r10.mask
            long r0 = r0 & r6
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 == 0) goto L61
            java.lang.Object r10 = r8.rootObject
            if (r9 == r10) goto L60
            goto L61
        L60:
            return r3
        L61:
            r9 = 1
            return r9
        L63:
            return r3
    }

    public final boolean isWriteTypeInfo(java.lang.Object r7, java.lang.reflect.Type r8, long r9) {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            long r9 = r9 | r0
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r0 = r0.mask
            long r0 = r0 & r9
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            if (r7 != 0) goto L15
            return r1
        L15:
            java.lang.Class r0 = r7.getClass()
            boolean r4 = r8 instanceof java.lang.Class
            if (r4 == 0) goto L20
            java.lang.Class r8 = (java.lang.Class) r8
            goto L32
        L20:
            boolean r4 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L31
            java.lang.reflect.ParameterizedType r8 = (java.lang.reflect.ParameterizedType) r8
            java.lang.reflect.Type r8 = r8.getRawType()
            boolean r4 = r8 instanceof java.lang.Class
            if (r4 == 0) goto L31
            java.lang.Class r8 = (java.lang.Class) r8
            goto L32
        L31:
            r8 = 0
        L32:
            if (r0 != r8) goto L35
            return r1
        L35:
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteHashMapArrayListClassName
            long r4 = r4.mask
            long r4 = r4 & r9
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L56
            java.lang.Class<java.util.HashMap> r4 = java.util.HashMap.class
            if (r0 != r4) goto L51
            if (r8 == 0) goto L50
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r8 == r0) goto L50
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            if (r8 == r0) goto L50
            java.lang.Class<java.util.AbstractMap> r0 = java.util.AbstractMap.class
            if (r8 != r0) goto L56
        L50:
            return r1
        L51:
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            if (r0 != r8) goto L56
            return r1
        L56:
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r4 = r8.mask
            long r8 = r9 & r4
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L66
            java.lang.Object r8 = r6.rootObject
            if (r7 == r8) goto L65
            goto L66
        L65:
            return r1
        L66:
            r7 = 1
            return r7
    }

    public final int level() {
            r1 = this;
            int r0 = r1.level
            return r0
    }

    public final int newCapacity(int r2, int r3) {
            r1 = this;
            int r0 = r3 >> 1
            int r3 = r3 + r0
            int r0 = r3 - r2
            if (r0 >= 0) goto L8
            r3 = r2
        L8:
            int r0 = r1.maxArraySize
            if (r3 <= r0) goto L17
            if (r2 >= r0) goto Lf
            return r0
        Lf:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError
            java.lang.String r3 = "try enabling LargeObject feature instead"
            r2.<init>(r3)
            throw r2
        L17:
            return r3
    }

    public final void overflowLevel() {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "level too large : "
            r1.<init>(r2)
            int r2 = r3.level
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void popPath(java.lang.Object r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Path r0 = r5.path
            if (r0 == 0) goto L20
            com.alibaba.fastjson2.JSONWriter$Context r1 = r5.context
            long r1 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L20
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r6 == r1) goto L20
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            if (r6 != r1) goto L1c
            goto L20
        L1c:
            com.alibaba.fastjson2.JSONWriter$Path r6 = r0.parent
            r5.path = r6
        L20:
            return
    }

    public final boolean removeReference(java.lang.Object r2) {
            r1 = this;
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r0 = r1.refs
            if (r0 == 0) goto Lc
            java.lang.Object r2 = r0.remove(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public final java.lang.String setPath(int r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r1.isRefDetect(r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            java.lang.String r2 = r1.setPath0(r2, r3)
            return r2
    }

    public final java.lang.String setPath(com.alibaba.fastjson2.writer.FieldWriter r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.isRefDetect(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.alibaba.fastjson2.JSONWriter$Path r0 = r3.path
            com.alibaba.fastjson2.JSONWriter$Path r2 = com.alibaba.fastjson2.JSONWriter.Path.ROOT
            if (r0 != r2) goto L13
            com.alibaba.fastjson2.JSONWriter$Path r4 = r4.getRootParentPath()
            goto L17
        L13:
            com.alibaba.fastjson2.JSONWriter$Path r4 = r4.getPath(r0)
        L17:
            r3.path = r4
            java.lang.Object r4 = r3.rootObject
            if (r5 != r4) goto L1e
            goto L2c
        L1e:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r4 = r3.refs
            if (r4 == 0) goto L31
            java.lang.Object r4 = r4.get(r5)
            r2 = r4
            com.alibaba.fastjson2.JSONWriter$Path r2 = (com.alibaba.fastjson2.JSONWriter.Path) r2
            if (r2 != 0) goto L2c
            goto L31
        L2c:
            java.lang.String r4 = r2.toString()
            return r4
        L31:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r4 = r3.refs
            if (r4 != 0) goto L3e
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r0 = 8
            r4.<init>(r0)
            r3.refs = r4
        L3e:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r4 = r3.refs
            com.alibaba.fastjson2.JSONWriter$Path r0 = r3.path
            r4.put(r5, r0)
            return r1
    }

    public final java.lang.String setPath(java.lang.String r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.isRefDetect(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.alibaba.fastjson2.JSONWriter$Path r0 = new com.alibaba.fastjson2.JSONWriter$Path
            com.alibaba.fastjson2.JSONWriter$Path r2 = r3.path
            r0.<init>(r2, r4)
            r3.path = r0
            java.lang.Object r4 = r3.rootObject
            if (r5 != r4) goto L18
            com.alibaba.fastjson2.JSONWriter$Path r4 = com.alibaba.fastjson2.JSONWriter.Path.ROOT
            goto L25
        L18:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r4 = r3.refs
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r4.get(r5)
            com.alibaba.fastjson2.JSONWriter$Path r4 = (com.alibaba.fastjson2.JSONWriter.Path) r4
            if (r4 != 0) goto L25
            goto L2a
        L25:
            java.lang.String r4 = r4.toString()
            return r4
        L2a:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r4 = r3.refs
            if (r4 != 0) goto L37
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r0 = 8
            r4.<init>(r0)
            r3.refs = r4
        L37:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson2.JSONWriter$Path> r4 = r3.refs
            com.alibaba.fastjson2.JSONWriter$Path r0 = r3.path
            r4.put(r5, r0)
            return r1
    }

    public final void setRootObject(java.lang.Object r1) {
            r0 = this;
            r0.rootObject = r1
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT
            r0.path = r1
            return
    }

    public abstract int size();

    public abstract void startArray();

    public void startArray(int r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    public void startArray(java.lang.Object r1, int r2) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    public abstract void startObject();

    public void write(com.alibaba.fastjson2.JSONObject r1) {
            r0 = this;
            r0.write(r1)
            return
    }

    public void write(java.util.List r11) {
            r10 = this;
            if (r11 != 0) goto L6
            r10.writeArrayNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r0 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat
            long r2 = r2.mask
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r2 = r2.mask
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r2 = r2.mask
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter$Context r2 = r10.context
            long r3 = r2.features
            long r0 = r0 & r3
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L36
            java.lang.Class r0 = r11.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r2.getObjectWriter(r0)
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r10
            r5 = r11
            r3.write(r4, r5, r6, r7, r8)
            return
        L36:
            r4 = r10
            r5 = r11
            r11 = 91
            r10.write0(r11)
            r11 = 0
        L3e:
            int r0 = r5.size()
            if (r11 >= r0) goto L55
            java.lang.Object r0 = r5.get(r11)
            if (r11 == 0) goto L4f
            r1 = 44
            r10.write0(r1)
        L4f:
            r10.writeAny(r0)
            int r11 = r11 + 1
            goto L3e
        L55:
            r11 = 93
            r10.write0(r11)
            return
    }

    public void write(java.util.Map r12) {
            r11 = this;
            if (r12 != 0) goto L6
            r11.writeNull()
            return
        L6:
            boolean r0 = r12.isEmpty()
            r1 = 0
            if (r0 == 0) goto L17
            r12 = 123(0x7b, float:1.72E-43)
            r0 = 125(0x7d, float:1.75E-43)
            r11.writeRaw(r12, r0)
            r11.startObject = r1
            return
        L17:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r11.context
            long r2 = r0.features
            long r4 = com.alibaba.fastjson2.JSONWriter.NONE_DIRECT_FEATURES
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L36
            java.lang.Class r1 = r12.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r1)
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r11
            r4 = r12
            r2.write(r3, r4, r5, r6, r7)
            return
        L36:
            r3 = r11
            r11.startObject()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
            r0 = 1
        L43:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r12.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r6 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L67
            com.alibaba.fastjson2.JSONWriter$Context r7 = r3.context
            long r7 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.WriteMapNullValue
            long r9 = r9.mask
            long r7 = r7 & r9
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L67
            goto L43
        L67:
            if (r0 != 0) goto L6c
            r11.writeComma()
        L6c:
            r11.writeAny(r6)
            r11.writeColon()
            r11.writeAny(r2)
            r0 = r1
            goto L43
        L77:
            r11.endObject()
            return
    }

    public abstract void write0(char r1);

    public void writeAny(java.lang.Object r10) {
            r9 = this;
            if (r10 != 0) goto L6
            r9.writeNull()
            return
        L6:
            java.lang.Class r0 = r10.getClass()
            com.alibaba.fastjson2.JSONWriter$Context r1 = r9.context
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r1.getObjectWriter(r0, r0)
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r9
            r4 = r10
            r2.write(r3, r4, r5, r6, r7)
            return
    }

    public void writeArrayNull() {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r4 = r4.mask
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            java.lang.String r0 = "[]"
            goto L19
        L17:
            java.lang.String r0 = "null"
        L19:
            r6.writeRaw(r0)
            return
    }

    public void writeArrayNull(long r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r0 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r2 = r2.mask
            long r0 = r0 | r2
            long r5 = r5 & r0
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L13
            java.lang.String r5 = "[]"
            goto L15
        L13:
            java.lang.String r5 = "null"
        L15:
            r4.writeRaw(r5)
            return
    }

    public final void writeAs(java.lang.Object r9, java.lang.Class r10) {
            r8 = this;
            if (r9 != 0) goto L6
            r8.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r8.context
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.getObjectWriter(r10)
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            r1.write(r2, r3, r4, r5, r6)
            return
    }

    public abstract void writeBase64(byte[] r1);

    public final void writeBigInt(java.math.BigInteger r3) {
            r2 = this;
            r0 = 0
            r2.writeBigInt(r3, r0)
            return
    }

    public abstract void writeBigInt(java.math.BigInteger r1, long r2);

    public void writeBinary(byte[] r5) {
            r4 = this;
            if (r5 != 0) goto L6
            r4.writeArrayNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteByteArrayAsBase64
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            r4.writeBase64(r5)
            return
        L19:
            r4.startArray()
            r0 = 0
        L1d:
            int r1 = r5.length
            if (r0 >= r1) goto L2d
            if (r0 == 0) goto L25
            r4.writeComma()
        L25:
            r1 = r5[r0]
            r4.writeInt32(r1)
            int r0 = r0 + 1
            goto L1d
        L2d:
            r4.endArray()
            return
    }

    public void writeBool(boolean r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteBooleanAsNumber
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            if (r5 == 0) goto L14
            r5 = 49
            goto L16
        L14:
            r5 = 48
        L16:
            r4.write0(r5)
            return
        L1a:
            if (r5 == 0) goto L1f
            java.lang.String r5 = "true"
            goto L21
        L1f:
            java.lang.String r5 = "false"
        L21:
            r4.writeRaw(r5)
            return
    }

    public void writeBool(boolean[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            r2.startArray()
            r0 = 0
        La:
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r2.writeComma()
        L12:
            boolean r1 = r3[r0]
            r2.writeBool(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r2.endArray()
            return
    }

    public final void writeBooleanNull() {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse
            long r4 = r4.mask
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = 0
            r6.writeBool(r0)
            return
        L19:
            r6.writeNull()
            return
    }

    public abstract void writeChar(char r1);

    public abstract void writeColon();

    public abstract void writeComma();

    public abstract void writeDateTime14(int r1, int r2, int r3, int r4, int r5, int r6);

    public abstract void writeDateTime19(int r1, int r2, int r3, int r4, int r5, int r6);

    public abstract void writeDateTimeISO8601(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9);

    public abstract void writeDateYYYMMDD10(int r1, int r2, int r3);

    public abstract void writeDateYYYMMDD8(int r1, int r2, int r3);

    public final void writeDecimal(java.math.BigDecimal r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            r3.writeDecimal(r4, r0, r2)
            return
    }

    public final void writeDecimal(java.math.BigDecimal r2, long r3) {
            r1 = this;
            r0 = 0
            r1.writeDecimal(r2, r3, r0)
            return
    }

    public abstract void writeDecimal(java.math.BigDecimal r1, long r2, java.text.DecimalFormat r4);

    public final void writeDecimalNull() {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L15
            r0 = 0
            r6.writeDouble(r0)
            return
        L15:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero
            long r2 = r2.mask
            long r0 = r0 & r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L23
            r0 = 0
            r6.writeInt32(r0)
            return
        L23:
            r6.writeNull()
            return
    }

    public abstract void writeDouble(double r1);

    public final void writeDouble(double r2, java.text.DecimalFormat r4) {
            r1 = this;
            if (r4 == 0) goto L20
            boolean r0 = r1.jsonb
            if (r0 == 0) goto L7
            goto L20
        L7:
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto L1c
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 == 0) goto L14
            goto L1c
        L14:
            java.lang.String r2 = r4.format(r2)
            r1.writeRaw(r2)
            return
        L1c:
            r1.writeNull()
            return
        L20:
            r1.writeDouble(r2)
            return
    }

    public abstract void writeDouble(double[] r1);

    public final void writeDouble(double[] r4, java.text.DecimalFormat r5) {
            r3 = this;
            if (r5 == 0) goto L29
            boolean r0 = r3.jsonb
            if (r0 == 0) goto L7
            goto L29
        L7:
            if (r4 != 0) goto Ld
            r3.writeNull()
            return
        Ld:
            r3.startArray()
            r0 = 0
        L11:
            int r1 = r4.length
            if (r0 >= r1) goto L25
            if (r0 == 0) goto L19
            r3.writeComma()
        L19:
            r1 = r4[r0]
            java.lang.String r1 = r5.format(r1)
            r3.writeRaw(r1)
            int r0 = r0 + 1
            goto L11
        L25:
            r3.endArray()
            return
        L29:
            r3.writeDouble(r4)
            return
    }

    public void writeDoubleArray(double r1, double r3) {
            r0 = this;
            r0.startArray()
            r0.writeDouble(r1)
            r0.writeComma()
            r0.writeDouble(r3)
            r0.endArray()
            return
    }

    public void writeEnum(java.lang.Enum r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1d
            java.lang.String r7 = r7.toString()
            r6.writeString(r7)
            return
        L1d:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName
            long r2 = r2.mask
            long r0 = r0 & r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L2e
            java.lang.String r7 = r7.name()
            r6.writeString(r7)
            return
        L2e:
            int r7 = r7.ordinal()
            r6.writeInt32(r7)
            return
    }

    public abstract void writeFloat(float r1);

    public final void writeFloat(float r3, java.text.DecimalFormat r4) {
            r2 = this;
            if (r4 == 0) goto L21
            boolean r0 = r2.jsonb
            if (r0 == 0) goto L7
            goto L21
        L7:
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L1d
            boolean r0 = java.lang.Float.isInfinite(r3)
            if (r0 == 0) goto L14
            goto L1d
        L14:
            double r0 = (double) r3
            java.lang.String r3 = r4.format(r0)
            r2.writeRaw(r3)
            return
        L1d:
            r2.writeNull()
            return
        L21:
            r2.writeFloat(r3)
            return
    }

    public final void writeFloat(java.lang.Float r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNumberNull()
            return
        L6:
            float r3 = r3.floatValue()
            double r0 = (double) r3
            r2.writeDouble(r0)
            return
    }

    public void writeFloat(float[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            r2.startArray()
            r0 = 0
        La:
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r2.writeComma()
        L12:
            r1 = r3[r0]
            r2.writeFloat(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r2.endArray()
            return
    }

    public final void writeFloat(float[] r4, java.text.DecimalFormat r5) {
            r3 = this;
            if (r5 == 0) goto L2a
            boolean r0 = r3.jsonb
            if (r0 == 0) goto L7
            goto L2a
        L7:
            if (r4 != 0) goto Ld
            r3.writeNull()
            return
        Ld:
            r3.startArray()
            r0 = 0
        L11:
            int r1 = r4.length
            if (r0 >= r1) goto L26
            if (r0 == 0) goto L19
            r3.writeComma()
        L19:
            r1 = r4[r0]
            double r1 = (double) r1
            java.lang.String r1 = r5.format(r1)
            r3.writeRaw(r1)
            int r0 = r0 + 1
            goto L11
        L26:
            r3.endArray()
            return
        L2a:
            r3.writeFloat(r4)
            return
    }

    public abstract void writeHex(byte[] r1);

    public void writeInstant(long r3, int r5) {
            r2 = this;
            long r0 = (long) r5
            java.time.Instant r3 = java.time.Instant.ofEpochSecond(r3, r0)
            r2.writeInstant(r3)
            return
    }

    public void writeInstant(java.time.Instant r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ISO_INSTANT
            java.lang.String r2 = r0.format(r2)
            r1.writeString(r2)
            return
    }

    public abstract void writeInt16(short r1);

    public void writeInt16(short[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            r2.startArray()
            r0 = 0
        La:
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r2.writeComma()
        L12:
            short r1 = r3[r0]
            r2.writeInt16(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r2.endArray()
            return
    }

    public abstract void writeInt32(int r1);

    public final void writeInt32(int r2, java.lang.String r3) {
            r1 = this;
            if (r3 == 0) goto L17
            boolean r0 = r1.jsonb
            if (r0 == 0) goto L7
            goto L17
        L7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.writeString(r2)
            return
        L17:
            r1.writeInt32(r2)
            return
    }

    public void writeInt32(java.lang.Integer r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.writeNull()
            return
        L6:
            int r1 = r1.intValue()
            r0.writeInt32(r1)
            return
    }

    public abstract void writeInt32(int[] r1);

    public abstract void writeInt64(long r1);

    public void writeInt64(java.lang.Long r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeInt64Null()
            return
        L6:
            long r0 = r3.longValue()
            r2.writeInt64(r0)
            return
    }

    public abstract void writeInt64(long[] r1);

    public final void writeInt64Null() {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero
            long r4 = r4.mask
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L18
            r6.writeInt64(r2)
            return
        L18:
            r6.writeNull()
            return
    }

    public abstract void writeInt8(byte r1);

    public abstract void writeLocalDate(java.time.LocalDate r1);

    public abstract void writeLocalDateTime(java.time.LocalDateTime r1);

    public final boolean writeLocalDateWithFormat(java.time.LocalDate r5, com.alibaba.fastjson2.JSONWriter.Context r6) {
            r4 = this;
            boolean r0 = r6.dateFormatUnixTime
            r1 = 1
            if (r0 != 0) goto L2b
            boolean r0 = r6.dateFormatMillis
            if (r0 == 0) goto La
            goto L2b
        La:
            java.time.format.DateTimeFormatter r0 = r6.getDateFormatter()
            if (r0 == 0) goto L29
            boolean r6 = r6.isDateFormatHasHour()
            if (r6 == 0) goto L21
            java.time.LocalTime r6 = java.time.LocalTime.MIN
            java.time.LocalDateTime r5 = java.time.LocalDateTime.of(r5, r6)
            java.lang.String r5 = r0.format(r5)
            goto L25
        L21:
            java.lang.String r5 = r0.format(r5)
        L25:
            r4.writeString(r5)
            return r1
        L29:
            r5 = 0
            return r5
        L2b:
            java.time.LocalTime r0 = java.time.LocalTime.MIN
            java.time.LocalDateTime r5 = java.time.LocalDateTime.of(r5, r0)
            java.time.ZoneId r0 = r6.getZoneId()
            java.time.ZonedDateTime r5 = r5.atZone(r0)
            java.time.Instant r5 = r5.toInstant()
            long r2 = r5.toEpochMilli()
            boolean r5 = r6.dateFormatMillis
            if (r5 == 0) goto L46
            goto L49
        L46:
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r5
        L49:
            r4.writeInt64(r2)
            return r1
    }

    public abstract void writeLocalTime(java.time.LocalTime r1);

    public void writeMillis(long r1) {
            r0 = this;
            r0.writeInt64(r1)
            return
    }

    public final void writeName(int r2) {
            r1 = this;
            boolean r0 = r1.startObject
            if (r0 == 0) goto L8
            r0 = 0
            r1.startObject = r0
            goto Lb
        L8:
            r1.writeComma()
        Lb:
            r1.writeInt32(r2)
            return
    }

    public final void writeName(long r2) {
            r1 = this;
            boolean r0 = r1.startObject
            if (r0 == 0) goto L8
            r0 = 0
            r1.startObject = r0
            goto Lb
        L8:
            r1.writeComma()
        Lb:
            r1.writeInt64(r2)
            return
    }

    public void writeName(java.lang.String r7) {
            r6 = this;
            boolean r0 = r6.startObject
            r1 = 0
            if (r0 == 0) goto L8
            r6.startObject = r1
            goto Lb
        L8:
            r6.writeComma()
        Lb:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r2 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.UnquoteFieldName
            long r4 = r0.mask
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 == 0) goto L30
            char r2 = r6.quote
            int r2 = r7.indexOf(r2)
            if (r2 >= 0) goto L31
            r2 = 92
            int r2 = r7.indexOf(r2)
            if (r2 < 0) goto L30
            goto L31
        L30:
            r1 = r0
        L31:
            if (r1 == 0) goto L37
            r6.writeRaw(r7)
            return
        L37:
            r6.writeString(r7)
            return
    }

    public abstract void writeName10Raw(long r1, long r3);

    public abstract void writeName11Raw(long r1, long r3);

    public abstract void writeName12Raw(long r1, long r3);

    public abstract void writeName13Raw(long r1, long r3);

    public abstract void writeName14Raw(long r1, long r3);

    public abstract void writeName15Raw(long r1, long r3);

    public abstract void writeName16Raw(long r1, long r3);

    public abstract void writeName2Raw(long r1);

    public abstract void writeName3Raw(long r1);

    public abstract void writeName4Raw(long r1);

    public abstract void writeName5Raw(long r1);

    public abstract void writeName6Raw(long r1);

    public abstract void writeName7Raw(long r1);

    public abstract void writeName8Raw(long r1);

    public abstract void writeName9Raw(long r1, int r3);

    public void writeNameAny(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.startObject
            if (r0 == 0) goto L8
            r0 = 0
            r1.startObject = r0
            goto Lb
        L8:
            r1.writeComma()
        Lb:
            r1.writeAny(r2)
            return
    }

    public abstract void writeNameRaw(byte[] r1);

    public void writeNameRaw(byte[] r1, int r2, int r3) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    public void writeNameRaw(byte[] r1, long r2) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    public abstract void writeNameRaw(char[] r1);

    public abstract void writeNameRaw(char[] r1, int r2, int r3);

    public final void writeNameValue(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r0.writeName(r1)
            r0.writeColon()
            r0.writeAny(r2)
            return
    }

    public void writeNull() {
            r1 = this;
            java.lang.String r0 = "null"
            r1.writeRaw(r0)
            return
    }

    public final void writeNumberNull() {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero
            long r4 = r4.mask
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            r0 = 0
            r6.writeInt32(r0)
            return
        L19:
            r6.writeNull()
            return
    }

    public void writeObjectNull(java.lang.Class<?> r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L21
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r5 != r0) goto L19
            java.lang.String r5 = "\u0000"
            r4.writeString(r5)
            return
        L19:
            r5 = 123(0x7b, float:1.72E-43)
            r0 = 125(0x7d, float:1.75E-43)
            r4.writeRaw(r5, r0)
            return
        L21:
            r4.writeNull()
            return
    }

    public abstract void writeOffsetDateTime(java.time.OffsetDateTime r1);

    public abstract void writeOffsetTime(java.time.OffsetTime r1);

    public void writeRaw(byte r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    public abstract void writeRaw(char r1);

    public void writeRaw(char r1, char r2) {
            r0 = this;
            r0.writeRaw(r1)
            r0.writeRaw(r2)
            return
    }

    public abstract void writeRaw(java.lang.String r1);

    public abstract void writeRaw(byte[] r1);

    public final void writeRaw(char[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.writeRaw(r3, r0, r1)
            return
    }

    public void writeRaw(char[] r1, int r2, int r3) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    public abstract void writeReference(java.lang.String r1);

    public final boolean writeReference(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = r0.setPath(r1, r2)
            if (r1 == 0) goto Le
            r0.writeReference(r1)
            r0.popPath(r2)
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public abstract void writeString(byte r1);

    public void writeString(double r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Double.toString(r1)
            r0.writeString(r1)
            return
    }

    public void writeString(float r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Float.toString(r1)
            r0.writeString(r1)
            return
    }

    public abstract void writeString(int r1);

    public abstract void writeString(long r1);

    public final void writeString(java.io.Reader r5) {
            r4 = this;
            char r0 = r4.quote
            r4.writeRaw(r0)
            r0 = 2048(0x800, float:2.87E-42)
            char[] r1 = new char[r0]     // Catch: java.lang.Exception -> L1c
        L9:
            r2 = 0
            int r3 = r5.read(r1, r2, r0)     // Catch: java.lang.Exception -> L1c
            if (r3 >= 0) goto L16
            char r5 = r4.quote
            r4.writeRaw(r5)
            return
        L16:
            if (r3 <= 0) goto L9
            r4.writeString(r1, r2, r3, r2)     // Catch: java.lang.Exception -> L1c
            goto L9
        L1c:
            r5 = move-exception
            java.lang.String r0 = "read string from reader error"
            ah.a.x(r0, r5)
            return
    }

    public abstract void writeString(java.lang.String r1);

    public void writeString(java.util.List<java.lang.String> r4) {
            r3 = this;
            r3.startArray()
            int r0 = r4.size()
            r1 = 0
        L8:
            if (r1 >= r0) goto L1b
            if (r1 == 0) goto Lf
            r3.writeComma()
        Lf:
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3.writeString(r2)
            int r1 = r1 + 1
            goto L8
        L1b:
            r3.endArray()
            return
    }

    public abstract void writeString(short r1);

    public abstract void writeString(boolean r1);

    public void writeString(byte[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            r2.startArray()
            r0 = 0
        La:
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r2.writeComma()
        L12:
            r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r2.endArray()
            return
    }

    public abstract void writeString(char[] r1);

    public abstract void writeString(char[] r1, int r2, int r3);

    public abstract void writeString(char[] r1, int r2, int r3, boolean r4);

    public void writeString(double[] r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeArrayNull()
            return
        L6:
            r3.startArray()
            r0 = 0
        La:
            int r1 = r4.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r3.writeComma()
        L12:
            r1 = r4[r0]
            r3.writeString(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r3.endArray()
            return
    }

    public void writeString(float[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            r2.startArray()
            r0 = 0
        La:
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r2.writeComma()
        L12:
            r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r2.endArray()
            return
    }

    public void writeString(int[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            r2.startArray()
            r0 = 0
        La:
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r2.writeComma()
        L12:
            r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r2.endArray()
            return
    }

    public void writeString(long[] r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeArrayNull()
            return
        L6:
            r3.startArray()
            r0 = 0
        La:
            int r1 = r4.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r3.writeComma()
        L12:
            r1 = r4[r0]
            r3.writeString(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r3.endArray()
            return
    }

    public abstract void writeString(java.lang.String[] r1);

    public void writeString(short[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            r2.startArray()
            r0 = 0
        La:
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r2.writeComma()
        L12:
            short r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r2.endArray()
            return
    }

    public void writeString(boolean[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            r2.startArray()
            r0 = 0
        La:
            int r1 = r3.length
            if (r0 >= r1) goto L1a
            if (r0 == 0) goto L12
            r2.writeComma()
        L12:
            boolean r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto La
        L1a:
            r2.endArray()
            return
    }

    public abstract void writeStringLatin1(byte[] r1);

    public void writeStringNull() {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r4 = r4.mask
            long r2 = r2 | r4
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L23
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.UseSingleQuotes
            long r2 = r2.mask
            long r0 = r0 & r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L20
            java.lang.String r0 = "''"
            goto L25
        L20:
            java.lang.String r0 = "\"\""
            goto L25
        L23:
            java.lang.String r0 = "null"
        L25:
            r6.writeRaw(r0)
            return
    }

    public abstract void writeStringUTF16(byte[] r1);

    public void writeSymbol(int r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    public void writeSymbol(java.lang.String r1) {
            r0 = this;
            r0.writeString(r1)
            return
    }

    public abstract void writeTimeHHMMSS8(int r1, int r2, int r3);

    public void writeTypeName(java.lang.String r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    public boolean writeTypeName(byte[] r1, long r2) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    public abstract void writeUUID(java.util.UUID r1);

    public abstract void writeZonedDateTime(java.time.ZonedDateTime r1);
}
