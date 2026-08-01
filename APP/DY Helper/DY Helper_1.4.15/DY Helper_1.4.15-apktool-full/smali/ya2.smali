.class public final enum Lya2;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final enum ζ:Lya2;

.field public static final enum η:Lya2;

.field public static final synthetic θ:[Lya2;


# instance fields
.field public final ε:Lkf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lya2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lkf0;->ζ:Lkf0;

    .line 5
    .line 6
    const-string v3, "COMMENT"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lya2;-><init>(Ljava/lang/String;ILkf0;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lya2;->ζ:Lya2;

    .line 12
    .line 13
    new-instance v1, Lya2;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, Lkf0;->ε:Lkf0;

    .line 17
    .line 18
    const-string v4, "IM"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lya2;-><init>(Ljava/lang/String;ILkf0;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lya2;->η:Lya2;

    .line 24
    .line 25
    filled-new-array {v0, v1}, [Lya2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lya2;->θ:[Lya2;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILkf0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lya2;->ε:Lkf0;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lya2;
    .locals 1

    .line 1
    const-class v0, Lya2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lya2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lya2;
    .locals 1

    .line 1
    sget-object v0, Lya2;->θ:[Lya2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lya2;

    .line 8
    .line 9
    return-object v0
.end method
