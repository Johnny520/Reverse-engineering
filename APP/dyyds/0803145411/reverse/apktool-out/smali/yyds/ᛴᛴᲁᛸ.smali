.class public final Lyyds/ᛴᛴᲁᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᛵ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲇᛵᲈᛵ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛴᛴᲁᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛴᛴᲁᛸ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᛵ;

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
    iget v0, p0, Lyyds/ᛴᛴᲁᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lyyds/ᛴᛴᲁᛸ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᛵ;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᛴᛶᲁᛶ;

    .line 10
    .line 11
    iget-object v2, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 12
    .line 13
    iget-object v3, v2, Lyyds/ᛴᛱᛱᛸ;->ᛶᛴᛱᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 14
    .line 15
    iget-object v2, v2, Lyyds/ᛴᛱᛱᛸ;->ᛱᲀᲈᛲ:Lyyds/ᲇᛵᲈᛵ;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-boolean v1, v0, Lyyds/ᛴᛶᲁᛶ;->ᛲᲈᲁ:Z

    .line 21
    .line 22
    invoke-virtual {v0, v3, v2}, Lyyds/ᛴᛶᲁᛶ;->ᛲᲈᲁ(Lyyds/ᛴᛱᛱᛸ;Lyyds/ᲇᛵᲈᛵ;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛲᲈᲁ:Lyyds/ᛴᛶᲁᛶ;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 29
    .line 30
    iget-object v2, v0, Lyyds/ᛴᛱᛱᛸ;->ᲁᛶᛴᛸ:Lyyds/ᲁᛳᲀᛸ;

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    new-instance v2, Lyyds/ᲁᛳᲀᛸ;

    .line 35
    .line 36
    invoke-direct {v2, v1, p0}, Lyyds/ᲁᛳᲀᛸ;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object v2, v0, Lyyds/ᛴᛱᛱᛸ;->ᲁᛶᛴᛸ:Lyyds/ᲁᛳᲀᛸ;

    .line 40
    .line 41
    :cond_0
    invoke-virtual {v2, v0}, Lyyds/ᲁᛳᲀᛸ;->ᛶᲈᛴᲈ(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, Lyyds/ᲇᛵᲈᛵ;->ᲀᛲᛲᲇ:Ljava/util/ArrayList;

    .line 50
    .line 51
    if-eqz p0, :cond_3

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
    move-result v1

    .line 61
    if-nez v1, :cond_1

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
    if-eqz p0, :cond_2

    .line 71
    .line 72
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    throw p0

    .line 81
    :cond_3
    :goto_0
    return-void

    .line 82
    :pswitch_1
    iget-object v0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛵᛸᛸᛷ:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 83
    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    const/16 v1, 0x8

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    :cond_4
    iget-object p0, p0, Lyyds/ᲇᛵᲈᛵ;->ᛶᲈᛴᲈ:Lyyds/ᛴᛱᛱᛸ;

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛶᲁ(Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
