package defpackage;

/* JADX INFO: renamed from: ᲇᛳᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2026 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.AbstractC0397 f8732 = null;

    static {
            ᛲᲈᲀᛶ r0 = new ᛲᲈᲀᛶ     // Catch: java.lang.ReflectiveOperationException -> L6
            r0.<init>()     // Catch: java.lang.ReflectiveOperationException -> L6
            goto Lb
        L6:
            ᛴᲈᛲᛵ r0 = new ᛴᲈᛲᛵ
            r0.<init>()
        Lb:
            defpackage.AbstractC2026.f8732 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static java.lang.String m3412(java.lang.Exception r2) {
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

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static java.lang.String m3413(java.lang.reflect.AccessibleObject r4, boolean r5) {
            boolean r0 = r4 instanceof java.lang.reflect.Field
            java.lang.String r1 = "'"
            if (r0 == 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "field '"
            r0.<init>(r2)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = m3414(r4)
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
            m3415(r4, r0)
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
            java.lang.String r4 = m3416(r4)
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

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m3414(java.lang.reflect.Field r2) {
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

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3415(java.lang.reflect.AccessibleObject r2, java.lang.StringBuilder r3) {
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.lang.String m3416(java.lang.reflect.Constructor r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.<init>(r1)
            m3415(r2, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static void m3417(java.lang.reflect.AccessibleObject r5) {
            r0 = 1
            r5.setAccessible(r0)     // Catch: java.lang.Exception -> L5
            return
        L5:
            r0 = move-exception
            r1 = 0
            java.lang.String r5 = m3413(r5, r1)
            ᛲᛱᛶᲀ r1 = new ᛲᛱᛶᲀ
            java.lang.String r2 = m3412(r0)
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
