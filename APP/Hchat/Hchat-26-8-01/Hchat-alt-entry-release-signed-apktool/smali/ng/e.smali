.class public final Lng/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lng/j;
.implements Lng/f;


# instance fields
.field public final synthetic a:I

.field public final b:Lng/j;

.field public final c:I


# direct methods
.method public constructor <init>(Lng/j;II)V
    .locals 0

    .line 1
    iput p3, p0, Lng/e;->a:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lng/e;->b:Lng/j;

    .line 13
    .line 14
    iput p2, p0, Lng/e;->c:I

    .line 15
    .line 16
    if-ltz p2, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p1, "count must be non-negative, but was "

    .line 20
    .line 21
    invoke-static {p2, p1}, Lj8/o;->d(ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    throw p1

    .line 26
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lng/e;->b:Lng/j;

    .line 30
    .line 31
    iput p2, p0, Lng/e;->c:I

    .line 32
    .line 33
    if-ltz p2, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-string p1, "count must be non-negative, but was "

    .line 37
    .line 38
    invoke-static {p2, p1}, Lj8/o;->d(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    throw p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(I)Lng/j;
    .locals 3

    .line 1
    iget v0, p0, Lng/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lng/e;->c:I

    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Lng/e;

    .line 13
    .line 14
    iget-object v1, p0, Lng/e;->b:Lng/j;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v1, p1, v2}, Lng/e;-><init>(Lng/j;II)V

    .line 18
    .line 19
    .line 20
    :goto_0
    return-object v0

    .line 21
    :pswitch_0
    iget v0, p0, Lng/e;->c:I

    .line 22
    .line 23
    add-int v1, v0, p1

    .line 24
    .line 25
    if-gez v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Lng/e;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-direct {v0, p0, p1, v1}, Lng/e;-><init>(Lng/j;II)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Lng/r;

    .line 35
    .line 36
    iget-object v2, p0, Lng/e;->b:Lng/j;

    .line 37
    .line 38
    invoke-direct {p1, v2, v0, v1}, Lng/r;-><init>(Lng/j;II)V

    .line 39
    .line 40
    .line 41
    move-object v0, p1

    .line 42
    :goto_1
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(I)Lng/j;
    .locals 3

    .line 1
    iget v0, p0, Lng/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lng/e;->c:I

    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lng/g;->a:Lng/g;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lng/r;

    .line 14
    .line 15
    iget-object v2, p0, Lng/e;->b:Lng/j;

    .line 16
    .line 17
    invoke-direct {v1, v2, p1, v0}, Lng/r;-><init>(Lng/j;II)V

    .line 18
    .line 19
    .line 20
    move-object p1, v1

    .line 21
    :goto_0
    return-object p1

    .line 22
    :pswitch_0
    iget v0, p0, Lng/e;->c:I

    .line 23
    .line 24
    add-int/2addr v0, p1

    .line 25
    if-gez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Lng/e;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, p1, v1}, Lng/e;-><init>(Lng/j;II)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Lng/e;

    .line 35
    .line 36
    iget-object v1, p0, Lng/e;->b:Lng/j;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {p1, v1, v0, v2}, Lng/e;-><init>(Lng/j;II)V

    .line 40
    .line 41
    .line 42
    move-object v0, p1

    .line 43
    :goto_1
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lng/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lng/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lng/d;-><init>(Lng/e;B)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Lng/d;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lng/d;-><init>(Lng/e;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
