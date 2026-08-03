package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Modifiers implements java.io.Serializable, java.lang.Cloneable {
    private static final int ACCESS_MODIFIERS = 7;
    public static final int CLASS = 0;
    public static final java.util.Map<java.lang.String, java.lang.Integer> CONST = null;
    public static final int CONSTRUCTOR = 5;
    public static final int FIELD = 3;
    public static final int INTERFACE = 1;
    public static final int METHOD = 2;
    public static final int PARAMETER = 4;
    private static final long serialVersionUID = 1;
    private int context;
    private int modifiers;
    private java.lang.String type;
    private int valid;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 17
            r0.<init>(r1)
            bsh.Modifiers.CONST = r0
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "public"
            r0.put(r2, r1)
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "private"
            r0.put(r2, r1)
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "protected"
            r0.put(r2, r1)
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "static"
            r0.put(r2, r1)
            r1 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "final"
            r0.put(r2, r1)
            r1 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "synchronized"
            r0.put(r2, r1)
            r1 = 64
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "volatile"
            r0.put(r2, r1)
            r1 = 128(0x80, float:1.8E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "transient"
            r0.put(r2, r1)
            r1 = 256(0x100, float:3.59E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "native"
            r0.put(r2, r1)
            r1 = 512(0x200, float:7.17E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "interface"
            r0.put(r2, r1)
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "abstract"
            r0.put(r2, r1)
            r1 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "strict"
            r0.put(r2, r1)
            r1 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "synthetic"
            r0.put(r2, r1)
            r1 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "annotation"
            r0.put(r2, r1)
            r1 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "enum"
            r0.put(r2, r1)
            r1 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "mandated"
            r0.put(r2, r1)
            r1 = 65536(0x10000, float:9.1835E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "default"
            r0.put(r2, r1)
            return
    }

    public Modifiers(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.modifiers = r0
            r1.appliedContext(r2)
            return
    }

    private void appliedContext(int r3) {
            r2 = this;
            r2.context = r3
            if (r3 == 0) goto L70
            r0 = 1
            if (r3 == r0) goto L65
            r0 = 2
            if (r3 == r0) goto L4b
            r0 = 3
            if (r3 == r0) goto L31
            r0 = 4
            if (r3 == r0) goto L26
            r0 = 5
            if (r3 == r0) goto L1b
            r3 = 0
            r2.valid = r3
            java.lang.String r3 = "Unknown"
            r2.type = r3
            return
        L1b:
            int r3 = java.lang.reflect.Modifier.constructorModifiers()
            r2.valid = r3
            java.lang.String r3 = "Constructor"
            r2.type = r3
            return
        L26:
            int r3 = java.lang.reflect.Modifier.parameterModifiers()
            r2.valid = r3
            java.lang.String r3 = "Parameter"
            r2.type = r3
            return
        L31:
            int r3 = java.lang.reflect.Modifier.fieldModifiers()
            java.util.Map<java.lang.String, java.lang.Integer> r0 = bsh.Modifiers.CONST
            java.lang.String r1 = "enum"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3 = r3 | r0
            r2.valid = r3
            java.lang.String r3 = "Field"
            r2.type = r3
            return
        L4b:
            int r3 = java.lang.reflect.Modifier.methodModifiers()
            java.util.Map<java.lang.String, java.lang.Integer> r0 = bsh.Modifiers.CONST
            java.lang.String r1 = "default"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3 = r3 | r0
            r2.valid = r3
            java.lang.String r3 = "Method"
            r2.type = r3
            return
        L65:
            int r3 = java.lang.reflect.Modifier.interfaceModifiers()
            r2.valid = r3
            java.lang.String r3 = "Interface"
            r2.type = r3
            return
        L70:
            int r3 = java.lang.reflect.Modifier.classModifiers()
            r2.valid = r3
            java.lang.String r3 = "Class"
            r2.type = r3
            return
    }

    private int toModifier(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = bsh.Modifiers.CONST
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r3 = r0.intValue()
            return r3
        Lf:
            java.lang.String r0 = "Unknown modifier: '"
            java.lang.String r1 = "'"
            java.lang.String r3 = eh.a.n(r0, r3, r1)
            j8.o.A(r3)
            r3 = 0
            return r3
    }

    private java.lang.String toModifier(int r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = bsh.Modifiers.CONST
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.String, java.lang.Integer> r2 = bsh.Modifiers.CONST
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r4 != r2) goto La
            return r1
        L25:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
    }

    public void addModifier(int r3) {
            r2 = this;
            int r0 = r2.valid
            r0 = r0 & r3
            if (r0 == 0) goto L1f
            r0 = 7
            if (r3 >= r0) goto L19
            int r0 = r2.modifiers
            r1 = r0 & 7
            if (r1 <= 0) goto L19
            r1 = r0 | r3
            if (r1 != r0) goto L13
            goto L19
        L13:
            java.lang.String r3 = "public/private/protected cannot be used in combination."
            j8.o.A(r3)
            return
        L19:
            int r0 = r2.modifiers
            r3 = r3 | r0
            r2.modifiers = r3
            return
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.type
            r0.append(r1)
            java.lang.String r1 = " cannot be declared '"
            r0.append(r1)
            java.lang.String r3 = r2.toModifier(r3)
            java.lang.String r1 = "'"
            java.lang.String r3 = eh.a.r(r0, r3, r1)
            j8.o.A(r3)
            return
    }

    public void addModifier(java.lang.String r1) {
            r0 = this;
            int r1 = r0.toModifier(r1)
            r0.addModifier(r1)
            return
    }

    public void addModifiers(int r3) {
            r2 = this;
            r0 = 1
        L1:
            if (r0 > r3) goto Ld
            r1 = r3 & r0
            if (r1 == 0) goto La
            r2.addModifier(r0)
        La:
            int r0 = r0 * 2
            goto L1
        Ld:
            return
    }

    public void changeContext(int r3) {
            r2 = this;
            int r0 = r2.modifiers
            r1 = 0
            r2.modifiers = r1
            r2.appliedContext(r3)
            r2.addModifiers(r0)
            return
    }

    public bsh.Modifiers clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()
            bsh.Modifiers r0 = (bsh.Modifiers) r0
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m1clone() {
            r1 = this;
            bsh.Modifiers r0 = r1.clone()
            return r0
    }

    public int getModifiers() {
            r1 = this;
            int r0 = r1.modifiers
            return r0
    }

    public boolean hasModifier(int r2) {
            r1 = this;
            int r0 = r1.modifiers
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    public boolean hasModifier(java.lang.String r1) {
            r0 = this;
            int r1 = r0.toModifier(r1)
            boolean r1 = r0.hasModifier(r1)
            return r1
    }

    public boolean isAppliedContext(int r2) {
            r1 = this;
            int r0 = r1.context
            if (r0 != r2) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }

    public void setConstant() {
            r1 = this;
            r0 = 25
            r1.modifiers = r0
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Modifiers: "
            r0.<init>(r1)
            int r1 = r4.modifiers
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            r0.append(r1)
            int r1 = r4.modifiers
            java.util.Map<java.lang.String, java.lang.Integer> r2 = bsh.Modifiers.CONST
            java.lang.String r3 = "enum"
            java.lang.Object r3 = r2.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1 = r1 & r3
            if (r1 == 0) goto L26
            java.lang.String r1 = " enum"
            goto L3c
        L26:
            int r1 = r4.modifiers
            java.lang.String r3 = "default"
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1 = r1 & r2
            if (r1 == 0) goto L3a
            java.lang.String r1 = " default"
            goto L3c
        L3a:
            java.lang.String r1 = ""
        L3c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
