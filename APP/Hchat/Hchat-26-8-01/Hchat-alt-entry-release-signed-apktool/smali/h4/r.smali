.class public abstract Lh4/r;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic b:I

.field public final c:I

.field public final d:Lz4/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lt4/b;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh4/r;->b:I

    .line 3
    .line 4
    invoke-direct {p0, p1}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-boolean p1, p2, Lz4/j;->g:Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iput-object p2, p0, Lh4/r;->d:Lz4/j;

    .line 12
    .line 13
    iput p3, p0, Lh4/r;->c:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    new-instance p1, Le4/a;

    .line 17
    .line 18
    const-string p2, "annotations.isMutable()"

    .line 19
    .line 20
    const/4 p3, 0x0

    .line 21
    invoke-direct {p1, p2, p3}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 25
    :catch_0
    const-string p1, "annotations == null"

    .line 26
    .line 27
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    throw p1
.end method

.method public constructor <init>(Ljava/lang/String;Lt4/c;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh4/r;->b:I

    .line 32
    invoke-direct {p0, p1}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 33
    :try_start_0
    iget-boolean p1, p2, Lz4/j;->g:Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p1, :cond_0

    .line 34
    iput-object p2, p0, Lh4/r;->d:Lz4/j;

    .line 35
    iput p3, p0, Lh4/r;->c:I

    return-void

    .line 36
    :cond_0
    :try_start_1
    new-instance p1, Le4/a;

    const-string p2, "parameterAnnotations.isMutable()"

    const/4 p3, 0x0

    .line 37
    invoke-direct {p1, p2, p3}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 38
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 39
    :catch_0
    const-string p1, "parameterAnnotations == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lh4/r;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lh4/r;->c:I

    .line 7
    .line 8
    :goto_0
    add-int/lit8 v0, v0, 0x6

    .line 9
    .line 10
    return v0

    .line 11
    :pswitch_0
    iget v0, p0, Lh4/r;->c:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
