.class public final enum Lgb/p;
.super Ljava/lang/Enum;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:La2/a;

.field public static final enum h:Lgb/p;

.field public static final enum i:Lgb/p;

.field public static final synthetic j:[Lgb/p;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lgb/p;

    .line 2
    .line 3
    const-string v1, "PENDING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lgb/p;->h:Lgb/p;

    .line 10
    .line 11
    new-instance v1, Lgb/p;

    .line 12
    .line 13
    const-string v2, "APPROVED"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lgb/p;->i:Lgb/p;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lgb/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lgb/p;->j:[Lgb/p;

    .line 26
    .line 27
    new-instance v0, La2/a;

    .line 28
    .line 29
    const/16 v1, 0x10

    .line 30
    .line 31
    invoke-direct {v0, v1}, La2/a;-><init>(I)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lgb/p;->g:La2/a;

    .line 35
    .line 36
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgb/p;
    .locals 1

    .line 1
    const-class v0, Lgb/p;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lj8/b;->g(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgb/p;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lgb/p;
    .locals 1

    .line 1
    sget-object v0, Lgb/p;->j:[Lgb/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lgb/p;

    .line 8
    .line 9
    return-object v0
.end method
