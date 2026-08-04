.class public final synthetic Lyyds/ᲇᛷᲁᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲇᛷᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛷᲁᲁ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲇᛷᲁᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget p1, p0, Lyyds/ᲇᛷᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Lyyds/ᲇᛷᲁᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᲇᛷᲁᲁ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Lyyds/ᛳᲁᲈᲇ;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    invoke-direct {p1, v3, v2, v1, v4}, Lyyds/ᛳᲁᲈᲇ;-><init>(Landroid/content/Context;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v1, p1, v0}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    sget-object v5, Lyyds/ᛲᲁᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛲᲁᲈ;

    .line 27
    .line 28
    const/4 v9, 0x0

    .line 29
    const/16 v10, 0x3a

    .line 30
    .line 31
    iget-object v6, p0, Lyyds/ᲇᛷᲁᲁ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    iget-object v8, p0, Lyyds/ᲇᛷᲁᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static/range {v5 .. v10}, Lyyds/ᛲᲁᲈ;->ᛳᛸᛴᛶ(Lyyds/ᛲᲁᲈ;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    const-wide p0, -0x3b35de68a836eL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    :try_start_0
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v3, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-wide v0, -0x3b367e68a836eL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    check-cast p0, Landroid/content/ClipboardManager;

    .line 62
    .line 63
    const-wide v0, -0x3b3ade68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p1, v2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 77
    .line 78
    .line 79
    const-wide p0, -0x3b3b2e68a836eL

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lyyds/ᛶᛵᛲᛲ;->ᛲᲈᲁ:Lyyds/ᛶᛵᛲᛲ;

    .line 92
    .line 93
    invoke-static {v3}, Lyyds/ᛶᛵᛲᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catch_0
    move-exception v0

    .line 98
    move-object p0, v0

    .line 99
    new-instance p1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-wide v0, -0x3b3bae68a836eL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Lyyds/ᲀᛳᛳᛱ;->ᲀᛲᛲᲇ(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    :goto_0
    return-void

    .line 128
    :pswitch_2
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance p1, Lyyds/ᲇᛷᛱᲈ;

    .line 133
    .line 134
    const/4 v4, 0x2

    .line 135
    invoke-direct {p1, v3, v2, v1, v4}, Lyyds/ᲇᛷᛱᲈ;-><init>(Landroid/content/Context;Ljava/lang/String;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 136
    .line 137
    .line 138
    invoke-static {p0, v1, p1, v0}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
