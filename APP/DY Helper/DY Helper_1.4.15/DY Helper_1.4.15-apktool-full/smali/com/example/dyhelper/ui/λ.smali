.class public final Lcom/example/dyhelper/ui/λ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;


# direct methods
.method public constructor <init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/λ;->ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/ui/λ;->ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 2
    .line 3
    iget-boolean v0, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object p1, v0

    .line 18
    :goto_0
    if-nez p1, :cond_2

    .line 19
    .line 20
    const-string p1, ""

    .line 21
    .line 22
    :cond_2
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-boolean v1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε:Z

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    sget-object v2, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Ι:Lym1;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    sget-object v2, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Θ:Lym1;

    .line 38
    .line 39
    :goto_1
    invoke-virtual {v2, p1}, Lym1;->γ(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    if-nez v2, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ(Z)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_4
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    goto :goto_2

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    new-instance v2, Leo1;

    .line 61
    .line 62
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object p1, v2

    .line 66
    :goto_2
    instance-of v2, p1, Leo1;

    .line 67
    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    move-object v0, p1

    .line 72
    :goto_3
    check-cast v0, Ljava/lang/Integer;

    .line 73
    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    invoke-virtual {p0, v3}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ(Z)V

    .line 77
    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_6
    if-eqz v1, :cond_7

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    goto :goto_4

    .line 91
    :cond_7
    const/16 p1, 0xff

    .line 92
    .line 93
    :goto_4
    iput p1, p0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 94
    .line 95
    const/4 p1, 0x1

    .line 96
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->μ(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {p0, p1, v1, v0, v3}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->α(IIIZ)V

    .line 124
    .line 125
    .line 126
    :goto_5
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method
