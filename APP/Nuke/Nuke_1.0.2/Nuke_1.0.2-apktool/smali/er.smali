.class public final enum Ler;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ler;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Ldr;

.field public static final h:Lj71;

.field public static final enum i:Ler;

.field public static final enum j:Ler;

.field public static final synthetic k:[Ler;

.field public static final synthetic l:Lyf0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ler;

    .line 2
    .line 3
    const-string v1, "BLACKLIST"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ler;->i:Ler;

    .line 10
    .line 11
    new-instance v1, Ler;

    .line 12
    .line 13
    const-string v2, "WHITELIST"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ler;->j:Ler;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ler;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ler;->k:[Ler;

    .line 26
    .line 27
    new-instance v1, Lyf0;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lyf0;-><init>([Ljava/lang/Enum;)V

    .line 30
    .line 31
    .line 32
    sput-object v1, Ler;->l:Lyf0;

    .line 33
    .line 34
    new-instance v0, Ldr;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ler;->Companion:Ldr;

    .line 40
    .line 41
    new-instance v0, Lc0;

    .line 42
    .line 43
    const/16 v1, 0x13

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lc0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Li91;->h:Li91;

    .line 49
    .line 50
    invoke-static {v1, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Ler;->h:Lj71;

    .line 55
    .line 56
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ler;
    .locals 1

    .line 1
    const-class v0, Ler;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ler;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ler;
    .locals 1

    .line 1
    sget-object v0, Ler;->k:[Ler;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ler;

    .line 8
    .line 9
    return-object v0
.end method
