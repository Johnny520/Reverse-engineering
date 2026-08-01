.class public final Lxhss/ᛳᲁᲁᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛲᛵᛶᲁ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛲᛵᛶᲁ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛳᲁᲁᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛳᲁᲁᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛵᛶᲁ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lxhss/ᛳᲁᲁᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lxhss/ᛳᲁᲁᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛵᛶᲁ;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Lxhss/ᛷᛶᲀᛲ;

    .line 10
    .line 11
    iget-object v2, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 12
    .line 13
    iget-object v3, v2, Lxhss/ᛵᲇᲀᛳ;->ᛴᲀᛸᛵ:Lxhss/ᛵᲇᲀᛳ;

    .line 14
    .line 15
    iget-object v2, v2, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, v0, Lxhss/ᛷᛶᲀᛲ;->ᛷᛵᛵᲈ:Z

    .line 21
    .line 22
    invoke-virtual {v0, v3, v2}, Lxhss/ᛷᛶᲀᛲ;->ᛷᛵᛵᲈ(Lxhss/ᛵᲇᲀᛳ;Lxhss/ᛲᛵᛶᲁ;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛶᲀᛲ;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 29
    .line 30
    iget-object v2, v0, Lxhss/ᛵᲇᲀᛳ;->ᛵᛲᲁᛶ:Lxhss/ᛶᲈᛴᛲ;

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    new-instance v2, Lxhss/ᛶᲈᛴᛲ;

    .line 35
    .line 36
    invoke-direct {v2, v1, p0}, Lxhss/ᛶᲈᛴᛲ;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object v2, v0, Lxhss/ᛵᲇᲀᛳ;->ᛵᛲᲁᛶ:Lxhss/ᛶᲈᛴᛲ;

    .line 40
    .line 41
    :cond_0
    invoke-virtual {v2, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛴᲈᛱᛴ:Ljava/util/ArrayList;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance p0, Ljava/lang/ClassCastException;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :cond_2
    :goto_0
    return-void

    .line 80
    :pswitch_1
    iget-object v0, p0, Lxhss/ᛲᛵᛶᲁ;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    const/16 v1, 0x8

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    :cond_3
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ(Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
