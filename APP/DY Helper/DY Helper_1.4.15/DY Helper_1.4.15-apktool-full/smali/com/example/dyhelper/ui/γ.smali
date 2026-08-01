.class public final synthetic Lcom/example/dyhelper/ui/γ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/example/dyhelper/ui/γ;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/example/dyhelper/ui/γ;->ζ:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lcom/example/dyhelper/ui/γ;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ls62;->α:Ls62;

    .line 5
    .line 6
    iget-object p0, p0, Lcom/example/dyhelper/ui/γ;->ζ:Landroid/view/View;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;

    .line 12
    .line 13
    check-cast p1, Landroid/view/MotionEvent;

    .line 14
    .line 15
    sget v0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->χ:I

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-float v3, v3

    .line 29
    div-float/2addr v0, v3

    .line 30
    const/high16 v3, 0x3f800000    # 1.0f

    .line 31
    .line 32
    invoke-static {v0, v1, v3}, Lj81;->λ(FFF)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iput v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ζ:F

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    int-to-float v0, v0

    .line 47
    div-float/2addr p1, v0

    .line 48
    invoke-static {p1, v1, v3}, Lj81;->λ(FFF)F

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    sub-float/2addr v3, p1

    .line 53
    iput v3, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->η:F

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->θ:Lcom/example/dyhelper/ui/ι;

    .line 59
    .line 60
    if-eqz p1, :cond_0

    .line 61
    .line 62
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->ζ:F

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$SvPanel;->η:F

    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1, v0, p0}, Lcom/example/dyhelper/ui/ι;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_0
    return-object v2

    .line 78
    :pswitch_0
    check-cast p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;

    .line 79
    .line 80
    check-cast p1, Landroid/view/MotionEvent;

    .line 81
    .line 82
    sget v0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->π:I

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    int-to-float v0, v0

    .line 96
    div-float/2addr p1, v0

    .line 97
    const/high16 v0, 0x43b40000    # 360.0f

    .line 98
    .line 99
    mul-float/2addr p1, v0

    .line 100
    invoke-static {p1, v1, v0}, Lj81;->λ(FFF)F

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ε:F

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ζ:Lcom/example/dyhelper/ui/ζ;

    .line 110
    .line 111
    if-eqz p1, :cond_1

    .line 112
    .line 113
    iget p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$HueBar;->ε:F

    .line 114
    .line 115
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p1, p0}, Lcom/example/dyhelper/ui/ζ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_1
    return-object v2

    .line 123
    :pswitch_1
    check-cast p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;

    .line 124
    .line 125
    check-cast p1, Landroid/view/MotionEvent;

    .line 126
    .line 127
    sget v0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->φ:I

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    int-to-float v0, v0

    .line 141
    div-float/2addr p1, v0

    .line 142
    const/high16 v0, 0x437f0000    # 255.0f

    .line 143
    .line 144
    mul-float/2addr p1, v0

    .line 145
    invoke-static {p1}, Ljx0;->в(F)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    const/4 v0, 0x0

    .line 150
    const/16 v1, 0xff

    .line 151
    .line 152
    invoke-static {p1, v0, v1}, Lj81;->μ(III)I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ε:I

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->η:Lcom/example/dyhelper/ui/ζ;

    .line 162
    .line 163
    if-eqz p1, :cond_2

    .line 164
    .line 165
    iget p0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$AlphaBar;->ε:I

    .line 166
    .line 167
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p1, p0}, Lcom/example/dyhelper/ui/ζ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    :cond_2
    return-object v2

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
