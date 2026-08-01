.class public final Lxhss/ᲁᛲᛸᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛴᛷᲀᲁ;


# instance fields
.field public final ᛷᛵᛵᲈ:Landroidx/lifecycle/ᛷᛵᛵᲈ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;-><init>(Lxhss/ᛴᛷᲀᲁ;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᲁᛲᛸᛴ;->ᛷᛵᛵᲈ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lxhss/ᲁᛲᛸᛴ;->ᛷᛵᛵᲈ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 4
    .line 5
    sget-object v1, Lxhss/ᛱᛷᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "setCurrentState"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛷᛸᲁ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    :catch_0
    :cond_0
    sget-object p0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 18
    .line 19
    return-void
.end method

.method public final ᛳᲁᲇᛸ()V
    .locals 2

    .line 1
    :try_start_0
    iget-object p0, p0, Lxhss/ᲁᛲᛸᛴ;->ᛷᛵᛵᲈ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 4
    .line 5
    sget-object v1, Lxhss/ᛱᛷᛸᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛷᛸᲁ;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "setCurrentState"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛷᛸᲁ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    :catch_0
    :cond_0
    sget-object p0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 18
    .line 19
    return-void
.end method

.method public final ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲁᛲᛸᛴ;->ᛷᛵᛵᲈ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 2
    .line 3
    return-object p0
.end method
