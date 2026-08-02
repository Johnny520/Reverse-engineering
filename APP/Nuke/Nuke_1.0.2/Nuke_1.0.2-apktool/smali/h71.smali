.class public final Lh71;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lox1;


# instance fields
.field public v:F

.field public w:Z


# virtual methods
.method public final q0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lmb2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lmb2;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    new-instance p1, Lmb2;

    .line 12
    .line 13
    invoke-direct {p1}, Lmb2;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget v0, p0, Lh71;->v:F

    .line 17
    .line 18
    iput v0, p1, Lmb2;->a:F

    .line 19
    .line 20
    iget-boolean p0, p0, Lh71;->w:Z

    .line 21
    .line 22
    iput-boolean p0, p1, Lmb2;->b:Z

    .line 23
    .line 24
    return-object p1
.end method
