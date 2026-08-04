.class public final synthetic Lyyds/ᲇᛷᛳᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛵᛶᲇ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lyyds/ᛵᛶᲇ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲇᛷᛳᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᛷᛳᲇ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲇᛷᛳᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛶᲇ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 1
    iget p1, p0, Lyyds/ᲇᛷᛳᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 p2, 0x3

    .line 4
    const/4 v0, 0x0

    .line 5
    iget-object v1, p0, Lyyds/ᲇᛷᛳᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛶᲇ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᲇᛷᛳᲇ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroid/app/AlertDialog$Builder;

    .line 13
    .line 14
    invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    const-wide v2, -0x9be2e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-wide v2, -0x9be7e68a836eL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-wide v2, -0x9c0ce68a836eL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    new-instance v2, Lyyds/ᲇᛷᛳᲇ;

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-direct {v2, p0, v1, v3}, Lyyds/ᲇᛷᛳᲇ;-><init>(Landroid/content/Context;Lyyds/ᛵᛶᲇ;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-wide p1, -0x9c11e68a836eL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_0
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v2, Lyyds/ᛲᛶᲁᛷ;

    .line 84
    .line 85
    const/4 v3, 0x4

    .line 86
    invoke-direct {v2, p0, v1, v0, v3}, Lyyds/ᛲᛶᲁᛷ;-><init>(Landroid/content/Context;Lyyds/ᛵᛶᲇ;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v0, v2, p2}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_1
    invoke-static {}, Lyyds/ᲈᲇᲈᛲ;->ᛵᛸᛸᛷ()Lyyds/ᛴᲈᛳᲀ;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v2, Lyyds/ᛲᛶᲁᛷ;

    .line 98
    .line 99
    const/4 v3, 0x5

    .line 100
    invoke-direct {v2, p0, v1, v0, v3}, Lyyds/ᛲᛶᲁᛷ;-><init>(Landroid/content/Context;Lyyds/ᛵᛶᲇ;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v0, v2, p2}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 104
    .line 105
    .line 106
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
