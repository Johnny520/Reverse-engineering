package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u000234B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0017J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010\u001fJ\u001f\u0010&\u001a\u00020!2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020!2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010)R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R$\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030.0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R(\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102¨\u00065"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "T", "key", "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "Landroidx/savedstate/ۥ$ۥ۟۟;", "savedStateProvider", "()Landroidx/savedstate/ۥ$ۥ۟۟;", "contains", "(Ljava/lang/String;)Z", "getLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "LYue/ۥۢ۠۟ۡ;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)LYue/ۥۢ۠۟ۡ;", "", "keys", "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "LYue/ۥۣۢ۠ۤ;", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "provider", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/ۥ$ۥ۟۟;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "", "regular", "Ljava/util/Map;", "savedStateProviders", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "liveDatas", "LYue/ۥۡۡۧۦ;", "flows", "Landroidx/savedstate/ۥ$ۥ۟۟;", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandle {

    @Yue.InterfaceC4418
    private static final java.lang.Class<? extends java.lang.Object>[] ACCEPTABLE_CLASSES = null;

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.SavedStateHandle.Companion Companion = null;

    @Yue.InterfaceC4418
    private static final java.lang.String KEYS = "keys";

    @Yue.InterfaceC4418
    private static final java.lang.String VALUES = "values";

    @Yue.InterfaceC4418
    private final java.util.Map<java.lang.String, Yue.InterfaceC4320<java.lang.Object>> flows;

    @Yue.InterfaceC4418
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?>> liveDatas;

    @Yue.InterfaceC4418
    private final java.util.Map<java.lang.String, java.lang.Object> regular;

    @Yue.InterfaceC4418
    private final androidx.savedstate.C7816.InterfaceC7819 savedStateProvider;

    @Yue.InterfaceC4418
    private final java.util.Map<java.lang.String, androidx.savedstate.C7816.InterfaceC7819> savedStateProviders;

    @Yue.InterfaceC4201(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
        @Yue.InterfaceC3427
        public final androidx.lifecycle.SavedStateHandle createHandle(@Yue.InterfaceC4543 android.os.Bundle r6, @Yue.InterfaceC4543 android.os.Bundle r7) {
                r5 = this;
                if (r6 != 0) goto L37
                if (r7 != 0) goto La
                androidx.lifecycle.SavedStateHandle r6 = new androidx.lifecycle.SavedStateHandle
                r6.<init>()
                goto L36
            La:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.Set r0 = r7.keySet()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "key"
                Yue.C3329.m13905(r1, r2)
                java.lang.Object r2 = r7.get(r1)
                r6.put(r1, r2)
                goto L17
            L30:
                androidx.lifecycle.SavedStateHandle r7 = new androidx.lifecycle.SavedStateHandle
                r7.<init>(r6)
                r6 = r7
            L36:
                return r6
            L37:
                java.lang.String r7 = "keys"
                java.util.ArrayList r7 = r6.getParcelableArrayList(r7)
                java.lang.String r0 = "values"
                java.util.ArrayList r6 = r6.getParcelableArrayList(r0)
                if (r7 == 0) goto L78
                if (r6 == 0) goto L78
                int r0 = r7.size()
                int r1 = r6.size()
                if (r0 != r1) goto L78
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                int r1 = r7.size()
                r2 = 0
            L5b:
                if (r2 >= r1) goto L72
                java.lang.Object r3 = r7.get(r2)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
                Yue.C3329.m13904(r3, r4)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r6.get(r2)
                r0.put(r3, r4)
                int r2 = r2 + 1
                goto L5b
            L72:
                androidx.lifecycle.SavedStateHandle r6 = new androidx.lifecycle.SavedStateHandle
                r6.<init>(r0)
                return r6
            L78:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "Invalid bundle passed as restored state"
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
        }

        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
        public final boolean validateValue(@Yue.InterfaceC4543 java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r7 != 0) goto L4
                return r0
            L4:
                java.lang.Class[] r1 = androidx.lifecycle.SavedStateHandle.access$getACCEPTABLE_CLASSES$cp()
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Lb:
                if (r4 >= r2) goto L1c
                r5 = r1[r4]
                Yue.C3329.m13903(r5)
                boolean r5 = r5.isInstance(r7)
                if (r5 == 0) goto L19
                return r0
            L19:
                int r4 = r4 + 1
                goto Lb
            L1c:
                return r3
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "", "key", "value", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "LYue/ۥۣۢ۠ۤ;", "setValue", "(Ljava/lang/Object;)V", "detach", "()V", "Ljava/lang/String;", "Landroidx/lifecycle/SavedStateHandle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    public static final class SavingStateLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {

        @Yue.InterfaceC4543
        private androidx.lifecycle.SavedStateHandle handle;

        @Yue.InterfaceC4418
        private java.lang.String key;

        public SavingStateLiveData(@Yue.InterfaceC4543 androidx.lifecycle.SavedStateHandle r2, @Yue.InterfaceC4418 java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                Yue.C3329.m13906(r3, r0)
                r1.<init>()
                r1.key = r3
                r1.handle = r2
                return
        }

        public SavingStateLiveData(@Yue.InterfaceC4543 androidx.lifecycle.SavedStateHandle r2, @Yue.InterfaceC4418 java.lang.String r3, T r4) {
                r1 = this;
                java.lang.String r0 = "key"
                Yue.C3329.m13906(r3, r0)
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
        public void setValue(T r4) {
                r3 = this;
                androidx.lifecycle.SavedStateHandle r0 = r3.handle
                if (r0 == 0) goto L1f
                java.util.Map r1 = androidx.lifecycle.SavedStateHandle.access$getRegular$p(r0)
                java.lang.String r2 = r3.key
                r1.put(r2, r4)
                java.util.Map r0 = androidx.lifecycle.SavedStateHandle.access$getFlows$p(r0)
                java.lang.String r1 = r3.key
                java.lang.Object r0 = r0.get(r1)
                Yue.ۥۡۡۧۦ r0 = (Yue.InterfaceC4320) r0
                if (r0 != 0) goto L1c
                goto L1f
            L1c:
                r0.setValue(r4)
            L1f:
                super.setValue(r4)
                return
        }
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
            java.lang.Class r14 = java.lang.Byte.TYPE
            java.lang.Class r16 = java.lang.Character.TYPE
            java.lang.Class r21 = java.lang.Float.TYPE
            java.lang.Class r26 = java.lang.Short.TYPE
            java.lang.Class<boolean[]> r3 = boolean[].class
            java.lang.Class<double[]> r5 = double[].class
            java.lang.Class<int[]> r7 = int[].class
            java.lang.Class<long[]> r9 = long[].class
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Class<java.lang.String[]> r11 = java.lang.String[].class
            java.lang.Class<android.os.Binder> r12 = android.os.Binder.class
            java.lang.Class<android.os.Bundle> r13 = android.os.Bundle.class
            java.lang.Class<byte[]> r15 = byte[].class
            java.lang.Class<char[]> r17 = char[].class
            java.lang.Class<java.lang.CharSequence> r18 = java.lang.CharSequence.class
            java.lang.Class<java.lang.CharSequence[]> r19 = java.lang.CharSequence[].class
            java.lang.Class<java.util.ArrayList> r20 = java.util.ArrayList.class
            java.lang.Class<float[]> r22 = float[].class
            java.lang.Class<android.os.Parcelable> r23 = android.os.Parcelable.class
            java.lang.Class<android.os.Parcelable[]> r24 = android.os.Parcelable[].class
            java.lang.Class<java.io.Serializable> r25 = java.io.Serializable.class
            java.lang.Class<short[]> r27 = short[].class
            java.lang.Class<android.util.SparseArray> r28 = android.util.SparseArray.class
            java.lang.Class<android.util.Size> r29 = android.util.Size.class
            java.lang.Class<android.util.SizeF> r30 = android.util.SizeF.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES = r0
            return
    }

    public SavedStateHandle() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.regular = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.savedStateProviders = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.liveDatas = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.flows = r0
            Yue.ۥۡۧۤ۟ r0 = new Yue.ۥۡۧۤ۟
            r0.<init>(r1)
            r1.savedStateProvider = r0
            return
    }

    public SavedStateHandle(@Yue.InterfaceC4418 java.util.Map<java.lang.String, ? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "initialState"
            Yue.C3329.m13906(r3, r0)
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.regular = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.savedStateProviders = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.liveDatas = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.flows = r1
            Yue.ۥۡۧۤ۟ r1 = new Yue.ۥۡۧۤ۟
            r1.<init>(r2)
            r2.savedStateProvider = r1
            r0.putAll(r3)
            return
    }

    public static final /* synthetic */ java.lang.Class[] access$getACCEPTABLE_CLASSES$cp() {
            java.lang.Class<? extends java.lang.Object>[] r0 = androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getFlows$p(androidx.lifecycle.SavedStateHandle r0) {
            java.util.Map<java.lang.String, Yue.ۥۡۡۧۦ<java.lang.Object>> r0 = r0.flows
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getRegular$p(androidx.lifecycle.SavedStateHandle r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.regular
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    @Yue.InterfaceC3427
    public static final androidx.lifecycle.SavedStateHandle createHandle(@Yue.InterfaceC4543 android.os.Bundle r1, @Yue.InterfaceC4543 android.os.Bundle r2) {
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r1 = r0.createHandle(r1, r2)
            return r1
    }

    private final <T> androidx.lifecycle.MutableLiveData<T> getLiveDataInternal(java.lang.String r3, boolean r4, T r5) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r2.liveDatas
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto Ld
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L11
            return r0
        L11:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L25
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.regular
            java.lang.Object r5 = r5.get(r3)
            r4.<init>(r2, r3, r5)
            goto L37
        L25:
            if (r4 == 0) goto L32
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.regular
            r4.put(r3, r5)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r4.<init>(r2, r3, r5)
            goto L37
        L32:
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r4.<init>(r2, r3)
        L37:
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r5 = r2.liveDatas
            r5.put(r3, r4)
            return r4
    }

    private static final android.os.Bundle savedStateProvider$lambda$0(androidx.lifecycle.SavedStateHandle r5) {
            java.lang.String r0 = "this$0"
            Yue.C3329.m13906(r5, r0)
            java.util.Map<java.lang.String, androidx.savedstate.ۥ$ۥ۟۟> r0 = r5.savedStateProviders
            java.util.Map r0 = Yue.C3901.m15796(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.ۥ$ۥ۟۟ r1 = (androidx.savedstate.C7816.InterfaceC7819) r1
            android.os.Bundle r1 = r1.saveState()
            r5.set(r2, r1)
            goto L13
        L33:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.regular
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.regular
            java.lang.Object r3 = r4.get(r3)
            r2.add(r3)
            goto L4f
        L68:
            java.lang.String r5 = "keys"
            Yue.ۥۣۡۦ۠ r5 = Yue.C6456.m23777(r5, r1)
            java.lang.String r0 = "values"
            Yue.ۥۣۡۦ۠ r0 = Yue.C6456.m23777(r0, r2)
            Yue.ۥۣۡۦ۠[] r5 = new Yue.C4677[]{r5, r0}
            android.os.Bundle r5 = Yue.C0869.m5001(r5)
            return r5
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ android.os.Bundle m29517(androidx.lifecycle.SavedStateHandle r0) {
            android.os.Bundle r0 = savedStateProvider$lambda$0(r0)
            return r0
    }

    @Yue.InterfaceC3875
    public final void clearSavedStateProvider(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            java.util.Map<java.lang.String, androidx.savedstate.ۥ$ۥ۟۟> r0 = r1.savedStateProviders
            r0.remove(r2)
            return
    }

    @Yue.InterfaceC3875
    public final boolean contains(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Yue.InterfaceC3875
    @Yue.InterfaceC4543
    public final <T> T get(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular     // Catch: java.lang.ClassCastException -> Lc
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.ClassCastException -> Lc
            goto L10
        Lc:
            r1.remove(r2)
            r2 = 0
        L10:
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3875
    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r1 = 0
            androidx.lifecycle.MutableLiveData r3 = r2.getLiveDataInternal(r3, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>"
            Yue.C3329.m13904(r3, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3875
    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(@Yue.InterfaceC4418 java.lang.String r2, T r3) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            androidx.lifecycle.MutableLiveData r2 = r1.getLiveDataInternal(r2, r0, r3)
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3875
    public final <T> Yue.InterfaceC5941<T> getStateFlow(@Yue.InterfaceC4418 java.lang.String r3, T r4) {
            r2 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r3, r0)
            java.util.Map<java.lang.String, Yue.ۥۡۡۧۦ<java.lang.Object>> r0 = r2.flows
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.regular
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L1a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.regular
            r1.put(r3, r4)
        L1a:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.regular
            java.lang.Object r4 = r4.get(r3)
            Yue.ۥۡۡۧۦ r1 = Yue.C5944.m22039(r4)
            java.util.Map<java.lang.String, Yue.ۥۡۡۧۦ<java.lang.Object>> r4 = r2.flows
            r4.put(r3, r1)
            r0.put(r3, r1)
        L2c:
            Yue.ۥۡۡۧۦ r1 = (Yue.InterfaceC4320) r1
            Yue.ۥۢ۠۟ۡ r3 = Yue.C2472.m11511(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>"
            Yue.C3329.m13904(r3, r4)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3875
    public final java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            java.util.Set r0 = r0.keySet()
            java.util.Map<java.lang.String, androidx.savedstate.ۥ$ۥ۟۟> r1 = r2.savedStateProviders
            java.util.Set r1 = r1.keySet()
            java.util.Set r0 = Yue.C5688.m21276(r0, r1)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.liveDatas
            java.util.Set r1 = r1.keySet()
            java.util.Set r0 = Yue.C5688.m21276(r0, r1)
            return r0
    }

    @Yue.InterfaceC3875
    @Yue.InterfaceC4543
    public final <T> T remove(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            java.lang.Object r0 = r0.remove(r3)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.liveDatas
            java.lang.Object r1 = r1.remove(r3)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r1 = (androidx.lifecycle.SavedStateHandle.SavingStateLiveData) r1
            if (r1 == 0) goto L18
            r1.detach()
        L18:
            java.util.Map<java.lang.String, Yue.ۥۡۡۧۦ<java.lang.Object>> r1 = r2.flows
            r1.remove(r3)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public final androidx.savedstate.C7816.InterfaceC7819 savedStateProvider() {
            r1 = this;
            androidx.savedstate.ۥ$ۥ۟۟ r0 = r1.savedStateProvider
            return r0
    }

    @Yue.InterfaceC3875
    public final <T> void set(@Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4543 T r4) {
            r2 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r3, r0)
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            boolean r0 = r0.validateValue(r4)
            if (r0 == 0) goto L35
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r2.liveDatas
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto L1a
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L21
            r0.setValue(r4)
            goto L26
        L21:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            r0.put(r3, r4)
        L26:
            java.util.Map<java.lang.String, Yue.ۥۡۡۧۦ<java.lang.Object>> r0 = r2.flows
            java.lang.Object r3 = r0.get(r3)
            Yue.ۥۡۡۧۦ r3 = (Yue.InterfaceC4320) r3
            if (r3 != 0) goto L31
            goto L34
        L31:
            r3.setValue(r4)
        L34:
            return
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't put value with type "
            r0.append(r1)
            Yue.C3329.m13903(r4)
            java.lang.Class r4 = r4.getClass()
            r0.append(r4)
            java.lang.String r4 = " into saved state"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @Yue.InterfaceC3875
    public final void setSavedStateProvider(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 androidx.savedstate.C7816.InterfaceC7819 r3) {
            r1 = this;
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "provider"
            Yue.C3329.m13906(r3, r0)
            java.util.Map<java.lang.String, androidx.savedstate.ۥ$ۥ۟۟> r0 = r1.savedStateProviders
            r0.put(r2, r3)
            return
    }
}
