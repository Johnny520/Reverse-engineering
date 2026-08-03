package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleRequestManagerRetriever {

    @Yue.InterfaceC4410
    private final com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory factory;
    final java.util.Map<androidx.lifecycle.Lifecycle, com.bumptech.glide.RequestManager> lifecycleToRequestManager;


    public final class SupportRequestManagerTreeNode implements com.bumptech.glide.manager.RequestManagerTreeNode {
        private final androidx.fragment.app.FragmentManager childFragmentManager;
        final /* synthetic */ com.bumptech.glide.manager.LifecycleRequestManagerRetriever this$0;

        public SupportRequestManagerTreeNode(com.bumptech.glide.manager.LifecycleRequestManagerRetriever r1, androidx.fragment.app.FragmentManager r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.childFragmentManager = r2
                return
        }

        private void getChildFragmentsRecursive(androidx.fragment.app.FragmentManager r5, java.util.Set<com.bumptech.glide.RequestManager> r6) {
                r4 = this;
                java.util.List r5 = r5.m29162()
                int r0 = r5.size()
                r1 = 0
            L9:
                if (r1 >= r0) goto L2a
                java.lang.Object r2 = r5.get(r1)
                androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
                androidx.fragment.app.FragmentManager r3 = r2.getChildFragmentManager()
                r4.getChildFragmentsRecursive(r3, r6)
                com.bumptech.glide.manager.LifecycleRequestManagerRetriever r3 = r4.this$0
                androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
                com.bumptech.glide.RequestManager r2 = r3.getOnly(r2)
                if (r2 == 0) goto L27
                r6.add(r2)
            L27:
                int r1 = r1 + 1
                goto L9
            L2a:
                return
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        @Yue.InterfaceC4410
        public java.util.Set<com.bumptech.glide.RequestManager> getDescendants() {
                r2 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                androidx.fragment.app.FragmentManager r1 = r2.childFragmentManager
                r2.getChildFragmentsRecursive(r1, r0)
                return r0
        }
    }

    public LifecycleRequestManagerRetriever(@Yue.InterfaceC4410 com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.lifecycleToRequestManager = r0
            r1.factory = r2
            return
    }

    public com.bumptech.glide.RequestManager getOnly(androidx.lifecycle.Lifecycle r2) {
            r1 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            java.util.Map<androidx.lifecycle.Lifecycle, com.bumptech.glide.RequestManager> r0 = r1.lifecycleToRequestManager
            java.lang.Object r2 = r0.get(r2)
            com.bumptech.glide.RequestManager r2 = (com.bumptech.glide.RequestManager) r2
            return r2
    }

    public com.bumptech.glide.RequestManager getOrCreate(android.content.Context r4, com.bumptech.glide.Glide r5, androidx.lifecycle.Lifecycle r6, androidx.fragment.app.FragmentManager r7, boolean r8) {
            r3 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            com.bumptech.glide.RequestManager r0 = r3.getOnly(r6)
            if (r0 != 0) goto L2c
            com.bumptech.glide.manager.LifecycleLifecycle r0 = new com.bumptech.glide.manager.LifecycleLifecycle
            r0.<init>(r6)
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r1 = r3.factory
            com.bumptech.glide.manager.LifecycleRequestManagerRetriever$SupportRequestManagerTreeNode r2 = new com.bumptech.glide.manager.LifecycleRequestManagerRetriever$SupportRequestManagerTreeNode
            r2.<init>(r3, r7)
            com.bumptech.glide.RequestManager r4 = r1.build(r5, r0, r2, r4)
            java.util.Map<androidx.lifecycle.Lifecycle, com.bumptech.glide.RequestManager> r5 = r3.lifecycleToRequestManager
            r5.put(r6, r4)
            com.bumptech.glide.manager.LifecycleRequestManagerRetriever$1 r5 = new com.bumptech.glide.manager.LifecycleRequestManagerRetriever$1
            r5.<init>(r3, r6)
            r0.addListener(r5)
            if (r8 == 0) goto L2b
            r4.onStart()
        L2b:
            r0 = r4
        L2c:
            return r0
    }
}
