.class public final Ldf/g;
.super Ldf/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Lmh/b;

.field public static final h:Lef/c;


# instance fields
.field public final d:Lud/u;

.field public e:Ldf/i;

.field public f:Ldf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-class v0, Ldf/g;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldf/g;->g:Lmh/b;

    .line 8
    .line 9
    new-instance v1, Lef/c;

    .line 10
    .line 11
    const-string v5, "stub"

    .line 12
    .line 13
    const-string v6, ""

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    const-string v3, "stub"

    .line 17
    .line 18
    const-string v4, "stub"

    .line 19
    .line 20
    invoke-direct/range {v1 .. v6}, Lef/c;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Ldf/g;->h:Lef/c;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lud/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldf/g;->d:Lud/u;

    .line 5
    .line 6
    return-void
.end method

.method public static e(ILdf/e;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p1, Ldf/e;->h:J

    .line 2
    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const/16 v3, 0x10

    .line 6
    .line 7
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_0
    if-ge v3, p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ldf/e;->g()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    int-to-short v4, v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    int-to-char v4, v4

    .line 22
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    :goto_1
    int-to-long v3, p0

    .line 29
    add-long/2addr v0, v3

    .line 30
    const-string p0, "readScriptOrVariantChar"

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1, p0}, Ldf/e;->k(JLjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static f(BBC)[C
    .locals 6

    .line 1
    shr-int/lit8 v0, p0, 0x7

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    and-int/lit8 v0, p1, 0x1f

    .line 10
    .line 11
    and-int/lit16 p1, p1, 0xe0

    .line 12
    .line 13
    shr-int/lit8 p1, p1, 0x5

    .line 14
    .line 15
    and-int/lit8 v4, p0, 0x3

    .line 16
    .line 17
    const/4 v5, 0x3

    .line 18
    shl-int/2addr v4, v5

    .line 19
    add-int/2addr p1, v4

    .line 20
    and-int/lit8 p0, p0, 0x7c

    .line 21
    .line 22
    shr-int/2addr p0, v3

    .line 23
    add-int/2addr v0, p2

    .line 24
    int-to-char v0, v0

    .line 25
    add-int/2addr p1, p2

    .line 26
    int-to-char p1, p1

    .line 27
    add-int/2addr p0, p2

    .line 28
    int-to-char p0, p0

    .line 29
    new-array p2, v5, [C

    .line 30
    .line 31
    aput-char v0, p2, v2

    .line 32
    .line 33
    aput-char p1, p2, v1

    .line 34
    .line 35
    aput-char p0, p2, v3

    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_0
    int-to-char p0, p0

    .line 39
    int-to-char p1, p1

    .line 40
    new-array p2, v3, [C

    .line 41
    .line 42
    aput-char p0, p2, v2

    .line 43
    .line 44
    aput-char p1, p2, v1

    .line 45
    .line 46
    return-object p2
.end method


# virtual methods
.method public final d()Lb5/k;
    .locals 4

    .line 1
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const-string v2, "value size"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ldf/e;->a(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 11
    .line 12
    invoke-virtual {v0}, Ldf/e;->g()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Ldf/b;->b:Ldf/e;

    .line 19
    .line 20
    invoke-virtual {v0}, Ldf/e;->g()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, Ldf/b;->b:Ldf/e;

    .line 25
    .line 26
    invoke-virtual {v1}, Ldf/e;->e()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    new-instance v2, Lb5/k;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, v0, v1, v3}, Lb5/k;-><init>(III)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    const-string v3, "value res0 not 0"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1, v3}, Ldf/e;->l(IILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    throw v0
.end method
