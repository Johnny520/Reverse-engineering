.class public final Lyyds/ᲀᲁᛴᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Ljava/lang/String;

.field public final synthetic ᲀᛲᛳᲀ:Landroid/content/Context;

.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p5, p0, Lyyds/ᲀᲁᛴᛴ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲀᲁᛴᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲀᲁᛴᛴ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lyyds/ᲀᲁᛴᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 8
    .line 9
    iput p4, p0, Lyyds/ᲀᲁᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᲀᲁᛴᛴ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᲀᲁᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᲀᲁᛴᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᲀᲁᛴᛴ;->ᲀᛲᛳᲀ:Landroid/content/Context;

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᲀᲁᛴᛴ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    :try_start_0
    check-cast v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {p0, v3, v2, v1}, Lyyds/ᲈᛵᲇᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lyyds/ᲁᛶᛱ;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    new-instance p0, Lyyds/ᲁᛶᛱ;

    .line 22
    .line 23
    const/4 v0, -0x3

    .line 24
    invoke-direct {p0, v0}, Lyyds/ᲁᛶᛱ;-><init>(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-object p0

    .line 28
    :pswitch_0
    check-cast v2, Lyyds/ᛶᛸᲈᛳ;

    .line 29
    .line 30
    invoke-static {v2}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p0, v3, v0, v1}, Lyyds/ᲈᛵᲇᲀ;->ᛵᛸᛸᛷ(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lyyds/ᲁᛶᛱ;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
