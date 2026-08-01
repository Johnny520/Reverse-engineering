.class public final enum Lou0;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final η:Lrk0;

.field public static final enum θ:Lou0;

.field public static final synthetic ι:[Lou0;


# instance fields
.field public final ε:I

.field public final ζ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lou0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "\u517c\u5bb9\u6a21\u5f0f"

    .line 5
    .line 6
    const-string v3, "COMPATIBLE"

    .line 7
    .line 8
    invoke-direct {v0, v1, v1, v3, v2}, Lou0;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lou0;->θ:Lou0;

    .line 12
    .line 13
    new-instance v1, Lou0;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "\u5c0f\u7c73\u683c\u5f0f"

    .line 17
    .line 18
    const-string v4, "XIAOMI"

    .line 19
    .line 20
    invoke-direct {v1, v2, v2, v4, v3}, Lou0;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lou0;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    const-string v4, "OPPO/\u4e00\u52a0\u683c\u5f0f"

    .line 27
    .line 28
    const-string v5, "OPPO"

    .line 29
    .line 30
    invoke-direct {v2, v3, v3, v5, v4}, Lou0;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2}, [Lou0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lou0;->ι:[Lou0;

    .line 38
    .line 39
    new-instance v0, Lrk0;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {v0, v1}, Lrk0;-><init>(I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lou0;->η:Lrk0;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lou0;->ε:I

    .line 5
    .line 6
    iput-object p4, p0, Lou0;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lou0;
    .locals 1

    .line 1
    const-class v0, Lou0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lou0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lou0;
    .locals 1

    .line 1
    sget-object v0, Lou0;->ι:[Lou0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lou0;

    .line 8
    .line 9
    return-object v0
.end method
