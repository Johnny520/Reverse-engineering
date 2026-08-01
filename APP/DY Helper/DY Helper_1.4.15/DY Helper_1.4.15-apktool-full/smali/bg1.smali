.class public final enum Lbg1;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum ζ:Lbg1;

.field public static final enum η:Lbg1;

.field public static final enum θ:Lbg1;

.field public static final enum ι:Lbg1;

.field public static final enum κ:Lbg1;

.field public static final enum λ:Lbg1;

.field public static final synthetic μ:[Lbg1;


# instance fields
.field public final ε:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lbg1;

    .line 2
    .line 3
    const-string v1, "PRECONDITION"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lbg1;-><init>(Ljava/lang/String;IZ)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lbg1;->ζ:Lbg1;

    .line 10
    .line 11
    new-instance v1, Lbg1;

    .line 12
    .line 13
    const-string v3, "SOURCE_UNAVAILABLE"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4, v2}, Lbg1;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lbg1;->η:Lbg1;

    .line 20
    .line 21
    move v3, v2

    .line 22
    new-instance v2, Lbg1;

    .line 23
    .line 24
    const-string v5, "HOST_NOT_READY"

    .line 25
    .line 26
    const/4 v6, 0x2

    .line 27
    invoke-direct {v2, v5, v6, v4}, Lbg1;-><init>(Ljava/lang/String;IZ)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lbg1;->θ:Lbg1;

    .line 31
    .line 32
    move v5, v3

    .line 33
    new-instance v3, Lbg1;

    .line 34
    .line 35
    const-string v6, "HOST_CALL_FAILED"

    .line 36
    .line 37
    const/4 v7, 0x3

    .line 38
    invoke-direct {v3, v6, v7, v4}, Lbg1;-><init>(Ljava/lang/String;IZ)V

    .line 39
    .line 40
    .line 41
    sput-object v3, Lbg1;->ι:Lbg1;

    .line 42
    .line 43
    move v6, v4

    .line 44
    new-instance v4, Lbg1;

    .line 45
    .line 46
    const-string v7, "CALLBACK_TIMEOUT"

    .line 47
    .line 48
    const/4 v8, 0x4

    .line 49
    invoke-direct {v4, v7, v8, v6}, Lbg1;-><init>(Ljava/lang/String;IZ)V

    .line 50
    .line 51
    .line 52
    sput-object v4, Lbg1;->κ:Lbg1;

    .line 53
    .line 54
    move v6, v5

    .line 55
    new-instance v5, Lbg1;

    .line 56
    .line 57
    const-string v7, "CONTRACT_INCOMPATIBLE"

    .line 58
    .line 59
    const/4 v8, 0x5

    .line 60
    invoke-direct {v5, v7, v8, v6}, Lbg1;-><init>(Ljava/lang/String;IZ)V

    .line 61
    .line 62
    .line 63
    sput-object v5, Lbg1;->λ:Lbg1;

    .line 64
    .line 65
    filled-new-array/range {v0 .. v5}, [Lbg1;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lbg1;->μ:[Lbg1;

    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lbg1;->ε:Z

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbg1;
    .locals 1

    .line 1
    const-class v0, Lbg1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbg1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lbg1;
    .locals 1

    .line 1
    sget-object v0, Lbg1;->μ:[Lbg1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lbg1;

    .line 8
    .line 9
    return-object v0
.end method
