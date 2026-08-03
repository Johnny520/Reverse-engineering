.class public final LYue/ۥۣۢ۟ۧ;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# instance fields
.field public ۥۣ۟۟۠:[Ljava/lang/Object;

.field public ۥ۟۟۠ۤ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xf

    .line 1
    invoke-direct {p0, v0}, LYue/ۥۣۢ۟ۧ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    if-ltz p1, :cond_0

    .line 3
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    const/4 p1, 0x0

    .line 4
    iput p1, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 7
    iput-object p1, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    .line 8
    iput p2, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۣۢ۟ۧ;->push(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public clear()V
    .locals 3

    iget-object v0, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    :goto_0
    iget v1, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    const/4 v2, 0x0

    aput-object v2, v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 4

    iget v0, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    new-array v1, v0, [Ljava/lang/Object;

    iget-object v2, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, LYue/ۥۣۢ۟ۧ;

    iget v2, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    invoke-direct {v0, v1, v2}, LYue/ۥۣۢ۟ۧ;-><init>([Ljava/lang/Object;I)V

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 4

    iget v0, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    new-array v1, v0, [Ljava/lang/Object;

    iget-object v2, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v0, LYue/ۥ۟ۡۧۧ;

    invoke-direct {v0, v1}, LYue/ۥ۟ۡۧۧ;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method

.method public peek()Ljava/lang/Object;
    .locals 2

    :try_start_0
    iget-object v0, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/util/EmptyStackException;

    invoke-direct {v0}, Ljava/util/EmptyStackException;-><init>()V

    throw v0
.end method

.method public pop()Ljava/lang/Object;
    .locals 4

    :try_start_0
    iget-object v0, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    aget-object v2, v0, v1

    const/4 v3, 0x0

    aput-object v3, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    iget v0, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    if-gez v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    :cond_0
    new-instance v0, Ljava/util/EmptyStackException;

    invoke-direct {v0}, Ljava/util/EmptyStackException;-><init>()V

    throw v0
.end method

.method public push(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    array-length v1, v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥۣۢ۟ۧ;->ۥ()V

    :cond_0
    iget-object v0, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    aput-object p1, v0, v1

    return-void
.end method

.method public size()I
    .locals 1

    iget v0, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public final ۥ()V
    .locals 4

    iget v0, p0, LYue/ۥۣۢ۟ۧ;->ۥ۟۟۠ۤ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    return-void

    :cond_0
    mul-int/lit8 v1, v0, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v1, p0, LYue/ۥۣۢ۟ۧ;->ۥۣ۟۟۠:[Ljava/lang/Object;

    return-void
.end method
