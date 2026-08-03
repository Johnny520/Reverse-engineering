.class public abstract LYue/ۥۢۥ۟ۡ;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final ۥۣ۟۟۠:Landroidx/fragment/app/Fragment;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroidx/fragment/app/Fragment;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "fragment"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, LYue/ۥۢۥ۟ۡ;->ۥۣ۟۟۠:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, LYue/ۥۢۥ۟ۡ;-><init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final ۥ()Landroidx/fragment/app/Fragment;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥ۟ۡ;->ۥۣ۟۟۠:Landroidx/fragment/app/Fragment;

    return-object v0
.end method
