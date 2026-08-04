.class public final synthetic Lyyds/ᛷᲇᲇᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(ILcom/ss/android/ugc/awemes/MainActivity;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛷᲇᲇᛲ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lyyds/ᛷᲇᲇᛲ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᛷᲇᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lyyds/ᛷᲇᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛴᛸᛷ;ILjava/lang/Object;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛷᲇᲇᛲ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛷᲇᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput p2, p0, Lyyds/ᛷᲇᲇᛲ;->ᲇᲈᛵᛷ:I

    iput-object p3, p0, Lyyds/ᛷᲇᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛷᲇᲇᛲ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lyyds/ᛷᲇᲇᛲ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛷᲇᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lcom/ss/android/ugc/awemes/MainActivity;

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᛷᲇᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/lang/Throwable;

    .line 15
    .line 16
    iget v2, v1, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᲀᛲᲀ:I

    .line 17
    .line 18
    if-ne v0, v2, :cond_4

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    iput-object v0, v1, Lcom/ss/android/ugc/awemes/MainActivity;->ᛲᛶᛱᲈ:Ljava/lang/Thread;

    .line 35
    .line 36
    iget-object v2, v1, Lcom/ss/android/ugc/awemes/MainActivity;->ᛸᛸᛷᛱ:Lyyds/ᛱᛷᛲᲀ;

    .line 37
    .line 38
    const-wide v3, -0xf832e68a836eL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    invoke-static {p0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    move-object v0, p0

    .line 60
    :cond_1
    if-nez v0, :cond_3

    .line 61
    .line 62
    :cond_2
    const-wide v4, -0xf839e68a836eL

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :cond_3
    const-wide v4, -0xf849e68a836eL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance v4, Lyyds/ᛳᲀᲀᛶ;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    invoke-direct {v4, v1, v5}, Lyyds/ᛳᲀᲀᛶ;-><init>(Lcom/ss/android/ugc/awemes/MainActivity;I)V

    .line 84
    .line 85
    .line 86
    new-instance v1, Lyyds/ᲇᛶᲁᲀ;

    .line 87
    .line 88
    invoke-direct {v1, v3, v0, p0, v4}, Lyyds/ᲇᛶᲁᲀ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Lyyds/ᛱᛷᛲᲀ;->ᛱᲈᲁ(Lyyds/ᲇᛶᲁᲀ;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_0
    return-void

    .line 95
    :pswitch_0
    iget-object v0, p0, Lyyds/ᛷᲇᲇᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Lyyds/ᛴᛸᛷ;

    .line 98
    .line 99
    iget v1, p0, Lyyds/ᛷᲇᲇᛲ;->ᲇᲈᛵᛷ:I

    .line 100
    .line 101
    iget-object p0, p0, Lyyds/ᛷᲇᲇᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 102
    .line 103
    iget-object v0, v0, Lyyds/ᛴᛸᛷ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛲᛴᛳ;

    .line 104
    .line 105
    invoke-interface {v0, v1, p0}, Lyyds/ᛳᛲᛴᛳ;->ᛷᛲᲈᛱ(ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
