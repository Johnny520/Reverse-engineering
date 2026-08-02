.class public abstract Lv3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lkh1;


# instance fields
.field public h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 20
    new-array v0, v0, [I

    iput-object v0, p0, Lv3;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lv3;->h:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, Lv3;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt11;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lfj;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lfj;-><init>(Lv3;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv3;->h:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lej;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lej;-><init>(Lv3;Lt11;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lv3;->i:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public abstract a(I)[I
.end method

.method public b(II)[I
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    if-ltz p2, :cond_1

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p0, p0, Lv3;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, [I

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    aput p1, p0, v0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aput p2, p0, p1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lv3;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "text"

    .line 9
    .line 10
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lv3;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfj;

    .line 4
    .line 5
    iget-boolean v0, v0, Lfj;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lv3;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lej;

    .line 12
    .line 13
    iget-boolean p0, p0, Lhm1;->b:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public e()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract f()V
.end method

.method public g(Ldj;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract i(I)[I
.end method

.method public j(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lv3;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfj;

    .line 4
    .line 5
    iput-boolean p1, v0, Lfj;->b:Z

    .line 6
    .line 7
    iget-object v0, v0, Lfj;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljt1;

    .line 24
    .line 25
    iget-boolean v2, v1, Ljt1;->e:Z

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v2, 0x0

    .line 34
    :goto_1
    invoke-virtual {v1, v2}, Lhm1;->f(Z)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object p0, p0, Lv3;->i:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lej;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lhm1;->f(Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public q(Lkj1;)Ljh1;
    .locals 4

    .line 1
    new-instance v0, Lo42;

    .line 2
    .line 3
    iget-object v1, p0, Lv3;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object p0, p0, Lv3;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Class;

    .line 10
    .line 11
    const-class v2, Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {p1, v2, p0}, Lkj1;->g(Ljava/lang/Class;Ljava/lang/Class;)Ljh1;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-class v3, Landroid/net/Uri;

    .line 18
    .line 19
    invoke-virtual {p1, v3, p0}, Lkj1;->g(Ljava/lang/Class;Ljava/lang/Class;)Ljh1;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, v1, v2, p1, p0}, Lo42;-><init>(Landroid/content/Context;Ljh1;Ljh1;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
