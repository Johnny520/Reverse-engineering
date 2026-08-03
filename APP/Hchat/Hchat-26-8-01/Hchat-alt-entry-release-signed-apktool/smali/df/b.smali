.class public abstract Ldf/b;
.super Ldf/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:Lmh/b;


# instance fields
.field public b:Ldf/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ldf/b;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldf/b;->c:Lmh/b;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b()Ldf/a;
    .locals 7

    .line 1
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "String pool expected"

    .line 5
    .line 6
    invoke-virtual {v0, v1, v2}, Ldf/e;->a(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 10
    .line 11
    iget-wide v1, v0, Ldf/e;->h:J

    .line 12
    .line 13
    const-wide/16 v3, 0x2

    .line 14
    .line 15
    sub-long/2addr v1, v3

    .line 16
    invoke-virtual {v0}, Ldf/e;->c()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v3, 0x1c

    .line 21
    .line 22
    if-eq v0, v3, :cond_0

    .line 23
    .line 24
    const-string v3, "Unexpected string pool header size: 0x{}, expected: 0x1C"

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v4, Ldf/b;->c:Lmh/b;

    .line 31
    .line 32
    invoke-interface {v4, v0, v3}, Lmh/b;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 36
    .line 37
    invoke-virtual {v0}, Ldf/e;->e()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    int-to-long v3, v0

    .line 42
    const-wide v5, 0xffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v3, v5

    .line 48
    add-long/2addr v3, v1

    .line 49
    invoke-virtual {p0, v1, v2, v3, v4}, Ldf/b;->c(JJ)Ldf/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method public final c(JJ)Ldf/a;
    .locals 6

    .line 1
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldf/e;->e()I

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Ldf/e;->e()I

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 12
    .line 13
    invoke-virtual {v0}, Ldf/e;->e()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Ldf/b;->b:Ldf/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Ldf/e;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-long v1, v1

    .line 24
    iget-object v3, p0, Ldf/b;->b:Ldf/e;

    .line 25
    .line 26
    invoke-virtual {v3}, Ldf/e;->e()I

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Ldf/b;->b:Ldf/e;

    .line 30
    .line 31
    iget-wide v4, v3, Ldf/e;->h:J

    .line 32
    .line 33
    sub-long p1, v4, p1

    .line 34
    .line 35
    sub-long/2addr v1, p1

    .line 36
    sub-long p1, p3, v4

    .line 37
    .line 38
    long-to-int p1, p1

    .line 39
    invoke-virtual {v3, p1}, Ldf/e;->h(I)[B

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p2, p0, Ldf/b;->b:Ldf/e;

    .line 44
    .line 45
    const-string v3, "Expected strings pool end"

    .line 46
    .line 47
    invoke-virtual {p2, p3, p4, v3}, Ldf/e;->b(JLjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    new-instance p2, Ldf/a;

    .line 51
    .line 52
    and-int/lit16 p3, v0, 0x100

    .line 53
    .line 54
    if-eqz p3, :cond_0

    .line 55
    .line 56
    const/4 p3, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 p3, 0x0

    .line 59
    :goto_0
    invoke-direct {p2, v1, v2, p1, p3}, Ldf/a;-><init>(J[BZ)V

    .line 60
    .line 61
    .line 62
    return-object p2
.end method
