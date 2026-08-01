package io.github.libxposed.service;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import p000.RunnableC0446s1;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RemotePreferences implements SharedPreferences {
    private static final String TAG = "RemotePreferences";
    private final String mGroup;
    private final Map<SharedPreferences.OnSharedPreferenceChangeListener, Object> mListeners = Collections.synchronizedMap(new WeakHashMap());
    private volatile Map<String, Object> mMap;
    private final XposedService mService;
    private static final Object CONTENT = new Object();
    private static final ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();
    static volatile boolean shouldNotifyCleared = false;

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public class Editor implements SharedPreferences.Editor {
        private final HashSet<String> mDelete = new HashSet<>();
        private final HashMap<String, Object> mPut = new HashMap<>();
        private boolean mClear = false;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Editor() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Bundle buildCommitBundle() {
            if (!this.mClear && this.mDelete.isEmpty() && this.mPut.isEmpty()) {
                return null;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("clear", this.mClear);
            bundle.putSerializable("delete", new HashSet(this.mDelete));
            bundle.putSerializable("put", new HashMap(this.mPut));
            return bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: lambda$apply$0(Landroid/os/Bundle;)V */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: doCommit, reason: merged with bridge method [inline-methods] */
        public boolean lambda$apply$0(Bundle bundle) {
            if (bundle == null) {
                return true;
            }
            try {
                RemotePreferences.this.mService.asInterface().updateRemotePreferences(RemotePreferences.this.mGroup, bundle);
                return true;
            } catch (RemoteException e) {
                Log.e(RemotePreferences.TAG, "Failed to commit changes to framework", e);
                return false;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private void doUpdate() {
            ArrayList<SharedPreferences.OnSharedPreferenceChangeListener> arrayList;
            synchronized (RemotePreferences.this) {
                try {
                    final HashMap map = new HashMap(RemotePreferences.this.mMap);
                    if (this.mClear) {
                        map.clear();
                    }
                    this.mDelete.forEach(new Consumer() { // from class: vb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            map.remove((String) obj);
                        }
                    });
                    map.putAll(this.mPut);
                    RemotePreferences.this.mMap = Collections.unmodifiableMap(map);
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (RemotePreferences.this.mListeners) {
                arrayList = new ArrayList(RemotePreferences.this.mListeners.keySet());
            }
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : arrayList) {
                if (this.mClear && RemotePreferences.shouldNotifyCleared) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(RemotePreferences.this, null);
                }
                Iterator<String> it = this.mDelete.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(RemotePreferences.this, it.next());
                }
                Iterator<String> it2 = this.mPut.keySet().iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(RemotePreferences.this, it2.next());
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private void put(String str, Object obj) {
            this.mDelete.remove(str);
            this.mPut.put(str, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            Bundle bundleBuildCommitBundle = buildCommitBundle();
            if (bundleBuildCommitBundle == null) {
                return;
            }
            doUpdate();
            RemotePreferences.EXECUTOR.execute(new RunnableC0446s1(this, bundleBuildCommitBundle, 1));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.mClear = true;
            this.mDelete.clear();
            this.mPut.clear();
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            Bundle bundleBuildCommitBundle = buildCommitBundle();
            if (bundleBuildCommitBundle == null) {
                return true;
            }
            doUpdate();
            return lambda$apply$0(bundleBuildCommitBundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            put(str, Boolean.valueOf(z));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            put(str, Float.valueOf(f));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            put(str, Integer.valueOf(i));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            put(str, Long.valueOf(j));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                remove(str);
                return this;
            }
            put(str, str2);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                remove(str);
                return this;
            }
            put(str, set);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.mDelete.add(str);
            this.mPut.remove(str);
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private RemotePreferences(XposedService xposedService, String str) {
        this.mService = xposedService;
        this.mGroup = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RemotePreferences newInstance(XposedService xposedService, String str) throws RemoteException {
        Bundle bundleRequestRemotePreferences = xposedService.asInterface().requestRemotePreferences(str);
        if (bundleRequestRemotePreferences == null) {
            throw new RemoteException("Framework returns null");
        }
        RemotePreferences remotePreferences = new RemotePreferences(xposedService, str);
        Map map = (Map) bundleRequestRemotePreferences.getSerializable("map");
        if (map != null) {
            remotePreferences.mMap = Collections.unmodifiableMap(map);
            return remotePreferences;
        }
        remotePreferences.mMap = Collections.EMPTY_MAP;
        return remotePreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.mMap.containsKey(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: edit()Landroid/content/SharedPreferences$Editor; */
    @Override // android.content.SharedPreferences
    public Editor edit() {
        return new Editor();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return new TreeMap(this.mMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object obj = this.mMap.get(str);
        return obj != null ? ((Boolean) obj).booleanValue() : z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object obj = this.mMap.get(str);
        return obj != null ? ((Float) obj).floatValue() : f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object obj = this.mMap.get(str);
        return obj != null ? ((Integer) obj).intValue() : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object obj = this.mMap.get(str);
        return obj != null ? ((Long) obj).longValue() : j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        return (String) this.mMap.getOrDefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return (Set) this.mMap.getOrDefault(str, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void onDelete() {
        this.mMap = Collections.EMPTY_MAP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.put(onSharedPreferenceChangeListener, CONTENT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.mListeners.remove(onSharedPreferenceChangeListener);
    }
}
