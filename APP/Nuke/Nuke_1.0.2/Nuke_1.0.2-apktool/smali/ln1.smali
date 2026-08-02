.class public final Lln1;
.super Lt70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lln1;

.field public static final e:Ljava/lang/String;

.field public static final f:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lln1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lln1;->d:Lln1;

    .line 8
    .line 9
    const-string v0, "NetSceneTypingSend"

    .line 10
    .line 11
    sput-object v0, Lln1;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Lhn1;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lhx2;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lln1;->f:Lhx2;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lkn1;->b:Lkn1;

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
    sget-object p0, Lln1;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
