package p348xb;

import android.graphics.RuntimeShader;

/* JADX INFO: renamed from: xb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5765k {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CONSTRUCTOR 
  ("
    uniform float2 size;
    layout(color) uniform half4 color;
    uniform float radius;
    uniform float2 position;
    
    half4 main(float2 coord) {
        float dist = distance(coord, position);
        float intensity = smoothstep(radius, radius * 0.5, dist);
        return color * intensity;
    }")
 A[MD:(java.lang.String):void (c)] (LINE:5) call: android.graphics.RuntimeShader.<init>(java.lang.String):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RuntimeShader m10458a() {
        return new RuntimeShader("\n    uniform float2 size;\n    layout(color) uniform half4 color;\n    uniform float radius;\n    uniform float2 position;\n    \n    half4 main(float2 coord) {\n        float dist = distance(coord, position);\n        float intensity = smoothstep(radius, radius * 0.5, dist);\n        return color * intensity;\n    }");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10459b() {
    }
}
