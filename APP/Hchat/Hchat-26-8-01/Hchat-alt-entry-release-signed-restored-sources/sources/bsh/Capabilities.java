package bsh;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Capabilities implements Supplier<Boolean>, Consumer<Boolean> {
    private static final ThreadLocal<Boolean> ACCESSIBILITY;
    private static final Map<String, Class<?>> classes;
    static final Capabilities instance;
    private volatile boolean accessibility = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Capabilities capabilities = new Capabilities();
        instance = capabilities;
        ACCESSIBILITY = ThreadLocal.withInitial(capabilities);
        classes = new WeakHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Capabilities() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean classExists(String str) {
        Map<String, Class<?>> map = classes;
        if (!map.containsKey(str)) {
            try {
                map.put(str, Class.forName(str));
            } catch (ClassNotFoundException unused) {
                classes.put(str, null);
            }
        }
        return getExisting(str) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> getExisting(String str) {
        return classes.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean haveAccessibility() {
        return ACCESSIBILITY.get().booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean haveSwing() {
        return classExists("javax.swing.JButton");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setAccessibility(boolean z9) {
        if (z9) {
            String.class.getDeclaredMethods();
            try {
                Field declaredField = String.class.getDeclaredField("value");
                declaredField.setAccessible(true);
                declaredField.setAccessible(false);
            } catch (NoSuchFieldException unused) {
            }
            ACCESSIBILITY.set(Boolean.TRUE);
        } else {
            ACCESSIBILITY.set(Boolean.FALSE);
        }
        BshClassManager.memberCache.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
    @Override // java.util.function.Consumer
    public void accept(Boolean bool) {
        this.accessibility = bool.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.function.Supplier
    public Boolean get() {
        return Boolean.valueOf(this.accessibility);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Unavailable extends UtilEvalError {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Unavailable(String str) {
            super(str);
        }

        public Unavailable(String str, Throwable th2) {
            super(str, th2);
        }
    }
}
