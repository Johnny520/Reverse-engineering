package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
public interface Plugin extends net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.description.type.TypeDescription>, java.io.Closeable {

    /* JADX INFO: renamed from: net.bytebuddy.build.Plugin$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface Engine {
        public static final java.lang.String CLASS_FILE_EXTENSION = ".class";
        public static final java.lang.String MODULE_INFO = "module-info.class";
        public static final java.lang.String PACKAGE_INFO = "package-info.class";
        public static final java.lang.String PLUGIN_FILE = "META-INF/net.bytebuddy/build.plugins";

        public static abstract class AbstractBase implements net.bytebuddy.build.Plugin.Engine {
            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine.Summary apply(java.io.File r2, java.io.File r3, java.util.List<? extends net.bytebuddy.build.Plugin.Factory> r4) throws java.io.IOException {
                    r1 = this;
                    boolean r0 = r2.isDirectory()
                    if (r0 == 0) goto Lc
                    net.bytebuddy.build.Plugin$Engine$Source$ForFolder r0 = new net.bytebuddy.build.Plugin$Engine$Source$ForFolder
                    r0.<init>(r2)
                    goto L11
                Lc:
                    net.bytebuddy.build.Plugin$Engine$Source$ForJarFile r0 = new net.bytebuddy.build.Plugin$Engine$Source$ForJarFile
                    r0.<init>(r2)
                L11:
                    boolean r2 = r3.isDirectory()
                    if (r2 == 0) goto L1d
                    net.bytebuddy.build.Plugin$Engine$Target$ForFolder r2 = new net.bytebuddy.build.Plugin$Engine$Target$ForFolder
                    r2.<init>(r3)
                    goto L22
                L1d:
                    net.bytebuddy.build.Plugin$Engine$Target$ForJarFile r2 = new net.bytebuddy.build.Plugin$Engine$Target$ForJarFile
                    r2.<init>(r3)
                L22:
                    net.bytebuddy.build.Plugin$Engine$Summary r2 = r1.apply(r0, r2, r4)
                    return r2
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine.Summary apply(java.io.File r1, java.io.File r2, net.bytebuddy.build.Plugin.Factory... r3) throws java.io.IOException {
                    r0 = this;
                    java.util.List r3 = java.util.Arrays.asList(r3)
                    net.bytebuddy.build.Plugin$Engine$Summary r1 = r0.apply(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine.Summary apply(net.bytebuddy.build.Plugin.Engine.Source r1, net.bytebuddy.build.Plugin.Engine.Target r2, net.bytebuddy.build.Plugin.Factory... r3) throws java.io.IOException {
                    r0 = this;
                    java.util.List r3 = java.util.Arrays.asList(r3)
                    net.bytebuddy.build.Plugin$Engine$Summary r1 = r0.apply(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine withErrorHandlers(net.bytebuddy.build.Plugin.Engine.ErrorHandler... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.build.Plugin$Engine r1 = r0.withErrorHandlers(r1)
                    return r1
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine withParallelTransformation(int r4) {
                    r3 = this;
                    r0 = 1
                    if (r4 < r0) goto Ld
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService$Factory r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService$Factory
                    r0.<init>(r4)
                    net.bytebuddy.build.Plugin$Engine r4 = r3.with(r0)
                    return r4
                Ld:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Number of threads must be positive: "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Default extends net.bytebuddy.build.Plugin.Engine.AbstractBase {
            private final net.bytebuddy.ByteBuddy byteBuddy;
            private final net.bytebuddy.dynamic.ClassFileLocator classFileLocator;
            private final net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory dispatcherFactory;
            private final net.bytebuddy.build.Plugin.Engine.ErrorHandler errorHandler;
            private final net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.type.TypeDescription> ignoredTypeMatcher;
            private final net.bytebuddy.build.Plugin.Engine.Listener listener;
            private final net.bytebuddy.build.Plugin.Engine.PoolStrategy poolStrategy;
            private final net.bytebuddy.build.Plugin.Engine.TypeStrategy typeStrategy;

            public class Preprocessor implements java.util.concurrent.Callable<java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable>> {
                private final net.bytebuddy.dynamic.ClassFileLocator classFileLocator;
                private final net.bytebuddy.build.Plugin.Engine.Source.Element element;
                private final net.bytebuddy.build.Plugin.Engine.Listener listener;
                private final java.util.List<net.bytebuddy.build.Plugin> plugins;
                private final java.util.List<net.bytebuddy.build.Plugin.WithPreprocessor> preprocessors;
                final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Default this$0;
                private final java.lang.String typeName;
                private final net.bytebuddy.pool.TypePool typePool;

                public class Ignored implements java.util.concurrent.Callable<net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable> {
                    final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Default.Preprocessor this$1;
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    private Ignored(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            r0.this$1 = r1
                            r0.<init>()
                            r0.typeDescription = r2
                            return
                    }

                    public /* synthetic */ Ignored(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.build.Plugin.AnonymousClass1 r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    @Override // java.util.concurrent.Callable
                    public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable call() throws java.lang.Exception {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable r0 = r1.call2()
                            return r0
                    }

                    @Override // java.util.concurrent.Callable
                    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable call2() {
                            r3 = this;
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r0 = r3.this$1     // Catch: java.lang.Throwable -> L28
                            net.bytebuddy.build.Plugin$Engine$Listener r0 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r0)     // Catch: java.lang.Throwable -> L28
                            net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription     // Catch: java.lang.Throwable -> L28
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r2 = r3.this$1     // Catch: java.lang.Throwable -> L28
                            java.util.List r2 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1500(r2)     // Catch: java.lang.Throwable -> L28
                            r0.onIgnored(r1, r2)     // Catch: java.lang.Throwable -> L28
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r0 = r3.this$1
                            net.bytebuddy.build.Plugin$Engine$Listener r0 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r0)
                            net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                            r0.onComplete(r1)
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForRetainedElement r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForRetainedElement
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r3.this$1
                            net.bytebuddy.build.Plugin$Engine$Source$Element r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1700(r1)
                            r0.<init>(r1)
                            return r0
                        L28:
                            r0 = move-exception
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r3.this$1
                            net.bytebuddy.build.Plugin$Engine$Listener r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r1)
                            net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                            r1.onComplete(r2)
                            throw r0
                    }
                }

                public class Resolved implements java.util.concurrent.Callable<net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable> {
                    final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Default.Preprocessor this$1;
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    private Resolved(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            r0.this$1 = r1
                            r0.<init>()
                            r0.typeDescription = r2
                            return
                    }

                    public /* synthetic */ Resolved(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.build.Plugin.AnonymousClass1 r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    @Override // java.util.concurrent.Callable
                    public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable call() throws java.lang.Exception {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable r0 = r1.call2()
                            return r0
                    }

                    @Override // java.util.concurrent.Callable
                    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable call2() {
                            r9 = this;
                            java.util.ArrayList r0 = new java.util.ArrayList
                            r0.<init>()
                            java.util.ArrayList r1 = new java.util.ArrayList
                            r1.<init>()
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r3 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default r3 = r3.this$0     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$TypeStrategy r3 = net.bytebuddy.build.Plugin.Engine.Default.access$1400(r3)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r4 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default r4 = r4.this$0     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.ByteBuddy r4 = net.bytebuddy.build.Plugin.Engine.Default.access$1200(r4)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.description.type.TypeDescription r5 = r9.typeDescription     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r6 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.dynamic.ClassFileLocator r6 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1300(r6)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.dynamic.DynamicType$Builder r3 = r3.builder(r4, r5, r6)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r4 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            java.util.List r4 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1500(r4)     // Catch: java.lang.Throwable -> L84
                            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L84
                        L35:
                            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L84
                            if (r5 == 0) goto L87
                            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin r5 = (net.bytebuddy.build.Plugin) r5     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.description.type.TypeDescription r6 = r9.typeDescription     // Catch: java.lang.Throwable -> L64
                            boolean r6 = r5.matches(r6)     // Catch: java.lang.Throwable -> L64
                            if (r6 == 0) goto L66
                            net.bytebuddy.description.type.TypeDescription r6 = r9.typeDescription     // Catch: java.lang.Throwable -> L64
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r7 = r9.this$1     // Catch: java.lang.Throwable -> L64
                            net.bytebuddy.dynamic.ClassFileLocator r7 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1300(r7)     // Catch: java.lang.Throwable -> L64
                            net.bytebuddy.dynamic.DynamicType$Builder r3 = r5.apply(r3, r6, r7)     // Catch: java.lang.Throwable -> L64
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r6 = r9.this$1     // Catch: java.lang.Throwable -> L64
                            net.bytebuddy.build.Plugin$Engine$Listener r6 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r6)     // Catch: java.lang.Throwable -> L64
                            net.bytebuddy.description.type.TypeDescription r7 = r9.typeDescription     // Catch: java.lang.Throwable -> L64
                            r6.onTransformation(r7, r5)     // Catch: java.lang.Throwable -> L64
                            r0.add(r5)     // Catch: java.lang.Throwable -> L64
                            goto L35
                        L64:
                            r6 = move-exception
                            goto L75
                        L66:
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r6 = r9.this$1     // Catch: java.lang.Throwable -> L64
                            net.bytebuddy.build.Plugin$Engine$Listener r6 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r6)     // Catch: java.lang.Throwable -> L64
                            net.bytebuddy.description.type.TypeDescription r7 = r9.typeDescription     // Catch: java.lang.Throwable -> L64
                            r6.onIgnored(r7, r5)     // Catch: java.lang.Throwable -> L64
                            r1.add(r5)     // Catch: java.lang.Throwable -> L64
                            goto L35
                        L75:
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r7 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Listener r7 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r7)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.description.type.TypeDescription r8 = r9.typeDescription     // Catch: java.lang.Throwable -> L84
                            r7.onError(r8, r5, r6)     // Catch: java.lang.Throwable -> L84
                            r2.add(r6)     // Catch: java.lang.Throwable -> L84
                            goto L35
                        L84:
                            r0 = move-exception
                            goto L160
                        L87:
                            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L84
                            if (r4 != 0) goto Lb1
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r0 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Listener r0 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r0)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.description.type.TypeDescription r1 = r9.typeDescription     // Catch: java.lang.Throwable -> L84
                            r0.onError(r1, r2)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForFailedElement r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForFailedElement     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Source$Element r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1700(r1)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.description.type.TypeDescription r3 = r9.typeDescription     // Catch: java.lang.Throwable -> L84
                            r0.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r9.this$1
                            net.bytebuddy.build.Plugin$Engine$Listener r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r1)
                            net.bytebuddy.description.type.TypeDescription r2 = r9.typeDescription
                            r1.onComplete(r2)
                            return r0
                        Lb1:
                            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L84
                            if (r4 != 0) goto L13e
                            net.bytebuddy.dynamic.TypeResolutionStrategy$Disabled r1 = net.bytebuddy.dynamic.TypeResolutionStrategy.Disabled.INSTANCE     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r4 = r9.this$1     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.pool.TypePool r4 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1800(r4)     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.dynamic.DynamicType$Unloaded r1 = r3.make(r1, r4)     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r3 = r9.this$1     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.build.Plugin$Engine$Listener r3 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r3)     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.description.type.TypeDescription r4 = r9.typeDescription     // Catch: java.lang.Throwable -> L104
                            r3.onTransformation(r4, r0)     // Catch: java.lang.Throwable -> L104
                            java.util.Map r0 = r1.getLoadedTypeInitializers()     // Catch: java.lang.Throwable -> L104
                            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L104
                            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L104
                        Lda:
                            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L104
                            if (r3 == 0) goto L106
                            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L104
                            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L104
                            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.implementation.LoadedTypeInitializer r4 = (net.bytebuddy.implementation.LoadedTypeInitializer) r4     // Catch: java.lang.Throwable -> L104
                            boolean r4 = r4.isAlive()     // Catch: java.lang.Throwable -> L104
                            if (r4 == 0) goto Lda
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r4 = r9.this$1     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.build.Plugin$Engine$Listener r4 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r4)     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.description.type.TypeDescription r5 = r9.typeDescription     // Catch: java.lang.Throwable -> L104
                            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3     // Catch: java.lang.Throwable -> L104
                            r4.onLiveInitializer(r5, r3)     // Catch: java.lang.Throwable -> L104
                            goto Lda
                        L104:
                            r0 = move-exception
                            goto L117
                        L106:
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForTransformedElement r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForTransformedElement     // Catch: java.lang.Throwable -> L104
                            r0.<init>(r1)     // Catch: java.lang.Throwable -> L104
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r9.this$1
                            net.bytebuddy.build.Plugin$Engine$Listener r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r1)
                            net.bytebuddy.description.type.TypeDescription r2 = r9.typeDescription
                            r1.onComplete(r2)
                            return r0
                        L117:
                            r2.add(r0)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r0 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Listener r0 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r0)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.description.type.TypeDescription r1 = r9.typeDescription     // Catch: java.lang.Throwable -> L84
                            r0.onError(r1, r2)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForFailedElement r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForFailedElement     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Source$Element r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1700(r1)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.description.type.TypeDescription r3 = r9.typeDescription     // Catch: java.lang.Throwable -> L84
                            r0.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r9.this$1
                            net.bytebuddy.build.Plugin$Engine$Listener r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r1)
                            net.bytebuddy.description.type.TypeDescription r2 = r9.typeDescription
                            r1.onComplete(r2)
                            return r0
                        L13e:
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r0 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Listener r0 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r0)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.description.type.TypeDescription r2 = r9.typeDescription     // Catch: java.lang.Throwable -> L84
                            r0.onIgnored(r2, r1)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForRetainedElement r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForRetainedElement     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r9.this$1     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Source$Element r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1700(r1)     // Catch: java.lang.Throwable -> L84
                            r0.<init>(r1)     // Catch: java.lang.Throwable -> L84
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r9.this$1
                            net.bytebuddy.build.Plugin$Engine$Listener r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r1)
                            net.bytebuddy.description.type.TypeDescription r2 = r9.typeDescription
                            r1.onComplete(r2)
                            return r0
                        L160:
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r9.this$1
                            net.bytebuddy.build.Plugin$Engine$Listener r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r1)
                            net.bytebuddy.description.type.TypeDescription r2 = r9.typeDescription
                            r1.onComplete(r2)
                            throw r0
                    }
                }

                public class Unresolved implements java.util.concurrent.Callable<net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable> {
                    final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Default.Preprocessor this$1;

                    private Unresolved(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r1) {
                            r0 = this;
                            r0.this$1 = r1
                            r0.<init>()
                            return
                    }

                    public /* synthetic */ Unresolved(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r1, net.bytebuddy.build.Plugin.AnonymousClass1 r2) {
                            r0 = this;
                            r0.<init>(r1)
                            return
                    }

                    @Override // java.util.concurrent.Callable
                    public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable call() throws java.lang.Exception {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable r0 = r1.call2()
                            return r0
                    }

                    @Override // java.util.concurrent.Callable
                    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable call2() {
                            r3 = this;
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r0 = r3.this$1
                            net.bytebuddy.build.Plugin$Engine$Listener r0 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1600(r0)
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r3.this$1
                            java.lang.String r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1900(r1)
                            r0.onUnresolved(r1)
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForUnresolvedElement r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable$ForUnresolvedElement
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r1 = r3.this$1
                            net.bytebuddy.build.Plugin$Engine$Source$Element r1 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1700(r1)
                            net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r2 = r3.this$1
                            java.lang.String r2 = net.bytebuddy.build.Plugin.Engine.Default.Preprocessor.access$1900(r2)
                            r0.<init>(r1, r2)
                            return r0
                    }
                }

                private Preprocessor(net.bytebuddy.build.Plugin.Engine.Default r1, net.bytebuddy.build.Plugin.Engine.Source.Element r2, java.lang.String r3, net.bytebuddy.dynamic.ClassFileLocator r4, net.bytebuddy.pool.TypePool r5, net.bytebuddy.build.Plugin.Engine.Listener r6, java.util.List<net.bytebuddy.build.Plugin> r7, java.util.List<net.bytebuddy.build.Plugin.WithPreprocessor> r8) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        r0.element = r2
                        r0.typeName = r3
                        r0.classFileLocator = r4
                        r0.typePool = r5
                        r0.listener = r6
                        r0.plugins = r7
                        r0.preprocessors = r8
                        return
                }

                public /* synthetic */ Preprocessor(net.bytebuddy.build.Plugin.Engine.Default r1, net.bytebuddy.build.Plugin.Engine.Source.Element r2, java.lang.String r3, net.bytebuddy.dynamic.ClassFileLocator r4, net.bytebuddy.pool.TypePool r5, net.bytebuddy.build.Plugin.Engine.Listener r6, java.util.List r7, java.util.List r8, net.bytebuddy.build.Plugin.AnonymousClass1 r9) {
                        r0 = this;
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                        return
                }

                public static /* synthetic */ net.bytebuddy.dynamic.ClassFileLocator access$1300(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r0) {
                        net.bytebuddy.dynamic.ClassFileLocator r0 = r0.classFileLocator
                        return r0
                }

                public static /* synthetic */ java.util.List access$1500(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r0) {
                        java.util.List<net.bytebuddy.build.Plugin> r0 = r0.plugins
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.build.Plugin.Engine.Listener access$1600(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r0) {
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r0.listener
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.Element access$1700(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r0) {
                        net.bytebuddy.build.Plugin$Engine$Source$Element r0 = r0.element
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.pool.TypePool access$1800(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r0) {
                        net.bytebuddy.pool.TypePool r0 = r0.typePool
                        return r0
                }

                public static /* synthetic */ java.lang.String access$1900(net.bytebuddy.build.Plugin.Engine.Default.Preprocessor r0) {
                        java.lang.String r0 = r0.typeName
                        return r0
                }

                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable> call() throws java.lang.Exception {
                        r1 = this;
                        java.util.concurrent.Callable r0 = r1.call2()
                        return r0
                }

                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
                public java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable> call2() throws java.lang.Exception {
                        r5 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r5.listener
                        java.lang.String r1 = r5.typeName
                        r0.onDiscovery(r1)
                        net.bytebuddy.pool.TypePool r0 = r5.typePool
                        java.lang.String r1 = r5.typeName
                        net.bytebuddy.pool.TypePool$Resolution r0 = r0.describe(r1)
                        boolean r1 = r0.isResolved()
                        r2 = 0
                        if (r1 == 0) goto L65
                        net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                        net.bytebuddy.build.Plugin$Engine$Default r1 = r5.this$0     // Catch: java.lang.Throwable -> L3e
                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.build.Plugin.Engine.Default.access$800(r1)     // Catch: java.lang.Throwable -> L3e
                        boolean r1 = r1.matches(r0)     // Catch: java.lang.Throwable -> L3e
                        if (r1 != 0) goto L46
                        java.util.List<net.bytebuddy.build.Plugin$WithPreprocessor> r1 = r5.preprocessors     // Catch: java.lang.Throwable -> L3e
                        java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3e
                    L2c:
                        boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
                        if (r3 == 0) goto L40
                        java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3e
                        net.bytebuddy.build.Plugin$WithPreprocessor r3 = (net.bytebuddy.build.Plugin.WithPreprocessor) r3     // Catch: java.lang.Throwable -> L3e
                        net.bytebuddy.dynamic.ClassFileLocator r4 = r5.classFileLocator     // Catch: java.lang.Throwable -> L3e
                        r3.onPreprocess(r0, r4)     // Catch: java.lang.Throwable -> L3e
                        goto L2c
                    L3e:
                        r1 = move-exception
                        goto L4c
                    L40:
                        net.bytebuddy.build.Plugin$Engine$Default$Preprocessor$Resolved r1 = new net.bytebuddy.build.Plugin$Engine$Default$Preprocessor$Resolved     // Catch: java.lang.Throwable -> L3e
                        r1.<init>(r5, r0, r2)     // Catch: java.lang.Throwable -> L3e
                        return r1
                    L46:
                        net.bytebuddy.build.Plugin$Engine$Default$Preprocessor$Ignored r1 = new net.bytebuddy.build.Plugin$Engine$Default$Preprocessor$Ignored     // Catch: java.lang.Throwable -> L3e
                        r1.<init>(r5, r0, r2)     // Catch: java.lang.Throwable -> L3e
                        return r1
                    L4c:
                        net.bytebuddy.build.Plugin$Engine$Listener r2 = r5.listener
                        r2.onComplete(r0)
                        boolean r0 = r1 instanceof java.lang.Exception
                        if (r0 != 0) goto L62
                        boolean r0 = r1 instanceof java.lang.Error
                        if (r0 == 0) goto L5c
                        java.lang.Error r1 = (java.lang.Error) r1
                        throw r1
                    L5c:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r0.<init>(r1)
                        throw r0
                    L62:
                        java.lang.Exception r1 = (java.lang.Exception) r1
                        throw r1
                    L65:
                        net.bytebuddy.build.Plugin$Engine$Default$Preprocessor$Unresolved r0 = new net.bytebuddy.build.Plugin$Engine$Default$Preprocessor$Unresolved
                        r0.<init>(r5, r2)
                        return r0
                }
            }

            public Default() {
                    r1 = this;
                    net.bytebuddy.ByteBuddy r0 = new net.bytebuddy.ByteBuddy
                    r0.<init>()
                    r1.<init>(r0)
                    return
            }

            public Default(net.bytebuddy.ByteBuddy r2) {
                    r1 = this;
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default r0 = net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.REBASE
                    r1.<init>(r2, r0)
                    return
            }

            public Default(net.bytebuddy.ByteBuddy r10, net.bytebuddy.build.Plugin.Engine.TypeStrategy r11) {
                    r9 = this;
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default r3 = net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default.FAST
                    net.bytebuddy.dynamic.ClassFileLocator$NoOp r4 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE
                    net.bytebuddy.build.Plugin$Engine$Listener$NoOp r5 = net.bytebuddy.build.Plugin.Engine.Listener.NoOp.INSTANCE
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler$Compound r6 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Compound
                    r0 = 3
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler[] r0 = new net.bytebuddy.build.Plugin.Engine.ErrorHandler[r0]
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing r1 = net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.FAIL_FAST
                    r2 = 0
                    r0[r2] = r1
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing r1 = net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.ALL_TYPES_RESOLVED
                    r2 = 1
                    r0[r2] = r1
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing r1 = net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.NO_LIVE_INITIALIZERS
                    r2 = 2
                    r0[r2] = r1
                    r6.<init>(r0)
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation$Factory r7 = net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory.INSTANCE
                    net.bytebuddy.matcher.ElementMatcher$Junction r8 = net.bytebuddy.matcher.ElementMatchers.none()
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            public Default(net.bytebuddy.ByteBuddy r1, net.bytebuddy.build.Plugin.Engine.TypeStrategy r2, net.bytebuddy.build.Plugin.Engine.PoolStrategy r3, net.bytebuddy.dynamic.ClassFileLocator r4, net.bytebuddy.build.Plugin.Engine.Listener r5, net.bytebuddy.build.Plugin.Engine.ErrorHandler r6, net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory r7, net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.type.TypeDescription> r8) {
                    r0 = this;
                    r0.<init>()
                    r0.byteBuddy = r1
                    r0.typeStrategy = r2
                    r0.poolStrategy = r3
                    r0.classFileLocator = r4
                    r0.listener = r5
                    r0.errorHandler = r6
                    r0.dispatcherFactory = r7
                    r0.ignoredTypeMatcher = r8
                    return
            }

            public static /* synthetic */ net.bytebuddy.ByteBuddy access$1200(net.bytebuddy.build.Plugin.Engine.Default r0) {
                    net.bytebuddy.ByteBuddy r0 = r0.byteBuddy
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.build.Plugin.Engine.TypeStrategy access$1400(net.bytebuddy.build.Plugin.Engine.Default r0) {
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r0 = r0.typeStrategy
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.matcher.ElementMatcher.Junction access$800(net.bytebuddy.build.Plugin.Engine.Default r0) {
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r0 = r0.ignoredTypeMatcher
                    return r0
            }

            public static void main(java.lang.String... r5) throws java.lang.ClassNotFoundException, java.io.IOException {
                    int r0 = r5.length
                    r1 = 2
                    if (r0 < r1) goto L4a
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r2 = r5.length
                    int r2 = r2 - r1
                    r0.<init>(r2)
                    java.util.List r2 = java.util.Arrays.asList(r5)
                    int r3 = r5.length
                    java.util.List r1 = r2.subList(r1, r3)
                    java.util.Iterator r1 = r1.iterator()
                L18:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L31
                    java.lang.Object r2 = r1.next()
                    java.lang.String r2 = (java.lang.String) r2
                    net.bytebuddy.build.Plugin$Factory$UsingReflection r3 = new net.bytebuddy.build.Plugin$Factory$UsingReflection
                    java.lang.Class r2 = java.lang.Class.forName(r2)
                    r3.<init>(r2)
                    r0.add(r3)
                    goto L18
                L31:
                    net.bytebuddy.build.Plugin$Engine$Default r1 = new net.bytebuddy.build.Plugin$Engine$Default
                    r1.<init>()
                    java.io.File r2 = new java.io.File
                    r3 = 0
                    r3 = r5[r3]
                    r2.<init>(r3)
                    java.io.File r3 = new java.io.File
                    r4 = 1
                    r5 = r5[r4]
                    r3.<init>(r5)
                    r1.apply(r2, r3, r0)
                    return
                L4a:
                    java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = "Expected arguments: <source> <target> [<plugin>, ...]"
                    r5.<init>(r0)
                    throw r5
            }

            public static net.bytebuddy.build.Plugin.Engine of(net.bytebuddy.build.EntryPoint r2, net.bytebuddy.ClassFileVersion r3, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r4) {
                    net.bytebuddy.build.Plugin$Engine$Default r0 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r3 = r2.byteBuddy(r3)
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy$ForEntryPoint r1 = new net.bytebuddy.build.Plugin$Engine$TypeStrategy$ForEntryPoint
                    r1.<init>(r2, r4)
                    r0.<init>(r3, r1)
                    return r0
            }

            public static java.util.Set<java.lang.String> scan(java.lang.ClassLoader r5) throws java.io.IOException {
                    java.util.HashSet r0 = new java.util.HashSet
                    r0.<init>()
                    java.lang.String r1 = "META-INF/net.bytebuddy/build.plugins"
                    java.util.Enumeration r5 = r5.getResources(r1)
                Lb:
                    boolean r1 = r5.hasMoreElements()
                    if (r1 == 0) goto L3b
                    java.io.BufferedReader r1 = new java.io.BufferedReader
                    java.io.InputStreamReader r2 = new java.io.InputStreamReader
                    java.lang.Object r3 = r5.nextElement()
                    java.net.URL r3 = (java.net.URL) r3
                    java.io.InputStream r3 = r3.openStream()
                    java.lang.String r4 = "UTF-8"
                    r2.<init>(r3, r4)
                    r1.<init>(r2)
                L27:
                    java.lang.String r2 = r1.readLine()     // Catch: java.lang.Throwable -> L31
                    if (r2 == 0) goto L33
                    r0.add(r2)     // Catch: java.lang.Throwable -> L31
                    goto L27
                L31:
                    r5 = move-exception
                    goto L37
                L33:
                    r1.close()
                    goto Lb
                L37:
                    r1.close()
                    throw r5
                L3b:
                    return r0
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine.Summary apply(net.bytebuddy.build.Plugin.Engine.Source r26, net.bytebuddy.build.Plugin.Engine.Target r27, java.util.List<? extends net.bytebuddy.build.Plugin.Factory> r28) throws java.io.IOException {
                    r25 = this;
                    r11 = r25
                    net.bytebuddy.build.Plugin$Engine$Listener$Compound r12 = new net.bytebuddy.build.Plugin$Engine$Listener$Compound
                    net.bytebuddy.build.Plugin$Engine$Listener r0 = r11.listener
                    net.bytebuddy.build.Plugin$Engine$Listener$ForErrorHandler r1 = new net.bytebuddy.build.Plugin$Engine$Listener$ForErrorHandler
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r2 = r11.errorHandler
                    r1.<init>(r2)
                    r2 = 2
                    net.bytebuddy.build.Plugin$Engine$Listener[] r3 = new net.bytebuddy.build.Plugin.Engine.Listener[r2]
                    r13 = 0
                    r3[r13] = r0
                    r0 = 1
                    r3[r0] = r1
                    r12.<init>(r3)
                    java.util.ArrayList r14 = new java.util.ArrayList
                    r14.<init>()
                    java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
                    r15.<init>()
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    java.util.ArrayList r9 = new java.util.ArrayList
                    int r1 = r28.size()
                    r9.<init>(r1)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r8.<init>()
                    r16 = 0
                    java.util.Iterator r3 = r28.iterator()     // Catch: java.lang.Throwable -> L1fc
                L41:
                    boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L1fc
                    if (r4 == 0) goto L6f
                    java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L5f
                    net.bytebuddy.build.Plugin$Factory r4 = (net.bytebuddy.build.Plugin.Factory) r4     // Catch: java.lang.Throwable -> L5f
                    net.bytebuddy.build.Plugin r4 = r4.make()     // Catch: java.lang.Throwable -> L5f
                    r9.add(r4)     // Catch: java.lang.Throwable -> L5f
                    boolean r5 = r4 instanceof net.bytebuddy.build.Plugin.WithPreprocessor     // Catch: java.lang.Throwable -> L5f
                    if (r5 == 0) goto L65
                    r5 = r4
                    net.bytebuddy.build.Plugin$WithPreprocessor r5 = (net.bytebuddy.build.Plugin.WithPreprocessor) r5     // Catch: java.lang.Throwable -> L5f
                    r8.add(r5)     // Catch: java.lang.Throwable -> L5f
                    goto L65
                L5f:
                    r0 = move-exception
                    r1 = r0
                    r24 = r9
                    goto L200
                L65:
                    boolean r5 = r4 instanceof net.bytebuddy.build.Plugin.WithInitialization     // Catch: java.lang.Throwable -> L5f
                    if (r5 == 0) goto L41
                    net.bytebuddy.build.Plugin$WithInitialization r4 = (net.bytebuddy.build.Plugin.WithInitialization) r4     // Catch: java.lang.Throwable -> L5f
                    r1.add(r4)     // Catch: java.lang.Throwable -> L5f
                    goto L41
                L6f:
                    net.bytebuddy.build.Plugin$Engine$Source$Origin r17 = r26.read()     // Catch: java.lang.Throwable -> L1fc
                    net.bytebuddy.dynamic.ClassFileLocator$Compound r7 = new net.bytebuddy.dynamic.ClassFileLocator$Compound     // Catch: java.lang.Throwable -> L1f5
                    net.bytebuddy.dynamic.ClassFileLocator r3 = r17.getClassFileLocator()     // Catch: java.lang.Throwable -> L1f5
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r11.classFileLocator     // Catch: java.lang.Throwable -> L1f5
                    net.bytebuddy.dynamic.ClassFileLocator[] r2 = new net.bytebuddy.dynamic.ClassFileLocator[r2]     // Catch: java.lang.Throwable -> L1f5
                    r2[r13] = r3     // Catch: java.lang.Throwable -> L1f5
                    r2[r0] = r4     // Catch: java.lang.Throwable -> L1f5
                    r7.<init>(r2)     // Catch: java.lang.Throwable -> L1f5
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r2 = r11.poolStrategy     // Catch: java.lang.Throwable -> L1f5
                    net.bytebuddy.pool.TypePool r18 = r2.typePool(r7)     // Catch: java.lang.Throwable -> L1f5
                    java.util.jar.Manifest r2 = r17.getManifest()     // Catch: java.lang.Throwable -> L1f5
                    r12.onManifest(r2)     // Catch: java.lang.Throwable -> L1f5
                    r3 = r27
                    net.bytebuddy.build.Plugin$Engine$Target$Sink r6 = r3.write(r2)     // Catch: java.lang.Throwable -> L1f5
                    java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Laf
                L9b:
                    boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Laf
                    if (r2 == 0) goto Lb5
                    java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Laf
                    net.bytebuddy.build.Plugin$WithInitialization r2 = (net.bytebuddy.build.Plugin.WithInitialization) r2     // Catch: java.lang.Throwable -> Laf
                    java.util.Map r2 = r2.initialize(r7)     // Catch: java.lang.Throwable -> Laf
                    r6.store(r2)     // Catch: java.lang.Throwable -> Laf
                    goto L9b
                Laf:
                    r0 = move-exception
                    r1 = r6
                    r24 = r9
                    goto L1f1
                Lb5:
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r1 = r11.dispatcherFactory     // Catch: java.lang.Throwable -> Laf
                    net.bytebuddy.build.Plugin$Engine$Dispatcher r5 = r1.make(r6, r14, r15, r10)     // Catch: java.lang.Throwable -> Laf
                    java.util.Iterator r19 = r17.iterator()     // Catch: java.lang.Throwable -> Le3
                Lbf:
                    boolean r1 = r19.hasNext()     // Catch: java.lang.Throwable -> Le3
                    if (r1 == 0) goto L18d
                    java.lang.Object r1 = r19.next()     // Catch: java.lang.Throwable -> Le3
                    r3 = r1
                    net.bytebuddy.build.Plugin$Engine$Source$Element r3 = (net.bytebuddy.build.Plugin.Engine.Source.Element) r3     // Catch: java.lang.Throwable -> Le3
                    boolean r1 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Le3
                    if (r1 != 0) goto L17a
                    java.lang.String r1 = r3.getName()     // Catch: java.lang.Throwable -> Le3
                Ld6:
                    java.lang.String r2 = "/"
                    boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Le3
                    if (r2 == 0) goto Lea
                    java.lang.String r1 = r1.substring(r0)     // Catch: java.lang.Throwable -> Le3
                    goto Ld6
                Le3:
                    r0 = move-exception
                    r2 = r5
                    r1 = r6
                    r24 = r9
                    goto L1ed
                Lea:
                    java.lang.String r2 = ".class"
                    boolean r2 = r1.endsWith(r2)     // Catch: java.lang.Throwable -> Le3
                    if (r2 == 0) goto L14f
                    java.lang.String r2 = "package-info.class"
                    boolean r2 = r1.endsWith(r2)     // Catch: java.lang.Throwable -> L148
                    if (r2 != 0) goto L14f
                    java.lang.String r2 = "module-info.class"
                    boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L148
                    if (r2 != 0) goto L14f
                    net.bytebuddy.build.Plugin$Engine$Default$Preprocessor r4 = new net.bytebuddy.build.Plugin$Engine$Default$Preprocessor     // Catch: java.lang.Throwable -> L148
                    int r2 = r1.length()     // Catch: java.lang.Throwable -> L148
                    int r2 = r2 + (-6)
                    java.lang.String r1 = r1.substring(r13, r2)     // Catch: java.lang.Throwable -> L148
                    r2 = 47
                    r0 = 46
                    java.lang.String r0 = r1.replace(r2, r0)     // Catch: java.lang.Throwable -> L148
                    r20 = 0
                    r1 = r4
                    r2 = r25
                    r13 = r4
                    r4 = r0
                    r21 = r5
                    r5 = r7
                    r22 = r6
                    r6 = r18
                    r0 = r7
                    r7 = r12
                    r23 = r8
                    r8 = r9
                    r24 = r9
                    r9 = r23
                    r11 = r10
                    r10 = r20
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L144
                    boolean r1 = r23.isEmpty()     // Catch: java.lang.Throwable -> L144
                    r2 = r21
                    r2.accept(r13, r1)     // Catch: java.lang.Throwable -> L13f
                L13c:
                    r1 = r22
                    goto L16c
                L13f:
                    r0 = move-exception
                L140:
                    r1 = r22
                    goto L1ed
                L144:
                    r0 = move-exception
                    r2 = r21
                    goto L140
                L148:
                    r0 = move-exception
                    r2 = r5
                    r22 = r6
                    r24 = r9
                    goto L140
                L14f:
                    r2 = r5
                    r22 = r6
                    r0 = r7
                    r23 = r8
                    r24 = r9
                    r11 = r10
                    java.lang.String r4 = "META-INF/MANIFEST.MF"
                    boolean r4 = r1.equals(r4)     // Catch: java.lang.Throwable -> L13f
                    if (r4 != 0) goto L13c
                    r12.onResource(r1)     // Catch: java.lang.Throwable -> L13f
                    r1 = r22
                    r1.retain(r3)     // Catch: java.lang.Throwable -> L169
                    goto L16c
                L169:
                    r0 = move-exception
                    goto L1ed
                L16c:
                    r7 = r0
                    r6 = r1
                    r5 = r2
                    r10 = r11
                    r8 = r23
                    r9 = r24
                    r0 = 1
                    r13 = 0
                    r11 = r25
                    goto Lbf
                L17a:
                    r2 = r5
                    r1 = r6
                    r24 = r9
                    java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L169
                    r0.interrupt()     // Catch: java.lang.Throwable -> L169
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L169
                    java.lang.String r3 = "Thread interrupted during plugin engine application"
                    r0.<init>(r3)     // Catch: java.lang.Throwable -> L169
                    throw r0     // Catch: java.lang.Throwable -> L169
                L18d:
                    r2 = r5
                    r1 = r6
                    r24 = r9
                    r11 = r10
                    r2.complete()     // Catch: java.lang.Throwable -> L169
                    r2.close()     // Catch: java.lang.Throwable -> L1a2
                    boolean r0 = r15.isEmpty()     // Catch: java.lang.Throwable -> L1a2
                    if (r0 != 0) goto L1a4
                    r12.onError(r15)     // Catch: java.lang.Throwable -> L1a2
                    goto L1a4
                L1a2:
                    r0 = move-exception
                    goto L1f1
                L1a4:
                    r1.close()     // Catch: java.lang.Throwable -> L1eb
                    r17.close()     // Catch: java.lang.Throwable -> L1e8
                    java.util.Iterator r1 = r24.iterator()
                    r2 = r16
                L1b0:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L1cc
                    java.lang.Object r0 = r1.next()
                    r3 = r0
                    net.bytebuddy.build.Plugin r3 = (net.bytebuddy.build.Plugin) r3
                    r3.close()     // Catch: java.lang.Throwable -> L1c1
                    goto L1b0
                L1c1:
                    r0 = move-exception
                    r4 = r0
                    r12.onError(r3, r4)     // Catch: java.lang.Throwable -> L1c7
                    goto L1b0
                L1c7:
                    r0 = move-exception
                    if (r2 != 0) goto L1b0
                    r2 = r0
                    goto L1b0
                L1cc:
                    if (r2 != 0) goto L1d4
                    net.bytebuddy.build.Plugin$Engine$Summary r0 = new net.bytebuddy.build.Plugin$Engine$Summary
                    r0.<init>(r14, r15, r11)
                    return r0
                L1d4:
                    boolean r0 = r2 instanceof java.io.IOException
                    if (r0 != 0) goto L1e5
                    boolean r0 = r2 instanceof java.lang.RuntimeException
                    if (r0 == 0) goto L1df
                    java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
                    throw r2
                L1df:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>(r2)
                    throw r0
                L1e5:
                    java.io.IOException r2 = (java.io.IOException) r2
                    throw r2
                L1e8:
                    r0 = move-exception
                L1e9:
                    r1 = r0
                    goto L200
                L1eb:
                    r0 = move-exception
                    goto L1f8
                L1ed:
                    r2.close()     // Catch: java.lang.Throwable -> L1a2
                    throw r0     // Catch: java.lang.Throwable -> L1a2
                L1f1:
                    r1.close()     // Catch: java.lang.Throwable -> L1eb
                    throw r0     // Catch: java.lang.Throwable -> L1eb
                L1f5:
                    r0 = move-exception
                    r24 = r9
                L1f8:
                    r17.close()     // Catch: java.lang.Throwable -> L1e8
                    throw r0     // Catch: java.lang.Throwable -> L1e8
                L1fc:
                    r0 = move-exception
                    r24 = r9
                    goto L1e9
                L200:
                    java.util.Iterator r2 = r24.iterator()
                L204:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L221
                    java.lang.Object r0 = r2.next()
                    r3 = r0
                    net.bytebuddy.build.Plugin r3 = (net.bytebuddy.build.Plugin) r3
                    r3.close()     // Catch: java.lang.Throwable -> L215
                    goto L204
                L215:
                    r0 = move-exception
                    r4 = r0
                    r12.onError(r3, r4)     // Catch: java.lang.Throwable -> L21b
                    goto L204
                L21b:
                    r0 = move-exception
                    if (r16 != 0) goto L204
                    r16 = r0
                    goto L204
                L221:
                    throw r1
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    net.bytebuddy.ByteBuddy r2 = r4.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$Default r5 = (net.bytebuddy.build.Plugin.Engine.Default) r5
                    net.bytebuddy.ByteBuddy r3 = r5.byteBuddy
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r4.typeStrategy
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r3 = r5.typeStrategy
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r2 = r4.poolStrategy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r5.poolStrategy
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L36
                    return r1
                L36:
                    net.bytebuddy.dynamic.ClassFileLocator r2 = r4.classFileLocator
                    net.bytebuddy.dynamic.ClassFileLocator r3 = r5.classFileLocator
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L41
                    return r1
                L41:
                    net.bytebuddy.build.Plugin$Engine$Listener r2 = r4.listener
                    net.bytebuddy.build.Plugin$Engine$Listener r3 = r5.listener
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L4c
                    return r1
                L4c:
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r2 = r4.errorHandler
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r3 = r5.errorHandler
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L57
                    return r1
                L57:
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r2 = r4.dispatcherFactory
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r3 = r5.dispatcherFactory
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L62
                    return r1
                L62:
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r2 = r4.ignoredTypeMatcher
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r5 = r5.ignoredTypeMatcher
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L6d
                    return r1
                L6d:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.ByteBuddy r1 = r2.byteBuddy
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r1 = r2.typeStrategy
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r1 = r2.poolStrategy
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.ClassFileLocator r1 = r2.classFileLocator
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.build.Plugin$Engine$Listener r1 = r2.listener
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = r2.errorHandler
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r1 = r2.dispatcherFactory
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r1 = r2.ignoredTypeMatcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine ignore(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r11) {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r1 = r10.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r10.typeStrategy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r10.poolStrategy
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r10.classFileLocator
                    net.bytebuddy.build.Plugin$Engine$Listener r5 = r10.listener
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r6 = r10.errorHandler
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r7 = r10.dispatcherFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r0 = r10.ignoredTypeMatcher
                    net.bytebuddy.matcher.ElementMatcher$Junction r8 = r0.or(r11)
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.ByteBuddy r11) {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r10.typeStrategy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r10.poolStrategy
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r10.classFileLocator
                    net.bytebuddy.build.Plugin$Engine$Listener r5 = r10.listener
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r6 = r10.errorHandler
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r7 = r10.dispatcherFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r8 = r10.ignoredTypeMatcher
                    r0 = r9
                    r1 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory r11) {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r1 = r10.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r10.typeStrategy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r10.poolStrategy
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r10.classFileLocator
                    net.bytebuddy.build.Plugin$Engine$Listener r5 = r10.listener
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r6 = r10.errorHandler
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r8 = r10.ignoredTypeMatcher
                    r0 = r9
                    r7 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.build.Plugin.Engine.Listener r11) {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r1 = r10.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r10.typeStrategy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r10.poolStrategy
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r10.classFileLocator
                    net.bytebuddy.build.Plugin$Engine$Listener$Compound r5 = new net.bytebuddy.build.Plugin$Engine$Listener$Compound
                    net.bytebuddy.build.Plugin$Engine$Listener r0 = r10.listener
                    r6 = 2
                    net.bytebuddy.build.Plugin$Engine$Listener[] r6 = new net.bytebuddy.build.Plugin.Engine.Listener[r6]
                    r7 = 0
                    r6[r7] = r0
                    r0 = 1
                    r6[r0] = r11
                    r5.<init>(r6)
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r6 = r10.errorHandler
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r7 = r10.dispatcherFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r8 = r10.ignoredTypeMatcher
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.build.Plugin.Engine.PoolStrategy r11) {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r1 = r10.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r10.typeStrategy
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r10.classFileLocator
                    net.bytebuddy.build.Plugin$Engine$Listener r5 = r10.listener
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r6 = r10.errorHandler
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r7 = r10.dispatcherFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r8 = r10.ignoredTypeMatcher
                    r0 = r9
                    r3 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.build.Plugin.Engine.TypeStrategy r11) {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r1 = r10.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r10.poolStrategy
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r10.classFileLocator
                    net.bytebuddy.build.Plugin$Engine$Listener r5 = r10.listener
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r6 = r10.errorHandler
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r7 = r10.dispatcherFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r8 = r10.ignoredTypeMatcher
                    r0 = r9
                    r2 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.dynamic.ClassFileLocator r11) {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r1 = r10.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r10.typeStrategy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r10.poolStrategy
                    net.bytebuddy.dynamic.ClassFileLocator$Compound r4 = new net.bytebuddy.dynamic.ClassFileLocator$Compound
                    net.bytebuddy.dynamic.ClassFileLocator r0 = r10.classFileLocator
                    r5 = 2
                    net.bytebuddy.dynamic.ClassFileLocator[] r5 = new net.bytebuddy.dynamic.ClassFileLocator[r5]
                    r6 = 0
                    r5[r6] = r0
                    r0 = 1
                    r5[r0] = r11
                    r4.<init>(r5)
                    net.bytebuddy.build.Plugin$Engine$Listener r5 = r10.listener
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler r6 = r10.errorHandler
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r7 = r10.dispatcherFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r8 = r10.ignoredTypeMatcher
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine withErrorHandlers(java.util.List<? extends net.bytebuddy.build.Plugin.Engine.ErrorHandler> r11) {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r1 = r10.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r10.typeStrategy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r10.poolStrategy
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r10.classFileLocator
                    net.bytebuddy.build.Plugin$Engine$Listener r5 = r10.listener
                    net.bytebuddy.build.Plugin$Engine$ErrorHandler$Compound r6 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Compound
                    r6.<init>(r11)
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r7 = r10.dispatcherFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r8 = r10.ignoredTypeMatcher
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.build.Plugin.Engine
            public net.bytebuddy.build.Plugin.Engine withoutErrorHandlers() {
                    r10 = this;
                    net.bytebuddy.build.Plugin$Engine$Default r9 = new net.bytebuddy.build.Plugin$Engine$Default
                    net.bytebuddy.ByteBuddy r1 = r10.byteBuddy
                    net.bytebuddy.build.Plugin$Engine$TypeStrategy r2 = r10.typeStrategy
                    net.bytebuddy.build.Plugin$Engine$PoolStrategy r3 = r10.poolStrategy
                    net.bytebuddy.dynamic.ClassFileLocator r4 = r10.classFileLocator
                    net.bytebuddy.build.Plugin$Engine$Listener r5 = r10.listener
                    net.bytebuddy.build.Plugin$Engine$Listener$NoOp r6 = net.bytebuddy.build.Plugin.Engine.Listener.NoOp.INSTANCE
                    net.bytebuddy.build.Plugin$Engine$Dispatcher$Factory r7 = r10.dispatcherFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.type.TypeDescription> r8 = r10.ignoredTypeMatcher
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }
        }

        public interface Dispatcher extends java.io.Closeable {

            public interface Factory {
                net.bytebuddy.build.Plugin.Engine.Dispatcher make(net.bytebuddy.build.Plugin.Engine.Target.Sink r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3, java.util.List<java.lang.String> r4);
            }

            public static class ForParallelTransformation implements net.bytebuddy.build.Plugin.Engine.Dispatcher {
                private int deferred;
                private final java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> failed;
                private final java.util.Set<java.util.concurrent.Future<?>> futures;
                private final java.util.concurrent.CompletionService<net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable> materializers;
                private final java.util.concurrent.CompletionService<java.util.concurrent.Callable<net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable>> preprocessings;
                private final net.bytebuddy.build.Plugin.Engine.Target.Sink sink;
                private final java.util.List<net.bytebuddy.description.type.TypeDescription> transformed;
                private final java.util.List<java.lang.String> unresolved;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class EagerWork implements java.util.concurrent.Callable<net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable> {
                    private final java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable>> work;

                    public EagerWork(java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable>> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.work = r1
                            return
                    }

                    @Override // java.util.concurrent.Callable
                    public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable call() throws java.lang.Exception {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable r0 = r1.call2()
                            return r0
                    }

                    @Override // java.util.concurrent.Callable
                    /* JADX INFO: renamed from: call, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable call2() throws java.lang.Exception {
                            r1 = this;
                            java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>> r0 = r1.work
                            java.lang.Object r0 = r0.call()
                            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                            java.lang.Object r0 = r0.call()
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable r0 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable) r0
                            return r0
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>> r2 = r4.work
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$EagerWork r5 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.EagerWork) r5
                            java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>> r5 = r5.work
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>> r1 = r2.work
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Factory implements net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory {
                    private final java.util.concurrent.Executor executor;

                    public Factory(java.util.concurrent.Executor r1) {
                            r0 = this;
                            r0.<init>()
                            r0.executor = r1
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.util.concurrent.Executor r2 = r4.executor
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$Factory r5 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.Factory) r5
                            java.util.concurrent.Executor r5 = r5.executor
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.util.concurrent.Executor r1 = r2.executor
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory
                    public net.bytebuddy.build.Plugin.Engine.Dispatcher make(net.bytebuddy.build.Plugin.Engine.Target.Sink r8, java.util.List<net.bytebuddy.description.type.TypeDescription> r9, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r10, java.util.List<java.lang.String> r11) {
                            r7 = this;
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation r6 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation
                            java.util.concurrent.Executor r1 = r7.executor
                            r0 = r6
                            r2 = r8
                            r3 = r9
                            r4 = r10
                            r5 = r11
                            r0.<init>(r1, r2, r3, r4, r5)
                            return r6
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithThrowawayExecutorService extends net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation {
                    private final java.util.concurrent.ExecutorService executorService;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory {
                        private final int threads;

                        public Factory(int r1) {
                                r0 = this;
                                r0.<init>()
                                r0.threads = r1
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                int r2 = r4.threads
                                net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService$Factory r5 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService.Factory) r5
                                int r5 = r5.threads
                                if (r2 == r5) goto L1c
                                return r1
                            L1c:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                int r1 = r2.threads
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory
                        public net.bytebuddy.build.Plugin.Engine.Dispatcher make(net.bytebuddy.build.Plugin.Engine.Target.Sink r8, java.util.List<net.bytebuddy.description.type.TypeDescription> r9, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r10, java.util.List<java.lang.String> r11) {
                                r7 = this;
                                net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService r6 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService
                                int r0 = r7.threads
                                java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r0)
                                r0 = r6
                                r2 = r8
                                r3 = r9
                                r4 = r10
                                r5 = r11
                                r0.<init>(r1, r2, r3, r4, r5)
                                return r6
                        }
                    }

                    public WithThrowawayExecutorService(java.util.concurrent.ExecutorService r1, net.bytebuddy.build.Plugin.Engine.Target.Sink r2, java.util.List<net.bytebuddy.description.type.TypeDescription> r3, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r4, java.util.List<java.lang.String> r5) {
                            r0 = this;
                            r0.<init>(r1, r2, r3, r4, r5)
                            r0.executorService = r1
                            return
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                            r2 = this;
                            super.close()     // Catch: java.lang.Throwable -> L9
                            java.util.concurrent.ExecutorService r0 = r2.executorService
                            r0.shutdown()
                            return
                        L9:
                            r0 = move-exception
                            java.util.concurrent.ExecutorService r1 = r2.executorService
                            r1.shutdown()
                            throw r0
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.util.concurrent.ExecutorService r2 = r4.executorService
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService r5 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.ForParallelTransformation.WithThrowawayExecutorService) r5
                            java.util.concurrent.ExecutorService r5 = r5.executorService
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.util.concurrent.ExecutorService r1 = r2.executorService
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                public ForParallelTransformation(java.util.concurrent.Executor r1, net.bytebuddy.build.Plugin.Engine.Target.Sink r2, java.util.List<net.bytebuddy.description.type.TypeDescription> r3, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r4, java.util.List<java.lang.String> r5) {
                        r0 = this;
                        r0.<init>()
                        r0.sink = r2
                        r0.transformed = r3
                        r0.failed = r4
                        r0.unresolved = r5
                        java.util.concurrent.ExecutorCompletionService r2 = new java.util.concurrent.ExecutorCompletionService
                        r2.<init>(r1)
                        r0.preprocessings = r2
                        java.util.concurrent.ExecutorCompletionService r2 = new java.util.concurrent.ExecutorCompletionService
                        r2.<init>(r1)
                        r0.materializers = r2
                        java.util.HashSet r1 = new java.util.HashSet
                        r1.<init>()
                        r0.futures = r1
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher
                public void accept(java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable>> r3, boolean r4) {
                        r2 = this;
                        if (r4 == 0) goto L13
                        java.util.Set<java.util.concurrent.Future<?>> r4 = r2.futures
                        java.util.concurrent.CompletionService<net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable> r0 = r2.materializers
                        net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$EagerWork r1 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$ForParallelTransformation$EagerWork
                        r1.<init>(r3)
                        java.util.concurrent.Future r3 = r0.submit(r1)
                        r4.add(r3)
                        goto L24
                    L13:
                        int r4 = r2.deferred
                        int r4 = r4 + 1
                        r2.deferred = r4
                        java.util.Set<java.util.concurrent.Future<?>> r4 = r2.futures
                        java.util.concurrent.CompletionService<java.util.concurrent.Callable<net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>> r0 = r2.preprocessings
                        java.util.concurrent.Future r3 = r0.submit(r3)
                        r4.add(r3)
                    L24:
                        return
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                        r3 = this;
                        java.util.Set<java.util.concurrent.Future<?>> r0 = r3.futures
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L17
                        java.lang.Object r1 = r0.next()
                        java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
                        r2 = 1
                        r1.cancel(r2)
                        goto L6
                    L17:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher
                public void complete() throws java.io.IOException {
                        r5 = this;
                        java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        int r1 = r5.deferred     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        r0.<init>(r1)     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                    L7:
                        int r1 = r5.deferred     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        int r2 = r1 + (-1)
                        r5.deferred = r2     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        if (r1 <= 0) goto L26
                        java.util.concurrent.CompletionService<java.util.concurrent.Callable<net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>> r1 = r5.preprocessings     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.concurrent.Future r1 = r1.take()     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.Set<java.util.concurrent.Future<?>> r2 = r5.futures     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        r2.remove(r1)     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.lang.Object r1 = r1.get()     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        r0.add(r1)     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        goto L7
                    L22:
                        r0 = move-exception
                        goto L68
                    L24:
                        r0 = move-exception
                        goto L87
                    L26:
                        java.util.Iterator r0 = r0.iterator()     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                    L2a:
                        boolean r1 = r0.hasNext()     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        if (r1 == 0) goto L42
                        java.lang.Object r1 = r0.next()     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.Set<java.util.concurrent.Future<?>> r2 = r5.futures     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.concurrent.CompletionService<net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable> r3 = r5.materializers     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.concurrent.Future r1 = r3.submit(r1)     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        r2.add(r1)     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        goto L2a
                    L42:
                        java.util.Set<java.util.concurrent.Future<?>> r0 = r5.futures     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        boolean r0 = r0.isEmpty()     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        if (r0 != 0) goto L67
                        java.util.concurrent.CompletionService<net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable> r0 = r5.materializers     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.concurrent.Future r0 = r0.take()     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.Set<java.util.concurrent.Future<?>> r1 = r5.futures     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        r1.remove(r0)     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.lang.Object r0 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable r0 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable) r0     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        net.bytebuddy.build.Plugin$Engine$Target$Sink r1 = r5.sink     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r5.transformed     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3 = r5.failed     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        java.util.List<java.lang.String> r4 = r5.unresolved     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        r0.materialize(r1, r2, r3, r4)     // Catch: java.util.concurrent.ExecutionException -> L22 java.lang.InterruptedException -> L24
                        goto L42
                    L67:
                        return
                    L68:
                        java.lang.Throwable r0 = r0.getCause()
                        boolean r1 = r0 instanceof java.io.IOException
                        if (r1 != 0) goto L84
                        boolean r1 = r0 instanceof java.lang.RuntimeException
                        if (r1 != 0) goto L81
                        boolean r1 = r0 instanceof java.lang.Error
                        if (r1 == 0) goto L7b
                        java.lang.Error r0 = (java.lang.Error) r0
                        throw r0
                    L7b:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        r1.<init>(r0)
                        throw r1
                    L81:
                        java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                        throw r0
                    L84:
                        java.io.IOException r0 = (java.io.IOException) r0
                        throw r0
                    L87:
                        java.lang.Thread r1 = java.lang.Thread.currentThread()
                        r1.interrupt()
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        r1.<init>(r0)
                        throw r1
                }
            }

            public static class ForSerialTransformation implements net.bytebuddy.build.Plugin.Engine.Dispatcher {
                private final java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> failed;
                private final java.util.List<java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable>> preprocessings;
                private final net.bytebuddy.build.Plugin.Engine.Target.Sink sink;
                private final java.util.List<net.bytebuddy.description.type.TypeDescription> transformed;
                private final java.util.List<java.lang.String> unresolved;

                public enum Factory extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory> implements net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory {
                    private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory[] $VALUES = null;
                    public static final net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory INSTANCE = null;

                    static {
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation$Factory r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation$Factory
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory.INSTANCE = r0
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation$Factory[] r0 = new net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory[]{r0}
                            net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory.$VALUES = r0
                            return
                    }

                    Factory(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation$Factory> r0 = net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation$Factory r1 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory) r1
                            return r1
                    }

                    public static net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory[] values() {
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation$Factory[] r0 = net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation$Factory[] r0 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.ForSerialTransformation.Factory[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory
                    public net.bytebuddy.build.Plugin.Engine.Dispatcher make(net.bytebuddy.build.Plugin.Engine.Target.Sink r2, java.util.List<net.bytebuddy.description.type.TypeDescription> r3, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r4, java.util.List<java.lang.String> r5) {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation r0 = new net.bytebuddy.build.Plugin$Engine$Dispatcher$ForSerialTransformation
                            r0.<init>(r2, r3, r4, r5)
                            return r0
                    }
                }

                public ForSerialTransformation(net.bytebuddy.build.Plugin.Engine.Target.Sink r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3, java.util.List<java.lang.String> r4) {
                        r0 = this;
                        r0.<init>()
                        r0.sink = r1
                        r0.transformed = r2
                        r0.failed = r3
                        r0.unresolved = r4
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        r0.preprocessings = r1
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher
                public void accept(java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable>> r4, boolean r5) throws java.io.IOException {
                        r3 = this;
                        java.lang.Object r4 = r4.call()     // Catch: java.lang.Exception -> L1a
                        java.util.concurrent.Callable r4 = (java.util.concurrent.Callable) r4     // Catch: java.lang.Exception -> L1a
                        if (r5 == 0) goto L1c
                        java.lang.Object r4 = r4.call()     // Catch: java.lang.Exception -> L1a
                        net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable r4 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable) r4     // Catch: java.lang.Exception -> L1a
                        net.bytebuddy.build.Plugin$Engine$Target$Sink r5 = r3.sink     // Catch: java.lang.Exception -> L1a
                        java.util.List<net.bytebuddy.description.type.TypeDescription> r0 = r3.transformed     // Catch: java.lang.Exception -> L1a
                        java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r1 = r3.failed     // Catch: java.lang.Exception -> L1a
                        java.util.List<java.lang.String> r2 = r3.unresolved     // Catch: java.lang.Exception -> L1a
                        r4.materialize(r5, r0, r1, r2)     // Catch: java.lang.Exception -> L1a
                        goto L21
                    L1a:
                        r4 = move-exception
                        goto L22
                    L1c:
                        java.util.List<java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>> r5 = r3.preprocessings     // Catch: java.lang.Exception -> L1a
                        r5.add(r4)     // Catch: java.lang.Exception -> L1a
                    L21:
                        return
                    L22:
                        boolean r5 = r4 instanceof java.io.IOException
                        if (r5 != 0) goto L33
                        boolean r5 = r4 instanceof java.lang.RuntimeException
                        if (r5 == 0) goto L2d
                        java.lang.RuntimeException r4 = (java.lang.RuntimeException) r4
                        throw r4
                    L2d:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        r5.<init>(r4)
                        throw r5
                    L33:
                        java.io.IOException r4 = (java.io.IOException) r4
                        throw r4
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher
                public void complete() throws java.io.IOException {
                        r6 = this;
                        java.util.List<java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable>> r0 = r6.preprocessings
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L4e
                        java.lang.Object r1 = r0.next()
                        java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
                        boolean r2 = java.lang.Thread.interrupted()
                        if (r2 != 0) goto L3f
                        java.lang.Object r1 = r1.call()     // Catch: java.lang.Exception -> L2a
                        net.bytebuddy.build.Plugin$Engine$Dispatcher$Materializable r1 = (net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable) r1     // Catch: java.lang.Exception -> L2a
                        net.bytebuddy.build.Plugin$Engine$Target$Sink r2 = r6.sink     // Catch: java.lang.Exception -> L2a
                        java.util.List<net.bytebuddy.description.type.TypeDescription> r3 = r6.transformed     // Catch: java.lang.Exception -> L2a
                        java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r4 = r6.failed     // Catch: java.lang.Exception -> L2a
                        java.util.List<java.lang.String> r5 = r6.unresolved     // Catch: java.lang.Exception -> L2a
                        r1.materialize(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L2a
                        goto L6
                    L2a:
                        r0 = move-exception
                        boolean r1 = r0 instanceof java.io.IOException
                        if (r1 != 0) goto L3c
                        boolean r1 = r0 instanceof java.lang.RuntimeException
                        if (r1 == 0) goto L36
                        java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                        throw r0
                    L36:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        r1.<init>(r0)
                        throw r1
                    L3c:
                        java.io.IOException r0 = (java.io.IOException) r0
                        throw r0
                    L3f:
                        java.lang.Thread r0 = java.lang.Thread.currentThread()
                        r0.interrupt()
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Interrupted during plugin engine completion"
                        r0.<init>(r1)
                        throw r0
                    L4e:
                        return
                }
            }

            public interface Materializable {

                public static class ForFailedElement implements net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable {
                    private final net.bytebuddy.build.Plugin.Engine.Source.Element element;
                    private final java.util.List<java.lang.Throwable> errored;
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public ForFailedElement(net.bytebuddy.build.Plugin.Engine.Source.Element r1, net.bytebuddy.description.type.TypeDescription r2, java.util.List<java.lang.Throwable> r3) {
                            r0 = this;
                            r0.<init>()
                            r0.element = r1
                            r0.typeDescription = r2
                            r0.errored = r3
                            return
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable
                    public void materialize(net.bytebuddy.build.Plugin.Engine.Target.Sink r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3, java.util.List<java.lang.String> r4) throws java.io.IOException {
                            r0 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Element r2 = r0.element
                            r1.retain(r2)
                            net.bytebuddy.description.type.TypeDescription r1 = r0.typeDescription
                            java.util.List<java.lang.Throwable> r2 = r0.errored
                            r3.put(r1, r2)
                            return
                    }
                }

                public static class ForRetainedElement implements net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable {
                    private final net.bytebuddy.build.Plugin.Engine.Source.Element element;

                    public ForRetainedElement(net.bytebuddy.build.Plugin.Engine.Source.Element r1) {
                            r0 = this;
                            r0.<init>()
                            r0.element = r1
                            return
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable
                    public void materialize(net.bytebuddy.build.Plugin.Engine.Target.Sink r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3, java.util.List<java.lang.String> r4) throws java.io.IOException {
                            r0 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Element r2 = r0.element
                            r1.retain(r2)
                            return
                    }
                }

                public static class ForTransformedElement implements net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable {
                    private final net.bytebuddy.dynamic.DynamicType dynamicType;

                    public ForTransformedElement(net.bytebuddy.dynamic.DynamicType r1) {
                            r0 = this;
                            r0.<init>()
                            r0.dynamicType = r1
                            return
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable
                    public void materialize(net.bytebuddy.build.Plugin.Engine.Target.Sink r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3, java.util.List<java.lang.String> r4) throws java.io.IOException {
                            r0 = this;
                            net.bytebuddy.dynamic.DynamicType r3 = r0.dynamicType
                            java.util.Map r3 = r3.getAllTypes()
                            r1.store(r3)
                            net.bytebuddy.dynamic.DynamicType r1 = r0.dynamicType
                            net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeDescription()
                            r2.add(r1)
                            return
                    }
                }

                public static class ForUnresolvedElement implements net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable {
                    private final net.bytebuddy.build.Plugin.Engine.Source.Element element;
                    private final java.lang.String typeName;

                    public ForUnresolvedElement(net.bytebuddy.build.Plugin.Engine.Source.Element r1, java.lang.String r2) {
                            r0 = this;
                            r0.<init>()
                            r0.element = r1
                            r0.typeName = r2
                            return
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable
                    public void materialize(net.bytebuddy.build.Plugin.Engine.Target.Sink r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3, java.util.List<java.lang.String> r4) throws java.io.IOException {
                            r0 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Element r2 = r0.element
                            r1.retain(r2)
                            java.lang.String r1 = r0.typeName
                            r4.add(r1)
                            return
                    }
                }

                void materialize(net.bytebuddy.build.Plugin.Engine.Target.Sink r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3, java.util.List<java.lang.String> r4) throws java.io.IOException;
            }

            void accept(java.util.concurrent.Callable<? extends java.util.concurrent.Callable<? extends net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable>> r1, boolean r2) throws java.io.IOException;

            void complete() throws java.io.IOException;
        }

        public interface ErrorHandler {

            public static class Compound implements net.bytebuddy.build.Plugin.Engine.ErrorHandler {
                private final java.util.List<net.bytebuddy.build.Plugin.Engine.ErrorHandler> errorHandlers;

                public Compound(java.util.List<? extends net.bytebuddy.build.Plugin.Engine.ErrorHandler> r3) {
                        r2 = this;
                        r2.<init>()
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        r2.errorHandlers = r0
                        java.util.Iterator r3 = r3.iterator()
                    Le:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L32
                        java.lang.Object r0 = r3.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r0
                        boolean r1 = r0 instanceof net.bytebuddy.build.Plugin.Engine.ErrorHandler.Compound
                        if (r1 == 0) goto L28
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r1 = r2.errorHandlers
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Compound r0 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler.Compound) r0
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r0.errorHandlers
                        r1.addAll(r0)
                        goto Le
                    L28:
                        boolean r1 = r0 instanceof net.bytebuddy.build.Plugin.Engine.Listener.NoOp
                        if (r1 != 0) goto Le
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r1 = r2.errorHandlers
                        r1.add(r0)
                        goto Le
                    L32:
                        return
                }

                public Compound(net.bytebuddy.build.Plugin.Engine.ErrorHandler... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        r0.<init>(r1)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r2.errorHandlers
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r1
                        r1.onError(r3)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r3, java.lang.Throwable r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r2.errorHandlers
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r1
                        r1.onError(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r3, java.util.List<java.lang.Throwable> r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r2.errorHandlers
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r1
                        r1.onError(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.build.Plugin r4, java.lang.Throwable r5) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r2.errorHandlers
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r1
                        r1.onError(r3, r4, r5)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.TypeDescription r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r2.errorHandlers
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r1
                        r1.onLiveInitializer(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r2.errorHandlers
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r1
                        r1.onManifest(r3)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(java.lang.String r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r2.errorHandlers
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r1
                        r1.onResource(r3)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(java.lang.String r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$ErrorHandler> r0 = r2.errorHandlers
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler) r1
                        r1.onUnresolved(r3)
                        goto L6
                    L16:
                        return
                }
            }

            public enum Enforcing extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing> implements net.bytebuddy.build.Plugin.Engine.ErrorHandler {
                private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing[] $VALUES = null;
                public static final net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing ALL_TYPES_RESOLVED = null;
                public static final net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing CLASS_FILES_ONLY = null;
                public static final net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing MANIFEST_REQUIRED = null;
                public static final net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing NO_LIVE_INITIALIZERS = null;





                static {
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing$1 r0 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing$1
                        java.lang.String r1 = "ALL_TYPES_RESOLVED"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.ALL_TYPES_RESOLVED = r0
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing$2 r1 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing$2
                        java.lang.String r3 = "NO_LIVE_INITIALIZERS"
                        r4 = 1
                        r1.<init>(r3, r4)
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.NO_LIVE_INITIALIZERS = r1
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing$3 r3 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing$3
                        java.lang.String r5 = "CLASS_FILES_ONLY"
                        r6 = 2
                        r3.<init>(r5, r6)
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.CLASS_FILES_ONLY = r3
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing$4 r5 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing$4
                        java.lang.String r7 = "MANIFEST_REQUIRED"
                        r8 = 3
                        r5.<init>(r7, r8)
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.MANIFEST_REQUIRED = r5
                        r7 = 4
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing[] r7 = new net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing[r7]
                        r7[r2] = r0
                        r7[r4] = r1
                        r7[r6] = r3
                        r7[r8] = r5
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.$VALUES = r7
                        return
                }

                Enforcing(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                /* synthetic */ Enforcing(java.lang.String r1, int r2, net.bytebuddy.build.Plugin.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing> r0 = net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing) r1
                        return r1
                }

                public static net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing[] values() {
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing[] r0 = net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Enforcing[] r0 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler.Enforcing[]) r0
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r1, java.lang.Throwable r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r1, java.util.List<java.lang.Throwable> r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2, java.lang.Throwable r3) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(java.lang.String r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(java.lang.String r1) {
                        r0 = this;
                        return
                }
            }

            public enum Failing extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing> implements net.bytebuddy.build.Plugin.Engine.ErrorHandler {
                private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing[] $VALUES = null;
                public static final net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing FAIL_AFTER_TYPE = null;
                public static final net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing FAIL_FAST = null;
                public static final net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing FAIL_LAST = null;




                static {
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing$1 r0 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing$1
                        java.lang.String r1 = "FAIL_FAST"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.FAIL_FAST = r0
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing$2 r1 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing$2
                        java.lang.String r3 = "FAIL_AFTER_TYPE"
                        r4 = 1
                        r1.<init>(r3, r4)
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.FAIL_AFTER_TYPE = r1
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing$3 r3 = new net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing$3
                        java.lang.String r5 = "FAIL_LAST"
                        r6 = 2
                        r3.<init>(r5, r6)
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.FAIL_LAST = r3
                        r5 = 3
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing[] r5 = new net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing[r5]
                        r5[r2] = r0
                        r5[r4] = r1
                        r5[r6] = r3
                        net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.$VALUES = r5
                        return
                }

                Failing(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                /* synthetic */ Failing(java.lang.String r1, int r2, net.bytebuddy.build.Plugin.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing> r0 = net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing r1 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing) r1
                        return r1
                }

                public static net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing[] values() {
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing[] r0 = net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler$Failing[] r0 = (net.bytebuddy.build.Plugin.Engine.ErrorHandler.Failing[]) r0
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r4, java.lang.Throwable r5) {
                        r3 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Failed to close plugin "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4, r5)
                        throw r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(java.util.jar.Manifest r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(java.lang.String r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(java.lang.String r1) {
                        r0 = this;
                        return
                }
            }

            void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r1);

            void onError(net.bytebuddy.build.Plugin r1, java.lang.Throwable r2);

            void onError(net.bytebuddy.description.type.TypeDescription r1, java.util.List<java.lang.Throwable> r2);

            void onError(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2, java.lang.Throwable r3);

            void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2);

            void onManifest(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r1);

            void onResource(java.lang.String r1);

            void onUnresolved(java.lang.String r1);
        }

        public interface Listener extends net.bytebuddy.build.Plugin.Engine.ErrorHandler {

            public static abstract class Adapter implements net.bytebuddy.build.Plugin.Engine.Listener {
                public Adapter() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onComplete(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onDiscovery(java.lang.String r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r1, java.lang.Throwable r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r1, java.util.List<java.lang.Throwable> r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2, java.lang.Throwable r3) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.build.Plugin> r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(java.lang.String r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.build.Plugin> r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(java.lang.String r1) {
                        r0 = this;
                        return
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements net.bytebuddy.build.Plugin.Engine.Listener {
                private final java.util.List<net.bytebuddy.build.Plugin.Engine.Listener> listeners;

                public Compound(java.util.List<? extends net.bytebuddy.build.Plugin.Engine.Listener> r3) {
                        r2 = this;
                        r2.<init>()
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        r2.listeners = r0
                        java.util.Iterator r3 = r3.iterator()
                    Le:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L32
                        java.lang.Object r0 = r3.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = (net.bytebuddy.build.Plugin.Engine.Listener) r0
                        boolean r1 = r0 instanceof net.bytebuddy.build.Plugin.Engine.Listener.Compound
                        if (r1 == 0) goto L28
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r1 = r2.listeners
                        net.bytebuddy.build.Plugin$Engine$Listener$Compound r0 = (net.bytebuddy.build.Plugin.Engine.Listener.Compound) r0
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r0.listeners
                        r1.addAll(r0)
                        goto Le
                    L28:
                        boolean r1 = r0 instanceof net.bytebuddy.build.Plugin.Engine.Listener.NoOp
                        if (r1 != 0) goto Le
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r1 = r2.listeners
                        r1.add(r0)
                        goto Le
                    L32:
                        return
                }

                public Compound(net.bytebuddy.build.Plugin.Engine.Listener... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        r0.<init>(r1)
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r2 = r4.listeners
                        net.bytebuddy.build.Plugin$Engine$Listener$Compound r5 = (net.bytebuddy.build.Plugin.Engine.Listener.Compound) r5
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r5 = r5.listeners
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r1 = r2.listeners
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onComplete(net.bytebuddy.description.type.TypeDescription r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onComplete(r3)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onDiscovery(java.lang.String r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onDiscovery(r3)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onError(r3)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r3, java.lang.Throwable r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onError(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r3, java.util.List<java.lang.Throwable> r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onError(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.build.Plugin r4, java.lang.Throwable r5) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onError(r3, r4, r5)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(net.bytebuddy.description.type.TypeDescription r3, java.util.List<net.bytebuddy.build.Plugin> r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onIgnored(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.build.Plugin r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onIgnored(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.TypeDescription r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onLiveInitializer(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onManifest(r3)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(java.lang.String r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onResource(r3)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r3, java.util.List<net.bytebuddy.build.Plugin> r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onTransformation(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.build.Plugin r4) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onTransformation(r3, r4)
                        goto L6
                    L16:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(java.lang.String r3) {
                        r2 = this;
                        java.util.List<net.bytebuddy.build.Plugin$Engine$Listener> r0 = r2.listeners
                        java.util.Iterator r0 = r0.iterator()
                    L6:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L16
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = (net.bytebuddy.build.Plugin.Engine.Listener) r1
                        r1.onUnresolved(r3)
                        goto L6
                    L16:
                        return
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForErrorHandler extends net.bytebuddy.build.Plugin.Engine.Listener.Adapter {
                private final net.bytebuddy.build.Plugin.Engine.ErrorHandler errorHandler;

                public ForErrorHandler(net.bytebuddy.build.Plugin.Engine.ErrorHandler r1) {
                        r0 = this;
                        r0.<init>()
                        r0.errorHandler = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r2 = r4.errorHandler
                        net.bytebuddy.build.Plugin$Engine$Listener$ForErrorHandler r5 = (net.bytebuddy.build.Plugin.Engine.Listener.ForErrorHandler) r5
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r5 = r5.errorHandler
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r1 = r2.errorHandler
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r2) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = r1.errorHandler
                        r0.onError(r2)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r2, java.lang.Throwable r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = r1.errorHandler
                        r0.onError(r2, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r2, java.util.List<java.lang.Throwable> r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = r1.errorHandler
                        r0.onError(r2, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.build.Plugin r3, java.lang.Throwable r4) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = r1.errorHandler
                        r0.onError(r2, r3, r4)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.type.TypeDescription r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = r1.errorHandler
                        r0.onLiveInitializer(r2, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r2) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = r1.errorHandler
                        r0.onManifest(r2)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(java.lang.String r2) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = r1.errorHandler
                        r0.onResource(r2)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(java.lang.String r2) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$ErrorHandler r0 = r1.errorHandler
                        r0.onUnresolved(r2)
                        return
                }
            }

            public enum NoOp extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.Listener.NoOp> implements net.bytebuddy.build.Plugin.Engine.Listener {
                private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Listener.NoOp[] $VALUES = null;
                public static final net.bytebuddy.build.Plugin.Engine.Listener.NoOp INSTANCE = null;

                static {
                        net.bytebuddy.build.Plugin$Engine$Listener$NoOp r0 = new net.bytebuddy.build.Plugin$Engine$Listener$NoOp
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.build.Plugin.Engine.Listener.NoOp.INSTANCE = r0
                        net.bytebuddy.build.Plugin$Engine$Listener$NoOp[] r0 = new net.bytebuddy.build.Plugin.Engine.Listener.NoOp[]{r0}
                        net.bytebuddy.build.Plugin.Engine.Listener.NoOp.$VALUES = r0
                        return
                }

                NoOp(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.Listener.NoOp valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.build.Plugin$Engine$Listener$NoOp> r0 = net.bytebuddy.build.Plugin.Engine.Listener.NoOp.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.build.Plugin$Engine$Listener$NoOp r1 = (net.bytebuddy.build.Plugin.Engine.Listener.NoOp) r1
                        return r1
                }

                public static net.bytebuddy.build.Plugin.Engine.Listener.NoOp[] values() {
                        net.bytebuddy.build.Plugin$Engine$Listener$NoOp[] r0 = net.bytebuddy.build.Plugin.Engine.Listener.NoOp.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.build.Plugin$Engine$Listener$NoOp[] r0 = (net.bytebuddy.build.Plugin.Engine.Listener.NoOp[]) r0
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onComplete(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onDiscovery(java.lang.String r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r1, java.lang.Throwable r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r1, java.util.List<java.lang.Throwable> r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2, java.lang.Throwable r3) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.build.Plugin> r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(java.lang.String r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.build.Plugin> r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(java.lang.String r1) {
                        r0 = this;
                        return
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class StreamWriting extends net.bytebuddy.build.Plugin.Engine.Listener.Adapter {
                protected static final java.lang.String PREFIX = "[Byte Buddy]";
                private final java.io.PrintStream printStream;

                public StreamWriting(java.io.PrintStream r1) {
                        r0 = this;
                        r0.<init>()
                        r0.printStream = r1
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.Listener.StreamWriting toSystemError() {
                        net.bytebuddy.build.Plugin$Engine$Listener$StreamWriting r0 = new net.bytebuddy.build.Plugin$Engine$Listener$StreamWriting
                        java.io.PrintStream r1 = java.lang.System.err
                        r0.<init>(r1)
                        return r0
                }

                public static net.bytebuddy.build.Plugin.Engine.Listener.StreamWriting toSystemOut() {
                        net.bytebuddy.build.Plugin$Engine$Listener$StreamWriting r0 = new net.bytebuddy.build.Plugin$Engine$Listener$StreamWriting
                        java.io.PrintStream r1 = java.lang.System.out
                        r0.<init>(r1)
                        return r0
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.io.PrintStream r2 = r4.printStream
                        net.bytebuddy.build.Plugin$Engine$Listener$StreamWriting r5 = (net.bytebuddy.build.Plugin.Engine.Listener.StreamWriting) r5
                        java.io.PrintStream r5 = r5.printStream
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.io.PrintStream r1 = r2.printStream
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onComplete(net.bytebuddy.description.type.TypeDescription r3) {
                        r2 = this;
                        java.io.PrintStream r0 = r2.printStream
                        java.lang.String r1 = "[Byte Buddy] COMPLETE %s"
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}
                        r0.printf(r1, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onDiscovery(java.lang.String r3) {
                        r2 = this;
                        java.io.PrintStream r0 = r2.printStream
                        java.lang.String r1 = "[Byte Buddy] DISCOVERY %s"
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}
                        r0.printf(r1, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r4, java.lang.Throwable r5) {
                        r3 = this;
                        java.io.PrintStream r0 = r3.printStream
                        monitor-enter(r0)
                        java.io.PrintStream r1 = r3.printStream     // Catch: java.lang.Throwable -> L15
                        java.lang.String r2 = "[Byte Buddy] ERROR %s"
                        java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L15
                        r1.printf(r2, r4)     // Catch: java.lang.Throwable -> L15
                        java.io.PrintStream r4 = r3.printStream     // Catch: java.lang.Throwable -> L15
                        r5.printStackTrace(r4)     // Catch: java.lang.Throwable -> L15
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                        return
                    L15:
                        r4 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                        throw r4
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.build.Plugin r5, java.lang.Throwable r6) {
                        r3 = this;
                        java.io.PrintStream r0 = r3.printStream
                        monitor-enter(r0)
                        java.io.PrintStream r1 = r3.printStream     // Catch: java.lang.Throwable -> L15
                        java.lang.String r2 = "[Byte Buddy] ERROR %s for %s"
                        java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L15
                        r1.printf(r2, r4)     // Catch: java.lang.Throwable -> L15
                        java.io.PrintStream r4 = r3.printStream     // Catch: java.lang.Throwable -> L15
                        r6.printStackTrace(r4)     // Catch: java.lang.Throwable -> L15
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                        return
                    L15:
                        r4 = move-exception
                        monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                        throw r4
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onIgnored(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.build.Plugin r4) {
                        r2 = this;
                        java.io.PrintStream r0 = r2.printStream
                        java.lang.String r1 = "[Byte Buddy] IGNORE %s for %s"
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
                        r0.printf(r1, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onLiveInitializer(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.TypeDescription r4) {
                        r2 = this;
                        java.io.PrintStream r0 = r2.printStream
                        java.lang.String r1 = "[Byte Buddy] LIVE %s on %s"
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
                        r0.printf(r1, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onManifest(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r3) {
                        r2 = this;
                        java.io.PrintStream r0 = r2.printStream
                        if (r3 == 0) goto L6
                        r3 = 1
                        goto L7
                    L6:
                        r3 = 0
                    L7:
                        java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}
                        java.lang.String r1 = "[Byte Buddy] MANIFEST %b"
                        r0.printf(r1, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onResource(java.lang.String r3) {
                        r2 = this;
                        java.io.PrintStream r0 = r2.printStream
                        java.lang.String r1 = "[Byte Buddy] RESOURCE %s"
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}
                        r0.printf(r1, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.build.Plugin r4) {
                        r2 = this;
                        java.io.PrintStream r0 = r2.printStream
                        java.lang.String r1 = "[Byte Buddy] TRANSFORM %s for %s"
                        java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
                        r0.printf(r1, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onUnresolved(java.lang.String r3) {
                        r2 = this;
                        java.io.PrintStream r0 = r2.printStream
                        java.lang.String r1 = "[Byte Buddy] UNRESOLVED %s"
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}
                        r0.printf(r1, r3)
                        return
                }

                public net.bytebuddy.build.Plugin.Engine.Listener withErrorsOnly() {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener$WithErrorsOnly r0 = new net.bytebuddy.build.Plugin$Engine$Listener$WithErrorsOnly
                        r0.<init>(r1)
                        return r0
                }

                public net.bytebuddy.build.Plugin.Engine.Listener withTransformationsOnly() {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener$WithTransformationsOnly r0 = new net.bytebuddy.build.Plugin$Engine$Listener$WithTransformationsOnly
                        r0.<init>(r1)
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class WithErrorsOnly extends net.bytebuddy.build.Plugin.Engine.Listener.Adapter {
                private final net.bytebuddy.build.Plugin.Engine.Listener delegate;

                public WithErrorsOnly(net.bytebuddy.build.Plugin.Engine.Listener r1) {
                        r0 = this;
                        r0.<init>()
                        r0.delegate = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        net.bytebuddy.build.Plugin$Engine$Listener r2 = r4.delegate
                        net.bytebuddy.build.Plugin$Engine$Listener$WithErrorsOnly r5 = (net.bytebuddy.build.Plugin.Engine.Listener.WithErrorsOnly) r5
                        net.bytebuddy.build.Plugin$Engine$Listener r5 = r5.delegate
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = r2.delegate
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r2) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onError(r2)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r2, java.lang.Throwable r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onError(r2, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r2, java.util.List<java.lang.Throwable> r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onError(r2, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.build.Plugin r3, java.lang.Throwable r4) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onError(r2, r3, r4)
                        return
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class WithTransformationsOnly extends net.bytebuddy.build.Plugin.Engine.Listener.Adapter {
                private final net.bytebuddy.build.Plugin.Engine.Listener delegate;

                public WithTransformationsOnly(net.bytebuddy.build.Plugin.Engine.Listener r1) {
                        r0 = this;
                        r0.<init>()
                        r0.delegate = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        net.bytebuddy.build.Plugin$Engine$Listener r2 = r4.delegate
                        net.bytebuddy.build.Plugin$Engine$Listener$WithTransformationsOnly r5 = (net.bytebuddy.build.Plugin.Engine.Listener.WithTransformationsOnly) r5
                        net.bytebuddy.build.Plugin$Engine$Listener r5 = r5.delegate
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.build.Plugin$Engine$Listener r1 = r2.delegate
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r2) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onError(r2)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.build.Plugin r2, java.lang.Throwable r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onError(r2, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r2, java.util.List<java.lang.Throwable> r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onError(r2, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.ErrorHandler
                public void onError(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.build.Plugin r3, java.lang.Throwable r4) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onError(r2, r3, r4)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r2, java.util.List<net.bytebuddy.build.Plugin> r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onTransformation(r2, r3)
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Listener.Adapter, net.bytebuddy.build.Plugin.Engine.Listener
                public void onTransformation(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.build.Plugin r3) {
                        r1 = this;
                        net.bytebuddy.build.Plugin$Engine$Listener r0 = r1.delegate
                        r0.onTransformation(r2, r3)
                        return
                }
            }

            void onComplete(net.bytebuddy.description.type.TypeDescription r1);

            void onDiscovery(java.lang.String r1);

            void onIgnored(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.build.Plugin> r2);

            void onIgnored(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2);

            void onTransformation(net.bytebuddy.description.type.TypeDescription r1, java.util.List<net.bytebuddy.build.Plugin> r2);

            void onTransformation(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.build.Plugin r2);
        }

        public interface PoolStrategy {

            public enum Default extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default> implements net.bytebuddy.build.Plugin.Engine.PoolStrategy {
                private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default[] $VALUES = null;
                public static final net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default EXTENDED = null;
                public static final net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default FAST = null;
                private final net.bytebuddy.pool.TypePool.Default.ReaderMode readerMode;

                static {
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default r0 = new net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default
                        r1 = 0
                        net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = net.bytebuddy.pool.TypePool.Default.ReaderMode.FAST
                        java.lang.String r3 = "FAST"
                        r0.<init>(r3, r1, r2)
                        net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default.FAST = r0
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default r1 = new net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default
                        r2 = 1
                        net.bytebuddy.pool.TypePool$Default$ReaderMode r3 = net.bytebuddy.pool.TypePool.Default.ReaderMode.EXTENDED
                        java.lang.String r4 = "EXTENDED"
                        r1.<init>(r4, r2, r3)
                        net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default.EXTENDED = r1
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default[] r0 = new net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default[]{r0, r1}
                        net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default.$VALUES = r0
                        return
                }

                Default(java.lang.String r1, int r2, net.bytebuddy.pool.TypePool.Default.ReaderMode r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.readerMode = r3
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default> r0 = net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default r1 = (net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default) r1
                        return r1
                }

                public static net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default[] values() {
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default[] r0 = net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Default[] r0 = (net.bytebuddy.build.Plugin.Engine.PoolStrategy.Default[]) r0
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.PoolStrategy
                public net.bytebuddy.pool.TypePool typePool(net.bytebuddy.dynamic.ClassFileLocator r5) {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default$WithLazyResolution r0 = new net.bytebuddy.pool.TypePool$Default$WithLazyResolution
                        net.bytebuddy.pool.TypePool$CacheProvider$Simple r1 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                        r1.<init>()
                        net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = r4.readerMode
                        net.bytebuddy.pool.TypePool r3 = net.bytebuddy.pool.TypePool.ClassLoading.ofPlatformLoader()
                        r0.<init>(r1, r5, r2, r3)
                        return r0
                }
            }

            public enum Eager extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager> implements net.bytebuddy.build.Plugin.Engine.PoolStrategy {
                private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager[] $VALUES = null;
                public static final net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager EXTENDED = null;
                public static final net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager FAST = null;
                private final net.bytebuddy.pool.TypePool.Default.ReaderMode readerMode;

                static {
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager r0 = new net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager
                        r1 = 0
                        net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = net.bytebuddy.pool.TypePool.Default.ReaderMode.FAST
                        java.lang.String r3 = "FAST"
                        r0.<init>(r3, r1, r2)
                        net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager.FAST = r0
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager r1 = new net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager
                        r2 = 1
                        net.bytebuddy.pool.TypePool$Default$ReaderMode r3 = net.bytebuddy.pool.TypePool.Default.ReaderMode.EXTENDED
                        java.lang.String r4 = "EXTENDED"
                        r1.<init>(r4, r2, r3)
                        net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager.EXTENDED = r1
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager[] r0 = new net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager[]{r0, r1}
                        net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager.$VALUES = r0
                        return
                }

                Eager(java.lang.String r1, int r2, net.bytebuddy.pool.TypePool.Default.ReaderMode r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.readerMode = r3
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager> r0 = net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager r1 = (net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager) r1
                        return r1
                }

                public static net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager[] values() {
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager[] r0 = net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.build.Plugin$Engine$PoolStrategy$Eager[] r0 = (net.bytebuddy.build.Plugin.Engine.PoolStrategy.Eager[]) r0
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.PoolStrategy
                public net.bytebuddy.pool.TypePool typePool(net.bytebuddy.dynamic.ClassFileLocator r5) {
                        r4 = this;
                        net.bytebuddy.pool.TypePool$Default r0 = new net.bytebuddy.pool.TypePool$Default
                        net.bytebuddy.pool.TypePool$CacheProvider$Simple r1 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                        r1.<init>()
                        net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = r4.readerMode
                        net.bytebuddy.pool.TypePool r3 = net.bytebuddy.pool.TypePool.ClassLoading.ofPlatformLoader()
                        r0.<init>(r1, r5, r2, r3)
                        return r0
                }
            }

            net.bytebuddy.pool.TypePool typePool(net.bytebuddy.dynamic.ClassFileLocator r1);
        }

        public interface Source {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements net.bytebuddy.build.Plugin.Engine.Source {
                private final java.util.Collection<? extends net.bytebuddy.build.Plugin.Engine.Source> sources;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Origin implements net.bytebuddy.build.Plugin.Engine.Source.Origin {
                    private final java.util.List<net.bytebuddy.build.Plugin.Engine.Source.Origin> origins;

                    public static class CompoundIterator implements java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> {
                        private final java.util.List<? extends java.lang.Iterable<? extends net.bytebuddy.build.Plugin.Engine.Source.Element>> backlog;

                        @net.bytebuddy.utility.nullability.MaybeNull
                        private java.util.Iterator<? extends net.bytebuddy.build.Plugin.Engine.Source.Element> current;

                        public CompoundIterator(java.util.List<? extends java.lang.Iterable<? extends net.bytebuddy.build.Plugin.Engine.Source.Element>> r1) {
                                r0 = this;
                                r0.<init>()
                                r0.backlog = r1
                                r0.forward()
                                return
                        }

                        private void forward() {
                                r2 = this;
                            L0:
                                java.util.Iterator<? extends net.bytebuddy.build.Plugin$Engine$Source$Element> r0 = r2.current
                                if (r0 == 0) goto La
                                boolean r0 = r0.hasNext()
                                if (r0 != 0) goto L22
                            La:
                                java.util.List<? extends java.lang.Iterable<? extends net.bytebuddy.build.Plugin$Engine$Source$Element>> r0 = r2.backlog
                                boolean r0 = r0.isEmpty()
                                if (r0 != 0) goto L22
                                java.util.List<? extends java.lang.Iterable<? extends net.bytebuddy.build.Plugin$Engine$Source$Element>> r0 = r2.backlog
                                r1 = 0
                                java.lang.Object r0 = r0.remove(r1)
                                java.lang.Iterable r0 = (java.lang.Iterable) r0
                                java.util.Iterator r0 = r0.iterator()
                                r2.current = r0
                                goto L0
                            L22:
                                return
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                                r1 = this;
                                java.util.Iterator<? extends net.bytebuddy.build.Plugin$Engine$Source$Element> r0 = r1.current
                                if (r0 == 0) goto Lc
                                boolean r0 = r0.hasNext()
                                if (r0 == 0) goto Lc
                                r0 = 1
                                goto Ld
                            Lc:
                                r0 = 0
                            Ld:
                                return r0
                        }

                        @Override // java.util.Iterator
                        public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.Element next() {
                                r1 = this;
                                net.bytebuddy.build.Plugin$Engine$Source$Element r0 = r1.next2()
                                return r0
                        }

                        @Override // java.util.Iterator
                        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
                        public net.bytebuddy.build.Plugin.Engine.Source.Element next2() {
                                r1 = this;
                                java.util.Iterator<? extends net.bytebuddy.build.Plugin$Engine$Source$Element> r0 = r1.current     // Catch: java.lang.Throwable -> Le
                                if (r0 == 0) goto L10
                                java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> Le
                                net.bytebuddy.build.Plugin$Engine$Source$Element r0 = (net.bytebuddy.build.Plugin.Engine.Source.Element) r0     // Catch: java.lang.Throwable -> Le
                                r1.forward()
                                return r0
                            Le:
                                r0 = move-exception
                                goto L16
                            L10:
                                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> Le
                                r0.<init>()     // Catch: java.lang.Throwable -> Le
                                throw r0     // Catch: java.lang.Throwable -> Le
                            L16:
                                r1.forward()
                                throw r0
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                                r2 = this;
                                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                                java.lang.String r1 = "remove"
                                r0.<init>(r1)
                                throw r0
                        }
                    }

                    public Origin(java.util.List<net.bytebuddy.build.Plugin.Engine.Source.Origin> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.origins = r1
                            return
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws java.io.IOException {
                            r2 = this;
                            java.util.List<net.bytebuddy.build.Plugin$Engine$Source$Origin> r0 = r2.origins
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L16
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r1 = (net.bytebuddy.build.Plugin.Engine.Source.Origin) r1
                            r1.close()
                            goto L6
                        L16:
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.util.List<net.bytebuddy.build.Plugin$Engine$Source$Origin> r2 = r4.origins
                            net.bytebuddy.build.Plugin$Engine$Source$Compound$Origin r5 = (net.bytebuddy.build.Plugin.Engine.Source.Compound.Origin) r5
                            java.util.List<net.bytebuddy.build.Plugin$Engine$Source$Origin> r5 = r5.origins
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    public net.bytebuddy.dynamic.ClassFileLocator getClassFileLocator() {
                            r3 = this;
                            java.util.ArrayList r0 = new java.util.ArrayList
                            java.util.List<net.bytebuddy.build.Plugin$Engine$Source$Origin> r1 = r3.origins
                            int r1 = r1.size()
                            r0.<init>(r1)
                            java.util.List<net.bytebuddy.build.Plugin$Engine$Source$Origin> r1 = r3.origins
                            java.util.Iterator r1 = r1.iterator()
                        L11:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L25
                            java.lang.Object r2 = r1.next()
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r2 = (net.bytebuddy.build.Plugin.Engine.Source.Origin) r2
                            net.bytebuddy.dynamic.ClassFileLocator r2 = r2.getClassFileLocator()
                            r0.add(r2)
                            goto L11
                        L25:
                            net.bytebuddy.dynamic.ClassFileLocator$Compound r1 = new net.bytebuddy.dynamic.ClassFileLocator$Compound
                            r1.<init>(r0)
                            return r1
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    public java.util.jar.Manifest getManifest() throws java.io.IOException {
                            r2 = this;
                            java.util.List<net.bytebuddy.build.Plugin$Engine$Source$Origin> r0 = r2.origins
                            java.util.Iterator r0 = r0.iterator()
                        L6:
                            boolean r1 = r0.hasNext()
                            if (r1 == 0) goto L19
                            java.lang.Object r1 = r0.next()
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r1 = (net.bytebuddy.build.Plugin.Engine.Source.Origin) r1
                            java.util.jar.Manifest r1 = r1.getManifest()
                            if (r1 == 0) goto L6
                            return r1
                        L19:
                            java.util.jar.Manifest r0 = net.bytebuddy.build.Plugin.Engine.Source.Origin.NO_MANIFEST
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.util.List<net.bytebuddy.build.Plugin$Engine$Source$Origin> r1 = r2.origins
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // java.lang.Iterable
                    public java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> iterator() {
                            r2 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Compound$Origin$CompoundIterator r0 = new net.bytebuddy.build.Plugin$Engine$Source$Compound$Origin$CompoundIterator
                            java.util.List<net.bytebuddy.build.Plugin$Engine$Source$Origin> r1 = r2.origins
                            r0.<init>(r1)
                            return r0
                    }
                }

                public Compound(java.util.Collection<? extends net.bytebuddy.build.Plugin.Engine.Source> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.sources = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.util.Collection<? extends net.bytebuddy.build.Plugin$Engine$Source> r2 = r4.sources
                        net.bytebuddy.build.Plugin$Engine$Source$Compound r5 = (net.bytebuddy.build.Plugin.Engine.Source.Compound) r5
                        java.util.Collection<? extends net.bytebuddy.build.Plugin$Engine$Source> r5 = r5.sources
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.util.Collection<? extends net.bytebuddy.build.Plugin$Engine$Source> r1 = r2.sources
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public net.bytebuddy.build.Plugin.Engine.Source.Origin read() throws java.io.IOException {
                        r3 = this;
                        java.util.Collection<? extends net.bytebuddy.build.Plugin$Engine$Source> r0 = r3.sources
                        boolean r0 = r0.isEmpty()
                        if (r0 == 0) goto Lb
                        net.bytebuddy.build.Plugin$Engine$Source$Empty r0 = net.bytebuddy.build.Plugin.Engine.Source.Empty.INSTANCE
                        return r0
                    Lb:
                        java.util.ArrayList r0 = new java.util.ArrayList
                        java.util.Collection<? extends net.bytebuddy.build.Plugin$Engine$Source> r1 = r3.sources
                        int r1 = r1.size()
                        r0.<init>(r1)
                        java.util.Collection<? extends net.bytebuddy.build.Plugin$Engine$Source> r1 = r3.sources     // Catch: java.io.IOException -> L30
                        java.util.Iterator r1 = r1.iterator()     // Catch: java.io.IOException -> L30
                    L1c:
                        boolean r2 = r1.hasNext()     // Catch: java.io.IOException -> L30
                        if (r2 == 0) goto L32
                        java.lang.Object r2 = r1.next()     // Catch: java.io.IOException -> L30
                        net.bytebuddy.build.Plugin$Engine$Source r2 = (net.bytebuddy.build.Plugin.Engine.Source) r2     // Catch: java.io.IOException -> L30
                        net.bytebuddy.build.Plugin$Engine$Source$Origin r2 = r2.read()     // Catch: java.io.IOException -> L30
                        r0.add(r2)     // Catch: java.io.IOException -> L30
                        goto L1c
                    L30:
                        r1 = move-exception
                        goto L38
                    L32:
                        net.bytebuddy.build.Plugin$Engine$Source$Compound$Origin r1 = new net.bytebuddy.build.Plugin$Engine$Source$Compound$Origin
                        r1.<init>(r0)
                        return r1
                    L38:
                        java.util.Iterator r0 = r0.iterator()
                    L3c:
                        boolean r2 = r0.hasNext()
                        if (r2 == 0) goto L4c
                        java.lang.Object r2 = r0.next()
                        net.bytebuddy.build.Plugin$Engine$Source$Origin r2 = (net.bytebuddy.build.Plugin.Engine.Source.Origin) r2
                        r2.close()
                        goto L3c
                    L4c:
                        throw r1
                }
            }

            public interface Element {

                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForByteArray implements net.bytebuddy.build.Plugin.Engine.Source.Element {
                    private final byte[] binaryRepresentation;
                    private final java.lang.String name;

                    public ForByteArray(java.lang.String r1, byte[] r2) {
                            r0 = this;
                            r0.<init>()
                            r0.name = r1
                            r0.binaryRepresentation = r2
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.String r2 = r4.name
                            net.bytebuddy.build.Plugin$Engine$Source$Element$ForByteArray r5 = (net.bytebuddy.build.Plugin.Engine.Source.Element.ForByteArray) r5
                            java.lang.String r3 = r5.name
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            byte[] r2 = r4.binaryRepresentation
                            byte[] r5 = r5.binaryRepresentation
                            boolean r5 = java.util.Arrays.equals(r2, r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public java.io.InputStream getInputStream() {
                            r2 = this;
                            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                            byte[] r1 = r2.binaryRepresentation
                            r0.<init>(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public java.lang.String getName() {
                            r1 = this;
                            java.lang.String r0 = r1.name
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.name
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            byte[] r1 = r2.binaryRepresentation
                            int r1 = java.util.Arrays.hashCode(r1)
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    @net.bytebuddy.utility.nullability.AlwaysNull
                    public <T> T resolveAs(java.lang.Class<T> r1) {
                            r0 = this;
                            r1 = 0
                            return r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForFile implements net.bytebuddy.build.Plugin.Engine.Source.Element {
                    private final java.io.File file;
                    private final java.io.File root;

                    public ForFile(java.io.File r1, java.io.File r2) {
                            r0 = this;
                            r0.<init>()
                            r0.root = r1
                            r0.file = r2
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.io.File r2 = r4.root
                            net.bytebuddy.build.Plugin$Engine$Source$Element$ForFile r5 = (net.bytebuddy.build.Plugin.Engine.Source.Element.ForFile) r5
                            java.io.File r3 = r5.root
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            java.io.File r2 = r4.file
                            java.io.File r5 = r5.file
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public java.io.InputStream getInputStream() throws java.io.IOException {
                            r2 = this;
                            java.io.FileInputStream r0 = new java.io.FileInputStream
                            java.io.File r1 = r2.file
                            r0.<init>(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public java.lang.String getName() {
                            r2 = this;
                            java.io.File r0 = r2.root
                            java.io.File r0 = r0.getAbsoluteFile()
                            java.net.URI r0 = r0.toURI()
                            java.io.File r1 = r2.file
                            java.io.File r1 = r1.getAbsoluteFile()
                            java.net.URI r1 = r1.toURI()
                            java.net.URI r0 = r0.relativize(r1)
                            java.lang.String r0 = r0.getPath()
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.io.File r1 = r2.root
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.io.File r1 = r2.file
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public <T> T resolveAs(java.lang.Class<T> r2) {
                            r1 = this;
                            java.lang.Class<java.io.File> r0 = java.io.File.class
                            boolean r2 = r0.isAssignableFrom(r2)
                            if (r2 == 0) goto Lb
                            java.io.File r2 = r1.file
                            goto Lc
                        Lb:
                            r2 = 0
                        Lc:
                            return r2
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForJarEntry implements net.bytebuddy.build.Plugin.Engine.Source.Element {
                    private final java.util.jar.JarEntry entry;
                    private final java.util.jar.JarFile file;

                    public ForJarEntry(java.util.jar.JarFile r1, java.util.jar.JarEntry r2) {
                            r0 = this;
                            r0.<init>()
                            r0.file = r1
                            r0.entry = r2
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.util.jar.JarFile r2 = r4.file
                            net.bytebuddy.build.Plugin$Engine$Source$Element$ForJarEntry r5 = (net.bytebuddy.build.Plugin.Engine.Source.Element.ForJarEntry) r5
                            java.util.jar.JarFile r3 = r5.file
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            java.util.jar.JarEntry r2 = r4.entry
                            java.util.jar.JarEntry r5 = r5.entry
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public java.io.InputStream getInputStream() throws java.io.IOException {
                            r2 = this;
                            java.util.jar.JarFile r0 = r2.file
                            java.util.jar.JarEntry r1 = r2.entry
                            java.io.InputStream r0 = r0.getInputStream(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    public java.lang.String getName() {
                            r1 = this;
                            java.util.jar.JarEntry r0 = r1.entry
                            java.lang.String r0 = r0.getName()
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.util.jar.JarFile r1 = r2.file
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.util.jar.JarEntry r1 = r2.entry
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Element
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public <T> T resolveAs(java.lang.Class<T> r2) {
                            r1 = this;
                            java.lang.Class<java.util.jar.JarEntry> r0 = java.util.jar.JarEntry.class
                            boolean r2 = r0.isAssignableFrom(r2)
                            if (r2 == 0) goto Lb
                            java.util.jar.JarEntry r2 = r1.entry
                            goto Lc
                        Lb:
                            r2 = 0
                        Lc:
                            return r2
                    }
                }

                java.io.InputStream getInputStream() throws java.io.IOException;

                java.lang.String getName();

                @net.bytebuddy.utility.nullability.MaybeNull
                <T> T resolveAs(java.lang.Class<T> r1);
            }

            public enum Empty extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.Source.Empty> implements net.bytebuddy.build.Plugin.Engine.Source, net.bytebuddy.build.Plugin.Engine.Source.Origin {
                private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.Empty[] $VALUES = null;
                public static final net.bytebuddy.build.Plugin.Engine.Source.Empty INSTANCE = null;

                static {
                        net.bytebuddy.build.Plugin$Engine$Source$Empty r0 = new net.bytebuddy.build.Plugin$Engine$Source$Empty
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.build.Plugin.Engine.Source.Empty.INSTANCE = r0
                        net.bytebuddy.build.Plugin$Engine$Source$Empty[] r0 = new net.bytebuddy.build.Plugin.Engine.Source.Empty[]{r0}
                        net.bytebuddy.build.Plugin.Engine.Source.Empty.$VALUES = r0
                        return
                }

                Empty(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.Source.Empty valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.build.Plugin$Engine$Source$Empty> r0 = net.bytebuddy.build.Plugin.Engine.Source.Empty.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.build.Plugin$Engine$Source$Empty r1 = (net.bytebuddy.build.Plugin.Engine.Source.Empty) r1
                        return r1
                }

                public static net.bytebuddy.build.Plugin.Engine.Source.Empty[] values() {
                        net.bytebuddy.build.Plugin$Engine$Source$Empty[] r0 = net.bytebuddy.build.Plugin.Engine.Source.Empty.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.build.Plugin$Engine$Source$Empty[] r0 = (net.bytebuddy.build.Plugin.Engine.Source.Empty[]) r0
                        return r0
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                public net.bytebuddy.dynamic.ClassFileLocator getClassFileLocator() {
                        r1 = this;
                        net.bytebuddy.dynamic.ClassFileLocator$NoOp r0 = net.bytebuddy.dynamic.ClassFileLocator.NoOp.INSTANCE
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.util.jar.Manifest getManifest() {
                        r1 = this;
                        java.util.jar.Manifest r0 = net.bytebuddy.build.Plugin.Engine.Source.Origin.NO_MANIFEST
                        return r0
                }

                @Override // java.lang.Iterable
                public java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> iterator() {
                        r1 = this;
                        java.util.Set r0 = java.util.Collections.emptySet()
                        java.util.Iterator r0 = r0.iterator()
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public net.bytebuddy.build.Plugin.Engine.Source.Origin read() {
                        r0 = this;
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Filtering implements net.bytebuddy.build.Plugin.Engine.Source {
                private final net.bytebuddy.build.Plugin.Engine.Source delegate;
                private final boolean manifest;
                private final net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin.Engine.Source.Element> matcher;

                public Filtering(net.bytebuddy.build.Plugin.Engine.Source r2, net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin.Engine.Source.Element> r3) {
                        r1 = this;
                        r0 = 1
                        r1.<init>(r2, r3, r0)
                        return
                }

                public Filtering(net.bytebuddy.build.Plugin.Engine.Source r1, net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin.Engine.Source.Element> r2, boolean r3) {
                        r0 = this;
                        r0.<init>()
                        r0.delegate = r1
                        r0.matcher = r2
                        r0.manifest = r3
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        boolean r2 = r4.manifest
                        net.bytebuddy.build.Plugin$Engine$Source$Filtering r5 = (net.bytebuddy.build.Plugin.Engine.Source.Filtering) r5
                        boolean r3 = r5.manifest
                        if (r2 == r3) goto L1c
                        return r1
                    L1c:
                        net.bytebuddy.build.Plugin$Engine$Source r2 = r4.delegate
                        net.bytebuddy.build.Plugin$Engine$Source r3 = r5.delegate
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L27
                        return r1
                    L27:
                        net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r2 = r4.matcher
                        net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r5 = r5.matcher
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L32
                        return r1
                    L32:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.build.Plugin$Engine$Source r1 = r2.delegate
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r1 = r2.matcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        boolean r1 = r2.manifest
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public net.bytebuddy.build.Plugin.Engine.Source.Origin read() throws java.io.IOException {
                        r4 = this;
                        net.bytebuddy.build.Plugin$Engine$Source$Origin$Filtering r0 = new net.bytebuddy.build.Plugin$Engine$Source$Origin$Filtering
                        net.bytebuddy.build.Plugin$Engine$Source r1 = r4.delegate
                        net.bytebuddy.build.Plugin$Engine$Source$Origin r1 = r1.read()
                        net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r2 = r4.matcher
                        boolean r3 = r4.manifest
                        r0.<init>(r1, r2, r3)
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForFolder implements net.bytebuddy.build.Plugin.Engine.Source, net.bytebuddy.build.Plugin.Engine.Source.Origin {
                private final java.io.File folder;

                public class FolderIterator implements java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> {
                    private final java.util.List<java.io.File> files;
                    final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.ForFolder this$0;

                    public FolderIterator(net.bytebuddy.build.Plugin.Engine.Source.ForFolder r3, java.io.File r4) {
                            r2 = this;
                            r2.this$0 = r3
                            r2.<init>()
                            java.util.ArrayList r3 = new java.util.ArrayList
                            java.util.Set r0 = java.util.Collections.singleton(r4)
                            r3.<init>(r0)
                            r2.files = r3
                        L10:
                            java.util.List<java.io.File> r3 = r2.files
                            int r0 = r3.size()
                            int r0 = r0 + (-1)
                            java.lang.Object r3 = r3.remove(r0)
                            java.io.File r3 = (java.io.File) r3
                            java.io.File[] r3 = r3.listFiles()
                            if (r3 == 0) goto L2d
                            java.util.List<java.io.File> r0 = r2.files
                            java.util.List r3 = java.util.Arrays.asList(r3)
                            r0.addAll(r3)
                        L2d:
                            java.util.List<java.io.File> r3 = r2.files
                            boolean r3 = r3.isEmpty()
                            if (r3 != 0) goto L64
                            java.util.List<java.io.File> r3 = r2.files
                            int r0 = r3.size()
                            int r0 = r0 + (-1)
                            java.lang.Object r3 = r3.get(r0)
                            java.io.File r3 = (java.io.File) r3
                            boolean r3 = r3.isDirectory()
                            if (r3 != 0) goto L10
                            java.util.List<java.io.File> r3 = r2.files
                            int r0 = r3.size()
                            int r0 = r0 + (-1)
                            java.lang.Object r3 = r3.get(r0)
                            java.io.File r3 = (java.io.File) r3
                            java.io.File r0 = new java.io.File
                            java.lang.String r1 = "META-INF/MANIFEST.MF"
                            r0.<init>(r4, r1)
                            boolean r3 = r3.equals(r0)
                            if (r3 != 0) goto L10
                        L64:
                            return
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                            r1 = this;
                            java.util.List<java.io.File> r0 = r1.files
                            boolean r0 = r0.isEmpty()
                            r0 = r0 ^ 1
                            return r0
                    }

                    @Override // java.util.Iterator
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception is thrown by invoking removeFirst on an empty list.", value = {"IT_NO_SUCH_ELEMENT"})
                    public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.Element next() {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Element r0 = r1.next2()
                            return r0
                    }

                    @Override // java.util.Iterator
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception is thrown by invoking removeFirst on an empty list.", value = {"IT_NO_SUCH_ELEMENT"})
                    /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.build.Plugin.Engine.Source.Element next2() {
                            r5 = this;
                            java.lang.String r0 = "META-INF/MANIFEST.MF"
                            net.bytebuddy.build.Plugin$Engine$Source$Element$ForFile r1 = new net.bytebuddy.build.Plugin$Engine$Source$Element$ForFile     // Catch: java.lang.Throwable -> L75
                            net.bytebuddy.build.Plugin$Engine$Source$ForFolder r2 = r5.this$0     // Catch: java.lang.Throwable -> L75
                            java.io.File r2 = net.bytebuddy.build.Plugin.Engine.Source.ForFolder.access$600(r2)     // Catch: java.lang.Throwable -> L75
                            java.util.List<java.io.File> r3 = r5.files     // Catch: java.lang.Throwable -> L75
                            int r4 = r3.size()     // Catch: java.lang.Throwable -> L75
                            int r4 = r4 + (-1)
                            java.lang.Object r3 = r3.remove(r4)     // Catch: java.lang.Throwable -> L75
                            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Throwable -> L75
                            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L75
                        L1b:
                            java.util.List<java.io.File> r2 = r5.files
                            boolean r2 = r2.isEmpty()
                            if (r2 != 0) goto L74
                            java.util.List<java.io.File> r2 = r5.files
                            int r3 = r2.size()
                            int r3 = r3 + (-1)
                            java.lang.Object r2 = r2.get(r3)
                            java.io.File r2 = (java.io.File) r2
                            boolean r2 = r2.isDirectory()
                            if (r2 != 0) goto L56
                            java.util.List<java.io.File> r2 = r5.files
                            int r3 = r2.size()
                            int r3 = r3 + (-1)
                            java.lang.Object r2 = r2.get(r3)
                            java.io.File r2 = (java.io.File) r2
                            java.io.File r3 = new java.io.File
                            net.bytebuddy.build.Plugin$Engine$Source$ForFolder r4 = r5.this$0
                            java.io.File r4 = net.bytebuddy.build.Plugin.Engine.Source.ForFolder.access$600(r4)
                            r3.<init>(r4, r0)
                            boolean r2 = r2.equals(r3)
                            if (r2 == 0) goto L74
                        L56:
                            java.util.List<java.io.File> r2 = r5.files
                            int r3 = r2.size()
                            int r3 = r3 + (-1)
                            java.lang.Object r2 = r2.remove(r3)
                            java.io.File r2 = (java.io.File) r2
                            java.io.File[] r2 = r2.listFiles()
                            if (r2 == 0) goto L1b
                            java.util.List<java.io.File> r3 = r5.files
                            java.util.List r2 = java.util.Arrays.asList(r2)
                            r3.addAll(r2)
                            goto L1b
                        L74:
                            return r1
                        L75:
                            r1 = move-exception
                        L76:
                            java.util.List<java.io.File> r2 = r5.files
                            boolean r2 = r2.isEmpty()
                            if (r2 != 0) goto Lcf
                            java.util.List<java.io.File> r2 = r5.files
                            int r3 = r2.size()
                            int r3 = r3 + (-1)
                            java.lang.Object r2 = r2.get(r3)
                            java.io.File r2 = (java.io.File) r2
                            boolean r2 = r2.isDirectory()
                            if (r2 != 0) goto Lb1
                            java.util.List<java.io.File> r2 = r5.files
                            int r3 = r2.size()
                            int r3 = r3 + (-1)
                            java.lang.Object r2 = r2.get(r3)
                            java.io.File r2 = (java.io.File) r2
                            java.io.File r3 = new java.io.File
                            net.bytebuddy.build.Plugin$Engine$Source$ForFolder r4 = r5.this$0
                            java.io.File r4 = net.bytebuddy.build.Plugin.Engine.Source.ForFolder.access$600(r4)
                            r3.<init>(r4, r0)
                            boolean r2 = r2.equals(r3)
                            if (r2 == 0) goto Lcf
                        Lb1:
                            java.util.List<java.io.File> r2 = r5.files
                            int r3 = r2.size()
                            int r3 = r3 + (-1)
                            java.lang.Object r2 = r2.remove(r3)
                            java.io.File r2 = (java.io.File) r2
                            java.io.File[] r2 = r2.listFiles()
                            if (r2 == 0) goto L76
                            java.util.List<java.io.File> r3 = r5.files
                            java.util.List r2 = java.util.Arrays.asList(r2)
                            r3.addAll(r2)
                            goto L76
                        Lcf:
                            throw r1
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                            r2 = this;
                            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                            java.lang.String r1 = "remove"
                            r0.<init>(r1)
                            throw r0
                    }
                }

                public ForFolder(java.io.File r1) {
                        r0 = this;
                        r0.<init>()
                        r0.folder = r1
                        return
                }

                public static /* synthetic */ java.io.File access$600(net.bytebuddy.build.Plugin.Engine.Source.ForFolder r0) {
                        java.io.File r0 = r0.folder
                        return r0
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                        r0 = this;
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.io.File r2 = r4.folder
                        net.bytebuddy.build.Plugin$Engine$Source$ForFolder r5 = (net.bytebuddy.build.Plugin.Engine.Source.ForFolder) r5
                        java.io.File r5 = r5.folder
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                public net.bytebuddy.dynamic.ClassFileLocator getClassFileLocator() {
                        r2 = this;
                        net.bytebuddy.dynamic.ClassFileLocator$ForFolder r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForFolder
                        java.io.File r1 = r2.folder
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.util.jar.Manifest getManifest() throws java.io.IOException {
                        r3 = this;
                        java.io.File r0 = new java.io.File
                        java.io.File r1 = r3.folder
                        java.lang.String r2 = "META-INF/MANIFEST.MF"
                        r0.<init>(r1, r2)
                        boolean r1 = r0.exists()
                        if (r1 == 0) goto L22
                        java.io.FileInputStream r1 = new java.io.FileInputStream
                        r1.<init>(r0)
                        java.util.jar.Manifest r0 = new java.util.jar.Manifest     // Catch: java.lang.Throwable -> L1d
                        r0.<init>(r1)     // Catch: java.lang.Throwable -> L1d
                        r1.close()
                        return r0
                    L1d:
                        r0 = move-exception
                        r1.close()
                        throw r0
                    L22:
                        java.util.jar.Manifest r0 = net.bytebuddy.build.Plugin.Engine.Source.Origin.NO_MANIFEST
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.io.File r1 = r2.folder
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // java.lang.Iterable
                public java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> iterator() {
                        r2 = this;
                        net.bytebuddy.build.Plugin$Engine$Source$ForFolder$FolderIterator r0 = new net.bytebuddy.build.Plugin$Engine$Source$ForFolder$FolderIterator
                        java.io.File r1 = r2.folder
                        r0.<init>(r2, r1)
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public net.bytebuddy.build.Plugin.Engine.Source.Origin read() {
                        r0 = this;
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForJarFile implements net.bytebuddy.build.Plugin.Engine.Source {
                private final java.io.File file;

                public ForJarFile(java.io.File r1) {
                        r0 = this;
                        r0.<init>()
                        r0.file = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.io.File r2 = r4.file
                        net.bytebuddy.build.Plugin$Engine$Source$ForJarFile r5 = (net.bytebuddy.build.Plugin.Engine.Source.ForJarFile) r5
                        java.io.File r5 = r5.file
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.io.File r1 = r2.file
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public net.bytebuddy.build.Plugin.Engine.Source.Origin read() throws java.io.IOException {
                        r3 = this;
                        net.bytebuddy.build.Plugin$Engine$Source$Origin$ForJarFile r0 = new net.bytebuddy.build.Plugin$Engine$Source$Origin$ForJarFile
                        java.util.jar.JarFile r1 = new java.util.jar.JarFile
                        java.io.File r2 = r3.file
                        r1.<init>(r2)
                        r0.<init>(r1)
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class InMemory implements net.bytebuddy.build.Plugin.Engine.Source, net.bytebuddy.build.Plugin.Engine.Source.Origin {
                private final java.util.Map<java.lang.String, byte[]> storage;

                public static class MapEntryIterator implements java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> {
                    private final java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> iterator;

                    public MapEntryIterator(java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.iterator = r1
                            return
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                            r1 = this;
                            java.util.Iterator<java.util.Map$Entry<java.lang.String, byte[]>> r0 = r1.iterator
                            boolean r0 = r0.hasNext()
                            return r0
                    }

                    @Override // java.util.Iterator
                    public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.Element next() {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Element r0 = r1.next2()
                            return r0
                    }

                    @Override // java.util.Iterator
                    /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
                    public net.bytebuddy.build.Plugin.Engine.Source.Element next2() {
                            r3 = this;
                            java.util.Iterator<java.util.Map$Entry<java.lang.String, byte[]>> r0 = r3.iterator
                            java.lang.Object r0 = r0.next()
                            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                            net.bytebuddy.build.Plugin$Engine$Source$Element$ForByteArray r1 = new net.bytebuddy.build.Plugin$Engine$Source$Element$ForByteArray
                            java.lang.Object r2 = r0.getKey()
                            java.lang.String r2 = (java.lang.String) r2
                            java.lang.Object r0 = r0.getValue()
                            byte[] r0 = (byte[]) r0
                            r1.<init>(r2, r0)
                            return r1
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                            r2 = this;
                            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                            java.lang.String r1 = "remove"
                            r0.<init>(r1)
                            throw r0
                    }
                }

                public InMemory(java.util.Map<java.lang.String, byte[]> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.storage = r1
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.Source ofTypes(java.util.Collection<? extends java.lang.Class<?>> r3) {
                        java.util.HashMap r0 = new java.util.HashMap
                        r0.<init>()
                        java.util.Iterator r3 = r3.iterator()
                    L9:
                        boolean r1 = r3.hasNext()
                        if (r1 == 0) goto L21
                        java.lang.Object r1 = r3.next()
                        java.lang.Class r1 = (java.lang.Class) r1
                        net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                        byte[] r1 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.read(r1)
                        r0.put(r2, r1)
                        goto L9
                    L21:
                        net.bytebuddy.build.Plugin$Engine$Source r3 = ofTypes(r0)
                        return r3
                }

                public static net.bytebuddy.build.Plugin.Engine.Source ofTypes(java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r4) {
                        java.util.HashMap r0 = new java.util.HashMap
                        r0.<init>()
                        java.util.Set r4 = r4.entrySet()
                        java.util.Iterator r4 = r4.iterator()
                    Ld:
                        boolean r1 = r4.hasNext()
                        if (r1 == 0) goto L3c
                        java.lang.Object r1 = r4.next()
                        java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.Object r3 = r1.getKey()
                        net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                        java.lang.String r3 = r3.getInternalName()
                        r2.append(r3)
                        java.lang.String r3 = ".class"
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
                        java.lang.Object r1 = r1.getValue()
                        r0.put(r2, r1)
                        goto Ld
                    L3c:
                        net.bytebuddy.build.Plugin$Engine$Source$InMemory r4 = new net.bytebuddy.build.Plugin$Engine$Source$InMemory
                        r4.<init>(r0)
                        return r4
                }

                public static net.bytebuddy.build.Plugin.Engine.Source ofTypes(java.lang.Class<?>... r0) {
                        java.util.List r0 = java.util.Arrays.asList(r0)
                        net.bytebuddy.build.Plugin$Engine$Source r0 = ofTypes(r0)
                        return r0
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                        r0 = this;
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.util.Map<java.lang.String, byte[]> r2 = r4.storage
                        net.bytebuddy.build.Plugin$Engine$Source$InMemory r5 = (net.bytebuddy.build.Plugin.Engine.Source.InMemory) r5
                        java.util.Map<java.lang.String, byte[]> r5 = r5.storage
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                public net.bytebuddy.dynamic.ClassFileLocator getClassFileLocator() {
                        r1 = this;
                        java.util.Map<java.lang.String, byte[]> r0 = r1.storage
                        net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.Simple.ofResources(r0)
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.util.jar.Manifest getManifest() throws java.io.IOException {
                        r3 = this;
                        java.util.Map<java.lang.String, byte[]> r0 = r3.storage
                        java.lang.String r1 = "META-INF/MANIFEST.MF"
                        java.lang.Object r0 = r0.get(r1)
                        byte[] r0 = (byte[]) r0
                        if (r0 != 0) goto Lf
                        java.util.jar.Manifest r0 = net.bytebuddy.build.Plugin.Engine.Source.Origin.NO_MANIFEST
                        return r0
                    Lf:
                        java.util.jar.Manifest r1 = new java.util.jar.Manifest
                        java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
                        r2.<init>(r0)
                        r1.<init>(r2)
                        return r1
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.util.Map<java.lang.String, byte[]> r1 = r2.storage
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // java.lang.Iterable
                public java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> iterator() {
                        r2 = this;
                        net.bytebuddy.build.Plugin$Engine$Source$InMemory$MapEntryIterator r0 = new net.bytebuddy.build.Plugin$Engine$Source$InMemory$MapEntryIterator
                        java.util.Map<java.lang.String, byte[]> r1 = r2.storage
                        java.util.Set r1 = r1.entrySet()
                        java.util.Iterator r1 = r1.iterator()
                        r0.<init>(r1)
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Source
                public net.bytebuddy.build.Plugin.Engine.Source.Origin read() {
                        r0 = this;
                        return r0
                }
            }

            public interface Origin extends java.lang.Iterable<net.bytebuddy.build.Plugin.Engine.Source.Element>, java.io.Closeable {

                @net.bytebuddy.utility.nullability.AlwaysNull
                public static final java.util.jar.Manifest NO_MANIFEST = null;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Filtering implements net.bytebuddy.build.Plugin.Engine.Source.Origin {
                    private final net.bytebuddy.build.Plugin.Engine.Source.Origin delegate;
                    private final boolean manifest;
                    private final net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin.Engine.Source.Element> matcher;

                    public static class FilteringIterator implements java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> {

                        @net.bytebuddy.utility.nullability.MaybeNull
                        private net.bytebuddy.build.Plugin.Engine.Source.Element current;
                        private final java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> iterator;
                        private final net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin.Engine.Source.Element> matcher;

                        private FilteringIterator(java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> r3, net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin.Engine.Source.Element> r4) {
                                r2 = this;
                                r2.<init>()
                                r2.iterator = r3
                                r2.matcher = r4
                            L7:
                                boolean r0 = r3.hasNext()
                                if (r0 == 0) goto L1b
                                java.lang.Object r0 = r3.next()
                                net.bytebuddy.build.Plugin$Engine$Source$Element r0 = (net.bytebuddy.build.Plugin.Engine.Source.Element) r0
                                boolean r1 = r4.matches(r0)
                                if (r1 == 0) goto L7
                                r2.current = r0
                            L1b:
                                return
                        }

                        public /* synthetic */ FilteringIterator(java.util.Iterator r1, net.bytebuddy.matcher.ElementMatcher r2, net.bytebuddy.build.Plugin.AnonymousClass1 r3) {
                                r0 = this;
                                r0.<init>(r1, r2)
                                return
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                                r1 = this;
                                net.bytebuddy.build.Plugin$Engine$Source$Element r0 = r1.current
                                if (r0 == 0) goto L6
                                r0 = 1
                                goto L7
                            L6:
                                r0 = 0
                            L7:
                                return r0
                        }

                        @Override // java.util.Iterator
                        public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.Element next() {
                                r1 = this;
                                net.bytebuddy.build.Plugin$Engine$Source$Element r0 = r1.next2()
                                return r0
                        }

                        @Override // java.util.Iterator
                        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
                        public net.bytebuddy.build.Plugin.Engine.Source.Element next2() {
                                r3 = this;
                                net.bytebuddy.build.Plugin$Engine$Source$Element r0 = r3.current
                                if (r0 == 0) goto L22
                                r1 = 0
                                r3.current = r1
                            L7:
                                java.util.Iterator<net.bytebuddy.build.Plugin$Engine$Source$Element> r1 = r3.iterator
                                boolean r1 = r1.hasNext()
                                if (r1 == 0) goto L21
                                java.util.Iterator<net.bytebuddy.build.Plugin$Engine$Source$Element> r1 = r3.iterator
                                java.lang.Object r1 = r1.next()
                                net.bytebuddy.build.Plugin$Engine$Source$Element r1 = (net.bytebuddy.build.Plugin.Engine.Source.Element) r1
                                net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r2 = r3.matcher
                                boolean r2 = r2.matches(r1)
                                if (r2 == 0) goto L7
                                r3.current = r1
                            L21:
                                return r0
                            L22:
                                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                                r0.<init>()
                                throw r0
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                                r1 = this;
                                java.util.Iterator<net.bytebuddy.build.Plugin$Engine$Source$Element> r0 = r1.iterator
                                r0.remove()
                                return
                        }
                    }

                    public Filtering(net.bytebuddy.build.Plugin.Engine.Source.Origin r2, net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin.Engine.Source.Element> r3) {
                            r1 = this;
                            r0 = 1
                            r1.<init>(r2, r3, r0)
                            return
                    }

                    public Filtering(net.bytebuddy.build.Plugin.Engine.Source.Origin r1, net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin.Engine.Source.Element> r2, boolean r3) {
                            r0 = this;
                            r0.<init>()
                            r0.delegate = r1
                            r0.matcher = r2
                            r0.manifest = r3
                            return
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws java.io.IOException {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r0 = r1.delegate
                            r0.close()
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            boolean r2 = r4.manifest
                            net.bytebuddy.build.Plugin$Engine$Source$Origin$Filtering r5 = (net.bytebuddy.build.Plugin.Engine.Source.Origin.Filtering) r5
                            boolean r3 = r5.manifest
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r2 = r4.delegate
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r3 = r5.delegate
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L27
                            return r1
                        L27:
                            net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r2 = r4.matcher
                            net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r5 = r5.matcher
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L32
                            return r1
                        L32:
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    public net.bytebuddy.dynamic.ClassFileLocator getClassFileLocator() {
                            r1 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r0 = r1.delegate
                            net.bytebuddy.dynamic.ClassFileLocator r0 = r0.getClassFileLocator()
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public java.util.jar.Manifest getManifest() throws java.io.IOException {
                            r1 = this;
                            boolean r0 = r1.manifest
                            if (r0 == 0) goto Lb
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r0 = r1.delegate
                            java.util.jar.Manifest r0 = r0.getManifest()
                            goto Ld
                        Lb:
                            java.util.jar.Manifest r0 = net.bytebuddy.build.Plugin.Engine.Source.Origin.NO_MANIFEST
                        Ld:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r1 = r2.delegate
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r1 = r2.matcher
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            boolean r1 = r2.manifest
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // java.lang.Iterable
                    public java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> iterator() {
                            r4 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Origin$Filtering$FilteringIterator r0 = new net.bytebuddy.build.Plugin$Engine$Source$Origin$Filtering$FilteringIterator
                            net.bytebuddy.build.Plugin$Engine$Source$Origin r1 = r4.delegate
                            java.util.Iterator r1 = r1.iterator()
                            net.bytebuddy.matcher.ElementMatcher<net.bytebuddy.build.Plugin$Engine$Source$Element> r2 = r4.matcher
                            r3 = 0
                            r0.<init>(r1, r2, r3)
                            return r0
                    }
                }

                public static class ForJarFile implements net.bytebuddy.build.Plugin.Engine.Source.Origin {
                    private final java.util.jar.JarFile file;

                    public class JarFileIterator implements java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> {
                        private final java.util.Enumeration<java.util.jar.JarEntry> enumeration;
                        final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.Origin.ForJarFile this$0;

                        public JarFileIterator(net.bytebuddy.build.Plugin.Engine.Source.Origin.ForJarFile r1, java.util.Enumeration<java.util.jar.JarEntry> r2) {
                                r0 = this;
                                r0.this$0 = r1
                                r0.<init>()
                                r0.enumeration = r2
                                return
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                                r1 = this;
                                java.util.Enumeration<java.util.jar.JarEntry> r0 = r1.enumeration
                                boolean r0 = r0.hasMoreElements()
                                return r0
                        }

                        @Override // java.util.Iterator
                        public /* bridge */ /* synthetic */ net.bytebuddy.build.Plugin.Engine.Source.Element next() {
                                r1 = this;
                                net.bytebuddy.build.Plugin$Engine$Source$Element r0 = r1.next2()
                                return r0
                        }

                        @Override // java.util.Iterator
                        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
                        public net.bytebuddy.build.Plugin.Engine.Source.Element next2() {
                                r3 = this;
                                net.bytebuddy.build.Plugin$Engine$Source$Element$ForJarEntry r0 = new net.bytebuddy.build.Plugin$Engine$Source$Element$ForJarEntry
                                net.bytebuddy.build.Plugin$Engine$Source$Origin$ForJarFile r1 = r3.this$0
                                java.util.jar.JarFile r1 = net.bytebuddy.build.Plugin.Engine.Source.Origin.ForJarFile.access$400(r1)
                                java.util.Enumeration<java.util.jar.JarEntry> r2 = r3.enumeration
                                java.lang.Object r2 = r2.nextElement()
                                java.util.jar.JarEntry r2 = (java.util.jar.JarEntry) r2
                                r0.<init>(r1, r2)
                                return r0
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                                r2 = this;
                                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                                java.lang.String r1 = "remove"
                                r0.<init>(r1)
                                throw r0
                        }
                    }

                    public ForJarFile(java.util.jar.JarFile r1) {
                            r0 = this;
                            r0.<init>()
                            r0.file = r1
                            return
                    }

                    public static /* synthetic */ java.util.jar.JarFile access$400(net.bytebuddy.build.Plugin.Engine.Source.Origin.ForJarFile r0) {
                            java.util.jar.JarFile r0 = r0.file
                            return r0
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws java.io.IOException {
                            r1 = this;
                            java.util.jar.JarFile r0 = r1.file
                            r0.close()
                            return
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    public net.bytebuddy.dynamic.ClassFileLocator getClassFileLocator() {
                            r2 = this;
                            net.bytebuddy.dynamic.ClassFileLocator$ForJarFile r0 = new net.bytebuddy.dynamic.ClassFileLocator$ForJarFile
                            java.util.jar.JarFile r1 = r2.file
                            r0.<init>(r1)
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Source.Origin
                    @net.bytebuddy.utility.nullability.MaybeNull
                    public java.util.jar.Manifest getManifest() throws java.io.IOException {
                            r1 = this;
                            java.util.jar.JarFile r0 = r1.file
                            java.util.jar.Manifest r0 = r0.getManifest()
                            return r0
                    }

                    @Override // java.lang.Iterable
                    public java.util.Iterator<net.bytebuddy.build.Plugin.Engine.Source.Element> iterator() {
                            r2 = this;
                            net.bytebuddy.build.Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator r0 = new net.bytebuddy.build.Plugin$Engine$Source$Origin$ForJarFile$JarFileIterator
                            java.util.jar.JarFile r1 = r2.file
                            java.util.Enumeration r1 = r1.entries()
                            r0.<init>(r2, r1)
                            return r0
                    }
                }

                static {
                        return
                }

                net.bytebuddy.dynamic.ClassFileLocator getClassFileLocator();

                @net.bytebuddy.utility.nullability.MaybeNull
                java.util.jar.Manifest getManifest() throws java.io.IOException;
            }

            net.bytebuddy.build.Plugin.Engine.Source.Origin read() throws java.io.IOException;
        }

        public static class Summary {
            private final java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> failed;
            private final java.util.List<net.bytebuddy.description.type.TypeDescription> transformed;
            private final java.util.List<java.lang.String> unresolved;

            public Summary(java.util.List<net.bytebuddy.description.type.TypeDescription> r1, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r2, java.util.List<java.lang.String> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.transformed = r1
                    r0.failed = r2
                    r0.unresolved = r3
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 == 0) goto L35
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L12
                    goto L35
                L12:
                    net.bytebuddy.build.Plugin$Engine$Summary r5 = (net.bytebuddy.build.Plugin.Engine.Summary) r5
                    java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r4.transformed
                    java.util.List<net.bytebuddy.description.type.TypeDescription> r3 = r5.transformed
                    boolean r2 = r2.equals(r3)
                    if (r2 == 0) goto L33
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r2 = r4.failed
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r3 = r5.failed
                    boolean r2 = r2.equals(r3)
                    if (r2 == 0) goto L33
                    java.util.List<java.lang.String> r2 = r4.unresolved
                    java.util.List<java.lang.String> r5 = r5.unresolved
                    boolean r5 = r2.equals(r5)
                    if (r5 == 0) goto L33
                    goto L34
                L33:
                    r0 = r1
                L34:
                    return r0
                L35:
                    return r1
            }

            public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> getFailed() {
                    r1 = this;
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r0 = r1.failed
                    return r0
            }

            public java.util.List<net.bytebuddy.description.type.TypeDescription> getTransformed() {
                    r1 = this;
                    java.util.List<net.bytebuddy.description.type.TypeDescription> r0 = r1.transformed
                    return r0
            }

            public java.util.List<java.lang.String> getUnresolved() {
                    r1 = this;
                    java.util.List<java.lang.String> r0 = r1.unresolved
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.util.List<net.bytebuddy.description.type.TypeDescription> r0 = r2.transformed
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.util.List<java.lang.Throwable>> r1 = r2.failed
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<java.lang.String> r1 = r2.unresolved
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public interface Target {

            public enum Discarding extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.Target.Discarding> implements net.bytebuddy.build.Plugin.Engine.Target, net.bytebuddy.build.Plugin.Engine.Target.Sink {
                private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.Target.Discarding[] $VALUES = null;
                public static final net.bytebuddy.build.Plugin.Engine.Target.Discarding INSTANCE = null;

                static {
                        net.bytebuddy.build.Plugin$Engine$Target$Discarding r0 = new net.bytebuddy.build.Plugin$Engine$Target$Discarding
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.build.Plugin.Engine.Target.Discarding.INSTANCE = r0
                        net.bytebuddy.build.Plugin$Engine$Target$Discarding[] r0 = new net.bytebuddy.build.Plugin.Engine.Target.Discarding[]{r0}
                        net.bytebuddy.build.Plugin.Engine.Target.Discarding.$VALUES = r0
                        return
                }

                Discarding(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.Target.Discarding valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.build.Plugin$Engine$Target$Discarding> r0 = net.bytebuddy.build.Plugin.Engine.Target.Discarding.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.build.Plugin$Engine$Target$Discarding r1 = (net.bytebuddy.build.Plugin.Engine.Target.Discarding) r1
                        return r1
                }

                public static net.bytebuddy.build.Plugin.Engine.Target.Discarding[] values() {
                        net.bytebuddy.build.Plugin$Engine$Target$Discarding[] r0 = net.bytebuddy.build.Plugin.Engine.Target.Discarding.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.build.Plugin$Engine$Target$Discarding[] r0 = (net.bytebuddy.build.Plugin.Engine.Target.Discarding[]) r0
                        return r0
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void retain(net.bytebuddy.build.Plugin.Engine.Source.Element r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void store(java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r1) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target
                public net.bytebuddy.build.Plugin.Engine.Target.Sink write(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r1) {
                        r0 = this;
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForFolder implements net.bytebuddy.build.Plugin.Engine.Target, net.bytebuddy.build.Plugin.Engine.Target.Sink {
                private final java.io.File folder;

                public ForFolder(java.io.File r1) {
                        r0 = this;
                        r0.<init>()
                        r0.folder = r1
                        return
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                        r0 = this;
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.io.File r2 = r4.folder
                        net.bytebuddy.build.Plugin$Engine$Target$ForFolder r5 = (net.bytebuddy.build.Plugin.Engine.Target.ForFolder) r5
                        java.io.File r5 = r5.folder
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.io.File r1 = r2.folder
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void retain(net.bytebuddy.build.Plugin.Engine.Source.Element r6) throws java.io.IOException {
                        r5 = this;
                        java.lang.String r0 = r6.getName()
                        java.lang.String r1 = "/"
                        boolean r1 = r0.endsWith(r1)
                        if (r1 != 0) goto Lca
                        java.io.File r1 = new java.io.File
                        java.io.File r2 = r5.folder
                        r1.<init>(r2, r0)
                        java.lang.Class<java.io.File> r0 = java.io.File.class
                        java.lang.Object r0 = r6.resolveAs(r0)
                        java.io.File r0 = (java.io.File) r0
                        java.lang.String r2 = r1.getCanonicalPath()
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.io.File r4 = r5.folder
                        java.lang.String r4 = r4.getCanonicalPath()
                        r3.append(r4)
                        char r4 = java.io.File.separatorChar
                        r3.append(r4)
                        java.lang.String r3 = r3.toString()
                        boolean r2 = r2.startsWith(r3)
                        if (r2 == 0) goto Lae
                        java.io.File r2 = r1.getParentFile()
                        boolean r2 = r2.isDirectory()
                        if (r2 != 0) goto L6c
                        java.io.File r2 = r1.getParentFile()
                        boolean r2 = r2.mkdirs()
                        if (r2 == 0) goto L51
                        goto L6c
                    L51:
                        java.io.IOException r6 = new java.io.IOException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r2 = "Could not create directory: "
                        r0.append(r2)
                        java.lang.String r1 = r1.getParent()
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        r6.<init>(r0)
                        throw r6
                    L6c:
                        if (r0 == 0) goto L7c
                        boolean r2 = r0.equals(r1)
                        if (r2 != 0) goto L7c
                        net.bytebuddy.utility.FileSystem r6 = net.bytebuddy.utility.FileSystem.getInstance()
                        r6.copy(r0, r1)
                        goto Lca
                    L7c:
                        boolean r0 = r1.equals(r0)
                        if (r0 != 0) goto Lca
                        java.io.InputStream r6 = r6.getInputStream()
                        java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La4
                        r0.<init>(r1)     // Catch: java.lang.Throwable -> La4
                        r1 = 1024(0x400, float:1.435E-42)
                        byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L9b
                    L8f:
                        int r2 = r6.read(r1)     // Catch: java.lang.Throwable -> L9b
                        r3 = -1
                        if (r2 == r3) goto L9d
                        r3 = 0
                        r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L9b
                        goto L8f
                    L9b:
                        r1 = move-exception
                        goto La6
                    L9d:
                        r0.close()     // Catch: java.lang.Throwable -> La4
                        r6.close()
                        goto Lca
                    La4:
                        r0 = move-exception
                        goto Laa
                    La6:
                        r0.close()     // Catch: java.lang.Throwable -> La4
                        throw r1     // Catch: java.lang.Throwable -> La4
                    Laa:
                        r6.close()
                        throw r0
                    Lae:
                        java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r1)
                        java.lang.String r1 = " is not a subdirectory of "
                        r0.append(r1)
                        java.io.File r1 = r5.folder
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        r6.<init>(r0)
                        throw r6
                    Lca:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void store(java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r6) throws java.io.IOException {
                        r5 = this;
                        java.util.Set r6 = r6.entrySet()
                        java.util.Iterator r6 = r6.iterator()
                    L8:
                        boolean r0 = r6.hasNext()
                        if (r0 == 0) goto L7d
                        java.lang.Object r0 = r6.next()
                        java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                        java.io.File r1 = new java.io.File
                        java.io.File r2 = r5.folder
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.Object r4 = r0.getKey()
                        net.bytebuddy.description.type.TypeDescription r4 = (net.bytebuddy.description.type.TypeDescription) r4
                        java.lang.String r4 = r4.getInternalName()
                        r3.append(r4)
                        java.lang.String r4 = ".class"
                        r3.append(r4)
                        java.lang.String r3 = r3.toString()
                        r1.<init>(r2, r3)
                        java.io.File r2 = r1.getParentFile()
                        boolean r2 = r2.isDirectory()
                        if (r2 != 0) goto L66
                        java.io.File r2 = r1.getParentFile()
                        boolean r2 = r2.mkdirs()
                        if (r2 == 0) goto L4b
                        goto L66
                    L4b:
                        java.io.IOException r6 = new java.io.IOException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r2 = "Could not create directory: "
                        r0.append(r2)
                        java.lang.String r1 = r1.getParent()
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        r6.<init>(r0)
                        throw r6
                    L66:
                        java.io.FileOutputStream r2 = new java.io.FileOutputStream
                        r2.<init>(r1)
                        java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L78
                        byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L78
                        r2.write(r0)     // Catch: java.lang.Throwable -> L78
                        r2.close()
                        goto L8
                    L78:
                        r6 = move-exception
                        r2.close()
                        throw r6
                    L7d:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target
                public net.bytebuddy.build.Plugin.Engine.Target.Sink write(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r4) throws java.io.IOException {
                        r3 = this;
                        if (r4 == 0) goto L4c
                        java.io.File r0 = new java.io.File
                        java.io.File r1 = r3.folder
                        java.lang.String r2 = "META-INF/MANIFEST.MF"
                        r0.<init>(r1, r2)
                        java.io.File r1 = r0.getParentFile()
                        boolean r1 = r1.isDirectory()
                        if (r1 != 0) goto L3b
                        java.io.File r1 = r0.getParentFile()
                        boolean r1 = r1.mkdirs()
                        if (r1 == 0) goto L20
                        goto L3b
                    L20:
                        java.io.IOException r4 = new java.io.IOException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Could not create directory: "
                        r1.append(r2)
                        java.lang.String r0 = r0.getParent()
                        r1.append(r0)
                        java.lang.String r0 = r1.toString()
                        r4.<init>(r0)
                        throw r4
                    L3b:
                        java.io.FileOutputStream r1 = new java.io.FileOutputStream
                        r1.<init>(r0)
                        r4.write(r1)     // Catch: java.lang.Throwable -> L47
                        r1.close()
                        goto L4c
                    L47:
                        r4 = move-exception
                        r1.close()
                        throw r4
                    L4c:
                        return r3
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForJarFile implements net.bytebuddy.build.Plugin.Engine.Target {
                private final java.io.File file;

                public ForJarFile(java.io.File r1) {
                        r0 = this;
                        r0.<init>()
                        r0.file = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.io.File r2 = r4.file
                        net.bytebuddy.build.Plugin$Engine$Target$ForJarFile r5 = (net.bytebuddy.build.Plugin.Engine.Target.ForJarFile) r5
                        java.io.File r5 = r5.file
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.io.File r1 = r2.file
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target
                public net.bytebuddy.build.Plugin.Engine.Target.Sink write(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r5) throws java.io.IOException {
                        r4 = this;
                        if (r5 != 0) goto L14
                        net.bytebuddy.build.Plugin$Engine$Target$Sink$ForJarOutputStream r5 = new net.bytebuddy.build.Plugin$Engine$Target$Sink$ForJarOutputStream
                        java.util.jar.JarOutputStream r0 = new java.util.jar.JarOutputStream
                        java.io.FileOutputStream r1 = new java.io.FileOutputStream
                        java.io.File r2 = r4.file
                        r1.<init>(r2)
                        r0.<init>(r1)
                        r5.<init>(r0)
                        goto L26
                    L14:
                        net.bytebuddy.build.Plugin$Engine$Target$Sink$ForJarOutputStream r0 = new net.bytebuddy.build.Plugin$Engine$Target$Sink$ForJarOutputStream
                        java.util.jar.JarOutputStream r1 = new java.util.jar.JarOutputStream
                        java.io.FileOutputStream r2 = new java.io.FileOutputStream
                        java.io.File r3 = r4.file
                        r2.<init>(r3)
                        r1.<init>(r2, r5)
                        r0.<init>(r1)
                        r5 = r0
                    L26:
                        return r5
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class InMemory implements net.bytebuddy.build.Plugin.Engine.Target, net.bytebuddy.build.Plugin.Engine.Target.Sink {
                private final java.util.Map<java.lang.String, byte[]> storage;

                public InMemory() {
                        r1 = this;
                        java.util.HashMap r0 = new java.util.HashMap
                        r0.<init>()
                        r1.<init>(r0)
                        return
                }

                public InMemory(java.util.Map<java.lang.String, byte[]> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.storage = r1
                        return
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                        r0 = this;
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        java.util.Map<java.lang.String, byte[]> r2 = r4.storage
                        net.bytebuddy.build.Plugin$Engine$Target$InMemory r5 = (net.bytebuddy.build.Plugin.Engine.Target.InMemory) r5
                        java.util.Map<java.lang.String, byte[]> r5 = r5.storage
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public java.util.Map<java.lang.String, byte[]> getStorage() {
                        r1 = this;
                        java.util.Map<java.lang.String, byte[]> r0 = r1.storage
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.util.Map<java.lang.String, byte[]> r1 = r2.storage
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void retain(net.bytebuddy.build.Plugin.Engine.Source.Element r6) throws java.io.IOException {
                        r5 = this;
                        java.lang.String r0 = r6.getName()
                        java.lang.String r1 = "/"
                        boolean r0 = r0.endsWith(r1)
                        if (r0 != 0) goto L45
                        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                        r0.<init>()
                        java.io.InputStream r1 = r6.getInputStream()     // Catch: java.lang.Throwable -> L3b
                        r2 = 1024(0x400, float:1.435E-42)
                        byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L25
                    L19:
                        int r3 = r1.read(r2)     // Catch: java.lang.Throwable -> L25
                        r4 = -1
                        if (r3 == r4) goto L27
                        r4 = 0
                        r0.write(r2, r4, r3)     // Catch: java.lang.Throwable -> L25
                        goto L19
                    L25:
                        r6 = move-exception
                        goto L3d
                    L27:
                        r1.close()     // Catch: java.lang.Throwable -> L3b
                        r0.close()
                        java.util.Map<java.lang.String, byte[]> r1 = r5.storage
                        java.lang.String r6 = r6.getName()
                        byte[] r0 = r0.toByteArray()
                        r1.put(r6, r0)
                        goto L45
                    L3b:
                        r6 = move-exception
                        goto L41
                    L3d:
                        r1.close()     // Catch: java.lang.Throwable -> L3b
                        throw r6     // Catch: java.lang.Throwable -> L3b
                    L41:
                        r0.close()
                        throw r6
                    L45:
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                public void store(java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r5) {
                        r4 = this;
                        java.util.Set r5 = r5.entrySet()
                        java.util.Iterator r5 = r5.iterator()
                    L8:
                        boolean r0 = r5.hasNext()
                        if (r0 == 0) goto L39
                        java.lang.Object r0 = r5.next()
                        java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                        java.util.Map<java.lang.String, byte[]> r1 = r4.storage
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.Object r3 = r0.getKey()
                        net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                        java.lang.String r3 = r3.getInternalName()
                        r2.append(r3)
                        java.lang.String r3 = ".class"
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
                        java.lang.Object r0 = r0.getValue()
                        r1.put(r2, r0)
                        goto L8
                    L39:
                        return
                }

                public java.util.Map<java.lang.String, byte[]> toTypeMap() {
                        r6 = this;
                        java.util.HashMap r0 = new java.util.HashMap
                        r0.<init>()
                        java.util.Map<java.lang.String, byte[]> r1 = r6.storage
                        java.util.Set r1 = r1.entrySet()
                        java.util.Iterator r1 = r1.iterator()
                    Lf:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L50
                        java.lang.Object r2 = r1.next()
                        java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                        java.lang.Object r3 = r2.getKey()
                        java.lang.String r3 = (java.lang.String) r3
                        java.lang.String r4 = ".class"
                        boolean r3 = r3.endsWith(r4)
                        if (r3 == 0) goto Lf
                        java.lang.Object r3 = r2.getKey()
                        java.lang.String r3 = (java.lang.String) r3
                        java.lang.Object r4 = r2.getKey()
                        java.lang.String r4 = (java.lang.String) r4
                        int r4 = r4.length()
                        int r4 = r4 + (-6)
                        r5 = 0
                        java.lang.String r3 = r3.substring(r5, r4)
                        r4 = 47
                        r5 = 46
                        java.lang.String r3 = r3.replace(r4, r5)
                        java.lang.Object r2 = r2.getValue()
                        r0.put(r3, r2)
                        goto Lf
                    L50:
                        return r0
                }

                @Override // net.bytebuddy.build.Plugin.Engine.Target
                public net.bytebuddy.build.Plugin.Engine.Target.Sink write(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r3) throws java.io.IOException {
                        r2 = this;
                        if (r3 == 0) goto L1e
                        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
                        r0.<init>()
                        r3.write(r0)     // Catch: java.lang.Throwable -> L19
                        r0.close()
                        java.util.Map<java.lang.String, byte[]> r3 = r2.storage
                        java.lang.String r1 = "META-INF/MANIFEST.MF"
                        byte[] r0 = r0.toByteArray()
                        r3.put(r1, r0)
                        goto L1e
                    L19:
                        r3 = move-exception
                        r0.close()
                        throw r3
                    L1e:
                        return r2
                }
            }

            public interface Sink extends java.io.Closeable {

                public static class ForJarOutputStream implements net.bytebuddy.build.Plugin.Engine.Target.Sink {
                    private final java.util.jar.JarOutputStream outputStream;

                    public ForJarOutputStream(java.util.jar.JarOutputStream r1) {
                            r0 = this;
                            r0.<init>()
                            r0.outputStream = r1
                            return
                    }

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws java.io.IOException {
                            r1 = this;
                            java.util.jar.JarOutputStream r0 = r1.outputStream
                            r0.close()
                            return
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                    public void retain(net.bytebuddy.build.Plugin.Engine.Source.Element r5) throws java.io.IOException {
                            r4 = this;
                            java.lang.Class<java.util.jar.JarEntry> r0 = java.util.jar.JarEntry.class
                            java.lang.Object r0 = r5.resolveAs(r0)
                            java.util.jar.JarEntry r0 = (java.util.jar.JarEntry) r0
                            java.util.jar.JarOutputStream r1 = r4.outputStream
                            if (r0 != 0) goto L15
                            java.util.jar.JarEntry r0 = new java.util.jar.JarEntry
                            java.lang.String r2 = r5.getName()
                            r0.<init>(r2)
                        L15:
                            r1.putNextEntry(r0)
                            java.io.InputStream r5 = r5.getInputStream()
                            r0 = 1024(0x400, float:1.435E-42)
                            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L2e
                        L20:
                            int r1 = r5.read(r0)     // Catch: java.lang.Throwable -> L2e
                            r2 = -1
                            if (r1 == r2) goto L30
                            java.util.jar.JarOutputStream r2 = r4.outputStream     // Catch: java.lang.Throwable -> L2e
                            r3 = 0
                            r2.write(r0, r3, r1)     // Catch: java.lang.Throwable -> L2e
                            goto L20
                        L2e:
                            r0 = move-exception
                            goto L39
                        L30:
                            r5.close()
                            java.util.jar.JarOutputStream r5 = r4.outputStream
                            r5.closeEntry()
                            return
                        L39:
                            r5.close()
                            throw r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Engine.Target.Sink
                    public void store(java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r6) throws java.io.IOException {
                            r5 = this;
                            java.util.Set r6 = r6.entrySet()
                            java.util.Iterator r6 = r6.iterator()
                        L8:
                            boolean r0 = r6.hasNext()
                            if (r0 == 0) goto L4a
                            java.lang.Object r0 = r6.next()
                            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                            java.util.jar.JarOutputStream r1 = r5.outputStream
                            java.util.jar.JarEntry r2 = new java.util.jar.JarEntry
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.Object r4 = r0.getKey()
                            net.bytebuddy.description.type.TypeDescription r4 = (net.bytebuddy.description.type.TypeDescription) r4
                            java.lang.String r4 = r4.getInternalName()
                            r3.append(r4)
                            java.lang.String r4 = ".class"
                            r3.append(r4)
                            java.lang.String r3 = r3.toString()
                            r2.<init>(r3)
                            r1.putNextEntry(r2)
                            java.util.jar.JarOutputStream r1 = r5.outputStream
                            java.lang.Object r0 = r0.getValue()
                            byte[] r0 = (byte[]) r0
                            r1.write(r0)
                            java.util.jar.JarOutputStream r0 = r5.outputStream
                            r0.closeEntry()
                            goto L8
                        L4a:
                            return
                    }
                }

                void retain(net.bytebuddy.build.Plugin.Engine.Source.Element r1) throws java.io.IOException;

                void store(java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> r1) throws java.io.IOException;
            }

            net.bytebuddy.build.Plugin.Engine.Target.Sink write(@net.bytebuddy.utility.nullability.MaybeNull java.util.jar.Manifest r1) throws java.io.IOException;
        }

        public interface TypeStrategy {

            public enum Default extends java.lang.Enum<net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default> implements net.bytebuddy.build.Plugin.Engine.TypeStrategy {
                private static final /* synthetic */ net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default[] $VALUES = null;
                public static final net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default DECORATE = null;
                public static final net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default REBASE = null;
                public static final net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default REDEFINE = null;




                static {
                        net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default$1 r0 = new net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default$1
                        java.lang.String r1 = "REDEFINE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.REDEFINE = r0
                        net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default$2 r1 = new net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default$2
                        java.lang.String r3 = "REBASE"
                        r4 = 1
                        r1.<init>(r3, r4)
                        net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.REBASE = r1
                        net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default$3 r3 = new net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default$3
                        java.lang.String r5 = "DECORATE"
                        r6 = 2
                        r3.<init>(r5, r6)
                        net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.DECORATE = r3
                        r5 = 3
                        net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default[] r5 = new net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default[r5]
                        r5[r2] = r0
                        r5[r4] = r1
                        r5[r6] = r3
                        net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.$VALUES = r5
                        return
                }

                Default(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.build.Plugin.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default> r0 = net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default r1 = (net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default) r1
                        return r1
                }

                public static net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default[] values() {
                        net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default[] r0 = net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.build.Plugin$Engine$TypeStrategy$Default[] r0 = (net.bytebuddy.build.Plugin.Engine.TypeStrategy.Default[]) r0
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForEntryPoint implements net.bytebuddy.build.Plugin.Engine.TypeStrategy {
                private final net.bytebuddy.build.EntryPoint entryPoint;
                private final net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer methodNameTransformer;

                public ForEntryPoint(net.bytebuddy.build.EntryPoint r1, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r2) {
                        r0 = this;
                        r0.<init>()
                        r0.entryPoint = r1
                        r0.methodNameTransformer = r2
                        return
                }

                @Override // net.bytebuddy.build.Plugin.Engine.TypeStrategy
                public net.bytebuddy.dynamic.DynamicType.Builder<?> builder(net.bytebuddy.ByteBuddy r3, net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.dynamic.ClassFileLocator r5) {
                        r2 = this;
                        net.bytebuddy.build.EntryPoint r0 = r2.entryPoint
                        net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r1 = r2.methodNameTransformer
                        net.bytebuddy.dynamic.DynamicType$Builder r3 = r0.transform(r4, r3, r5, r1)
                        return r3
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        net.bytebuddy.build.EntryPoint r2 = r4.entryPoint
                        net.bytebuddy.build.Plugin$Engine$TypeStrategy$ForEntryPoint r5 = (net.bytebuddy.build.Plugin.Engine.TypeStrategy.ForEntryPoint) r5
                        net.bytebuddy.build.EntryPoint r3 = r5.entryPoint
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r2 = r4.methodNameTransformer
                        net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r5 = r5.methodNameTransformer
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.build.EntryPoint r1 = r2.entryPoint
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r1 = r2.methodNameTransformer
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            net.bytebuddy.dynamic.DynamicType.Builder<?> builder(net.bytebuddy.ByteBuddy r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.ClassFileLocator r3);
        }

        net.bytebuddy.build.Plugin.Engine.Summary apply(java.io.File r1, java.io.File r2, java.util.List<? extends net.bytebuddy.build.Plugin.Factory> r3) throws java.io.IOException;

        net.bytebuddy.build.Plugin.Engine.Summary apply(java.io.File r1, java.io.File r2, net.bytebuddy.build.Plugin.Factory... r3) throws java.io.IOException;

        net.bytebuddy.build.Plugin.Engine.Summary apply(net.bytebuddy.build.Plugin.Engine.Source r1, net.bytebuddy.build.Plugin.Engine.Target r2, java.util.List<? extends net.bytebuddy.build.Plugin.Factory> r3) throws java.io.IOException;

        net.bytebuddy.build.Plugin.Engine.Summary apply(net.bytebuddy.build.Plugin.Engine.Source r1, net.bytebuddy.build.Plugin.Engine.Target r2, net.bytebuddy.build.Plugin.Factory... r3) throws java.io.IOException;

        net.bytebuddy.build.Plugin.Engine ignore(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1);

        net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.ByteBuddy r1);

        net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.build.Plugin.Engine.Dispatcher.Factory r1);

        net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.build.Plugin.Engine.Listener r1);

        net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.build.Plugin.Engine.PoolStrategy r1);

        net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.build.Plugin.Engine.TypeStrategy r1);

        net.bytebuddy.build.Plugin.Engine with(net.bytebuddy.dynamic.ClassFileLocator r1);

        net.bytebuddy.build.Plugin.Engine withErrorHandlers(java.util.List<? extends net.bytebuddy.build.Plugin.Engine.ErrorHandler> r1);

        net.bytebuddy.build.Plugin.Engine withErrorHandlers(net.bytebuddy.build.Plugin.Engine.ErrorHandler... r1);

        net.bytebuddy.build.Plugin.Engine withParallelTransformation(int r1);

        net.bytebuddy.build.Plugin.Engine withoutErrorHandlers();
    }

    public interface Factory {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements net.bytebuddy.build.Plugin.Factory {
            private final net.bytebuddy.build.Plugin plugin;

            public Simple(net.bytebuddy.build.Plugin r1) {
                    r0 = this;
                    r0.<init>()
                    r0.plugin = r1
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    net.bytebuddy.build.Plugin r2 = r4.plugin
                    net.bytebuddy.build.Plugin$Factory$Simple r5 = (net.bytebuddy.build.Plugin.Factory.Simple) r5
                    net.bytebuddy.build.Plugin r5 = r5.plugin
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.build.Plugin r1 = r2.plugin
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.build.Plugin.Factory
            public net.bytebuddy.build.Plugin make() {
                    r1 = this;
                    net.bytebuddy.build.Plugin r0 = r1.plugin
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class UsingReflection implements net.bytebuddy.build.Plugin.Factory {
            private final java.util.List<net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver> argumentResolvers;
            private final java.lang.Class<? extends net.bytebuddy.build.Plugin> type;

            public interface ArgumentResolver {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForIndex implements net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver {
                    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> WRAPPER_TYPES = null;
                    private final int index;

                    @net.bytebuddy.utility.nullability.MaybeNull
                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                    private final java.lang.Object value;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class WithDynamicType implements net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver {
                        private final int index;

                        @net.bytebuddy.utility.nullability.MaybeNull
                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                        private final java.lang.String value;

                        public WithDynamicType(int r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2) {
                                r0 = this;
                                r0.<init>()
                                r0.index = r1
                                r0.value = r2
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                int r2 = r4.index
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType r5 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.ForIndex.WithDynamicType) r5
                                int r3 = r5.index
                                if (r2 == r3) goto L1c
                                return r1
                            L1c:
                                java.lang.String r2 = r4.value
                                java.lang.String r5 = r5.value
                                if (r5 == 0) goto L2b
                                if (r2 == 0) goto L2d
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L2e
                                return r1
                            L2b:
                                if (r2 == 0) goto L2e
                            L2d:
                                return r1
                            L2e:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                int r1 = r2.index
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                java.lang.String r1 = r2.value
                                if (r1 == 0) goto L18
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                            L18:
                                return r0
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver
                        public net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution resolve(int r3, java.lang.Class<?> r4) {
                                r2 = this;
                                int r0 = r2.index
                                if (r0 == r3) goto L7
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r3 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE
                                return r3
                            L7:
                                java.lang.Class r3 = java.lang.Character.TYPE
                                if (r4 == r3) goto L75
                                java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
                                if (r4 != r3) goto L10
                                goto L75
                            L10:
                                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                                if (r4 != r3) goto L1c
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved r3 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved
                                java.lang.String r4 = r2.value
                                r3.<init>(r4)
                                return r3
                            L1c:
                                boolean r0 = r4.isPrimitive()
                                if (r0 == 0) goto L2c
                                java.util.Map r0 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.ForIndex.access$000()
                                java.lang.Object r4 = r0.get(r4)
                                java.lang.Class r4 = (java.lang.Class) r4
                            L2c:
                                java.lang.String r0 = "valueOf"
                                java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                java.lang.reflect.Method r3 = r4.getMethod(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                int r0 = r3.getModifiers()     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                if (r0 == 0) goto L5f
                                java.lang.Class r0 = r3.getReturnType()     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                boolean r4 = r4.isAssignableFrom(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                if (r4 == 0) goto L5f
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved r4 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                java.lang.String r0 = r2.value     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                r1 = 0
                                java.lang.Object r3 = r3.invoke(r1, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                r4.<init>(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                                goto L61
                            L5b:
                                r3 = move-exception
                                goto L65
                            L5d:
                                r3 = move-exception
                                goto L6f
                            L5f:
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r4 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE     // Catch: java.lang.reflect.InvocationTargetException -> L5b java.lang.IllegalAccessException -> L5d java.lang.NoSuchMethodException -> L62
                            L61:
                                return r4
                            L62:
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r3 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE
                                return r3
                            L65:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                java.lang.Throwable r3 = r3.getTargetException()
                                r4.<init>(r3)
                                throw r4
                            L6f:
                                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                r4.<init>(r3)
                                throw r4
                            L75:
                                java.lang.String r3 = r2.value
                                if (r3 == 0) goto L91
                                int r3 = r3.length()
                                r4 = 1
                                if (r3 != r4) goto L91
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved r3 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved
                                java.lang.String r4 = r2.value
                                r0 = 0
                                char r4 = r4.charAt(r0)
                                java.lang.Character r4 = java.lang.Character.valueOf(r4)
                                r3.<init>(r4)
                                goto L93
                            L91:
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r3 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE
                            L93:
                                return r3
                        }
                    }

                    static {
                            java.util.HashMap r0 = new java.util.HashMap
                            r0.<init>()
                            net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.ForIndex.WRAPPER_TYPES = r0
                            java.lang.Class r1 = java.lang.Boolean.TYPE
                            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                            r0.put(r1, r2)
                            java.lang.Class r1 = java.lang.Byte.TYPE
                            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
                            r0.put(r1, r2)
                            java.lang.Class r1 = java.lang.Short.TYPE
                            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
                            r0.put(r1, r2)
                            java.lang.Class r1 = java.lang.Character.TYPE
                            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
                            r0.put(r1, r2)
                            java.lang.Class r1 = java.lang.Integer.TYPE
                            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
                            r0.put(r1, r2)
                            java.lang.Class r1 = java.lang.Long.TYPE
                            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
                            r0.put(r1, r2)
                            java.lang.Class r1 = java.lang.Float.TYPE
                            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
                            r0.put(r1, r2)
                            java.lang.Class r1 = java.lang.Double.TYPE
                            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
                            r0.put(r1, r2)
                            return
                    }

                    public ForIndex(int r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                            r0 = this;
                            r0.<init>()
                            r0.index = r1
                            r0.value = r2
                            return
                    }

                    public static /* synthetic */ java.util.Map access$000() {
                            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.ForIndex.WRAPPER_TYPES
                            return r0
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            int r2 = r4.index
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex r5 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.ForIndex) r5
                            int r3 = r5.index
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            java.lang.Object r2 = r4.value
                            java.lang.Object r5 = r5.value
                            if (r5 == 0) goto L2b
                            if (r2 == 0) goto L2d
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2e
                            return r1
                        L2b:
                            if (r2 == 0) goto L2e
                        L2d:
                            return r1
                        L2e:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            int r1 = r2.index
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.lang.Object r1 = r2.value
                            if (r1 == 0) goto L18
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                        L18:
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver
                    public net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution resolve(int r2, java.lang.Class<?> r3) {
                            r1 = this;
                            int r0 = r1.index
                            if (r0 == r2) goto L7
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r2 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE
                            return r2
                        L7:
                            boolean r2 = r3.isPrimitive()
                            if (r2 == 0) goto L28
                            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r2 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.ForIndex.WRAPPER_TYPES
                            java.lang.Object r2 = r2.get(r3)
                            java.lang.Class r2 = (java.lang.Class) r2
                            java.lang.Object r3 = r1.value
                            boolean r2 = r2.isInstance(r3)
                            if (r2 == 0) goto L25
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved r2 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved
                            java.lang.Object r3 = r1.value
                            r2.<init>(r3)
                            goto L27
                        L25:
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r2 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE
                        L27:
                            return r2
                        L28:
                            java.lang.Object r2 = r1.value
                            if (r2 == 0) goto L36
                            boolean r2 = r3.isInstance(r2)
                            if (r2 == 0) goto L33
                            goto L36
                        L33:
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r2 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE
                            goto L3d
                        L36:
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved r2 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved
                            java.lang.Object r3 = r1.value
                            r2.<init>(r3)
                        L3d:
                            return r2
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForType<T> implements net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver {
                    private final java.lang.Class<? extends T> type;
                    private final T value;

                    public ForType(java.lang.Class<? extends T> r1, T r2) {
                            r0 = this;
                            r0.<init>()
                            r0.type = r1
                            r0.value = r2
                            return
                    }

                    public static <S> net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver of(java.lang.Class<? extends S> r1, S r2) {
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$ForType r0 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$ForType
                            r0.<init>(r1, r2)
                            return r0
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.Class<? extends T> r2 = r4.type
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$ForType r5 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.ForType) r5
                            java.lang.Class<? extends T> r3 = r5.type
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            T r2 = r4.value
                            T r5 = r5.value
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.Class<? extends T> r1 = r2.type
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            T r1 = r2.value
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver
                    public net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution resolve(int r1, java.lang.Class<?> r2) {
                            r0 = this;
                            java.lang.Class<? extends T> r1 = r0.type
                            if (r2 != r1) goto Lc
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved r1 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved
                            T r2 = r0.value
                            r1.<init>(r2)
                            goto Le
                        Lc:
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r1 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE
                        Le:
                            return r1
                    }
                }

                public enum NoOp extends java.lang.Enum<net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp> implements net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver {
                    private static final /* synthetic */ net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp[] $VALUES = null;
                    public static final net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp INSTANCE = null;

                    static {
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$NoOp r0 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$NoOp
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp.INSTANCE = r0
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$NoOp[] r0 = new net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp[]{r0}
                            net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp.$VALUES = r0
                            return
                    }

                    NoOp(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$NoOp> r0 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$NoOp r1 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp) r1
                            return r1
                    }

                    public static net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp[] values() {
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$NoOp[] r0 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$NoOp[] r0 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.NoOp[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver
                    public net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution resolve(int r1, java.lang.Class<?> r2) {
                            r0 = this;
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r1 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE
                            return r1
                    }
                }

                public interface Resolution {

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Resolved implements net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution {

                        @net.bytebuddy.utility.nullability.MaybeNull
                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                        private final java.lang.Object argument;

                        public Resolved(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r1) {
                                r0 = this;
                                r0.<init>()
                                r0.argument = r1
                                return
                        }

                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                                r4 = this;
                                r0 = 1
                                if (r4 != r5) goto L4
                                return r0
                            L4:
                                r1 = 0
                                if (r5 != 0) goto L8
                                return r1
                            L8:
                                java.lang.Class r2 = r4.getClass()
                                java.lang.Class r3 = r5.getClass()
                                if (r2 == r3) goto L13
                                return r1
                            L13:
                                java.lang.Object r2 = r4.argument
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved r5 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Resolved) r5
                                java.lang.Object r5 = r5.argument
                                if (r5 == 0) goto L24
                                if (r2 == 0) goto L26
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L27
                                return r1
                            L24:
                                if (r2 == 0) goto L27
                            L26:
                                return r1
                            L27:
                                return r0
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution
                        @net.bytebuddy.utility.nullability.MaybeNull
                        public java.lang.Object getArgument() {
                                r1 = this;
                                java.lang.Object r0 = r1.argument
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                java.lang.Object r1 = r2.argument
                                if (r1 == 0) goto L13
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                            L13:
                                return r0
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution
                        public boolean isResolved() {
                                r1 = this;
                                r0 = 1
                                return r0
                        }
                    }

                    public enum Unresolved extends java.lang.Enum<net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved> implements net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution {
                        private static final /* synthetic */ net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved[] $VALUES = null;
                        public static final net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved INSTANCE = null;

                        static {
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r0 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved
                                java.lang.String r1 = "INSTANCE"
                                r2 = 0
                                r0.<init>(r1, r2)
                                net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.INSTANCE = r0
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved[] r0 = new net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved[]{r0}
                                net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.$VALUES = r0
                                return
                        }

                        Unresolved(java.lang.String r1, int r2) {
                                r0 = this;
                                r0.<init>(r1, r2)
                                return
                        }

                        public static net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved valueOf(java.lang.String r1) {
                                java.lang.Class<net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved> r0 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.class
                                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved r1 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved) r1
                                return r1
                        }

                        public static net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved[] values() {
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved[] r0 = net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved.$VALUES
                                java.lang.Object r0 = r0.clone()
                                net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved[] r0 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution.Unresolved[]) r0
                                return r0
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution
                        public java.lang.Object getArgument() {
                                r2 = this;
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.String r1 = "Cannot get the argument for an unresolved parameter"
                                r0.<init>(r1)
                                throw r0
                        }

                        @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution
                        public boolean isResolved() {
                                r1 = this;
                                r0 = 0
                                return r0
                        }
                    }

                    @net.bytebuddy.utility.nullability.MaybeNull
                    java.lang.Object getArgument();

                    boolean isResolved();
                }

                net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver.Resolution resolve(int r1, java.lang.Class<?> r2);
            }

            public interface Instantiator {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Ambiguous implements net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator {
                    private final java.lang.reflect.Constructor<?> left;
                    private final int parameters;
                    private final int priority;
                    private final java.lang.reflect.Constructor<?> right;

                    public Ambiguous(java.lang.reflect.Constructor<?> r1, java.lang.reflect.Constructor<?> r2, int r3, int r4) {
                            r0 = this;
                            r0.<init>()
                            r0.left = r1
                            r0.right = r2
                            r0.priority = r3
                            r0.parameters = r4
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            int r2 = r4.priority
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Ambiguous r5 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator.Ambiguous) r5
                            int r3 = r5.priority
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            int r2 = r4.parameters
                            int r3 = r5.parameters
                            if (r2 == r3) goto L23
                            return r1
                        L23:
                            java.lang.reflect.Constructor<?> r2 = r4.left
                            java.lang.reflect.Constructor<?> r3 = r5.left
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2e
                            return r1
                        L2e:
                            java.lang.reflect.Constructor<?> r2 = r4.right
                            java.lang.reflect.Constructor<?> r5 = r5.right
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L39
                            return r1
                        L39:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.reflect.Constructor<?> r1 = r2.left
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.lang.reflect.Constructor<?> r1 = r2.right
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            int r1 = r2.priority
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            int r1 = r2.parameters
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public net.bytebuddy.build.Plugin instantiate() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Ambiguous constructors "
                            r1.append(r2)
                            java.lang.reflect.Constructor<?> r2 = r3.left
                            r1.append(r2)
                            java.lang.String r2 = " and "
                            r1.append(r2)
                            java.lang.reflect.Constructor<?> r2 = r3.right
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator replaceBy(net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator.Resolved r5) {
                            r4 = this;
                            java.lang.reflect.Constructor r0 = r5.getConstructor()
                            java.lang.Class<net.bytebuddy.build.Plugin$Factory$UsingReflection$Priority> r1 = net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority.class
                            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$Priority r0 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority) r0
                            r1 = 0
                            if (r0 != 0) goto L11
                            r2 = r1
                            goto L15
                        L11:
                            int r2 = r0.value()
                        L15:
                            int r3 = r4.priority
                            if (r2 <= r3) goto L1a
                            return r5
                        L1a:
                            if (r0 != 0) goto L1d
                            goto L21
                        L1d:
                            int r1 = r0.value()
                        L21:
                            int r0 = r4.priority
                            if (r1 >= r0) goto L26
                            return r4
                        L26:
                            java.lang.reflect.Constructor r0 = r5.getConstructor()
                            java.lang.Class[] r0 = r0.getParameterTypes()
                            int r0 = r0.length
                            int r1 = r4.parameters
                            if (r0 <= r1) goto L34
                            return r5
                        L34:
                            return r4
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Resolved implements net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator {
                    private final java.util.List<?> arguments;
                    private final java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> constructor;

                    public Resolved(java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r1, java.util.List<?> r2) {
                            r0 = this;
                            r0.<init>()
                            r0.constructor = r1
                            r0.arguments = r2
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r2 = r4.constructor
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Resolved r5 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator.Resolved) r5
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r3 = r5.constructor
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            java.util.List<?> r2 = r4.arguments
                            java.util.List<?> r5 = r5.arguments
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> getConstructor() {
                            r1 = this;
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r0 = r1.constructor
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r1 = r2.constructor
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.util.List<?> r1 = r2.arguments
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public net.bytebuddy.build.Plugin instantiate() {
                            r4 = this;
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r0 = r4.constructor     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L16
                            java.util.List<?> r1 = r4.arguments     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L16
                            r2 = 0
                            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L16
                            java.lang.Object[] r1 = r1.toArray(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L16
                            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L16
                            net.bytebuddy.build.Plugin r0 = (net.bytebuddy.build.Plugin) r0     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L14 java.lang.InstantiationException -> L16
                            return r0
                        L12:
                            r0 = move-exception
                            goto L18
                        L14:
                            r0 = move-exception
                            goto L35
                        L16:
                            r0 = move-exception
                            goto L4e
                        L18:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Error during construction of"
                            r2.append(r3)
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r3 = r4.constructor
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            java.lang.Throwable r0 = r0.getTargetException()
                            r1.<init>(r2, r0)
                            throw r1
                        L35:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Failed to access "
                            r2.append(r3)
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r3 = r4.constructor
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2, r0)
                            throw r1
                        L4e:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Failed to instantiate plugin via "
                            r2.append(r3)
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r3 = r4.constructor
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2, r0)
                            throw r1
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator replaceBy(net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator.Resolved r5) {
                            r4 = this;
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r0 = r4.constructor
                            java.lang.Class<net.bytebuddy.build.Plugin$Factory$UsingReflection$Priority> r1 = net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority.class
                            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$Priority r0 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority) r0
                            java.lang.reflect.Constructor r2 = r5.getConstructor()
                            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$Priority r1 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority) r1
                            r2 = 0
                            if (r0 != 0) goto L19
                            r0 = r2
                            goto L1d
                        L19:
                            int r0 = r0.value()
                        L1d:
                            if (r1 != 0) goto L20
                            goto L24
                        L20:
                            int r2 = r1.value()
                        L24:
                            if (r0 <= r2) goto L27
                            return r4
                        L27:
                            if (r0 >= r2) goto L2a
                            return r5
                        L2a:
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r1 = r4.constructor
                            java.lang.Class[] r1 = r1.getParameterTypes()
                            int r1 = r1.length
                            java.lang.reflect.Constructor r2 = r5.getConstructor()
                            java.lang.Class[] r2 = r2.getParameterTypes()
                            int r2 = r2.length
                            if (r1 <= r2) goto L3d
                            return r4
                        L3d:
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r1 = r4.constructor
                            java.lang.Class[] r1 = r1.getParameterTypes()
                            int r1 = r1.length
                            java.lang.reflect.Constructor r2 = r5.getConstructor()
                            java.lang.Class[] r2 = r2.getParameterTypes()
                            int r2 = r2.length
                            if (r1 >= r2) goto L50
                            return r5
                        L50:
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Ambiguous r1 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Ambiguous
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r2 = r4.constructor
                            java.lang.reflect.Constructor r5 = r5.getConstructor()
                            java.lang.reflect.Constructor<? extends net.bytebuddy.build.Plugin> r3 = r4.constructor
                            java.lang.Class[] r3 = r3.getParameterTypes()
                            int r3 = r3.length
                            r1.<init>(r2, r5, r0, r3)
                            return r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Unresolved implements net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator {
                    private final java.lang.Class<? extends net.bytebuddy.build.Plugin> type;

                    public Unresolved(java.lang.Class<? extends net.bytebuddy.build.Plugin> r1) {
                            r0 = this;
                            r0.<init>()
                            r0.type = r1
                            return
                    }

                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                            r4 = this;
                            r0 = 1
                            if (r4 != r5) goto L4
                            return r0
                        L4:
                            r1 = 0
                            if (r5 != 0) goto L8
                            return r1
                        L8:
                            java.lang.Class r2 = r4.getClass()
                            java.lang.Class r3 = r5.getClass()
                            if (r2 == r3) goto L13
                            return r1
                        L13:
                            java.lang.Class<? extends net.bytebuddy.build.Plugin> r2 = r4.type
                            net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Unresolved r5 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator.Unresolved) r5
                            java.lang.Class<? extends net.bytebuddy.build.Plugin> r5 = r5.type
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L20
                            return r1
                        L20:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            java.lang.Class<? extends net.bytebuddy.build.Plugin> r1 = r2.type
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public net.bytebuddy.build.Plugin instantiate() {
                            r3 = this;
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "No constructor resolvable for "
                            r1.append(r2)
                            java.lang.Class<? extends net.bytebuddy.build.Plugin> r2 = r3.type
                            r1.append(r2)
                            java.lang.String r1 = r1.toString()
                            r0.<init>(r1)
                            throw r0
                    }

                    @Override // net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator
                    public net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator replaceBy(net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator.Resolved r1) {
                            r0 = this;
                            return r1
                    }
                }

                net.bytebuddy.build.Plugin instantiate();

                net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator replaceBy(net.bytebuddy.build.Plugin.Factory.UsingReflection.Instantiator.Resolved r1);
            }

            @java.lang.annotation.Target({java.lang.annotation.ElementType.CONSTRUCTOR})
            @java.lang.annotation.Documented
            @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
            public @interface Priority {
                public static final int DEFAULT = 0;

                int value();
            }

            public UsingReflection(java.lang.Class<? extends net.bytebuddy.build.Plugin> r2) {
                    r1 = this;
                    java.util.List r0 = java.util.Collections.emptyList()
                    r1.<init>(r2, r0)
                    return
            }

            public UsingReflection(java.lang.Class<? extends net.bytebuddy.build.Plugin> r1, java.util.List<net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.type = r1
                    r0.argumentResolvers = r2
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    java.lang.Class<? extends net.bytebuddy.build.Plugin> r2 = r4.type
                    net.bytebuddy.build.Plugin$Factory$UsingReflection r5 = (net.bytebuddy.build.Plugin.Factory.UsingReflection) r5
                    java.lang.Class<? extends net.bytebuddy.build.Plugin> r3 = r5.type
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.List<net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver> r2 = r4.argumentResolvers
                    java.util.List<net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver> r5 = r5.argumentResolvers
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.lang.Class<? extends net.bytebuddy.build.Plugin> r1 = r2.type
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver> r1 = r2.argumentResolvers
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.build.Plugin.Factory
            public net.bytebuddy.build.Plugin make() {
                    r15 = this;
                    net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Unresolved r0 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Unresolved
                    java.lang.Class<? extends net.bytebuddy.build.Plugin> r1 = r15.type
                    r0.<init>(r1)
                    java.lang.Class<? extends net.bytebuddy.build.Plugin> r1 = r15.type
                    java.lang.reflect.Constructor[] r1 = r1.getConstructors()
                    int r2 = r1.length
                    r3 = 0
                    r4 = r3
                L10:
                    if (r4 >= r2) goto L63
                    r5 = r1[r4]
                    boolean r6 = r5.isSynthetic()
                    if (r6 != 0) goto L60
                    java.util.ArrayList r6 = new java.util.ArrayList
                    java.lang.Class[] r7 = r5.getParameterTypes()
                    int r7 = r7.length
                    r6.<init>(r7)
                    java.lang.Class[] r7 = r5.getParameterTypes()
                    int r8 = r7.length
                    r9 = r3
                    r10 = r9
                L2b:
                    if (r9 >= r8) goto L57
                    r11 = r7[r9]
                    java.util.List<net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver> r12 = r15.argumentResolvers
                    java.util.Iterator r12 = r12.iterator()
                L35:
                    boolean r13 = r12.hasNext()
                    if (r13 == 0) goto L60
                    java.lang.Object r13 = r12.next()
                    net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver r13 = (net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver) r13
                    net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver$Resolution r13 = r13.resolve(r10, r11)
                    boolean r14 = r13.isResolved()
                    if (r14 == 0) goto L35
                    java.lang.Object r11 = r13.getArgument()
                    r6.add(r11)
                    int r10 = r10 + 1
                    int r9 = r9 + 1
                    goto L2b
                L57:
                    net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Resolved r7 = new net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator$Resolved
                    r7.<init>(r5, r6)
                    net.bytebuddy.build.Plugin$Factory$UsingReflection$Instantiator r0 = r0.replaceBy(r7)
                L60:
                    int r4 = r4 + 1
                    goto L10
                L63:
                    net.bytebuddy.build.Plugin r0 = r0.instantiate()
                    return r0
            }

            public net.bytebuddy.build.Plugin.Factory.UsingReflection with(java.util.List<? extends net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver> r4) {
                    r3 = this;
                    net.bytebuddy.build.Plugin$Factory$UsingReflection r0 = new net.bytebuddy.build.Plugin$Factory$UsingReflection
                    java.lang.Class<? extends net.bytebuddy.build.Plugin> r1 = r3.type
                    java.util.List<net.bytebuddy.build.Plugin$Factory$UsingReflection$ArgumentResolver> r2 = r3.argumentResolvers
                    java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r4, r2)
                    r0.<init>(r1, r4)
                    return r0
            }

            public net.bytebuddy.build.Plugin.Factory.UsingReflection with(net.bytebuddy.build.Plugin.Factory.UsingReflection.ArgumentResolver... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.build.Plugin$Factory$UsingReflection r1 = r0.with(r1)
                    return r1
            }
        }

        net.bytebuddy.build.Plugin make();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static abstract class ForElementMatcher implements net.bytebuddy.build.Plugin {
        private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> matcher;

        public ForElementMatcher(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1) {
                r0 = this;
                r0.<init>()
                r0.matcher = r1
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r2 = r4.matcher
                net.bytebuddy.build.Plugin$ForElementMatcher r5 = (net.bytebuddy.build.Plugin.ForElementMatcher) r5
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r5 = r5.matcher
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1 = r2.matcher
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.ElementMatcher
        public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = r0.matches2(r1)
                return r1
        }

        /* JADX INFO: renamed from: matches, reason: avoid collision after fix types in other method */
        public boolean matches2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r0 = r1.matcher
                boolean r2 = r0.matches(r2)
                return r2
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class NoOp implements net.bytebuddy.build.Plugin, net.bytebuddy.build.Plugin.Factory {
        public NoOp() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.build.Plugin
        public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.ClassFileLocator r3) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Cannot apply non-operational plugin"
                r1.<init>(r2)
                throw r1
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                r1 = 0
                if (r4 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r3.getClass()
                java.lang.Class r4 = r4.getClass()
                if (r2 == r4) goto L13
                return r1
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class r0 = r1.getClass()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.build.Plugin.Factory
        public net.bytebuddy.build.Plugin make() {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.matcher.ElementMatcher
        public /* bridge */ /* synthetic */ boolean matches(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = r0.matches2(r1)
                return r1
        }

        /* JADX INFO: renamed from: matches, reason: avoid collision after fix types in other method */
        public boolean matches2(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public interface WithInitialization extends net.bytebuddy.build.Plugin {
        java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> initialize(net.bytebuddy.dynamic.ClassFileLocator r1);
    }

    public interface WithPreprocessor extends net.bytebuddy.build.Plugin {
        void onPreprocess(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.ClassFileLocator r2);
    }

    net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.ClassFileLocator r3);
}
