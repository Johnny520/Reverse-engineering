.class public LYue/ۥ۠ۤۤۡ;
.super LYue/ۥ۟ۧ۟ۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۤۤ;


# instance fields
.field public ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

.field public ۥۣ۟۠۟:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۟ۧ۟ۢ;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [LYue/ۥ۟ۧ۟ۢ;

    iput-object v0, p0, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    iget-object v0, p0, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟(LYue/ۥ۟ۧ۟ۢ;)V
    .locals 3

    if-eq p1, p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    array-length v2, v1

    if-le v0, v2, :cond_1

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYue/ۥ۟ۧ۟ۢ;

    iput-object v0, p0, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    :cond_1
    iget-object v0, p0, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    iget v1, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    :cond_2
    :goto_0
    return-void
.end method

.method public ۥ۟۟(LYue/ۥۣ۟ۧ۟;)V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥ۟ۧ۟ۢ;Ljava/util/HashMap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            "Ljava/util/HashMap<",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۟ۨ(LYue/ۥ۟ۧ۟ۢ;Ljava/util/HashMap;)V

    check-cast p1, LYue/ۥ۠ۤۤۡ;

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    iget v1, p1, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p1, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    aget-object v2, v2, v0

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۟ۧ۟ۢ;

    invoke-virtual {p0, v2}, LYue/ۥ۠ۤۤۡ;->ۥ۟(LYue/ۥ۟ۧ۟ۢ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۥ۟۠ۡۦ(Ljava/util/ArrayList;ILYue/ۥۢۥۣ۟;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06df;",
            ">;I",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06df;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    aget-object v2, v2, v1

    invoke-virtual {p3, v2}, LYue/ۥۢۥۣ۟;->ۥ(LYue/ۥ۟ۧ۟ۢ;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget v1, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    aget-object v1, v1, v0

    invoke-static {v1, p2, p1, p3}, LYue/ۥ۠ۤ۟۠;->ۥ(LYue/ۥ۟ۧ۟ۢ;ILjava/util/ArrayList;LYue/ۥۢۥۣ۟;)LYue/ۥۢۥۣ۟;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public ۥ۟۠ۡۧ(I)I
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, LYue/ۥ۠ۤۤۡ;->ۥۣ۟۠۟:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LYue/ۥ۠ۤۤۡ;->ۥ۟۠۟ۢ:[LYue/ۥ۟ۧ۟ۢ;

    aget-object v1, v1, v0

    if-nez p1, :cond_0

    iget v3, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۦ:I

    if-eq v3, v2, :cond_0

    return v3

    :cond_0
    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    iget v1, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۧ:I

    if-eq v1, v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method
