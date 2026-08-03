.class public abstract Lp4/l;
.super Lp4/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lp4/j;Lu4/t;Lu4/p;)V
    .locals 1

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lp4/l;->e:I

    invoke-direct {p0, p1, p2, p3}, Lp4/h;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    return-void
.end method

.method public constructor <init>(Lu4/t;Lu4/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lp4/l;->e:I

    .line 3
    .line 4
    sget-object v0, Lp4/k;->b:Lp4/j;

    .line 5
    .line 6
    invoke-direct {p0, v0, p1, p2}, Lp4/h;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/h;->b:Lp4/j;

    .line 2
    .line 3
    iget-object v0, v0, Lp4/j;->d:Lf8/i;

    .line 4
    .line 5
    invoke-virtual {v0}, Lf8/i;->j()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lp4/h;->b:Lp4/j;

    .line 2
    .line 3
    iget-object v1, v0, Lp4/j;->d:Lf8/i;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lp4/j;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v1, p0}, Lf8/i;->P(Lp4/l;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v1, p0}, Lf8/i;->Q(Lp4/l;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v3, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const/16 v4, 0x64

    .line 23
    .line 24
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const/16 v0, 0x20

    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    const-string v0, " // "

    .line 51
    .line 52
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public i(Lp4/j;)Lp4/h;
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v0, "unsupported"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final j(I)Lp4/h;
    .locals 1

    .line 1
    iget v0, p0, Lp4/l;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp4/h;->d:Lu4/p;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lu4/p;->s(I)Lu4/p;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lp4/h;->k(Lu4/p;)Lp4/h;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_0
    iget-object v0, p0, Lp4/h;->d:Lu4/p;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lu4/p;->s(I)Lu4/p;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Lp4/h;->k(Lu4/p;)Lp4/h;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lz4/d;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/h;->b:Lp4/j;

    .line 2
    .line 3
    iget-object v0, v0, Lp4/j;->d:Lf8/i;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p0}, Lf8/i;->R0(Lz4/d;Lp4/l;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
