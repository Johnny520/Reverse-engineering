.class public final LYue/ۥ۠ۥۢۦ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۥۢۦ$ۥ۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۥۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/net/Uri;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:Landroid/content/ClipDescription;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟:Landroid/net/Uri;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/ClipDescription;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۥۢۦ$ۥ۟;->ۥ:Landroid/net/Uri;

    iput-object p2, p0, LYue/ۥ۠ۥۢۦ$ۥ۟;->ۥ۟:Landroid/content/ClipDescription;

    iput-object p3, p0, LYue/ۥ۠ۥۢۦ$ۥ۟;->ۥ۟۟:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/net/Uri;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ$ۥ۟;->ۥ۟۟:Landroid/net/Uri;

    return-object v0
.end method

.method public ۥ۟()Landroid/net/Uri;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ$ۥ۟;->ۥ:Landroid/net/Uri;

    return-object v0
.end method

.method public ۥ۟۟()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟۟()Landroid/content/ClipDescription;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۥۢۦ$ۥ۟;->ۥ۟:Landroid/content/ClipDescription;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۟۠()V
    .locals 0

    return-void
.end method
