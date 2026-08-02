.class public final Lxs2;
.super Lt70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lxs2;

.field public static final e:Ljava/lang/String;

.field public static final f:Lhx2;

.field public static final g:Lhx2;

.field public static final h:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxs2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxs2;->d:Lxs2;

    .line 8
    .line 9
    const-string v0, "SnsSqliteDb"

    .line 10
    .line 11
    sput-object v0, Lxs2;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Lhn1;

    .line 14
    .line 15
    const/16 v1, 0x14

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

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
    sput-object v1, Lxs2;->f:Lhx2;

    .line 26
    .line 27
    new-instance v0, Lhn1;

    .line 28
    .line 29
    const/16 v1, 0x15

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

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
    sput-object v1, Lxs2;->g:Lhx2;

    .line 40
    .line 41
    new-instance v0, Lhn1;

    .line 42
    .line 43
    const/16 v1, 0x16

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

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
    sput-object v1, Lxs2;->h:Lhx2;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lvs2;->b:Lvs2;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p0, Lws2;->b:Lws2;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object p0, Lus2;->b:Lus2;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lxs2;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
