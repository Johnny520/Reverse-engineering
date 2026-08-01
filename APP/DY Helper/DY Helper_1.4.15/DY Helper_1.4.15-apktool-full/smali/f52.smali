.class public final enum Lf52;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum ε:Lf52;

.field public static final enum ζ:Lf52;

.field public static final enum η:Lf52;

.field public static final synthetic θ:[Lf52;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lf52;

    .line 2
    .line 3
    const-string v1, "RUNNING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lf52;->ε:Lf52;

    .line 10
    .line 11
    new-instance v1, Lf52;

    .line 12
    .line 13
    const-string v2, "SUCCESS"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lf52;->ζ:Lf52;

    .line 20
    .line 21
    new-instance v2, Lf52;

    .line 22
    .line 23
    const-string v3, "ERROR"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lf52;->η:Lf52;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lf52;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lf52;->θ:[Lf52;

    .line 36
    .line 37
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lf52;
    .locals 1

    .line 1
    const-class v0, Lf52;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lf52;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lf52;
    .locals 1

    .line 1
    sget-object v0, Lf52;->θ:[Lf52;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lf52;

    .line 8
    .line 9
    return-object v0
.end method
