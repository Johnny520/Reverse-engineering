.class public final synthetic Lyyds/ᛳᛸᛴᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛸᲈ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛷᲀᲇᲈ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛷᲀᲇᲈ;Lyyds/ᛱᛷᛸᲈ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛳᛸᛴᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛳᛸᛴᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲀᲇᲈ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛳᛸᛴᛶ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛸᲈ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛳᛸᛴᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lyyds/ᛳᛸᛴᛶ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛸᲈ;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛳᛸᛴᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛷᲀᲇᲈ;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v3, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-wide v3, -0xc372e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v0

    .line 27
    check-cast v2, Lyyds/ᛲᛳᛶᲁ;

    .line 28
    .line 29
    :goto_0
    invoke-static {p0, v2}, Lyyds/ᲀᲀᛸᛱ;->ᛲᛲᲈᲈ(Lyyds/ᛷᲀᲇᲈ;Lyyds/ᛲᛳᛶᲁ;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_0
    iget-object v0, v3, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const-wide v3, -0xc3a4e68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v2, v0

    .line 47
    check-cast v2, Lyyds/ᛲᛳᛶᲁ;

    .line 48
    .line 49
    :goto_1
    invoke-static {p0, v2}, Lyyds/ᲀᲀᛸᛱ;->ᛲᛲᲈᲈ(Lyyds/ᛷᲀᲇᲈ;Lyyds/ᛲᛳᛶᲁ;)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
