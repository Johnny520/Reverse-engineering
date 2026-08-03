.class public final synthetic Lg1/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lg1/j;
.implements Li/v;
.implements Li0/f;
.implements Lm8/b;


# static fields
.field public static final synthetic h:I


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg1/d;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Li8/i;I)V
    .locals 0

    .line 7
    iput p2, p0, Lg1/d;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Object;J)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p0, " \u8d85\u8fc7 "

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " KiB"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public static synthetic e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "expected type "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " but found "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, Li4/b0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public static synthetic f(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static synthetic g(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public static synthetic h(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Li8/i;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(F)F
    .locals 2

    .line 1
    iget v0, p0, Lg1/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return p1

    .line 7
    :pswitch_0
    const v0, 0x3eba2e8c

    .line 8
    .line 9
    .line 10
    cmpg-float v0, p1, v0

    .line 11
    .line 12
    const/high16 v1, 0x40f20000    # 7.5625f

    .line 13
    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    mul-float/2addr v1, p1

    .line 17
    mul-float/2addr v1, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const v0, 0x3f3a2e8c

    .line 20
    .line 21
    .line 22
    cmpg-float v0, p1, v0

    .line 23
    .line 24
    if-gez v0, :cond_1

    .line 25
    .line 26
    const v0, 0x3f0ba2e9

    .line 27
    .line 28
    .line 29
    sub-float/2addr p1, v0

    .line 30
    mul-float/2addr v1, p1

    .line 31
    mul-float/2addr v1, p1

    .line 32
    const/high16 p1, 0x3f400000    # 0.75f

    .line 33
    .line 34
    :goto_0
    add-float/2addr v1, p1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const v0, 0x3f68ba2f

    .line 37
    .line 38
    .line 39
    cmpg-float v0, p1, v0

    .line 40
    .line 41
    if-gez v0, :cond_2

    .line 42
    .line 43
    const v0, 0x3f51745d

    .line 44
    .line 45
    .line 46
    sub-float/2addr p1, v0

    .line 47
    mul-float/2addr v1, p1

    .line 48
    mul-float/2addr v1, p1

    .line 49
    const/high16 p1, 0x3f700000    # 0.9375f

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const v0, 0x3f745d17

    .line 53
    .line 54
    .line 55
    sub-float/2addr p1, v0

    .line 56
    mul-float/2addr v1, p1

    .line 57
    mul-float/2addr v1, p1

    .line 58
    const/high16 p1, 0x3f7c0000    # 0.984375f

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :goto_1
    return v1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public c(D)D
    .locals 1

    .line 1
    iget v0, p0, Lg1/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-wide p1

    .line 7
    :pswitch_0
    sget-object v0, Lg1/e;->a:[F

    .line 8
    .line 9
    sget-object v0, Lg1/e;->d:Lg1/s;

    .line 10
    .line 11
    invoke-static {v0, p1, p2}, Lg1/e;->c(Lg1/s;D)D

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    return-wide p1

    .line 16
    :pswitch_1
    sget-object v0, Lg1/e;->a:[F

    .line 17
    .line 18
    sget-object v0, Lg1/e;->d:Lg1/s;

    .line 19
    .line 20
    invoke-static {v0, p1, p2}, Lg1/e;->d(Lg1/s;D)D

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    return-wide p1

    .line 25
    :pswitch_2
    sget-object v0, Lg1/e;->a:[F

    .line 26
    .line 27
    sget-object v0, Lg1/e;->c:Lg1/s;

    .line 28
    .line 29
    invoke-static {v0, p1, p2}, Lg1/e;->a(Lg1/s;D)D

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    return-wide p1

    .line 34
    :pswitch_3
    sget-object v0, Lg1/e;->a:[F

    .line 35
    .line 36
    sget-object v0, Lg1/e;->c:Lg1/s;

    .line 37
    .line 38
    invoke-static {v0, p1, p2}, Lg1/e;->b(Lg1/s;D)D

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    return-wide p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public cancel()V
    .locals 0

    .line 1
    return-void
.end method
