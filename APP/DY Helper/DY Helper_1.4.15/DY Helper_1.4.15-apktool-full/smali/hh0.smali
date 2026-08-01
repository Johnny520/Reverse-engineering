.class public final enum Lhh0;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum θ:Lhh0;

.field public static final enum ι:Lhh0;

.field public static final synthetic κ:[Lhh0;


# instance fields
.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lhh0;

    .line 2
    .line 3
    const-string v4, "json"

    .line 4
    .line 5
    const-string v5, "application/json"

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "JSON"

    .line 9
    .line 10
    const-string v3, "JSON"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lhh0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lhh0;->θ:Lhh0;

    .line 16
    .line 17
    new-instance v1, Lhh0;

    .line 18
    .line 19
    const-string v5, "txt"

    .line 20
    .line 21
    const-string v6, "text/plain"

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const-string v3, "TXT"

    .line 25
    .line 26
    const-string v4, "TXT"

    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Lhh0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lhh0;->ι:Lhh0;

    .line 32
    .line 33
    filled-new-array {v0, v1}, [Lhh0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lhh0;->κ:[Lhh0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lhh0;->ε:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lhh0;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p5, p0, Lhh0;->η:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhh0;
    .locals 1

    .line 1
    const-class v0, Lhh0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lhh0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lhh0;
    .locals 1

    .line 1
    sget-object v0, Lhh0;->κ:[Lhh0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lhh0;

    .line 8
    .line 9
    return-object v0
.end method
