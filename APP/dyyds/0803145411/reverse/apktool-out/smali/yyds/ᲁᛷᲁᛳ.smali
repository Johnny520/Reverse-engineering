.class public final Lyyds/ᲁᛷᲁᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛵᛸᛳ;

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᛷᲀᲇᲈ;

.field public final synthetic ᲀᛲᛳᲀ:Ljava/util/Iterator;

.field public final synthetic ᲇᲇᲇᛱ:Lyyds/ᛴᛲᛷᛸ;

.field public final synthetic ᲇᲈᛵᛷ:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lyyds/ᛷᲀᲇᲈ;Ljava/util/Iterator;Landroid/app/Activity;Lyyds/ᛵᛸᛳ;Lyyds/ᛴᛲᛷᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᛷᲁᛳ;->ᛶᛷᛲᲁ:Lyyds/ᛷᲀᲇᲈ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲁᛷᲁᛳ;->ᲀᛲᛳᲀ:Ljava/util/Iterator;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲁᛷᲁᛳ;->ᲇᲈᛵᛷ:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᲁᛷᲁᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛸᛳ;

    .line 11
    .line 12
    iput-object p5, p0, Lyyds/ᲁᛷᲁᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛲᛷᛸ;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    move-object v1, v0

    .line 3
    :cond_0
    :goto_1
    iget-object v2, p0, Lyyds/ᲁᛷᲁᛳ;->ᲀᛲᛳᲀ:Ljava/util/Iterator;

    .line 4
    .line 5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    iget-object v4, p0, Lyyds/ᲁᛷᲁᛳ;->ᲇᲈᛵᛷ:Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v3, :cond_2

    .line 12
    .line 13
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/util/List;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {v4, v1}, Lyyds/ᲀᛱᛳᲈ;->ᛶᛳᛶᛵ(Landroid/content/Context;Ljava/util/List;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    if-eqz v1, :cond_5

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    const/4 v0, 0x0

    .line 45
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lyyds/ᛲᛴᛷᲁ;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lyyds/ᛲᛴᛷᲁ;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    iget-object v0, p0, Lyyds/ᲁᛷᲁᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛵᛸᛳ;

    .line 75
    .line 76
    iget-object v2, p0, Lyyds/ᲁᛷᲁᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛲᛷᛸ;

    .line 77
    .line 78
    invoke-static {v4, v1, v0, v2, p0}, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ(Landroid/app/Activity;Ljava/util/List;Lyyds/ᛵᛸᛳ;Lyyds/ᛴᛲᛷᛸ;Lyyds/ᲁᛷᲁᛳ;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    :goto_3
    new-instance v0, Lyyds/ᛲᛳᛵᛱ;

    .line 83
    .line 84
    const/16 v1, 0xe

    .line 85
    .line 86
    iget-object p0, p0, Lyyds/ᲁᛷᲁᛳ;->ᛶᛷᛲᲁ:Lyyds/ᛷᲀᲇᲈ;

    .line 87
    .line 88
    invoke-direct {v0, v1, p0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const-wide/16 v1, 0x64

    .line 92
    .line 93
    sget-object p0, Lyyds/ᛵᛷᛶᲁ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 94
    .line 95
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 96
    .line 97
    .line 98
    return-void
.end method
