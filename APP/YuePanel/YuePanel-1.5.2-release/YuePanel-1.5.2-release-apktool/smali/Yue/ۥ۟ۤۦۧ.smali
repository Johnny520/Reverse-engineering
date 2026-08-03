.class public LYue/ۥ۟ۤۦۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ۥۣ۟۟۠:I

.field public final ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦۨ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۤۦۨ;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦۨ;

    invoke-static {p1}, LYue/ۥ۟ۤۦۨ;->ۥ(LYue/ۥ۟ۤۦۨ;)I

    move-result v0

    iput v0, p0, LYue/ۥ۟ۤۦۧ;->ۥۣ۟۟۠:I

    invoke-static {p1}, LYue/ۥ۟ۤۦۨ;->ۥ۟(LYue/ۥ۟ۤۦۨ;)I

    move-result v1

    iput v1, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۤ:I

    invoke-static {p1}, LYue/ۥ۟ۤۦۨ;->ۥ۟۟(LYue/ۥ۟ۤۦۨ;)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۥ:I

    iput v0, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۦ:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۤۦۧ;->ۥ()V

    iget v0, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۥ:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۟ۤۦۧ;->ۥ()V

    iget v0, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۥ:I

    if-eqz v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۥ:I

    iget-object v0, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦۨ;

    invoke-static {v0}, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۟(LYue/ۥ۟ۤۦۨ;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۦ:I

    aget-object v0, v0, v1

    add-int/lit8 v1, v1, 0x1

    iget-object v2, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦۨ;

    invoke-static {v2}, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۟۟(LYue/ۥ۟ۤۦۨ;)I

    move-result v2

    and-int/2addr v1, v2

    iput v1, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۦ:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ۥ()V
    .locals 2

    iget v0, p0, LYue/ۥ۟ۤۦۧ;->ۥۣ۟۟۠:I

    iget-object v1, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦۨ;

    invoke-static {v1}, LYue/ۥ۟ۤۦۨ;->ۥ(LYue/ۥ۟ۤۦۨ;)I

    move-result v1

    if-ne v0, v1, :cond_1

    iget v0, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥ۟ۤۦۧ;->ۥ۟۟۠ۧ:LYue/ۥ۟ۤۦۨ;

    invoke-static {v1}, LYue/ۥ۟ۤۦۨ;->ۥ۟(LYue/ۥ۟ۤۦۨ;)I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method
