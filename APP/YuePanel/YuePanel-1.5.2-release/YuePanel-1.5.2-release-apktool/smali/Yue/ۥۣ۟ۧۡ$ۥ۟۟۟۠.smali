.class public final LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۧۡ$ۥ۟۟۟ۡ;


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1f
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# instance fields
.field public final ۥ:Landroid/view/ContentInfo;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 0
    .param p1    # Landroid/view/ContentInfo;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۟ۧۡۡ;->ۥ(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;->ۥ:Landroid/view/ContentInfo;

    return-void
.end method


# virtual methods
.method public getSource()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;->ۥ:Landroid/view/ContentInfo;

    invoke-static {v0}, LYue/ۥ۟ۧۢۦ;->ۥ(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentInfoCompat{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;->ۥ:Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()Landroid/net/Uri;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;->ۥ:Landroid/view/ContentInfo;

    invoke-static {v0}, LYue/ۥ۟ۧۢۤ;->ۥ(Landroid/view/ContentInfo;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()Landroid/content/ClipData;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;->ۥ:Landroid/view/ContentInfo;

    invoke-static {v0}, LYue/ۥ۟ۧۢۢ;->ۥ(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;->ۥ:Landroid/view/ContentInfo;

    invoke-static {v0}, LYue/ۥۣ۟ۧۢ;->ۥ(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()Landroid/view/ContentInfo;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;->ۥ:Landroid/view/ContentInfo;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Landroid/os/Bundle;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۠;->ۥ:Landroid/view/ContentInfo;

    invoke-static {v0}, LYue/ۥ۟ۧۢۥ;->ۥ(Landroid/view/ContentInfo;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
