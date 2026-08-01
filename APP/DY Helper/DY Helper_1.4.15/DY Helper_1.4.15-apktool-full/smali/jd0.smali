.class public final synthetic Ljd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lnd0;

.field public final synthetic η:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lnd0;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Ljd0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljd0;->η:Ljava/util/ArrayList;

    iput-object p2, p0, Ljd0;->ζ:Lnd0;

    return-void
.end method

.method public synthetic constructor <init>(Lnd0;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ljd0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljd0;->ζ:Lnd0;

    .line 8
    .line 9
    iput-object p2, p0, Ljd0;->η:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Ljd0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ljd0;->ζ:Lnd0;

    .line 7
    .line 8
    iget-object v1, v0, Lnd0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, Lnd0;->Β:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    iget-object p0, p0, Ljd0;->η:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {p0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/util/Collection;

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lnd0;->ε()V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :pswitch_0
    iget-object v0, p0, Ljd0;->η:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    :try_start_0
    sget-object v3, Lst;->α:Lst;

    .line 56
    .line 57
    const-string v4, ""

    .line 58
    .line 59
    invoke-virtual {v3, v1, v2, v4}, Lst;->Ε(JLjava/lang/String;)Lpt;

    .line 60
    .line 61
    .line 62
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception v1

    .line 65
    new-instance v2, Leo1;

    .line 66
    .line 67
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object v1, v2

    .line 71
    :goto_1
    instance-of v2, v1, Leo1;

    .line 72
    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    :cond_2
    check-cast v1, Lpt;

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    new-instance v2, Lcd0;

    .line 81
    .line 82
    const/4 v3, 0x2

    .line 83
    iget-object v4, p0, Ljd0;->ζ:Lnd0;

    .line 84
    .line 85
    invoke-direct {v2, v4, v1, v3}, Lcd0;-><init>(Lnd0;Lpt;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v2}, Lnd0;->δ(Lp70;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    return-void

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
