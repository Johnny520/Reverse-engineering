.class public final Lyyds/ᛸᲇᲇᛱ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛱᲈᲁ:Ljava/lang/Object;

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᛵᛶᲇ;

.field public final synthetic ᛶᛷᛲᲁ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lyyds/ᛵᛶᲇ;Lyyds/ᛲᛱᛶᛸ;I)V
    .locals 0

    .line 1
    iput p4, p0, Lyyds/ᛸᲇᲇᛱ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛸᲇᲇᛱ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛸᲇᲇᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛵᛶᲇ;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛸᲇᲇᛱ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛸᲇᲇᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛵᛶᲇ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛸᲇᲇᛱ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, v2, Lyyds/ᛵᛶᲇ;->ᛲᛴᛳᛲ:Landroid/widget/TextView;

    .line 16
    .line 17
    instance-of v0, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    move-object v0, p0

    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-wide v2, -0x8979e68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-object v1

    .line 62
    :pswitch_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, v2, Lyyds/ᛵᛶᲇ;->ᲇᲈᛵᛷ:Landroid/widget/TextView;

    .line 66
    .line 67
    instance-of v0, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 68
    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    move-object v0, p0

    .line 72
    check-cast v0, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_3

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-wide v2, -0xabc2e68a836eL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    return-object v1

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 2

    .line 1
    iget p1, p0, Lyyds/ᛸᲇᲇᛱ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛸᲇᲇᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛵᛶᲇ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛸᲇᲇᛱ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Lyyds/ᛸᲇᲇᛱ;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, Lyyds/ᛸᲇᲇᛱ;-><init>(Ljava/lang/Object;Lyyds/ᛵᛶᲇ;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lyyds/ᛸᲇᲇᛱ;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, Lyyds/ᛸᲇᲇᛱ;-><init>(Ljava/lang/Object;Lyyds/ᛵᛶᲇ;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᲇᲇᛱ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛴᲈᛳᲀ;

    .line 6
    .line 7
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᛸᲇᲇᛱ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᛸᲇᲇᛱ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᛸᲇᲇᛱ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᛸᲇᲇᛱ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Lyyds/ᛸᲇᲇᛱ;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lyyds/ᛸᲇᲇᛱ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
