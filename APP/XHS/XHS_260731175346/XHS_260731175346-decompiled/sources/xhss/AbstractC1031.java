package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛴᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1031 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.AbstractC1178 f3335 = null;

    static {
            xhss.ᲀᛴᲀᛳ r0 = new xhss.ᲀᛴᲀᛳ     // Catch: java.lang.ReflectiveOperationException -> L6
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L6
            goto Lb
        L6:
            xhss.ᛴᲀᛲᛶ r0 = new xhss.ᛴᲀᛲᛶ
            r0.<init>()
        Lb:
            xhss.AbstractC1031.f3335 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.lang.String m1676(java.lang.reflect.Constructor r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.<init>(r1)
            m1679(r2, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static java.lang.String m1677(java.lang.reflect.Field r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.<init>(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static java.lang.String m1678(java.lang.Exception r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.lang.reflect.InaccessibleObjectException"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L21
            java.lang.String r0 = "to module com.google.gson"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L21
            java.lang.String r2 = "reflection-inaccessible-to-module-gson"
            goto L23
        L21:
            java.lang.String r2 = "reflection-inaccessible"
        L23:
            java.lang.String r0 = "https://github.com/google/gson/blob/main/Troubleshooting.md#"
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r0 = "\nSee "
            java.lang.String r2 = r0.concat(r2)
            return r2
        L30:
            java.lang.String r2 = ""
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1679(java.lang.reflect.AccessibleObject r2, java.lang.StringBuilder r3) {
            r0 = 40
            r3.append(r0)
            boolean r0 = r2 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L10
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r2 = r2.getParameterTypes()
            goto L16
        L10:
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r2 = r2.getParameterTypes()
        L16:
            r0 = 0
        L17:
            int r1 = r2.length
            if (r0 >= r1) goto L2d
            if (r0 <= 0) goto L21
            java.lang.String r1 = ", "
            r3.append(r1)
        L21:
            r1 = r2[r0]
            java.lang.String r1 = r1.getSimpleName()
            r3.append(r1)
            int r0 = r0 + 1
            goto L17
        L2d:
            r2 = 41
            r3.append(r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static java.lang.String m1680(java.lang.reflect.AccessibleObject r4, boolean r5) {
            boolean r0 = r4 instanceof java.lang.reflect.Field
            java.lang.String r1 = "'"
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "field '"
            r0.<init>(r2)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = m1677(r4)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            goto L84
        L1e:
            boolean r0 = r4 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L56
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r4.getName()
            r0.<init>(r2)
            m1679(r4, r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "method '"
            r2.<init>(r3)
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = "#"
            r2.append(r4)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            goto L84
        L56:
            boolean r0 = r4 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L72
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "constructor '"
            r0.<init>(r2)
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.String r4 = m1676(r4)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            goto L84
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<unknown AccessibleObject> "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L84:
            if (r5 == 0) goto Lad
            r5 = 0
            char r0 = r4.charAt(r5)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto Lad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r5 = r4.charAt(r5)
            char r5 = java.lang.Character.toUpperCase(r5)
            r0.append(r5)
            r5 = 1
            java.lang.String r4 = r4.substring(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        Lad:
            return r4
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static void m1681(java.lang.reflect.AccessibleObject r5) {
            r0 = 1
            r5.setAccessible(r0)     // Catch: java.lang.Exception -> L5
            return
        L5:
            r0 = move-exception
            r1 = 0
            java.lang.String r5 = m1680(r5, r1)
            xhss.ᛱᲈᛲᛷ r1 = new xhss.ᛱᲈᛲᛷ
            java.lang.String r2 = m1678(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed making "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = r3.toString()
            r1.<init>(r5, r0)
            throw r1
    }
}
