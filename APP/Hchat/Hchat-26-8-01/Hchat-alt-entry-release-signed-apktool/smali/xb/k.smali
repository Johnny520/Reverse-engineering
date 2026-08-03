.class public abstract synthetic Lxb/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static synthetic a()Landroid/graphics/RuntimeShader;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/RuntimeShader;

    .line 2
    .line 3
    const-string v1, "\n    uniform float2 size;\n    layout(color) uniform half4 color;\n    uniform float radius;\n    uniform float2 position;\n    \n    half4 main(float2 coord) {\n        float dist = distance(coord, position);\n        float intensity = smoothstep(radius, radius * 0.5, dist);\n        return color * intensity;\n    }"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/graphics/RuntimeShader;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static synthetic b()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/RuntimeShader;

    .line 2
    .line 3
    return-void
.end method

.method public static bridge synthetic c(Landroid/graphics/RuntimeShader;F)V
    .locals 1

    .line 1
    const-string v0, "radius"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/graphics/RuntimeShader;->setFloatUniform(Ljava/lang/String;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic d(Landroid/graphics/RuntimeShader;FF)V
    .locals 1

    .line 1
    const-string v0, "size"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2}, Landroid/graphics/RuntimeShader;->setFloatUniform(Ljava/lang/String;FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic e(Landroid/graphics/RuntimeShader;I)V
    .locals 1

    .line 1
    const-string v0, "color"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/graphics/RuntimeShader;->setColorUniform(Ljava/lang/String;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static bridge synthetic f(Landroid/graphics/RuntimeShader;FF)V
    .locals 1

    .line 1
    const-string v0, "position"

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1, p2}, Landroid/graphics/RuntimeShader;->setFloatUniform(Ljava/lang/String;FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
