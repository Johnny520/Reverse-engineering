.class public final Lp4/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:I

.field public final h:I

.field public final i:Lu4/o;

.field public final j:Lv4/d0;


# direct methods
.method public constructor <init>(IILu4/o;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-ltz p1, :cond_2

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p3, Lu4/o;->i:Lu4/k;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lp4/n;->g:I

    .line 13
    .line 14
    iput p2, p0, Lp4/n;->h:I

    .line 15
    .line 16
    iput-object p3, p0, Lp4/n;->i:Lu4/o;

    .line 17
    .line 18
    iget-object p1, p3, Lu4/o;->h:Lw4/d;

    .line 19
    .line 20
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lp4/n;->j:Lv4/d0;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 32
    .line 33
    const-string p2, "spec.getLocalItem() == null"

    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 39
    :catch_0
    const-string p1, "spec == null"

    .line 40
    .line 41
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    throw p1

    .line 46
    :cond_1
    const-string p1, "disposition == null"

    .line 47
    .line 48
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    throw p1

    .line 53
    :cond_2
    const-string p1, "address < 0"

    .line 54
    .line 55
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    throw p1
.end method


# virtual methods
.method public final a(Lp4/n;)I
    .locals 4

    .line 1
    iget v0, p1, Lp4/n;->g:I

    .line 2
    .line 3
    iget v1, p0, Lp4/n;->g:I

    .line 4
    .line 5
    if-ge v1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    const/4 v2, 0x1

    .line 9
    if-le v1, v0, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    iget v0, p0, Lp4/n;->h:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-ne v0, v2, :cond_2

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_2
    move v0, v1

    .line 20
    :goto_0
    iget v3, p1, Lp4/n;->h:I

    .line 21
    .line 22
    if-ne v3, v2, :cond_3

    .line 23
    .line 24
    move v1, v2

    .line 25
    :cond_3
    if-eq v0, v1, :cond_5

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    :goto_1
    return v2

    .line 30
    :cond_4
    :goto_2
    const/4 p1, -0x1

    .line 31
    return p1

    .line 32
    :cond_5
    iget-object v0, p0, Lp4/n;->i:Lu4/o;

    .line 33
    .line 34
    iget-object p1, p1, Lp4/n;->i:Lu4/o;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lu4/o;->d(Lu4/o;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public final b()Lv4/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/n;->i:Lu4/o;

    .line 2
    .line 3
    iget-object v0, v0, Lu4/o;->i:Lu4/k;

    .line 4
    .line 5
    iget-object v0, v0, Lu4/k;->h:Lv4/c0;

    .line 6
    .line 7
    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lp4/n;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lp4/n;->a(Lp4/n;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lp4/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lp4/n;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lp4/n;->a(Lp4/n;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lp4/n;->g:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v2, p0, Lp4/n;->h:I

    .line 21
    .line 22
    packed-switch v2, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    const-string v2, "null"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_0
    const-string v2, "END_CLOBBERED_BY_NEXT"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_1
    const-string v2, "END_CLOBBERED_BY_PREV"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_2
    const-string v2, "END_MOVED"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :pswitch_3
    const-string v2, "END_REPLACED"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_4
    const-string v2, "END_SIMPLY"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_5
    const-string v2, "START"

    .line 44
    .line 45
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lp4/n;->i:Lu4/o;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    return-object v0

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
