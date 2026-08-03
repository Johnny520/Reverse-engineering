.class public LYue/ۥۡۢۥۦ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡۢۥۦ;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۡۢۥۦ;

    invoke-direct {v0, p1, p2}, LYue/ۥۡۢۥۦ;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥۡۢۥۦ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    return-object v0
.end method

.method public ۥ۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput-object p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۧ:Ljava/lang/String;

    iput-object p2, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۨ:Ljava/lang/String;

    :cond_0
    return-object p0
.end method

.method public ۥ۟۟(Ljava/lang/String;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput-object p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput-object p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۟:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟۟۟(I)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟۠(I)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۤ:I

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(Z)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput-boolean p1, v0, LYue/ۥۡۢۥۦ;->ۥۣ۟۟۟:Z

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/CharSequence;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput-object p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public ۥۣ۟۟۟(Z)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput-boolean p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟۠:Z

    return-object p0
.end method

.method public ۥ۟۟۟ۤ(Landroid/net/Uri;Landroid/media/AudioAttributes;)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/media/AudioAttributes;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput-object p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۡ:Landroid/net/Uri;

    iput-object p2, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۢ:Landroid/media/AudioAttributes;

    return-object p0
.end method

.method public ۥ۟۟۟ۥ(Z)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    iput-boolean p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۥ:Z

    return-object p0
.end method

.method public ۥ۟۟۟ۦ([J)LYue/ۥۡۢۥۦ$ۥ۟۟۟;
    .locals 2
    .param p1    # [J
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۥۦ$ۥ۟۟۟;->ۥ:LYue/ۥۡۢۥۦ;

    if-eqz p1, :cond_0

    array-length v1, p1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۥ:Z

    iput-object p1, v0, LYue/ۥۡۢۥۦ;->ۥ۟۟۟ۦ:[J

    return-object p0
.end method
