.class public final Lv00;
.super Lt70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Lv00;

.field public static final e:Ljava/lang/String;

.field public static final f:Lhx2;

.field public static final g:Lhx2;

.field public static final h:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lv00;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv00;->d:Lv00;

    .line 8
    .line 9
    const-string v0, "ConversationStorage"

    .line 10
    .line 11
    sput-object v0, Lv00;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ldy;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v0, v1}, Ldy;-><init>(I)V

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
    sput-object v1, Lv00;->f:Lhx2;

    .line 25
    .line 26
    new-instance v0, Ldy;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, v1}, Ldy;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lhx2;

    .line 33
    .line 34
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lv00;->g:Lhx2;

    .line 38
    .line 39
    new-instance v0, Ldy;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    invoke-direct {v0, v1}, Ldy;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lhx2;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 48
    .line 49
    .line 50
    sput-object v1, Lv00;->h:Lhx2;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lhe;->f:Lhe;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p0, Lhe;->e:Lhe;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lv00;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
