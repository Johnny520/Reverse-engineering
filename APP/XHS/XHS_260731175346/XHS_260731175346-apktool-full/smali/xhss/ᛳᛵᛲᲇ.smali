.class public final Lxhss/ᛳᛵᛲᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public final synthetic ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lxhss/ᛳᛵᛲᲇ;->ᛱᛱᛲᲇ:I

    iput-object p2, p0, Lxhss/ᛳᛵᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    iput-object p3, p0, Lxhss/ᛳᛵᛲᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lxhss/ᲇᛵᛳᛸ;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lxhss/ᛳᛵᛲᲇ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᛳᛵᛲᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lxhss/ᛳᛵᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᛳᛵᛲᲇ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛳᛵᛲᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lxhss/ᛳᛵᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Landroid/app/Activity;

    .line 11
    .line 12
    check-cast v1, Landroid/view/View;

    .line 13
    .line 14
    invoke-static {p0, v1}, Lxhss/ᛱᛷᛵᛷ;->ᛳᲈᲈᛲ(Landroid/app/Activity;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Lxhss/ᛳᛵᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lxhss/ᲀᛶᛲᛵ;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lxhss/ᲀᛶᛲᛵ;->accept(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    move-object v0, v1

    .line 27
    check-cast v0, Lxhss/ᲇᛵᛳᛸ;

    .line 28
    .line 29
    iget-object v2, v0, Lxhss/ᲇᛵᛳᛸ;->ᲇᛴᲇᛵ:Lxhss/ᛲᛶᲇᲇ;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :cond_0
    :try_start_0
    iget-object v3, p0, Lxhss/ᛳᛵᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ljava/lang/Runnable;

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v3

    .line 41
    sget-object v4, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 42
    .line 43
    invoke-static {v4, v3}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛷᲈᲈ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v0}, Lxhss/ᲇᛵᛳᛸ;->ᛳᲈᲈᛲ()Ljava/lang/Runnable;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iput-object v3, p0, Lxhss/ᛳᛵᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 54
    .line 55
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    const/16 v3, 0x10

    .line 58
    .line 59
    if-lt v1, v3, :cond_0

    .line 60
    .line 61
    invoke-virtual {v2, v0}, Lxhss/ᛲᛶᲇᲇ;->ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    invoke-virtual {v2, v0, p0}, Lxhss/ᛲᛶᲇᲇ;->ᛷᲁᲁ(Lxhss/ᛴᛵᛳᛵ;Ljava/lang/Runnable;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    return-void

    .line 71
    :pswitch_2
    iget-object p0, p0, Lxhss/ᛳᛵᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Lxhss/ᛲᛶᛳᲁ;

    .line 74
    .line 75
    check-cast v1, Lxhss/ᛵᛷᲈᛲ;

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Lxhss/ᛲᛶᛳᲁ;->ᛳᛶᛷᲀ(Lxhss/ᛲᛶᲇᲇ;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_3
    iget-object p0, p0, Lxhss/ᛳᛵᛲᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Lxhss/ᲇᛵᛲᲁ;

    .line 84
    .line 85
    check-cast v1, Landroid/graphics/Typeface;

    .line 86
    .line 87
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Lxhss/ᛷᲀᲇᲀ;

    .line 90
    .line 91
    invoke-virtual {p0, v1}, Lxhss/ᛷᲀᲇᲀ;->ᛱᛱᛲᲇ(Landroid/graphics/Typeface;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
