.class public final LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:Ljava/lang/String;

.field public ۥ۟۟۟ۢ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;
    .locals 10
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-boolean v2, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ:Z

    iget v3, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟:I

    iget v4, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟:I

    iget v5, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟:I

    iget v6, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟۟:I

    iget-boolean v7, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟۠:Z

    iget-object v8, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    iget-object v9, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟ۢ:Ljava/lang/String;

    invoke-static/range {v2 .. v9}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟;->ۥ(ZIIIIZLjava/lang/String;Ljava/lang/String;)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;

    move-result-object v0

    return-object v0

    :cond_0
    iget v1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟:I

    iget v2, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟۟:I

    iget v3, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟:I

    iget v4, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟:I

    iget-boolean v5, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ:Z

    iget-boolean v6, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟۠:Z

    invoke-static/range {v1 .. v6}, LYue/ۥ۟۟ۥۧ$ۥ۟;->ۥ(IIIIZZ)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟(I)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟:I

    return-object p0
.end method

.method public ۥ۟۟(I)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟(Ljava/lang/String;)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟ۢ:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟۟۟(Z)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ:Z

    return-object p0
.end method

.method public ۥ۟۟۟۠(I)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟ۡ(I)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟۟:I

    return-object p0
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/String;)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    return-object p0
.end method

.method public ۥۣ۟۟۟(Z)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput-boolean p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;->ۥ۟۟۟۠:Z

    return-object p0
.end method
