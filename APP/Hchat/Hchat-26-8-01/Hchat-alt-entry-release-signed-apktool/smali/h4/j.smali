.class public final Lh4/j;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Li4/r;


# direct methods
.method public constructor <init>(Ljava/lang/String;Li4/r;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-boolean p1, p2, Lz4/j;->g:Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput-object p2, p0, Lh4/j;->b:Li4/r;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    :try_start_1
    new-instance p1, Le4/a;

    .line 12
    .line 13
    const-string p2, "localVariables.isMutable()"

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p1, p2, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 20
    :catch_0
    const-string p1, "localVariables == null"

    .line 21
    .line 22
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/j;->b:Li4/r;

    .line 2
    .line 3
    iget-object v0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    mul-int/lit8 v0, v0, 0xa

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x8

    .line 9
    .line 10
    return v0
.end method
