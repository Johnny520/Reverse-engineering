.class public final La/Re;
.super Landroid/database/CursorWrapper;
.source "SourceFile"


# instance fields
.field public final a:[I

.field public final b:I

.field public c:I


# direct methods
.method public constructor <init>(Landroid/database/Cursor;Ljava/util/HashSet;)V
    .locals 7

    invoke-direct {p0, p1}, Landroid/database/CursorWrapper;-><init>(Landroid/database/Cursor;)V

    const/4 v0, -0x1

    iput v0, p0, La/Re;->c:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    const-string v2, "talker"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v2

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    instance-of v3, v2, La/wd$a;

    if-eqz v3, :cond_0

    move-object v2, v0

    :cond_0
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I

    move-result v2

    const/4 v3, 0x0

    if-ltz v0, :cond_4

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v4

    :goto_1
    if-ge v3, v4, :cond_5

    invoke-interface {p1, v3}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v5

    if-eqz v5, :cond_3

    :try_start_1
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v5

    invoke-static {v5}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v5

    :goto_2
    instance-of v6, v5, La/wd$a;

    if-eqz v6, :cond_1

    const/4 v5, 0x0

    :cond_1
    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-virtual {p2, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    iget v5, p0, La/Re;->b:I

    add-int/lit8 v5, v5, 0x1

    iput v5, p0, La/Re;->b:I

    goto :goto_3

    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result p2

    :goto_4
    if-ge v3, p2, :cond_5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_5
    invoke-interface {p1, v2}, Landroid/database/Cursor;->moveToPosition(I)Z

    invoke-static {v1}, La/t3;->v0(Ljava/util/ArrayList;)[I

    move-result-object p1

    iput-object p1, p0, La/Re;->a:[I

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    iget-object v0, p0, La/Re;->a:[I

    array-length v0, v0

    return v0
.end method

.method public final getPosition()I
    .locals 1

    iget v0, p0, La/Re;->c:I

    return v0
.end method

.method public final isAfterLast()Z
    .locals 2

    iget-object v0, p0, La/Re;->a:[I

    array-length v1, v0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, La/Re;->c:I

    array-length v0, v0

    if-lt v1, v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final isBeforeFirst()Z
    .locals 1

    iget-object v0, p0, La/Re;->a:[I

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, La/Re;->c:I

    if-gez v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final isFirst()Z
    .locals 3

    iget-object v0, p0, La/Re;->a:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget v0, p0, La/Re;->c:I

    if-nez v0, :cond_1

    return v2

    :cond_1
    return v1
.end method

.method public final isLast()Z
    .locals 4

    iget-object v0, p0, La/Re;->a:[I

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-nez v1, :cond_1

    iget v1, p0, La/Re;->c:I

    array-length v0, v0

    sub-int/2addr v0, v3

    if-ne v1, v0, :cond_1

    return v3

    :cond_1
    return v2
.end method

.method public final move(I)Z
    .locals 1

    iget v0, p0, La/Re;->c:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, La/Re;->moveToPosition(I)Z

    move-result p1

    return p1
.end method

.method public final moveToFirst()Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La/Re;->moveToPosition(I)Z

    move-result v0

    return v0
.end method

.method public final moveToLast()Z
    .locals 1

    iget-object v0, p0, La/Re;->a:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, La/Re;->moveToPosition(I)Z

    move-result v0

    return v0
.end method

.method public final moveToNext()Z
    .locals 1

    iget v0, p0, La/Re;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, La/Re;->moveToPosition(I)Z

    move-result v0

    return v0
.end method

.method public final moveToPosition(I)Z
    .locals 3

    const/4 v0, 0x0

    if-gez p1, :cond_0

    const/4 p1, -0x1

    iput p1, p0, La/Re;->c:I

    invoke-super {p0, p1}, Landroid/database/CursorWrapper;->moveToPosition(I)Z

    return v0

    :cond_0
    iget-object v1, p0, La/Re;->a:[I

    array-length v2, v1

    if-lt p1, v2, :cond_1

    array-length p1, v1

    iput p1, p0, La/Re;->c:I

    invoke-super {p0}, Landroid/database/CursorWrapper;->getCount()I

    move-result p1

    invoke-super {p0, p1}, Landroid/database/CursorWrapper;->moveToPosition(I)Z

    return v0

    :cond_1
    iput p1, p0, La/Re;->c:I

    aget p1, v1, p1

    invoke-super {p0, p1}, Landroid/database/CursorWrapper;->moveToPosition(I)Z

    move-result p1

    return p1
.end method

.method public final moveToPrevious()Z
    .locals 1

    iget v0, p0, La/Re;->c:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, La/Re;->moveToPosition(I)Z

    move-result v0

    return v0
.end method
