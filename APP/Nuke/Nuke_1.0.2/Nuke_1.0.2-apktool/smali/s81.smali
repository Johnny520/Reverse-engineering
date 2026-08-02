.class public final Ls81;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Le9;


# direct methods
.method public constructor <init>(Lin0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le9;

    .line 5
    .line 6
    invoke-direct {v0}, Le9;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ls81;->a:Le9;

    .line 10
    .line 11
    invoke-interface {p1, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static a(Ls81;Ljava/lang/String;Lkw;I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p1, v1

    .line 7
    :cond_0
    iget-object p0, p0, Ls81;->a:Le9;

    .line 8
    .line 9
    new-instance p3, Lb5;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    new-instance v1, Lv;

    .line 14
    .line 15
    const/16 v2, 0xd

    .line 16
    .line 17
    invoke-direct {v1, v2, p1}, Lv;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    new-instance p1, Lnx0;

    .line 21
    .line 22
    const/16 v2, 0xb

    .line 23
    .line 24
    invoke-direct {p1, v2}, Lnx0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lw9;

    .line 28
    .line 29
    invoke-direct {v2, v0, p2}, Lw9;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    new-instance p2, Lkw;

    .line 33
    .line 34
    const v3, -0x331bf287

    .line 35
    .line 36
    .line 37
    invoke-direct {p2, v3, v0, v2}, Lkw;-><init>(IZLun0;)V

    .line 38
    .line 39
    .line 40
    const/16 v2, 0x13

    .line 41
    .line 42
    invoke-direct {p3, v1, p1, p2, v2}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0, p3}, Le9;->b(ILb5;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final b(ILin0;Lin0;Lkw;)V
    .locals 2

    .line 1
    new-instance v0, Lb5;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, p2, p3, p4, v1}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ls81;->a:Le9;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Le9;->b(ILb5;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
