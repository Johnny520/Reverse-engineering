.class public abstract Ly7/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lr4/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr4/m;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lr4/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly7/a;->a:Lr4/m;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Ljava/lang/Object;Lr7/m;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    if-nez p0, :cond_1

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v1, Ly7/b;

    .line 14
    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    check-cast p0, Ly7/b;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    new-instance v0, Ly7/b;

    .line 21
    .line 22
    const/16 v1, 0xa

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lz7/c;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ly7/b;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    invoke-virtual {p0, p1}, Ly7/b;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_3
    :goto_1
    return-object p0
.end method

.method public static b(II)I
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    if-le p0, p1, :cond_1

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_1
    const/4 p0, -0x1

    .line 10
    return p0
.end method

.method public static c(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, -0x1

    .line 6
    if-nez p0, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    const/4 v2, 0x1

    .line 10
    if-nez p1, :cond_2

    .line 11
    .line 12
    return v2

    .line 13
    :cond_2
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_3

    .line 18
    .line 19
    return v0

    .line 20
    :cond_3
    if-lez p0, :cond_4

    .line 21
    .line 22
    return v2

    .line 23
    :cond_4
    return v1
.end method

.method public static d(ZZ)I
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_1
    const/4 p0, -0x1

    .line 10
    return p0
.end method

.method public static e(II)I
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    int-to-long v0, p0

    .line 6
    const-wide v2, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr v0, v2

    .line 12
    int-to-long p0, p1

    .line 13
    and-long/2addr p0, v2

    .line 14
    cmp-long p0, v0, p0

    .line 15
    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, -0x1

    .line 21
    return p0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static g(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lz7/h;->g:Lz7/h;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Ly7/b;

    .line 11
    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    check-cast p0, Ly7/b;

    .line 15
    .line 16
    invoke-virtual {p0}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p0}, Lz7/q;->a(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static h(Ljava/util/Iterator;)Ljava/lang/String;
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    const-string p0, ""

    .line 45
    .line 46
    return-object p0
.end method

.method public static i(Ljava/lang/Object;Lr7/m;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    if-ne p1, p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Ly7/b;

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-object p0

    .line 24
    :cond_2
    check-cast p0, Ly7/b;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ly7/b;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lz7/c;->i:I

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    const/4 v0, 0x1

    .line 35
    if-ne p1, v0, :cond_4

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iget-object p0, p0, Lz7/c;->g:[Ljava/lang/Object;

    .line 39
    .line 40
    aget-object p0, p0, p1

    .line 41
    .line 42
    :cond_4
    return-object p0

    .line 43
    :cond_5
    :goto_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public static j(Ljava/lang/Object;)I
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ly7/b;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ly7/b;

    .line 14
    .line 15
    iget p0, p0, Lz7/c;->i:I

    .line 16
    .line 17
    return p0

    .line 18
    :cond_1
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static k(II)Ljava/lang/String;
    .locals 4

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    int-to-long v2, p0

    .line 7
    and-long/2addr v0, v2

    .line 8
    invoke-static {p1, v0, v1}, Ly7/a;->l(IJ)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static l(IJ)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v0, "0x"

    .line 8
    .line 9
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sub-int/2addr p0, v0

    .line 17
    const/4 v0, 0x0

    .line 18
    :goto_0
    if-ge v0, p0, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x30

    .line 21
    .line 22
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static m(ILjava/lang/String;J)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p3, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    sub-int/2addr p0, p1

    .line 20
    const/4 p1, 0x0

    .line 21
    :goto_0
    if-ge p1, p0, :cond_1

    .line 22
    .line 23
    const/16 v0, 0x30

    .line 24
    .line 25
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public static n(B)Ljava/lang/String;
    .locals 4

    .line 1
    int-to-long v0, p0

    .line 2
    const-wide/16 v2, 0xff

    .line 3
    .line 4
    and-long/2addr v0, v2

    .line 5
    const/4 p0, 0x2

    .line 6
    invoke-static {p0, v0, v1}, Ly7/a;->l(IJ)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static o(S)Ljava/lang/String;
    .locals 4

    .line 1
    int-to-long v0, p0

    .line 2
    const-wide/32 v2, 0xffff

    .line 3
    .line 4
    .line 5
    and-long/2addr v0, v2

    .line 6
    const/4 p0, 0x4

    .line 7
    invoke-static {p0, v0, v1}, Ly7/a;->l(IJ)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static p(ILjava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    int-to-long v2, p0

    .line 7
    and-long/2addr v0, v2

    .line 8
    const/16 p0, 0x8

    .line 9
    .line 10
    invoke-static {p0, p1, v0, v1}, Ly7/a;->m(ILjava/lang/String;J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static q(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    array-length v3, v0

    .line 8
    if-ge v1, v3, :cond_3

    .line 9
    .line 10
    aget-char v3, v0, v1

    .line 11
    .line 12
    const/16 v4, 0x5a

    .line 13
    .line 14
    if-gt v3, v4, :cond_1

    .line 15
    .line 16
    const/16 v4, 0x41

    .line 17
    .line 18
    if-ge v3, v4, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    add-int/lit8 v4, v3, 0x20

    .line 22
    .line 23
    int-to-char v4, v4

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    move v4, v3

    .line 26
    :goto_2
    if-ne v3, v4, :cond_2

    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_2
    aput-char v4, v0, v1

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    if-nez v2, :cond_4

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_4
    new-instance p0, Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 41
    .line 42
    .line 43
    return-object p0
.end method
