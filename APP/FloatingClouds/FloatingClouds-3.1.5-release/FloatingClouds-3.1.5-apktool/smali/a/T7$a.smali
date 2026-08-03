.class public final La/T7$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements La/q9;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/T7;->iterator()Ljava/util/Iterator;
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
        "La/q9;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public b:I

.field public final synthetic c:La/T7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/T7<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/T7;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/T7<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/T7$a;->c:La/T7;

    const/4 p1, -0x2

    iput p1, p0, La/T7$a;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, La/T7$a;->b:I

    const/4 v1, -0x2

    iget-object v2, p0, La/T7$a;->c:La/T7;

    if-ne v0, v1, :cond_0

    iget-object v0, v2, La/T7;->a:La/A3;

    iget-object v0, v0, La/A3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    goto :goto_0

    :cond_0
    iget-object v0, v2, La/T7;->b:La/D7;

    iget-object v1, p0, La/T7$a;->a:Ljava/lang/Object;

    invoke-static {v1}, La/i9;->b(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, La/D7;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iput-object v0, p0, La/T7$a;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    iput v0, p0, La/T7$a;->b:I

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, La/T7$a;->b:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, La/T7$a;->a()V

    :cond_0
    iget v0, p0, La/T7$a;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, La/T7$a;->b:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, La/T7$a;->a()V

    :cond_0
    iget v0, p0, La/T7$a;->b:I

    if-eqz v0, :cond_1

    iget-object v0, p0, La/T7$a;->a:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    invoke-static {v0, v1}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, -0x1

    iput v1, p0, La/T7$a;->b:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
