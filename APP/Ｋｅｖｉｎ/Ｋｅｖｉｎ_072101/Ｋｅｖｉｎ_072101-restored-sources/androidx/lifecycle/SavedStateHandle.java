package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0002*+B\u001d\b\u0016\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0004H\u0087\u0002J\u001e\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0016H\u0007¢\u0006\u0002\u0010\u001bJ1\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u0002H\u0016H\u0002¢\u0006\u0002\u0010\u001eJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00160 \"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0016H\u0007¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0007J\u001d\u0010$\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0017J\b\u0010\r\u001a\u00020\u000eH\u0007J&\u0010%\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u0001H\u0016H\u0087\u0002¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u000eH\u0007R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m115d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "initialState", "", "", "(Ljava/util/Map;)V", "()V", "flows", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "liveDatas", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "regular", "savedStateProvider", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProviders", "clearSavedStateProvider", "", "key", "contains", "", "get", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "getLiveData", "Landroidx/lifecycle/MutableLiveData;", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "hasInitialValue", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "keys", "", "remove", "set", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "setSavedStateProvider", "provider", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class SavedStateHandle {
    private static final java.lang.Class<? extends java.lang.Object>[] ACCEPTABLE_CLASSES = null;
    public static final androidx.lifecycle.SavedStateHandle.Companion Companion = null;
    private static final java.lang.String KEYS = "keys";
    private static final java.lang.String VALUES = "values";
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> flows;
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?>> liveDatas;
    private final java.util.Map<java.lang.String, java.lang.Object> regular;
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider;
    private final java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> savedStateProviders;

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    @kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m115d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public final androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle r8, android.os.Bundle r9) {
                r7 = this;
                if (r8 != 0) goto L39
                if (r9 != 0) goto La
                androidx.lifecycle.SavedStateHandle r0 = new androidx.lifecycle.SavedStateHandle
                r0.<init>()
                goto L38
            La:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
                java.util.Set r1 = r9.keySet()
                java.util.Iterator r1 = r1.iterator()
            L19:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L32
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r3 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                java.lang.Object r3 = r9.get(r2)
                r0.put(r2, r3)
                goto L19
            L32:
                androidx.lifecycle.SavedStateHandle r1 = new androidx.lifecycle.SavedStateHandle
                r1.<init>(r0)
                r0 = r1
            L38:
                return r0
            L39:
                java.lang.String r0 = "keys"
                java.util.ArrayList r0 = r8.getParcelableArrayList(r0)
                java.lang.String r1 = "values"
                java.util.ArrayList r1 = r8.getParcelableArrayList(r1)
                if (r0 == 0) goto L55
                if (r1 == 0) goto L55
                int r2 = r0.size()
                int r3 = r1.size()
                if (r2 != r3) goto L55
                r2 = 1
                goto L56
            L55:
                r2 = 0
            L56:
                if (r2 == 0) goto L86
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Map r2 = (java.util.Map) r2
                r3 = 0
                int r4 = r0.size()
            L64:
                if (r3 >= r4) goto L80
                java.lang.Object r5 = r0.get(r3)
                if (r5 == 0) goto L78
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r1.get(r3)
                r2.put(r5, r6)
                int r3 = r3 + 1
                goto L64
            L78:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
                r4.<init>(r5)
                throw r4
            L80:
                androidx.lifecycle.SavedStateHandle r3 = new androidx.lifecycle.SavedStateHandle
                r3.<init>(r2)
                return r3
            L86:
                r2 = 0
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "Invalid bundle passed as restored state"
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public final boolean validateValue(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r8 != 0) goto L4
                return r0
            L4:
                java.lang.Class[] r1 = androidx.lifecycle.SavedStateHandle.access$getACCEPTABLE_CLASSES$cp()
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Lb:
                if (r4 >= r2) goto L1c
                r5 = r1[r4]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                boolean r6 = r5.isInstance(r8)
                if (r6 == 0) goto L19
                return r0
            L19:
                int r4 = r4 + 1
                goto Lb
            L1c:
                return r3
        }
    }

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m115d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "key", "", "value", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "detach", "", "setValue", "(Ljava/lang/Object;)V", "lifecycle-viewmodel-savedstate_release"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    public static final class SavingStateLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {
        private androidx.lifecycle.SavedStateHandle handle;
        private java.lang.String key;

        public SavingStateLiveData(androidx.lifecycle.SavedStateHandle r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.key = r3
                r1.handle = r2
                return
        }

        public SavingStateLiveData(androidx.lifecycle.SavedStateHandle r2, java.lang.String r3, T r4) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>(r4)
                r1.key = r3
                r1.handle = r2
                return
        }

        public final void detach() {
                r1 = this;
                r0 = 0
                r1.handle = r0
                return
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T r5) {
                r4 = this;
                androidx.lifecycle.SavedStateHandle r0 = r4.handle
                if (r0 == 0) goto L22
                r1 = 0
                java.util.Map r2 = androidx.lifecycle.SavedStateHandle.access$getRegular$p(r0)
                java.lang.String r3 = r4.key
                r2.put(r3, r5)
                java.util.Map r2 = androidx.lifecycle.SavedStateHandle.access$getFlows$p(r0)
                java.lang.String r3 = r4.key
                java.lang.Object r2 = r2.get(r3)
                kotlinx.coroutines.flow.MutableStateFlow r2 = (kotlinx.coroutines.flow.MutableStateFlow) r2
                if (r2 != 0) goto L1d
                goto L20
            L1d:
                r2.setValue(r5)
            L20:
            L22:
                super.setValue(r5)
                return
        }
    }

    public static /* synthetic */ android.os.Bundle $r8$lambda$GtOfND5ytkMc4wzrmyvzCM4MOCY(androidx.lifecycle.SavedStateHandle r0) {
            android.os.Bundle r0 = m1727savedStateProvider$lambda0(r0)
            return r0
    }

    static {
            androidx.lifecycle.SavedStateHandle$Companion r0 = new androidx.lifecycle.SavedStateHandle$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.SavedStateHandle.Companion = r0
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Class r4 = java.lang.Double.TYPE
            java.lang.Class r6 = java.lang.Integer.TYPE
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Class<java.lang.String[]> r11 = java.lang.String[].class
            java.lang.Class<android.os.Binder> r12 = android.os.Binder.class
            java.lang.Class<android.os.Bundle> r13 = android.os.Bundle.class
            java.lang.Class r14 = java.lang.Byte.TYPE
            java.lang.Class r16 = java.lang.Character.TYPE
            java.lang.Class<java.lang.CharSequence> r18 = java.lang.CharSequence.class
            java.lang.Class<java.lang.CharSequence[]> r19 = java.lang.CharSequence[].class
            java.lang.Class<java.util.ArrayList> r20 = java.util.ArrayList.class
            java.lang.Class r21 = java.lang.Float.TYPE
            java.lang.Class<android.os.Parcelable> r23 = android.os.Parcelable.class
            java.lang.Class<android.os.Parcelable[]> r24 = android.os.Parcelable[].class
            java.lang.Class<java.io.Serializable> r25 = java.io.Serializable.class
            java.lang.Class r26 = java.lang.Short.TYPE
            java.lang.Class<android.util.SparseArray> r28 = android.util.SparseArray.class
            java.lang.Class<android.util.Size> r29 = android.util.Size.class
            java.lang.Class<android.util.SizeF> r30 = android.util.SizeF.class
            java.lang.Class<boolean[]> r3 = boolean[].class
            java.lang.Class<double[]> r5 = double[].class
            java.lang.Class<int[]> r7 = int[].class
            java.lang.Class<long[]> r9 = long[].class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.Class<char[]> r17 = char[].class
            java.lang.Class<float[]> r22 = float[].class
            java.lang.Class<short[]> r27 = short[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES = r0
            return
    }

    public SavedStateHandle() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.regular = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.savedStateProviders = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.liveDatas = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.flows = r0
            androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0 r0 = new androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.savedStateProvider = r0
            return
    }

    public SavedStateHandle(java.util.Map<java.lang.String, ? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "initialState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.regular = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.savedStateProviders = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.liveDatas = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r1.flows = r0
            androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0 r0 = new androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.savedStateProvider = r0
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular
            r0.putAll(r2)
            return
    }

    public static final /* synthetic */ java.lang.Class[] access$getACCEPTABLE_CLASSES$cp() {
            java.lang.Class<? extends java.lang.Object>[] r0 = androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getFlows$p(androidx.lifecycle.SavedStateHandle r1) {
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r0 = r1.flows
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getRegular$p(androidx.lifecycle.SavedStateHandle r1) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.SavedStateHandle createHandle(android.os.Bundle r1, android.os.Bundle r2) {
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r0 = r0.createHandle(r1, r2)
            return r0
    }

    private final <T> androidx.lifecycle.MutableLiveData<T> getLiveDataInternal(java.lang.String r4, boolean r5, T r6) {
            r3 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r3.liveDatas
            java.lang.Object r0 = r0.get(r4)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto Ld
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L12
            return r0
        L12:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.regular
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L26
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r1 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.regular
            java.lang.Object r2 = r2.get(r4)
            r1.<init>(r3, r4, r2)
            goto L38
        L26:
            if (r5 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.regular
            r1.put(r4, r6)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r1 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r1.<init>(r3, r4, r6)
            goto L38
        L33:
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r1 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r1.<init>(r3, r4)
        L38:
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r2 = r3.liveDatas
            r2.put(r4, r1)
            r2 = r1
            androidx.lifecycle.MutableLiveData r2 = (androidx.lifecycle.MutableLiveData) r2
            return r2
    }

    /* JADX INFO: renamed from: savedStateProvider$lambda-0, reason: not valid java name */
    private static final android.os.Bundle m1727savedStateProvider$lambda0(androidx.lifecycle.SavedStateHandle r7) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r7.savedStateProviders
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r0)
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            android.os.Bundle r4 = r2.saveState()
            r7.set(r3, r4)
            goto L13
        L33:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.regular
            java.util.Set r1 = r1.keySet()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L4f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L68
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r2.add(r5)
            java.util.Map<java.lang.String, java.lang.Object> r6 = r7.regular
            java.lang.Object r6 = r6.get(r5)
            r3.add(r6)
            goto L4f
        L68:
            r4 = 2
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            java.lang.String r5 = "keys"
            kotlin.Pair r5 = kotlin.TuplesKt.m122to(r5, r2)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "values"
            kotlin.Pair r5 = kotlin.TuplesKt.m122to(r5, r3)
            r6 = 1
            r4[r6] = r5
            android.os.Bundle r4 = androidx.core.os.BundleKt.bundleOf(r4)
            return r4
    }

    public final void clearSavedStateProvider(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.savedStateProviders
            r0.remove(r2)
            return
    }

    public final boolean contains(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular
            boolean r0 = r0.containsKey(r2)
            return r0
    }

    public final <T> T get(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular
            java.lang.Object r0 = r0.get(r2)
            return r0
    }

    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 0
            androidx.lifecycle.MutableLiveData r0 = r2.getLiveDataInternal(r3, r0, r1)
            return r0
    }

    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(java.lang.String r2, T r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            androidx.lifecycle.MutableLiveData r0 = r1.getLiveDataInternal(r2, r0, r3)
            return r0
    }

    public final <T> kotlinx.coroutines.flow.StateFlow<T> getStateFlow(java.lang.String r9, T r10) {
            r8 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r0 = r8.flows
            r1 = 0
            java.lang.Object r2 = r0.get(r9)
            if (r2 != 0) goto L33
            r3 = 0
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.regular
            boolean r4 = r4.containsKey(r9)
            if (r4 != 0) goto L1c
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.regular
            r4.put(r9, r10)
        L1c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.regular
            java.lang.Object r4 = r4.get(r9)
            kotlinx.coroutines.flow.MutableStateFlow r4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r4)
            r5 = r4
            r6 = 0
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r7 = r8.flows
            r7.put(r9, r5)
            r3 = r4
            r0.put(r9, r3)
            goto L34
        L33:
            r3 = r2
        L34:
            kotlinx.coroutines.flow.MutableStateFlow r3 = (kotlinx.coroutines.flow.MutableStateFlow) r3
            kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.asStateFlow(r3)
            return r0
    }

    public final java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            java.util.Set r0 = r0.keySet()
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r2.savedStateProviders
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r0 = kotlin.collections.SetsKt.plus(r0, r1)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.liveDatas
            java.util.Set r1 = r1.keySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r0 = kotlin.collections.SetsKt.plus(r0, r1)
            return r0
    }

    public final <T> T remove(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.regular
            java.lang.Object r0 = r0.remove(r4)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r3.liveDatas
            java.lang.Object r1 = r1.remove(r4)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r1 = (androidx.lifecycle.SavedStateHandle.SavingStateLiveData) r1
            if (r1 == 0) goto L19
            r1.detach()
        L19:
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r2 = r3.flows
            r2.remove(r4)
            return r0
    }

    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r1.savedStateProvider
            return r0
    }

    public final <T> void set(java.lang.String r4, T r5) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            boolean r0 = r0.validateValue(r5)
            if (r0 == 0) goto L36
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r3.liveDatas
            java.lang.Object r0 = r0.get(r4)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto L1a
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L22
            r0.setValue(r5)
            goto L27
        L22:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.regular
            r1.put(r4, r5)
        L27:
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r1 = r3.flows
            java.lang.Object r1 = r1.get(r4)
            kotlinx.coroutines.flow.MutableStateFlow r1 = (kotlinx.coroutines.flow.MutableStateFlow) r1
            if (r1 != 0) goto L32
            goto L35
        L32:
            r1.setValue(r5)
        L35:
            return
        L36:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't put value with type "
            java.lang.StringBuilder r1 = r1.append(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.Class r2 = r5.getClass()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " into saved state"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void setSavedStateProvider(java.lang.String r2, androidx.savedstate.SavedStateRegistry.SavedStateProvider r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.savedStateProviders
            r0.put(r2, r3)
            return
    }
}
