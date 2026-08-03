.class public LYue/ۥۡۥۣ۟;
.super LYue/ۥۡۥۣ;
.source "SourceFile"


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦۢۦ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v1, LYue/ۥۣ۟ۦۦ;->NO_RECEIVER:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LYue/ۥ۟ۤۧ۟;

    .line 2
    invoke-interface {v0}, LYue/ۥ۟ۤۧ۟;->ۥ۟۟۠()Ljava/lang/Class;

    move-result-object v2

    instance-of p1, p1, LYue/ۥ۠ۦۢۢ;

    xor-int/lit8 v5, p1, 0x1

    move-object v0, p0

    move-object v3, p2

    move-object v4, p3

    .line 3
    invoke-direct/range {v0 .. v5}, LYue/ۥۡۥۣ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .line 4
    sget-object v1, LYue/ۥۣ۟ۦۦ;->NO_RECEIVER:Ljava/lang/Object;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LYue/ۥۡۥۣ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .line 5
    invoke-direct/range {p0 .. p5}, LYue/ۥۡۥۣ;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, LYue/ۥۡۥۣ;->ۥ()LYue/ۥ۠ۦۤ۠$ۥ;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v1}, LYue/ۥ۠ۦۢۡ;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
