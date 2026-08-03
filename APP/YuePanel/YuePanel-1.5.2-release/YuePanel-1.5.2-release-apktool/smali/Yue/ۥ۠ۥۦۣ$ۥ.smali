.class public final LYue/ۥ۠ۥۦۣ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۥۦۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۥۦۣ$ۥ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/content/IntentSender;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟:Landroid/content/Intent;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I


# direct methods
.method public constructor <init>(Landroid/app/PendingIntent;)V
    .locals 1
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "pendingIntent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    const-string v0, "pendingIntent.intentSender"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LYue/ۥ۠ۥۦۣ$ۥ;-><init>(Landroid/content/IntentSender;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/IntentSender;)V
    .locals 1
    .param p1    # Landroid/content/IntentSender;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "intentSender"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۥۦۣ$ۥ;->ۥ:Landroid/content/IntentSender;

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥ۠ۥۦۣ;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۦۣ;

    iget-object v1, p0, LYue/ۥ۠ۥۦۣ$ۥ;->ۥ:Landroid/content/IntentSender;

    iget-object v2, p0, LYue/ۥ۠ۥۦۣ$ۥ;->ۥ۟:Landroid/content/Intent;

    iget v3, p0, LYue/ۥ۠ۥۦۣ$ۥ;->ۥ۟۟:I

    iget v4, p0, LYue/ۥ۠ۥۦۣ$ۥ;->ۥ۟۟۟:I

    invoke-direct {v0, v1, v2, v3, v4}, LYue/ۥ۠ۥۦۣ;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0
.end method

.method public final ۥ۟(Landroid/content/Intent;)LYue/ۥ۠ۥۦۣ$ۥ;
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۥۦۣ$ۥ;->ۥ۟:Landroid/content/Intent;

    return-object p0
.end method

.method public final ۥ۟۟(II)LYue/ۥ۠ۥۦۣ$ۥ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iput p1, p0, LYue/ۥ۠ۥۦۣ$ۥ;->ۥ۟۟۟:I

    iput p2, p0, LYue/ۥ۠ۥۦۣ$ۥ;->ۥ۟۟:I

    return-object p0
.end method
