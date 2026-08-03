package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f24955 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f24956 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f24957 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f24958 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final java.lang.String f24959 = "ActivityResultRegistry";

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f24960 = 65536;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.Map<java.lang.Integer, java.lang.String> f24961;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.Integer> f24962;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.C7251> f24963;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.String> f24964;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final transient java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.C7250<?>> f24965;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.Object> f24966;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final android.os.Bundle f24967;


    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$ۥ, reason: contains not printable characters */
    public class C7248<I> extends Yue.AbstractC0254<I> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.String f24972;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0221 f24973;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.result.ActivityResultRegistry f24974;

        public C7248(androidx.activity.result.ActivityResultRegistry r1, java.lang.String r2, Yue.AbstractC0221 r3) {
                r0 = this;
                r0.f24974 = r1
                r0.f24972 = r2
                r0.f24973 = r3
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0254
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ */
        public Yue.AbstractC0221<I, ?> mo1198() {
                r1 = this;
                Yue.ۥ۟۟ۨۢ r0 = r1.f24973
                return r0
        }

        @Override // Yue.AbstractC0254
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo1200(I r4, @Yue.InterfaceC4544 Yue.C0206 r5) {
                r3 = this;
                androidx.activity.result.ActivityResultRegistry r0 = r3.f24974
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f24962
                java.lang.String r1 = r3.f24972
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L2e
                androidx.activity.result.ActivityResultRegistry r1 = r3.f24974
                java.util.ArrayList<java.lang.String> r1 = r1.f24964
                java.lang.String r2 = r3.f24972
                r1.add(r2)
                androidx.activity.result.ActivityResultRegistry r1 = r3.f24974     // Catch: java.lang.Exception -> L23
                int r0 = r0.intValue()     // Catch: java.lang.Exception -> L23
                Yue.ۥ۟۟ۨۢ r2 = r3.f24973     // Catch: java.lang.Exception -> L23
                r1.mo27736(r0, r2, r4, r5)     // Catch: java.lang.Exception -> L23
                return
            L23:
                r4 = move-exception
                androidx.activity.result.ActivityResultRegistry r5 = r3.f24974
                java.util.ArrayList<java.lang.String> r5 = r5.f24964
                java.lang.String r0 = r3.f24972
                r5.remove(r0)
                throw r4
            L2e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Attempting to launch an unregistered ActivityResultLauncher with contract "
                r0.append(r1)
                Yue.ۥ۟۟ۨۢ r1 = r3.f24973
                r0.append(r1)
                java.lang.String r1 = " and input "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ". You must ensure the ActivityResultLauncher is registered before calling launch()."
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
        }

        @Override // Yue.AbstractC0254
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo1201() {
                r2 = this;
                androidx.activity.result.ActivityResultRegistry r0 = r2.f24974
                java.lang.String r1 = r2.f24972
                r0.m27784(r1)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$ۥ۟, reason: contains not printable characters */
    public class C7249<I> extends Yue.AbstractC0254<I> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.String f24975;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0221 f24976;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.activity.result.ActivityResultRegistry f24977;

        public C7249(androidx.activity.result.ActivityResultRegistry r1, java.lang.String r2, Yue.AbstractC0221 r3) {
                r0 = this;
                r0.f24977 = r1
                r0.f24975 = r2
                r0.f24976 = r3
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0254
        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ */
        public Yue.AbstractC0221<I, ?> mo1198() {
                r1 = this;
                Yue.ۥ۟۟ۨۢ r0 = r1.f24976
                return r0
        }

        @Override // Yue.AbstractC0254
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo1200(I r4, @Yue.InterfaceC4544 Yue.C0206 r5) {
                r3 = this;
                androidx.activity.result.ActivityResultRegistry r0 = r3.f24977
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r0.f24962
                java.lang.String r1 = r3.f24975
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L2e
                androidx.activity.result.ActivityResultRegistry r1 = r3.f24977
                java.util.ArrayList<java.lang.String> r1 = r1.f24964
                java.lang.String r2 = r3.f24975
                r1.add(r2)
                androidx.activity.result.ActivityResultRegistry r1 = r3.f24977     // Catch: java.lang.Exception -> L23
                int r0 = r0.intValue()     // Catch: java.lang.Exception -> L23
                Yue.ۥ۟۟ۨۢ r2 = r3.f24976     // Catch: java.lang.Exception -> L23
                r1.mo27736(r0, r2, r4, r5)     // Catch: java.lang.Exception -> L23
                return
            L23:
                r4 = move-exception
                androidx.activity.result.ActivityResultRegistry r5 = r3.f24977
                java.util.ArrayList<java.lang.String> r5 = r5.f24964
                java.lang.String r0 = r3.f24975
                r5.remove(r0)
                throw r4
            L2e:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Attempting to launch an unregistered ActivityResultLauncher with contract "
                r0.append(r1)
                Yue.ۥ۟۟ۨۢ r1 = r3.f24976
                r0.append(r1)
                java.lang.String r1 = " and input "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ". You must ensure the ActivityResultLauncher is registered before calling launch()."
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
        }

        @Override // Yue.AbstractC0254
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo1201() {
                r2 = this;
                androidx.activity.result.ActivityResultRegistry r0 = r2.f24977
                java.lang.String r1 = r2.f24975
                r0.m27784(r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$ۥ۟۟, reason: contains not printable characters */
    public static class C7250<O> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.InterfaceC0219<O> f24978;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.AbstractC0221<?, O> f24979;

        public C7250(Yue.InterfaceC0219<O> r1, Yue.AbstractC0221<?, O> r2) {
                r0 = this;
                r0.<init>()
                r0.f24978 = r1
                r0.f24979 = r2
                return
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7251 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final androidx.lifecycle.Lifecycle f24980;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> f24981;

        public C7251(@Yue.InterfaceC4410 androidx.lifecycle.Lifecycle r1) {
                r0 = this;
                r0.<init>()
                r0.f24980 = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f24981 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m27785(@Yue.InterfaceC4410 androidx.lifecycle.LifecycleEventObserver r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.f24980
                r0.addObserver(r2)
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r1.f24981
                r0.add(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m27786() {
                r3 = this;
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r3.f24981
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                androidx.lifecycle.LifecycleEventObserver r1 = (androidx.lifecycle.LifecycleEventObserver) r1
                androidx.lifecycle.Lifecycle r2 = r3.f24980
                r2.removeObserver(r1)
                goto L6
            L18:
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r3.f24981
                r0.clear()
                return
        }
    }

    public ActivityResultRegistry() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f24961 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f24962 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f24963 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f24964 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f24965 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f24966 = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.f24967 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m27774(int r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.f24961
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.f24962
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r3)
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m27775(int r2, int r3, @Yue.InterfaceC4544 android.content.Intent r4) {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r1.f24961
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$ۥ۟۟<?>> r0 = r1.f24965
            java.lang.Object r0 = r0.get(r2)
            androidx.activity.result.ActivityResultRegistry$ۥ۟۟ r0 = (androidx.activity.result.ActivityResultRegistry.C7250) r0
            r1.m27777(r2, r3, r4, r0)
            r2 = 1
            return r2
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final <O> boolean m27776(int r3, @android.annotation.SuppressLint({"UnknownNullness"}) O r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.f24961
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$ۥ۟۟<?>> r0 = r2.f24965
            java.lang.Object r0 = r0.get(r3)
            androidx.activity.result.ActivityResultRegistry$ۥ۟۟ r0 = (androidx.activity.result.ActivityResultRegistry.C7250) r0
            if (r0 == 0) goto L2b
            Yue.ۥ۟۟ۨ۠<O> r0 = r0.f24978
            if (r0 != 0) goto L1f
            goto L2b
        L1f:
            java.util.ArrayList<java.lang.String> r1 = r2.f24964
            boolean r3 = r1.remove(r3)
            if (r3 == 0) goto L35
            r0.mo1122(r4)
            goto L35
        L2b:
            android.os.Bundle r0 = r2.f24967
            r0.remove(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f24966
            r0.put(r3, r4)
        L35:
            r3 = 1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final <O> void m27777(java.lang.String r2, int r3, @Yue.InterfaceC4544 android.content.Intent r4, @Yue.InterfaceC4544 androidx.activity.result.ActivityResultRegistry.C7250<O> r5) {
            r1 = this;
            if (r5 == 0) goto L1f
            Yue.ۥ۟۟ۨ۠<O> r0 = r5.f24978
            if (r0 == 0) goto L1f
            java.util.ArrayList<java.lang.String> r0 = r1.f24964
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1f
            Yue.ۥ۟۟ۨ۠<O> r0 = r5.f24978
            Yue.ۥ۟۟ۨۢ<?, O> r5 = r5.f24979
            java.lang.Object r3 = r5.mo1125(r3, r4)
            r0.mo1122(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f24964
            r3.remove(r2)
            goto L2e
        L1f:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f24966
            r5.remove(r2)
            android.os.Bundle r5 = r1.f24967
            Yue.ۥ۟۟ۨ۟ r0 = new Yue.ۥ۟۟ۨ۟
            r0.<init>(r3, r4)
            r5.putParcelable(r2, r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m27778() {
            r5 = this;
            Yue.ۥۡۥۨۤ$ۥ r0 = Yue.AbstractC5185.f19527
            r1 = 2147418112(0x7fff0000, float:NaN)
            int r0 = r0.mo441(r1)
            r2 = 65536(0x10000, float:9.1835E-41)
        La:
            int r0 = r0 + r2
            java.util.Map<java.lang.Integer, java.lang.String> r3 = r5.f24961
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L1e
            Yue.ۥۡۥۨۤ$ۥ r0 = Yue.AbstractC5185.f19527
            int r0 = r0.mo441(r1)
            goto La
        L1e:
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract <I, O> void mo27736(int r1, @Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r2, @android.annotation.SuppressLint({"UnknownNullness"}) I r3, @Yue.InterfaceC4544 Yue.C0206 r4);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m27779(@Yue.InterfaceC4544 android.os.Bundle r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            java.util.ArrayList r0 = r6.getIntegerArrayList(r0)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            java.util.ArrayList r1 = r6.getStringArrayList(r1)
            if (r1 == 0) goto L67
            if (r0 != 0) goto L14
            goto L67
        L14:
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            java.util.ArrayList r2 = r6.getStringArrayList(r2)
            r5.f24964 = r2
            android.os.Bundle r2 = r5.f24967
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            android.os.Bundle r6 = r6.getBundle(r3)
            r2.putAll(r6)
            r6 = 0
        L28:
            int r2 = r1.size()
            if (r6 >= r2) goto L67
            java.lang.Object r2 = r1.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.f24962
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L51
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.f24962
            java.lang.Object r3 = r3.remove(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            android.os.Bundle r4 = r5.f24967
            boolean r2 = r4.containsKey(r2)
            if (r2 != 0) goto L51
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r5.f24961
            r2.remove(r3)
        L51:
            java.lang.Object r2 = r0.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r1.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r5.m27774(r2, r3)
            int r6 = r6 + 1
            goto L28
        L67:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m27780(@Yue.InterfaceC4410 android.os.Bundle r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f24962
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            r3.putIntegerArrayList(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.f24962
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            r3.putStringArrayList(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r1 = r2.f24964
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            r3.putStringArrayList(r1, r0)
            android.os.Bundle r0 = r2.f24967
            java.lang.Object r0 = r0.clone()
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            r3.putBundle(r1, r0)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final <I, O> Yue.AbstractC0254<I> m27781(@Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r4, @Yue.InterfaceC4410 Yue.InterfaceC0219<O> r5) {
            r2 = this;
            r2.m27783(r3)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$ۥ۟۟<?>> r0 = r2.f24965
            androidx.activity.result.ActivityResultRegistry$ۥ۟۟ r1 = new androidx.activity.result.ActivityResultRegistry$ۥ۟۟
            r1.<init>(r5, r4)
            r0.put(r3, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f24966
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L23
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f24966
            java.lang.Object r0 = r0.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.f24966
            r1.remove(r3)
            r5.mo1122(r0)
        L23:
            android.os.Bundle r0 = r2.f24967
            android.os.Parcelable r0 = r0.getParcelable(r3)
            Yue.ۥ۟۟ۨ۟ r0 = (Yue.C0217) r0
            if (r0 == 0) goto L41
            android.os.Bundle r1 = r2.f24967
            r1.remove(r3)
            int r1 = r0.m1119()
            android.content.Intent r0 = r0.m1118()
            java.lang.Object r0 = r4.mo1125(r1, r0)
            r5.mo1122(r0)
        L41:
            androidx.activity.result.ActivityResultRegistry$ۥ۟ r5 = new androidx.activity.result.ActivityResultRegistry$ۥ۟
            r5.<init>(r2, r3, r4)
            return r5
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final <I, O> Yue.AbstractC0254<I> m27782(@Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC4410 androidx.lifecycle.LifecycleOwner r5, @Yue.InterfaceC4410 Yue.AbstractC0221<I, O> r6, @Yue.InterfaceC4410 Yue.InterfaceC0219<O> r7) {
            r3 = this;
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r1.isAtLeast(r2)
            if (r1 != 0) goto L35
            r3.m27783(r4)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟> r5 = r3.f24963
            java.lang.Object r5 = r5.get(r4)
            androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟ r5 = (androidx.activity.result.ActivityResultRegistry.C7251) r5
            if (r5 != 0) goto L22
            androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟ r5 = new androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟
            r5.<init>(r0)
        L22:
            androidx.activity.result.ActivityResultRegistry$1 r0 = new androidx.activity.result.ActivityResultRegistry$1
            r0.<init>(r3, r4, r7, r6)
            r5.m27785(r0)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟> r7 = r3.f24963
            r7.put(r4, r5)
            androidx.activity.result.ActivityResultRegistry$ۥ r5 = new androidx.activity.result.ActivityResultRegistry$ۥ
            r5.<init>(r3, r4, r6)
            return r5
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "LifecycleOwner "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " is attempting to register while current state is "
            r6.append(r5)
            androidx.lifecycle.Lifecycle$State r5 = r0.getCurrentState()
            r6.append(r5)
            java.lang.String r5 = ". LifecycleOwners must call register before they are STARTED."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m27783(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.f24962
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb
            return
        Lb:
            int r0 = r1.m27778()
            r1.m27774(r0, r2)
            return
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m27784(@Yue.InterfaceC4410 java.lang.String r6) {
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.f24964
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L17
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.f24962
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L17
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r5.f24961
            r1.remove(r0)
        L17:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$ۥ۟۟<?>> r0 = r5.f24965
            r0.remove(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f24966
            boolean r0 = r0.containsKey(r6)
            java.lang.String r1 = ": "
            java.lang.String r2 = "Dropping pending result for request "
            java.lang.String r3 = "ActivityResultRegistry"
            if (r0 == 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.f24966
            java.lang.Object r4 = r4.get(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.f24966
            r0.remove(r6)
        L4d:
            android.os.Bundle r0 = r5.f24967
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L78
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r6)
            r0.append(r1)
            android.os.Bundle r1 = r5.f24967
            android.os.Parcelable r1 = r1.getParcelable(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            android.os.Bundle r0 = r5.f24967
            r0.remove(r6)
        L78:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟> r0 = r5.f24963
            java.lang.Object r0 = r0.get(r6)
            androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟ r0 = (androidx.activity.result.ActivityResultRegistry.C7251) r0
            if (r0 == 0) goto L8a
            r0.m27786()
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$ۥ۟۟۟> r0 = r5.f24963
            r0.remove(r6)
        L8a:
            return
    }
}
