package androidx.core.telephony;

/* JADX INFO: loaded from: classes2.dex */
public class SubscriptionManagerCompat {
    private static java.lang.reflect.Method sGetSlotIndexMethod;

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getSlotIndex(int r1) {
                int r0 = android.telephony.SubscriptionManager.getSlotIndex(r1)
                return r0
        }
    }

    private SubscriptionManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSlotIndex(int r4) {
            r0 = -1
            if (r4 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lf
            int r0 = androidx.core.telephony.SubscriptionManagerCompat.Api29Impl.getSlotIndex(r4)
            return r0
        Lf:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            if (r1 != 0) goto L2a
        L14:
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            java.lang.String r2 = "getSlotIndex"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod = r1     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
        L2a:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            if (r1 == 0) goto L42
            int r0 = r1.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L43 java.lang.IllegalAccessException -> L45 java.lang.NoSuchMethodException -> L47
            return r0
        L42:
            goto L48
        L43:
            r1 = move-exception
            goto L49
        L45:
            r1 = move-exception
            goto L48
        L47:
            r1 = move-exception
        L48:
        L49:
            return r0
    }
}
