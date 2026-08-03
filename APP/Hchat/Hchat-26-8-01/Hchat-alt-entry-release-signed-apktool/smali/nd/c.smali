.class public final enum Lnd/c;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum g:Lnd/c;

.field public static final enum h:Lnd/c;

.field public static final synthetic i:[Lnd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnd/c;

    .line 2
    .line 3
    const-string v1, "SWITCH"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnd/c;->g:Lnd/c;

    .line 10
    .line 11
    new-instance v1, Lnd/c;

    .line 12
    .line 13
    const-string v2, "NEW_ARRAY"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnd/c;->h:Lnd/c;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lnd/c;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnd/c;->i:[Lnd/c;

    .line 26
    .line 27
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnd/c;
    .locals 1

    .line 1
    const-class v0, Lnd/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnd/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnd/c;
    .locals 1

    .line 1
    sget-object v0, Lnd/c;->i:[Lnd/c;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnd/c;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnd/c;

    .line 8
    .line 9
    return-object v0
.end method
