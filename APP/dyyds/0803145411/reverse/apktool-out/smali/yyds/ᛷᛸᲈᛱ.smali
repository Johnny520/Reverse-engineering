.class public final synthetic Lyyds/ᛷᛸᲈᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lyyds/ᛷᛸᲈᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛷᛸᲈᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛷᛸᲈᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᛷᛸᲈᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lyyds/ᛷᛸᲈᛱ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lyyds/ᛷᛸᲈᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛷᛸᲈᛱ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᛷᛸᲈᛱ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lyyds/ᛷᛸᲈᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛷᛸᲈᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v6, p0

    .line 17
    check-cast v6, Lyyds/ᲀᲈᛶᲈ;

    .line 18
    .line 19
    check-cast v4, Lyyds/ᲈᲁᲁᛲ;

    .line 20
    .line 21
    check-cast v3, Landroid/content/Context;

    .line 22
    .line 23
    check-cast v2, Lyyds/ᛲᲀᛶᛲ;

    .line 24
    .line 25
    iget-object v7, v4, Lyyds/ᲈᲁᲁᛲ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v8, Lyyds/ᛴᛷᛵᛶ;

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    invoke-direct {v8, v3, v2, p0}, Lyyds/ᛴᛷᛵᛶ;-><init>(Landroid/content/Context;Lyyds/ᛲᲀᛶᛲ;I)V

    .line 31
    .line 32
    .line 33
    const-wide v2, -0x40d56e68a836eL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    iget-object p0, v6, Lyyds/ᲀᲈᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, Lyyds/ᲇᛵᲁᛳ;

    .line 44
    .line 45
    new-instance v5, Lyyds/ᛷᲁᛸᛶ;

    .line 46
    .line 47
    const/16 v10, 0xb

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    invoke-direct/range {v5 .. v10}, Lyyds/ᛷᲁᛸᛶ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x3

    .line 54
    invoke-static {p0, v9, v5, v0}, Lyyds/ᲀᲀᛸᛱ;->ᛷᲈᲈᲁ(Lyyds/ᛴᲈᛳᲀ;Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;I)Lyyds/ᛲᛲᛵᛸ;

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_0
    check-cast p0, Landroid/widget/TextView;

    .line 59
    .line 60
    check-cast v4, Landroid/widget/TextView;

    .line 61
    .line 62
    check-cast v3, Landroid/widget/TextView;

    .line 63
    .line 64
    check-cast v2, Landroid/widget/TextView;

    .line 65
    .line 66
    invoke-static {p0, v4, v3, v2}, Lyyds/ᛸᛲᛲᲇ;->ᛶᛷᛲᲁ(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lyyds/ᛲᲁᛲᛲ;->ᛲᛴᛳᛲ()V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
