.class public final Lm7/m;
.super Lm7/o;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public q:Lm7/u;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lm7/b;-><init>(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lp7/b;->T(Lq7/b;)Lp7/b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lp7/a;->o:Lr7/f;

    .line 9
    .line 10
    iget v0, v0, Lr7/f;->n:I

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ll7/a;->T(Lq7/b;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-super {p0, p1}, Ll7/a;->B(Lq7/b;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lm7/m;

    .line 2
    .line 3
    if-ne p1, p0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object p1, p1, Lm7/m;->q:Lm7/u;

    .line 8
    .line 9
    iget p1, p1, Lk7/a;->g:I

    .line 10
    .line 11
    iget-object v0, p0, Lm7/m;->q:Lm7/u;

    .line 12
    .line 13
    iget v0, v0, Lk7/a;->g:I

    .line 14
    .line 15
    invoke-static {p1, v0}, Ly7/a;->e(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method
