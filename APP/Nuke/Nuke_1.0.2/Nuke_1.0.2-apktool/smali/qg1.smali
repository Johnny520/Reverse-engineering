.class public final Lqg1;
.super Lt70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lqg1;

.field public static final e:Ljava/lang/String;

.field public static final f:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqg1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lqg1;->d:Lqg1;

    .line 8
    .line 9
    const-string v0, "StorageFeatureService"

    .line 10
    .line 11
    sput-object v0, Lqg1;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ln31;

    .line 14
    .line 15
    const/16 v1, 0xd

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ln31;-><init>(I)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lhx2;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lqg1;->f:Lhx2;

    .line 26
    .line 27
    return-void
.end method

.method public static j()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lhp2;->d:Lhp2;

    .line 2
    .line 3
    sget-object v1, Lpg1;->b:Lpg1;

    .line 4
    .line 5
    invoke-virtual {v1}, Lv70;->d()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lhp2;->j(Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, v0, Lsg1;->l:Ljava/lang/Integer;

    .line 30
    .line 31
    sget-object v2, Lv00;->d:Lv00;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v2, Lv00;->f:Lhx2;

    .line 37
    .line 38
    invoke-virtual {v2}, Lhx2;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast v2, Ljava/lang/Class;

    .line 46
    .line 47
    iput-object v2, v0, Lsg1;->C:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Lzg1;

    .line 58
    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lzg1;->g0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lpg1;->b:Lpg1;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lqg1;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
