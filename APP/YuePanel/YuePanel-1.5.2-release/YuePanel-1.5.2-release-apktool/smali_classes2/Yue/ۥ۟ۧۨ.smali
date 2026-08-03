.class public final enum LYue/ۥ۟ۧۨ;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۧۨ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "LYue/\u06e5\u06df\u06e7\u06e8;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ۥۣ۟۟۠:LYue/ۥ۟ۧۨ;

.field public static final enum ۥ۟۟۠ۤ:LYue/ۥ۟ۧۨ;

.field public static final enum ۥ۟۟۠ۥ:LYue/ۥ۟ۧۨ;
    .annotation build LYue/ۥ۠ۡۤۢ;
    .end annotation
.end field

.field public static final enum ۥ۟۟۠ۦ:LYue/ۥ۟ۧۨ;

.field public static final synthetic ۥ۟۟۠ۧ:[LYue/ۥ۟ۧۨ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۟ۧۨ;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۧۨ;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYue/ۥ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۨ;

    new-instance v0, LYue/ۥ۟ۧۨ;

    const-string v1, "LAZY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۧۨ;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۨ;

    new-instance v0, LYue/ۥ۟ۧۨ;

    const-string v1, "ATOMIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۧۨ;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۨ;

    new-instance v0, LYue/ۥ۟ۧۨ;

    const-string v1, "UNDISPATCHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۧۨ;-><init>(Ljava/lang/String;I)V

    sput-object v0, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۨ;

    invoke-static {}, LYue/ۥ۟ۧۨ;->ۥ()[LYue/ۥ۟ۧۨ;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۧ:[LYue/ۥ۟ۧۨ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LYue/ۥ۟ۧۨ;
    .locals 1

    const-class v0, LYue/ۥ۟ۧۨ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LYue/ۥ۟ۧۨ;

    return-object p0
.end method

.method public static values()[LYue/ۥ۟ۧۨ;
    .locals 1

    sget-object v0, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۧ:[LYue/ۥ۟ۧۨ;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LYue/ۥ۟ۧۨ;

    return-object v0
.end method

.method public static final synthetic ۥ()[LYue/ۥ۟ۧۨ;
    .locals 4

    sget-object v0, LYue/ۥ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۨ;

    sget-object v1, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۨ;

    sget-object v2, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۨ;

    sget-object v3, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۨ;

    filled-new-array {v0, v1, v2, v3}, [LYue/ۥ۟ۧۨ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ۥ۟۟۟ۡ()V
    .locals 0
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)V
    .locals 2
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۧۨ$ۥ;->ۥ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥۣۣۡۢ;

    invoke-direct {p1}, LYue/ۥۣۣۡۢ;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2}, LYue/ۥۣۢ۠۠;->ۥ(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)V

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, LYue/ۥ۟ۧۤۦ;->ۥ۟۟۟ۢ(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)V

    goto :goto_0

    :cond_3
    invoke-static {p1, p2}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V
    .locals 6
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TR;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۧۨ$ۥ;->ۥ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, LYue/ۥۣۣۡۢ;

    invoke-direct {p1}, LYue/ۥۣۣۡۢ;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2, p3}, LYue/ۥۣۢ۠۠;->ۥ۟(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    goto :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, LYue/ۥ۟ۧۤۦ;->ۥۣ۟۟۟(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    goto :goto_0

    :cond_3
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    invoke-static/range {v0 .. v5}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟۟۠(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟۟۠()Z
    .locals 1

    sget-object v0, LYue/ۥ۟ۧۨ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۨ;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
