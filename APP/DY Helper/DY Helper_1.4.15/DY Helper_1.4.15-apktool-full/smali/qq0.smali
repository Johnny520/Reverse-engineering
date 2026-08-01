.class public final enum Lqq0;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum ε:Lqq0;

.field public static final enum ζ:Lqq0;

.field public static final synthetic η:[Lqq0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lqq0;

    .line 2
    .line 3
    const-string v1, "SYNCHRONIZED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lqq0;->ε:Lqq0;

    .line 10
    .line 11
    new-instance v1, Lqq0;

    .line 12
    .line 13
    const-string v2, "PUBLICATION"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lqq0;

    .line 20
    .line 21
    const-string v3, "NONE"

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v2, Lqq0;->ζ:Lqq0;

    .line 28
    .line 29
    filled-new-array {v0, v1, v2}, [Lqq0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lqq0;->η:[Lqq0;

    .line 34
    .line 35
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqq0;
    .locals 1

    .line 1
    const-class v0, Lqq0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqq0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lqq0;
    .locals 1

    .line 1
    sget-object v0, Lqq0;->η:[Lqq0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lqq0;

    .line 8
    .line 9
    return-object v0
.end method
