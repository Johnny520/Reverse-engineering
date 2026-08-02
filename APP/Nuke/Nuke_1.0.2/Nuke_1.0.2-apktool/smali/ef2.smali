.class public final enum Lef2;
.super Ljava/lang/Enum;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final enum j:Lef2;

.field public static final enum k:Lef2;

.field public static final enum l:Lef2;

.field public static final enum m:Lef2;

.field public static final enum n:Lef2;

.field public static final synthetic o:[Lef2;


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lef2;

    .line 2
    .line 3
    const-string v1, "network"

    .line 4
    .line 5
    const-string v2, "NETWORK"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v1, v3, v3}, Lef2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lef2;->j:Lef2;

    .line 12
    .line 13
    new-instance v1, Lef2;

    .line 14
    .line 15
    const-string v2, "filesystem.external"

    .line 16
    .line 17
    const-string v4, "FILESYSTEM_EXTERNAL"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v2, v5, v3}, Lef2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lef2;->k:Lef2;

    .line 24
    .line 25
    new-instance v2, Lef2;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "host.reflect"

    .line 29
    .line 30
    const-string v6, "HOST_REFLECT"

    .line 31
    .line 32
    invoke-direct {v2, v6, v4, v3, v5}, Lef2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lef2;->l:Lef2;

    .line 36
    .line 37
    new-instance v3, Lef2;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v6, "host.hook"

    .line 41
    .line 42
    const-string v7, "HOST_HOOK"

    .line 43
    .line 44
    invoke-direct {v3, v7, v6, v4, v5}, Lef2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Lef2;->m:Lef2;

    .line 48
    .line 49
    new-instance v4, Lef2;

    .line 50
    .line 51
    const/4 v6, 0x4

    .line 52
    const-string v7, "filesystem.host"

    .line 53
    .line 54
    const-string v8, "FILESYSTEM_HOST"

    .line 55
    .line 56
    invoke-direct {v4, v8, v7, v6, v5}, Lef2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lef2;->n:Lef2;

    .line 60
    .line 61
    filled-new-array {v0, v1, v2, v3, v4}, [Lef2;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lef2;->o:[Lef2;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lef2;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p4, p0, Lef2;->i:Z

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lef2;
    .locals 1

    .line 1
    const-class v0, Lef2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lef2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lef2;
    .locals 1

    .line 1
    sget-object v0, Lef2;->o:[Lef2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lef2;

    .line 8
    .line 9
    return-object v0
.end method
