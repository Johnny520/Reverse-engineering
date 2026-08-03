.class public final Lcd/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbd/a;


# instance fields
.field public g:Li4/c0;

.field public h:I


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcd/b;->h:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcd/b;->g:Li4/c0;

    .line 6
    .line 7
    return-void
.end method

.method public final f(Lud/u;)Li4/c0;
    .locals 1

    .line 1
    iget v0, p0, Lcd/b;->h:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcd/b;->g:Li4/c0;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method

.method public final p(Lud/u;Li4/c0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcd/b;->h:I

    .line 6
    .line 7
    iput-object p2, p0, Lcd/b;->g:Li4/c0;

    .line 8
    .line 9
    return-void
.end method
