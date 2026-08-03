package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ android.graphics.RuntimeShader a() {
            android.graphics.RuntimeShader r0 = new android.graphics.RuntimeShader
            java.lang.String r1 = "\n    uniform float2 size;\n    layout(color) uniform half4 color;\n    uniform float radius;\n    uniform float2 position;\n    \n    half4 main(float2 coord) {\n        float dist = distance(coord, position);\n        float intensity = smoothstep(radius, radius * 0.5, dist);\n        return color * intensity;\n    }"
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ void b() {
            android.graphics.RuntimeShader r0 = new android.graphics.RuntimeShader
            return
    }

    public static /* bridge */ /* synthetic */ void c(android.graphics.RuntimeShader r1, float r2) {
            java.lang.String r0 = "radius"
            r1.setFloatUniform(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void d(android.graphics.RuntimeShader r1, float r2, float r3) {
            java.lang.String r0 = "size"
            r1.setFloatUniform(r0, r2, r3)
            return
    }

    public static /* bridge */ /* synthetic */ void e(android.graphics.RuntimeShader r1, int r2) {
            java.lang.String r0 = "color"
            r1.setColorUniform(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void f(android.graphics.RuntimeShader r1, float r2, float r3) {
            java.lang.String r0 = "position"
            r1.setFloatUniform(r0, r2, r3)
            return
    }
}
