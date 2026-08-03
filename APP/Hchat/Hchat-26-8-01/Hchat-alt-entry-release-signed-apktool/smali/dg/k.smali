.class public final enum Ldg/k;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum g:Ldg/k;

.field public static final enum h:Ldg/k;

.field public static final synthetic i:[Ldg/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldg/k;

    .line 2
    .line 3
    const-string v1, "TOP_DOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldg/k;->g:Ldg/k;

    .line 10
    .line 11
    new-instance v1, Ldg/k;

    .line 12
    .line 13
    const-string v2, "BOTTOM_UP"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ldg/k;->h:Ldg/k;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ldg/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ldg/k;->i:[Ldg/k;

    .line 26
    .line 27
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldg/k;
    .locals 1

    .line 1
    const-class v0, Ldg/k;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldg/k;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldg/k;
    .locals 1

    .line 1
    sget-object v0, Ldg/k;->i:[Ldg/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldg/k;

    .line 8
    .line 9
    return-object v0
.end method
