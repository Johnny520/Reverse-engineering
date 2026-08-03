.class public final Ly5/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lu5/a;
.implements Lt5/d;


# instance fields
.field public final a:Lf5/f;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lf5/f;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly5/a;->t()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget v1, p1, Lf5/f;->m:I

    .line 9
    .line 10
    if-ne v1, v0, :cond_1

    .line 11
    .line 12
    iput-object p1, p0, Ly5/a;->a:Lf5/f;

    .line 13
    .line 14
    and-int/lit16 p1, p2, -0x100

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string v0, "Invalid register: v%d. Must be between v0 and v255, inclusive."

    .line 28
    .line 29
    invoke-static {v0, p1}, Lah/a;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iput p2, p0, Ly5/a;->b:I

    .line 33
    .line 34
    iput p3, p0, Ly5/a;->c:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object p1, p1, Lf5/f;->i:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v0}, Leh/a;->B(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const-string p3, "Invalid opcode "

    .line 44
    .line 45
    const-string v0, " for "

    .line 46
    .line 47
    invoke-static {p3, p1, v0, p2}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    throw p1
.end method


# virtual methods
.method public c()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly5/a;->t()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Leh/a;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    div-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Ly5/a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()Lf5/f;
    .locals 1

    .line 1
    iget-object v0, p0, Ly5/a;->a:Lf5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()I
    .locals 1

    .line 1
    iget v0, p0, Ly5/a;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final t()I
    .locals 1

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    return v0
.end method
