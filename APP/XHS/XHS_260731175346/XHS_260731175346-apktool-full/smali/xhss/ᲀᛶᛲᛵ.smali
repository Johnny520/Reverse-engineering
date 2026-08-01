.class public final Lxhss/ᲀᛶᛲᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲀᛸᛳᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲀᛶᛲᛵ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᲀᛶᛲᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲀᛶᛲᛵ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lxhss/ᛳᛵᛴᲈ;

    .line 7
    .line 8
    sget-object v0, Lxhss/ᛳᛷᲈᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lxhss/ᛳᛷᲈᛵ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛶᲀᛶ;

    .line 12
    .line 13
    iget-object v2, p0, Lxhss/ᲀᛶᛲᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lxhss/ᛴᛶᲀᛶ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget-object p0, p0, Lxhss/ᲀᛶᛲᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Lxhss/ᛴᛶᲀᛶ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    const/4 p0, 0x0

    .line 38
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ge p0, v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lxhss/ᲀᛸᛳᛲ;

    .line 49
    .line 50
    invoke-interface {v0, p1}, Lxhss/ᲀᛸᛳᛲ;->accept(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 p0, p0, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    :goto_1
    return-void

    .line 57
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0

    .line 59
    :pswitch_0
    check-cast p1, Lxhss/ᛳᛵᛴᲈ;

    .line 60
    .line 61
    if-nez p1, :cond_2

    .line 62
    .line 63
    new-instance p1, Lxhss/ᛳᛵᛴᲈ;

    .line 64
    .line 65
    const/4 v0, -0x3

    .line 66
    invoke-direct {p1, v0}, Lxhss/ᛳᛵᛴᲈ;-><init>(I)V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-object p0, p0, Lxhss/ᲀᛶᛲᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, Lxhss/ᛳᛱᛲᲀ;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lxhss/ᛳᛱᛲᲀ;->ᲇᛸᛳᲁ(Lxhss/ᛳᛵᛴᲈ;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
