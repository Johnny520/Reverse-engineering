.class public abstract LYue/ۥ۟۟ۡۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟۟ۡۡ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LYue/ۥۢ۠۟۠;->ۥ۟۟۠ۤ:LYue/ۥۢ۠۟۠;

    iput-object v0, p0, LYue/ۥ۟۟ۡۡ;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 3

    iget-object v0, p0, LYue/ۥ۟۟ۡۡ;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    sget-object v1, LYue/ۥۢ۠۟۠;->ۥ۟۟۠ۦ:LYue/ۥۢ۠۟۠;

    if-eq v0, v1, :cond_2

    sget-object v1, LYue/ۥ۟۟ۡۡ$ۥ;->ۥ:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۡ;->ۥ۟۟۟()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۡ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LYue/ۥۢ۠۟۠;->ۥ۟۟۠ۤ:LYue/ۥۢ۠۟۠;

    iput-object v0, p0, LYue/ۥ۟۟ۡۡ;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    iget-object v0, p0, LYue/ۥ۟۟ۡۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0

    :cond_0
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

.method public abstract ۥ()V
.end method

.method public final ۥ۟()V
    .locals 1

    sget-object v0, LYue/ۥۢ۠۟۠;->ۥ۟۟۠ۥ:LYue/ۥۢ۠۟۠;

    iput-object v0, p0, LYue/ۥ۟۟ۡۡ;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    return-void
.end method

.method public final ۥ۟۟(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۡۡ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    sget-object p1, LYue/ۥۢ۠۟۠;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    iput-object p1, p0, LYue/ۥ۟۟ۡۡ;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    return-void
.end method

.method public final ۥ۟۟۟()Z
    .locals 2

    sget-object v0, LYue/ۥۢ۠۟۠;->ۥ۟۟۠ۦ:LYue/ۥۢ۠۟۠;

    iput-object v0, p0, LYue/ۥ۟۟ۡۡ;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۡ;->ۥ()V

    iget-object v0, p0, LYue/ۥ۟۟ۡۡ;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    sget-object v1, LYue/ۥۢ۠۟۠;->ۥۣ۟۟۠:LYue/ۥۢ۠۟۠;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
