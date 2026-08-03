.class public final LYue/ۥ۟ۨۨۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۨۨۢ;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "LYue/\u06e5\u06e0\u06e5\u06e3\u06e8;",
        ">;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۧ:I

.field public final synthetic ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۨۨۢ;)V
    .locals 2

    iput-object p1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    invoke-static {p1}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟۠(LYue/ۥ۟ۨۨۢ;)I

    move-result v0

    invoke-static {p1}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟(LYue/ۥ۟ۨۨۢ;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۡۧ(III)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۤ:I

    iput p1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method private final ۥ()V
    .locals 6

    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;

    invoke-static {v0}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۨۨۢ;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-lez v0, :cond_1

    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۧ:I

    add-int/2addr v0, v3

    iput v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۧ:I

    iget-object v4, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;

    invoke-static {v4}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۨۨۢ;)I

    move-result v4

    if-ge v0, v4, :cond_2

    :cond_1
    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    iget-object v4, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;

    invoke-static {v4}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟(LYue/ۥ۟ۨۨۢ;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v0, v4, :cond_3

    :cond_2
    new-instance v0, LYue/ۥ۠ۥۣۨ;

    iget v1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v4, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;

    invoke-static {v4}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟(LYue/ۥ۟ۨۨۢ;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۨ۟(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    iput-object v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;

    iput v2, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_3
    iget-object v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;

    invoke-static {v0}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟(LYue/ۥ۟ۨۨۢ;)LYue/ۥۣ۠ۢۢ;

    move-result-object v0

    iget-object v4, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;

    invoke-static {v4}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟(LYue/ۥ۟ۨۨۢ;)Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۣۡۦ۠;

    if-nez v0, :cond_4

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    iget v1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v4, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۨۨۢ;

    invoke-static {v4}, LYue/ۥ۟ۨۨۢ;->ۥ۟۟۟(LYue/ۥ۟ۨۨۢ;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۨ۟(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    iput-object v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;

    iput v2, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, LYue/ۥۣۡۦ۠;->ۥ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, LYue/ۥۣۡۦ۠;->ۥ۟()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v4, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۤ:I

    invoke-static {v4, v2}, LYue/ۥۡۦ۟;->ۥۣ۟۠ۢ(II)LYue/ۥ۠ۥۣۨ;

    move-result-object v4

    iput-object v4, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;

    add-int/2addr v2, v0

    iput v2, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۤ:I

    if-nez v0, :cond_5

    move v1, v3

    :cond_5
    add-int/2addr v2, v1

    iput v2, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    :goto_0
    iput v3, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    :goto_1
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ()V

    :cond_0
    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۟ۥ()LYue/ۥ۠ۥۣۨ;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۧ:I

    return v0
.end method

.method public final ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public final ۥ۟۟۟()LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟ۢ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    return v0
.end method

.method public final ۥۣ۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    return v0
.end method

.method public ۥ۟۟۟ۥ()LYue/ۥ۠ۥۣۨ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ()V

    :cond_0
    iget v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;

    iput v1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۥ۟۟۟ۦ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۧ:I

    return-void
.end method

.method public final ۥ۟۟۟ۧ(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method public final ۥ۟۟۟ۨ(LYue/ۥ۠ۥۣۨ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۥۣۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۨ;

    return-void
.end method

.method public final ۥ۟۟۠(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public final ۥ۟۟۠۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟ۨۨۢ$ۥ;->ۥۣ۟۟۠:I

    return-void
.end method
