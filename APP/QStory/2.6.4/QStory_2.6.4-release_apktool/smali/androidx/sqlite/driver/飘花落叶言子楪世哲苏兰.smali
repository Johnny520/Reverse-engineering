.class public final Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;
.super Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪兰世哲苏:[J

.field public 飘花落叶言子楪兰世苏哲:[I

.field public 飘花落叶言子楪兰哲世苏:[[B

.field public 飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

.field public 飘花落叶言子楪兰苏世哲:[D

.field public 飘花落叶言子楪兰苏哲世:[Ljava/lang/String;


# direct methods
.method public constructor <init>(L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    new-array p2, p1, [I

    .line 12
    .line 13
    iput-object p2, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 14
    .line 15
    new-array p2, p1, [J

    .line 16
    .line 17
    iput-object p2, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:[J

    .line 18
    .line 19
    new-array p2, p1, [D

    .line 20
    .line 21
    iput-object p2, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:[D

    .line 22
    .line 23
    new-array p2, p1, [Ljava/lang/String;

    .line 24
    .line 25
    iput-object p2, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:[Ljava/lang/String;

    .line 26
    .line 27
    new-array p1, p1, [[B

    .line 28
    .line 29
    iput-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:[[B

    .line 30
    .line 31
    return-void
.end method

.method public static 飘花落叶言子楪苏兰世哲(Landroid/database/Cursor;I)V
    .locals 0

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/database/Cursor;->getColumnCount()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-ge p1, p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/16 p0, 0x19

    .line 11
    .line 12
    const-string p1, "column index out of range"

    .line 13
    .line 14
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->reset()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Z

    .line 13
    .line 14
    return-void
.end method

.method public final getBlob(I)[B
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()Landroid/database/Cursor;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0, p1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroid/database/Cursor;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final getColumnCount()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Landroid/database/Cursor;->getColumnCount()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final getColumnName(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p0, p1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroid/database/Cursor;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string p0, "Required value was null."

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public final getLong(I)J
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()Landroid/database/Cursor;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0, p1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroid/database/Cursor;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getLong(I)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0
.end method

.method public final isNull(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()Landroid/database/Cursor;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0, p1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroid/database/Cursor;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Landroid/database/Cursor;->isNull(I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final reset()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言子世哲苏兰楪(ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-virtual {p0, v0, p1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 12
    .line 13
    aput v0, v1, p1

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:[Ljava/lang/String;

    .line 16
    .line 17
    aput-object p2, p0, p1

    .line 18
    .line 19
    return-void
.end method

.method public final 飘花落叶言子哲世楪兰苏([B)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 14
    .line 15
    aput v0, v2, v1

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:[[B

    .line 18
    .line 19
    aput-object p1, p0, v1

    .line 20
    .line 21
    return-void
.end method

.method public final 飘花落叶言子哲苏楪世兰()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const-string p0, "Required value was null."

    .line 17
    .line 18
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(IJ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0, p1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 9
    .line 10
    aput v0, v1, p1

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:[J

    .line 13
    .line 14
    aput-wide p2, p0, p1

    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(II)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/2addr p2, v0

    .line 3
    iget-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    if-ge v2, p2, :cond_0

    .line 7
    .line 8
    invoke-static {v1, p2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iput-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 13
    .line 14
    :cond_0
    if-eq p1, v0, :cond_4

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p1, v0, :cond_3

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-eq p1, v0, :cond_2

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    if-eq p1, v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:[[B

    .line 27
    .line 28
    array-length v0, p1

    .line 29
    if-ge v0, p2, :cond_5

    .line 30
    .line 31
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, [[B

    .line 36
    .line 37
    iput-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:[[B

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    iget-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:[Ljava/lang/String;

    .line 41
    .line 42
    array-length v0, p1

    .line 43
    if-ge v0, p2, :cond_5

    .line 44
    .line 45
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, [Ljava/lang/String;

    .line 50
    .line 51
    iput-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:[Ljava/lang/String;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    iget-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:[D

    .line 55
    .line 56
    array-length v0, p1

    .line 57
    if-ge v0, p2, :cond_5

    .line 58
    .line 59
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([DI)[D

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:[D

    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    iget-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:[J

    .line 67
    .line 68
    array-length v0, p1

    .line 69
    if-ge v0, p2, :cond_5

    .line 70
    .line 71
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:[J

    .line 76
    .line 77
    :cond_5
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰()Landroid/database/Cursor;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x15

    .line 7
    .line 8
    const-string v0, "no row"

    .line 9
    .line 10
    invoke-static {p0, v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x5

    .line 5
    invoke-virtual {p0, v0, p1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(II)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 9
    .line 10
    aput v0, p0, p1

    .line 11
    .line 12
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    const/4 v1, 0x7

    .line 8
    invoke-direct {v0, p0, v1}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    invoke-interface {v1, v0}, L飘花落叶言子兰世哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏兰世哲楪(Landroidx/core/view/飘花落叶言子楪世兰哲苏;)Landroid/database/Cursor;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Landroid/database/Cursor;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[I

    .line 8
    .line 9
    new-array v1, v0, [J

    .line 10
    .line 11
    iput-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:[J

    .line 12
    .line 13
    new-array v1, v0, [D

    .line 14
    .line 15
    iput-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:[D

    .line 16
    .line 17
    new-array v1, v0, [Ljava/lang/String;

    .line 18
    .line 19
    iput-object v1, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:[Ljava/lang/String;

    .line 20
    .line 21
    new-array v0, v0, [[B

    .line 22
    .line 23
    iput-object v0, p0, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:[[B

    .line 24
    .line 25
    return-void
.end method

.method public final 飘花落叶言子苏哲世兰楪(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰()Landroid/database/Cursor;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0, p1}, Landroidx/sqlite/driver/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroid/database/Cursor;I)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method
