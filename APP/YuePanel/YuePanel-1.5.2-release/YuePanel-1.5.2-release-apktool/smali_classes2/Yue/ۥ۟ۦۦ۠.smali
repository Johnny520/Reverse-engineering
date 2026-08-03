.class public final LYue/ۥ۟ۦۦ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:I = -0x61c88647

.field public static final ۥ۟:I = 0x10

.field public static final ۥ۟۟:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:LYue/ۥ۠ۨۨۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:LYue/ۥ۠ۨۨۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "REHASH"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۦۦ۠;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    new-instance v0, LYue/ۥ۠ۨۨۡ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۠ۨۨۡ;-><init>(Ljava/lang/Object;)V

    sput-object v0, LYue/ۥ۟ۦۦ۠;->ۥ۟۟۟:LYue/ۥ۠ۨۨۡ;

    new-instance v0, LYue/ۥ۠ۨۨۡ;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1}, LYue/ۥ۠ۨۨۡ;-><init>(Ljava/lang/Object;)V

    sput-object v0, LYue/ۥ۟ۦۦ۠;->ۥ۟۟۟۟:LYue/ۥ۠ۨۨۡ;

    return-void
.end method

.method public static final synthetic ۥ()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥ۟ۦۦ۠;->ۥ۟۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟(Ljava/lang/Object;)LYue/ۥ۠ۨۨۡ;
    .locals 0

    invoke-static {p0}, LYue/ۥ۟ۦۦ۠;->ۥ۟۟۟(Ljava/lang/Object;)LYue/ۥ۠ۨۨۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟()Ljava/lang/Void;
    .locals 1

    invoke-static {}, LYue/ۥ۟ۦۦ۠;->ۥ۟۟۟۟()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public static final ۥ۟۟۟(Ljava/lang/Object;)LYue/ۥ۠ۨۨۡ;
    .locals 1

    if-nez p0, :cond_0

    sget-object p0, LYue/ۥ۟ۦۦ۠;->ۥ۟۟۟:LYue/ۥ۠ۨۨۡ;

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, LYue/ۥ۟ۦۦ۠;->ۥ۟۟۟۟:LYue/ۥ۠ۨۨۡ;

    goto :goto_0

    :cond_1
    new-instance v0, LYue/ۥ۠ۨۨۡ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۨۨۡ;-><init>(Ljava/lang/Object;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟۟۟()Ljava/lang/Void;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not implemented"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
