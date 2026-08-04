.class public final Lyyds/ᲀᛸᲇᛴ;
.super Lyyds/ᛵᲀᲀᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# virtual methods
.method public final ᛲᲀᛲᛲ()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᲁᛵᲁᲁ:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    if-ne v0, p0, :cond_0

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iget-boolean p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z

    .line 12
    .line 13
    return p0
.end method

.method public final ᛶᛷᛲᲁ()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lyyds/ᲀᛸᲇᛴ;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "("

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ")"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final ᲀᛴᲁᲈ()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛶᲁ(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 18
    .line 19
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᛷᛲᲈᛱ:Landroid/view/View;

    .line 20
    .line 21
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const v1, 0x660c008b

    .line 37
    .line 38
    .line 39
    const v2, 0x660c008a

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    move v0, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    move v0, v1

    .line 67
    :goto_0
    if-nez v0, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    move v1, v2

    .line 76
    goto :goto_1

    .line 77
    :cond_4
    move v1, v0

    .line 78
    :cond_5
    :goto_1
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᲀᛲᛳᲀ:Landroid/widget/EditText;

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_2

    .line 95
    :cond_6
    iget-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᛸᲁᲇ:Ljava/lang/String;

    .line 96
    .line 97
    :goto_2
    const-wide/16 v2, 0x0

    .line 98
    .line 99
    iput-wide v2, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ:J

    .line 100
    .line 101
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ(I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    new-instance v2, Lyyds/ᲁᛷᲇᛸ;

    .line 106
    .line 107
    invoke-direct {v2, p0, v1}, Lyyds/ᲁᛷᲇᛸ;-><init>(Lyyds/ᛵᲀᲀᛱ;Landroid/view/View;)V

    .line 108
    .line 109
    .line 110
    iput-object v2, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 111
    .line 112
    if-eqz v1, :cond_7

    .line 113
    .line 114
    iget-object v2, p0, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 115
    .line 116
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_7
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛸᲁᲇ(Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᛸᲁᲇ:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ()V

    .line 125
    .line 126
    .line 127
    return-void
.end method
