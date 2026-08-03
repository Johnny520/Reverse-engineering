.class public final Lng/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lng/j;
.implements Lng/f;


# instance fields
.field public final a:Lng/j;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lng/j;II)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lng/r;->a:Lng/j;

    .line 8
    .line 9
    iput p2, p0, Lng/r;->b:I

    .line 10
    .line 11
    iput p3, p0, Lng/r;->c:I

    .line 12
    .line 13
    if-ltz p2, :cond_2

    .line 14
    .line 15
    if-ltz p3, :cond_1

    .line 16
    .line 17
    if-lt p3, p2, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "endIndex should be not less than startIndex, but was "

    .line 21
    .line 22
    const-string v0, " < "

    .line 23
    .line 24
    invoke-static {p3, p1, v0, p2}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    throw p1

    .line 33
    :cond_1
    const-string p1, "endIndex should be non-negative, but is "

    .line 34
    .line 35
    invoke-static {p3, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    throw p1

    .line 44
    :cond_2
    const-string p1, "startIndex should be non-negative, but is "

    .line 45
    .line 46
    invoke-static {p2, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    throw p1
.end method


# virtual methods
.method public final a(I)Lng/j;
    .locals 3

    .line 1
    iget v0, p0, Lng/r;->c:I

    .line 2
    .line 3
    iget v1, p0, Lng/r;->b:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Lng/r;

    .line 10
    .line 11
    iget-object v2, p0, Lng/r;->a:Lng/j;

    .line 12
    .line 13
    add-int/2addr p1, v1

    .line 14
    invoke-direct {v0, v2, v1, p1}, Lng/r;-><init>(Lng/j;II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final b(I)Lng/j;
    .locals 4

    .line 1
    iget v0, p0, Lng/r;->c:I

    .line 2
    .line 3
    iget v1, p0, Lng/r;->b:I

    .line 4
    .line 5
    sub-int v2, v0, v1

    .line 6
    .line 7
    if-lt p1, v2, :cond_0

    .line 8
    .line 9
    sget-object p1, Lng/g;->a:Lng/g;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    new-instance v2, Lng/r;

    .line 13
    .line 14
    iget-object v3, p0, Lng/r;->a:Lng/j;

    .line 15
    .line 16
    add-int/2addr v1, p1

    .line 17
    invoke-direct {v2, v3, v1, v0}, Lng/r;-><init>(Lng/j;II)V

    .line 18
    .line 19
    .line 20
    return-object v2
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lf/i0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lf/i0;-><init>(Lng/r;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
