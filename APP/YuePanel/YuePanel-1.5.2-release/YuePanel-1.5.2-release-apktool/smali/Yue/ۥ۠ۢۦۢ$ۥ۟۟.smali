.class public LYue/ۥ۠ۢۦۢ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/net/Uri;

.field public final ۥ۟:I

.field public final ۥ۟۟:I

.field public final ۥ۟۟۟:Z

.field public final ۥ۟۟۟۟:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;IIZI)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x1L
            to = 0x3e8L
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ:Landroid/net/Uri;

    iput p2, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟:I

    iput p3, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟:I

    iput-boolean p4, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟۟:Z

    iput p5, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟۟۟:I

    return-void
.end method

.method public static ۥ(Landroid/net/Uri;IIZI)LYue/ۥ۠ۢۦۢ$ۥ۟۟;
    .locals 7
    .param p0    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x1L
            to = 0x3e8L
        .end annotation
    .end param

    new-instance v6, LYue/ۥ۠ۢۦۢ$ۥ۟۟;

    move-object v0, v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۦۢ$ۥ۟۟;-><init>(Landroid/net/Uri;IIZI)V

    return-object v6
.end method


# virtual methods
.method public ۥ۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟۟۟:I

    return v0
.end method

.method public ۥ۟۟()I
    .locals 1
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x0L
    .end annotation

    iget v0, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۟()Landroid/net/Uri;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ:Landroid/net/Uri;

    return-object v0
.end method

.method public ۥ۟۟۟۟()I
    .locals 1
    .annotation build LYue/ۥ۠ۥۤ;
        from = 0x1L
        to = 0x3e8L
    .end annotation

    iget v0, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠ۢۦۢ$ۥ۟۟;->ۥ۟۟۟:Z

    return v0
.end method
