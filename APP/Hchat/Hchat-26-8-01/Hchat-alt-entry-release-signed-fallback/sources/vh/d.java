package vh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f14381a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.String f14382b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.String f14383c = null;

    static {
            r0 = 8
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L6:
            r4 = 1
            if (r3 >= r0) goto L2d
            if (r3 != 0) goto Le
            java.lang.String r4 = ""
            goto L22
        Le:
            if (r4 > r3) goto L27
            if (r3 >= r0) goto L27
            java.lang.String r4 = "];\n    uniform float in_blurWeight["
            java.lang.String r5 = "];\n    uniform float2 in_maxCoord;\n\n    half4 main(float2 xy) {\n        half4 color = half4(0);\n        for (int i = 0; i < "
            java.lang.String r6 = "\n    uniform shader child;\n    uniform float2 in_blurOffset["
            java.lang.StringBuilder r4 = eh.a.s(r3, r3, r6, r4, r5)
            java.lang.String r5 = "; i++) {\n            float2 offset = in_blurOffset[i];\n            float2 c1 = clamp(xy + offset, float2(0.5), in_maxCoord);\n            float2 c2 = clamp(xy - offset, float2(0.5), in_maxCoord);\n            color += (child.eval(c1) + child.eval(c2)) * half(in_blurWeight[i]);\n        }\n        if (color.a > 0.0039) {\n            return half4(color.rgb / color.a, 1.0);\n        }\n        return color;\n    }\n"
            java.lang.String r4 = j8.b.j(r4, r3, r5)
        L22:
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        L27:
            java.lang.String r0 = "Failed requirement."
            j8.o.t(r0)
            return
        L2d:
            vh.d.f14381a = r1
            java.lang.String r0 = a(r2)
            vh.d.f14382b = r0
            java.lang.String r0 = a(r4)
            vh.d.f14383c = r0
            return
    }

    public static final java.lang.String a(boolean r4) {
            if (r4 == 0) goto L5
            java.lang.String r0 = ""
            goto L7
        L5:
            java.lang.String r0 = "\nuniform float2 axis1;\nuniform float2 axis2;\n"
        L7:
            if (r4 == 0) goto Lc
            java.lang.String r4 = "\n    float l1 = dot(n.xy, lightDir1.xy);\n    rgb += half(l1 * l1 * lightIntensity1) * lightColor1.rgb;\n    float l2 = dot(n.xy, lightDir2.xy);\n    rgb += half(l2 * l2 * lightIntensity2) * lightColor2.rgb;\n"
            goto Le
        Lc:
            java.lang.String r4 = "\n    float falloff1 = max(dot(float3(axis1, 0.0), n), 0.0);\n    float light1 = clamp(dot(n, lightDir1) * falloff1, 0.0, 1.0);\n    rgb += half(light1 * light1 * lightIntensity1) * lightColor1.rgb;\n\n    float falloff2 = max(dot(float3(axis2, 0.0), n), 0.0);\n    float light2 = clamp(dot(n, lightDir2) * falloff2, 0.0, 1.0);\n    rgb += half(light2 * light2 * lightIntensity2) * lightColor2.rgb;\n"
        Le:
            java.lang.String r1 = "\nfloat pickRadius(float2 fragCoord, float4 radii) {\n    float2 up = fragCoord.y < halfView.y ? radii.xy : radii.zw;\n    return fragCoord.x < halfView.x ? up.x : up.y;\n}\n\n// caller passes non-negative pos (already abs-folded), so skip the redundant abs.\nfloat roundedBoxSDF(float2 pos, float2 halfSize, float radius) {\n    radius = min(radius, min(halfSize.x, halfSize.y));\n    float2 d = pos - halfSize + radius;\n    return length(max(d, 0.0)) + min(max(d.x, d.y), 0.0) - radius;\n}\n\nfloat3 getNormal(float2 fragCoord, float sdf, float R) {\n    float2 xy = fragCoord - halfViewFloor;\n    float2 xy_a = abs(xy);\n    float t = smoothstep(-innerBlurRadius, 0.0, sdf);\n    float z = sqrt(max(innerBlurRadiusSq - t * t, 0.0));\n    float3 coord = float3(xy_a, -z);\n\n    float2 corner = halfView - R;\n    corner.x = min(corner.x, xy_a.x);\n    corner.y = min(corner.y, xy_a.y);\n\n    float2 dir = normalize(coord.xy - corner.xy);\n    corner += dir * (R - innerBlurRadius);\n\n    if (any(lessThan(xy_a, corner))) {\n        return float3(0.0, 0.0, -1.0);\n    }\n\n    float2 signal = sign(xy);\n    float3 n = normalize(coord - float3(corner, 0.0));\n    n.xy *= signal;\n    return n;\n}\n\nhalf4 main(float2 fragCoord) {\n    float2 xy = abs(fragCoord - halfView);\n\n    float originRadius = pickRadius(fragCoord, cornerRadii);\n    float R = max(originRadius, innerBlurRadius);\n\n    if (all(lessThan(xy, halfView - R))) {\n        return half4(0.0);\n    }\n\n    float sdf = roundedBoxSDF(xy, halfView, originRadius);\n    half outMask = half(smoothstep(0.0, -1.0, sdf));\n    float strokeAlpha = smoothstep(-strokeWidth, -strokeWidth + 1.0, sdf);\n\n    // Native: stroke = uStrokeColor * sa; result += stroke.rgb * stroke.a\n    //       = strokeColor.rgb * strokeColor.a * sa^2\n    half3 rgb = strokeColor.rgb * half(strokeAlphaMul * strokeAlpha * strokeAlpha);\n\n    float3 n = getNormal(fragCoord, sdf, R);\n"
            java.lang.String r2 = "\n    return half4(rgb * half(highlightAlpha), 1.0) * outMask;\n}\n"
            java.lang.String r3 = "\nuniform float2 halfView;\nuniform float2 halfViewFloor;\nuniform float4 cornerRadii;\nuniform float strokeWidth;\nuniform float innerBlurRadius;\nuniform float innerBlurRadiusSq;\nuniform float highlightAlpha;\n\nlayout(color) uniform half4 strokeColor;\nuniform float strokeAlphaMul;\n\nuniform float3 lightDir1;\nlayout(color) uniform half4 lightColor1;\nuniform float lightIntensity1;\n\nuniform float3 lightDir2;\nlayout(color) uniform half4 lightColor2;\nuniform float lightIntensity2;\n"
            java.lang.String r4 = bc.e.k(r3, r0, r1, r4, r2)
            return r4
    }
}
