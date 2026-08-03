.class public final Lfh/m;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lfh/a;


# direct methods
.method public static k0(Lfh/m;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lfh/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-virtual {v0, v1, p1}, Lfh/a;->m0(ILjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lfh/m;->g:Lfh/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final G(Lg6/b;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lfh/m;->g:Lfh/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lfh/a;->G(Lg6/b;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    const/4 v2, 0x2

    .line 13
    invoke-virtual {p1, v2}, Lg6/b;->n(I)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {p1, v2, v0}, Lg6/b;->c(II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1, v1}, Lg6/b;->c(II)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 28
    .line 29
    .line 30
    return v0
.end method
