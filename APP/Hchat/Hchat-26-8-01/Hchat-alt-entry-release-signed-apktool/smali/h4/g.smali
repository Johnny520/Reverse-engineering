.class public final Lh4/g;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lw4/e;


# direct methods
.method public constructor <init>(Lw4/e;)V
    .locals 2

    .line 1
    const-string v0, "Exceptions"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {p1}, Lw4/e;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lh4/g;->b:Lw4/e;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_1
    new-instance p1, Le4/a;

    .line 16
    .line 17
    const-string v0, "exceptions.isMutable()"

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, v0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 21
    .line 22
    .line 23
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 24
    :catch_0
    const-string p1, "exceptions == null"

    .line 25
    .line 26
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/g;->b:Lw4/e;

    .line 2
    .line 3
    invoke-interface {v0}, Lw4/e;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x8

    .line 10
    .line 11
    return v0
.end method
