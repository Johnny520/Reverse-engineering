.class public final enum Lrb/e;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final enum g:Lrb/e;

.field public static final enum h:Lrb/e;

.field public static final enum i:Lrb/e;

.field public static final synthetic j:[Lrb/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lrb/e;

    .line 2
    .line 3
    const-string v1, "NORMAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lrb/e;->g:Lrb/e;

    .line 10
    .line 11
    new-instance v1, Lrb/e;

    .line 12
    .line 13
    const-string v2, "DEAD"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lrb/e;->h:Lrb/e;

    .line 20
    .line 21
    new-instance v2, Lrb/e;

    .line 22
    .line 23
    const-string v3, "UNKNOWN"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lrb/e;->i:Lrb/e;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lrb/e;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lrb/e;->j:[Lrb/e;

    .line 36
    .line 37
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lrb/e;
    .locals 1

    .line 1
    const-class v0, Lrb/e;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lrb/e;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lrb/e;
    .locals 1

    .line 1
    sget-object v0, Lrb/e;->j:[Lrb/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lrb/e;

    .line 8
    .line 9
    return-object v0
.end method
