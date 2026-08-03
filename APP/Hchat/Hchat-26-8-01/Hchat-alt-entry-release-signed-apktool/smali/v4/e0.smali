.class public final Lv4/e0;
.super Lz4/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final h:[Lv4/a;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-le p1, v0, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-direct {p0, v1}, Lz4/j;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    if-lt p1, v0, :cond_1

    .line 11
    .line 12
    new-array p1, p1, [Lv4/a;

    .line 13
    .line 14
    iput-object p1, p0, Lv4/e0;->h:[Lv4/a;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const-string p1, "size < 1"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    throw p1
.end method


# virtual methods
.method public final l(I)Lv4/a;
    .locals 4

    .line 1
    const-string v0, "invalid constant pool index "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lv4/e0;->h:[Lv4/a;

    .line 5
    .line 6
    aget-object v2, v2, p1

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    new-instance v2, Lf4/a;

    .line 12
    .line 13
    invoke-static {p1}, La/a;->X0(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-direct {v2, v3, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    throw v2
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :catch_0
    new-instance v2, Lf4/a;

    .line 26
    .line 27
    invoke-static {p1}, La/a;->X0(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v2, p1, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 36
    .line 37
    .line 38
    throw v2
.end method
