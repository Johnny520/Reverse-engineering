.class public final enum Lgr;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgr;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Lfr;

.field public static final h:Lj71;

.field public static final enum i:Lgr;

.field public static final enum j:Lgr;

.field public static final enum k:Lgr;

.field public static final synthetic l:[Lgr;

.field public static final synthetic m:Lyf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lgr;

    .line 2
    .line 3
    const-string v1, "CONTAINS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lgr;->i:Lgr;

    .line 10
    .line 11
    new-instance v1, Lgr;

    .line 12
    .line 13
    const-string v2, "EXACT"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lgr;->j:Lgr;

    .line 20
    .line 21
    new-instance v2, Lgr;

    .line 22
    .line 23
    const-string v3, "REGEX"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lgr;->k:Lgr;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lgr;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lgr;->l:[Lgr;

    .line 36
    .line 37
    new-instance v1, Lyf0;

    .line 38
    .line 39
    invoke-direct {v1, v0}, Lyf0;-><init>([Ljava/lang/Enum;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, Lgr;->m:Lyf0;

    .line 43
    .line 44
    new-instance v0, Lfr;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lgr;->Companion:Lfr;

    .line 50
    .line 51
    new-instance v0, Lc0;

    .line 52
    .line 53
    const/16 v1, 0x14

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Li91;->h:Li91;

    .line 59
    .line 60
    invoke-static {v1, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lgr;->h:Lj71;

    .line 65
    .line 66
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgr;
    .locals 1

    .line 1
    const-class v0, Lgr;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgr;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lgr;
    .locals 1

    .line 1
    sget-object v0, Lgr;->l:[Lgr;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lgr;

    .line 8
    .line 9
    return-object v0
.end method
