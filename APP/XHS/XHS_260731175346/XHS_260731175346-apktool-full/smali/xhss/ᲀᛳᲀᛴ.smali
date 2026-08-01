.class public final Lxhss/ᲀᛳᲀᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛵᛱ;

.field public ᛳᲁᲇᛸ:Lxhss/ᲀᛶᛲᛵ;

.field public ᲇᛴᲇᛵ:Landroid/os/Handler;


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lxhss/ᲀᛳᲀᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛱᛵᛱ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxhss/ᛳᛱᛵᛱ;->call()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lxhss/ᲀᛳᲀᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛶᛲᛵ;

    .line 10
    .line 11
    iget-object p0, p0, Lxhss/ᲀᛳᲀᛴ;->ᲇᛴᲇᛵ:Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v2, Lxhss/ᛳᛵᛲᲇ;

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    invoke-direct {v2, v3, v1, v0}, Lxhss/ᛳᛵᛲᲇ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method
