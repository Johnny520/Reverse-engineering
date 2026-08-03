.class public LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;
.super LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;


# instance fields
.field public final ۥ۟۟۟۠:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;

    invoke-static {}, LYue/ۥ۠ۢۢ۠;->ۥ()LYue/ۥۡۦ۟ۢ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2, v2}, LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;-><init>(LYue/ۥۡۦ۟ۢ;III)V

    sput-object v0, LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦ۟ۢ;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;-><init>(LYue/ۥۡۦ۟ۢ;II)V

    iput p4, p0, LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    return-void
.end method

.method public static ۥ۟۟۟۠()LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;
    .locals 1

    sget-object v0, LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;

    return-object v0
.end method


# virtual methods
.method public ۥ۟۟۟(I)LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;
    .locals 7

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;->ۥ۟()I

    move-result v0

    if-lt p1, v0, :cond_0

    invoke-static {}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;->ۥ()LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    iget v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    mul-int/2addr p1, v1

    add-int v3, v0, p1

    new-instance p1, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;

    iget-object v2, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    iget v4, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    const/4 v5, 0x1

    iget v6, p0, LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;-><init>(LYue/ۥۡۦ۟ۢ;IIII)V

    return-object p1
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;->ۥ۟۟۟۠:I

    return v0
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    sget-object v0, LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;->ۥ۟۟۟ۡ:LYue/ۥ۠ۢۢ۠$ۥۣ۟۟۟;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
