.class public final LYue/ۥۣ۠۟ۢ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠۟ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/Class;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:Landroid/os/Bundle;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public ۥ۟۟۟:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۟ۢ$ۥ۟۟;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥۣ۠۟ۢ$ۥ۟۟;->ۥ۟:Ljava/lang/Class;

    iput-object p3, p0, LYue/ۥۣ۠۟ۢ$ۥ۟۟;->ۥ۟۟:Landroid/os/Bundle;

    return-void
.end method
