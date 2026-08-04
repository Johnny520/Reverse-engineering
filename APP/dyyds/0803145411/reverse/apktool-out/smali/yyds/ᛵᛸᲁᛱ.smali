.class public final synthetic Lyyds/ᛵᛸᲁᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/widget/TextView;

.field public final synthetic ᛶᛷᛲᲁ:Landroid/widget/TextView;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Landroid/widget/TextView;

.field public final synthetic ᲇᲈᛵᛷ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    iput p5, p0, Lyyds/ᛵᛸᲁᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᛸᲁᛱ;->ᲇᲈᛵᛷ:Landroid/widget/TextView;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛵᛸᲁᛱ;->ᛲᛴᛳᛲ:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛵᛸᲁᛱ;->ᲇᲇᲇᛱ:Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p4, p0, Lyyds/ᛵᛸᲁᛱ;->ᛶᛷᛲᲁ:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lyyds/ᛵᛸᲁᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛵᛸᲁᛱ;->ᛶᛷᛲᲁ:Landroid/widget/TextView;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛵᛸᲁᛱ;->ᲇᲇᲇᛱ:Landroid/widget/TextView;

    .line 6
    .line 7
    iget-object v2, p0, Lyyds/ᛵᛸᲁᛱ;->ᛲᛴᛳᛲ:Landroid/widget/TextView;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛵᛸᲁᛱ;->ᲇᲈᛵᛷ:Landroid/widget/TextView;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 15
    .line 16
    const-wide v3, -0x8d20e68a836eL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-wide v4, -0x1919e68a836eL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛷᛸᛱᲈ:Lyyds/ᛳᲀᛲ;

    .line 37
    .line 38
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 39
    .line 40
    const/16 v5, 0xad

    .line 41
    .line 42
    aget-object v4, v4, v5

    .line 43
    .line 44
    invoke-virtual {p1, v4, v3}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v2, v1, v0}, Lyyds/ᛸᛲᛲᲇ;->ᛶᛷᛲᲁ(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lyyds/ᛲᲁᛲᛲ;->ᛲᛴᛳᛲ()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_0
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛷᛳᛲᛳ;

    .line 55
    .line 56
    const-wide v3, -0x8d1fe68a836eL

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-wide v4, -0x1921e68a836eL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    sget-object p1, Lyyds/ᛷᛳᛲᛳ;->ᲁᛶᲁᛱ:Lyyds/ᛳᲀᛲ;

    .line 77
    .line 78
    sget-object v4, Lyyds/ᛷᛳᛲᛳ;->ᛵᛸᛸᛷ:[Lyyds/ᲀᛴᛶᲇ;

    .line 79
    .line 80
    const/16 v5, 0xae

    .line 81
    .line 82
    aget-object v4, v4, v5

    .line 83
    .line 84
    invoke-virtual {p1, v4, v3}, Lyyds/ᛳᲀᛲ;->ᲀᛲᛳᲀ(Lyyds/ᲀᛴᛶᲇ;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v2, v1, v0}, Lyyds/ᛸᛲᛲᲇ;->ᛶᛷᛲᲁ(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 88
    .line 89
    .line 90
    invoke-static {}, Lyyds/ᛲᲁᛲᛲ;->ᛲᛴᛳᛲ()V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
