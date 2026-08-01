.class public final Lxhss/ᛳᛱᛵᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final synthetic ᛳᲁᲇᛸ:Landroid/content/Context;

.field public final synthetic ᛷᛴᛷᛱ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I

.field public final synthetic ᲇᛴᲇᛵ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p5, p0, Lxhss/ᛳᛱᛵᛱ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛳᛱᛵᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lxhss/ᛳᛱᛵᛱ;->ᛳᲁᲇᛸ:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lxhss/ᛳᛱᛵᛱ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    iput p4, p0, Lxhss/ᛳᛱᛵᛱ;->ᲇᛴᲇᛵ:I

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
    iget v0, p0, Lxhss/ᛳᛱᛵᛱ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget v1, p0, Lxhss/ᛳᛱᛵᛱ;->ᲇᛴᲇᛵ:I

    .line 4
    .line 5
    iget-object v2, p0, Lxhss/ᛳᛱᛵᛱ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lxhss/ᛳᛱᛵᛱ;->ᛳᲁᲇᛸ:Landroid/content/Context;

    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᛳᛱᛵᛱ;->ᛱᛱᛲᲇ:Ljava/lang/String;

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
    invoke-static {p0, v3, v2, v1}, Lxhss/ᛳᛷᲈᛵ;->ᛱᛱᛲᲇ(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lxhss/ᛳᛵᛴᲈ;

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
    new-instance p0, Lxhss/ᛳᛵᛴᲈ;

    .line 22
    .line 23
    const/4 v0, -0x3

    .line 24
    invoke-direct {p0, v0}, Lxhss/ᛳᛵᛴᲈ;-><init>(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-object p0

    .line 28
    :pswitch_0
    check-cast v2, Lxhss/ᛷᛱᛲᲇ;

    .line 29
    .line 30
    invoke-static {v2}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p0, v3, v0, v1}, Lxhss/ᛳᛷᲈᛵ;->ᛱᛱᛲᲇ(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lxhss/ᛳᛵᛴᲈ;

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
