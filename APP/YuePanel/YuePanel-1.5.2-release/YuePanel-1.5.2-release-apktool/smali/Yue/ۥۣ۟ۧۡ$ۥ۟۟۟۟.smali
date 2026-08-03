.class public final LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۟ۧۡ$ۥ۟۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Landroid/content/ClipData;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:Landroid/net/Uri;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟۟:Landroid/os/Bundle;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۧۡ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۧۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-virtual {p1}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟()Landroid/content/ClipData;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ:Landroid/content/ClipData;

    .line 6
    invoke-virtual {p1}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟ۡ()I

    move-result v0

    iput v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟:I

    .line 7
    invoke-virtual {p1}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟۟()I

    move-result v0

    iput v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟۟:I

    .line 8
    invoke-virtual {p1}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟۠()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟۟۟:Landroid/net/Uri;

    .line 9
    invoke-virtual {p1}, LYue/ۥۣ۟ۧۡ;->ۥ۟۟۟()Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟۟۟۟:Landroid/os/Bundle;

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
    iput-object p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ:Landroid/content/ClipData;

    .line 3
    iput p2, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟:I

    return-void
.end method


# virtual methods
.method public build()LYue/ۥۣ۟ۧۡ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۣ۟ۧۡ;

    new-instance v1, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟ۢ;

    invoke-direct {v1, p0}, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;)V

    invoke-direct {v0, v1}, LYue/ۥۣ۟ۧۡ;-><init>(LYue/ۥۣ۟ۧۡ$ۥ۟۟۟ۡ;)V

    return-object v0
.end method

.method public ۥ(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟:I

    return-void
.end method

.method public ۥ۟(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟۟۟۟:Landroid/os/Bundle;

    return-void
.end method

.method public ۥ۟۟(Landroid/net/Uri;)V
    .locals 0
    .param p1    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟۟۟:Landroid/net/Uri;

    return-void
.end method

.method public ۥ۟۟۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ۟۟:I

    return-void
.end method

.method public ۥ۟۟۟۟(Landroid/content/ClipData;)V
    .locals 0
    .param p1    # Landroid/content/ClipData;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۣ۟ۧۡ$ۥ۟۟۟۟;->ۥ:Landroid/content/ClipData;

    return-void
.end method
