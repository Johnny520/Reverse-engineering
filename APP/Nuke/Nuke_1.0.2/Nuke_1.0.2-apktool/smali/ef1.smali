.class public final Lef1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lo63;

.field public final synthetic i:Lkw;


# direct methods
.method public constructor <init>(Lo63;Lkw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lef1;->h:Lo63;

    .line 5
    .line 6
    iput-object p2, p0, Lef1;->i:Lkw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v2

    .line 19
    :goto_0
    and-int/2addr p2, v3

    .line 20
    check-cast p1, Lgo0;

    .line 21
    .line 22
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    iget-object p2, p0, Lef1;->h:Lo63;

    .line 29
    .line 30
    iget-object p2, p2, Lo63;->j:Lm13;

    .line 31
    .line 32
    iget-object p0, p0, Lef1;->i:Lkw;

    .line 33
    .line 34
    invoke-static {p2, p0, p1, v2}, Lv03;->a(Lm13;Lkw;Lpx;I)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-virtual {p1}, Lgo0;->R()V

    .line 39
    .line 40
    .line 41
    :goto_1
    sget-object p0, La83;->a:La83;

    .line 42
    .line 43
    return-object p0
.end method
