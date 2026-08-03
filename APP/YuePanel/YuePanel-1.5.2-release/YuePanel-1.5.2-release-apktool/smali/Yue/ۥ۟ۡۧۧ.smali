.class public final LYue/ۥ۟ۡۧۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final ۥۣ۟۟۠:[Ljava/lang/Object;

.field public final ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 2

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, LYue/ۥ۟ۡۧۧ;-><init>([Ljava/lang/Object;II)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;II)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_2

    .line 3
    array-length v0, p1

    if-gt p2, v0, :cond_1

    .line 4
    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_0

    .line 5
    iput-object p1, p0, LYue/ۥ۟ۡۧۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    .line 6
    iput p2, p0, LYue/ۥ۟ۡۧۧ;->ۥ۟۟۠ۥ:I

    add-int/2addr p3, p2

    .line 7
    iput p3, p0, LYue/ۥ۟ۡۧۧ;->ۥ۟۟۠ۤ:I

    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 9
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    .line 10
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟ۡۧۧ;->ۥ۟۟۠ۥ:I

    iget v1, p0, LYue/ۥ۟ۡۧۧ;->ۥ۟۟۠ۤ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LYue/ۥ۟ۡۧۧ;->ۥ۟۟۠ۥ:I

    iget v1, p0, LYue/ۥ۟ۡۧۧ;->ۥ۟۟۠ۤ:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥ۟ۡۧۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, LYue/ۥ۟ۡۧۧ;->ۥ۟۟۠ۥ:I

    aget-object v0, v1, v0

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
