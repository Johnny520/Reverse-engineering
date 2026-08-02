.class public final Lbn1;
.super Lt70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lbn1;

.field public static final e:Ljava/lang/String;

.field public static final f:Lhx2;

.field public static final g:Lhx2;

.field public static final h:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbn1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lbn1;->d:Lbn1;

    .line 8
    .line 9
    const-string v0, "NetSceneQueue"

    .line 10
    .line 11
    sput-object v0, Lbn1;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ln31;

    .line 14
    .line 15
    const/16 v1, 0x18

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
    sput-object v1, Lbn1;->f:Lhx2;

    .line 26
    .line 27
    new-instance v0, Ln31;

    .line 28
    .line 29
    const/16 v1, 0x19

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ln31;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lhx2;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 37
    .line 38
    .line 39
    sput-object v1, Lbn1;->g:Lhx2;

    .line 40
    .line 41
    new-instance v0, Ln31;

    .line 42
    .line 43
    const/16 v1, 0x1a

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ln31;-><init>(I)V

    .line 46
    .line 47
    .line 48
    new-instance v1, Lhx2;

    .line 49
    .line 50
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 51
    .line 52
    .line 53
    sput-object v1, Lbn1;->h:Lhx2;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lan1;->b:Lan1;

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
    sget-object p0, Lbn1;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
