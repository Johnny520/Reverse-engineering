.class public final LYue/ۥ۟ۨۦۥ;
.super LYue/ۥۡۧۤۦ;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟ۡ:LYue/ۥ۟ۨۦۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟ۨۦۥ;

    invoke-direct {v0}, LYue/ۥ۟ۨۦۥ;-><init>()V

    sput-object v0, LYue/ۥ۟ۨۦۥ;->ۥ۟۟ۡ:LYue/ۥ۟ۨۦۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    sget v1, LYue/ۥۢۡ۟ۤ;->ۥ۟۟:I

    sget v2, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟:I

    sget-wide v3, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟۟:J

    const-string v5, "DefaultDispatcher"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥۡۧۤۦ;-><init>(IIJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method

.method public final ۥ۟۟ۧۥ()V
    .locals 0

    invoke-super {p0}, LYue/ۥۡۧۤۦ;->close()V

    return-void
.end method
