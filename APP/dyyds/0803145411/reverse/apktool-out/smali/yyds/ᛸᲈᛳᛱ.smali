.class public final synthetic Lyyds/ᛸᲈᛳᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᛸᛵᲁ;
.implements Lyyds/ᛱᲈᛲ;
.implements Lyyds/ᛷᛵᲁᲁ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛸᲈᛳᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛸᲈᛳᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᲇᲀᛱᲁ;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public ᛲᲈᲁ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᲈᛳᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᲇᛵᲁᛳ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛵᲀᲀᛱ;

    .line 6
    .line 7
    invoke-static {p0}, Lyyds/ᲀᛱᛳᲈ;->ᲇᲇᲇᛱ(Lyyds/ᲇᛵᲁᛳ;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public ᛵᛸᛸᛷ()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛸᲈᛳᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛸᲈᛳᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/lang/Class;

    .line 9
    .line 10
    :try_start_0
    sget-object v0, Lyyds/ᲀᛳᲈᲇ;->ᛲᲈᲁ:Lyyds/ᲀᛳᲈᲇ;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lyyds/ᲀᛳᲈᲇ;->ᛲᲈᲁ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    new-instance v1, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "Unable to create instance of "

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."

    .line 31
    .line 32
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v1, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :pswitch_0
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    const-string v0, "\' with no args"

    .line 46
    .line 47
    const-string v1, "Failed to invoke constructor \'"

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    :try_start_1
    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    goto :goto_0

    .line 55
    :catch_1
    move-exception p0

    .line 56
    sget-object v0, Lyyds/ᛶᛳᛶᲀ;->ᛲᲈᲁ:Lyyds/ᛸᛳᛷᛳ;

    .line 57
    .line 58
    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 59
    .line 60
    invoke-static {v0, p0}, Lyyds/ᛷᲈᲈᛶ;->ᛷᲈᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_2
    move-exception v3

    .line 65
    new-instance v4, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0}, Lyyds/ᛶᛳᛶᲀ;->ᛵᛸᛸᛷ(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {p0, v0}, Lyyds/ᛷᲈᲈᛶ;->ᛷᲈᲈᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    return-object v2

    .line 92
    :catch_3
    move-exception v2

    .line 93
    new-instance v3, Ljava/lang/RuntimeException;

    .line 94
    .line 95
    invoke-static {p0}, Lyyds/ᛶᛳᛶᲀ;->ᛵᛸᛸᛷ(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    new-instance v4, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-direct {v3, p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v3

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᲀᛲᛳᲀ(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget-object p0, p0, Lyyds/ᛸᲈᛳᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyyds/ᛶᲀᛳᛴ;

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 6
    .line 7
    iget-boolean v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛷᛵᲇᲀ:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-virtual {p0}, Lyyds/ᛶᲀᛳᛴ;->ᛲᲈᲁ()Landroid/graphics/Rect;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v5, 0x1

    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    if-eq p1, v5, :cond_4

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    if-eq p1, v1, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    if-eq p1, v0, :cond_4

    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_1
    iget-boolean p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛳᛶᲁ:Landroid/view/View;

    .line 47
    .line 48
    iget v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛱᛳᲇ:F

    .line 49
    .line 50
    iget v2, p0, Lyyds/ᛶᲀᛳᛴ;->ᛳᲁᲁᲇ:F

    .line 51
    .line 52
    invoke-virtual {p0, p1, v1, v2}, Lyyds/ᛶᲀᛳᛴ;->ᲇᲈᛵᛷ(Landroid/view/View;FF)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    iget p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛳᲁᲁᲇ:F

    .line 59
    .line 60
    sub-float p1, v3, p1

    .line 61
    .line 62
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iget v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛵᛸᛸᛷ:I

    .line 67
    .line 68
    int-to-float v1, v1

    .line 69
    cmpl-float p1, p1, v1

    .line 70
    .line 71
    if-lez p1, :cond_3

    .line 72
    .line 73
    iget p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛱᛳᲇ:F

    .line 74
    .line 75
    iget v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛳᲁᲁᲇ:F

    .line 76
    .line 77
    invoke-virtual {p0, v0, p1, v1}, Lyyds/ᛶᲀᛳᛴ;->ᲇᲈᛵᛷ(Landroid/view/View;FF)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    iget p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲇᛱᛲ:F

    .line 84
    .line 85
    iput p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛶᛳᛶᛵ:F

    .line 86
    .line 87
    iget p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛲᲈᲈ:I

    .line 88
    .line 89
    iput p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛵᛶᛲᲀ:I

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    iput v3, p0, Lyyds/ᛶᲀᛳᛴ;->ᛶᛳᛶᛵ:F

    .line 93
    .line 94
    iget p1, v4, Landroid/graphics/Rect;->top:I

    .line 95
    .line 96
    int-to-float p1, p1

    .line 97
    sub-float p1, v3, p1

    .line 98
    .line 99
    iget v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᛱᲈᲁ:I

    .line 100
    .line 101
    int-to-float v0, v0

    .line 102
    const/high16 v1, 0x40000000    # 2.0f

    .line 103
    .line 104
    div-float/2addr v0, v1

    .line 105
    sub-float/2addr p1, v0

    .line 106
    float-to-int p1, p1

    .line 107
    iput p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛵᛶᛲᲀ:I

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lyyds/ᛶᲀᛳᛴ;->ᛶᛷᛲᲁ(I)V

    .line 110
    .line 111
    .line 112
    :goto_0
    invoke-virtual {p0, v5}, Lyyds/ᛶᲀᛳᛴ;->ᛱᲈᲁ(Z)V

    .line 113
    .line 114
    .line 115
    :cond_3
    iget-boolean p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 116
    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    iget p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛵᛶᛲᲀ:I

    .line 120
    .line 121
    iget v0, p0, Lyyds/ᛶᲀᛳᛴ;->ᛶᛳᛶᛵ:F

    .line 122
    .line 123
    sub-float v0, v3, v0

    .line 124
    .line 125
    float-to-int v0, v0

    .line 126
    add-int/2addr p1, v0

    .line 127
    invoke-virtual {p0, p1}, Lyyds/ᛶᲀᛳᛴ;->ᛶᛷᛲᲁ(I)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_4
    invoke-virtual {p0, v2}, Lyyds/ᛶᲀᛳᛴ;->ᛱᲈᲁ(Z)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    iput v1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛱᛳᲇ:F

    .line 136
    .line 137
    iput v3, p0, Lyyds/ᛶᲀᛳᛴ;->ᛳᲁᲁᲇ:F

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    const/4 v2, 0x0

    .line 144
    cmpl-float p1, p1, v2

    .line 145
    .line 146
    if-lez p1, :cond_6

    .line 147
    .line 148
    invoke-virtual {p0, v0, v1, v3}, Lyyds/ᛶᲀᛳᛴ;->ᲇᲈᛵᛷ(Landroid/view/View;FF)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    iput v3, p0, Lyyds/ᛶᲀᛳᛴ;->ᛶᛳᛶᛵ:F

    .line 155
    .line 156
    iget p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛲᛲᲈᲈ:I

    .line 157
    .line 158
    iput p1, p0, Lyyds/ᛶᲀᛳᛴ;->ᛵᛶᛲᲀ:I

    .line 159
    .line 160
    invoke-virtual {p0, v5}, Lyyds/ᛶᲀᛳᛴ;->ᛱᲈᲁ(Z)V

    .line 161
    .line 162
    .line 163
    :cond_6
    :goto_1
    iput v3, p0, Lyyds/ᛶᲀᛳᛴ;->ᲇᛱᛲ:F

    .line 164
    .line 165
    iget-boolean p0, p0, Lyyds/ᛶᲀᛳᛴ;->ᲀᛲᛲᲇ:Z

    .line 166
    .line 167
    return p0
.end method
