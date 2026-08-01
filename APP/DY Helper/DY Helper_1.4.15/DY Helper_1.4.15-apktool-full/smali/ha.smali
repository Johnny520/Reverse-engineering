.class final Lha;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final α:La80;


# direct methods
.method public constructor <init>(La80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lha;->α:La80;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lha;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lha;

    .line 12
    .line 13
    iget-object p1, p1, Lha;->α:La80;

    .line 14
    .line 15
    iget-object p0, p0, Lha;->α:La80;

    .line 16
    .line 17
    if-eq p0, p1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lha;->α:La80;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final δ()Lq01;
    .locals 1

    .line 1
    new-instance v0, Lia;

    .line 2
    .line 3
    iget-object p0, p0, Lha;->α:La80;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lia;-><init>(La80;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 1

    .line 1
    check-cast p1, Lia;

    .line 2
    .line 3
    iget-object p0, p0, Lha;->α:La80;

    .line 4
    .line 5
    iput-object p0, p1, Lia;->τ:La80;

    .line 6
    .line 7
    iget-object v0, p1, Lq01;->ε:Lq01;

    .line 8
    .line 9
    iget-boolean v0, v0, Lq01;->σ:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x2

    .line 15
    invoke-static {p1, v0}, Lh62;->ф(Lur;I)Lq31;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p1, p1, Lq31;->τ:Lq31;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p1, p0, v0}, Lq31;->ｐ(La80;Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method
