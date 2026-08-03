.class public final La/x6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements La/q9;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/x6;->iterator()Ljava/util/Iterator;
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
.field public final a:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field public b:I

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final synthetic d:La/x6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/x6<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/x6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/x6<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x6$a;->d:La/x6;

    iget-object p1, p1, La/x6;->a:La/Bf;

    new-instance v0, La/Bf$a;

    invoke-direct {v0, p1}, La/Bf$a;-><init>(La/Bf;)V

    iput-object v0, p0, La/x6$a;->a:Ljava/util/Iterator;

    const/4 p1, -0x1

    iput p1, p0, La/x6$a;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    :cond_0
    iget-object v0, p0, La/x6$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, La/x6$a;->d:La/x6;

    iget-object v1, v1, La/x6;->b:La/kd;

    invoke-virtual {v1, v0}, La/kd;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    iput-object v0, p0, La/x6$a;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, La/x6$a;->b:I

    return-void

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, La/x6$a;->b:I

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, La/x6$a;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La/x6$a;->a()V

    :cond_0
    iget v0, p0, La/x6$a;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, La/x6$a;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La/x6$a;->a()V

    :cond_0
    iget v0, p0, La/x6$a;->b:I

    if-eqz v0, :cond_1

    iget-object v0, p0, La/x6$a;->c:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, La/x6$a;->c:Ljava/lang/Object;

    iput v1, p0, La/x6$a;->b:I

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
