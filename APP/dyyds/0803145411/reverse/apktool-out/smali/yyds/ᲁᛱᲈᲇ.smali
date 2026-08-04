.class public final Lyyds/ᲁᛱᲈᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲁᛱᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᛱᲈᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᲁᛱᲈᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final ᛲᲈᲁ(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ᛵᛸᛸᛷ(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    .line 1
    iget p1, p0, Lyyds/ᲁᛱᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲁᛱᲈᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲁᛱᲈᲇ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-wide v1, -0x93a2e68a836eL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    check-cast p0, Landroid/widget/TextView;

    .line 19
    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 p3, 0x25

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    check-cast v0, Lyyds/ᛷᛴᲈᲀ;

    .line 41
    .line 42
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {v0, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lyyds/ᛵᲇᛲᲁ;->ᛵᛸᛸᛷ()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_0
    const-wide v1, -0xae89e68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᲁᲀᛱᛴ:Lyyds/ᛳᲀᛲ;

    .line 67
    .line 68
    sget-object p3, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 69
    .line 70
    const/16 v1, 0x46

    .line 71
    .line 72
    aget-object p3, p3, v1

    .line 73
    .line 74
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p1, p3, v1}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    check-cast p0, Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    check-cast v0, Landroid/view/View;

    .line 91
    .line 92
    invoke-static {v0}, Lyyds/ᛳᛷᲀᛴ;->ᛷᛶᛷᲀ(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lyyds/ᛶᲁᛸᲇ;->ᛲᲈᲁ:Lyyds/ᛶᲁᛸᲇ;

    .line 96
    .line 97
    invoke-static {p0}, Lyyds/ᛶᲁᛸᲇ;->ᛵᛸᛸᛷ(Lyyds/ᛶᲁᛸᲇ;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_1
    if-eqz p3, :cond_0

    .line 102
    .line 103
    check-cast p0, Lyyds/ᛱᛷᛸᲈ;

    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    iput-object p1, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Lyyds/ᛷᛴᲈᲀ;

    .line 109
    .line 110
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-interface {v0, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_0
    return-void

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᛱᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide p0, -0x93aae68a836eL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const-wide p0, -0xae8ce68a836eL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_1
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᲁᛱᲈᲇ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide p0, -0x93b2e68a836eL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    const-wide p0, -0xae8fe68a836eL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_1
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
