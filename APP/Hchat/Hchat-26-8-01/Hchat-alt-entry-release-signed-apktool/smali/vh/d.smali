.class public abstract Lvh/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    const/4 v4, 0x1

    .line 8
    if-ge v3, v0, :cond_2

    .line 9
    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    const-string v4, ""

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    if-gt v4, v3, :cond_1

    .line 16
    .line 17
    if-ge v3, v0, :cond_1

    .line 18
    .line 19
    const-string v4, "];\n    uniform float in_blurWeight["

    .line 20
    .line 21
    const-string v5, "];\n    uniform float2 in_maxCoord;\n\n    half4 main(float2 xy) {\n        half4 color = half4(0);\n        for (int i = 0; i < "

    .line 22
    .line 23
    const-string v6, "\n    uniform shader child;\n    uniform float2 in_blurOffset["

    .line 24
    .line 25
    invoke-static {v3, v3, v6, v4, v5}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "; i++) {\n            float2 offset = in_blurOffset[i];\n            float2 c1 = clamp(xy + offset, float2(0.5), in_maxCoord);\n            float2 c2 = clamp(xy - offset, float2(0.5), in_maxCoord);\n            color += (child.eval(c1) + child.eval(c2)) * half(in_blurWeight[i]);\n        }\n        if (color.a > 0.0039) {\n            return half4(color.rgb / color.a, 1.0);\n        }\n        return color;\n    }\n"

    .line 30
    .line 31
    invoke-static {v4, v3, v5}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :goto_1
    aput-object v4, v1, v3

    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-string v0, "Failed requirement."

    .line 41
    .line 42
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    sput-object v1, Lvh/d;->a:[Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2}, Lvh/d;->a(Z)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lvh/d;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v4}, Lvh/d;->a(Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lvh/d;->c:Ljava/lang/String;

    .line 59
    .line 60
    return-void
.end method

.method public static final a(Z)Ljava/lang/String;
    .locals 4

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v0, "\nuniform float2 axis1;\nuniform float2 axis2;\n"

    .line 7
    .line 8
    :goto_0
    if-eqz p0, :cond_1

    .line 9
    .line 10
    const-string p0, "\n    float l1 = dot(n.xy, lightDir1.xy);\n    rgb += half(l1 * l1 * lightIntensity1) * lightColor1.rgb;\n    float l2 = dot(n.xy, lightDir2.xy);\n    rgb += half(l2 * l2 * lightIntensity2) * lightColor2.rgb;\n"

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    const-string p0, "\n    float falloff1 = max(dot(float3(axis1, 0.0), n), 0.0);\n    float light1 = clamp(dot(n, lightDir1) * falloff1, 0.0, 1.0);\n    rgb += half(light1 * light1 * lightIntensity1) * lightColor1.rgb;\n\n    float falloff2 = max(dot(float3(axis2, 0.0), n), 0.0);\n    float light2 = clamp(dot(n, lightDir2) * falloff2, 0.0, 1.0);\n    rgb += half(light2 * light2 * lightIntensity2) * lightColor2.rgb;\n"

    .line 14
    .line 15
    :goto_1
    const-string v1, "\nfloat pickRadius(float2 fragCoord, float4 radii) {\n    float2 up = fragCoord.y < halfView.y ? radii.xy : radii.zw;\n    return fragCoord.x < halfView.x ? up.x : up.y;\n}\n\n// caller passes non-negative pos (already abs-folded), so skip the redundant abs.\nfloat roundedBoxSDF(float2 pos, float2 halfSize, float radius) {\n    radius = min(radius, min(halfSize.x, halfSize.y));\n    float2 d = pos - halfSize + radius;\n    return length(max(d, 0.0)) + min(max(d.x, d.y), 0.0) - radius;\n}\n\nfloat3 getNormal(float2 fragCoord, float sdf, float R) {\n    float2 xy = fragCoord - halfViewFloor;\n    float2 xy_a = abs(xy);\n    float t = smoothstep(-innerBlurRadius, 0.0, sdf);\n    float z = sqrt(max(innerBlurRadiusSq - t * t, 0.0));\n    float3 coord = float3(xy_a, -z);\n\n    float2 corner = halfView - R;\n    corner.x = min(corner.x, xy_a.x);\n    corner.y = min(corner.y, xy_a.y);\n\n    float2 dir = normalize(coord.xy - corner.xy);\n    corner += dir * (R - innerBlurRadius);\n\n    if (any(lessThan(xy_a, corner))) {\n        return float3(0.0, 0.0, -1.0);\n    }\n\n    float2 signal = sign(xy);\n    float3 n = normalize(coord - float3(corner, 0.0));\n    n.xy *= signal;\n    return n;\n}\n\nhalf4 main(float2 fragCoord) {\n    float2 xy = abs(fragCoord - halfView);\n\n    float originRadius = pickRadius(fragCoord, cornerRadii);\n    float R = max(originRadius, innerBlurRadius);\n\n    if (all(lessThan(xy, halfView - R))) {\n        return half4(0.0);\n    }\n\n    float sdf = roundedBoxSDF(xy, halfView, originRadius);\n    half outMask = half(smoothstep(0.0, -1.0, sdf));\n    float strokeAlpha = smoothstep(-strokeWidth, -strokeWidth + 1.0, sdf);\n\n    // Native: stroke = uStrokeColor * sa; result += stroke.rgb * stroke.a\n    //       = strokeColor.rgb * strokeColor.a * sa^2\n    half3 rgb = strokeColor.rgb * half(strokeAlphaMul * strokeAlpha * strokeAlpha);\n\n    float3 n = getNormal(fragCoord, sdf, R);\n"

    .line 16
    .line 17
    const-string v2, "\n    return half4(rgb * half(highlightAlpha), 1.0) * outMask;\n}\n"

    .line 18
    .line 19
    const-string v3, "\nuniform float2 halfView;\nuniform float2 halfViewFloor;\nuniform float4 cornerRadii;\nuniform float strokeWidth;\nuniform float innerBlurRadius;\nuniform float innerBlurRadiusSq;\nuniform float highlightAlpha;\n\nlayout(color) uniform half4 strokeColor;\nuniform float strokeAlphaMul;\n\nuniform float3 lightDir1;\nlayout(color) uniform half4 lightColor1;\nuniform float lightIntensity1;\n\nuniform float3 lightDir2;\nlayout(color) uniform half4 lightColor2;\nuniform float lightIntensity2;\n"

    .line 20
    .line 21
    invoke-static {v3, v0, v1, p0, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
