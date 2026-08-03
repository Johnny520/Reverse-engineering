.class public final LYue/ۥۣ۟ۧۡ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1f
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/ContentInfo$Builder;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۧۡ;)V
    .locals 0
    .param p1    # LYue/ۥۣ۟ۧۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {}, LYue/ۥ۟ۧۢۡ;->ۥ()V

    invoke-virtual {p1}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟ۦ()Landroid/view/ContentInfo;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۧۢ۠;->ۥ(Landroid/view/ContentInfo;)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;->ۥ:Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 0
    .param p1    # Landroid/content/ClipData;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1, p2}, LYue/ۥ۟ۧۢ۟;->ۥ(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;->ۥ:Landroid/view/ContentInfo$Builder;

    return-void
.end method


# virtual methods
.method public build()LYue/ۥۣ۟ۧۡ;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۧۡ;

    new-instance v1, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;

    iget-object v2, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;->ۥ:Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, LYue/ۥ۟ۧۡۥ;->ۥ(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, LYue/ۥۣ۟ۧۡ;-><init>(LYue/ۥۣ۟ۧۡ$ۥ۟۟۟ۡ;)V

    return-object v0
.end method

.method public ۥ(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;->ۥ:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LYue/ۥ۟ۧۡۤ;->ۥ(Landroid/view/ContentInfo$Builder;I)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public ۥ۟(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;->ۥ:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LYue/ۥ۟ۧۢ;->ۥ(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public ۥ۟۟(Landroid/net/Uri;)V
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;->ۥ:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LYue/ۥ۟ۧۡۨ;->ۥ(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public ۥ۟۟۟(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;->ۥ:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LYue/ۥ۟ۧۡۦ;->ۥ(Landroid/view/ContentInfo$Builder;I)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public ۥ۟۟۟۟(Landroid/content/ClipData;)V
    .locals 1
    .param p1    # Landroid/content/ClipData;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟;->ۥ:Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, LYue/ۥ۟ۧۡۧ;->ۥ(Landroid/view/ContentInfo$Builder;Landroid/content/ClipData;)Landroid/view/ContentInfo$Builder;

    return-void
.end method
