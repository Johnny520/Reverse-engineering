.class public final LYue/ۥ۟ۤۦۨ;
.super Ljava/util/AbstractCollection;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟ۡ۟:I = 0x40000000

.field public static final ۥ۟۟ۡ۠:I = 0x100


# instance fields
.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:I

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:I

.field public ۥ۟۟۠ۨ:I

.field public ۥ۟۟ۡ:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x100

    .line 1
    invoke-direct {p0, v0}, LYue/ۥ۟ۤۦۨ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۤۦۨ;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    .line 5
    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    .line 6
    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    if-gt p1, p2, :cond_3

    const/high16 v0, 0x40000000    # 2.0f

    if-gt p2, v0, :cond_2

    const/4 v0, 0x1

    .line 7
    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    :goto_0
    iget v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    if-ge v1, p1, :cond_0

    shl-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    goto :goto_0

    .line 8
    :cond_0
    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۧ:I

    :goto_1
    iget p1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۧ:I

    if-ge p1, p2, :cond_1

    shl-int/lit8 p1, p1, 0x1

    iput p1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۧ:I

    goto :goto_1

    .line 9
    :cond_1
    iget p1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    add-int/lit8 p2, p1, -0x1

    iput p2, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۨ:I

    .line 10
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    return-void

    .line 11
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Maximum capacity greater than allowed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Capacity greater than maximum"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(LYue/ۥ۟ۤۦۨ;)V
    .locals 3

    .line 13
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    .line 15
    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    .line 16
    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    .line 17
    iget v1, p1, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    iput v1, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    .line 18
    iget v1, p1, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    iput v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    .line 19
    iget v1, p1, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    iput v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    .line 20
    iget v1, p1, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    iput v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    .line 21
    iget v1, p1, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۧ:I

    iput v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۧ:I

    .line 22
    iget v1, p1, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۨ:I

    iput v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۨ:I

    .line 23
    iget-object v1, p1, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    array-length v1, v1

    new-array v1, v1, [Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    .line 24
    iget-object p1, p1, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    array-length v2, v1

    invoke-static {p1, v0, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۟ۤۦۨ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    return p0
.end method

.method public static synthetic ۥ۟(LYue/ۥ۟ۤۦۨ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    return p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۟ۤۦۨ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    return p0
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۟ۤۦۨ;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥ۟ۤۦۨ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۨ:I

    return p0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 3

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    iget v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    iget-object v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v2, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    aput-object p1, v0, v2

    add-int/2addr v2, v1

    iget p1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۨ:I

    and-int/2addr p1, v2

    iput p1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    return v1
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    new-instance v0, LYue/ۥ۟ۤۦۨ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۤۦۨ;-><init>(LYue/ۥ۟ۤۦۨ;)V

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LYue/ۥ۟ۤۦۧ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۤۦۧ;-><init>(LYue/ۥ۟ۤۦۨ;)V

    return-object v0
.end method

.method public peek()Ljava/lang/Object;
    .locals 2

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public remove()Ljava/lang/Object;
    .locals 4

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    iget-object v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v2, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    aget-object v3, v0, v2

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۨ:I

    and-int/2addr v0, v2

    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    return-object v3
.end method

.method public size()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuffer;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    invoke-super {p0}, Ljava/util/AbstractCollection;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " - capacity: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۟۠()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, "\' size: \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, LYue/ۥ۟ۤۦۨ;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    iget v1, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    if-lez v1, :cond_0

    const-string v1, " elements:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    if-ge v1, v2, :cond_0

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const/16 v2, 0x9

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget-object v2, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v3, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    add-int/2addr v3, v1

    iget v4, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۨ:I

    and-int/2addr v3, v4

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۠()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    return v0
.end method

.method public final ۥ۟۟۟ۡ()Z
    .locals 6

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    iget v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۧ:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    add-int v3, v0, v0

    iput v3, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۦ:I

    add-int/lit8 v4, v3, -0x1

    iput v4, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۨ:I

    new-array v3, v3, [Ljava/lang/Object;

    iput-object v3, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    iget v4, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    sub-int v5, v0, v4

    invoke-static {v1, v4, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v3, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    if-eqz v3, :cond_1

    iget-object v4, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟ۡ:[Ljava/lang/Object;

    sub-int/2addr v0, v3

    invoke-static {v1, v2, v4, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput v2, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۥ:I

    iget v0, p0, LYue/ۥ۟ۤۦۨ;->ۥۣ۟۟۠:I

    iput v0, p0, LYue/ۥ۟ۤۦۨ;->ۥ۟۟۠ۤ:I

    const/4 v0, 0x1

    return v0
.end method
