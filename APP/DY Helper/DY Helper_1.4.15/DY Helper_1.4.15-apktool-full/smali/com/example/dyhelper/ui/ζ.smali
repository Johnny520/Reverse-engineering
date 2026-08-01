.class public final synthetic Lcom/example/dyhelper/ui/ζ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/example/dyhelper/ui/ζ;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/example/dyhelper/ui/ζ;->ζ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

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
    .locals 3

    .line 1
    iget v0, p0, Lcom/example/dyhelper/ui/ζ;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p0, p0, Lcom/example/dyhelper/ui/ζ;->ζ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 13
    .line 14
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ν()V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget-object p0, p0, Lcom/example/dyhelper/ui/ζ;->ζ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->θ:[F

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    aput p1, v0, v1

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ν()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget-object p0, p0, Lcom/example/dyhelper/ui/ζ;->ζ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 46
    .line 47
    iget-boolean v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 52
    .line 53
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 58
    .line 59
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    const/4 v2, 0x1

    .line 64
    invoke-virtual {p0, v0, v1, p1, v2}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->α(IIIZ)V

    .line 65
    .line 66
    .line 67
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    iget-object p0, p0, Lcom/example/dyhelper/ui/ζ;->ζ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 77
    .line 78
    iget-boolean v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 79
    .line 80
    if-nez v0, :cond_1

    .line 81
    .line 82
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 83
    .line 84
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 89
    .line 90
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/4 v2, 0x1

    .line 95
    invoke-virtual {p0, v0, p1, v1, v2}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->α(IIIZ)V

    .line 96
    .line 97
    .line 98
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    iget-object p0, p0, Lcom/example/dyhelper/ui/ζ;->ζ:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 108
    .line 109
    iget-boolean v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 110
    .line 111
    if-nez v0, :cond_2

    .line 112
    .line 113
    iget v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 114
    .line 115
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->η:I

    .line 120
    .line 121
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    const/4 v2, 0x1

    .line 126
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->α(IIIZ)V

    .line 127
    .line 128
    .line 129
    :cond_2
    sget-object p0, Ls62;->α:Ls62;

    .line 130
    .line 131
    return-object p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
