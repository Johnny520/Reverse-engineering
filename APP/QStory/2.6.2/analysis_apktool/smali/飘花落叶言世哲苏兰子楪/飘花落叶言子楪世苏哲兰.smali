.class public final synthetic L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10

    .line 1
    iget v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Landroid/widget/TextView;

    .line 11
    .line 12
    iget-object p0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    iget-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Matrix;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroid/graphics/Matrix;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Matrix;

    .line 30
    .line 31
    :cond_0
    iget v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 32
    .line 33
    iget v1, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 34
    .line 35
    add-float/2addr v0, v1

    .line 36
    iput v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 37
    .line 38
    iget-object v1, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Matrix;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/graphics/LinearGradient;

    .line 45
    .line 46
    iget-object p0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    const-wide/16 v0, 0x64

    .line 52
    .line 53
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->postInvalidateDelayed(J)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Landroid/widget/TextView;

    .line 60
    .line 61
    iget-object p0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;

    .line 68
    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    new-instance v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;

    .line 72
    .line 73
    invoke-direct {v0}, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v1, Landroid/graphics/Matrix;

    .line 77
    .line 78
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v1, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Matrix;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const/high16 v2, 0x43160000    # 150.0f

    .line 88
    .line 89
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    int-to-float v1, v1

    .line 94
    iput v1, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:F

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const/high16 v2, 0x40a00000    # 5.0f

    .line 101
    .line 102
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    int-to-float v1, v1

    .line 107
    iput v1, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 108
    .line 109
    new-instance v2, Landroid/graphics/LinearGradient;

    .line 110
    .line 111
    iget v5, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:F

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    sget-object v9, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 115
    .line 116
    const/4 v3, 0x0

    .line 117
    const/4 v4, 0x0

    .line 118
    const/4 v6, 0x0

    .line 119
    iget-object v7, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:[I

    .line 120
    .line 121
    invoke-direct/range {v2 .. v9}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 122
    .line 123
    .line 124
    iput-object v2, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/graphics/LinearGradient;

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget-object v2, v0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/graphics/LinearGradient;

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :cond_1
    return-void

    .line 139
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v0, p1

    .line 142
    check-cast v0, Landroid/view/View;

    .line 143
    .line 144
    instance-of v0, v0, Landroid/widget/TextView;

    .line 145
    .line 146
    if-eqz v0, :cond_2

    .line 147
    .line 148
    check-cast p1, Landroid/widget/TextView;

    .line 149
    .line 150
    iget-object p0, p0, L飘花落叶言世哲苏兰子楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/HashMap;

    .line 151
    .line 152
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    :cond_2
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
