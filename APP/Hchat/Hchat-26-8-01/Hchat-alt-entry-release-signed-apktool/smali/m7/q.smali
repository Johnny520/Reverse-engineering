.class public abstract Lm7/q;
.super Lk7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk7/e;


# instance fields
.field public final k:Lk7/c;


# direct methods
.method public constructor <init>(Lk7/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lk7/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm7/q;->k:Lk7/c;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lk7/a;->J(Lk7/a;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Lk7/a;->H(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk7/a;->G(Lq7/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final C(Ljava/io/ByteArrayOutputStream;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final I(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk7/a;->I(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public L()Lm7/q;
    .locals 1

    .line 1
    const-class v0, Lm7/q;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm7/q;

    .line 8
    .line 9
    return-object v0
.end method

.method public abstract M()V
.end method

.method public abstract N()V
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lk7/e;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lm7/q;

    .line 6
    .line 7
    iget-object v1, p0, Lm7/q;->k:Lk7/c;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p1, Lm7/q;

    .line 12
    .line 13
    iget-object p1, p1, Lm7/q;->k:Lk7/c;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final p()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk7/c;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final r()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk7/c;->r()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk7/a;->y()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final z(Lf6/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lk7/c;->z(Lf6/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
