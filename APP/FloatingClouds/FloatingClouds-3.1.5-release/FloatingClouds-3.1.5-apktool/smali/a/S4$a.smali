.class public final La/S4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements La/q9;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/S4;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "La/f9;",
        ">;",
        "La/q9;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:La/f9;

.field public e:I

.field public final synthetic f:La/S4;


# direct methods
.method public constructor <init>(La/S4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/S4$a;->f:La/S4;

    const/4 v0, -0x1

    iput v0, p0, La/S4$a;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, La/S4;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, v0, p1}, La/Oc;->C(III)I

    move-result p1

    iput p1, p0, La/S4$a;->b:I

    iput p1, p0, La/S4$a;->c:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget v0, p0, La/S4$a;->c:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, La/S4$a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, La/S4$a;->d:La/f9;

    return-void

    :cond_0
    iget-object v2, p0, La/S4$a;->f:La/S4;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, p0, La/S4$a;->e:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, p0, La/S4$a;->e:I

    iget-object v5, v2, La/S4;->a:Ljava/lang/String;

    const/4 v6, 0x4

    const/4 v7, -0x1

    if-ge v3, v6, :cond_4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-le v0, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v2, La/S4;->b:La/i0;

    iget v2, p0, La/S4$a;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v5, v2}, La/i0;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/mc;

    if-nez v0, :cond_2

    new-instance v0, La/f9;

    iget v1, p0, La/S4$a;->b:I

    invoke-static {v5}, La/Be;->K(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v4}, La/d9;-><init>(III)V

    iput-object v0, p0, La/S4$a;->d:La/f9;

    iput v7, p0, La/S4$a;->c:I

    goto :goto_1

    :cond_2
    iget-object v2, v0, La/mc;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v0, v0, La/mc;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v3, p0, La/S4$a;->b:I

    invoke-static {v3, v2}, La/Oc;->D(II)La/f9;

    move-result-object v3

    iput-object v3, p0, La/S4$a;->d:La/f9;

    add-int/2addr v2, v0

    iput v2, p0, La/S4$a;->b:I

    if-nez v0, :cond_3

    move v1, v4

    :cond_3
    add-int/2addr v2, v1

    iput v2, p0, La/S4$a;->c:I

    goto :goto_1

    :cond_4
    :goto_0
    new-instance v0, La/f9;

    iget v1, p0, La/S4$a;->b:I

    invoke-static {v5}, La/Be;->K(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v4}, La/d9;-><init>(III)V

    iput-object v0, p0, La/S4$a;->d:La/f9;

    iput v7, p0, La/S4$a;->c:I

    :goto_1
    iput v4, p0, La/S4$a;->a:I

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, La/S4$a;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La/S4$a;->a()V

    :cond_0
    iget v0, p0, La/S4$a;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La/S4$a;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, La/S4$a;->a()V

    :cond_0
    iget v0, p0, La/S4$a;->a:I

    if-eqz v0, :cond_1

    iget-object v0, p0, La/S4$a;->d:La/f9;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, La/i9;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, p0, La/S4$a;->d:La/f9;

    iput v1, p0, La/S4$a;->a:I

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
