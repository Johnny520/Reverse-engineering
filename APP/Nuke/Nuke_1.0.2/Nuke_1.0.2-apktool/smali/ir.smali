.class public final enum Lir;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lir;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Lhr;

.field public static final h:Lj71;

.field public static final enum i:Lir;

.field public static final enum j:Lir;

.field public static final synthetic k:[Lir;

.field public static final synthetic l:Lyf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lir;

    .line 2
    .line 3
    const-string v1, "TEXT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lir;->i:Lir;

    .line 10
    .line 11
    new-instance v1, Lir;

    .line 12
    .line 13
    const-string v2, "IMAGE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lir;

    .line 20
    .line 21
    const-string v3, "VOICE"

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lir;->j:Lir;

    .line 28
    .line 29
    filled-new-array {v0, v1, v2}, [Lir;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lir;->k:[Lir;

    .line 34
    .line 35
    new-instance v1, Lyf0;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lyf0;-><init>([Ljava/lang/Enum;)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Lir;->l:Lyf0;

    .line 41
    .line 42
    new-instance v0, Lhr;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lir;->Companion:Lhr;

    .line 48
    .line 49
    new-instance v0, Lc0;

    .line 50
    .line 51
    const/16 v1, 0x15

    .line 52
    .line 53
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 54
    .line 55
    .line 56
    sget-object v1, Li91;->h:Li91;

    .line 57
    .line 58
    invoke-static {v1, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lir;->h:Lj71;

    .line 63
    .line 64
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lir;
    .locals 1

    .line 1
    const-class v0, Lir;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lir;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lir;
    .locals 1

    .line 1
    sget-object v0, Lir;->k:[Lir;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lir;

    .line 8
    .line 9
    return-object v0
.end method
