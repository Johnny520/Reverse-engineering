package android.view;

import Yue.C3621;
import Yue.C4335;
import Yue.C4750;
import Yue.C4896;
import Yue.C5499;
import Yue.C5943;
import Yue.C6659;
import Yue.C7388;
import Yue.C7590;
import Yue.C8003;
import Yue.InterfaceC5578;
import Yue.InterfaceC5922;
import Yue.InterfaceC6211;
import Yue.InterfaceC6309;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import Yue.InterfaceC7144;
import Yue.InterfaceC7507;
import Yue.InterfaceC7588;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.SavedStateHandle;
import androidx.savedstate.C1794;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u000234B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0017J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\"\u001a\u00020!\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010\u001fJ\u001f\u0010&\u001a\u00020!2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020!2\u0006\u0010\t\u001a\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010)R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R$\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030.0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R(\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102¨\u00065"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "", "", "initialState", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/Map;)V", "()V", C4750.f10502, C6659.f17103, "", "hasInitialValue", "initialValue", "Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "Landroidx/savedstate/ۥ$ۥ۟۟;", "savedStateProvider", "()Landroidx/savedstate/ۥ$ۥ۟۟;", "contains", "(Ljava/lang/String;)Z", "getLiveData", "(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "LYue/ۥۢ۠۟ۡ;", "getStateFlow", "(Ljava/lang/String;Ljava/lang/Object;)LYue/ۥۢ۠۟ۡ;", "", SavedStateHandle.KEYS, "()Ljava/util/Set;", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "LYue/ۥۣۢ۠ۤ;", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "remove", "provider", "setSavedStateProvider", "(Ljava/lang/String;Landroidx/savedstate/ۥ$ۥ۟۟;)V", "clearSavedStateProvider", "(Ljava/lang/String;)V", "", "regular", "Ljava/util/Map;", "savedStateProviders", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "liveDatas", "LYue/ۥۡۡۧۦ;", "flows", "Landroidx/savedstate/ۥ$ۥ۟۟;", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandle {

    @InterfaceC6399
    private static final String KEYS = "keys";

    @InterfaceC6399
    private static final String VALUES = "values";

    @InterfaceC6399
    private final Map<String, InterfaceC6309<Object>> flows;

    @InterfaceC6399
    private final Map<String, SavingStateLiveData<?>> liveDatas;

    @InterfaceC6399
    private final Map<String, Object> regular;

    @InterfaceC6399
    private final C1794.InterfaceC9000 savedStateProvider;

    @InterfaceC6399
    private final Map<String, C1794.InterfaceC9000> savedStateProviders;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @InterfaceC6399
    public static final Companion INSTANCE = new Companion(null);

    @InterfaceC6399
    private static final Class<? extends Object>[] ACCEPTABLE_CLASSES = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    @InterfaceC6211(m2698d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m2699d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, m2700k = 1, m2701mv = {1, 8, 0}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.SavedStateHandle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
        @InterfaceC5578
        public final SavedStateHandle createHandle(@InterfaceC6489 Bundle bundle, @InterfaceC6489 Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap map = new HashMap();
                for (String str : bundle2.keySet()) {
                    C5499.m17102(str, C6659.f17103);
                    map.put(str, bundle2.get(str));
                }
                return new SavedStateHandle(map);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(SavedStateHandle.KEYS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(SavedStateHandle.VALUES);
            if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = parcelableArrayList.get(i);
                C5499.m17101(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
        public final boolean validateValue(@InterfaceC6489 Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : SavedStateHandle.ACCEPTABLE_CLASSES) {
                C5499.m17100(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SavedStateHandle(@InterfaceC6399 Map<String, ? extends Object> map) {
        C5499.m17103(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.regular = linkedHashMap;
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C1794.InterfaceC9000() { // from class: Yue.ۥۡۧۤ۟
            @Override // androidx.savedstate.C1794.InterfaceC9000
            public final Bundle saveState() {
                return SavedStateHandle.savedStateProvider$lambda$0(this.f2752);
            }
        };
        linkedHashMap.putAll(map);
    }

    @InterfaceC6399
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC5578
    public static final SavedStateHandle createHandle(@InterfaceC6489 Bundle bundle, @InterfaceC6489 Bundle bundle2) {
        return INSTANCE.createHandle(bundle, bundle2);
    }

    private final <T> MutableLiveData<T> getLiveDataInternal(String key, boolean hasInitialValue, T initialValue) {
        SavingStateLiveData<?> savingStateLiveData;
        SavingStateLiveData<?> savingStateLiveData2 = this.liveDatas.get(key);
        SavingStateLiveData<?> savingStateLiveData3 = savingStateLiveData2 instanceof MutableLiveData ? savingStateLiveData2 : null;
        if (savingStateLiveData3 != null) {
            return savingStateLiveData3;
        }
        if (this.regular.containsKey(key)) {
            savingStateLiveData = new SavingStateLiveData<>(this, key, this.regular.get(key));
        } else if (hasInitialValue) {
            this.regular.put(key, initialValue);
            savingStateLiveData = new SavingStateLiveData<>(this, key, initialValue);
        } else {
            savingStateLiveData = new SavingStateLiveData<>(this, key);
        }
        this.liveDatas.put(key, savingStateLiveData);
        return savingStateLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle savedStateProvider$lambda$0(SavedStateHandle savedStateHandle) {
        C5499.m17103(savedStateHandle, "this$0");
        for (Map.Entry entry : C5943.m18642(savedStateHandle.savedStateProviders).entrySet()) {
            savedStateHandle.set((String) entry.getKey(), ((C1794.InterfaceC9000) entry.getValue()).saveState());
        }
        Set<String> setKeySet = savedStateHandle.regular.keySet();
        ArrayList arrayList = new ArrayList(setKeySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : setKeySet) {
            arrayList.add(str);
            arrayList2.add(savedStateHandle.regular.get(str));
        }
        return C3621.m675(C8003.m4014(KEYS, arrayList), C8003.m4014(VALUES, arrayList2));
    }

    @InterfaceC5922
    public final void clearSavedStateProvider(@InterfaceC6399 String key) {
        C5499.m17103(key, C6659.f17103);
        this.savedStateProviders.remove(key);
    }

    @InterfaceC5922
    public final boolean contains(@InterfaceC6399 String key) {
        C5499.m17103(key, C6659.f17103);
        return this.regular.containsKey(key);
    }

    @InterfaceC5922
    @InterfaceC6489
    public final <T> T get(@InterfaceC6399 String key) {
        C5499.m17103(key, C6659.f17103);
        try {
            return (T) this.regular.get(key);
        } catch (ClassCastException unused) {
            remove(key);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    @InterfaceC5922
    public final <T> MutableLiveData<T> getLiveData(@InterfaceC6399 String key) {
        C5499.m17103(key, C6659.f17103);
        MutableLiveData<T> liveDataInternal = getLiveDataInternal(key, false, null);
        C5499.m17101(liveDataInternal, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return liveDataInternal;
    }

    @InterfaceC6399
    @InterfaceC5922
    public final <T> InterfaceC7588<T> getStateFlow(@InterfaceC6399 String key, T initialValue) {
        C5499.m17103(key, C6659.f17103);
        Map<String, InterfaceC6309<Object>> map = this.flows;
        InterfaceC6309<Object> interfaceC6309M3748 = map.get(key);
        if (interfaceC6309M3748 == null) {
            if (!this.regular.containsKey(key)) {
                this.regular.put(key, initialValue);
            }
            interfaceC6309M3748 = C7590.m3748(this.regular.get(key));
            this.flows.put(key, interfaceC6309M3748);
            map.put(key, interfaceC6309M3748);
        }
        InterfaceC7588<T> interfaceC7588M15157 = C4896.m15157(interfaceC6309M3748);
        C5499.m17101(interfaceC7588M15157, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return interfaceC7588M15157;
    }

    @InterfaceC6399
    @InterfaceC5922
    public final Set<String> keys() {
        return C7388.m23144(C7388.m23144(this.regular.keySet(), this.savedStateProviders.keySet()), this.liveDatas.keySet());
    }

    @InterfaceC5922
    @InterfaceC6489
    public final <T> T remove(@InterfaceC6399 String key) {
        C5499.m17103(key, C6659.f17103);
        T t = (T) this.regular.remove(key);
        SavingStateLiveData<?> savingStateLiveDataRemove = this.liveDatas.remove(key);
        if (savingStateLiveDataRemove != null) {
            savingStateLiveDataRemove.detach();
        }
        this.flows.remove(key);
        return t;
    }

    @InterfaceC6399
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: savedStateProvider, reason: from getter */
    public final C1794.InterfaceC9000 getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @InterfaceC5922
    public final <T> void set(@InterfaceC6399 String key, @InterfaceC6489 T value) {
        C5499.m17103(key, C6659.f17103);
        if (!INSTANCE.validateValue(value)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't put value with type ");
            C5499.m17100(value);
            sb.append(value.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        SavingStateLiveData<?> savingStateLiveData = this.liveDatas.get(key);
        SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
        if (savingStateLiveData2 != null) {
            savingStateLiveData2.setValue(value);
        } else {
            this.regular.put(key, value);
        }
        InterfaceC6309<Object> interfaceC6309 = this.flows.get(key);
        if (interfaceC6309 == null) {
            return;
        }
        interfaceC6309.setValue(value);
    }

    @InterfaceC5922
    public final void setSavedStateProvider(@InterfaceC6399 String key, @InterfaceC6399 C1794.InterfaceC9000 provider) {
        C5499.m17103(key, C6659.f17103);
        C5499.m17103(provider, "provider");
        this.savedStateProviders.put(key, provider);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    @InterfaceC5922
    public final <T> MutableLiveData<T> getLiveData(@InterfaceC6399 String key, T initialValue) {
        C5499.m17103(key, C6659.f17103);
        return getLiveDataInternal(key, true, initialValue);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", C4750.f10502, "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "", C6659.f17103, "value", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "LYue/ۥۣۢ۠ۤ;", "setValue", "(Ljava/lang/Object;)V", "detach", "()V", "Ljava/lang/String;", "Landroidx/lifecycle/SavedStateHandle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {

        @InterfaceC6489
        private SavedStateHandle handle;

        @InterfaceC6399
        private String key;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingStateLiveData(@InterfaceC6489 SavedStateHandle savedStateHandle, @InterfaceC6399 String str, T t) {
            super(t);
            C5499.m17103(str, C6659.f17103);
            this.key = str;
            this.handle = savedStateHandle;
        }

        public final void detach() {
            this.handle = null;
        }

        @Override // android.view.MutableLiveData, android.view.LiveData
        public void setValue(T value) {
            SavedStateHandle savedStateHandle = this.handle;
            if (savedStateHandle != null) {
                savedStateHandle.regular.put(this.key, value);
                InterfaceC6309 interfaceC6309 = (InterfaceC6309) savedStateHandle.flows.get(this.key);
                if (interfaceC6309 != null) {
                    interfaceC6309.setValue(value);
                }
            }
            super.setValue(value);
        }

        public SavingStateLiveData(@InterfaceC6489 SavedStateHandle savedStateHandle, @InterfaceC6399 String str) {
            C5499.m17103(str, C6659.f17103);
            this.key = str;
            this.handle = savedStateHandle;
        }
    }

    public SavedStateHandle() {
        this.regular = new LinkedHashMap();
        this.savedStateProviders = new LinkedHashMap();
        this.liveDatas = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.savedStateProvider = new C1794.InterfaceC9000() { // from class: Yue.ۥۡۧۤ۟
            @Override // androidx.savedstate.C1794.InterfaceC9000
            public final Bundle saveState() {
                return SavedStateHandle.savedStateProvider$lambda$0(this.f2752);
            }
        };
    }
}
