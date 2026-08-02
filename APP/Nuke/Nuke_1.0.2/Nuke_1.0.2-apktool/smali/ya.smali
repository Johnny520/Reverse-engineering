.class public final synthetic Lya;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lza3;

.field public final synthetic i:J

.field public final synthetic j:Z

.field public final synthetic k:Luh1;

.field public final synthetic l:Lws1;


# direct methods
.method public synthetic constructor <init>(Lza3;JZLuh1;Lws1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lya;->h:Lza3;

    .line 5
    .line 6
    iput-wide p2, p0, Lya;->i:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lya;->j:Z

    .line 9
    .line 10
    iput-object p5, p0, Lya;->k:Luh1;

    .line 11
    .line 12
    iput-object p6, p0, Lya;->l:Lws1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

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
    const/4 v2, 0x1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    and-int/2addr p2, v2

    .line 19
    check-cast p1, Lgo0;

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    sget-object p2, Lly;->t:Ltu2;

    .line 28
    .line 29
    iget-object v0, p0, Lya;->h:Lza3;

    .line 30
    .line 31
    invoke-virtual {p2, v0}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    new-instance v0, Lab;

    .line 36
    .line 37
    iget-wide v1, p0, Lya;->i:J

    .line 38
    .line 39
    iget-boolean v3, p0, Lya;->j:Z

    .line 40
    .line 41
    iget-object v4, p0, Lya;->k:Luh1;

    .line 42
    .line 43
    iget-object v5, p0, Lya;->l:Lws1;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v5}, Lab;-><init>(JZLuh1;Lws1;)V

    .line 46
    .line 47
    .line 48
    const p0, 0x4b1ac501    # 1.0142977E7f

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0, p1}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const/16 v0, 0x38

    .line 56
    .line 57
    invoke-static {p2, p0, p1, v0}, Lci0;->a(Lf42;Lkw;Lpx;I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {p1}, Lgo0;->R()V

    .line 62
    .line 63
    .line 64
    :goto_1
    sget-object p0, La83;->a:La83;

    .line 65
    .line 66
    return-object p0
.end method
