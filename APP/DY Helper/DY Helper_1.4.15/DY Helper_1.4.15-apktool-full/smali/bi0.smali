.class public final enum Lbi0;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum θ:Lbi0;

.field public static final enum ι:Lbi0;

.field public static final enum κ:Lbi0;

.field public static final enum λ:Lbi0;

.field public static final synthetic μ:[Lbi0;


# instance fields
.field public final ε:Lkx;

.field public final ζ:Ljava/lang/String;

.field public final η:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lbi0;

    .line 2
    .line 3
    const-string v4, "IConversationListModel \u5165\u53e3"

    .line 4
    .line 5
    const/16 v5, 0x1f40

    .line 6
    .line 7
    const-string v1, "MODEL_PROVIDER"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    sget-object v3, Lkx;->Б:Lkx;

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lbi0;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lbi0;->θ:Lbi0;

    .line 16
    .line 17
    new-instance v1, Lbi0;

    .line 18
    .line 19
    const-string v5, "\u5168\u91cf\u4f1a\u8bdd\u8bfb\u53d6\u65b9\u6cd5"

    .line 20
    .line 21
    const/16 v6, 0x2328

    .line 22
    .line 23
    const-string v2, "ALL_CONVERSATION"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    sget-object v4, Lkx;->В:Lkx;

    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lbi0;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lbi0;->ι:Lbi0;

    .line 32
    .line 33
    new-instance v2, Lbi0;

    .line 34
    .line 35
    const-string v6, "\u4f1a\u8bdd\u52a0\u8f7d\u89e6\u53d1\u65b9\u6cd5"

    .line 36
    .line 37
    const/16 v7, 0x2328

    .line 38
    .line 39
    const-string v3, "LOAD_TRIGGER"

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    sget-object v5, Lkx;->Г:Lkx;

    .line 43
    .line 44
    invoke-direct/range {v2 .. v7}, Lbi0;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sput-object v2, Lbi0;->κ:Lbi0;

    .line 48
    .line 49
    new-instance v3, Lbi0;

    .line 50
    .line 51
    const-string v7, "\u5f53\u524d UID \u63d0\u4f9b\u65b9\u6cd5"

    .line 52
    .line 53
    const/16 v8, 0x2134

    .line 54
    .line 55
    const-string v4, "CURRENT_UID_PROVIDER"

    .line 56
    .line 57
    const/4 v5, 0x3

    .line 58
    sget-object v6, Lkx;->Е:Lkx;

    .line 59
    .line 60
    invoke-direct/range {v3 .. v8}, Lbi0;-><init>(Ljava/lang/String;ILkx;Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    sput-object v3, Lbi0;->λ:Lbi0;

    .line 64
    .line 65
    filled-new-array {v0, v1, v2, v3}, [Lbi0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, Lbi0;->μ:[Lbi0;

    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILkx;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lbi0;->ε:Lkx;

    .line 5
    .line 6
    iput-object p4, p0, Lbi0;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput p5, p0, Lbi0;->η:I

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbi0;
    .locals 1

    .line 1
    const-class v0, Lbi0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbi0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lbi0;
    .locals 1

    .line 1
    sget-object v0, Lbi0;->μ:[Lbi0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lbi0;

    .line 8
    .line 9
    return-object v0
.end method
