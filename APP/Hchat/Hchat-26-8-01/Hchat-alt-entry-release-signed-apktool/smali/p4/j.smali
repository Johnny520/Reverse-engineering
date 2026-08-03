.class public final Lp4/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Lf8/i;

.field public final e:Z


# direct methods
.method public constructor <init>(IIILf8/i;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La7/a;->A(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-static {p2}, La7/a;->A(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-static {p3}, La7/a;->A(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-eqz p4, :cond_0

    .line 23
    .line 24
    iput p1, p0, Lp4/j;->a:I

    .line 25
    .line 26
    iput p2, p0, Lp4/j;->b:I

    .line 27
    .line 28
    iput p3, p0, Lp4/j;->c:I

    .line 29
    .line 30
    iput-object p4, p0, Lp4/j;->d:Lf8/i;

    .line 31
    .line 32
    iput-boolean p5, p0, Lp4/j;->e:Z

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string p1, "format == null"

    .line 36
    .line 37
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    throw p1

    .line 42
    :cond_1
    const-string p1, "bogus nextOpcode"

    .line 43
    .line 44
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    throw p1

    .line 49
    :cond_2
    const-string p1, "bogus family"

    .line 50
    .line 51
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    throw p1

    .line 56
    :cond_3
    const-string p1, "bogus opcode"

    .line 57
    .line 58
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lp4/j;->a:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    :try_start_0
    sget-object v2, Ls4/a;->a:[Lj8/x;

    .line 6
    .line 7
    aget-object v1, v2, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, v1, Lj8/x;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :catch_0
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    int-to-char v2, v0

    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    invoke-static {v0}, La/a;->X0(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    const-string v2, "bogus opcode: "

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp4/j;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
