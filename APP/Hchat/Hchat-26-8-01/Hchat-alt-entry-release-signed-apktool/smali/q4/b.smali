.class public final Lq4/b;
.super Lf8/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lq4/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq4/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq4/b;->b:Lq4/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final P(Lp4/l;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Lf8/i;->g(Lp4/l;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final Q(Lp4/l;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Lf8/i;->e(Lp4/l;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final R0(Lz4/d;Lp4/l;)V
    .locals 2

    .line 1
    move-object v0, p2

    .line 2
    check-cast v0, Lp4/b0;

    .line 3
    .line 4
    invoke-virtual {v0}, Lp4/b0;->m()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {p2, v1}, Lf8/i;->p0(Lp4/h;I)S

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    int-to-short v1, v0

    .line 14
    shr-int/lit8 v0, v0, 0x10

    .line 15
    .line 16
    int-to-short v0, v0

    .line 17
    invoke-virtual {p1, p2}, Lz4/d;->l(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lz4/d;->l(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lz4/d;->l(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final S(Lp4/h;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lp4/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p1, Lp4/h;->d:Lu4/p;

    .line 6
    .line 7
    iget-object p1, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length p1, p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public final j()I
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    return v0
.end method
