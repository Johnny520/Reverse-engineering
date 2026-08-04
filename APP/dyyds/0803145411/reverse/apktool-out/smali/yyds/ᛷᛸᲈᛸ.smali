.class public final Lyyds/ᛷᛸᲈᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛷᛷ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛷᛸᲈᛸ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛷᛸᲈᛸ;->ᛵᛸᛸᛷ:Landroid/content/Context;

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lyyds/ᛷᛸᲈᛸ;->ᛵᛸᛸᛷ:Landroid/content/Context;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lyyds/ᛷᛸᲈᛸ;->ᛵᛸᛸᛷ:Landroid/content/Context;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛵᲁᛴᛱ;
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛷᛸᲈᛸ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x180

    .line 6
    .line 7
    const/16 v4, 0x200

    .line 8
    .line 9
    const/high16 v5, -0x80000000

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛷᛸᲈᛸ;->ᛵᛸᛸᛷ:Landroid/content/Context;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Landroid/net/Uri;

    .line 17
    .line 18
    if-eq p2, v5, :cond_0

    .line 19
    .line 20
    if-eq p3, v5, :cond_0

    .line 21
    .line 22
    if-gt p2, v4, :cond_0

    .line 23
    .line 24
    if-gt p3, v3, :cond_0

    .line 25
    .line 26
    sget-object p2, Lyyds/ᛷᲈᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲇᲇᛲ;

    .line 27
    .line 28
    invoke-virtual {p4, p2}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, Ljava/lang/Long;

    .line 33
    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    const-wide/16 v0, -0x1

    .line 41
    .line 42
    cmp-long p2, p2, v0

    .line 43
    .line 44
    if-nez p2, :cond_0

    .line 45
    .line 46
    new-instance v2, Lyyds/ᛵᲁᛴᛱ;

    .line 47
    .line 48
    new-instance p2, Lyyds/ᛸᛷᛴᲁ;

    .line 49
    .line 50
    invoke-direct {p2, p1}, Lyyds/ᛸᛷᛴᲁ;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    new-instance p3, Lyyds/ᛸᲁᲈᲇ;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    const/4 v0, 0x1

    .line 60
    invoke-direct {p3, p4, v0}, Lyyds/ᛸᲁᲈᲇ;-><init>(Landroid/content/ContentResolver;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, p1, p3}, Lyyds/ᛷᛴᲇᛵ;->ᲀᛲᛳᲀ(Landroid/content/Context;Landroid/net/Uri;Lyyds/ᛸᲁᲈᲇ;)Lyyds/ᛷᛴᲇᛵ;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {v2, p2, p0}, Lyyds/ᛵᲁᛴᛱ;-><init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᲇᛶᲀ;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-object v2

    .line 71
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 72
    .line 73
    if-eq p2, v5, :cond_1

    .line 74
    .line 75
    if-eq p3, v5, :cond_1

    .line 76
    .line 77
    if-gt p2, v4, :cond_1

    .line 78
    .line 79
    if-gt p3, v3, :cond_1

    .line 80
    .line 81
    new-instance v2, Lyyds/ᛵᲁᛴᛱ;

    .line 82
    .line 83
    new-instance p2, Lyyds/ᛸᛷᛴᲁ;

    .line 84
    .line 85
    invoke-direct {p2, p1}, Lyyds/ᛸᛷᛴᲁ;-><init>(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance p3, Lyyds/ᛸᲁᲈᲇ;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-direct {p3, p4, v1}, Lyyds/ᛸᲁᲈᲇ;-><init>(Landroid/content/ContentResolver;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {p0, p1, p3}, Lyyds/ᛷᛴᲇᛵ;->ᲀᛲᛳᲀ(Landroid/content/Context;Landroid/net/Uri;Lyyds/ᛸᲁᲈᲇ;)Lyyds/ᛷᛴᲇᛵ;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-direct {v2, p2, p0}, Lyyds/ᛵᲁᛴᛱ;-><init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᲇᛶᲀ;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-object v2

    .line 105
    :pswitch_1
    check-cast p1, Landroid/net/Uri;

    .line 106
    .line 107
    new-instance p2, Lyyds/ᛵᲁᛴᛱ;

    .line 108
    .line 109
    new-instance p3, Lyyds/ᛸᛷᛴᲁ;

    .line 110
    .line 111
    invoke-direct {p3, p1}, Lyyds/ᛸᛷᛴᲁ;-><init>(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    new-instance p4, Lyyds/ᛴᛷᛳᲇ;

    .line 115
    .line 116
    invoke-direct {p4, p0, v1, p1}, Lyyds/ᛴᛷᛳᲇ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-direct {p2, p3, p4}, Lyyds/ᛵᲁᛴᛱ;-><init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᲇᛶᲀ;)V

    .line 120
    .line 121
    .line 122
    return-object p2

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛷᛸᲈᛸ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/net/Uri;

    .line 7
    .line 8
    invoke-static {p1}, Lyyds/ᛳᛵᲀ;->ᛲᛴᛳᛲ(Landroid/net/Uri;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string p1, "video"

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    :goto_0
    return p0

    .line 30
    :pswitch_0
    check-cast p1, Landroid/net/Uri;

    .line 31
    .line 32
    invoke-static {p1}, Lyyds/ᛳᛵᲀ;->ᛲᛴᛳᛲ(Landroid/net/Uri;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string p1, "video"

    .line 43
    .line 44
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 p0, 0x0

    .line 53
    :goto_1
    return p0

    .line 54
    :pswitch_1
    check-cast p1, Landroid/net/Uri;

    .line 55
    .line 56
    invoke-static {p1}, Lyyds/ᛳᛵᲀ;->ᛲᛴᛳᛲ(Landroid/net/Uri;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    return p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
