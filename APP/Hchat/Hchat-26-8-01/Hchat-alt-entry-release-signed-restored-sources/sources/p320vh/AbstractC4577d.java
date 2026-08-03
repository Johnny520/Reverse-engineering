package p320vh;

import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;

/* JADX INFO: renamed from: vh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4577d {

    /* JADX INFO: renamed from: a */
    public static final String[] f15077a;

    /* JADX INFO: renamed from: b */
    public static final String f15078b;

    /* JADX INFO: renamed from: c */
    public static final String f15079c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String strM5163j;
        String[] strArr = new String[8];
        for (int i9 = 0; i9 < 8; i9++) {
            if (i9 == 0) {
                strM5163j = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                if (1 > i9 || i9 >= 8) {
                    C2104o.m5294t("Failed requirement.");
                    return;
                }
                strM5163j = AbstractC2091b.m5163j(AbstractC0921a.m2256s(i9, i9, "\n    uniform shader child;\n    uniform float2 in_blurOffset[", "];\n    uniform float in_blurWeight[", "];\n    uniform float2 in_maxCoord;\n\n    half4 main(float2 xy) {\n        half4 color = half4(0);\n        for (int i = 0; i < "), i9, "; i++) {\n            float2 offset = in_blurOffset[i];\n            float2 c1 = clamp(xy + offset, float2(0.5), in_maxCoord);\n            float2 c2 = clamp(xy - offset, float2(0.5), in_maxCoord);\n            color += (child.eval(c1) + child.eval(c2)) * half(in_blurWeight[i]);\n        }\n        if (color.a > 0.0039) {\n            return half4(color.rgb / color.a, 1.0);\n        }\n        return color;\n    }\n");
            }
            strArr[i9] = strM5163j;
        }
        f15077a = strArr;
        f15078b = m9023a(false);
        f15079c = m9023a(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m9023a(boolean z9) {
        return AbstractC0255e.m1022k("\nuniform float2 halfView;\nuniform float2 halfViewFloor;\nuniform float4 cornerRadii;\nuniform float strokeWidth;\nuniform float innerBlurRadius;\nuniform float innerBlurRadiusSq;\nuniform float highlightAlpha;\n\nlayout(color) uniform half4 strokeColor;\nuniform float strokeAlphaMul;\n\nuniform float3 lightDir1;\nlayout(color) uniform half4 lightColor1;\nuniform float lightIntensity1;\n\nuniform float3 lightDir2;\nlayout(color) uniform half4 lightColor2;\nuniform float lightIntensity2;\n", z9 ? HttpUrl.FRAGMENT_ENCODE_SET : "\nuniform float2 axis1;\nuniform float2 axis2;\n", "\nfloat pickRadius(float2 fragCoord, float4 radii) {\n    float2 up = fragCoord.y < halfView.y ? radii.xy : radii.zw;\n    return fragCoord.x < halfView.x ? up.x : up.y;\n}\n\n// caller passes non-negative pos (already abs-folded), so skip the redundant abs.\nfloat roundedBoxSDF(float2 pos, float2 halfSize, float radius) {\n    radius = min(radius, min(halfSize.x, halfSize.y));\n    float2 d = pos - halfSize + radius;\n    return length(max(d, 0.0)) + min(max(d.x, d.y), 0.0) - radius;\n}\n\nfloat3 getNormal(float2 fragCoord, float sdf, float R) {\n    float2 xy = fragCoord - halfViewFloor;\n    float2 xy_a = abs(xy);\n    float t = smoothstep(-innerBlurRadius, 0.0, sdf);\n    float z = sqrt(max(innerBlurRadiusSq - t * t, 0.0));\n    float3 coord = float3(xy_a, -z);\n\n    float2 corner = halfView - R;\n    corner.x = min(corner.x, xy_a.x);\n    corner.y = min(corner.y, xy_a.y);\n\n    float2 dir = normalize(coord.xy - corner.xy);\n    corner += dir * (R - innerBlurRadius);\n\n    if (any(lessThan(xy_a, corner))) {\n        return float3(0.0, 0.0, -1.0);\n    }\n\n    float2 signal = sign(xy);\n    float3 n = normalize(coord - float3(corner, 0.0));\n    n.xy *= signal;\n    return n;\n}\n\nhalf4 main(float2 fragCoord) {\n    float2 xy = abs(fragCoord - halfView);\n\n    float originRadius = pickRadius(fragCoord, cornerRadii);\n    float R = max(originRadius, innerBlurRadius);\n\n    if (all(lessThan(xy, halfView - R))) {\n        return half4(0.0);\n    }\n\n    float sdf = roundedBoxSDF(xy, halfView, originRadius);\n    half outMask = half(smoothstep(0.0, -1.0, sdf));\n    float strokeAlpha = smoothstep(-strokeWidth, -strokeWidth + 1.0, sdf);\n\n    // Native: stroke = uStrokeColor * sa; result += stroke.rgb * stroke.a\n    //       = strokeColor.rgb * strokeColor.a * sa^2\n    half3 rgb = strokeColor.rgb * half(strokeAlphaMul * strokeAlpha * strokeAlpha);\n\n    float3 n = getNormal(fragCoord, sdf, R);\n", z9 ? "\n    float l1 = dot(n.xy, lightDir1.xy);\n    rgb += half(l1 * l1 * lightIntensity1) * lightColor1.rgb;\n    float l2 = dot(n.xy, lightDir2.xy);\n    rgb += half(l2 * l2 * lightIntensity2) * lightColor2.rgb;\n" : "\n    float falloff1 = max(dot(float3(axis1, 0.0), n), 0.0);\n    float light1 = clamp(dot(n, lightDir1) * falloff1, 0.0, 1.0);\n    rgb += half(light1 * light1 * lightIntensity1) * lightColor1.rgb;\n\n    float falloff2 = max(dot(float3(axis2, 0.0), n), 0.0);\n    float light2 = clamp(dot(n, lightDir2) * falloff2, 0.0, 1.0);\n    rgb += half(light2 * light2 * lightIntensity2) * lightColor2.rgb;\n", "\n    return half4(rgb * half(highlightAlpha), 1.0) * outMask;\n}\n");
    }
}
