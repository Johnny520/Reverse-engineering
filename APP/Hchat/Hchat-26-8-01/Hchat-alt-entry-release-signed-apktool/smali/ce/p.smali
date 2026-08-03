.class public final enum Lce/p;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum g:Lce/p;

.field public static final enum h:Lce/p;

.field public static final enum i:Lce/p;

.field public static final synthetic j:[Lce/p;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lce/p;

    .line 2
    .line 3
    const-string v1, "WHITE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lce/p;->g:Lce/p;

    .line 10
    .line 11
    new-instance v1, Lce/p;

    .line 12
    .line 13
    const-string v2, "GRAY"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lce/p;->h:Lce/p;

    .line 20
    .line 21
    new-instance v2, Lce/p;

    .line 22
    .line 23
    const-string v3, "BLACK"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lce/p;->i:Lce/p;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lce/p;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lce/p;->j:[Lce/p;

    .line 36
    .line 37
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lce/p;
    .locals 1

    .line 1
    const-class v0, Lce/p;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lce/p;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lce/p;
    .locals 1

    .line 1
    sget-object v0, Lce/p;->j:[Lce/p;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lce/p;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lce/p;

    .line 8
    .line 9
    return-object v0
.end method
