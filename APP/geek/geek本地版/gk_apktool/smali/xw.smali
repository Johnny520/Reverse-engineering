.class public final synthetic Lxw;
.super Ld8;

# interfaces
.implements Lhm;
.implements Lan;
.implements Lxp;


# instance fields
.field public final g:I

.field public final synthetic h:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 6

    .line 1
    iput p1, p0, Lxw;->h:I

    .line 2
    .line 3
    const-string v4, "updateEnabledCallbacks()V"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const-class v2, Landroidx/activity/a;

    .line 7
    .line 8
    const-string v3, "updateEnabledCallbacks"

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Ld8;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, v0, Lxw;->g:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lxw;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld8;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/activity/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/activity/a;->d()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lvh;->n:Lvh;

    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v0, p0, Ld8;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/activity/a;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/activity/a;->d()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lvh;->n:Lvh;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final d()Lxp;
    .locals 1

    .line 1
    sget-object v0, Lj00;->a:Lk00;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lxw;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lxw;

    .line 9
    .line 10
    iget-object v0, p0, Ld8;->d:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p1, Ld8;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, p0, Ld8;->e:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, Ld8;->e:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget v0, p0, Lxw;->g:I

    .line 31
    .line 32
    iget v1, p1, Lxw;->g:I

    .line 33
    .line 34
    if-ne v0, v1, :cond_3

    .line 35
    .line 36
    iget-object v0, p0, Ld8;->b:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v1, p1, Ld8;->b:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Ld8;->c()Lla;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1}, Ld8;->c()Lla;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    :goto_0
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    :cond_1
    instance-of v0, p1, Lxw;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, Ld8;->a:Lxp;

    .line 67
    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Lxw;->d()Lxp;

    .line 71
    .line 72
    .line 73
    iput-object p0, p0, Ld8;->a:Lxp;

    .line 74
    .line 75
    move-object v0, p0

    .line 76
    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1

    .line 81
    :cond_3
    const/4 p1, 0x0

    .line 82
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ld8;->c()Lla;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ld8;->c()Lla;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x1f

    .line 13
    .line 14
    mul-int/2addr v0, v1

    .line 15
    iget-object v2, p0, Ld8;->d:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v2, v0, v1}, Lz30;->e(Ljava/lang/String;II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Ld8;->e:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v1, v0

    .line 28
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Ld8;->a:Lxp;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lxw;->d()Lxp;

    .line 6
    .line 7
    .line 8
    iput-object p0, p0, Ld8;->a:Lxp;

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    :cond_0
    if-eq v0, p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_1
    const-string v0, "<init>"

    .line 19
    .line 20
    iget-object v1, p0, Ld8;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    const-string v0, "constructor (Kotlin reflection is not available)"

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    const-string v0, "function "

    .line 32
    .line 33
    const-string v2, " (Kotlin reflection is not available)"

    .line 34
    .line 35
    invoke-static {v0, v1, v2}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method
