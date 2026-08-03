.class public final Lh4/h;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Lh4/u;


# direct methods
.method public constructor <init>(Lh4/u;)V
    .locals 2

    .line 1
    const-string v0, "InnerClasses"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-boolean v0, p1, Lz4/j;->g:Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lh4/h;->b:Lh4/u;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    :try_start_1
    new-instance p1, Le4/a;

    .line 14
    .line 15
    const-string v0, "innerClasses.isMutable()"

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {p1, v0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 22
    :catch_0
    const-string p1, "innerClasses == null"

    .line 23
    .line 24
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/h;->b:Lh4/u;

    .line 2
    .line 3
    iget-object v0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    mul-int/lit8 v0, v0, 0x8

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x8

    .line 9
    .line 10
    return v0
.end method
