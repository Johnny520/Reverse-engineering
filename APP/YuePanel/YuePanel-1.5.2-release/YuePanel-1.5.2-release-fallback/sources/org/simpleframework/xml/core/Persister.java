package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
public class Persister implements org.simpleframework.xml.Serializer {
    private final org.simpleframework.xml.stream.Format format;
    private final org.simpleframework.xml.core.SessionManager manager;
    private final org.simpleframework.xml.strategy.Strategy strategy;
    private final org.simpleframework.xml.core.Support support;

    public Persister() {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public Persister(java.util.Map r2) {
            r1 = this;
            org.simpleframework.xml.filter.PlatformFilter r0 = new org.simpleframework.xml.filter.PlatformFilter
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public Persister(java.util.Map r1, org.simpleframework.xml.stream.Format r2) {
            r0 = this;
            org.simpleframework.xml.filter.PlatformFilter r2 = new org.simpleframework.xml.filter.PlatformFilter
            r2.<init>(r1)
            r0.<init>(r2)
            return
    }

    public Persister(org.simpleframework.xml.filter.Filter r2) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r0, r2)
            return
    }

    public Persister(org.simpleframework.xml.filter.Filter r2, org.simpleframework.xml.stream.Format r3) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r0, r2, r3)
            return
    }

    public Persister(org.simpleframework.xml.filter.Filter r2, org.simpleframework.xml.transform.Matcher r3) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r0, r2, r3)
            return
    }

    public Persister(org.simpleframework.xml.filter.Filter r2, org.simpleframework.xml.transform.Matcher r3, org.simpleframework.xml.stream.Format r4) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, java.util.Map r3) {
            r1 = this;
            org.simpleframework.xml.filter.PlatformFilter r0 = new org.simpleframework.xml.filter.PlatformFilter
            r0.<init>(r3)
            r1.<init>(r2, r0)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, java.util.Map r3, org.simpleframework.xml.stream.Format r4) {
            r1 = this;
            org.simpleframework.xml.filter.PlatformFilter r0 = new org.simpleframework.xml.filter.PlatformFilter
            r0.<init>(r3)
            r1.<init>(r2, r0, r4)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, org.simpleframework.xml.filter.Filter r3) {
            r1 = this;
            org.simpleframework.xml.stream.Format r0 = new org.simpleframework.xml.stream.Format
            r0.<init>()
            r1.<init>(r2, r3, r0)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, org.simpleframework.xml.filter.Filter r3, org.simpleframework.xml.stream.Format r4) {
            r1 = this;
            org.simpleframework.xml.core.EmptyMatcher r0 = new org.simpleframework.xml.core.EmptyMatcher
            r0.<init>()
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, org.simpleframework.xml.filter.Filter r3, org.simpleframework.xml.transform.Matcher r4) {
            r1 = this;
            org.simpleframework.xml.stream.Format r0 = new org.simpleframework.xml.stream.Format
            r0.<init>()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, org.simpleframework.xml.filter.Filter r3, org.simpleframework.xml.transform.Matcher r4, org.simpleframework.xml.stream.Format r5) {
            r1 = this;
            r1.<init>()
            org.simpleframework.xml.core.Support r0 = new org.simpleframework.xml.core.Support
            r0.<init>(r3, r4, r5)
            r1.support = r0
            org.simpleframework.xml.core.SessionManager r3 = new org.simpleframework.xml.core.SessionManager
            r3.<init>()
            r1.manager = r3
            r1.strategy = r2
            r1.format = r5
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, org.simpleframework.xml.stream.Format r3) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.<init>(r2, r0, r3)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, org.simpleframework.xml.transform.Matcher r3) {
            r1 = this;
            org.simpleframework.xml.filter.PlatformFilter r0 = new org.simpleframework.xml.filter.PlatformFilter
            r0.<init>()
            r1.<init>(r2, r0, r3)
            return
    }

    public Persister(org.simpleframework.xml.strategy.Strategy r2, org.simpleframework.xml.transform.Matcher r3, org.simpleframework.xml.stream.Format r4) {
            r1 = this;
            org.simpleframework.xml.filter.PlatformFilter r0 = new org.simpleframework.xml.filter.PlatformFilter
            r0.<init>()
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public Persister(org.simpleframework.xml.stream.Format r2) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r0, r2)
            return
    }

    public Persister(org.simpleframework.xml.transform.Matcher r2) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r0, r2)
            return
    }

    public Persister(org.simpleframework.xml.transform.Matcher r2, org.simpleframework.xml.stream.Format r3) {
            r1 = this;
            org.simpleframework.xml.strategy.TreeStrategy r0 = new org.simpleframework.xml.strategy.TreeStrategy
            r0.<init>()
            r1.<init>(r0, r2, r3)
            return
    }

    private <T> T read(java.lang.Class<? extends T> r2, org.simpleframework.xml.stream.InputNode r3, org.simpleframework.xml.core.Context r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Traverser r0 = new org.simpleframework.xml.core.Traverser
            r0.<init>(r4)
            java.lang.Object r2 = r0.read(r3, r2)
            return r2
    }

    private <T> T read(java.lang.Class<? extends T> r4, org.simpleframework.xml.stream.InputNode r5, org.simpleframework.xml.core.Session r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Source r0 = new org.simpleframework.xml.core.Source
            org.simpleframework.xml.strategy.Strategy r1 = r3.strategy
            org.simpleframework.xml.core.Support r2 = r3.support
            r0.<init>(r1, r2, r6)
            java.lang.Object r4 = r3.read(r4, r5, r0)
            return r4
    }

    private <T> T read(T r2, org.simpleframework.xml.stream.InputNode r3, org.simpleframework.xml.core.Context r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Traverser r0 = new org.simpleframework.xml.core.Traverser
            r0.<init>(r4)
            java.lang.Object r2 = r0.read(r3, r2)
            return r2
    }

    private <T> T read(T r4, org.simpleframework.xml.stream.InputNode r5, org.simpleframework.xml.core.Session r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Source r0 = new org.simpleframework.xml.core.Source
            org.simpleframework.xml.strategy.Strategy r1 = r3.strategy
            org.simpleframework.xml.core.Support r2 = r3.support
            r0.<init>(r1, r2, r6)
            java.lang.Object r4 = r3.read(r4, r5, r0)
            return r4
    }

    private boolean validate(java.lang.Class r2, org.simpleframework.xml.stream.InputNode r3, org.simpleframework.xml.core.Context r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Traverser r0 = new org.simpleframework.xml.core.Traverser
            r0.<init>(r4)
            boolean r2 = r0.validate(r3, r2)
            return r2
    }

    private boolean validate(java.lang.Class r4, org.simpleframework.xml.stream.InputNode r5, org.simpleframework.xml.core.Session r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Source r0 = new org.simpleframework.xml.core.Source
            org.simpleframework.xml.strategy.Strategy r1 = r3.strategy
            org.simpleframework.xml.core.Support r2 = r3.support
            r0.<init>(r1, r2, r6)
            boolean r4 = r3.validate(r4, r5, r0)
            return r4
    }

    private void write(java.lang.Object r2, org.simpleframework.xml.stream.OutputNode r3, org.simpleframework.xml.core.Context r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.Traverser r0 = new org.simpleframework.xml.core.Traverser
            r0.<init>(r4)
            r0.write(r3, r2)
            return
    }

    private void write(java.lang.Object r4, org.simpleframework.xml.stream.OutputNode r5, org.simpleframework.xml.core.Session r6) throws java.lang.Exception {
            r3 = this;
            org.simpleframework.xml.core.Source r0 = new org.simpleframework.xml.core.Source
            org.simpleframework.xml.strategy.Strategy r1 = r3.strategy
            org.simpleframework.xml.core.Support r2 = r3.support
            r0.<init>(r1, r2, r6)
            r3.write(r4, r5, r0)
            return
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r2, java.io.File r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r2, java.io.File r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.lang.Object r2 = r1.read(r2, r0, r4)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r2
        Ld:
            r2 = move-exception
            r0.close()
            throw r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r2, java.io.InputStream r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r1, java.io.InputStream r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r2 = org.simpleframework.xml.stream.NodeBuilder.read(r2)
            java.lang.Object r1 = r0.read(r1, r2, r3)
            return r1
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r2, java.io.Reader r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r1, java.io.Reader r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r2 = org.simpleframework.xml.stream.NodeBuilder.read(r2)
            java.lang.Object r1 = r0.read(r1, r2, r3)
            return r1
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r2, java.lang.String r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r3)
            java.lang.Object r2 = r1.read(r2, r0, r4)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r2, org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(java.lang.Class<? extends T> r2, org.simpleframework.xml.stream.InputNode r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.SessionManager r0 = r1.manager
            org.simpleframework.xml.core.Session r4 = r0.open(r4)
            java.lang.Object r2 = r1.read(r2, r3, r4)     // Catch: java.lang.Throwable -> L10
            org.simpleframework.xml.core.SessionManager r3 = r1.manager
            r3.close()
            return r2
        L10:
            r2 = move-exception
            org.simpleframework.xml.core.SessionManager r3 = r1.manager
            r3.close()
            throw r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r2, java.io.File r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r2, java.io.File r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.lang.Object r2 = r1.read(r2, r0, r4)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r2
        Ld:
            r2 = move-exception
            r0.close()
            throw r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r2, java.io.InputStream r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r1, java.io.InputStream r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r2 = org.simpleframework.xml.stream.NodeBuilder.read(r2)
            java.lang.Object r1 = r0.read(r1, r2, r3)
            return r1
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r2, java.io.Reader r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r1, java.io.Reader r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r2 = org.simpleframework.xml.stream.NodeBuilder.read(r2)
            java.lang.Object r1 = r0.read(r1, r2, r3)
            return r1
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r2, java.lang.String r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r3)
            java.lang.Object r2 = r1.read(r2, r0, r4)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r2, org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = r1.read(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public <T> T read(T r2, org.simpleframework.xml.stream.InputNode r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.SessionManager r0 = r1.manager
            org.simpleframework.xml.core.Session r4 = r0.open(r4)
            java.lang.Object r2 = r1.read(r2, r3, r4)     // Catch: java.lang.Throwable -> L10
            org.simpleframework.xml.core.SessionManager r3 = r1.manager
            r3.close()
            return r2
        L10:
            r2 = move-exception
            org.simpleframework.xml.core.SessionManager r3 = r1.manager
            r3.close()
            throw r2
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r2, java.io.File r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            boolean r2 = r1.validate(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r2, java.io.File r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            boolean r2 = r1.validate(r2, r0, r4)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r2
        Ld:
            r2 = move-exception
            r0.close()
            throw r2
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r2, java.io.InputStream r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            boolean r2 = r1.validate(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r1, java.io.InputStream r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r2 = org.simpleframework.xml.stream.NodeBuilder.read(r2)
            boolean r1 = r0.validate(r1, r2, r3)
            return r1
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r2, java.io.Reader r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            boolean r2 = r1.validate(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r1, java.io.Reader r2, boolean r3) throws java.lang.Exception {
            r0 = this;
            org.simpleframework.xml.stream.InputNode r2 = org.simpleframework.xml.stream.NodeBuilder.read(r2)
            boolean r1 = r0.validate(r1, r2, r3)
            return r1
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r2, java.lang.String r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            boolean r2 = r1.validate(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r2, java.lang.String r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r3)
            boolean r2 = r1.validate(r2, r0, r4)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r2, org.simpleframework.xml.stream.InputNode r3) throws java.lang.Exception {
            r1 = this;
            r0 = 1
            boolean r2 = r1.validate(r2, r3, r0)
            return r2
    }

    @Override // org.simpleframework.xml.Serializer
    public boolean validate(java.lang.Class r2, org.simpleframework.xml.stream.InputNode r3, boolean r4) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.SessionManager r0 = r1.manager
            org.simpleframework.xml.core.Session r4 = r0.open(r4)
            boolean r2 = r1.validate(r2, r3, r4)     // Catch: java.lang.Throwable -> L10
            org.simpleframework.xml.core.SessionManager r3 = r1.manager
            r3.close()
            return r2
        L10:
            r2 = move-exception
            org.simpleframework.xml.core.SessionManager r3 = r1.manager
            r3.close()
            throw r2
    }

    @Override // org.simpleframework.xml.Serializer
    public void write(java.lang.Object r2, java.io.File r3) throws java.lang.Exception {
            r1 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r3)
            r1.write(r2, r0)     // Catch: java.lang.Throwable -> Lc
            r0.close()
            return
        Lc:
            r2 = move-exception
            r0.close()
            throw r2
    }

    @Override // org.simpleframework.xml.Serializer
    public void write(java.lang.Object r2, java.io.OutputStream r3) throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = "utf-8"
            r1.write(r2, r3, r0)
            return
    }

    public void write(java.lang.Object r2, java.io.OutputStream r3, java.lang.String r4) throws java.lang.Exception {
            r1 = this;
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r3, r4)
            r1.write(r2, r0)
            return
    }

    @Override // org.simpleframework.xml.Serializer
    public void write(java.lang.Object r2, java.io.Writer r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.stream.Format r0 = r1.format
            org.simpleframework.xml.stream.OutputNode r3 = org.simpleframework.xml.stream.NodeBuilder.write(r3, r0)
            r1.write(r2, r3)
            return
    }

    @Override // org.simpleframework.xml.Serializer
    public void write(java.lang.Object r2, org.simpleframework.xml.stream.OutputNode r3) throws java.lang.Exception {
            r1 = this;
            org.simpleframework.xml.core.SessionManager r0 = r1.manager
            org.simpleframework.xml.core.Session r0 = r0.open()
            r1.write(r2, r3, r0)     // Catch: java.lang.Throwable -> Lf
            org.simpleframework.xml.core.SessionManager r2 = r1.manager
            r2.close()
            return
        Lf:
            r2 = move-exception
            org.simpleframework.xml.core.SessionManager r3 = r1.manager
            r3.close()
            throw r2
    }
}
