.class public final LYue/ۥۣۣ۠ۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۣ۠ۨ;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:I

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣۣ۠ۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e3\u06e8<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۠ۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e3\u06e8<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۠ۨ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x2

    iput p1, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    return-void
.end method

.method private final ۥ()V
    .locals 2

    iget v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۠ۨ;

    invoke-static {v0}, LYue/ۥۣۣ۠ۨ;->ۥ۟۟(LYue/ۥۣۣ۠ۨ;)LYue/ۥۣ۠۠ۨ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۣ۠ۨ;

    invoke-static {v0}, LYue/ۥۣۣ۠ۨ;->ۥ۟۟۟(LYue/ۥۣۣ۠ۨ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-static {v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iput-object v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    iput v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    if-gez v0, :cond_0

    invoke-direct {p0}, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ()V

    :cond_0
    iget v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    if-gez v0, :cond_0

    invoke-direct {p0}, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ()V

    :cond_0
    iget v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    iput v1, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public final ۥ۟۟۟(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    return-void
.end method

.method public final ۥ۟۟۟ۢ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣۣ۠ۨ$ۥ;->ۥ۟۟۠ۤ:I

    return-void
.end method
