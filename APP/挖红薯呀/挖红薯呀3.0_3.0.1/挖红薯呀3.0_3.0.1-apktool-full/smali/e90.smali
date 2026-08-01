.class public abstract Le90;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lv80;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v5, Ld90;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v5, v0}, Ld90;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lfs;->d:Lfs;

    .line 8
    .line 9
    invoke-static {v1}, Lp30;->e(Lpk;)Lhk;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    invoke-static {}, Li4;->d()Lzm;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    const/16 v1, 0xf

    .line 18
    .line 19
    invoke-static {v0, v0, v1}, Lqj;->b(III)J

    .line 20
    .line 21
    .line 22
    move-result-wide v10

    .line 23
    new-instance v0, Lv80;

    .line 24
    .line 25
    const/16 v17, 0x0

    .line 26
    .line 27
    const/16 v18, 0x0

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    sget-object v12, Lhs;->d:Lhs;

    .line 36
    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    sget-object v16, Lum0;->d:Lum0;

    .line 41
    .line 42
    invoke-direct/range {v0 .. v18}, Lv80;-><init>(Lw80;IZFLyd0;FZLyk;Lym;JLjava/util/List;IIILum0;II)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Le90;->a:Lv80;

    .line 46
    .line 47
    return-void
.end method

.method public static final a(Lji;)Lc90;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    sget-object v2, Lc90;->x:Ld;

    .line 5
    .line 6
    move-object v3, p0

    .line 7
    check-cast v3, Lpi;

    .line 8
    .line 9
    invoke-virtual {v3, v0}, Lpi;->d(I)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    move-object v4, p0

    .line 14
    check-cast v4, Lpi;

    .line 15
    .line 16
    invoke-virtual {v4, v0}, Lpi;->d(I)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    or-int/2addr v3, v4

    .line 21
    check-cast p0, Lpi;

    .line 22
    .line 23
    invoke-virtual {p0}, Lpi;->L()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    sget-object v3, Lii;->a:Lr3;

    .line 30
    .line 31
    if-ne v4, v3, :cond_1

    .line 32
    .line 33
    :cond_0
    new-instance v4, La00;

    .line 34
    .line 35
    const/16 v3, 0xa

    .line 36
    .line 37
    invoke-direct {v4, v3}, La00;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v4}, Lpi;->g0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    check-cast v4, Lhw;

    .line 44
    .line 45
    invoke-static {v1, v2, v4, p0, v0}, Lr60;->y([Ljava/lang/Object;Lqx0;Lhw;Lji;I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lc90;

    .line 50
    .line 51
    return-object p0
.end method
