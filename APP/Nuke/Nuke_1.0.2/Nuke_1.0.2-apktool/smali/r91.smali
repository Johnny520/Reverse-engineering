.class public final Lr91;
.super Lt70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lr91;

.field public static final e:Ljava/lang/String;

.field public static final f:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr91;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr91;->d:Lr91;

    .line 8
    .line 9
    const-string v0, "LegacyPreference"

    .line 10
    .line 11
    sput-object v0, Lr91;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ln31;

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-direct {v0, v1}, Ln31;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lhx2;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lr91;->f:Lhx2;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lq91;->b:Lq91;

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
    sget-object p0, Lr91;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
