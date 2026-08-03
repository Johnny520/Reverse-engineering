.class public final LYue/ۥۡۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:Z

.field public ۥ۟:Landroid/content/res/Configuration;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, LYue/ۥۡۤۡ;->ۥ:Z

    return-void
.end method

.method public constructor <init>(ZLandroid/content/res/Configuration;)V
    .locals 1
    .param p2    # Landroid/content/res/Configuration;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    const-string v0, "newConfig"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1}, LYue/ۥۡۤۡ;-><init>(Z)V

    .line 4
    iput-object p2, p0, LYue/ۥۡۤۡ;->ۥ۟:Landroid/content/res/Configuration;

    return-void
.end method


# virtual methods
.method public final ۥ()Landroid/content/res/Configuration;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤۡ;->ۥ۟:Landroid/content/res/Configuration;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۤۡ;->ۥ:Z

    return v0
.end method
